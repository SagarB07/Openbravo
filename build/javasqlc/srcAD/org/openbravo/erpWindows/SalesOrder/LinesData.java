//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.SalesOrder;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

/**
WAD Generated class
 */
class LinesData implements FieldProvider {
static Logger log4j = Logger.getLogger(LinesData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String line;
  public String mProductId;
  public String mProductIdr;
  public String mInoutlineId;
  public String qtyordered;
  public String mAttributesetinstanceId;
  public String mAttributesetinstanceIdr;
  public String cUomId;
  public String cUomIdr;
  public String cReturnReasonId;
  public String priceactual;
  public String grossUnitPrice;
  public String linenetamt;
  public String lineGrossAmount;
  public String cTaxId;
  public String cTaxIdr;
  public String pricelist;
  public String grosspricelist;
  public String discount;
  public String mWarehouseRuleId;
  public String mWarehouseRuleIdr;
  public String description;
  public String createReservation;
  public String createReservationr;
  public String taxbaseamt;
  public String qtyinvoiced;
  public String qtydelivered;
  public String dateordered;
  public String datepromised;
  public String mWarehouseId;
  public String qtyreserved;
  public String mShipperId;
  public String cBpartnerId;
  public String directship;
  public String freightamt;
  public String cBpartnerLocationId;
  public String cancelpricead;
  public String mProductUomId;
  public String quantityorder;
  public String pricestd;
  public String grosspricestd;
  public String iseditlinenetamt;
  public String soResStatus;
  public String quotationlineId;
  public String quotationlineIdr;
  public String manageReservation;
  public String adOrgId;
  public String adOrgIdr;
  public String cProjectId;
  public String cProjectIdr;
  public String cCostcenterId;
  public String aAssetId;
  public String user1Id;
  public String user2Id;
  public String explode;
  public String bomParentId;
  public String refOrderlineId;
  public String mOfferId;
  public String pricelimit;
  public String cChargeId;
  public String chargeamt;
  public String isdescription;
  public String cCurrencyId;
  public String cOrderDiscountId;
  public String dateinvoiced;
  public String datedelivered;
  public String cOrderId;
  public String managePrereservation;
  public String isactive;
  public String adClientId;
  public String cOrderlineId;
  public String sResourceassignmentId;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBYR"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATED_TIME_STAMP") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("UPDATEDBYR"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_IDR") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("M_INOUTLINE_ID") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("QTYORDERED"))
      return qtyordered;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_IDR") || fieldName.equals("mAttributesetinstanceIdr"))
      return mAttributesetinstanceIdr;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("C_UOM_IDR") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("C_RETURN_REASON_ID") || fieldName.equals("cReturnReasonId"))
      return cReturnReasonId;
    else if (fieldName.equalsIgnoreCase("PRICEACTUAL"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("GROSS_UNIT_PRICE") || fieldName.equals("grossUnitPrice"))
      return grossUnitPrice;
    else if (fieldName.equalsIgnoreCase("LINENETAMT"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("LINE_GROSS_AMOUNT") || fieldName.equals("lineGrossAmount"))
      return lineGrossAmount;
    else if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("C_TAX_IDR") || fieldName.equals("cTaxIdr"))
      return cTaxIdr;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("GROSSPRICELIST"))
      return grosspricelist;
    else if (fieldName.equalsIgnoreCase("DISCOUNT"))
      return discount;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_RULE_ID") || fieldName.equals("mWarehouseRuleId"))
      return mWarehouseRuleId;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_RULE_IDR") || fieldName.equals("mWarehouseRuleIdr"))
      return mWarehouseRuleIdr;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("CREATE_RESERVATION") || fieldName.equals("createReservation"))
      return createReservation;
    else if (fieldName.equalsIgnoreCase("CREATE_RESERVATIONR") || fieldName.equals("createReservationr"))
      return createReservationr;
    else if (fieldName.equalsIgnoreCase("TAXBASEAMT"))
      return taxbaseamt;
    else if (fieldName.equalsIgnoreCase("QTYINVOICED"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("QTYDELIVERED"))
      return qtydelivered;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("DATEPROMISED"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("QTYRESERVED"))
      return qtyreserved;
    else if (fieldName.equalsIgnoreCase("M_SHIPPER_ID") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("DIRECTSHIP"))
      return directship;
    else if (fieldName.equalsIgnoreCase("FREIGHTAMT"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("CANCELPRICEAD"))
      return cancelpricead;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_UOM_ID") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("QUANTITYORDER"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("PRICESTD"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("GROSSPRICESTD"))
      return grosspricestd;
    else if (fieldName.equalsIgnoreCase("ISEDITLINENETAMT"))
      return iseditlinenetamt;
    else if (fieldName.equalsIgnoreCase("SO_RES_STATUS") || fieldName.equals("soResStatus"))
      return soResStatus;
    else if (fieldName.equalsIgnoreCase("QUOTATIONLINE_ID") || fieldName.equals("quotationlineId"))
      return quotationlineId;
    else if (fieldName.equalsIgnoreCase("QUOTATIONLINE_IDR") || fieldName.equals("quotationlineIdr"))
      return quotationlineIdr;
    else if (fieldName.equalsIgnoreCase("MANAGE_RESERVATION") || fieldName.equals("manageReservation"))
      return manageReservation;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_IDR") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("A_ASSET_ID") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("EXPLODE"))
      return explode;
    else if (fieldName.equalsIgnoreCase("BOM_PARENT_ID") || fieldName.equals("bomParentId"))
      return bomParentId;
    else if (fieldName.equalsIgnoreCase("REF_ORDERLINE_ID") || fieldName.equals("refOrderlineId"))
      return refOrderlineId;
    else if (fieldName.equalsIgnoreCase("M_OFFER_ID") || fieldName.equals("mOfferId"))
      return mOfferId;
    else if (fieldName.equalsIgnoreCase("PRICELIMIT"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("ISDESCRIPTION"))
      return isdescription;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_ORDER_DISCOUNT_ID") || fieldName.equals("cOrderDiscountId"))
      return cOrderDiscountId;
    else if (fieldName.equalsIgnoreCase("DATEINVOICED"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("DATEDELIVERED"))
      return datedelivered;
    else if (fieldName.equalsIgnoreCase("C_ORDER_ID") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("MANAGE_PRERESERVATION") || fieldName.equals("managePrereservation"))
      return managePrereservation;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("C_ORDERLINE_ID") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("S_RESOURCEASSIGNMENT_ID") || fieldName.equals("sResourceassignmentId"))
      return sResourceassignmentId;
    else if (fieldName.equalsIgnoreCase("LANGUAGE"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cOrderId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_OrderLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_OrderLine.CreatedBy) as CreatedByR, " +
      "        to_char(C_OrderLine.Updated, ?) as updated, " +
      "        to_char(C_OrderLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_OrderLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_OrderLine.UpdatedBy) as UpdatedByR," +
      "        C_OrderLine.Line, " +
      "C_OrderLine.M_Product_ID, " +
      "(CASE WHEN C_OrderLine.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "C_OrderLine.M_Inoutline_ID, " +
      "C_OrderLine.QtyOrdered, " +
      "C_OrderLine.M_AttributeSetInstance_ID, " +
      "(CASE WHEN C_OrderLine.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "C_OrderLine.C_UOM_ID, " +
      "(CASE WHEN C_OrderLine.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "C_OrderLine.C_Return_Reason_ID, " +
      "C_OrderLine.PriceActual, " +
      "C_OrderLine.Gross_Unit_Price, " +
      "C_OrderLine.LineNetAmt, " +
      "C_OrderLine.Line_Gross_Amount, " +
      "C_OrderLine.C_Tax_ID, " +
      "(CASE WHEN C_OrderLine.C_Tax_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "C_OrderLine.PriceList, " +
      "C_OrderLine.GrossPriceList, " +
      "C_OrderLine.Discount, " +
      "C_OrderLine.M_Warehouse_Rule_ID, " +
      "(CASE WHEN C_OrderLine.M_Warehouse_Rule_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS M_Warehouse_Rule_IDR, " +
      "C_OrderLine.Description, " +
      "C_OrderLine.Create_Reservation, " +
      "(CASE WHEN C_OrderLine.Create_Reservation IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS Create_ReservationR, " +
      "C_OrderLine.Taxbaseamt, " +
      "C_OrderLine.QtyInvoiced, " +
      "C_OrderLine.QtyDelivered, " +
      "C_OrderLine.DateOrdered, " +
      "C_OrderLine.DatePromised, " +
      "C_OrderLine.M_Warehouse_ID, " +
      "C_OrderLine.QtyReserved, " +
      "C_OrderLine.M_Shipper_ID, " +
      "C_OrderLine.C_BPartner_ID, " +
      "COALESCE(C_OrderLine.DirectShip, 'N') AS DirectShip, " +
      "C_OrderLine.FreightAmt, " +
      "C_OrderLine.C_BPartner_Location_ID, " +
      "COALESCE(C_OrderLine.CANCELPRICEAD, 'N') AS CANCELPRICEAD, " +
      "C_OrderLine.M_Product_Uom_Id, " +
      "C_OrderLine.QuantityOrder, " +
      "C_OrderLine.PriceStd, " +
      "C_OrderLine.grosspricestd, " +
      "COALESCE(C_OrderLine.Iseditlinenetamt, 'N') AS Iseditlinenetamt, " +
      "C_OrderLine.SO_Res_Status, " +
      "C_OrderLine.Quotationline_ID, " +
      "(CASE WHEN C_OrderLine.Quotationline_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table10.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.GrandTotal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.LineNetAmt), ''))),'') ) END) AS Quotationline_IDR, " +
      "C_OrderLine.Manage_Reservation, " +
      "C_OrderLine.AD_Org_ID, " +
      "(CASE WHEN C_OrderLine.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_OrderLine.C_Project_ID, " +
      "(CASE WHEN C_OrderLine.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_OrderLine.C_Costcenter_ID, " +
      "C_OrderLine.A_Asset_ID, " +
      "C_OrderLine.User1_ID, " +
      "C_OrderLine.User2_ID, " +
      "C_OrderLine.Explode, " +
      "C_OrderLine.BOM_Parent_ID, " +
      "C_OrderLine.Ref_OrderLine_ID, " +
      "C_OrderLine.M_Offer_ID, " +
      "C_OrderLine.PriceLimit, " +
      "C_OrderLine.C_Charge_ID, " +
      "C_OrderLine.ChargeAmt, " +
      "COALESCE(C_OrderLine.IsDescription, 'N') AS IsDescription, " +
      "C_OrderLine.C_Currency_ID, " +
      "C_OrderLine.C_Order_Discount_ID, " +
      "C_OrderLine.DateInvoiced, " +
      "C_OrderLine.DateDelivered, " +
      "C_OrderLine.C_Order_ID, " +
      "C_OrderLine.Manage_Prereservation, " +
      "COALESCE(C_OrderLine.IsActive, 'N') AS IsActive, " +
      "C_OrderLine.AD_Client_ID, " +
      "C_OrderLine.C_OrderLine_ID, " +
      "C_OrderLine.S_ResourceAssignment_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_OrderLine left join (select M_Product_ID, Name from M_Product) table1 on (C_OrderLine.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table3 on (C_OrderLine.M_AttributeSetInstance_ID = table3.M_AttributeSetInstance_ID) left join (select C_UOM_ID, Name from C_UOM) table4 on (C_OrderLine.C_UOM_ID = table4.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL4 on (table4.C_UOM_ID = tableTRL4.C_UOM_ID and tableTRL4.AD_Language = ?)  left join (select C_Tax_ID, Name from C_Tax) table6 on (C_OrderLine.C_Tax_ID =  table6.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL6 on (table6.C_Tax_ID = tableTRL6.C_Tax_ID and tableTRL6.AD_Language = ?)  left join (select M_Warehouse_Rule_ID, Name from M_Warehouse_Rule) table8 on (C_OrderLine.M_Warehouse_Rule_ID = table8.M_Warehouse_Rule_ID) left join ad_ref_list_v list1 on (C_OrderLine.Create_Reservation = list1.value and list1.ad_reference_id = '1852D69AB3FD453F8F031813501B26F0' and list1.ad_language = ?)  left join (select C_OrderLine_ID, C_Order_ID, Line, LineNetAmt from C_OrderLine) table9 on (C_OrderLine.Quotationline_ID = table9.C_OrderLine_ID) left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table10 on (table9.C_Order_ID = table10.C_Order_ID) left join (select AD_Org_ID, Value from AD_Org) table11 on (C_OrderLine.AD_Org_ID = table11.AD_Org_ID) left join (select C_Project_ID, Value, Name from C_Project) table12 on (C_OrderLine.C_Project_ID = table12.C_Project_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cOrderId==null || cOrderId.equals(""))?"":"  AND C_OrderLine.C_Order_ID = ?  ");
    strSql = strSql + 
      "        AND C_OrderLine.C_OrderLine_ID = ? " +
      "        AND C_OrderLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_OrderLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (cOrderId != null && !(cOrderId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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
        LinesData objectLinesData = new LinesData();
        objectLinesData.created = UtilSql.getValue(result, "CREATED");
        objectLinesData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectLinesData.updated = UtilSql.getValue(result, "UPDATED");
        objectLinesData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectLinesData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectLinesData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectLinesData.line = UtilSql.getValue(result, "LINE");
        objectLinesData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectLinesData.mProductIdr = UtilSql.getValue(result, "M_PRODUCT_IDR");
        objectLinesData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectLinesData.qtyordered = UtilSql.getValue(result, "QTYORDERED");
        objectLinesData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectLinesData.mAttributesetinstanceIdr = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_IDR");
        objectLinesData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectLinesData.cUomIdr = UtilSql.getValue(result, "C_UOM_IDR");
        objectLinesData.cReturnReasonId = UtilSql.getValue(result, "C_RETURN_REASON_ID");
        objectLinesData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectLinesData.grossUnitPrice = UtilSql.getValue(result, "GROSS_UNIT_PRICE");
        objectLinesData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectLinesData.lineGrossAmount = UtilSql.getValue(result, "LINE_GROSS_AMOUNT");
        objectLinesData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectLinesData.cTaxIdr = UtilSql.getValue(result, "C_TAX_IDR");
        objectLinesData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectLinesData.grosspricelist = UtilSql.getValue(result, "GROSSPRICELIST");
        objectLinesData.discount = UtilSql.getValue(result, "DISCOUNT");
        objectLinesData.mWarehouseRuleId = UtilSql.getValue(result, "M_WAREHOUSE_RULE_ID");
        objectLinesData.mWarehouseRuleIdr = UtilSql.getValue(result, "M_WAREHOUSE_RULE_IDR");
        objectLinesData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectLinesData.createReservation = UtilSql.getValue(result, "CREATE_RESERVATION");
        objectLinesData.createReservationr = UtilSql.getValue(result, "CREATE_RESERVATIONR");
        objectLinesData.taxbaseamt = UtilSql.getValue(result, "TAXBASEAMT");
        objectLinesData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectLinesData.qtydelivered = UtilSql.getValue(result, "QTYDELIVERED");
        objectLinesData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectLinesData.datepromised = UtilSql.getDateValue(result, "DATEPROMISED", "dd-MM-yyyy");
        objectLinesData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectLinesData.qtyreserved = UtilSql.getValue(result, "QTYRESERVED");
        objectLinesData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectLinesData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectLinesData.directship = UtilSql.getValue(result, "DIRECTSHIP");
        objectLinesData.freightamt = UtilSql.getValue(result, "FREIGHTAMT");
        objectLinesData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectLinesData.cancelpricead = UtilSql.getValue(result, "CANCELPRICEAD");
        objectLinesData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectLinesData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectLinesData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectLinesData.grosspricestd = UtilSql.getValue(result, "GROSSPRICESTD");
        objectLinesData.iseditlinenetamt = UtilSql.getValue(result, "ISEDITLINENETAMT");
        objectLinesData.soResStatus = UtilSql.getValue(result, "SO_RES_STATUS");
        objectLinesData.quotationlineId = UtilSql.getValue(result, "QUOTATIONLINE_ID");
        objectLinesData.quotationlineIdr = UtilSql.getValue(result, "QUOTATIONLINE_IDR");
        objectLinesData.manageReservation = UtilSql.getValue(result, "MANAGE_RESERVATION");
        objectLinesData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectLinesData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectLinesData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectLinesData.cProjectIdr = UtilSql.getValue(result, "C_PROJECT_IDR");
        objectLinesData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectLinesData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectLinesData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectLinesData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectLinesData.explode = UtilSql.getValue(result, "EXPLODE");
        objectLinesData.bomParentId = UtilSql.getValue(result, "BOM_PARENT_ID");
        objectLinesData.refOrderlineId = UtilSql.getValue(result, "REF_ORDERLINE_ID");
        objectLinesData.mOfferId = UtilSql.getValue(result, "M_OFFER_ID");
        objectLinesData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectLinesData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectLinesData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectLinesData.isdescription = UtilSql.getValue(result, "ISDESCRIPTION");
        objectLinesData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectLinesData.cOrderDiscountId = UtilSql.getValue(result, "C_ORDER_DISCOUNT_ID");
        objectLinesData.dateinvoiced = UtilSql.getDateValue(result, "DATEINVOICED", "dd-MM-yyyy");
        objectLinesData.datedelivered = UtilSql.getDateValue(result, "DATEDELIVERED", "dd-MM-yyyy");
        objectLinesData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectLinesData.managePrereservation = UtilSql.getValue(result, "MANAGE_PRERESERVATION");
        objectLinesData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectLinesData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectLinesData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectLinesData.sResourceassignmentId = UtilSql.getValue(result, "S_RESOURCEASSIGNMENT_ID");
        objectLinesData.language = UtilSql.getValue(result, "LANGUAGE");
        objectLinesData.adUserClient = "";
        objectLinesData.adOrgClient = "";
        objectLinesData.createdby = "";
        objectLinesData.trBgcolor = "";
        objectLinesData.totalCount = "";
        objectLinesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectLinesData);
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
    LinesData objectLinesData[] = new LinesData[vector.size()];
    vector.copyInto(objectLinesData);
    return(objectLinesData);
  }

/**
Create a registry
 */
  public static LinesData[] set(String cOrderId, String lineGrossAmount, String cancelpricead, String cOrderlineId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String line, String dateordered, String datepromised, String datedelivered, String dateinvoiced, String description, String mProductId, String mProductIdr, String cUomId, String mWarehouseId, String qtyordered, String qtyreserved, String qtydelivered, String qtyinvoiced, String mShipperId, String cCurrencyId, String pricelist, String priceactual, String cTaxId, String cBpartnerId, String directship, String freightamt, String cChargeId, String chargeamt, String cBpartnerLocationId, String linenetamt, String pricelimit, String discount, String cCostcenterId, String cReturnReasonId, String sResourceassignmentId, String cOrderDiscountId, String user2Id, String aAssetId, String refOrderlineId, String iseditlinenetamt, String taxbaseamt, String mProductUomId, String quantityorder, String mOfferId, String pricestd, String mAttributesetinstanceId, String mAttributesetinstanceIdr, String user1Id, String isdescription, String bomParentId, String grosspricestd, String explode, String mInoutlineId, String cProjectId, String cProjectIdr, String grosspricelist, String mWarehouseRuleId, String createReservation, String soResStatus, String manageReservation, String managePrereservation, String quotationlineId, String quotationlineIdr, String grossUnitPrice)    throws ServletException {
    LinesData objectLinesData[] = new LinesData[1];
    objectLinesData[0] = new LinesData();
    objectLinesData[0].created = "";
    objectLinesData[0].createdbyr = createdbyr;
    objectLinesData[0].updated = "";
    objectLinesData[0].updatedTimeStamp = "";
    objectLinesData[0].updatedby = updatedby;
    objectLinesData[0].updatedbyr = updatedbyr;
    objectLinesData[0].line = line;
    objectLinesData[0].mProductId = mProductId;
    objectLinesData[0].mProductIdr = mProductIdr;
    objectLinesData[0].mInoutlineId = mInoutlineId;
    objectLinesData[0].qtyordered = qtyordered;
    objectLinesData[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectLinesData[0].mAttributesetinstanceIdr = mAttributesetinstanceIdr;
    objectLinesData[0].cUomId = cUomId;
    objectLinesData[0].cUomIdr = "";
    objectLinesData[0].cReturnReasonId = cReturnReasonId;
    objectLinesData[0].priceactual = priceactual;
    objectLinesData[0].grossUnitPrice = grossUnitPrice;
    objectLinesData[0].linenetamt = linenetamt;
    objectLinesData[0].lineGrossAmount = lineGrossAmount;
    objectLinesData[0].cTaxId = cTaxId;
    objectLinesData[0].cTaxIdr = "";
    objectLinesData[0].pricelist = pricelist;
    objectLinesData[0].grosspricelist = grosspricelist;
    objectLinesData[0].discount = discount;
    objectLinesData[0].mWarehouseRuleId = mWarehouseRuleId;
    objectLinesData[0].mWarehouseRuleIdr = "";
    objectLinesData[0].description = description;
    objectLinesData[0].createReservation = createReservation;
    objectLinesData[0].createReservationr = "";
    objectLinesData[0].taxbaseamt = taxbaseamt;
    objectLinesData[0].qtyinvoiced = qtyinvoiced;
    objectLinesData[0].qtydelivered = qtydelivered;
    objectLinesData[0].dateordered = dateordered;
    objectLinesData[0].datepromised = datepromised;
    objectLinesData[0].mWarehouseId = mWarehouseId;
    objectLinesData[0].qtyreserved = qtyreserved;
    objectLinesData[0].mShipperId = mShipperId;
    objectLinesData[0].cBpartnerId = cBpartnerId;
    objectLinesData[0].directship = directship;
    objectLinesData[0].freightamt = freightamt;
    objectLinesData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectLinesData[0].cancelpricead = cancelpricead;
    objectLinesData[0].mProductUomId = mProductUomId;
    objectLinesData[0].quantityorder = quantityorder;
    objectLinesData[0].pricestd = pricestd;
    objectLinesData[0].grosspricestd = grosspricestd;
    objectLinesData[0].iseditlinenetamt = iseditlinenetamt;
    objectLinesData[0].soResStatus = soResStatus;
    objectLinesData[0].quotationlineId = quotationlineId;
    objectLinesData[0].quotationlineIdr = quotationlineIdr;
    objectLinesData[0].manageReservation = manageReservation;
    objectLinesData[0].adOrgId = adOrgId;
    objectLinesData[0].adOrgIdr = "";
    objectLinesData[0].cProjectId = cProjectId;
    objectLinesData[0].cProjectIdr = cProjectIdr;
    objectLinesData[0].cCostcenterId = cCostcenterId;
    objectLinesData[0].aAssetId = aAssetId;
    objectLinesData[0].user1Id = user1Id;
    objectLinesData[0].user2Id = user2Id;
    objectLinesData[0].explode = explode;
    objectLinesData[0].bomParentId = bomParentId;
    objectLinesData[0].refOrderlineId = refOrderlineId;
    objectLinesData[0].mOfferId = mOfferId;
    objectLinesData[0].pricelimit = pricelimit;
    objectLinesData[0].cChargeId = cChargeId;
    objectLinesData[0].chargeamt = chargeamt;
    objectLinesData[0].isdescription = isdescription;
    objectLinesData[0].cCurrencyId = cCurrencyId;
    objectLinesData[0].cOrderDiscountId = cOrderDiscountId;
    objectLinesData[0].dateinvoiced = dateinvoiced;
    objectLinesData[0].datedelivered = datedelivered;
    objectLinesData[0].cOrderId = cOrderId;
    objectLinesData[0].managePrereservation = managePrereservation;
    objectLinesData[0].isactive = isactive;
    objectLinesData[0].adClientId = adClientId;
    objectLinesData[0].cOrderlineId = cOrderlineId;
    objectLinesData[0].sResourceassignmentId = sResourceassignmentId;
    objectLinesData[0].language = "";
    return objectLinesData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux4B4FADE3E6AC41F0827B3120AD6C3FAA(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ATTRSETVALUETYPE FROM M_PRODUCT WHERE M_PRODUCT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ATTRSETVALUETYPE");
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

/**
Select for auxiliar field
 */
  public static String selectAux81E735D7FA45476498395FDD9AB982ED(ConnectionProvider connectionProvider, String C_TAX_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT CASE WHEN COUNT(C_TAX_ID)>0 THEN 'Y' ELSE 'N' END AS ISUSED FROM C_TAX WHERE C_TAX_ISMEMBER(?, C_TAX_ID)=1 AND BASEAMOUNT IN ('TBA', 'TBATAX') ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_TAX_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISUSED");
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

/**
Select for auxiliar field
 */
  public static String selectAux800010(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (CASE COUNT(*) WHEN 0 THEN 0 ELSE 1 END) AS TOTAL FROM M_PRODUCT_UOM WHERE M_PRODUCT_ID=? AND ISACTIVE='Y' ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

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

/**
Select for auxiliar field
 */
  public static String selectAux0A17DEEA6AE34D0AAF8D7D789BBEB16A(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_ATTRIBUTESET_ID FROM M_PRODUCT WHERE M_PRODUCT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
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

/**
Select for auxiliar field
 */
  public static String selectAux2DED276495BD4544AA805CDF95409734(ConnectionProvider connectionProvider, String C_ORDER_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT AD_ORG_ID" +
      "FROM C_ORDER" +
      "WHERE C_ORDER_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ORDER_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_ORG_ID");
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

/**
Select for auxiliar field
 */
  public static String selectAux2F68ED80A1824966845A6CED4A2B5B45(ConnectionProvider connectionProvider, String c_order_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select max(dt.docbasetype) from c_order ord join c_doctype dt on (ord.c_doctypetarget_id = dt.c_doctype_id)" +
      "where ord.c_order_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_order_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "MAX(DT.DOCBASETYPE)");
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

/**
Select for auxiliar field
 */
  public static String selectAux3ACE8CFB656847998D9236DAA1D66E49(ConnectionProvider connectionProvider, String C_ORDER_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT PROCESSED FROM C_ORDER WHERE C_ORDER_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ORDER_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "PROCESSED");
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

/**
Select for auxiliar field
 */
  public static String selectAuxBBFAC7EEB599451388E60BA877C89809(ConnectionProvider connectionProvider, String M_PRODUCT_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT isBOM FROM M_PRODUCT WHERE M_PRODUCT_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_PRODUCT_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISBOM");
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

/**
Select for auxiliar field
 */
  public static String selectAuxCF00CC6BA5F747CBB77CA682833A22FE(ConnectionProvider connectionProvider, String M_PRODUCT_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT IsStocked FROM M_PRODUCT WHERE M_PRODUCT_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_PRODUCT_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISSTOCKED");
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

/**
Select for auxiliar field
 */
  public static String selectAuxF77560579B7E4105A0C8455FCFB1B333(ConnectionProvider connectionProvider, String M_PRICELIST_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT istaxincluded from m_pricelist where m_pricelist_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_PRICELIST_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISTAXINCLUDED");
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

/**
Select for auxiliar field
 */
  public static String selectAuxFF45754650034D1695FB584866C04DC5(ConnectionProvider connectionProvider, String C_ORDER_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT POSTED FROM C_ORDER WHERE C_ORDER_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ORDER_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "POSTED");
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

/**
Select for auxiliar field
 */
  public static String selectDef2210_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as CreatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "CREATEDBY");
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

/**
Select for auxiliar field
 */
  public static String selectDef2212_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as UpdatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATEDBY");
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

/**
Select for auxiliar field
 */
  public static String selectDef2214(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_OrderLine WHERE C_Order_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Order_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "DEFAULTVALUE");
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

/**
Select for auxiliar field
 */
  public static String selectDef2221_2(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))), '') ) as M_Product_ID FROM M_Product left join (select M_Product_ID, Name from M_Product) table2 on (M_Product.M_Product_ID = table2.M_Product_ID)left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  WHERE M_Product.isActive='Y' AND M_Product.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_PRODUCT_ID");
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

/**
Select for auxiliar field
 */
  public static String selectDef2764(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_BPartner_ID AS DefaultValue FROM C_Order WHERE C_Order_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Order_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "DEFAULTVALUE");
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

/**
Select for auxiliar field
 */
  public static String selectDef8767_3(ConnectionProvider connectionProvider, String M_AttributeSetInstance_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Description), ''))), '') ) as M_AttributeSetInstance_ID FROM M_AttributeSetInstance left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table2 on (M_AttributeSetInstance.M_AttributeSetInstance_ID = table2.M_AttributeSetInstance_ID) WHERE M_AttributeSetInstance.isActive='Y' AND M_AttributeSetInstance.M_AttributeSetInstance_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_AttributeSetInstance_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
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

/**
Select for auxiliar field
 */
  public static String selectDefB2023461A08649D58E5D144D4FC2C507_4(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_Project_ID FROM C_Project left join (select C_Project_ID, Value, Name from C_Project) table2 on (C_Project.C_Project_ID = table2.C_Project_ID) WHERE C_Project.isActive='Y' AND C_Project.C_Project_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Project_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_PROJECT_ID");
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

/**
Select for auxiliar field
 */
  public static String selectDefE9612846B6F5472A8F64CF729E0B25AE_5(ConnectionProvider connectionProvider, String Quotationline_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.DateOrdered, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.GrandTotal), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Line), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.LineNetAmt), ''))), '') ) as Quotationline_ID FROM C_OrderLine left join (select C_OrderLine_ID, C_Order_ID, Line, LineNetAmt from C_OrderLine) table2 on (C_OrderLine.C_OrderLine_ID = table2.C_OrderLine_ID)left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table3 on (table2.C_Order_ID = table3.C_Order_ID) WHERE C_OrderLine.isActive='Y' AND C_OrderLine.C_OrderLine_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Quotationline_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "QUOTATIONLINE_ID");
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

/**
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_OrderLine.C_Order_ID AS NAME" +
      "        FROM C_OrderLine" +
      "        WHERE C_OrderLine.C_OrderLine_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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

/**
Select for parent field
 */
  public static String selectParent(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(table1.DateOrdered, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Order left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table1 on (C_Order.C_Order_ID = table1.C_Order_ID) WHERE C_Order.C_Order_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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

/**
Select for parent field
 */
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(table1.DateOrdered, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Order left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table1 on (C_Order.C_Order_ID = table1.C_Order_ID) WHERE C_Order.C_Order_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_OrderLine" +
      "        SET Line = TO_NUMBER(?) , M_Product_ID = (?) , M_Inoutline_ID = (?) , QtyOrdered = TO_NUMBER(?) , M_AttributeSetInstance_ID = (?) , C_UOM_ID = (?) , C_Return_Reason_ID = (?) , PriceActual = TO_NUMBER(?) , Gross_Unit_Price = TO_NUMBER(?) , LineNetAmt = TO_NUMBER(?) , Line_Gross_Amount = TO_NUMBER(?) , C_Tax_ID = (?) , PriceList = TO_NUMBER(?) , GrossPriceList = TO_NUMBER(?) , Discount = TO_NUMBER(?) , M_Warehouse_Rule_ID = (?) , Description = (?) , Create_Reservation = (?) , Taxbaseamt = TO_NUMBER(?) , QtyInvoiced = TO_NUMBER(?) , QtyDelivered = TO_NUMBER(?) , DateOrdered = TO_DATE(?) , DatePromised = TO_DATE(?) , M_Warehouse_ID = (?) , QtyReserved = TO_NUMBER(?) , M_Shipper_ID = (?) , C_BPartner_ID = (?) , DirectShip = (?) , FreightAmt = TO_NUMBER(?) , C_BPartner_Location_ID = (?) , CANCELPRICEAD = (?) , M_Product_Uom_Id = (?) , QuantityOrder = TO_NUMBER(?) , PriceStd = TO_NUMBER(?) , grosspricestd = TO_NUMBER(?) , Iseditlinenetamt = (?) , SO_Res_Status = (?) , Quotationline_ID = (?) , Manage_Reservation = (?) , AD_Org_ID = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , A_Asset_ID = (?) , User1_ID = (?) , User2_ID = (?) , Explode = (?) , BOM_Parent_ID = (?) , Ref_OrderLine_ID = (?) , M_Offer_ID = (?) , PriceLimit = TO_NUMBER(?) , C_Charge_ID = (?) , ChargeAmt = TO_NUMBER(?) , IsDescription = (?) , C_Currency_ID = (?) , C_Order_Discount_ID = (?) , DateInvoiced = TO_DATE(?) , DateDelivered = TO_DATE(?) , C_Order_ID = (?) , Manage_Prereservation = (?) , IsActive = (?) , AD_Client_ID = (?) , C_OrderLine_ID = (?) , S_ResourceAssignment_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_OrderLine.C_OrderLine_ID = ? " +
      "                 AND C_OrderLine.C_Order_ID = ? " +
      "        AND C_OrderLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_OrderLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReturnReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineGrossAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseRuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createReservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxbaseamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtydelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyreserved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, directship);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cancelpricead);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iseditlinenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soResStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quotationlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manageReservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, explode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomParentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, refOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderDiscountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, managePrereservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceassignmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO C_OrderLine " +
      "        (Line, M_Product_ID, M_Inoutline_ID, QtyOrdered, M_AttributeSetInstance_ID, C_UOM_ID, C_Return_Reason_ID, PriceActual, Gross_Unit_Price, LineNetAmt, Line_Gross_Amount, C_Tax_ID, PriceList, GrossPriceList, Discount, M_Warehouse_Rule_ID, Description, Create_Reservation, Taxbaseamt, QtyInvoiced, QtyDelivered, DateOrdered, DatePromised, M_Warehouse_ID, QtyReserved, M_Shipper_ID, C_BPartner_ID, DirectShip, FreightAmt, C_BPartner_Location_ID, CANCELPRICEAD, M_Product_Uom_Id, QuantityOrder, PriceStd, grosspricestd, Iseditlinenetamt, SO_Res_Status, Quotationline_ID, Manage_Reservation, AD_Org_ID, C_Project_ID, C_Costcenter_ID, A_Asset_ID, User1_ID, User2_ID, Explode, BOM_Parent_ID, Ref_OrderLine_ID, M_Offer_ID, PriceLimit, C_Charge_ID, ChargeAmt, IsDescription, C_Currency_ID, C_Order_Discount_ID, DateInvoiced, DateDelivered, C_Order_ID, Manage_Prereservation, IsActive, AD_Client_ID, C_OrderLine_ID, S_ResourceAssignment_ID, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?), TO_DATE(?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReturnReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineGrossAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseRuleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createReservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxbaseamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtydelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyreserved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, directship);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cancelpricead);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iseditlinenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soResStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quotationlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manageReservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, explode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomParentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, refOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderDiscountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, managePrereservation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceassignmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cOrderId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_OrderLine" +
      "        WHERE C_OrderLine.C_OrderLine_ID = ? " +
      "                 AND C_OrderLine.C_Order_ID = ? " +
      "        AND C_OrderLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_OrderLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM C_OrderLine" +
      "         WHERE C_OrderLine.C_OrderLine_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_ORG_ID");
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

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM C_OrderLine" +
      "         WHERE C_OrderLine.C_OrderLine_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
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
