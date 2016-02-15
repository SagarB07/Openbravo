//Sqlc generated V1.O00-1
package com.gai.investasi.erpCommon.ad_process;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class ProcessInvData implements FieldProvider {
static Logger log4j = Logger.getLogger(ProcessInvData.class);
  private String InitRecordNumber="0";
  public String periode;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PERIODE"))
      return periode;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ProcessInvData[] select(ConnectionProvider connectionProvider, String GnvInvestasiId)    throws ServletException {
    return select(connectionProvider, GnvInvestasiId, 0, 0);
  }

  public static ProcessInvData[] select(ConnectionProvider connectionProvider, String GnvInvestasiId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "  		SELECT (TANGGALAKHIR - TANGGALAWAL) as periode FROM GNV_INVESTASI_LINE WHERE GNV_INVESTASI_LINE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, GnvInvestasiId);

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
        ProcessInvData objectProcessInvData = new ProcessInvData();
        objectProcessInvData.periode = UtilSql.getValue(result, "PERIODE");
        objectProcessInvData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectProcessInvData);
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
    ProcessInvData objectProcessInvData[] = new ProcessInvData[vector.size()];
    vector.copyInto(objectProcessInvData);
    return(objectProcessInvData);
  }
}
