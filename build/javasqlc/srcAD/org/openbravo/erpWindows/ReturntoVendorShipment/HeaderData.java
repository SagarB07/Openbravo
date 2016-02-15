//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.ReturntoVendorShipment;

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
class HeaderData implements FieldProvider {
static Logger log4j = Logger.getLogger(HeaderData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String rmShipmentPickedit;
  public String adOrgId;
  public String adOrgIdr;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String mConditionGoodsId;
  public String documentno;
  public String poreference;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String movementdate;
  public String dateacct;
  public String cOrderId;
  public String mWarehouseId;
  public String description;
  public String docstatus;
  public String adUserId;
  public String createfrom;
  public String generateto;
  public String docaction;
  public String docactionBtn;
  public String posted;
  public String postedBtn;
  public String salesrepId;
  public String cChargeId;
  public String chargeamt;
  public String deliveryrule;
  public String deliveryviarule;
  public String freightamt;
  public String freightcostrule;
  public String priorityrule;
  public String movementtype;
  public String mShipperId;
  public String nopackages;
  public String mFreightcategoryId;
  public String calculateFreight;
  public String freightCurrencyId;
  public String cProjectId;
  public String cProjectIdr;
  public String cActivityId;
  public String cCampaignId;
  public String adOrgtrxId;
  public String user1Id;
  public String user2Id;
  public String pickdate;
  public String shipdate;
  public String processed;
  public String cInvoiceId;
  public String updatelines;
  public String trackingno;
  public String deliveryLocationId;
  public String mInoutId;
  public String rmReceiptPickedit;
  public String generatelines;
  public String adClientId;
  public String dateprinted;
  public String islogistic;
  public String processing;
  public String isactive;
  public String issotrx;
  public String dateordered;
  public String isprinted;
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
    else if (fieldName.equalsIgnoreCase("RM_SHIPMENT_PICKEDIT") || fieldName.equals("rmShipmentPickedit"))
      return rmShipmentPickedit;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_IDR") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("M_CONDITION_GOODS_ID") || fieldName.equals("mConditionGoodsId"))
      return mConditionGoodsId;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_IDR") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_IDR") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("MOVEMENTDATE"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("C_ORDER_ID") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("DOCSTATUS"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("CREATEFROM"))
      return createfrom;
    else if (fieldName.equalsIgnoreCase("GENERATETO"))
      return generateto;
    else if (fieldName.equalsIgnoreCase("DOCACTION"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("DOCACTION_BTN") || fieldName.equals("docactionBtn"))
      return docactionBtn;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("POSTED_BTN") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("DELIVERYRULE"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("DELIVERYVIARULE"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("FREIGHTAMT"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("FREIGHTCOSTRULE"))
      return freightcostrule;
    else if (fieldName.equalsIgnoreCase("PRIORITYRULE"))
      return priorityrule;
    else if (fieldName.equalsIgnoreCase("MOVEMENTTYPE"))
      return movementtype;
    else if (fieldName.equalsIgnoreCase("M_SHIPPER_ID") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("NOPACKAGES"))
      return nopackages;
    else if (fieldName.equalsIgnoreCase("M_FREIGHTCATEGORY_ID") || fieldName.equals("mFreightcategoryId"))
      return mFreightcategoryId;
    else if (fieldName.equalsIgnoreCase("CALCULATE_FREIGHT") || fieldName.equals("calculateFreight"))
      return calculateFreight;
    else if (fieldName.equalsIgnoreCase("FREIGHT_CURRENCY_ID") || fieldName.equals("freightCurrencyId"))
      return freightCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_IDR") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("PICKDATE"))
      return pickdate;
    else if (fieldName.equalsIgnoreCase("SHIPDATE"))
      return shipdate;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("C_INVOICE_ID") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("UPDATELINES"))
      return updatelines;
    else if (fieldName.equalsIgnoreCase("TRACKINGNO"))
      return trackingno;
    else if (fieldName.equalsIgnoreCase("DELIVERY_LOCATION_ID") || fieldName.equals("deliveryLocationId"))
      return deliveryLocationId;
    else if (fieldName.equalsIgnoreCase("M_INOUT_ID") || fieldName.equals("mInoutId"))
      return mInoutId;
    else if (fieldName.equalsIgnoreCase("RM_RECEIPT_PICKEDIT") || fieldName.equals("rmReceiptPickedit"))
      return rmReceiptPickedit;
    else if (fieldName.equalsIgnoreCase("GENERATELINES"))
      return generatelines;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("DATEPRINTED"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("ISLOGISTIC"))
      return islogistic;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("ISPRINTED"))
      return isprinted;
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
  public static HeaderData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static HeaderData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_InOut.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_InOut.CreatedBy) as CreatedByR, " +
      "        to_char(M_InOut.Updated, ?) as updated, " +
      "        to_char(M_InOut.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_InOut.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_InOut.UpdatedBy) as UpdatedByR," +
      "        M_InOut.RM_Shipment_Pickedit, " +
      "M_InOut.AD_Org_ID, " +
      "(CASE WHEN M_InOut.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_InOut.C_DocType_ID, " +
      "(CASE WHEN M_InOut.C_DocType_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_DocType_IDR, " +
      "M_InOut.M_Condition_Goods_ID, " +
      "M_InOut.DocumentNo, " +
      "M_InOut.POReference, " +
      "M_InOut.C_BPartner_ID, " +
      "(CASE WHEN M_InOut.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "M_InOut.C_BPartner_Location_ID, " +
      "(CASE WHEN M_InOut.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "M_InOut.MovementDate, " +
      "M_InOut.DateAcct, " +
      "M_InOut.C_Order_ID, " +
      "M_InOut.M_Warehouse_ID, " +
      "M_InOut.Description, " +
      "M_InOut.DocStatus, " +
      "M_InOut.AD_User_ID, " +
      "M_InOut.CreateFrom, " +
      "M_InOut.GenerateTo, " +
      "M_InOut.DocAction, " +
      "list1.name as DocAction_BTN, " +
      "M_InOut.Posted, " +
      "list2.name as Posted_BTN, " +
      "M_InOut.SalesRep_ID, " +
      "M_InOut.C_Charge_ID, " +
      "M_InOut.ChargeAmt, " +
      "M_InOut.DeliveryRule, " +
      "M_InOut.DeliveryViaRule, " +
      "M_InOut.FreightAmt, " +
      "M_InOut.FreightCostRule, " +
      "M_InOut.PriorityRule, " +
      "M_InOut.MovementType, " +
      "M_InOut.M_Shipper_ID, " +
      "M_InOut.NoPackages, " +
      "M_InOut.M_FreightCategory_ID, " +
      "M_InOut.Calculate_Freight, " +
      "M_InOut.Freight_Currency_ID, " +
      "M_InOut.C_Project_ID, " +
      "(CASE WHEN M_InOut.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "M_InOut.C_Activity_ID, " +
      "M_InOut.C_Campaign_ID, " +
      "M_InOut.AD_OrgTrx_ID, " +
      "M_InOut.User1_ID, " +
      "M_InOut.User2_ID, " +
      "TO_CHAR(M_InOut.PickDate, ?) AS PickDate, " +
      "TO_CHAR(M_InOut.ShipDate, ?) AS ShipDate, " +
      "COALESCE(M_InOut.Processed, 'N') AS Processed, " +
      "M_InOut.C_Invoice_ID, " +
      "M_InOut.UpdateLines, " +
      "M_InOut.TrackingNo, " +
      "M_InOut.Delivery_Location_ID, " +
      "M_InOut.M_InOut_ID, " +
      "M_InOut.RM_Receipt_PickEdit, " +
      "M_InOut.GenerateLines, " +
      "M_InOut.AD_Client_ID, " +
      "M_InOut.DatePrinted, " +
      "COALESCE(M_InOut.Islogistic, 'N') AS Islogistic, " +
      "COALESCE(M_InOut.Processing, 'N') AS Processing, " +
      "COALESCE(M_InOut.IsActive, 'N') AS IsActive, " +
      "COALESCE(M_InOut.IsSOTrx, 'N') AS IsSOTrx, " +
      "M_InOut.DateOrdered, " +
      "COALESCE(M_InOut.IsPrinted, 'N') AS IsPrinted, " +
      "        ? AS LANGUAGE " +
      "        FROM M_InOut left join (select AD_Org_ID, Value from AD_Org) table1 on (M_InOut.AD_Org_ID = table1.AD_Org_ID) left join (select C_DocType_ID, Name from C_DocType) table2 on (M_InOut.C_DocType_ID =  table2.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL2 on (table2.C_DocType_ID = tableTRL2.C_DocType_ID and tableTRL2.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table4 on (M_InOut.C_BPartner_ID = table4.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table5 on (M_InOut.C_BPartner_Location_ID = table5.C_BPartner_Location_ID) left join ad_ref_list_v list1 on (list1.ad_reference_id = '135' and list1.ad_language = ?  AND (CASE M_InOut.DocAction WHEN '--' THEN 'CL' ELSE TO_CHAR(M_InOut.DocAction) END) = list1.value) left join ad_ref_list_v list2 on (list2.ad_reference_id = '234' and list2.ad_language = ?  AND M_InOut.Posted = TO_CHAR(list2.value)) left join (select C_Project_ID, Value, Name from C_Project) table6 on (M_InOut.C_Project_ID = table6.C_Project_ID)" +
      "        WHERE 2=2 " +
      " AND M_InOut.MovementType IN ('V-', 'V+') and M_InOut.isLogistic = 'N'" +
      "        AND 1=1 " +
      "        AND M_InOut.M_InOut_ID = ? " +
      "        AND M_InOut.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_InOut.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
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
        HeaderData objectHeaderData = new HeaderData();
        objectHeaderData.created = UtilSql.getValue(result, "CREATED");
        objectHeaderData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectHeaderData.updated = UtilSql.getValue(result, "UPDATED");
        objectHeaderData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectHeaderData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectHeaderData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectHeaderData.rmShipmentPickedit = UtilSql.getValue(result, "RM_SHIPMENT_PICKEDIT");
        objectHeaderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectHeaderData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectHeaderData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectHeaderData.cDoctypeIdr = UtilSql.getValue(result, "C_DOCTYPE_IDR");
        objectHeaderData.mConditionGoodsId = UtilSql.getValue(result, "M_CONDITION_GOODS_ID");
        objectHeaderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectHeaderData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectHeaderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectHeaderData.cBpartnerIdr = UtilSql.getValue(result, "C_BPARTNER_IDR");
        objectHeaderData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectHeaderData.cBpartnerLocationIdr = UtilSql.getValue(result, "C_BPARTNER_LOCATION_IDR");
        objectHeaderData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectHeaderData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectHeaderData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectHeaderData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectHeaderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectHeaderData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectHeaderData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectHeaderData.createfrom = UtilSql.getValue(result, "CREATEFROM");
        objectHeaderData.generateto = UtilSql.getValue(result, "GENERATETO");
        objectHeaderData.docaction = UtilSql.getValue(result, "DOCACTION");
        objectHeaderData.docactionBtn = UtilSql.getValue(result, "DOCACTION_BTN");
        objectHeaderData.posted = UtilSql.getValue(result, "POSTED");
        objectHeaderData.postedBtn = UtilSql.getValue(result, "POSTED_BTN");
        objectHeaderData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectHeaderData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectHeaderData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectHeaderData.deliveryrule = UtilSql.getValue(result, "DELIVERYRULE");
        objectHeaderData.deliveryviarule = UtilSql.getValue(result, "DELIVERYVIARULE");
        objectHeaderData.freightamt = UtilSql.getValue(result, "FREIGHTAMT");
        objectHeaderData.freightcostrule = UtilSql.getValue(result, "FREIGHTCOSTRULE");
        objectHeaderData.priorityrule = UtilSql.getValue(result, "PRIORITYRULE");
        objectHeaderData.movementtype = UtilSql.getValue(result, "MOVEMENTTYPE");
        objectHeaderData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectHeaderData.nopackages = UtilSql.getValue(result, "NOPACKAGES");
        objectHeaderData.mFreightcategoryId = UtilSql.getValue(result, "M_FREIGHTCATEGORY_ID");
        objectHeaderData.calculateFreight = UtilSql.getValue(result, "CALCULATE_FREIGHT");
        objectHeaderData.freightCurrencyId = UtilSql.getValue(result, "FREIGHT_CURRENCY_ID");
        objectHeaderData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectHeaderData.cProjectIdr = UtilSql.getValue(result, "C_PROJECT_IDR");
        objectHeaderData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectHeaderData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectHeaderData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectHeaderData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectHeaderData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectHeaderData.pickdate = UtilSql.getValue(result, "PICKDATE");
        objectHeaderData.shipdate = UtilSql.getValue(result, "SHIPDATE");
        objectHeaderData.processed = UtilSql.getValue(result, "PROCESSED");
        objectHeaderData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectHeaderData.updatelines = UtilSql.getValue(result, "UPDATELINES");
        objectHeaderData.trackingno = UtilSql.getValue(result, "TRACKINGNO");
        objectHeaderData.deliveryLocationId = UtilSql.getValue(result, "DELIVERY_LOCATION_ID");
        objectHeaderData.mInoutId = UtilSql.getValue(result, "M_INOUT_ID");
        objectHeaderData.rmReceiptPickedit = UtilSql.getValue(result, "RM_RECEIPT_PICKEDIT");
        objectHeaderData.generatelines = UtilSql.getValue(result, "GENERATELINES");
        objectHeaderData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectHeaderData.dateprinted = UtilSql.getDateValue(result, "DATEPRINTED", "dd-MM-yyyy");
        objectHeaderData.islogistic = UtilSql.getValue(result, "ISLOGISTIC");
        objectHeaderData.processing = UtilSql.getValue(result, "PROCESSING");
        objectHeaderData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectHeaderData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectHeaderData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectHeaderData.isprinted = UtilSql.getValue(result, "ISPRINTED");
        objectHeaderData.language = UtilSql.getValue(result, "LANGUAGE");
        objectHeaderData.adUserClient = "";
        objectHeaderData.adOrgClient = "";
        objectHeaderData.createdby = "";
        objectHeaderData.trBgcolor = "";
        objectHeaderData.totalCount = "";
        objectHeaderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectHeaderData);
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
    HeaderData objectHeaderData[] = new HeaderData[vector.size()];
    vector.copyInto(objectHeaderData);
    return(objectHeaderData);
  }

/**
Create a registry
 */
  public static HeaderData[] set(String freightCurrencyId, String description, String movementtype, String movementdate, String processed, String processing, String mInoutId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String issotrx, String documentno, String cDoctypeId, String isprinted, String dateacct, String cBpartnerId, String cBpartnerIdr, String cBpartnerLocationId, String adUserId, String mWarehouseId, String poreference, String deliveryrule, String freightcostrule, String freightamt, String deliveryviarule, String mShipperId, String cChargeId, String chargeamt, String priorityrule, String dateprinted, String cOrderId, String mConditionGoodsId, String dateordered, String docstatus, String docaction, String docactionBtn, String createfrom, String generateto, String cInvoiceId, String posted, String postedBtn, String updatelines, String islogistic, String generatelines, String deliveryLocationId, String mFreightcategoryId, String calculateFreight, String salesrepId, String pickdate, String trackingno, String nopackages, String shipdate, String user2Id, String user1Id, String cActivityId, String cCampaignId, String cProjectId, String cProjectIdr, String adOrgtrxId, String rmReceiptPickedit, String rmShipmentPickedit)    throws ServletException {
    HeaderData objectHeaderData[] = new HeaderData[1];
    objectHeaderData[0] = new HeaderData();
    objectHeaderData[0].created = "";
    objectHeaderData[0].createdbyr = createdbyr;
    objectHeaderData[0].updated = "";
    objectHeaderData[0].updatedTimeStamp = "";
    objectHeaderData[0].updatedby = updatedby;
    objectHeaderData[0].updatedbyr = updatedbyr;
    objectHeaderData[0].rmShipmentPickedit = rmShipmentPickedit;
    objectHeaderData[0].adOrgId = adOrgId;
    objectHeaderData[0].adOrgIdr = "";
    objectHeaderData[0].cDoctypeId = cDoctypeId;
    objectHeaderData[0].cDoctypeIdr = "";
    objectHeaderData[0].mConditionGoodsId = mConditionGoodsId;
    objectHeaderData[0].documentno = documentno;
    objectHeaderData[0].poreference = poreference;
    objectHeaderData[0].cBpartnerId = cBpartnerId;
    objectHeaderData[0].cBpartnerIdr = cBpartnerIdr;
    objectHeaderData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectHeaderData[0].cBpartnerLocationIdr = "";
    objectHeaderData[0].movementdate = movementdate;
    objectHeaderData[0].dateacct = dateacct;
    objectHeaderData[0].cOrderId = cOrderId;
    objectHeaderData[0].mWarehouseId = mWarehouseId;
    objectHeaderData[0].description = description;
    objectHeaderData[0].docstatus = docstatus;
    objectHeaderData[0].adUserId = adUserId;
    objectHeaderData[0].createfrom = createfrom;
    objectHeaderData[0].generateto = generateto;
    objectHeaderData[0].docaction = docaction;
    objectHeaderData[0].docactionBtn = docactionBtn;
    objectHeaderData[0].posted = posted;
    objectHeaderData[0].postedBtn = postedBtn;
    objectHeaderData[0].salesrepId = salesrepId;
    objectHeaderData[0].cChargeId = cChargeId;
    objectHeaderData[0].chargeamt = chargeamt;
    objectHeaderData[0].deliveryrule = deliveryrule;
    objectHeaderData[0].deliveryviarule = deliveryviarule;
    objectHeaderData[0].freightamt = freightamt;
    objectHeaderData[0].freightcostrule = freightcostrule;
    objectHeaderData[0].priorityrule = priorityrule;
    objectHeaderData[0].movementtype = movementtype;
    objectHeaderData[0].mShipperId = mShipperId;
    objectHeaderData[0].nopackages = nopackages;
    objectHeaderData[0].mFreightcategoryId = mFreightcategoryId;
    objectHeaderData[0].calculateFreight = calculateFreight;
    objectHeaderData[0].freightCurrencyId = freightCurrencyId;
    objectHeaderData[0].cProjectId = cProjectId;
    objectHeaderData[0].cProjectIdr = cProjectIdr;
    objectHeaderData[0].cActivityId = cActivityId;
    objectHeaderData[0].cCampaignId = cCampaignId;
    objectHeaderData[0].adOrgtrxId = adOrgtrxId;
    objectHeaderData[0].user1Id = user1Id;
    objectHeaderData[0].user2Id = user2Id;
    objectHeaderData[0].pickdate = pickdate;
    objectHeaderData[0].shipdate = shipdate;
    objectHeaderData[0].processed = processed;
    objectHeaderData[0].cInvoiceId = cInvoiceId;
    objectHeaderData[0].updatelines = updatelines;
    objectHeaderData[0].trackingno = trackingno;
    objectHeaderData[0].deliveryLocationId = deliveryLocationId;
    objectHeaderData[0].mInoutId = mInoutId;
    objectHeaderData[0].rmReceiptPickedit = rmReceiptPickedit;
    objectHeaderData[0].generatelines = generatelines;
    objectHeaderData[0].adClientId = adClientId;
    objectHeaderData[0].dateprinted = dateprinted;
    objectHeaderData[0].islogistic = islogistic;
    objectHeaderData[0].processing = processing;
    objectHeaderData[0].isactive = isactive;
    objectHeaderData[0].issotrx = issotrx;
    objectHeaderData[0].dateordered = dateordered;
    objectHeaderData[0].isprinted = isprinted;
    objectHeaderData[0].language = "";
    return objectHeaderData;
  }

/**
Select for auxiliar field
 */
  public static String selectActP154_M_PriceList_Version_ID(ConnectionProvider connectionProvider, String isSOTrx, String C_BPARTNER_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MIN(M_PRICELIST_VERSION_ID) AS TOTAL FROM M_PRICELIST_VERSION M, C_BPARTNER B WHERE M.M_PRICELIST_ID = (CASE ? WHEN 'Y' THEN B.M_PRICELIST_ID ELSE COALESCE(B.PO_PRICELIST_ID, B.M_PRICELIST_ID) END) AND M.ISACTIVE = 'Y' AND B.C_BPARTNER_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isSOTrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPARTNER_ID);

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
  public static String selectDef3526_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef3528_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef3795_2(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDef9585_3(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
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

  public static int updateDocAction(ConnectionProvider connectionProvider, String docaction, String mInoutId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_InOut" +
      "        SET docaction = ? " +
      "        WHERE M_InOut.M_InOut_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);

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
Select for action search
 */
  public static String selectActDefM_InOut_ID(ConnectionProvider connectionProvider, String M_InOut_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DocumentNo FROM M_InOut WHERE isActive='Y' AND M_InOut_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_InOut_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "DOCUMENTNO");
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
      "        UPDATE M_InOut" +
      "        SET RM_Shipment_Pickedit = (?) , AD_Org_ID = (?) , C_DocType_ID = (?) , M_Condition_Goods_ID = (?) , DocumentNo = (?) , POReference = (?) , C_BPartner_ID = (?) , C_BPartner_Location_ID = (?) , MovementDate = TO_DATE(?) , DateAcct = TO_DATE(?) , C_Order_ID = (?) , M_Warehouse_ID = (?) , Description = (?) , DocStatus = (?) , AD_User_ID = (?) , CreateFrom = (?) , GenerateTo = (?) , DocAction = (?) , Posted = (?) , SalesRep_ID = (?) , C_Charge_ID = (?) , ChargeAmt = TO_NUMBER(?) , DeliveryRule = (?) , DeliveryViaRule = (?) , FreightAmt = TO_NUMBER(?) , FreightCostRule = (?) , PriorityRule = (?) , MovementType = (?) , M_Shipper_ID = (?) , NoPackages = TO_NUMBER(?) , M_FreightCategory_ID = (?) , Calculate_Freight = (?) , Freight_Currency_ID = (?) , C_Project_ID = (?) , C_Activity_ID = (?) , C_Campaign_ID = (?) , AD_OrgTrx_ID = (?) , User1_ID = (?) , User2_ID = (?) , PickDate = TO_TIMESTAMP(?, ?) , ShipDate = TO_TIMESTAMP(?, ?) , Processed = (?) , C_Invoice_ID = (?) , UpdateLines = (?) , TrackingNo = (?) , Delivery_Location_ID = (?) , M_InOut_ID = (?) , RM_Receipt_PickEdit = (?) , GenerateLines = (?) , AD_Client_ID = (?) , DatePrinted = TO_DATE(?) , Islogistic = (?) , Processing = (?) , IsActive = (?) , IsSOTrx = (?) , DateOrdered = TO_DATE(?) , IsPrinted = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_InOut.M_InOut_ID = ? " +
      "        AND M_InOut.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_InOut.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmShipmentPickedit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mConditionGoodsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nopackages);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mFreightcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculateFreight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pickdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shipdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatelines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trackingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmReceiptPickedit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatelines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, islogistic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);
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
      "        INSERT INTO M_InOut " +
      "        (RM_Shipment_Pickedit, AD_Org_ID, C_DocType_ID, M_Condition_Goods_ID, DocumentNo, POReference, C_BPartner_ID, C_BPartner_Location_ID, MovementDate, DateAcct, C_Order_ID, M_Warehouse_ID, Description, DocStatus, AD_User_ID, CreateFrom, GenerateTo, DocAction, Posted, SalesRep_ID, C_Charge_ID, ChargeAmt, DeliveryRule, DeliveryViaRule, FreightAmt, FreightCostRule, PriorityRule, MovementType, M_Shipper_ID, NoPackages, M_FreightCategory_ID, Calculate_Freight, Freight_Currency_ID, C_Project_ID, C_Activity_ID, C_Campaign_ID, AD_OrgTrx_ID, User1_ID, User2_ID, PickDate, ShipDate, Processed, C_Invoice_ID, UpdateLines, TrackingNo, Delivery_Location_ID, M_InOut_ID, RM_Receipt_PickEdit, GenerateLines, AD_Client_ID, DatePrinted, Islogistic, Processing, IsActive, IsSOTrx, DateOrdered, IsPrinted, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_TIMESTAMP(?, ?), TO_TIMESTAMP(?, ?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), TO_DATE(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmShipmentPickedit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mConditionGoodsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nopackages);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mFreightcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculateFreight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pickdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shipdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatelines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trackingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmReceiptPickedit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatelines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, islogistic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM M_InOut" +
      "        WHERE M_InOut.M_InOut_ID = ? " +
      "        AND M_InOut.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_InOut.AD_Org_ID IN (";
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
      "          FROM M_InOut" +
      "         WHERE M_InOut.M_InOut_ID = ? ";

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
      "          FROM M_InOut" +
      "         WHERE M_InOut.M_InOut_ID = ? ";

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
