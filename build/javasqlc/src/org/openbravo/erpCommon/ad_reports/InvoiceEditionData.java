//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class InvoiceEditionData implements FieldProvider {
static Logger log4j = Logger.getLogger(InvoiceEditionData.class);
  private String InitRecordNumber="0";
  public String documentno;
  public String dateinvoiced;
  public String clientName;
  public String productName;
  public String quantityorder;
  public String uomname;
  public String priceactual;
  public String priceactualsym;
  public String convpriceactual;
  public String pricelist;
  public String pricelistsym;
  public String convpricelist;
  public String convsym;
  public String convisosym;
  public String transdate;
  public String transcurrencyid;
  public String transclientid;
  public String transorgid;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DATEINVOICED"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("CLIENT_NAME") || fieldName.equals("clientName"))
      return clientName;
    else if (fieldName.equalsIgnoreCase("PRODUCT_NAME") || fieldName.equals("productName"))
      return productName;
    else if (fieldName.equalsIgnoreCase("QUANTITYORDER"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("UOMNAME"))
      return uomname;
    else if (fieldName.equalsIgnoreCase("PRICEACTUAL"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("PRICEACTUALSYM"))
      return priceactualsym;
    else if (fieldName.equalsIgnoreCase("CONVPRICEACTUAL"))
      return convpriceactual;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("PRICELISTSYM"))
      return pricelistsym;
    else if (fieldName.equalsIgnoreCase("CONVPRICELIST"))
      return convpricelist;
    else if (fieldName.equalsIgnoreCase("CONVSYM"))
      return convsym;
    else if (fieldName.equalsIgnoreCase("CONVISOSYM"))
      return convisosym;
    else if (fieldName.equalsIgnoreCase("TRANSDATE"))
      return transdate;
    else if (fieldName.equalsIgnoreCase("TRANSCURRENCYID"))
      return transcurrencyid;
    else if (fieldName.equalsIgnoreCase("TRANSCLIENTID"))
      return transclientid;
    else if (fieldName.equalsIgnoreCase("TRANSORGID"))
      return transorgid;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static InvoiceEditionData[] select(ConnectionProvider connectionProvider, String cCurrencyConv, String adUserOrg, String adUserClient, String dateFrom, String dateTo, String cBPartnerId, String cProjectId, String issotrx)    throws ServletException {
    return select(connectionProvider, cCurrencyConv, adUserOrg, adUserClient, dateFrom, dateTo, cBPartnerId, cProjectId, issotrx, 0, 0);
  }

  public static InvoiceEditionData[] select(ConnectionProvider connectionProvider, String cCurrencyConv, String adUserOrg, String adUserClient, String dateFrom, String dateTo, String cBPartnerId, String cProjectId, String issotrx, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT COALESCE(C_INVOICE.POREFERENCE, C_INVOICE.DOCUMENTNO) AS DOCUMENTNO, C_INVOICE.DATEINVOICED AS DATEINVOICED, " +
      "      C_BPARTNER.NAME AS CLIENT_NAME, COALESCE(M_PRODUCT.NAME, C_GLITEM.NAME) AS PRODUCT_NAME," +
      "      SUM(CASE WHEN C_DOCTYPE.DOCBASETYPE='APC' THEN C_INVOICELINE.QTYINVOICED*-1 ELSE C_INVOICELINE.QTYINVOICED END) AS QUANTITYORDER, " +
      "      C_UOM.NAME AS UOMNAME, C_INVOICELINE.PRICEACTUAL AS PRICEACTUAL, " +
      "      C_CURRENCY_SYMBOL (C_INVOICE.C_CURRENCY_ID, C_INVOICELINE.PRICEACTUAL, 'Y') AS PRICEACTUALSYM," +
      "	  C_CURRENCY_CONVERT(C_INVOICELINE.PRICEACTUAL, C_INVOICE.C_CURRENCY_ID, ?, TO_DATE(COALESCE(C_INVOICE.DATEINVOICED, NOW())), NULL, C_INVOICELINE.AD_CLIENT_ID, C_INVOICELINE.AD_ORG_ID) AS CONVPRICEACTUAL," +
      "      SUM(CASE WHEN C_DOCTYPE.DOCBASETYPE='APC' THEN C_INVOICELINE.LINENETAMT*-1 ELSE C_INVOICELINE.LINENETAMT END) AS PRICELIST," +
      "      C_CURRENCY_SYMBOL (C_INVOICE.C_CURRENCY_ID, SUM(C_INVOICELINE.LINENETAMT) , 'Y') AS PRICELISTSYM," +
      "	  SUM(C_CURRENCY_CONVERT(CASE WHEN C_DOCTYPE.DOCBASETYPE='APC' THEN C_INVOICELINE.LINENETAMT*-1 ELSE C_INVOICELINE.LINENETAMT END, C_INVOICE.C_CURRENCY_ID, ?, TO_DATE(COALESCE(C_INVOICE.DATEINVOICED, NOW())), NULL, C_INVOICELINE.AD_CLIENT_ID, C_INVOICELINE.AD_ORG_ID)) AS CONVPRICELIST," +
      "	  C_CURRENCY_SYMBOL(?, '0', 'Y') AS CONVSYM," +
      "	  C_CURRENCY_ISOSYM(?) AS CONVISOSYM," +
      "	  TO_DATE(COALESCE(C_INVOICE.DATEINVOICED, NOW())) AS TRANSDATE," +
      "	  C_INVOICE.C_CURRENCY_ID AS TRANSCURRENCYID," +
      "      C_INVOICELINE.AD_CLIENT_ID AS TRANSCLIENTID, " +
      "	  C_INVOICELINE.AD_ORG_ID AS TRANSORGID " +
      "      FROM C_INVOICE left join C_DOCTYPE on C_INVOICE.C_DOCTYPE_ID=C_DOCTYPE.C_DOCTYPE_ID," +
      "      C_INVOICELINE left join M_PRODUCT on C_INVOICELINE.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "                    left join C_GLITEM on C_INVOICELINE.ACCOUNT_ID = C_GLITEM.C_GLITEM_ID," +
      "      C_UOM, C_BPARTNER" +
      "      WHERE C_INVOICE.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "      AND C_INVOICE.C_INVOICE_ID = C_INVOICELINE.C_INVOICE_ID" +
      "      AND (C_INVOICELINE.M_PRODUCT_ID IS NOT NULL OR C_INVOICELINE.ACCOUNT_ID IS NOT NULL)" +
      "      AND C_INVOICELINE.C_UOM_ID = C_UOM.C_UOM_ID" +
      "      AND C_INVOICE.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND C_INVOICE.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":" AND C_INVOICE.DATEINVOICED >= TO_DATE(?) ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":" AND C_INVOICE.DATEINVOICED < TO_DATE(?) ");
    strSql = strSql + ((cBPartnerId==null || cBPartnerId.equals(""))?"":" AND C_INVOICE.C_BPARTNER_ID = ? ");
    strSql = strSql + ((cProjectId==null || cProjectId.equals(""))?"":" AND C_INVOICE.C_PROJECT_ID = ? ");
    strSql = strSql + 
      "      AND C_INVOICE.ISSOTRX = ?" +
      "      GROUP BY C_BPARTNER.NAME, COALESCE(M_PRODUCT.NAME, C_GLITEM.NAME), C_UOM.NAME, C_INVOICELINE.PRICEACTUAL, " +
      "      COALESCE(C_INVOICE.POREFERENCE, C_INVOICE.DOCUMENTNO), C_INVOICE.DATEINVOICED," +
      "      C_INVOICE.C_CURRENCY_ID, C_INVOICELINE.AD_CLIENT_ID, C_INVOICELINE.AD_ORG_ID" +
      "      ORDER BY C_BPARTNER.NAME, COALESCE(C_INVOICE.POREFERENCE, C_INVOICE.DOCUMENTNO), C_INVOICE.DATEINVOICED";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (cBPartnerId != null && !(cBPartnerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBPartnerId);
      }
      if (cProjectId != null && !(cProjectId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);

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
        InvoiceEditionData objectInvoiceEditionData = new InvoiceEditionData();
        objectInvoiceEditionData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectInvoiceEditionData.dateinvoiced = UtilSql.getDateValue(result, "DATEINVOICED", "dd-MM-yyyy");
        objectInvoiceEditionData.clientName = UtilSql.getValue(result, "CLIENT_NAME");
        objectInvoiceEditionData.productName = UtilSql.getValue(result, "PRODUCT_NAME");
        objectInvoiceEditionData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectInvoiceEditionData.uomname = UtilSql.getValue(result, "UOMNAME");
        objectInvoiceEditionData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectInvoiceEditionData.priceactualsym = UtilSql.getValue(result, "PRICEACTUALSYM");
        objectInvoiceEditionData.convpriceactual = UtilSql.getValue(result, "CONVPRICEACTUAL");
        objectInvoiceEditionData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectInvoiceEditionData.pricelistsym = UtilSql.getValue(result, "PRICELISTSYM");
        objectInvoiceEditionData.convpricelist = UtilSql.getValue(result, "CONVPRICELIST");
        objectInvoiceEditionData.convsym = UtilSql.getValue(result, "CONVSYM");
        objectInvoiceEditionData.convisosym = UtilSql.getValue(result, "CONVISOSYM");
        objectInvoiceEditionData.transdate = UtilSql.getDateValue(result, "TRANSDATE", "dd-MM-yyyy");
        objectInvoiceEditionData.transcurrencyid = UtilSql.getValue(result, "TRANSCURRENCYID");
        objectInvoiceEditionData.transclientid = UtilSql.getValue(result, "TRANSCLIENTID");
        objectInvoiceEditionData.transorgid = UtilSql.getValue(result, "TRANSORGID");
        objectInvoiceEditionData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectInvoiceEditionData);
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
    InvoiceEditionData objectInvoiceEditionData[] = new InvoiceEditionData[vector.size()];
    vector.copyInto(objectInvoiceEditionData);
    return(objectInvoiceEditionData);
  }

  public static InvoiceEditionData[] selectProject(ConnectionProvider connectionProvider, String cCurrencyConv, String adUserOrg, String adUserClient, String dateFrom, String dateTo, String cBPartnerId, String cProjectId, String issotrx)    throws ServletException {
    return selectProject(connectionProvider, cCurrencyConv, adUserOrg, adUserClient, dateFrom, dateTo, cBPartnerId, cProjectId, issotrx, 0, 0);
  }

  public static InvoiceEditionData[] selectProject(ConnectionProvider connectionProvider, String cCurrencyConv, String adUserOrg, String adUserClient, String dateFrom, String dateTo, String cBPartnerId, String cProjectId, String issotrx, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT COALESCE(C_INVOICE.POREFERENCE, C_INVOICE.DOCUMENTNO) AS DOCUMENTNO, C_INVOICE.DATEINVOICED AS DATEINVOICED, " +
      "      C_BPARTNER.NAME AS CLIENT_NAME, COALESCE(M_PRODUCT.NAME, C_GLITEM.NAME) AS PRODUCT_NAME, SUM(CASE WHEN C_DOCTYPE.DOCBASETYPE='APC' THEN C_INVOICELINE.QTYINVOICED*-1 ELSE C_INVOICELINE.QTYINVOICED END) AS QUANTITYORDER, " +
      "      C_UOM.NAME AS UOMNAME, C_INVOICELINE.PRICEACTUAL AS PRICEACTUAL, " +
      "      C_CURRENCY_SYMBOL (C_INVOICE.C_CURRENCY_ID, C_INVOICELINE.PRICEACTUAL, 'Y') AS PRICEACTUALSYM," +
      "	  C_CURRENCY_CONVERT(C_INVOICELINE.PRICEACTUAL, C_INVOICE.C_CURRENCY_ID, ?, TO_DATE(COALESCE(C_INVOICE.DATEINVOICED, NOW())), NULL, C_INVOICELINE.AD_CLIENT_ID, C_INVOICELINE.AD_ORG_ID) AS CONVPRICEACTUAL," +
      "      SUM(CASE WHEN C_DOCTYPE.DOCBASETYPE='APC' THEN C_INVOICELINE.LINENETAMT*-1 ELSE C_INVOICELINE.LINENETAMT END) AS PRICELIST," +
      "      C_CURRENCY_SYMBOL (C_INVOICE.C_CURRENCY_ID, SUM(C_INVOICELINE.LINENETAMT) , 'Y') AS PRICELISTSYM," +
      "	  SUM(C_CURRENCY_CONVERT(CASE WHEN C_DOCTYPE.DOCBASETYPE='APC' THEN C_INVOICELINE.LINENETAMT*-1 ELSE C_INVOICELINE.LINENETAMT END, C_INVOICE.C_CURRENCY_ID, ?, TO_DATE(COALESCE(C_INVOICE.DATEINVOICED, NOW())), NULL, C_INVOICELINE.AD_CLIENT_ID, C_INVOICELINE.AD_ORG_ID)) AS CONVPRICELIST," +
      "	  C_CURRENCY_SYMBOL(?, '0', 'Y') AS CONVSYM," +
      "	  C_CURRENCY_ISOSYM(?) AS CONVISOSYM," +
      "	  TO_DATE(COALESCE(C_INVOICE.DATEINVOICED, NOW())) AS TRANSDATE," +
      "	  C_INVOICE.C_CURRENCY_ID AS TRANSCURRENCYID," +
      "      C_INVOICELINE.AD_CLIENT_ID AS TRANSCLIENTID, " +
      "	  C_INVOICELINE.AD_ORG_ID AS TRANSORGID " +
      "      FROM C_INVOICE left join C_DOCTYPE on C_INVOICE.C_DOCTYPE_ID=C_DOCTYPE.C_DOCTYPE_ID," +
      "      C_INVOICELINE left join M_PRODUCT on C_INVOICELINE.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "                    left join C_GLITEM on C_INVOICELINE.ACCOUNT_ID = C_GLITEM.C_GLITEM_ID," +
      "      C_UOM, C_BPARTNER" +
      "      WHERE C_INVOICE.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "      AND C_INVOICE.C_INVOICE_ID = C_INVOICELINE.C_INVOICE_ID" +
      "      AND (C_INVOICELINE.M_PRODUCT_ID IS NOT NULL OR C_INVOICELINE.ACCOUNT_ID IS NOT NULL)" +
      "      AND C_INVOICELINE.C_UOM_ID = C_UOM.C_UOM_ID" +
      "      AND C_INVOICE.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND C_INVOICE.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":" AND C_INVOICE.DATEINVOICED >= TO_DATE(?) ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":" AND C_INVOICE.DATEINVOICED < TO_DATE(?) ");
    strSql = strSql + ((cBPartnerId==null || cBPartnerId.equals(""))?"":" AND C_INVOICE.C_BPARTNER_ID = ? ");
    strSql = strSql + 
      "      AND (C_INVOICE.C_PROJECT_ID = ?" +
      "           OR EXISTS (SELECT 1 FROM C_INVOICELINE il, C_INVOICELINE_ACCTDIMENSION ila" +
      "                      WHERE il.C_INVOICE_ID = C_INVOICE.C_INVOICE_ID" +
      "                        AND il.C_INVOICELINE_ID = ila.C_INVOICELINE_ID" +
      "                        AND ila.C_PROJECT_ID = ?))" +
      "      AND C_INVOICE.ISSOTRX = ?" +
      "      GROUP BY C_BPARTNER.NAME, COALESCE(M_PRODUCT.NAME, C_GLITEM.NAME), C_UOM.NAME, C_INVOICELINE.PRICEACTUAL, " +
      "      COALESCE(C_INVOICE.POREFERENCE, C_INVOICE.DOCUMENTNO), C_INVOICE.DATEINVOICED," +
      "      C_INVOICE.C_CURRENCY_ID, C_INVOICELINE.AD_CLIENT_ID, C_INVOICELINE.AD_ORG_ID" +
      "      ORDER BY C_BPARTNER.NAME, COALESCE(C_INVOICE.POREFERENCE, C_INVOICE.DOCUMENTNO), C_INVOICE.DATEINVOICED";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyConv);
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (cBPartnerId != null && !(cBPartnerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBPartnerId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);

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
        InvoiceEditionData objectInvoiceEditionData = new InvoiceEditionData();
        objectInvoiceEditionData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectInvoiceEditionData.dateinvoiced = UtilSql.getDateValue(result, "DATEINVOICED", "dd-MM-yyyy");
        objectInvoiceEditionData.clientName = UtilSql.getValue(result, "CLIENT_NAME");
        objectInvoiceEditionData.productName = UtilSql.getValue(result, "PRODUCT_NAME");
        objectInvoiceEditionData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectInvoiceEditionData.uomname = UtilSql.getValue(result, "UOMNAME");
        objectInvoiceEditionData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectInvoiceEditionData.priceactualsym = UtilSql.getValue(result, "PRICEACTUALSYM");
        objectInvoiceEditionData.convpriceactual = UtilSql.getValue(result, "CONVPRICEACTUAL");
        objectInvoiceEditionData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectInvoiceEditionData.pricelistsym = UtilSql.getValue(result, "PRICELISTSYM");
        objectInvoiceEditionData.convpricelist = UtilSql.getValue(result, "CONVPRICELIST");
        objectInvoiceEditionData.convsym = UtilSql.getValue(result, "CONVSYM");
        objectInvoiceEditionData.convisosym = UtilSql.getValue(result, "CONVISOSYM");
        objectInvoiceEditionData.transdate = UtilSql.getDateValue(result, "TRANSDATE", "dd-MM-yyyy");
        objectInvoiceEditionData.transcurrencyid = UtilSql.getValue(result, "TRANSCURRENCYID");
        objectInvoiceEditionData.transclientid = UtilSql.getValue(result, "TRANSCLIENTID");
        objectInvoiceEditionData.transorgid = UtilSql.getValue(result, "TRANSORGID");
        objectInvoiceEditionData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectInvoiceEditionData);
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
    InvoiceEditionData objectInvoiceEditionData[] = new InvoiceEditionData[vector.size()];
    vector.copyInto(objectInvoiceEditionData);
    return(objectInvoiceEditionData);
  }
}
