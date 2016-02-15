// the package name corresponds to the module's manual code folder 
// created above
package com.gai.procurement.persetujuan.erpCommon.ad_callouts;
 
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
import java.math.*;
// the name of the class corresponds to the filename that holds it 
// hence, modules/modules/org.openbravo.howtos/src/org/openbravo/howtos/ad_callouts/ProductConstructSearchKey.java.
// The class must extend SimpleCallout
public class GppGetDiskon  extends SimpleCallout {
 
  private static final long serialVersionUID = 1L;
 
  @Override
  protected void execute(CalloutInfo info) throws ServletException {
    BigDecimal nethargapenawaran;
    BigDecimal nethargapenawaranakhir;

    // parse input parameters here; the names derive from the column
    // names of the table prepended by inp and stripped of all
    // underscore characters; letters following the underscore character
    // are capitalized; this way a database column named
    // M_PRODUCT_CATEGORY_ID that is shown on a tab will become
    // inpmProductCategoryId html field
   //String diskon = info.getStringParameter("inpcBpartnerId", null);
   //String hargapenawaran = info.getStringParameter("inpgppPerspembelianId", null);
    
     String swapdiskon = info.getStringParameter("inpdiskon",null).replaceAll(",", "");
     String swaphargapenawaran = info.getStringParameter("inphargapenawaran",null).replaceAll(",", "");
     BigDecimal diskon = new BigDecimal(swapdiskon);
     BigDecimal hargapenawaran = new BigDecimal(swaphargapenawaran);

     if (diskon.compareTo(BigDecimal.ZERO)==1 ){
          nethargapenawaran = (diskon.divide(new BigDecimal (100)).multiply(hargapenawaran));
          nethargapenawaranakhir= hargapenawaran.subtract(nethargapenawaran);
     }else{
          nethargapenawaranakhir = hargapenawaran;
     }
         
     info.addResult("inpnethargapenawaran",nethargapenawaranakhir);
    
    //info.addResult("inpstatus",tag);
  
}
}
