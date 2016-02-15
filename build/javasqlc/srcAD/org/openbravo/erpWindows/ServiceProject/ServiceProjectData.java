//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.ServiceProject;

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
class ServiceProjectData implements FieldProvider {
static Logger log4j = Logger.getLogger(ServiceProjectData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String value;
  public String name;
  public String issummary;
  public String projectphase;
  public String projectphaser;
  public String startdate;
  public String datecontract;
  public String datefinish;
  public String invoiceToproject;
  public String salesrepId;
  public String salesrepIdr;
  public String responsibleId;
  public String responsibleIdr;
  public String cLocationId;
  public String cLocationIdr;
  public String description;
  public String plannedamt;
  public String plannedqty;
  public String plannedmarginamt;
  public String iscommitment;
  public String iscommitceiling;
  public String committedamt;
  public String committedqty;
  public String servrevenue;
  public String expexpenses;
  public String servcost;
  public String expreinvoicing;
  public String servmargin;
  public String expmargin;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String adUserId;
  public String adUserIdr;
  public String poreference;
  public String finPaymentmethodId;
  public String finPaymentmethodIdr;
  public String cPaymenttermId;
  public String cPaymenttermIdr;
  public String createtemppricelist;
  public String mPricelistId;
  public String mPricelistIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String mWarehouseId;
  public String mWarehouseIdr;
  public String changeprojectstatus;
  public String copyfrom;
  public String generateorder;
  public String projectstatus;
  public String cProjectId;
  public String generateto;
  public String processed;
  public String billtoId;
  public String adClientId;
  public String note;
  public String projectkind;
  public String projectbalanceamt;
  public String invoicedamt;
  public String documentCopies;
  public String accountno;
  public String cPhaseId;
  public String cProjecttypeId;
  public String invoicedqty;
  public String mPricelistVersionId;
  public String projectcategory;
  public String processing;
  public String paymentrule;
  public String plannedpoamt;
  public String isactive;
  public String setprojecttype;
  public String cProjectphaseId;
  public String publicprivate;
  public String cCampaignId;
  public String lastplannedproposaldate;
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
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("ISSUMMARY"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("PROJECTPHASE"))
      return projectphase;
    else if (fieldName.equalsIgnoreCase("PROJECTPHASER"))
      return projectphaser;
    else if (fieldName.equalsIgnoreCase("STARTDATE"))
      return startdate;
    else if (fieldName.equalsIgnoreCase("DATECONTRACT"))
      return datecontract;
    else if (fieldName.equalsIgnoreCase("DATEFINISH"))
      return datefinish;
    else if (fieldName.equalsIgnoreCase("INVOICE_TOPROJECT") || fieldName.equals("invoiceToproject"))
      return invoiceToproject;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("SALESREP_IDR") || fieldName.equals("salesrepIdr"))
      return salesrepIdr;
    else if (fieldName.equalsIgnoreCase("RESPONSIBLE_ID") || fieldName.equals("responsibleId"))
      return responsibleId;
    else if (fieldName.equalsIgnoreCase("RESPONSIBLE_IDR") || fieldName.equals("responsibleIdr"))
      return responsibleIdr;
    else if (fieldName.equalsIgnoreCase("C_LOCATION_ID") || fieldName.equals("cLocationId"))
      return cLocationId;
    else if (fieldName.equalsIgnoreCase("C_LOCATION_IDR") || fieldName.equals("cLocationIdr"))
      return cLocationIdr;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("PLANNEDAMT"))
      return plannedamt;
    else if (fieldName.equalsIgnoreCase("PLANNEDQTY"))
      return plannedqty;
    else if (fieldName.equalsIgnoreCase("PLANNEDMARGINAMT"))
      return plannedmarginamt;
    else if (fieldName.equalsIgnoreCase("ISCOMMITMENT"))
      return iscommitment;
    else if (fieldName.equalsIgnoreCase("ISCOMMITCEILING"))
      return iscommitceiling;
    else if (fieldName.equalsIgnoreCase("COMMITTEDAMT"))
      return committedamt;
    else if (fieldName.equalsIgnoreCase("COMMITTEDQTY"))
      return committedqty;
    else if (fieldName.equalsIgnoreCase("SERVREVENUE"))
      return servrevenue;
    else if (fieldName.equalsIgnoreCase("EXPEXPENSES"))
      return expexpenses;
    else if (fieldName.equalsIgnoreCase("SERVCOST"))
      return servcost;
    else if (fieldName.equalsIgnoreCase("EXPREINVOICING"))
      return expreinvoicing;
    else if (fieldName.equalsIgnoreCase("SERVMARGIN"))
      return servmargin;
    else if (fieldName.equalsIgnoreCase("EXPMARGIN"))
      return expmargin;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_IDR") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_IDR") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("AD_USER_IDR") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_ID") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_IDR") || fieldName.equals("finPaymentmethodIdr"))
      return finPaymentmethodIdr;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_ID") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_IDR") || fieldName.equals("cPaymenttermIdr"))
      return cPaymenttermIdr;
    else if (fieldName.equalsIgnoreCase("CREATETEMPPRICELIST"))
      return createtemppricelist;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_IDR") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_IDR") || fieldName.equals("mWarehouseIdr"))
      return mWarehouseIdr;
    else if (fieldName.equalsIgnoreCase("CHANGEPROJECTSTATUS"))
      return changeprojectstatus;
    else if (fieldName.equalsIgnoreCase("COPYFROM"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("GENERATEORDER"))
      return generateorder;
    else if (fieldName.equalsIgnoreCase("PROJECTSTATUS"))
      return projectstatus;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("GENERATETO"))
      return generateto;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("BILLTO_ID") || fieldName.equals("billtoId"))
      return billtoId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("NOTE"))
      return note;
    else if (fieldName.equalsIgnoreCase("PROJECTKIND"))
      return projectkind;
    else if (fieldName.equalsIgnoreCase("PROJECTBALANCEAMT"))
      return projectbalanceamt;
    else if (fieldName.equalsIgnoreCase("INVOICEDAMT"))
      return invoicedamt;
    else if (fieldName.equalsIgnoreCase("DOCUMENT_COPIES") || fieldName.equals("documentCopies"))
      return documentCopies;
    else if (fieldName.equalsIgnoreCase("ACCOUNTNO"))
      return accountno;
    else if (fieldName.equalsIgnoreCase("C_PHASE_ID") || fieldName.equals("cPhaseId"))
      return cPhaseId;
    else if (fieldName.equalsIgnoreCase("C_PROJECTTYPE_ID") || fieldName.equals("cProjecttypeId"))
      return cProjecttypeId;
    else if (fieldName.equalsIgnoreCase("INVOICEDQTY"))
      return invoicedqty;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_VERSION_ID") || fieldName.equals("mPricelistVersionId"))
      return mPricelistVersionId;
    else if (fieldName.equalsIgnoreCase("PROJECTCATEGORY"))
      return projectcategory;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("PLANNEDPOAMT"))
      return plannedpoamt;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("SETPROJECTTYPE"))
      return setprojecttype;
    else if (fieldName.equalsIgnoreCase("C_PROJECTPHASE_ID") || fieldName.equals("cProjectphaseId"))
      return cProjectphaseId;
    else if (fieldName.equalsIgnoreCase("PUBLICPRIVATE"))
      return publicprivate;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("LASTPLANNEDPROPOSALDATE"))
      return lastplannedproposaldate;
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
  public static ServiceProjectData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ServiceProjectData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_Project.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Project.CreatedBy) as CreatedByR, " +
      "        to_char(C_Project.Updated, ?) as updated, " +
      "        to_char(C_Project.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Project.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Project.UpdatedBy) as UpdatedByR," +
      "        C_Project.AD_Org_ID, " +
      "(CASE WHEN C_Project.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_Project.Value, " +
      "C_Project.Name, " +
      "COALESCE(C_Project.IsSummary, 'N') AS IsSummary, " +
      "C_Project.Projectphase, " +
      "(CASE WHEN C_Project.Projectphase IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS ProjectphaseR, " +
      "C_Project.Startdate, " +
      "C_Project.DateContract, " +
      "C_Project.DateFinish, " +
      "COALESCE(C_Project.Invoice_ToProject, 'N') AS Invoice_ToProject, " +
      "C_Project.SalesRep_ID, " +
      "(CASE WHEN C_Project.SalesRep_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS SalesRep_IDR, " +
      "C_Project.Responsible_ID, " +
      "(CASE WHEN C_Project.Responsible_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS Responsible_IDR, " +
      "C_Project.C_Location_ID, " +
      "(CASE WHEN C_Project.C_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Address1), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Address2), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Postal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.City), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS C_Location_IDR, " +
      "C_Project.Description, " +
      "C_Project.PlannedAmt, " +
      "C_Project.PlannedQty, " +
      "C_Project.PlannedMarginAmt, " +
      "COALESCE(C_Project.IsCommitment, 'N') AS IsCommitment, " +
      "COALESCE(C_Project.IsCommitCeiling, 'N') AS IsCommitCeiling, " +
      "C_Project.CommittedAmt, " +
      "C_Project.CommittedQty, " +
      "C_Project.Servrevenue, " +
      "C_Project.Expexpenses, " +
      "C_Project.Servcost, " +
      "C_Project.Expreinvoicing, " +
      "C_Project.Servmargin, " +
      "C_Project.Expmargin, " +
      "C_Project.C_BPartner_ID, " +
      "(CASE WHEN C_Project.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_Project.C_BPartner_Location_ID, " +
      "(CASE WHEN C_Project.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "C_Project.AD_User_ID, " +
      "(CASE WHEN C_Project.AD_User_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "C_Project.POReference, " +
      "C_Project.FIN_Paymentmethod_ID, " +
      "(CASE WHEN C_Project.FIN_Paymentmethod_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS FIN_Paymentmethod_IDR, " +
      "C_Project.C_PaymentTerm_ID, " +
      "(CASE WHEN C_Project.C_PaymentTerm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL12.Name IS NULL THEN TO_CHAR(table12.Name) ELSE TO_CHAR(tableTRL12.Name) END)), ''))),'') ) END) AS C_PaymentTerm_IDR, " +
      "COALESCE(C_Project.Createtemppricelist, 'N') AS Createtemppricelist, " +
      "C_Project.M_PriceList_ID, " +
      "(CASE WHEN C_Project.M_PriceList_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "C_Project.C_Currency_ID, " +
      "(CASE WHEN C_Project.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "C_Project.M_Warehouse_ID, " +
      "(CASE WHEN C_Project.M_Warehouse_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table16.Name), ''))),'') ) END) AS M_Warehouse_IDR, " +
      "C_Project.ChangeProjectStatus, " +
      "C_Project.CopyFrom, " +
      "C_Project.GenerateOrder, " +
      "C_Project.Projectstatus, " +
      "C_Project.C_Project_ID, " +
      "C_Project.GenerateTo, " +
      "COALESCE(C_Project.Processed, 'N') AS Processed, " +
      "C_Project.BillTo_ID, " +
      "C_Project.AD_Client_ID, " +
      "C_Project.Note, " +
      "C_Project.Projectkind, " +
      "C_Project.ProjectBalanceAmt, " +
      "C_Project.InvoicedAmt, " +
      "C_Project.Document_Copies, " +
      "C_Project.AccountNo, " +
      "C_Project.C_Phase_ID, " +
      "C_Project.C_ProjectType_ID, " +
      "C_Project.InvoicedQty, " +
      "C_Project.M_PriceList_Version_ID, " +
      "C_Project.ProjectCategory, " +
      "C_Project.Processing, " +
      "C_Project.PaymentRule, " +
      "C_Project.PlannedPOAmt, " +
      "COALESCE(C_Project.IsActive, 'N') AS IsActive, " +
      "C_Project.Setprojecttype, " +
      "C_Project.C_ProjectPhase_ID, " +
      "C_Project.Publicprivate, " +
      "C_Project.C_Campaign_ID, " +
      "C_Project.LastPlannedProposalDate, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Project left join (select AD_Org_ID, Value from AD_Org) table1 on (C_Project.AD_Org_ID = table1.AD_Org_ID) left join ad_ref_list_v list1 on (C_Project.Projectphase = list1.value and list1.ad_reference_id = '800003' and list1.ad_language = ?)  left join (select AD_User_ID, Name from AD_User) table2 on (C_Project.SalesRep_ID =  table2.AD_User_ID) left join (select C_BPartner_ID, Name from C_BPartner) table3 on (C_Project.Responsible_ID =  table3.C_BPartner_ID) left join (select C_Location_ID, Address1, Address2, Postal, City, C_Region_ID, C_Country_ID from C_Location) table4 on (C_Project.C_Location_ID = table4.C_Location_ID) left join (select C_Region_ID, Name from C_Region) table5 on (table4.C_Region_ID = table5.C_Region_ID) left join (select C_Country_ID, Name from C_Country) table6 on (table4.C_Country_ID = table6.C_Country_ID) left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL6 on (table6.C_Country_ID = tableTRL6.C_Country_ID and tableTRL6.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table8 on (C_Project.C_BPartner_ID = table8.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table9 on (C_Project.C_BPartner_Location_ID = table9.C_BPartner_Location_ID) left join (select AD_User_ID, Name from AD_User) table10 on (C_Project.AD_User_ID = table10.AD_User_ID) left join (select FIN_Paymentmethod_ID, Name from FIN_Paymentmethod) table11 on (C_Project.FIN_Paymentmethod_ID = table11.FIN_Paymentmethod_ID) left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table12 on (C_Project.C_PaymentTerm_ID = table12.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL12 on (table12.C_PaymentTerm_ID = tableTRL12.C_PaymentTerm_ID and tableTRL12.AD_Language = ?)  left join (select M_PriceList_ID, Name from M_PriceList) table14 on (C_Project.M_PriceList_ID = table14.M_PriceList_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table15 on (C_Project.C_Currency_ID = table15.C_Currency_ID) left join (select M_Warehouse_ID, Name from M_Warehouse) table16 on (C_Project.M_Warehouse_ID = table16.M_Warehouse_ID)" +
      "        WHERE 2=2 " +
      " AND (C_Project.ProjectCategory<>'S' OR C_Project.ProjectCategory IS NULL)" +
      "        AND 1=1 " +
      "        AND C_Project.C_Project_ID = ? " +
      "        AND C_Project.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_Project.AD_Org_ID IN (";
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
        ServiceProjectData objectServiceProjectData = new ServiceProjectData();
        objectServiceProjectData.created = UtilSql.getValue(result, "CREATED");
        objectServiceProjectData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectServiceProjectData.updated = UtilSql.getValue(result, "UPDATED");
        objectServiceProjectData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectServiceProjectData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectServiceProjectData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectServiceProjectData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectServiceProjectData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectServiceProjectData.value = UtilSql.getValue(result, "VALUE");
        objectServiceProjectData.name = UtilSql.getValue(result, "NAME");
        objectServiceProjectData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectServiceProjectData.projectphase = UtilSql.getValue(result, "PROJECTPHASE");
        objectServiceProjectData.projectphaser = UtilSql.getValue(result, "PROJECTPHASER");
        objectServiceProjectData.startdate = UtilSql.getDateValue(result, "STARTDATE", "dd-MM-yyyy");
        objectServiceProjectData.datecontract = UtilSql.getDateValue(result, "DATECONTRACT", "dd-MM-yyyy");
        objectServiceProjectData.datefinish = UtilSql.getDateValue(result, "DATEFINISH", "dd-MM-yyyy");
        objectServiceProjectData.invoiceToproject = UtilSql.getValue(result, "INVOICE_TOPROJECT");
        objectServiceProjectData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectServiceProjectData.salesrepIdr = UtilSql.getValue(result, "SALESREP_IDR");
        objectServiceProjectData.responsibleId = UtilSql.getValue(result, "RESPONSIBLE_ID");
        objectServiceProjectData.responsibleIdr = UtilSql.getValue(result, "RESPONSIBLE_IDR");
        objectServiceProjectData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectServiceProjectData.cLocationIdr = UtilSql.getValue(result, "C_LOCATION_IDR");
        objectServiceProjectData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectServiceProjectData.plannedamt = UtilSql.getValue(result, "PLANNEDAMT");
        objectServiceProjectData.plannedqty = UtilSql.getValue(result, "PLANNEDQTY");
        objectServiceProjectData.plannedmarginamt = UtilSql.getValue(result, "PLANNEDMARGINAMT");
        objectServiceProjectData.iscommitment = UtilSql.getValue(result, "ISCOMMITMENT");
        objectServiceProjectData.iscommitceiling = UtilSql.getValue(result, "ISCOMMITCEILING");
        objectServiceProjectData.committedamt = UtilSql.getValue(result, "COMMITTEDAMT");
        objectServiceProjectData.committedqty = UtilSql.getValue(result, "COMMITTEDQTY");
        objectServiceProjectData.servrevenue = UtilSql.getValue(result, "SERVREVENUE");
        objectServiceProjectData.expexpenses = UtilSql.getValue(result, "EXPEXPENSES");
        objectServiceProjectData.servcost = UtilSql.getValue(result, "SERVCOST");
        objectServiceProjectData.expreinvoicing = UtilSql.getValue(result, "EXPREINVOICING");
        objectServiceProjectData.servmargin = UtilSql.getValue(result, "SERVMARGIN");
        objectServiceProjectData.expmargin = UtilSql.getValue(result, "EXPMARGIN");
        objectServiceProjectData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectServiceProjectData.cBpartnerIdr = UtilSql.getValue(result, "C_BPARTNER_IDR");
        objectServiceProjectData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectServiceProjectData.cBpartnerLocationIdr = UtilSql.getValue(result, "C_BPARTNER_LOCATION_IDR");
        objectServiceProjectData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectServiceProjectData.adUserIdr = UtilSql.getValue(result, "AD_USER_IDR");
        objectServiceProjectData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectServiceProjectData.finPaymentmethodId = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_ID");
        objectServiceProjectData.finPaymentmethodIdr = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_IDR");
        objectServiceProjectData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectServiceProjectData.cPaymenttermIdr = UtilSql.getValue(result, "C_PAYMENTTERM_IDR");
        objectServiceProjectData.createtemppricelist = UtilSql.getValue(result, "CREATETEMPPRICELIST");
        objectServiceProjectData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectServiceProjectData.mPricelistIdr = UtilSql.getValue(result, "M_PRICELIST_IDR");
        objectServiceProjectData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectServiceProjectData.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectServiceProjectData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectServiceProjectData.mWarehouseIdr = UtilSql.getValue(result, "M_WAREHOUSE_IDR");
        objectServiceProjectData.changeprojectstatus = UtilSql.getValue(result, "CHANGEPROJECTSTATUS");
        objectServiceProjectData.copyfrom = UtilSql.getValue(result, "COPYFROM");
        objectServiceProjectData.generateorder = UtilSql.getValue(result, "GENERATEORDER");
        objectServiceProjectData.projectstatus = UtilSql.getValue(result, "PROJECTSTATUS");
        objectServiceProjectData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectServiceProjectData.generateto = UtilSql.getValue(result, "GENERATETO");
        objectServiceProjectData.processed = UtilSql.getValue(result, "PROCESSED");
        objectServiceProjectData.billtoId = UtilSql.getValue(result, "BILLTO_ID");
        objectServiceProjectData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectServiceProjectData.note = UtilSql.getValue(result, "NOTE");
        objectServiceProjectData.projectkind = UtilSql.getValue(result, "PROJECTKIND");
        objectServiceProjectData.projectbalanceamt = UtilSql.getValue(result, "PROJECTBALANCEAMT");
        objectServiceProjectData.invoicedamt = UtilSql.getValue(result, "INVOICEDAMT");
        objectServiceProjectData.documentCopies = UtilSql.getValue(result, "DOCUMENT_COPIES");
        objectServiceProjectData.accountno = UtilSql.getValue(result, "ACCOUNTNO");
        objectServiceProjectData.cPhaseId = UtilSql.getValue(result, "C_PHASE_ID");
        objectServiceProjectData.cProjecttypeId = UtilSql.getValue(result, "C_PROJECTTYPE_ID");
        objectServiceProjectData.invoicedqty = UtilSql.getValue(result, "INVOICEDQTY");
        objectServiceProjectData.mPricelistVersionId = UtilSql.getValue(result, "M_PRICELIST_VERSION_ID");
        objectServiceProjectData.projectcategory = UtilSql.getValue(result, "PROJECTCATEGORY");
        objectServiceProjectData.processing = UtilSql.getValue(result, "PROCESSING");
        objectServiceProjectData.paymentrule = UtilSql.getValue(result, "PAYMENTRULE");
        objectServiceProjectData.plannedpoamt = UtilSql.getValue(result, "PLANNEDPOAMT");
        objectServiceProjectData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectServiceProjectData.setprojecttype = UtilSql.getValue(result, "SETPROJECTTYPE");
        objectServiceProjectData.cProjectphaseId = UtilSql.getValue(result, "C_PROJECTPHASE_ID");
        objectServiceProjectData.publicprivate = UtilSql.getValue(result, "PUBLICPRIVATE");
        objectServiceProjectData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectServiceProjectData.lastplannedproposaldate = UtilSql.getDateValue(result, "LASTPLANNEDPROPOSALDATE", "dd-MM-yyyy");
        objectServiceProjectData.language = UtilSql.getValue(result, "LANGUAGE");
        objectServiceProjectData.adUserClient = "";
        objectServiceProjectData.adOrgClient = "";
        objectServiceProjectData.createdby = "";
        objectServiceProjectData.trBgcolor = "";
        objectServiceProjectData.totalCount = "";
        objectServiceProjectData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectServiceProjectData);
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
    ServiceProjectData objectServiceProjectData[] = new ServiceProjectData[vector.size()];
    vector.copyInto(objectServiceProjectData);
    return(objectServiceProjectData);
  }

/**
Create a registry
 */
  public static ServiceProjectData[] set(String cProjectphaseId, String createtemppricelist, String startdate, String cProjectId, String adOrgId, String adClientId, String isactive, String created, String createdby, String createdbyr, String name, String updatedby, String updatedbyr, String description, String issummary, String value, String cCurrencyId, String cBpartnerId, String cBpartnerIdr, String iscommitment, String committedamt, String datecontract, String datefinish, String generateto, String processed, String note, String salesrepId, String mPricelistVersionId, String plannedamt, String plannedqty, String plannedmarginamt, String poreference, String cCampaignId, String cPaymenttermId, String adUserId, String cBpartnerLocationId, String publicprivate, String projectstatus, String projectkind, String billtoId, String projectphase, String generateorder, String changeprojectstatus, String changeprojectstatusBtn, String cLocationId, String cLocationIdr, String mPricelistId, String paymentrule, String invoiceToproject, String plannedpoamt, String lastplannedproposaldate, String documentCopies, String accountno, String responsibleId, String servrevenue, String servcost, String servmargin, String expreinvoicing, String expexpenses, String expmargin, String setprojecttype, String finPaymentmethodId, String invoicedamt, String copyfrom, String cPhaseId, String invoicedqty, String cProjecttypeId, String projectbalanceamt, String committedqty, String iscommitceiling, String mWarehouseId, String projectcategory, String processing)    throws ServletException {
    ServiceProjectData objectServiceProjectData[] = new ServiceProjectData[1];
    objectServiceProjectData[0] = new ServiceProjectData();
    objectServiceProjectData[0].created = created;
    objectServiceProjectData[0].createdbyr = createdbyr;
    objectServiceProjectData[0].updated = "";
    objectServiceProjectData[0].updatedTimeStamp = "";
    objectServiceProjectData[0].updatedby = updatedby;
    objectServiceProjectData[0].updatedbyr = updatedbyr;
    objectServiceProjectData[0].adOrgId = adOrgId;
    objectServiceProjectData[0].adOrgIdr = "";
    objectServiceProjectData[0].value = value;
    objectServiceProjectData[0].name = name;
    objectServiceProjectData[0].issummary = issummary;
    objectServiceProjectData[0].projectphase = projectphase;
    objectServiceProjectData[0].projectphaser = "";
    objectServiceProjectData[0].startdate = startdate;
    objectServiceProjectData[0].datecontract = datecontract;
    objectServiceProjectData[0].datefinish = datefinish;
    objectServiceProjectData[0].invoiceToproject = invoiceToproject;
    objectServiceProjectData[0].salesrepId = salesrepId;
    objectServiceProjectData[0].salesrepIdr = "";
    objectServiceProjectData[0].responsibleId = responsibleId;
    objectServiceProjectData[0].responsibleIdr = "";
    objectServiceProjectData[0].cLocationId = cLocationId;
    objectServiceProjectData[0].cLocationIdr = cLocationIdr;
    objectServiceProjectData[0].description = description;
    objectServiceProjectData[0].plannedamt = plannedamt;
    objectServiceProjectData[0].plannedqty = plannedqty;
    objectServiceProjectData[0].plannedmarginamt = plannedmarginamt;
    objectServiceProjectData[0].iscommitment = iscommitment;
    objectServiceProjectData[0].iscommitceiling = iscommitceiling;
    objectServiceProjectData[0].committedamt = committedamt;
    objectServiceProjectData[0].committedqty = committedqty;
    objectServiceProjectData[0].servrevenue = servrevenue;
    objectServiceProjectData[0].expexpenses = expexpenses;
    objectServiceProjectData[0].servcost = servcost;
    objectServiceProjectData[0].expreinvoicing = expreinvoicing;
    objectServiceProjectData[0].servmargin = servmargin;
    objectServiceProjectData[0].expmargin = expmargin;
    objectServiceProjectData[0].cBpartnerId = cBpartnerId;
    objectServiceProjectData[0].cBpartnerIdr = cBpartnerIdr;
    objectServiceProjectData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectServiceProjectData[0].cBpartnerLocationIdr = "";
    objectServiceProjectData[0].adUserId = adUserId;
    objectServiceProjectData[0].adUserIdr = "";
    objectServiceProjectData[0].poreference = poreference;
    objectServiceProjectData[0].finPaymentmethodId = finPaymentmethodId;
    objectServiceProjectData[0].finPaymentmethodIdr = "";
    objectServiceProjectData[0].cPaymenttermId = cPaymenttermId;
    objectServiceProjectData[0].cPaymenttermIdr = "";
    objectServiceProjectData[0].createtemppricelist = createtemppricelist;
    objectServiceProjectData[0].mPricelistId = mPricelistId;
    objectServiceProjectData[0].mPricelistIdr = "";
    objectServiceProjectData[0].cCurrencyId = cCurrencyId;
    objectServiceProjectData[0].cCurrencyIdr = "";
    objectServiceProjectData[0].mWarehouseId = mWarehouseId;
    objectServiceProjectData[0].mWarehouseIdr = "";
    objectServiceProjectData[0].changeprojectstatus = changeprojectstatus;
    objectServiceProjectData[0].copyfrom = copyfrom;
    objectServiceProjectData[0].generateorder = generateorder;
    objectServiceProjectData[0].projectstatus = projectstatus;
    objectServiceProjectData[0].cProjectId = cProjectId;
    objectServiceProjectData[0].generateto = generateto;
    objectServiceProjectData[0].processed = processed;
    objectServiceProjectData[0].billtoId = billtoId;
    objectServiceProjectData[0].adClientId = adClientId;
    objectServiceProjectData[0].note = note;
    objectServiceProjectData[0].projectkind = projectkind;
    objectServiceProjectData[0].projectbalanceamt = projectbalanceamt;
    objectServiceProjectData[0].invoicedamt = invoicedamt;
    objectServiceProjectData[0].documentCopies = documentCopies;
    objectServiceProjectData[0].accountno = accountno;
    objectServiceProjectData[0].cPhaseId = cPhaseId;
    objectServiceProjectData[0].cProjecttypeId = cProjecttypeId;
    objectServiceProjectData[0].invoicedqty = invoicedqty;
    objectServiceProjectData[0].mPricelistVersionId = mPricelistVersionId;
    objectServiceProjectData[0].projectcategory = projectcategory;
    objectServiceProjectData[0].processing = processing;
    objectServiceProjectData[0].paymentrule = paymentrule;
    objectServiceProjectData[0].plannedpoamt = plannedpoamt;
    objectServiceProjectData[0].isactive = isactive;
    objectServiceProjectData[0].setprojecttype = setprojecttype;
    objectServiceProjectData[0].cProjectphaseId = cProjectphaseId;
    objectServiceProjectData[0].publicprivate = publicprivate;
    objectServiceProjectData[0].cCampaignId = cCampaignId;
    objectServiceProjectData[0].lastplannedproposaldate = lastplannedproposaldate;
    objectServiceProjectData[0].language = "";
    return objectServiceProjectData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef1354_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef1357_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef3902_2(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDef800142_3(ConnectionProvider connectionProvider, String paramLanguage, String C_Location_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Address1), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Address2), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Postal), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.City), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))), '') ) as C_Location_ID FROM C_Location left join (select C_Location_ID, Address1, Address2, Postal, City, C_Region_ID, C_Country_ID from C_Location) table2 on (C_Location.C_Location_ID = table2.C_Location_ID)left join (select C_Region_ID, Name from C_Region) table3 on (table2.C_Region_ID = table3.C_Region_ID)left join (select C_Country_ID, Name from C_Country) table4 on (table2.C_Country_ID = table4.C_Country_ID)left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL4 on (table4.C_Country_ID = tableTRL4.C_Country_ID and tableTRL4.AD_Language = ?)  WHERE C_Location.isActive='Y' AND C_Location.C_Location_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Location_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_LOCATION_ID");
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

  public static int updateChangeProjectStatus(ConnectionProvider connectionProvider, String changeprojectstatus, String cProjectId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_Project" +
      "        SET changeprojectstatus = ? " +
      "        WHERE C_Project.C_Project_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, changeprojectstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);

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
  public static String selectActDefC_Project_ID(ConnectionProvider connectionProvider, String C_Project_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT Value FROM C_Project WHERE isActive='Y' AND C_Project_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Project_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "VALUE");
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
      "        UPDATE C_Project" +
      "        SET AD_Org_ID = (?) , Value = (?) , Name = (?) , IsSummary = (?) , Projectphase = (?) , Startdate = TO_DATE(?) , DateContract = TO_DATE(?) , DateFinish = TO_DATE(?) , Invoice_ToProject = (?) , SalesRep_ID = (?) , Responsible_ID = (?) , C_Location_ID = (?) , Description = (?) , PlannedAmt = TO_NUMBER(?) , PlannedQty = TO_NUMBER(?) , PlannedMarginAmt = TO_NUMBER(?) , IsCommitment = (?) , IsCommitCeiling = (?) , CommittedAmt = TO_NUMBER(?) , CommittedQty = TO_NUMBER(?) , Servrevenue = TO_NUMBER(?) , Expexpenses = TO_NUMBER(?) , Servcost = TO_NUMBER(?) , Expreinvoicing = TO_NUMBER(?) , Servmargin = TO_NUMBER(?) , Expmargin = TO_NUMBER(?) , C_BPartner_ID = (?) , C_BPartner_Location_ID = (?) , AD_User_ID = (?) , POReference = (?) , FIN_Paymentmethod_ID = (?) , C_PaymentTerm_ID = (?) , Createtemppricelist = (?) , M_PriceList_ID = (?) , C_Currency_ID = (?) , M_Warehouse_ID = (?) , ChangeProjectStatus = (?) , CopyFrom = (?) , GenerateOrder = (?) , Projectstatus = (?) , C_Project_ID = (?) , GenerateTo = (?) , Processed = (?) , BillTo_ID = (?) , AD_Client_ID = (?) , Note = (?) , Projectkind = (?) , ProjectBalanceAmt = TO_NUMBER(?) , InvoicedAmt = TO_NUMBER(?) , Document_Copies = TO_NUMBER(?) , AccountNo = (?) , C_Phase_ID = (?) , C_ProjectType_ID = (?) , InvoicedQty = TO_NUMBER(?) , M_PriceList_Version_ID = (?) , ProjectCategory = (?) , Processing = (?) , PaymentRule = (?) , PlannedPOAmt = TO_NUMBER(?) , IsActive = (?) , Setprojecttype = (?) , C_ProjectPhase_ID = (?) , Publicprivate = (?) , C_Campaign_ID = (?) , LastPlannedProposalDate = TO_DATE(?) , updated = now(), updatedby = ? " +
      "        WHERE C_Project.C_Project_ID = ? " +
      "        AND C_Project.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Project.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectphase);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, startdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datecontract);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefinish);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceToproject);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, responsibleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedmarginamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscommitment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscommitceiling);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, committedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, committedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, servrevenue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, expexpenses);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, servcost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, expreinvoicing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, servmargin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, expmargin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createtemppricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, changeprojectstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, note);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectkind);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectbalanceamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentCopies);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPhaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistVersionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectcategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedpoamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, setprojecttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectphaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, publicprivate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastplannedproposaldate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
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
      "        INSERT INTO C_Project " +
      "        (AD_Org_ID, Value, Name, IsSummary, Projectphase, Startdate, DateContract, DateFinish, Invoice_ToProject, SalesRep_ID, Responsible_ID, C_Location_ID, Description, PlannedAmt, PlannedQty, PlannedMarginAmt, IsCommitment, IsCommitCeiling, CommittedAmt, CommittedQty, Servrevenue, Expexpenses, Servcost, Expreinvoicing, Servmargin, Expmargin, C_BPartner_ID, C_BPartner_Location_ID, AD_User_ID, POReference, FIN_Paymentmethod_ID, C_PaymentTerm_ID, Createtemppricelist, M_PriceList_ID, C_Currency_ID, M_Warehouse_ID, ChangeProjectStatus, CopyFrom, GenerateOrder, Projectstatus, C_Project_ID, GenerateTo, Processed, BillTo_ID, AD_Client_ID, Note, Projectkind, ProjectBalanceAmt, InvoicedAmt, Document_Copies, AccountNo, C_Phase_ID, C_ProjectType_ID, InvoicedQty, M_PriceList_Version_ID, ProjectCategory, Processing, PaymentRule, PlannedPOAmt, IsActive, Setprojecttype, C_ProjectPhase_ID, Publicprivate, C_Campaign_ID, LastPlannedProposalDate, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), TO_DATE(?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectphase);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, startdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datecontract);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefinish);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceToproject);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, responsibleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedmarginamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscommitment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscommitceiling);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, committedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, committedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, servrevenue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, expexpenses);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, servcost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, expreinvoicing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, servmargin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, expmargin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createtemppricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, changeprojectstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, note);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectkind);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectbalanceamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentCopies);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPhaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistVersionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectcategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedpoamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, setprojecttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectphaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, publicprivate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastplannedproposaldate);
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
      "        DELETE FROM C_Project" +
      "        WHERE C_Project.C_Project_ID = ? " +
      "        AND C_Project.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Project.AD_Org_ID IN (";
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
      "          FROM C_Project" +
      "         WHERE C_Project.C_Project_ID = ? ";

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
      "          FROM C_Project" +
      "         WHERE C_Project.C_Project_ID = ? ";

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
