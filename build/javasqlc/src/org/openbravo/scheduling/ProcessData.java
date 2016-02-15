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

class ProcessData implements FieldProvider {
static Logger log4j = Logger.getLogger(ProcessData.class);
  private String InitRecordNumber="0";
  public String id;
  public String name;
  public String accesslevel;
  public String isuserstartable;
  public String procedurename;
  public String isreport;
  public String isdirectprint;
  public String classname;
  public String isbackground;
  public String isjasper;
  public String jrname;
  public String serviceType;
  public String isexternalservice;
  public String serviceSource;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("ACCESSLEVEL"))
      return accesslevel;
    else if (fieldName.equalsIgnoreCase("ISUSERSTARTABLE"))
      return isuserstartable;
    else if (fieldName.equalsIgnoreCase("PROCEDURENAME"))
      return procedurename;
    else if (fieldName.equalsIgnoreCase("ISREPORT"))
      return isreport;
    else if (fieldName.equalsIgnoreCase("ISDIRECTPRINT"))
      return isdirectprint;
    else if (fieldName.equalsIgnoreCase("CLASSNAME"))
      return classname;
    else if (fieldName.equalsIgnoreCase("ISBACKGROUND"))
      return isbackground;
    else if (fieldName.equalsIgnoreCase("ISJASPER"))
      return isjasper;
    else if (fieldName.equalsIgnoreCase("JRNAME"))
      return jrname;
    else if (fieldName.equalsIgnoreCase("SERVICE_TYPE") || fieldName.equals("serviceType"))
      return serviceType;
    else if (fieldName.equalsIgnoreCase("ISEXTERNALSERVICE"))
      return isexternalservice;
    else if (fieldName.equalsIgnoreCase("SERVICE_SOURCE") || fieldName.equals("serviceSource"))
      return serviceSource;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ProcessData select(ConnectionProvider connectionProvider, String processId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT p.AD_Process_ID as Id, p.Name, p.AccessLevel, p.IsUserStartable, p.ProcedureName, p.IsReport, p.IsDirectPrint, " +
      "         COALESCE(TO_CHAR(p.ClassName), TO_CHAR(mo.ClassName)) as ClassName, p.IsBackground, p.IsJasper, p.JRName, p.Service_Type, p.IsExternalService, p.Service_Source" +
      "         FROM AD_Process p LEFT JOIN AD_Model_Object mo on p.AD_Process_ID = mo.AD_Process_ID" +
      "        WHERE p.AD_Process_ID = ?";

    ResultSet result;
    ProcessData objectProcessData = new ProcessData();
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processId);

      result = st.executeQuery();
      if(result.next()) {
        objectProcessData.id = UtilSql.getValue(result, "ID");
        objectProcessData.name = UtilSql.getValue(result, "NAME");
        objectProcessData.accesslevel = UtilSql.getValue(result, "ACCESSLEVEL");
        objectProcessData.isuserstartable = UtilSql.getValue(result, "ISUSERSTARTABLE");
        objectProcessData.procedurename = UtilSql.getValue(result, "PROCEDURENAME");
        objectProcessData.isreport = UtilSql.getValue(result, "ISREPORT");
        objectProcessData.isdirectprint = UtilSql.getValue(result, "ISDIRECTPRINT");
        objectProcessData.classname = UtilSql.getValue(result, "CLASSNAME");
        objectProcessData.isbackground = UtilSql.getValue(result, "ISBACKGROUND");
        objectProcessData.isjasper = UtilSql.getValue(result, "ISJASPER");
        objectProcessData.jrname = UtilSql.getValue(result, "JRNAME");
        objectProcessData.serviceType = UtilSql.getValue(result, "SERVICE_TYPE");
        objectProcessData.isexternalservice = UtilSql.getValue(result, "ISEXTERNALSERVICE");
        objectProcessData.serviceSource = UtilSql.getValue(result, "SERVICE_SOURCE");
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
    return(objectProcessData);
  }
}
