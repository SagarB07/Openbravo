//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.EndYearClose;

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
class EndYearCloseData implements FieldProvider {
static Logger log4j = Logger.getLogger(EndYearCloseData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String isactive;
  public String cCalendarId;
  public String cCalendarIdr;
  public String cYearId;
  public String cYearIdr;
  public String status;
  public String statusr;
  public String processed;
  public String processedBtn;
  public String adClientId;
  public String cYearCloseVId;
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
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("C_CALENDAR_ID") || fieldName.equals("cCalendarId"))
      return cCalendarId;
    else if (fieldName.equalsIgnoreCase("C_CALENDAR_IDR") || fieldName.equals("cCalendarIdr"))
      return cCalendarIdr;
    else if (fieldName.equalsIgnoreCase("C_YEAR_ID") || fieldName.equals("cYearId"))
      return cYearId;
    else if (fieldName.equalsIgnoreCase("C_YEAR_IDR") || fieldName.equals("cYearIdr"))
      return cYearIdr;
    else if (fieldName.equalsIgnoreCase("STATUS"))
      return status;
    else if (fieldName.equalsIgnoreCase("STATUSR"))
      return statusr;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("PROCESSED_BTN") || fieldName.equals("processedBtn"))
      return processedBtn;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("C_YEAR_CLOSE_V_ID") || fieldName.equals("cYearCloseVId"))
      return cYearCloseVId;
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
  public static EndYearCloseData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static EndYearCloseData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(c_year_close_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_year_close_v.CreatedBy) as CreatedByR, " +
      "        to_char(c_year_close_v.Updated, ?) as updated, " +
      "        to_char(c_year_close_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        c_year_close_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_year_close_v.UpdatedBy) as UpdatedByR," +
      "        c_year_close_v.AD_Org_ID, " +
      "(CASE WHEN c_year_close_v.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "COALESCE(c_year_close_v.Isactive, 'N') AS Isactive, " +
      "c_year_close_v.C_Calendar_ID, " +
      "(CASE WHEN c_year_close_v.C_Calendar_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_Calendar_IDR, " +
      "c_year_close_v.C_Year_ID, " +
      "(CASE WHEN c_year_close_v.C_Year_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Year), ''))),'') ) END) AS C_Year_IDR, " +
      "c_year_close_v.Status, " +
      "(CASE WHEN c_year_close_v.Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS StatusR, " +
      "c_year_close_v.Processed, " +
      "list2.name as Processed_BTN, " +
      "c_year_close_v.AD_Client_ID, " +
      "c_year_close_v.C_Year_Close_V_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM c_year_close_v left join (select AD_Org_ID, Value from AD_Org) table1 on (c_year_close_v.AD_Org_ID = table1.AD_Org_ID) left join (select C_Calendar_ID, Name from C_Calendar) table2 on (c_year_close_v.C_Calendar_ID = table2.C_Calendar_ID) left join (select C_Year_ID, Year from C_Year) table3 on (c_year_close_v.C_Year_ID = table3.C_Year_ID) left join ad_ref_list_v list1 on (c_year_close_v.Status = list1.value and list1.ad_reference_id = 'CBFE484519794465B6BED250F7FB26AF' and list1.ad_language = ?)  left join ad_ref_list_v list2 on (list2.ad_reference_id = 'CBF00FA9F3744F1A86025AD16F2AF86A' and list2.ad_language = ?  AND c_year_close_v.Processed = TO_CHAR(list2.value))" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND c_year_close_v.C_Year_Close_V_ID = ? " +
      "        AND c_year_close_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND c_year_close_v.AD_Org_ID IN (";
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
        EndYearCloseData objectEndYearCloseData = new EndYearCloseData();
        objectEndYearCloseData.created = UtilSql.getValue(result, "CREATED");
        objectEndYearCloseData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectEndYearCloseData.updated = UtilSql.getValue(result, "UPDATED");
        objectEndYearCloseData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectEndYearCloseData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectEndYearCloseData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectEndYearCloseData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectEndYearCloseData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectEndYearCloseData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectEndYearCloseData.cCalendarId = UtilSql.getValue(result, "C_CALENDAR_ID");
        objectEndYearCloseData.cCalendarIdr = UtilSql.getValue(result, "C_CALENDAR_IDR");
        objectEndYearCloseData.cYearId = UtilSql.getValue(result, "C_YEAR_ID");
        objectEndYearCloseData.cYearIdr = UtilSql.getValue(result, "C_YEAR_IDR");
        objectEndYearCloseData.status = UtilSql.getValue(result, "STATUS");
        objectEndYearCloseData.statusr = UtilSql.getValue(result, "STATUSR");
        objectEndYearCloseData.processed = UtilSql.getValue(result, "PROCESSED");
        objectEndYearCloseData.processedBtn = UtilSql.getValue(result, "PROCESSED_BTN");
        objectEndYearCloseData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectEndYearCloseData.cYearCloseVId = UtilSql.getValue(result, "C_YEAR_CLOSE_V_ID");
        objectEndYearCloseData.language = UtilSql.getValue(result, "LANGUAGE");
        objectEndYearCloseData.adUserClient = "";
        objectEndYearCloseData.adOrgClient = "";
        objectEndYearCloseData.createdby = "";
        objectEndYearCloseData.trBgcolor = "";
        objectEndYearCloseData.totalCount = "";
        objectEndYearCloseData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEndYearCloseData);
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
    EndYearCloseData objectEndYearCloseData[] = new EndYearCloseData[vector.size()];
    vector.copyInto(objectEndYearCloseData);
    return(objectEndYearCloseData);
  }

/**
Create a registry
 */
  public static EndYearCloseData[] set(String adOrgId, String updatedby, String updatedbyr, String createdby, String createdbyr, String cYearCloseVId, String processed, String processedBtn, String cCalendarId, String cYearId, String isactive, String adClientId, String status)    throws ServletException {
    EndYearCloseData objectEndYearCloseData[] = new EndYearCloseData[1];
    objectEndYearCloseData[0] = new EndYearCloseData();
    objectEndYearCloseData[0].created = "";
    objectEndYearCloseData[0].createdbyr = createdbyr;
    objectEndYearCloseData[0].updated = "";
    objectEndYearCloseData[0].updatedTimeStamp = "";
    objectEndYearCloseData[0].updatedby = updatedby;
    objectEndYearCloseData[0].updatedbyr = updatedbyr;
    objectEndYearCloseData[0].adOrgId = adOrgId;
    objectEndYearCloseData[0].adOrgIdr = "";
    objectEndYearCloseData[0].isactive = isactive;
    objectEndYearCloseData[0].cCalendarId = cCalendarId;
    objectEndYearCloseData[0].cCalendarIdr = "";
    objectEndYearCloseData[0].cYearId = cYearId;
    objectEndYearCloseData[0].cYearIdr = "";
    objectEndYearCloseData[0].status = status;
    objectEndYearCloseData[0].statusr = "";
    objectEndYearCloseData[0].processed = processed;
    objectEndYearCloseData[0].processedBtn = processedBtn;
    objectEndYearCloseData[0].adClientId = adClientId;
    objectEndYearCloseData[0].cYearCloseVId = cYearCloseVId;
    objectEndYearCloseData[0].language = "";
    return objectEndYearCloseData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef42FD5A0809DE4C8A9A1EED054DB0C0F6_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Updatedby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedbyR);

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
Select for auxiliar field
 */
  public static String selectDef59308E52846C4653BAA7961CBC0CBD6B_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Createdby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedbyR);

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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE c_year_close_v" +
      "        SET AD_Org_ID = (?) , Isactive = (?) , C_Calendar_ID = (?) , C_Year_ID = (?) , Status = (?) , Processed = (?) , AD_Client_ID = (?) , C_Year_Close_V_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE c_year_close_v.C_Year_Close_V_ID = ? " +
      "        AND c_year_close_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_year_close_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCalendarId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearCloseVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearCloseVId);
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
      "        INSERT INTO c_year_close_v " +
      "        (AD_Org_ID, Isactive, C_Calendar_ID, C_Year_ID, Status, Processed, AD_Client_ID, C_Year_Close_V_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCalendarId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearCloseVId);
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
      "        DELETE FROM c_year_close_v" +
      "        WHERE c_year_close_v.C_Year_Close_V_ID = ? " +
      "        AND c_year_close_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_year_close_v.AD_Org_ID IN (";
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
      "          FROM c_year_close_v" +
      "         WHERE c_year_close_v.C_Year_Close_V_ID = ? ";

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
      "          FROM c_year_close_v" +
      "         WHERE c_year_close_v.C_Year_Close_V_ID = ? ";

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
