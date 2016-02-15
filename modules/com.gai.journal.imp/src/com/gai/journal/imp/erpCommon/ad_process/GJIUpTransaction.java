package com.gai.journal.imp.erpCommon.ad_process;

import org.openbravo.idl.proc.Parameter;
import org.openbravo.idl.proc.Validator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
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
//impot C_Element
import org.openbravo.model.financialmgmt.accounting.coa.Element;
import org.openbravo.model.financialmgmt.accounting.coa.ElementValue;

//import GJI_FactAcct
import com.gai.journal.imp.data.GJITransaction;
import com.gai.journal.imp.data.GJITransactionDetail;

//import Year & Period
import org.openbravo.model.financialmgmt.calendar.Period;
import org.openbravo.model.financialmgmt.calendar.Year;

//import AcctSchema
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;

/**
*
* @author GAIn Team - Astri
*/
public class GJIUpTransaction extends IdlServiceJava {
  
  GJITransaction TempFactAcct = null;
  GJITransactionDetail TempFactAcctDetail = null;
  GJITransaction transactionId = null;
  
  String flag = "";
  private static Logger log=Logger.getLogger(GJITransaction.class);
  
  @Override
  public String getEntityName() {
    return "Upload Journal to Temporary";
  }
  
  @Override
  public Parameter[] getParameters() {
    return new Parameter[] {
      new Parameter("Organization", Parameter.STRING), //1 [Foreign Key]
      new Parameter("acctSchema",Parameter.STRING), //2   [Foreign Key]        
      new Parameter("elementId",Parameter.STRING), //3   [Foreign Key]        
      new Parameter("dateAcct",Parameter.STRING), //4
      new Parameter("period", Parameter.STRING), //5
      new Parameter("year", Parameter.STRING), //6
      new Parameter("documentNo", Parameter.STRING) ,//7
      new Parameter("accountValue", Parameter.STRING) , //8
      new Parameter("accountName", Parameter.STRING), //9
      new Parameter("description", Parameter.STRING), //10		[Foreign Key]
      new Parameter("debetAmt", Parameter.STRING), //11
	  new Parameter("creditAmt", Parameter.STRING), //12		[Foreign Key] 
	  new Parameter("kodeJurnal", Parameter.STRING), //13        
	  new Parameter("noRekening", Parameter.STRING), //14
	  new Parameter("descline", Parameter.STRING) }; //15
	  //new Parameter("accValue", Parameter.STRING) }, //16
	  
    }
    
    @Override
    protected Object[] validateProcess(Validator validator, String... values) throws Exception {
    	//validator.checkLong(values[0]); //0
		validator.checkOrganization(values[0]); //1
	    validator.checkString(values[1], 255); //2
	    validator.checkString(values[2], 255);//3
	    validator.checkDate(values[3]);//4
	    validator.checkString(values[4], 6);//5
	    validator.checkString(values[5], 4);//6
	    validator.checkString(values[6], 30);//7
	    validator.checkString(values[7], 40);//8
	    validator.checkString(values[8], 100);//9
	    validator.checkString(values[9], 255);//10
	    validator.checkString(values[10], 20);//11
		validator.checkString(values[11], 20);//12
		validator.checkString(values[12], 2);//13
		validator.checkString(values[13], 40);//14
		validator.checkString(values[14], 255);//15
		
		//validator.checkString(values[15], 100);//16
	    return values;
    }
    
    
    @Override
    public BaseOBObject internalProcess(Object... values) throws Exception {
      return createTempFactAcct(
	  	(String) values[0], 
		(String) values[1], 
		(String) values[2],
		(String) values[3], 
		(String) values[4],
		(String) values[5],
		(String) values[6], 
		(String) values[7], 
		(String) values[8],
		(String) values[9],
		(String) values[10],
		(String) values[11],
		(String) values[12],
		(String) values[13],
		(String) values[14]
		//(String) values[15]
	  );       
    }
 
    public BaseOBObject createTempFactAcct(
		final String Organization,
	    final String AcctSchema_ID, 
	    final String Element_ID, 		
	    final String DateAcct,
	    final String Period_Value,
	    final String Year_Value,
	    final String DocumentNo,
	    final String AccountElement,
		final String AccountName,
	    final String Description,
		final String DebetAmount,
		final String CreditAmount,
		final String KodeJurnal,
		final String NoRekening,
		final String DescLine
		//final String AccValue,
    )
    throws Exception {
      	TempFactAcct = OBProvider.getInstance().get(GJITransaction.class);
      	TempFactAcctDetail = OBProvider.getInstance().get(GJITransactionDetail.class);	

      	String action = "";
      	String strDocumentNo = "";
      	Integer documentNoCount = 0;

      	/*String hql = "SELECT count(*)  "
			 +"FROM GJI_Transaction gt";

		Query query = OBDal.getInstance().getSession().createQuery(hql);

		log.debug("Query : "+query.toString());*/

      	//transactionId = findDALInstance(false, GJITransaction.class, new Value("documentNo", DocumentNo));
		transactionId = findDALInstance(false, GJITransaction.class, new Value("description", Description));

      	if (transactionId == null) {
	        action = "header";
	    } else {
	        action = "line";
	    }

	    final OBCriteria<Element> ElementList = OBDal.getInstance().createCriteria(Element.class);
		ElementList.add(Expression.eq(Element.PROPERTY_NAME, Element_ID));

        if (action.equals("header")) {
        	TempFactAcct.setActive(true);
			TempFactAcct.setOrganization(rowOrganization);
			final OBCriteria<Year> YearList = OBDal.getInstance().createCriteria(Year.class);
		    YearList.add(Expression.eq(Year.PROPERTY_FISCALYEAR, Year_Value));
			for (Year yearId : YearList.list()) {
				TempFactAcct.setYear(yearId);
			}

			//documentNoCount = query

			TempFactAcct.setDocumentNo(DocumentNo);
			TempFactAcct.setDescription(Description);
			TempFactAcct.setJournalCode(KodeJurnal);
	        TempFactAcct.setAccountNo(NoRekening);
	        for (Element elementId : ElementList.list()) {
				TempFactAcct.setElement(elementId);
	        }

	        OBDal.getInstance().save(TempFactAcct);
	        OBDal.getInstance().flush();

	        TempFactAcctDetail.setGJITransaction(TempFactAcct);

	        final OBCriteria<AcctSchema> AccList = OBDal.getInstance().createCriteria(AcctSchema.class);
	      	AccList.add(Expression.eq(AcctSchema.PROPERTY_NAME, AcctSchema_ID));
			for (AcctSchema ledgerId : AccList.list()) {
	        	TempFactAcctDetail.setGeneralLedger(ledgerId);
			} // end looping AcctSchema
			
			final OBCriteria<Period> PeriodList = OBDal.getInstance().createCriteria(Period.class);
			PeriodList.add(Expression.eq(Period.PROPERTY_NAME, Period_Value));
			for (Period periodId : PeriodList.list()) {
				TempFactAcctDetail.setPeriod(periodId);
			}
		        
			for (Element elementId : ElementList.list()) {
				//TempFactAcct.setElement(elementId);
				
				//get C_ElementValue_ID
				final OBCriteria<ElementValue> ElementValueList = OBDal.getInstance().createCriteria(ElementValue.class);
			    ElementValueList.add(Expression.eq(ElementValue.PROPERTY_SEARCHKEY, AccountElement));
			    ElementValueList.add(Expression.eq(ElementValue.PROPERTY_ACCOUNTINGELEMENT, elementId));
			       
			    log.debug("Masuk cek ElementValueId");
			        
				for (ElementValue elementValueId : ElementValueList.list()) {
			      log.debug("ElementValueId : "+elementValueId.getId());
			      TempFactAcctDetail.setAccount(elementValueId);
			    }
		    } //end C_ElementValue

			TempFactAcctDetail.setDateAcct(Parameter.DATE.parse(DateAcct)); 
		    TempFactAcctDetail.setDebet(new BigDecimal(DebetAmount));
		    TempFactAcctDetail.setCredit(new BigDecimal(CreditAmount));
		    TempFactAcctDetail.setDescription(DescLine);
		    TempFactAcctDetail.setAccountValue(AccountElement);
		    TempFactAcctDetail.setAccountName(AccountName);
	        
	        OBDal.getInstance().save(TempFactAcctDetail);
	        OBDal.getInstance().flush();
	        
        } else {
        	TempFactAcctDetail.setGJITransaction(transactionId);

        	TempFactAcct.setActive(true);
			TempFactAcct.setOrganization(rowOrganization);

        	final OBCriteria<AcctSchema> AccList = OBDal.getInstance().createCriteria(AcctSchema.class);
	      	AccList.add(Expression.eq(AcctSchema.PROPERTY_NAME, AcctSchema_ID));
			for (AcctSchema ledgerId : AccList.list()) {
				TempFactAcctDetail.setGeneralLedger(ledgerId); 
			}
			
			final OBCriteria<Period> PeriodList = OBDal.getInstance().createCriteria(Period.class);
			PeriodList.add(Expression.eq(Period.PROPERTY_NAME, Period_Value));
			for (Period periodId : PeriodList.list()) {
				TempFactAcctDetail.setPeriod(periodId);
			}
			
			for (Element elementId : ElementList.list()) {

				final OBCriteria<ElementValue> ElementValueList = OBDal.getInstance().createCriteria(ElementValue.class);
			    ElementValueList.add(Expression.eq(ElementValue.PROPERTY_SEARCHKEY, AccountElement));
			    ElementValueList.add(Expression.eq(ElementValue.PROPERTY_ACCOUNTINGELEMENT, elementId));
			        
			    log.debug("Masuk cek ElementValueId");
			        
				for (ElementValue elementValueId : ElementValueList.list()) {
			      log.debug("ElementValueId : "+elementValueId.getId());
			      TempFactAcctDetail.setAccount(elementValueId);
			    }
			}
			
			TempFactAcctDetail.setDateAcct(Parameter.DATE.parse(DateAcct)); 
		    TempFactAcctDetail.setDebet(new BigDecimal(DebetAmount));
		    TempFactAcctDetail.setCredit(new BigDecimal(CreditAmount));
		    TempFactAcctDetail.setDescription(DescLine);
		    TempFactAcctDetail.setAccountValue(AccountElement);
		    TempFactAcctDetail.setAccountName(AccountName);

	        OBDal.getInstance().save(TempFactAcctDetail);
	        OBDal.getInstance().flush();
        }

    OBDal.getInstance().commitAndClose();
    
    return TempFactAcct;
  }
  
}