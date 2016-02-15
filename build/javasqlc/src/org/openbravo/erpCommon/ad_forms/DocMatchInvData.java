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

class DocMatchInvData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocMatchInvData.class);
  private String InitRecordNumber="0";
  public String mMatchinvId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String mInoutlineId;
  public String cInvoicelineId;
  public String mProductId;
  public String datetrx;
  public String qty;
  public String processing;
  public String processed;
  public String posted;
  public String dateacct;
  public String datedoc;
  public String cBpartnerId;
  public String linenetamt;
  public String cCurrencyId;
  public String stdprecision;
  public String orderacctdate;
  public String invoicestatus;
  public String inoutstatus;
  public String movementqty;
  public String qtyinvoiced;
  public String cOrderlineId;
  public String line;
  public String description;
  public String mCGlitemId;
  public String pricelist;
  public String priceactual;
  public String pricelimit;
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
  public String user1Id;
  public String user2Id;
  public String glitemCreditAcct;
  public String glitemDebitAcct;
  public String inoutproject;
  public String cInvoiceId;
  public String inoutuser1;
  public String inoutuser2;
  public String inoutcampaing;
  public String cActivityId;
  public String inoutactivity;
  public String cCostcenterId;
  public String inoutcoscenter;
  public String issotrx;
  public String aAssetId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("M_MATCHINV_ID") || fieldName.equals("mMatchinvId"))
      return mMatchinvId;
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
    else if (fieldName.equalsIgnoreCase("M_INOUTLINE_ID") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("C_INVOICELINE_ID") || fieldName.equals("cInvoicelineId"))
      return cInvoicelineId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("DATETRX"))
      return datetrx;
    else if (fieldName.equalsIgnoreCase("QTY"))
      return qty;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("DATEDOC"))
      return datedoc;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("LINENETAMT"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("STDPRECISION"))
      return stdprecision;
    else if (fieldName.equalsIgnoreCase("ORDERACCTDATE"))
      return orderacctdate;
    else if (fieldName.equalsIgnoreCase("INVOICESTATUS"))
      return invoicestatus;
    else if (fieldName.equalsIgnoreCase("INOUTSTATUS"))
      return inoutstatus;
    else if (fieldName.equalsIgnoreCase("MOVEMENTQTY"))
      return movementqty;
    else if (fieldName.equalsIgnoreCase("QTYINVOICED"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("C_ORDERLINE_ID") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("M_C_GLITEM_ID") || fieldName.equals("mCGlitemId"))
      return mCGlitemId;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("PRICEACTUAL"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("PRICELIMIT"))
      return pricelimit;
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
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("GLITEM_CREDIT_ACCT") || fieldName.equals("glitemCreditAcct"))
      return glitemCreditAcct;
    else if (fieldName.equalsIgnoreCase("GLITEM_DEBIT_ACCT") || fieldName.equals("glitemDebitAcct"))
      return glitemDebitAcct;
    else if (fieldName.equalsIgnoreCase("INOUTPROJECT"))
      return inoutproject;
    else if (fieldName.equalsIgnoreCase("C_INVOICE_ID") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("INOUTUSER1"))
      return inoutuser1;
    else if (fieldName.equalsIgnoreCase("INOUTUSER2"))
      return inoutuser2;
    else if (fieldName.equalsIgnoreCase("INOUTCAMPAING"))
      return inoutcampaing;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("INOUTACTIVITY"))
      return inoutactivity;
    else if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("INOUTCOSCENTER"))
      return inoutcoscenter;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("A_ASSET_ID") || fieldName.equals("aAssetId"))
      return aAssetId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocMatchInvData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static DocMatchInvData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT '' AS M_MATCHINV_ID, '' AS AD_CLIENT_ID, '' AS AD_ORG_ID, '' AS ISACTIVE," +
      "          '' AS CREATED, '' AS CREATEDBY, '' AS UPDATED, '' AS UPDATEDBY, '' AS M_INOUTLINE_ID," +
      "          '' AS C_INVOICELINE_ID, '' AS M_PRODUCT_ID, '' AS DATETRX, '' AS QTY, '' AS PROCESSING," +
      "          '' AS PROCESSED, '' AS POSTED, '' AS DATEACCT, '' AS DATEDOC, '' AS C_BPARTNER_ID," +
      "          '' AS LINENETAMT, '' AS C_CURRENCY_ID, '' AS stdprecision, '' as orderAcctDate," +
      "          '' AS INVOICESTATUS, '' AS INOUTSTATUS, '' AS MOVEMENTQTY, '' AS QTYINVOICED," +
      "          '' AS C_ORDERLINE_ID, '' AS LINE, '' AS DESCRIPTION," +
      "          '' AS M_C_GLITEM_ID, '' AS PRICELIST, '' AS PRICEACTUAL, '' AS PRICELIMIT," +
      "          '' AS C_CHARGE_ID, '' AS CHARGEAMT, '' AS C_UOM_ID, '' as C_TAX_ID," +
      "          '' AS S_RESOURCEASSIGNMENT_ID, '' AS TAXAMT, '' AS M_ATTRIBUTESETINSTANCE_ID," +
      "          '' AS ISDESCRIPTION, '' AS QUANTITYORDER, '' AS M_PRODUCT_UOM_ID," +
      "          '' AS C_CAMPAIGN_ID, '' AS C_PROJECT_ID," +
      "          '' AS USER1_ID, '' AS USER2_ID, '' AS GLITEM_CREDIT_ACCT," +
      "          '' AS GLITEM_DEBIT_ACCT, '' AS INOUTPROJECT, '' AS C_INVOICE_ID, '' AS INOUTUSER1, " +
      "          '' AS INOUTUSER2,'' AS INOUTCAMPAING, '' AS C_ACTIVITY_ID,  '' AS INOUTACTIVITY," +
      "          '' AS C_COSTCENTER_ID, '' AS INOUTCOSCENTER, '' AS ISSOTRX, '' as A_Asset_ID" +
      "        FROM DUAL";

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
        DocMatchInvData objectDocMatchInvData = new DocMatchInvData();
        objectDocMatchInvData.mMatchinvId = UtilSql.getValue(result, "M_MATCHINV_ID");
        objectDocMatchInvData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocMatchInvData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocMatchInvData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocMatchInvData.created = UtilSql.getValue(result, "CREATED");
        objectDocMatchInvData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectDocMatchInvData.updated = UtilSql.getValue(result, "UPDATED");
        objectDocMatchInvData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDocMatchInvData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectDocMatchInvData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectDocMatchInvData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocMatchInvData.datetrx = UtilSql.getValue(result, "DATETRX");
        objectDocMatchInvData.qty = UtilSql.getValue(result, "QTY");
        objectDocMatchInvData.processing = UtilSql.getValue(result, "PROCESSING");
        objectDocMatchInvData.processed = UtilSql.getValue(result, "PROCESSED");
        objectDocMatchInvData.posted = UtilSql.getValue(result, "POSTED");
        objectDocMatchInvData.dateacct = UtilSql.getValue(result, "DATEACCT");
        objectDocMatchInvData.datedoc = UtilSql.getValue(result, "DATEDOC");
        objectDocMatchInvData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocMatchInvData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectDocMatchInvData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocMatchInvData.stdprecision = UtilSql.getValue(result, "STDPRECISION");
        objectDocMatchInvData.orderacctdate = UtilSql.getValue(result, "ORDERACCTDATE");
        objectDocMatchInvData.invoicestatus = UtilSql.getValue(result, "INVOICESTATUS");
        objectDocMatchInvData.inoutstatus = UtilSql.getValue(result, "INOUTSTATUS");
        objectDocMatchInvData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectDocMatchInvData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectDocMatchInvData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectDocMatchInvData.line = UtilSql.getValue(result, "LINE");
        objectDocMatchInvData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocMatchInvData.mCGlitemId = UtilSql.getValue(result, "M_C_GLITEM_ID");
        objectDocMatchInvData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectDocMatchInvData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectDocMatchInvData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectDocMatchInvData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocMatchInvData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocMatchInvData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocMatchInvData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocMatchInvData.sResourceassignmentId = UtilSql.getValue(result, "S_RESOURCEASSIGNMENT_ID");
        objectDocMatchInvData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocMatchInvData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectDocMatchInvData.isdescription = UtilSql.getValue(result, "ISDESCRIPTION");
        objectDocMatchInvData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectDocMatchInvData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectDocMatchInvData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocMatchInvData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocMatchInvData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocMatchInvData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocMatchInvData.glitemCreditAcct = UtilSql.getValue(result, "GLITEM_CREDIT_ACCT");
        objectDocMatchInvData.glitemDebitAcct = UtilSql.getValue(result, "GLITEM_DEBIT_ACCT");
        objectDocMatchInvData.inoutproject = UtilSql.getValue(result, "INOUTPROJECT");
        objectDocMatchInvData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectDocMatchInvData.inoutuser1 = UtilSql.getValue(result, "INOUTUSER1");
        objectDocMatchInvData.inoutuser2 = UtilSql.getValue(result, "INOUTUSER2");
        objectDocMatchInvData.inoutcampaing = UtilSql.getValue(result, "INOUTCAMPAING");
        objectDocMatchInvData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocMatchInvData.inoutactivity = UtilSql.getValue(result, "INOUTACTIVITY");
        objectDocMatchInvData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocMatchInvData.inoutcoscenter = UtilSql.getValue(result, "INOUTCOSCENTER");
        objectDocMatchInvData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectDocMatchInvData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectDocMatchInvData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocMatchInvData);
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
    DocMatchInvData objectDocMatchInvData[] = new DocMatchInvData[vector.size()];
    vector.copyInto(objectDocMatchInvData);
    return(objectDocMatchInvData);
  }

  public static DocMatchInvData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return selectRegistro(connectionProvider, client, id, 0, 0);
  }

  public static DocMatchInvData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M.M_MATCHINV_ID, M.AD_CLIENT_ID, M.AD_ORG_ID, M.ISACTIVE, M.CREATED, M.CREATEDBY, M.UPDATED,        " +
      "        M.UPDATEDBY, M.M_INOUTLINE_ID, M.C_INVOICELINE_ID, M.M_PRODUCT_ID, M.DATETRX, M.QTY, M.PROCESSING,        " +
      "        M.PROCESSED, M.POSTED, M.DATETRX AS DATEACCT, M.DATETRX AS DATEDOC, I.C_BPARTNER_ID, IO.DATEACCT as orderAcctDate,        " +
      "        IO.DOCSTATUS AS INOUTSTATUS, I.DOCSTATUS AS INVOICESTATUS, IOL.MOVEMENTQTY, IL.QTYINVOICED,        " +
      "        I.C_PROJECT_ID, COALESCE(IO.C_PROJECT_ID,IOL.C_PROJECT_ID)  AS INOUTPROJECT, I.USER1_ID, COALESCE(IO.USER1_ID,IOL.USER1_ID) AS INOUTUSER1, " +
      "        I.USER2_ID, COALESCE(IO.USER2_ID,IOL.USER2_ID) AS INOUTUSER2,  I.C_COSTCENTER_ID, COALESCE(IO.C_COSTCENTER_ID,IOL.C_COSTCENTER_ID) AS INOUTCOSCENTER," +
      "        I.C_CAMPAIGN_ID,IO.C_CAMPAIGN_ID as INOUTCAMPAING, I.C_ACTIVITY_ID, IO.C_ACTIVITY_ID AS INOUTACTIVITY" +
      "        FROM M_MATCHINV M, C_INVOICELINE IL, C_INVOICE I, M_INOUTLINE IOL, M_INOUT IO      " +
      "        WHERE IL.C_INVOICELINE_ID = M.C_INVOICELINE_ID" +
      "        AND IL.C_INVOICE_ID = I.C_INVOICE_ID" +
      "        AND IOL.M_INOUTLINE_ID = M.M_INOUTLINE_ID" +
      "        AND IO.M_INOUT_ID = IOL.M_INOUT_ID" +
      "        AND M.AD_Client_ID=?" +
      "        AND M.M_MATCHINV_ID=?";

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
        DocMatchInvData objectDocMatchInvData = new DocMatchInvData();
        objectDocMatchInvData.mMatchinvId = UtilSql.getValue(result, "M_MATCHINV_ID");
        objectDocMatchInvData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocMatchInvData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocMatchInvData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocMatchInvData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectDocMatchInvData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectDocMatchInvData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectDocMatchInvData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDocMatchInvData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectDocMatchInvData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectDocMatchInvData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocMatchInvData.datetrx = UtilSql.getDateValue(result, "DATETRX", "dd-MM-yyyy");
        objectDocMatchInvData.qty = UtilSql.getValue(result, "QTY");
        objectDocMatchInvData.processing = UtilSql.getValue(result, "PROCESSING");
        objectDocMatchInvData.processed = UtilSql.getValue(result, "PROCESSED");
        objectDocMatchInvData.posted = UtilSql.getValue(result, "POSTED");
        objectDocMatchInvData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocMatchInvData.datedoc = UtilSql.getDateValue(result, "DATEDOC", "dd-MM-yyyy");
        objectDocMatchInvData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocMatchInvData.orderacctdate = UtilSql.getDateValue(result, "ORDERACCTDATE", "dd-MM-yyyy");
        objectDocMatchInvData.inoutstatus = UtilSql.getValue(result, "INOUTSTATUS");
        objectDocMatchInvData.invoicestatus = UtilSql.getValue(result, "INVOICESTATUS");
        objectDocMatchInvData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectDocMatchInvData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectDocMatchInvData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocMatchInvData.inoutproject = UtilSql.getValue(result, "INOUTPROJECT");
        objectDocMatchInvData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocMatchInvData.inoutuser1 = UtilSql.getValue(result, "INOUTUSER1");
        objectDocMatchInvData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocMatchInvData.inoutuser2 = UtilSql.getValue(result, "INOUTUSER2");
        objectDocMatchInvData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocMatchInvData.inoutcoscenter = UtilSql.getValue(result, "INOUTCOSCENTER");
        objectDocMatchInvData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocMatchInvData.inoutcampaing = UtilSql.getValue(result, "INOUTCAMPAING");
        objectDocMatchInvData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocMatchInvData.inoutactivity = UtilSql.getValue(result, "INOUTACTIVITY");
        objectDocMatchInvData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocMatchInvData);
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
    DocMatchInvData objectDocMatchInvData[] = new DocMatchInvData[vector.size()];
    vector.copyInto(objectDocMatchInvData);
    return(objectDocMatchInvData);
  }

  public static String selectProductAverageCost(ConnectionProvider connectionProvider, String mProductID, String date)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT COALESCE(M_GET_PRODUCT_COST(?, TO_DATE(?), TO_CHAR(NULL)),0) FROM DUAL";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COALESCE(M_GET_PRODUCT_COST(:1,TO_DATE(:2),TO_CHAR(NULL)),0)");
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
    return(strReturn);
  }

  public static DocMatchInvData[] selectInvoiceData(ConnectionProvider connectionProvider, String adClientId, String cInvoiceLineId)    throws ServletException {
    return selectInvoiceData(connectionProvider, adClientId, cInvoiceLineId, 0, 0);
  }

  public static DocMatchInvData[] selectInvoiceData(ConnectionProvider connectionProvider, String adClientId, String cInvoiceLineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT L.LINENETAMT, I.C_CURRENCY_ID, I.DATEACCT, I.ISSOTRX, I.C_INVOICE_ID" +
      "      FROM C_INVOICELINE L, C_INVOICE I" +
      "      WHERE L.AD_CLIENT_ID = ?" +
      "        AND L.C_INVOICELINE_ID = ?" +
      "        AND I.C_INVOICE_ID = L.C_INVOICE_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceLineId);

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
        DocMatchInvData objectDocMatchInvData = new DocMatchInvData();
        objectDocMatchInvData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectDocMatchInvData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocMatchInvData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocMatchInvData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectDocMatchInvData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectDocMatchInvData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocMatchInvData);
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
    DocMatchInvData objectDocMatchInvData[] = new DocMatchInvData[vector.size()];
    vector.copyInto(objectDocMatchInvData);
    return(objectDocMatchInvData);
  }

  public static DocMatchInvData[] selectInvoiceLine(ConnectionProvider connectionProvider, String cInvoiceLineId)    throws ServletException {
    return selectInvoiceLine(connectionProvider, cInvoiceLineId, 0, 0);
  }

  public static DocMatchInvData[] selectInvoiceLine(ConnectionProvider connectionProvider, String cInvoiceLineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_INVOICELINE.C_INVOICELINE_ID, C_INVOICELINE.AD_CLIENT_ID, " +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.AD_ORG_ID,C_INVOICELINE.AD_ORG_ID) AS AD_ORG_ID," +
      "        C_INVOICELINE.ISACTIVE, C_INVOICELINE.C_INVOICE_ID, C_INVOICELINE.C_ORDERLINE_ID, C_INVOICELINE.M_INOUTLINE_ID," +
      "        C_INVOICELINE.LINE, C_INVOICELINE.DESCRIPTION, " +
      "        C_INVOICELINE.ACCOUNT_ID AS M_C_GLITEM_ID, C_INVOICELINE.QTYINVOICED," +
      "        C_INVOICELINE.PRICELIST, C_INVOICELINE.PRICEACTUAL, C_INVOICELINE.PRICELIMIT," +
      "        COALESCE(C_INVOICELINE_ACCTDIMENSION.AMT, C_INVOICELINE.LINENETAMT) AS LINENETAMT," +
      "        C_INVOICELINE.C_CHARGE_ID, C_INVOICELINE.CHARGEAMT, C_INVOICELINE.C_UOM_ID, '' as C_TAX_ID," +
      "        C_INVOICELINE.S_RESOURCEASSIGNMENT_ID, C_INVOICELINE.TAXAMT, C_INVOICELINE.M_ATTRIBUTESETINSTANCE_ID," +
      "        C_INVOICELINE.ISDESCRIPTION, C_INVOICELINE.QUANTITYORDER, C_INVOICELINE.M_PRODUCT_UOM_ID," +
      "        C_INVOICELINE_ACCTDIMENSION.C_CAMPAIGN_ID, " +
      "        COALESCE(C_INVOICELINE.C_PROJECT_ID, C_INVOICELINE_ACCTDIMENSION.C_PROJECT_ID) as C_PROJECT_ID," +
      "        COALESCE(C_INVOICELINE.USER1_ID, C_INVOICELINE_ACCTDIMENSION.USER1_ID) as USER1_ID," +
      "        COALESCE(C_INVOICELINE.USER2_ID, C_INVOICELINE_ACCTDIMENSION.USER2_ID) as USER2_ID," +
      "        COALESCE(C_INVOICELINE.C_COSTCENTER_ID, C_INVOICELINE_ACCTDIMENSION.C_COSTCENTER_ID) as C_COSTCENTER_ID," +
      "        COALESCE(C_INVOICELINE.C_BPARTNER_ID, C_INVOICELINE_ACCTDIMENSION.C_BPARTNER_ID) as C_BPARTNER_ID," +
      "        COALESCE(C_INVOICELINE.M_PRODUCT_ID, C_INVOICELINE_ACCTDIMENSION.M_PRODUCT_ID) as M_PRODUCT_ID," +
      "        '' AS GLITEM_CREDIT_ACCT, '' AS GLITEM_DEBIT_ACCT" +
      "      FROM C_INVOICELINE left join C_INVOICELINE_ACCTDIMENSION on C_INVOICELINE.C_INVOICELINE_ID = C_INVOICELINE_ACCTDIMENSION.C_INVOICELINE_ID" +
      "      WHERE C_INVOICELINE.C_INVOICELINE_ID = ?" +
      "      ORDER BY LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceLineId);

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
        DocMatchInvData objectDocMatchInvData = new DocMatchInvData();
        objectDocMatchInvData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectDocMatchInvData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocMatchInvData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocMatchInvData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocMatchInvData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectDocMatchInvData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectDocMatchInvData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectDocMatchInvData.line = UtilSql.getValue(result, "LINE");
        objectDocMatchInvData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocMatchInvData.mCGlitemId = UtilSql.getValue(result, "M_C_GLITEM_ID");
        objectDocMatchInvData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectDocMatchInvData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectDocMatchInvData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectDocMatchInvData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectDocMatchInvData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectDocMatchInvData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocMatchInvData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocMatchInvData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocMatchInvData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocMatchInvData.sResourceassignmentId = UtilSql.getValue(result, "S_RESOURCEASSIGNMENT_ID");
        objectDocMatchInvData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocMatchInvData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectDocMatchInvData.isdescription = UtilSql.getValue(result, "ISDESCRIPTION");
        objectDocMatchInvData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectDocMatchInvData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectDocMatchInvData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocMatchInvData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocMatchInvData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocMatchInvData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocMatchInvData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocMatchInvData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocMatchInvData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocMatchInvData.glitemCreditAcct = UtilSql.getValue(result, "GLITEM_CREDIT_ACCT");
        objectDocMatchInvData.glitemDebitAcct = UtilSql.getValue(result, "GLITEM_DEBIT_ACCT");
        objectDocMatchInvData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocMatchInvData);
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
    DocMatchInvData objectDocMatchInvData[] = new DocMatchInvData[vector.size()];
    vector.copyInto(objectDocMatchInvData);
    return(objectDocMatchInvData);
  }

  public static DocMatchInvData[] selectInvoiceLineTotal(ConnectionProvider connectionProvider, String C_Invoice_ID)    throws ServletException {
    return selectInvoiceLineTotal(connectionProvider, C_Invoice_ID, 0, 0);
  }

  public static DocMatchInvData[] selectInvoiceLineTotal(ConnectionProvider connectionProvider, String C_Invoice_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(C_INVOICELINE.C_INVOICELINE_ID) AS C_INVOICELINE_ID, C_INVOICELINE.AD_CLIENT_ID," +
      "        C_INVOICELINE.AD_ORG_ID, C_INVOICELINE.ISACTIVE, C_INVOICELINE.C_INVOICE_ID," +
      "        MAX(C_INVOICELINE.C_ORDERLINE_ID) AS C_ORDERLINE_ID, MAX(C_INVOICELINE.M_INOUTLINE_ID) AS M_INOUTLINE_ID," +
      "        MAX(C_INVOICELINE.LINE) AS LINE, MAX(C_INVOICELINE.DESCRIPTION) AS DESCRIPTION, C_INVOICELINE.M_PRODUCT_ID," +
      "        SUM(C_INVOICELINE.QTYINVOICED) AS QTYINVOICED, C_INVOICELINE.PRICELIST, C_INVOICELINE.PRICEACTUAL," +
      "        C_INVOICELINE.PRICELIMIT, SUM(COALESCE(C_INVOICELINE_ACCTDIMENSION.AMT, C_INVOICELINE.LINENETAMT)) AS LINENETAMT, MAX(C_INVOICELINE.C_CHARGE_ID) AS C_CHARGE_ID," +
      "        SUM(C_INVOICELINE.CHARGEAMT) AS CHARGEAMT, C_INVOICELINE.C_UOM_ID, '' as C_TAX_ID," +
      "        C_INVOICELINE.S_RESOURCEASSIGNMENT_ID, SUM(C_INVOICELINE.TAXAMT) AS TAXAMT," +
      "        C_INVOICELINE.M_ATTRIBUTESETINSTANCE_ID," +
      "        C_INVOICELINE.ISDESCRIPTION, SUM(C_INVOICELINE.QUANTITYORDER) AS QUANTITYORDER, C_INVOICELINE.M_PRODUCT_UOM_ID," +
      "        C_INVOICELINE_ACCTDIMENSION.C_CAMPAIGN_ID, C_INVOICELINE_ACCTDIMENSION.C_PROJECT_ID," +
      "        C_INVOICELINE_ACCTDIMENSION.USER1_ID, C_INVOICELINE_ACCTDIMENSION.USER2_ID" +
      "        FROM C_INVOICELINE left join C_INVOICELINE_ACCTDIMENSION on C_INVOICELINE.C_INVOICELINE_ID = C_INVOICELINE_ACCTDIMENSION.C_INVOICELINE_ID" +
      "        WHERE  C_INVOICELINE.C_INVOICELINE_ID = ?" +
      "        GROUP BY C_INVOICELINE.AD_CLIENT_ID, C_INVOICELINE.AD_ORG_ID, C_INVOICELINE.ISACTIVE, C_INVOICELINE.C_INVOICE_ID," +
      "        C_INVOICELINE.M_PRODUCT_ID,C_INVOICELINE.PRICELIST, C_INVOICELINE.PRICEACTUAL, C_INVOICELINE.PRICELIMIT," +
      "        C_INVOICELINE.C_UOM_ID, C_INVOICELINE.C_TAX_ID, C_INVOICELINE.S_RESOURCEASSIGNMENT_ID," +
      "        C_INVOICELINE.M_ATTRIBUTESETINSTANCE_ID,C_INVOICELINE.ISDESCRIPTION, C_INVOICELINE.M_PRODUCT_UOM_ID," +
      "        C_INVOICELINE_ACCTDIMENSION.C_CAMPAIGN_ID, C_INVOICELINE_ACCTDIMENSION.C_PROJECT_ID," +
      "        C_INVOICELINE_ACCTDIMENSION.USER1_ID, C_INVOICELINE_ACCTDIMENSION.USER2_ID" +
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
        DocMatchInvData objectDocMatchInvData = new DocMatchInvData();
        objectDocMatchInvData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectDocMatchInvData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocMatchInvData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocMatchInvData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocMatchInvData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectDocMatchInvData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectDocMatchInvData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectDocMatchInvData.line = UtilSql.getValue(result, "LINE");
        objectDocMatchInvData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocMatchInvData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocMatchInvData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectDocMatchInvData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectDocMatchInvData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectDocMatchInvData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectDocMatchInvData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectDocMatchInvData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocMatchInvData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocMatchInvData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocMatchInvData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocMatchInvData.sResourceassignmentId = UtilSql.getValue(result, "S_RESOURCEASSIGNMENT_ID");
        objectDocMatchInvData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocMatchInvData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectDocMatchInvData.isdescription = UtilSql.getValue(result, "ISDESCRIPTION");
        objectDocMatchInvData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectDocMatchInvData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectDocMatchInvData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocMatchInvData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocMatchInvData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocMatchInvData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocMatchInvData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocMatchInvData);
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
    DocMatchInvData objectDocMatchInvData[] = new DocMatchInvData[vector.size()];
    vector.copyInto(objectDocMatchInvData);
    return(objectDocMatchInvData);
  }

  public static DocMatchInvData[] selectInOutLineTotal(ConnectionProvider connectionProvider, String M_InOutLine_ID)    throws ServletException {
    return selectInOutLineTotal(connectionProvider, M_InOutLine_ID, 0, 0);
  }

  public static DocMatchInvData[] selectInOutLineTotal(ConnectionProvider connectionProvider, String M_InOutLine_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT COALESCE(A.AD_ORG_ID,IO.AD_ORG_ID) AS AD_ORG_ID, IO.M_PRODUCT_ID, IO.LINE, IO.DESCRIPTION," +
      "          IO.C_UOM_ID, IO.M_INOUTLINE_ID, COALESCE(A.Quantity, IO.MOVEMENTQTY) as MOVEMENTQTY," +
      "          A.C_Campaign_ID, COALESCE(A.C_Project_Id, IO.C_Project_Id) AS C_Project_Id, COALESCE(A.User1_ID, IO.User1_ID) AS User1_ID," +
      "          COALESCE(A.User2_ID, IO.User2_ID) AS User2_ID, COALESCE(A.C_Costcenter_ID, IO.C_Costcenter_ID) AS C_Costcenter_ID," +
      "          COALESCE(A.A_Asset_ID,IO.A_Asset_ID) AS A_Asset_ID, COALESCE(A.C_BPartner_ID, IO.C_BPartner_ID) AS C_BPartner_ID, A.C_Activity_ID" +
      "          FROM M_InOutLine IO left join M_InOutLine_AcctDimension A ON IO.M_InOutLine_ID = A.M_InOutLine_ID" +
      "          WHERE IO.M_InOutLine_ID=?" +
      "          ORDER BY Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_InOutLine_ID);

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
        DocMatchInvData objectDocMatchInvData = new DocMatchInvData();
        objectDocMatchInvData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocMatchInvData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocMatchInvData.line = UtilSql.getValue(result, "LINE");
        objectDocMatchInvData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocMatchInvData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocMatchInvData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectDocMatchInvData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectDocMatchInvData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocMatchInvData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocMatchInvData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocMatchInvData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocMatchInvData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocMatchInvData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectDocMatchInvData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocMatchInvData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocMatchInvData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocMatchInvData);
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
    DocMatchInvData objectDocMatchInvData[] = new DocMatchInvData[vector.size()];
    vector.copyInto(objectDocMatchInvData);
    return(objectDocMatchInvData);
  }
}
