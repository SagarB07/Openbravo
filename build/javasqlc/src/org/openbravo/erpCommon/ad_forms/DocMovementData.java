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

class DocMovementData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocMovementData.class);
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
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocMovementData[] select(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return select(connectionProvider, client, id, 0, 0);
  }

  public static DocMovementData[] select(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M.AD_CLIENT_ID, M.AD_ORG_ID, M.AD_ORGTRX_ID, M.C_PROJECT_ID, M.C_CAMPAIGN_ID," +
      "        M.C_ACTIVITY_ID, M.USER1_ID, M.USER2_ID, M.C_Costcenter_ID, M.NAME, M.POSTED, M.MOVEMENTDATE" +
      "        FROM M_MOVEMENT M" +
      "        WHERE AD_CLIENT_ID=? " +
      "        AND M_MOVEMENT_ID=?";

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
        DocMovementData objectDocMovementData = new DocMovementData();
        objectDocMovementData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocMovementData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocMovementData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocMovementData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocMovementData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocMovementData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocMovementData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocMovementData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocMovementData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocMovementData.name = UtilSql.getValue(result, "NAME");
        objectDocMovementData.posted = UtilSql.getValue(result, "POSTED");
        objectDocMovementData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectDocMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocMovementData);
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
    DocMovementData objectDocMovementData[] = new DocMovementData[vector.size()];
    vector.copyInto(objectDocMovementData);
    return(objectDocMovementData);
  }
}
