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
import com.gai.journal.imp.data.GJImportFactAcct;

//import Year & Period
import org.openbravo.model.financialmgmt.calendar.Period;
import org.openbravo.model.financialmgmt.calendar.Year;


/**
*
* @author GAIn Team - Astri
*/
public class GJImportJournal extends IdlServiceJava {
  
  GJImportFactAcct TempFactAcct = null;
  
  String flag = "";
  private static Logger log=Logger.getLogger(GJImportFactAcct.class);
  
  @Override
  public String getEntityName() {
    return "Upload Journal to Temporary";
  }
  
  @Override
  public Parameter[] getParameters() {
    return new Parameter[] {
//	  new Parameter("lineno", Parameter.STRING), //0
      new Parameter("Organization", Parameter.STRING), //1 [Foreign Key]
      new Parameter("accountTree",Parameter.STRING), //2   [Foreign Key]        
      new Parameter("dateAcct",Parameter.STRING), //3 
      new Parameter("period", Parameter.STRING), //4
      new Parameter("year", Parameter.STRING), //5
      new Parameter("documentNo", Parameter.STRING) ,//6
      new Parameter("accountElement", Parameter.STRING) , //7
      //new Parameter("accountName", Parameter.STRING), //8                          [Foreign Key]
      new Parameter("description", Parameter.STRING), //9			                       [Foreign Key]
      new Parameter("debetAmt", Parameter.STRING), //10	
	  new Parameter("creditAmt", Parameter.STRING), //11			                       [Foreign Key] 
	  new Parameter("kodeJurnal", Parameter.STRING), //12        
	  new Parameter("noRekening", Parameter.STRING) }; //13
    }
    
    @Override
    protected Object[] validateProcess(Validator validator, String... values) throws Exception {
      //validator.checkLong(values[0]); //0
	    validator.checkOrganization(values[0]); //1
      validator.checkString(values[1], 255); //2
      validator.checkDate(values[2]);//3
      validator.checkString(values[3], 6);//4
      validator.checkString(values[4], 4);//5
      validator.checkString(values[5], 30);//6
      validator.checkString(values[6], 40);//7
      validator.checkString(values[7], 255);//8
      validator.checkString(values[8], 20);//9
	  validator.checkString(values[9], 20);//10
	  validator.checkString(values[10], 2);//11
	  validator.checkString(values[11], 40);//12
	  //validator.checkString(values[11], 255);//11
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
		(String) values[11]
	  );       
    }
 
    public BaseOBObject createTempFactAcct(
		final String Organization,
//		final String LineNo,
	    final String AccountTree, 		
	    final String DateAcct,
	    final String Period_Value,
	    final String Year_Value,
	    final String DocumentNo,
	    final String AccountElement,
	    //final String AccountName,
	    final String Description,
		final String DebetAmount,
		final String CreditAmount,
		final String KodeJurnal,
		final String NoRekening
    )
    throws Exception {
      //try { 
      final OBCriteria<Element> ElementList = OBDal.getInstance()
      .createCriteria(Element.class);
      ElementList.add(Expression.eq(Element.PROPERTY_NAME, AccountTree));
      
      for (Element elementId : ElementList.list()) {
          
        TempFactAcct = OBProvider.getInstance().get(GJImportFactAcct.class);	
        
        TempFactAcct.setActive(true);
		TempFactAcct.setOrganization(rowOrganization);
		
//		long linenumber = Long.parseLong(LineNo);
//		TempFactAcct.setLineNo(linenumber);
        TempFactAcct.setAccountTree(elementId); //C_Element_ID
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date dateAccounting = dateFormat.parse(DateAcct);
		
        TempFactAcct.setDateacct(Parameter.DATE.parse(DateAcct)); 
		//TempFactAcct.setMonthAcct(new BigDecimal(MonthAcct));
		//TempFactAcct.setYearacct(new BigDecimal(YearAcct));
        
		final OBCriteria<Period> PeriodList = OBDal.getInstance().createCriteria(Period.class);
	    PeriodList.add(Expression.eq(Period.PROPERTY_NAME, Period_Value));
		
		for (Period periodId : PeriodList.list()) {
			TempFactAcct.setPeriod(periodId);
		}
		
		final OBCriteria<Year> YearList = OBDal.getInstance().createCriteria(Year.class);
	    YearList.add(Expression.eq(Year.PROPERTY_FISCALYEAR, Year_Value));
		
		for (Year yearId : YearList.list()) {
			TempFactAcct.setYear(yearId);
		}
		
		TempFactAcct.setDocumentNo(DocumentNo);
		
		
		//get C_ElementValue_ID
		final OBCriteria<ElementValue> ElementValueList = OBDal.getInstance().createCriteria(ElementValue.class);
	    ElementValueList.add(Expression.eq(ElementValue.PROPERTY_SEARCHKEY, AccountElement));
        
        log.debug("Masuk cek ElementValueId");
        
		for (ElementValue elementValueId : ElementValueList.list()) {
          log.debug("ElementValueId : "+elementValueId.getId());
          TempFactAcct.setAccountElement(elementValueId);
        }
        //end get C_ElementValue_ID
		
		TempFactAcct.setDescription(Description);
        TempFactAcct.setDebetAmt(new BigDecimal(DebetAmount));
        TempFactAcct.setCreditAmt(new BigDecimal(CreditAmount));
        TempFactAcct.setJournalCode(KodeJurnal);
        TempFactAcct.setAccountno(NoRekening);

		OBDal.getInstance().save(TempFactAcct);
        OBDal.getInstance().flush();
		
      } // end looping Element ID
	  
    OBDal.getInstance().commitAndClose();
    
    return TempFactAcct;
  }
  
}