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

class DocInOutData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocInOutData.class);
  private String InitRecordNumber="0";
  public String mInoutId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String issotrx;
  public String documentno;
  public String docaction;
  public String docstatus;
  public String posted;
  public String processing;
  public String processed;
  public String cDoctypeId;
  public String description;
  public String cOrderId;
  public String dateordered;
  public String isprinted;
  public String movementtype;
  public String movementdate;
  public String dateacct;
  public String cBpartnerId;
  public String cBpartnerLocationId;
  public String mWarehouseId;
  public String poreference;
  public String deliveryrule;
  public String freightcostrule;
  public String freightamt;
  public String deliveryviarule;
  public String mShipperId;
  public String cChargeId;
  public String chargeamt;
  public String priorityrule;
  public String dateprinted;
  public String cInvoiceId;
  public String createfrom;
  public String generateto;
  public String sendemail;
  public String adUserId;
  public String salesrepId;
  public String nopackages;
  public String pickdate;
  public String shipdate;
  public String trackingno;
  public String adOrgtrxId;
  public String cProjectId;
  public String cCampaignId;
  public String cActivityId;
  public String user1Id;
  public String user2Id;
  public String cCostcenterId;
  public String updatelines;
  public String mCostingId;
  public String stdprecision;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("M_INOUT_ID") || fieldName.equals("mInoutId"))
      return mInoutId;
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
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DOCACTION"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("DOCSTATUS"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_ORDER_ID") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("ISPRINTED"))
      return isprinted;
    else if (fieldName.equalsIgnoreCase("MOVEMENTTYPE"))
      return movementtype;
    else if (fieldName.equalsIgnoreCase("MOVEMENTDATE"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("DELIVERYRULE"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("FREIGHTCOSTRULE"))
      return freightcostrule;
    else if (fieldName.equalsIgnoreCase("FREIGHTAMT"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("DELIVERYVIARULE"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("M_SHIPPER_ID") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("PRIORITYRULE"))
      return priorityrule;
    else if (fieldName.equalsIgnoreCase("DATEPRINTED"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("C_INVOICE_ID") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("CREATEFROM"))
      return createfrom;
    else if (fieldName.equalsIgnoreCase("GENERATETO"))
      return generateto;
    else if (fieldName.equalsIgnoreCase("SENDEMAIL"))
      return sendemail;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("NOPACKAGES"))
      return nopackages;
    else if (fieldName.equalsIgnoreCase("PICKDATE"))
      return pickdate;
    else if (fieldName.equalsIgnoreCase("SHIPDATE"))
      return shipdate;
    else if (fieldName.equalsIgnoreCase("TRACKINGNO"))
      return trackingno;
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
    else if (fieldName.equalsIgnoreCase("UPDATELINES"))
      return updatelines;
    else if (fieldName.equalsIgnoreCase("M_COSTING_ID") || fieldName.equals("mCostingId"))
      return mCostingId;
    else if (fieldName.equalsIgnoreCase("STDPRECISION"))
      return stdprecision;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocInOutData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static DocInOutData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT '' AS M_INOUT_ID, '' AS AD_CLIENT_ID, '' AS AD_ORG_ID, '' AS ISACTIVE, '' AS CREATED," +
      "        '' AS CREATEDBY, '' AS UPDATED, '' AS UPDATEDBY, '' AS ISSOTRX, '' AS DOCUMENTNO, '' AS DOCACTION," +
      "        '' AS DOCSTATUS, '' AS POSTED, '' AS PROCESSING, '' AS PROCESSED, '' AS C_DOCTYPE_ID, '' AS DESCRIPTION," +
      "        '' AS C_ORDER_ID, '' AS DATEORDERED, '' AS ISPRINTED, '' AS MOVEMENTTYPE, '' AS MOVEMENTDATE, '' AS DATEACCT," +
      "        '' AS C_BPARTNER_ID, '' AS C_BPARTNER_LOCATION_ID, '' AS M_WAREHOUSE_ID, '' AS POREFERENCE, '' AS DELIVERYRULE," +
      "        '' AS FREIGHTCOSTRULE, '' AS FREIGHTAMT, '' AS DELIVERYVIARULE, '' AS M_SHIPPER_ID, '' AS C_CHARGE_ID," +
      "        '' AS CHARGEAMT, '' AS PRIORITYRULE, '' AS DATEPRINTED, '' AS C_INVOICE_ID, '' AS CREATEFROM, '' AS GENERATETO," +
      "        '' AS SENDEMAIL, '' AS AD_USER_ID, '' AS SALESREP_ID, '' AS NOPACKAGES, '' AS PICKDATE, '' AS SHIPDATE," +
      "        '' AS TRACKINGNO, '' AS AD_ORGTRX_ID, '' AS C_PROJECT_ID, '' AS C_CAMPAIGN_ID, '' AS C_ACTIVITY_ID, '' AS USER1_ID," +
      "        '' AS USER2_ID, '' AS C_COSTCENTER_ID, '' AS UPDATELINES, '' AS M_COSTING_ID, '' AS stdprecision" +
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
        DocInOutData objectDocInOutData = new DocInOutData();
        objectDocInOutData.mInoutId = UtilSql.getValue(result, "M_INOUT_ID");
        objectDocInOutData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocInOutData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocInOutData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocInOutData.created = UtilSql.getValue(result, "CREATED");
        objectDocInOutData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectDocInOutData.updated = UtilSql.getValue(result, "UPDATED");
        objectDocInOutData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDocInOutData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectDocInOutData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocInOutData.docaction = UtilSql.getValue(result, "DOCACTION");
        objectDocInOutData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectDocInOutData.posted = UtilSql.getValue(result, "POSTED");
        objectDocInOutData.processing = UtilSql.getValue(result, "PROCESSING");
        objectDocInOutData.processed = UtilSql.getValue(result, "PROCESSED");
        objectDocInOutData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectDocInOutData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocInOutData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectDocInOutData.dateordered = UtilSql.getValue(result, "DATEORDERED");
        objectDocInOutData.isprinted = UtilSql.getValue(result, "ISPRINTED");
        objectDocInOutData.movementtype = UtilSql.getValue(result, "MOVEMENTTYPE");
        objectDocInOutData.movementdate = UtilSql.getValue(result, "MOVEMENTDATE");
        objectDocInOutData.dateacct = UtilSql.getValue(result, "DATEACCT");
        objectDocInOutData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocInOutData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectDocInOutData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectDocInOutData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectDocInOutData.deliveryrule = UtilSql.getValue(result, "DELIVERYRULE");
        objectDocInOutData.freightcostrule = UtilSql.getValue(result, "FREIGHTCOSTRULE");
        objectDocInOutData.freightamt = UtilSql.getValue(result, "FREIGHTAMT");
        objectDocInOutData.deliveryviarule = UtilSql.getValue(result, "DELIVERYVIARULE");
        objectDocInOutData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectDocInOutData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocInOutData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocInOutData.priorityrule = UtilSql.getValue(result, "PRIORITYRULE");
        objectDocInOutData.dateprinted = UtilSql.getValue(result, "DATEPRINTED");
        objectDocInOutData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectDocInOutData.createfrom = UtilSql.getValue(result, "CREATEFROM");
        objectDocInOutData.generateto = UtilSql.getValue(result, "GENERATETO");
        objectDocInOutData.sendemail = UtilSql.getValue(result, "SENDEMAIL");
        objectDocInOutData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectDocInOutData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectDocInOutData.nopackages = UtilSql.getValue(result, "NOPACKAGES");
        objectDocInOutData.pickdate = UtilSql.getValue(result, "PICKDATE");
        objectDocInOutData.shipdate = UtilSql.getValue(result, "SHIPDATE");
        objectDocInOutData.trackingno = UtilSql.getValue(result, "TRACKINGNO");
        objectDocInOutData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocInOutData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocInOutData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocInOutData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocInOutData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocInOutData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocInOutData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocInOutData.updatelines = UtilSql.getValue(result, "UPDATELINES");
        objectDocInOutData.mCostingId = UtilSql.getValue(result, "M_COSTING_ID");
        objectDocInOutData.stdprecision = UtilSql.getValue(result, "STDPRECISION");
        objectDocInOutData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInOutData);
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
    DocInOutData objectDocInOutData[] = new DocInOutData[vector.size()];
    vector.copyInto(objectDocInOutData);
    return(objectDocInOutData);
  }

  public static DocInOutData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return selectRegistro(connectionProvider, client, id, 0, 0);
  }

  public static DocInOutData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT I.AD_CLIENT_ID, I.AD_ORG_ID, I.C_BPARTNER_ID, I.AD_ORGTRX_ID, I.C_PROJECT_ID," +
      "        I.C_CAMPAIGN_ID, I.C_ACTIVITY_ID, I.USER1_ID, I.USER2_ID, I.C_COSTCENTER_ID, I.DOCUMENTNO, I.DATEACCT," +
      "        I.C_DOCTYPE_ID, I.C_CHARGE_ID, I.CHARGEAMT, I.POSTED, I.MOVEMENTDATE, I.C_BPARTNER_LOCATION_ID" +
      "        FROM M_INOUT I" +
      "        WHERE AD_Client_ID=? " +
      "        AND M_INOUT_ID=?";

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
        DocInOutData objectDocInOutData = new DocInOutData();
        objectDocInOutData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocInOutData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocInOutData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocInOutData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocInOutData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocInOutData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocInOutData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocInOutData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocInOutData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocInOutData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocInOutData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocInOutData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocInOutData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectDocInOutData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocInOutData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocInOutData.posted = UtilSql.getValue(result, "POSTED");
        objectDocInOutData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectDocInOutData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectDocInOutData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocInOutData);
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
    DocInOutData objectDocInOutData[] = new DocInOutData[vector.size()];
    vector.copyInto(objectDocInOutData);
    return(objectDocInOutData);
  }

  public static String existsCost(ConnectionProvider connectionProvider, String date, String mProductId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(M_COSTING_ID)" +
      "        FROM M_COSTING" +
      "        WHERE TO_DATE(?) BETWEEN DATEFROM AND DATETO" +
      "          AND COSTTYPE NOT IN ('STA', 'AVA')" +
      "          AND M_PRODUCT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COUNT(M_COSTING_ID)");
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
}
