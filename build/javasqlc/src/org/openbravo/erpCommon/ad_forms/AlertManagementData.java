//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class AlertManagementData implements FieldProvider {
static Logger log4j = Logger.getLogger(AlertManagementData.class);
  private String InitRecordNumber="0";
  public String adAlertruleId;
  public String rulename;
  public String alertdescription;
  public String adAlertId;
  public String note;
  public String recordId;
  public String isactive;
  public String isfixed;
  public String referencekeyId;
  public String filterclause;
  public String display;
  public String windowname;
  public String tabname;
  public String adTabId;
  public String columnname;
  public String url;
  public String id;
  public String name;
  public String position;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_ALERTRULE_ID") || fieldName.equals("adAlertruleId"))
      return adAlertruleId;
    else if (fieldName.equalsIgnoreCase("RULENAME"))
      return rulename;
    else if (fieldName.equalsIgnoreCase("ALERTDESCRIPTION"))
      return alertdescription;
    else if (fieldName.equalsIgnoreCase("AD_ALERT_ID") || fieldName.equals("adAlertId"))
      return adAlertId;
    else if (fieldName.equalsIgnoreCase("NOTE"))
      return note;
    else if (fieldName.equalsIgnoreCase("RECORD_ID") || fieldName.equals("recordId"))
      return recordId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ISFIXED"))
      return isfixed;
    else if (fieldName.equalsIgnoreCase("REFERENCEKEY_ID") || fieldName.equals("referencekeyId"))
      return referencekeyId;
    else if (fieldName.equalsIgnoreCase("FILTERCLAUSE"))
      return filterclause;
    else if (fieldName.equalsIgnoreCase("DISPLAY"))
      return display;
    else if (fieldName.equalsIgnoreCase("WINDOWNAME"))
      return windowname;
    else if (fieldName.equalsIgnoreCase("TABNAME"))
      return tabname;
    else if (fieldName.equalsIgnoreCase("AD_TAB_ID") || fieldName.equals("adTabId"))
      return adTabId;
    else if (fieldName.equalsIgnoreCase("COLUMNNAME"))
      return columnname;
    else if (fieldName.equalsIgnoreCase("URL"))
      return url;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equals("position"))
      return position;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AlertManagementData[] select(ConnectionProvider connectionProvider, String active, String fixed, String userclient, String userorg, String user, String role, String alertRule, String whereClause)    throws ServletException {
    return select(connectionProvider, active, fixed, userclient, userorg, user, role, alertRule, whereClause, 0, 0);
  }

  public static AlertManagementData[] select(ConnectionProvider connectionProvider, String active, String fixed, String userclient, String userorg, String user, String role, String alertRule, String whereClause, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT DISTINCT AD_ALERTRULE.AD_ALERTRULE_ID," +
      "              '' as RuleName," +
      "              AD_ALERT.Description as AlertDescription," +
      "              AD_ALERT.AD_ALERT_ID," +
      "              AD_ALERT.NOTE," +
      "              AD_ALERT.RECORD_ID," +
      "              AD_ALERT.ISACTIVE," +
      "              AD_ALERT.ISFIXED," +
      "              AD_ALERT.REFERENCEKEY_ID," +
      "              '' AS FILTERCLAUSE," +
      "              '' AS DISPLAY," +
      "              AD_WINDOW.NAME as WINDOWNAME," +
      "              AD_TAB.NAME AS TABNAME," +
      "              AD_TAB.AD_TAB_ID," +
      "              AD_COLUMN.COLUMNNAME," +
      "              '' AS URL," +
      "              '' AS ID," +
      "              '' AS NAME" +
      "         FROM AD_ALERT," +
      "              AD_ALERTRECIPIENT," +
      "              AD_ALERTRULE LEFT JOIN AD_TAB ON AD_TAB.AD_TAB_ID = AD_ALERTRULE.AD_TAB_ID" +
      "                             LEFT JOIN AD_WINDOW ON AD_WINDOW.AD_WINDOW_ID = AD_TAB.AD_WINDOW_ID" +
      "                             LEFT JOIN AD_COLUMN ON AD_COLUMN.AD_TABLE_ID = AD_TAB.AD_TABLE_ID" +
      "                                                  AND AD_COLUMN.ISKEY='Y'" +
      "        WHERE AD_ALERTRULE.ISACTIVE = 'Y'" +
      "          AND AD_ALERT.ISACTIVE = ?" +
      "          AND AD_ALERT.ISFIXED  = ?" +
      "          AND AD_ALERT.AD_CLIENT_ID IN (";
    strSql = strSql + ((userclient==null || userclient.equals(""))?"":userclient);
    strSql = strSql + 
      ") " +
      "          AND AD_ALERT.AD_ORG_ID IN (";
    strSql = strSql + ((userorg==null || userorg.equals(""))?"":userorg);
    strSql = strSql + 
      ")" +
      "          AND AD_ALERTRULE.AD_ALERTRULE_ID = AD_ALERT.AD_ALERTRULE_ID" +
      "          AND AD_ALERTRECIPIENT.AD_ALERTRULE_ID = AD_ALERT.AD_ALERTRULE_ID" +
      "          AND ((AD_ALERTRECIPIENT.AD_USER_ID IS NOT NULL AND AD_ALERTRECIPIENT.AD_USER_ID = ?) " +
      "               OR " +
      "              (AD_ALERTRECIPIENT.AD_USER_ID IS NULL AND AD_ALERTRECIPIENT.AD_ROLE_ID = ?)) " +
      "          AND AD_ALERT.AD_ALERTRULE_ID = ?" +
      "          AND 1=1 ";
    strSql = strSql + ((whereClause==null || whereClause.equals(""))?"":whereClause);
    strSql = strSql + 
      "          ORDER BY AD_ALERTRULE.AD_ALERTRULE_ID, AD_ALERT.AD_ALERT_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, active);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixed);
      if (userclient != null && !(userclient.equals(""))) {
        }
      if (userorg != null && !(userorg.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, role);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, alertRule);
      if (whereClause != null && !(whereClause.equals(""))) {
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
        AlertManagementData objectAlertManagementData = new AlertManagementData();
        objectAlertManagementData.adAlertruleId = UtilSql.getValue(result, "AD_ALERTRULE_ID");
        objectAlertManagementData.rulename = UtilSql.getValue(result, "RULENAME");
        objectAlertManagementData.alertdescription = UtilSql.getValue(result, "ALERTDESCRIPTION");
        objectAlertManagementData.adAlertId = UtilSql.getValue(result, "AD_ALERT_ID");
        objectAlertManagementData.note = UtilSql.getValue(result, "NOTE");
        objectAlertManagementData.recordId = UtilSql.getValue(result, "RECORD_ID");
        objectAlertManagementData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectAlertManagementData.isfixed = UtilSql.getValue(result, "ISFIXED");
        objectAlertManagementData.referencekeyId = UtilSql.getValue(result, "REFERENCEKEY_ID");
        objectAlertManagementData.filterclause = UtilSql.getValue(result, "FILTERCLAUSE");
        objectAlertManagementData.display = UtilSql.getValue(result, "DISPLAY");
        objectAlertManagementData.windowname = UtilSql.getValue(result, "WINDOWNAME");
        objectAlertManagementData.tabname = UtilSql.getValue(result, "TABNAME");
        objectAlertManagementData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectAlertManagementData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectAlertManagementData.url = UtilSql.getValue(result, "URL");
        objectAlertManagementData.id = UtilSql.getValue(result, "ID");
        objectAlertManagementData.name = UtilSql.getValue(result, "NAME");
        objectAlertManagementData.position = Long.toString(countRecord);
        objectAlertManagementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertManagementData);
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
    AlertManagementData objectAlertManagementData[] = new AlertManagementData[vector.size()];
    vector.copyInto(objectAlertManagementData);
    return(objectAlertManagementData);
  }

  public static AlertManagementData[] selectAlertRules(ConnectionProvider connectionProvider, String lang, String user, String role, String alertRule)    throws ServletException {
    return selectAlertRules(connectionProvider, lang, user, role, alertRule, 0, 0);
  }

  public static AlertManagementData[] selectAlertRules(ConnectionProvider connectionProvider, String lang, String user, String role, String alertRule, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT DISTINCT AD_ALERTRULE.AD_ALERTRULE_ID," +
      "              AD_ALERTRULE.FILTERCLAUSE," +
      "              AD_COLUMN_IDENTIFIER('AD_AlertRule',to_char(AD_ALERTRULE.AD_ALERTRULE_ID),to_char(?)) as rulename      " +
      "         FROM AD_ALERTRULE," +
      "              AD_ALERTRECIPIENT" +
      "        WHERE AD_ALERTRULE.ISACTIVE='Y'" +
      "          AND AD_ALERTRECIPIENT.AD_ALERTRULE_ID = AD_ALERTRULE.AD_ALERTRULE_ID" +
      "          AND ((AD_ALERTRECIPIENT.AD_USER_ID IS NOT NULL AND AD_ALERTRECIPIENT.AD_USER_ID = ?) " +
      "               OR " +
      "              (AD_ALERTRECIPIENT.AD_USER_ID IS NULL AND AD_ALERTRECIPIENT.AD_ROLE_ID = ?)) " +
      "          AND 1=1";
    strSql = strSql + ((alertRule==null || alertRule.equals(""))?"":"  AND AD_ALERTRULE.AD_ALERTRULE_ID = ? ");

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, role);
      if (alertRule != null && !(alertRule.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, alertRule);
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
        AlertManagementData objectAlertManagementData = new AlertManagementData();
        objectAlertManagementData.adAlertruleId = UtilSql.getValue(result, "AD_ALERTRULE_ID");
        objectAlertManagementData.filterclause = UtilSql.getValue(result, "FILTERCLAUSE");
        objectAlertManagementData.rulename = UtilSql.getValue(result, "RULENAME");
        objectAlertManagementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertManagementData);
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
    AlertManagementData objectAlertManagementData[] = new AlertManagementData[vector.size()];
    vector.copyInto(objectAlertManagementData);
    return(objectAlertManagementData);
  }

  public static AlertManagementData[] selectComboAlertRules(ConnectionProvider connectionProvider, String lang, String user, String role)    throws ServletException {
    return selectComboAlertRules(connectionProvider, lang, user, role, 0, 0);
  }

  public static AlertManagementData[] selectComboAlertRules(ConnectionProvider connectionProvider, String lang, String user, String role, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT AD_ALERTRULE.AD_ALERTRULE_ID as ID," +
      "              AD_COLUMN_IDENTIFIER('AD_AlertRule',to_char(AD_ALERTRULE.AD_ALERTRULE_ID),to_char(?)) as name" +
      "         FROM AD_ALERTRULE," +
      "              AD_ALERTRECIPIENT" +
      "        WHERE AD_ALERTRULE.ISACTIVE='Y'" +
      "          AND AD_ALERTRECIPIENT.AD_ALERTRULE_ID = AD_ALERTRULE.AD_ALERTRULE_ID" +
      "          AND ((AD_ALERTRECIPIENT.AD_USER_ID IS NOT NULL AND AD_ALERTRECIPIENT.AD_USER_ID = ?) " +
      "               OR " +
      "              (AD_ALERTRECIPIENT.AD_USER_ID IS NULL AND AD_ALERTRECIPIENT.AD_ROLE_ID = ?)) ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, role);

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
        AlertManagementData objectAlertManagementData = new AlertManagementData();
        objectAlertManagementData.id = UtilSql.getValue(result, "ID");
        objectAlertManagementData.name = UtilSql.getValue(result, "NAME");
        objectAlertManagementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertManagementData);
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
    AlertManagementData objectAlertManagementData[] = new AlertManagementData[vector.size()];
    vector.copyInto(objectAlertManagementData);
    return(objectAlertManagementData);
  }

  public static int update(ConnectionProvider connectionProvider, String note, String fixed, String active, String alert)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       UPDATE AD_ALERT" +
      "          SET NOTE = ?," +
      "              ISFIXED = ?," +
      "              ISACTIVE = ?" +
      "        WHERE AD_ALERT_ID = ?              ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, note);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, active);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, alert);

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
}
