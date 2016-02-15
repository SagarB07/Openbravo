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
  
package com.gai.investasi.erpCommon.ad_process;

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
import org.openbravo.erpCommon.utility.DateTimeData;
//entitas

public class ApproveInv extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);

    // Get user Client's base currency
    if (vars.commandIn("DEFAULT")) {
      String strWindowId = vars.getGlobalVariable("inpwindowId", "Investasi|Window_ID");
      String strTabID = vars.getGlobalVariable("inpTabId","Investasi|Tab_ID");
      String strInvestasiLineId = vars.getRequestGlobalVariable("inpgnvInvestasiLineId", "");
      String strProcess = vars.getStringParameter("inpProcess", "");
      String strNomorSurat = vars.getStringParameter("inpNomorSurat", "");
      String strLampiran = vars.getStringParameter("inpLampiran", "");
      
      printPageDataSheet(response, vars, strInvestasiLineId, strProcess, strNomorSurat, strLampiran);

    } else if (vars.commandIn("PROCESS")) {
      String strWindowId = vars.getGlobalVariable("inpwindowId", "Investasi|Window_ID");
      String strTabID = vars.getGlobalVariable("inpTabId","Investasi|Tab_ID");
      String strInvestasiLineId = vars.getStringParameter("strInvestasiLineID", "");
      String strProcess = vars.getStringParameter("inpProcess");
      String strNomorSurat = vars.getStringParameter("inpNomorSurat", "");
      String strLampiran = vars.getStringParameter("inpLampiran", "");

      processAndClose(request, response, vars, strTabID, strInvestasiLineId, strProcess, strNomorSurat, strLampiran);
    } else
      pageError(response);
  }

  void processAndClose(HttpServletRequest request, HttpServletResponse response,
      VariablesSecureApp vars, String strTabId, String strInvestasiLineId, String strProcess, String strNomorSurat, String strLampiran) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");


      String strErrorMsg = "";
      OBError myMessage = new OBError();

      strErrorMsg = myMessage.getMessage();
      
      try {
        
            List<Object> params = new ArrayList<Object>();
            params.add(strInvestasiLineId);
            params.add(strProcess);
            params.add(strNomorSurat);
            params.add(strLampiran);
            CallStoredProcedure.getInstance().call("GNV_APPROVE_INVESTASI", params, null, true, false);
       
        //myMessage.setMessage(strInvestasiLineId);
      } catch (Exception e) {
        OBDal.getInstance().rollbackAndClose();
        log4j.info(e.getMessage());
        myMessage = Utility.translateError(this, vars, vars.getLanguage(), e.getMessage());
        throw new IllegalStateException(e);
      }

        myMessage.setTitle("Success");
        myMessage.setType("SUCCESS");
        
        myMessage.setMessage("This Record has been Process");

      vars.setMessage("11112E5A2512480B836813A44708197B", myMessage);

      printPageClosePopUpAndRefreshParent(response, vars);

  }

  void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, 
      String strInvestasiLineId, String strProcess, String strNomorSurat, String strLampiran) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");

    XmlDocument xmlDocument = null;
    xmlDocument = xmlEngine.readXmlTemplate(
        "com/gai/investasi/erpCommon/ad_process/ApproveInv").createXmlDocument();
    ToolBar toolbar = new ToolBar(this, vars.getLanguage(),
        "ApproveInv", false, "", "", "", false, "ad_reports",
        strReplaceWith, false, true);
    toolbar.prepareSimpleToolBarTemplate();
    xmlDocument.setParameter("toolbar", toolbar.toString());
    try {
      WindowTabs tabs = new WindowTabs(this, vars,
          "com.gai.investasi.erpCommon.ad_process.ApproveInv");
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      xmlDocument.setParameter("theme", vars.getTheme());
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(),
          "ApproveInv.html", classInfo.id, classInfo.type, strReplaceWith, tabs
              .breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "ApproveInv.html",
          strReplaceWith);
      xmlDocument.setParameter("leftTabs", lBar.manualTemplate());
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
    {
      OBError myMessage = vars.getMessage("ApproveInv");
      vars.removeMessage("ApproveInv");
      if (myMessage != null) {
        xmlDocument.setParameter("messageType", myMessage.getType());
        xmlDocument.setParameter("messageTitle", myMessage.getTitle());
        xmlDocument.setParameter("messageMessage", myMessage.getMessage());
      }
    }

    xmlDocument.setParameter("paramLanguage", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");

    xmlDocument.setParameter("title", "Process Approve Investasi");      

    xmlDocument.setParameter("strInvestasiLineID", strInvestasiLineId);
    xmlDocument.setParameter("strProcess", strProcess);
    xmlDocument.setParameter("strNomorSurat", strNomorSurat);
    xmlDocument.setParameter("strLampiran", strLampiran);
    
    try {
      String Movement_Type_Reference_ID = "15D2E238E2704A0EBF3A23CCAC4288EE";
      ComboTableData comboTableData = new ComboTableData(vars, this, "LIST", "",
          Movement_Type_Reference_ID, "", Utility.getContext(this, vars,
              "#AccessibleOrgTree", "ApproveInv"), Utility.getContext(this, vars,
              "#User_Client", "ApproveInv"), 0);
      Utility.fillSQLParameters(this, vars, null, comboTableData, "ApproveInv", "");
      xmlDocument.setData("reportStatusInvestasi", "liststructure", comboTableData.select(false));
      comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }




    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(xmlDocument.print());
    out.close();
  }

  public String getServletInfo() {
    return "Servlet Investasi. This Servlet was made by GAI Team";
  } // end of getServletInfo() method
}
