//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.ReturnfromCustomer;

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
  public String docaction;
  public String docactionBtn;
  public String rmReceivematerials;
  public String rmPickfromshipment;
  public String rmAddorphanline;
  public String rmCreateinvoice;
  public String docstatus;
  public String adOrgId;
  public String adOrgIdr;
  public String grandtotal;
  public String cDoctypetargetId;
  public String cDoctypetargetIdr;
  public String totallines;
  public String cCurrencyId;
  public String documentno;
  public String cReturnReasonId;
  public String cReturnReasonIdr;
  public String dateordered;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String mWarehouseId;
  public String invoicerule;
  public String invoiceruler;
  public String cPaymenttermId;
  public String cPaymenttermIdr;
  public String description;
  public String finPaymentmethodId;
  public String finPaymentmethodIdr;
  public String mPricelistId;
  public String mPricelistIdr;
  public String cProjectId;
  public String cProjectIdr;
  public String cActivityId;
  public String cActivityIdr;
  public String cCampaignId;
  public String cCampaignIdr;
  public String adOrgtrxId;
  public String user1Id;
  public String user2Id;
  public String dropshipBpartnerId;
  public String copyfrom;
  public String dropshipLocationId;
  public String isselfservice;
  public String deliveryrule;
  public String freightcostrule;
  public String issotrx;
  public String processed;
  public String dateprinted;
  public String adUserId;
  public String cOrderId;
  public String adClientId;
  public String isdelivered;
  public String isinvoiced;
  public String isprinted;
  public String cDoctypeId;
  public String billtoId;
  public String freightamt;
  public String posted;
  public String istaxincluded;
  public String isselected;
  public String mShipperId;
  public String isactive;
  public String deliveryviarule;
  public String datepromised;
  public String dateacct;
  public String salesrepId;
  public String processing;
  public String priorityrule;
  public String dropshipUserId;
  public String generatetemplate;
  public String deliveryLocationId;
  public String deliverynotes;
  public String cIncotermsId;
  public String incotermsdescription;
  public String copyfrompo;
  public String chargeamt;
  public String poreference;
  public String cChargeId;
  public String paymentrule;
  public String isdiscountprinted;
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
    else if (fieldName.equalsIgnoreCase("DOCACTION"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("DOCACTION_BTN") || fieldName.equals("docactionBtn"))
      return docactionBtn;
    else if (fieldName.equalsIgnoreCase("RM_RECEIVEMATERIALS") || fieldName.equals("rmReceivematerials"))
      return rmReceivematerials;
    else if (fieldName.equalsIgnoreCase("RM_PICKFROMSHIPMENT") || fieldName.equals("rmPickfromshipment"))
      return rmPickfromshipment;
    else if (fieldName.equalsIgnoreCase("RM_ADDORPHANLINE") || fieldName.equals("rmAddorphanline"))
      return rmAddorphanline;
    else if (fieldName.equalsIgnoreCase("RM_CREATEINVOICE") || fieldName.equals("rmCreateinvoice"))
      return rmCreateinvoice;
    else if (fieldName.equalsIgnoreCase("DOCSTATUS"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("GRANDTOTAL"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPETARGET_ID") || fieldName.equals("cDoctypetargetId"))
      return cDoctypetargetId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPETARGET_IDR") || fieldName.equals("cDoctypetargetIdr"))
      return cDoctypetargetIdr;
    else if (fieldName.equalsIgnoreCase("TOTALLINES"))
      return totallines;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("C_RETURN_REASON_ID") || fieldName.equals("cReturnReasonId"))
      return cReturnReasonId;
    else if (fieldName.equalsIgnoreCase("C_RETURN_REASON_IDR") || fieldName.equals("cReturnReasonIdr"))
      return cReturnReasonIdr;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_IDR") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_IDR") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("INVOICERULE"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("INVOICERULER"))
      return invoiceruler;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_ID") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_IDR") || fieldName.equals("cPaymenttermIdr"))
      return cPaymenttermIdr;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_ID") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_IDR") || fieldName.equals("finPaymentmethodIdr"))
      return finPaymentmethodIdr;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_IDR") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_IDR") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_IDR") || fieldName.equals("cActivityIdr"))
      return cActivityIdr;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_IDR") || fieldName.equals("cCampaignIdr"))
      return cCampaignIdr;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("DROPSHIP_BPARTNER_ID") || fieldName.equals("dropshipBpartnerId"))
      return dropshipBpartnerId;
    else if (fieldName.equalsIgnoreCase("COPYFROM"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("DROPSHIP_LOCATION_ID") || fieldName.equals("dropshipLocationId"))
      return dropshipLocationId;
    else if (fieldName.equalsIgnoreCase("ISSELFSERVICE"))
      return isselfservice;
    else if (fieldName.equalsIgnoreCase("DELIVERYRULE"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("FREIGHTCOSTRULE"))
      return freightcostrule;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("DATEPRINTED"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("C_ORDER_ID") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ISDELIVERED"))
      return isdelivered;
    else if (fieldName.equalsIgnoreCase("ISINVOICED"))
      return isinvoiced;
    else if (fieldName.equalsIgnoreCase("ISPRINTED"))
      return isprinted;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("BILLTO_ID") || fieldName.equals("billtoId"))
      return billtoId;
    else if (fieldName.equalsIgnoreCase("FREIGHTAMT"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("ISTAXINCLUDED"))
      return istaxincluded;
    else if (fieldName.equalsIgnoreCase("ISSELECTED"))
      return isselected;
    else if (fieldName.equalsIgnoreCase("M_SHIPPER_ID") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("DELIVERYVIARULE"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("DATEPROMISED"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PRIORITYRULE"))
      return priorityrule;
    else if (fieldName.equalsIgnoreCase("DROPSHIP_USER_ID") || fieldName.equals("dropshipUserId"))
      return dropshipUserId;
    else if (fieldName.equalsIgnoreCase("GENERATETEMPLATE"))
      return generatetemplate;
    else if (fieldName.equalsIgnoreCase("DELIVERY_LOCATION_ID") || fieldName.equals("deliveryLocationId"))
      return deliveryLocationId;
    else if (fieldName.equalsIgnoreCase("DELIVERYNOTES"))
      return deliverynotes;
    else if (fieldName.equalsIgnoreCase("C_INCOTERMS_ID") || fieldName.equals("cIncotermsId"))
      return cIncotermsId;
    else if (fieldName.equalsIgnoreCase("INCOTERMSDESCRIPTION"))
      return incotermsdescription;
    else if (fieldName.equalsIgnoreCase("COPYFROMPO"))
      return copyfrompo;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("ISDISCOUNTPRINTED"))
      return isdiscountprinted;
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
      "        SELECT to_char(C_Order.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Order.CreatedBy) as CreatedByR, " +
      "        to_char(C_Order.Updated, ?) as updated, " +
      "        to_char(C_Order.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Order.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Order.UpdatedBy) as UpdatedByR," +
      "        C_Order.DocAction, " +
      "list1.name as DocAction_BTN, " +
      "C_Order.RM_ReceiveMaterials, " +
      "C_Order.RM_PickFromShipment, " +
      "C_Order.RM_AddOrphanLine, " +
      "C_Order.RM_CreateInvoice, " +
      "C_Order.DocStatus, " +
      "C_Order.AD_Org_ID, " +
      "(CASE WHEN C_Order.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_Order.GrandTotal, " +
      "C_Order.C_DocTypeTarget_ID, " +
      "(CASE WHEN C_Order.C_DocTypeTarget_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_DocTypeTarget_IDR, " +
      "C_Order.TotalLines, " +
      "C_Order.C_Currency_ID, " +
      "C_Order.DocumentNo, " +
      "C_Order.C_Return_Reason_ID, " +
      "(CASE WHEN C_Order.C_Return_Reason_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_Return_Reason_IDR, " +
      "C_Order.DateOrdered, " +
      "C_Order.C_BPartner_ID, " +
      "(CASE WHEN C_Order.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_Order.C_BPartner_Location_ID, " +
      "(CASE WHEN C_Order.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "C_Order.M_Warehouse_ID, " +
      "C_Order.InvoiceRule, " +
      "(CASE WHEN C_Order.InvoiceRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS InvoiceRuleR, " +
      "C_Order.C_PaymentTerm_ID, " +
      "(CASE WHEN C_Order.C_PaymentTerm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS C_PaymentTerm_IDR, " +
      "C_Order.Description, " +
      "C_Order.FIN_Paymentmethod_ID, " +
      "(CASE WHEN C_Order.FIN_Paymentmethod_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS FIN_Paymentmethod_IDR, " +
      "C_Order.M_PriceList_ID, " +
      "(CASE WHEN C_Order.M_PriceList_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "C_Order.C_Project_ID, " +
      "(CASE WHEN C_Order.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_Order.C_Activity_ID, " +
      "(CASE WHEN C_Order.C_Activity_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Name), ''))),'') ) END) AS C_Activity_IDR, " +
      "C_Order.C_Campaign_ID, " +
      "(CASE WHEN C_Order.C_Campaign_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.Name), ''))),'') ) END) AS C_Campaign_IDR, " +
      "C_Order.AD_OrgTrx_ID, " +
      "C_Order.User1_ID, " +
      "C_Order.User2_ID, " +
      "C_Order.DropShip_BPartner_ID, " +
      "C_Order.CopyFrom, " +
      "C_Order.DropShip_Location_ID, " +
      "COALESCE(C_Order.IsSelfService, 'N') AS IsSelfService, " +
      "C_Order.DeliveryRule, " +
      "C_Order.FreightCostRule, " +
      "COALESCE(C_Order.IsSOTrx, 'N') AS IsSOTrx, " +
      "COALESCE(C_Order.Processed, 'N') AS Processed, " +
      "C_Order.DatePrinted, " +
      "C_Order.AD_User_ID, " +
      "C_Order.C_Order_ID, " +
      "C_Order.AD_Client_ID, " +
      "COALESCE(C_Order.IsDelivered, 'N') AS IsDelivered, " +
      "COALESCE(C_Order.IsInvoiced, 'N') AS IsInvoiced, " +
      "COALESCE(C_Order.IsPrinted, 'N') AS IsPrinted, " +
      "C_Order.C_DocType_ID, " +
      "C_Order.BillTo_ID, " +
      "C_Order.FreightAmt, " +
      "C_Order.Posted, " +
      "COALESCE(C_Order.IsTaxIncluded, 'N') AS IsTaxIncluded, " +
      "COALESCE(C_Order.IsSelected, 'N') AS IsSelected, " +
      "C_Order.M_Shipper_ID, " +
      "COALESCE(C_Order.IsActive, 'N') AS IsActive, " +
      "C_Order.DeliveryViaRule, " +
      "C_Order.DatePromised, " +
      "C_Order.DateAcct, " +
      "C_Order.SalesRep_ID, " +
      "C_Order.Processing, " +
      "C_Order.PriorityRule, " +
      "C_Order.DropShip_User_ID, " +
      "C_Order.Generatetemplate, " +
      "C_Order.Delivery_Location_ID, " +
      "C_Order.Deliverynotes, " +
      "C_Order.C_Incoterms_ID, " +
      "C_Order.Incotermsdescription, " +
      "C_Order.CopyFromPO, " +
      "C_Order.ChargeAmt, " +
      "C_Order.POReference, " +
      "C_Order.C_Charge_ID, " +
      "C_Order.PaymentRule, " +
      "COALESCE(C_Order.IsDiscountPrinted, 'N') AS IsDiscountPrinted, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Order left join ad_ref_list_v list1 on (list1.ad_reference_id = 'FF80818130217A35013021A672400035' and list1.ad_language = ?  AND (CASE C_Order.DocAction WHEN '--' THEN 'CL' ELSE TO_CHAR(C_Order.DocAction) END) = list1.value) left join (select AD_Org_ID, Value from AD_Org) table1 on (C_Order.AD_Org_ID = table1.AD_Org_ID) left join (select C_DocType_ID, Name from C_DocType) table2 on (C_Order.C_DocTypeTarget_ID =  table2.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL2 on (table2.C_DocType_ID = tableTRL2.C_DocType_ID and tableTRL2.AD_Language = ?)  left join (select C_Return_Reason_ID, Name from C_Return_Reason) table4 on (C_Order.C_Return_Reason_ID = table4.C_Return_Reason_ID) left join (select C_BPartner_ID, Name from C_BPartner) table5 on (C_Order.C_BPartner_ID = table5.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table6 on (C_Order.C_BPartner_Location_ID = table6.C_BPartner_Location_ID) left join ad_ref_list_v list2 on (C_Order.InvoiceRule = list2.value and list2.ad_reference_id = '150' and list2.ad_language = ?)  left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table7 on (C_Order.C_PaymentTerm_ID = table7.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL7 on (table7.C_PaymentTerm_ID = tableTRL7.C_PaymentTerm_ID and tableTRL7.AD_Language = ?)  left join (select FIN_Paymentmethod_ID, Name from FIN_Paymentmethod) table9 on (C_Order.FIN_Paymentmethod_ID = table9.FIN_Paymentmethod_ID) left join (select M_PriceList_ID, Name from M_PriceList) table10 on (C_Order.M_PriceList_ID = table10.M_PriceList_ID) left join (select C_Project_ID, Value, Name from C_Project) table11 on (C_Order.C_Project_ID = table11.C_Project_ID) left join (select C_Activity_ID, Name from C_Activity) table12 on (C_Order.C_Activity_ID = table12.C_Activity_ID) left join (select C_Campaign_ID, Name from C_Campaign) table13 on (C_Order.C_Campaign_ID = table13.C_Campaign_ID)" +
      "        WHERE 2=2 " +
      " AND C_Order.IsSOTrx='Y' and exists ( select 1 from C_DocType where C_DocType_ID = C_Order.C_DocTypeTarget_ID and isreturn='Y')" +
      "        AND 1=1 " +
      "        AND C_Order.C_Order_ID = ? " +
      "        AND C_Order.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_Order.AD_Org_ID IN (";
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
        objectHeaderData.docaction = UtilSql.getValue(result, "DOCACTION");
        objectHeaderData.docactionBtn = UtilSql.getValue(result, "DOCACTION_BTN");
        objectHeaderData.rmReceivematerials = UtilSql.getValue(result, "RM_RECEIVEMATERIALS");
        objectHeaderData.rmPickfromshipment = UtilSql.getValue(result, "RM_PICKFROMSHIPMENT");
        objectHeaderData.rmAddorphanline = UtilSql.getValue(result, "RM_ADDORPHANLINE");
        objectHeaderData.rmCreateinvoice = UtilSql.getValue(result, "RM_CREATEINVOICE");
        objectHeaderData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectHeaderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectHeaderData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectHeaderData.grandtotal = UtilSql.getValue(result, "GRANDTOTAL");
        objectHeaderData.cDoctypetargetId = UtilSql.getValue(result, "C_DOCTYPETARGET_ID");
        objectHeaderData.cDoctypetargetIdr = UtilSql.getValue(result, "C_DOCTYPETARGET_IDR");
        objectHeaderData.totallines = UtilSql.getValue(result, "TOTALLINES");
        objectHeaderData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectHeaderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectHeaderData.cReturnReasonId = UtilSql.getValue(result, "C_RETURN_REASON_ID");
        objectHeaderData.cReturnReasonIdr = UtilSql.getValue(result, "C_RETURN_REASON_IDR");
        objectHeaderData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectHeaderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectHeaderData.cBpartnerIdr = UtilSql.getValue(result, "C_BPARTNER_IDR");
        objectHeaderData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectHeaderData.cBpartnerLocationIdr = UtilSql.getValue(result, "C_BPARTNER_LOCATION_IDR");
        objectHeaderData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectHeaderData.invoicerule = UtilSql.getValue(result, "INVOICERULE");
        objectHeaderData.invoiceruler = UtilSql.getValue(result, "INVOICERULER");
        objectHeaderData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectHeaderData.cPaymenttermIdr = UtilSql.getValue(result, "C_PAYMENTTERM_IDR");
        objectHeaderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectHeaderData.finPaymentmethodId = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_ID");
        objectHeaderData.finPaymentmethodIdr = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_IDR");
        objectHeaderData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectHeaderData.mPricelistIdr = UtilSql.getValue(result, "M_PRICELIST_IDR");
        objectHeaderData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectHeaderData.cProjectIdr = UtilSql.getValue(result, "C_PROJECT_IDR");
        objectHeaderData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectHeaderData.cActivityIdr = UtilSql.getValue(result, "C_ACTIVITY_IDR");
        objectHeaderData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectHeaderData.cCampaignIdr = UtilSql.getValue(result, "C_CAMPAIGN_IDR");
        objectHeaderData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectHeaderData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectHeaderData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectHeaderData.dropshipBpartnerId = UtilSql.getValue(result, "DROPSHIP_BPARTNER_ID");
        objectHeaderData.copyfrom = UtilSql.getValue(result, "COPYFROM");
        objectHeaderData.dropshipLocationId = UtilSql.getValue(result, "DROPSHIP_LOCATION_ID");
        objectHeaderData.isselfservice = UtilSql.getValue(result, "ISSELFSERVICE");
        objectHeaderData.deliveryrule = UtilSql.getValue(result, "DELIVERYRULE");
        objectHeaderData.freightcostrule = UtilSql.getValue(result, "FREIGHTCOSTRULE");
        objectHeaderData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectHeaderData.processed = UtilSql.getValue(result, "PROCESSED");
        objectHeaderData.dateprinted = UtilSql.getDateValue(result, "DATEPRINTED", "dd-MM-yyyy");
        objectHeaderData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectHeaderData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectHeaderData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectHeaderData.isdelivered = UtilSql.getValue(result, "ISDELIVERED");
        objectHeaderData.isinvoiced = UtilSql.getValue(result, "ISINVOICED");
        objectHeaderData.isprinted = UtilSql.getValue(result, "ISPRINTED");
        objectHeaderData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectHeaderData.billtoId = UtilSql.getValue(result, "BILLTO_ID");
        objectHeaderData.freightamt = UtilSql.getValue(result, "FREIGHTAMT");
        objectHeaderData.posted = UtilSql.getValue(result, "POSTED");
        objectHeaderData.istaxincluded = UtilSql.getValue(result, "ISTAXINCLUDED");
        objectHeaderData.isselected = UtilSql.getValue(result, "ISSELECTED");
        objectHeaderData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectHeaderData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectHeaderData.deliveryviarule = UtilSql.getValue(result, "DELIVERYVIARULE");
        objectHeaderData.datepromised = UtilSql.getDateValue(result, "DATEPROMISED", "dd-MM-yyyy");
        objectHeaderData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectHeaderData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectHeaderData.processing = UtilSql.getValue(result, "PROCESSING");
        objectHeaderData.priorityrule = UtilSql.getValue(result, "PRIORITYRULE");
        objectHeaderData.dropshipUserId = UtilSql.getValue(result, "DROPSHIP_USER_ID");
        objectHeaderData.generatetemplate = UtilSql.getValue(result, "GENERATETEMPLATE");
        objectHeaderData.deliveryLocationId = UtilSql.getValue(result, "DELIVERY_LOCATION_ID");
        objectHeaderData.deliverynotes = UtilSql.getValue(result, "DELIVERYNOTES");
        objectHeaderData.cIncotermsId = UtilSql.getValue(result, "C_INCOTERMS_ID");
        objectHeaderData.incotermsdescription = UtilSql.getValue(result, "INCOTERMSDESCRIPTION");
        objectHeaderData.copyfrompo = UtilSql.getValue(result, "COPYFROMPO");
        objectHeaderData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectHeaderData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectHeaderData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectHeaderData.paymentrule = UtilSql.getValue(result, "PAYMENTRULE");
        objectHeaderData.isdiscountprinted = UtilSql.getValue(result, "ISDISCOUNTPRINTED");
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
  public static HeaderData[] set(String cOrderId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String documentno, String docstatus, String docaction, String docactionBtn, String cDoctypeId, String cDoctypetargetId, String description, String isdelivered, String isinvoiced, String isprinted, String dateordered, String datepromised, String dateacct, String salesrepId, String cPaymenttermId, String billtoId, String cCurrencyId, String invoicerule, String freightamt, String deliveryviarule, String mShipperId, String priorityrule, String totallines, String grandtotal, String mWarehouseId, String mPricelistId, String processing, String cCampaignId, String cBpartnerId, String cBpartnerIdr, String adUserId, String poreference, String cChargeId, String chargeamt, String processed, String cBpartnerLocationId, String cProjectId, String cProjectIdr, String cActivityId, String issotrx, String dateprinted, String deliveryrule, String freightcostrule, String paymentrule, String isdiscountprinted, String posted, String istaxincluded, String isselected, String deliverynotes, String cIncotermsId, String incotermsdescription, String generatetemplate, String deliveryLocationId, String copyfrompo, String finPaymentmethodId, String dropshipUserId, String dropshipBpartnerId, String copyfrom, String dropshipLocationId, String isselfservice, String adOrgtrxId, String user2Id, String user1Id, String rmPickfromshipment, String rmReceivematerials, String rmCreateinvoice, String cReturnReasonId, String rmAddorphanline)    throws ServletException {
    HeaderData objectHeaderData[] = new HeaderData[1];
    objectHeaderData[0] = new HeaderData();
    objectHeaderData[0].created = "";
    objectHeaderData[0].createdbyr = createdbyr;
    objectHeaderData[0].updated = "";
    objectHeaderData[0].updatedTimeStamp = "";
    objectHeaderData[0].updatedby = updatedby;
    objectHeaderData[0].updatedbyr = updatedbyr;
    objectHeaderData[0].docaction = docaction;
    objectHeaderData[0].docactionBtn = docactionBtn;
    objectHeaderData[0].rmReceivematerials = rmReceivematerials;
    objectHeaderData[0].rmPickfromshipment = rmPickfromshipment;
    objectHeaderData[0].rmAddorphanline = rmAddorphanline;
    objectHeaderData[0].rmCreateinvoice = rmCreateinvoice;
    objectHeaderData[0].docstatus = docstatus;
    objectHeaderData[0].adOrgId = adOrgId;
    objectHeaderData[0].adOrgIdr = "";
    objectHeaderData[0].grandtotal = grandtotal;
    objectHeaderData[0].cDoctypetargetId = cDoctypetargetId;
    objectHeaderData[0].cDoctypetargetIdr = "";
    objectHeaderData[0].totallines = totallines;
    objectHeaderData[0].cCurrencyId = cCurrencyId;
    objectHeaderData[0].documentno = documentno;
    objectHeaderData[0].cReturnReasonId = cReturnReasonId;
    objectHeaderData[0].cReturnReasonIdr = "";
    objectHeaderData[0].dateordered = dateordered;
    objectHeaderData[0].cBpartnerId = cBpartnerId;
    objectHeaderData[0].cBpartnerIdr = cBpartnerIdr;
    objectHeaderData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectHeaderData[0].cBpartnerLocationIdr = "";
    objectHeaderData[0].mWarehouseId = mWarehouseId;
    objectHeaderData[0].invoicerule = invoicerule;
    objectHeaderData[0].invoiceruler = "";
    objectHeaderData[0].cPaymenttermId = cPaymenttermId;
    objectHeaderData[0].cPaymenttermIdr = "";
    objectHeaderData[0].description = description;
    objectHeaderData[0].finPaymentmethodId = finPaymentmethodId;
    objectHeaderData[0].finPaymentmethodIdr = "";
    objectHeaderData[0].mPricelistId = mPricelistId;
    objectHeaderData[0].mPricelistIdr = "";
    objectHeaderData[0].cProjectId = cProjectId;
    objectHeaderData[0].cProjectIdr = cProjectIdr;
    objectHeaderData[0].cActivityId = cActivityId;
    objectHeaderData[0].cActivityIdr = "";
    objectHeaderData[0].cCampaignId = cCampaignId;
    objectHeaderData[0].cCampaignIdr = "";
    objectHeaderData[0].adOrgtrxId = adOrgtrxId;
    objectHeaderData[0].user1Id = user1Id;
    objectHeaderData[0].user2Id = user2Id;
    objectHeaderData[0].dropshipBpartnerId = dropshipBpartnerId;
    objectHeaderData[0].copyfrom = copyfrom;
    objectHeaderData[0].dropshipLocationId = dropshipLocationId;
    objectHeaderData[0].isselfservice = isselfservice;
    objectHeaderData[0].deliveryrule = deliveryrule;
    objectHeaderData[0].freightcostrule = freightcostrule;
    objectHeaderData[0].issotrx = issotrx;
    objectHeaderData[0].processed = processed;
    objectHeaderData[0].dateprinted = dateprinted;
    objectHeaderData[0].adUserId = adUserId;
    objectHeaderData[0].cOrderId = cOrderId;
    objectHeaderData[0].adClientId = adClientId;
    objectHeaderData[0].isdelivered = isdelivered;
    objectHeaderData[0].isinvoiced = isinvoiced;
    objectHeaderData[0].isprinted = isprinted;
    objectHeaderData[0].cDoctypeId = cDoctypeId;
    objectHeaderData[0].billtoId = billtoId;
    objectHeaderData[0].freightamt = freightamt;
    objectHeaderData[0].posted = posted;
    objectHeaderData[0].istaxincluded = istaxincluded;
    objectHeaderData[0].isselected = isselected;
    objectHeaderData[0].mShipperId = mShipperId;
    objectHeaderData[0].isactive = isactive;
    objectHeaderData[0].deliveryviarule = deliveryviarule;
    objectHeaderData[0].datepromised = datepromised;
    objectHeaderData[0].dateacct = dateacct;
    objectHeaderData[0].salesrepId = salesrepId;
    objectHeaderData[0].processing = processing;
    objectHeaderData[0].priorityrule = priorityrule;
    objectHeaderData[0].dropshipUserId = dropshipUserId;
    objectHeaderData[0].generatetemplate = generatetemplate;
    objectHeaderData[0].deliveryLocationId = deliveryLocationId;
    objectHeaderData[0].deliverynotes = deliverynotes;
    objectHeaderData[0].cIncotermsId = cIncotermsId;
    objectHeaderData[0].incotermsdescription = incotermsdescription;
    objectHeaderData[0].copyfrompo = copyfrompo;
    objectHeaderData[0].chargeamt = chargeamt;
    objectHeaderData[0].poreference = poreference;
    objectHeaderData[0].cChargeId = cChargeId;
    objectHeaderData[0].paymentrule = paymentrule;
    objectHeaderData[0].isdiscountprinted = isdiscountprinted;
    objectHeaderData[0].language = "";
    return objectHeaderData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux73DECB6E080A4D44AD634276A3C895DE(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (sum(abs(qtyordered)) - sum(abs(qtyinvoiced))) FROM c_orderline WHERE c_order_id = ? ";

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
        strReturn = UtilSql.getValue(result, "(SUM(ABS(QTYORDERED))-SUM(ABS(QTYINVOICED)))");
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
  public static String selectAux15881B450C7B49BE863EB74EA921E3A1(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT count(*)" +
      "FROM c_orderline ol" +
      "     JOIN m_inoutline il ON ol.m_inoutline_id = il.m_inoutline_id" +
      "     JOIN c_orderline ol2 ON il.c_orderline_id = ol2.c_orderline_id AND ol2.qtyinvoiced != 0" +
      "AND ol.c_order_id = ? ";

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
        strReturn = UtilSql.getValue(result, "COUNT(*)");
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
  public static String selectAux2D63067CABB647F08A0EBE14281A4DB8(ConnectionProvider connectionProvider, String C_ORDER_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DOCSUBTYPESO FROM C_ORDER, C_DOCTYPE WHERE C_DOCTYPE.C_DOCTYPE_ID = C_ORDER.C_DOCTYPETARGET_ID AND C_ORDER.C_ORDER_ID=? ";

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
        strReturn = UtilSql.getValue(result, "DOCSUBTYPESO");
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
  public static String selectDef2166_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2168_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef2762_2(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDef3402_3(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
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

  public static int updateDocAction(ConnectionProvider connectionProvider, String docaction, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_Order" +
      "        SET docaction = ? " +
      "        WHERE C_Order.C_Order_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_Order" +
      "        SET DocAction = (?) , RM_ReceiveMaterials = (?) , RM_PickFromShipment = (?) , RM_AddOrphanLine = (?) , RM_CreateInvoice = (?) , DocStatus = (?) , AD_Org_ID = (?) , GrandTotal = TO_NUMBER(?) , C_DocTypeTarget_ID = (?) , TotalLines = TO_NUMBER(?) , C_Currency_ID = (?) , DocumentNo = (?) , C_Return_Reason_ID = (?) , DateOrdered = TO_DATE(?) , C_BPartner_ID = (?) , C_BPartner_Location_ID = (?) , M_Warehouse_ID = (?) , InvoiceRule = (?) , C_PaymentTerm_ID = (?) , Description = (?) , FIN_Paymentmethod_ID = (?) , M_PriceList_ID = (?) , C_Project_ID = (?) , C_Activity_ID = (?) , C_Campaign_ID = (?) , AD_OrgTrx_ID = (?) , User1_ID = (?) , User2_ID = (?) , DropShip_BPartner_ID = (?) , CopyFrom = (?) , DropShip_Location_ID = (?) , IsSelfService = (?) , DeliveryRule = (?) , FreightCostRule = (?) , IsSOTrx = (?) , Processed = (?) , DatePrinted = TO_DATE(?) , AD_User_ID = (?) , C_Order_ID = (?) , AD_Client_ID = (?) , IsDelivered = (?) , IsInvoiced = (?) , IsPrinted = (?) , C_DocType_ID = (?) , BillTo_ID = (?) , FreightAmt = TO_NUMBER(?) , Posted = (?) , IsTaxIncluded = (?) , IsSelected = (?) , M_Shipper_ID = (?) , IsActive = (?) , DeliveryViaRule = (?) , DatePromised = TO_DATE(?) , DateAcct = TO_DATE(?) , SalesRep_ID = (?) , Processing = (?) , PriorityRule = (?) , DropShip_User_ID = (?) , Generatetemplate = (?) , Delivery_Location_ID = (?) , Deliverynotes = (?) , C_Incoterms_ID = (?) , Incotermsdescription = (?) , CopyFromPO = (?) , ChargeAmt = TO_NUMBER(?) , POReference = (?) , C_Charge_ID = (?) , PaymentRule = (?) , IsDiscountPrinted = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_Order.C_Order_ID = ? " +
      "        AND C_Order.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Order.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmReceivematerials);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmPickfromshipment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmAddorphanline);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmCreateinvoice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReturnReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselected);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatetemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverynotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cIncotermsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, incotermsdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrompo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
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
      "        INSERT INTO C_Order " +
      "        (DocAction, RM_ReceiveMaterials, RM_PickFromShipment, RM_AddOrphanLine, RM_CreateInvoice, DocStatus, AD_Org_ID, GrandTotal, C_DocTypeTarget_ID, TotalLines, C_Currency_ID, DocumentNo, C_Return_Reason_ID, DateOrdered, C_BPartner_ID, C_BPartner_Location_ID, M_Warehouse_ID, InvoiceRule, C_PaymentTerm_ID, Description, FIN_Paymentmethod_ID, M_PriceList_ID, C_Project_ID, C_Activity_ID, C_Campaign_ID, AD_OrgTrx_ID, User1_ID, User2_ID, DropShip_BPartner_ID, CopyFrom, DropShip_Location_ID, IsSelfService, DeliveryRule, FreightCostRule, IsSOTrx, Processed, DatePrinted, AD_User_ID, C_Order_ID, AD_Client_ID, IsDelivered, IsInvoiced, IsPrinted, C_DocType_ID, BillTo_ID, FreightAmt, Posted, IsTaxIncluded, IsSelected, M_Shipper_ID, IsActive, DeliveryViaRule, DatePromised, DateAcct, SalesRep_ID, Processing, PriorityRule, DropShip_User_ID, Generatetemplate, Delivery_Location_ID, Deliverynotes, C_Incoterms_ID, Incotermsdescription, CopyFromPO, ChargeAmt, POReference, C_Charge_ID, PaymentRule, IsDiscountPrinted, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmReceivematerials);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmPickfromshipment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmAddorphanline);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rmCreateinvoice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReturnReasonId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselected);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatetemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverynotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cIncotermsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, incotermsdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrompo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
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
      "        DELETE FROM C_Order" +
      "        WHERE C_Order.C_Order_ID = ? " +
      "        AND C_Order.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Order.AD_Org_ID IN (";
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
      "          FROM C_Order" +
      "         WHERE C_Order.C_Order_ID = ? ";

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
      "          FROM C_Order" +
      "         WHERE C_Order.C_Order_ID = ? ";

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
