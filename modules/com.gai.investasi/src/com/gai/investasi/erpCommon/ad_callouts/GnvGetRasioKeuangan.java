// the package name corresponds to the module's manual code folder 
// created above
package com.gai.investasi.erpCommon.ad_callouts;
 
import javax.servlet.ServletException;
 
import org.openbravo.utils.FormatUtilities;
import org.openbravo.erpCommon.ad_callouts.SimpleCallout;
import org.openbravo.base.secureApp.VariablesSecureApp;
// classes required to retrieve product category data from the 
// database using the DAL
import org.openbravo.dal.service.OBDal;
import org.openbravo.model.common.plm.ProductCategory;
import java.math.*;
 
// the name of the class corresponds to the filename that holds it 
// hence, modules/modules/org.openbravo.howtos/src/org/openbravo/howtos/ad_callouts/ProductConstructSearchKey.java.
// The class must extend SimpleCallout
public class GnvGetRasioKeuangan extends SimpleCallout {
 
  private static final long serialVersionUID = 1L;
 
  @Override
  protected void execute(CalloutInfo info) throws ServletException {

    String hasilCar = "";
    String hasilNpl = "";
    String hasilLdr = "";
    String hasilBiRate = "";
    String hasilLpsRate = "";
    String hasilYear = "";
    String hasilTotalAset = "";
    // parse input parameters here; the names derive from the column
    // names of the table prepended by inp and stripped of all
    // underscore characters; letters following the underscore character
    // are capitalized; this way a database column named
    // M_PRODUCT_CATEGORY_ID that is shown on a tab will become
    // inpmProductCategoryId html field
    String cBpartnerId = info.getStringParameter("inpcBpartnerId", null);
    String tglAwal = info.getStringParameter("inptanggalawal", null);

    GnvGetRasioKeuanganData[] data = GnvGetRasioKeuanganData.select(this, cBpartnerId, tglAwal);
    

    if (data != null && data.length > 0) {
      hasilCar =data[0].car;
      hasilLdr =data[0].ldr;
      hasilNpl =data[0].npl;
      hasilLpsRate =data[0].lpsrate;
      hasilBiRate =data[0].birate;
      hasilTotalAset =data[0].totalaset;
    }

    info.addResult("inpcar",hasilCar);
    info.addResult("inpnpl",hasilNpl);
    info.addResult("inpldr",hasilLdr);
    info.addResult("inpbi",hasilBiRate);
    info.addResult("inplps",hasilLpsRate);
    info.addResult("inptotalasset",hasilTotalAset);
    
}
}
