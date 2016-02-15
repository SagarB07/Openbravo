//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_process;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class COrderData implements FieldProvider {
static Logger log4j = Logger.getLogger(COrderData.class);
  private String InitRecordNumber="0";
  public String cOrderId;
  public String cDoctypetargetId;
  public String issotrx;
  public String documentno;
  public String cBpartnerId;
  public String billtoId;
  public String cBpartnerLocationId;
  public String adUserId;
  public String description;
  public String cPaymenttermId;
  public String mPricelistId;
  public String mWarehouseId;
  public String mShipperId;
  public String salesrepId;
  public String adOrgtrxId;
  public String cActivityId;
  public String docstatus;
  public String cCampaignId;
  public String cProjectId;
  public String adClientId;
  public String adOrgId;
  public String docaction;
  public String cDoctypeId;
  public String dateordered;
  public String datepromised;
  public String cCurrencyId;
  public String paymentrule;
  public String invoicerule;
  public String deliveryrule;
  public String freightcostrule;
  public String deliveryviarule;
  public String priorityrule;
  public String isdiscountprinted;
  public String processing;
  public String finPaymentmethodId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_ORDER_ID") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPETARGET_ID") || fieldName.equals("cDoctypetargetId"))
      return cDoctypetargetId;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("BILLTO_ID") || fieldName.equals("billtoId"))
      return billtoId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_ID") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("M_SHIPPER_ID") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("DOCSTATUS"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("DOCACTION"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("DATEPROMISED"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("INVOICERULE"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("DELIVERYRULE"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("FREIGHTCOSTRULE"))
      return freightcostrule;
    else if (fieldName.equalsIgnoreCase("DELIVERYVIARULE"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("PRIORITYRULE"))
      return priorityrule;
    else if (fieldName.equalsIgnoreCase("ISDISCOUNTPRINTED"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_ID") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static COrderData[] select(ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    return select(connectionProvider, adClientId, 0, 0);
  }

  public static COrderData[] select(ConnectionProvider connectionProvider, String adClientId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_Order_ID, C_Doctypetarget_ID, IsSOTrx, DocumentNo, C_BPartner_ID, BillTo_ID," +
      "				C_BPartner_Location_ID, AD_User_ID, Description, C_PaymentTerm_ID, M_PriceList_ID," +
      "				M_Warehouse_ID, M_Shipper_ID, SalesRep_ID, AD_Orgtrx_ID, C_Activity_ID, DocStatus," +
      "				C_Campaign_ID, C_Project_ID, AD_Client_ID, AD_Org_ID, DocAction, C_DocType_ID, DateOrdered, DatePromised," +
      "				C_Currency_ID, PaymentRule, InvoiceRule, DeliveryRule, FreightcostRule, DeliveryviaRule," +
      "				PriorityRule, IsDiscountPrinted, Processing, FIN_PaymentMethod_ID" +
      "			  FROM C_Order" +
      "			  WHERE AD_Client_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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
        COrderData objectCOrderData = new COrderData();
        objectCOrderData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectCOrderData.cDoctypetargetId = UtilSql.getValue(result, "C_DOCTYPETARGET_ID");
        objectCOrderData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectCOrderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectCOrderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectCOrderData.billtoId = UtilSql.getValue(result, "BILLTO_ID");
        objectCOrderData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectCOrderData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectCOrderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectCOrderData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectCOrderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectCOrderData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectCOrderData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectCOrderData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectCOrderData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectCOrderData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectCOrderData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectCOrderData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectCOrderData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectCOrderData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectCOrderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectCOrderData.docaction = UtilSql.getValue(result, "DOCACTION");
        objectCOrderData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectCOrderData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectCOrderData.datepromised = UtilSql.getDateValue(result, "DATEPROMISED", "dd-MM-yyyy");
        objectCOrderData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectCOrderData.paymentrule = UtilSql.getValue(result, "PAYMENTRULE");
        objectCOrderData.invoicerule = UtilSql.getValue(result, "INVOICERULE");
        objectCOrderData.deliveryrule = UtilSql.getValue(result, "DELIVERYRULE");
        objectCOrderData.freightcostrule = UtilSql.getValue(result, "FREIGHTCOSTRULE");
        objectCOrderData.deliveryviarule = UtilSql.getValue(result, "DELIVERYVIARULE");
        objectCOrderData.priorityrule = UtilSql.getValue(result, "PRIORITYRULE");
        objectCOrderData.isdiscountprinted = UtilSql.getValue(result, "ISDISCOUNTPRINTED");
        objectCOrderData.processing = UtilSql.getValue(result, "PROCESSING");
        objectCOrderData.finPaymentmethodId = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_ID");
        objectCOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCOrderData);
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
    COrderData objectCOrderData[] = new COrderData[vector.size()];
    vector.copyInto(objectCOrderData);
    return(objectCOrderData);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  INSERT INTO C_Order (C_Order_ID, AD_Client_ID, AD_Org_ID, isActive, Created, CreatedBy, Updated, UpdatedBy," +
      "				C_Doctypetarget_ID, IsSOTrx, DocumentNo, C_BPartner_ID, BillTo_ID, C_BPartner_Location_ID, AD_User_ID," +
      "				Description, C_PaymentTerm_ID, M_PriceList_ID, M_Warehouse_ID, M_Shipper_ID, SalesRep_ID, AD_Orgtrx_ID," +
      "				C_Activity_ID, DocStatus, DocAction, C_Doctype_ID, DateOrdered, DatePromised, DateAcct, C_Currency_ID," +
      "				PaymentRule, InvoiceRule, DeliveryRule, FreightcostRule, DeliveryviaRule, PriorityRule, IsDiscountPrinted," +
      "				Processing, FIN_PaymentMethod_ID)" +
      "				VALUES (?, ?, ?, 'Y', TO_DATE(now()), ?, TO_DATE(now()), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?," +
      "				TO_DATE(?), TO_DATE(?), TO_DATE(?), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static String selectCurrency(ConnectionProvider connectionProvider, String adClientId, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				SELECT MIN(pl.c_currency_id) AS C_CURRENCY_ID" +
      "				FROM C_BPartner bp, M_Pricelist pl" +
      "				WHERE bp.M_Pricelist_ID = pl.M_Pricelist_ID" +
      "				AND pl.AD_Client_ID = ?" +
      "				AND bp.C_BPartner_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_CURRENCY_ID");
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
