/*
    PT. Global Anugerah Indonesia    
*/
package com.gai.procurement.erpCommon.ad_reports;

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

//import com.gai.investasi.erpCommon.ad_reports.ToolbarPrintData;

//entitas

public class ToolbarRequisition extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);

    // Get user Client's base currency
    String strUserCurrencyId = Utility.stringBaseCurrencyId(this, vars.getClient());
    if (vars.commandIn("DEFAULT")) {      
      //not implemented / not yet
    } else if (vars.commandIn("PRINT_GL")) {
      String strRecordId = vars.getRequestGlobalVariable("inpRecordId", "");
      String reportPath = "com/gai/procurement/erpCommon/ad_reports/";//path report
      String reportName ="Lembar Persetujuan";
      String strOutput = "pdf";

      printPageDataOut(request, response, vars,strRecordId,reportPath,reportName,strOutput);
    } else
      pageError(response);
  }

  void printPageDataOut(HttpServletRequest request, HttpServletResponse response,
      VariablesSecureApp vars, String strRecordId ,String reportPath,String reportname,String strOutput ) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");

      log4j.debug("Record ID : "+strRecordId);
      //String strReportPath = "@basedesign@/"+reportPath;
    
    
//    if (strOutput.equals("pdf"))

/*    if (false) {
        //String debugText = "Path : "+strReportPath+" | "+strRecordId;
        throw new OBException(debugText);
    }    
*/
    /*if (strRecordId==null) {
        strRecordId = "1=1";
    }*/

    String hasiltype="";
    String hasilstatus="";
    
    OBError myMessage = null;
    myMessage = new OBError();
    String strReportName = "";
    //try{
          strReportName="L_Persetujuan_Requisition.jrxml";
            
  //}
    //catch (ServletException ex) {
      //myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
    //}

    String strReportPath = "@basedesign@/"+reportPath+strReportName;    
    HashMap<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("M_Requisition_ID", strRecordId);
    renderJR(vars, response, strReportPath, strOutput, parameters, null, null);
    
  }

  public String getServletInfo() {
    return "Servlet Toolbar Print for GL Journal.";
  } // end of getServletInfo() method
}