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

class DocOrderData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocOrderData.class);
  private String InitRecordNumber="0";
  public String cTaxId;
  public String name;
  public String rate;
  public String taxbaseamt;
  public String taxamt;
  public String cOrderId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String issotrx;
  public String documentno;
  public String docstatus;
  public String docaction;
  public String processing;
  public String processed;
  public String cDoctypeId;
  public String cDoctypetargetId;
  public String description;
  public String isdelivered;
  public String isprinted;
  public String isselected;
  public String salesrepId;
  public String dateordered;
  public String datepromised;
  public String dateprinted;
  public String dateacct;
  public String cBpartnerId;
  public String billtoId;
  public String cBpartnerLocationId;
  public String poreference;
  public String isdiscountprinted;
  public String cCurrencyId;
  public String paymentrule;
  public String cPaymenttermId;
  public String invoicerule;
  public String deliveryrule;
  public String freightcostrule;
  public String freightamt;
  public String deliveryviarule;
  public String mShipperId;
  public String cChargeId;
  public String chargeamt;
  public String priorityrule;
  public String totallines;
  public String grandtotal;
  public String mWarehouseId;
  public String mPricelistId;
  public String istaxincluded;
  public String cCampaignId;
  public String cProjectId;
  public String cActivityId;
  public String posted;
  public String sendemail;
  public String adUserId;
  public String copyfrom;
  public String dropshipBpartnerId;
  public String dropshipLocationId;
  public String dropshipUserId;
  public String isselfservice;
  public String adOrgtrxId;
  public String user1Id;
  public String user2Id;
  public String deliverynotes;
  public String cIncotermsId;
  public String incotermsdescription;
  public String generatetemplate;
  public String isinvoiced;
  public String istransferred;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("RATE"))
      return rate;
    else if (fieldName.equalsIgnoreCase("TAXBASEAMT"))
      return taxbaseamt;
    else if (fieldName.equalsIgnoreCase("TAXAMT"))
      return taxamt;
    else if (fieldName.equalsIgnoreCase("C_ORDER_ID") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
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
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DOCSTATUS"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("DOCACTION"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPETARGET_ID") || fieldName.equals("cDoctypetargetId"))
      return cDoctypetargetId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ISDELIVERED"))
      return isdelivered;
    else if (fieldName.equalsIgnoreCase("ISPRINTED"))
      return isprinted;
    else if (fieldName.equalsIgnoreCase("ISSELECTED"))
      return isselected;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("DATEPROMISED"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("DATEPRINTED"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("BILLTO_ID") || fieldName.equals("billtoId"))
      return billtoId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("ISDISCOUNTPRINTED"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_ID") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("INVOICERULE"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("DELIVERYRULE"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("FREIGHTCOSTRULE"))
      return freightcostrule;
    else if (fieldName.equalsIgnoreCase("FREIGHTAMT"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("DELIVERYVIARULE"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("M_SHIPPER_ID") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("PRIORITYRULE"))
      return priorityrule;
    else if (fieldName.equalsIgnoreCase("TOTALLINES"))
      return totallines;
    else if (fieldName.equalsIgnoreCase("GRANDTOTAL"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("ISTAXINCLUDED"))
      return istaxincluded;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("SENDEMAIL"))
      return sendemail;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("COPYFROM"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("DROPSHIP_BPARTNER_ID") || fieldName.equals("dropshipBpartnerId"))
      return dropshipBpartnerId;
    else if (fieldName.equalsIgnoreCase("DROPSHIP_LOCATION_ID") || fieldName.equals("dropshipLocationId"))
      return dropshipLocationId;
    else if (fieldName.equalsIgnoreCase("DROPSHIP_USER_ID") || fieldName.equals("dropshipUserId"))
      return dropshipUserId;
    else if (fieldName.equalsIgnoreCase("ISSELFSERVICE"))
      return isselfservice;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("DELIVERYNOTES"))
      return deliverynotes;
    else if (fieldName.equalsIgnoreCase("C_INCOTERMS_ID") || fieldName.equals("cIncotermsId"))
      return cIncotermsId;
    else if (fieldName.equalsIgnoreCase("INCOTERMSDESCRIPTION"))
      return incotermsdescription;
    else if (fieldName.equalsIgnoreCase("GENERATETEMPLATE"))
      return generatetemplate;
    else if (fieldName.equalsIgnoreCase("ISINVOICED"))
      return isinvoiced;
    else if (fieldName.equalsIgnoreCase("ISTRANSFERRED"))
      return istransferred;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocOrderData[] select(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    return select(connectionProvider, C_Order_ID, 0, 0);
  }

  public static DocOrderData[] select(ConnectionProvider connectionProvider, String C_Order_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT it.C_Tax_ID, t.Name, t.Rate, it.TaxBaseAmt, it.TaxAmt, '' AS C_ORDER_ID, '' AS AD_CLIENT_ID, '' AS AD_ORG_ID, '' AS ISACTIVE," +
      "        '' AS CREATED, '' AS CREATEDBY, '' AS UPDATED, '' AS UPDATEDBY, '' AS ISSOTRX, '' AS DOCUMENTNO, '' AS DOCSTATUS, '' AS DOCACTION," +
      "        '' AS PROCESSING, '' AS PROCESSED, '' AS C_DOCTYPE_ID, '' AS C_DOCTYPETARGET_ID, '' AS DESCRIPTION, " +
      "        '' AS ISDELIVERED, '' AS ISPRINTED, '' AS ISSELECTED, '' AS SALESREP_ID, '' AS DATEORDERED, '' AS DATEPROMISED, '' AS DATEPRINTED," +
      "        '' AS DATEACCT, '' AS C_BPARTNER_ID, '' AS BILLTO_ID, '' AS C_BPARTNER_LOCATION_ID, '' AS POREFERENCE, '' AS ISDISCOUNTPRINTED," +
      "        '' AS C_CURRENCY_ID, '' AS PAYMENTRULE, '' AS C_PAYMENTTERM_ID, '' AS INVOICERULE, '' AS DELIVERYRULE, '' AS FREIGHTCOSTRULE," +
      "        '' AS FREIGHTAMT, '' AS DELIVERYVIARULE, '' AS M_SHIPPER_ID, '' AS C_CHARGE_ID, '' AS CHARGEAMT, '' AS PRIORITYRULE, '' AS TOTALLINES," +
      "        '' AS GRANDTOTAL, '' AS M_WAREHOUSE_ID, '' AS M_PRICELIST_ID, '' AS ISTAXINCLUDED, '' AS C_CAMPAIGN_ID, '' AS C_PROJECT_ID, '' AS C_ACTIVITY_ID," +
      "        '' AS POSTED, '' AS SENDEMAIL, '' AS AD_USER_ID, '' AS COPYFROM, '' AS DROPSHIP_BPARTNER_ID, '' AS DROPSHIP_LOCATION_ID," +
      "        '' AS DROPSHIP_USER_ID, '' AS ISSELFSERVICE, '' AS AD_ORGTRX_ID, '' AS USER1_ID, '' AS USER2_ID, '' AS DELIVERYNOTES, '' AS C_INCOTERMS_ID," +
      "        '' AS INCOTERMSDESCRIPTION, '' AS GENERATETEMPLATE, '' AS ISINVOICED, '' AS ISTRANSFERRED" +
      "        FROM C_Tax t, C_OrderTax it " +
      "        WHERE t.C_Tax_ID=it.C_Tax_ID AND it.C_Order_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Order_ID);

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
        DocOrderData objectDocOrderData = new DocOrderData();
        objectDocOrderData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocOrderData.name = UtilSql.getValue(result, "NAME");
        objectDocOrderData.rate = UtilSql.getValue(result, "RATE");
        objectDocOrderData.taxbaseamt = UtilSql.getValue(result, "TAXBASEAMT");
        objectDocOrderData.taxamt = UtilSql.getValue(result, "TAXAMT");
        objectDocOrderData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectDocOrderData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocOrderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocOrderData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocOrderData.created = UtilSql.getValue(result, "CREATED");
        objectDocOrderData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectDocOrderData.updated = UtilSql.getValue(result, "UPDATED");
        objectDocOrderData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDocOrderData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectDocOrderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocOrderData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectDocOrderData.docaction = UtilSql.getValue(result, "DOCACTION");
        objectDocOrderData.processing = UtilSql.getValue(result, "PROCESSING");
        objectDocOrderData.processed = UtilSql.getValue(result, "PROCESSED");
        objectDocOrderData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectDocOrderData.cDoctypetargetId = UtilSql.getValue(result, "C_DOCTYPETARGET_ID");
        objectDocOrderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocOrderData.isdelivered = UtilSql.getValue(result, "ISDELIVERED");
        objectDocOrderData.isprinted = UtilSql.getValue(result, "ISPRINTED");
        objectDocOrderData.isselected = UtilSql.getValue(result, "ISSELECTED");
        objectDocOrderData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectDocOrderData.dateordered = UtilSql.getValue(result, "DATEORDERED");
        objectDocOrderData.datepromised = UtilSql.getValue(result, "DATEPROMISED");
        objectDocOrderData.dateprinted = UtilSql.getValue(result, "DATEPRINTED");
        objectDocOrderData.dateacct = UtilSql.getValue(result, "DATEACCT");
        objectDocOrderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocOrderData.billtoId = UtilSql.getValue(result, "BILLTO_ID");
        objectDocOrderData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectDocOrderData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectDocOrderData.isdiscountprinted = UtilSql.getValue(result, "ISDISCOUNTPRINTED");
        objectDocOrderData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocOrderData.paymentrule = UtilSql.getValue(result, "PAYMENTRULE");
        objectDocOrderData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectDocOrderData.invoicerule = UtilSql.getValue(result, "INVOICERULE");
        objectDocOrderData.deliveryrule = UtilSql.getValue(result, "DELIVERYRULE");
        objectDocOrderData.freightcostrule = UtilSql.getValue(result, "FREIGHTCOSTRULE");
        objectDocOrderData.freightamt = UtilSql.getValue(result, "FREIGHTAMT");
        objectDocOrderData.deliveryviarule = UtilSql.getValue(result, "DELIVERYVIARULE");
        objectDocOrderData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectDocOrderData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocOrderData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocOrderData.priorityrule = UtilSql.getValue(result, "PRIORITYRULE");
        objectDocOrderData.totallines = UtilSql.getValue(result, "TOTALLINES");
        objectDocOrderData.grandtotal = UtilSql.getValue(result, "GRANDTOTAL");
        objectDocOrderData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectDocOrderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectDocOrderData.istaxincluded = UtilSql.getValue(result, "ISTAXINCLUDED");
        objectDocOrderData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocOrderData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocOrderData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocOrderData.posted = UtilSql.getValue(result, "POSTED");
        objectDocOrderData.sendemail = UtilSql.getValue(result, "SENDEMAIL");
        objectDocOrderData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectDocOrderData.copyfrom = UtilSql.getValue(result, "COPYFROM");
        objectDocOrderData.dropshipBpartnerId = UtilSql.getValue(result, "DROPSHIP_BPARTNER_ID");
        objectDocOrderData.dropshipLocationId = UtilSql.getValue(result, "DROPSHIP_LOCATION_ID");
        objectDocOrderData.dropshipUserId = UtilSql.getValue(result, "DROPSHIP_USER_ID");
        objectDocOrderData.isselfservice = UtilSql.getValue(result, "ISSELFSERVICE");
        objectDocOrderData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocOrderData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocOrderData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocOrderData.deliverynotes = UtilSql.getValue(result, "DELIVERYNOTES");
        objectDocOrderData.cIncotermsId = UtilSql.getValue(result, "C_INCOTERMS_ID");
        objectDocOrderData.incotermsdescription = UtilSql.getValue(result, "INCOTERMSDESCRIPTION");
        objectDocOrderData.generatetemplate = UtilSql.getValue(result, "GENERATETEMPLATE");
        objectDocOrderData.isinvoiced = UtilSql.getValue(result, "ISINVOICED");
        objectDocOrderData.istransferred = UtilSql.getValue(result, "ISTRANSFERRED");
        objectDocOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocOrderData);
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
    DocOrderData objectDocOrderData[] = new DocOrderData[vector.size()];
    vector.copyInto(objectDocOrderData);
    return(objectDocOrderData);
  }

  public static DocOrderData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return selectRegistro(connectionProvider, client, id, 0, 0);
  }

  public static DocOrderData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT O.AD_CLIENT_ID, O.AD_ORG_ID, O.C_BPARTNER_ID, O.AD_ORGTRX_ID, O.C_PROJECT_ID, " +
      "        O.C_CAMPAIGN_ID, O.C_ACTIVITY_ID, O.USER1_ID, O.USER2_ID, O.DOCUMENTNO, O.DATEACCT," +
      "        O.C_CURRENCY_ID, O.C_DOCTYPE_ID, O.C_CHARGE_ID, O.CHARGEAMT, O.POSTED, O.DATEORDERED," +
      "        O.ISTAXINCLUDED, O.GRANDTOTAL, O.TOTALLINES" +
      "        FROM C_ORDER O          " +
      "        WHERE AD_Client_ID=? " +
      "        AND C_ORDER_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DocOrderData objectDocOrderData = new DocOrderData();
        objectDocOrderData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocOrderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocOrderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocOrderData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocOrderData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocOrderData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocOrderData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocOrderData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocOrderData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocOrderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocOrderData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocOrderData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocOrderData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectDocOrderData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocOrderData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocOrderData.posted = UtilSql.getValue(result, "POSTED");
        objectDocOrderData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectDocOrderData.istaxincluded = UtilSql.getValue(result, "ISTAXINCLUDED");
        objectDocOrderData.grandtotal = UtilSql.getValue(result, "GRANDTOTAL");
        objectDocOrderData.totallines = UtilSql.getValue(result, "TOTALLINES");
        objectDocOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocOrderData);
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
    DocOrderData objectDocOrderData[] = new DocOrderData[vector.size()];
    vector.copyInto(objectDocOrderData);
    return(objectDocOrderData);
  }

  public static int updateProductPO(Connection conn, ConnectionProvider connectionProvider, String Record_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          UPDATE M_Product_PO SET PriceLastPO = (SELECT AVG(C_Currency_Convert(to_number(ol.PriceActual),ol.C_Currency_ID,M_Product_PO.C_Currency_ID,to_date(o.DateOrdered),to_char(null),o.AD_Client_ID,o.AD_Org_ID))" +
      "                  FROM C_Order o, C_OrderLine ol " +
      "                  WHERE o.C_Order_ID = ol.C_Order_ID" +
      "                  AND M_Product_PO.M_Product_ID = ol.M_Product_ID AND M_Product_PO.C_BPartner_ID=o.C_BPartner_ID" +
      "                  AND o.C_Order_ID = ?)" +
      "          WHERE EXISTS (SELECT * FROM C_Order o, C_OrderLine ol " +
      "                  WHERE o.C_Order_ID = ol.C_Order_ID" +
      "                  AND M_Product_PO.M_Product_ID = ol.M_Product_ID AND M_Product_PO.C_BPartner_ID=o.C_BPartner_ID" +
      "                  AND o.C_Order_ID = ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Record_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Record_ID);

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
