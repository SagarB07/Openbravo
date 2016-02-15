 package com.gai.finance.imp.erpCommon.ad_process;
 
 import org.openbravo.idl.proc.Parameter;
 import org.openbravo.idl.proc.Validator;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.text.ParseException;
 import java.math.BigDecimal;
 import java.util.Date;
 import org.apache.log4j.*;
 
 import org.openbravo.base.exception.OBException;
 import org.openbravo.base.provider.OBProvider;
 import org.openbravo.base.structure.BaseOBObject;
 import org.openbravo.dal.service.OBDal;
 import org.openbravo.dal.core.DalUtil;
 import org.openbravo.erpCommon.utility.Utility;
 import org.openbravo.idl.proc.Value;
 import org.openbravo.module.idljava.proc.IdlServiceJava;
 //*/ Entitas
 import org.openbravo.model.financialmgmt.payment.FIN_Payment;
 import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
 import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
 import org.openbravo.model.common.enterprise.DocumentType;
 import org.openbravo.model.common.currency.Currency;
 import org.openbravo.model.common.businesspartner.BusinessPartner;
 import org.openbravo.model.common.businesspartner.BusinessPartner;
 //
 import org.openbravo.model.common.enterprise.Organization;
 import org.openbravo.model.financialmgmt.payment.FIN_PaymentDetail;
 import org.openbravo.model.financialmgmt.payment.FIN_PaymentSchedule;
 import org.openbravo.model.financialmgmt.payment.FIN_PaymentScheduleDetail;
 import org.openbravo.model.financialmgmt.gl.GLItem;
//import Utilitas Lain
 import org.openbravo.service.db.DalConnectionProvider;
 import org.openbravo.client.kernel.RequestContext;
 import org.openbravo.dal.core.OBContext;
 import java.util.List;
 import org.openbravo.advpaymentmngt.process.FIN_AddPayment;
 import org.openbravo.base.secureApp.VariablesSecureApp;
 import org.openbravo.database.ConnectionProvider;
 import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.OBMessageUtils;
 /**
 *
 * @author Tias Ade Putra - GAI
 */
 public class PaymentInOutProcess extends IdlServiceJava {
 static Logger log4j = Logger.getLogger(PaymentInOutProcess.class);
 
 FIN_Payment finPaymentGeneral = null;
 FIN_Payment finPaymentData = null;
 GLItem gl = null;
 String flag = "";
 private static Logger log=Logger.getLogger(PaymentInOutProcess.class);
 
 @Override
 public String getEntityName() {
 	return "ImportPaymentInorOut";
 }
 
 @Override
 public Parameter[] getParameters() {
 return new Parameter[] {
	//Header
	new Parameter("Organization", Parameter.STRING), //0
	new Parameter("DocumentType", Parameter.STRING), //1
	new Parameter("DocumentNo", Parameter.STRING), //2
	new Parameter("ReferenceNo", Parameter.STRING), //3
	new Parameter("Description", Parameter.STRING), //4
	new Parameter("PaymentDate", Parameter.STRING), //5
	new Parameter("ReceivedFrom", Parameter.STRING), //6
	new Parameter("PaymentMethod", Parameter.STRING), //7
	new Parameter("Amount", Parameter.STRING), //8
	new Parameter("Account", Parameter.STRING), //9
	new Parameter("Receipt", Parameter.STRING) ,//10


	//Line

 	};
 }
 
 @Override
 protected Object[] validateProcess(Validator validator, String... values) throws Exception {
	validator.checkOrganization(values[0]); //0
	validator.checkNotNull(validator.checkString(values[1], 255), "DocumentType");  //1
	validator.checkString(values[2], 255);  //2 //bila null akan di generate otomatis sesuai sequence
	validator.checkString(values[3], 255);  //3
	validator.checkString(values[4], 255);  //4
 	validator.checkDate(values[5]);		 //5
 	validator.checkString(values[6],255);		 //6
	validator.checkNotNull(validator.checkString(values[7], 255), "PaymentMethod");  //7
	validator.checkNotNull(validator.checkBigDecimal(values[8]),"Amount");   //8
	validator.checkNotNull(validator.checkString(values[9], 255), "Account"); //9
	//validator.checkNotNull(validator.checkString(values[11], 255), "Currency"); //10
	validator.checkNotNull(validator.checkString(values[10], 1), "Receipt"); //10
 
	return values;
 }


@Override
 public BaseOBObject internalProcess(Object... values) throws Exception {
	 return createPaymentInOut((String) values[0], (String) values[1], (String) values[2],(String) values[3], (String) values[4],(String)values[5],
	 	(String) values[6],(String) values[7],(String) values[8],(String) values[9],(String) values[10]);       
}

/* ====================================================================== */
 // create createPaymentIn
 public BaseOBObject createPaymentInOut(
 	final String Organization,	//0	    
 	final String DocumentType_k,	//1
 	final String DocumentNo,	//2
 	final String ReferenceNo, 	//3
 	final String Description, 	//4
 	final String PaymentDate,	//5
 	final String ReceivedFrom,	//6
 	final String PaymentMethod_k,	//7
 	final String Amount,		//8
 	final String Account_k,		//9
 	final String Isreceipt		//10
 
 )
 throws Exception {

 	ConnectionProvider thisconnProvider = new DalConnectionProvider();
 	VariablesSecureApp thisvars =RequestContext.get().getVariablesSecureApp();
 	
 // Header
	finPaymentData = OBProvider.getInstance().get(FIN_Payment.class);	

	finPaymentData.setActive(true);

	finPaymentData.setOrganization(rowOrganization); //0

	finPaymentData.setDocumentType(findDALInstance(false, DocumentType.class, new Value(DocumentType.PROPERTY_NAME, DocumentType_k)));	//1

	String generateDocumentNo = Utility.getDocumentNo(OBDal.getInstance().getConnection(false),		
		thisconnProvider, thisvars, "", FIN_Payment.TABLE_NAME,
		finPaymentData.getDocumentType().getId(),
		finPaymentData.getDocumentType().getId(), false, true);


	finPaymentData.setDocumentNo((DocumentNo.equals("") ||DocumentNo == null || DocumentNo.length() == 0)?generateDocumentNo:DocumentNo);	//2

	finPaymentData.setReferenceNo(ReferenceNo);	//3

	finPaymentData.setDescription(Description);	//4

	finPaymentData.setPaymentDate(Parameter.DATE.parse(PaymentDate)); //5

	String partnerReceivedFrom = (ReceivedFrom.equals("") || ReceivedFrom == null || ReceivedFrom.length() == 0) ? "UNCLASSIFIED" : ReceivedFrom;

	finPaymentData.setBusinessPartner(findDALInstance(false, BusinessPartner.class, new Value(
          BusinessPartner.PROPERTY_NAME,partnerReceivedFrom ))); //6

    finPaymentData.setPaymentMethod(findDALInstance(false, FIN_PaymentMethod.class, new Value(FIN_PaymentMethod.PROPERTY_NAME, PaymentMethod_k)));	//7	

    if (Isreceipt.toUpperCase().equals("Y")) {
    	finPaymentData.setAmount(new BigDecimal(Amount)); //8	
    }
    else {
    	finPaymentData.setGeneratedCredit(new BigDecimal(Amount)); //8	
    }

	FIN_FinancialAccount getFinancialAccountEntity = findDALInstance(false, FIN_FinancialAccount.class, new Value(FIN_FinancialAccount.PROPERTY_GENERICACCOUNTNO, Account_k));
	finPaymentData.setAccount(getFinancialAccountEntity);	//9

	finPaymentData.setCurrency(findDALInstance(false, Currency.class, new Value(Currency.PROPERTY_ID, DalUtil.getId(getFinancialAccountEntity.getCurrency()).toString()) ));	
	
	finPaymentData.setReceipt((Isreceipt.toUpperCase().equals("Y"))?true:false); //10	//misc : untuk mendifinisikan bahwa ini adalah Payment IN = true , Out = false 

	finPaymentData.setFinancialTransactionConvertRate(BigDecimal.ONE);

	finPaymentData.setFinancialTransactionAmount(new BigDecimal(Amount));

    
  

	OBDal.getInstance().save(finPaymentData);
	OBDal.getInstance().flush();


		BigDecimal newPaymentAmount = new BigDecimal(Amount);
        if (newPaymentAmount.compareTo(finPaymentData.getAmount()) != 0) {
          finPaymentData.setAmount(newPaymentAmount);
        
          OBDal.getInstance().save(finPaymentData);
          OBDal.getInstance().flush();
        }
        
        



		thisvars.setSessionValue("APRMT_MigrationToolRunning","N");
		processLine(finPaymentData,BigDecimal.ZERO,thisvars,thisconnProvider,null);
	

          OBDal.getInstance().commitAndClose();
 
 return finPaymentData;
 }
/* ====================================================================== */ 
public void processLine(FIN_Payment payment,BigDecimal assignedAmount,
	VariablesSecureApp vars,ConnectionProvider conn,GLItem glItem){
	OBError message = null;

	FIN_PaymentScheduleDetail refundScheduleDetail = getNewPaymentScheduleDetail(
            payment.getOrganization(), payment.getAmount().subtract(assignedAmount));

    getNewPaymentDetail(payment, refundScheduleDetail,
            payment.getAmount().subtract(assignedAmount), BigDecimal.ZERO, false, glItem);

    try {
    message = FIN_AddPayment.processPayment(vars, conn,
                  ("PRD".equals("PRP") || "PRD".equals("PPP")) ? "P" : "D", payment);
    } catch (Exception ex) {
            message = Utility.translateError(conn, vars, vars.getLanguage(), ex.getMessage());
            log4j.error(ex);
            if (!message.isConnectionAvailable()) {
              //bdErrorConnection(response);
              return;
            }
    }
}

	//insert ini pertama
	public FIN_PaymentScheduleDetail getNewPaymentScheduleDetail(Organization organization,
	      BigDecimal amount) {
	    final FIN_PaymentScheduleDetail newPaymentScheduleDetail = OBProvider.getInstance().get(
	        FIN_PaymentScheduleDetail.class);

	    log4j.debug("<proses_import-getNewPaymentScheduleDetail>organization : "+organization.getId());
	    log4j.debug("<proses_import-getNewPaymentScheduleDetail>organization : "+organization.getClient().getId());
	    log4j.debug("<proses_import-getNewPaymentScheduleDetail>organization : "+amount);

	    newPaymentScheduleDetail.setOrganization(organization);
	    // As '0' is not a valid organization for transactions we can assume that organization client is
	    // transaction client
	    newPaymentScheduleDetail.setClient(organization.getClient());
	    newPaymentScheduleDetail.setAmount(amount);

	    OBDal.getInstance().save(newPaymentScheduleDetail);
	    OBDal.getInstance().flush();
        OBDal.getInstance().commitAndClose();
	    
		return newPaymentScheduleDetail;
	}

	  //insert ini kedua
	public FIN_PaymentDetail getNewPaymentDetail(FIN_Payment payment,
	      FIN_PaymentScheduleDetail paymentScheduleDetail, BigDecimal paymentDetailAmount,
	      BigDecimal writeoffAmount, boolean isRefund, GLItem glitem) {
	    try {
	      OBContext.setAdminMode(true);
	      final FIN_PaymentDetail newPaymentDetail = OBProvider.getInstance().get(
	          FIN_PaymentDetail.class);
	      List<FIN_PaymentDetail> paymentDetails = payment.getFINPaymentDetailList();
	      log4j.debug("<AdvPaymentMngtDao-getNewPaymentDetail> size paymentDetails : "+paymentDetails.size());

	      newPaymentDetail.setFinPayment(payment);
	      newPaymentDetail.setOrganization(payment.getOrganization());
	      newPaymentDetail.setClient(payment.getClient());
	      newPaymentDetail.setAmount(paymentDetailAmount);
	      newPaymentDetail.setWriteoffAmount(writeoffAmount);
	      newPaymentDetail.setRefund(isRefund);
	      newPaymentDetail.setGLItem(glitem);
	      newPaymentDetail.setPrepayment(glitem == null
	          && paymentScheduleDetail.getInvoicePaymentSchedule() == null);

	      paymentDetails.add(newPaymentDetail);
	      payment.setFINPaymentDetailList(paymentDetails);
	      payment.setWriteoffAmount(payment.getWriteoffAmount().add(writeoffAmount));

	      log4j.debug("<AdvPaymentMngtDao-getNewPaymentDetail> size newPaymentDetail.setFinPayment : "+payment.getId());
	      log4j.debug("<AdvPaymentMngtDao-getNewPaymentDetail> size newPaymentDetail.setWriteoffAmount : "+writeoffAmount);
	      log4j.debug("<AdvPaymentMngtDao-getNewPaymentDetail> size newPaymentDetail.setRefund : "+isRefund);
	      log4j.debug("<AdvPaymentMngtDao-getNewPaymentDetail> size newPaymentDetail.setGLItem : "+((glitem == null)?"Kosong":""));
	      log4j.debug("<AdvPaymentMngtDao-getNewPaymentDetail> size payment.setWriteoffAmount : "+(payment.getWriteoffAmount().add(writeoffAmount)));

	      List<FIN_PaymentScheduleDetail> paymentScheduleDetails = newPaymentDetail
	          .getFINPaymentScheduleDetailList();
	      paymentScheduleDetail.setPaymentDetails(newPaymentDetail);
	      paymentScheduleDetails.add(paymentScheduleDetail);
	      newPaymentDetail.setFINPaymentScheduleDetailList(paymentScheduleDetails);

	      OBDal.getInstance().save(payment);
	      OBDal.getInstance().save(newPaymentDetail);
	      OBDal.getInstance().save(paymentScheduleDetail);
	      OBDal.getInstance().flush();
          OBDal.getInstance().commitAndClose();

	      return newPaymentDetail;
	    } finally {
	      OBContext.restorePreviousMode();
	    }

	}



}

