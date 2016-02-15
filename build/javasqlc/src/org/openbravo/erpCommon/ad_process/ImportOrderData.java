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
import org.openbravo.database.RDBMSIndependent;
import org.openbravo.exception.*;

class ImportOrderData implements FieldProvider {
static Logger log4j = Logger.getLogger(ImportOrderData.class);
  private String InitRecordNumber="0";
  public String iOrderId;
  public String cBpartnerId;
  public String bpartnervalue;
  public String cBpartnerLocationId;
  public String addr;
  public String contactname;
  public String email;
  public String adClientId;
  public String adOrgId;
  public String name;
  public String adOrgtrxId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String iIsimported;
  public String iErrormsg;
  public String processing;
  public String processed;
  public String salesrepId;
  public String mWarehouseId;
  public String mPricelistId;
  public String cCurrencyId;
  public String mShipperId;
  public String issotrx;
  public String billtoId;
  public String cLocationId;
  public String address1;
  public String address2;
  public String postal;
  public String city;
  public String cRegionId;
  public String regionname;
  public String cCountryId;
  public String countrycode;
  public String adUserId;
  public String phone;
  public String cProjectId;
  public String cActivityId;
  public String cDoctypeId;
  public String doctypename;
  public String cPaymenttermId;
  public String paymenttermvalue;
  public String cOrderId;
  public String documentno;
  public String description;
  public String mProductId;
  public String attributesetident;
  public String productvalue;
  public String upc;
  public String sku;
  public String cTaxId;
  public String taxindicator;
  public String taxamt;
  public String cOrderlineId;
  public String linedescription;
  public String cUomId;
  public String qtyordered;
  public String priceactual;
  public String cCampaignId;
  public String dateordered;
  public String datepromised;
  public String orderReferenceno;
  public String bpartnerupc;
  public String billtoUpc;
  public String cBpartnerLocationUpc;
  public String vendorUpc;
  public String performPost;
  public String paymentrule1;
  public String paymentamount1;
  public String paymentrule2;
  public String paymentamount2;
  public String cDebtPaymentId;
  public String isserno;
  public String islot;
  public String isguaranteedate;
  public String islockable;
  public String mattributeid;
  public String attributevalue;
  public String attributevalueid;
  public String mAttributesetinstanceId;
  public String islist;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("I_ORDER_ID") || fieldName.equals("iOrderId"))
      return iOrderId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("BPARTNERVALUE"))
      return bpartnervalue;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("ADDR"))
      return addr;
    else if (fieldName.equalsIgnoreCase("CONTACTNAME"))
      return contactname;
    else if (fieldName.equalsIgnoreCase("EMAIL"))
      return email;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
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
    else if (fieldName.equalsIgnoreCase("I_ISIMPORTED") || fieldName.equals("iIsimported"))
      return iIsimported;
    else if (fieldName.equalsIgnoreCase("I_ERRORMSG") || fieldName.equals("iErrormsg"))
      return iErrormsg;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("M_SHIPPER_ID") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("BILLTO_ID") || fieldName.equals("billtoId"))
      return billtoId;
    else if (fieldName.equalsIgnoreCase("C_LOCATION_ID") || fieldName.equals("cLocationId"))
      return cLocationId;
    else if (fieldName.equalsIgnoreCase("ADDRESS1"))
      return address1;
    else if (fieldName.equalsIgnoreCase("ADDRESS2"))
      return address2;
    else if (fieldName.equalsIgnoreCase("POSTAL"))
      return postal;
    else if (fieldName.equalsIgnoreCase("CITY"))
      return city;
    else if (fieldName.equalsIgnoreCase("C_REGION_ID") || fieldName.equals("cRegionId"))
      return cRegionId;
    else if (fieldName.equalsIgnoreCase("REGIONNAME"))
      return regionname;
    else if (fieldName.equalsIgnoreCase("C_COUNTRY_ID") || fieldName.equals("cCountryId"))
      return cCountryId;
    else if (fieldName.equalsIgnoreCase("COUNTRYCODE"))
      return countrycode;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("PHONE"))
      return phone;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("DOCTYPENAME"))
      return doctypename;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_ID") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("PAYMENTTERMVALUE"))
      return paymenttermvalue;
    else if (fieldName.equalsIgnoreCase("C_ORDER_ID") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("ATTRIBUTESETIDENT"))
      return attributesetident;
    else if (fieldName.equalsIgnoreCase("PRODUCTVALUE"))
      return productvalue;
    else if (fieldName.equalsIgnoreCase("UPC"))
      return upc;
    else if (fieldName.equalsIgnoreCase("SKU"))
      return sku;
    else if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("TAXINDICATOR"))
      return taxindicator;
    else if (fieldName.equalsIgnoreCase("TAXAMT"))
      return taxamt;
    else if (fieldName.equalsIgnoreCase("C_ORDERLINE_ID") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("LINEDESCRIPTION"))
      return linedescription;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("QTYORDERED"))
      return qtyordered;
    else if (fieldName.equalsIgnoreCase("PRICEACTUAL"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("DATEPROMISED"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("ORDER_REFERENCENO") || fieldName.equals("orderReferenceno"))
      return orderReferenceno;
    else if (fieldName.equalsIgnoreCase("BPARTNERUPC"))
      return bpartnerupc;
    else if (fieldName.equalsIgnoreCase("BILLTO_UPC") || fieldName.equals("billtoUpc"))
      return billtoUpc;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_UPC") || fieldName.equals("cBpartnerLocationUpc"))
      return cBpartnerLocationUpc;
    else if (fieldName.equalsIgnoreCase("VENDOR_UPC") || fieldName.equals("vendorUpc"))
      return vendorUpc;
    else if (fieldName.equalsIgnoreCase("PERFORM_POST") || fieldName.equals("performPost"))
      return performPost;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE1"))
      return paymentrule1;
    else if (fieldName.equalsIgnoreCase("PAYMENTAMOUNT1"))
      return paymentamount1;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE2"))
      return paymentrule2;
    else if (fieldName.equalsIgnoreCase("PAYMENTAMOUNT2"))
      return paymentamount2;
    else if (fieldName.equalsIgnoreCase("C_DEBT_PAYMENT_ID") || fieldName.equals("cDebtPaymentId"))
      return cDebtPaymentId;
    else if (fieldName.equalsIgnoreCase("ISSERNO"))
      return isserno;
    else if (fieldName.equalsIgnoreCase("ISLOT"))
      return islot;
    else if (fieldName.equalsIgnoreCase("ISGUARANTEEDATE"))
      return isguaranteedate;
    else if (fieldName.equalsIgnoreCase("ISLOCKABLE"))
      return islockable;
    else if (fieldName.equalsIgnoreCase("MATTRIBUTEID"))
      return mattributeid;
    else if (fieldName.equalsIgnoreCase("ATTRIBUTEVALUE"))
      return attributevalue;
    else if (fieldName.equalsIgnoreCase("ATTRIBUTEVALUEID"))
      return attributevalueid;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("ISLIST"))
      return islist;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ImportOrderData[] select(ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    return select(connectionProvider, ad_client_id, 0, 0);
  }

  public static ImportOrderData[] select(ConnectionProvider connectionProvider, String ad_client_id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				SELECT I_Order_ID, C_BPartner_ID, BPartnerValue, C_BPartner_Location_ID," +
      "				COALESCE (Address1,Address2,City) AS Addr, ContactName, Email," +
      "				AD_Client_ID, AD_Org_ID, Name, AD_OrgTrx_ID, isActive, created, createdBy, updated, updatedBy," +
      "				I_IsImported, I_ErrorMsg, processing, processed, SalesRep_ID, M_Warehouse_ID, M_Pricelist_ID," +
      "				C_Currency_ID, M_Shipper_ID, isSOTRX, billTo_ID, C_Location_ID, Address1, Address2, Postal, City," +
      "				C_Region_ID, RegionName, C_Country_ID, CountryCode, AD_User_ID, Phone, C_Project_ID, C_Activity_ID," +
      "				C_DocType_ID, DocTypeName, C_PaymentTerm_ID, PaymentTermValue, C_Order_ID, DocumentNo, Description," +
      "				M_Product_ID, AttributesetIdent, ProductValue, UPC, SKU, C_Tax_ID, TaxIndicator, TaxAmt, C_OrderLine_ID, LineDescription," +
      "				C_UOM_ID, QtyOrdered, PriceActual, C_Campaign_ID, DateOrdered, DatePromised, Order_ReferenceNo," +
      "				BPartnerUPC, BillTo_UPC, C_BPartner_Location_UPC, Vendor_UPC, Perform_Post, Paymentrule1, Paymentamount1, Paymentrule2, Paymentamount2," +
      "				'' AS c_debt_payment_id, '' AS IsSerno, '' AS IsLot, '' AS IsGuaranteeDate, '' AS IsLockable, '' AS mAttributeId, " +
      "				'' AS AttributeValue, '' AS AttributeValueID, M_AttributesetInstance_ID, '' AS IsList" +
      "				FROM I_Order" +
      "				WHERE I_IsImported='N'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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
        ImportOrderData objectImportOrderData = new ImportOrderData();
        objectImportOrderData.iOrderId = UtilSql.getValue(result, "I_ORDER_ID");
        objectImportOrderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectImportOrderData.bpartnervalue = UtilSql.getValue(result, "BPARTNERVALUE");
        objectImportOrderData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectImportOrderData.addr = UtilSql.getValue(result, "ADDR");
        objectImportOrderData.contactname = UtilSql.getValue(result, "CONTACTNAME");
        objectImportOrderData.email = UtilSql.getValue(result, "EMAIL");
        objectImportOrderData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectImportOrderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectImportOrderData.name = UtilSql.getValue(result, "NAME");
        objectImportOrderData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectImportOrderData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectImportOrderData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectImportOrderData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectImportOrderData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectImportOrderData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectImportOrderData.iIsimported = UtilSql.getValue(result, "I_ISIMPORTED");
        objectImportOrderData.iErrormsg = UtilSql.getValue(result, "I_ERRORMSG");
        objectImportOrderData.processing = UtilSql.getValue(result, "PROCESSING");
        objectImportOrderData.processed = UtilSql.getValue(result, "PROCESSED");
        objectImportOrderData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectImportOrderData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectImportOrderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectImportOrderData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectImportOrderData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectImportOrderData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectImportOrderData.billtoId = UtilSql.getValue(result, "BILLTO_ID");
        objectImportOrderData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectImportOrderData.address1 = UtilSql.getValue(result, "ADDRESS1");
        objectImportOrderData.address2 = UtilSql.getValue(result, "ADDRESS2");
        objectImportOrderData.postal = UtilSql.getValue(result, "POSTAL");
        objectImportOrderData.city = UtilSql.getValue(result, "CITY");
        objectImportOrderData.cRegionId = UtilSql.getValue(result, "C_REGION_ID");
        objectImportOrderData.regionname = UtilSql.getValue(result, "REGIONNAME");
        objectImportOrderData.cCountryId = UtilSql.getValue(result, "C_COUNTRY_ID");
        objectImportOrderData.countrycode = UtilSql.getValue(result, "COUNTRYCODE");
        objectImportOrderData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectImportOrderData.phone = UtilSql.getValue(result, "PHONE");
        objectImportOrderData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectImportOrderData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectImportOrderData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectImportOrderData.doctypename = UtilSql.getValue(result, "DOCTYPENAME");
        objectImportOrderData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectImportOrderData.paymenttermvalue = UtilSql.getValue(result, "PAYMENTTERMVALUE");
        objectImportOrderData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectImportOrderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectImportOrderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectImportOrderData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectImportOrderData.attributesetident = UtilSql.getValue(result, "ATTRIBUTESETIDENT");
        objectImportOrderData.productvalue = UtilSql.getValue(result, "PRODUCTVALUE");
        objectImportOrderData.upc = UtilSql.getValue(result, "UPC");
        objectImportOrderData.sku = UtilSql.getValue(result, "SKU");
        objectImportOrderData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectImportOrderData.taxindicator = UtilSql.getValue(result, "TAXINDICATOR");
        objectImportOrderData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectImportOrderData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectImportOrderData.linedescription = UtilSql.getValue(result, "LINEDESCRIPTION");
        objectImportOrderData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectImportOrderData.qtyordered = UtilSql.getValue(result, "QTYORDERED");
        objectImportOrderData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectImportOrderData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectImportOrderData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectImportOrderData.datepromised = UtilSql.getDateValue(result, "DATEPROMISED", "dd-MM-yyyy");
        objectImportOrderData.orderReferenceno = UtilSql.getValue(result, "ORDER_REFERENCENO");
        objectImportOrderData.bpartnerupc = UtilSql.getValue(result, "BPARTNERUPC");
        objectImportOrderData.billtoUpc = UtilSql.getValue(result, "BILLTO_UPC");
        objectImportOrderData.cBpartnerLocationUpc = UtilSql.getValue(result, "C_BPARTNER_LOCATION_UPC");
        objectImportOrderData.vendorUpc = UtilSql.getValue(result, "VENDOR_UPC");
        objectImportOrderData.performPost = UtilSql.getValue(result, "PERFORM_POST");
        objectImportOrderData.paymentrule1 = UtilSql.getValue(result, "PAYMENTRULE1");
        objectImportOrderData.paymentamount1 = UtilSql.getValue(result, "PAYMENTAMOUNT1");
        objectImportOrderData.paymentrule2 = UtilSql.getValue(result, "PAYMENTRULE2");
        objectImportOrderData.paymentamount2 = UtilSql.getValue(result, "PAYMENTAMOUNT2");
        objectImportOrderData.cDebtPaymentId = UtilSql.getValue(result, "C_DEBT_PAYMENT_ID");
        objectImportOrderData.isserno = UtilSql.getValue(result, "ISSERNO");
        objectImportOrderData.islot = UtilSql.getValue(result, "ISLOT");
        objectImportOrderData.isguaranteedate = UtilSql.getValue(result, "ISGUARANTEEDATE");
        objectImportOrderData.islockable = UtilSql.getValue(result, "ISLOCKABLE");
        objectImportOrderData.mattributeid = UtilSql.getValue(result, "MATTRIBUTEID");
        objectImportOrderData.attributevalue = UtilSql.getValue(result, "ATTRIBUTEVALUE");
        objectImportOrderData.attributevalueid = UtilSql.getValue(result, "ATTRIBUTEVALUEID");
        objectImportOrderData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectImportOrderData.islist = UtilSql.getValue(result, "ISLIST");
        objectImportOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportOrderData);
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
    ImportOrderData objectImportOrderData[] = new ImportOrderData[vector.size()];
    vector.copyInto(objectImportOrderData);
    return(objectImportOrderData);
  }

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order SET" +
      "					BPartnerValue=?," +
      "					Name=?," +
      "					C_BPartner_id = ?," +
      "					C_Location_id = ?," +
      "					C_BPartner_Location_id = ?," +
      "					billTo_id = ?," +
      "					AD_User_id = ?," +
      "					Updated=TO_DATE(now())," +
      "					UpdatEDBY = ?," +
      "					C_Order_id = ?," +
      "					C_Tax_id = ?," +
      "					C_OrderLine_id = ?," +
      "					I_IsImported=?," +
      "					Processed=?," +
      "					Order_ReferenceNo=?" +
      "				WHERE I_Order_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpartnervalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iIsimported);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderReferenceno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iOrderId);

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

  public static ImportOrderData[] selectWithoutBP(ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    return selectWithoutBP(connectionProvider, ad_client_id, 0, 0);
  }

  public static ImportOrderData[] selectWithoutBP(ConnectionProvider connectionProvider, String ad_client_id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				SELECT I_Order_ID, C_BPartner_ID, BPartnerValue, C_BPartner_Location_ID," +
      "          Address1, Address2, City, ContactName, Email," +
      "          AD_Client_ID, AD_Org_ID, Name, AD_OrgTrx_ID, isActive, created, createdBy, updated, updatedBy," +
      "          I_IsImported, I_ErrorMsg, processing, processed, SalesRep_ID, M_Warehouse_ID, M_Pricelist_ID," +
      "          C_Currency_ID, M_Shipper_ID, isSOTRX, billTo_ID, C_Location_ID, Address1, Address2, Postal, City," +
      "          C_Region_ID, RegionName, C_Country_ID, CountryCode, AD_User_ID, Phone, C_Project_ID, C_Activity_ID," +
      "          C_DocType_ID, DocTypeName, C_PaymentTerm_ID, PaymentTermValue, C_Order_ID, DocumentNo, Description," +
      "          M_Product_ID, ProductValue, UPC, SKU, C_Tax_ID, TaxIndicator, TaxAmt, C_OrderLine_ID, LineDescription," +
      "          C_UOM_ID, QtyOrdered, PriceActual, C_Campaign_ID, DateOrdered, DatePromised, Order_ReferenceNo," +
      "          BPartnerUPC, BillTo_UPC, C_BPartner_Location_UPC, Perform_Post, Paymentrule1, Paymentamount1, Paymentrule2, Paymentamount2" +
      "        FROM I_Order" +
      "				WHERE I_IsImported='N'" +
      "				AND synchronized = 'Y'" +
      "				AND C_BPartner_ID IS NULL" +
      "				AND AD_Client_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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
        ImportOrderData objectImportOrderData = new ImportOrderData();
        objectImportOrderData.iOrderId = UtilSql.getValue(result, "I_ORDER_ID");
        objectImportOrderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectImportOrderData.bpartnervalue = UtilSql.getValue(result, "BPARTNERVALUE");
        objectImportOrderData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectImportOrderData.address1 = UtilSql.getValue(result, "ADDRESS1");
        objectImportOrderData.address2 = UtilSql.getValue(result, "ADDRESS2");
        objectImportOrderData.city = UtilSql.getValue(result, "CITY");
        objectImportOrderData.contactname = UtilSql.getValue(result, "CONTACTNAME");
        objectImportOrderData.email = UtilSql.getValue(result, "EMAIL");
        objectImportOrderData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectImportOrderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectImportOrderData.name = UtilSql.getValue(result, "NAME");
        objectImportOrderData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectImportOrderData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectImportOrderData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectImportOrderData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectImportOrderData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectImportOrderData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectImportOrderData.iIsimported = UtilSql.getValue(result, "I_ISIMPORTED");
        objectImportOrderData.iErrormsg = UtilSql.getValue(result, "I_ERRORMSG");
        objectImportOrderData.processing = UtilSql.getValue(result, "PROCESSING");
        objectImportOrderData.processed = UtilSql.getValue(result, "PROCESSED");
        objectImportOrderData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectImportOrderData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectImportOrderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectImportOrderData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectImportOrderData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectImportOrderData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectImportOrderData.billtoId = UtilSql.getValue(result, "BILLTO_ID");
        objectImportOrderData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectImportOrderData.address1 = UtilSql.getValue(result, "ADDRESS1");
        objectImportOrderData.address2 = UtilSql.getValue(result, "ADDRESS2");
        objectImportOrderData.postal = UtilSql.getValue(result, "POSTAL");
        objectImportOrderData.city = UtilSql.getValue(result, "CITY");
        objectImportOrderData.cRegionId = UtilSql.getValue(result, "C_REGION_ID");
        objectImportOrderData.regionname = UtilSql.getValue(result, "REGIONNAME");
        objectImportOrderData.cCountryId = UtilSql.getValue(result, "C_COUNTRY_ID");
        objectImportOrderData.countrycode = UtilSql.getValue(result, "COUNTRYCODE");
        objectImportOrderData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectImportOrderData.phone = UtilSql.getValue(result, "PHONE");
        objectImportOrderData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectImportOrderData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectImportOrderData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectImportOrderData.doctypename = UtilSql.getValue(result, "DOCTYPENAME");
        objectImportOrderData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectImportOrderData.paymenttermvalue = UtilSql.getValue(result, "PAYMENTTERMVALUE");
        objectImportOrderData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectImportOrderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectImportOrderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectImportOrderData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectImportOrderData.productvalue = UtilSql.getValue(result, "PRODUCTVALUE");
        objectImportOrderData.upc = UtilSql.getValue(result, "UPC");
        objectImportOrderData.sku = UtilSql.getValue(result, "SKU");
        objectImportOrderData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectImportOrderData.taxindicator = UtilSql.getValue(result, "TAXINDICATOR");
        objectImportOrderData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectImportOrderData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectImportOrderData.linedescription = UtilSql.getValue(result, "LINEDESCRIPTION");
        objectImportOrderData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectImportOrderData.qtyordered = UtilSql.getValue(result, "QTYORDERED");
        objectImportOrderData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectImportOrderData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectImportOrderData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectImportOrderData.datepromised = UtilSql.getDateValue(result, "DATEPROMISED", "dd-MM-yyyy");
        objectImportOrderData.orderReferenceno = UtilSql.getValue(result, "ORDER_REFERENCENO");
        objectImportOrderData.bpartnerupc = UtilSql.getValue(result, "BPARTNERUPC");
        objectImportOrderData.billtoUpc = UtilSql.getValue(result, "BILLTO_UPC");
        objectImportOrderData.cBpartnerLocationUpc = UtilSql.getValue(result, "C_BPARTNER_LOCATION_UPC");
        objectImportOrderData.performPost = UtilSql.getValue(result, "PERFORM_POST");
        objectImportOrderData.paymentrule1 = UtilSql.getValue(result, "PAYMENTRULE1");
        objectImportOrderData.paymentamount1 = UtilSql.getValue(result, "PAYMENTAMOUNT1");
        objectImportOrderData.paymentrule2 = UtilSql.getValue(result, "PAYMENTRULE2");
        objectImportOrderData.paymentamount2 = UtilSql.getValue(result, "PAYMENTAMOUNT2");
        objectImportOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportOrderData);
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
    ImportOrderData objectImportOrderData[] = new ImportOrderData[vector.size()];
    vector.copyInto(objectImportOrderData);
    return(objectImportOrderData);
  }

  public static int deleteOld(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			DELETE FROM I_Order WHERE I_IsImported='Y'" +
      "			AND synchronized = 'Y'" +
      "			AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRecords(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET AD_Client_ID = COALESCE(AD_Client_ID, ?)," +
      "				AD_Org_ID = COALESCE(AD_Org_ID, '0')," +
      "				IsActive = COALESCE(IsActive, 'Y')," +
      "				Created = COALESCE(Created, TO_DATE(now()))," +
      "				CreatedBy = COALESCE(CreatedBy, '0')," +
      "				Updated = COALESCE(Updated, TO_DATE(now()))," +
      "				UpdatedBy = COALESCE(UpdatedBy, '0')," +
      "				I_ErrorMsg = NULL," +
      "				I_IsImported = 'N' " +
      "				WHERE I_IsImported<>'Y' OR I_IsImported IS NULL" +
      "				AND synchronized = 'Y'";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRecordsError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		UPDATE I_Order " +
      "		SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Org, '" +
      "		WHERE (AD_Org_ID IS NULL OR AD_Org_ID='0'" +
      "		OR EXISTS (SELECT * FROM AD_Org oo WHERE I_Order.AD_Org_ID=oo.AD_Org_ID AND (oo.IsActive='N')))" +
      "		AND I_IsImported<>'Y'" +
      "		AND synchronized = 'Y'" +
      "		AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateInvalidVendor(Connection conn, ConnectionProvider connectionProvider, String adOrgId, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				update i_order" +
      "        SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Vendor, '" +
      "        where vendor_upc IS NOT NULL " +
      "        AND synchronized = 'Y'" +
      "        AND (vendor_upc <> (" +
      "          select upc" +
      "          from ad_org" +
      "          where ad_org_id = ?" +
      "        )" +
      "        or not exists (" +
      "          select 1" +
      "          from ad_org" +
      "          where ad_org_id = ?" +
      "          and upc is not null" +
      "        )" +
      "        and ad_client_id = ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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

  public static int updateDocTypePO(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_DocType_ID=(" +
      "					SELECT C_DocType_ID" +
      "					FROM C_DocType d" +
      "					WHERE d.Name=I_Order.DocTypeName" +
      "					AND d.DocBaseType='POO'" +
      "					AND I_Order.AD_Client_ID=d.AD_Client_ID" +
      "				)" +
      "				WHERE C_DocType_ID IS NULL" +
      "				AND IsSOTrx='N'" +
      "				AND DocTypeName IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateDocTypeSO(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_DocType_ID=(" +
      "					SELECT C_DocType_ID" +
      "					FROM C_DocType d" +
      "					WHERE d.Name=I_Order.DocTypeName" +
      "					AND d.DocBaseType='SOO'" +
      "					AND I_Order.AD_Client_ID=d.AD_Client_ID" +
      "				)" +
      "				WHERE C_DocType_ID IS NULL" +
      "				AND IsSOTrx='Y'" +
      "				AND DocTypeName IS NOT NULL" +
      "				AND I_IsImported<>'Y' " +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateDocType(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_DocType_ID=(" +
      "					SELECT C_DocType_ID" +
      "					FROM C_DocType d" +
      "					WHERE d.Name=I_Order.DocTypeName" +
      "					AND d.DocBaseType IN ('SOO','POO')" +
      "					AND I_Order.AD_Client_ID=d.AD_Client_ID" +
      "				)" +
      "				WHERE C_DocType_ID IS NULL" +
      "				AND DocTypeName IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateDocTypeError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid DocTypeName, '" +
      "				WHERE C_DocType_ID IS NULL" +
      "				AND DocTypeName IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateDocTypePODefault(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_DocType_ID=(" +
      "					SELECT MIN(C_DocType_ID)" +
      "					FROM C_DocType d" +
      "					WHERE d.IsDefault='Y'" +
      "					AND d.DocBaseType='POO'" +
      "					AND I_Order.AD_Client_ID=d.AD_Client_ID" +
      "				)" +
      "				WHERE C_DocType_ID IS NULL" +
      "				AND IsSOTrx='N'" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateDocTypeSODefault(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_DocType_ID=(" +
      "					SELECT MIN(C_DocType_ID)" +
      "					FROM C_DocType d" +
      "					WHERE d.IsDefault='Y'" +
      "					AND d.DocBaseType='SOO'" +
      "					AND I_Order.AD_Client_ID=d.AD_Client_ID" +
      "				)" +
      "				WHERE C_DocType_ID IS NULL" +
      "				AND IsSOTrx='Y'" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateDocTypeDefault(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_DocType_ID=(" +
      "					SELECT MIN(C_DocType_ID)" +
      "					FROM C_DocType d" +
      "					WHERE d.IsDefault='Y'" +
      "					AND d.DocBaseType IN('SOO','POO')" +
      "					AND I_Order.AD_Client_ID=d.AD_Client_ID" +
      "				)" +
      "			  WHERE C_DocType_ID IS NULL" +
      "				AND IsSOTrx IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateDocTypeDefaultError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=No DocType, '" +
      "				WHERE C_DocType_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateIsSOTrxY(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET IsSOTrx='Y'" +
      "				WHERE EXISTS (" +
      "					SELECT *" +
      "					FROM C_DocType d" +
      "					WHERE I_Order.C_DocType_ID=d.C_DocType_ID" +
      "					AND d.DocBaseType='SOO'" +
      "					AND I_Order.AD_Client_ID=d.AD_Client_ID" +
      "				)" +
      "				AND C_DocType_ID IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateIsSOTrxN(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order  SET IsSOTrx='N'" +
      "				WHERE EXISTS (" +
      "					SELECT * FROM C_DocType d" +
      "					WHERE I_Order.C_DocType_ID=d.C_DocType_ID" +
      "					AND d.DocBaseType='POO'" +
      "					AND I_Order.AD_Client_ID=d.AD_Client_ID" +
      "				)" +
      "				AND C_DocType_ID IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateCurrencyDefaultFromPriceList(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE I_Order  " +
      "		SET C_Currency_ID=(" +
      "			SELECT MIN(C_Currency_ID)" +
      "			FROM M_PriceList p" +
      "			WHERE p.M_PriceList_ID=I_Order.M_PriceList_ID" +
      "			AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "			)" +
      "      WHERE C_Currency_ID IS NULL " +
      "      AND I_IsImported<>'Y'" +
      "      AND synchronized = 'Y'" +
      "      AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateInvalidCurrency(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE I_Order " +
      "      SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Currency,' " +
      "      WHERE C_Currency_ID IS NULL" +
      "      AND I_IsImported<>'Y'" +
      "      AND synchronized = 'Y'" +
      "      AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePriceListCurrencyDefault(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET M_PriceList_ID=(" +
      "					SELECT MIN(M_PriceList_ID)" +
      "					FROM M_PriceList p" +
      "					WHERE p.IsDefault='Y'" +
      "					AND p.C_Currency_ID=I_Order.C_Currency_ID" +
      "					AND p.IsSOPriceList=I_Order.IsSOTrx" +
      "					AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "				)" +
      "				WHERE M_PriceList_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePriceListNullCurrencyDefault(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET M_PriceList_ID=(" +
      "					SELECT MIN(M_PriceList_ID)" +
      "					FROM M_PriceList p" +
      "					WHERE p.IsDefault='Y'" +
      "					AND p.IsSOPriceList=I_Order.IsSOTrx" +
      "					AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "				)" +
      "				WHERE M_PriceList_ID IS NULL" +
      "				AND C_Currency_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePriceListCurrency(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET M_PriceList_ID=(" +
      "					SELECT MIN(M_PriceList_ID)" +
      "					FROM M_PriceList p" +
      "					WHERE p.C_Currency_ID=I_Order.C_Currency_ID" +
      "					AND p.IsSOPriceList=I_Order.IsSOTrx" +
      "					AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "				)" +
      "				WHERE M_PriceList_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePriceListNullCurrency(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET M_PriceList_ID=(" +
      "					SELECT MIN(M_PriceList_ID)" +
      "					FROM M_PriceList p" +
      "					WHERE p.IsSOPriceList=I_Order.IsSOTrx" +
      "					AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "				)" +
      "				WHERE M_PriceList_ID IS NULL" +
      "				AND C_Currency_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePriceListError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=No PriceList, '" +
      "				WHERE M_PriceList_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePaymentTerm(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_PaymentTerm_ID=(" +
      "					SELECT C_PaymentTerm_ID" +
      "					FROM C_PaymentTerm p" +
      "					WHERE I_Order.PaymentTermValue=p.Value" +
      "					AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "				)" +
      "				WHERE C_PaymentTerm_ID IS NULL" +
      "				AND PaymentTermValue IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePaymentTermDefault(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_PaymentTerm_ID=(" +
      "					SELECT MIN(C_PaymentTerm_ID)" +
      "					FROM C_PaymentTerm p" +
      "					WHERE p.IsDefault='Y'" +
      "					AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "				)" +
      "				WHERE C_PaymentTerm_ID IS NULL" +
      "				AND I_Order.PaymentTermValue IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePaymentTermError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=No PaymentTerm, '" +
      "				WHERE C_PaymentTerm_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateWarehouse(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET M_Warehouse_ID=(" +
      "					SELECT MIN(M_Warehouse_ID)" +
      "					FROM M_Warehouse w" +
      "					WHERE I_Order.AD_Client_ID=w.AD_Client_ID" +
      "					AND I_Order.AD_Org_ID=w.AD_Org_ID" +
      "				)" +
      "				WHERE M_Warehouse_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateWarehouseOther(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET M_Warehouse_ID=(" +
      "					SELECT M_Warehouse_ID" +
      "					FROM M_Warehouse w" +
      "					WHERE I_Order.AD_Client_ID=w.AD_Client_ID" +
      "				)" +
      "				WHERE M_Warehouse_ID IS NULL" +
      "				AND EXISTS (" +
      "					SELECT AD_Client_ID" +
      "					FROM M_Warehouse w" +
      "					WHERE w.AD_Client_ID=I_Order.AD_Client_ID" +
      "					GROUP BY AD_Client_ID" +
      "					HAVING COUNT(*)=1" +
      "				)" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateWarehouseError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=No Warehouse, '" +
      "				WHERE M_Warehouse_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBPartnerFromEmail(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_BPartner_ID =(" +
      "					SELECT C_BPartner_ID" +
      "					FROM AD_User u" +
      "					WHERE I_Order.EMail=u.EMail" +
      "					AND I_Order.AD_Client_ID=u.AD_Client_ID" +
      "					AND u.C_BPartner_ID IS NOT NULL" +
      "				)," +
      "        AD_User_ID=(" +
      "					SELECT AD_User_ID" +
      "					FROM AD_User u" +
      "					WHERE I_Order.EMail=u.EMail" +
      "					AND I_Order.AD_Client_ID=u.AD_Client_ID" +
      "					AND u.C_BPartner_ID IS NOT NULL" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND EMail IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND BPartnerValue IS NULL" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBPartnerFromContact(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_BPartner_ID= (" +
      "					SELECT C_BPartner_ID" +
      "					FROM AD_User u" +
      "					WHERE I_Order.ContactName=u.Name" +
      "					AND I_Order.AD_Client_ID=u.AD_Client_ID" +
      "					AND u.C_BPartner_ID IS NOT NULL" +
      "				)," +
      "        AD_User_ID=(" +
      "					SELECT AD_User_ID" +
      "					FROM AD_User u" +
      "					WHERE I_Order.ContactName=u.Name" +
      "					AND I_Order.AD_Client_ID=u.AD_Client_ID" +
      "					AND u.C_BPartner_ID IS NOT NULL" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND ContactName IS NOT NULL" +
      "				AND EXISTS (" +
      "					SELECT Name" +
      "					FROM AD_User u" +
      "					WHERE I_Order.ContactName=u.Name" +
      "					AND I_Order.AD_Client_ID=u.AD_Client_ID" +
      "					AND u.C_BPartner_ID IS NOT NULL" +
      "					GROUP BY Name" +
      "					HAVING COUNT(*)=1" +
      "				)" +
      "				AND BPartnerValue IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBPartnerFromValue(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_BPartner_ID=(" +
      "					SELECT MIN(C_BPartner_ID)" +
      "					FROM C_BPartner bp" +
      "					WHERE I_Order.BPartnerValue=bp.Value" +
      "					AND I_Order.AD_Client_ID=bp.AD_Client_ID" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND BPartnerValue IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBPartnerFromName(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_BPartner_ID=(" +
      "					SELECT MIN(C_BPartner_ID)" +
      "					FROM C_BPartner bp" +
      "					WHERE I_Order.name=bp.name" +
      "					AND I_Order.AD_Client_ID=bp.AD_Client_ID" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND Name IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND BPartnerValue IS NULL" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBPartnerFromUPC(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_BPartner_ID=(" +
      "					SELECT MIN(C_BPartner_ID)" +
      "					FROM C_BPartner bp" +
      "					WHERE I_Order.bpartnerupc=bp.UPC" +
      "					AND I_Order.AD_Client_ID=bp.AD_Client_ID" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND BPartnerValue IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBPartnerDefault(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_BPartner_ID=(" +
      "					SELECT C_BPartnerCashTrx_ID" +
      "					FROM AD_ClientInfo c" +
      "					WHERE I_Order.AD_Client_ID=c.AD_Client_ID" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND BPartnerValue IS NULL" +
      "				AND Name IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePriceListFromBPartner(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				update i_order " +
      "				set m_pricelist_id = (" +
      "					select bp.m_pricelist_id" +
      "					from c_bpartner bp" +
      "					where c_bpartner_id=I_Order.c_bpartner_id" +
      "				) " +
      "				where m_pricelist_id is null" +
      "				and c_bpartner_id is not null" +
      "				and i_isimported <> 'Y'" +
      "				AND synchronized = 'Y'" +
      "				and I_Order.issotrx = 'Y'" +
      "				and ad_client_id = ?" +
      "				and exists (" +
      "					select 1" +
      "					from c_bpartner bp" +
      "					where bp.c_bpartner_id = I_Order.c_bpartner_id" +
      "					and bp.m_pricelist_id is not null" +
      "				)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePOPriceListFromBPartner(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				update i_order " +
      "				set m_pricelist_id = (" +
      "					select bp.po_pricelist_id" +
      "					from c_bpartner bp" +
      "					where c_bpartner_id=I_Order.c_bpartner_id" +
      "				)" +
      "				where c_bpartner_id is not null" +
      "				and i_isimported <> 'Y'" +
      "				AND synchronized = 'Y'" +
      "				and I_Order.issotrx = 'N'" +
      "				and ad_client_id = ?" +
      "				and exists (" +
      "					select 1" +
      "					from c_bpartner bp" +
      "					where bp.c_bpartner_id = I_Order.c_bpartner_id" +
      "					and bp.m_pricelist_id is not null" +
      "				)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePaymentTermFromBPartner(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				update i_order " +
      "				set c_paymentterm_id = (" +
      "					select bp.c_paymentterm_id" +
      "					from c_bpartner bp" +
      "					where c_bpartner_id=I_Order.c_bpartner_id" +
      "				)" +
      "				where c_bpartner_id is not null" +
      "				and i_isimported <> 'Y'" +
      "				AND synchronized = 'Y'" +
      "				and I_Order.issotrx = 'Y'" +
      "				and ad_client_id = ?" +
      "				and exists (" +
      "					select 1" +
      "					from c_bpartner bp" +
      "					where bp.c_bpartner_id = I_Order.c_bpartner_id" +
      "					and bp.c_paymentterm_id is not null" +
      "				)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePOPaymentTermFromBPartner(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				update i_order " +
      "				set c_paymentterm_id = (" +
      "					select bp.po_paymentterm_id" +
      "					from c_bpartner bp" +
      "					where c_bpartner_id=I_Order.c_bpartner_id" +
      "				)" +
      "				where c_bpartner_id is not null" +
      "				and i_isimported <> 'Y'" +
      "				AND synchronized = 'Y'" +
      "				and I_Order.issotrx = 'N'" +
      "				and ad_client_id = ?" +
      "				and exists (" +
      "					select 1" +
      "					from c_bpartner bp" +
      "					where bp.c_bpartner_id = I_Order.c_bpartner_id" +
      "					and bp.c_paymentterm_id is not null" +
      "				)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateLocationByUPC(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				update i_order " +
      "				set c_bpartner_location_id = (" +
      "					select MIN(c_bpartner_location_id)" +
      "					from c_bpartner_location bpl" +
      "					where bpl.UPC=I_Order.c_bpartner_location_upc" +
      "					and bpl.ad_client_id = I_Order.ad_client_id" +
      "				)" +
      "				where i_isimported='N'" +
      "				AND synchronized = 'Y'" +
      "				and I_Order.c_bpartner_location_id is null" +
      "				and I_Order.c_bpartner_location_upc is not null" +
      "				and ad_client_id = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBilltoByUPC(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				update i_order " +
      "				set billto_id = (" +
      "					select c_bpartner_location_id" +
      "					from c_bpartner_location bpl" +
      "					where bpl.UPC=I_Order.billto_upc" +
      "					and bpl.ad_client_id = I_Order.ad_client_id " +
      "				)" +
      "				where i_isimported='N'" +
      "				AND synchronized = 'Y'" +
      "				and I_Order.billto_id is null" +
      "				and I_Order.billto_upc is not null" +
      "				and ad_client_id = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateLocationExisting(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET BillTo_ID =(" +
      "					SELECT C_BPartner_Location_ID" +
      "					FROM C_BPartner_Location bpl INNER JOIN C_Location l ON (bpl.C_Location_ID=l.C_Location_ID)" +
      "					WHERE I_Order.C_BPartner_ID=bpl.C_BPartner_ID" +
      "					AND bpl.AD_Client_ID=I_Order.AD_Client_ID" +
      "					AND DUMP(I_Order.Address1)=DUMP(l.Address1)" +
      "					AND DUMP(I_Order.Address2)=DUMP(l.Address2)" +
      "					AND DUMP(I_Order.City)=DUMP(l.City)" +
      "					AND DUMP(I_Order.Postal)=DUMP(l.Postal)" +
      "					AND DUMP(I_Order.C_Region_ID)=DUMP(l.C_Region_ID)" +
      "					AND DUMP(I_Order.C_Country_ID)=DUMP(l.C_Country_ID)" +
      "				)" +
      "        ,C_BPartner_Location_ID =(" +
      "					SELECT C_BPartner_Location_ID" +
      "					FROM C_BPartner_Location bpl INNER JOIN C_Location l ON (bpl.C_Location_ID=l.C_Location_ID)" +
      "					WHERE I_Order.C_BPartner_ID=bpl.C_BPartner_ID" +
      "					AND bpl.AD_Client_ID=I_Order.AD_Client_ID" +
      "					AND DUMP(I_Order.Address1)=DUMP(l.Address1)" +
      "					AND DUMP(I_Order.Address2)=DUMP(l.Address2)" +
      "					AND DUMP(I_Order.City)=DUMP(l.City)" +
      "					AND DUMP(I_Order.Postal)=DUMP(l.Postal)" +
      "					AND DUMP(I_Order.C_Region_ID)=DUMP(l.C_Region_ID)" +
      "					AND DUMP(I_Order.C_Country_ID)=DUMP(l.C_Country_ID)" +
      "				)" +
      "				WHERE C_BPartner_ID IS NOT NULL" +
      "				AND C_BPartner_Location_ID IS NULL" +
      "				AND I_IsImported='N'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBillLocation(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET BillTo_ID=(" +
      "					SELECT MIN(C_BPartner_Location_ID)" +
      "					FROM C_BPartner_Location l" +
      "					WHERE l.C_BPartner_ID=I_Order.C_BPartner_ID" +
      "					AND I_Order.AD_Client_ID=l.AD_Client_ID" +
      "					AND ((l.IsBillTo='Y' AND I_Order.IsSOTrx='Y') OR (l.IsPayFrom='Y' AND I_Order.IsSOTrx='N'))" +
      "				)" +
      "				WHERE C_BPartner_ID IS NOT NULL" +
      "				AND BillTo_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateLocation(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_BPartner_Location_ID=(" +
      "					SELECT MIN(C_BPartner_Location_ID)" +
      "					FROM C_BPartner_Location l" +
      "					WHERE l.C_BPartner_ID=I_Order.C_BPartner_ID" +
      "					AND I_Order.AD_Client_ID=l.AD_Client_ID" +
      "					AND ((l.IsShipTo='Y' AND I_Order.IsSOTrx='Y') OR I_Order.IsSOTrx='N')" +
      "				)" +
      "				WHERE C_BPartner_ID IS NOT NULL" +
      "				AND C_BPartner_Location_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateLocationError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=No BP Location, '" +
      "				WHERE C_BPartner_ID IS NOT NULL" +
      "				AND (BillTo_ID IS NULL OR C_BPartner_Location_ID IS NULL)" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateCountryDefault(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET CountryCode=(" +
      "					SELECT MIN(CountryCode)" +
      "					FROM C_Country c" +
      "					WHERE c.IsDefault='Y'" +
      "					AND c.AD_Client_ID IN ('0', I_Order.AD_Client_ID)" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND CountryCode IS NULL" +
      "				AND C_Country_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateCountry(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_Country_ID=(" +
      "					SELECT C_Country_ID FROM C_Country c" +
      "					WHERE I_Order.CountryCode=c.CountryCode" +
      "					AND c.AD_Client_ID IN ('0', I_Order.AD_Client_ID)" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND C_Country_ID IS NULL" +
      "				AND CountryCode IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateCountryError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Country, '" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND C_Country_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRegionDefault(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET RegionName=(" +
      "					SELECT MIN(Name) FROM C_Region r" +
      "					WHERE r.IsDefault='Y'" +
      "					AND r.C_Country_ID=I_Order.C_Country_ID" +
      "					AND r.AD_Client_ID IN ('0', I_Order.AD_Client_ID)" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND C_Region_ID IS NULL" +
      "				AND RegionName IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRegion(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_Region_ID=(" +
      "					SELECT C_Region_ID" +
      "					FROM C_Region r" +
      "					WHERE r.Name=UPPER(I_Order.RegionName)" +
      "					AND r.C_Country_ID=I_Order.C_Country_ID" +
      "					AND r.AD_Client_ID IN ('0', I_Order.AD_Client_ID)" +
      "				)" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND C_Region_ID IS NULL" +
      "				AND RegionName IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRegionError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Region, '" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND C_Region_ID IS NULL" +
      "				AND EXISTS (" +
      "					SELECT * FROM C_Country c" +
      "					WHERE c.C_Country_ID=I_Order.C_Country_ID" +
      "					AND c.HasRegion='Y'" +
      "				)" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateProductFromValue(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET M_Product_ID=(" +
      "					SELECT MIN(M_Product_ID)" +
      "					FROM M_Product p" +
      "					WHERE I_Order.ProductValue=p.Value" +
      "					AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "				)" +
      "				WHERE M_Product_ID IS NULL" +
      "				AND ProductValue IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateProductFromUpc(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET M_Product_ID=(" +
      "					SELECT MIN(M_Product_ID)" +
      "					FROM M_Product p" +
      "					WHERE I_Order.UPC=p.UPC" +
      "					AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "				)" +
      "				WHERE M_Product_ID IS NULL" +
      "				AND UPC IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateProductFromSku(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET M_Product_ID=(" +
      "					SELECT MIN(M_Product_ID)" +
      "					FROM M_Product p" +
      "					WHERE I_Order.SKU=p.SKU" +
      "					AND I_Order.AD_Client_ID=p.AD_Client_ID" +
      "				)" +
      "				WHERE M_Product_ID IS NULL" +
      "				AND SKU IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateProductError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Product, '" +
      "				WHERE M_Product_ID IS NULL" +
      "				AND (ProductValue IS NOT NULL OR UPC IS NOT NULL OR SKU IS NOT NULL)" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateTax(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order " +
      "				SET C_Tax_ID=(" +
      "					SELECT MIN(C_Tax_ID) FROM C_Tax t" +
      "					WHERE I_Order.TaxIndicator=t.TaxIndicator" +
      "					AND I_Order.AD_Client_ID=t.AD_Client_ID" +
      "				)" +
      "				WHERE C_Tax_ID IS NULL" +
      "				AND TaxIndicator IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateTaxError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Tax, '" +
      "				WHERE C_Tax_ID IS NULL" +
      "				AND TaxIndicator IS NOT NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBPartnerError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=No BPartner, '" +
      "				WHERE C_BPartner_ID IS NULL" +
      "				AND I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updatePostError(Connection conn, ConnectionProvider connectionProvider, String iErrormsg, String orderReference, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Order" +
      "        SET I_IsImported = 'E',  I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||COALESCE(?,'')" +
      "        WHERE order_referenceno = ?" +
      "        AND synchronized = 'Y'" +
      "        AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iErrormsg);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderReference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int importOrderError(ConnectionProvider connectionProvider, String error, String IOrderID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE I_Order  " +
      "      SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'') || 'Import Order error: ' || ?" +
      "      WHERE synchronized = 'Y' " +
      "      AND I_Order_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, error);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, IOrderID);

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

  public static ImportOrderData[] selectNotImported(ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    return selectNotImported(connectionProvider, ad_client_id, 0, 0);
  }

  public static ImportOrderData[] selectNotImported(ConnectionProvider connectionProvider, String ad_client_id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				SELECT I_Order_ID, C_BPartner_ID, BPartnerValue, C_BPartner_Location_ID," +
      "          Address1, Address2, City, ContactName, Email," +
      "          AD_Client_ID, AD_Org_ID, Name, AD_OrgTrx_ID, isActive, created, createdBy, updated, updatedBy," +
      "          I_IsImported, I_ErrorMsg, processing, processed, SalesRep_ID, M_Warehouse_ID, M_Pricelist_ID," +
      "          C_Currency_ID, M_Shipper_ID, isSOTRX, billTo_ID, C_Location_ID, Address1, Address2, Postal, City," +
      "          C_Region_ID, RegionName, C_Country_ID, CountryCode, AD_User_ID, Phone, C_Project_ID, C_Activity_ID," +
      "          C_DocType_ID, DocTypeName, C_PaymentTerm_ID, PaymentTermValue, C_Order_ID, DocumentNo, Description," +
      "          M_Product_ID, AttributesetIdent, ProductValue, UPC, SKU, C_Tax_ID, TaxIndicator, TaxAmt, C_OrderLine_ID, LineDescription," +
      "          C_UOM_ID, QtyOrdered, PriceActual, C_Campaign_ID, DateOrdered, DatePromised, Order_ReferenceNo," +
      "          BPartnerUPC, BillTo_UPC, C_BPartner_Location_UPC, Perform_Post, Paymentrule1, Paymentamount1, Paymentrule2, Paymentamount2, " +
      "          M_AttributesetInstance_ID" +
      "        FROM I_Order" +
      "				WHERE I_IsImported='N'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?" +
      "				ORDER BY DocumentNo,DateOrdered,AD_Org_ID, DocTypeName, C_BPartner_ID, BillTo_ID, C_BPartner_Location_ID, I_Order_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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
        ImportOrderData objectImportOrderData = new ImportOrderData();
        objectImportOrderData.iOrderId = UtilSql.getValue(result, "I_ORDER_ID");
        objectImportOrderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectImportOrderData.bpartnervalue = UtilSql.getValue(result, "BPARTNERVALUE");
        objectImportOrderData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectImportOrderData.address1 = UtilSql.getValue(result, "ADDRESS1");
        objectImportOrderData.address2 = UtilSql.getValue(result, "ADDRESS2");
        objectImportOrderData.city = UtilSql.getValue(result, "CITY");
        objectImportOrderData.contactname = UtilSql.getValue(result, "CONTACTNAME");
        objectImportOrderData.email = UtilSql.getValue(result, "EMAIL");
        objectImportOrderData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectImportOrderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectImportOrderData.name = UtilSql.getValue(result, "NAME");
        objectImportOrderData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectImportOrderData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectImportOrderData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectImportOrderData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectImportOrderData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectImportOrderData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectImportOrderData.iIsimported = UtilSql.getValue(result, "I_ISIMPORTED");
        objectImportOrderData.iErrormsg = UtilSql.getValue(result, "I_ERRORMSG");
        objectImportOrderData.processing = UtilSql.getValue(result, "PROCESSING");
        objectImportOrderData.processed = UtilSql.getValue(result, "PROCESSED");
        objectImportOrderData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectImportOrderData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectImportOrderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectImportOrderData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectImportOrderData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectImportOrderData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectImportOrderData.billtoId = UtilSql.getValue(result, "BILLTO_ID");
        objectImportOrderData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectImportOrderData.address1 = UtilSql.getValue(result, "ADDRESS1");
        objectImportOrderData.address2 = UtilSql.getValue(result, "ADDRESS2");
        objectImportOrderData.postal = UtilSql.getValue(result, "POSTAL");
        objectImportOrderData.city = UtilSql.getValue(result, "CITY");
        objectImportOrderData.cRegionId = UtilSql.getValue(result, "C_REGION_ID");
        objectImportOrderData.regionname = UtilSql.getValue(result, "REGIONNAME");
        objectImportOrderData.cCountryId = UtilSql.getValue(result, "C_COUNTRY_ID");
        objectImportOrderData.countrycode = UtilSql.getValue(result, "COUNTRYCODE");
        objectImportOrderData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectImportOrderData.phone = UtilSql.getValue(result, "PHONE");
        objectImportOrderData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectImportOrderData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectImportOrderData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectImportOrderData.doctypename = UtilSql.getValue(result, "DOCTYPENAME");
        objectImportOrderData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectImportOrderData.paymenttermvalue = UtilSql.getValue(result, "PAYMENTTERMVALUE");
        objectImportOrderData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectImportOrderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectImportOrderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectImportOrderData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectImportOrderData.attributesetident = UtilSql.getValue(result, "ATTRIBUTESETIDENT");
        objectImportOrderData.productvalue = UtilSql.getValue(result, "PRODUCTVALUE");
        objectImportOrderData.upc = UtilSql.getValue(result, "UPC");
        objectImportOrderData.sku = UtilSql.getValue(result, "SKU");
        objectImportOrderData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectImportOrderData.taxindicator = UtilSql.getValue(result, "TAXINDICATOR");
        objectImportOrderData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectImportOrderData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectImportOrderData.linedescription = UtilSql.getValue(result, "LINEDESCRIPTION");
        objectImportOrderData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectImportOrderData.qtyordered = UtilSql.getValue(result, "QTYORDERED");
        objectImportOrderData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectImportOrderData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectImportOrderData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectImportOrderData.datepromised = UtilSql.getDateValue(result, "DATEPROMISED", "dd-MM-yyyy");
        objectImportOrderData.orderReferenceno = UtilSql.getValue(result, "ORDER_REFERENCENO");
        objectImportOrderData.bpartnerupc = UtilSql.getValue(result, "BPARTNERUPC");
        objectImportOrderData.billtoUpc = UtilSql.getValue(result, "BILLTO_UPC");
        objectImportOrderData.cBpartnerLocationUpc = UtilSql.getValue(result, "C_BPARTNER_LOCATION_UPC");
        objectImportOrderData.performPost = UtilSql.getValue(result, "PERFORM_POST");
        objectImportOrderData.paymentrule1 = UtilSql.getValue(result, "PAYMENTRULE1");
        objectImportOrderData.paymentamount1 = UtilSql.getValue(result, "PAYMENTAMOUNT1");
        objectImportOrderData.paymentrule2 = UtilSql.getValue(result, "PAYMENTRULE2");
        objectImportOrderData.paymentamount2 = UtilSql.getValue(result, "PAYMENTAMOUNT2");
        objectImportOrderData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectImportOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportOrderData);
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
    ImportOrderData objectImportOrderData[] = new ImportOrderData[vector.size()];
    vector.copyInto(objectImportOrderData);
    return(objectImportOrderData);
  }

  public static ImportOrderData[] selectOrderInserted(ConnectionProvider connectionProvider, String ad_client_id, String ad_org_id, String c_doctype_id, String documentno, String dateordered, String cbpartner)    throws ServletException {
    return selectOrderInserted(connectionProvider, ad_client_id, ad_org_id, c_doctype_id, documentno, dateordered, cbpartner, 0, 0);
  }

  public static ImportOrderData[] selectOrderInserted(ConnectionProvider connectionProvider, String ad_client_id, String ad_org_id, String c_doctype_id, String documentno, String dateordered, String cbpartner, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				SELECT C_ORDER.C_ORDER_ID, C_ORDER.C_BPARTNER_ID, C_ORDER.BILLTO_ID, C_ORDER.C_BPARTNER_LOCATION_ID, C_ORDER.DOCUMENTNO, C_ORDER.M_PRICELIST_ID, C_ORDER.C_CURRENCY_ID, " +
      "        MAX(C_ORDERLINE.LINE) AS LineDescription" +
      "        FROM C_ORDER, C_ORDERLINE" +
      "        WHERE C_ORDER.AD_CLIENT_ID = ?" +
      "        AND C_ORDER.AD_ORG_ID = ?" +
      "        AND C_ORDER.C_DOCTYPETARGET_ID = ?" +
      "        AND C_ORDER.DOCUMENTNO = ?" +
      "        AND C_ORDER.PROCESSED = 'N'" +
      "        AND TO_CHAR(C_ORDER.DATEORDERED, 'DD-MM-YYYY') = TO_CHAR(TO_DATE(?, 'DD-MM-YYYY HH24:MI:SS'), 'DD-MM-YYYY')" +
      "        AND C_ORDER.C_BPARTNER_ID = ?" +
      "        AND C_ORDERLINE.C_ORDER_ID = C_ORDER.C_ORDER_ID" +
      "        GROUP BY C_ORDER.C_ORDER_ID, C_ORDER.C_BPARTNER_ID, C_ORDER.BILLTO_ID, C_ORDER.C_BPARTNER_LOCATION_ID, C_ORDER.DOCUMENTNO, C_ORDER.M_PRICELIST_ID, C_ORDER.C_CURRENCY_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_org_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_doctype_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbpartner);

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
        ImportOrderData objectImportOrderData = new ImportOrderData();
        objectImportOrderData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectImportOrderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectImportOrderData.billtoId = UtilSql.getValue(result, "BILLTO_ID");
        objectImportOrderData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectImportOrderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectImportOrderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectImportOrderData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectImportOrderData.linedescription = UtilSql.getValue(result, "LINEDESCRIPTION");
        objectImportOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportOrderData);
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
    ImportOrderData objectImportOrderData[] = new ImportOrderData[vector.size()];
    vector.copyInto(objectImportOrderData);
    return(objectImportOrderData);
  }

  public static ImportOrderData[] selectPaymentInserted(ConnectionProvider connectionProvider, String ad_client_id, String ad_org_id, String createdby, String updatedby, String c_bpartner_id, String c_currency_id, String paymentrule, String amount, String ispaid, String ismanual, String isvalid, String changesettlementcancel, String cancel_processed, String generate_processed, String glitemamt, String isdirectposting, String status, String status_initial, String c_order_id)    throws ServletException {
    return selectPaymentInserted(connectionProvider, ad_client_id, ad_org_id, createdby, updatedby, c_bpartner_id, c_currency_id, paymentrule, amount, ispaid, ismanual, isvalid, changesettlementcancel, cancel_processed, generate_processed, glitemamt, isdirectposting, status, status_initial, c_order_id, 0, 0);
  }

  public static ImportOrderData[] selectPaymentInserted(ConnectionProvider connectionProvider, String ad_client_id, String ad_org_id, String createdby, String updatedby, String c_bpartner_id, String c_currency_id, String paymentrule, String amount, String ispaid, String ismanual, String isvalid, String changesettlementcancel, String cancel_processed, String generate_processed, String glitemamt, String isdirectposting, String status, String status_initial, String c_order_id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				SELECT c_debt_payment_id " +
      "				FROM c_debt_payment" +
      "				WHERE ad_client_id = ?" +
      "				AND ad_org_id = ?" +
      "				AND createdby = ?" +
      "				AND updatedby = ?" +
      "				AND c_bpartner_id = ?" +
      "				AND c_currency_id = ?" +
      "				AND paymentrule = ?" +
      "				AND amount = TO_NUMBER(?)" +
      "				AND ispaid = ?" +
      "				AND ismanual = ?" +
      "				AND isvalid = ?" +
      "				AND changesettlementcancel = ?" +
      "				AND cancel_processed = ?" +
      "				AND generate_processed = ?" +
      "				AND glitemamt = TO_NUMBER(?)" +
      "				AND isdirectposting = ?" +
      "				AND status = ?" +
      "				AND status_initial = ?" +
      "				AND c_order_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_org_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_bpartner_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_currency_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ismanual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isvalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, changesettlementcancel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cancel_processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generate_processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, glitemamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdirectposting);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status_initial);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_order_id);

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
        ImportOrderData objectImportOrderData = new ImportOrderData();
        objectImportOrderData.cDebtPaymentId = UtilSql.getValue(result, "C_DEBT_PAYMENT_ID");
        objectImportOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportOrderData);
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
    ImportOrderData objectImportOrderData[] = new ImportOrderData[vector.size()];
    vector.copyInto(objectImportOrderData);
    return(objectImportOrderData);
  }

  public static int updateNotImported(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Order" +
      "				SET I_IsImported='N', Updated=TO_DATE(now())" +
      "				WHERE I_IsImported<>'Y'" +
      "				AND synchronized = 'Y'" +
      "				AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static String cDoctypeTarget(Connection conn, ConnectionProvider connectionProvider, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_DOCTYPE_ID " +
      "        FROM C_DOCTYPE" +
      "        WHERE DOCBASETYPE = 'SOO' " +
      "        AND DOCSUBTYPESO = 'SO' " +
      "        AND AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_DOCTYPE_ID");
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

  public static String defaultValue(Connection conn, ConnectionProvider connectionProvider, String tablename, String columnname)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select defaultvalue" +
      "        from ad_column c, ad_table t" +
      "        where c.ad_table_id = t.ad_table_id" +
      "        and upper(t.tablename) = upper(?)" +
      "        and upper(c.columnname) = upper(?)";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnname);

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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

  public static String defaultUser(Connection conn, ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select ad_user_id" +
      "        from ad_user" +
      "        where c_bpartner_id=?" +
      "        order by name";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_USER_ID");
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

  public static String selectSalesRep(Connection conn, ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select ad_user_id" +
      "        from ad_user u, c_bpartner bp" +
      "        where bp.salesrep_id = u.c_bpartner_id" +
      "        and bp.c_bpartner_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_USER_ID");
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

  public static String selectLocationName(Connection conn, ConnectionProvider connectionProvider, String upc)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select name" +
      "        from c_bpartner_location" +
      "        where upc = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);

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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

  public static ImportOrderData cOrderPost0(Connection conn, ConnectionProvider connectionProvider, String adPinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL C_Order_Post(?)";

    ImportOrderData objectImportOrderData = new ImportOrderData();
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
    return(objectImportOrderData);
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

  public static int insertAttributesetInstance(Connection conn, ConnectionProvider connectionProvider, String mAttributesetinstanceId, String adClientId, String adOrgId, String adUserId, String mAttributesetId, String serno, String lot, String guaranteedate, String description, String mLotId, String islocked, String lockDescription)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO M_ATTRIBUTESETINSTANCE (M_ATTRIBUTESETINSTANCE_ID, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, " +
      "        UPDATED, UPDATEDBY, M_ATTRIBUTESET_ID, SERNO, LOT, GUARANTEEDATE, DESCRIPTION, M_LOT_ID, ISLOCKED, LOCK_DESCRIPTION) " +
      "        VALUES ( ?, ?, ?, 'Y', now(), ?, now(), ?, ?, ?, ?, TO_DATE(?), ?, ?, ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lot);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLotId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, islocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockDescription);

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

  public static int updateAttributesetInstanceId(Connection conn, ConnectionProvider connectionProvider, String mAttributesetinstanceId, String iOrderId, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          UPDATE I_Order" +
      "          SET M_ATTRIBUTESETINSTANCE_ID = ?" +
      "          WHERE M_ATTRIBUTESETINSTANCE_ID IS NULL" +
      "          AND I_Order_ID = ?" +
      "          AND I_IsImported<>'Y'" +
      "          AND synchronized = 'Y'" +
      "          AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static String getProductAttributesetId(ConnectionProvider connectionProvider, String productId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT M_PRODUCT.M_ATTRIBUTESET_ID FROM M_PRODUCT WHERE M_PRODUCT.M_PRODUCT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);

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

  public static ImportOrderData[] getAttributesetInfo(ConnectionProvider connectionProvider, String attributeSetId)    throws ServletException {
    return getAttributesetInfo(connectionProvider, attributeSetId, 0, 0);
  }

  public static ImportOrderData[] getAttributesetInfo(ConnectionProvider connectionProvider, String attributeSetId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_ATTRIBUTESET.ISSERNO, M_ATTRIBUTESET.ISLOT, M_ATTRIBUTESET.ISGUARANTEEDATE," +
      "        M_ATTRIBUTESET.ISLOCKABLE, M_ATTRIBUTEUSE.M_ATTRIBUTE_ID AS MATTRIBUTEID, M_ATTRIBUTE.ISLIST" +
      "        FROM M_ATTRIBUTESET " +
      "        LEFT JOIN M_ATTRIBUTEUSE ON M_ATTRIBUTEUSE.M_ATTRIBUTESET_ID = ? " +
      "        LEFT JOIN M_ATTRIBUTE ON M_ATTRIBUTE.M_ATTRIBUTE_ID = M_ATTRIBUTEUSE.M_ATTRIBUTE_ID" +
      "        WHERE M_ATTRIBUTESET.M_ATTRIBUTESET_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, attributeSetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, attributeSetId);

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
        ImportOrderData objectImportOrderData = new ImportOrderData();
        objectImportOrderData.isserno = UtilSql.getValue(result, "ISSERNO");
        objectImportOrderData.islot = UtilSql.getValue(result, "ISLOT");
        objectImportOrderData.isguaranteedate = UtilSql.getValue(result, "ISGUARANTEEDATE");
        objectImportOrderData.islockable = UtilSql.getValue(result, "ISLOCKABLE");
        objectImportOrderData.mattributeid = UtilSql.getValue(result, "MATTRIBUTEID");
        objectImportOrderData.islist = UtilSql.getValue(result, "ISLIST");
        objectImportOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportOrderData);
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
    ImportOrderData objectImportOrderData[] = new ImportOrderData[vector.size()];
    vector.copyInto(objectImportOrderData);
    return(objectImportOrderData);
  }

  public static ImportOrderData[] getAttributeValue(ConnectionProvider connectionProvider, String attributeId)    throws ServletException {
    return getAttributeValue(connectionProvider, attributeId, 0, 0);
  }

  public static ImportOrderData[] getAttributeValue(ConnectionProvider connectionProvider, String attributeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_ATTRIBUTEVALUE_ID AS ATTRIBUTEVALUEID, NAME AS ATTRIBUTEVALUE FROM M_ATTRIBUTEVALUE WHERE M_ATTRIBUTE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, attributeId);

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
        ImportOrderData objectImportOrderData = new ImportOrderData();
        objectImportOrderData.attributevalueid = UtilSql.getValue(result, "ATTRIBUTEVALUEID");
        objectImportOrderData.attributevalue = UtilSql.getValue(result, "ATTRIBUTEVALUE");
        objectImportOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportOrderData);
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
    ImportOrderData objectImportOrderData[] = new ImportOrderData[vector.size()];
    vector.copyInto(objectImportOrderData);
    return(objectImportOrderData);
  }

  public static int insertAttributeValue(Connection conn, ConnectionProvider connectionProvider, String adClientId, String adOrgId, String mAttributeId, String value, String name, String description, String isactive, String attributeValueId, String createdby, String updatedby)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO M_AttributeValue " +
      "        (AD_Client_ID, AD_Org_ID, M_Attribute_ID, Value, Name, Description, IsActive, M_AttributeValue_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), ?, now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, attributeValueId);
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

  public static String selectAttributesetInstanceId(ConnectionProvider connectionProvider, String description)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_ATTRIBUTESETINSTANCE_ID FROM M_ATTRIBUTESETINSTANCE" +
      "        WHERE UPPER(M_ATTRIBUTESETINSTANCE.DESCRIPTION) = UPPER(?)";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);

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

  public static int insertAttributeInstance(Connection conn, ConnectionProvider connectionProvider, String attributeSetId, String mAttributeId, String adClientId, String adOrgId, String createdby, String updatedby, String attributeValueId, String value)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO M_ATTRIBUTEINSTANCE (M_ATTRIBUTEINSTANCE_ID, M_ATTRIBUTESETINSTANCE_ID, M_ATTRIBUTE_ID," +
      "        AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY, M_ATTRIBUTEVALUE_ID, VALUE)" +
      "        VALUES (GET_UUID(), ?, ?, ?, ?, 'Y', NOW(), ?, NOW(), ?, ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, attributeSetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, attributeValueId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);

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

  public static int updateAttributesetInstance(Connection conn, ConnectionProvider connectionProvider, String serialno, String lot, String guaranteedate, String description, String islocked, String lockdescript, String attributeSetInstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          UPDATE M_ATTRIBUTESETINSTANCE" +
      "          SET SERNO = ?, LOT = ?, GUARANTEEDATE = TO_DATE(?), DESCRIPTION = ?, ISLOCKED = ?, LOCK_DESCRIPTION = ?" +
      "          WHERE M_ATTRIBUTESETINSTANCE_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serialno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lot);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, islocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockdescript);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, attributeSetInstanceId);

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
}
