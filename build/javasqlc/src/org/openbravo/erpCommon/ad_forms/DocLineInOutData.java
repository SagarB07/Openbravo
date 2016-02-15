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

class DocLineInOutData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocLineInOutData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String mProductId;
  public String line;
  public String description;
  public String cUomId;
  public String mInoutlineId;
  public String mLocatorId;
  public String breakdownqty;
  public String movementqty;
  public String cCampaignId;
  public String cProjectId;
  public String user1id;
  public String user2id;
  public String cCostcenterId;
  public String aAssetId;
  public String cBpartnerId;
  public String cActivityId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("M_INOUTLINE_ID") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("M_LOCATOR_ID") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("BREAKDOWNQTY"))
      return breakdownqty;
    else if (fieldName.equalsIgnoreCase("MOVEMENTQTY"))
      return movementqty;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("USER1ID"))
      return user1id;
    else if (fieldName.equalsIgnoreCase("USER2ID"))
      return user2id;
    else if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("A_ASSET_ID") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocLineInOutData[] select(ConnectionProvider connectionProvider, String M_InOut_ID)    throws ServletException {
    return select(connectionProvider, M_InOut_ID, 0, 0);
  }

  public static DocLineInOutData[] select(ConnectionProvider connectionProvider, String M_InOut_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT COALESCE(A.AD_ORG_ID,IO.AD_ORG_ID) AS AD_ORG_ID, IO.M_PRODUCT_ID, IO.LINE, IO.DESCRIPTION," +
      "          IO.C_UOM_ID, IO.M_INOUTLINE_ID, IO.M_LOCATOR_ID," +
      "          COALESCE(A.Quantity, IO.MOVEMENTQTY) as BREAKDOWNQTY, " +
      "          IO.MOVEMENTQTY as MOVEMENTQTY, " +
      "          A.C_Campaign_ID, COALESCE(A.C_Project_Id, IO.C_Project_Id) AS C_Project_Id, COALESCE(A.User1_ID, IO.User1_ID) AS user1Id," +
      "          COALESCE(A.User2_ID, IO.User2_ID) AS user2Id, COALESCE(A.C_Costcenter_ID, IO.C_Costcenter_ID) AS C_Costcenter_ID," +
      "          COALESCE(A.A_Asset_ID,IO.A_Asset_ID) AS A_Asset_ID, COALESCE(A.C_BPartner_ID, IO.C_BPartner_ID) AS C_BPartner_ID, A.C_Activity_ID" +
      "          FROM M_InOutLine IO left join M_InOutLine_AcctDimension A ON IO.M_InOutLine_ID = A.M_InOutLine_ID" +
      "          WHERE M_InOut_ID=?" +
      "          AND COALESCE(A.Quantity, IO.MOVEMENTQTY) <> 0" +
      "          ORDER BY Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_InOut_ID);

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
        DocLineInOutData objectDocLineInOutData = new DocLineInOutData();
        objectDocLineInOutData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocLineInOutData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocLineInOutData.line = UtilSql.getValue(result, "LINE");
        objectDocLineInOutData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocLineInOutData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocLineInOutData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectDocLineInOutData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectDocLineInOutData.breakdownqty = UtilSql.getValue(result, "BREAKDOWNQTY");
        objectDocLineInOutData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectDocLineInOutData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocLineInOutData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocLineInOutData.user1id = UtilSql.getValue(result, "USER1ID");
        objectDocLineInOutData.user2id = UtilSql.getValue(result, "USER2ID");
        objectDocLineInOutData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocLineInOutData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectDocLineInOutData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocLineInOutData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocLineInOutData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineInOutData);
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
    DocLineInOutData objectDocLineInOutData[] = new DocLineInOutData[vector.size()];
    vector.copyInto(objectDocLineInOutData);
    return(objectDocLineInOutData);
  }
}
