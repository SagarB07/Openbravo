/*
     2  *************************************************************************
     3  * The contents of this file are subject to the Openbravo  Public  License
     4  * Version  1.0  (the  "License"),  being   the  Mozilla   Public  License
     5  * Version 1.1  with a permitted attribution clause; you may not  use this
     6  * file except in compliance with the License. You  may  obtain  a copy of
     7  * the License at http://www.openbravo.com/legal/license.html
     8  * Software distributed under 
    the License  is  distributed  on  an "AS IS"
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
package com.gai.asset.erpCommon.ad_process;

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
import org.openbravo.erpCommon.utility.DateTimeData;
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

public class AssetPossition extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);

    // Get user Client's base currency
    if (vars.commandIn("DEFAULT")) {
      String strWindowId = vars.getGlobalVariable("inpwindowId", "Assets|Window_ID");
      String strTabID = vars.getGlobalVariable("inpTabId","Assets|Tab_ID");
      String strOrg = vars.getRequestGlobalVariable("inpadOrgId", "");
      String strAssetID = vars.getStringParameter("inpaAssetId", "");
      String strDate = vars.getStringParameter("inpDateFrom", 
             DateTimeData.today(this));
      String strMovement = vars.getStringParameter("inpProcess", "");
      String strProduct = vars.getStringParameter("inpmProductId", "");
      String strLocator = vars.getStringParameter("inpmLocatorId", "");
      //String strPIC = vars.getStringParameter("inpemGasNamapemegang", "");

      printPageDataSheet(response, vars, strOrg,strAssetID,strDate, strMovement, strProduct);

    } else if (vars.commandIn("PROCESS")) {
      String strWindowId = vars.getGlobalVariable("inpwindowId", "Assets|Window_ID");
      String strTabID = vars.getGlobalVariable("inpTabId","Assets|Tab_ID");
      String strAssetID = vars.getStringParameter("strAssetID", "");
      String strGmmMasterDepartmentId = vars.getStringParameter("inpGmmMasterDepartmentId");
      String strDate = vars.getStringParameter("inpDateFrom");
      String strMovement = vars.getStringParameter("inpProcess");
      String strBusinesspartner = vars.getStringParameter("inpcBPartnerId");
      String strTax = vars.getStringParameter("inpcTaxId");
      String strPriceList = vars.getStringParameter("inpmPriceListId"); 
      String strLocator = vars.getStringParameter("inpLocatorId");
      String strPIC = vars.getStringParameter("inpAdUserId");
      String strNetUnitPrice = vars.getStringParameter("inpNetUnitPrice");

      processAndClose(request, response, vars, strTabID, strAssetID,strGmmMasterDepartmentId, strDate, strMovement,strBusinesspartner
        ,strTax, strPriceList,strLocator, strPIC, strNetUnitPrice);
    } else
      pageError(response);
  }

  void processAndClose(HttpServletRequest request, HttpServletResponse response,
      VariablesSecureApp vars, String strTabId, String strAssetID,
      String strGmmMasterDepartmentId, String strDate, String strMovement, String strBusinesspartner, 
      String strTax, String strPriceList, String strLocator, String strPIC, String strNetUnitPrice) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");

      String strErrorMsg = "";
      OBError myMessage = new OBError();

      strErrorMsg = myMessage.getMessage();
      
      try {
        
        
        if (strMovement.equals("PD")) {
            List<Object> params = new ArrayList<Object>();
            String p_Result = null;

            params.add(strAssetID);
            params.add(strGmmMasterDepartmentId);
            params.add(strDate);
            params.add(strMovement);
            params.add(strPIC);
            params.add(p_Result);
            CallStoredProcedure.getInstance().call("GAS_ASSET_POSSITION_JAVA", params, null, true, false);

            myMessage.setTitle("Success");
            myMessage.setType("SUCCESS");
            myMessage.setMessage(p_Result);

        } else if (strMovement.equals("LG")|| strMovement.equals("JL")) {
            List<Object> params = new ArrayList<Object>();
            String p_Result = null;

            params.add(strAssetID);
            params.add(strDate);
            params.add(strMovement);
            params.add(strBusinesspartner);
            params.add(strTax);
            params.add(strPriceList);
            params.add(strLocator);
            params.add(strNetUnitPrice);
            params.add(p_Result);

            CallStoredProcedure.getInstance().call("GAS_LELANGJUAL_JAVA", params, null, true, false);

            myMessage.setTitle("Success");
            myMessage.setType("SUCCESS");
            myMessage.setMessage(p_Result);

        } else if (strMovement.equals("WO")  || strMovement.equals("H")){
            List<Object> params = new ArrayList<Object>();
            String p_Result = null;
            params.add(strAssetID);
            params.add(strDate);
            params.add(strMovement);
            params.add(strLocator);
            params.add(p_Result);

            CallStoredProcedure.getInstance().call("GAS_WRITEOFF_ASSET", params, null, true, false);   

            myMessage.setTitle("Success");
            myMessage.setType("SUCCESS");
            myMessage.setMessage(p_Result);
        }
        else {
        	myMessage.setTitle("Error");
	      	myMessage.setType("ERROR");
	      	myMessage.setMessage("Procedure Can't be Found");
        }

      } catch (Exception e) {
        OBDal.getInstance().rollbackAndClose();
        log4j.info(e.getMessage());
        myMessage = Utility.translateError(this, vars, vars.getLanguage(), e.getMessage());
        throw new IllegalStateException(e);
      }

      //OBDal.getInstance().commitAndClose();

      /*myMessage.setTitle("Success");
      myMessage.setType("SUCCESS");
      myMessage.setMessage("Asset has been processed");
      */
      vars.setMessage("800078", myMessage);

      printPageClosePopUpAndRefreshParent(response, vars);

  }

  void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, 
      String strOrg, String strAsset, String strDate, String strMovement, String strProduct) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");

    XmlDocument xmlDocument = null;
    xmlDocument = xmlEngine.readXmlTemplate(
        "com/gai/asset/erpCommon/ad_process/AssetPossition").createXmlDocument();
    ToolBar toolbar = new ToolBar(this, vars.getLanguage(),
        "AssetPossition", false, "", "", "", false, "ad_reports",
        strReplaceWith, false, true);
    toolbar.prepareSimpleToolBarTemplate();
    xmlDocument.setParameter("toolbar", toolbar.toString());
    try {
      WindowTabs tabs = new WindowTabs(this, vars,
          "com.gai.asset.erpCommon.ad_process.AssetPossition");
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      xmlDocument.setParameter("theme", vars.getTheme());
      
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(),
          "AssetPossition.html", classInfo.id, classInfo.type, strReplaceWith, tabs
              .breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "AssetPossition.html",
          strReplaceWith);
      xmlDocument.setParameter("leftTabs", lBar.manualTemplate());
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
    {
      OBError myMessage = vars.getMessage("AssetPossition");
      vars.removeMessage("AssetPossition");
      if (myMessage != null) {
        xmlDocument.setParameter("messageType", myMessage.getType());
        xmlDocument.setParameter("messageTitle", myMessage.getTitle());
        xmlDocument.setParameter("messageMessage", myMessage.getMessage());
      }
    }

    xmlDocument.setParameter("paramLanguage", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");

    xmlDocument.setParameter("title", "Asset Possition");      
    //
    xmlDocument.setParameter("strOrgID", strOrg);
    xmlDocument.setParameter("strAssetID", strAsset);
    xmlDocument.setParameter("strProductID", strProduct);
    xmlDocument.setParameter("date", strDate);
    xmlDocument.setParameter("dateFromdisplayFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("dateFromsaveFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    //xmlDocument.setParameter("strMovement", strMovement);

    //strMovement = "PD";
    try {
      String Movement_Type_Reference_ID = "88E5234FED4940D0884C40500C5E5271";
      ComboTableData comboTableData = new ComboTableData(vars, this, "LIST", "",
          Movement_Type_Reference_ID, "", Utility.getContext(this, vars,
              "#AccessibleOrgTree", "AssetPossition"), Utility.getContext(this, vars,
              "#User_Client", "AssetPossition"), 0);
      Utility.fillSQLParameters(this, vars, null, comboTableData, "AssetPossition", "");
      xmlDocument.setData("reportMovementType", "liststructure", comboTableData.select(false));
      comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

    /*try {
      String Storage_Type_Reference_ID = "E6E29CF3D37A49D2BFDA81A30B0E3D1D";
      ComboTableData comboTableDataStorage = new ComboTableData(vars, this, "LIST", "",
          Storage_Type_Reference_ID, "", Utility.getContext(this, vars,
              "#AccessibleOrgTree", "AssetPossition"), Utility.getContext(this, vars,
              "#User_Client", "AssetPossition"), 0);
      Utility.fillSQLParameters(this, vars, null, comboTableDataStorage, "AssetPossition", "");
      xmlDocument.setData("M_Locator_ID", "liststructure", comboTableDataStorage.select(false));
      comboTableDataStorage = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }*/

    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(xmlDocument.print());
    out.close();
  }

  public String getServletInfo() {
    return "Servlet Asset Possition. This Servlet was made by GAI";
  } // end of getServletInfo() method
}
