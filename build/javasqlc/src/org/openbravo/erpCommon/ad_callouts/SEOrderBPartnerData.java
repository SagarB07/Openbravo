//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class SEOrderBPartnerData implements FieldProvider {
static Logger log4j = Logger.getLogger(SEOrderBPartnerData.class);
  private String InitRecordNumber="0";
  public String cPaymenttermId;
  public String mPricelistId;
  public String paymentrule;
  public String poreference;
  public String soDescription;
  public String isdiscountprinted;
  public String invoicerule;
  public String deliveryrule;
  public String deliveryviarule;
  public String creditavailable;
  public String poPricelistId;
  public String paymentrulepo;
  public String poPaymenttermId;
  public String salesrepId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_ID") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("SO_DESCRIPTION") || fieldName.equals("soDescription"))
      return soDescription;
    else if (fieldName.equalsIgnoreCase("ISDISCOUNTPRINTED"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("INVOICERULE"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("DELIVERYRULE"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("DELIVERYVIARULE"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("CREDITAVAILABLE"))
      return creditavailable;
    else if (fieldName.equalsIgnoreCase("PO_PRICELIST_ID") || fieldName.equals("poPricelistId"))
      return poPricelistId;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULEPO"))
      return paymentrulepo;
    else if (fieldName.equalsIgnoreCase("PO_PAYMENTTERM_ID") || fieldName.equals("poPaymenttermId"))
      return poPaymenttermId;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SEOrderBPartnerData[] select(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    return select(connectionProvider, cBpartnerId, 0, 0);
  }

  public static SEOrderBPartnerData[] select(ConnectionProvider connectionProvider, String cBpartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT p.C_PaymentTerm_ID," +
      "      p.M_PriceList_ID,p.PaymentRule,p.POReference," +
      "      p.SO_Description,COALESCE(p.IsDiscountPrinted,'N') AS IsDiscountPrinted," +
      "      p.InvoiceRule,p.DeliveryRule,DeliveryViaRule," +
      "      COALESCE(p.SO_CreditLimit-p.SO_CreditUsed,-1) AS CreditAvailable," +
      "      p.PO_PriceList_ID, p.PaymentRulePO, p.PO_PaymentTerm_ID, p.salesrep_Id" +
      "      FROM C_BPartner p" +
      "      WHERE p.C_BPartner_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
        SEOrderBPartnerData objectSEOrderBPartnerData = new SEOrderBPartnerData();
        objectSEOrderBPartnerData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectSEOrderBPartnerData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectSEOrderBPartnerData.paymentrule = UtilSql.getValue(result, "PAYMENTRULE");
        objectSEOrderBPartnerData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectSEOrderBPartnerData.soDescription = UtilSql.getValue(result, "SO_DESCRIPTION");
        objectSEOrderBPartnerData.isdiscountprinted = UtilSql.getValue(result, "ISDISCOUNTPRINTED");
        objectSEOrderBPartnerData.invoicerule = UtilSql.getValue(result, "INVOICERULE");
        objectSEOrderBPartnerData.deliveryrule = UtilSql.getValue(result, "DELIVERYRULE");
        objectSEOrderBPartnerData.deliveryviarule = UtilSql.getValue(result, "DELIVERYVIARULE");
        objectSEOrderBPartnerData.creditavailable = UtilSql.getValue(result, "CREDITAVAILABLE");
        objectSEOrderBPartnerData.poPricelistId = UtilSql.getValue(result, "PO_PRICELIST_ID");
        objectSEOrderBPartnerData.paymentrulepo = UtilSql.getValue(result, "PAYMENTRULEPO");
        objectSEOrderBPartnerData.poPaymenttermId = UtilSql.getValue(result, "PO_PAYMENTTERM_ID");
        objectSEOrderBPartnerData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectSEOrderBPartnerData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSEOrderBPartnerData);
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
    SEOrderBPartnerData objectSEOrderBPartnerData[] = new SEOrderBPartnerData[vector.size()];
    vector.copyInto(objectSEOrderBPartnerData);
    return(objectSEOrderBPartnerData);
  }

  public static String mWarehouse(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(M_WAREHOUSE_ID) AS ID FROM M_WAREHOUSE_SHIPPER" +
      "        WHERE M_WAREHOUSE_SHIPPER.C_BPARTNER_ID = ?" +
      "        AND (SELECT ISACTIVE FROM M_WAREHOUSE WHERE M_WAREHOUSE_ID=M_WAREHOUSE_SHIPPER.M_WAREHOUSE_ID)='Y'";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ID");
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

  public static String mWarehouseOnhand(ConnectionProvider connectionProvider, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select m_warehouse_id AS ID from ad_org_warehouse" +
      "        where ad_org_id = ?" +
      "        and (select isactive from m_warehouse where m_warehouse_id=ad_org_warehouse.m_warehouse_id)='Y'" +
      "        group by m_warehouse_id, priority" +
      "        having min(priority) = priority";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ID");
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

  public static String getIsDicountPrinted(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(IsDiscountPrinted,'N') AS IsDiscountPrinted FROM C_BPARTNER WHERE C_BPARTNER_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISDISCOUNTPRINTED");
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

  public static String selectPaymentTerm(ConnectionProvider connectionProvider, String clientlist)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select c_paymentterm_id " +
      "        from c_paymentterm " +
      "        where isactive='Y' " +
      "        AND isdefault='Y' " +
      "        AND AD_Client_ID IN (";
    strSql = strSql + ((clientlist==null || clientlist.equals(""))?"":clientlist);
    strSql = strSql + 
      ") ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (clientlist != null && !(clientlist.equals(""))) {
        }

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
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

  public static String userIdSalesRep(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select max(ad_user_id) AS ID" +
      "        from ad_user, c_bpartner" +
      "        where ad_user.c_bpartner_id = c_bpartner.c_bpartner_id" +
      "        and c_bpartner.issalesrep='Y'" +
      "        and ad_user.isactive='Y' " +
      "        and ad_user.c_bpartner_id= ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ID");
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

  public static String defaultPriceList(ConnectionProvider connectionProvider, String isreceipt, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select m_pricelist_id" +
      "        from m_pricelist" +
      "        where isdefault = 'Y' " +
      "        and issopricelist = ?" +
      "        and ad_client_id = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isreceipt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_PRICELIST_ID");
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
