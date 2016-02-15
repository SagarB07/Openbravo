/*
    PT. Global Anugerah Indonesia    
*/
package com.gai.investasi.erpCommon.ad_reports;

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

public class ToolbarPrint extends HttpSecureAppServlet {
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
      String reportPath = "com/gai/investasi/erpCommon/ad_reports/";//path report
      String reportName ="Investasi";
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
    ToolbarPrintData[] data = ToolbarPrintData.selectType(this, strRecordId);

    if (data != null && data.length > 0) {
      hasiltype =data[0].type;
      hasilstatus =data[0].statusapprove;
    }

    OBError myMessage = null;
    myMessage = new OBError();
    String strReportName = "";
    //try{
      if (hasiltype.equals("Pencairan Mudharabah") && hasilstatus.equals("Approved")){
        
          strReportName="PencairanMudharabah.jrxml";
          //reportname ="PencairanMudharabah";//nama report  
        }
      else if (hasiltype.equals("Pencairan Mudharabah") && (hasilstatus.equals("Not Approved") || hasilstatus.equals(""))){
          strReportName="FormulirUsulanPencairanMudharabah.jrxml";
          //reportname ="FormulirUsulanPencairanMudharabah";//nama report
        }
      else if(hasiltype.equals("Penempatan Deposito On Call") && hasilstatus.equals("Approved")){
          strReportName="PenempatanDepositoOnCall.jrxml";
          //reportname ="PenempatanDepositoOnCall";//nama report
        }
      else if(hasiltype.equals("Penempatan Deposito On Call") && (hasilstatus.equals("Not Approved") || hasilstatus.equals(""))){
          strReportName="FormulirUsulanPenempatanDepositoOnCall.jrxml";
          //reportname ="FormulirUsulanPenempatanDepositoOnCall";//nama report
        }
      else if(hasiltype.equals("Penempatan Mudharabah") && hasilstatus.equals("Approved")){
          strReportName="PenempatanMudharabah.jrxml";
          //reportname ="PenempatanMudharabah";
        }
      else if (hasiltype.equals("Penempatan Mudharabah")&&(hasilstatus.equals("Not Approved") || hasilstatus.equals(""))){
          strReportName="FormulirUsulanPenempatanMudharabah.jrxml";
          //reportname ="FormulirUsulanPenempatanMudharabah";
        }
      else if(hasiltype.equals("Perpanjangan Mudharabah") && hasilstatus.equals("Approved")){
          strReportName="PerpanjanganMudharabah.jrxml";
          //reportname ="PerpanjanganMudharabah";
      }
      else if(hasiltype.equals("Perpanjangan Mudharabah") && (hasilstatus.equals("Not Approved") || hasilstatus.equals(""))){
          strReportName="FormulirUsulanPerpanjanganMudharabah.jrxml";
          //reportname ="FormulirUsulanPerpanjanganMudharabah";
        }      
  //}
    //catch (ServletException ex) {
      //myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
    //}

    String strReportPath = "@basedesign@/"+reportPath+strReportName;    
    // Retrieve Data dari database
    /*ToolbarPrintData[] datainvestasi = null;
    myMessage = null;
    myMessage = new OBError();
    try {
      if (reportname.equals("FormulirUsulanPencairanMudharabah")){
          datainvestasi = ToolbarPrintData.selectPencairanMudharabah(this,strRecordId);  
      }
      else if (reportname.equals("FormulirUsulanPerpanjanganMudharabah")){
          datainvestasi = ToolbarPrintData.selectPerpanjanganMudharabah(this,strRecordId);  
      }
      else if (reportname.equals("FormulirUsulanPenempatanMudharabah")){
          datainvestasi = ToolbarPrintData.selectPenempatanMudharabah(this,strRecordId);  
      }
      else if (reportname.equals("FormulirUsulanPenempatanDepositoOnCall")){
          datainvestasi = ToolbarPrintData.selectPenempatanDepositoOnCall(this,strRecordId);  
      }
    } catch (ServletException ex) {
      myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
    }
    */
    HashMap<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("GNV_Investasi_Line_ID", strRecordId);
    renderJR(vars, response, strReportPath, strOutput, parameters, null, null);
    
  }

  public String getServletInfo() {
    return "Servlet Toolbar Print for GL Journal.";
  } // end of getServletInfo() method
}