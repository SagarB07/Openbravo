 package com.gai.finance.imp.erpCommon.ad_process;
 
 import org.openbravo.idl.proc.Parameter;
 import org.openbravo.idl.proc.Validator;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.text.ParseException;
 import java.math.BigDecimal;
 import java.util.Date;
 import org.apache.log4j.*;
 //OBDAL
 import org.hibernate.Criteria;
 import org.hibernate.criterion.Expression;
 import org.hibernate.criterion.Projections;
 import org.openbravo.dal.service.OBCriteria;
 import org.openbravo.dal.service.OBDal;
 import org.openbravo.scheduling.ProcessBundle;
 import org.openbravo.scheduling.ProcessLogger;
 import org.openbravo.service.db.DalBaseProcess;
 import org.quartz.JobExecutionException;
 
 import org.openbravo.base.exception.OBException;
 import org.openbravo.base.provider.OBProvider;
 import org.openbravo.base.structure.BaseOBObject;
 import org.openbravo.dal.service.OBDal;
 import org.openbravo.erpCommon.utility.Utility;
 import org.openbravo.idl.proc.Value;
 import org.openbravo.module.idljava.proc.IdlServiceJava;
 //import Invoice dan Line
 import org.openbravo.model.common.invoice.Invoice;
 import org.openbravo.model.common.invoice.InvoiceLine;
// import BP
 import org.openbravo.model.common.businesspartner.BusinessPartner;
 import org.openbravo.model.common.businesspartner.Location;
 //import Financial
 import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
 import org.openbravo.model.financialmgmt.payment.PaymentTerm;
 //import Document Type
 import org.openbravo.model.common.enterprise.DocumentType;
 //import GLItem
 import org.openbravo.model.financialmgmt.gl.GLItem;
 //import PriceList
 import org.openbravo.model.pricing.pricelist.PriceList;
//import CUrrency
 import org.openbravo.model.common.currency.Currency;
//import TAX
 import org.openbravo.model.financialmgmt.tax.TaxRate;

 /**
 *
 * @author Mochamad Fachmi Rizal - GAI
 */
 public class SalesInvoiceProcess extends IdlServiceJava {
 
//int count= 1;
 Invoice InvoiceData = null;
 Invoice InvoiceTest = null;
 String flag = "";
 private static Logger log=Logger.getLogger(SalesInvoiceProcess.class);
 
 @Override
 public String getEntityName() {
 return "Simple Sales Invoice";
 }
 
 @Override
 public Parameter[] getParameters() {
 return new Parameter[] {
//Header
	 new Parameter("Organization", Parameter.STRING), //0
	 new Parameter("TransactionDocument",Parameter.STRING), //1          [Foreign Key]
	 new Parameter("DocumentNo",Parameter.STRING), //2
	 new Parameter("InvoiceDate", Parameter.STRING), //3
	 new Parameter("BusinessPartner", Parameter.STRING), //4					 [Foreign Key]
	 new Parameter("ISOCode", Parameter.STRING), //5					 [Foreign Key]
//	 new Parameter("PartnerAddress",Parameter.STRING),  //
	 new Parameter("PaymentTerms", Parameter.STRING), //6       				 [Foreign Key]
	 new Parameter("PaymentMethod", Parameter.STRING), //7       			 [Foreign Key]
	 new Parameter("PriceList", Parameter.STRING), //8					    		 [Foreign Key]
	 new Parameter("AccountingDate", Parameter.STRING), //9
//Line
	 new Parameter("LineNo", Parameter.STRING), //10
	 new Parameter("InvoicedQuantity", Parameter.STRING), //11
	 new Parameter("UnitPrice", Parameter.STRING) ,//12
	 new Parameter("LineNetAmount", Parameter.STRING) , //13
	 new Parameter("FinancialInvoiceLine", Parameter.STRING) , //14
	 new Parameter("Account", Parameter.STRING), //15                           [Foreign Key]
	 new Parameter("Tax", Parameter.STRING) }; //16			                       [Foreign Key]
 }
 
 @Override
 protected Object[] validateProcess(Validator validator, String... values) throws Exception {
 validator.checkOrganization(values[0]);
 validator.checkString(values[1], 255);
 validator.checkString(values[2], 255);
 validator.checkDate(values[3]);
 validator.checkString(values[4], 255);
 validator.checkString(values[5], 255);
 validator.checkString(values[6], 255);
 validator.checkString(values[7], 255);
 validator.checkString(values[8], 255);
validator.checkDate(values[9]); 
//
 validator.checkBigDecimal(values[10]);
 validator.checkBigDecimal(values[11]);
 validator.checkBigDecimal(values[12]);
 validator.checkBigDecimal(values[13]);
 validator.checkBoolean(values[14]);  
 validator.checkString(values[15], 255);  
 validator.checkString(values[16], 255);  

 
 
 return values;
 }


@Override
 public BaseOBObject internalProcess(Object... values) throws Exception {
	 return createSalesInvoice((String) values[0], (String) values[1], (String) values[2],(String) values[3], (String) values[4],(String) values[5],(String) values[6], (String) values[7], (String) values[8],(String) values[9], (String) values[10],(String) values[11],(String) values[12],(String) values[13],(String) values[14],(String) values[15],(String) values[16] /*,(String) values[17] */);       
}

/* ====================================================================== */
 // create SalesForeCast
 public BaseOBObject createSalesInvoice(
			final String Organization, 
			final String TransactionDocument_k, 
			final String DocumentNo, 
			final String InvoiceDate, 
			final String BusinessPartner_k,
			final String ISOCode_k,
//			final String PartnerAddress_k,
			final String PaymentTerms_k ,
			final String PaymentMethod_k,
			final String PriceList_k,
			final String AccountingDate,		
			
			final String LineNo,
			final String InvoicedQuantity,
			final String UnitPrice,
			final String LineNetAmount,
			final String FinancialInvoiceLine,
			final String Account_k,
			final String Tax_k
			)
 throws Exception {
//try { 
	final OBCriteria<BusinessPartner> BPList = OBDal.getInstance()
                .createCriteria(BusinessPartner.class);
        BPList.add(Expression.eq(BusinessPartner.PROPERTY_SEARCHKEY, BusinessPartner_k));
		
		 for (BusinessPartner bp : BPList.list()) {
	
			
	/* */
			//			Location locationList = OBDal.getInstance().get(Location.class,bp.) 
			//			count = 1;
						 
							
							//dapatkan DAL business partner
							BusinessPartner bpinst = findDALInstance(false, BusinessPartner.class, new Value(
							BusinessPartner.PROPERTY_SEARCHKEY, BusinessPartner_k));
							
							// Header
														 
							//cek bila DOcumentno ada
							// InvoiceTest = findDALInstance(false, Invoice.class, new Value(
							//          Invoice.PROPERTY_DOCUMENTNO, DocumentNo));


								InvoiceData = OBProvider.getInstance().get(Invoice.class);	

							// if (flag == "") {
								InvoiceData.setActive(true);
								InvoiceData.setOrganization(rowOrganization); 

								//Sales Transaction (IsSOTrx ) , True = yes
								InvoiceData.setSalesTransaction(true);
								
								InvoiceData.setDocumentType(findDALInstance(false, DocumentType.class, new Value(DocumentType.PROPERTY_DOCUMENTCATEGORY, TransactionDocument_k))); // untuk 246 (production, bukan 0 !)

								InvoiceData.setTransactionDocument(findDALInstance(false, DocumentType.class, new Value(DocumentType.PROPERTY_DOCUMENTCATEGORY, TransactionDocument_k)));

								InvoiceTest = findDALInstance(false, Invoice.class, new Value(
									 Invoice.PROPERTY_DOCUMENTNO, DocumentNo));
								/* (if (InvoiceTest != null) {
									 throw new OBException(Utility.messageBD(conn, "Document No Sudah Ada", vars.getLanguage()));
								 }  */
								InvoiceData.setDocumentNo(DocumentNo);
								
								InvoiceData.setInvoiceDate(Parameter.DATE.parse(InvoiceDate));

								InvoiceData.setAccountingDate(Parameter.DATE.parse(InvoiceDate));
								
								InvoiceData.setBusinessPartner(bpinst);
								//set Lokasi Partner
								//looping sebanyak lokasi yg ada saat mengisi location
								final OBCriteria<Location> locationList = OBDal.getInstance()
													.createCriteria(Location.class);
											locationList.add(Expression.eq(Location.PROPERTY_BUSINESSPARTNER, bp));
								for (Location location : locationList.list()) {
									InvoiceData.setPartnerAddress(findDALInstance(false, Location.class, new Value(Location.PROPERTY_ID,location.getId() )));
								}
								InvoiceData.setCurrency(findDALInstance(false, Currency.class, new Value(Currency.PROPERTY_ISOCODE, ISOCode_k )));
								
								//PaymentTerm paymentterm = findDALInstance(false, PaymentTerm.class, new Value(PaymentTerm.PROPERTY_SEARCHKEY, PaymentTerms_k ));
								InvoiceData.setPaymentTerms(findDALInstance(false, PaymentTerm.class, new Value(PaymentTerm.PROPERTY_SEARCHKEY, PaymentTerms_k )));
								
							   // FIN_PaymentMethod finpaymentmethod = findDALInstance(false, FIN_PaymentMethod.class, new Value(FIN_PaymentMethod.PROPERTY_NAME, PaymentMethod_k ));
								InvoiceData.setPaymentMethod(findDALInstance(false, FIN_PaymentMethod.class, new Value(FIN_PaymentMethod.PROPERTY_NAME, PaymentMethod_k )));
								
							   // PriceList pricelist = findDALInstance(false, PriceList.class, new Value(PriceList.PROPERTY_NAME, PriceList_k ));
								InvoiceData.setPriceList(findDALInstance(false, PriceList.class, new Value(PriceList.PROPERTY_NAME, PriceList_k )));	
								
								InvoiceData.setInvoiceDate(Parameter.DATE.parse(AccountingDate));

								//end header	

			//					flag="header telah terisi";
				//					if (count==1) {
										OBDal.getInstance().save(InvoiceData);
										OBDal.getInstance().flush();
			//						}
								//Line
								try {
								 InvoiceLine InvoiceLineData = OBProvider.getInstance().get(InvoiceLine.class);

								 InvoiceLineData.setActive(true);
								 InvoiceLineData.setOrganization(rowOrganization);
								 
								 InvoiceLineData.setInvoice(InvoiceData); //parent
								 
								 InvoiceLineData.setLineNo(Parameter.LONG.parse(LineNo));
											
									InvoiceLineData.setInvoicedQuantity(new BigDecimal(InvoicedQuantity));
									
									InvoiceLineData.setUnitPrice(new BigDecimal(UnitPrice));
									
									InvoiceLineData.setLineNetAmount(new BigDecimal(LineNetAmount));
									
									InvoiceLineData.setFinancialInvoiceLine(Parameter.BOOLEAN.parse(FinancialInvoiceLine));
									
									GLItem glitem = findDALInstance(false, GLItem.class, new Value(GLItem.PROPERTY_NAME, Account_k));
									if (glitem == null) {
										 throw new OBException(Utility.messageBD(conn, "Account Tidak Ada", vars.getLanguage()));
									 }
									InvoiceLineData.setAccount(glitem);	
									
									InvoiceLineData.setTax(findDALInstance(false, TaxRate.class, new Value(TaxRate.PROPERTY_NAME, Tax_k)));	

		//						if (count==1) {
									 OBDal.getInstance().save(InvoiceLineData);
									 OBDal.getInstance().flush();
		//						}
								 } catch (Exception e) {
									e.printStackTrace();
								 }
	
			//					count++;
		//				} // end looping Location
		} // end looping BussinessPartner
/* } catch (Exception e) {
            // catch any possible exception and throw it as a Quartz
            // JobExecutionException
            throw new JobExecutionException(e.getMessage(), e);
 } */
 // End process
 OBDal.getInstance().commitAndClose();
 
 return InvoiceData;
 }
/* ====================================================================== */ 
}
