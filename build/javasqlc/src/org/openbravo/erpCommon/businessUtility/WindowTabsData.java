//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.businessUtility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

public class WindowTabsData implements FieldProvider {
static Logger log4j = Logger.getLogger(WindowTabsData.class);
  private String InitRecordNumber="0";
  public String adTabId;
  public String tablevel;
  public String name;
  public String tabname;
  public String seqno;
  public String istranslationtab;
  public String isinfotab;
  public String isbreadcrumb;
  public String tabnameid;
  public String isactive;
  public String enabled;
  public String id;
  public String action;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_TAB_ID") || fieldName.equals("adTabId"))
      return adTabId;
    else if (fieldName.equalsIgnoreCase("TABLEVEL"))
      return tablevel;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("TABNAME"))
      return tabname;
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("ISTRANSLATIONTAB"))
      return istranslationtab;
    else if (fieldName.equalsIgnoreCase("ISINFOTAB"))
      return isinfotab;
    else if (fieldName.equalsIgnoreCase("ISBREADCRUMB"))
      return isbreadcrumb;
    else if (fieldName.equalsIgnoreCase("TABNAMEID"))
      return tabnameid;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ENABLED"))
      return enabled;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("ACTION"))
      return action;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static WindowTabsData[] select(ConnectionProvider connectionProvider, String adLanguage, String adWindowId)    throws ServletException {
    return select(connectionProvider, adLanguage, adWindowId, 0, 0);
  }

  public static WindowTabsData[] select(ConnectionProvider connectionProvider, String adLanguage, String adWindowId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select t.AD_Tab_ID, t.TabLevel, t.Name, coalesce(t_trl.name, t.name) as tabname, t.seqno, " +
      "        t.IsTranslationTab, t.isInfoTab, 'N' AS isBreadCrumb, ('tabname' || t.ad_tab_id) AS tabNameId," +
      "        t.isActive, m.enabled, '' AS ID, '' AS Action" +
      "        from ad_tab t left join ad_tab_trl t_trl on t.ad_tab_id = t_trl.ad_tab_id" +
      "                              and t_trl.ad_language = ?," +
      "             ad_module m" +
      "        where t.ad_window_id = ?" +
      "          and t.ad_module_id = m.ad_module_id" +
      "        order by t.seqno, t.tablevel";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);

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
        WindowTabsData objectWindowTabsData = new WindowTabsData();
        objectWindowTabsData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectWindowTabsData.tablevel = UtilSql.getValue(result, "TABLEVEL");
        objectWindowTabsData.name = UtilSql.getValue(result, "NAME");
        objectWindowTabsData.tabname = UtilSql.getValue(result, "TABNAME");
        objectWindowTabsData.seqno = UtilSql.getValue(result, "SEQNO");
        objectWindowTabsData.istranslationtab = UtilSql.getValue(result, "ISTRANSLATIONTAB");
        objectWindowTabsData.isinfotab = UtilSql.getValue(result, "ISINFOTAB");
        objectWindowTabsData.isbreadcrumb = UtilSql.getValue(result, "ISBREADCRUMB");
        objectWindowTabsData.tabnameid = UtilSql.getValue(result, "TABNAMEID");
        objectWindowTabsData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectWindowTabsData.enabled = UtilSql.getValue(result, "ENABLED");
        objectWindowTabsData.id = UtilSql.getValue(result, "ID");
        objectWindowTabsData.action = UtilSql.getValue(result, "ACTION");
        objectWindowTabsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTabsData);
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
    WindowTabsData objectWindowTabsData[] = new WindowTabsData[vector.size()];
    vector.copyInto(objectWindowTabsData);
    return(objectWindowTabsData);
  }

  public static WindowTabsData[] selectManual(ConnectionProvider connectionProvider, String adTabId, String adLanguage, String adMenuId)    throws ServletException {
    return selectManual(connectionProvider, adTabId, adLanguage, adMenuId, 0, 0);
  }

  public static WindowTabsData[] selectManual(ConnectionProvider connectionProvider, String adTabId, String adLanguage, String adMenuId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select ? AS AD_Tab_ID, '0' AS TabLevel, m.Name, coalesce(m_trl.name, m.name) as tabname, '10' AS seqno, " +
      "        '' AS IsTranslationTab, '' AS isInfoTab, 'N' AS isBreadCrumb" +
      "        from ad_menu m left join ad_menu_trl m_trl on m.ad_menu_id = m_trl.ad_menu_id" +
      "                              and m_trl.ad_language = ?" +
      "        where m.isactive = 'Y'" +
      "        and m.ad_menu_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adMenuId);

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
        WindowTabsData objectWindowTabsData = new WindowTabsData();
        objectWindowTabsData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectWindowTabsData.tablevel = UtilSql.getValue(result, "TABLEVEL");
        objectWindowTabsData.name = UtilSql.getValue(result, "NAME");
        objectWindowTabsData.tabname = UtilSql.getValue(result, "TABNAME");
        objectWindowTabsData.seqno = UtilSql.getValue(result, "SEQNO");
        objectWindowTabsData.istranslationtab = UtilSql.getValue(result, "ISTRANSLATIONTAB");
        objectWindowTabsData.isinfotab = UtilSql.getValue(result, "ISINFOTAB");
        objectWindowTabsData.isbreadcrumb = UtilSql.getValue(result, "ISBREADCRUMB");
        objectWindowTabsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTabsData);
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
    WindowTabsData objectWindowTabsData[] = new WindowTabsData[vector.size()];
    vector.copyInto(objectWindowTabsData);
    return(objectWindowTabsData);
  }

  public static String selectMenu(ConnectionProvider connectionProvider, String adLanguage, String adWindowId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select AD_Parent_Menu_Element(m.AD_Menu_ID, m.AD_Client_ID, ?) AS NAME" +
      "        from ad_menu m " +
      "        where m.ad_window_id = ?" +
      "        and m.isactive = 'Y'" +
      "        and m.action = 'W'";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
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

  public static String selectMenuManual(ConnectionProvider connectionProvider, String adLanguage, String adMenuId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select AD_Parent_Menu_Element(m.AD_Menu_ID, m.AD_Client_ID, ?) AS NAME" +
      "        from ad_menu m " +
      "        where m.ad_menu_id = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adMenuId);

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

  public static WindowTabsData[] selectMenuInfo(ConnectionProvider connectionProvider, String adLanguage, String action, String adTabId)    throws ServletException {
    return selectMenuInfo(connectionProvider, adLanguage, action, adTabId, 0, 0);
  }

  public static WindowTabsData[] selectMenuInfo(ConnectionProvider connectionProvider, String adLanguage, String action, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select m.AD_Menu_ID AS ID, coalesce(mt.name, m.name) as name " +
      "        from AD_Menu m left join ad_menu_trl mt on m.ad_menu_id = mt.ad_menu_id " +
      "                                                  and mt.ad_language = ?" +
      "        where (CASE m.action WHEN 'R' THEN 'P' " +
      "                                  ELSE m.action END) = (CASE ? WHEN 'R' THEN 'P' ELSE ? END) " +
      "        and (m.ad_window_ID = ? " +
      "        or m.ad_process_ID = ? " +
      "        or m.ad_form_ID = ? " +
      "        )";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, action);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, action);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

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
        WindowTabsData objectWindowTabsData = new WindowTabsData();
        objectWindowTabsData.id = UtilSql.getValue(result, "ID");
        objectWindowTabsData.name = UtilSql.getValue(result, "NAME");
        objectWindowTabsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTabsData);
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
    WindowTabsData objectWindowTabsData[] = new WindowTabsData[vector.size()];
    vector.copyInto(objectWindowTabsData);
    return(objectWindowTabsData);
  }

  public static WindowTabsData[] selectJavaInfo(ConnectionProvider connectionProvider, String className)    throws ServletException {
    return selectJavaInfo(connectionProvider, className, 0, 0);
  }

  public static WindowTabsData[] selectJavaInfo(ConnectionProvider connectionProvider, String className, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select (CASE mo.Action" +
      "                   WHEN 'X' THEN mo.AD_Form_ID" +
      "                   WHEN 'P' THEN mo.AD_Process_ID" +
      "                   WHEN 'R' THEN mo.AD_Process_ID" +
      "                   WHEN 'C' THEN mo.AD_CallOut_ID" +
      "                   WHEN 'S' THEN mo.AD_Reference_ID" +
      "                   ELSE mo.AD_Tab_ID END) AS AD_Tab_ID, " +
      "        mom.MAPPINGNAME AS TabName, mo.action" +
      "        from ad_model_object mo, ad_model_object_mapping mom" +
      "        where mo.ad_model_object_id = mom.ad_model_object_id" +
      "        and mo.isActive = 'Y'" +
      "        and mom.isActive = 'Y' " +
      "        and mom.isDefault = 'Y'" +
      "        and UPPER(mo.CLASSNAME) = UPPER(?)";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, className);

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
        WindowTabsData objectWindowTabsData = new WindowTabsData();
        objectWindowTabsData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectWindowTabsData.tabname = UtilSql.getValue(result, "TABNAME");
        objectWindowTabsData.action = UtilSql.getValue(result, "ACTION");
        objectWindowTabsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTabsData);
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
    WindowTabsData objectWindowTabsData[] = new WindowTabsData[vector.size()];
    vector.copyInto(objectWindowTabsData);
    return(objectWindowTabsData);
  }

  public static WindowTabsData[] selectProcessInfo(ConnectionProvider connectionProvider, String processId)    throws ServletException {
    return selectProcessInfo(connectionProvider, processId, 0, 0);
  }

  public static WindowTabsData[] selectProcessInfo(ConnectionProvider connectionProvider, String processId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select ad_process_id as ad_tab_id, 'P' as action" +
      "          from ad_process" +
      "          where ad_process_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processId);

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
        WindowTabsData objectWindowTabsData = new WindowTabsData();
        objectWindowTabsData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectWindowTabsData.action = UtilSql.getValue(result, "ACTION");
        objectWindowTabsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWindowTabsData);
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
    WindowTabsData objectWindowTabsData[] = new WindowTabsData[vector.size()];
    vector.copyInto(objectWindowTabsData);
    return(objectWindowTabsData);
  }

  public static String selectWindowInfo(ConnectionProvider connectionProvider, String adLanguage, String adWindowId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select coalesce(mt.name, m.name) as name " +
      "        from ad_menu m left join ad_menu_trl mt on m.ad_menu_id = mt.ad_menu_id " +
      "                                                and mt.ad_language = ?" +
      "        where m.ad_window_id = ? " +
      "        and m.action = 'W' ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
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
}
