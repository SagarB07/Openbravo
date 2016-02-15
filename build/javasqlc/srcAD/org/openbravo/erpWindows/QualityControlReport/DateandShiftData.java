//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.QualityControlReport;

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
class DateandShiftData implements FieldProvider {
static Logger log4j = Logger.getLogger(DateandShiftData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String measuredate;
  public String shift;
  public String shiftr;
  public String adUserId;
  public String adUserIdr;
  public String observation;
  public String processed;
  public String edit;
  public String maMeasureShiftId;
  public String isactive;
  public String adClientId;
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
    else if (fieldName.equalsIgnoreCase("MEASUREDATE"))
      return measuredate;
    else if (fieldName.equalsIgnoreCase("SHIFT"))
      return shift;
    else if (fieldName.equalsIgnoreCase("SHIFTR"))
      return shiftr;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("AD_USER_IDR") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("OBSERVATION"))
      return observation;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("EDIT"))
      return edit;
    else if (fieldName.equalsIgnoreCase("MA_MEASURE_SHIFT_ID") || fieldName.equals("maMeasureShiftId"))
      return maMeasureShiftId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
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
  public static DateandShiftData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static DateandShiftData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(MA_Measure_Shift.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = MA_Measure_Shift.CreatedBy) as CreatedByR, " +
      "        to_char(MA_Measure_Shift.Updated, ?) as updated, " +
      "        to_char(MA_Measure_Shift.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        MA_Measure_Shift.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = MA_Measure_Shift.UpdatedBy) as UpdatedByR," +
      "        MA_Measure_Shift.AD_Org_ID, " +
      "(CASE WHEN MA_Measure_Shift.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "MA_Measure_Shift.Measuredate, " +
      "MA_Measure_Shift.Shift, " +
      "(CASE WHEN MA_Measure_Shift.Shift IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS ShiftR, " +
      "MA_Measure_Shift.AD_User_ID, " +
      "(CASE WHEN MA_Measure_Shift.AD_User_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "MA_Measure_Shift.Observation, " +
      "MA_Measure_Shift.Processed, " +
      "MA_Measure_Shift.Edit, " +
      "MA_Measure_Shift.MA_Measure_Shift_ID, " +
      "COALESCE(MA_Measure_Shift.IsActive, 'N') AS IsActive, " +
      "MA_Measure_Shift.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM MA_Measure_Shift left join (select AD_Org_ID, Value from AD_Org) table1 on (MA_Measure_Shift.AD_Org_ID = table1.AD_Org_ID) left join ad_ref_list_v list1 on (MA_Measure_Shift.Shift = list1.value and list1.ad_reference_id = '800038' and list1.ad_language = ?)  left join (select AD_User_ID, Name from AD_User) table2 on (MA_Measure_Shift.AD_User_ID = table2.AD_User_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND MA_Measure_Shift.MA_Measure_Shift_ID = ? " +
      "        AND MA_Measure_Shift.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND MA_Measure_Shift.AD_Org_ID IN (";
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
        DateandShiftData objectDateandShiftData = new DateandShiftData();
        objectDateandShiftData.created = UtilSql.getValue(result, "CREATED");
        objectDateandShiftData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectDateandShiftData.updated = UtilSql.getValue(result, "UPDATED");
        objectDateandShiftData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectDateandShiftData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDateandShiftData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectDateandShiftData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDateandShiftData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectDateandShiftData.measuredate = UtilSql.getDateValue(result, "MEASUREDATE", "dd-MM-yyyy");
        objectDateandShiftData.shift = UtilSql.getValue(result, "SHIFT");
        objectDateandShiftData.shiftr = UtilSql.getValue(result, "SHIFTR");
        objectDateandShiftData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectDateandShiftData.adUserIdr = UtilSql.getValue(result, "AD_USER_IDR");
        objectDateandShiftData.observation = UtilSql.getValue(result, "OBSERVATION");
        objectDateandShiftData.processed = UtilSql.getValue(result, "PROCESSED");
        objectDateandShiftData.edit = UtilSql.getValue(result, "EDIT");
        objectDateandShiftData.maMeasureShiftId = UtilSql.getValue(result, "MA_MEASURE_SHIFT_ID");
        objectDateandShiftData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDateandShiftData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDateandShiftData.language = UtilSql.getValue(result, "LANGUAGE");
        objectDateandShiftData.adUserClient = "";
        objectDateandShiftData.adOrgClient = "";
        objectDateandShiftData.createdby = "";
        objectDateandShiftData.trBgcolor = "";
        objectDateandShiftData.totalCount = "";
        objectDateandShiftData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDateandShiftData);
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
    DateandShiftData objectDateandShiftData[] = new DateandShiftData[vector.size()];
    vector.copyInto(objectDateandShiftData);
    return(objectDateandShiftData);
  }

/**
Create a registry
 */
  public static DateandShiftData[] set(String maMeasureShiftId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String shift, String measuredate, String observation, String adUserId, String processed, String edit)    throws ServletException {
    DateandShiftData objectDateandShiftData[] = new DateandShiftData[1];
    objectDateandShiftData[0] = new DateandShiftData();
    objectDateandShiftData[0].created = "";
    objectDateandShiftData[0].createdbyr = createdbyr;
    objectDateandShiftData[0].updated = "";
    objectDateandShiftData[0].updatedTimeStamp = "";
    objectDateandShiftData[0].updatedby = updatedby;
    objectDateandShiftData[0].updatedbyr = updatedbyr;
    objectDateandShiftData[0].adOrgId = adOrgId;
    objectDateandShiftData[0].adOrgIdr = "";
    objectDateandShiftData[0].measuredate = measuredate;
    objectDateandShiftData[0].shift = shift;
    objectDateandShiftData[0].shiftr = "";
    objectDateandShiftData[0].adUserId = adUserId;
    objectDateandShiftData[0].adUserIdr = "";
    objectDateandShiftData[0].observation = observation;
    objectDateandShiftData[0].processed = processed;
    objectDateandShiftData[0].edit = edit;
    objectDateandShiftData[0].maMeasureShiftId = maMeasureShiftId;
    objectDateandShiftData[0].isactive = isactive;
    objectDateandShiftData[0].adClientId = adClientId;
    objectDateandShiftData[0].language = "";
    return objectDateandShiftData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef802305_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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

/**
Select for auxiliar field
 */
  public static String selectDef802307_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE MA_Measure_Shift" +
      "        SET AD_Org_ID = (?) , Measuredate = TO_DATE(?) , Shift = (?) , AD_User_ID = (?) , Observation = (?) , Processed = (?) , Edit = (?) , MA_Measure_Shift_ID = (?) , IsActive = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE MA_Measure_Shift.MA_Measure_Shift_ID = ? " +
      "        AND MA_Measure_Shift.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MA_Measure_Shift.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, measuredate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shift);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, observation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, edit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maMeasureShiftId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maMeasureShiftId);
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
      "        INSERT INTO MA_Measure_Shift " +
      "        (AD_Org_ID, Measuredate, Shift, AD_User_ID, Observation, Processed, Edit, MA_Measure_Shift_ID, IsActive, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, measuredate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shift);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, observation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, edit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maMeasureShiftId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
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
      "        DELETE FROM MA_Measure_Shift" +
      "        WHERE MA_Measure_Shift.MA_Measure_Shift_ID = ? " +
      "        AND MA_Measure_Shift.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MA_Measure_Shift.AD_Org_ID IN (";
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
      "          FROM MA_Measure_Shift" +
      "         WHERE MA_Measure_Shift.MA_Measure_Shift_ID = ? ";

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
      "          FROM MA_Measure_Shift" +
      "         WHERE MA_Measure_Shift.MA_Measure_Shift_ID = ? ";

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
