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
 import org.openbravo.erpCommon.utility.Utility;
 import org.openbravo.idl.proc.Value;
 import org.openbravo.module.idljava.proc.IdlServiceJava;
 //import com.gai.module.data.DataDiri;
 import org.openbravo.model.mrp.SalesForecast;
 import org.openbravo.model.mrp.SalesForecastLine;
// import BP
 import org.openbravo.model.common.businesspartner.BusinessPartner;
//import Product
 import org.openbravo.model.common.plm.Product;

 /**
 *
 * @author Mochamad Fachmi Rizal - GAI
 */
 public class SalesForeCastProcess extends IdlServiceJava {
 
 SalesForecast salesForecastGeneral = null;
 SalesForecast salesForecastData = null;
 String flag = "";
 private static Logger log=Logger.getLogger(SalesForeCastProcess.class);
 
 @Override
 public String getEntityName() {
 return "Simple Sales Fore Cast";
 }
 
 @Override
 public Parameter[] getParameters() {
 return new Parameter[] {
//Header
 new Parameter("Organization", Parameter.STRING), //0
 new Parameter("DocumentDate", Parameter.STRING), //1
 new Parameter("BusinessPartner", Parameter.STRING), //2
//Line
 new Parameter("PlannedDate", Parameter.STRING), //3
 new Parameter("Product", Parameter.STRING), //4
 new Parameter("Quantity", Parameter.STRING) }; //5
 }
 
 @Override
 protected Object[] validateProcess(Validator validator, String... values) throws Exception {
 validator.checkOrganization(values[0]);
 validator.checkDate(values[1]);
 validator.checkString(values[2], 255);
//
 validator.checkDate(values[3]);
 validator.checkString(values[4], 255);
 validator.checkBigDecimal(values[5]);
 return values;
 }


@Override
 public BaseOBObject internalProcess(Object... values) throws Exception {
	 return createSalesForeCast((String) values[0], (String) values[1], (String) values[2],(String) values[3], (String) values[4],(String) 		values[5]);       
}

/* ====================================================================== */
 // create SalesForeCast
 public BaseOBObject createSalesForeCast(final String Organization, final String DocumentDate, final String BusinessPartner_k,final String PlannedDate, final String Product_k, final String Quantity)
 throws Exception {
 
 // Header

 //dapatkan DAL business partner
 BusinessPartner bpinst = findDALInstance(false, BusinessPartner.class, new Value(
          BusinessPartner.PROPERTY_SEARCHKEY, BusinessPartner_k));
if (flag == "") {
	salesForecastData = OBProvider.getInstance().get(SalesForecast.class);	

	salesForecastData.setActive(true);
	salesForecastData.setOrganization(rowOrganization); //0

	salesForecastData.setDocumentDate(Parameter.DATE.parse(DocumentDate)); //1
	salesForecastData.setBusinessPartner(bpinst); //2
	

	flag="header telah terisi";
	OBDal.getInstance().save(salesForecastData);
	OBDal.getInstance().flush();
}
//Line
try {
 SalesForecastLine salesForecastLineData = OBProvider.getInstance().get(SalesForecastLine.class);

 salesForecastLineData.setActive(true);
 salesForecastLineData.setOrganization(rowOrganization);
 
 salesForecastLineData.setSalesForecast(salesForecastData); //parent
 salesForecastLineData.setPlannedDate(Parameter.DATE.parse(PlannedDate)); //3 
 salesForecastLineData.setProduct(findDALInstance(false, Product.class, new Value("searchKey", Product_k))); //4 true
 salesForecastLineData.setQuantity(new BigDecimal(Quantity)); //5


 OBDal.getInstance().save(salesForecastLineData);
 OBDal.getInstance().flush();

 } catch (Exception e) {
 e.printStackTrace();
 }
 // End process
 OBDal.getInstance().commitAndClose();
 
 this.salesForecastGeneral = null;
 return salesForecastData;
 }
/* ====================================================================== */ 
}
