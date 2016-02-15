
package org.openbravo.erpCommon.ad_actionButton;


import org.openbravo.erpCommon.utility.*;
import org.openbravo.erpCommon.reference.*;
import org.openbravo.utils.Replace;
import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.scheduling.ProcessBundle;
import org.openbravo.scheduling.ProcessRunner;
import org.openbravo.xmlEngine.XmlDocument;
import org.openbravo.database.SessionInfo;
import org.openbravo.erpCommon.obps.ActivationKey;
import org.openbravo.erpCommon.obps.ActivationKey.FeatureRestriction;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.service.OBDal;
import org.openbravo.model.ad.ui.Process;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ActionButton_Responser extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  protected static final String windowId = "ActionButtonResponser";
  
  public void init (ServletConfig config) {
    super.init(config);
    boolHist = false;
  }
  
  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);
    String strProcessId = getProcessId(vars);

    // set process type and id for audit
    SessionInfo.setProcessType("P");
    SessionInfo.setProcessId(strProcessId);
    SessionInfo.setUserId(vars.getSessionValue("#AD_User_ID"));
    SessionInfo.setSessionId(vars.getSessionValue("#AD_Session_ID"));
    SessionInfo.setQueryProfile("manualProcess");

    try {
      OBContext.setAdminMode();
      Process process = OBDal.getInstance().get(Process.class, strProcessId);
      if (process != null) {
        SessionInfo.setModuleId(process.getModule().getId());
      }
    } finally {
      OBContext.restorePreviousMode();
    }
    super.service(request, response);
  }

  private String getProcessId(VariablesSecureApp vars) throws ServletException {
    String command = vars.getCommand();
    if (command.equals("DEFAULT")) {
      return vars.getRequiredStringParameter("inpadProcessId");
    } else if (command.startsWith("BUTTON")) {
      return command.substring("BUTTON".length());
    } else if (command.startsWith("FRAMES")) {
      return command.substring("FRAMES".length());
    } else if (command.startsWith("SAVE_BUTTONActionButton")) {
      return command.substring("SAVE_BUTTONActionButton".length());
    }
    return null;
  }

  public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);
    String strProcessId = getProcessId(vars);

    if (vars.getCommand().startsWith("FRAMES")) {
      printPageFrames(response, vars, strProcessId);
    }
    
    if (!vars.commandIn("DEFAULT")) {
      //Check access
      FeatureRestriction featureRestriction = ActivationKey.getInstance().hasLicenseAccess("P",
          strProcessId);
      if (featureRestriction != FeatureRestriction.NO_RESTRICTION) {
        licenseError("P", strProcessId, featureRestriction, response, request, vars, true);
      }
      if (!hasGeneralAccess(vars, "P", strProcessId)) {
        bdErrorGeneralPopUp(request, response,
            Utility.messageBD(this, "Error", vars.getLanguage()), Utility.messageBD(this,
                "AccessTableNoView", vars.getLanguage()));
      }
    }
    
      
    if (vars.commandIn("DEFAULT")) {
      printPageDefault(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON172")) {
        
        printPageButton172(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON800087")) {
        
        printPageButton800087(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON800075")) {
        
        printPageButton800075(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON119")) {
        
        printPageButton119(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON193")) {
        
        printPageButton193(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON185")) {
        
        printPageButton185(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON175")) {
        
        printPageButton175(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTONF88AB6C58FE44576AAEC0B982110C7CD")) {
        
        printPageButtonF88AB6C58FE44576AAEC0B982110C7CD(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON800130")) {
        
        printPageButton800130(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON800151")) {
        
        printPageButton800151(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON800085")) {
        
        printPageButton800085(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON800109")) {
        
        printPageButton800109(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON88B1201F5A244FCE8FCD138151529190")) {
        
        printPageButton88B1201F5A244FCE8FCD138151529190(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTOND234AE084F7040DCB66E281A4237FF99")) {
        
        printPageButtonD234AE084F7040DCB66E281A4237FF99(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON4980A823D84541368393F0C622152ED7")) {
        
        printPageButton4980A823D84541368393F0C622152ED7(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON800171")) {
        
        printPageButton800171(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON9496716376AE42CBADCCCE48572A9586")) {
        
        printPageButton9496716376AE42CBADCCCE48572A9586(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON902E1C1F13804FFBAA4598295CCE58C2")) {
        
        printPageButton902E1C1F13804FFBAA4598295CCE58C2(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON5AE73AF08CCD44668B4FB9D1311B7EFB")) {
        
        printPageButton5AE73AF08CCD44668B4FB9D1311B7EFB(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTONCD80EB259990413C8BD060782D6AA01B")) {
        
        printPageButtonCD80EB259990413C8BD060782D6AA01B(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTONF7D631AFA38443B8A2D2347330628BC6")) {
        
        printPageButtonF7D631AFA38443B8A2D2347330628BC6(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON583A645A5C024D7EA1812E5008C200D4")) {
        
        printPageButton583A645A5C024D7EA1812E5008C200D4(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON00BB884C671B4C11BE4BA5537BEE2B0D")) {
        
        printPageButton00BB884C671B4C11BE4BA5537BEE2B0D(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON6833F564B3FA4CB3B083633E5B6D15EB")) {
        
        printPageButton6833F564B3FA4CB3B083633E5B6D15EB(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON6C82F26FCDF348E9A9188C68767BA877")) {
        
        printPageButton6C82F26FCDF348E9A9188C68767BA877(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON31218789A1C74D2FBC3CE626A75376E4")) {
        
        printPageButton31218789A1C74D2FBC3CE626A75376E4(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTONDA808C70756D4F9088FF40026735E30A")) {
        
        printPageButtonDA808C70756D4F9088FF40026735E30A(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON208795D4C42B4DD89948CFCBA8535649")) {
        
        printPageButton208795D4C42B4DD89948CFCBA8535649(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTONC42E7AD64D714B10A7F90F6B4D427D7A")) {
        
        printPageButtonC42E7AD64D714B10A7F90F6B4D427D7A(response, vars, strProcessId);
    } else if (vars.commandIn("BUTTON9C5575FE256D4AF892793E6223ABC3B0")) {
        
        printPageButton9C5575FE256D4AF892793E6223ABC3B0(response, vars, strProcessId);

    } else if (vars.commandIn("SAVE_BUTTONActionButton172")) {
       process172(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton800087")) {
       process800087(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton800075")) {
       process800075(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton119")) {
       process119(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton193")) {
       process193(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton185")) {
       process185(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton175")) {
       process175(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButtonF88AB6C58FE44576AAEC0B982110C7CD")) {
       processF88AB6C58FE44576AAEC0B982110C7CD(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton800130")) {
       process800130(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton800151")) {
       process800151(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton800085")) {
       process800085(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton800109")) {
       process800109(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton88B1201F5A244FCE8FCD138151529190")) {
       process88B1201F5A244FCE8FCD138151529190(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButtonD234AE084F7040DCB66E281A4237FF99")) {
       processD234AE084F7040DCB66E281A4237FF99(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton4980A823D84541368393F0C622152ED7")) {
       process4980A823D84541368393F0C622152ED7(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton800171")) {
       process800171(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton9496716376AE42CBADCCCE48572A9586")) {
       process9496716376AE42CBADCCCE48572A9586(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton902E1C1F13804FFBAA4598295CCE58C2")) {
       process902E1C1F13804FFBAA4598295CCE58C2(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton5AE73AF08CCD44668B4FB9D1311B7EFB")) {
       process5AE73AF08CCD44668B4FB9D1311B7EFB(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButtonCD80EB259990413C8BD060782D6AA01B")) {
       processCD80EB259990413C8BD060782D6AA01B(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButtonF7D631AFA38443B8A2D2347330628BC6")) {
       processF7D631AFA38443B8A2D2347330628BC6(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton583A645A5C024D7EA1812E5008C200D4")) {
       process583A645A5C024D7EA1812E5008C200D4(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton00BB884C671B4C11BE4BA5537BEE2B0D")) {
       process00BB884C671B4C11BE4BA5537BEE2B0D(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton6833F564B3FA4CB3B083633E5B6D15EB")) {
       process6833F564B3FA4CB3B083633E5B6D15EB(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton6C82F26FCDF348E9A9188C68767BA877")) {
       process6C82F26FCDF348E9A9188C68767BA877(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton31218789A1C74D2FBC3CE626A75376E4")) {
       process31218789A1C74D2FBC3CE626A75376E4(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButtonDA808C70756D4F9088FF40026735E30A")) {
       processDA808C70756D4F9088FF40026735E30A(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton208795D4C42B4DD89948CFCBA8535649")) {
       process208795D4C42B4DD89948CFCBA8535649(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButtonC42E7AD64D714B10A7F90F6B4D427D7A")) {
       processC42E7AD64D714B10A7F90F6B4D427D7A(vars, request, response);    
    } else if (vars.commandIn("SAVE_BUTTONActionButton9C5575FE256D4AF892793E6223ABC3B0")) {
       process9C5575FE256D4AF892793E6223ABC3B0(vars, request, response);    

    } else pageErrorPopUp(response);
  }

  void printPageDefault(HttpServletResponse response, VariablesSecureApp vars, String strProcessId) throws IOException, ServletException {
    log4j.debug("Output: Default");
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButtonDefault").createXmlDocument();
    xmlDocument.setParameter("processId", strProcessId);
	xmlDocument.setParameter("trlFormType", "PROCESS");
	xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
    out.println(xmlDocument.print());
    out.close();
  }
  
  void printPageFrames(HttpServletResponse response, VariablesSecureApp vars, String strProcessId) throws IOException, ServletException {
    log4j.debug("Output: Default");
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButtonDefaultFrames").createXmlDocument();
    xmlDocument.setParameter("processId", strProcessId);
    xmlDocument.setParameter("trlFormType", "PROCESS");
    xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
    out.println(xmlDocument.print());
    out.close();
  }

    void printPageButton172(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 172");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton172", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("172");
        vars.removeMessage("172");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton800087(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 800087");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton800087", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("800087");
        vars.removeMessage("800087");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton800075(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 800075");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton800075", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("800075");
        vars.removeMessage("800075");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DateFrom", "");
    xmlDocument.setParameter("DateFrom_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("DateTo", "");
    xmlDocument.setParameter("DateTo_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("M_Warehouse_ID", "");
    comboTableData = new ComboTableData(vars, this, "18", "M_Warehouse_ID", "197", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportM_Warehouse_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("C_BPartner_ID", "");
    comboTableData = new ComboTableData(vars, this, "18", "C_BPartner_ID", "192", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportC_BPartner_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("ReferenceNo", "");
    xmlDocument.setParameter("DateInvoiced", "");
    xmlDocument.setParameter("DateInvoiced_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton119(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 119");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton119", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("119");
        vars.removeMessage("119");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DateInvoiced", "");
    xmlDocument.setParameter("DateInvoiced_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("AD_Org_ID", Utility.getContext(this, vars, "#AD_Org_ID", windowId));
    comboTableData = new ComboTableData(vars, this, "19", "AD_Org_ID", "", "130", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, Utility.getContext(this, vars, "#AD_Org_ID", windowId));
    xmlDocument.setData("reportAD_Org_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("C_Order_ID", "");
    comboTableData = new ComboTableData(vars, this, "19", "C_Order_ID", "", "134", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportC_Order_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("C_BPartner_ID", "");
    comboTableData = new ComboTableData(vars, this, "19", "C_BPartner_ID", "", "135", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportC_BPartner_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("InvoiceToDate", "");
    xmlDocument.setParameter("InvoiceToDate_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton193(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 193");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton193", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("193");
        vars.removeMessage("193");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DateOrdered", "");
    xmlDocument.setParameter("DateOrdered_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("C_BPartner_ID", "");
    xmlDocument.setParameter("C_BPartner_IDR", "");
    xmlDocument.setParameter("Vendor_ID", "");
    comboTableData = new ComboTableData(vars, this, "18", "Vendor_ID", "192", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportVendor_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("C_Order_ID", "");
    xmlDocument.setParameter("C_Order_IDR", "");
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton185(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 185");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton185", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("185");
        vars.removeMessage("185");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton175(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 175");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton175", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("175");
        vars.removeMessage("175");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("AD_Client_ID", Utility.getContext(this, vars, "AD_Client_ID", ""));
    comboTableData = new ComboTableData(vars, this, "19", "AD_Client_ID", "", "103", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, Utility.getContext(this, vars, "AD_Client_ID", ""));
    xmlDocument.setData("reportAD_Client_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("AD_Table_ID", "");
    comboTableData = new ComboTableData(vars, this, "18", "AD_Table_ID", "800022", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportAD_Table_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButtonF88AB6C58FE44576AAEC0B982110C7CD(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process F88AB6C58FE44576AAEC0B982110C7CD");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButtonF88AB6C58FE44576AAEC0B982110C7CD", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("F88AB6C58FE44576AAEC0B982110C7CD");
        vars.removeMessage("F88AB6C58FE44576AAEC0B982110C7CD");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton800130(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 800130");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton800130", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("800130");
        vars.removeMessage("800130");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    xmlDocument.setParameter("Initdate", DateTimeData.today(this));
    xmlDocument.setParameter("Initdate_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("EndDate", "");
    xmlDocument.setParameter("EndDate_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton800151(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 800151");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton800151", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("800151");
        vars.removeMessage("800151");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton800085(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 800085");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton800085", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("800085");
        vars.removeMessage("800085");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    xmlDocument.setParameter("IsIncremental", "N");
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton800109(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 800109");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton800109", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("800109");
        vars.removeMessage("800109");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("C_Budget_ID", "");
    comboTableData = new ComboTableData(vars, this, "19", "C_Budget_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportC_Budget_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("MA_Processplan_ID", "");
    comboTableData = new ComboTableData(vars, this, "19", "MA_Processplan_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportMA_Processplan_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("CalcDate", "");
    xmlDocument.setParameter("CalcDate_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton88B1201F5A244FCE8FCD138151529190(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 88B1201F5A244FCE8FCD138151529190");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton88B1201F5A244FCE8FCD138151529190", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("88B1201F5A244FCE8FCD138151529190");
        vars.removeMessage("88B1201F5A244FCE8FCD138151529190");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("AD_Org_ID", Utility.getContext(this, vars, "#AD_Org_ID", windowId));
    comboTableData = new ComboTableData(vars, this, "19", "AD_Org_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, Utility.getContext(this, vars, "#AD_Org_ID", windowId));
    xmlDocument.setData("reportAD_Org_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("DariTanggal", "");
    xmlDocument.setParameter("DariTanggal_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("SampaiTanggal", "");
    xmlDocument.setParameter("SampaiTanggal_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButtonD234AE084F7040DCB66E281A4237FF99(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process D234AE084F7040DCB66E281A4237FF99");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButtonD234AE084F7040DCB66E281A4237FF99", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("D234AE084F7040DCB66E281A4237FF99");
        vars.removeMessage("D234AE084F7040DCB66E281A4237FF99");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("reportType", "cus");
    comboTableData = new ComboTableData(vars, this, "17", "reportType", "B82C3C28E51F4AA6B87D98E7ABBF92F0", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "cus");
    xmlDocument.setData("reportreportType", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("AD_Org_ID", Utility.getContext(this, vars, "AD_Org_ID", ""));
    comboTableData = new ComboTableData(vars, this, "19", "AD_Org_ID", "", "0C754881EAD94243A161111916E9B9C6", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, Utility.getContext(this, vars, "AD_Org_ID", ""));
    xmlDocument.setData("reportAD_Org_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("C_AcctSchema_ID", Utility.getContext(this, vars, "C_AcctSchema_ID", ""));
    comboTableData = new ComboTableData(vars, this, "19", "C_AcctSchema_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, Utility.getContext(this, vars, "C_AcctSchema_ID", ""));
    xmlDocument.setData("reportC_AcctSchema_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("C_BPartner_ID", Utility.getContext(this, vars, "C_BPartner_ID", ""));
    xmlDocument.setParameter("C_BPartner_IDR", "");
    xmlDocument.setParameter("DateFrom", "");
    xmlDocument.setParameter("DateFrom_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("DateTo", "");
    xmlDocument.setParameter("DateTo_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("outputType", "pdf");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "pdf");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton4980A823D84541368393F0C622152ED7(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 4980A823D84541368393F0C622152ED7");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton4980A823D84541368393F0C622152ED7", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("4980A823D84541368393F0C622152ED7");
        vars.removeMessage("4980A823D84541368393F0C622152ED7");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DOCUMENT_ID", "");
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton800171(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 800171");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton800171", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("800171");
        vars.removeMessage("800171");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("C_BPartner_ID", "");
    xmlDocument.setParameter("C_BPartner_IDR", "");
    xmlDocument.setParameter("C_Currency_ID", Utility.getContext(this, vars, "C_Currency_ID", "") );
    comboTableData = new ComboTableData(vars, this, "19", "C_Currency_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, Utility.getContext(this, vars, "C_Currency_ID", "") );
    xmlDocument.setData("reportC_Currency_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("DateFrom", DateTimeData.today(this));
    xmlDocument.setParameter("DateFrom_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("DateTo", "");
    xmlDocument.setParameter("DateTo_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("C_Project_ID", "");
    xmlDocument.setParameter("C_Project_IDR", "");
    xmlDocument.setParameter("M_Warehouse_ID", "");
    comboTableData = new ComboTableData(vars, this, "19", "M_Warehouse_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportM_Warehouse_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton9496716376AE42CBADCCCE48572A9586(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 9496716376AE42CBADCCCE48572A9586");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton9496716376AE42CBADCCCE48572A9586", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("9496716376AE42CBADCCCE48572A9586");
        vars.removeMessage("9496716376AE42CBADCCCE48572A9586");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("TanggalLaporan", "");
    xmlDocument.setParameter("TanggalLaporan_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("rate1", "");
    xmlDocument.setParameter("rate2", "");
    xmlDocument.setParameter("rate3", "");
    xmlDocument.setParameter("rate4", "");
    xmlDocument.setParameter("rate5", "");
    xmlDocument.setParameter("rate6", "");
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton902E1C1F13804FFBAA4598295CCE58C2(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 902E1C1F13804FFBAA4598295CCE58C2");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton902E1C1F13804FFBAA4598295CCE58C2", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("902E1C1F13804FFBAA4598295CCE58C2");
        vars.removeMessage("902E1C1F13804FFBAA4598295CCE58C2");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("gumk_umk_id", "");
    xmlDocument.setParameter("Kepada", "");
    xmlDocument.setParameter("Dari", "");
    xmlDocument.setParameter("outputType", "pdf");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "pdf");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("Perihal", "");
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton5AE73AF08CCD44668B4FB9D1311B7EFB(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 5AE73AF08CCD44668B4FB9D1311B7EFB");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton5AE73AF08CCD44668B4FB9D1311B7EFB", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("5AE73AF08CCD44668B4FB9D1311B7EFB");
        vars.removeMessage("5AE73AF08CCD44668B4FB9D1311B7EFB");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DOCUMENT_ID", "");
    xmlDocument.setParameter("outputType", "pdf");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "pdf");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButtonCD80EB259990413C8BD060782D6AA01B(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process CD80EB259990413C8BD060782D6AA01B");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButtonCD80EB259990413C8BD060782D6AA01B", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("CD80EB259990413C8BD060782D6AA01B");
        vars.removeMessage("CD80EB259990413C8BD060782D6AA01B");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DOCUMENT_ID", "");
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButtonF7D631AFA38443B8A2D2347330628BC6(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process F7D631AFA38443B8A2D2347330628BC6");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButtonF7D631AFA38443B8A2D2347330628BC6", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("F7D631AFA38443B8A2D2347330628BC6");
        vars.removeMessage("F7D631AFA38443B8A2D2347330628BC6");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("C_ElementValue_ID", "");
    xmlDocument.setParameter("C_Period_ID", "");
    comboTableData = new ComboTableData(vars, this, "19", "C_Period_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportC_Period_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton583A645A5C024D7EA1812E5008C200D4(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 583A645A5C024D7EA1812E5008C200D4");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton583A645A5C024D7EA1812E5008C200D4", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("583A645A5C024D7EA1812E5008C200D4");
        vars.removeMessage("583A645A5C024D7EA1812E5008C200D4");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("AD_Org_ID", Utility.getContext(this, vars, "#AD_Org_ID", windowId));
    comboTableData = new ComboTableData(vars, this, "19", "AD_Org_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, Utility.getContext(this, vars, "#AD_Org_ID", windowId));
    xmlDocument.setData("reportAD_Org_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("DariTanggal", "");
    xmlDocument.setParameter("DariTanggal_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("SampaiTanggal", "");
    xmlDocument.setParameter("SampaiTanggal_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("outputType", "pdf");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "pdf");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton00BB884C671B4C11BE4BA5537BEE2B0D(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 00BB884C671B4C11BE4BA5537BEE2B0D");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton00BB884C671B4C11BE4BA5537BEE2B0D", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("00BB884C671B4C11BE4BA5537BEE2B0D");
        vars.removeMessage("00BB884C671B4C11BE4BA5537BEE2B0D");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("AD_Org_ID", "");
    xmlDocument.setParameter("periodFrom", "");
    xmlDocument.setParameter("periodFrom_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("periodTo", "");
    xmlDocument.setParameter("periodTo_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("OutputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "OutputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportOutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton6833F564B3FA4CB3B083633E5B6D15EB(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 6833F564B3FA4CB3B083633E5B6D15EB");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton6833F564B3FA4CB3B083633E5B6D15EB", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("6833F564B3FA4CB3B083633E5B6D15EB");
        vars.removeMessage("6833F564B3FA4CB3B083633E5B6D15EB");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("AD_ORG_ID", "");
    xmlDocument.setParameter("BULAN", "");
    comboTableData = new ComboTableData(vars, this, "17", "BULAN", "CABD440EB1E4497F9A219F8AF654645E", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportBULAN", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("TAHUN", "");
    xmlDocument.setParameter("outputType", "pdf");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "pdf");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton6C82F26FCDF348E9A9188C68767BA877(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 6C82F26FCDF348E9A9188C68767BA877");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton6C82F26FCDF348E9A9188C68767BA877", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("6C82F26FCDF348E9A9188C68767BA877");
        vars.removeMessage("6C82F26FCDF348E9A9188C68767BA877");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DOCUMENT_ID", "");
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton31218789A1C74D2FBC3CE626A75376E4(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 31218789A1C74D2FBC3CE626A75376E4");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton31218789A1C74D2FBC3CE626A75376E4", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("31218789A1C74D2FBC3CE626A75376E4");
        vars.removeMessage("31218789A1C74D2FBC3CE626A75376E4");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("Gumk_Umk_ID", "");
    xmlDocument.setParameter("outputType", "pdf");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "pdf");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButtonDA808C70756D4F9088FF40026735E30A(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process DA808C70756D4F9088FF40026735E30A");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButtonDA808C70756D4F9088FF40026735E30A", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("DA808C70756D4F9088FF40026735E30A");
        vars.removeMessage("DA808C70756D4F9088FF40026735E30A");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("AD_Org_ID", "");
    xmlDocument.setParameter("GNV_Investasi_Line_ID", "");
    xmlDocument.setParameter("Jenis", "");
    comboTableData = new ComboTableData(vars, this, "17", "Jenis", "5E5EA77ECCB842118B90EC29F4BF24CF", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportJenis", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("outputType", "pdf");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "pdf");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton208795D4C42B4DD89948CFCBA8535649(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 208795D4C42B4DD89948CFCBA8535649");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton208795D4C42B4DD89948CFCBA8535649", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("208795D4C42B4DD89948CFCBA8535649");
        vars.removeMessage("208795D4C42B4DD89948CFCBA8535649");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DOCUMENTNO", "");
    xmlDocument.setParameter("disetujui_oleh_dirkeu", "");
    xmlDocument.setParameter("diperiksa_oleh", "");
    xmlDocument.setParameter("diperiksa_oleh_mgr", "");
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButtonC42E7AD64D714B10A7F90F6B4D427D7A(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process C42E7AD64D714B10A7F90F6B4D427D7A");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButtonC42E7AD64D714B10A7F90F6B4D427D7A", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("C42E7AD64D714B10A7F90F6B4D427D7A");
        vars.removeMessage("C42E7AD64D714B10A7F90F6B4D427D7A");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("AD_Org_ID", "");
    xmlDocument.setParameter("A_Asset_Group_ID", "");
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }
    void printPageButton9C5575FE256D4AF892793E6223ABC3B0(HttpServletResponse response, VariablesSecureApp vars, String strProcessId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 9C5575FE256D4AF892793E6223ABC3B0");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/ActionButton9C5575FE256D4AF892793E6223ABC3B0", discard).createXmlDocument();
      xmlDocument.setParameter("processing", "Y");
      xmlDocument.setParameter("form", "ActionButton_Responser.html");
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      xmlDocument.setParameter("processId", strProcessId);
			xmlDocument.setParameter("trlFormType", "PROCESS");
          
      {
        OBError myMessage = vars.getMessage("9C5575FE256D4AF892793E6223ABC3B0");
        vars.removeMessage("9C5575FE256D4AF892793E6223ABC3B0");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("AD_Org_ID", Utility.getContext(this, vars, "AD_Org_ID", ""));
    comboTableData = new ComboTableData(vars, this, "19", "AD_Org_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, Utility.getContext(this, vars, "AD_Org_ID", ""));
    xmlDocument.setData("reportAD_Org_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("C_Order_ID", "");
    xmlDocument.setParameter("outputType", "");
    comboTableData = new ComboTableData(vars, this, "17", "outputType", "800104", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, null, comboTableData, windowId, "");
    xmlDocument.setData("reportoutputType", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      out.println(xmlDocument.print());
      out.close();
    }



    private void process172(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "172", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        
        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process800087(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "800087", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        
        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process800075(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "800075", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strdatefrom = vars.getStringParameter("inpdatefrom");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "10", "DateFrom", strdatefrom, vars.getClient(), vars.getOrg(), vars.getUser());
String strdateto = vars.getStringParameter("inpdateto");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "20", "DateTo", strdateto, vars.getClient(), vars.getOrg(), vars.getUser());
String strmWarehouseId = vars.getStringParameter("inpmWarehouseId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "M_Warehouse_ID", strmWarehouseId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcBpartnerId = vars.getStringParameter("inpcBpartnerId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "C_BPartner_ID", strcBpartnerId, vars.getClient(), vars.getOrg(), vars.getUser());
String strreferenceno = vars.getStringParameter("inpreferenceno");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "50", "ReferenceNo", strreferenceno, vars.getClient(), vars.getOrg(), vars.getUser());
String strdateinvoiced = vars.getStringParameter("inpdateinvoiced");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "60", "DateInvoiced", strdateinvoiced, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process119(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "119", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strdateinvoiced = vars.getStringParameter("inpdateinvoiced");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "10", "DateInvoiced", strdateinvoiced, vars.getClient(), vars.getOrg(), vars.getUser());
String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "15", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcOrderId = vars.getStringParameter("inpcOrderId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "C_Order_ID", strcOrderId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcBpartnerId = vars.getStringParameter("inpcBpartnerId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "C_BPartner_ID", strcBpartnerId, vars.getClient(), vars.getOrg(), vars.getUser());
String strinvoicetodate = vars.getStringParameter("inpinvoicetodate");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "40", "InvoiceToDate", strinvoicetodate, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process193(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "193", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strdateordered = vars.getStringParameter("inpdateordered");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "10", "DateOrdered", strdateordered, vars.getClient(), vars.getOrg(), vars.getUser());
String strcBpartnerId = vars.getStringParameter("inpcBpartnerId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "C_BPartner_ID", strcBpartnerId, vars.getClient(), vars.getOrg(), vars.getUser());
String strvendorId = vars.getStringParameter("inpvendorId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "Vendor_ID", strvendorId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcOrderId = vars.getStringParameter("inpcOrderId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "C_Order_ID", strcOrderId, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process185(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "185", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        
        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process175(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "175", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String stradClientId = vars.getStringParameter("inpadClientId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "AD_Client_ID", stradClientId, vars.getClient(), vars.getOrg(), vars.getUser());
String stradTableId = vars.getStringParameter("inpadTableId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "AD_Table_ID", stradTableId, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void processF88AB6C58FE44576AAEC0B982110C7CD(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "F88AB6C58FE44576AAEC0B982110C7CD", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        
        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process800130(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "800130", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strinitdate = vars.getStringParameter("inpinitdate");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "10", "Initdate", strinitdate, vars.getClient(), vars.getOrg(), vars.getUser());
String strenddate = vars.getStringParameter("inpenddate");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "20", "EndDate", strenddate, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process800151(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "800151", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        
        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process800085(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "800085", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strisincremental = vars.getStringParameter("inpisincremental", "N");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "IsIncremental", strisincremental, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process800109(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "800109", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strcBudgetId = vars.getStringParameter("inpcBudgetId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "C_Budget_ID", strcBudgetId, vars.getClient(), vars.getOrg(), vars.getUser());
String strmaProcessplanId = vars.getStringParameter("inpmaProcessplanId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "MA_Processplan_ID", strmaProcessplanId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcalcdate = vars.getStringParameter("inpcalcdate");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "30", "CalcDate", strcalcdate, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process88B1201F5A244FCE8FCD138151529190(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "88B1201F5A244FCE8FCD138151529190", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strdaritanggal = vars.getStringParameter("inpdaritanggal");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "20", "DariTanggal", strdaritanggal, vars.getClient(), vars.getOrg(), vars.getUser());
String strsampaitanggal = vars.getStringParameter("inpsampaitanggal");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "30", "SampaiTanggal", strsampaitanggal, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void processD234AE084F7040DCB66E281A4237FF99(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "D234AE084F7040DCB66E281A4237FF99", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strreporttype = vars.getStringParameter("inpreporttype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "reportType", strreporttype, vars.getClient(), vars.getOrg(), vars.getUser());
String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcAcctschemaId = vars.getStringParameter("inpcAcctschemaId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "C_AcctSchema_ID", strcAcctschemaId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcBpartnerId = vars.getStringParameter("inpcBpartnerId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "C_BPartner_ID", strcBpartnerId, vars.getClient(), vars.getOrg(), vars.getUser());
String strdatefrom = vars.getStringParameter("inpdatefrom");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "50", "DateFrom", strdatefrom, vars.getClient(), vars.getOrg(), vars.getUser());
String strdateto = vars.getStringParameter("inpdateto");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "60", "DateTo", strdateto, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "70", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process4980A823D84541368393F0C622152ED7(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "4980A823D84541368393F0C622152ED7", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strdocumentId = vars.getStringParameter("inpdocumentId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "DOCUMENT_ID", strdocumentId, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process800171(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "800171", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strcBpartnerId = vars.getStringParameter("inpcBpartnerId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "C_BPartner_ID", strcBpartnerId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcCurrencyId = vars.getStringParameter("inpcCurrencyId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "15", "C_Currency_ID", strcCurrencyId, vars.getClient(), vars.getOrg(), vars.getUser());
String strdatefrom = vars.getStringParameter("inpdatefrom");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "20", "DateFrom", strdatefrom, vars.getClient(), vars.getOrg(), vars.getUser());
String strdateto = vars.getStringParameter("inpdateto");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "40", "DateTo", strdateto, vars.getClient(), vars.getOrg(), vars.getUser());
String strcProjectId = vars.getStringParameter("inpcProjectId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "50", "C_Project_ID", strcProjectId, vars.getClient(), vars.getOrg(), vars.getUser());
String strmWarehouseId = vars.getStringParameter("inpmWarehouseId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "60", "M_Warehouse_ID", strmWarehouseId, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "70", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process9496716376AE42CBADCCCE48572A9586(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "9496716376AE42CBADCCCE48572A9586", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strtanggallaporan = vars.getStringParameter("inptanggallaporan");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "10", "TanggalLaporan", strtanggallaporan, vars.getClient(), vars.getOrg(), vars.getUser());
String strrate1 = vars.getStringParameter("inprate1");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "rate1", strrate1, vars.getClient(), vars.getOrg(), vars.getUser());
String strrate2 = vars.getStringParameter("inprate2");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "rate2", strrate2, vars.getClient(), vars.getOrg(), vars.getUser());
String strrate3 = vars.getStringParameter("inprate3");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "rate3", strrate3, vars.getClient(), vars.getOrg(), vars.getUser());
String strrate4 = vars.getStringParameter("inprate4");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "50", "rate4", strrate4, vars.getClient(), vars.getOrg(), vars.getUser());
String strrate5 = vars.getStringParameter("inprate5");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "60", "rate5", strrate5, vars.getClient(), vars.getOrg(), vars.getUser());
String strrate6 = vars.getStringParameter("inprate6");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "70", "rate6", strrate6, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "80", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process902E1C1F13804FFBAA4598295CCE58C2(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "902E1C1F13804FFBAA4598295CCE58C2", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strgumkUmkId = vars.getStringParameter("inpgumkUmkId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "gumk_umk_id", strgumkUmkId, vars.getClient(), vars.getOrg(), vars.getUser());
String strkepada = vars.getStringParameter("inpkepada");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "Kepada", strkepada, vars.getClient(), vars.getOrg(), vars.getUser());
String strdari = vars.getStringParameter("inpdari");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "Dari", strdari, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "60", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());
String strperihal = vars.getStringParameter("inpperihal");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "100", "Perihal", strperihal, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process5AE73AF08CCD44668B4FB9D1311B7EFB(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "5AE73AF08CCD44668B4FB9D1311B7EFB", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strdocumentId = vars.getStringParameter("inpdocumentId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "DOCUMENT_ID", strdocumentId, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void processCD80EB259990413C8BD060782D6AA01B(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "CD80EB259990413C8BD060782D6AA01B", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strdocumentId = vars.getStringParameter("inpdocumentId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "DOCUMENT_ID", strdocumentId, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void processF7D631AFA38443B8A2D2347330628BC6(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "F7D631AFA38443B8A2D2347330628BC6", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strcElementvalueId = vars.getStringParameter("inpcElementvalueId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "C_ElementValue_ID", strcElementvalueId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcPeriodId = vars.getStringParameter("inpcPeriodId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "C_Period_ID", strcPeriodId, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process583A645A5C024D7EA1812E5008C200D4(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "583A645A5C024D7EA1812E5008C200D4", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strdaritanggal = vars.getStringParameter("inpdaritanggal");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "20", "DariTanggal", strdaritanggal, vars.getClient(), vars.getOrg(), vars.getUser());
String strsampaitanggal = vars.getStringParameter("inpsampaitanggal");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "30", "SampaiTanggal", strsampaitanggal, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process00BB884C671B4C11BE4BA5537BEE2B0D(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "00BB884C671B4C11BE4BA5537BEE2B0D", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strperiodfrom = vars.getStringParameter("inpperiodfrom");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "20", "periodFrom", strperiodfrom, vars.getClient(), vars.getOrg(), vars.getUser());
String strperiodto = vars.getStringParameter("inpperiodto");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "30", "periodTo", strperiodto, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "OutputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process6833F564B3FA4CB3B083633E5B6D15EB(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "6833F564B3FA4CB3B083633E5B6D15EB", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "1", "AD_ORG_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strbulan = vars.getStringParameter("inpbulan");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "BULAN", strbulan, vars.getClient(), vars.getOrg(), vars.getUser());
String strtahun = vars.getStringParameter("inptahun");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "TAHUN", strtahun, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process6C82F26FCDF348E9A9188C68767BA877(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "6C82F26FCDF348E9A9188C68767BA877", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strdocumentId = vars.getStringParameter("inpdocumentId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "DOCUMENT_ID", strdocumentId, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process31218789A1C74D2FBC3CE626A75376E4(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "31218789A1C74D2FBC3CE626A75376E4", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strgumkUmkId = vars.getStringParameter("inpgumkUmkId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "Gumk_Umk_ID", strgumkUmkId, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void processDA808C70756D4F9088FF40026735E30A(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "DA808C70756D4F9088FF40026735E30A", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strgnvInvestasiLineId = vars.getStringParameter("inpgnvInvestasiLineId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "GNV_Investasi_Line_ID", strgnvInvestasiLineId, vars.getClient(), vars.getOrg(), vars.getUser());
String strjenis = vars.getStringParameter("inpjenis");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "Jenis", strjenis, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "50", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process208795D4C42B4DD89948CFCBA8535649(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "208795D4C42B4DD89948CFCBA8535649", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String strdocumentno = vars.getStringParameter("inpdocumentno");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "DOCUMENTNO", strdocumentno, vars.getClient(), vars.getOrg(), vars.getUser());
String strdisetujuiOlehDirkeu = vars.getStringParameter("inpdisetujuiOlehDirkeu");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "disetujui_oleh_dirkeu", strdisetujuiOlehDirkeu, vars.getClient(), vars.getOrg(), vars.getUser());
String strdiperiksaOleh = vars.getStringParameter("inpdiperiksaOleh");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "50", "diperiksa_oleh", strdiperiksaOleh, vars.getClient(), vars.getOrg(), vars.getUser());
String strdiperiksaOlehMgr = vars.getStringParameter("inpdiperiksaOlehMgr");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "60", "diperiksa_oleh_mgr", strdiperiksaOlehMgr, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "70", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void processC42E7AD64D714B10A7F90F6B4D427D7A(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "C42E7AD64D714B10A7F90F6B4D427D7A", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String straAssetGroupId = vars.getStringParameter("inpaAssetGroupId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "A_Asset_Group_ID", straAssetGroupId, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "40", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }
    private void process9C5575FE256D4AF892793E6223ABC3B0(VariablesSecureApp vars, HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException{
         
        String strProcessing = vars.getStringParameter("inpprocessing");
        String pinstance = SequenceIdData.getUUID();
        PInstanceProcessData.insertPInstance(this, pinstance, "9C5575FE256D4AF892793E6223ABC3B0", "0", strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
        String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcOrderId = vars.getStringParameter("inpcOrderId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "C_Order_ID", strcOrderId, vars.getClient(), vars.getOrg(), vars.getUser());
String stroutputtype = vars.getStringParameter("inpoutputtype");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "outputType", stroutputtype, vars.getClient(), vars.getOrg(), vars.getUser());

        
        ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
        new ProcessRunner(bundle).execute(this);

        processButtonHelper(request, response, vars, pinstance);    
  }


  public String getServletInfo() {
    return "Servlet ActionButton_Responser. This Servlet was made by Wad constructor";
  } // end of the getServletInfo() method

  private void processButtonHelper(HttpServletRequest request, HttpServletResponse response, VariablesSecureApp vars, String pinstance) 
     throws ServletException, IOException {
      OBError myMessage;
      try {
        PInstanceProcessData[] pinstanceData = PInstanceProcessData.select(this, pinstance);
      myMessage = Utility.getProcessInstanceMessage(this, vars, pinstanceData);
      } catch (Exception e) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), e.getMessage());
          e.printStackTrace();
          log4j.warn("Error");
      }
      advisePopUp(request, response, myMessage.getType(), myMessage.getTitle(), myMessage.getMessage());
  }
}
