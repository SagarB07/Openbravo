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
import java.util.*; 
import java.text.*;
// the name of the class corresponds to the filename that holds it 
// hence, modules/modules/org.openbravo.howtos/src/org/openbravo/howtos/ad_callouts/ProductConstructSearchKey.java.
// The class must extend SimpleCallout
public class GasGetStatusAsset  extends SimpleCallout {
 
  private static final long serialVersionUID = 1L;
 
  @Override
  protected void execute(CalloutInfo info) throws ServletException {
    String hasiltanggalakhir="";
    String hasilstatusasset = "";
    Date tanggal;
    Date tag;
    
    // parse input parameters here; the names derive from the column
    // names of the table prepended by inp and stripped of all
    // underscore characters; letters following the underscore character
    // are capitalized; this way a database column named
    // M_PRODUCT_CATEGORY_ID that is shown on a tab will become
    // inpmProductCategoryId html field
   String aAssetId = info.getStringParameter("inpaAssetId", null);
   GasGetStatusAssetData[] data = GasGetStatusAssetData.select(this, aAssetId);
   
    if (data != null && data.length > 0) {
      hasiltanggalakhir=data[0].tanggalakhir;
    }
          String tanggalmaintenance = info.getStringParameter("inprequestdate", null);

        try{
          SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
          java.util.Date date1 = sdf.parse(hasiltanggalakhir);
          java.util.Date date2 = sdf.parse(tanggalmaintenance);

          //System.out.println(sdf.format(date1));
          //System.out.println(sdf.format(date2));
          
          if(date1.before(date2)){
            hasilstatusasset = "Masa Garansi Sudah Habis";
          }
          
          else{
            hasilstatusasset = "Masih Dalam Masa Garansi";
          }
          
          //if(date1.equals(date2)){
          //  System.out.println("Date1 is equal Date2");
          //}
          
      }catch(ParseException ex){
        ex.printStackTrace();
        }
    info.addResult("inpstatus",hasilstatusasset);
    
    //info.addResult("inpstatus",tag);
  
}
}
