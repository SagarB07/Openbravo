//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.WindowsTabsandFields;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

/**
WAD Generated class
 */
class TabData implements FieldProvider {
static Logger log4j = Logger.getLogger(TabData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adModuleId;
  public String adModuleIdr;
  public String name;
  public String adTableId;
  public String adTableIdr;
  public String uipattern;
  public String uipatternr;
  public String seqno;
  public String tablevel;
  public String help;
  public String description;
  public String whereclause;
  public String hqlwhereclause;
  public String filterclause;
  public String hqlfilterclause;
  public String filtername;
  public String orderbyclause;
  public String hqlorderbyclause;
  public String isinfotab;
  public String istranslationtab;
  public String issinglerow;
  public String hastree;
  public String showparentbuttons;
  public String adProcessId;
  public String adProcessIdr;
  public String editreference;
  public String editreferencer;
  public String isactive;
  public String displaylogic;
  public String importfields;
  public String processing;
  public String emObuiappCanAdd;
  public String emObuiappCanDelete;
  public String emObuiappSelection;
  public String emObuiappShowSelect;
  public String emObuiappNewfn;
  public String emObuiappRemovefn;
  public String adTableTreeId;
  public String disableParentKeyProperty;
  public String hqltreewhereclause;
  public String isreadonlytree;
  public String isshowtreenodeicons;
  public String defaulttreeviewlogic;
  public String adColumnsortorderId;
  public String adColumnsortyesnoId;
  public String issorttab;
  public String adImageId;
  public String includedTabId;
  public String adOrgId;
  public String commitwarning;
  public String adColumnId;
  public String adClientId;
  public String adTabId;
  public String adWindowId;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBYR"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATED_TIME_STAMP") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("UPDATEDBYR"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("AD_MODULE_ID") || fieldName.equals("adModuleId"))
      return adModuleId;
    else if (fieldName.equalsIgnoreCase("AD_MODULE_IDR") || fieldName.equals("adModuleIdr"))
      return adModuleIdr;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("AD_TABLE_ID") || fieldName.equals("adTableId"))
      return adTableId;
    else if (fieldName.equalsIgnoreCase("AD_TABLE_IDR") || fieldName.equals("adTableIdr"))
      return adTableIdr;
    else if (fieldName.equalsIgnoreCase("UIPATTERN"))
      return uipattern;
    else if (fieldName.equalsIgnoreCase("UIPATTERNR"))
      return uipatternr;
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("TABLEVEL"))
      return tablevel;
    else if (fieldName.equalsIgnoreCase("HELP"))
      return help;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("WHERECLAUSE"))
      return whereclause;
    else if (fieldName.equalsIgnoreCase("HQLWHERECLAUSE"))
      return hqlwhereclause;
    else if (fieldName.equalsIgnoreCase("FILTERCLAUSE"))
      return filterclause;
    else if (fieldName.equalsIgnoreCase("HQLFILTERCLAUSE"))
      return hqlfilterclause;
    else if (fieldName.equalsIgnoreCase("FILTERNAME"))
      return filtername;
    else if (fieldName.equalsIgnoreCase("ORDERBYCLAUSE"))
      return orderbyclause;
    else if (fieldName.equalsIgnoreCase("HQLORDERBYCLAUSE"))
      return hqlorderbyclause;
    else if (fieldName.equalsIgnoreCase("ISINFOTAB"))
      return isinfotab;
    else if (fieldName.equalsIgnoreCase("ISTRANSLATIONTAB"))
      return istranslationtab;
    else if (fieldName.equalsIgnoreCase("ISSINGLEROW"))
      return issinglerow;
    else if (fieldName.equalsIgnoreCase("HASTREE"))
      return hastree;
    else if (fieldName.equalsIgnoreCase("SHOWPARENTBUTTONS"))
      return showparentbuttons;
    else if (fieldName.equalsIgnoreCase("AD_PROCESS_ID") || fieldName.equals("adProcessId"))
      return adProcessId;
    else if (fieldName.equalsIgnoreCase("AD_PROCESS_IDR") || fieldName.equals("adProcessIdr"))
      return adProcessIdr;
    else if (fieldName.equalsIgnoreCase("EDITREFERENCE"))
      return editreference;
    else if (fieldName.equalsIgnoreCase("EDITREFERENCER"))
      return editreferencer;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("DISPLAYLOGIC"))
      return displaylogic;
    else if (fieldName.equalsIgnoreCase("IMPORTFIELDS"))
      return importfields;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("EM_OBUIAPP_CAN_ADD") || fieldName.equals("emObuiappCanAdd"))
      return emObuiappCanAdd;
    else if (fieldName.equalsIgnoreCase("EM_OBUIAPP_CAN_DELETE") || fieldName.equals("emObuiappCanDelete"))
      return emObuiappCanDelete;
    else if (fieldName.equalsIgnoreCase("EM_OBUIAPP_SELECTION") || fieldName.equals("emObuiappSelection"))
      return emObuiappSelection;
    else if (fieldName.equalsIgnoreCase("EM_OBUIAPP_SHOW_SELECT") || fieldName.equals("emObuiappShowSelect"))
      return emObuiappShowSelect;
    else if (fieldName.equalsIgnoreCase("EM_OBUIAPP_NEWFN") || fieldName.equals("emObuiappNewfn"))
      return emObuiappNewfn;
    else if (fieldName.equalsIgnoreCase("EM_OBUIAPP_REMOVEFN") || fieldName.equals("emObuiappRemovefn"))
      return emObuiappRemovefn;
    else if (fieldName.equalsIgnoreCase("AD_TABLE_TREE_ID") || fieldName.equals("adTableTreeId"))
      return adTableTreeId;
    else if (fieldName.equalsIgnoreCase("DISABLE_PARENT_KEY_PROPERTY") || fieldName.equals("disableParentKeyProperty"))
      return disableParentKeyProperty;
    else if (fieldName.equalsIgnoreCase("HQLTREEWHERECLAUSE"))
      return hqltreewhereclause;
    else if (fieldName.equalsIgnoreCase("ISREADONLYTREE"))
      return isreadonlytree;
    else if (fieldName.equalsIgnoreCase("ISSHOWTREENODEICONS"))
      return isshowtreenodeicons;
    else if (fieldName.equalsIgnoreCase("DEFAULTTREEVIEWLOGIC"))
      return defaulttreeviewlogic;
    else if (fieldName.equalsIgnoreCase("AD_COLUMNSORTORDER_ID") || fieldName.equals("adColumnsortorderId"))
      return adColumnsortorderId;
    else if (fieldName.equalsIgnoreCase("AD_COLUMNSORTYESNO_ID") || fieldName.equals("adColumnsortyesnoId"))
      return adColumnsortyesnoId;
    else if (fieldName.equalsIgnoreCase("ISSORTTAB"))
      return issorttab;
    else if (fieldName.equalsIgnoreCase("AD_IMAGE_ID") || fieldName.equals("adImageId"))
      return adImageId;
    else if (fieldName.equalsIgnoreCase("INCLUDED_TAB_ID") || fieldName.equals("includedTabId"))
      return includedTabId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("COMMITWARNING"))
      return commitwarning;
    else if (fieldName.equalsIgnoreCase("AD_COLUMN_ID") || fieldName.equals("adColumnId"))
      return adColumnId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_TAB_ID") || fieldName.equals("adTabId"))
      return adTabId;
    else if (fieldName.equalsIgnoreCase("AD_WINDOW_ID") || fieldName.equals("adWindowId"))
      return adWindowId;
    else if (fieldName.equalsIgnoreCase("LANGUAGE"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static TabData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String adWindowId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, adWindowId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static TabData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String adWindowId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_Tab.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Tab.CreatedBy) as CreatedByR, " +
      "        to_char(AD_Tab.Updated, ?) as updated, " +
      "        to_char(AD_Tab.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_Tab.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Tab.UpdatedBy) as UpdatedByR," +
      "        AD_Tab.AD_Module_ID, " +
      "(CASE WHEN AD_Tab.AD_Module_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Version), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Module_IDR, " +
      "AD_Tab.Name, " +
      "AD_Tab.AD_Table_ID, " +
      "(CASE WHEN AD_Tab.AD_Table_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.TableName), ''))),'') ) END) AS AD_Table_IDR, " +
      "AD_Tab.UIPattern, " +
      "(CASE WHEN AD_Tab.UIPattern IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS UIPatternR, " +
      "AD_Tab.SeqNo, " +
      "AD_Tab.TabLevel, " +
      "AD_Tab.Help, " +
      "AD_Tab.Description, " +
      "AD_Tab.WhereClause, " +
      "AD_Tab.Hqlwhereclause, " +
      "AD_Tab.FilterClause, " +
      "AD_Tab.Hqlfilterclause, " +
      "AD_Tab.FilterName, " +
      "AD_Tab.OrderByClause, " +
      "AD_Tab.Hqlorderbyclause, " +
      "COALESCE(AD_Tab.IsInfoTab, 'N') AS IsInfoTab, " +
      "COALESCE(AD_Tab.IsTranslationTab, 'N') AS IsTranslationTab, " +
      "COALESCE(AD_Tab.IsSingleRow, 'N') AS IsSingleRow, " +
      "COALESCE(AD_Tab.HasTree, 'N') AS HasTree, " +
      "COALESCE(AD_Tab.ShowParentButtons, 'N') AS ShowParentButtons, " +
      "AD_Tab.AD_Process_ID, " +
      "(CASE WHEN AD_Tab.AD_Process_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS AD_Process_IDR, " +
      "AD_Tab.EditReference, " +
      "(CASE WHEN AD_Tab.EditReference IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS EditReferenceR, " +
      "COALESCE(AD_Tab.IsActive, 'N') AS IsActive, " +
      "AD_Tab.Displaylogic, " +
      "AD_Tab.ImportFields, " +
      "AD_Tab.Processing, " +
      "COALESCE(AD_Tab.EM_Obuiapp_Can_Add, 'N') AS EM_Obuiapp_Can_Add, " +
      "COALESCE(AD_Tab.EM_Obuiapp_Can_Delete, 'N') AS EM_Obuiapp_Can_Delete, " +
      "AD_Tab.EM_OBUIAPP_Selection, " +
      "COALESCE(AD_Tab.EM_Obuiapp_Show_Select, 'N') AS EM_Obuiapp_Show_Select, " +
      "AD_Tab.EM_Obuiapp_Newfn, " +
      "AD_Tab.EM_Obuiapp_Removefn, " +
      "AD_Tab.AD_Table_Tree_ID, " +
      "COALESCE(AD_Tab.Disable_Parent_Key_Property, 'N') AS Disable_Parent_Key_Property, " +
      "AD_Tab.Hqltreewhereclause, " +
      "COALESCE(AD_Tab.IsReadOnlyTree, 'N') AS IsReadOnlyTree, " +
      "COALESCE(AD_Tab.IsShowTreeNodeIcons, 'N') AS IsShowTreeNodeIcons, " +
      "AD_Tab.DefaultTreeViewLogic, " +
      "AD_Tab.AD_ColumnSortOrder_ID, " +
      "AD_Tab.AD_ColumnSortYesNo_ID, " +
      "COALESCE(AD_Tab.IsSortTab, 'N') AS IsSortTab, " +
      "AD_Tab.AD_Image_ID, " +
      "AD_Tab.Included_Tab_ID, " +
      "AD_Tab.AD_Org_ID, " +
      "AD_Tab.CommitWarning, " +
      "AD_Tab.AD_Column_ID, " +
      "AD_Tab.AD_Client_ID, " +
      "AD_Tab.AD_Tab_ID, " +
      "AD_Tab.AD_Window_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM AD_Tab left join (select AD_Module_ID, Name, Version, AD_Language from AD_Module) table1 on (AD_Tab.AD_Module_ID = table1.AD_Module_ID) left join (select AD_Language, Name from AD_Language) table2 on (table1.AD_Language =  table2.AD_Language) left join (select AD_Table_ID, TableName from AD_Table) table3 on (AD_Tab.AD_Table_ID = table3.AD_Table_ID) left join ad_ref_list_v list1 on (AD_Tab.UIPattern = list1.value and list1.ad_reference_id = 'D15C950D445D408E8CC8135E530C246B' and list1.ad_language = ?)  left join (select AD_Process_ID, Name from AD_Process) table4 on (AD_Tab.AD_Process_ID = table4.AD_Process_ID) left join (select AD_Process_ID,AD_Language, Name from AD_Process_TRL) tableTRL4 on (table4.AD_Process_ID = tableTRL4.AD_Process_ID and tableTRL4.AD_Language = ?)  left join (select AD_Form_ID, Name from AD_Form) table6 on (AD_Tab.EditReference =  table6.AD_Form_ID) left join (select AD_Form_ID,AD_Language, Name from AD_Form_TRL) tableTRL6 on (table6.AD_Form_ID = tableTRL6.AD_Form_ID and tableTRL6.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((adWindowId==null || adWindowId.equals(""))?"":"  AND AD_Tab.AD_Window_ID = ?  ");
    strSql = strSql + 
      "        AND AD_Tab.AD_Tab_ID = ? " +
      "        AND AD_Tab.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND AD_Tab.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (adWindowId != null && !(adWindowId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        TabData objectTabData = new TabData();
        objectTabData.created = UtilSql.getValue(result, "CREATED");
        objectTabData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectTabData.updated = UtilSql.getValue(result, "UPDATED");
        objectTabData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectTabData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectTabData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectTabData.adModuleId = UtilSql.getValue(result, "AD_MODULE_ID");
        objectTabData.adModuleIdr = UtilSql.getValue(result, "AD_MODULE_IDR");
        objectTabData.name = UtilSql.getValue(result, "NAME");
        objectTabData.adTableId = UtilSql.getValue(result, "AD_TABLE_ID");
        objectTabData.adTableIdr = UtilSql.getValue(result, "AD_TABLE_IDR");
        objectTabData.uipattern = UtilSql.getValue(result, "UIPATTERN");
        objectTabData.uipatternr = UtilSql.getValue(result, "UIPATTERNR");
        objectTabData.seqno = UtilSql.getValue(result, "SEQNO");
        objectTabData.tablevel = UtilSql.getValue(result, "TABLEVEL");
        objectTabData.help = UtilSql.getValue(result, "HELP");
        objectTabData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectTabData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectTabData.hqlwhereclause = UtilSql.getValue(result, "HQLWHERECLAUSE");
        objectTabData.filterclause = UtilSql.getValue(result, "FILTERCLAUSE");
        objectTabData.hqlfilterclause = UtilSql.getValue(result, "HQLFILTERCLAUSE");
        objectTabData.filtername = UtilSql.getValue(result, "FILTERNAME");
        objectTabData.orderbyclause = UtilSql.getValue(result, "ORDERBYCLAUSE");
        objectTabData.hqlorderbyclause = UtilSql.getValue(result, "HQLORDERBYCLAUSE");
        objectTabData.isinfotab = UtilSql.getValue(result, "ISINFOTAB");
        objectTabData.istranslationtab = UtilSql.getValue(result, "ISTRANSLATIONTAB");
        objectTabData.issinglerow = UtilSql.getValue(result, "ISSINGLEROW");
        objectTabData.hastree = UtilSql.getValue(result, "HASTREE");
        objectTabData.showparentbuttons = UtilSql.getValue(result, "SHOWPARENTBUTTONS");
        objectTabData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
        objectTabData.adProcessIdr = UtilSql.getValue(result, "AD_PROCESS_IDR");
        objectTabData.editreference = UtilSql.getValue(result, "EDITREFERENCE");
        objectTabData.editreferencer = UtilSql.getValue(result, "EDITREFERENCER");
        objectTabData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectTabData.displaylogic = UtilSql.getValue(result, "DISPLAYLOGIC");
        objectTabData.importfields = UtilSql.getValue(result, "IMPORTFIELDS");
        objectTabData.processing = UtilSql.getValue(result, "PROCESSING");
        objectTabData.emObuiappCanAdd = UtilSql.getValue(result, "EM_OBUIAPP_CAN_ADD");
        objectTabData.emObuiappCanDelete = UtilSql.getValue(result, "EM_OBUIAPP_CAN_DELETE");
        objectTabData.emObuiappSelection = UtilSql.getValue(result, "EM_OBUIAPP_SELECTION");
        objectTabData.emObuiappShowSelect = UtilSql.getValue(result, "EM_OBUIAPP_SHOW_SELECT");
        objectTabData.emObuiappNewfn = UtilSql.getValue(result, "EM_OBUIAPP_NEWFN");
        objectTabData.emObuiappRemovefn = UtilSql.getValue(result, "EM_OBUIAPP_REMOVEFN");
        objectTabData.adTableTreeId = UtilSql.getValue(result, "AD_TABLE_TREE_ID");
        objectTabData.disableParentKeyProperty = UtilSql.getValue(result, "DISABLE_PARENT_KEY_PROPERTY");
        objectTabData.hqltreewhereclause = UtilSql.getValue(result, "HQLTREEWHERECLAUSE");
        objectTabData.isreadonlytree = UtilSql.getValue(result, "ISREADONLYTREE");
        objectTabData.isshowtreenodeicons = UtilSql.getValue(result, "ISSHOWTREENODEICONS");
        objectTabData.defaulttreeviewlogic = UtilSql.getValue(result, "DEFAULTTREEVIEWLOGIC");
        objectTabData.adColumnsortorderId = UtilSql.getValue(result, "AD_COLUMNSORTORDER_ID");
        objectTabData.adColumnsortyesnoId = UtilSql.getValue(result, "AD_COLUMNSORTYESNO_ID");
        objectTabData.issorttab = UtilSql.getValue(result, "ISSORTTAB");
        objectTabData.adImageId = UtilSql.getValue(result, "AD_IMAGE_ID");
        objectTabData.includedTabId = UtilSql.getValue(result, "INCLUDED_TAB_ID");
        objectTabData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectTabData.commitwarning = UtilSql.getValue(result, "COMMITWARNING");
        objectTabData.adColumnId = UtilSql.getValue(result, "AD_COLUMN_ID");
        objectTabData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectTabData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectTabData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectTabData.language = UtilSql.getValue(result, "LANGUAGE");
        objectTabData.adUserClient = "";
        objectTabData.adOrgClient = "";
        objectTabData.createdby = "";
        objectTabData.trBgcolor = "";
        objectTabData.totalCount = "";
        objectTabData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTabData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    TabData objectTabData[] = new TabData[vector.size()];
    vector.copyInto(objectTabData);
    return(objectTabData);
  }

/**
Create a registry
 */
  public static TabData[] set(String adWindowId, String hastree, String adTabId, String name, String description, String help, String seqno, String issinglerow, String displaylogic, String isinfotab, String istranslationtab, String isreadonly, String adTableId, String adTableTreeId, String adColumnId, String whereclause, String orderbyclause, String commitwarning, String adProcessId, String adClientId, String emObuiappShowSelect, String adOrgId, String processing, String adModuleId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String emObuiappRemovefn, String hqlwhereclause, String isshowtreenodeicons, String adImageId, String importfields, String disableParentKeyProperty, String tablevel, String uipattern, String issorttab, String adColumnsortyesnoId, String adColumnsortorderId, String emObuiappNewfn, String filterclause, String editreference, String includedTabId, String isreadonlytree, String emObuiappCanDelete, String filtername, String showparentbuttons, String hqlorderbyclause, String defaulttreeviewlogic, String hqltreewhereclause, String hqlfilterclause, String emObuiappCanAdd, String emObuiappSelection)    throws ServletException {
    TabData objectTabData[] = new TabData[1];
    objectTabData[0] = new TabData();
    objectTabData[0].created = "";
    objectTabData[0].createdbyr = createdbyr;
    objectTabData[0].updated = "";
    objectTabData[0].updatedTimeStamp = "";
    objectTabData[0].updatedby = updatedby;
    objectTabData[0].updatedbyr = updatedbyr;
    objectTabData[0].adModuleId = adModuleId;
    objectTabData[0].adModuleIdr = "";
    objectTabData[0].name = name;
    objectTabData[0].adTableId = adTableId;
    objectTabData[0].adTableIdr = "";
    objectTabData[0].uipattern = uipattern;
    objectTabData[0].uipatternr = "";
    objectTabData[0].seqno = seqno;
    objectTabData[0].tablevel = tablevel;
    objectTabData[0].help = help;
    objectTabData[0].description = description;
    objectTabData[0].whereclause = whereclause;
    objectTabData[0].hqlwhereclause = hqlwhereclause;
    objectTabData[0].filterclause = filterclause;
    objectTabData[0].hqlfilterclause = hqlfilterclause;
    objectTabData[0].filtername = filtername;
    objectTabData[0].orderbyclause = orderbyclause;
    objectTabData[0].hqlorderbyclause = hqlorderbyclause;
    objectTabData[0].isinfotab = isinfotab;
    objectTabData[0].istranslationtab = istranslationtab;
    objectTabData[0].issinglerow = issinglerow;
    objectTabData[0].hastree = hastree;
    objectTabData[0].showparentbuttons = showparentbuttons;
    objectTabData[0].adProcessId = adProcessId;
    objectTabData[0].adProcessIdr = "";
    objectTabData[0].editreference = editreference;
    objectTabData[0].editreferencer = "";
    objectTabData[0].isactive = isactive;
    objectTabData[0].displaylogic = displaylogic;
    objectTabData[0].importfields = importfields;
    objectTabData[0].processing = processing;
    objectTabData[0].emObuiappCanAdd = emObuiappCanAdd;
    objectTabData[0].emObuiappCanDelete = emObuiappCanDelete;
    objectTabData[0].emObuiappSelection = emObuiappSelection;
    objectTabData[0].emObuiappShowSelect = emObuiappShowSelect;
    objectTabData[0].emObuiappNewfn = emObuiappNewfn;
    objectTabData[0].emObuiappRemovefn = emObuiappRemovefn;
    objectTabData[0].adTableTreeId = adTableTreeId;
    objectTabData[0].disableParentKeyProperty = disableParentKeyProperty;
    objectTabData[0].hqltreewhereclause = hqltreewhereclause;
    objectTabData[0].isreadonlytree = isreadonlytree;
    objectTabData[0].isshowtreenodeicons = isshowtreenodeicons;
    objectTabData[0].defaulttreeviewlogic = defaulttreeviewlogic;
    objectTabData[0].adColumnsortorderId = adColumnsortorderId;
    objectTabData[0].adColumnsortyesnoId = adColumnsortyesnoId;
    objectTabData[0].issorttab = issorttab;
    objectTabData[0].adImageId = adImageId;
    objectTabData[0].includedTabId = includedTabId;
    objectTabData[0].adOrgId = adOrgId;
    objectTabData[0].commitwarning = commitwarning;
    objectTabData[0].adColumnId = adColumnId;
    objectTabData[0].adClientId = adClientId;
    objectTabData[0].adTabId = adTabId;
    objectTabData[0].adWindowId = adWindowId;
    objectTabData[0].language = "";
    return objectTabData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux294C4E2D7138493CA62CD990018832D9(ConnectionProvider connectionProvider, String ad_table_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT dataorigintype FROM ad_table WHERE ad_table_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_table_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "DATAORIGINTYPE");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectAux364291215E9147639E19489DCE02B97F(ConnectionProvider connectionProvider, String ad_table_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT istree FROM ad_table WHERE ad_table_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_table_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISTREE");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef165(ConnectionProvider connectionProvider, String AD_Window_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_Tab WHERE AD_Window_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Window_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "DEFAULTVALUE");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef5661EC317B643D0FE040007F01004528(ConnectionProvider connectionProvider, String AD_Window_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_MODULE_ID FROM AD_WINDOW WHERE AD_WINDOW_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Window_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_MODULE_ID");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef575_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as CreatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "CREATEDBY");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef577_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as UpdatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATEDBY");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_Tab.AD_Window_ID AS NAME" +
      "        FROM AD_Tab" +
      "        WHERE AD_Tab.AD_Tab_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for parent field
 */
  public static String selectParent(ConnectionProvider connectionProvider, String paramLanguage, String adWindowId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))) AS NAME FROM AD_Window left join (select AD_Window_ID, Name from AD_Window) table1 on (AD_Window.AD_Window_ID = table1.AD_Window_ID) left join (select AD_Window_ID,AD_Language, Name from AD_Window_TRL) tableTRL1 on (table1.AD_Window_ID = tableTRL1.AD_Window_ID and tableTRL1.AD_Language = ?)  WHERE AD_Window.AD_Window_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for parent field
 */
  public static String selectParentTrl(ConnectionProvider connectionProvider, String paramLanguage, String adWindowId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))) AS NAME FROM AD_Window left join (select AD_Window_ID, Name from AD_Window) table1 on (AD_Window.AD_Window_ID = table1.AD_Window_ID) left join (select AD_Window_ID,AD_Language, Name from AD_Window_TRL) tableTRL1 on (table1.AD_Window_ID = tableTRL1.AD_Window_ID and tableTRL1.AD_Language = ?)  WHERE AD_Window.AD_Window_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_Tab" +
      "        SET AD_Module_ID = (?) , Name = (?) , AD_Table_ID = (?) , UIPattern = (?) , SeqNo = TO_NUMBER(?) , TabLevel = TO_NUMBER(?) , Help = (?) , Description = (?) , WhereClause = (?) , Hqlwhereclause = (?) , FilterClause = (?) , Hqlfilterclause = (?) , FilterName = (?) , OrderByClause = (?) , Hqlorderbyclause = (?) , IsInfoTab = (?) , IsTranslationTab = (?) , IsSingleRow = (?) , HasTree = (?) , ShowParentButtons = (?) , AD_Process_ID = (?) , EditReference = (?) , IsActive = (?) , Displaylogic = (?) , ImportFields = (?) , Processing = (?) , EM_Obuiapp_Can_Add = (?) , EM_Obuiapp_Can_Delete = (?) , EM_OBUIAPP_Selection = (?) , EM_Obuiapp_Show_Select = (?) , EM_Obuiapp_Newfn = (?) , EM_Obuiapp_Removefn = (?) , AD_Table_Tree_ID = (?) , Disable_Parent_Key_Property = (?) , Hqltreewhereclause = (?) , IsReadOnlyTree = (?) , IsShowTreeNodeIcons = (?) , DefaultTreeViewLogic = (?) , AD_ColumnSortOrder_ID = (?) , AD_ColumnSortYesNo_ID = (?) , IsSortTab = (?) , AD_Image_ID = (?) , Included_Tab_ID = (?) , AD_Org_ID = (?) , CommitWarning = (?) , AD_Column_ID = (?) , AD_Client_ID = (?) , AD_Tab_ID = (?) , AD_Window_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE AD_Tab.AD_Tab_ID = ? " +
      "                 AND AD_Tab.AD_Window_ID = ? " +
      "        AND AD_Tab.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Tab.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adModuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uipattern);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablevel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, whereclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hqlwhereclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, filterclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hqlfilterclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, filtername);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderbyclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hqlorderbyclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinfotab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istranslationtab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issinglerow);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hastree);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, showparentbuttons);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, editreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, displaylogic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, importfields);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappCanAdd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappCanDelete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappShowSelect);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappNewfn);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappRemovefn);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableTreeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, disableParentKeyProperty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hqltreewhereclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isreadonlytree);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isshowtreenodeicons);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaulttreeviewlogic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adColumnsortorderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adColumnsortyesnoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issorttab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adImageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, includedTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, commitwarning);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adColumnId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO AD_Tab " +
      "        (AD_Module_ID, Name, AD_Table_ID, UIPattern, SeqNo, TabLevel, Help, Description, WhereClause, Hqlwhereclause, FilterClause, Hqlfilterclause, FilterName, OrderByClause, Hqlorderbyclause, IsInfoTab, IsTranslationTab, IsSingleRow, HasTree, ShowParentButtons, AD_Process_ID, EditReference, IsActive, Displaylogic, ImportFields, Processing, EM_Obuiapp_Can_Add, EM_Obuiapp_Can_Delete, EM_OBUIAPP_Selection, EM_Obuiapp_Show_Select, EM_Obuiapp_Newfn, EM_Obuiapp_Removefn, AD_Table_Tree_ID, Disable_Parent_Key_Property, Hqltreewhereclause, IsReadOnlyTree, IsShowTreeNodeIcons, DefaultTreeViewLogic, AD_ColumnSortOrder_ID, AD_ColumnSortYesNo_ID, IsSortTab, AD_Image_ID, Included_Tab_ID, AD_Org_ID, CommitWarning, AD_Column_ID, AD_Client_ID, AD_Tab_ID, AD_Window_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adModuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uipattern);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablevel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, whereclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hqlwhereclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, filterclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hqlfilterclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, filtername);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderbyclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hqlorderbyclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinfotab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istranslationtab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issinglerow);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hastree);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, showparentbuttons);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, editreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, displaylogic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, importfields);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappCanAdd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappCanDelete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappShowSelect);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappNewfn);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emObuiappRemovefn);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableTreeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, disableParentKeyProperty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hqltreewhereclause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isreadonlytree);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isshowtreenodeicons);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaulttreeviewlogic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adColumnsortorderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adColumnsortyesnoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issorttab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adImageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, includedTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, commitwarning);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adColumnId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int delete(ConnectionProvider connectionProvider, String param1, String adWindowId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM AD_Tab" +
      "        WHERE AD_Tab.AD_Tab_ID = ? " +
      "                 AND AD_Tab.AD_Window_ID = ? " +
      "        AND AD_Tab.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Tab.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM AD_Tab" +
      "         WHERE AD_Tab.AD_Tab_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_ORG_ID");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM AD_Tab" +
      "         WHERE AD_Tab.AD_Tab_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }
}
