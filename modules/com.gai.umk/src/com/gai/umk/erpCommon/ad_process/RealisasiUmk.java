/*
     2  *************************************************************************
     3  * The contents of this file are subject to the Openbravo  Public  License
     4  * Version  1.0  (the  "License"),  being   the  Mozilla   Public  License
     5  * Version 1.1  with a permitted attribution clause; you may not  use this
     6  * file except in compliance with the License. You  may  obtain  a copy of
     7  * the License at http://www.openbravo.com/legal/license.html
     8  * Software distributed under the License  is  distributed  on  an "AS IS"
     9  * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
    10  * License for the specific  language  governing  rights  and  limitations
    11  * under the License.
    12  * The Original Code is Openbravo ERP.
    13  * The Initial Developer of the Original Code is Openbravo SL
    14  * All portions are Copyright (C) 2001-2008 Openbravo SL
    15  * All Rights Reserved.
    16  * Contributor(s):  ______________________________________.
    17  ************************************************************************
    18  */
package com.gai.umk.erpCommon.ad_process;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.hibernate.criterion.Restrictions;

import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.data.FieldProvider;
import org.openbravo.erpCommon.utility.FieldProviderFactory;
import org.openbravo.erpCommon.businessUtility.WindowTabs;
import org.openbravo.erpCommon.utility.ComboTableData;
import org.openbravo.erpCommon.utility.LeftTabsBar;
import org.openbravo.erpCommon.utility.NavigationBar;
import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.ToolBar;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.xmlEngine.XmlDocument;
import org.openbravo.dal.service.OBDal;
import org.openbravo.dal.core.DalUtil;
import org.openbravo.dal.core.OBContext;
import org.openbravo.base.exception.OBException;
import org.openbravo.base.provider.OBProvider;
import org.openbravo.service.db.CallStoredProcedure;
//entitas

public class RealisasiUmk extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);

    // Get user Client's base currency
    if (vars.commandIn("DEFAULT")) {
      String strWindowId = vars.getGlobalVariable("inpwindowId", "Uang Muka Kerja|Window_ID");
      String strTabId = vars.getGlobalVariable("inpTabId","Uang Muka Kerja|Tab_ID");
      String strUmkId = vars.getRequestGlobalVariable("inpgumkUmkId", "");
      String strNominalPengajuan = vars.getRequestGlobalVariable("inpnominalPenjaguannUmk", "");
      String strTotalAmountRealisasi = vars.getRequestGlobalVariable("inptotAmountRealisasi", "");
      String strIsin = vars.getRequestGlobalVariable("inpIsin", "");
      
      //strNominalPengajuan" id="paramNominalPengajuan" value=""/>  
      //<input type="hidden" name="strTotalAmountRealisasi

      printPageDataSheet(response, vars, strUmkId,strNominalPengajuan, strTotalAmountRealisasi ,strIsin);

    } else if (vars.commandIn("PROCESS")) {
      String strWindowId = vars.getGlobalVariable("inpwindowId", "Uang Muka Kerja|Window_ID");
      String strTabId = vars.getGlobalVariable("inpTabId","Uang Muka Kerja|Tab_ID");
      String strUmkId = vars.getStringParameter("strUmkID", "");
      String strIsin = vars.getRequestGlobalVariable("inpIsin", "");
      
      processAndClose(request, response, vars, strTabId, strUmkId, strIsin);
    } else
      pageError(response);
  }

  void processAndClose(HttpServletRequest request, HttpServletResponse response,
      VariablesSecureApp vars, String strTabId, String strUmkId, String strIsin) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");


      String strErrorMsg = "";
      OBError myMessage = new OBError();

      strErrorMsg = myMessage.getMessage();
      
      try {
        List<Object> params = new ArrayList<Object>();
        String strOut = "";
        params.add(strUmkId);
        params.add(strIsin);
        params.add(strOut);
        CallStoredProcedure.getInstance().call("GUMK_REALISASI_BTN_JAVA", params, null, true, false);

        myMessage.setTitle("Success!");
        myMessage.setType("SUCCESS");
        
        //myMessage.setMessage("This Record has been Realisation");
        myMessage.setMessage(strOut);
        //myMessage.setMessage(strUmkId);
      } catch (Exception e) {
        OBDal.getInstance().rollbackAndClose();
        log4j.info(e.getMessage());
        myMessage = Utility.translateError(this, vars, vars.getLanguage(), e.getMessage());
        throw new IllegalStateException(e);
      }

      vars.setMessage("D19722629D7C4798BB884F703BE8F32F", myMessage);

      printPageClosePopUpAndRefreshParent(response, vars);

  }

  void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, 
      String strUmkId,String strNominalPengajuan,String strTotalAmountRealisasi, String strIsin) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");

    XmlDocument xmlDocument = null;
    xmlDocument = xmlEngine.readXmlTemplate(
        "com/gai/umk/erpCommon/ad_process/RealisasiUmk").createXmlDocument();
    ToolBar toolbar = new ToolBar(this, vars.getLanguage(),
        "RealisasiUmk", false, "", "", "", false, "ad_reports",
        strReplaceWith, false, true);
    toolbar.prepareSimpleToolBarTemplate();
    xmlDocument.setParameter("toolbar", toolbar.toString());
    try {
      WindowTabs tabs = new WindowTabs(this, vars,
          "com.gai.umk.erpCommon.ad_process.RealisasiUmk");
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      xmlDocument.setParameter("theme", vars.getTheme());
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(),
          "RealisasiUmk.html", classInfo.id, classInfo.type, strReplaceWith, tabs
              .breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "RealisasiUmk.html",
          strReplaceWith);
      xmlDocument.setParameter("leftTabs", lBar.manualTemplate());
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
    {
      OBError myMessage = vars.getMessage("RealisasiUmk");
      vars.removeMessage("RealisasiUmk");
      if (myMessage != null) {
        xmlDocument.setParameter("messageType", myMessage.getType());
        xmlDocument.setParameter("messageTitle", myMessage.getTitle());
        xmlDocument.setParameter("messageMessage", myMessage.getMessage());
      }
    }

    xmlDocument.setParameter("paramLanguage", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");

    xmlDocument.setParameter("title", "Realisasi Uang Muka Kerja");      

    xmlDocument.setParameter("strUmkId", strUmkId);
    xmlDocument.setParameter("strNominalPengajuan", strNominalPengajuan);
    xmlDocument.setParameter("strTotalAmountRealisasi", strTotalAmountRealisasi);

    xmlDocument.setParameter("strIsin", strIsin);
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(xmlDocument.print());
    out.close();
  }

  public String getServletInfo() {
    return "Servlet Investasi. This Servlet was made by GAI Team";
  } // end of getServletInfo() method
}
