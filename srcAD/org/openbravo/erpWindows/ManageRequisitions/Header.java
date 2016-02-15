
package org.openbravo.erpWindows.ManageRequisitions;


import org.openbravo.erpCommon.reference.*;


import org.openbravo.erpCommon.ad_actionButton.*;


import org.codehaus.jettison.json.JSONObject;
import org.openbravo.erpCommon.utility.*;
import org.openbravo.data.FieldProvider;
import org.openbravo.utils.FormatUtilities;
import org.openbravo.utils.Replace;
import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.base.exception.OBException;
import org.openbravo.scheduling.ProcessBundle;
import org.openbravo.scheduling.ProcessRunner;
import org.openbravo.erpCommon.businessUtility.WindowTabs;
import org.openbravo.xmlEngine.XmlDocument;
import java.util.Vector;
import java.util.StringTokenizer;
import org.openbravo.database.SessionInfo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.sql.Connection;
import org.apache.log4j.Logger;
import java.util.List;
import java.util.Arrays;

public class Header extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  
  private static Logger log4j = Logger.getLogger(Header.class);
  
  private static final String windowId = "1004400000";
  private static final String tabId = "1004400001";
  private static final String defaultTabView = "RELATION";
  private static final int accesslevel = 1;
  private static final String moduleId = "0";
  
  @Override
  public void init(ServletConfig config) {
    setClassInfo("W", tabId, moduleId);
    super.init(config);
  }
  
  
  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);
    String command = vars.getCommand();
    
    boolean securedProcess = false;
    if (command.contains("BUTTON")) {
     List<String> explicitAccess = Arrays.asList( "");
    
     SessionInfo.setUserId(vars.getSessionValue("#AD_User_ID"));
     SessionInfo.setSessionId(vars.getSessionValue("#AD_Session_ID"));
     SessionInfo.setQueryProfile("manualProcess");
     
      try {
        securedProcess = "Y".equals(org.openbravo.erpCommon.businessUtility.Preferences
            .getPreferenceValue("SecuredProcess", true, vars.getClient(), vars.getOrg(), vars
                .getUser(), vars.getRole(), windowId));
      } catch (PropertyException e) {
      }
     
      if (command.contains("1004400000")) {
        SessionInfo.setProcessType("P");
        SessionInfo.setProcessId("1004400000");
        SessionInfo.setModuleId("0");
        if (securedProcess || explicitAccess.contains("1004400000")) {
          classInfo.type = "P";
          classInfo.id = "1004400000";
        }
      }
     
      if (command.contains("FB10EB0C8B584BCBA063FDE50E0B7A44")) {
        SessionInfo.setProcessType("P");
        SessionInfo.setProcessId("FB10EB0C8B584BCBA063FDE50E0B7A44");
        SessionInfo.setModuleId("99493070BB374932A133B5A8DE34D3C9");
        if (securedProcess || explicitAccess.contains("FB10EB0C8B584BCBA063FDE50E0B7A44")) {
          classInfo.type = "P";
          classInfo.id = "FB10EB0C8B584BCBA063FDE50E0B7A44";
        }
      }
     
      if (command.contains("427DD76F78784831B02040B33F9822A1")) {
        SessionInfo.setProcessType("P");
        SessionInfo.setProcessId("427DD76F78784831B02040B33F9822A1");
        SessionInfo.setModuleId("D32F238EEBD341CFAE72AF25EE844253");
        if (securedProcess || explicitAccess.contains("427DD76F78784831B02040B33F9822A1")) {
          classInfo.type = "P";
          classInfo.id = "427DD76F78784831B02040B33F9822A1";
        }
      }
     
      if (command.contains("88C781DF1DE84920902CCDC0B403456A")) {
        SessionInfo.setProcessType("P");
        SessionInfo.setProcessId("88C781DF1DE84920902CCDC0B403456A");
        SessionInfo.setModuleId("B52D007C68F14D0E9CC43BC9D884A740");
        if (securedProcess || explicitAccess.contains("88C781DF1DE84920902CCDC0B403456A")) {
          classInfo.type = "P";
          classInfo.id = "88C781DF1DE84920902CCDC0B403456A";
        }
      }
     
      if (command.contains("F65158BB58A84AAF92B50738FB5F5DD4")) {
        SessionInfo.setProcessType("P");
        SessionInfo.setProcessId("F65158BB58A84AAF92B50738FB5F5DD4");
        SessionInfo.setModuleId("9C5AF1AA041149E48C7091EF40C2A426");
        if (securedProcess || explicitAccess.contains("F65158BB58A84AAF92B50738FB5F5DD4")) {
          classInfo.type = "P";
          classInfo.id = "F65158BB58A84AAF92B50738FB5F5DD4";
        }
      }
     

     
    }
    if (!securedProcess) {
      setClassInfo("W", tabId, moduleId);
    }
    super.service(request, response);
  }
  

  public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
    TableSQLData tableSQL = null;
    VariablesSecureApp vars = new VariablesSecureApp(request);
    Boolean saveRequest = (Boolean) request.getAttribute("autosave");
    
    if(saveRequest != null && saveRequest){
      String currentOrg = vars.getStringParameter("inpadOrgId");
      String currentClient = vars.getStringParameter("inpadClientId");
      boolean editableTab = (!org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)
                            && (currentOrg.equals("") || Utility.isElementInList(Utility.getContext(this, vars,"#User_Org", windowId, accesslevel), currentOrg)) 
                            && (currentClient.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),currentClient)));
    
        OBError myError = new OBError();
        String commandType = request.getParameter("inpCommandType");
        String strmRequisitionId = request.getParameter("inpmRequisitionId");
        
        if (editableTab) {
          int total = 0;
          
          if(commandType.equalsIgnoreCase("EDIT") && !strmRequisitionId.equals(""))
              total = saveRecord(vars, myError, 'U');
          else
              total = saveRecord(vars, myError, 'I');
          
          if (!myError.isEmpty() && total == 0)     
            throw new OBException(myError.getMessage());
        }
        vars.setSessionValue(request.getParameter("mappingName") +"|hash", vars.getPostDataHash());
        vars.setSessionValue(tabId + "|Header.view", "EDIT");
        
        return;
    }
    
    try {
      tableSQL = new TableSQLData(vars, this, tabId, Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel), Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    String strOrderBy = vars.getSessionValue(tabId + "|orderby");
    if (!strOrderBy.equals("")) {
      vars.setSessionValue(tabId + "|newOrder", "1");
    }

    if (vars.commandIn("DEFAULT")) {

      String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
      

      String strView = vars.getSessionValue(tabId + "|Header.view");
      if (strView.equals("")) {
        strView = defaultTabView;

        if (strView.equals("EDIT")) {
          if (strM_Requisition_ID.equals("")) strM_Requisition_ID = firstElement(vars, tableSQL);
          if (strM_Requisition_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strM_Requisition_ID, tableSQL);

      else printPageDataSheet(response, vars, strM_Requisition_ID, tableSQL);
    } else if (vars.commandIn("DIRECT")) {
      String strM_Requisition_ID = vars.getStringParameter("inpDirectKey");
      
        
      if (strM_Requisition_ID.equals("")) strM_Requisition_ID = vars.getRequiredGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID");
      else vars.setSessionValue(windowId + "|M_Requisition_ID", strM_Requisition_ID);
      
      vars.setSessionValue(tabId + "|Header.view", "EDIT");

      printPageEdit(response, request, vars, false, strM_Requisition_ID, tableSQL);

    } else if (vars.commandIn("TAB")) {


      String strView = vars.getSessionValue(tabId + "|Header.view");
      String strM_Requisition_ID = "";
      if (strView.equals("")) {
        strView = defaultTabView;
        if (strView.equals("EDIT")) {
          strM_Requisition_ID = firstElement(vars, tableSQL);
          if (strM_Requisition_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) {

        if (strM_Requisition_ID.equals("")) strM_Requisition_ID = firstElement(vars, tableSQL);
        printPageEdit(response, request, vars, false, strM_Requisition_ID, tableSQL);

      } else printPageDataSheet(response, vars, "", tableSQL);
    } else if (vars.commandIn("SEARCH")) {
vars.getRequestGlobalVariable("inpParamDocumentNo", tabId + "|paramDocumentNo");
vars.getRequestGlobalVariable("inpParamC_BPartner_ID", tabId + "|paramC_BPartner_ID");
vars.getRequestGlobalVariable("inpParamDocStatus", tabId + "|paramDocStatus");

        vars.getRequestGlobalVariable("inpParamUpdated", tabId + "|paramUpdated");
        vars.getRequestGlobalVariable("inpParamUpdatedBy", tabId + "|paramUpdatedBy");
        vars.getRequestGlobalVariable("inpParamCreated", tabId + "|paramCreated");
        vars.getRequestGlobalVariable("inpparamCreatedBy", tabId + "|paramCreatedBy");
      
      
      vars.removeSessionValue(windowId + "|M_Requisition_ID");
      String strM_Requisition_ID="";

      String strView = vars.getSessionValue(tabId + "|Header.view");
      if (strView.equals("")) strView=defaultTabView;

      if (strView.equals("EDIT")) {
        strM_Requisition_ID = firstElement(vars, tableSQL);
        if (strM_Requisition_ID.equals("")) {
          // filter returns empty set
          strView = "RELATION";
          // switch to grid permanently until the user changes the view again
          vars.setSessionValue(tabId + "|Header.view", strView);
        }
      }

      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strM_Requisition_ID, tableSQL);

      else printPageDataSheet(response, vars, strM_Requisition_ID, tableSQL);
    } else if (vars.commandIn("RELATION")) {
      

      String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
      vars.setSessionValue(tabId + "|Header.view", "RELATION");
      printPageDataSheet(response, vars, strM_Requisition_ID, tableSQL);
    } else if (vars.commandIn("NEW")) {


      printPageEdit(response, request, vars, true, "", tableSQL);

    } else if (vars.commandIn("EDIT")) {

      @SuppressWarnings("unused") // In Expense Invoice tab this variable is not used, to be fixed
      String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
      vars.setSessionValue(tabId + "|Header.view", "EDIT");

      setHistoryCommand(request, "EDIT");
      printPageEdit(response, request, vars, false, strM_Requisition_ID, tableSQL);

    } else if (vars.commandIn("NEXT")) {

      String strM_Requisition_ID = vars.getRequiredStringParameter("inpmRequisitionId");
      
      String strNext = nextElement(vars, strM_Requisition_ID, tableSQL);

      printPageEdit(response, request, vars, false, strNext, tableSQL);
    } else if (vars.commandIn("PREVIOUS")) {

      String strM_Requisition_ID = vars.getRequiredStringParameter("inpmRequisitionId");
      
      String strPrevious = previousElement(vars, strM_Requisition_ID, tableSQL);

      printPageEdit(response, request, vars, false, strPrevious, tableSQL);
    } else if (vars.commandIn("FIRST_RELATION")) {

      vars.setSessionValue(tabId + "|Header.initRecordNumber", "0");
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("PREVIOUS_RELATION")) {

      String strInitRecord = vars.getSessionValue(tabId + "|Header.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      if (strInitRecord.equals("") || strInitRecord.equals("0")) {
        vars.setSessionValue(tabId + "|Header.initRecordNumber", "0");
      } else {
        int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
        initRecord -= intRecordRange;
        strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
        vars.setSessionValue(tabId + "|Header.initRecordNumber", strInitRecord);
      }
      vars.removeSessionValue(windowId + "|M_Requisition_ID");

      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("NEXT_RELATION")) {

      String strInitRecord = vars.getSessionValue(tabId + "|Header.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
      if (initRecord==0) initRecord=1;
      initRecord += intRecordRange;
      strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
      vars.setSessionValue(tabId + "|Header.initRecordNumber", strInitRecord);
      vars.removeSessionValue(windowId + "|M_Requisition_ID");

      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("FIRST")) {

      
      String strFirst = firstElement(vars, tableSQL);

      printPageEdit(response, request, vars, false, strFirst, tableSQL);
    } else if (vars.commandIn("LAST_RELATION")) {

      String strLast = lastElement(vars, tableSQL);
      printPageDataSheet(response, vars, strLast, tableSQL);
    } else if (vars.commandIn("LAST")) {

      
      String strLast = lastElement(vars, tableSQL);

      printPageEdit(response, request, vars, false, strLast, tableSQL);
    } else if (vars.commandIn("SAVE_NEW_RELATION", "SAVE_NEW_NEW", "SAVE_NEW_EDIT")) {

      OBError myError = new OBError();      
      int total = saveRecord(vars, myError, 'I');      
      if (!myError.isEmpty()) {        
        response.sendRedirect(strDireccion + request.getServletPath() + "?Command=NEW");
      } 
      else {
		if (myError.isEmpty()) {
		  myError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=RowsInserted");
		  myError.setMessage(total + " " + myError.getMessage());
		  vars.setMessage(tabId, myError);
		}        
        if (vars.commandIn("SAVE_NEW_NEW")) response.sendRedirect(strDireccion + request.getServletPath() + "?Command=NEW");
        else if (vars.commandIn("SAVE_NEW_EDIT")) response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        else response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
      }
    } else if (vars.commandIn("SAVE_EDIT_RELATION", "SAVE_EDIT_NEW", "SAVE_EDIT_EDIT", "SAVE_EDIT_NEXT")) {

      String strM_Requisition_ID = vars.getRequiredGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID");
      OBError myError = new OBError();
      int total = saveRecord(vars, myError, 'U');      
      if (!myError.isEmpty()) {
        response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
      } 
      else {
        if (myError.isEmpty()) {
          myError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=RowsUpdated");
          myError.setMessage(total + " " + myError.getMessage());
          vars.setMessage(tabId, myError);
        }
        if (vars.commandIn("SAVE_EDIT_NEW")) response.sendRedirect(strDireccion + request.getServletPath() + "?Command=NEW");
        else if (vars.commandIn("SAVE_EDIT_EDIT")) response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        else if (vars.commandIn("SAVE_EDIT_NEXT")) {
          String strNext = nextElement(vars, strM_Requisition_ID, tableSQL);
          vars.setSessionValue(windowId + "|M_Requisition_ID", strNext);
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        } else response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
      }
    } else if (vars.commandIn("DELETE")) {

      String strM_Requisition_ID = vars.getRequiredStringParameter("inpmRequisitionId");
      //HeaderData data = getEditVariables(vars);
      int total = 0;
      OBError myError = null;
      if (org.openbravo.erpCommon.utility.WindowAccessData.hasNotDeleteAccess(this, vars.getRole(), tabId)) {
        myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
        vars.setMessage(tabId, myError);
      } else {
        try {
          total = HeaderData.delete(this, strM_Requisition_ID, Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), Utility.getContext(this, vars, "#User_Org", windowId, accesslevel));
        } catch(ServletException ex) {
          myError = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          if (!myError.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myError);
        }
        if (myError==null && total==0) {
          myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
        }
        vars.removeSessionValue(windowId + "|mRequisitionId");
        vars.setSessionValue(tabId + "|Header.view", "RELATION");
      }
      if (myError==null) {
        myError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=RowsDeleted");
        myError.setMessage(total + " " + myError.getMessage());
        vars.setMessage(tabId, myError);
      }
      response.sendRedirect(strDireccion + request.getServletPath());

     } else if (vars.commandIn("BUTTONCreatepo1004400000")) {
        vars.setSessionValue("button1004400000.strcreatepo", vars.getStringParameter("inpcreatepo"));
        vars.setSessionValue("button1004400000.strProcessing", vars.getStringParameter("inpprocessing", "Y"));
        vars.setSessionValue("button1004400000.strOrg", vars.getStringParameter("inpadOrgId"));
        vars.setSessionValue("button1004400000.strClient", vars.getStringParameter("inpadClientId"));
        
        
        HashMap<String, String> p = new HashMap<String, String>();
        p.put("AD_Org_ID", vars.getStringParameter("inpadOrgId"));

        
        //Save in session needed params for combos if needed
        vars.setSessionObject("button1004400000.originalParams", FieldProviderFactory.getFieldProvider(p));
        printPageButtonFS(response, vars, "1004400000", request.getServletPath());    
     } else if (vars.commandIn("BUTTON1004400000")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
        String strcreatepo = vars.getSessionValue("button1004400000.strcreatepo");
        String strProcessing = vars.getSessionValue("button1004400000.strProcessing");
        String strOrg = vars.getSessionValue("button1004400000.strOrg");
        String strClient = vars.getSessionValue("button1004400000.strClient");
        
        
        if ((org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) || !(Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),strClient)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),strOrg))){
          OBError myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
          printPageClosePopUp(response, vars);
        }else{       
          printPageButtonCreatepo1004400000(response, vars, strM_Requisition_ID, strcreatepo, strProcessing);
        }

     } else if (vars.commandIn("BUTTONDocActionFB10EB0C8B584BCBA063FDE50E0B7A44")) {
        vars.setSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.strdocaction", vars.getStringParameter("inpdocaction"));
        vars.setSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.strProcessing", vars.getStringParameter("inpprocessing", "Y"));
        vars.setSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.strOrg", vars.getStringParameter("inpadOrgId"));
        vars.setSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.strClient", vars.getStringParameter("inpadClientId"));
        vars.setSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.inpdocstatus", vars.getRequiredStringParameter("inpdocstatus"));

        
        HashMap<String, String> p = new HashMap<String, String>();
        
        
        //Save in session needed params for combos if needed
        vars.setSessionObject("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.originalParams", FieldProviderFactory.getFieldProvider(p));
        printPageButtonFS(response, vars, "FB10EB0C8B584BCBA063FDE50E0B7A44", request.getServletPath());    
     } else if (vars.commandIn("BUTTONFB10EB0C8B584BCBA063FDE50E0B7A44")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
        String strdocaction = vars.getSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.strdocaction");
        String strProcessing = vars.getSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.strProcessing");
        String strOrg = vars.getSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.strOrg");
        String strClient = vars.getSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.strClient");
        
        String strdocstatus = vars.getSessionValue("buttonFB10EB0C8B584BCBA063FDE50E0B7A44.inpdocstatus");
String stradTableId = "800212";

        if ((org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) || !(Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),strClient)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),strOrg))){
          OBError myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
          printPageClosePopUp(response, vars);
        }else{       
          printPageButtonDocActionFB10EB0C8B584BCBA063FDE50E0B7A44(response, vars, strM_Requisition_ID, strdocaction, strProcessing, strdocstatus, stradTableId);
        }

     } else if (vars.commandIn("BUTTONEM_Gpp_Btnpersetujuan427DD76F78784831B02040B33F9822A1")) {
        vars.setSessionValue("button427DD76F78784831B02040B33F9822A1.stremGppBtnpersetujuan", vars.getStringParameter("inpemGppBtnpersetujuan"));
        vars.setSessionValue("button427DD76F78784831B02040B33F9822A1.strProcessing", vars.getStringParameter("inpprocessing", "Y"));
        vars.setSessionValue("button427DD76F78784831B02040B33F9822A1.strOrg", vars.getStringParameter("inpadOrgId"));
        vars.setSessionValue("button427DD76F78784831B02040B33F9822A1.strClient", vars.getStringParameter("inpadClientId"));
        
        
        HashMap<String, String> p = new HashMap<String, String>();
        
        
        //Save in session needed params for combos if needed
        vars.setSessionObject("button427DD76F78784831B02040B33F9822A1.originalParams", FieldProviderFactory.getFieldProvider(p));
        printPageButtonFS(response, vars, "427DD76F78784831B02040B33F9822A1", request.getServletPath());    
     } else if (vars.commandIn("BUTTON427DD76F78784831B02040B33F9822A1")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
        String stremGppBtnpersetujuan = vars.getSessionValue("button427DD76F78784831B02040B33F9822A1.stremGppBtnpersetujuan");
        String strProcessing = vars.getSessionValue("button427DD76F78784831B02040B33F9822A1.strProcessing");
        String strOrg = vars.getSessionValue("button427DD76F78784831B02040B33F9822A1.strOrg");
        String strClient = vars.getSessionValue("button427DD76F78784831B02040B33F9822A1.strClient");
        
        
        if ((org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) || !(Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),strClient)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),strOrg))){
          OBError myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
          printPageClosePopUp(response, vars);
        }else{       
          printPageButtonEM_Gpp_Btnpersetujuan427DD76F78784831B02040B33F9822A1(response, vars, strM_Requisition_ID, stremGppBtnpersetujuan, strProcessing);
        }

     } else if (vars.commandIn("BUTTONEM_Grq_Btnreceive88C781DF1DE84920902CCDC0B403456A")) {
        vars.setSessionValue("button88C781DF1DE84920902CCDC0B403456A.stremGrqBtnreceive", vars.getStringParameter("inpemGrqBtnreceive"));
        vars.setSessionValue("button88C781DF1DE84920902CCDC0B403456A.strProcessing", vars.getStringParameter("inpprocessing", "Y"));
        vars.setSessionValue("button88C781DF1DE84920902CCDC0B403456A.strOrg", vars.getStringParameter("inpadOrgId"));
        vars.setSessionValue("button88C781DF1DE84920902CCDC0B403456A.strClient", vars.getStringParameter("inpadClientId"));
        
        
        HashMap<String, String> p = new HashMap<String, String>();
        
        
        //Save in session needed params for combos if needed
        vars.setSessionObject("button88C781DF1DE84920902CCDC0B403456A.originalParams", FieldProviderFactory.getFieldProvider(p));
        printPageButtonFS(response, vars, "88C781DF1DE84920902CCDC0B403456A", request.getServletPath());    
     } else if (vars.commandIn("BUTTON88C781DF1DE84920902CCDC0B403456A")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
        String stremGrqBtnreceive = vars.getSessionValue("button88C781DF1DE84920902CCDC0B403456A.stremGrqBtnreceive");
        String strProcessing = vars.getSessionValue("button88C781DF1DE84920902CCDC0B403456A.strProcessing");
        String strOrg = vars.getSessionValue("button88C781DF1DE84920902CCDC0B403456A.strOrg");
        String strClient = vars.getSessionValue("button88C781DF1DE84920902CCDC0B403456A.strClient");
        
        
        if ((org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) || !(Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),strClient)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),strOrg))){
          OBError myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
          printPageClosePopUp(response, vars);
        }else{       
          printPageButtonEM_Grq_Btnreceive88C781DF1DE84920902CCDC0B403456A(response, vars, strM_Requisition_ID, stremGrqBtnreceive, strProcessing);
        }

     } else if (vars.commandIn("BUTTONEM_Gpr_BtnrevisiF65158BB58A84AAF92B50738FB5F5DD4")) {
        vars.setSessionValue("buttonF65158BB58A84AAF92B50738FB5F5DD4.stremGprBtnrevisi", vars.getStringParameter("inpemGprBtnrevisi"));
        vars.setSessionValue("buttonF65158BB58A84AAF92B50738FB5F5DD4.strProcessing", vars.getStringParameter("inpprocessing", "Y"));
        vars.setSessionValue("buttonF65158BB58A84AAF92B50738FB5F5DD4.strOrg", vars.getStringParameter("inpadOrgId"));
        vars.setSessionValue("buttonF65158BB58A84AAF92B50738FB5F5DD4.strClient", vars.getStringParameter("inpadClientId"));
        
        
        HashMap<String, String> p = new HashMap<String, String>();
        
        
        //Save in session needed params for combos if needed
        vars.setSessionObject("buttonF65158BB58A84AAF92B50738FB5F5DD4.originalParams", FieldProviderFactory.getFieldProvider(p));
        printPageButtonFS(response, vars, "F65158BB58A84AAF92B50738FB5F5DD4", request.getServletPath());    
     } else if (vars.commandIn("BUTTONF65158BB58A84AAF92B50738FB5F5DD4")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID", "");
        String stremGprBtnrevisi = vars.getSessionValue("buttonF65158BB58A84AAF92B50738FB5F5DD4.stremGprBtnrevisi");
        String strProcessing = vars.getSessionValue("buttonF65158BB58A84AAF92B50738FB5F5DD4.strProcessing");
        String strOrg = vars.getSessionValue("buttonF65158BB58A84AAF92B50738FB5F5DD4.strOrg");
        String strClient = vars.getSessionValue("buttonF65158BB58A84AAF92B50738FB5F5DD4.strClient");
        
        
        if ((org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) || !(Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),strClient)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),strOrg))){
          OBError myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
          printPageClosePopUp(response, vars);
        }else{       
          printPageButtonEM_Gpr_BtnrevisiF65158BB58A84AAF92B50738FB5F5DD4(response, vars, strM_Requisition_ID, stremGprBtnrevisi, strProcessing);
        }


    } else if (vars.commandIn("SAVE_BUTTONCreatepo1004400000")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpKey", windowId + "|M_Requisition_ID", "");
        @SuppressWarnings("unused")
        String strcreatepo = vars.getStringParameter("inpcreatepo");
        String strProcessing = vars.getStringParameter("inpprocessing");
        OBError myMessage = null;
        try {
          String pinstance = SequenceIdData.getUUID();
          PInstanceProcessData.insertPInstance(this, pinstance, "1004400000", (("M_Requisition_ID".equalsIgnoreCase("AD_Language"))?"0":strM_Requisition_ID), strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
          String strdateordered = vars.getStringParameter("inpdateordered");
PInstanceProcessData.insertPInstanceParamDate(this, pinstance, "10", "DateOrdered", strdateordered, vars.getClient(), vars.getOrg(), vars.getUser());
String stradOrgId = vars.getStringParameter("inpadOrgId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "11", "AD_Org_ID", stradOrgId, vars.getClient(), vars.getOrg(), vars.getUser());
String strmWarehouseId = vars.getStringParameter("inpmWarehouseId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "12", "M_Warehouse_ID", strmWarehouseId, vars.getClient(), vars.getOrg(), vars.getUser());
String strcBpartnerId = vars.getStringParameter("inpcBpartnerId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "C_BPartner_ID", strcBpartnerId, vars.getClient(), vars.getOrg(), vars.getUser());
String strmPricelistId = vars.getStringParameter("inpmPricelistId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "30", "M_PriceList_ID", strmPricelistId, vars.getClient(), vars.getOrg(), vars.getUser());

          
          ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
          new ProcessRunner(bundle).execute(this);
          
          PInstanceProcessData[] pinstanceData = PInstanceProcessData.select(this, pinstance);
          myMessage = Utility.getProcessInstanceMessage(this, vars, pinstanceData);
        } catch (ServletException ex) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          if (!myMessage.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myMessage);
        }
        //close popup
        if (myMessage!=null) {
          if (log4j.isDebugEnabled()) log4j.debug(myMessage.getMessage());
          vars.setMessage(tabId, myMessage);
        }
        printPageClosePopUp(response, vars);
    } else if (vars.commandIn("SAVE_BUTTONDocActionFB10EB0C8B584BCBA063FDE50E0B7A44")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpKey", windowId + "|M_Requisition_ID", "");
        @SuppressWarnings("unused")
        String strdocaction = vars.getStringParameter("inpdocaction");
        String strProcessing = vars.getStringParameter("inpprocessing");
        OBError myMessage = null;
        try {
          String pinstance = SequenceIdData.getUUID();
          PInstanceProcessData.insertPInstance(this, pinstance, "FB10EB0C8B584BCBA063FDE50E0B7A44", (("M_Requisition_ID".equalsIgnoreCase("AD_Language"))?"0":strM_Requisition_ID), strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
          
          HeaderData.updateDocAction(this, strdocaction, strM_Requisition_ID);

          ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
          new ProcessRunner(bundle).execute(this);
          
          PInstanceProcessData[] pinstanceData = PInstanceProcessData.select(this, pinstance);
          myMessage = Utility.getProcessInstanceMessage(this, vars, pinstanceData);
        } catch (ServletException ex) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          if (!myMessage.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myMessage);
        }
        //close popup
        if (myMessage!=null) {
          if (log4j.isDebugEnabled()) log4j.debug(myMessage.getMessage());
          vars.setMessage(tabId, myMessage);
        }
        printPageClosePopUp(response, vars);
    } else if (vars.commandIn("SAVE_BUTTONEM_Gpp_Btnpersetujuan427DD76F78784831B02040B33F9822A1")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpKey", windowId + "|M_Requisition_ID", "");
        @SuppressWarnings("unused")
        String stremGppBtnpersetujuan = vars.getStringParameter("inpemGppBtnpersetujuan");
        String strProcessing = vars.getStringParameter("inpprocessing");
        OBError myMessage = null;
        try {
          String pinstance = SequenceIdData.getUUID();
          PInstanceProcessData.insertPInstance(this, pinstance, "427DD76F78784831B02040B33F9822A1", (("M_Requisition_ID".equalsIgnoreCase("AD_Language"))?"0":strM_Requisition_ID), strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
          
          
          ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
          new ProcessRunner(bundle).execute(this);
          
          PInstanceProcessData[] pinstanceData = PInstanceProcessData.select(this, pinstance);
          myMessage = Utility.getProcessInstanceMessage(this, vars, pinstanceData);
        } catch (ServletException ex) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          if (!myMessage.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myMessage);
        }
        //close popup
        if (myMessage!=null) {
          if (log4j.isDebugEnabled()) log4j.debug(myMessage.getMessage());
          vars.setMessage(tabId, myMessage);
        }
        printPageClosePopUp(response, vars);
    } else if (vars.commandIn("SAVE_BUTTONEM_Grq_Btnreceive88C781DF1DE84920902CCDC0B403456A")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpKey", windowId + "|M_Requisition_ID", "");
        @SuppressWarnings("unused")
        String stremGrqBtnreceive = vars.getStringParameter("inpemGrqBtnreceive");
        String strProcessing = vars.getStringParameter("inpprocessing");
        OBError myMessage = null;
        try {
          String pinstance = SequenceIdData.getUUID();
          PInstanceProcessData.insertPInstance(this, pinstance, "88C781DF1DE84920902CCDC0B403456A", (("M_Requisition_ID".equalsIgnoreCase("AD_Language"))?"0":strM_Requisition_ID), strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
          String strgmmMetodepembelianId = vars.getStringParameter("inpgmmMetodepembelianId");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "10", "GMM_MetodePembelian_ID", strgmmMetodepembelianId, vars.getClient(), vars.getOrg(), vars.getUser());
String strgppPersetujuanpembelian = vars.getStringParameter("inpgppPersetujuanpembelian", "N");
PInstanceProcessData.insertPInstanceParam(this, pinstance, "20", "GPP_PersetujuanPembelian", strgppPersetujuanpembelian, vars.getClient(), vars.getOrg(), vars.getUser());

          
          ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
          new ProcessRunner(bundle).execute(this);
          
          PInstanceProcessData[] pinstanceData = PInstanceProcessData.select(this, pinstance);
          myMessage = Utility.getProcessInstanceMessage(this, vars, pinstanceData);
        } catch (ServletException ex) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          if (!myMessage.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myMessage);
        }
        //close popup
        if (myMessage!=null) {
          if (log4j.isDebugEnabled()) log4j.debug(myMessage.getMessage());
          vars.setMessage(tabId, myMessage);
        }
        printPageClosePopUp(response, vars);
    } else if (vars.commandIn("SAVE_BUTTONEM_Gpr_BtnrevisiF65158BB58A84AAF92B50738FB5F5DD4")) {
        String strM_Requisition_ID = vars.getGlobalVariable("inpKey", windowId + "|M_Requisition_ID", "");
        @SuppressWarnings("unused")
        String stremGprBtnrevisi = vars.getStringParameter("inpemGprBtnrevisi");
        String strProcessing = vars.getStringParameter("inpprocessing");
        OBError myMessage = null;
        try {
          String pinstance = SequenceIdData.getUUID();
          PInstanceProcessData.insertPInstance(this, pinstance, "F65158BB58A84AAF92B50738FB5F5DD4", (("M_Requisition_ID".equalsIgnoreCase("AD_Language"))?"0":strM_Requisition_ID), strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
          
          
          ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
          new ProcessRunner(bundle).execute(this);
          
          PInstanceProcessData[] pinstanceData = PInstanceProcessData.select(this, pinstance);
          myMessage = Utility.getProcessInstanceMessage(this, vars, pinstanceData);
        } catch (ServletException ex) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          if (!myMessage.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myMessage);
        }
        //close popup
        if (myMessage!=null) {
          if (log4j.isDebugEnabled()) log4j.debug(myMessage.getMessage());
          vars.setMessage(tabId, myMessage);
        }
        printPageClosePopUp(response, vars);






    } else if (vars.commandIn("SAVE_XHR")) {
      
      OBError myError = new OBError();
      JSONObject result = new JSONObject();
      String commandType = vars.getStringParameter("inpCommandType");
      char saveType = "NEW".equals(commandType) ? 'I' : 'U';
      try {
        int total = saveRecord(vars, myError, saveType);
        if (myError.isEmpty()) {
          myError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=RowsUpdated");
          myError.setMessage(total + " " + myError.getMessage());
          myError.setType("Success");
        }
        result.put("oberror", myError.toMap());
        result.put("tabid", vars.getStringParameter("tabID"));
        result.put("redirect", strDireccion + request.getServletPath() + "?Command=" + commandType);
      } catch (Exception e) {
        log4j.error("Error saving record (XHR request): " + e.getMessage(), e);
        myError.setType("Error");
        myError.setMessage(e.getMessage());
      }

      response.setContentType("application/json");
      PrintWriter out = response.getWriter();
      out.print(result.toString());
      out.flush();
      out.close();
    } else if (vars.getCommand().toUpperCase().startsWith("BUTTON") || vars.getCommand().toUpperCase().startsWith("SAVE_BUTTON")) {
      pageErrorPopUp(response);
    } else pageError(response);
  }
  private HeaderData getEditVariables(Connection con, VariablesSecureApp vars) throws IOException,ServletException {
    HeaderData data = new HeaderData();
    ServletException ex = null;
    try {
    data.adOrgId = vars.getRequiredGlobalVariable("inpadOrgId", windowId + "|AD_Org_ID");     data.adOrgIdr = vars.getStringParameter("inpadOrgId_R");     data.documentno = vars.getRequiredStringParameter("inpdocumentno");     data.description = vars.getStringParameter("inpdescription");     data.cBpartnerId = vars.getStringParameter("inpcBpartnerId");     data.cBpartnerIdr = vars.getStringParameter("inpcBpartnerId_R");     data.adUserId = vars.getRequiredStringParameter("inpadUserId");     data.adUserIdr = vars.getStringParameter("inpadUserId_R");     data.mPricelistId = vars.getRequestGlobalVariable("inpmPricelistId", windowId + "|M_PriceList_ID");     data.mPricelistIdr = vars.getStringParameter("inpmPricelistId_R");     data.cCurrencyId = vars.getRequestGlobalVariable("inpcCurrencyId", windowId + "|C_Currency_ID");     data.cCurrencyIdr = vars.getStringParameter("inpcCurrencyId_R");     data.createpo = vars.getRequiredStringParameter("inpcreatepo");     data.docstatus = vars.getRequiredStringParameter("inpdocstatus");     data.docaction = vars.getRequiredStringParameter("inpdocaction");     data.emGppPersetujuan = vars.getStringParameter("inpemGppPersetujuan", "N");     data.emGppBtnpersetujuan = vars.getRequiredStringParameter("inpemGppBtnpersetujuan");     data.emGbgBudgetId = vars.getStringParameter("inpemGbgBudgetId");     data.emGmmMetodepembelianId = vars.getStringParameter("inpemGmmMetodepembelianId");     data.emGmmMetodepembelianIdr = vars.getStringParameter("inpemGmmMetodepembelianId_R");     data.emGprNomorpenawaran = vars.getStringParameter("inpemGprNomorpenawaran");     data.emGprTanggalpenawaran = vars.getStringParameter("inpemGprTanggalpenawaran");     data.emGrqReceivestatus = vars.getRequiredStringParameter("inpemGrqReceivestatus");     data.emGrqReceivestatusr = vars.getStringParameter("inpemGrqReceivestatus_R");     data.emGrqBtnreceive = vars.getRequiredStringParameter("inpemGrqBtnreceive");     data.emGprBtnrevisi = vars.getRequiredStringParameter("inpemGprBtnrevisi");     data.isactive = vars.getStringParameter("inpisactive", "N");     data.adClientId = vars.getRequiredGlobalVariable("inpadClientId", windowId + "|AD_Client_ID");     data.mRequisitionId = vars.getRequestGlobalVariable("inpmRequisitionId", windowId + "|M_Requisition_ID");     data.processing = vars.getStringParameter("inpprocessing", "N");     data.processed = vars.getStringParameter("inpprocessed", "N"); 
      data.createdby = vars.getUser();
      data.updatedby = vars.getUser();
      data.adUserClient = Utility.getContext(this, vars, "#User_Client", windowId, accesslevel);
      data.adOrgClient = Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel);
      data.updatedTimeStamp = vars.getStringParameter("updatedTimestamp");



    
         if (data.documentno.startsWith("<")) data.documentno = Utility.getDocumentNo(con, this, vars, windowId, "M_Requisition", "", "", false, true);

    
    }
    catch(ServletException e) {
    	vars.setEditionData(tabId, data);
    	throw e;
    }
    // Behavior with exception for numeric fields is to catch last one if we have multiple ones
    if(ex != null) {
      vars.setEditionData(tabId, data);
      throw ex;
    }
    return data;
  }




    private void refreshSessionEdit(VariablesSecureApp vars, FieldProvider[] data) {
      if (data==null || data.length==0) return;
          vars.setSessionValue(windowId + "|AD_Org_ID", data[0].getField("adOrgId"));    vars.setSessionValue(windowId + "|M_PriceList_ID", data[0].getField("mPricelistId"));    vars.setSessionValue(windowId + "|C_Currency_ID", data[0].getField("cCurrencyId"));    vars.setSessionValue(windowId + "|AD_Client_ID", data[0].getField("adClientId"));    vars.setSessionValue(windowId + "|M_Requisition_ID", data[0].getField("mRequisitionId"));
    }

    private void refreshSessionNew(VariablesSecureApp vars) throws IOException,ServletException {
      HeaderData[] data = HeaderData.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), vars.getStringParameter("inpmRequisitionId", ""), Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
      if (data==null || data.length==0) return;
      refreshSessionEdit(vars, data);
    }

  private String nextElement(VariablesSecureApp vars, String strSelected, TableSQLData tableSQL) throws IOException, ServletException {
    if (strSelected == null || strSelected.equals("")) return firstElement(vars, tableSQL);
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(), 0, 0);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.NEXT, strSelected, tableSQL.getKeyColumn());
      } catch (Exception e) { 
        log4j.error("Error getting next element", e);
      }
      if (data!=null) {
        if (data!=null) return data;
      }
    }
    return strSelected;
  }

  private int getKeyPosition(VariablesSecureApp vars, String strSelected, TableSQLData tableSQL) throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("getKeyPosition: " + strSelected);
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(),0,0);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.GETPOSITION, strSelected, tableSQL.getKeyColumn());
      } catch (Exception e) { 
        log4j.error("Error getting key position", e);
      }
      if (data!=null) {
        // split offset -> (page,relativeOffset)
        int absoluteOffset = Integer.valueOf(data);
        int page = absoluteOffset / TableSQLData.maxRowsPerGridPage;
        int relativeOffset = absoluteOffset % TableSQLData.maxRowsPerGridPage;
        log4j.debug("getKeyPosition: absOffset: " + absoluteOffset + "=> page: " + page + " relOffset: " + relativeOffset);
        String currPageKey = tabId + "|" + "currentPage";
        vars.setSessionValue(currPageKey, String.valueOf(page));
        return relativeOffset;
      }
    }
    return 0;
  }

  private String previousElement(VariablesSecureApp vars, String strSelected, TableSQLData tableSQL) throws IOException, ServletException {
    if (strSelected == null || strSelected.equals("")) return firstElement(vars, tableSQL);
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(),0,0);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.PREVIOUS, strSelected, tableSQL.getKeyColumn());
      } catch (Exception e) { 
        log4j.error("Error getting previous element", e);
      }
      if (data!=null) {
        return data;
      }
    }
    return strSelected;
  }

  private String firstElement(VariablesSecureApp vars, TableSQLData tableSQL) throws IOException, ServletException {
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(),0,1);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.FIRST, "", tableSQL.getKeyColumn());

      } catch (Exception e) { 
        log4j.debug("Error getting first element", e);
      }
      if (data!=null) return data;
    }
    return "";
  }

  private String lastElement(VariablesSecureApp vars, TableSQLData tableSQL) throws IOException, ServletException {
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(),0,0);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.LAST, "", tableSQL.getKeyColumn());
      } catch (Exception e) { 
        log4j.error("Error getting last element", e);
      }
      if (data!=null) return data;
    }
    return "";
  }

  private void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, String strM_Requisition_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: dataSheet");

    String strParamDocumentNo = vars.getSessionValue(tabId + "|paramDocumentNo");
String strParamC_BPartner_ID = vars.getSessionValue(tabId + "|paramC_BPartner_ID");
String strParamDocStatus = vars.getSessionValue(tabId + "|paramDocStatus");

    boolean hasSearchCondition=false;
    vars.removeEditionData(tabId);
    hasSearchCondition = (tableSQL.hasInternalFilter() && ("").equals(strParamDocumentNo) && ("").equals(strParamC_BPartner_ID) && ("").equals(strParamDocStatus)) || !(("").equals(strParamDocumentNo) || ("%").equals(strParamDocumentNo))  || !(("").equals(strParamC_BPartner_ID) || ("%").equals(strParamC_BPartner_ID))  || !(("").equals(strParamDocStatus) || ("%").equals(strParamDocStatus)) ;
    String strOffset = vars.getSessionValue(tabId + "|offset");
    String selectedRow = "0";
    if (!strM_Requisition_ID.equals("")) {
      selectedRow = Integer.toString(getKeyPosition(vars, strM_Requisition_ID, tableSQL));
    }

    String[] discard={"isNotFiltered","isNotTest"};
    if (hasSearchCondition) discard[0] = new String("isFiltered");
    if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpWindows/ManageRequisitions/Header_Relation", discard).createXmlDocument();

    boolean hasReadOnlyAccess = org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId);
    ToolBar toolbar = new ToolBar(this, true, vars.getLanguage(), "Header", false, "document.frmMain.inpmRequisitionId", "grid", "..", "".equals("Y"), "ManageRequisitions", strReplaceWith, false, false, false, false, !hasReadOnlyAccess);
    toolbar.setTabId(tabId);
    
    toolbar.setDeleteable(true && !hasReadOnlyAccess);
    toolbar.prepareRelationTemplate("N".equals("Y"), hasSearchCondition, !vars.getSessionValue("#ShowTest", "N").equals("Y"), false, Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    xmlDocument.setParameter("toolbar", toolbar.toString());



    StringBuffer orderByArray = new StringBuffer();
      vars.setSessionValue(tabId + "|newOrder", "1");
      String positions = vars.getSessionValue(tabId + "|orderbyPositions");
      orderByArray.append("var orderByPositions = new Array(\n");
      if (!positions.equals("")) {
        StringTokenizer tokens=new StringTokenizer(positions, ",");
        boolean firstOrder = true;
        while(tokens.hasMoreTokens()){
          if (!firstOrder) orderByArray.append(",\n");
          orderByArray.append("\"").append(tokens.nextToken()).append("\"");
          firstOrder = false;
        }
      }
      orderByArray.append(");\n");
      String directions = vars.getSessionValue(tabId + "|orderbyDirections");
      orderByArray.append("var orderByDirections = new Array(\n");
      if (!positions.equals("")) {
        StringTokenizer tokens=new StringTokenizer(directions, ",");
        boolean firstOrder = true;
        while(tokens.hasMoreTokens()){
          if (!firstOrder) orderByArray.append(",\n");
          orderByArray.append("\"").append(tokens.nextToken()).append("\"");
          firstOrder = false;
        }
      }
      orderByArray.append(");\n");
//    }

    xmlDocument.setParameter("selectedColumn", "\nvar selectedRow = " + selectedRow + ";\n" + orderByArray.toString());
    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
    xmlDocument.setParameter("windowId", windowId);
    xmlDocument.setParameter("KeyName", "mRequisitionId");
    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("theme", vars.getTheme());
    //xmlDocument.setParameter("buttonReference", Utility.messageBD(this, "Reference", vars.getLanguage()));
    try {
      WindowTabs tabs = new WindowTabs(this, vars, tabId, windowId, false);
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      String hideBackButton = vars.getGlobalVariable("hideMenu", "#Hide_BackButton", "");
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "Header_Relation.html", "ManageRequisitions", "W", strReplaceWith, tabs.breadcrumb(), hideBackButton.equals("true"));
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "Header_Relation.html", strReplaceWith);
      xmlDocument.setParameter("leftTabs", lBar.relationTemplate());
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
    {
      OBError myMessage = vars.getMessage(tabId);
      vars.removeMessage(tabId);
      if (myMessage!=null) {
        xmlDocument.setParameter("messageType", myMessage.getType());
        xmlDocument.setParameter("messageTitle", myMessage.getTitle());
        xmlDocument.setParameter("messageMessage", myMessage.getMessage());
      }
    }


    xmlDocument.setParameter("grid", Utility.getContext(this, vars, "#RecordRange", windowId));
xmlDocument.setParameter("grid_Offset", strOffset);
xmlDocument.setParameter("grid_SortCols", positions);
xmlDocument.setParameter("grid_SortDirs", directions);
xmlDocument.setParameter("grid_Default", selectedRow);


    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(xmlDocument.print());
    out.close();
  }

  private void printPageEdit(HttpServletResponse response, HttpServletRequest request, VariablesSecureApp vars,boolean boolNew, String strM_Requisition_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: edit");
    
    HashMap<String, String> usedButtonShortCuts;
  
    HashMap<String, String> reservedButtonShortCuts;
  
    usedButtonShortCuts = new HashMap<String, String>();
    
    reservedButtonShortCuts = new HashMap<String, String>();
    
    
    
    String strOrderByFilter = vars.getSessionValue(tabId + "|orderby");
    String orderClause = " 1";
    if (strOrderByFilter==null || strOrderByFilter.equals("")) strOrderByFilter = orderClause;
    /*{
      if (!strOrderByFilter.equals("") && !orderClause.equals("")) strOrderByFilter += ", ";
      strOrderByFilter += orderClause;
    }*/
    
    
    String strCommand = null;
    HeaderData[] data=null;
    XmlDocument xmlDocument=null;
    FieldProvider dataField = vars.getEditionData(tabId);
    vars.removeEditionData(tabId);
    String strParamDocumentNo = vars.getSessionValue(tabId + "|paramDocumentNo");
String strParamC_BPartner_ID = vars.getSessionValue(tabId + "|paramC_BPartner_ID");
String strParamDocStatus = vars.getSessionValue(tabId + "|paramDocStatus");

    boolean hasSearchCondition=false;
    hasSearchCondition = (tableSQL.hasInternalFilter() && ("").equals(strParamDocumentNo) && ("").equals(strParamC_BPartner_ID) && ("").equals(strParamDocStatus)) || !(("").equals(strParamDocumentNo) || ("%").equals(strParamDocumentNo))  || !(("").equals(strParamC_BPartner_ID) || ("%").equals(strParamC_BPartner_ID))  || !(("").equals(strParamDocStatus) || ("%").equals(strParamDocStatus)) ;

       String strParamSessionDate = vars.getGlobalVariable("inpParamSessionDate", Utility.getTransactionalDate(this, vars, windowId), "");
      String buscador = "";
      String[] discard = {"", "isNotTest"};
      
      if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    if (dataField==null) {
      if (!boolNew) {
        discard[0] = new String("newDiscard");
        data = HeaderData.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strM_Requisition_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
  
        if (!strM_Requisition_ID.equals("") && (data == null || data.length==0)) {
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
          return;
        }
        refreshSessionEdit(vars, data);
        strCommand = "EDIT";
      }

      if (boolNew || data==null || data.length==0) {
        discard[0] = new String ("editDiscard");
        strCommand = "NEW";
        data = new HeaderData[0];
      } else {
        discard[0] = new String ("newDiscard");
      }
    } else {
      if (dataField.getField("mRequisitionId") == null || dataField.getField("mRequisitionId").equals("")) {
        discard[0] = new String ("editDiscard");
        strCommand = "NEW";
        boolNew = true;
      } else {
        discard[0] = new String ("newDiscard");
        strCommand = "EDIT";
      }
    }
    
    
    
    if (dataField==null) {
      if (boolNew || data==null || data.length==0) {
        refreshSessionNew(vars);
        data = HeaderData.set(Utility.getDefault(this, vars, "EM_Gpp_Persetujuan", "N", "1004400000", "N", dataField), Utility.getDefault(this, vars, "Createpo", "N", "1004400000", "N", dataField), Utility.getDefault(this, vars, "DocStatus", "DR", "1004400000", "", dataField), Utility.getDefault(this, vars, "DocAction", "CO", "1004400000", "N", dataField), (vars.getLanguage().equals("en_US")?ListData.selectName(this, "135", Utility.getDefault(this, vars, "DocAction", "CO", "1004400000", "N", dataField)):ListData.selectNameTrl(this, vars.getLanguage(), "135", Utility.getDefault(this, vars, "DocAction", "CO", "1004400000", "N", dataField))), Utility.getDefault(this, vars, "Processed", "N", "1004400000", "N", dataField), Utility.getDefault(this, vars, "AD_User_ID", "@#AD_User_ID@", "1004400000", "", dataField), Utility.getDefault(this, vars, "Processing", "N", "1004400000", "N", dataField), Utility.getDefault(this, vars, "EM_Gpr_Nomorpenawaran", "", "1004400000", "", dataField), Utility.getDefault(this, vars, "EM_Gpr_Tanggalpenawaran", "", "1004400000", "", dataField), Utility.getDefault(this, vars, "EM_Gpr_Btnrevisi", "N", "1004400000", "N", dataField), Utility.getDefault(this, vars, "EM_Grq_Receivestatus", "NR", "1004400000", "", dataField), Utility.getDefault(this, vars, "EM_Grq_Btnreceive", "N", "1004400000", "N", dataField), "", Utility.getDefault(this, vars, "AD_Client_ID", "@AD_CLIENT_ID@", "1004400000", "", dataField), Utility.getDefault(this, vars, "AD_Org_ID", "@AD_ORG_ID@", "1004400000", "", dataField), "Y", Utility.getDefault(this, vars, "Createdby", "", "1004400000", "", dataField), HeaderData.selectDef803534_0(this, Utility.getDefault(this, vars, "Createdby", "", "1004400000", "", dataField)), Utility.getDefault(this, vars, "Updatedby", "", "1004400000", "", dataField), HeaderData.selectDef803536_1(this, Utility.getDefault(this, vars, "Updatedby", "", "1004400000", "", dataField)), Utility.getDefault(this, vars, "Description", "", "1004400000", "", dataField), Utility.getDefault(this, vars, "DocumentNo", "", "1004400000", "", dataField), Utility.getDefault(this, vars, "C_BPartner_ID", "", "1004400000", "", dataField), HeaderData.selectDef803539_2(this, Utility.getDefault(this, vars, "C_BPartner_ID", "", "1004400000", "", dataField)), Utility.getDefault(this, vars, "M_PriceList_ID", "", "1004400000", "", dataField), Utility.getDefault(this, vars, "C_Currency_ID", "", "1004400000", "", dataField), Utility.getDefault(this, vars, "EM_Gmm_Metodepembelian_ID", "", "1004400000", "", dataField), Utility.getDefault(this, vars, "EM_Gpp_Btnpersetujuan", "N", "1004400000", "N", dataField), Utility.getDefault(this, vars, "EM_Gbg_Budget_ID", "", "1004400000", "", dataField));
             data[0].documentno = "<" + Utility.getDocumentNo( this, vars, windowId, "M_Requisition", "", "", false, false) + ">";
      }
     }
      
    
    String currentOrg = (boolNew?"":(dataField!=null?dataField.getField("adOrgId"):data[0].getField("adOrgId")));
    if (!currentOrg.equals("") && !currentOrg.startsWith("'")) currentOrg = "'"+currentOrg+"'";
    String currentClient = (boolNew?"":(dataField!=null?dataField.getField("adClientId"):data[0].getField("adClientId")));
    if (!currentClient.equals("") && !currentClient.startsWith("'")) currentClient = "'"+currentClient+"'";
    
    boolean hasReadOnlyAccess = org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId);
    boolean editableTab = (!hasReadOnlyAccess && (currentOrg.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),currentOrg)) && (currentClient.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), currentClient)));
    if (editableTab)
      xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpWindows/ManageRequisitions/Header_Edition",discard).createXmlDocument();
    else
      xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpWindows/ManageRequisitions/Header_NonEditable",discard).createXmlDocument();

    xmlDocument.setParameter("tabId", tabId);
    ToolBar toolbar = new ToolBar(this, editableTab, vars.getLanguage(), "Header", (strCommand.equals("NEW") || boolNew || (dataField==null && (data==null || data.length==0))), "document.frmMain.inpmRequisitionId", "", "..", "".equals("Y"), "ManageRequisitions", strReplaceWith, true, false, false, Utility.hasTabAttachments(this, vars, tabId, strM_Requisition_ID), !hasReadOnlyAccess);
    toolbar.setTabId(tabId);
    toolbar.setDeleteable(true);
    toolbar.prepareEditionTemplate("N".equals("Y"), hasSearchCondition, vars.getSessionValue("#ShowTest", "N").equals("Y"), "STD", Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    xmlDocument.setParameter("toolbar", toolbar.toString());

    // set updated timestamp to manage locking mechanism
    if (!boolNew) {
      xmlDocument.setParameter("updatedTimestamp", (dataField != null ? dataField
          .getField("updatedTimeStamp") : data[0].getField("updatedTimeStamp")));
    }
    
    boolean concurrentSave = vars.getSessionValue(tabId + "|concurrentSave").equals("true");
    if (concurrentSave) {
      //after concurrent save error, force autosave
      xmlDocument.setParameter("autosave", "Y");
    } else {
      xmlDocument.setParameter("autosave", "N");
    }
    vars.removeSessionValue(tabId + "|concurrentSave");

    try {
      WindowTabs tabs = new WindowTabs(this, vars, tabId, windowId, true, (strCommand.equalsIgnoreCase("NEW")));
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      // if (!strM_Requisition_ID.equals("")) xmlDocument.setParameter("childTabContainer", tabs.childTabs(false));
	  // else xmlDocument.setParameter("childTabContainer", tabs.childTabs(true));
	  xmlDocument.setParameter("childTabContainer", tabs.childTabs(false));
	  String hideBackButton = vars.getGlobalVariable("hideMenu", "#Hide_BackButton", "");
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "Header_Relation.html", "ManageRequisitions", "W", strReplaceWith, tabs.breadcrumb(), hideBackButton.equals("true"), !concurrentSave);
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "Header_Relation.html", strReplaceWith);
      xmlDocument.setParameter("leftTabs", lBar.editionTemplate(strCommand.equals("NEW")));
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
		
    
    
    xmlDocument.setParameter("commandType", strCommand);
    xmlDocument.setParameter("buscador",buscador);
    xmlDocument.setParameter("windowId", windowId);
    xmlDocument.setParameter("changed", "");
    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("theme", vars.getTheme());
    final String strMappingName = Utility.getTabURL(tabId, "E", false);
    xmlDocument.setParameter("mappingName", strMappingName);
    xmlDocument.setParameter("confirmOnChanges", Utility.getJSConfirmOnChanges(vars, windowId));
    //xmlDocument.setParameter("buttonReference", Utility.messageBD(this, "Reference", vars.getLanguage()));

    xmlDocument.setParameter("paramSessionDate", strParamSessionDate);

    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
    OBError myMessage = vars.getMessage(tabId);
    vars.removeMessage(tabId);
    if (myMessage!=null) {
      xmlDocument.setParameter("messageType", myMessage.getType());
      xmlDocument.setParameter("messageTitle", myMessage.getTitle());
      xmlDocument.setParameter("messageMessage", myMessage.getMessage());
    }
    xmlDocument.setParameter("displayLogic", getDisplayLogicContext(vars, boolNew));
    
    
     if (dataField==null) {
      xmlDocument.setData("structure1",data);
      
    } else {
      
        FieldProvider[] dataAux = new FieldProvider[1];
        dataAux[0] = dataField;
        
        xmlDocument.setData("structure1",dataAux);
      
    }
    
      
   
    try {
      ComboTableData comboTableData = null;
String userOrgList = "";
if (editableTab) 
  userOrgList=Utility.getContext(this, vars, "#User_Org", windowId, accesslevel); //editable record 
else 
  userOrgList=currentOrg;
comboTableData = new ComboTableData(vars, this, "19", "AD_Org_ID", "", "", userOrgList, Utility.getContext(this, vars, "#User_Client", windowId), 0);
Utility.fillSQLParameters(this, vars, (dataField==null?data[0]:dataField), comboTableData, windowId, (dataField==null?data[0].getField("adOrgId"):dataField.getField("adOrgId")));
xmlDocument.setData("reportAD_Org_ID","liststructure", comboTableData.select(!strCommand.equals("NEW")));
comboTableData = null;
comboTableData = new ComboTableData(vars, this, "19", "AD_User_ID", "", "", Utility.getReferenceableOrg(vars, (dataField!=null?dataField.getField("adOrgId"):data[0].getField("adOrgId").equals("")?vars.getOrg():data[0].getField("adOrgId"))), Utility.getContext(this, vars, "#User_Client", windowId), 0);
Utility.fillSQLParameters(this, vars, (dataField==null?data[0]:dataField), comboTableData, windowId, (dataField==null?data[0].getField("adUserId"):dataField.getField("adUserId")));
xmlDocument.setData("reportAD_User_ID","liststructure", comboTableData.select(!strCommand.equals("NEW")));
comboTableData = null;
comboTableData = new ComboTableData(vars, this, "19", "M_PriceList_ID", "", "1004400001", Utility.getReferenceableOrg(vars, (dataField!=null?dataField.getField("adOrgId"):data[0].getField("adOrgId").equals("")?vars.getOrg():data[0].getField("adOrgId"))), Utility.getContext(this, vars, "#User_Client", windowId), 0);
Utility.fillSQLParameters(this, vars, (dataField==null?data[0]:dataField), comboTableData, windowId, (dataField==null?data[0].getField("mPricelistId"):dataField.getField("mPricelistId")));
xmlDocument.setData("reportM_PriceList_ID","liststructure", comboTableData.select(!strCommand.equals("NEW")));
comboTableData = null;
comboTableData = new ComboTableData(vars, this, "19", "C_Currency_ID", "", "1004400000", Utility.getReferenceableOrg(vars, (dataField!=null?dataField.getField("adOrgId"):data[0].getField("adOrgId").equals("")?vars.getOrg():data[0].getField("adOrgId"))), Utility.getContext(this, vars, "#User_Client", windowId), 0);
Utility.fillSQLParameters(this, vars, (dataField==null?data[0]:dataField), comboTableData, windowId, (dataField==null?data[0].getField("cCurrencyId"):dataField.getField("cCurrencyId")));
xmlDocument.setData("reportC_Currency_ID","liststructure", comboTableData.select(!strCommand.equals("NEW")));
comboTableData = null;
xmlDocument.setParameter("Createpo_BTNname", Utility.getButtonName(this, vars, "1004400045", "Createpo_linkBTN", usedButtonShortCuts, reservedButtonShortCuts));boolean modalCreatepo = org.openbravo.erpCommon.utility.Utility.isModalProcess("1004400000"); 
xmlDocument.setParameter("Createpo_Modal", modalCreatepo?"true":"false");
xmlDocument.setParameter("DocAction_BTNname", Utility.getButtonName(this, vars, "135", (dataField==null?data[0].getField("docaction"):dataField.getField("docaction")), "DocAction_linkBTN", usedButtonShortCuts, reservedButtonShortCuts));boolean modalDocAction = org.openbravo.erpCommon.utility.Utility.isModalProcess("FB10EB0C8B584BCBA063FDE50E0B7A44"); 
xmlDocument.setParameter("DocAction_Modal", modalDocAction?"true":"false");
xmlDocument.setParameter("EM_Gpp_Btnpersetujuan_BTNname", Utility.getButtonName(this, vars, "379FCD692DC54EB393A775AE879B4F93", "EM_Gpp_Btnpersetujuan_linkBTN", usedButtonShortCuts, reservedButtonShortCuts));boolean modalEM_Gpp_Btnpersetujuan = org.openbravo.erpCommon.utility.Utility.isModalProcess("427DD76F78784831B02040B33F9822A1"); 
xmlDocument.setParameter("EM_Gpp_Btnpersetujuan_Modal", modalEM_Gpp_Btnpersetujuan?"true":"false");
comboTableData = new ComboTableData(vars, this, "18", "EM_Gmm_Metodepembelian_ID", "DC590D4854224ACABB3B1454A8AFD2E3", "", Utility.getReferenceableOrg(vars, (dataField!=null?dataField.getField("adOrgId"):data[0].getField("adOrgId").equals("")?vars.getOrg():data[0].getField("adOrgId"))), Utility.getContext(this, vars, "#User_Client", windowId), 0);
Utility.fillSQLParameters(this, vars, (dataField==null?data[0]:dataField), comboTableData, windowId, (dataField==null?data[0].getField("emGmmMetodepembelianId"):dataField.getField("emGmmMetodepembelianId")));
xmlDocument.setData("reportEM_Gmm_Metodepembelian_ID","liststructure", comboTableData.select(!strCommand.equals("NEW")));
comboTableData = null;
xmlDocument.setParameter("EM_Gpr_Tanggalpenawaran_Format", vars.getSessionValue("#AD_SqlDateFormat"));
comboTableData = new ComboTableData(vars, this, "17", "EM_Grq_Receivestatus", "5F8B81BA1E204DE79DB4657F97E0E1EC", "", Utility.getReferenceableOrg(vars, (dataField!=null?dataField.getField("adOrgId"):data[0].getField("adOrgId").equals("")?vars.getOrg():data[0].getField("adOrgId"))), Utility.getContext(this, vars, "#User_Client", windowId), 0);
Utility.fillSQLParameters(this, vars, (dataField==null?data[0]:dataField), comboTableData, windowId, (dataField==null?data[0].getField("emGrqReceivestatus"):dataField.getField("emGrqReceivestatus")));
xmlDocument.setData("reportEM_Grq_Receivestatus","liststructure", comboTableData.select(!strCommand.equals("NEW")));
comboTableData = null;
xmlDocument.setParameter("EM_Grq_Btnreceive_BTNname", Utility.getButtonName(this, vars, "3B2418375ECB4E1EB76C458842ACB1F4", "EM_Grq_Btnreceive_linkBTN", usedButtonShortCuts, reservedButtonShortCuts));boolean modalEM_Grq_Btnreceive = org.openbravo.erpCommon.utility.Utility.isModalProcess("88C781DF1DE84920902CCDC0B403456A"); 
xmlDocument.setParameter("EM_Grq_Btnreceive_Modal", modalEM_Grq_Btnreceive?"true":"false");
xmlDocument.setParameter("EM_Gpr_Btnrevisi_BTNname", Utility.getButtonName(this, vars, "2B3D2791343B4754B089D59B139A03FB", "EM_Gpr_Btnrevisi_linkBTN", usedButtonShortCuts, reservedButtonShortCuts));boolean modalEM_Gpr_Btnrevisi = org.openbravo.erpCommon.utility.Utility.isModalProcess("F65158BB58A84AAF92B50738FB5F5DD4"); 
xmlDocument.setParameter("EM_Gpr_Btnrevisi_Modal", modalEM_Gpr_Btnrevisi?"true":"false");
xmlDocument.setParameter("Created_Format", vars.getSessionValue("#AD_SqlDateTimeFormat"));xmlDocument.setParameter("Created_Maxlength", Integer.toString(vars.getSessionValue("#AD_SqlDateTimeFormat").length()));
xmlDocument.setParameter("Updated_Format", vars.getSessionValue("#AD_SqlDateTimeFormat"));xmlDocument.setParameter("Updated_Maxlength", Integer.toString(vars.getSessionValue("#AD_SqlDateTimeFormat").length()));
    } catch (Exception ex) {
      ex.printStackTrace();
      throw new ServletException(ex);
    }

    xmlDocument.setParameter("scriptOnLoad", getShortcutScript(usedButtonShortCuts, reservedButtonShortCuts));
    
    final String refererURL = vars.getSessionValue(tabId + "|requestURL");
    vars.removeSessionValue(tabId + "|requestURL");
    if(!refererURL.equals("")) {
    	final Boolean failedAutosave = (Boolean) vars.getSessionObject(tabId + "|failedAutosave");
		vars.removeSessionValue(tabId + "|failedAutosave");
    	if(failedAutosave != null && failedAutosave) {
    		final String jsFunction = "continueUserAction('"+refererURL+"');";
    		xmlDocument.setParameter("failedAutosave", jsFunction);
    	}
    }

    if (strCommand.equalsIgnoreCase("NEW")) {
      vars.removeSessionValue(tabId + "|failedAutosave");
      vars.removeSessionValue(strMappingName + "|hash");
    }

    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(xmlDocument.print());
    out.close();
  }

  private void printPageButtonFS(HttpServletResponse response, VariablesSecureApp vars, String strProcessId, String path) throws IOException, ServletException {
    log4j.debug("Output: Frames action button");
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
        "org/openbravo/erpCommon/ad_actionButton/ActionButtonDefaultFrames").createXmlDocument();
    xmlDocument.setParameter("processId", strProcessId);
    xmlDocument.setParameter("trlFormType", "PROCESS");
    xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
    xmlDocument.setParameter("type", strDireccion + path);
    out.println(xmlDocument.print());
    out.close();
  }

    private void printPageButtonCreatepo1004400000(HttpServletResponse response, VariablesSecureApp vars, String strM_Requisition_ID, String strcreatepo, String strProcessing)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 1004400000");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/Createpo1004400000", discard).createXmlDocument();
      xmlDocument.setParameter("key", strM_Requisition_ID);
      xmlDocument.setParameter("processing", strProcessing);
      xmlDocument.setParameter("form", "Header_Edition.html");
      xmlDocument.setParameter("window", windowId);
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("processId", "1004400000");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      
      {
        OBError myMessage = vars.getMessage("1004400000");
        vars.removeMessage("1004400000");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    ComboTableData comboTableData = null;
    xmlDocument.setParameter("DateOrdered", DateTimeData.today(this));
    xmlDocument.setParameter("DateOrdered_Format", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("AD_Org_ID", Utility.getContext(this, vars, "AD_Org_ID", "1004400000"));
    comboTableData = new ComboTableData(vars, this, "19", "AD_Org_ID", "", "FDC45D1AE2404B8384D14DB6DED90DCF", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, (FieldProvider) vars.getSessionObject("button1004400000.originalParams"), comboTableData, windowId, Utility.getContext(this, vars, "AD_Org_ID", "1004400000"));
    xmlDocument.setData("reportAD_Org_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("M_Warehouse_ID", Utility.getContext(this, vars, "#M_WAREHOUSE_ID", windowId));
    comboTableData = new ComboTableData(vars, this, "19", "M_Warehouse_ID", "", "A3DCDE5EDD4A4403AC205B131F10F84D", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, (FieldProvider) vars.getSessionObject("button1004400000.originalParams"), comboTableData, windowId, Utility.getContext(this, vars, "#M_WAREHOUSE_ID", windowId));
    xmlDocument.setData("reportM_Warehouse_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    xmlDocument.setParameter("C_BPartner_ID", HeaderData.selectActP1004400000_C_BPartner_ID(this, Utility.getContext(this, vars, "M_Requisition_ID", "1004400000")));
    xmlDocument.setParameter("C_BPartner_IDR", HeaderData.selectActDefC_BPartner_ID(this, HeaderData.selectActP1004400000_C_BPartner_ID(this, Utility.getContext(this, vars, "M_Requisition_ID", "1004400000"))));
    xmlDocument.setParameter("M_PriceList_ID", HeaderData.selectActP1004400000_M_PriceList_ID(this, Utility.getContext(this, vars, "M_Requisition_ID", "1004400000")));
    comboTableData = new ComboTableData(vars, this, "19", "M_PriceList_ID", "", "1004400001", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
    Utility.fillSQLParameters(this, vars, (FieldProvider) vars.getSessionObject("button1004400000.originalParams"), comboTableData, windowId, HeaderData.selectActP1004400000_M_PriceList_ID(this, Utility.getContext(this, vars, "M_Requisition_ID", "1004400000")));
    xmlDocument.setData("reportM_PriceList_ID", "liststructure", comboTableData.select(false));
comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      
      out.println(xmlDocument.print());
      out.close();
    }
    private void printPageButtonDocActionFB10EB0C8B584BCBA063FDE50E0B7A44(HttpServletResponse response, VariablesSecureApp vars, String strM_Requisition_ID, String strdocaction, String strProcessing, String strdocstatus, String stradTableId)
    throws IOException, ServletException {
      log4j.debug("Output: Button process FB10EB0C8B584BCBA063FDE50E0B7A44");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/DocAction", discard).createXmlDocument();
      xmlDocument.setParameter("key", strM_Requisition_ID);
      xmlDocument.setParameter("processing", strProcessing);
      xmlDocument.setParameter("form", "Header_Edition.html");
      xmlDocument.setParameter("window", windowId);
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("processId", "FB10EB0C8B584BCBA063FDE50E0B7A44");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      
      {
        OBError myMessage = vars.getMessage("FB10EB0C8B584BCBA063FDE50E0B7A44");
        vars.removeMessage("FB10EB0C8B584BCBA063FDE50E0B7A44");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

      xmlDocument.setParameter("docstatus", strdocstatus);
xmlDocument.setParameter("adTableId", stradTableId);
    try {
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
xmlDocument.setParameter("processId", "FB10EB0C8B584BCBA063FDE50E0B7A44");
xmlDocument.setParameter("processDescription", "Processed");
xmlDocument.setParameter("docaction", (strdocaction.equals("--")?"CL":strdocaction));
FieldProvider[] dataDocAction = ActionButtonUtility.docAction(this, vars, strdocaction, "135", strdocstatus, strProcessing, stradTableId, tabId);
xmlDocument.setData("reportdocaction", "liststructure", dataDocAction);
StringBuffer dact = new StringBuffer();
if (dataDocAction!=null) {
  dact.append("var arrDocAction = new Array(\n");
  for (int i=0;i<dataDocAction.length;i++) {
    dact.append("new Array(\"" + dataDocAction[i].getField("id") + "\", \"" + dataDocAction[i].getField("name") + "\", \"" + dataDocAction[i].getField("description") + "\")\n");
    if (i<dataDocAction.length-1) dact.append(",\n");
  }
  dact.append(");");
} else dact.append("var arrDocAction = null");
xmlDocument.setParameter("array", dact.toString());

      
      out.println(xmlDocument.print());
      out.close();
    }
    private void printPageButtonEM_Gpp_Btnpersetujuan427DD76F78784831B02040B33F9822A1(HttpServletResponse response, VariablesSecureApp vars, String strM_Requisition_ID, String stremGppBtnpersetujuan, String strProcessing)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 427DD76F78784831B02040B33F9822A1");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/EM_Gpp_Btnpersetujuan427DD76F78784831B02040B33F9822A1", discard).createXmlDocument();
      xmlDocument.setParameter("key", strM_Requisition_ID);
      xmlDocument.setParameter("processing", strProcessing);
      xmlDocument.setParameter("form", "Header_Edition.html");
      xmlDocument.setParameter("window", windowId);
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("processId", "427DD76F78784831B02040B33F9822A1");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      
      {
        OBError myMessage = vars.getMessage("427DD76F78784831B02040B33F9822A1");
        vars.removeMessage("427DD76F78784831B02040B33F9822A1");
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
    private void printPageButtonEM_Grq_Btnreceive88C781DF1DE84920902CCDC0B403456A(HttpServletResponse response, VariablesSecureApp vars, String strM_Requisition_ID, String stremGrqBtnreceive, String strProcessing)
    throws IOException, ServletException {
      log4j.debug("Output: Button process 88C781DF1DE84920902CCDC0B403456A");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/EM_Grq_Btnreceive88C781DF1DE84920902CCDC0B403456A", discard).createXmlDocument();
      xmlDocument.setParameter("key", strM_Requisition_ID);
      xmlDocument.setParameter("processing", strProcessing);
      xmlDocument.setParameter("form", "Header_Edition.html");
      xmlDocument.setParameter("window", windowId);
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("processId", "88C781DF1DE84920902CCDC0B403456A");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      
      {
        OBError myMessage = vars.getMessage("88C781DF1DE84920902CCDC0B403456A");
        vars.removeMessage("88C781DF1DE84920902CCDC0B403456A");
        if (myMessage!=null) {
          xmlDocument.setParameter("messageType", myMessage.getType());
          xmlDocument.setParameter("messageTitle", myMessage.getTitle());
          xmlDocument.setParameter("messageMessage", myMessage.getMessage());
        }
      }

          try {
    xmlDocument.setParameter("GMM_MetodePembelian_ID", "");
    xmlDocument.setParameter("GPP_PersetujuanPembelian", "");
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

      
      out.println(xmlDocument.print());
      out.close();
    }
    private void printPageButtonEM_Gpr_BtnrevisiF65158BB58A84AAF92B50738FB5F5DD4(HttpServletResponse response, VariablesSecureApp vars, String strM_Requisition_ID, String stremGprBtnrevisi, String strProcessing)
    throws IOException, ServletException {
      log4j.debug("Output: Button process F65158BB58A84AAF92B50738FB5F5DD4");
      String[] discard = {"newDiscard"};
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
      XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_actionButton/EM_Gpr_BtnrevisiF65158BB58A84AAF92B50738FB5F5DD4", discard).createXmlDocument();
      xmlDocument.setParameter("key", strM_Requisition_ID);
      xmlDocument.setParameter("processing", strProcessing);
      xmlDocument.setParameter("form", "Header_Edition.html");
      xmlDocument.setParameter("window", windowId);
      xmlDocument.setParameter("css", vars.getTheme());
      xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
      xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
      xmlDocument.setParameter("processId", "F65158BB58A84AAF92B50738FB5F5DD4");
      xmlDocument.setParameter("cancel", Utility.messageBD(this, "Cancel", vars.getLanguage()));
      xmlDocument.setParameter("ok", Utility.messageBD(this, "OK", vars.getLanguage()));
      
      {
        OBError myMessage = vars.getMessage("F65158BB58A84AAF92B50738FB5F5DD4");
        vars.removeMessage("F65158BB58A84AAF92B50738FB5F5DD4");
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




    private String getDisplayLogicContext(VariablesSecureApp vars, boolean isNew) throws IOException, ServletException {
      log4j.debug("Output: Display logic context fields");
      String result = "var strShowAudit=\"" +(isNew?"N":Utility.getContext(this, vars, "ShowAudit", windowId)) + "\";\n";
      return result;
    }


    private String getReadOnlyLogicContext(VariablesSecureApp vars) throws IOException, ServletException {
      log4j.debug("Output: Read Only logic context fields");
      String result = "";
      return result;
    }




 
  private String getShortcutScript( HashMap<String, String> usedButtonShortCuts, HashMap<String, String> reservedButtonShortCuts){
    StringBuffer shortcuts = new StringBuffer();
    shortcuts.append(" function buttonListShorcuts() {\n");
    Iterator<String> ik = usedButtonShortCuts.keySet().iterator();
    Iterator<String> iv = usedButtonShortCuts.values().iterator();
    while(ik.hasNext() && iv.hasNext()){
      shortcuts.append("  keyArray[keyArray.length] = new keyArrayItem(\"").append(ik.next()).append("\", \"").append(iv.next()).append("\", null, \"altKey\", false, \"onkeydown\");\n");
    }
    shortcuts.append(" return true;\n}");
    return shortcuts.toString();
  }
  
  private int saveRecord(VariablesSecureApp vars, OBError myError, char type) throws IOException, ServletException {
    HeaderData data = null;
    int total = 0;
    if (org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) {
        OBError newError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
        myError.setError(newError);
        vars.setMessage(tabId, myError);
    }
    else {
        Connection con = null;
        try {
            con = this.getTransactionConnection();
            data = getEditVariables(con, vars);
            data.dateTimeFormat = vars.getSessionValue("#AD_SqlDateTimeFormat");            
            String strSequence = "";
            if(type == 'I') {                
        strSequence = SequenceIdData.getUUID();
                if(log4j.isDebugEnabled()) log4j.debug("Sequence: " + strSequence);
                data.mRequisitionId = strSequence;  
            }
            if (Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),data.adClientId)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),data.adOrgId)){
		     if(type == 'I') {
		       total = data.insert(con, this);
		     } else {
		       //Check the version of the record we are saving is the one in DB
		       if (HeaderData.getCurrentDBTimestamp(this, data.mRequisitionId).equals(
                vars.getStringParameter("updatedTimestamp"))) {
                total = data.update(con, this);
               } else {
                 myError.setMessage(Replace.replace(Replace.replace(Utility.messageBD(this,
                    "SavingModifiedRecord", vars.getLanguage()), "\\n", "<br/>"), "&quot;", "\""));
                 myError.setType("Error");
                 vars.setSessionValue(tabId + "|concurrentSave", "true");
               } 
		     }		            
          
            }
                else {
            OBError newError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
            myError.setError(newError);            
          }
          releaseCommitConnection(con);
        } catch(Exception ex) {
            OBError newError = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
            myError.setError(newError);   
            try {
              releaseRollbackConnection(con);
            } catch (final Exception e) { //do nothing 
            }           
        }
            
        if (myError.isEmpty() && total == 0) {
            OBError newError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=DBExecuteError");
            myError.setError(newError);
        }
        vars.setMessage(tabId, myError);
            
        if(!myError.isEmpty()){
            if(data != null ) {
                if(type == 'I') {            			
                    data.mRequisitionId = "";
                }
                else {                    
                    
                        //BUTTON TEXT FILLING
                    data.docactionBtn = ActionButtonDefaultData.getText(this, vars.getLanguage(), "135", data.getField("DocAction"));
                    
                }
                vars.setEditionData(tabId, data);
            }            	
        }
        else {
            vars.setSessionValue(windowId + "|M_Requisition_ID", data.mRequisitionId);
        }
    }
    return total;
  }

  public String getServletInfo() {
    return "Servlet Header. This Servlet was made by Wad constructor";
  } // End of getServletInfo() method
}
