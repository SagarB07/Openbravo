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

class ImportProcessData implements FieldProvider {
static Logger log4j = Logger.getLogger(ImportProcessData.class);
  private String InitRecordNumber="0";
  public String parametername;
  public String pString;
  public String pStringTo;
  public String pNumber;
  public String pNumberTo;
  public String pDate;
  public String pDateTo;
  public String info;
  public String infoTo;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PARAMETERNAME"))
      return parametername;
    else if (fieldName.equalsIgnoreCase("P_STRING") || fieldName.equals("pString"))
      return pString;
    else if (fieldName.equalsIgnoreCase("P_STRING_TO") || fieldName.equals("pStringTo"))
      return pStringTo;
    else if (fieldName.equalsIgnoreCase("P_NUMBER") || fieldName.equals("pNumber"))
      return pNumber;
    else if (fieldName.equalsIgnoreCase("P_NUMBER_TO") || fieldName.equals("pNumberTo"))
      return pNumberTo;
    else if (fieldName.equalsIgnoreCase("P_DATE") || fieldName.equals("pDate"))
      return pDate;
    else if (fieldName.equalsIgnoreCase("P_DATE_TO") || fieldName.equals("pDateTo"))
      return pDateTo;
    else if (fieldName.equalsIgnoreCase("INFO"))
      return info;
    else if (fieldName.equalsIgnoreCase("INFO_TO") || fieldName.equals("infoTo"))
      return infoTo;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ImportProcessData[] select(ConnectionProvider connectionProvider, String adPinstanceId)    throws ServletException {
    return select(connectionProvider, adPinstanceId, 0, 0);
  }

  public static ImportProcessData[] select(ConnectionProvider connectionProvider, String adPinstanceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT PARAMETERNAME, P_STRING, P_STRING_TO, P_NUMBER, P_NUMBER_TO, " +
      "        P_DATE, P_DATE_TO, INFO, INFO_TO " +
      "        FROM AD_PINSTANCE_PARA" +
      "        WHERE AD_PINSTANCE_ID = ?" +
      "        ORDER BY SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);

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
        ImportProcessData objectImportProcessData = new ImportProcessData();
        objectImportProcessData.parametername = UtilSql.getValue(result, "PARAMETERNAME");
        objectImportProcessData.pString = UtilSql.getValue(result, "P_STRING");
        objectImportProcessData.pStringTo = UtilSql.getValue(result, "P_STRING_TO");
        objectImportProcessData.pNumber = UtilSql.getValue(result, "P_NUMBER");
        objectImportProcessData.pNumberTo = UtilSql.getValue(result, "P_NUMBER_TO");
        objectImportProcessData.pDate = UtilSql.getDateValue(result, "P_DATE", "dd-MM-yyyy");
        objectImportProcessData.pDateTo = UtilSql.getDateValue(result, "P_DATE_TO", "dd-MM-yyyy");
        objectImportProcessData.info = UtilSql.getValue(result, "INFO");
        objectImportProcessData.infoTo = UtilSql.getValue(result, "INFO_TO");
        objectImportProcessData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportProcessData);
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
    ImportProcessData objectImportProcessData[] = new ImportProcessData[vector.size()];
    vector.copyInto(objectImportProcessData);
    return(objectImportProcessData);
  }

  public static int insertInstance(ConnectionProvider connectionProvider, String adPinstanceId, String adProcessId, String recordId, String adUserId, String adClientId, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      INSERT INTO AD_PInstance (AD_PINSTANCE_ID, AD_PROCESS_ID, RECORD_ID, ISPROCESSING, " +
      "      CREATED, AD_USER_ID, UPDATED, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, ISACTIVE) " +
      "      VALUES (?, ?, ?, 'N', " +
      "      now(), ?, now(), ?, ?, ?, ?, 'Y')";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, recordId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

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

  public static int lockInstance(ConnectionProvider connectionProvider, String adPinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE AD_PInstance SET IsProcessing='Y' " +
      "      WHERE AD_PInstance_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);

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

  public static int unlockInstance(ConnectionProvider connectionProvider, String result, String errormsg, String adPisntanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE AD_PInstance SET IsProcessing='N', Updated=to_date(now()), Result=to_number(?), ErrorMsg=TO_CHAR(?) " +
      "      WHERE AD_PInstance_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, result);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, errormsg);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPisntanceId);

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

  public static int insertPInstanceParam(ConnectionProvider connectionProvider, String adPinstanceId, String seqno, String parametername, String pString, String adClientId, String adOrgId, String adUserId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      INSERT INTO AD_PINSTANCE_PARA (ad_pinstance_para_id, AD_PINSTANCE_ID, SEQNO, PARAMETERNAME, P_STRING, AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY)" +
      "      VALUES(get_uuid(), ?,TO_NUMBER(?),?,?, ?, ?, now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parametername);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pString);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

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

  public static int insertPInstanceParamNumber(ConnectionProvider connectionProvider, String adPinstanceId, String seqno, String parametername, String pNumber, String adClientId, String adOrgId, String adUserId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      INSERT INTO AD_PINSTANCE_PARA (ad_pinstance_para_id,AD_PINSTANCE_ID, SEQNO, PARAMETERNAME, P_NUMBER, AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY)" +
      "      VALUES(get_uuid(), ?,TO_NUMBER(?),?,TO_NUMBER(?), ?, ?, now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parametername);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pNumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

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

  public static int insertPInstanceParamDate(ConnectionProvider connectionProvider, String adPinstanceId, String seqno, String parametername, String pDate, String adClientId, String adOrgId, String adUserId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      INSERT INTO AD_PINSTANCE_PARA (ad_pinstance_para_id,AD_PINSTANCE_ID, SEQNO, PARAMETERNAME, P_DATE, AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY)" +
      "      VALUES(get_uuid(), ?,TO_NUMBER(?),?,TO_DATE(?), ?, ?, now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parametername);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

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

  public static int insertPInstanceParamInfo(ConnectionProvider connectionProvider, String adPinstanceId, String seqno, String parametername, String info, String adClientId, String adOrgId, String adUserId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      INSERT INTO AD_PINSTANCE_PARA (ad_pinstance_para_id,AD_PINSTANCE_ID, SEQNO, PARAMETERNAME, INFO, AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY)" +
      "      VALUES(get_uuid(),?,TO_NUMBER(?),?,?, ?, ?, now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parametername);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, info);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

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
