//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class DocInventoryData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocInventoryData.class);
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String adOrgtrxId;
  public String cProjectId;
  public String cCampaignId;
  public String cActivityId;
  public String user1Id;
  public String user2Id;
  public String cCostcenterId;
  public String name;
  public String posted;
  public String movementdate;
  public String mWarehouseId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("MOVEMENTDATE"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocInventoryData[] select(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return select(connectionProvider, client, id, 0, 0);
  }

  public static DocInventoryData[] select(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT I.AD_CLIENT_ID, I.AD_ORG_ID, I.AD_ORGTRX_ID, I.C_PROJECT_ID, I.C_CAMPAIGN_ID, " +
      "        I.C_ACTIVITY_ID, I.USER1_ID, I.USER2_ID, I.C_COSTCENTER_ID, I.NAME, I.POSTED, I.MOVEMENTDATE, '' AS M_WAREHOUSE_ID" +
      "        FROM M_INVENTORY I" +
      "        WHERE AD_CLIENT_ID=? " +
      "        AND M_INVENTORY_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DocInventoryData objectDocInventoryData = new DocInventoryData();
        objectDocInventoryData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocInventoryData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocInventoryData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocInventoryData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocInventoryData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocInventoryData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocInventoryData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocInventoryData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocInventoryData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocInventoryData.name = UtilSql.getValue(result, "NAME");
        objectDocInventoryData.posted = UtilSql.getValue(result, "POSTED");
        objectDocInventoryData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectDocInventoryData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectDocInventoryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInventoryData);
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
    DocInventoryData objectDocInventoryData[] = new DocInventoryData[vector.size()];
    vector.copyInto(objectDocInventoryData);
    return(objectDocInventoryData);
  }

  public static DocInventoryData[] selectWarehouse(ConnectionProvider connectionProvider, String M_LOCATOR_ID)    throws ServletException {
    return selectWarehouse(connectionProvider, M_LOCATOR_ID, 0, 0);
  }

  public static DocInventoryData[] selectWarehouse(ConnectionProvider connectionProvider, String M_LOCATOR_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_WAREHOUSE_ID FROM M_LOCATOR" +
      "        WHERE M_LOCATOR_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_LOCATOR_ID);

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
        DocInventoryData objectDocInventoryData = new DocInventoryData();
        objectDocInventoryData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectDocInventoryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInventoryData);
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
    DocInventoryData objectDocInventoryData[] = new DocInventoryData[vector.size()];
    vector.copyInto(objectDocInventoryData);
    return(objectDocInventoryData);
  }
}
