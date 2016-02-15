//Sqlc generated V1.O00-1
package org.openbravo.scheduling;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;

class PinstanceData implements FieldProvider {
static Logger log4j = Logger.getLogger(PinstanceData.class);
  private String InitRecordNumber="0";
  public String adProcessId;
  public String recordId;
  public String isprocessing;
  public String result;
  public String errormsg;
  public String isactive;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_PROCESS_ID") || fieldName.equals("adProcessId"))
      return adProcessId;
    else if (fieldName.equalsIgnoreCase("RECORD_ID") || fieldName.equals("recordId"))
      return recordId;
    else if (fieldName.equalsIgnoreCase("ISPROCESSING"))
      return isprocessing;
    else if (fieldName.equalsIgnoreCase("RESULT"))
      return result;
    else if (fieldName.equalsIgnoreCase("ERRORMSG"))
      return errormsg;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static PinstanceData select(ConnectionProvider connectionProvider, String pinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT AD_Process_ID, Record_ID, Isprocessing, Result, Errormsg, Isactive " +
      "      	FROM AD_Pinstance" +
      "      	WHERE AD_Pinstance_ID = ?";

    ResultSet result;
    PinstanceData objectPinstanceData = new PinstanceData();
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pinstanceId);

      result = st.executeQuery();
      if(result.next()) {
        objectPinstanceData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
        objectPinstanceData.recordId = UtilSql.getValue(result, "RECORD_ID");
        objectPinstanceData.isprocessing = UtilSql.getValue(result, "ISPROCESSING");
        objectPinstanceData.result = UtilSql.getValue(result, "RESULT");
        objectPinstanceData.errormsg = UtilSql.getValue(result, "ERRORMSG");
        objectPinstanceData.isactive = UtilSql.getValue(result, "ISACTIVE");
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
    return(objectPinstanceData);
  }
}
