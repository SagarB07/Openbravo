//Sqlc generated V1.O00-1
package org.openbravo.base.secureApp;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class SystemPreferencesData implements FieldProvider {
static Logger log4j = Logger.getLogger(SystemPreferencesData.class);
  private String InitRecordNumber="0";
  public String tadRecordrange;
  public String tadRecordrangeInfo;
  public String tadTransactionalrange;
  public String tadTheme;
  public String id;
  public String classname;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("TAD_RECORDRANGE") || fieldName.equals("tadRecordrange"))
      return tadRecordrange;
    else if (fieldName.equalsIgnoreCase("TAD_RECORDRANGE_INFO") || fieldName.equals("tadRecordrangeInfo"))
      return tadRecordrangeInfo;
    else if (fieldName.equalsIgnoreCase("TAD_TRANSACTIONALRANGE") || fieldName.equals("tadTransactionalrange"))
      return tadTransactionalrange;
    else if (fieldName.equalsIgnoreCase("TAD_THEME") || fieldName.equals("tadTheme"))
      return tadTheme;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("CLASSNAME"))
      return classname;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SystemPreferencesData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static SystemPreferencesData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT TAD_RecordRange, TAD_RecordRange_Info, TAD_TransactionalRange, TAD_THEME, " +
      "        '' AS ID, '' AS CLASSNAME " +
      "        FROM AD_SYSTEM " +
      "        WHERE AD_SYSTEM_ID = '0'";

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
        SystemPreferencesData objectSystemPreferencesData = new SystemPreferencesData();
        objectSystemPreferencesData.tadRecordrange = UtilSql.getValue(result, "TAD_RECORDRANGE");
        objectSystemPreferencesData.tadRecordrangeInfo = UtilSql.getValue(result, "TAD_RECORDRANGE_INFO");
        objectSystemPreferencesData.tadTransactionalrange = UtilSql.getValue(result, "TAD_TRANSACTIONALRANGE");
        objectSystemPreferencesData.tadTheme = UtilSql.getValue(result, "TAD_THEME");
        objectSystemPreferencesData.id = UtilSql.getValue(result, "ID");
        objectSystemPreferencesData.classname = UtilSql.getValue(result, "CLASSNAME");
        objectSystemPreferencesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSystemPreferencesData);
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
    SystemPreferencesData objectSystemPreferencesData[] = new SystemPreferencesData[vector.size()];
    vector.copyInto(objectSystemPreferencesData);
    return(objectSystemPreferencesData);
  }
}
