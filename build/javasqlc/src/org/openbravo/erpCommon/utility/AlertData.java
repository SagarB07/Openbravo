//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class AlertData implements FieldProvider {
static Logger log4j = Logger.getLogger(AlertData.class);
  private String InitRecordNumber="0";
  public String adAlertId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String description;
  public String adAlertruleId;
  public String adRoleId;
  public String adUserId;
  public String recordId;
  public String referencekeyId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_ALERT_ID") || fieldName.equals("adAlertId"))
      return adAlertId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBY"))
      return createdby;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("AD_ALERTRULE_ID") || fieldName.equals("adAlertruleId"))
      return adAlertruleId;
    else if (fieldName.equalsIgnoreCase("AD_ROLE_ID") || fieldName.equals("adRoleId"))
      return adRoleId;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("RECORD_ID") || fieldName.equals("recordId"))
      return recordId;
    else if (fieldName.equalsIgnoreCase("REFERENCEKEY_ID") || fieldName.equals("referencekeyId"))
      return referencekeyId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AlertData[] select(ConnectionProvider connectionProvider, String adAlertId)    throws ServletException {
    return select(connectionProvider, adAlertId, 0, 0);
  }

  public static AlertData[] select(ConnectionProvider connectionProvider, String adAlertId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "	       SELECT AD_Alert_ID, AD_Client_ID, AD_Org_ID, IsActive, " +
      "	              Created, CreatedBy, Updated, UpdatedBy, Description, AD_AlertRule_ID," +
      "                  AD_Role_ID, AD_User_ID, Record_Id, Referencekey_ID" +
      "      		 FROM AD_Alert" +
      "      		WHERE AD_AlertRule_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAlertId);

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
        AlertData objectAlertData = new AlertData();
        objectAlertData.adAlertId = UtilSql.getValue(result, "AD_ALERT_ID");
        objectAlertData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAlertData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAlertData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectAlertData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectAlertData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectAlertData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectAlertData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectAlertData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAlertData.adAlertruleId = UtilSql.getValue(result, "AD_ALERTRULE_ID");
        objectAlertData.adRoleId = UtilSql.getValue(result, "AD_ROLE_ID");
        objectAlertData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectAlertData.recordId = UtilSql.getValue(result, "RECORD_ID");
        objectAlertData.referencekeyId = UtilSql.getValue(result, "REFERENCEKEY_ID");
        objectAlertData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertData);
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
    AlertData objectAlertData[] = new AlertData[vector.size()];
    vector.copyInto(objectAlertData);
    return(objectAlertData);
  }

  public static AlertData[] select(ConnectionProvider connectionProvider, String adAlertId, String recordId)    throws ServletException {
    return select(connectionProvider, adAlertId, recordId, 0, 0);
  }

  public static AlertData[] select(ConnectionProvider connectionProvider, String adAlertId, String recordId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "	       SELECT AD_Alert_ID, AD_Client_ID, AD_Org_ID, IsActive, " +
      "	              Created, CreatedBy, Updated, UpdatedBy, Description, AD_AlertRule_ID," +
      "                  AD_Role_ID, AD_User_ID, Record_Id" +
      "      		 FROM AD_Alert" +
      "      		WHERE AD_AlertRule_ID = ? AND Record_Id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAlertId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, recordId);

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
        AlertData objectAlertData = new AlertData();
        objectAlertData.adAlertId = UtilSql.getValue(result, "AD_ALERT_ID");
        objectAlertData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAlertData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAlertData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectAlertData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectAlertData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectAlertData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectAlertData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectAlertData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAlertData.adAlertruleId = UtilSql.getValue(result, "AD_ALERTRULE_ID");
        objectAlertData.adRoleId = UtilSql.getValue(result, "AD_ROLE_ID");
        objectAlertData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectAlertData.recordId = UtilSql.getValue(result, "RECORD_ID");
        objectAlertData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertData);
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
    AlertData objectAlertData[] = new AlertData[vector.size()];
    vector.copyInto(objectAlertData);
    return(objectAlertData);
  }

  public static AlertData[] selectByDescription(ConnectionProvider connectionProvider, String adAlertId, String description)    throws ServletException {
    return selectByDescription(connectionProvider, adAlertId, description, 0, 0);
  }

  public static AlertData[] selectByDescription(ConnectionProvider connectionProvider, String adAlertId, String description, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "	       SELECT AD_Alert_ID, AD_Client_ID, AD_Org_ID, IsActive, " +
      "	              Created, CreatedBy, Updated, UpdatedBy, Description, AD_AlertRule_ID," +
      "                  AD_Role_ID, AD_User_ID, Record_Id, Description" +
      "      		 FROM AD_Alert" +
      "      		WHERE AD_AlertRule_ID = ? AND Description = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAlertId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);

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
        AlertData objectAlertData = new AlertData();
        objectAlertData.adAlertId = UtilSql.getValue(result, "AD_ALERT_ID");
        objectAlertData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAlertData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAlertData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectAlertData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectAlertData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectAlertData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectAlertData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectAlertData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAlertData.adAlertruleId = UtilSql.getValue(result, "AD_ALERTRULE_ID");
        objectAlertData.adRoleId = UtilSql.getValue(result, "AD_ROLE_ID");
        objectAlertData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectAlertData.recordId = UtilSql.getValue(result, "RECORD_ID");
        objectAlertData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAlertData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAlertData);
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
    AlertData objectAlertData[] = new AlertData[vector.size()];
    vector.copyInto(objectAlertData);
    return(objectAlertData);
  }

  public static int insert(ConnectionProvider connectionProvider, String description, String adAlertRuleId, String recordId, String referencekeyId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       INSERT INTO AD_Alert (AD_Alert_ID, AD_Client_ID, AD_Org_ID, IsActive, " +
      "                      Created, CreatedBy, Updated, UpdatedBy, Description, AD_AlertRule_ID, Record_Id, Referencekey_ID," +
      "                      status)" +
      "      		VALUES (get_uuid(), 0, 0, 'Y', NOW(), 0, NOW(), 0, ?, ?, ?, ?,'NEW')";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAlertRuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, recordId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, referencekeyId);

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
