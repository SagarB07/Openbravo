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
import org.openbravo.database.RDBMSIndependent;
import org.openbravo.exception.*;

class RequisitionToOrderData implements FieldProvider {
static Logger log4j = Logger.getLogger(RequisitionToOrderData.class);
  private String InitRecordNumber="0";
  public String mRequisitionlineId;
  public String reqqty;
  public String matchedqty;
  public String qtytoorder;
  public String mPricelistId;
  public String needbydate;
  public String pricelist;
  public String price;
  public String mProductId;
  public String mAttributesetinstanceId;
  public String vendorId;
  public String vendor;
  public String product;
  public String attribute;
  public String requester;
  public String pricelistid;
  public String vendorpricelist;
  public String lockedby;
  public String lockqty;
  public String lockprice;
  public String adOrgId;
  public String org;
  public String invoicerule;
  public String deliveryrule;
  public String freightcostrule;
  public String deliveryviarule;
  public String paymentrulepo;
  public String poPaymenttermId;
  public String description;
  public String cUomId;
  public String quantityorder;
  public String mProductUomId;
  public String pricelimit;
  public String priceactual;
  public String discount;
  public String tax;
  public String cOrderlineId;
  public String padre;
  public String id;
  public String name;
  public String pricestd;
  public String toClose;
  public String uomname;
  public String secuomname;
  public String poPaymentmethodId;
  public String grossUnit;
  public String grossAmt;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("M_REQUISITIONLINE_ID") || fieldName.equals("mRequisitionlineId"))
      return mRequisitionlineId;
    else if (fieldName.equalsIgnoreCase("REQQTY"))
      return reqqty;
    else if (fieldName.equalsIgnoreCase("MATCHEDQTY"))
      return matchedqty;
    else if (fieldName.equalsIgnoreCase("QTYTOORDER"))
      return qtytoorder;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("NEEDBYDATE"))
      return needbydate;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("PRICE"))
      return price;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("VENDOR_ID") || fieldName.equals("vendorId"))
      return vendorId;
    else if (fieldName.equalsIgnoreCase("VENDOR"))
      return vendor;
    else if (fieldName.equalsIgnoreCase("PRODUCT"))
      return product;
    else if (fieldName.equalsIgnoreCase("ATTRIBUTE"))
      return attribute;
    else if (fieldName.equalsIgnoreCase("REQUESTER"))
      return requester;
    else if (fieldName.equalsIgnoreCase("PRICELISTID"))
      return pricelistid;
    else if (fieldName.equalsIgnoreCase("VENDORPRICELIST"))
      return vendorpricelist;
    else if (fieldName.equalsIgnoreCase("LOCKEDBY"))
      return lockedby;
    else if (fieldName.equalsIgnoreCase("LOCKQTY"))
      return lockqty;
    else if (fieldName.equalsIgnoreCase("LOCKPRICE"))
      return lockprice;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ORG"))
      return org;
    else if (fieldName.equalsIgnoreCase("INVOICERULE"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("DELIVERYRULE"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("FREIGHTCOSTRULE"))
      return freightcostrule;
    else if (fieldName.equalsIgnoreCase("DELIVERYVIARULE"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULEPO"))
      return paymentrulepo;
    else if (fieldName.equalsIgnoreCase("PO_PAYMENTTERM_ID") || fieldName.equals("poPaymenttermId"))
      return poPaymenttermId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("QUANTITYORDER"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_UOM_ID") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("PRICELIMIT"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("PRICEACTUAL"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("DISCOUNT"))
      return discount;
    else if (fieldName.equalsIgnoreCase("TAX"))
      return tax;
    else if (fieldName.equalsIgnoreCase("C_ORDERLINE_ID") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("PADRE"))
      return padre;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("PRICESTD"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("TO_CLOSE") || fieldName.equals("toClose"))
      return toClose;
    else if (fieldName.equalsIgnoreCase("UOMNAME"))
      return uomname;
    else if (fieldName.equalsIgnoreCase("SECUOMNAME"))
      return secuomname;
    else if (fieldName.equalsIgnoreCase("PO_PAYMENTMETHOD_ID") || fieldName.equals("poPaymentmethodId"))
      return poPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("GROSS_UNIT") || fieldName.equals("grossUnit"))
      return grossUnit;
    else if (fieldName.equalsIgnoreCase("GROSS_AMT") || fieldName.equals("grossAmt"))
      return grossAmt;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RequisitionToOrderData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static RequisitionToOrderData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT '' AS M_REQUISITIONLINE_ID, '' AS REQQTY, '' AS MATCHEDQTY, '' AS QTYTOORDER, " +
      "          '' AS M_PRICELIST_ID, '' AS NEEDBYDATE, '' AS PRICELIST, '' AS PRICE," +
      "          '' AS M_PRODUCT_ID, '' AS M_ATTRIBUTESETINSTANCE_ID, '' AS VENDOR_ID, '' AS VENDOR, " +
      "          '' AS PRODUCT, '' AS ATTRIBUTE, ''  AS REQUESTER, '' AS PRICELISTID, '' AS VENDORPRICELIST," +
      "          '' AS LOCKEDBY, '' AS LOCKQTY, '' AS LOCKPRICE, '' AS AD_ORG_ID, '' AS ORG, " +
      "          '' AS InvoiceRule, '' AS DeliveryRule, '' AS FreightCostRule, '' AS DeliveryViaRule," +
      "          '' AS PaymentRulePO, '' AS PO_PaymentTerm_ID, '' AS DESCRIPTION, '' AS C_UOM_ID, '' AS QUANTITYORDER, '' AS M_PRODUCT_UOM_ID," +
      "          '' AS PRICELIMIT, '' AS PRICEACTUAL, '' AS DISCOUNT, '' AS TAX, '' AS C_ORDERLINE_ID," +
      "          '' AS PADRE, '' AS ID, '' AS NAME, '' AS PRICESTD, '' AS TO_CLOSE, '' AS UOMNAME, '' AS SECUOMNAME, '' AS PO_PAYMENTMETHOD_ID," +
      "          '' as GROSS_UNIT, '' AS GROSS_AMT" +
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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.mRequisitionlineId = UtilSql.getValue(result, "M_REQUISITIONLINE_ID");
        objectRequisitionToOrderData.reqqty = UtilSql.getValue(result, "REQQTY");
        objectRequisitionToOrderData.matchedqty = UtilSql.getValue(result, "MATCHEDQTY");
        objectRequisitionToOrderData.qtytoorder = UtilSql.getValue(result, "QTYTOORDER");
        objectRequisitionToOrderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectRequisitionToOrderData.needbydate = UtilSql.getValue(result, "NEEDBYDATE");
        objectRequisitionToOrderData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectRequisitionToOrderData.price = UtilSql.getValue(result, "PRICE");
        objectRequisitionToOrderData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectRequisitionToOrderData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectRequisitionToOrderData.vendorId = UtilSql.getValue(result, "VENDOR_ID");
        objectRequisitionToOrderData.vendor = UtilSql.getValue(result, "VENDOR");
        objectRequisitionToOrderData.product = UtilSql.getValue(result, "PRODUCT");
        objectRequisitionToOrderData.attribute = UtilSql.getValue(result, "ATTRIBUTE");
        objectRequisitionToOrderData.requester = UtilSql.getValue(result, "REQUESTER");
        objectRequisitionToOrderData.pricelistid = UtilSql.getValue(result, "PRICELISTID");
        objectRequisitionToOrderData.vendorpricelist = UtilSql.getValue(result, "VENDORPRICELIST");
        objectRequisitionToOrderData.lockedby = UtilSql.getValue(result, "LOCKEDBY");
        objectRequisitionToOrderData.lockqty = UtilSql.getValue(result, "LOCKQTY");
        objectRequisitionToOrderData.lockprice = UtilSql.getValue(result, "LOCKPRICE");
        objectRequisitionToOrderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectRequisitionToOrderData.org = UtilSql.getValue(result, "ORG");
        objectRequisitionToOrderData.invoicerule = UtilSql.getValue(result, "INVOICERULE");
        objectRequisitionToOrderData.deliveryrule = UtilSql.getValue(result, "DELIVERYRULE");
        objectRequisitionToOrderData.freightcostrule = UtilSql.getValue(result, "FREIGHTCOSTRULE");
        objectRequisitionToOrderData.deliveryviarule = UtilSql.getValue(result, "DELIVERYVIARULE");
        objectRequisitionToOrderData.paymentrulepo = UtilSql.getValue(result, "PAYMENTRULEPO");
        objectRequisitionToOrderData.poPaymenttermId = UtilSql.getValue(result, "PO_PAYMENTTERM_ID");
        objectRequisitionToOrderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectRequisitionToOrderData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectRequisitionToOrderData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectRequisitionToOrderData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectRequisitionToOrderData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectRequisitionToOrderData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectRequisitionToOrderData.discount = UtilSql.getValue(result, "DISCOUNT");
        objectRequisitionToOrderData.tax = UtilSql.getValue(result, "TAX");
        objectRequisitionToOrderData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectRequisitionToOrderData.padre = UtilSql.getValue(result, "PADRE");
        objectRequisitionToOrderData.id = UtilSql.getValue(result, "ID");
        objectRequisitionToOrderData.name = UtilSql.getValue(result, "NAME");
        objectRequisitionToOrderData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectRequisitionToOrderData.toClose = UtilSql.getValue(result, "TO_CLOSE");
        objectRequisitionToOrderData.uomname = UtilSql.getValue(result, "UOMNAME");
        objectRequisitionToOrderData.secuomname = UtilSql.getValue(result, "SECUOMNAME");
        objectRequisitionToOrderData.poPaymentmethodId = UtilSql.getValue(result, "PO_PAYMENTMETHOD_ID");
        objectRequisitionToOrderData.grossUnit = UtilSql.getValue(result, "GROSS_UNIT");
        objectRequisitionToOrderData.grossAmt = UtilSql.getValue(result, "GROSS_AMT");
        objectRequisitionToOrderData.rownum = Long.toString(countRecord);
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData[] set()    throws ServletException {
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[1];
    objectRequisitionToOrderData[0] = new RequisitionToOrderData();
    objectRequisitionToOrderData[0].mRequisitionlineId = "";
    objectRequisitionToOrderData[0].reqqty = "";
    objectRequisitionToOrderData[0].matchedqty = "";
    objectRequisitionToOrderData[0].qtytoorder = "";
    objectRequisitionToOrderData[0].mPricelistId = "";
    objectRequisitionToOrderData[0].needbydate = "";
    objectRequisitionToOrderData[0].pricelist = "";
    objectRequisitionToOrderData[0].price = "";
    objectRequisitionToOrderData[0].mProductId = "";
    objectRequisitionToOrderData[0].mAttributesetinstanceId = "";
    objectRequisitionToOrderData[0].vendorId = "";
    objectRequisitionToOrderData[0].vendor = "";
    objectRequisitionToOrderData[0].product = "";
    objectRequisitionToOrderData[0].attribute = "";
    objectRequisitionToOrderData[0].requester = "";
    objectRequisitionToOrderData[0].pricelistid = "";
    objectRequisitionToOrderData[0].vendorpricelist = "";
    objectRequisitionToOrderData[0].lockedby = "";
    objectRequisitionToOrderData[0].lockqty = "";
    objectRequisitionToOrderData[0].lockprice = "";
    objectRequisitionToOrderData[0].adOrgId = "";
    objectRequisitionToOrderData[0].org = "";
    objectRequisitionToOrderData[0].invoicerule = "";
    objectRequisitionToOrderData[0].deliveryrule = "";
    objectRequisitionToOrderData[0].freightcostrule = "";
    objectRequisitionToOrderData[0].deliveryviarule = "";
    objectRequisitionToOrderData[0].paymentrulepo = "";
    objectRequisitionToOrderData[0].poPaymenttermId = "";
    objectRequisitionToOrderData[0].description = "";
    objectRequisitionToOrderData[0].cUomId = "";
    objectRequisitionToOrderData[0].quantityorder = "";
    objectRequisitionToOrderData[0].mProductUomId = "";
    objectRequisitionToOrderData[0].pricelimit = "";
    objectRequisitionToOrderData[0].priceactual = "";
    objectRequisitionToOrderData[0].discount = "";
    objectRequisitionToOrderData[0].tax = "";
    objectRequisitionToOrderData[0].cOrderlineId = "";
    objectRequisitionToOrderData[0].padre = "";
    objectRequisitionToOrderData[0].id = "";
    objectRequisitionToOrderData[0].name = "";
    objectRequisitionToOrderData[0].pricestd = "";
    objectRequisitionToOrderData[0].toClose = "";
    objectRequisitionToOrderData[0].uomname = "";
    objectRequisitionToOrderData[0].secuomname = "";
    objectRequisitionToOrderData[0].poPaymentmethodId = "";
    objectRequisitionToOrderData[0].grossUnit = "";
    objectRequisitionToOrderData[0].grossAmt = "";
    return objectRequisitionToOrderData;
  }

  public static RequisitionToOrderData[] selectLines(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgId, String parDateFrom, String parDateTo, String parProduct, String parRequester, String parVendorInc, String parVendor)    throws ServletException {
    return selectLines(connectionProvider, language, adUserClient, adOrgId, parDateFrom, parDateTo, parProduct, parRequester, parVendorInc, parVendor, 0, 0);
  }

  public static RequisitionToOrderData[] selectLines(ConnectionProvider connectionProvider, String language, String adUserClient, String adOrgId, String parDateFrom, String parDateTo, String parProduct, String parRequester, String parVendorInc, String parVendor, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_REQUISITIONLINE_ID, M_REQUISITIONLINE.NEEDBYDATE," +
      "          M_REQUISITIONLINE.QTY - M_REQUISITIONLINE.ORDEREDQTY AS QTYTOORDER," +
      "          QUANTITYORDER, C_UOM1.NAME AS SECUOMNAME, C_UOM.NAME AS UOMNAME," +
      "          CASE WHEN pl.istaxincluded = 'Y' THEN M_REQUISITIONLINE.GROSS_UNIT_PRICE ELSE M_REQUISITIONLINE.PRICEACTUAL END AS PRICE," +
      "          AD_COLUMN_IDENTIFIER(to_char('C_BPartner'), to_char(COALESCE(M_REQUISITIONLINE.C_BPARTNER_ID, M_REQUISITION.C_BPARTNER_ID)), ?) AS VENDOR," +
      "          AD_COLUMN_IDENTIFIER(to_char('M_PriceList'), to_char(COALESCE(M_REQUISITIONLINE.M_PRICELIST_ID, M_REQUISITION.M_PRICELIST_ID)), ?) AS PRICELISTID," +
      "          AD_COLUMN_IDENTIFIER(to_char('M_Product'), to_char(M_REQUISITIONLINE.M_PRODUCT_ID), ?) AS PRODUCT," +
      "          AD_COLUMN_IDENTIFIER(to_char('M_AttributeSetInstance'), to_char(M_REQUISITIONLINE.M_ATTRIBUTESETINSTANCE_ID), ?) AS ATTRIBUTE," +
      "          AD_COLUMN_IDENTIFIER(to_char('AD_User'), to_char(M_REQUISITION.AD_USER_ID), ?) AS REQUESTER" +
      "        FROM M_REQUISITION inner join M_REQUISITIONLINE on M_REQUISITION.M_REQUISITION_ID = M_REQUISITIONLINE.M_REQUISITION_ID " +
      "                               LEFT JOIN C_UOM ON C_UOM.C_UOM_ID = M_REQUISITIONLINE.C_UOM_ID" +
      "                               LEFT JOIN M_PRODUCT_UOM ON M_PRODUCT_UOM.M_PRODUCT_UOM_ID = M_REQUISITIONLINE.M_PRODUCT_UOM_ID" +
      "                               LEFT JOIN C_UOM C_UOM1 ON M_PRODUCT_UOM.C_UOM_ID = C_UOM1.C_UOM_ID" +
      "                               LEFT JOIN m_pricelist pl on COALESCE(M_REQUISITIONLINE.M_PRICELIST_ID, M_REQUISITION.M_PRICELIST_ID) = pl.m_pricelist_id" +
      "        WHERE M_REQUISITION.ISACTIVE = 'Y'" +
      "          AND M_REQUISITIONLINE.ISACTIVE = 'Y'" +
      "          AND M_REQUISITION.DOCSTATUS = 'CO'" +
      "          AND M_REQUISITIONLINE.REQSTATUS = 'O'" +
      "          AND (M_REQUISITIONLINE.LOCKEDBY IS NULL OR COALESCE (M_REQUISITIONLINE.LOCKDATE, TO_DATE('01-01-1900', 'DD-MM-YYYY')) < (now()-3))" +
      "          AND M_REQUISITION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "          AND M_REQUISITIONLINE.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")" +
      "          AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND M_REQUISITIONLINE.NEEDBYDATE >= TO_DATE(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND M_REQUISITIONLINE.NEEDBYDATE < TO_DATE(?) ");
    strSql = strSql + ((parProduct==null || parProduct.equals(""))?"":"  AND M_REQUISITIONLINE.M_PRODUCT_ID = TO_CHAR(?) ");
    strSql = strSql + ((parRequester==null || parRequester.equals(""))?"":"  AND M_REQUISITION.AD_USER_ID = TO_CHAR(?) ");
    strSql = strSql + ((parVendorInc==null || parVendorInc.equals(""))?"":"  AND (COALESCE(M_REQUISITIONLINE.C_BPARTNER_ID, M_REQUISITION.C_BPARTNER_ID,'-1') = TO_CHAR(?) OR (M_REQUISITIONLINE.C_BPARTNER_ID IS NULL AND M_REQUISITION.C_BPARTNER_ID IS NULL)) ");
    strSql = strSql + ((parVendor==null || parVendor.equals(""))?"":"  AND COALESCE(M_REQUISITIONLINE.C_BPARTNER_ID, M_REQUISITION.C_BPARTNER_ID,'-1') = TO_CHAR(?) ");
    strSql = strSql + 
      "        GROUP BY M_REQUISITIONLINE.M_REQUISITIONLINE_ID, M_REQUISITIONLINE.NEEDBYDATE, M_REQUISITIONLINE.QTY, M_REQUISITIONLINE.ORDEREDQTY," +
      "        QUANTITYORDER, C_UOM1.NAME, C_UOM.NAME, pl.istaxincluded, M_REQUISITIONLINE.GROSS_UNIT_PRICE, M_REQUISITIONLINE.PRICEACTUAL," +
      "        M_REQUISITIONLINE.C_BPARTNER_ID, M_REQUISITION.C_BPARTNER_ID, M_REQUISITIONLINE.M_PRICELIST_ID, M_REQUISITION.M_PRICELIST_ID," +
      "        M_REQUISITIONLINE.M_PRODUCT_ID, M_REQUISITIONLINE.M_ATTRIBUTESETINSTANCE_ID, M_REQUISITION.AD_USER_ID" +
      "        ORDER BY MIN(M_REQUISITIONLINE.LINE), M_REQUISITIONLINE.NEEDBYDATE, M_REQUISITIONLINE.M_PRODUCT_ID, M_REQUISITIONLINE.M_ATTRIBUTESETINSTANCE_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgId != null && !(adOrgId.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (parProduct != null && !(parProduct.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parProduct);
      }
      if (parRequester != null && !(parRequester.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parRequester);
      }
      if (parVendorInc != null && !(parVendorInc.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parVendorInc);
      }
      if (parVendor != null && !(parVendor.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parVendor);
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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.mRequisitionlineId = UtilSql.getValue(result, "M_REQUISITIONLINE_ID");
        objectRequisitionToOrderData.needbydate = UtilSql.getDateValue(result, "NEEDBYDATE", "dd-MM-yyyy");
        objectRequisitionToOrderData.qtytoorder = UtilSql.getValue(result, "QTYTOORDER");
        objectRequisitionToOrderData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectRequisitionToOrderData.secuomname = UtilSql.getValue(result, "SECUOMNAME");
        objectRequisitionToOrderData.uomname = UtilSql.getValue(result, "UOMNAME");
        objectRequisitionToOrderData.price = UtilSql.getValue(result, "PRICE");
        objectRequisitionToOrderData.vendor = UtilSql.getValue(result, "VENDOR");
        objectRequisitionToOrderData.pricelistid = UtilSql.getValue(result, "PRICELISTID");
        objectRequisitionToOrderData.product = UtilSql.getValue(result, "PRODUCT");
        objectRequisitionToOrderData.attribute = UtilSql.getValue(result, "ATTRIBUTE");
        objectRequisitionToOrderData.requester = UtilSql.getValue(result, "REQUESTER");
        objectRequisitionToOrderData.rownum = Long.toString(countRecord);
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData[] selectSelected(ConnectionProvider connectionProvider, String language, String adUserId, String adUserClient, String adOrgId)    throws ServletException {
    return selectSelected(connectionProvider, language, adUserId, adUserClient, adOrgId, 0, 0);
  }

  public static RequisitionToOrderData[] selectSelected(ConnectionProvider connectionProvider, String language, String adUserId, String adUserClient, String adOrgId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_REQUISITIONLINE.M_REQUISITIONLINE_ID, M_REQUISITIONLINE.NEEDBYDATE, M_REQUISITIONLINE.QTY AS REQQTY," +
      "          M_REQUISITIONLINE.ORDEREDQTY AS MATCHEDQTY, M_REQUISITIONLINE.PRICELIST," +
      "          COALESCE(LOCKQTY, QTY-ORDEREDQTY) AS LOCKQTY," +
      "          QUANTITYORDER, C_UOM1.NAME AS SECUOMNAME, C_UOM.NAME AS UOMNAME," +
      "          COALESCE(LOCKPRICE, CASE WHEN pl.istaxincluded = 'Y' THEN M_REQUISITIONLINE.GROSS_UNIT_PRICE ELSE M_REQUISITIONLINE.PRICEACTUAL END) AS LOCKPRICE," +
      "          COALESCE(M_REQUISITIONLINE.C_BPARTNER_ID, M_REQUISITION.C_BPARTNER_ID, '-1') AS VENDOR_ID," +
      "          COALESCE(M_REQUISITIONLINE.M_PRICELIST_ID, M_REQUISITION.M_PRICELIST_ID, '-1') AS M_PRICELIST_ID," +
      "          AD_COLUMN_IDENTIFIER(to_char('C_BPartner'), to_char(COALESCE(M_REQUISITIONLINE.C_BPARTNER_ID, M_REQUISITION.C_BPARTNER_ID)), ?) AS VENDOR," +
      "          AD_COLUMN_IDENTIFIER(to_char('M_Product'), to_char(M_REQUISITIONLINE.M_PRODUCT_ID), ?) AS PRODUCT," +
      "          AD_COLUMN_IDENTIFIER(to_char('M_AttributeSetInstance'), to_char(M_REQUISITIONLINE.M_ATTRIBUTESETINSTANCE_ID), ?) AS ATTRIBUTE," +
      "          AD_COLUMN_IDENTIFIER(to_char('M_PriceList'), to_char(COALESCE(M_REQUISITIONLINE.M_PRICELIST_ID, M_REQUISITION.M_PRICELIST_ID)), ?) AS PRICELISTID" +
      "        FROM M_REQUISITION inner join M_REQUISITIONLINE on M_REQUISITION.M_REQUISITION_ID = M_REQUISITIONLINE.M_REQUISITION_ID " +
      "                                              LEFT JOIN C_UOM ON C_UOM.C_UOM_ID = M_REQUISITIONLINE.C_UOM_ID" +
      "                                              LEFT JOIN M_PRODUCT_UOM ON M_PRODUCT_UOM.M_PRODUCT_UOM_ID = M_REQUISITIONLINE.M_PRODUCT_UOM_ID" +
      "                                              LEFT JOIN C_UOM C_UOM1 ON M_PRODUCT_UOM.C_UOM_ID = C_UOM1.C_UOM_ID" +
      "                                              LEFT JOIN m_pricelist pl ON COALESCE(M_REQUISITIONLINE.M_PRICELIST_ID,M_REQUISITION.M_PRICELIST_ID, '-1') = pl.m_pricelist_id" +
      "        WHERE M_REQUISITION.ISACTIVE = 'Y'" +
      "          AND M_REQUISITIONLINE.ISACTIVE = 'Y'" +
      "          AND M_REQUISITION.DOCSTATUS = 'CO'" +
      "          AND M_REQUISITIONLINE.REQSTATUS = 'O'" +
      "          AND M_REQUISITIONLINE.LOCKEDBY = ?" +
      "          AND M_REQUISITIONLINE.LOCKDATE >= (now()-3)" +
      "          AND M_REQUISITION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "          AND M_REQUISITIONLINE.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")" +
      "        GROUP BY M_REQUISITIONLINE.M_REQUISITIONLINE_ID, M_REQUISITIONLINE.NEEDBYDATE, M_REQUISITIONLINE.QTY," +
      "        M_REQUISITIONLINE.ORDEREDQTY, M_REQUISITIONLINE.PRICELIST, C_UOM1.NAME, C_UOM.NAME, PL.ISTAXINCLUDED, " +
      "        M_REQUISITION.C_BPARTNER_ID, M_REQUISITION.M_PRICELIST_ID, LOCKQTY, QUANTITYORDER, LOCKPRICE, " +
      "        M_REQUISITIONLINE.GROSS_UNIT_PRICE, M_REQUISITIONLINE.PRICEACTUAL, M_REQUISITIONLINE.C_BPARTNER_ID, " +
      "        M_REQUISITIONLINE.M_PRICELIST_ID, M_REQUISITIONLINE.M_PRODUCT_ID, M_REQUISITIONLINE.M_ATTRIBUTESETINSTANCE_ID" +
      "        ORDER BY MIN(M_REQUISITIONLINE.LINE), VENDOR_ID, M_PRICELIST_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgId != null && !(adOrgId.equals(""))) {
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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.mRequisitionlineId = UtilSql.getValue(result, "M_REQUISITIONLINE_ID");
        objectRequisitionToOrderData.needbydate = UtilSql.getDateValue(result, "NEEDBYDATE", "dd-MM-yyyy");
        objectRequisitionToOrderData.reqqty = UtilSql.getValue(result, "REQQTY");
        objectRequisitionToOrderData.matchedqty = UtilSql.getValue(result, "MATCHEDQTY");
        objectRequisitionToOrderData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectRequisitionToOrderData.lockqty = UtilSql.getValue(result, "LOCKQTY");
        objectRequisitionToOrderData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectRequisitionToOrderData.secuomname = UtilSql.getValue(result, "SECUOMNAME");
        objectRequisitionToOrderData.uomname = UtilSql.getValue(result, "UOMNAME");
        objectRequisitionToOrderData.lockprice = UtilSql.getValue(result, "LOCKPRICE");
        objectRequisitionToOrderData.vendorId = UtilSql.getValue(result, "VENDOR_ID");
        objectRequisitionToOrderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectRequisitionToOrderData.vendor = UtilSql.getValue(result, "VENDOR");
        objectRequisitionToOrderData.product = UtilSql.getValue(result, "PRODUCT");
        objectRequisitionToOrderData.attribute = UtilSql.getValue(result, "ATTRIBUTE");
        objectRequisitionToOrderData.pricelistid = UtilSql.getValue(result, "PRICELISTID");
        objectRequisitionToOrderData.rownum = Long.toString(countRecord);
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData[] linesToOrder(ConnectionProvider connectionProvider, String orderdate, String org, String warehouse, String billto, String shipto, String currency, String pricelistversion, String parRequisitionLines)    throws ServletException {
    return linesToOrder(connectionProvider, orderdate, org, warehouse, billto, shipto, currency, pricelistversion, parRequisitionLines, 0, 0);
  }

  public static RequisitionToOrderData[] linesToOrder(ConnectionProvider connectionProvider, String orderdate, String org, String warehouse, String billto, String shipto, String currency, String pricelistversion, String parRequisitionLines, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_REQUISITIONLINE.M_PRODUCT_ID, M_ATTRIBUTESETINSTANCE_ID, LOCKQTY, M_REQUISITIONLINE.DESCRIPTION, C_UOM_ID, QUANTITYORDER, M_PRODUCT_UOM_ID," +
      "          M_REQUISITIONLINE_ID, '' AS C_ORDERLINE_ID," +
      "          COALESCE(M_PRODUCTPRICE.PRICELIST, M_REQUISITIONLINE.PRICELIST, LOCKPRICE) AS PRICELIST," +
      "          COALESCE(M_PRODUCTPRICE.PRICELIMIT, LOCKPRICE) AS PRICELIMIT," +
      "          COALESCE(M_PRODUCTPRICE.PRICESTD, LOCKPRICE) AS PRICESTD," +
      "          CASE WHEN M_Pricelist.istaxincluded = 'Y' then C_GET_NET_PRICE_FROM_GROSS(C_GetTax(M_REQUISITIONLINE.M_PRODUCT_ID, to_date(?), ?, ?, ?, ?, null, 'N'), " +
      "                                                                                    ROUND(COALESCE(LOCKPRICE, M_PRODUCTPRICE.PRICESTD) * LOCKQTY," +
      "                                                                                         (SELECT PRICEPRECISION FROM C_CURRENCY WHERE C_CURRENCY_ID = ?)) , " +
      "                                                                                    ROUND(COALESCE(LOCKPRICE, M_PRODUCTPRICE.PRICESTD) * LOCKQTY," +
      "                                                                                         (SELECT PRICEPRECISION FROM C_CURRENCY WHERE C_CURRENCY_ID = ?)), " +
      "                                                                                    (SELECT PRICEPRECISION FROM C_CURRENCY WHERE C_CURRENCY_ID = ?), LOCKQTY) " +
      "                                                ELSE ROUND(COALESCE(LOCKPRICE, M_PRODUCTPRICE.PRICESTD),(SELECT PRICEPRECISION FROM C_CURRENCY WHERE C_CURRENCY_ID = ?)) END AS PRICEACTUAL," +
      "          CASE WHEN COALESCE(M_PRODUCTPRICE.PRICELIST, M_REQUISITIONLINE.PRICELIST, LOCKPRICE) = 0 THEN 0 ELSE" +
      "                    ROUND((COALESCE(M_PRODUCTPRICE.PRICELIST, M_REQUISITIONLINE.PRICELIST, LOCKPRICE) - COALESCE(LOCKPRICE, M_PRODUCTPRICE.PRICESTD))/" +
      "                           COALESCE(M_PRODUCTPRICE.PRICELIST, M_REQUISITIONLINE.PRICELIST, LOCKPRICE)*100," +
      "                    (SELECT STDPRECISION FROM C_CURRENCY WHERE C_CURRENCY_ID = ?)) END AS DISCOUNT," +
      "          C_GetTax(M_REQUISITIONLINE.M_PRODUCT_ID, to_date(?), ?, ?, ?, ?, null, 'N') AS TAX," +
      "          CASE WHEN LOCKQTY < (M_REQUISITIONLINE.QTY - M_REQUISITIONLINE.ORDEREDQTY) THEN 'N' ELSE 'Y' END AS TO_CLOSE," +
      "          CASE WHEN M_Pricelist.istaxincluded = 'Y' THEN ROUND(COALESCE(LOCKPRICE, M_PRODUCTPRICE.PRICESTD),(SELECT PRICEPRECISION FROM C_CURRENCY WHERE C_CURRENCY_ID = ?)) ELSE 0 END AS GROSS_UNIT," +
      "          CASE WHEN M_Pricelist.istaxincluded = 'Y' THEN ROUND(COALESCE(LOCKPRICE, M_PRODUCTPRICE.PRICESTD)*LOCKQTY,(SELECT PRICEPRECISION FROM C_CURRENCY WHERE C_CURRENCY_ID = ?)) ELSE 0 END AS GROSS_AMT," +
      "          M_REQUISITIONLINE.needbydate" +
      "          FROM M_REQUISITIONLINE LEFT JOIN M_PRODUCTPRICE" +
      "                                         ON M_REQUISITIONLINE.M_PRODUCT_ID = M_PRODUCTPRICE.M_PRODUCT_ID" +
      "                                            AND M_PRODUCTPRICE.M_PRICELIST_VERSION_ID = ?" +
      "                               LEFT JOIN m_pricelist_version on M_PRODUCTPRICE.M_PRICELIST_VERSION_ID = m_pricelist_version.M_PRICELIST_VERSION_ID" +
      "                               LEFT JOIN m_pricelist on m_pricelist_version.m_pricelist_id = m_pricelist.m_pricelist_id" +
      "        WHERE 1=1";
    strSql = strSql + ((parRequisitionLines==null || parRequisitionLines.equals(""))?"":"  AND M_RequisitionLine_ID IN" + parRequisitionLines);
    strSql = strSql + 
      "	    GROUP BY M_REQUISITIONLINE.M_PRODUCT_ID, M_ATTRIBUTESETINSTANCE_ID, LOCKQTY, M_REQUISITIONLINE.DESCRIPTION, C_UOM_ID, QUANTITYORDER, " +
      "	    M_PRODUCT_UOM_ID, M_REQUISITIONLINE_ID, M_PRODUCTPRICE.PRICELIST, M_REQUISITIONLINE.PRICELIST, LOCKPRICE," +
      "	    M_PRODUCTPRICE.PRICELIMIT, M_PRODUCTPRICE.PRICESTD, M_Pricelist.istaxincluded, M_REQUISITIONLINE.needbydate," +
      "            M_REQUISITIONLINE.QTY, M_REQUISITIONLINE.ORDEREDQTY, SUPPLIERNOTES" +
      "        ORDER BY MIN(M_REQUISITIONLINE.LINE), M_REQUISITIONLINE.M_PRODUCT_ID, M_ATTRIBUTESETINSTANCE_ID, SUPPLIERNOTES, " +
      "                 ROUND(COALESCE(LOCKPRICE, M_PRODUCTPRICE.PRICESTD),(SELECT PRICEPRECISION FROM C_CURRENCY WHERE C_CURRENCY_ID = ?))";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, org);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, warehouse);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shipto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currency);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currency);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currency);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currency);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currency);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, org);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, warehouse);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shipto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currency);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currency);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelistversion);
      if (parRequisitionLines != null && !(parRequisitionLines.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currency);

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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectRequisitionToOrderData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectRequisitionToOrderData.lockqty = UtilSql.getValue(result, "LOCKQTY");
        objectRequisitionToOrderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectRequisitionToOrderData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectRequisitionToOrderData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectRequisitionToOrderData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectRequisitionToOrderData.mRequisitionlineId = UtilSql.getValue(result, "M_REQUISITIONLINE_ID");
        objectRequisitionToOrderData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectRequisitionToOrderData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectRequisitionToOrderData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectRequisitionToOrderData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectRequisitionToOrderData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectRequisitionToOrderData.discount = UtilSql.getValue(result, "DISCOUNT");
        objectRequisitionToOrderData.tax = UtilSql.getValue(result, "TAX");
        objectRequisitionToOrderData.toClose = UtilSql.getValue(result, "TO_CLOSE");
        objectRequisitionToOrderData.grossUnit = UtilSql.getValue(result, "GROSS_UNIT");
        objectRequisitionToOrderData.grossAmt = UtilSql.getValue(result, "GROSS_AMT");
        objectRequisitionToOrderData.needbydate = UtilSql.getDateValue(result, "NEEDBYDATE", "dd-MM-yyyy");
        objectRequisitionToOrderData.rownum = Long.toString(countRecord);
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData[] selectVendor(ConnectionProvider connectionProvider, String parRequisitionLines)    throws ServletException {
    return selectVendor(connectionProvider, parRequisitionLines, 0, 0);
  }

  public static RequisitionToOrderData[] selectVendor(ConnectionProvider connectionProvider, String parRequisitionLines, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT DISTINCT COALESCE(M_REQUISITIONLINE.C_BPARTNER_ID, M_REQUISITION.C_BPARTNER_ID) AS VENDOR_ID" +
      "      FROM M_REQUISITIONLINE, M_REQUISITION" +
      "      WHERE M_REQUISITION.M_REQUISITION_ID = M_REQUISITIONLINE.M_REQUISITION_ID" +
      "        AND COALESCE(M_REQUISITIONLINE.C_BPARTNER_ID, M_REQUISITION.C_BPARTNER_ID) IS NOT NULL" +
      "        AND 1=1";
    strSql = strSql + ((parRequisitionLines==null || parRequisitionLines.equals(""))?"":" AND M_RequisitionLine_ID IN" + parRequisitionLines);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (parRequisitionLines != null && !(parRequisitionLines.equals(""))) {
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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.vendorId = UtilSql.getValue(result, "VENDOR_ID");
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData[] selectPriceList(ConnectionProvider connectionProvider, String language, String parRequisitionLines)    throws ServletException {
    return selectPriceList(connectionProvider, language, parRequisitionLines, 0, 0);
  }

  public static RequisitionToOrderData[] selectPriceList(ConnectionProvider connectionProvider, String language, String parRequisitionLines, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DISTINCT COALESCE(M_REQUISITIONLINE.M_PRICELIST_ID, M_REQUISITION.M_PRICELIST_ID) AS M_PRICELIST_ID," +
      "          AD_COLUMN_IDENTIFIER(to_char('M_PriceList'), to_char(COALESCE(M_REQUISITIONLINE.M_PRICELIST_ID, M_REQUISITION.M_PRICELIST_ID)), ?) AS PRICELISTID" +
      "        FROM M_REQUISITIONLINE, M_REQUISITION" +
      "        WHERE M_REQUISITION.M_REQUISITION_ID = M_REQUISITIONLINE.M_REQUISITION_ID" +
      "          AND 1=1";
    strSql = strSql + ((parRequisitionLines==null || parRequisitionLines.equals(""))?"":" AND M_RequisitionLine_ID IN" + parRequisitionLines);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (parRequisitionLines != null && !(parRequisitionLines.equals(""))) {
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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectRequisitionToOrderData.pricelistid = UtilSql.getValue(result, "PRICELISTID");
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData[] selectOrg(ConnectionProvider connectionProvider, String language, String parRequisitionLines)    throws ServletException {
    return selectOrg(connectionProvider, language, parRequisitionLines, 0, 0);
  }

  public static RequisitionToOrderData[] selectOrg(ConnectionProvider connectionProvider, String language, String parRequisitionLines, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DISTINCT AD_ORG_ID," +
      "          AD_COLUMN_IDENTIFIER(to_char('AD_Org'), to_char(AD_ORG_ID), ?) AS ORG" +
      "        FROM M_REQUISITIONLINE" +
      "        WHERE 1=1";
    strSql = strSql + ((parRequisitionLines==null || parRequisitionLines.equals(""))?"":" AND M_RequisitionLine_ID IN" + parRequisitionLines);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (parRequisitionLines != null && !(parRequisitionLines.equals(""))) {
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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectRequisitionToOrderData.org = UtilSql.getValue(result, "ORG");
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData[] selectNoPrice(ConnectionProvider connectionProvider, String language, String pricelistversion, String parRequisitionLines)    throws ServletException {
    return selectNoPrice(connectionProvider, language, pricelistversion, parRequisitionLines, 0, 0);
  }

  public static RequisitionToOrderData[] selectNoPrice(ConnectionProvider connectionProvider, String language, String pricelistversion, String parRequisitionLines, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DISTINCT M_PRODUCT_ID," +
      "          AD_COLUMN_IDENTIFIER(to_char('M_Product'), to_char(M_REQUISITIONLINE.M_PRODUCT_ID), ?) AS PRODUCT" +
      "        FROM M_REQUISITIONLINE" +
      "        WHERE NOT EXISTS ( SELECT 1 FROM M_PRODUCTPRICE" +
      "                           WHERE M_REQUISITIONLINE.M_PRODUCT_ID = M_PRODUCTPRICE.M_PRODUCT_ID" +
      "                           AND M_PRODUCTPRICE.M_PRICELIST_VERSION_ID = ? )" +
      "          AND LOCKPRICE IS NULL" +
      "          AND 1=1";
    strSql = strSql + ((parRequisitionLines==null || parRequisitionLines.equals(""))?"":"  AND M_RequisitionLine_ID IN" + parRequisitionLines);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelistversion);
      if (parRequisitionLines != null && !(parRequisitionLines.equals(""))) {
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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectRequisitionToOrderData.product = UtilSql.getValue(result, "PRODUCT");
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData[] selectWarehouseDouble(ConnectionProvider connectionProvider, String clientid, String adOrgId, String adclient)    throws ServletException {
    return selectWarehouseDouble(connectionProvider, clientid, adOrgId, adclient, 0, 0);
  }

  public static RequisitionToOrderData[] selectWarehouseDouble(ConnectionProvider connectionProvider, String clientid, String adOrgId, String adclient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG.AD_ORG_ID AS PADRE, M_WAREHOUSE.M_WAREHOUSE_ID AS ID, M_WAREHOUSE.NAME AS NAME" +
      "        FROM M_WAREHOUSE, AD_ORG" +
      "        WHERE (AD_ISORGINCLUDED(M_WAREHOUSE.AD_ORG_ID, AD_ORG.AD_ORG_ID, ?) <> -1" +
      "          OR AD_ISORGINCLUDED(AD_ORG.AD_ORG_ID, M_WAREHOUSE.AD_ORG_ID, ?) <> -1)" +
      "          AND AD_ORG.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")" +
      "          AND M_WAREHOUSE.AD_CLIENT_ID IN (";
    strSql = strSql + ((adclient==null || adclient.equals(""))?"":adclient);
    strSql = strSql + 
      ")" +
      "        ORDER BY PADRE, NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, clientid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, clientid);
      if (adOrgId != null && !(adOrgId.equals(""))) {
        }
      if (adclient != null && !(adclient.equals(""))) {
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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.padre = UtilSql.getValue(result, "PADRE");
        objectRequisitionToOrderData.id = UtilSql.getValue(result, "ID");
        objectRequisitionToOrderData.name = UtilSql.getValue(result, "NAME");
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData[] selectVendorData(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    return selectVendorData(connectionProvider, cBpartnerId, 0, 0);
  }

  public static RequisitionToOrderData[] selectVendorData(ConnectionProvider connectionProvider, String cBpartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT p.InvoiceRule, p.DeliveryRule, DeliveryViaRule," +
      "        p.PaymentRulePO, p.PO_PaymentTerm_ID, p.PO_PaymentMethod_ID" +
      "      FROM C_BPartner p" +
      "      WHERE p.C_BPartner_ID = ?";

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
        RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
        objectRequisitionToOrderData.invoicerule = UtilSql.getValue(result, "INVOICERULE");
        objectRequisitionToOrderData.deliveryrule = UtilSql.getValue(result, "DELIVERYRULE");
        objectRequisitionToOrderData.deliveryviarule = UtilSql.getValue(result, "DELIVERYVIARULE");
        objectRequisitionToOrderData.paymentrulepo = UtilSql.getValue(result, "PAYMENTRULEPO");
        objectRequisitionToOrderData.poPaymenttermId = UtilSql.getValue(result, "PO_PAYMENTTERM_ID");
        objectRequisitionToOrderData.poPaymentmethodId = UtilSql.getValue(result, "PO_PAYMENTMETHOD_ID");
        objectRequisitionToOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRequisitionToOrderData);
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
    RequisitionToOrderData objectRequisitionToOrderData[] = new RequisitionToOrderData[vector.size()];
    vector.copyInto(objectRequisitionToOrderData);
    return(objectRequisitionToOrderData);
  }

  public static String bPartnerDescription(ConnectionProvider connectionProvider, String partnerid, String language)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_COLUMN_IDENTIFIER(to_char('C_BPartner'), to_char(?), to_char(?)) AS VENDOR" +
      "        FROM DUAL";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, partnerid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "VENDOR");
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

  public static String mProductDescription(ConnectionProvider connectionProvider, String productid, String language)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_COLUMN_IDENTIFIER(to_char('M_Product'), to_char(?), to_char(?)) AS PRODUCT" +
      "        FROM DUAL";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "PRODUCT");
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

  public static String getPricelistVersion(ConnectionProvider connectionProvider, String pricelist, String orderdate)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_GET_PRICELIST_VERSION(?, to_date(?)) AS PRICELISTID" +
      "        FROM DUAL";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderdate);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "PRICELISTID");
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

  public static String treeOrg(ConnectionProvider connectionProvider, String client)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_TREE_ORG_ID FROM AD_CLIENTINFO" +
      "        WHERE AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_TREE_ORG_ID");
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

  public static String cDoctypeTarget(Connection conn, ConnectionProvider connectionProvider, String adClientId, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_GET_DOCTYPE(?, ?, 'POO', null) FROM DUAL";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_GET_DOCTYPE(:1,:2,'POO',NULL)");
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
    return(strReturn);
  }

  public static String cBPartnerLocationId(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(C_BPARTNER_LOCATION_ID) FROM C_BPARTNER_LOCATION" +
      "        WHERE C_BPARTNER_ID = ?" +
      "        AND C_BPartner_Location.IsActive='Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "MAX(C_BPARTNER_LOCATION_ID)");
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

  public static String billto(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(C_BPARTNER_LOCATION_ID) FROM C_BPARTNER_LOCATION" +
      "        WHERE  C_BPartner_Location.IsBillTo='Y'" +
      "        AND C_BPartner_Location.IsActive='Y'" +
      "        AND C_BPARTNER_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "MAX(C_BPARTNER_LOCATION_ID)");
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

  public static String selectCurrency(ConnectionProvider connectionProvider, String mPricelistId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_CURRENCY_ID" +
      "        FROM M_PRICELIST" +
      "        WHERE  M_PRICELIST_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);

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

  public static int unlock(ConnectionProvider connectionProvider, String requisitionlines)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_REQUISITIONLINE" +
      "        SET LOCKEDBY = null," +
      "            LOCKPRICE = null," +
      "            LOCKQTY = null," +
      "            LOCKDATE = null," +
      "            LOCKCAUSE = null" +
      "        WHERE M_REQUISITIONLINE_ID IN ";
    strSql = strSql + ((requisitionlines==null || requisitionlines.equals(""))?"":requisitionlines);

    int updateCount = 0;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (requisitionlines != null && !(requisitionlines.equals(""))) {
        }

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int lock(ConnectionProvider connectionProvider, String userId, String requisitionlines)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_REQUISITIONLINE" +
      "        SET LOCKEDBY = ?," +
      "            LOCKDATE = now()," +
      "            LOCKQTY = null," +
      "            LOCKPRICE = null," +
      "            LOCKCAUSE = 'M'" +
      "        WHERE M_REQUISITIONLINE_ID IN ";
    strSql = strSql + ((requisitionlines==null || requisitionlines.equals(""))?"":requisitionlines);

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, userId);
      if (requisitionlines != null && !(requisitionlines.equals(""))) {
        }

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateLock(ConnectionProvider connectionProvider, String lockQty, String lockPrice, String mRequisitionLineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_REQUISITIONLINE" +
      "        SET LOCKQTY = to_number(?)," +
      "            LOCKPRICE = to_number(?)" +
      "        WHERE M_REQUISITIONLINE_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockQty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionLineId);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int insertCOrder(Connection conn, ConnectionProvider connectionProvider, String cOrderId, String adClientId, String adOrgId, String user, String documentNo, String docStatus, String docAction, String cDoctypeId, String cDoctypetargetId, String dateordered, String datepromised, String dateacct, String cBpartnerId, String cBpartnerLocationId, String billtoId, String cCurrencyId, String paymentrule, String cPaymenttermId, String invoicerule, String deliveryrule, String freightcostrule, String deliveryviarule, String mWarehouseId, String mPricelistId, String cProjectId, String cActivityId, String cCampaignId, String finPaymentMethodId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO C_ORDER (C_ORDER_ID, AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY, DOCUMENTNO," +
      "        DOCSTATUS, DOCACTION, C_DOCTYPE_ID, C_DOCTYPETARGET_ID," +
      "        DATEORDERED, DATEPROMISED, DATEACCT, C_BPARTNER_ID, C_BPARTNER_LOCATION_ID, BILLTO_ID, C_CURRENCY_ID, " +
      "        PAYMENTRULE, C_PAYMENTTERM_ID, INVOICERULE, DELIVERYRULE, FREIGHTCOSTRULE, " +
      "        DELIVERYVIARULE, M_WAREHOUSE_ID, M_PRICELIST_ID, " +
      "        C_PROJECT_ID, C_ACTIVITY_ID, C_CAMPAIGN_ID, PRIORITYRULE, ISSOTRX," +
      "        FIN_PAYMENTMETHOD_ID)" +
      "        VALUES (?,?,?,now(),?,now(),?,?,?,?,?,?,TO_DATE(?),TO_DATE(?),TO_DATE(?),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,'5', 'N'," +
      "        ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentNo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docAction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentMethodId);

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

  public static int insertCOrderline(Connection conn, ConnectionProvider connectionProvider, String cOrderlineId, String adClientId, String adOrgId, String user, String cOrderId, String line, String cBpartnerId, String cBpartnerLocationId, String dateordered, String datepromised, String description, String mProductId, String mAttributeSetInstanceId, String mWarehouseId, String mProductUomId, String cUomId, String quantityorder, String qtyordered, String cCurrencyId, String pricelist, String priceactual, String pricelistid, String pricelimit, String cTaxId, String sResourceassignmentId, String discount, String priceGross, String lineGrossAmt)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO C_ORDERLINE (C_ORDERLINE_ID, AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY," +
      "        C_ORDER_ID, LINE, C_BPARTNER_ID, C_BPARTNER_LOCATION_ID, DATEORDERED, DATEPROMISED, " +
      "        DESCRIPTION, M_PRODUCT_ID, M_ATTRIBUTESETINSTANCE_ID," +
      "        M_WAREHOUSE_ID, M_PRODUCT_UOM_ID, C_UOM_ID, QUANTITYORDER, QTYORDERED, C_CURRENCY_ID, " +
      "        PRICELIST, " +
      "        PRICEACTUAL, " +
      "        PRICELIMIT, C_TAX_ID, S_RESOURCEASSIGNMENT_ID, DISCOUNT, " +
      "        PRICESTD, GROSS_UNIT_PRICE, LINE_GROSS_AMOUNT)" +
      "        VALUES (?,?,?,now(),?,now(),?," +
      "        ?,TO_NUMBER(?),?,?,TO_DATE(?),TO_DATE(?)," +
      "        ?,?,?," +
      "        ?, ?, ?,TO_NUMBER(?),TO_NUMBER(?),?," +
      "        TO_NUMBER(?), " +
      "        M_GET_OFFERS_PRICE(to_date(now()),?,?,TO_NUMBER(?),TO_NUMBER(?),?)," +
      "        TO_NUMBER(?), ?, ?,TO_NUMBER(?), " +
      "        TO_NUMBER(?),  TO_NUMBER(?), TO_NUMBER(?))";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributeSetInstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelistid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceassignmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceGross);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineGrossAmt);

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

  public static int insertRequisitionOrder(Connection conn, ConnectionProvider connectionProvider, String mRequisitionOrderId, String adClientId, String adOrgId, String user, String mRequisitionLineId, String cOrderLineId, String qty)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO M_REQUISITIONORDER (M_REQUISITIONORDER_ID, AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY, ISACTIVE," +
      "        M_REQUISITIONLINE_ID, C_ORDERLINE_ID, QTY)" +
      "        VALUES (?,?,?,now(),?,now(),?,'Y'," +
      "        ?,?,TO_NUMBER(?))";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionLineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderLineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);

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

  public static RequisitionToOrderData cOrderPost0(Connection conn, ConnectionProvider connectionProvider, String adPinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL C_Order_Post(?)";

    RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
    CallableStatement st = null;
    if (connectionProvider.getRDBMS().equalsIgnoreCase("ORACLE")) {

    int iParameter = 0;
    try {
      st = connectionProvider.getCallableStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adPinstanceId);

      st.execute();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    }
    else {
      Vector<String> parametersData = new Vector<String>();
      Vector<String> parametersTypes = new Vector<String>();
      parametersData.addElement(adPinstanceId);
      parametersTypes.addElement("in");
      try {
      RDBMSIndependent.getCallableResult(conn, connectionProvider, strSql, parametersData, parametersTypes, 0);
      } catch(SQLException e){
        log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
        throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
      } catch(NoConnectionAvailableException ec){
        log4j.error("Connection error in query: " + strSql + "Exception:"+ ec);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(PoolNotFoundException ep){
        log4j.error("Pool error in query: " + strSql + "Exception:"+ ep);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(Exception ex){
        log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
        throw new ServletException("@CODE=@" + ex.getMessage());
      }
    }
    return(objectRequisitionToOrderData);
  }

  public static RequisitionToOrderData requisitionStatus(Connection conn, ConnectionProvider connectionProvider, String requisitionLineId, String userId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL M_RequisitionLine_Status(null, ?, ?)";

    RequisitionToOrderData objectRequisitionToOrderData = new RequisitionToOrderData();
    CallableStatement st = null;
    if (connectionProvider.getRDBMS().equalsIgnoreCase("ORACLE")) {

    int iParameter = 0;
    try {
      st = connectionProvider.getCallableStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, requisitionLineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, userId);

      st.execute();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    }
    else {
      Vector<String> parametersData = new Vector<String>();
      Vector<String> parametersTypes = new Vector<String>();
      parametersData.addElement(requisitionLineId);
      parametersTypes.addElement("in");
      parametersData.addElement(userId);
      parametersTypes.addElement("in");
      try {
      RDBMSIndependent.getCallableResult(conn, connectionProvider, strSql, parametersData, parametersTypes, 0);
      } catch(SQLException e){
        log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
        throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
      } catch(NoConnectionAvailableException ec){
        log4j.error("Connection error in query: " + strSql + "Exception:"+ ec);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(PoolNotFoundException ep){
        log4j.error("Pool error in query: " + strSql + "Exception:"+ ep);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(Exception ex){
        log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
        throw new ServletException("@CODE=@" + ex.getMessage());
      }
    }
    return(objectRequisitionToOrderData);
  }
}
