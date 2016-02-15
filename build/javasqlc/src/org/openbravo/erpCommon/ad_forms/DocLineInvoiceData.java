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

class DocLineInvoiceData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocLineInvoiceData.class);
  private String InitRecordNumber="0";
  public String cInvoicelineId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String cInvoiceId;
  public String cOrderlineId;
  public String mInoutlineId;
  public String line;
  public String description;
  public String mProductId;
  public String mCGlitemId;
  public String qtyinvoiced;
  public String pricelist;
  public String priceactual;
  public String pricelimit;
  public String linenetamt;
  public String cChargeId;
  public String chargeamt;
  public String cUomId;
  public String cTaxId;
  public String sResourceassignmentId;
  public String taxamt;
  public String mAttributesetinstanceId;
  public String isdescription;
  public String quantityorder;
  public String mProductUomId;
  public String cCampaignId;
  public String cProjectId;
  public String user1id;
  public String user2id;
  public String cCostcenterId;
  public String aAssetId;
  public String cBpartnerId;
  public String cActivityId;
  public String isdeferred;
  public String defplantype;
  public String periodnumber;
  public String cPeriodId;
  public String glitemCreditAcct;
  public String glitemDebitAcct;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_INVOICELINE_ID") || fieldName.equals("cInvoicelineId"))
      return cInvoicelineId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("C_INVOICE_ID") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("C_ORDERLINE_ID") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("M_INOUTLINE_ID") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_C_GLITEM_ID") || fieldName.equals("mCGlitemId"))
      return mCGlitemId;
    else if (fieldName.equalsIgnoreCase("QTYINVOICED"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("PRICEACTUAL"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("PRICELIMIT"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("LINENETAMT"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("S_RESOURCEASSIGNMENT_ID") || fieldName.equals("sResourceassignmentId"))
      return sResourceassignmentId;
    else if (fieldName.equalsIgnoreCase("TAXAMT"))
      return taxamt;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("ISDESCRIPTION"))
      return isdescription;
    else if (fieldName.equalsIgnoreCase("QUANTITYORDER"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_UOM_ID") || fieldName.equals("mProductUomId"))
      return mProductUomId;
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
    else if (fieldName.equalsIgnoreCase("ISDEFERRED"))
      return isdeferred;
    else if (fieldName.equalsIgnoreCase("DEFPLANTYPE"))
      return defplantype;
    else if (fieldName.equalsIgnoreCase("PERIODNUMBER"))
      return periodnumber;
    else if (fieldName.equalsIgnoreCase("C_PERIOD_ID") || fieldName.equals("cPeriodId"))
      return cPeriodId;
    else if (fieldName.equalsIgnoreCase("GLITEM_CREDIT_ACCT") || fieldName.equals("glitemCreditAcct"))
      return glitemCreditAcct;
    else if (fieldName.equalsIgnoreCase("GLITEM_DEBIT_ACCT") || fieldName.equals("glitemDebitAcct"))
      return glitemDebitAcct;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocLineInvoiceData[] select(ConnectionProvider connectionProvider, String C_Invoice_ID)    throws ServletException {
    return select(connectionProvider, C_Invoice_ID, 0, 0);
  }

  public static DocLineInvoiceData[] select(ConnectionProvider connectionProvider, String C_Invoice_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_INVOICELINE.C_INVOICELINE_ID, C_INVOICELINE.AD_CLIENT_ID, COALESCE(C_INVOICELINE_ACCTDIMENSION.AD_ORG_ID,C_INVOICELINE.AD_ORG_ID) AS AD_ORG_ID," +
      "          C_INVOICELINE.ISACTIVE, C_INVOICELINE.C_INVOICE_ID, C_INVOICELINE.C_ORDERLINE_ID, C_INVOICELINE.M_INOUTLINE_ID," +
      "        C_INVOICELINE.LINE, C_INVOICELINE.DESCRIPTION, C_INVOICELINE.M_PRODUCT_ID, C_INVOICELINE.ACCOUNT_ID AS M_C_GLITEM_ID, C_INVOICELINE.QTYINVOICED," +
      "        C_INVOICELINE.PRICELIST, C_INVOICELINE.PRICEACTUAL, C_INVOICELINE.PRICELIMIT," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.AMT, C_INVOICELINE.LINENETAMT) AS LINENETAMT," +
      "        C_INVOICELINE.C_CHARGE_ID, C_INVOICELINE.CHARGEAMT, C_INVOICELINE.C_UOM_ID, '' as C_TAX_ID," +
      "        C_INVOICELINE.S_RESOURCEASSIGNMENT_ID, C_INVOICELINE.TAXAMT, C_INVOICELINE.M_ATTRIBUTESETINSTANCE_ID," +
      "        C_INVOICELINE.ISDESCRIPTION, C_INVOICELINE.QUANTITYORDER, C_INVOICELINE.M_PRODUCT_UOM_ID," +
      "        C_INVOICELINE_ACCTDIMENSION.C_CAMPAIGN_ID, COALESCE(C_INVOICELINE_ACCTDIMENSION.C_PROJECT_ID, C_INVOICELINE.C_PROJECT_ID) AS C_PROJECT_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER1_ID,C_INVOICELINE.USER1_ID) AS user1Id," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER2_ID,C_INVOICELINE.USER2_ID) AS user2Id," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_COSTCENTER_ID,C_INVOICELINE.C_COSTCENTER_ID) AS C_COSTCENTER_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.A_ASSET_ID,C_INVOICELINE.A_ASSET_ID) AS A_ASSET_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_BPARTNER_ID,C_INVOICELINE.C_BPARTNER_ID) AS C_BPARTNER_ID, C_INVOICELINE_ACCTDIMENSION.C_ACTIVITY_ID," +
      "        C_INVOICELINE.ISDEFERRED, C_INVOICELINE.DEFPLANTYPE, C_INVOICELINE.PERIODNUMBER, C_INVOICELINE.C_PERIOD_ID," +
      "        '' AS GLITEM_CREDIT_ACCT, '' AS GLITEM_DEBIT_ACCT" +
      "        FROM C_INVOICELINE left join C_INVOICELINE_ACCTDIMENSION on C_INVOICELINE.C_INVOICELINE_ID = C_INVOICELINE_ACCTDIMENSION.C_INVOICELINE_ID" +
      "        WHERE C_INVOICE_ID = ?" +
      "        ORDER BY LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Invoice_ID);

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
        DocLineInvoiceData objectDocLineInvoiceData = new DocLineInvoiceData();
        objectDocLineInvoiceData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectDocLineInvoiceData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocLineInvoiceData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocLineInvoiceData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocLineInvoiceData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectDocLineInvoiceData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectDocLineInvoiceData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectDocLineInvoiceData.line = UtilSql.getValue(result, "LINE");
        objectDocLineInvoiceData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocLineInvoiceData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocLineInvoiceData.mCGlitemId = UtilSql.getValue(result, "M_C_GLITEM_ID");
        objectDocLineInvoiceData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectDocLineInvoiceData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectDocLineInvoiceData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectDocLineInvoiceData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectDocLineInvoiceData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectDocLineInvoiceData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocLineInvoiceData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocLineInvoiceData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocLineInvoiceData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocLineInvoiceData.sResourceassignmentId = UtilSql.getValue(result, "S_RESOURCEASSIGNMENT_ID");
        objectDocLineInvoiceData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocLineInvoiceData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectDocLineInvoiceData.isdescription = UtilSql.getValue(result, "ISDESCRIPTION");
        objectDocLineInvoiceData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectDocLineInvoiceData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectDocLineInvoiceData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocLineInvoiceData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocLineInvoiceData.user1id = UtilSql.getValue(result, "USER1ID");
        objectDocLineInvoiceData.user2id = UtilSql.getValue(result, "USER2ID");
        objectDocLineInvoiceData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocLineInvoiceData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectDocLineInvoiceData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocLineInvoiceData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocLineInvoiceData.isdeferred = UtilSql.getValue(result, "ISDEFERRED");
        objectDocLineInvoiceData.defplantype = UtilSql.getValue(result, "DEFPLANTYPE");
        objectDocLineInvoiceData.periodnumber = UtilSql.getValue(result, "PERIODNUMBER");
        objectDocLineInvoiceData.cPeriodId = UtilSql.getValue(result, "C_PERIOD_ID");
        objectDocLineInvoiceData.glitemCreditAcct = UtilSql.getValue(result, "GLITEM_CREDIT_ACCT");
        objectDocLineInvoiceData.glitemDebitAcct = UtilSql.getValue(result, "GLITEM_DEBIT_ACCT");
        objectDocLineInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineInvoiceData);
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
    DocLineInvoiceData objectDocLineInvoiceData[] = new DocLineInvoiceData[vector.size()];
    vector.copyInto(objectDocLineInvoiceData);
    return(objectDocLineInvoiceData);
  }

  public static DocLineInvoiceData[] selectTotal(ConnectionProvider connectionProvider, String C_Invoice_ID)    throws ServletException {
    return selectTotal(connectionProvider, C_Invoice_ID, 0, 0);
  }

  public static DocLineInvoiceData[] selectTotal(ConnectionProvider connectionProvider, String C_Invoice_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(C_INVOICELINE.C_INVOICELINE_ID) AS C_INVOICELINE_ID, C_INVOICELINE.AD_CLIENT_ID," +
      "        C_INVOICELINE.AD_ORG_ID, C_INVOICELINE.ISACTIVE, C_INVOICELINE.C_INVOICE_ID," +
      "        MAX(C_INVOICELINE.C_ORDERLINE_ID) AS C_ORDERLINE_ID, MAX(C_INVOICELINE.M_INOUTLINE_ID) AS M_INOUTLINE_ID," +
      "        MAX(C_INVOICELINE.LINE) AS LINE, MAX(C_INVOICELINE.DESCRIPTION) AS DESCRIPTION, C_INVOICELINE.M_PRODUCT_ID," +
      "        C_INVOICELINE.ACCOUNT_ID AS M_C_GLITEM_ID, SUM(C_INVOICELINE.QTYINVOICED) AS QTYINVOICED, C_INVOICELINE.PRICELIST," +
      "        C_INVOICELINE.PRICEACTUAL, C_INVOICELINE.PRICELIMIT, SUM(COALESCE(C_INVOICELINE_ACCTDIMENSION.AMT, C_INVOICELINE.LINENETAMT))" +
      "        AS LINENETAMT, MAX(C_INVOICELINE.C_CHARGE_ID) AS C_CHARGE_ID, SUM(C_INVOICELINE.CHARGEAMT) AS CHARGEAMT," +
      "        C_INVOICELINE.C_UOM_ID, '' as C_TAX_ID, C_INVOICELINE.S_RESOURCEASSIGNMENT_ID, SUM(C_INVOICELINE.TAXAMT) AS TAXAMT," +
      "        C_INVOICELINE.M_ATTRIBUTESETINSTANCE_ID," +
      "        C_INVOICELINE.ISDESCRIPTION, SUM(C_INVOICELINE.QUANTITYORDER) AS QUANTITYORDER, C_INVOICELINE.M_PRODUCT_UOM_ID," +
      "        C_INVOICELINE_ACCTDIMENSION.C_CAMPAIGN_ID, COALESCE(C_INVOICELINE_ACCTDIMENSION.C_PROJECT_ID, C_INVOICELINE.C_PROJECT_ID) AS C_PROJECT_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER1_ID,C_INVOICELINE.USER1_ID) AS user1Id," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER2_ID,C_INVOICELINE.USER2_ID) AS user2Id," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_COSTCENTER_ID,C_INVOICELINE.C_COSTCENTER_ID) AS C_COSTCENTER_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.A_ASSET_ID,C_INVOICELINE.A_ASSET_ID) AS A_ASSET_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_BPARTNER_ID,C_INVOICELINE.C_BPARTNER_ID) AS C_BPARTNER_ID, C_INVOICELINE_ACCTDIMENSION.C_ACTIVITY_ID," +
      "        C_INVOICELINE.ISDEFERRED, C_INVOICELINE.DEFPLANTYPE, C_INVOICELINE.PERIODNUMBER, C_INVOICELINE.C_PERIOD_ID" +
      "        FROM C_INVOICELINE left join C_INVOICELINE_ACCTDIMENSION on C_INVOICELINE.C_INVOICELINE_ID = C_INVOICELINE_ACCTDIMENSION.C_INVOICELINE_ID" +
      "        WHERE  C_INVOICELINE.C_INVOICE_ID = ?" +
      "        GROUP BY C_INVOICELINE.AD_CLIENT_ID, C_INVOICELINE.AD_ORG_ID, C_INVOICELINE.ISACTIVE, C_INVOICELINE.C_INVOICE_ID," +
      "        C_INVOICELINE.M_PRODUCT_ID, C_INVOICELINE.ACCOUNT_ID, C_INVOICELINE.PRICELIST, C_INVOICELINE.PRICEACTUAL," +
      "        C_INVOICELINE.PRICELIMIT, C_INVOICELINE.C_UOM_ID, C_INVOICELINE.C_TAX_ID, C_INVOICELINE.S_RESOURCEASSIGNMENT_ID," +
      "        C_INVOICELINE.M_ATTRIBUTESETINSTANCE_ID,C_INVOICELINE.ISDESCRIPTION, C_INVOICELINE.M_PRODUCT_UOM_ID," +
      "        C_INVOICELINE_ACCTDIMENSION.C_CAMPAIGN_ID, COALESCE(C_INVOICELINE_ACCTDIMENSION.C_PROJECT_ID, C_INVOICELINE.C_PROJECT_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER1_ID,C_INVOICELINE.USER1_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER2_ID,C_INVOICELINE.USER2_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_COSTCENTER_ID,C_INVOICELINE.C_COSTCENTER_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.A_ASSET_ID,C_INVOICELINE.A_ASSET_ID)," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_BPARTNER_ID,C_INVOICELINE.C_BPARTNER_ID), C_INVOICELINE_ACCTDIMENSION.C_ACTIVITY_ID," +
      "        C_INVOICELINE.ISDEFERRED, C_INVOICELINE.DEFPLANTYPE, C_INVOICELINE.PERIODNUMBER, C_INVOICELINE.C_PERIOD_ID" +
      "        ORDER BY LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Invoice_ID);

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
        DocLineInvoiceData objectDocLineInvoiceData = new DocLineInvoiceData();
        objectDocLineInvoiceData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectDocLineInvoiceData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocLineInvoiceData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocLineInvoiceData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocLineInvoiceData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectDocLineInvoiceData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectDocLineInvoiceData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectDocLineInvoiceData.line = UtilSql.getValue(result, "LINE");
        objectDocLineInvoiceData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocLineInvoiceData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocLineInvoiceData.mCGlitemId = UtilSql.getValue(result, "M_C_GLITEM_ID");
        objectDocLineInvoiceData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectDocLineInvoiceData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectDocLineInvoiceData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectDocLineInvoiceData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectDocLineInvoiceData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectDocLineInvoiceData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocLineInvoiceData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocLineInvoiceData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocLineInvoiceData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocLineInvoiceData.sResourceassignmentId = UtilSql.getValue(result, "S_RESOURCEASSIGNMENT_ID");
        objectDocLineInvoiceData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocLineInvoiceData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectDocLineInvoiceData.isdescription = UtilSql.getValue(result, "ISDESCRIPTION");
        objectDocLineInvoiceData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectDocLineInvoiceData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectDocLineInvoiceData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocLineInvoiceData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocLineInvoiceData.user1id = UtilSql.getValue(result, "USER1ID");
        objectDocLineInvoiceData.user2id = UtilSql.getValue(result, "USER2ID");
        objectDocLineInvoiceData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocLineInvoiceData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectDocLineInvoiceData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocLineInvoiceData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocLineInvoiceData.isdeferred = UtilSql.getValue(result, "ISDEFERRED");
        objectDocLineInvoiceData.defplantype = UtilSql.getValue(result, "DEFPLANTYPE");
        objectDocLineInvoiceData.periodnumber = UtilSql.getValue(result, "PERIODNUMBER");
        objectDocLineInvoiceData.cPeriodId = UtilSql.getValue(result, "C_PERIOD_ID");
        objectDocLineInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineInvoiceData);
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
    DocLineInvoiceData objectDocLineInvoiceData[] = new DocLineInvoiceData[vector.size()];
    vector.copyInto(objectDocLineInvoiceData);
    return(objectDocLineInvoiceData);
  }

  public static DocLineInvoiceData[] selectGlitem(ConnectionProvider connectionProvider, String C_Glitem_ID, String C_AcctSchema_ID)    throws ServletException {
    return selectGlitem(connectionProvider, C_Glitem_ID, C_AcctSchema_ID, 0, 0);
  }

  public static DocLineInvoiceData[] selectGlitem(ConnectionProvider connectionProvider, String C_Glitem_ID, String C_AcctSchema_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT GLITEM_DEBIT_ACCT, GLITEM_CREDIT_ACCT" +
      "    FROM C_GLITEM_ACCT " +
      "    WHERE C_GLITEM_id = ?" +
      "    AND C_ACCTSCHEMA_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Glitem_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_AcctSchema_ID);

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
        DocLineInvoiceData objectDocLineInvoiceData = new DocLineInvoiceData();
        objectDocLineInvoiceData.glitemDebitAcct = UtilSql.getValue(result, "GLITEM_DEBIT_ACCT");
        objectDocLineInvoiceData.glitemCreditAcct = UtilSql.getValue(result, "GLITEM_CREDIT_ACCT");
        objectDocLineInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineInvoiceData);
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
    DocLineInvoiceData objectDocLineInvoiceData[] = new DocLineInvoiceData[vector.size()];
    vector.copyInto(objectDocLineInvoiceData);
    return(objectDocLineInvoiceData);
  }

  public static DocLineInvoiceData[] selectUndeductable(ConnectionProvider connectionProvider, String C_Invoice_ID)    throws ServletException {
    return selectUndeductable(connectionProvider, C_Invoice_ID, 0, 0);
  }

  public static DocLineInvoiceData[] selectUndeductable(ConnectionProvider connectionProvider, String C_Invoice_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_INVOICELINE.C_INVOICELINE_ID, C_INVOICELINE.AD_CLIENT_ID, COALESCE(C_INVOICELINE_ACCTDIMENSION.AD_ORG_ID,C_INVOICELINE.AD_ORG_ID) AS AD_ORG_ID," +
      "        C_INVOICELINE.ISACTIVE, C_INVOICELINE.C_INVOICE_ID, C_INVOICELINE.C_ORDERLINE_ID, C_INVOICELINE.M_INOUTLINE_ID," +
      "        C_INVOICELINE.LINE, C_INVOICELINE.DESCRIPTION, C_INVOICELINE.M_PRODUCT_ID, C_INVOICELINE.ACCOUNT_ID AS M_C_GLITEM_ID, C_INVOICELINE.QTYINVOICED," +
      "        C_INVOICELINE.PRICELIST, C_INVOICELINE.PRICEACTUAL, C_INVOICELINE.PRICELIMIT," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.AMT, C_INVOICELINE.LINENETAMT) AS LINENETAMT," +
      "        C_INVOICELINE.C_CHARGE_ID, C_INVOICELINE.CHARGEAMT, C_INVOICELINE.C_UOM_ID,  c_invoicelinetax.C_TAX_ID," +
      "        C_INVOICELINE.S_RESOURCEASSIGNMENT_ID, C_INVOICELINE.TAXAMT, C_INVOICELINE.M_ATTRIBUTESETINSTANCE_ID," +
      "        C_INVOICELINE.ISDESCRIPTION, C_INVOICELINE.QUANTITYORDER, C_INVOICELINE.M_PRODUCT_UOM_ID," +
      "        C_INVOICELINE_ACCTDIMENSION.C_CAMPAIGN_ID, COALESCE(C_INVOICELINE_ACCTDIMENSION.C_PROJECT_ID, C_INVOICELINE.C_PROJECT_ID) AS C_PROJECT_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER1_ID,C_INVOICELINE.USER1_ID) AS user1Id," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.USER2_ID,C_INVOICELINE.USER2_ID) AS user2Id," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_COSTCENTER_ID,C_INVOICELINE.C_COSTCENTER_ID) AS C_COSTCENTER_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.A_ASSET_ID,C_INVOICELINE.A_ASSET_ID) AS A_ASSET_ID," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.C_BPARTNER_ID,C_INVOICELINE.C_BPARTNER_ID) AS C_BPARTNER_ID, C_INVOICELINE_ACCTDIMENSION.C_ACTIVITY_ID," +
      "        C_INVOICELINE.ISDEFERRED, C_INVOICELINE.DEFPLANTYPE, C_INVOICELINE.PERIODNUMBER, C_INVOICELINE.C_PERIOD_ID," +
      "        '' AS GLITEM_CREDIT_ACCT, '' AS GLITEM_DEBIT_ACCT" +
      "        FROM C_INVOICELINE " +
      "        left join C_INVOICELINE_ACCTDIMENSION on C_INVOICELINE.C_INVOICELINE_ID = C_INVOICELINE_ACCTDIMENSION.C_INVOICELINE_ID" +
      "        left join c_invoicelinetax on c_invoicelinetax.C_INVOICELINE_ID=C_INVOICELINE.C_INVOICELINE_ID " +
      "        left join c_tax on c_tax.c_tax_id=c_invoicelinetax.c_tax_id" +
      "        WHERE C_INVOICELINE.C_INVOICE_ID = ?" +
      "        and c_tax.istaxundeductable='Y'" +
      "        ORDER BY LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Invoice_ID);

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
        DocLineInvoiceData objectDocLineInvoiceData = new DocLineInvoiceData();
        objectDocLineInvoiceData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectDocLineInvoiceData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocLineInvoiceData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocLineInvoiceData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocLineInvoiceData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectDocLineInvoiceData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectDocLineInvoiceData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectDocLineInvoiceData.line = UtilSql.getValue(result, "LINE");
        objectDocLineInvoiceData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocLineInvoiceData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocLineInvoiceData.mCGlitemId = UtilSql.getValue(result, "M_C_GLITEM_ID");
        objectDocLineInvoiceData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectDocLineInvoiceData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectDocLineInvoiceData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectDocLineInvoiceData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectDocLineInvoiceData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectDocLineInvoiceData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocLineInvoiceData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocLineInvoiceData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocLineInvoiceData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocLineInvoiceData.sResourceassignmentId = UtilSql.getValue(result, "S_RESOURCEASSIGNMENT_ID");
        objectDocLineInvoiceData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocLineInvoiceData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectDocLineInvoiceData.isdescription = UtilSql.getValue(result, "ISDESCRIPTION");
        objectDocLineInvoiceData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectDocLineInvoiceData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectDocLineInvoiceData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocLineInvoiceData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocLineInvoiceData.user1id = UtilSql.getValue(result, "USER1ID");
        objectDocLineInvoiceData.user2id = UtilSql.getValue(result, "USER2ID");
        objectDocLineInvoiceData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocLineInvoiceData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectDocLineInvoiceData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocLineInvoiceData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocLineInvoiceData.isdeferred = UtilSql.getValue(result, "ISDEFERRED");
        objectDocLineInvoiceData.defplantype = UtilSql.getValue(result, "DEFPLANTYPE");
        objectDocLineInvoiceData.periodnumber = UtilSql.getValue(result, "PERIODNUMBER");
        objectDocLineInvoiceData.cPeriodId = UtilSql.getValue(result, "C_PERIOD_ID");
        objectDocLineInvoiceData.glitemCreditAcct = UtilSql.getValue(result, "GLITEM_CREDIT_ACCT");
        objectDocLineInvoiceData.glitemDebitAcct = UtilSql.getValue(result, "GLITEM_DEBIT_ACCT");
        objectDocLineInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineInvoiceData);
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
    DocLineInvoiceData objectDocLineInvoiceData[] = new DocLineInvoiceData[vector.size()];
    vector.copyInto(objectDocLineInvoiceData);
    return(objectDocLineInvoiceData);
  }
}
