//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_process;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class AlertProcessData implements FieldProvider {
static Logger log4j = Logger.getLogger(AlertProcessData.class);
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String isactive;
  public String adUserId;
  public String adRoleId;
  public String recordId;
  public String description;
  public String referencekeyId;
  public String adAlertruleId;
  public String sql;
  public String name;
  public String smtphost;
  public String requestuser;
  public String requestuserpw;
  public String mailto;
  public String mailfrom;
  public String adLanguage;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBY"))
      return createdby;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("AD_ROLE_ID") || fieldName.equals("adRoleId"))
      return adRoleId;
    else if (fieldName.equalsIgnoreCase("RECORD_ID") || fieldName.equals("recordId"))
      return recordId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("REFERENCEKEY_ID") || fieldName.equals("referencekeyId"))
      return referencekeyId;
    else if (fieldName.equalsIgnoreCase("AD_ALERTRULE_ID") || fieldName.equals("adAlertruleId"))
      return adAlertruleId;
    else if (fieldName.equalsIgnoreCase("SQL"))
      return sql;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("SMTPHOST"))
      return smtphost;
    else if (fieldName.equalsIgnoreCase("REQUESTUSER"))
      return requestuser;
    else if (fieldName.equalsIgnoreCase("REQUESTUSERPW"))
      return requestuserpw;
    else if (fieldName.equalsIgnoreCase("MAILTO"))
      return mailto;
    else if (fieldName.equalsIgnoreCase("MAILFROM"))
      return mailfrom;
    else if (fieldName.equalsIgnoreCase("AD_LANGUAGE") || fieldName.equals("adLanguage"))
      return adLanguage;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AlertProcessData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static AlertProcessData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT '' AS AD_CLIENT_ID," +
      "               '' AS AD_ORG_ID," +
      "               '' AS CREATED," +
      "               '' AS CREATEDBY," +
      "               '' AS UPDATED," +
      "               '' AS UPDATEDBY," +
      "               '' AS ISACTIVE," +
      "               '' AS AD_USER_ID," +
      "               '' AS AD_ROLE_ID," +
      "               '' AS RECORD_ID," +
      "               '' AS DESCRIPTION," +
      "               '' AS REFERENCEKEY_ID, " +
      "               '' AS AD_ALERTRULE_ID," +
      "               '' AS SQL," +
      "               '' AS NAME," +
      "               '' AS SMTPHOST," +
      "               '' AS REQUESTUSER," +
      "               '' AS REQUESTUSERPW," +
      "               '' AS MAILTO," +
      "               '' AS MAILFROM," +
      "               '' AS AD_LANGUAGE" +
      "          FROM DUAL";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        AlertProcessData objectAlertProcessData = new AlertProcessData();
        objectAlertProcessData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAlertProcessData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAlertProcessData.created = UtilSql.getValue(result, "CREATED");
        objectAlertProcessData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectAlertProcessData.updated = UtilSql.getValue(result, "UPDATED");
        objectAlertProcessData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectAlertProcessData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectAlertProcessData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectAlertProcessData.adRoleId = UtilSql.getValue(result, "AD_ROLE_ID");
        objectAlertProcessData.recordId = UtilSql.getValue(result, "RECORD_ID");
        objectAlertProcessData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAlertProcessData.referencekeyId = UtilSql.getValue(result, "REFERENCEKEY_ID");
        objectAlertProcessData.adAlertruleId = UtilSql.getValue(result, "AD_ALERTRULE_ID");
        objectAlertProcessData.sql = UtilSql.getValue(result, "SQL");
        objectAlertProcessData.name = UtilSql.getValue(result, "NAME");
        objectAlertProcessData.smtphost = UtilSql.getValue(result, "SMTPHOST");
        objectAlertProcessData.requestuser = UtilSql.getValue(result, "REQUESTUSER");
        objectAlertProcessData.requestuserpw = UtilSql.getValue(result, "REQUESTUSERPW");
        objectAlertProcessData.mailto = UtilSql.getValue(result, "MAILTO");
        objectAlertProcessData.mailfrom = UtilSql.getValue(result, "MAILFROM");
        objectAlertProcessData.adLanguage = UtilSql.getValue(result, "AD_LANGUAGE");
        objectAlertProcessData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertProcessData);
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
    AlertProcessData objectAlertProcessData[] = new AlertProcessData[vector.size()];
    vector.copyInto(objectAlertProcessData);
    return(objectAlertProcessData);
  }

  public static AlertProcessData[] selectSQL(ConnectionProvider connectionProvider)    throws ServletException {
    return selectSQL(connectionProvider, 0, 0);
  }

  public static AlertProcessData[] selectSQL(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ALERTRULE_ID, SQL, NAME, AD_CLIENT_ID, AD_ORG_ID" +
      "          FROM AD_ALERTRULE" +
      "         WHERE ISACTIVE = 'Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        AlertProcessData objectAlertProcessData = new AlertProcessData();
        objectAlertProcessData.adAlertruleId = UtilSql.getValue(result, "AD_ALERTRULE_ID");
        objectAlertProcessData.sql = UtilSql.getValue(result, "SQL");
        objectAlertProcessData.name = UtilSql.getValue(result, "NAME");
        objectAlertProcessData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAlertProcessData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAlertProcessData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertProcessData);
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
    AlertProcessData objectAlertProcessData[] = new AlertProcessData[vector.size()];
    vector.copyInto(objectAlertProcessData);
    return(objectAlertProcessData);
  }

  public static AlertProcessData[] selectSQL(ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    return selectSQL(connectionProvider, adClientId, 0, 0);
  }

  public static AlertProcessData[] selectSQL(ConnectionProvider connectionProvider, String adClientId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ALERTRULE_ID, SQL, NAME, AD_CLIENT_ID, AD_ORG_ID" +
      "          FROM AD_ALERTRULE" +
      "         WHERE ISACTIVE = 'Y'" +
      "           AND AD_CLIENT_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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
        AlertProcessData objectAlertProcessData = new AlertProcessData();
        objectAlertProcessData.adAlertruleId = UtilSql.getValue(result, "AD_ALERTRULE_ID");
        objectAlertProcessData.sql = UtilSql.getValue(result, "SQL");
        objectAlertProcessData.name = UtilSql.getValue(result, "NAME");
        objectAlertProcessData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAlertProcessData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAlertProcessData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertProcessData);
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
    AlertProcessData objectAlertProcessData[] = new AlertProcessData[vector.size()];
    vector.copyInto(objectAlertProcessData);
    return(objectAlertProcessData);
  }

  public static int updateAlert(ConnectionProvider connectionProvider, String alertRuleId, String sql)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_ALERT" +
      "           SET STATUS    = 'SOLVED'," +
      "               UPDATED   = NOW()," +
      "               UPDATEDBY = 0" +
      "         WHERE AD_ALERTRULE_ID = ?" +
      "           AND COALESCE(STATUS, 'NEW') != 'SOLVED'" +
      "           AND NOT EXISTS " +
      "                   (SELECT 1 FROM (";
    strSql = strSql + ((sql==null || sql.equals(""))?"":sql);
    strSql = strSql + 
      ") A WHERE 1=1" +
      "                              AND A.REFERENCEKEY_ID = AD_ALERT.REFERENCEKEY_ID)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, alertRuleId);
      if (sql != null && !(sql.equals(""))) {
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

  public static AlertProcessData[] prepareMails(ConnectionProvider connectionProvider, String alertRuleId)    throws ServletException {
    return prepareMails(connectionProvider, alertRuleId, 0, 0);
  }

  public static AlertProcessData[] prepareMails(ConnectionProvider connectionProvider, String alertRuleId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select c.smtphost, c.requestuser, c.requestuserpw, c.requestemail as mailfrom, " +
      "               u.email as mailto, c.ad_language, c.ad_client_id" +
      "          from ad_alertrecipient  ar, ad_user_roles ur, ad_user u, ad_client c" +
      "          where ar.ad_alertrule_id = ?" +
      "            and ur.ad_role_id = ar.ad_role_id" +
      "            and ur.ad_client_id = ar.ad_client_id" +
      "            and ur.ad_user_id = u.ad_user_id" +
      "            and u.ad_client_id = c.ad_client_id" +
      "            and c.requestuser is not null" +
      "            and c.requestuserpw is not null" +
      "            and u.email is not null" +
      "            and ar.ad_user_id is null" +
      "            and ar.sendemail = 'Y'" +
      "        union" +
      "        select c.smtphost, c.requestuser, c.requestuserpw, c.requestemail as mailfrom, " +
      "               u.email as mailto, c.ad_language, c.ad_client_id" +
      "          from ad_alertrecipient  ar, ad_user u, ad_client c" +
      "          where ar.ad_alertrule_id = ?" +
      "            and u.ad_client_id = c.ad_client_id" +
      "            and ar.ad_user_id = u.ad_user_id" +
      "            and c.requestuser is not null" +
      "            and c.requestuserpw is not null" +
      "            and u.email is not null" +
      "            and ar.ad_user_id is not null" +
      "            and ar.sendemail = 'Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, alertRuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, alertRuleId);

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
        AlertProcessData objectAlertProcessData = new AlertProcessData();
        objectAlertProcessData.smtphost = UtilSql.getValue(result, "SMTPHOST");
        objectAlertProcessData.requestuser = UtilSql.getValue(result, "REQUESTUSER");
        objectAlertProcessData.requestuserpw = UtilSql.getValue(result, "REQUESTUSERPW");
        objectAlertProcessData.mailfrom = UtilSql.getValue(result, "MAILFROM");
        objectAlertProcessData.mailto = UtilSql.getValue(result, "MAILTO");
        objectAlertProcessData.adLanguage = UtilSql.getValue(result, "AD_LANGUAGE");
        objectAlertProcessData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAlertProcessData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertProcessData);
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
    AlertProcessData objectAlertProcessData[] = new AlertProcessData[vector.size()];
    vector.copyInto(objectAlertProcessData);
    return(objectAlertProcessData);
  }
}
