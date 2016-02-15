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

class DocDoubtfulDebtData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocDoubtfulDebtData.class);
  private String InitRecordNumber="0";
  public String mProductId;
  public String mCGlitemId;
  public String percentage;
  public String cCampaignId;
  public String cProjectId;
  public String user1id;
  public String user2id;
  public String cCostcenterId;
  public String aAssetId;
  public String cBpartnerId;
  public String adOrgId;
  public String cActivityId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_C_GLITEM_ID") || fieldName.equals("mCGlitemId"))
      return mCGlitemId;
    else if (fieldName.equalsIgnoreCase("PERCENTAGE"))
      return percentage;
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
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocDoubtfulDebtData[] select(ConnectionProvider connectionProvider, String invoice)    throws ServletException {
    return select(connectionProvider, invoice, 0, 0);
  }

  public static DocDoubtfulDebtData[] select(ConnectionProvider connectionProvider, String invoice, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_INVOICELINE.M_PRODUCT_ID," +
      "        C_INVOICELINE.ACCOUNT_ID AS M_C_GLITEM_ID, " +
      "        SUM(COALESCE(C_INVOICELINE_ACCTDIMENSION.AMT, C_INVOICELINE.LINENETAMT)/C_INVOICE.TOTALLINES)" +
      "        AS percentage," +
      "        C_INVOICELINE_ACCTDIMENSION.C_CAMPAIGN_ID, COALESCE(C_INVOICELINE_ACCTDIMENSION.C_PROJECT_ID, C_INVOICELINE.C_PROJECT_ID, C_INVOICE.C_PROJECT_ID) AS C_PROJECT_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER1_ID,C_INVOICELINE.USER1_ID, C_INVOICELINE.USER1_ID) AS user1Id," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER2_ID,C_INVOICELINE.USER2_ID, C_INVOICE.USER2_ID) AS user2Id," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_COSTCENTER_ID,C_INVOICELINE.C_COSTCENTER_ID, C_INVOICE.C_COSTCENTER_ID) AS C_COSTCENTER_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.A_ASSET_ID,C_INVOICELINE.A_ASSET_ID, C_INVOICE.A_ASSET_ID) AS A_ASSET_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_BPARTNER_ID,C_INVOICELINE.C_BPARTNER_ID, C_INVOICE.C_BPARTNER_ID) AS C_BPARTNER_ID, " +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.AD_ORG_ID,C_INVOICELINE.AD_ORG_ID, C_INVOICE.AD_ORG_ID) AS AD_ORG_ID, C_INVOICELINE_ACCTDIMENSION.C_ACTIVITY_ID" +
      "        FROM C_INVOICE" +
      "        left join C_INVOICELINE on C_INVOICE.C_INVOICE_ID = C_INVOICELINE.C_INVOICE_ID" +
      "        left join C_INVOICELINE_ACCTDIMENSION on C_INVOICELINE.C_INVOICELINE_ID = C_INVOICELINE_ACCTDIMENSION.C_INVOICELINE_ID" +
      "        WHERE  C_INVOICELINE.C_INVOICE_ID = ?" +
      "        GROUP BY C_INVOICELINE.M_PRODUCT_ID, C_INVOICELINE.ACCOUNT_ID, " +
      "        C_INVOICELINE_ACCTDIMENSION.C_CAMPAIGN_ID, COALESCE(C_INVOICELINE_ACCTDIMENSION.C_PROJECT_ID, C_INVOICELINE.C_PROJECT_ID, C_INVOICE.C_PROJECT_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER1_ID,C_INVOICELINE.USER1_ID, C_INVOICELINE.USER1_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER2_ID, C_INVOICELINE.USER2_ID, C_INVOICE.USER2_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_COSTCENTER_ID, C_INVOICELINE.C_COSTCENTER_ID, C_INVOICE.C_COSTCENTER_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.A_ASSET_ID,C_INVOICELINE.A_ASSET_ID, C_INVOICE.A_ASSET_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_BPARTNER_ID,C_INVOICELINE.C_BPARTNER_ID, C_INVOICE.C_BPARTNER_ID), " +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.AD_ORG_ID,C_INVOICELINE.AD_ORG_ID, C_INVOICE.AD_ORG_ID), C_INVOICELINE_ACCTDIMENSION.C_ACTIVITY_ID" +
      "        order by 3 desc";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoice);

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
        DocDoubtfulDebtData objectDocDoubtfulDebtData = new DocDoubtfulDebtData();
        objectDocDoubtfulDebtData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocDoubtfulDebtData.mCGlitemId = UtilSql.getValue(result, "M_C_GLITEM_ID");
        objectDocDoubtfulDebtData.percentage = UtilSql.getValue(result, "PERCENTAGE");
        objectDocDoubtfulDebtData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocDoubtfulDebtData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocDoubtfulDebtData.user1id = UtilSql.getValue(result, "USER1ID");
        objectDocDoubtfulDebtData.user2id = UtilSql.getValue(result, "USER2ID");
        objectDocDoubtfulDebtData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocDoubtfulDebtData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectDocDoubtfulDebtData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocDoubtfulDebtData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocDoubtfulDebtData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocDoubtfulDebtData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocDoubtfulDebtData);
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
    DocDoubtfulDebtData objectDocDoubtfulDebtData[] = new DocDoubtfulDebtData[vector.size()];
    vector.copyInto(objectDocDoubtfulDebtData);
    return(objectDocDoubtfulDebtData);
  }
}
