// the package name corresponds to the module's manual code folder 
// created above
package com.gai.procurement.erpCommon.ad_callouts;
 
import javax.servlet.ServletException;
 
import org.openbravo.utils.FormatUtilities;
import org.openbravo.erpCommon.ad_callouts.SimpleCallout;
import org.openbravo.base.secureApp.VariablesSecureApp;
// classes required to retrieve product category data from the 
// database using the DAL
import org.openbravo.dal.service.OBDal;
import org.openbravo.model.common.plm.ProductCategory;
 
// the name of the class corresponds to the filename that holds it 
// hence, modules/modules/org.openbravo.howtos/src/org/openbravo/howtos/ad_callouts/ProductConstructSearchKey.java.
// The class must extend SimpleCallout
public class GprGetDepartment extends SimpleCallout {
 
  private static final long serialVersionUID = 1L;
 
  @Override
  protected void execute(CalloutInfo info) throws ServletException {

    String hasildepartment = "";
    
    String adUserId = info.getStringParameter("inpadUserId", null);

    GprGetDepartmentData[] data = GprGetDepartmentData.select(this, adUserId);
    
    if (data != null && data.length > 0) {
      hasildepartment=data[0].departmentid;
    }
    info.addResult("inpemGmmMasterDepartmentId",hasildepartment);
}
}
