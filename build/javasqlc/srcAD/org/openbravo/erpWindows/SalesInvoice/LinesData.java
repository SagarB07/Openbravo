//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.SalesInvoice;

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
  public String qtyinvoiced;
  public String cUomId;
  public String cUomIdr;
  public String priceactual;
  public String grossUnitPrice;
  public String linenetamt;
  public String lineGrossAmount;
  public String cTaxId;
  public String cTaxIdr;
  public String pricelist;
  public String grosspricelist;
  public String financialInvoiceLine;
  public String accountId;
  public String accountIdr;
  public String mAttributesetinstanceId;
  public String mAttributesetinstanceIdr;
  public String description;
  public String cOrderlineId;
  public String cOrderlineIdr;
  public String mInoutlineId;
  public String mInoutlineIdr;
  public String iseditlinenetamt;
  public String taxbaseamt;
  public String excludeforwithholding;
  public String mProductUomId;
  public String quantityorder;
  public String isdeferred;
  public String pricestd;
  public String grosspricestd;
  public String defplantype;
  public String defplantyper;
  public String periodnumber;
  public String cPeriodId;
  public String cPeriodIdr;
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
  public String cInvoiceDiscountId;
  public String pricelimit;
  public String sResourceassignmentId;
  public String taxamt;
  public String isactive;
  public String chargeamt;
  public String cInvoiceId;
  public String cInvoicelineId;
  public String cChargeId;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String adClientId;
  public String cProjectlineId;
  public String isdescription;
  public String mOfferId;
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
    else if (fieldName.equalsIgnoreCase("QTYINVOICED"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("C_UOM_IDR") || fieldName.equals("cUomIdr"))
      return cUomIdr;
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
    else if (fieldName.equalsIgnoreCase("FINANCIAL_INVOICE_LINE") || fieldName.equals("financialInvoiceLine"))
      return financialInvoiceLine;
    else if (fieldName.equalsIgnoreCase("ACCOUNT_ID") || fieldName.equals("accountId"))
      return accountId;
    else if (fieldName.equalsIgnoreCase("ACCOUNT_IDR") || fieldName.equals("accountIdr"))
      return accountIdr;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_IDR") || fieldName.equals("mAttributesetinstanceIdr"))
      return mAttributesetinstanceIdr;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_ORDERLINE_ID") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("C_ORDERLINE_IDR") || fieldName.equals("cOrderlineIdr"))
      return cOrderlineIdr;
    else if (fieldName.equalsIgnoreCase("M_INOUTLINE_ID") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("M_INOUTLINE_IDR") || fieldName.equals("mInoutlineIdr"))
      return mInoutlineIdr;
    else if (fieldName.equalsIgnoreCase("ISEDITLINENETAMT"))
      return iseditlinenetamt;
    else if (fieldName.equalsIgnoreCase("TAXBASEAMT"))
      return taxbaseamt;
    else if (fieldName.equalsIgnoreCase("EXCLUDEFORWITHHOLDING"))
      return excludeforwithholding;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_UOM_ID") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("QUANTITYORDER"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("ISDEFERRED"))
      return isdeferred;
    else if (fieldName.equalsIgnoreCase("PRICESTD"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("GROSSPRICESTD"))
      return grosspricestd;
    else if (fieldName.equalsIgnoreCase("DEFPLANTYPE"))
      return defplantype;
    else if (fieldName.equalsIgnoreCase("DEFPLANTYPER"))
      return defplantyper;
    else if (fieldName.equalsIgnoreCase("PERIODNUMBER"))
      return periodnumber;
    else if (fieldName.equalsIgnoreCase("C_PERIOD_ID") || fieldName.equals("cPeriodId"))
      return cPeriodId;
    else if (fieldName.equalsIgnoreCase("C_PERIOD_IDR") || fieldName.equals("cPeriodIdr"))
      return cPeriodIdr;
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
    else if (fieldName.equalsIgnoreCase("C_INVOICE_DISCOUNT_ID") || fieldName.equals("cInvoiceDiscountId"))
      return cInvoiceDiscountId;
    else if (fieldName.equalsIgnoreCase("PRICELIMIT"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("S_RESOURCEASSIGNMENT_ID") || fieldName.equals("sResourceassignmentId"))
      return sResourceassignmentId;
    else if (fieldName.equalsIgnoreCase("TAXAMT"))
      return taxamt;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("C_INVOICE_ID") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("C_INVOICELINE_ID") || fieldName.equals("cInvoicelineId"))
      return cInvoicelineId;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_IDR") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("C_PROJECTLINE_ID") || fieldName.equals("cProjectlineId"))
      return cProjectlineId;
    else if (fieldName.equalsIgnoreCase("ISDESCRIPTION"))
      return isdescription;
    else if (fieldName.equalsIgnoreCase("M_OFFER_ID") || fieldName.equals("mOfferId"))
      return mOfferId;
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
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cInvoiceId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cInvoiceId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static LinesData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cInvoiceId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_InvoiceLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_InvoiceLine.CreatedBy) as CreatedByR, " +
      "        to_char(C_InvoiceLine.Updated, ?) as updated, " +
      "        to_char(C_InvoiceLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_InvoiceLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_InvoiceLine.UpdatedBy) as UpdatedByR," +
      "        C_InvoiceLine.Line, " +
      "C_InvoiceLine.M_Product_ID, " +
      "C_InvoiceLine.QtyInvoiced, " +
      "C_InvoiceLine.C_UOM_ID, " +
      "(CASE WHEN C_InvoiceLine.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "C_InvoiceLine.PriceActual, " +
      "C_InvoiceLine.Gross_Unit_Price, " +
      "C_InvoiceLine.LineNetAmt, " +
      "C_InvoiceLine.Line_Gross_Amount, " +
      "C_InvoiceLine.C_Tax_ID, " +
      "(CASE WHEN C_InvoiceLine.C_Tax_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "C_InvoiceLine.PriceList, " +
      "C_InvoiceLine.Grosspricelist, " +
      "COALESCE(C_InvoiceLine.Financial_Invoice_Line, 'N') AS Financial_Invoice_Line, " +
      "C_InvoiceLine.Account_ID, " +
      "(CASE WHEN C_InvoiceLine.Account_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS Account_IDR, " +
      "C_InvoiceLine.M_AttributeSetInstance_ID, " +
      "(CASE WHEN C_InvoiceLine.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "C_InvoiceLine.Description, " +
      "C_InvoiceLine.C_OrderLine_ID, " +
      "(CASE WHEN C_InvoiceLine.C_OrderLine_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table8.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.GrandTotal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.LineNetAmt), ''))),'') ) END) AS C_OrderLine_IDR, " +
      "C_InvoiceLine.M_InOutLine_ID, " +
      "(CASE WHEN C_InvoiceLine.M_InOutLine_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.MovementQty), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table10.MovementDate, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL11.Name IS NULL THEN TO_CHAR(table11.Name) ELSE TO_CHAR(tableTRL11.Name) END)), ''))),'') ) END) AS M_InOutLine_IDR, " +
      "COALESCE(C_InvoiceLine.Iseditlinenetamt, 'N') AS Iseditlinenetamt, " +
      "C_InvoiceLine.Taxbaseamt, " +
      "COALESCE(C_InvoiceLine.Excludeforwithholding, 'N') AS Excludeforwithholding, " +
      "C_InvoiceLine.M_Product_Uom_Id, " +
      "C_InvoiceLine.QuantityOrder, " +
      "COALESCE(C_InvoiceLine.IsDeferred, 'N') AS IsDeferred, " +
      "C_InvoiceLine.PriceStd, " +
      "C_InvoiceLine.grosspricestd, " +
      "C_InvoiceLine.DefPlanType, " +
      "(CASE WHEN C_InvoiceLine.DefPlanType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS DefPlanTypeR, " +
      "C_InvoiceLine.Periodnumber, " +
      "C_InvoiceLine.C_Period_ID, " +
      "(CASE WHEN C_InvoiceLine.C_Period_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.Name), ''))),'') ) END) AS C_Period_IDR, " +
      "C_InvoiceLine.AD_Org_ID, " +
      "(CASE WHEN C_InvoiceLine.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_InvoiceLine.C_Project_ID, " +
      "(CASE WHEN C_InvoiceLine.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_InvoiceLine.C_Costcenter_ID, " +
      "C_InvoiceLine.A_Asset_ID, " +
      "C_InvoiceLine.User1_ID, " +
      "C_InvoiceLine.User2_ID, " +
      "C_InvoiceLine.Explode, " +
      "C_InvoiceLine.BOM_Parent_ID, " +
      "C_InvoiceLine.C_Invoice_Discount_ID, " +
      "C_InvoiceLine.PriceLimit, " +
      "C_InvoiceLine.S_ResourceAssignment_ID, " +
      "C_InvoiceLine.TaxAmt, " +
      "COALESCE(C_InvoiceLine.IsActive, 'N') AS IsActive, " +
      "C_InvoiceLine.ChargeAmt, " +
      "C_InvoiceLine.C_Invoice_ID, " +
      "C_InvoiceLine.C_InvoiceLine_ID, " +
      "C_InvoiceLine.C_Charge_ID, " +
      "C_InvoiceLine.C_Bpartner_ID, " +
      "(CASE WHEN C_InvoiceLine.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table16.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "C_InvoiceLine.AD_Client_ID, " +
      "C_InvoiceLine.C_Projectline_ID, " +
      "COALESCE(C_InvoiceLine.IsDescription, 'N') AS IsDescription, " +
      "C_InvoiceLine.M_Offer_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_InvoiceLine left join (select C_UOM_ID, Name from C_UOM) table1 on (C_InvoiceLine.C_UOM_ID = table1.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL1 on (table1.C_UOM_ID = tableTRL1.C_UOM_ID and tableTRL1.AD_Language = ?)  left join (select C_Tax_ID, Name from C_Tax) table3 on (C_InvoiceLine.C_Tax_ID =  table3.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL3 on (table3.C_Tax_ID = tableTRL3.C_Tax_ID and tableTRL3.AD_Language = ?)  left join (select C_Glitem_ID, Name from C_Glitem) table5 on (C_InvoiceLine.Account_ID =  table5.C_Glitem_ID) left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table6 on (C_InvoiceLine.M_AttributeSetInstance_ID = table6.M_AttributeSetInstance_ID) left join (select C_OrderLine_ID, C_Order_ID, Line, LineNetAmt from C_OrderLine) table7 on (C_InvoiceLine.C_OrderLine_ID = table7.C_OrderLine_ID) left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table8 on (table7.C_Order_ID = table8.C_Order_ID) left join (select M_InOutLine_ID, Line, MovementQty, M_InOut_ID, M_Product_ID from M_InOutLine) table9 on (C_InvoiceLine.M_InOutLine_ID = table9.M_InOutLine_ID) left join (select M_InOut_ID, DocumentNo, MovementDate from M_InOut) table10 on (table9.M_InOut_ID = table10.M_InOut_ID) left join (select M_Product_ID, Name from M_Product) table11 on (table9.M_Product_ID = table11.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL11 on (table11.M_Product_ID = tableTRL11.M_Product_ID and tableTRL11.AD_Language = ?)  left join ad_ref_list_v list1 on (C_InvoiceLine.DefPlanType = list1.value and list1.ad_reference_id = '73625A8F22EF4CD7808603156BA606D7' and list1.ad_language = ?)  left join (select C_Period_ID, Name from C_Period) table13 on (C_InvoiceLine.C_Period_ID =  table13.C_Period_ID) left join (select AD_Org_ID, Value from AD_Org) table14 on (C_InvoiceLine.AD_Org_ID = table14.AD_Org_ID) left join (select C_Project_ID, Value, Name from C_Project) table15 on (C_InvoiceLine.C_Project_ID = table15.C_Project_ID) left join (select C_BPartner_ID, Name from C_BPartner) table16 on (C_InvoiceLine.C_Bpartner_ID = table16.C_BPartner_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cInvoiceId==null || cInvoiceId.equals(""))?"":"  AND C_InvoiceLine.C_Invoice_ID = ?  ");
    strSql = strSql + 
      "        AND C_InvoiceLine.C_InvoiceLine_ID = ? " +
      "        AND C_InvoiceLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_InvoiceLine.AD_Org_ID IN (";
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
      if (cInvoiceId != null && !(cInvoiceId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
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
        objectLinesData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectLinesData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectLinesData.cUomIdr = UtilSql.getValue(result, "C_UOM_IDR");
        objectLinesData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectLinesData.grossUnitPrice = UtilSql.getValue(result, "GROSS_UNIT_PRICE");
        objectLinesData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectLinesData.lineGrossAmount = UtilSql.getValue(result, "LINE_GROSS_AMOUNT");
        objectLinesData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectLinesData.cTaxIdr = UtilSql.getValue(result, "C_TAX_IDR");
        objectLinesData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectLinesData.grosspricelist = UtilSql.getValue(result, "GROSSPRICELIST");
        objectLinesData.financialInvoiceLine = UtilSql.getValue(result, "FINANCIAL_INVOICE_LINE");
        objectLinesData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectLinesData.accountIdr = UtilSql.getValue(result, "ACCOUNT_IDR");
        objectLinesData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectLinesData.mAttributesetinstanceIdr = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_IDR");
        objectLinesData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectLinesData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectLinesData.cOrderlineIdr = UtilSql.getValue(result, "C_ORDERLINE_IDR");
        objectLinesData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectLinesData.mInoutlineIdr = UtilSql.getValue(result, "M_INOUTLINE_IDR");
        objectLinesData.iseditlinenetamt = UtilSql.getValue(result, "ISEDITLINENETAMT");
        objectLinesData.taxbaseamt = UtilSql.getValue(result, "TAXBASEAMT");
        objectLinesData.excludeforwithholding = UtilSql.getValue(result, "EXCLUDEFORWITHHOLDING");
        objectLinesData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectLinesData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectLinesData.isdeferred = UtilSql.getValue(result, "ISDEFERRED");
        objectLinesData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectLinesData.grosspricestd = UtilSql.getValue(result, "GROSSPRICESTD");
        objectLinesData.defplantype = UtilSql.getValue(result, "DEFPLANTYPE");
        objectLinesData.defplantyper = UtilSql.getValue(result, "DEFPLANTYPER");
        objectLinesData.periodnumber = UtilSql.getValue(result, "PERIODNUMBER");
        objectLinesData.cPeriodId = UtilSql.getValue(result, "C_PERIOD_ID");
        objectLinesData.cPeriodIdr = UtilSql.getValue(result, "C_PERIOD_IDR");
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
        objectLinesData.cInvoiceDiscountId = UtilSql.getValue(result, "C_INVOICE_DISCOUNT_ID");
        objectLinesData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectLinesData.sResourceassignmentId = UtilSql.getValue(result, "S_RESOURCEASSIGNMENT_ID");
        objectLinesData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectLinesData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectLinesData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectLinesData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectLinesData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectLinesData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectLinesData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectLinesData.cBpartnerIdr = UtilSql.getValue(result, "C_BPARTNER_IDR");
        objectLinesData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectLinesData.cProjectlineId = UtilSql.getValue(result, "C_PROJECTLINE_ID");
        objectLinesData.isdescription = UtilSql.getValue(result, "ISDESCRIPTION");
        objectLinesData.mOfferId = UtilSql.getValue(result, "M_OFFER_ID");
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
  public static LinesData[] set(String cInvoiceId, String excludeforwithholding, String cBpartnerId, String cBpartnerIdr, String cPeriodId, String financialInvoiceLine, String defplantype, String cInvoicelineId, String adClientId, String adOrgId, String isactive, String created, String createdby, String createdbyr, String updatedby, String updatedbyr, String cOrderlineId, String cOrderlineIdr, String line, String description, String mProductId, String qtyinvoiced, String pricelist, String priceactual, String linenetamt, String cChargeId, String chargeamt, String cUomId, String cTaxId, String user1Id, String mInoutlineId, String mInoutlineIdr, String pricelimit, String grosspricelist, String periodnumber, String user2Id, String sResourceassignmentId, String grossUnitPrice, String iseditlinenetamt, String taxbaseamt, String quantityorder, String mProductUomId, String cInvoiceDiscountId, String cProjectlineId, String mOfferId, String pricestd, String taxamt, String mAttributesetinstanceId, String mAttributesetinstanceIdr, String aAssetId, String grosspricestd, String isdescription, String isdeferred, String lineGrossAmount, String explode, String bomParentId, String cProjectId, String cProjectIdr, String cCostcenterId, String accountId)    throws ServletException {
    LinesData objectLinesData[] = new LinesData[1];
    objectLinesData[0] = new LinesData();
    objectLinesData[0].created = created;
    objectLinesData[0].createdbyr = createdbyr;
    objectLinesData[0].updated = "";
    objectLinesData[0].updatedTimeStamp = "";
    objectLinesData[0].updatedby = updatedby;
    objectLinesData[0].updatedbyr = updatedbyr;
    objectLinesData[0].line = line;
    objectLinesData[0].mProductId = mProductId;
    objectLinesData[0].qtyinvoiced = qtyinvoiced;
    objectLinesData[0].cUomId = cUomId;
    objectLinesData[0].cUomIdr = "";
    objectLinesData[0].priceactual = priceactual;
    objectLinesData[0].grossUnitPrice = grossUnitPrice;
    objectLinesData[0].linenetamt = linenetamt;
    objectLinesData[0].lineGrossAmount = lineGrossAmount;
    objectLinesData[0].cTaxId = cTaxId;
    objectLinesData[0].cTaxIdr = "";
    objectLinesData[0].pricelist = pricelist;
    objectLinesData[0].grosspricelist = grosspricelist;
    objectLinesData[0].financialInvoiceLine = financialInvoiceLine;
    objectLinesData[0].accountId = accountId;
    objectLinesData[0].accountIdr = "";
    objectLinesData[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectLinesData[0].mAttributesetinstanceIdr = mAttributesetinstanceIdr;
    objectLinesData[0].description = description;
    objectLinesData[0].cOrderlineId = cOrderlineId;
    objectLinesData[0].cOrderlineIdr = cOrderlineIdr;
    objectLinesData[0].mInoutlineId = mInoutlineId;
    objectLinesData[0].mInoutlineIdr = mInoutlineIdr;
    objectLinesData[0].iseditlinenetamt = iseditlinenetamt;
    objectLinesData[0].taxbaseamt = taxbaseamt;
    objectLinesData[0].excludeforwithholding = excludeforwithholding;
    objectLinesData[0].mProductUomId = mProductUomId;
    objectLinesData[0].quantityorder = quantityorder;
    objectLinesData[0].isdeferred = isdeferred;
    objectLinesData[0].pricestd = pricestd;
    objectLinesData[0].grosspricestd = grosspricestd;
    objectLinesData[0].defplantype = defplantype;
    objectLinesData[0].defplantyper = "";
    objectLinesData[0].periodnumber = periodnumber;
    objectLinesData[0].cPeriodId = cPeriodId;
    objectLinesData[0].cPeriodIdr = "";
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
    objectLinesData[0].cInvoiceDiscountId = cInvoiceDiscountId;
    objectLinesData[0].pricelimit = pricelimit;
    objectLinesData[0].sResourceassignmentId = sResourceassignmentId;
    objectLinesData[0].taxamt = taxamt;
    objectLinesData[0].isactive = isactive;
    objectLinesData[0].chargeamt = chargeamt;
    objectLinesData[0].cInvoiceId = cInvoiceId;
    objectLinesData[0].cInvoicelineId = cInvoicelineId;
    objectLinesData[0].cChargeId = cChargeId;
    objectLinesData[0].cBpartnerId = cBpartnerId;
    objectLinesData[0].cBpartnerIdr = cBpartnerIdr;
    objectLinesData[0].adClientId = adClientId;
    objectLinesData[0].cProjectlineId = cProjectlineId;
    objectLinesData[0].isdescription = isdescription;
    objectLinesData[0].mOfferId = mOfferId;
    objectLinesData[0].language = "";
    return objectLinesData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux3EE2062DF62F4E948FD9786D21AF2D0C(ConnectionProvider connectionProvider, String M_PRODUCT_ID)    throws ServletException {
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
  public static String selectAux467629226B744AD5A9D5CEBD284C29E4(ConnectionProvider connectionProvider, String M_PRODUCT_ID)    throws ServletException {
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
  public static String selectAux4D9613116EAA46A585AEDB75237D5140(ConnectionProvider connectionProvider, String C_INVOICE_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT PROCESSED FROM C_INVOICE WHERE C_INVOICE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_INVOICE_ID);

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
  public static String selectAux51568B79156646C8966F49F82EE51CB7(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
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
  public static String selectAux571778C5E2AD4A13BDD7DD15A4DA470E(ConnectionProvider connectionProvider, String C_INVOICE_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT POSTED FROM C_INVOICE WHERE C_INVOICE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_INVOICE_ID);

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
  public static String selectAux637CCFE37ADD45B5810D3490DF33CF2E(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
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
  public static String selectAux800004(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
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
  public static String selectAux1F06154C94734F81A968E51738CC7B62(ConnectionProvider connectionProvider, String C_TAX_ID)    throws ServletException {
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
  public static String selectAux231D1034C3D2450C969AEFCA7B680A8E(ConnectionProvider connectionProvider, String C_INVOICE_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT AD_ORG_ID" +
      "FROM C_INVOICE" +
      "WHERE C_INVOICE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_INVOICE_ID);

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
  public static String selectAuxB727417F9385474AB816BA585B1DAD74(ConnectionProvider connectionProvider, String c_invoice_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select max(dt.docbasetype) from c_invoice inv join c_doctype dt on (inv.c_doctypetarget_id = dt.c_doctype_id)" +
      "where inv.c_invoice_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_invoice_id);

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
  public static String selectAuxE852BFC21B4C468C9E3F22901A6ED75C(ConnectionProvider connectionProvider, String M_PRICELIST_ID)    throws ServletException {
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
  public static String selectDef1655799099FD4E7A9EB982F98A5C8066_0(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_Bpartner_ID FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_BPartner.C_BPartner_ID = table2.C_BPartner_ID) WHERE C_BPartner.isActive='Y' AND C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Bpartner_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_BPARTNER_ID");
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
  public static String selectDef3833_1(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef3835_2(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef3837_3(ConnectionProvider connectionProvider, String C_OrderLine_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.DateOrdered, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.GrandTotal), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Line), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.LineNetAmt), ''))), '') ) as C_OrderLine_ID FROM C_OrderLine left join (select C_OrderLine_ID, C_Order_ID, Line, LineNetAmt from C_OrderLine) table2 on (C_OrderLine.C_OrderLine_ID = table2.C_OrderLine_ID)left join (select C_Order_ID, DocumentNo, DateOrdered, GrandTotal from C_Order) table3 on (table2.C_Order_ID = table3.C_Order_ID) WHERE C_OrderLine.isActive='Y' AND C_OrderLine.C_OrderLine_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_OrderLine_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_ORDERLINE_ID");
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
  public static String selectDef3838(ConnectionProvider connectionProvider, String C_Invoice_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_InvoiceLine WHERE C_Invoice_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Invoice_ID);

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
  public static String selectDef4251_4(ConnectionProvider connectionProvider, String paramLanguage, String M_InOutLine_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Line), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.MovementQty), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.MovementDate, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))), '') ) as M_InOutLine_ID FROM M_InOutLine left join (select M_InOutLine_ID, Line, MovementQty, M_InOut_ID, M_Product_ID from M_InOutLine) table2 on (M_InOutLine.M_InOutLine_ID = table2.M_InOutLine_ID)left join (select M_InOut_ID, DocumentNo, MovementDate from M_InOut) table3 on (table2.M_InOut_ID = table3.M_InOut_ID)left join (select M_Product_ID, Name from M_Product) table4 on (table2.M_Product_ID = table4.M_Product_ID)left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  WHERE M_InOutLine.isActive='Y' AND M_InOutLine.M_InOutLine_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_InOutLine_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_INOUTLINE_ID");
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
  public static String selectDef8553_5(ConnectionProvider connectionProvider, String M_AttributeSetInstance_IDR)    throws ServletException {
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
  public static String selectDefE9065F7B304E419787AD6EB080A54143_6(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_InvoiceLine.C_Invoice_ID AS NAME" +
      "        FROM C_InvoiceLine" +
      "        WHERE C_InvoiceLine.C_InvoiceLine_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String cInvoiceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(table1.DateInvoiced, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Invoice left join (select C_Invoice_ID, DocumentNo, DateInvoiced, GrandTotal from C_Invoice) table1 on (C_Invoice.C_Invoice_ID = table1.C_Invoice_ID) WHERE C_Invoice.C_Invoice_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cInvoiceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(table1.DateInvoiced, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Invoice left join (select C_Invoice_ID, DocumentNo, DateInvoiced, GrandTotal from C_Invoice) table1 on (C_Invoice.C_Invoice_ID = table1.C_Invoice_ID) WHERE C_Invoice.C_Invoice_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);

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
      "        UPDATE C_InvoiceLine" +
      "        SET Line = TO_NUMBER(?) , M_Product_ID = (?) , QtyInvoiced = TO_NUMBER(?) , C_UOM_ID = (?) , PriceActual = TO_NUMBER(?) , Gross_Unit_Price = TO_NUMBER(?) , LineNetAmt = TO_NUMBER(?) , Line_Gross_Amount = TO_NUMBER(?) , C_Tax_ID = (?) , Grosspricelist = TO_NUMBER(?) , PriceList = TO_NUMBER(?) , Financial_Invoice_Line = (?) , Account_ID = (?) , M_AttributeSetInstance_ID = (?) , Description = (?) , C_OrderLine_ID = (?) , M_InOutLine_ID = (?) , Iseditlinenetamt = (?) , Taxbaseamt = TO_NUMBER(?) , Excludeforwithholding = (?) , M_Product_Uom_Id = (?) , IsDeferred = (?) , QuantityOrder = TO_NUMBER(?) , PriceStd = TO_NUMBER(?) , grosspricestd = TO_NUMBER(?) , DefPlanType = (?) , Periodnumber = TO_NUMBER(?) , C_Period_ID = (?) , AD_Org_ID = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , A_Asset_ID = (?) , User1_ID = (?) , User2_ID = (?) , Explode = (?) , BOM_Parent_ID = (?) , PriceLimit = TO_NUMBER(?) , S_ResourceAssignment_ID = (?) , TaxAmt = TO_NUMBER(?) , IsActive = (?) , ChargeAmt = TO_NUMBER(?) , C_Invoice_ID = (?) , C_InvoiceLine_ID = (?) , C_Charge_ID = (?) , C_Bpartner_ID = (?) , AD_Client_ID = (?) , C_Invoice_Discount_ID = (?) , IsDescription = (?) , M_Offer_ID = (?) , C_Projectline_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_InvoiceLine.C_InvoiceLine_ID = ? " +
      "                 AND C_InvoiceLine.C_Invoice_ID = ? " +
      "        AND C_InvoiceLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_InvoiceLine.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineGrossAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, financialInvoiceLine);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iseditlinenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxbaseamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, excludeforwithholding);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeferred);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defplantype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, explode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomParentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceassignmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceDiscountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
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
      "        INSERT INTO C_InvoiceLine " +
      "        (Line, M_Product_ID, QtyInvoiced, C_UOM_ID, PriceActual, Gross_Unit_Price, LineNetAmt, Line_Gross_Amount, C_Tax_ID, PriceList, Grosspricelist, Financial_Invoice_Line, Account_ID, M_AttributeSetInstance_ID, Description, C_OrderLine_ID, M_InOutLine_ID, Iseditlinenetamt, Taxbaseamt, Excludeforwithholding, M_Product_Uom_Id, QuantityOrder, IsDeferred, PriceStd, grosspricestd, DefPlanType, Periodnumber, C_Period_ID, AD_Org_ID, C_Project_ID, C_Costcenter_ID, A_Asset_ID, User1_ID, User2_ID, Explode, BOM_Parent_ID, C_Invoice_Discount_ID, PriceLimit, S_ResourceAssignment_ID, TaxAmt, IsActive, ChargeAmt, C_Invoice_ID, C_InvoiceLine_ID, C_Charge_ID, C_Bpartner_ID, AD_Client_ID, C_Projectline_ID, IsDescription, M_Offer_ID, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineGrossAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, financialInvoiceLine);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iseditlinenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxbaseamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, excludeforwithholding);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeferred);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grosspricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defplantype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, explode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomParentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceDiscountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceassignmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cInvoiceId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_InvoiceLine" +
      "        WHERE C_InvoiceLine.C_InvoiceLine_ID = ? " +
      "                 AND C_InvoiceLine.C_Invoice_ID = ? " +
      "        AND C_InvoiceLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_InvoiceLine.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
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
      "          FROM C_InvoiceLine" +
      "         WHERE C_InvoiceLine.C_InvoiceLine_ID = ? ";

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
      "          FROM C_InvoiceLine" +
      "         WHERE C_InvoiceLine.C_InvoiceLine_ID = ? ";

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
