//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Session;

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
class SessionData implements FieldProvider {
static Logger log4j = Logger.getLogger(SessionData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String username;
  public String remoteAddr;
  public String remoteHost;
  public String serverUrl;
  public String loginStatus;
  public String loginStatusr;
  public String lastSessionPing;
  public String sessionActive;
  public String processed;
  public String adSessionId;
  public String adOrgId;
  public String isactive;
  public String adClientId;
  public String websession;
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
    else if (fieldName.equalsIgnoreCase("USERNAME"))
      return username;
    else if (fieldName.equalsIgnoreCase("REMOTE_ADDR") || fieldName.equals("remoteAddr"))
      return remoteAddr;
    else if (fieldName.equalsIgnoreCase("REMOTE_HOST") || fieldName.equals("remoteHost"))
      return remoteHost;
    else if (fieldName.equalsIgnoreCase("SERVER_URL") || fieldName.equals("serverUrl"))
      return serverUrl;
    else if (fieldName.equalsIgnoreCase("LOGIN_STATUS") || fieldName.equals("loginStatus"))
      return loginStatus;
    else if (fieldName.equalsIgnoreCase("LOGIN_STATUSR") || fieldName.equals("loginStatusr"))
      return loginStatusr;
    else if (fieldName.equalsIgnoreCase("LAST_SESSION_PING") || fieldName.equals("lastSessionPing"))
      return lastSessionPing;
    else if (fieldName.equalsIgnoreCase("SESSION_ACTIVE") || fieldName.equals("sessionActive"))
      return sessionActive;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("AD_SESSION_ID") || fieldName.equals("adSessionId"))
      return adSessionId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("WEBSESSION"))
      return websession;
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
  public static SessionData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static SessionData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_Session.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Session.CreatedBy) as CreatedByR, " +
      "        to_char(AD_Session.Updated, ?) as updated, " +
      "        to_char(AD_Session.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_Session.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Session.UpdatedBy) as UpdatedByR," +
      "        AD_Session.Username, " +
      "AD_Session.Remote_Addr, " +
      "AD_Session.Remote_Host, " +
      "AD_Session.Server_Url, " +
      "AD_Session.Login_Status, " +
      "(CASE WHEN AD_Session.Login_Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS Login_StatusR, " +
      "TO_CHAR(AD_Session.Last_Session_Ping, ?) AS Last_Session_Ping, " +
      "AD_Session.Session_Active, " +
      "COALESCE(AD_Session.Processed, 'N') AS Processed, " +
      "AD_Session.AD_Session_ID, " +
      "AD_Session.AD_Org_ID, " +
      "COALESCE(AD_Session.IsActive, 'N') AS IsActive, " +
      "AD_Session.AD_Client_ID, " +
      "AD_Session.WebSession, " +
      "        ? AS LANGUAGE " +
      "        FROM AD_Session left join ad_ref_list_v list1 on (AD_Session.Login_Status = list1.value and list1.ad_reference_id = '86086D70DDBC42B09E2BEB51D25C159F' and list1.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND AD_Session.AD_Session_ID = ? " +
      "        AND AD_Session.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND AD_Session.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
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
        SessionData objectSessionData = new SessionData();
        objectSessionData.created = UtilSql.getValue(result, "CREATED");
        objectSessionData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectSessionData.updated = UtilSql.getValue(result, "UPDATED");
        objectSessionData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectSessionData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectSessionData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectSessionData.username = UtilSql.getValue(result, "USERNAME");
        objectSessionData.remoteAddr = UtilSql.getValue(result, "REMOTE_ADDR");
        objectSessionData.remoteHost = UtilSql.getValue(result, "REMOTE_HOST");
        objectSessionData.serverUrl = UtilSql.getValue(result, "SERVER_URL");
        objectSessionData.loginStatus = UtilSql.getValue(result, "LOGIN_STATUS");
        objectSessionData.loginStatusr = UtilSql.getValue(result, "LOGIN_STATUSR");
        objectSessionData.lastSessionPing = UtilSql.getValue(result, "LAST_SESSION_PING");
        objectSessionData.sessionActive = UtilSql.getValue(result, "SESSION_ACTIVE");
        objectSessionData.processed = UtilSql.getValue(result, "PROCESSED");
        objectSessionData.adSessionId = UtilSql.getValue(result, "AD_SESSION_ID");
        objectSessionData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectSessionData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectSessionData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectSessionData.websession = UtilSql.getValue(result, "WEBSESSION");
        objectSessionData.language = UtilSql.getValue(result, "LANGUAGE");
        objectSessionData.adUserClient = "";
        objectSessionData.adOrgClient = "";
        objectSessionData.createdby = "";
        objectSessionData.trBgcolor = "";
        objectSessionData.totalCount = "";
        objectSessionData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSessionData);
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
    SessionData objectSessionData[] = new SessionData[vector.size()];
    vector.copyInto(objectSessionData);
    return(objectSessionData);
  }

/**
Create a registry
 */
  public static SessionData[] set(String sessionActive, String serverUrl, String lastSessionPing, String username, String loginStatus, String adClientId, String createdby, String createdbyr, String remoteAddr, String remoteHost, String created, String updatedby, String updatedbyr, String isactive, String adOrgId, String websession, String adSessionId, String processed)    throws ServletException {
    SessionData objectSessionData[] = new SessionData[1];
    objectSessionData[0] = new SessionData();
    objectSessionData[0].created = created;
    objectSessionData[0].createdbyr = createdbyr;
    objectSessionData[0].updated = "";
    objectSessionData[0].updatedTimeStamp = "";
    objectSessionData[0].updatedby = updatedby;
    objectSessionData[0].updatedbyr = updatedbyr;
    objectSessionData[0].username = username;
    objectSessionData[0].remoteAddr = remoteAddr;
    objectSessionData[0].remoteHost = remoteHost;
    objectSessionData[0].serverUrl = serverUrl;
    objectSessionData[0].loginStatus = loginStatus;
    objectSessionData[0].loginStatusr = "";
    objectSessionData[0].lastSessionPing = lastSessionPing;
    objectSessionData[0].sessionActive = sessionActive;
    objectSessionData[0].processed = processed;
    objectSessionData[0].adSessionId = adSessionId;
    objectSessionData[0].adOrgId = adOrgId;
    objectSessionData[0].isactive = isactive;
    objectSessionData[0].adClientId = adClientId;
    objectSessionData[0].websession = websession;
    objectSessionData[0].language = "";
    return objectSessionData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef8577_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef8581_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_Session" +
      "        SET Username = (?) , Remote_Addr = (?) , Remote_Host = (?) , Server_Url = (?) , Login_Status = (?) , Last_Session_Ping = TO_TIMESTAMP(?, ?) , Session_Active = (?) , Processed = (?) , WebSession = (?) , AD_Org_ID = (?) , IsActive = (?) , AD_Client_ID = (?) , AD_Session_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE AD_Session.AD_Session_ID = ? " +
      "        AND AD_Session.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Session.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, username);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remoteAddr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remoteHost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serverUrl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, loginStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastSessionPing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sessionActive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, websession);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adSessionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adSessionId);
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
      "        INSERT INTO AD_Session " +
      "        (Username, Remote_Addr, Remote_Host, Server_Url, Login_Status, Last_Session_Ping, Session_Active, Processed, AD_Session_ID, AD_Org_ID, IsActive, AD_Client_ID, WebSession, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), TO_TIMESTAMP(?, ?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, username);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remoteAddr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remoteHost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serverUrl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, loginStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastSessionPing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sessionActive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adSessionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, websession);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM AD_Session" +
      "        WHERE AD_Session.AD_Session_ID = ? " +
      "        AND AD_Session.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Session.AD_Org_ID IN (";
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
      "          FROM AD_Session" +
      "         WHERE AD_Session.AD_Session_ID = ? ";

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
      "          FROM AD_Session" +
      "         WHERE AD_Session.AD_Session_ID = ? ";

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
