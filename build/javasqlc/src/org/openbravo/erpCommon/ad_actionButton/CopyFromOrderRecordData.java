//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_actionButton;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class CopyFromOrderRecordData implements FieldProvider {
static Logger log4j = Logger.getLogger(CopyFromOrderRecordData.class);
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String orgname;
  public String documentno;
  public String poreference;
  public String cBpartnerId;
  public String bpartnername;
  public String cBpartnerLocationId;
  public String locationname;
  public String dateordered;
  public String pricelistname;
  public String mWarehouseId;
  public String mPricelistId;
  public String cCurrencyId;
  public String adUserId;
  public String lastDays;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ORGNAME"))
      return orgname;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("BPARTNERNAME"))
      return bpartnername;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("LOCATIONNAME"))
      return locationname;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("PRICELISTNAME"))
      return pricelistname;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("LAST_DAYS") || fieldName.equals("lastDays"))
      return lastDays;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static CopyFromOrderRecordData[] select(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    return select(connectionProvider, cOrderId, 0, 0);
  }

  public static CopyFromOrderRecordData[] select(ConnectionProvider connectionProvider, String cOrderId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_ORDER.AD_CLIENT_ID, C_ORDER.AD_ORG_ID, AD_ORG.NAME AS ORGNAME, C_ORDER.DOCUMENTNO, C_ORDER.POREFERENCE, C_ORDER.C_BPARTNER_ID, C_BPARTNER.NAME AS BPARTNERNAME, C_ORDER.C_BPARTNER_LOCATION_ID, C_BPARTNER_LOCATION.NAME AS LOCATIONNAME, DATEORDERED, M_PRICELIST.NAME AS PRICELISTNAME, C_ORDER.M_WAREHOUSE_ID, C_ORDER.M_PRICELIST_ID, C_ORDER.C_CURRENCY_ID, C_ORDER.AD_USER_ID, C_BPARTNER.LAST_DAYS" +
      "        FROM C_ORDER, C_BPARTNER, M_PRICELIST, C_BPARTNER_LOCATION, AD_ORG" +
      "        WHERE C_ORDER.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "        AND C_ORDER.C_BPARTNER_LOCATION_ID = C_BPARTNER_LOCATION.C_BPARTNER_LOCATION_ID" +
      "        AND C_ORDER.M_PRICELIST_ID = M_PRICELIST.M_PRICELIST_ID" +
      "        AND C_ORDER.AD_ORG_ID = AD_ORG.AD_ORG_ID" +
      "        AND C_ORDER.C_ORDER_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

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
        CopyFromOrderRecordData objectCopyFromOrderRecordData = new CopyFromOrderRecordData();
        objectCopyFromOrderRecordData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectCopyFromOrderRecordData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectCopyFromOrderRecordData.orgname = UtilSql.getValue(result, "ORGNAME");
        objectCopyFromOrderRecordData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectCopyFromOrderRecordData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectCopyFromOrderRecordData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectCopyFromOrderRecordData.bpartnername = UtilSql.getValue(result, "BPARTNERNAME");
        objectCopyFromOrderRecordData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectCopyFromOrderRecordData.locationname = UtilSql.getValue(result, "LOCATIONNAME");
        objectCopyFromOrderRecordData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectCopyFromOrderRecordData.pricelistname = UtilSql.getValue(result, "PRICELISTNAME");
        objectCopyFromOrderRecordData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectCopyFromOrderRecordData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectCopyFromOrderRecordData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectCopyFromOrderRecordData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectCopyFromOrderRecordData.lastDays = UtilSql.getValue(result, "LAST_DAYS");
        objectCopyFromOrderRecordData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCopyFromOrderRecordData);
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
    CopyFromOrderRecordData objectCopyFromOrderRecordData[] = new CopyFromOrderRecordData[vector.size()];
    vector.copyInto(objectCopyFromOrderRecordData);
    return(objectCopyFromOrderRecordData);
  }

  public static String pendingDeliverySales(ConnectionProvider connectionProvider, String cBpartnerId, String adOrgId, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(ROUND(SUM(TOTALLINES),2),0) AS SHIPMENTAMOUNTPENDING" +
      "        FROM M_INOUT_CANDIDATE_V" +
      "        WHERE C_BPARTNER_ID = ?" +
      "        AND AD_ORG_ID = ?" +
      "        AND AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "SHIPMENTAMOUNTPENDING");
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

  public static String pendingInvoiceSales(ConnectionProvider connectionProvider, String cBpartnerId, String adOrgId, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(ROUND(SUM(NOTINVOICEDLINES),2),0) AS INVOICEAMOUNTPENDING" +
      "        FROM C_INVOICE_CANDIDATE_V" +
      "        WHERE C_BPARTNER_ID = ?" +
      "        AND AD_ORG_ID = ?" +
      "        AND AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "INVOICEAMOUNTPENDING");
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

  public static String debtPending(ConnectionProvider connectionProvider, String cBpartnerId, String adOrgId, String adClientId, String issotrx)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(ROUND(SUM(DP.AMOUNT),2),0) AS AMOUNTDEBT" +
      "        FROM C_DEBT_PAYMENT DP, C_CURRENCY" +
      "        WHERE DP.C_BPARTNER_ID = ?" +
      "        AND DP.C_CURRENCY_ID = C_CURRENCY.C_CURRENCY_ID" +
      "        AND DP.AD_ORG_ID = ?" +
      "        AND DP.AD_CLIENT_ID = ?" +
      "        AND C_DEBT_PAYMENT_STATUS(DP.C_Settlement_Cancel_ID, DP.CANCEL_PROCESSED, DP.GENERATE_PROCESSED, DP.ISPAID, DP.ISVALID, " +
      "        DP.C_CASHLINE_ID, DP.C_BANKSTATEMENTLINE_ID) = 'P'" +
      "        AND DP.ISRECEIPT=?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AMOUNTDEBT");
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

  public static String contact(ConnectionProvider connectionProvider, String adUserId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT max(coalesce(to_char(FIRSTNAME),'')||' '||coalesce(to_char(LASTNAME),'')||(case coalesce(to_char(PHONE),'') when '' then '' else ' ('||to_char(PHONE)||')' end)) AS CONTACT" +
      "        FROM AD_USER" +
      "        WHERE AD_USER_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "CONTACT");
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

  public static String invoicing(ConnectionProvider connectionProvider, String issotrx, String c_bpartnerId, String adOrgId, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(SUM(ROUND(IL.LINENETAMT,2)),0) AS AMOUNTINVOICING" +
      "        FROM C_INVOICE I, C_INVOICELINE IL" +
      "        WHERE I.C_INVOICE_ID = IL.C_INVOICE_ID" +
      "        AND I.DATEINVOICED< NOW()+1" +
      "        AND I.DATEINVOICED >= TRUNC(TO_DATE(NOW()), 'YEAR') " +
      "        AND I.PROCESSED = 'Y'" +
      "        AND I.ISSOTRX=?" +
      "        AND I.C_BPARTNER_ID = ?" +
      "        AND I.AD_ORG_ID = ?" +
      "        AND I.AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_bpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AMOUNTINVOICING");
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

  public static String invoicingTotal(ConnectionProvider connectionProvider, String issotrx, String adOrgId, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(SUM(ROUND(IL.LINENETAMT,2)),0) AS AMOUNT" +
      "        FROM C_INVOICE I, C_INVOICELINE IL" +
      "        WHERE I.C_INVOICE_ID = IL.C_INVOICE_ID" +
      "        AND I.DATEINVOICED< NOW()+1" +
      "        AND I.DATEINVOICED >= TRUNC(TO_DATE(NOW()), 'YEAR') " +
      "        AND I.PROCESSED = 'Y'" +
      "        AND I.ISSOTRX=?" +
      "        AND I.AD_ORG_ID = ?" +
      "        AND I.AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AMOUNT");
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

  public static String maxDateordered(ConnectionProvider connectionProvider, String dateFormat, String cBpartnerId, String issotrx, String adOrgId, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT TO_CHAR(MAX(DATEORDERED),to_char(?)) AS DATEORDERED" +
      "        FROM C_ORDER" +
      "        WHERE C_BPARTNER_ID = ?" +
      "        AND DOCSTATUS = 'CO' " +
      "        AND ISSOTRX = ?" +
      "        AND AD_ORG_ID = ?" +
      "        AND AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "DATEORDERED");
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

  public static String materialReceiptPending(ConnectionProvider connectionProvider, String cBpartnerId, String adOrgId, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(SUM(A.AMOUNT),0) FROM (" +
      "        SELECT ROUND(((C_ORDERLINE.QTYORDERED - COALESCE(SUM(m.QTY),0))*PRICEACTUAL),2) AS AMOUNT" +
      "        FROM C_ORDER, C_ORDERLINE left join M_MATCHPO m on  C_ORDERLINE.C_OrderLine_ID=m.C_OrderLine_ID" +
      "                                                              and m.M_INOUTLINE_ID IS NOT NULL, C_CURRENCY" +
      "        WHERE C_ORDER.C_ORDER_ID = C_ORDERLINE.C_ORDER_ID" +
      "        AND C_ORDER.C_CURRENCY_ID = C_CURRENCY.C_CURRENCY_ID" +
      "        AND C_ORDER.ISSOTRX='N'" +
      "        AND C_ORDER.DOCSTATUS = 'CO'" +
      "        AND C_ORDER.C_BPARTNER_ID = ?" +
      "        AND C_ORDER.AD_ORG_ID = ?" +
      "        AND C_ORDER.AD_CLIENT_ID = ?" +
      "        GROUP BY C_ORDERLINE.QTYORDERED, PRICEACTUAL) A";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COALESCE(SUM(A.AMOUNT),0)");
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

  public static String purchasePendingInvoice(ConnectionProvider connectionProvider, String cBpartnerId, String adOrgId, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(SUM(A.AMOUNT),0) FROM (" +
      "        SELECT ROUND(((C_ORDERLINE.QTYORDERED - COALESCE(SUM(m.QTY),0))*PRICEACTUAL),2) AS AMOUNT" +
      "        FROM C_ORDER, C_ORDERLINE left join M_MATCHPO m on  C_ORDERLINE.C_OrderLine_ID=m.C_OrderLine_ID" +
      "                                                              and m.C_InvoiceLine_ID IS NOT NULL, C_CURRENCY" +
      "        WHERE C_ORDER.C_ORDER_ID = C_ORDERLINE.C_ORDER_ID" +
      "        AND C_ORDER.C_CURRENCY_ID = C_CURRENCY.C_CURRENCY_ID" +
      "        AND C_ORDER.ISSOTRX='N'" +
      "        AND C_ORDER.DOCSTATUS = 'CO'" +
      "        AND C_ORDER.C_BPARTNER_ID = ?" +
      "        AND C_ORDER.AD_ORG_ID = ? " +
      "        AND C_ORDER.AD_CLIENT_ID = ?" +
      "        GROUP BY C_ORDERLINE.QTYORDERED, PRICEACTUAL) A";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COALESCE(SUM(A.AMOUNT),0)");
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
