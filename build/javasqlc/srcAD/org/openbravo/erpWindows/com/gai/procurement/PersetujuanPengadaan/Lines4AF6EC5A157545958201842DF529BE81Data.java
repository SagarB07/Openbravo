//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.com.gai.procurement.PersetujuanPengadaan;

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
class Lines4AF6EC5A157545958201842DF529BE81Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Lines4AF6EC5A157545958201842DF529BE81Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String line;
  public String needbydate;
  public String mProductId;
  public String mProductIdr;
  public String mAttributesetinstanceId;
  public String mAttributesetinstanceIdr;
  public String qty;
  public String cUomId;
  public String cUomIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String mPricelistId;
  public String mPricelistIdr;
  public String priceactual;
  public String linenetamt;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String description;
  public String pricelist;
  public String discount;
  public String grossUnitPrice;
  public String grossAmt;
  public String internalnotes;
  public String suppliernotes;
  public String lockedby;
  public String lockedbyr;
  public String lockqty;
  public String lockprice;
  public String quantityorder;
  public String mProductUomId;
  public String mProductUomIdr;
  public String changestatus;
  public String lockcause;
  public String orderedqty;
  public String lockdate;
  public String reqstatus;
  public String adClientId;
  public String mRequisitionId;
  public String mRequisitionlineId;
  public String adOrgId;
  public String isactive;
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
    else if (fieldName.equalsIgnoreCase("NEEDBYDATE"))
      return needbydate;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_IDR") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_IDR") || fieldName.equals("mAttributesetinstanceIdr"))
      return mAttributesetinstanceIdr;
    else if (fieldName.equalsIgnoreCase("QTY"))
      return qty;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("C_UOM_IDR") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_IDR") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_IDR") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("PRICEACTUAL"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("LINENETAMT"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("DISCOUNT"))
      return discount;
    else if (fieldName.equalsIgnoreCase("GROSS_UNIT_PRICE") || fieldName.equals("grossUnitPrice"))
      return grossUnitPrice;
    else if (fieldName.equalsIgnoreCase("GROSS_AMT") || fieldName.equals("grossAmt"))
      return grossAmt;
    else if (fieldName.equalsIgnoreCase("INTERNALNOTES"))
      return internalnotes;
    else if (fieldName.equalsIgnoreCase("SUPPLIERNOTES"))
      return suppliernotes;
    else if (fieldName.equalsIgnoreCase("LOCKEDBY"))
      return lockedby;
    else if (fieldName.equalsIgnoreCase("LOCKEDBYR"))
      return lockedbyr;
    else if (fieldName.equalsIgnoreCase("LOCKQTY"))
      return lockqty;
    else if (fieldName.equalsIgnoreCase("LOCKPRICE"))
      return lockprice;
    else if (fieldName.equalsIgnoreCase("QUANTITYORDER"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_UOM_ID") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_UOM_IDR") || fieldName.equals("mProductUomIdr"))
      return mProductUomIdr;
    else if (fieldName.equalsIgnoreCase("CHANGESTATUS"))
      return changestatus;
    else if (fieldName.equalsIgnoreCase("LOCKCAUSE"))
      return lockcause;
    else if (fieldName.equalsIgnoreCase("ORDEREDQTY"))
      return orderedqty;
    else if (fieldName.equalsIgnoreCase("LOCKDATE"))
      return lockdate;
    else if (fieldName.equalsIgnoreCase("REQSTATUS"))
      return reqstatus;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("M_REQUISITION_ID") || fieldName.equals("mRequisitionId"))
      return mRequisitionId;
    else if (fieldName.equalsIgnoreCase("M_REQUISITIONLINE_ID") || fieldName.equals("mRequisitionlineId"))
      return mRequisitionlineId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
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
  public static Lines4AF6EC5A157545958201842DF529BE81Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mRequisitionId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, mRequisitionId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Lines4AF6EC5A157545958201842DF529BE81Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mRequisitionId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_RequisitionLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_RequisitionLine.CreatedBy) as CreatedByR, " +
      "        to_char(M_RequisitionLine.Updated, ?) as updated, " +
      "        to_char(M_RequisitionLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_RequisitionLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_RequisitionLine.UpdatedBy) as UpdatedByR," +
      "        M_RequisitionLine.Line, " +
      "M_RequisitionLine.Needbydate, " +
      "M_RequisitionLine.M_Product_ID, " +
      "(CASE WHEN M_RequisitionLine.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "M_RequisitionLine.M_AttributeSetInstance_ID, " +
      "(CASE WHEN M_RequisitionLine.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "M_RequisitionLine.Qty, " +
      "M_RequisitionLine.C_UOM_ID, " +
      "(CASE WHEN M_RequisitionLine.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "M_RequisitionLine.C_BPartner_ID, " +
      "(CASE WHEN M_RequisitionLine.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "M_RequisitionLine.M_PriceList_ID, " +
      "(CASE WHEN M_RequisitionLine.M_PriceList_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "M_RequisitionLine.PriceActual, " +
      "M_RequisitionLine.LineNetAmt, " +
      "M_RequisitionLine.C_Currency_ID, " +
      "(CASE WHEN M_RequisitionLine.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "M_RequisitionLine.Description, " +
      "M_RequisitionLine.PriceList, " +
      "M_RequisitionLine.Discount, " +
      "M_RequisitionLine.Gross_Unit_Price, " +
      "M_RequisitionLine.Gross_Amt, " +
      "M_RequisitionLine.Internalnotes, " +
      "M_RequisitionLine.Suppliernotes, " +
      "M_RequisitionLine.Lockedby, " +
      "(CASE WHEN M_RequisitionLine.Lockedby IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS LockedbyR, " +
      "M_RequisitionLine.Lockqty, " +
      "M_RequisitionLine.Lockprice, " +
      "M_RequisitionLine.QuantityOrder, " +
      "M_RequisitionLine.M_Product_Uom_Id, " +
      "(CASE WHEN M_RequisitionLine.M_Product_Uom_Id IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL11.Name IS NULL THEN TO_CHAR(table11.Name) ELSE TO_CHAR(tableTRL11.Name) END)), ''))),'') ) END) AS M_Product_Uom_IdR, " +
      "M_RequisitionLine.Changestatus, " +
      "M_RequisitionLine.Lockcause, " +
      "M_RequisitionLine.Orderedqty, " +
      "M_RequisitionLine.Lockdate, " +
      "M_RequisitionLine.Reqstatus, " +
      "M_RequisitionLine.AD_Client_ID, " +
      "M_RequisitionLine.M_Requisition_ID, " +
      "M_RequisitionLine.M_Requisitionline_ID, " +
      "M_RequisitionLine.AD_Org_ID, " +
      "COALESCE(M_RequisitionLine.IsActive, 'N') AS IsActive, " +
      "        ? AS LANGUAGE " +
      "        FROM M_RequisitionLine left join (select M_Product_ID, Name from M_Product) table1 on (M_RequisitionLine.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table3 on (M_RequisitionLine.M_AttributeSetInstance_ID = table3.M_AttributeSetInstance_ID) left join (select C_UOM_ID, Name from C_UOM) table4 on (M_RequisitionLine.C_UOM_ID = table4.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL4 on (table4.C_UOM_ID = tableTRL4.C_UOM_ID and tableTRL4.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table6 on (M_RequisitionLine.C_BPartner_ID = table6.C_BPartner_ID) left join (select M_PriceList_ID, Name from M_PriceList) table7 on (M_RequisitionLine.M_PriceList_ID = table7.M_PriceList_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table8 on (M_RequisitionLine.C_Currency_ID = table8.C_Currency_ID) left join (select AD_User_ID, Name from AD_User) table9 on (M_RequisitionLine.Lockedby =  table9.AD_User_ID) left join (select M_Product_Uom_Id, C_UOM_ID from M_Product_Uom) table10 on (M_RequisitionLine.M_Product_Uom_Id = table10.M_Product_Uom_Id) left join (select C_UOM_ID, Name from C_UOM) table11 on (table10.C_UOM_ID = table11.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL11 on (table11.C_UOM_ID = tableTRL11.C_UOM_ID and tableTRL11.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((mRequisitionId==null || mRequisitionId.equals(""))?"":"  AND M_RequisitionLine.M_Requisition_ID = ?  ");
    strSql = strSql + 
      "        AND M_RequisitionLine.M_Requisitionline_ID = ? " +
      "        AND M_RequisitionLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_RequisitionLine.AD_Org_ID IN (";
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
      if (mRequisitionId != null && !(mRequisitionId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
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
        Lines4AF6EC5A157545958201842DF529BE81Data objectLines4AF6EC5A157545958201842DF529BE81Data = new Lines4AF6EC5A157545958201842DF529BE81Data();
        objectLines4AF6EC5A157545958201842DF529BE81Data.created = UtilSql.getValue(result, "CREATED");
        objectLines4AF6EC5A157545958201842DF529BE81Data.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.updated = UtilSql.getValue(result, "UPDATED");
        objectLines4AF6EC5A157545958201842DF529BE81Data.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectLines4AF6EC5A157545958201842DF529BE81Data.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectLines4AF6EC5A157545958201842DF529BE81Data.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.line = UtilSql.getValue(result, "LINE");
        objectLines4AF6EC5A157545958201842DF529BE81Data.needbydate = UtilSql.getDateValue(result, "NEEDBYDATE", "dd-MM-yyyy");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mProductIdr = UtilSql.getValue(result, "M_PRODUCT_IDR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mAttributesetinstanceIdr = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_IDR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.qty = UtilSql.getValue(result, "QTY");
        objectLines4AF6EC5A157545958201842DF529BE81Data.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.cUomIdr = UtilSql.getValue(result, "C_UOM_IDR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.cBpartnerIdr = UtilSql.getValue(result, "C_BPARTNER_IDR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mPricelistIdr = UtilSql.getValue(result, "M_PRICELIST_IDR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectLines4AF6EC5A157545958201842DF529BE81Data.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectLines4AF6EC5A157545958201842DF529BE81Data.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.description = UtilSql.getValue(result, "DESCRIPTION");
        objectLines4AF6EC5A157545958201842DF529BE81Data.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectLines4AF6EC5A157545958201842DF529BE81Data.discount = UtilSql.getValue(result, "DISCOUNT");
        objectLines4AF6EC5A157545958201842DF529BE81Data.grossUnitPrice = UtilSql.getValue(result, "GROSS_UNIT_PRICE");
        objectLines4AF6EC5A157545958201842DF529BE81Data.grossAmt = UtilSql.getValue(result, "GROSS_AMT");
        objectLines4AF6EC5A157545958201842DF529BE81Data.internalnotes = UtilSql.getValue(result, "INTERNALNOTES");
        objectLines4AF6EC5A157545958201842DF529BE81Data.suppliernotes = UtilSql.getValue(result, "SUPPLIERNOTES");
        objectLines4AF6EC5A157545958201842DF529BE81Data.lockedby = UtilSql.getValue(result, "LOCKEDBY");
        objectLines4AF6EC5A157545958201842DF529BE81Data.lockedbyr = UtilSql.getValue(result, "LOCKEDBYR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.lockqty = UtilSql.getValue(result, "LOCKQTY");
        objectLines4AF6EC5A157545958201842DF529BE81Data.lockprice = UtilSql.getValue(result, "LOCKPRICE");
        objectLines4AF6EC5A157545958201842DF529BE81Data.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mProductUomIdr = UtilSql.getValue(result, "M_PRODUCT_UOM_IDR");
        objectLines4AF6EC5A157545958201842DF529BE81Data.changestatus = UtilSql.getValue(result, "CHANGESTATUS");
        objectLines4AF6EC5A157545958201842DF529BE81Data.lockcause = UtilSql.getValue(result, "LOCKCAUSE");
        objectLines4AF6EC5A157545958201842DF529BE81Data.orderedqty = UtilSql.getValue(result, "ORDEREDQTY");
        objectLines4AF6EC5A157545958201842DF529BE81Data.lockdate = UtilSql.getDateValue(result, "LOCKDATE", "dd-MM-yyyy");
        objectLines4AF6EC5A157545958201842DF529BE81Data.reqstatus = UtilSql.getValue(result, "REQSTATUS");
        objectLines4AF6EC5A157545958201842DF529BE81Data.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mRequisitionId = UtilSql.getValue(result, "M_REQUISITION_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.mRequisitionlineId = UtilSql.getValue(result, "M_REQUISITIONLINE_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectLines4AF6EC5A157545958201842DF529BE81Data.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectLines4AF6EC5A157545958201842DF529BE81Data.language = UtilSql.getValue(result, "LANGUAGE");
        objectLines4AF6EC5A157545958201842DF529BE81Data.adUserClient = "";
        objectLines4AF6EC5A157545958201842DF529BE81Data.adOrgClient = "";
        objectLines4AF6EC5A157545958201842DF529BE81Data.createdby = "";
        objectLines4AF6EC5A157545958201842DF529BE81Data.trBgcolor = "";
        objectLines4AF6EC5A157545958201842DF529BE81Data.totalCount = "";
        objectLines4AF6EC5A157545958201842DF529BE81Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectLines4AF6EC5A157545958201842DF529BE81Data);
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
    Lines4AF6EC5A157545958201842DF529BE81Data objectLines4AF6EC5A157545958201842DF529BE81Data[] = new Lines4AF6EC5A157545958201842DF529BE81Data[vector.size()];
    vector.copyInto(objectLines4AF6EC5A157545958201842DF529BE81Data);
    return(objectLines4AF6EC5A157545958201842DF529BE81Data);
  }

/**
Create a registry
 */
  public static Lines4AF6EC5A157545958201842DF529BE81Data[] set(String mRequisitionId, String cBpartnerId, String cBpartnerIdr, String cUomId, String mProductUomId, String quantityorder, String mAttributesetinstanceId, String mAttributesetinstanceIdr, String reqstatus, String orderedqty, String description, String changestatus, String internalnotes, String suppliernotes, String needbydate, String priceactual, String discount, String cCurrencyId, String lockedby, String lockqty, String lockprice, String mPricelistId, String lockdate, String lockcause, String line, String grossAmt, String mRequisitionlineId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String mProductId, String mProductIdr, String qty, String pricelist, String linenetamt, String grossUnitPrice)    throws ServletException {
    Lines4AF6EC5A157545958201842DF529BE81Data objectLines4AF6EC5A157545958201842DF529BE81Data[] = new Lines4AF6EC5A157545958201842DF529BE81Data[1];
    objectLines4AF6EC5A157545958201842DF529BE81Data[0] = new Lines4AF6EC5A157545958201842DF529BE81Data();
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].created = "";
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].createdbyr = createdbyr;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].updated = "";
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].updatedTimeStamp = "";
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].updatedby = updatedby;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].updatedbyr = updatedbyr;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].line = line;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].needbydate = needbydate;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mProductId = mProductId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mProductIdr = mProductIdr;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mAttributesetinstanceIdr = mAttributesetinstanceIdr;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].qty = qty;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].cUomId = cUomId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].cUomIdr = "";
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].cBpartnerId = cBpartnerId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].cBpartnerIdr = cBpartnerIdr;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mPricelistId = mPricelistId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mPricelistIdr = "";
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].priceactual = priceactual;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].linenetamt = linenetamt;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].cCurrencyId = cCurrencyId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].cCurrencyIdr = "";
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].description = description;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].pricelist = pricelist;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].discount = discount;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].grossUnitPrice = grossUnitPrice;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].grossAmt = grossAmt;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].internalnotes = internalnotes;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].suppliernotes = suppliernotes;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].lockedby = lockedby;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].lockedbyr = "";
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].lockqty = lockqty;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].lockprice = lockprice;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].quantityorder = quantityorder;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mProductUomId = mProductUomId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mProductUomIdr = "";
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].changestatus = changestatus;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].lockcause = lockcause;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].orderedqty = orderedqty;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].lockdate = lockdate;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].reqstatus = reqstatus;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].adClientId = adClientId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mRequisitionId = mRequisitionId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].mRequisitionlineId = mRequisitionlineId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].adOrgId = adOrgId;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].isactive = isactive;
    objectLines4AF6EC5A157545958201842DF529BE81Data[0].language = "";
    return objectLines4AF6EC5A157545958201842DF529BE81Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef1004400000_0(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_BPartner_ID FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_BPartner.C_BPartner_ID = table2.C_BPartner_ID) WHERE C_BPartner.isActive='Y' AND C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_IDR);

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
  public static String selectDef1004400004_1(ConnectionProvider connectionProvider, String M_AttributeSetInstance_IDR)    throws ServletException {
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
  public static String selectDef1004400040(ConnectionProvider connectionProvider, String M_Requisition_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(LINE),0)+10 AS DefaultValue FROM M_REQUISITIONLINE WHERE M_Requisition_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Requisition_ID);

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
  public static String selectDef803547_2(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Createdby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedbyR);

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
  public static String selectDef803549_3(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Updatedby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedbyR);

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
  public static String selectDef803552_4(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_RequisitionLine.M_Requisition_ID AS NAME" +
      "        FROM M_RequisitionLine" +
      "        WHERE M_RequisitionLine.M_Requisitionline_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String mRequisitionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))) AS NAME FROM M_Requisition left join (select M_Requisition_ID, DocumentNo from M_Requisition) table1 on (M_Requisition.M_Requisition_ID = table1.M_Requisition_ID) WHERE M_Requisition.M_Requisition_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String mRequisitionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))) AS NAME FROM M_Requisition left join (select M_Requisition_ID, DocumentNo from M_Requisition) table1 on (M_Requisition.M_Requisition_ID = table1.M_Requisition_ID) WHERE M_Requisition.M_Requisition_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);

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
      "        UPDATE M_RequisitionLine" +
      "        SET Line = TO_NUMBER(?) , Needbydate = TO_DATE(?) , M_Product_ID = (?) , M_AttributeSetInstance_ID = (?) , Qty = TO_NUMBER(?) , C_UOM_ID = (?) , C_BPartner_ID = (?) , M_PriceList_ID = (?) , PriceActual = TO_NUMBER(?) , LineNetAmt = TO_NUMBER(?) , C_Currency_ID = (?) , Description = (?) , PriceList = TO_NUMBER(?) , Discount = TO_NUMBER(?) , Gross_Unit_Price = TO_NUMBER(?) , Gross_Amt = TO_NUMBER(?) , Internalnotes = (?) , Suppliernotes = (?) , Lockedby = (?) , Lockqty = TO_NUMBER(?) , Lockprice = TO_NUMBER(?) , QuantityOrder = TO_NUMBER(?) , M_Product_Uom_Id = (?) , Changestatus = (?) , Lockcause = (?) , Orderedqty = TO_NUMBER(?) , Lockdate = TO_DATE(?) , Reqstatus = (?) , AD_Client_ID = (?) , M_Requisition_ID = (?) , M_Requisitionline_ID = (?) , AD_Org_ID = (?) , IsActive = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_RequisitionLine.M_Requisitionline_ID = ? " +
      "                 AND M_RequisitionLine.M_Requisition_ID = ? " +
      "        AND M_RequisitionLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_RequisitionLine.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, needbydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossAmt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, internalnotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, suppliernotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, changestatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockcause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reqstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
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
      "        INSERT INTO M_RequisitionLine " +
      "        (Line, Needbydate, M_Product_ID, M_AttributeSetInstance_ID, Qty, C_UOM_ID, C_BPartner_ID, M_PriceList_ID, PriceActual, LineNetAmt, C_Currency_ID, Description, PriceList, Discount, Gross_Unit_Price, Gross_Amt, Internalnotes, Suppliernotes, Lockedby, Lockqty, Lockprice, QuantityOrder, M_Product_Uom_Id, Changestatus, Lockcause, Orderedqty, Lockdate, Reqstatus, AD_Client_ID, M_Requisition_ID, M_Requisitionline_ID, AD_Org_ID, IsActive, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), TO_DATE(?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, needbydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossUnitPrice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grossAmt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, internalnotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, suppliernotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, changestatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockcause);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reqstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String mRequisitionId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM M_RequisitionLine" +
      "        WHERE M_RequisitionLine.M_Requisitionline_ID = ? " +
      "                 AND M_RequisitionLine.M_Requisition_ID = ? " +
      "        AND M_RequisitionLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_RequisitionLine.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
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
      "          FROM M_RequisitionLine" +
      "         WHERE M_RequisitionLine.M_Requisitionline_ID = ? ";

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
      "          FROM M_RequisitionLine" +
      "         WHERE M_RequisitionLine.M_Requisitionline_ID = ? ";

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
