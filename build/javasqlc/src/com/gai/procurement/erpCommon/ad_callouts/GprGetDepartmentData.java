//Sqlc generated V1.O00-1
package com.gai.procurement.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class GprGetDepartmentData implements FieldProvider {
static Logger log4j = Logger.getLogger(GprGetDepartmentData.class);
  private String InitRecordNumber="0";
  public String departmentid;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("DEPARTMENTID"))
      return departmentid;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static GprGetDepartmentData[] select(ConnectionProvider connectionProvider, String adUserId)    throws ServletException {
    return select(connectionProvider, adUserId, 0, 0);
  }

  public static GprGetDepartmentData[] select(ConnectionProvider connectionProvider, String adUserId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT EM_GMM_MASTER_DEPARTMENT_ID as departmentid " +
      "        FROM AD_USER " +
      "        WHERE AD_USER_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

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
        GprGetDepartmentData objectGprGetDepartmentData = new GprGetDepartmentData();
        objectGprGetDepartmentData.departmentid = UtilSql.getValue(result, "DEPARTMENTID");
        objectGprGetDepartmentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGprGetDepartmentData);
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
    GprGetDepartmentData objectGprGetDepartmentData[] = new GprGetDepartmentData[vector.size()];
    vector.copyInto(objectGprGetDepartmentData);
    return(objectGprGetDepartmentData);
  }
}
