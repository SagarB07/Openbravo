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

class CopyFromInvoiceData implements FieldProvider {
static Logger log4j = Logger.getLogger(CopyFromInvoiceData.class);
  private String InitRecordNumber="0";
  public String cUomId;
  public String qtyinvoiced;
  public String cInvoicelineId;
  public String pricelist;
  public String pricelimit;
  public String priceactual;
  public String linenetamt;
  public String adOrgId;
  public String adClientId;
  public String cBpartnerLocationId;
  public String dateinvoiced;
  public String cProjectId;
  public String productId;
  public String cBpartnerId;
  public String cCurrencyId;
  public String mPricelistId;
  public String line;
  public String issotrx;
  public String taxdate;
  public String pricestd;
  public String validfrom;
  public String stdprecision;
  public String priceprecision;
  public String enforcepricelimit;
  public String accountId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("QTYINVOICED"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("C_INVOICELINE_ID") || fieldName.equals("cInvoicelineId"))
      return cInvoicelineId;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("PRICELIMIT"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("PRICEACTUAL"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("LINENETAMT"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("DATEINVOICED"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("PRODUCT_ID") || fieldName.equals("productId"))
      return productId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("TAXDATE"))
      return taxdate;
    else if (fieldName.equalsIgnoreCase("PRICESTD"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("VALIDFROM"))
      return validfrom;
    else if (fieldName.equalsIgnoreCase("STDPRECISION"))
      return stdprecision;
    else if (fieldName.equalsIgnoreCase("PRICEPRECISION"))
      return priceprecision;
    else if (fieldName.equalsIgnoreCase("ENFORCEPRICELIMIT"))
      return enforcepricelimit;
    else if (fieldName.equalsIgnoreCase("ACCOUNT_ID") || fieldName.equals("accountId"))
      return accountId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static CopyFromInvoiceData[] select(Connection conn, ConnectionProvider connectionProvider, String cInvoiceId, String userclient, String userorg)    throws ServletException {
    return select(conn, connectionProvider, cInvoiceId, userclient, userorg, 0, 0);
  }

  public static CopyFromInvoiceData[] select(Connection conn, ConnectionProvider connectionProvider, String cInvoiceId, String userclient, String userorg, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT" +
      "        C_INVOICELINE.C_UOM_ID, C_INVOICELINE.QTYINVOICED, C_INVOICELINE.C_InvoiceLine_ID,C_INVOICELINE.PRICELIST, " +
      "        C_INVOICELINE.PRICELIMIT, C_INVOICELINE.PRICEACTUAL, C_INVOICELINE.LINENETAMT," +
      "        '' AS AD_ORG_ID, '' AS AD_CLIENT_ID, " +
      "        '' AS C_BPartner_Location_ID, " +
      "        '' AS DateInvoiced, '' AS C_Project_ID," +
      "        C_INVOICELINE.M_PRODUCT_ID AS PRODUCT_ID, " +
      "        '' AS C_BPARTNER_ID, '' AS C_CURRENCY_ID," +
      "        '' AS M_PRICELIST_ID, '' AS LINE," +
      "        '' AS ISSOTRX, '' AS TAXDATE," +
      "        '' AS PRICESTD, '' AS VALIDFROM," +
      "        '' AS StdPrecision, '' AS PricePrecision, '' AS EnforcePriceLimit," +
      "        C_INVOICELINE.ACCOUNT_ID AS ACCOUNT_ID" +
      "        FROM C_INVOICELINE " +
      "        LEFT OUTER JOIN C_INVOICE_DISCOUNT ON C_INVOICELINE.C_INVOICE_DISCOUNT_ID = C_INVOICE_DISCOUNT.C_INVOICE_DISCOUNT_ID" +
      "        LEFT OUTER JOIN C_BPARTNER_DISCOUNT ON C_INVOICE_DISCOUNT.C_DISCOUNT_ID = C_BPARTNER_DISCOUNT.C_DISCOUNT_ID" +
      "        WHERE C_INVOICELINE.C_Invoice_ID = ?" +
      "        AND C_INVOICELINE.AD_CLIENT_ID IN (";
    strSql = strSql + ((userclient==null || userclient.equals(""))?"":userclient);
    strSql = strSql + 
      ")" +
      "        AND C_INVOICELINE.AD_ORG_ID IN (";
    strSql = strSql + ((userorg==null || userorg.equals(""))?"":userorg);
    strSql = strSql + 
      ")" +
      "        AND C_INVOICELINE.ISACTIVE = 'Y'" +
      "        AND (APPLYINORDER IS NULL OR APPLYINORDER <> 'N')" +
      "        ORDER BY C_INVOICELINE.LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      if (userclient != null && !(userclient.equals(""))) {
        }
      if (userorg != null && !(userorg.equals(""))) {
        }

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
        CopyFromInvoiceData objectCopyFromInvoiceData = new CopyFromInvoiceData();
        objectCopyFromInvoiceData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectCopyFromInvoiceData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectCopyFromInvoiceData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectCopyFromInvoiceData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectCopyFromInvoiceData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectCopyFromInvoiceData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectCopyFromInvoiceData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectCopyFromInvoiceData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectCopyFromInvoiceData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectCopyFromInvoiceData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectCopyFromInvoiceData.dateinvoiced = UtilSql.getValue(result, "DATEINVOICED");
        objectCopyFromInvoiceData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectCopyFromInvoiceData.productId = UtilSql.getValue(result, "PRODUCT_ID");
        objectCopyFromInvoiceData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectCopyFromInvoiceData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectCopyFromInvoiceData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectCopyFromInvoiceData.line = UtilSql.getValue(result, "LINE");
        objectCopyFromInvoiceData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectCopyFromInvoiceData.taxdate = UtilSql.getValue(result, "TAXDATE");
        objectCopyFromInvoiceData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectCopyFromInvoiceData.validfrom = UtilSql.getValue(result, "VALIDFROM");
        objectCopyFromInvoiceData.stdprecision = UtilSql.getValue(result, "STDPRECISION");
        objectCopyFromInvoiceData.priceprecision = UtilSql.getValue(result, "PRICEPRECISION");
        objectCopyFromInvoiceData.enforcepricelimit = UtilSql.getValue(result, "ENFORCEPRICELIMIT");
        objectCopyFromInvoiceData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectCopyFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCopyFromInvoiceData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    CopyFromInvoiceData objectCopyFromInvoiceData[] = new CopyFromInvoiceData[vector.size()];
    vector.copyInto(objectCopyFromInvoiceData);
    return(objectCopyFromInvoiceData);
  }

  public static int insert(Connection conn, ConnectionProvider connectionProvider, String cNewInvoiceId, String cInvoiceId, String adClientId, String adUserId, String priceList, String priceActual, String priceLimit, String lineNetAmount, String cTaxId, String priceGross, String amtGross, String priceListGros, String priceStdGross, String cInvoicelineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO C_INVOICELINE (C_InvoiceLine_ID, C_Invoice_ID, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, " +
      "            CREATED, CREATEDBY, UPDATED, UPDATEDBY, LINE, DESCRIPTION, M_PRODUCT_ID, " +
      "            QTYINVOICED, PRICELIST, PRICEACTUAL, PRICELIMIT, LINENETAMT, C_CHARGE_ID, CHARGEAMT, C_UOM_ID, C_TAX_ID, " +
      "            S_RESOURCEASSIGNMENT_ID, TAXAMT, M_ATTRIBUTESETINSTANCE_ID, ISDESCRIPTION, QUANTITYORDER, M_PRODUCT_UOM_ID, " +
      "            PRICESTD, ACCOUNT_ID,FINANCIAL_INVOICE_LINE," +
      "            gross_unit_price, line_gross_amount, grosspricelist, grosspricestd," +
      "            isdeferred, defplantype, periodnumber, c_period_id," +
      "            C_PROJECT_ID, A_ASSET_ID, C_COSTCENTER_ID, USER1_ID, USER2_ID" +
      "        )" +
      "        SELECT ?, ?, ?, l.AD_ORG_ID, 'Y', now(), ?, now(), ?," +
      "        (SELECT COALESCE(MAX(LINE),0)+10 FROM C_InvoiceLine WHERE C_Invoice_ID = ?), l.DESCRIPTION, l.M_PRODUCT_ID," +
      "        l.QTYINVOICED, TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), l.C_CHARGE_ID, l.CHARGEAMT, l.C_UOM_ID, ?," +
      "        l.S_RESOURCEASSIGNMENT_ID, l.TAXAMT, l.M_ATTRIBUTESETINSTANCE_ID, l.ISDESCRIPTION, l.QUANTITYORDER, l.M_PRODUCT_UOM_ID," +
      "        l.PRICESTD, l.ACCOUNT_ID,l.FINANCIAL_INVOICE_LINE," +
      "        TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?)," +
      "        l.isdeferred, l.defplantype, l.periodnumber, l.c_period_id," +
      "        COALESCE(l.C_Project_ID, inv.C_Project_ID) AS C_Project_ID," +
      "        COALESCE(l.A_Asset_ID, inv.A_Asset_ID) AS A_Asset_ID," +
      "        COALESCE(l.C_Costcenter_ID, inv.C_Costcenter_ID) AS C_Costcenter_ID," +
      "        COALESCE(l.User1_ID, inv.User1_ID) AS User1_ID," +
      "        COALESCE(l.User2_ID, inv.User2_ID) AS User2_ID" +
      "        FROM C_INVOICELINE l, C_Invoice inv" +
      "        WHERE C_INVOICELINE_ID = ? " +
      "        AND l.C_Invoice_ID = inv.C_Invoice_ID";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cNewInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceList);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceActual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceLimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineNetAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceGross);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amtGross);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceListGros);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceStdGross);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);

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

  public static int insertAcctDimension(Connection conn, ConnectionProvider connectionProvider, String adClientId, String adUserId, String cNewInvoicelineId, String cOldInvoicelineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO C_INVOICELINE_ACCTDIMENSION(C_INVOICELINE_ACCTDIMENSION_ID, AD_CLIENT_ID, AD_ORG_ID," +
      "        ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY, C_INVOICELINE_ID, AMT, C_PROJECT_ID, C_CAMPAIGN_ID," +
      "        USER1_ID, USER2_ID, C_ACTIVITY_ID, C_COSTCENTER_ID, C_BPARTNER_ID, M_PRODUCT_ID)" +
      "        SELECT GET_UUID(), ?, AD_ORG_ID, 'Y', NOW(), ?, NOW(), ?, ?, AMT, C_PROJECT_ID, C_CAMPAIGN_ID, USER1_ID, USER2_ID, " +
      "        C_ACTIVITY_ID, C_COSTCENTER_ID, C_BPARTNER_ID, M_PRODUCT_ID" +
      "        FROM C_INVOICELINE_ACCTDIMENSION WHERE C_INVOICELINE_ID = ? AND ISACTIVE='Y'";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cNewInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOldInvoicelineId);

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

  public static CopyFromInvoiceData[] selectInvoice(Connection conn, ConnectionProvider connectionProvider, String cInvoiceId)    throws ServletException {
    return selectInvoice(conn, connectionProvider, cInvoiceId, 0, 0);
  }

  public static CopyFromInvoiceData[] selectInvoice(Connection conn, ConnectionProvider connectionProvider, String cInvoiceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT I.AD_ORG_ID,I.AD_CLIENT_ID,I.C_BPartner_Location_ID,I.DateInvoiced,I.C_Project_ID," +
      "         I.C_Bpartner_ID,I.C_Currency_ID,I.M_Pricelist_ID,COALESCE(MAX(IL.Line),0) AS LINE,I.IsSOTrx AS ISSOTRX, I.TaxDate," +
      "         IL.PRICELIST, IL.PRICEACTUAL, IL.PRICELIMIT, IL.LINENETAMT" +
      "         FROM C_Invoice I LEFT JOIN C_INVOICELINE IL ON I.C_INVOICE_ID = IL.C_INVOICE_ID " +
      "        WHERE I.C_Invoice_ID = ? " +
      "        AND I.ISACTIVE = 'Y'" +
      "        GROUP BY I.AD_ORG_ID,I.AD_CLIENT_ID,I.C_BPartner_Location_ID,I.DateInvoiced,I.C_Project_ID," +
      "         I.C_Bpartner_ID,I.C_Currency_ID,I.M_Pricelist_ID,I.IsSOTrx, I.TaxDate,IL.PRICELIST, IL.PRICEACTUAL, IL.PRICELIMIT, IL.LINENETAMT";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

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
        CopyFromInvoiceData objectCopyFromInvoiceData = new CopyFromInvoiceData();
        objectCopyFromInvoiceData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectCopyFromInvoiceData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectCopyFromInvoiceData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectCopyFromInvoiceData.dateinvoiced = UtilSql.getDateValue(result, "DATEINVOICED", "dd-MM-yyyy");
        objectCopyFromInvoiceData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectCopyFromInvoiceData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectCopyFromInvoiceData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectCopyFromInvoiceData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectCopyFromInvoiceData.line = UtilSql.getValue(result, "LINE");
        objectCopyFromInvoiceData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectCopyFromInvoiceData.taxdate = UtilSql.getDateValue(result, "TAXDATE", "dd-MM-yyyy");
        objectCopyFromInvoiceData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectCopyFromInvoiceData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectCopyFromInvoiceData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectCopyFromInvoiceData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectCopyFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCopyFromInvoiceData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    CopyFromInvoiceData objectCopyFromInvoiceData[] = new CopyFromInvoiceData[vector.size()];
    vector.copyInto(objectCopyFromInvoiceData);
    return(objectCopyFromInvoiceData);
  }

  public static CopyFromInvoiceData[] selectPriceForProduct(ConnectionProvider connectionProvider, String MProductID, String MPriceListID)    throws ServletException {
    return selectPriceForProduct(connectionProvider, MProductID, MPriceListID, 0, 0);
  }

  public static CopyFromInvoiceData[] selectPriceForProduct(ConnectionProvider connectionProvider, String MProductID, String MPriceListID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_BOM_PriceStd(p.M_Product_ID,pv.M_PriceList_Version_ID) AS PriceStd," +
      "        M_BOM_PriceList(p.M_Product_ID,pv.M_PriceList_Version_ID) AS PriceList," +
      "        M_BOM_PriceLimit(p.M_Product_ID,pv.M_PriceList_Version_ID) AS PriceLimit," +
      "        p.C_UOM_ID,pv.ValidFrom,pl.C_Currency_ID " +
      "        FROM M_Product p, M_ProductPrice pp, M_Pricelist pl, M_PriceList_Version pv " +
      "        WHERE p.M_Product_ID=pp.M_Product_ID" +
      "        AND pp.M_PriceList_Version_ID=pv.M_PriceList_Version_ID" +
      "        AND pv.M_PriceList_ID=pl.M_PriceList_ID" +
      "        AND pv.IsActive='Y'" +
      "        AND p.M_Product_ID = ?" +
      "       AND pl.M_PriceList_ID = ?" +
      "        ORDER BY pv.ValidFrom DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, MProductID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, MPriceListID);

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
        CopyFromInvoiceData objectCopyFromInvoiceData = new CopyFromInvoiceData();
        objectCopyFromInvoiceData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectCopyFromInvoiceData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectCopyFromInvoiceData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectCopyFromInvoiceData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectCopyFromInvoiceData.validfrom = UtilSql.getDateValue(result, "VALIDFROM", "dd-MM-yyyy");
        objectCopyFromInvoiceData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectCopyFromInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCopyFromInvoiceData);
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
    CopyFromInvoiceData objectCopyFromInvoiceData[] = new CopyFromInvoiceData[vector.size()];
    vector.copyInto(objectCopyFromInvoiceData);
    return(objectCopyFromInvoiceData);
  }

  public static String getOffersStdPrice(ConnectionProvider connectionProvider, String cBpartnerId, String pricestd, String mProductId, String dateinvoiced, String qty, String pricelist, String invoiceid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ROUND(M_GET_OFFERS_STD_PRICE(?,TO_NUMBER(?),?,TO_DATE(?), TO_NUMBER(?), ?)," +
      "                    (SELECT PRICEPRECISION " +
      "                       FROM C_CURRENCY C," +
      "                            C_INVOICE    I " +
      "                      WHERE C.C_CURRENCY_ID = I.C_CURRENCY_ID" +
      "                        AND I.C_INVOICE_ID = ?)) as TOTAL FROM DUAL";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TOTAL");
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
