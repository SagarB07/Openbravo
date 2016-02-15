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

class EdiFileImportData implements FieldProvider {
static Logger log4j = Logger.getLogger(EdiFileImportData.class);
  private String InitRecordNumber="0";
  public String iOrderId;
  public String adClientId;
  public String adOrgId;
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
  public String cBpartnerId;
  public String bpartnervalue;
  public String name;
  public String cBpartnerLocationId;
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
  public String contactname;
  public String email;
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

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("I_ORDER_ID") || fieldName.equals("iOrderId"))
      return iOrderId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
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
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("BPARTNERVALUE"))
      return bpartnervalue;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
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
    else if (fieldName.equalsIgnoreCase("CONTACTNAME"))
      return contactname;
    else if (fieldName.equalsIgnoreCase("EMAIL"))
      return email;
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
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static EdiFileImportData[] select(ConnectionProvider connectionProvider, String iOrderId)    throws ServletException {
    return select(connectionProvider, iOrderId, 0, 0);
  }

  public static EdiFileImportData[] select(ConnectionProvider connectionProvider, String iOrderId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				select I_ORDER_ID, AD_CLIENT_ID, AD_ORG_ID, AD_ORGTRX_ID, ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY," +
      "				I_ISIMPORTED, I_ERRORMSG, PROCESSING, PROCESSED, SALESREP_ID, M_WAREHOUSE_ID, M_PRICELIST_ID, C_CURRENCY_ID," +
      "				M_SHIPPER_ID, ISSOTRX, C_BPARTNER_ID, BPARTNERVALUE, NAME, C_BPARTNER_LOCATION_ID, BILLTO_ID, C_LOCATION_ID," +
      "				ADDRESS1, ADDRESS2, POSTAL, CITY, C_REGION_ID, REGIONNAME, C_COUNTRY_ID, COUNTRYCODE, AD_USER_ID, CONTACTNAME," +
      "				EMAIL, PHONE, C_PROJECT_ID, C_ACTIVITY_ID, C_DOCTYPE_ID, DOCTYPENAME, C_PAYMENTTERM_ID, PAYMENTTERMVALUE," +
      "				C_ORDER_ID, DOCUMENTNO, DESCRIPTION, M_PRODUCT_ID, PRODUCTVALUE, UPC, SKU, C_TAX_ID, TAXINDICATOR, TAXAMT," +
      "				C_ORDERLINE_ID, LINEDESCRIPTION, C_UOM_ID, QTYORDERED, PRICEACTUAL, C_CAMPAIGN_ID, DATEORDERED," +
      "				DATEPROMISED, ORDER_REFERENCENO, BPARTNERUPC, BILLTO_UPC, C_BPARTNER_LOCATION_UPC, VENDOR_UPC" +
      "				from i_order" +
      "				where I_ORDER_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iOrderId);

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
        EdiFileImportData objectEdiFileImportData = new EdiFileImportData();
        objectEdiFileImportData.iOrderId = UtilSql.getValue(result, "I_ORDER_ID");
        objectEdiFileImportData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectEdiFileImportData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectEdiFileImportData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectEdiFileImportData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectEdiFileImportData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectEdiFileImportData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectEdiFileImportData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectEdiFileImportData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectEdiFileImportData.iIsimported = UtilSql.getValue(result, "I_ISIMPORTED");
        objectEdiFileImportData.iErrormsg = UtilSql.getValue(result, "I_ERRORMSG");
        objectEdiFileImportData.processing = UtilSql.getValue(result, "PROCESSING");
        objectEdiFileImportData.processed = UtilSql.getValue(result, "PROCESSED");
        objectEdiFileImportData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectEdiFileImportData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectEdiFileImportData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectEdiFileImportData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectEdiFileImportData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectEdiFileImportData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectEdiFileImportData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectEdiFileImportData.bpartnervalue = UtilSql.getValue(result, "BPARTNERVALUE");
        objectEdiFileImportData.name = UtilSql.getValue(result, "NAME");
        objectEdiFileImportData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectEdiFileImportData.billtoId = UtilSql.getValue(result, "BILLTO_ID");
        objectEdiFileImportData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectEdiFileImportData.address1 = UtilSql.getValue(result, "ADDRESS1");
        objectEdiFileImportData.address2 = UtilSql.getValue(result, "ADDRESS2");
        objectEdiFileImportData.postal = UtilSql.getValue(result, "POSTAL");
        objectEdiFileImportData.city = UtilSql.getValue(result, "CITY");
        objectEdiFileImportData.cRegionId = UtilSql.getValue(result, "C_REGION_ID");
        objectEdiFileImportData.regionname = UtilSql.getValue(result, "REGIONNAME");
        objectEdiFileImportData.cCountryId = UtilSql.getValue(result, "C_COUNTRY_ID");
        objectEdiFileImportData.countrycode = UtilSql.getValue(result, "COUNTRYCODE");
        objectEdiFileImportData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectEdiFileImportData.contactname = UtilSql.getValue(result, "CONTACTNAME");
        objectEdiFileImportData.email = UtilSql.getValue(result, "EMAIL");
        objectEdiFileImportData.phone = UtilSql.getValue(result, "PHONE");
        objectEdiFileImportData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectEdiFileImportData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectEdiFileImportData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectEdiFileImportData.doctypename = UtilSql.getValue(result, "DOCTYPENAME");
        objectEdiFileImportData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectEdiFileImportData.paymenttermvalue = UtilSql.getValue(result, "PAYMENTTERMVALUE");
        objectEdiFileImportData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectEdiFileImportData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectEdiFileImportData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectEdiFileImportData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectEdiFileImportData.productvalue = UtilSql.getValue(result, "PRODUCTVALUE");
        objectEdiFileImportData.upc = UtilSql.getValue(result, "UPC");
        objectEdiFileImportData.sku = UtilSql.getValue(result, "SKU");
        objectEdiFileImportData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectEdiFileImportData.taxindicator = UtilSql.getValue(result, "TAXINDICATOR");
        objectEdiFileImportData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectEdiFileImportData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectEdiFileImportData.linedescription = UtilSql.getValue(result, "LINEDESCRIPTION");
        objectEdiFileImportData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectEdiFileImportData.qtyordered = UtilSql.getValue(result, "QTYORDERED");
        objectEdiFileImportData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectEdiFileImportData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectEdiFileImportData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectEdiFileImportData.datepromised = UtilSql.getDateValue(result, "DATEPROMISED", "dd-MM-yyyy");
        objectEdiFileImportData.orderReferenceno = UtilSql.getValue(result, "ORDER_REFERENCENO");
        objectEdiFileImportData.bpartnerupc = UtilSql.getValue(result, "BPARTNERUPC");
        objectEdiFileImportData.billtoUpc = UtilSql.getValue(result, "BILLTO_UPC");
        objectEdiFileImportData.cBpartnerLocationUpc = UtilSql.getValue(result, "C_BPARTNER_LOCATION_UPC");
        objectEdiFileImportData.vendorUpc = UtilSql.getValue(result, "VENDOR_UPC");
        objectEdiFileImportData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEdiFileImportData);
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
    EdiFileImportData objectEdiFileImportData[] = new EdiFileImportData[vector.size()];
    vector.copyInto(objectEdiFileImportData);
    return(objectEdiFileImportData);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				INSERT INTO I_ORDER " +
      "          (i_order_id, ad_client_id, ad_org_id, isactive, " +
      "           created, createdby, updated, updatedby, " +
      "           i_isimported, issotrx, processing, " +
      "           processed, order_Referenceno, dateordered, " +
      "           datepromised, upc,	linedescription, " +
      "           qtyordered, bpartnerupc, doctypename, " +
      "           billto_upc, description, c_bpartner_location_upc, vendor_upc)" +
      "				VALUES" +
      "          (?, ?, ?, 'Y', " +
      "           now(), ?, now(), ?," +
      "           ?, ?, ?, " +
      "           ?, ?, to_date(?, 'yyyymmdd'), " +
      "           to_date(?, 'yyyymmdd'), ?, ?, " +
      "           TO_NUMBER(?), ?, ?, " +
      "           TO_NUMBER(?), ?, ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iIsimported);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderReferenceno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linedescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpartnerupc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, doctypename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoUpc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationUpc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorUpc);

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

  public static int delete(Connection conn, ConnectionProvider connectionProvider, String client)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				DELETE FROM I_ORDER" +
      "				where ad_client_id = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);

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
