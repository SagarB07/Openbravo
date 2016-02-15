//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class DocInvoiceData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocInvoiceData.class);
  private String InitRecordNumber="0";
  public String ratetaxundeductable;
  public String orgtaxundeductable;
  public String cTaxId;
  public String name;
  public String rate;
  public String istaxdeductable;
  public String taxbaseamt;
  public String taxamt;
  public String cInvoiceId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String issotrx;
  public String documentno;
  public String docstatus;
  public String docaction;
  public String processing;
  public String processed;
  public String posted;
  public String cDoctypeId;
  public String cDoctypetargetId;
  public String cOrderId;
  public String description;
  public String istransferred;
  public String isprinted;
  public String salesrepId;
  public String dateinvoiced;
  public String dateprinted;
  public String dateacct;
  public String cBpartnerId;
  public String cBpartnerLocationId;
  public String poreference;
  public String isdiscountprinted;
  public String dateordered;
  public String cCurrencyId;
  public String paymentrule;
  public String cPaymenttermId;
  public String cChargeId;
  public String chargeamt;
  public String totallines;
  public String grandtotal;
  public String mPricelistId;
  public String istaxincluded;
  public String cCampaignId;
  public String cProjectId;
  public String cActivityId;
  public String ispaid;
  public String createfrom;
  public String generateto;
  public String sendemail;
  public String adUserId;
  public String copyfrom;
  public String isselfservice;
  public String adOrgtrxId;
  public String user1Id;
  public String user2Id;
  public String amount;
  public String status;
  public String isreceipt;
  public String ismanual;
  public String writeoffamt;
  public String cDebtPaymentId;
  public String pRevenueAcct;
  public String pExpenseAcct;
  public String finPaymentScheduleId;
  public String finPaymentmethodId;
  public String prepaidamt;
  public String fininvcount;
  public String finacctcount;
  public String finPaymentId;
  public String cCostcenterId;
  public String iscashvat;
  public String issales;
  public String ispurchase;
  public String docname;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("RATETAXUNDEDUCTABLE"))
      return ratetaxundeductable;
    else if (fieldName.equalsIgnoreCase("ORGTAXUNDEDUCTABLE"))
      return orgtaxundeductable;
    else if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("RATE"))
      return rate;
    else if (fieldName.equalsIgnoreCase("ISTAXDEDUCTABLE"))
      return istaxdeductable;
    else if (fieldName.equalsIgnoreCase("TAXBASEAMT"))
      return taxbaseamt;
    else if (fieldName.equalsIgnoreCase("TAXAMT"))
      return taxamt;
    else if (fieldName.equalsIgnoreCase("C_INVOICE_ID") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBY"))
      return createdby;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DOCSTATUS"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("DOCACTION"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPETARGET_ID") || fieldName.equals("cDoctypetargetId"))
      return cDoctypetargetId;
    else if (fieldName.equalsIgnoreCase("C_ORDER_ID") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ISTRANSFERRED"))
      return istransferred;
    else if (fieldName.equalsIgnoreCase("ISPRINTED"))
      return isprinted;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("DATEINVOICED"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("DATEPRINTED"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("ISDISCOUNTPRINTED"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_ID") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("TOTALLINES"))
      return totallines;
    else if (fieldName.equalsIgnoreCase("GRANDTOTAL"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("ISTAXINCLUDED"))
      return istaxincluded;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("ISPAID"))
      return ispaid;
    else if (fieldName.equalsIgnoreCase("CREATEFROM"))
      return createfrom;
    else if (fieldName.equalsIgnoreCase("GENERATETO"))
      return generateto;
    else if (fieldName.equalsIgnoreCase("SENDEMAIL"))
      return sendemail;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("COPYFROM"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("ISSELFSERVICE"))
      return isselfservice;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("AMOUNT"))
      return amount;
    else if (fieldName.equalsIgnoreCase("STATUS"))
      return status;
    else if (fieldName.equalsIgnoreCase("ISRECEIPT"))
      return isreceipt;
    else if (fieldName.equalsIgnoreCase("ISMANUAL"))
      return ismanual;
    else if (fieldName.equalsIgnoreCase("WRITEOFFAMT"))
      return writeoffamt;
    else if (fieldName.equalsIgnoreCase("C_DEBT_PAYMENT_ID") || fieldName.equals("cDebtPaymentId"))
      return cDebtPaymentId;
    else if (fieldName.equalsIgnoreCase("P_REVENUE_ACCT") || fieldName.equals("pRevenueAcct"))
      return pRevenueAcct;
    else if (fieldName.equalsIgnoreCase("P_EXPENSE_ACCT") || fieldName.equals("pExpenseAcct"))
      return pExpenseAcct;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENT_SCHEDULE_ID") || fieldName.equals("finPaymentScheduleId"))
      return finPaymentScheduleId;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_ID") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("PREPAIDAMT"))
      return prepaidamt;
    else if (fieldName.equalsIgnoreCase("FININVCOUNT"))
      return fininvcount;
    else if (fieldName.equalsIgnoreCase("FINACCTCOUNT"))
      return finacctcount;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENT_ID") || fieldName.equals("finPaymentId"))
      return finPaymentId;
    else if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("ISCASHVAT"))
      return iscashvat;
    else if (fieldName.equalsIgnoreCase("ISSALES"))
      return issales;
    else if (fieldName.equalsIgnoreCase("ISPURCHASE"))
      return ispurchase;
    else if (fieldName.equalsIgnoreCase("DOCNAME"))
      return docname;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocInvoiceData[] select(ConnectionProvider connectionProvider, String invoice)    throws ServletException {
    return select(connectionProvider, invoice, 0, 0);
  }

  public static DocInvoiceData[] select(ConnectionProvider connectionProvider, String invoice, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT t.IsTaxUndeductable as rateTaxUndeductable, (select IsTaxUndeductable from ad_orginfo o where o.ad_org_id=it.ad_org_id) as orgTaxUndeductable, it.C_Tax_ID, t.Name, t.Rate, t.IsTaxDeductable, SUM(it.TaxBaseAmt) AS TaxBaseAmt, SUM(it.TaxAmt) AS TaxAmt, '' AS C_INVOICE_ID, '' AS AD_CLIENT_ID, '' AS AD_ORG_ID," +
      "        '' AS ISACTIVE, '' AS CREATED, '' AS CREATEDBY, '' AS UPDATED, '' AS UPDATEDBY, '' AS ISSOTRX, '' AS DOCUMENTNO," +
      "        '' AS DOCSTATUS, '' AS DOCACTION, '' AS PROCESSING, '' AS PROCESSED, '' AS POSTED, '' AS C_DOCTYPE_ID, '' AS C_DOCTYPETARGET_ID," +
      "        '' AS C_ORDER_ID, '' AS DESCRIPTION, '' AS ISTRANSFERRED, '' AS ISPRINTED, '' AS SALESREP_ID, '' AS DATEINVOICED," +
      "        '' AS DATEPRINTED, '' AS DATEACCT, '' AS C_BPARTNER_ID, '' AS C_BPARTNER_LOCATION_ID, '' AS POREFERENCE, '' AS ISDISCOUNTPRINTED," +
      "        '' AS DATEORDERED, '' AS C_CURRENCY_ID, '' AS PAYMENTRULE, '' AS C_PAYMENTTERM_ID, '' AS C_CHARGE_ID, '' AS CHARGEAMT, '' AS TOTALLINES," +
      "        '' AS GRANDTOTAL, '' AS M_PRICELIST_ID, '' AS ISTAXINCLUDED, '' AS C_CAMPAIGN_ID, '' AS C_PROJECT_ID, '' AS C_ACTIVITY_ID," +
      "        '' AS ISPAID, '' AS CREATEFROM, '' AS GENERATETO, '' AS SENDEMAIL, '' AS AD_USER_ID, '' AS COPYFROM, '' AS ISSELFSERVICE," +
      "        '' AS AD_ORGTRX_ID, '' AS USER1_ID, '' AS USER2_ID, '' as AMOUNT, '' AS STATUS, '' AS ISRECEIPT, '' AS ISMANUAL, '' AS WRITEOFFAMT," +
      "        '' AS C_DEBT_PAYMENT_ID, '' AS P_REVENUE_ACCT, '' AS P_EXPENSE_ACCT, '' as FIN_PAYMENT_SCHEDULE_ID, '' as FIN_PAYMENTMETHOD_ID, '' AS PREPAIDAMT," +
      "        '' AS FININVCOUNT, '' AS FINACCTCOUNT, '' AS FIN_PAYMENT_ID, '' AS C_COSTCENTER_ID, t.isCashVAT AS ISCASHVAT, '' AS issales, '' AS ispurchase," +
      "        '' AS DOCNAME" +
      "        FROM C_Tax t, C_InvoiceTax it" +
      "        WHERE t.C_Tax_ID=it.C_Tax_ID AND it.C_Invoice_ID=?" +
      "	GROUP BY t.IsTaxUndeductable, it.C_Tax_ID, t.Name, t.Rate, t.IsTaxDeductable, it.ad_org_id, t.isCashVAT";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoice);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.ratetaxundeductable = UtilSql.getValue(result, "RATETAXUNDEDUCTABLE");
        objectDocInvoiceData.orgtaxundeductable = UtilSql.getValue(result, "ORGTAXUNDEDUCTABLE");
        objectDocInvoiceData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocInvoiceData.name = UtilSql.getValue(result, "NAME");
        objectDocInvoiceData.rate = UtilSql.getValue(result, "RATE");
        objectDocInvoiceData.istaxdeductable = UtilSql.getValue(result, "ISTAXDEDUCTABLE");
        objectDocInvoiceData.taxbaseamt = UtilSql.getValue(result, "TAXBASEAMT");
        objectDocInvoiceData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocInvoiceData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectDocInvoiceData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocInvoiceData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocInvoiceData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocInvoiceData.created = UtilSql.getValue(result, "CREATED");
        objectDocInvoiceData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectDocInvoiceData.updated = UtilSql.getValue(result, "UPDATED");
        objectDocInvoiceData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDocInvoiceData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectDocInvoiceData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocInvoiceData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectDocInvoiceData.docaction = UtilSql.getValue(result, "DOCACTION");
        objectDocInvoiceData.processing = UtilSql.getValue(result, "PROCESSING");
        objectDocInvoiceData.processed = UtilSql.getValue(result, "PROCESSED");
        objectDocInvoiceData.posted = UtilSql.getValue(result, "POSTED");
        objectDocInvoiceData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectDocInvoiceData.cDoctypetargetId = UtilSql.getValue(result, "C_DOCTYPETARGET_ID");
        objectDocInvoiceData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectDocInvoiceData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocInvoiceData.istransferred = UtilSql.getValue(result, "ISTRANSFERRED");
        objectDocInvoiceData.isprinted = UtilSql.getValue(result, "ISPRINTED");
        objectDocInvoiceData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectDocInvoiceData.dateinvoiced = UtilSql.getValue(result, "DATEINVOICED");
        objectDocInvoiceData.dateprinted = UtilSql.getValue(result, "DATEPRINTED");
        objectDocInvoiceData.dateacct = UtilSql.getValue(result, "DATEACCT");
        objectDocInvoiceData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocInvoiceData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectDocInvoiceData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectDocInvoiceData.isdiscountprinted = UtilSql.getValue(result, "ISDISCOUNTPRINTED");
        objectDocInvoiceData.dateordered = UtilSql.getValue(result, "DATEORDERED");
        objectDocInvoiceData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocInvoiceData.paymentrule = UtilSql.getValue(result, "PAYMENTRULE");
        objectDocInvoiceData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectDocInvoiceData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocInvoiceData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocInvoiceData.totallines = UtilSql.getValue(result, "TOTALLINES");
        objectDocInvoiceData.grandtotal = UtilSql.getValue(result, "GRANDTOTAL");
        objectDocInvoiceData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectDocInvoiceData.istaxincluded = UtilSql.getValue(result, "ISTAXINCLUDED");
        objectDocInvoiceData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocInvoiceData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocInvoiceData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocInvoiceData.ispaid = UtilSql.getValue(result, "ISPAID");
        objectDocInvoiceData.createfrom = UtilSql.getValue(result, "CREATEFROM");
        objectDocInvoiceData.generateto = UtilSql.getValue(result, "GENERATETO");
        objectDocInvoiceData.sendemail = UtilSql.getValue(result, "SENDEMAIL");
        objectDocInvoiceData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectDocInvoiceData.copyfrom = UtilSql.getValue(result, "COPYFROM");
        objectDocInvoiceData.isselfservice = UtilSql.getValue(result, "ISSELFSERVICE");
        objectDocInvoiceData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocInvoiceData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocInvoiceData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocInvoiceData.amount = UtilSql.getValue(result, "AMOUNT");
        objectDocInvoiceData.status = UtilSql.getValue(result, "STATUS");
        objectDocInvoiceData.isreceipt = UtilSql.getValue(result, "ISRECEIPT");
        objectDocInvoiceData.ismanual = UtilSql.getValue(result, "ISMANUAL");
        objectDocInvoiceData.writeoffamt = UtilSql.getValue(result, "WRITEOFFAMT");
        objectDocInvoiceData.cDebtPaymentId = UtilSql.getValue(result, "C_DEBT_PAYMENT_ID");
        objectDocInvoiceData.pRevenueAcct = UtilSql.getValue(result, "P_REVENUE_ACCT");
        objectDocInvoiceData.pExpenseAcct = UtilSql.getValue(result, "P_EXPENSE_ACCT");
        objectDocInvoiceData.finPaymentScheduleId = UtilSql.getValue(result, "FIN_PAYMENT_SCHEDULE_ID");
        objectDocInvoiceData.finPaymentmethodId = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_ID");
        objectDocInvoiceData.prepaidamt = UtilSql.getValue(result, "PREPAIDAMT");
        objectDocInvoiceData.fininvcount = UtilSql.getValue(result, "FININVCOUNT");
        objectDocInvoiceData.finacctcount = UtilSql.getValue(result, "FINACCTCOUNT");
        objectDocInvoiceData.finPaymentId = UtilSql.getValue(result, "FIN_PAYMENT_ID");
        objectDocInvoiceData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocInvoiceData.iscashvat = UtilSql.getValue(result, "ISCASHVAT");
        objectDocInvoiceData.issales = UtilSql.getValue(result, "ISSALES");
        objectDocInvoiceData.ispurchase = UtilSql.getValue(result, "ISPURCHASE");
        objectDocInvoiceData.docname = UtilSql.getValue(result, "DOCNAME");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static DocInvoiceData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return selectRegistro(connectionProvider, client, id, 0, 0);
  }

  public static DocInvoiceData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT I.AD_CLIENT_ID, I.AD_ORG_ID, I.C_BPARTNER_ID, I.AD_ORGTRX_ID, I.C_PROJECT_ID," +
      "        I.C_CAMPAIGN_ID, I.C_ACTIVITY_ID, I.C_COSTCENTER_ID, I.USER1_ID, I.USER2_ID, I.DOCUMENTNO, I.DATEACCT," +
      "        I.C_CURRENCY_ID, I.C_DOCTYPE_ID, I.C_CHARGE_ID, I.CHARGEAMT, I.POSTED, I.DATEINVOICED," +
      "        I.ISTAXINCLUDED, I.C_BPARTNER_LOCATION_ID, I.GRANDTOTAL, I.TOTALLINES, I.CHARGEAMT," +
      "        I.ISCASHVAT" +
      "        FROM C_INVOICE I" +
      "        WHERE AD_Client_ID=?" +
      "        AND C_INVOICE_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocInvoiceData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocInvoiceData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocInvoiceData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocInvoiceData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocInvoiceData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocInvoiceData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocInvoiceData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocInvoiceData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocInvoiceData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocInvoiceData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocInvoiceData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocInvoiceData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocInvoiceData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectDocInvoiceData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocInvoiceData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocInvoiceData.posted = UtilSql.getValue(result, "POSTED");
        objectDocInvoiceData.dateinvoiced = UtilSql.getDateValue(result, "DATEINVOICED", "dd-MM-yyyy");
        objectDocInvoiceData.istaxincluded = UtilSql.getValue(result, "ISTAXINCLUDED");
        objectDocInvoiceData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectDocInvoiceData.grandtotal = UtilSql.getValue(result, "GRANDTOTAL");
        objectDocInvoiceData.totallines = UtilSql.getValue(result, "TOTALLINES");
        objectDocInvoiceData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocInvoiceData.iscashvat = UtilSql.getValue(result, "ISCASHVAT");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static DocInvoiceData[] selectDebtPayments(ConnectionProvider connectionProvider, String invoice)    throws ServletException {
    return selectDebtPayments(connectionProvider, invoice, 0, 0);
  }

  public static DocInvoiceData[] selectDebtPayments(ConnectionProvider connectionProvider, String invoice, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT (AMOUNT + coalesce(WITHHOLDINGAMOUNT,0)) AS AMOUNT, C_CURRENCY_ID, STATUS_INITIAL AS STATUS, ISRECEIPT, ISPAID, ISMANUAL, WRITEOFFAMT, C_DEBT_PAYMENT_ID" +
      "      FROM C_DEBT_PAYMENT" +
      "      WHERE C_INVOICE_ID =?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoice);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.amount = UtilSql.getValue(result, "AMOUNT");
        objectDocInvoiceData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocInvoiceData.status = UtilSql.getValue(result, "STATUS");
        objectDocInvoiceData.isreceipt = UtilSql.getValue(result, "ISRECEIPT");
        objectDocInvoiceData.ispaid = UtilSql.getValue(result, "ISPAID");
        objectDocInvoiceData.ismanual = UtilSql.getValue(result, "ISMANUAL");
        objectDocInvoiceData.writeoffamt = UtilSql.getValue(result, "WRITEOFFAMT");
        objectDocInvoiceData.cDebtPaymentId = UtilSql.getValue(result, "C_DEBT_PAYMENT_ID");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static DocInvoiceData[] selectPayments(ConnectionProvider connectionProvider, String invoice)    throws ServletException {
    return selectPayments(connectionProvider, invoice, 0, 0);
  }

  public static DocInvoiceData[] selectPayments(ConnectionProvider connectionProvider, String invoice, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT SUM(CASE WHEN ISPREPAYMENT = 'Y' THEN 0 ELSE (FIN_PAYMENT_SCHEDULEDETAIL.AMOUNT + FIN_PAYMENT_SCHEDULEDETAIL.WRITEOFFAMT) END) AS AMOUNT,  CASE WHEN (FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_SCHEDULE_ORDER IS NOT NULL " +
      "                        AND COALESCE(FIN_PAYMENT_DETAIL.ISPREPAYMENT,'N') = 'Y') THEN FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_SCHEDULE_ORDER ELSE FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_SCHEDULE_INVOICE END as FIN_PAYMENT_SCHEDULE_ID, " +
      "        FIN_PAYMENT_SCHEDULE.C_CURRENCY_ID, SUM(CASE WHEN ISPREPAYMENT = 'Y' THEN (FIN_PAYMENT_SCHEDULEDETAIL.AMOUNT + FIN_PAYMENT_SCHEDULEDETAIL.WRITEOFFAMT) ELSE 0 END) AS PREPAIDAMT" +
      "        FROM FIN_PAYMENT_SCHEDULE" +
      "        LEFT JOIN FIN_PAYMENT_SCHEDULEDETAIL ON FIN_PAYMENT_SCHEDULE.FIN_PAYMENT_SCHEDULE_ID = FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_SCHEDULE_INVOICE" +
      "        LEFT JOIN FIN_PAYMENT_DETAIL ON FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_DETAIL_ID = FIN_PAYMENT_DETAIL.FIN_PAYMENT_DETAIL_ID" +
      "        WHERE FIN_PAYMENT_SCHEDULE.C_INVOICE_ID =?" +
      "        GROUP BY CASE WHEN (FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_SCHEDULE_ORDER IS NOT NULL " +
      "                        AND COALESCE(FIN_PAYMENT_DETAIL.ISPREPAYMENT,'N') = 'Y') THEN FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_SCHEDULE_ORDER ELSE FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_SCHEDULE_INVOICE END, " +
      "                        FIN_PAYMENT_SCHEDULE.C_CURRENCY_ID" +
      "        ORDER BY AMOUNT DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoice);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.amount = UtilSql.getValue(result, "AMOUNT");
        objectDocInvoiceData.finPaymentScheduleId = UtilSql.getValue(result, "FIN_PAYMENT_SCHEDULE_ID");
        objectDocInvoiceData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocInvoiceData.prepaidamt = UtilSql.getValue(result, "PREPAIDAMT");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static DocInvoiceData[] selectPrepayments(ConnectionProvider connectionProvider, String paymentSchedule)    throws ServletException {
    return selectPrepayments(connectionProvider, paymentSchedule, 0, 0);
  }

  public static DocInvoiceData[] selectPrepayments(ConnectionProvider connectionProvider, String paymentSchedule, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT FIN_PAYMENT_SCHEDULEDETAIL.AMOUNT AS PREPAIDAMT, FIN_PAYMENT_DETAIL.FIN_PAYMENT_ID" +
      "    FROM FIN_PAYMENT_SCHEDULE " +
      "    LEFT JOIN FIN_PAYMENT_SCHEDULEDETAIL ON FIN_PAYMENT_SCHEDULE.FIN_PAYMENT_SCHEDULE_ID = FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_SCHEDULE_INVOICE" +
      "    LEFT JOIN FIN_PAYMENT_DETAIL ON FIN_PAYMENT_SCHEDULEDETAIL.FIN_PAYMENT_DETAIL_ID = FIN_PAYMENT_DETAIL.FIN_PAYMENT_DETAIL_ID" +
      "    WHERE COALESCE(FIN_PAYMENT_DETAIL.ISPREPAYMENT,'N') = 'Y'" +
      "    AND FIN_PAYMENT_SCHEDULE.FIN_PAYMENT_SCHEDULE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentSchedule);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.prepaidamt = UtilSql.getValue(result, "PREPAIDAMT");
        objectDocInvoiceData.finPaymentId = UtilSql.getValue(result, "FIN_PAYMENT_ID");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static DocInvoiceData[] selectProductAcct(ConnectionProvider connectionProvider, String acctSchemaId, String taxId, String invoiceId)    throws ServletException {
    return selectProductAcct(connectionProvider, acctSchemaId, taxId, invoiceId, 0, 0);
  }

  public static DocInvoiceData[] selectProductAcct(ConnectionProvider connectionProvider, String acctSchemaId, String taxId, String invoiceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT a.P_Revenue_Acct, a.P_Expense_Acct, t.TaxAmt" +
      "        FROM M_Product_Acct a, C_InvoiceLineTax t, C_InvoiceLine l, M_Product p" +
      "        WHERE t.C_InvoiceLine_Id = l.C_InvoiceLine_Id" +
      "        AND l.M_Product_Id = p.M_Product_Id" +
      "        AND p.M_Product_Id = a.M_Product_Id" +
      "        AND a.C_AcctSchema_Id = ?" +
      "        AND t.C_Tax_Id= ?" +
      "        AND t.C_Invoice_Id= ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctSchemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceId);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.pRevenueAcct = UtilSql.getValue(result, "P_REVENUE_ACCT");
        objectDocInvoiceData.pExpenseAcct = UtilSql.getValue(result, "P_EXPENSE_ACCT");
        objectDocInvoiceData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static int updateProductPO(Connection conn, ConnectionProvider connectionProvider, String invoice)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_Product_PO SET PriceLastInv =" +
      "                (SELECT AVG(C_Currency_Convert(il.PriceActual,i.C_Currency_ID,M_Product_PO.C_Currency_ID,i.DateInvoiced,null,i.AD_Client_ID,i.AD_Org_ID))" +
      "                FROM C_Invoice i, C_InvoiceLine il" +
      "                WHERE i.C_Invoice_ID=il.C_Invoice_ID" +
      "                AND M_Product_PO.M_Product_ID=il.M_Product_ID" +
      "                AND M_Product_PO.C_BPartner_ID=i.C_BPartner_ID" +
      "                AND i.C_Invoice_ID=?)" +
      "        WHERE EXISTS (SELECT *" +
      "        FROM C_Invoice i, C_InvoiceLine il" +
      "        WHERE i.C_Invoice_ID=il.C_Invoice_ID" +
      "        AND M_Product_PO.M_Product_ID=il.M_Product_ID" +
      "        AND M_Product_PO.C_BPartner_ID=i.C_BPartner_ID" +
      "        AND i.C_Invoice_ID=?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoice);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static DocInvoiceData[] selectGLItemAcctForTaxLine(ConnectionProvider connectionProvider, String acctSchemaId, String taxId, String invoiceId)    throws ServletException {
    return selectGLItemAcctForTaxLine(connectionProvider, acctSchemaId, taxId, invoiceId, 0, 0);
  }

  public static DocInvoiceData[] selectGLItemAcctForTaxLine(ConnectionProvider connectionProvider, String acctSchemaId, String taxId, String invoiceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT a.GLITEM_CREDIT_ACCT AS P_REVENUE_ACCT, a.GLITEM_DEBIT_ACCT AS P_EXPENSE_ACCT, t.TaxAmt" +
      "    FROM C_GLITEM_ACCT a, C_InvoiceLineTax t, C_InvoiceLine l" +
      "    WHERE t.C_InvoiceLine_Id = l.C_InvoiceLine_Id " +
      "    AND l.Account_ID = a.C_GLITEM_id" +
      "    AND a.C_ACCTSCHEMA_id = ?" +
      "    AND t.C_Tax_Id= ? " +
      "    AND t.C_Invoice_Id= ? ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctSchemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceId);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.pRevenueAcct = UtilSql.getValue(result, "P_REVENUE_ACCT");
        objectDocInvoiceData.pExpenseAcct = UtilSql.getValue(result, "P_EXPENSE_ACCT");
        objectDocInvoiceData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static DocInvoiceData[] getTaxLineCount(ConnectionProvider connectionProvider, String taxId, String invoiceId)    throws ServletException {
    return getTaxLineCount(connectionProvider, taxId, invoiceId, 0, 0);
  }

  public static DocInvoiceData[] getTaxLineCount(ConnectionProvider connectionProvider, String taxId, String invoiceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT count(*) as TOTALLINES" +
      "    FROM C_InvoiceLineTax" +
      "    WHERE C_Tax_Id= ? " +
      "    AND C_Invoice_Id= ? ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceId);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.totallines = UtilSql.getValue(result, "TOTALLINES");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static DocInvoiceData[] selectFinInvCount(ConnectionProvider connectionProvider, String invoiceId, String acctschemaId)    throws ServletException {
    return selectFinInvCount(connectionProvider, invoiceId, acctschemaId, 0, 0);
  }

  public static DocInvoiceData[] selectFinInvCount(ConnectionProvider connectionProvider, String invoiceId, String acctschemaId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (SELECT count(distinct account_id)" +
      "                FROM c_invoiceline" +
      "                WHERE financial_invoice_line='Y'" +
      "                      AND c_invoice_id = ?) AS FININVCOUNT," +
      "               (SELECT count(distinct glact.c_glitem_id)" +
      "                FROM c_invoiceline invline JOIN c_glitem_acct glact ON (invline.account_id = glact.c_glitem_id)" +
      "                     JOIN c_acctschema acctschema on (glact.c_acctschema_id = acctschema.c_acctschema_id)" +
      "                WHERE invline.financial_invoice_line = 'Y' AND" +
      "                      invline.c_invoice_id = ? AND" +
      "                      acctschema.c_acctschema_id = ? AND" +
      "                      glact.glitem_debit_acct IS NOT NULL AND " +
      "                      glact.glitem_credit_acct IS NOT NULL) AS FINACCTCOUNT" +
      "        FROM DUAL";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschemaId);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.fininvcount = UtilSql.getValue(result, "FININVCOUNT");
        objectDocInvoiceData.finacctcount = UtilSql.getValue(result, "FINACCTCOUNT");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static DocInvoiceData[] selectIsCustom(ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    return selectIsCustom(connectionProvider, adClientId, 0, 0);
  }

  public static DocInvoiceData[] selectIsCustom(ConnectionProvider connectionProvider, String adClientId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT EM_Gap_Iscsales_Acct AS issales, EM_Gap_Iscprch_Acct AS ispurchase FROM AD_Client" +
      "      WHERE AD_Client_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocInvoiceData objectDocInvoiceData = new DocInvoiceData();
        objectDocInvoiceData.issales = UtilSql.getValue(result, "ISSALES");
        objectDocInvoiceData.ispurchase = UtilSql.getValue(result, "ISPURCHASE");
        objectDocInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInvoiceData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocInvoiceData objectDocInvoiceData[] = new DocInvoiceData[vector.size()];
    vector.copyInto(objectDocInvoiceData);
    return(objectDocInvoiceData);
  }

  public static String selectDocTypeName(ConnectionProvider connectionProvider, String cInvoiceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT CD.Name AS docname" +
      "      FROM C_Invoice CI, C_DocType CD" +
      "      WHERE CI.C_DocType_ID = CD.C_DocType_ID" +
      "      AND CI.C_Invoice_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "DOCNAME");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }
}
