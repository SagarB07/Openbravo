/*
    PT. Global Anugerah Indonesia    
*/
package com.gai.procurement.persetujuan.erpCommon.ad_reports;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.base.exception.OBException;
import org.openbravo.erpCommon.utility.NavigationBar;
import org.openbravo.erpCommon.businessUtility.WindowTabs;
import org.openbravo.erpCommon.utility.LeftTabsBar;
import org.openbravo.erpCommon.utility.ToolBar;
import org.openbravo.xmlEngine.XmlDocument;

public class PersetujuanPrint extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);

    // Get user Client's base currency
    String strUserCurrencyId = Utility.stringBaseCurrencyId(this, vars.getClient());
    if (vars.commandIn("DEFAULT")) {      
      
    } else if (vars.commandIn("PRINT_PRS")) {
      String strRecordId = vars.getRequestGlobalVariable("inpRecordId", "");
      String reportPath = "com/gai/procurement/persetujuan/erpCommon/ad_reports/ReportPersetujuan.jrxml";//path report
      String reportname ="ReportPersetujuanPembelian";
      String strOutput = "pdf";

      printPageDataOut(request, response, vars,strRecordId,reportPath,reportname,strOutput);
    } else
      pageError(response);
  }

  void printPageDataOut(HttpServletRequest request, HttpServletResponse response,
      VariablesSecureApp vars, String strRecordId ,String reportPath, String reportname, String strOutput) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");

      log4j.debug("Record ID : "+strRecordId);

      String strReportPath = "@basedesign@/"+reportPath;   
      
      HashMap<String, Object> parameters = new HashMap<String, Object>();
      parameters.put("DOCUMENTNO", strRecordId);
      renderJR(vars, response, strReportPath, strOutput, parameters, null, null);
  }

  public String getServletInfo() {
    return "Servlet Toolbar Print for Persetujuan.";
  } // end of getServletInfo() method
}