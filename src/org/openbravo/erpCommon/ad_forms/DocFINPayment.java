/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2010-2014 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
 */
package org.openbravo.erpCommon.ad_forms;

import java.math.BigDecimal;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Restrictions;
import org.openbravo.advpaymentmngt.utility.FIN_Utility;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.base.session.OBPropertiesProvider;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.service.OBCriteria;
import org.openbravo.dal.service.OBDal;
import org.openbravo.dal.service.OBQuery;
import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.erpCommon.utility.CashVATUtil;
import org.openbravo.erpCommon.utility.FieldProviderFactory;
import org.openbravo.erpCommon.utility.OBDateUtils;
import org.openbravo.erpCommon.utility.SequenceIdData;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.AcctSchemaTableDocType;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.financialmgmt.accounting.FIN_FinancialAccountAccounting;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchemaTable;
import org.openbravo.model.financialmgmt.gl.GLItem;
import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
import org.openbravo.model.financialmgmt.payment.FIN_Payment;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentDetail;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentSchedule;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentScheduleDetail;
import org.openbravo.model.financialmgmt.payment.FIN_Payment_Credit;
import org.openbravo.model.financialmgmt.payment.FinAccPaymentMethod;

import org.openbravo.model.common.invoice.InvoiceLine;
import org.hibernate.criterion.Expression;
import static org.openbravo.erpCommon.ad_forms.AcctServer.TABLEID_Invoice;

public class DocFINPayment extends AcctServer {
  private static final long serialVersionUID = 1L;
  static Logger log4j = Logger.getLogger(DocFINPayment.class);

  String SeqNo = "0";
  String generatedAmount = "";
  String usedAmount = "";

  public DocFINPayment() {
  }

  public DocFINPayment(String AD_Client_ID, String AD_Org_ID, ConnectionProvider connectionProvider) {
    super(AD_Client_ID, AD_Org_ID, connectionProvider);
  }

  @Override
  public boolean loadDocumentDetails(FieldProvider[] data, ConnectionProvider conn) {
    DateDoc = data[0].getField("PaymentDate");
    m_Record_Id2 = data[0].getField("recordId2");
    Amounts[AMTTYPE_Gross] = data[0].getField("Amount");
    generatedAmount = data[0].getField("GeneratedCredit");
    usedAmount = data[0].getField("UsedCredit");
    loadDocumentType();
    p_lines = loadLines();
    return true;
  }

  public FieldProviderFactory[] loadLinesFieldProvider(String Id) {
    FIN_Payment payment = OBDal.getInstance().get(FIN_Payment.class, Id);
    List<FIN_PaymentDetail> paymentDetails = FIN_Utility.getOrderedPaymentDetailList(payment);
    if (paymentDetails == null)
      return null;

    FieldProviderFactory[] data = new FieldProviderFactory[paymentDetails.size()];
    FIN_PaymentSchedule ps = null;
    FIN_PaymentDetail pd = null;
    OBContext.setAdminMode();
    try {
      for (int i = 0; i < data.length; i++) {
        // Details refunded used credit are excluded as the entry will be created using the credit
        // used
        if (paymentDetails.get(i).isRefund() && paymentDetails.get(i).isPrepayment()) {
          continue;
        }

        // If the Payment Detail has already been processed, skip it
        if (paymentDetails.get(i).equals(pd)) {
          continue;
        }
        pd = paymentDetails.get(i);

        data[i] = new FieldProviderFactory(null);
        FIN_PaymentSchedule psi = paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
            .getInvoicePaymentSchedule();
        FIN_PaymentSchedule pso = paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
            .getOrderPaymentSchedule();
        // Related to Issue Issue 19567. Some Payment Detail's amount and writeoff amount are merged
        // into one.
        // https://issues.openbravo.com/view.php?id=19567
        HashMap<String, BigDecimal> amountAndWriteOff = getPaymentDetailWriteOffAndAmount(
            paymentDetails, ps, psi, pso, i);
        BigDecimal amount = amountAndWriteOff.get("amount");
        BigDecimal writeOff = amountAndWriteOff.get("writeoff");
        if (amount == null) {
          data[i] = null;
          ps = psi;
          continue;
        } else {
          FieldProviderFactory.setField(data[i], "Amount", amount.toString());
        }
        ps = psi;

        FieldProviderFactory.setField(data[i], "AD_Client_ID", paymentDetails.get(i).getClient()
            .getId());
        FieldProviderFactory.setField(data[i], "AD_Org_ID", paymentDetails.get(i).getOrganization()
            .getId());
        FieldProviderFactory.setField(data[i], "FIN_Payment_Detail_ID", paymentDetails.get(i)
            .getId());
        // Calculate Business Partner from payment header or from details if header is null or from
        // the PSD in case of GL Item
        BusinessPartner bPartner = payment.getBusinessPartner() != null ? payment
            .getBusinessPartner() : (paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
            .getInvoicePaymentSchedule() != null ? paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule().getInvoice()
            .getBusinessPartner() : (paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
            .getOrderPaymentSchedule() != null ? paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule().getOrder()
            .getBusinessPartner() : (paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
            .getBusinessPartner())));
        FieldProviderFactory.setField(data[i], "cBpartnerId", bPartner != null ? bPartner.getId()
            : "");
        FieldProviderFactory.setField(data[i], "DoubtFulDebtAmount", paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getDoubtfulDebtAmount().toString());
        FieldProviderFactory.setField(data[i], "WriteOffAmt", writeOff.toString());
        FieldProviderFactory.setField(data[i], "C_GLItem_ID",
            paymentDetails.get(i).getGLItem() != null ? paymentDetails.get(i).getGLItem().getId()
                : "");
        FieldProviderFactory.setField(data[i], "Refund", paymentDetails.get(i).isRefund() ? "Y"
            : "N");
        // Check if payment against invoice is in a previous date than invoice accounting date
        boolean isPaymentDatePriorToInvoiceDate = isPaymentDatePriorToInvoiceDate(paymentDetails
            .get(i));
        FieldProviderFactory.setField(data[i], "isprepayment",
            paymentDetails.get(i).isPrepayment() ? "Y" : (isPaymentDatePriorToInvoiceDate ? "Y"
                : "N"));
        FieldProviderFactory.setField(data[i], "isPaymentDatePriorToInvoiceDate",
            isPaymentDatePriorToInvoiceDate && !paymentDetails.get(i).isPrepayment() ? "Y" : "N");
        FieldProviderFactory.setField(data[i], "cProjectId", paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule() != null
            && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                .getInvoicePaymentSchedule().getInvoice().getProject() != null ? paymentDetails
            .get(i).getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule()
            .getInvoice().getProject().getId() : (paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule() != null
            && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                .getOrderPaymentSchedule().getOrder().getProject() != null ? paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule().getOrder()
            .getProject().getId() : (paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
            .getProject() != null ? paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
            .getProject().getId() : "")));
        FieldProviderFactory
            .setField(
                data[i],
                "cCampaignId",
                paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                    .getInvoicePaymentSchedule() != null
                    && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                        .getInvoicePaymentSchedule().getInvoice().getSalesCampaign() != null ? paymentDetails
                    .get(i).getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule()
                    .getInvoice().getSalesCampaign().getId()
                    : (paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                        .getOrderPaymentSchedule() != null
                        && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                            .getOrderPaymentSchedule().getOrder().getSalesCampaign() != null ? paymentDetails
                        .get(i).getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule()
                        .getOrder().getSalesCampaign().getId()
                        : (paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                            .getSalesCampaign() != null ? paymentDetails.get(i)
                            .getFINPaymentScheduleDetailList().get(0).getSalesCampaign().getId()
                            : "")));
        FieldProviderFactory.setField(data[i], "cActivityId", paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule() != null
            && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                .getInvoicePaymentSchedule().getInvoice().getActivity() != null ? paymentDetails
            .get(i).getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule()
            .getInvoice().getActivity().getId() : (paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule() != null
            && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                .getOrderPaymentSchedule().getOrder().getActivity() != null ? paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule().getOrder()
            .getActivity().getId() : (paymentDetails.get(i).getFINPaymentScheduleDetailList()
            .get(0).getActivity() != null ? paymentDetails.get(i).getFINPaymentScheduleDetailList()
            .get(0).getActivity().getId() : "")));
        FieldProviderFactory.setField(data[i], "mProductId", paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getProduct() != null ? paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getProduct().getId() : "");
        FieldProviderFactory.setField(data[i], "cSalesregionId", paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getSalesRegion() != null ? paymentDetails
            .get(i).getFINPaymentScheduleDetailList().get(0).getSalesRegion().getId() : "");
        FieldProviderFactory
            .setField(
                data[i],
                "cCostcenterId",
                paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                    .getInvoicePaymentSchedule() != null
                    && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                        .getInvoicePaymentSchedule().getInvoice().getCostcenter() != null ? paymentDetails
                    .get(i).getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule()
                    .getInvoice().getCostcenter().getId()
                    : (paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                        .getOrderPaymentSchedule() != null
                        && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                            .getOrderPaymentSchedule().getOrder().getCostcenter() != null ? paymentDetails
                        .get(i).getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule()
                        .getOrder().getCostcenter().getId()
                        : (paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                            .getCostCenter() != null ? paymentDetails.get(i)
                            .getFINPaymentScheduleDetailList().get(0).getCostCenter().getId() : "")));

        FieldProviderFactory.setField(data[i], "user1Id", paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule() != null
            && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                .getInvoicePaymentSchedule().getInvoice().getStDimension() != null ? paymentDetails
            .get(i).getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule()
            .getInvoice().getStDimension().getId() : (paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule() != null
            && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                .getOrderPaymentSchedule().getOrder().getStDimension() != null ? paymentDetails
            .get(i).getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule().getOrder()
            .getStDimension().getId() : (paymentDetails.get(i).getFINPaymentScheduleDetailList()
            .get(0).getStDimension() != null ? paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getStDimension().getId() : "")));
        FieldProviderFactory.setField(data[i], "user2Id", paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule() != null
            && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                .getInvoicePaymentSchedule().getInvoice().getNdDimension() != null ? paymentDetails
            .get(i).getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule()
            .getInvoice().getNdDimension().getId() : (paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule() != null
            && paymentDetails.get(i).getFINPaymentScheduleDetailList().get(0)
                .getOrderPaymentSchedule().getOrder().getNdDimension() != null ? paymentDetails
            .get(i).getFINPaymentScheduleDetailList().get(0).getOrderPaymentSchedule().getOrder()
            .getNdDimension().getId() : (paymentDetails.get(i).getFINPaymentScheduleDetailList()
            .get(0).getNdDimension() != null ? paymentDetails.get(i)
            .getFINPaymentScheduleDetailList().get(0).getNdDimension().getId() : "")));
        FieldProviderFactory.setField(data[i], "recordId2",
            paymentDetails.get(i).isPrepayment() ? (pso != null ? pso.getId() : "")
                : (psi != null ? psi.getId() : ""));

      }
    } finally {
      OBContext.restorePreviousMode();
    }
    return data;
  }

  private DocLine[] loadLines() {
    ArrayList<Object> list = new ArrayList<Object>();
    FieldProviderFactory[] data = loadLinesFieldProvider(Record_ID);
    if (data == null || data.length == 0)
      return null;
    for (int i = 0; i < data.length; i++) {
      if (data[i] == null)
        continue;
      String Line_ID = data[i].getField("FIN_Payment_Detail_ID");
      OBContext.setAdminMode();
      try {
        FIN_PaymentDetail detail = OBDal.getInstance().get(FIN_PaymentDetail.class, Line_ID);
        DocLine_FINPayment docLine = new DocLine_FINPayment(DocumentType, Record_ID, Line_ID);
        docLine.loadAttributes(data[i], this);
        docLine.setAmount(data[i].getField("Amount"));
        docLine.setIsPrepayment(data[i].getField("isprepayment"));
        docLine.setWriteOffAmt(data[i].getField("WriteOffAmt"));
        docLine.setDoubtFulDebtAmount(new BigDecimal(data[i].getField("DoubtFulDebtAmount")));
        docLine.setC_GLItem_ID(data[i].getField("C_GLItem_ID"));
        docLine.setPrepaymentAgainstInvoice("Y".equals(data[i]
            .getField("isPaymentDatePriorToInvoiceDate")) ? true : false);
        docLine
            .setInvoice(detail.getFINPaymentScheduleDetailList() != null
                && detail.getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule() != null ? detail
                .getFINPaymentScheduleDetailList().get(0).getInvoicePaymentSchedule().getInvoice()
                : null);
        docLine.m_Record_Id2 = data[i].getField("recordId2");
        docLine.setInvoiceTaxCashVAT_V(Line_ID);
        list.add(docLine);
      } finally {
        OBContext.restorePreviousMode();
      }
    }
    // Return Array
    DocLine_FINPayment[] dl = new DocLine_FINPayment[list.size()];
    list.toArray(dl);
    return dl;
  } // loadLines

  @Override
  public Fact createFact(AcctSchema as, ConnectionProvider conn, Connection con,
      VariablesSecureApp vars) throws ServletException {
    // Select specific definition

    //awal
    String strClassname = "";
    final StringBuilder whereClause = new StringBuilder();
    Fact fact = new Fact(this, as, Fact.POST_Actual);
    String Fact_Acct_Group_ID = SequenceIdData.getUUID();
    String Fact_Acct_Group_ID2 = SequenceIdData.getUUID();
    String Fact_Acct_Group_ID3 = SequenceIdData.getUUID();

    OBContext.setAdminMode();
    try {
      whereClause.append(" as astdt ");
      whereClause.append(" where astdt.acctschemaTable.accountingSchema.id = '"
          + as.m_C_AcctSchema_ID + "'");
      whereClause.append(" and astdt.acctschemaTable.table.id = '" + AD_Table_ID + "'");
      whereClause.append(" and astdt.documentCategory = '" + DocumentType + "'");

      final OBQuery<AcctSchemaTableDocType> obqParameters = OBDal.getInstance().createQuery(
          AcctSchemaTableDocType.class, whereClause.toString());
      final List<AcctSchemaTableDocType> acctSchemaTableDocTypes = obqParameters.list();

      if (acctSchemaTableDocTypes != null && acctSchemaTableDocTypes.size() > 0)
        strClassname = acctSchemaTableDocTypes.get(0).getCreatefactTemplate().getClassname();

      if (strClassname.equals("")) {
        final StringBuilder whereClause2 = new StringBuilder();

        whereClause2.append(" as ast ");
        whereClause2.append(" where ast.accountingSchema.id = '" + as.m_C_AcctSchema_ID + "'");
        whereClause2.append(" and ast.table.id = '" + AD_Table_ID + "'");

        final OBQuery<AcctSchemaTable> obqParameters2 = OBDal.getInstance().createQuery(
            AcctSchemaTable.class, whereClause2.toString());
        final List<AcctSchemaTable> acctSchemaTables = obqParameters2.list();
        if (acctSchemaTables != null && acctSchemaTables.size() > 0
            && acctSchemaTables.get(0).getCreatefactTemplate() != null)
          strClassname = acctSchemaTables.get(0).getCreatefactTemplate().getClassname();
      }
      if (!strClassname.equals("")) {
        try {
          DocFINPaymentTemplate newTemplate = (DocFINPaymentTemplate) Class.forName(strClassname)
              .newInstance();
          return newTemplate.createFact(this, as, conn, con, vars);
        } catch (Exception e) {
          log4j.error("Error while creating new instance for DocFINPaymentTemplate - ", e);
        }
      }

      //awal loop
      String isSales = "N";
      String isPurchase = "N";
      for (int i = 0; p_lines != null && i < p_lines.length; i++) {
        DocLine_FINPayment line = (DocLine_FINPayment) p_lines[i];

        boolean isReceipt = DocumentType.equals("ARR");
        
        //added by GAI Team
        if (isReceipt){
            isSales = DocFINPaymentData.selectIsSales(conn, AD_Client_ID);
        } else {
            isPurchase = DocFINPaymentData.selectIsPurchase(conn, AD_Client_ID);
        }
        //end added by GAI Team
    
        //boolean isPurchase = "Y";
        boolean isPrepayment = line.getIsPrepayment().equals("Y");
        String bpartnerId = (line.m_C_BPartner_ID == null || line.m_C_BPartner_ID.equals("")) ? this.C_BPartner_ID
            : line.m_C_BPartner_ID;

        String bpAmount = line.getAmount();
        //line : Payment Line
        //
        if (line.WriteOffAmt != null && !line.WriteOffAmt.equals("")
            && new BigDecimal(line.WriteOffAmt).compareTo(ZERO) != 0) {
          //ambil account jika Payment In : WriteOff else WriteOff Revenue	
          Account account = isReceipt ? getAccount(AcctServer.ACCTTYPE_WriteOff, as, conn)
              : getAccount(AcctServer.ACCTTYPE_WriteOff_Revenue, as, conn);

          if (account == null) {
            account = isReceipt ? getAccount(AcctServer.ACCTTYPE_WriteOffDefault, as, conn)
                : getAccount(AcctServer.ACCTTYPE_WriteOffDefault_Revenue, as, conn);
          }
          //create Fact_Acct
    		//if (isSales.equals("N")) {
    			fact.createLine(line, account, C_Currency_ID, (isReceipt ? line.WriteOffAmt : ""),
	              (isReceipt ? "" : line.WriteOffAmt), Fact_Acct_Group_ID, nextSeqNo(SeqNo),
	              DocumentType, conn);
    		//} else {
    			//log4j.debug("Masuk isSales Y");
    		//}
        }
        //GL Item
        if ("".equals(line.getC_GLItem_ID())) {
          //Untuk Line Payment yg bukan Invoice
          String docTypeName = "";

          if (isReceipt) {  
            if (isSales.equals("Y")) {
                log4j.debug("Custom Sales");

                Invoice invoice = line.getInvoice();
                String invoiceLineId = null;
                String bpAmountConverted = bpAmount;
                String strcCurrencyId = C_Currency_ID;
                FIN_Payment payment = OBDal.getInstance().get(FIN_Payment.class, Record_ID);
                String bsPartner = payment.getBusinessPartner().getSearchKey();

                log4j.debug("Business Partner : "+bsPartner+" Financial Account : "+payment.getAccount().getId());

                if (!bsPartner.equals("UNCLASSIFIED")) {

                    log4j.debug("Masuk Bukan Unclassified");
                    log4j.debug("Invoice : "+line.getInvoice().getId());
                    
                    bpAmountConverted = convertAmount(new BigDecimal(bpAmount), !isReceipt, DateAcct,
                          TABLEID_Invoice, invoice.getId(), C_Currency_ID, as.m_C_Currency_ID, line, as,
                          fact, Fact_Acct_Group_ID, nextSeqNo(SeqNo), conn).toString();

                    OBCriteria<InvoiceLine> obCriteria = OBDal.getInstance().createCriteria(InvoiceLine.class);
                                            obCriteria.add(Expression.eq(InvoiceLine.PROPERTY_INVOICE, invoice));

                    log4j.debug("Masuk setelah obCriteris");	

                    for (InvoiceLine invLine : obCriteria.list()) {
                          invoiceLineId = invLine.getId();

                          //get Document Type Name
                          docTypeName = DocInvoiceData.selectDocTypeName(conn, invoice.getId());

                          log4j.debug("DEBUG isSales Y : "+invoiceLineId);

                          Account accProduct = getAccountProduct(invLine.getProduct().getId(), as, true, docTypeName, conn);

                          log4j.error("Account Product : "+accProduct);

                          fact.createLine(p_lines[i], accProduct,
                                          strcCurrencyId, (isReceipt ? "" : bpAmountConverted), (isReceipt ? bpAmountConverted
                                          : ""), Fact_Acct_Group_ID, nextSeqNo(SeqNo), DocumentType, conn);
                      }
                  } else {
                      log4j.debug("Masuk Business Partner Unclassified");

                      Account acctUnclassified = getAccountFinAcc(payment.getAccount().getId(), as, true, conn);

                      log4j.debug("Account : "+acctUnclassified.toString());

                      fact.createLine(p_lines[i], acctUnclassified,
                                          strcCurrencyId, (isReceipt ? "" : bpAmountConverted), (isReceipt ? bpAmountConverted : ""), 
                                          Fact_Acct_Group_ID, nextSeqNo(SeqNo), DocumentType, conn);
                  }
            } else {    
                    log4j.debug("Sales Original");
                    String bpAmountConverted = bpAmount;
                    Invoice invoice = line.getInvoice();
                    String strcCurrencyId = C_Currency_ID;
                    //awal order prepayment
                    if (!isOrderPrepayment(line.getLine_ID()) && invoice != null) {
                      // To force opposite posting isReceipt is opposite as well. this is required when
                      // looking backwards
                      bpAmountConverted = convertAmount(new BigDecimal(bpAmount), !isReceipt, DateAcct,
                          TABLEID_Invoice, invoice.getId(), C_Currency_ID, as.m_C_Currency_ID, line, as,
                          fact, Fact_Acct_Group_ID, nextSeqNo(SeqNo), conn).toString();
                      if (!isPrepayment) {
                        //tidak prepayment	
                        if (line.getDoubtFulDebtAmount().signum() != 0) {
                          //DoubtFulDebtAmount
                          BigDecimal doubtFulDebtAmount = convertAmount(line.getDoubtFulDebtAmount(),
                              isReceipt, DateAcct, TABLEID_Invoice, invoice.getId(), C_Currency_ID,
                              as.m_C_Currency_ID, line, as, fact, Fact_Acct_Group_ID, nextSeqNo(SeqNo), conn,
                              false);
                          fact.createLine(line, getAccountBPartner(bpartnerId, as, true, false, true, conn),
                              strcCurrencyId, "", doubtFulDebtAmount.toString(), Fact_Acct_Group_ID,
                              nextSeqNo(SeqNo), DocumentType, conn);
                          bpAmountConverted = new BigDecimal(bpAmountConverted).subtract(doubtFulDebtAmount)
                              .toString();
                          fact.createLine(line,
                              getAccountBPartnerAllowanceForDoubtfulDebt(bpartnerId, as, conn),
                              this.C_Currency_ID, doubtFulDebtAmount.toString(), "", Fact_Acct_Group_ID2,
                              nextSeqNo(SeqNo), DocumentType, conn);
                          // Assign expense to the dimensions of the invoice lines
                          BigDecimal assignedAmount = BigDecimal.ZERO;
                          DocDoubtfulDebtData[] data = DocDoubtfulDebtData.select(conn, invoice.getId());
                          Currency currency = OBDal.getInstance().get(Currency.class, C_Currency_ID);
                          for (int j = 0; j < data.length; j++) {
                            BigDecimal lineAmount = doubtFulDebtAmount.multiply(
                                new BigDecimal(data[j].percentage)).setScale(
                                currency.getStandardPrecision().intValue(), BigDecimal.ROUND_HALF_UP);
                            if (j == data.length - 1) {
                              lineAmount = doubtFulDebtAmount.subtract(assignedAmount);
                            }
                            DocLine lineDD = new DocLine(DocumentType, Record_ID, "");
                            lineDD.m_A_Asset_ID = data[j].aAssetId;
                            lineDD.m_M_Product_ID = data[j].mProductId;
                            lineDD.m_C_Project_ID = data[j].cProjectId;
                            lineDD.m_C_BPartner_ID = data[j].cBpartnerId;
                            lineDD.m_C_Costcenter_ID = data[j].cCostcenterId;
                            lineDD.m_C_Campaign_ID = data[j].cCampaignId;
                            lineDD.m_C_Activity_ID = data[j].cActivityId;
                            lineDD.m_C_Glitem_ID = data[j].mCGlitemId;
                            lineDD.m_User1_ID = data[j].user1id;
                            lineDD.m_User2_ID = data[j].user2id;
                            lineDD.m_AD_Org_ID = data[j].adOrgId;
                            fact.createLine(
                                lineDD,
                                getAccountBPartnerBadDebt(
                                    (lineDD.m_C_BPartner_ID == null || lineDD.m_C_BPartner_ID.equals("")) ? this.C_BPartner_ID
                                        : lineDD.m_C_BPartner_ID, false, as, conn), this.C_Currency_ID, "",
                                lineAmount.toString(), Fact_Acct_Group_ID2, nextSeqNo(SeqNo), DocumentType,
                                conn);
                            assignedAmount = assignedAmount.add(lineAmount);
                          }
                        }

                        // Cash VAT
                        SeqNo = CashVATUtil.createFactCashVAT(as, conn, fact, Fact_Acct_Group_ID, line,
                            invoice, DocumentType, C_Currency_ID, SeqNo);
                      }
                    } //end order prepayment

                    fact.createLine(line, getAccountBPartner(bpartnerId, as, isReceipt, isPrepayment, conn),
                        strcCurrencyId, (isReceipt ? "" : bpAmountConverted), (isReceipt ? bpAmountConverted
                            : ""), Fact_Acct_Group_ID, nextSeqNo(SeqNo), DocumentType, conn);

                    // If payment date is prior to invoice date book invoice as a pre-payment not as a regular
                    // Receivable/Payable

                    if (line.isPrepaymentAgainstInvoice()) {
                          //tandain dulu
                          //Record_ID : ID Payment
                      DocLine line2 = new DocLine(DocumentType, Record_ID, line.m_TrxLine_ID);
                      line2.copyInfo(line);
                      line2.m_DateAcct = OBDateUtils.formatDate(invoice.getAccountingDate());
                      // checking if the prepayment account and ReceivablesNo account in the Business Partner
                      // is the same.In this case we do not need to create more accounting lines
                      if (!getAccountBPartner(bpartnerId, as, isReceipt, true, conn).Account_ID
                          .equals(getAccountBPartner(bpartnerId, as, isReceipt, false, conn).Account_ID)) {
                        fact.createLine(line2, getAccountBPartner(bpartnerId, as, isReceipt, false, conn),
                            strcCurrencyId, (isReceipt ? "" : bpAmountConverted),
                            (isReceipt ? bpAmountConverted : ""), Fact_Acct_Group_ID3, nextSeqNo(SeqNo),
                            DocumentType, conn);
                        fact.createLine(line2, getAccountBPartner(bpartnerId, as, isReceipt, true, conn),
                            strcCurrencyId, (!isReceipt ? "" : bpAmountConverted),
                            (!isReceipt ? bpAmountConverted : ""), Fact_Acct_Group_ID3, nextSeqNo(SeqNo),
                            DocumentType, conn);
                      }
                    }
              } 
          } //end isReceipt Y
          else {
              if (isPurchase.equals("Y")) {
                log4j.debug("Custom Purchase");

                Invoice invoice = line.getInvoice();
                String invoiceLineId = null;
                String bpAmountConverted = bpAmount;
                String strcCurrencyId = C_Currency_ID;
                FIN_Payment payment = OBDal.getInstance().get(FIN_Payment.class, Record_ID);
                String bsPartner = payment.getBusinessPartner().getSearchKey();

                log4j.debug("Business Partner : "+bsPartner+" Financial Account : "+payment.getAccount().getId());

                
                if (!bsPartner.equals("UNCLASSIFIED")) {

                    log4j.debug("Masuk Bukan Unclassified");
                    log4j.debug("Invoice : "+line.getInvoice().getId());

                    bpAmountConverted = convertAmount(new BigDecimal(bpAmount), !isReceipt, DateAcct,
                          TABLEID_Invoice, invoice.getId(), C_Currency_ID, as.m_C_Currency_ID, line, as,
                          fact, Fact_Acct_Group_ID, nextSeqNo(SeqNo), conn).toString();
                    
                    OBCriteria<InvoiceLine> obCriteria = OBDal.getInstance().createCriteria(InvoiceLine.class);
                                            obCriteria.add(Expression.eq(InvoiceLine.PROPERTY_INVOICE, invoice));

                    log4j.debug("Masuk setelah obCriteris");	

                    for (InvoiceLine invLine : obCriteria.list()) {
                          invoiceLineId = invLine.getId();

                          //get Document Type Name
                          docTypeName = DocInvoiceData.selectDocTypeName(conn, invoice.getId());

                          log4j.debug("DEBUG isSales Y : "+invoiceLineId);

                          Account accProduct = getAccountProduct(invLine.getProduct().getId(), as, true, docTypeName, conn);

                          log4j.error("Account Product : "+accProduct);

                          fact.createLine(p_lines[i], accProduct,
                                          strcCurrencyId, (isReceipt ? "" : bpAmountConverted), (isReceipt ? bpAmountConverted
                                          : ""), Fact_Acct_Group_ID, nextSeqNo(SeqNo), DocumentType, conn);
                      }
                  } else {
                      log4j.debug("Masuk Business Partner Unclassified");

                      Account acctUnclassified = getAccountFinAcc(payment.getAccount().getId(), as, true, conn);

                      log4j.debug("Account : "+acctUnclassified.toString());

                      fact.createLine(p_lines[i], acctUnclassified,
                                          strcCurrencyId, (isReceipt ? "" : bpAmountConverted), (isReceipt ? bpAmountConverted : ""), 
                                          Fact_Acct_Group_ID, nextSeqNo(SeqNo), DocumentType, conn);
                  }
            } else {    
                    log4j.debug("Purchase Original");
                    String bpAmountConverted = bpAmount;
                    Invoice invoice = line.getInvoice();
                    String strcCurrencyId = C_Currency_ID;
                    //awal order prepayment
                    if (!isOrderPrepayment(line.getLine_ID()) && invoice != null) {
                      // To force opposite posting isReceipt is opposite as well. this is required when
                      // looking backwards
                      bpAmountConverted = convertAmount(new BigDecimal(bpAmount), !isReceipt, DateAcct,
                          TABLEID_Invoice, invoice.getId(), C_Currency_ID, as.m_C_Currency_ID, line, as,
                          fact, Fact_Acct_Group_ID, nextSeqNo(SeqNo), conn).toString();
                      if (!isPrepayment) {
                        //tidak prepayment	
                        if (line.getDoubtFulDebtAmount().signum() != 0) {
                          //DoubtFulDebtAmount
                          BigDecimal doubtFulDebtAmount = convertAmount(line.getDoubtFulDebtAmount(),
                              isReceipt, DateAcct, TABLEID_Invoice, invoice.getId(), C_Currency_ID,
                              as.m_C_Currency_ID, line, as, fact, Fact_Acct_Group_ID, nextSeqNo(SeqNo), conn,
                              false);
                          fact.createLine(line, getAccountBPartner(bpartnerId, as, true, false, true, conn),
                              strcCurrencyId, "", doubtFulDebtAmount.toString(), Fact_Acct_Group_ID,
                              nextSeqNo(SeqNo), DocumentType, conn);
                          bpAmountConverted = new BigDecimal(bpAmountConverted).subtract(doubtFulDebtAmount)
                              .toString();
                          fact.createLine(line,
                              getAccountBPartnerAllowanceForDoubtfulDebt(bpartnerId, as, conn),
                              this.C_Currency_ID, doubtFulDebtAmount.toString(), "", Fact_Acct_Group_ID2,
                              nextSeqNo(SeqNo), DocumentType, conn);
                          // Assign expense to the dimensions of the invoice lines
                          BigDecimal assignedAmount = BigDecimal.ZERO;
                          DocDoubtfulDebtData[] data = DocDoubtfulDebtData.select(conn, invoice.getId());
                          Currency currency = OBDal.getInstance().get(Currency.class, C_Currency_ID);
                          for (int j = 0; j < data.length; j++) {
                            BigDecimal lineAmount = doubtFulDebtAmount.multiply(
                                new BigDecimal(data[j].percentage)).setScale(
                                currency.getStandardPrecision().intValue(), BigDecimal.ROUND_HALF_UP);
                            if (j == data.length - 1) {
                              lineAmount = doubtFulDebtAmount.subtract(assignedAmount);
                            }
                            DocLine lineDD = new DocLine(DocumentType, Record_ID, "");
                            lineDD.m_A_Asset_ID = data[j].aAssetId;
                            lineDD.m_M_Product_ID = data[j].mProductId;
                            lineDD.m_C_Project_ID = data[j].cProjectId;
                            lineDD.m_C_BPartner_ID = data[j].cBpartnerId;
                            lineDD.m_C_Costcenter_ID = data[j].cCostcenterId;
                            lineDD.m_C_Campaign_ID = data[j].cCampaignId;
                            lineDD.m_C_Activity_ID = data[j].cActivityId;
                            lineDD.m_C_Glitem_ID = data[j].mCGlitemId;
                            lineDD.m_User1_ID = data[j].user1id;
                            lineDD.m_User2_ID = data[j].user2id;
                            lineDD.m_AD_Org_ID = data[j].adOrgId;
                            fact.createLine(
                                lineDD,
                                getAccountBPartnerBadDebt(
                                    (lineDD.m_C_BPartner_ID == null || lineDD.m_C_BPartner_ID.equals("")) ? this.C_BPartner_ID
                                        : lineDD.m_C_BPartner_ID, false, as, conn), this.C_Currency_ID, "",
                                lineAmount.toString(), Fact_Acct_Group_ID2, nextSeqNo(SeqNo), DocumentType,
                                conn);
                            assignedAmount = assignedAmount.add(lineAmount);
                          }
                        }

                        // Cash VAT
                        SeqNo = CashVATUtil.createFactCashVAT(as, conn, fact, Fact_Acct_Group_ID, line,
                            invoice, DocumentType, C_Currency_ID, SeqNo);
                      }
                    } //end order prepayment

                    fact.createLine(line, getAccountBPartner(bpartnerId, as, isReceipt, isPrepayment, conn),
                        strcCurrencyId, (isReceipt ? "" : bpAmountConverted), (isReceipt ? bpAmountConverted
                            : ""), Fact_Acct_Group_ID, nextSeqNo(SeqNo), DocumentType, conn);

                    // If payment date is prior to invoice date book invoice as a pre-payment not as a regular
                    // Receivable/Payable

                    if (line.isPrepaymentAgainstInvoice()) {
                          //tandain dulu
                          //Record_ID : ID Payment
                      DocLine line2 = new DocLine(DocumentType, Record_ID, line.m_TrxLine_ID);
                      line2.copyInfo(line);
                      line2.m_DateAcct = OBDateUtils.formatDate(invoice.getAccountingDate());
                      // checking if the prepayment account and ReceivablesNo account in the Business Partner
                      // is the same.In this case we do not need to create more accounting lines
                      if (!getAccountBPartner(bpartnerId, as, isReceipt, true, conn).Account_ID
                          .equals(getAccountBPartner(bpartnerId, as, isReceipt, false, conn).Account_ID)) {
                        fact.createLine(line2, getAccountBPartner(bpartnerId, as, isReceipt, false, conn),
                            strcCurrencyId, (isReceipt ? "" : bpAmountConverted),
                            (isReceipt ? bpAmountConverted : ""), Fact_Acct_Group_ID3, nextSeqNo(SeqNo),
                            DocumentType, conn);
                        fact.createLine(line2, getAccountBPartner(bpartnerId, as, isReceipt, true, conn),
                            strcCurrencyId, (!isReceipt ? "" : bpAmountConverted),
                            (!isReceipt ? bpAmountConverted : ""), Fact_Acct_Group_ID3, nextSeqNo(SeqNo),
                            DocumentType, conn);
                      }
                    }
              } 
          } //end else [isReceipt N]
        //else GL Item  
        } else {
          //ini GL Item	
          log4j.error("Masuk jika GL Item kosong");
          fact.createLine(
              line,
              getAccountGLItem(OBDal.getInstance().get(GLItem.class, line.getC_GLItem_ID()), as,
                  isReceipt, conn), C_Currency_ID, (isReceipt ? "" : bpAmount),
              (isReceipt ? bpAmount : ""), Fact_Acct_Group_ID, nextSeqNo(SeqNo), DocumentType, conn);
        }
      }
      //end looping

      FIN_Payment payment = OBDal.getInstance().get(FIN_Payment.class, Record_ID);
      if (BigDecimal.ZERO.compareTo(new BigDecimal(Amounts[AMTTYPE_Gross])) != 0) {
        fact.createLine(
            null,
            getAccount(conn, payment.getPaymentMethod(), payment.getAccount(), as,
                payment.isReceipt()), C_Currency_ID, (payment.isReceipt() ? Amounts[AMTTYPE_Gross]
                : ""), (payment.isReceipt() ? "" : Amounts[AMTTYPE_Gross]), Fact_Acct_Group_ID,
            "999999", DocumentType, conn);
      }
      // Pre-payment is consumed when Used Credit Amount not equals Zero. When consuming Credit no
      // credit is generated
      if (new BigDecimal(usedAmount).compareTo(ZERO) != 0
          && new BigDecimal(generatedAmount).compareTo(ZERO) == 0) {
        List<FIN_Payment_Credit> creditPayments = payment.getFINPaymentCreditList();
        BigDecimal amtDiff = BigDecimal.ZERO;
        for (FIN_Payment_Credit creditPayment : creditPayments) {
          String creditAmountConverted = convertAmount(creditPayment.getAmount(),
              creditPayment.getCreditPaymentUsed().isReceipt(), DateAcct, TABLEID_Payment,
              creditPayment.getCreditPaymentUsed().getId(),
              creditPayment.getCreditPaymentUsed().getCurrency().getId(), as.m_C_Currency_ID, null,
              as, fact, Fact_Acct_Group_ID, nextSeqNo(SeqNo), conn, false).toString();
          fact.createLine(
              null,
              getAccountBPartner(C_BPartner_ID, as, creditPayment.getCreditPaymentUsed()
                  .isReceipt(), true, conn), creditPayment.getCreditPaymentUsed().getCurrency()
                  .getId(),
              (creditPayment.getCreditPaymentUsed().isReceipt() ? creditAmountConverted : ""),
              (creditPayment.getCreditPaymentUsed().isReceipt() ? "" : creditAmountConverted),
              Fact_Acct_Group_ID, nextSeqNo(SeqNo), DocumentType, conn);
          amtDiff = amtDiff.add(creditPayment.getAmount()).subtract(
              new BigDecimal(creditAmountConverted));
        }
        if (!payment.isReceipt() && amtDiff.compareTo(BigDecimal.ZERO) == 1 || payment.isReceipt()
            && amtDiff.compareTo(BigDecimal.ZERO) == -1) {
          fact.createLine(null, getAccount(AcctServer.ACCTTYPE_ConvertGainDefaultAmt, as, conn),
              payment.getCurrency().getId(), "", amtDiff.abs().toString(), Fact_Acct_Group_ID,
              nextSeqNo(SeqNo), DocumentType, conn);
        } else {
          fact.createLine(null, getAccount(AcctServer.ACCTTYPE_ConvertChargeDefaultAmt, as, conn),
              payment.getCurrency().getId(), amtDiff.abs().toString(), "", Fact_Acct_Group_ID,
              nextSeqNo(SeqNo), DocumentType, conn);
        }
        if (creditPayments.isEmpty()) {
          fact.createLine(null,
              getAccountBPartner(C_BPartner_ID, as, payment.isReceipt(), true, conn),
              C_Currency_ID, (payment.isReceipt() ? usedAmount : ""), (payment.isReceipt() ? ""
                  : usedAmount), Fact_Acct_Group_ID, nextSeqNo(SeqNo), DocumentType, conn);
        }
      }
    } finally {
      OBContext.restorePreviousMode();
    }
    //akhir
    SeqNo = "0";
    return fact;
  }

  //added by GAI Team
  /**
   * Get the account for Accounting Product
   * 
   * @param mProductId
   *          Product id
   * @param as
   *          accounting schema
   * @return Account
   */
  public final Account getAccountProduct(String mProductId, AcctSchema as, boolean isSoTrx, String docType,
      ConnectionProvider conn) {
    ProductInfoData[] data = null;
    try {
      if (log4j.isDebugEnabled())
        log4j.debug("DocFINPayment - getAccountProduct - DocumentType = " + DocumentType);
        data = ProductInfoData.selectProductAcct(conn, mProductId, as.getC_AcctSchema_ID());
    } catch (ServletException e) {
      log4j.warn(e);
    }
    // Get Acct
    String Account_ID = "";
    if (data != null && data.length != 0) {
      if (isSoTrx) {
         if (docType.equals("AR Invoice Penjaminan")) {
             Account_ID = data[0].aripenjaminan;  
         } else if (docType.equals("AR Invoice Subrogasi")) {
             Account_ID = data[0].arisubrograsi; 
         } else if (docType.equals("AR Invoice Recoveries")) {
             Account_ID = data[0].arirecoveries; 
         } else {
             Account_ID = data[0].productreceivable;
         }
      } else {
         if (docType.equals("AP Invoice Klaim")) {
             Account_ID = data[0].apiklaim;
         } else if (docType.equals("AP Invoice Re-Asuransi")){
             Account_ID = data[0].apireasuransi;
         } else {
             Account_ID = data[0].productpayable;
         }
      }
      
    } else
      return null;
    // No account
    if (Account_ID.equals("")) {
      log4j.warn("DocFINPayment - getAccountProduct - NO Product=" + mProductId
          + ", Record=" + Record_ID);
      return null;
    }
    // Return Account
    Account acct = null;
    try {
      acct = Account.getAccount(conn, Account_ID);
    } catch (ServletException e) {
      log4j.warn(e);
    }
    return acct;
  } // getAccount

  public final Account getAccountFinAcc(String finFinancialAcct, AcctSchema as, boolean isSoTrx,
      ConnectionProvider conn) {
    DocFINPaymentData[] data = null;
    try {
      if (log4j.isDebugEnabled())
        log4j.debug("DocFINPayment - getAccountFinAcc - DocumentType = " + DocumentType);
        data = DocFINPaymentData.selectAccountUnclass(conn, finFinancialAcct, as.getC_AcctSchema_ID());
    } catch (ServletException e) {
      log4j.warn(e);
    }
    // Get Acct
    String Account_ID = "";
    if (data != null && data.length != 0) {
      if (isSoTrx) {
         Account_ID = data[0].unclassreceive;  
      } //else {
        // Account_ID = data[0].unclassPay;
      //}
    } else
      return null;
    // No account
    if (Account_ID.equals("")) {
      log4j.warn("DocFINPayment - getAccountFinAcc - Record=" + Record_ID);
      return null;
    }
    // Return Account
    Account acct = null;
    try {
      acct = Account.getAccount(conn, Account_ID);
    } catch (ServletException e) {
      log4j.warn(e);
    }
    return acct;
  } 
  // getAccount
  //end added

  public boolean isOrderPrepayment(String paymentDetailID) {
    FIN_PaymentDetail pd = OBDal.getInstance().get(FIN_PaymentDetail.class, paymentDetailID);
    if (pd != null) {
      return pd.isPrepayment();
    }
    return false;
  }

  public String nextSeqNo(String oldSeqNo) {
    BigDecimal seqNo = new BigDecimal(oldSeqNo);
    SeqNo = (seqNo.add(new BigDecimal("10"))).toString();
    return SeqNo;
  }

  /**
   * Get Source Currency Balance - subtracts line amounts from total - no rounding
   * 
   * @return positive amount, if total is bigger than lines
   */
  @Override
  public BigDecimal getBalance() {
    BigDecimal retValue = ZERO;
    StringBuffer sb = new StringBuffer(" [");
    // Total
    retValue = retValue.add(new BigDecimal(getAmount(AcctServer.AMTTYPE_Gross)));
    if ((new BigDecimal(generatedAmount)).signum() == 0) {
      retValue = retValue.add(new BigDecimal(usedAmount));
    }
    sb.append(getAmount(AcctServer.AMTTYPE_Gross));
    // - Lines
    for (int i = 0; i < p_lines.length; i++) {
      BigDecimal lineBalance = new BigDecimal(((DocLine_FINPayment) p_lines[i]).Amount);
      retValue = retValue.subtract(lineBalance);
      sb.append("-").append(lineBalance);
    }
    sb.append("]");
    //
    log4j.debug(" Balance=" + retValue + sb.toString());
    return retValue;
  } // getBalance

  @Override
  public boolean getDocumentConfirmation(ConnectionProvider conn, String strRecordId) {
    // Checks if this step is configured to generate accounting for the selected financial account
    boolean confirmation = false;
    final String PAYMENT_RECEIVED = "RPR";
    final String PAYMENT_MADE = "PPM";
    final String DEPOSITED_NOT_CLEARED = "RDNC";
    final String WITHDRAWN_NOT_CLEARED = "PWNC";
    final String PAYMENT_CLEARED = "RPPC";
    OBContext.setAdminMode();
    try {
      FIN_Payment payment = OBDal.getInstance().get(FIN_Payment.class, strRecordId);
      // Posting can just happen if payment is in the right status
      if (payment.getStatus().equals(PAYMENT_RECEIVED) || payment.getStatus().equals(PAYMENT_MADE)
          || payment.getStatus().equals(DEPOSITED_NOT_CLEARED)
          || payment.getStatus().equals(WITHDRAWN_NOT_CLEARED)
          || payment.getStatus().equals(PAYMENT_CLEARED)) {
        OBCriteria<FinAccPaymentMethod> obCriteria = OBDal.getInstance().createCriteria(
            FinAccPaymentMethod.class);
        obCriteria.add(Restrictions.eq(FinAccPaymentMethod.PROPERTY_ACCOUNT, payment.getAccount()));
        obCriteria.add(Restrictions.eq(FinAccPaymentMethod.PROPERTY_PAYMENTMETHOD,
            payment.getPaymentMethod()));
        obCriteria.setFilterOnReadableClients(false);
        obCriteria.setFilterOnReadableOrganization(false);
        List<FinAccPaymentMethod> lines = obCriteria.list();
        List<FIN_FinancialAccountAccounting> accounts = payment.getAccount()
            .getFINFinancialAccountAcctList();
        for (FIN_FinancialAccountAccounting account : accounts) {
          if (confirmation)
            return confirmation;
          if (payment.isReceipt()) {
            if (("INT").equals(lines.get(0).getUponReceiptUse())
                && account.getInTransitPaymentAccountIN() != null)
              confirmation = true;
            else if (("DEP").equals(lines.get(0).getUponReceiptUse())
                && account.getDepositAccount() != null)
              confirmation = true;
            else if (("CLE").equals(lines.get(0).getUponReceiptUse())
                && account.getClearedPaymentAccount() != null)
              confirmation = true;
          } else {
            if (("INT").equals(lines.get(0).getUponPaymentUse())
                && account.getFINOutIntransitAcct() != null)
              confirmation = true;
            else if (("WIT").equals(lines.get(0).getUponPaymentUse())
                && account.getWithdrawalAccount() != null)
              confirmation = true;
            else if (("CLE").equals(lines.get(0).getUponPaymentUse())
                && account.getClearedPaymentAccountOUT() != null)
              confirmation = true;
          }
          // For payments with Amount ZERO always create an entry as no transaction will be created
          if (payment.getAmount().compareTo(ZERO) == 0) {
            confirmation = true;
          }
        }
      }
    } catch (Exception e) {
      setStatus(STATUS_DocumentDisabled);
      return confirmation;
    } finally {
      OBContext.restorePreviousMode();
    }
    if (!confirmation)
      setStatus(STATUS_DocumentDisabled);
    return confirmation;
  }

  @Override
  public void loadObjectFieldProvider(ConnectionProvider conn, String strAD_Client_ID, String Id)
      throws ServletException {
    FIN_Payment payment = OBDal.getInstance().get(FIN_Payment.class, Id);
    FieldProviderFactory[] data = new FieldProviderFactory[1];
    data[0] = new FieldProviderFactory(null);
    FieldProviderFactory.setField(data[0], "AD_Client_ID", payment.getClient().getId());
    FieldProviderFactory.setField(data[0], "AD_Org_ID", payment.getOrganization().getId());
    FieldProviderFactory.setField(data[0], "C_BPartner_ID",
        payment.getBusinessPartner() != null ? payment.getBusinessPartner().getId() : "");
    FieldProviderFactory.setField(data[0], "DocumentNo", payment.getDocumentNo());
    String dateFormat = OBPropertiesProvider.getInstance().getOpenbravoProperties()
        .getProperty("dateFormat.java");
    SimpleDateFormat outputFormat = new SimpleDateFormat(dateFormat);
    FieldProviderFactory.setField(data[0], "PaymentDate",
        outputFormat.format(payment.getPaymentDate()));
    FieldProviderFactory.setField(data[0], "C_DocType_ID", payment.getDocumentType().getId());
    FieldProviderFactory.setField(data[0], "C_Currency_ID", payment.getCurrency().getId());
    FieldProviderFactory.setField(data[0], "Amount", payment.getAmount().toString());
    FieldProviderFactory.setField(data[0], "GeneratedCredit", payment.getGeneratedCredit()
        .toString());
    FieldProviderFactory.setField(data[0], "UsedCredit", payment.getUsedCredit().toString());
    FieldProviderFactory.setField(data[0], "WriteOffAmt", payment.getWriteoffAmount().toString());
    FieldProviderFactory.setField(data[0], "Description", payment.getDescription());
    FieldProviderFactory.setField(data[0], "Posted", payment.getPosted());
    FieldProviderFactory.setField(data[0], "Processed", payment.isProcessed() ? "Y" : "N");
    FieldProviderFactory.setField(data[0], "Processing", payment.isProcessNow() ? "Y" : "N");
    FieldProviderFactory.setField(data[0], "C_Project_ID", payment.getProject() != null ? payment
        .getProject().getId() : "");
    FieldProviderFactory.setField(data[0], "C_Campaign_ID",
        payment.getSalesCampaign() != null ? payment.getSalesCampaign().getId() : "");
    FieldProviderFactory.setField(data[0], "C_Activity_ID", payment.getActivity() != null ? payment
        .getActivity().getId() : "");
    // User1_ID and User2_ID
    DocFINPaymentData[] paymentInfo = DocFINPaymentData.select(conn, payment.getId());
    if (paymentInfo.length > 0) {
      FieldProviderFactory.setField(data[0], "User1_ID", paymentInfo[0].user1Id);
      FieldProviderFactory.setField(data[0], "User2_ID", paymentInfo[0].user2Id);
      FieldProviderFactory.setField(data[0], "C_Costcenter_ID", paymentInfo[0].cCostcenterId);
    }
    // Used to match balances
    FieldProviderFactory.setField(data[0], "recordId2", payment.getId());
    setObjectFieldProvider(data);
  }

  /*
   * Retrieves Account for receipt / Payment for the given payment method + Financial Account
   */
  public Account getAccount(ConnectionProvider conn, FIN_PaymentMethod paymentMethod,
      FIN_FinancialAccount finAccount, AcctSchema as, boolean bIsReceipt) throws ServletException {
    OBContext.setAdminMode();
    Account account = null;
    try {
      OBCriteria<FIN_FinancialAccountAccounting> accounts = OBDal.getInstance().createCriteria(
          FIN_FinancialAccountAccounting.class);
      accounts.add(Restrictions.eq(FIN_FinancialAccountAccounting.PROPERTY_ACCOUNT, finAccount));
      accounts.add(Restrictions.eq(
          FIN_FinancialAccountAccounting.PROPERTY_ACCOUNTINGSCHEMA,
          OBDal.getInstance().get(
              org.openbravo.model.financialmgmt.accounting.coa.AcctSchema.class,
              as.m_C_AcctSchema_ID)));
      accounts.add(Restrictions.eq(FIN_FinancialAccountAccounting.PROPERTY_ACTIVE, true));
      accounts.setFilterOnReadableClients(false);
      accounts.setFilterOnReadableOrganization(false);
      List<FIN_FinancialAccountAccounting> accountList = accounts.list();
      if (accountList == null || accountList.size() == 0)
        return null;
      OBCriteria<FinAccPaymentMethod> accPaymentMethod = OBDal.getInstance().createCriteria(
          FinAccPaymentMethod.class);
      accPaymentMethod.add(Restrictions.eq(FinAccPaymentMethod.PROPERTY_ACCOUNT, finAccount));
      accPaymentMethod.add(Restrictions.eq(FinAccPaymentMethod.PROPERTY_PAYMENTMETHOD,
          paymentMethod));
      accPaymentMethod.setFilterOnReadableClients(false);
      accPaymentMethod.setFilterOnReadableOrganization(false);
      List<FinAccPaymentMethod> lines = accPaymentMethod.list();
      if (bIsReceipt) {
        account = getAccount(conn, lines.get(0).getUponReceiptUse(), accountList.get(0), bIsReceipt);
      } else {
        account = getAccount(conn, lines.get(0).getUponPaymentUse(), accountList.get(0), bIsReceipt);
      }
    } finally {
      OBContext.restorePreviousMode();
    }
    return account;
  }

  @Deprecated
  public String convertAmount(String Amount, boolean isReceipt, String mDateAcct,
      String conversionDate, String C_Currency_ID_From, String C_Currency_ID_To, DocLine line,
      AcctSchema as, Fact fact, String Fact_Acct_Group_ID, ConnectionProvider conn)
      throws ServletException {
    if (Amount == null || Amount.equals(""))
      return "0";
    if (C_Currency_ID_From.equals(C_Currency_ID_To))
      return Amount;
    else
      MultiCurrency = true;
    String Amt = getConvertedAmt(Amount, C_Currency_ID_From, C_Currency_ID_To, conversionDate, "",
        AD_Client_ID, AD_Org_ID, conn);
    if (log4j.isDebugEnabled())
      log4j.debug("Amt:" + Amt);

    String AmtTo = getConvertedAmt(Amount, C_Currency_ID_From, C_Currency_ID_To, mDateAcct, "",
        AD_Client_ID, AD_Org_ID, conn);
    if (log4j.isDebugEnabled())
      log4j.debug("AmtTo:" + AmtTo);

    BigDecimal AmtDiff = (new BigDecimal(AmtTo)).subtract(new BigDecimal(Amt));
    if (log4j.isDebugEnabled())
      log4j.debug("AmtDiff:" + AmtDiff);

    if (log4j.isDebugEnabled()) {
      log4j.debug("curr from:" + C_Currency_ID_From + " Curr to:" + C_Currency_ID_To + " convDate:"
          + conversionDate + " DateAcct:" + mDateAcct);
      log4j.debug("Amt:" + Amt + " AmtTo:" + AmtTo + " Diff:" + AmtDiff.toString());
    }

    if ((isReceipt && AmtDiff.compareTo(new BigDecimal("0.00")) == 1)
        || (!isReceipt && AmtDiff.compareTo(new BigDecimal("0.00")) == -1)) {
      fact.createLine(line, getAccount(AcctServer.ACCTTYPE_ConvertGainDefaultAmt, as, conn),
          C_Currency_ID_To, "", AmtDiff.abs().toString(), Fact_Acct_Group_ID, nextSeqNo(SeqNo),
          DocumentType, conn);
    } else {
      fact.createLine(line, getAccount(AcctServer.ACCTTYPE_ConvertChargeDefaultAmt, as, conn),
          C_Currency_ID_To, AmtDiff.abs().toString(), "", Fact_Acct_Group_ID, nextSeqNo(SeqNo),
          DocumentType, conn);
    }

    return Amt;
  }

  public String getSeqNo() {
    return SeqNo;
  }

  public void setSeqNo(String seqNo) {
    SeqNo = seqNo;
  }

  public String getGeneratedAmount() {
    return generatedAmount;
  }

  public void setGeneratedAmount(String generatedAmount) {
    this.generatedAmount = generatedAmount;
  }

  public String getUsedAmount() {
    return usedAmount;
  }

  public void setUsedAmount(String usedAmount) {
    this.usedAmount = usedAmount;
  }

  boolean isPaymentDatePriorToInvoiceDate(FIN_PaymentDetail paymentDetail) {
    List<FIN_PaymentScheduleDetail> schedDetails = paymentDetail.getFINPaymentScheduleDetailList();
    if (schedDetails.size() == 0) {
      return false;
    } else {
      if (schedDetails.get(0).getInvoicePaymentSchedule() != null
          && schedDetails.get(0).getInvoicePaymentSchedule().getInvoice().getAccountingDate()
              .after(paymentDetail.getFinPayment().getPaymentDate())) {
        return true;
      } else {
        return false;
      }
    }
  }
}
