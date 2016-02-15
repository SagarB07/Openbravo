//Sqlc generated V1.O00-1
package com.gai.investasi.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class GinGetAreaData implements FieldProvider {
static Logger log4j = Logger.getLogger(GinGetAreaData.class);
  private String InitRecordNumber="0";
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("NAME"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static GinGetAreaData[] select(ConnectionProvider connectionProvider, String gaiKantorId)    throws ServletException {
    return select(connectionProvider, gaiKantorId, 0, 0);
  }

  public static GinGetAreaData[] select(ConnectionProvider connectionProvider, String gaiKantorId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NAME AS name FROM GAI_KANTOR " +
      "        WHERE GAI_KANTOR_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gaiKantorId);

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
        GinGetAreaData objectGinGetAreaData = new GinGetAreaData();
        objectGinGetAreaData.name = UtilSql.getValue(result, "NAME");
        objectGinGetAreaData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGinGetAreaData);
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
    GinGetAreaData objectGinGetAreaData[] = new GinGetAreaData[vector.size()];
    vector.copyInto(objectGinGetAreaData);
    return(objectGinGetAreaData);
  }
}
