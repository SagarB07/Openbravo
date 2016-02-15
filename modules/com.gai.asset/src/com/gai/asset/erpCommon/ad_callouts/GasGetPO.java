// the package name corresponds to the module's manual code folder 
// created above
package com.gai.asset.erpCommon.ad_callouts;
 
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
public class GasGetPO extends SimpleCallout {
 
  private static final long serialVersionUID = 1L;
 
  @Override
  protected void execute(CalloutInfo info) throws ServletException {

    String assetvalue = "";
    String product ="";
    String tglpurchase ="";
    String depreciationamt = "";
    
    // parse input parameters here; the names derive from the column
    // names of the table prepended by inp and stripped of all
    // underscore characters; letters following the underscore character
    // are capitalized; this way a database column named
    // M_PRODUCT_CATEGORY_ID that is shown on a tab will become
    // inpmProductCategoryId html field
    String cOrderlineId = info.getStringParameter("inpemGasOrderlineId", null);

    GasGetPOData[] data = GasGetPOData.select(this, cOrderlineId);


    if (data != null && data.length > 0) {
      assetvalue=data[0].assetvalue;
      product = data[0].product;
      tglpurchase = data[0]. tanggal;
      depreciationamt =data[0].assetvalue;  
    }
    info.addResult("inpassetvalueamt",assetvalue);
    info.addResult("inpmProductId",product);
    info.addResult("inpdatepurchased",tglpurchase);
    info.addResult("inpemGasTglmove",tglpurchase);
    info.addResult("inpassetvalueamt",depreciationamt);
    
}
}
