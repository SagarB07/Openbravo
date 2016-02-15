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
class Header444F03CB8B0A41CA81407AF225258414Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Header444F03CB8B0A41CA81407AF225258414Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String documentno;
  public String description;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String adUserId;
  public String adUserIdr;
  public String mPricelistId;
  public String mPricelistIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String createpo;
  public String docstatus;
  public String docaction;
  public String docactionBtn;
  public String emGppPersetujuan;
  public String emGppBtnpersetujuan;
  public String emGbgBudgetId;
  public String emGmmMetodepembelianId;
  public String emGmmMetodepembelianIdr;
  public String emGprNomorpenawaran;
  public String emGprTanggalpenawaran;
  public String processing;
  public String processed;
  public String adClientId;
  public String mRequisitionId;
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
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_IDR") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("AD_USER_IDR") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_IDR") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("CREATEPO"))
      return createpo;
    else if (fieldName.equalsIgnoreCase("DOCSTATUS"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("DOCACTION"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("DOCACTION_BTN") || fieldName.equals("docactionBtn"))
      return docactionBtn;
    else if (fieldName.equalsIgnoreCase("EM_GPP_PERSETUJUAN") || fieldName.equals("emGppPersetujuan"))
      return emGppPersetujuan;
    else if (fieldName.equalsIgnoreCase("EM_GPP_BTNPERSETUJUAN") || fieldName.equals("emGppBtnpersetujuan"))
      return emGppBtnpersetujuan;
    else if (fieldName.equalsIgnoreCase("EM_GBG_BUDGET_ID") || fieldName.equals("emGbgBudgetId"))
      return emGbgBudgetId;
    else if (fieldName.equalsIgnoreCase("EM_GMM_METODEPEMBELIAN_ID") || fieldName.equals("emGmmMetodepembelianId"))
      return emGmmMetodepembelianId;
    else if (fieldName.equalsIgnoreCase("EM_GMM_METODEPEMBELIAN_IDR") || fieldName.equals("emGmmMetodepembelianIdr"))
      return emGmmMetodepembelianIdr;
    else if (fieldName.equalsIgnoreCase("EM_GPR_NOMORPENAWARAN") || fieldName.equals("emGprNomorpenawaran"))
      return emGprNomorpenawaran;
    else if (fieldName.equalsIgnoreCase("EM_GPR_TANGGALPENAWARAN") || fieldName.equals("emGprTanggalpenawaran"))
      return emGprTanggalpenawaran;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("M_REQUISITION_ID") || fieldName.equals("mRequisitionId"))
      return mRequisitionId;
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
  public static Header444F03CB8B0A41CA81407AF225258414Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Header444F03CB8B0A41CA81407AF225258414Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Requisition.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Requisition.CreatedBy) as CreatedByR, " +
      "        to_char(M_Requisition.Updated, ?) as updated, " +
      "        to_char(M_Requisition.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Requisition.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Requisition.UpdatedBy) as UpdatedByR," +
      "        M_Requisition.AD_Org_ID, " +
      "(CASE WHEN M_Requisition.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_Requisition.DocumentNo, " +
      "M_Requisition.Description, " +
      "M_Requisition.C_BPartner_ID, " +
      "(CASE WHEN M_Requisition.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "M_Requisition.AD_User_ID, " +
      "(CASE WHEN M_Requisition.AD_User_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "M_Requisition.M_PriceList_ID, " +
      "(CASE WHEN M_Requisition.M_PriceList_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "M_Requisition.C_Currency_ID, " +
      "(CASE WHEN M_Requisition.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "M_Requisition.Createpo, " +
      "M_Requisition.DocStatus, " +
      "M_Requisition.DocAction, " +
      "list1.name as DocAction_BTN, " +
      "COALESCE(M_Requisition.EM_Gpp_Persetujuan, 'N') AS EM_Gpp_Persetujuan, " +
      "M_Requisition.EM_Gpp_Btnpersetujuan, " +
      "M_Requisition.EM_Gbg_Budget_ID, " +
      "M_Requisition.EM_Gmm_Metodepembelian_ID, " +
      "(CASE WHEN M_Requisition.EM_Gmm_Metodepembelian_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS EM_Gmm_Metodepembelian_IDR, " +
      "M_Requisition.EM_Gpr_Nomorpenawaran, " +
      "M_Requisition.EM_Gpr_Tanggalpenawaran, " +
      "COALESCE(M_Requisition.Processing, 'N') AS Processing, " +
      "COALESCE(M_Requisition.Processed, 'N') AS Processed, " +
      "M_Requisition.AD_Client_ID, " +
      "M_Requisition.M_Requisition_ID, " +
      "COALESCE(M_Requisition.IsActive, 'N') AS IsActive, " +
      "        ? AS LANGUAGE " +
      "        FROM M_Requisition left join (select AD_Org_ID, Value from AD_Org) table1 on (M_Requisition.AD_Org_ID = table1.AD_Org_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (M_Requisition.C_BPartner_ID = table2.C_BPartner_ID) left join (select AD_User_ID, Name from AD_User) table3 on (M_Requisition.AD_User_ID = table3.AD_User_ID) left join (select M_PriceList_ID, Name from M_PriceList) table4 on (M_Requisition.M_PriceList_ID = table4.M_PriceList_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table5 on (M_Requisition.C_Currency_ID = table5.C_Currency_ID) left join ad_ref_list_v list1 on (list1.ad_reference_id = '135' and list1.ad_language = ?  AND (CASE M_Requisition.DocAction WHEN '--' THEN 'CL' ELSE TO_CHAR(M_Requisition.DocAction) END) = list1.value) left join (select GMM_Metodepembelian_ID, Name from GMM_METODEPEMBELIAN) table6 on (M_Requisition.EM_Gmm_Metodepembelian_ID =  table6.GMM_Metodepembelian_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND M_Requisition.M_Requisition_ID = ? " +
      "        AND M_Requisition.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_Requisition.AD_Org_ID IN (";
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
        Header444F03CB8B0A41CA81407AF225258414Data objectHeader444F03CB8B0A41CA81407AF225258414Data = new Header444F03CB8B0A41CA81407AF225258414Data();
        objectHeader444F03CB8B0A41CA81407AF225258414Data.created = UtilSql.getValue(result, "CREATED");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.updated = UtilSql.getValue(result, "UPDATED");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.description = UtilSql.getValue(result, "DESCRIPTION");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.cBpartnerIdr = UtilSql.getValue(result, "C_BPARTNER_IDR");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.adUserIdr = UtilSql.getValue(result, "AD_USER_IDR");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.mPricelistIdr = UtilSql.getValue(result, "M_PRICELIST_IDR");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.createpo = UtilSql.getValue(result, "CREATEPO");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.docaction = UtilSql.getValue(result, "DOCACTION");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.docactionBtn = UtilSql.getValue(result, "DOCACTION_BTN");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.emGppPersetujuan = UtilSql.getValue(result, "EM_GPP_PERSETUJUAN");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.emGppBtnpersetujuan = UtilSql.getValue(result, "EM_GPP_BTNPERSETUJUAN");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.emGbgBudgetId = UtilSql.getValue(result, "EM_GBG_BUDGET_ID");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.emGmmMetodepembelianId = UtilSql.getValue(result, "EM_GMM_METODEPEMBELIAN_ID");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.emGmmMetodepembelianIdr = UtilSql.getValue(result, "EM_GMM_METODEPEMBELIAN_IDR");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.emGprNomorpenawaran = UtilSql.getValue(result, "EM_GPR_NOMORPENAWARAN");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.emGprTanggalpenawaran = UtilSql.getDateValue(result, "EM_GPR_TANGGALPENAWARAN", "dd-MM-yyyy");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.processing = UtilSql.getValue(result, "PROCESSING");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.processed = UtilSql.getValue(result, "PROCESSED");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.mRequisitionId = UtilSql.getValue(result, "M_REQUISITION_ID");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.language = UtilSql.getValue(result, "LANGUAGE");
        objectHeader444F03CB8B0A41CA81407AF225258414Data.adUserClient = "";
        objectHeader444F03CB8B0A41CA81407AF225258414Data.adOrgClient = "";
        objectHeader444F03CB8B0A41CA81407AF225258414Data.createdby = "";
        objectHeader444F03CB8B0A41CA81407AF225258414Data.trBgcolor = "";
        objectHeader444F03CB8B0A41CA81407AF225258414Data.totalCount = "";
        objectHeader444F03CB8B0A41CA81407AF225258414Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectHeader444F03CB8B0A41CA81407AF225258414Data);
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
    Header444F03CB8B0A41CA81407AF225258414Data objectHeader444F03CB8B0A41CA81407AF225258414Data[] = new Header444F03CB8B0A41CA81407AF225258414Data[vector.size()];
    vector.copyInto(objectHeader444F03CB8B0A41CA81407AF225258414Data);
    return(objectHeader444F03CB8B0A41CA81407AF225258414Data);
  }

/**
Create a registry
 */
  public static Header444F03CB8B0A41CA81407AF225258414Data[] set(String emGppPersetujuan, String createpo, String docstatus, String docaction, String docactionBtn, String processed, String adUserId, String processing, String emGprNomorpenawaran, String emGprTanggalpenawaran, String mRequisitionId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String description, String documentno, String cBpartnerId, String cBpartnerIdr, String mPricelistId, String cCurrencyId, String emGmmMetodepembelianId, String emGppBtnpersetujuan, String emGbgBudgetId)    throws ServletException {
    Header444F03CB8B0A41CA81407AF225258414Data objectHeader444F03CB8B0A41CA81407AF225258414Data[] = new Header444F03CB8B0A41CA81407AF225258414Data[1];
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0] = new Header444F03CB8B0A41CA81407AF225258414Data();
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].created = "";
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].createdbyr = createdbyr;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].updated = "";
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].updatedTimeStamp = "";
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].updatedby = updatedby;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].updatedbyr = updatedbyr;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].adOrgId = adOrgId;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].adOrgIdr = "";
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].documentno = documentno;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].description = description;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].cBpartnerId = cBpartnerId;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].cBpartnerIdr = cBpartnerIdr;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].adUserId = adUserId;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].adUserIdr = "";
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].mPricelistId = mPricelistId;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].mPricelistIdr = "";
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].cCurrencyId = cCurrencyId;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].cCurrencyIdr = "";
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].createpo = createpo;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].docstatus = docstatus;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].docaction = docaction;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].docactionBtn = docactionBtn;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].emGppPersetujuan = emGppPersetujuan;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].emGppBtnpersetujuan = emGppBtnpersetujuan;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].emGbgBudgetId = emGbgBudgetId;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].emGmmMetodepembelianId = emGmmMetodepembelianId;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].emGmmMetodepembelianIdr = "";
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].emGprNomorpenawaran = emGprNomorpenawaran;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].emGprTanggalpenawaran = emGprTanggalpenawaran;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].processing = processing;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].processed = processed;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].adClientId = adClientId;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].mRequisitionId = mRequisitionId;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].isactive = isactive;
    objectHeader444F03CB8B0A41CA81407AF225258414Data[0].language = "";
    return objectHeader444F03CB8B0A41CA81407AF225258414Data;
  }

/**
Select for auxiliar field
 */
  public static String selectActP1004400000_C_BPartner_ID(ConnectionProvider connectionProvider, String M_Requisition_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_Requisition.C_Bpartner_Id FROM M_Requisition, (SELECT count(*) as SameBP FROM M_Requisition inner join M_requisitionLine ON M_Requisition.M_Requisition_id = M_requisitionLine.M_Requisition_id WHERE M_Requisition.c_bpartner_id = M_requisitionLine.c_bpartner_id AND M_Requisition.M_Requisition_id = ?) SameBP,  (SELECT count(*) as QtyLines FROM M_RequisitionLine WHERE M_RequisitionLine.M_Requisition_id=?) QtyLines  WHERE SameBP.SameBP = QtyLines.QtyLines AND M_Requisition.M_Requisition_id =? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Requisition_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Requisition_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Requisition_ID);

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
  public static String selectActP1004400000_M_PriceList_ID(ConnectionProvider connectionProvider, String M_Requisition_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_Requisition.m_pricelist_id  FROM M_Requisition,       (SELECT count(*) as SamePL        FROM M_Requisition inner join M_requisitionLine ON M_Requisition.M_Requisition_id = M_requisitionLine.M_Requisition_id       WHERE M_Requisition.m_pricelist_id = M_requisitionLine.m_pricelist_id AND M_Requisition.M_Requisition_id = ?) SamePL,        (SELECT count(*) as QtyLines       FROM M_RequisitionLine       WHERE M_RequisitionLine.M_Requisition_id=?) QtyLines   WHERE SamePL.SamePL = QtyLines.QtyLines AND M_Requisition.M_Requisition_id =? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Requisition_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Requisition_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Requisition_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_PRICELIST_ID");
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
  public static String selectDef803534_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef803536_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef803539_2(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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

  public static int updateDocAction(ConnectionProvider connectionProvider, String docaction, String mRequisitionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_Requisition" +
      "        SET docaction = ? " +
      "        WHERE M_Requisition.M_Requisition_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);

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
  public static String selectActDefC_BPartner_ID(ConnectionProvider connectionProvider, String C_BPartner_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT Name FROM C_BPartner WHERE isActive='Y' AND C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_ID);

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
      "        UPDATE M_Requisition" +
      "        SET AD_Org_ID = (?) , DocumentNo = (?) , Description = (?) , C_BPartner_ID = (?) , AD_User_ID = (?) , M_PriceList_ID = (?) , C_Currency_ID = (?) , Createpo = (?) , DocStatus = (?) , DocAction = (?) , EM_Gpp_Persetujuan = (?) , EM_Gpp_Btnpersetujuan = (?) , EM_Gbg_Budget_ID = (?) , EM_Gmm_Metodepembelian_ID = (?) , EM_Gpr_Nomorpenawaran = (?) , EM_Gpr_Tanggalpenawaran = TO_DATE(?) , Processing = (?) , Processed = (?) , AD_Client_ID = (?) , M_Requisition_ID = (?) , IsActive = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_Requisition.M_Requisition_ID = ? " +
      "        AND M_Requisition.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Requisition.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createpo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGppPersetujuan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGppBtnpersetujuan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgBudgetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMetodepembelianId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGprNomorpenawaran);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGprTanggalpenawaran);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
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
      "        INSERT INTO M_Requisition " +
      "        (AD_Org_ID, DocumentNo, Description, C_BPartner_ID, AD_User_ID, M_PriceList_ID, C_Currency_ID, Createpo, DocStatus, DocAction, EM_Gpp_Persetujuan, EM_Gpp_Btnpersetujuan, EM_Gbg_Budget_ID, EM_Gmm_Metodepembelian_ID, EM_Gpr_Nomorpenawaran, EM_Gpr_Tanggalpenawaran, Processing, Processed, AD_Client_ID, M_Requisition_ID, IsActive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createpo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGppPersetujuan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGppBtnpersetujuan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgBudgetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMetodepembelianId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGprNomorpenawaran);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGprTanggalpenawaran);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM M_Requisition" +
      "        WHERE M_Requisition.M_Requisition_ID = ? " +
      "        AND M_Requisition.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Requisition.AD_Org_ID IN (";
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
      "          FROM M_Requisition" +
      "         WHERE M_Requisition.M_Requisition_ID = ? ";

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
      "          FROM M_Requisition" +
      "         WHERE M_Requisition.M_Requisition_ID = ? ";

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
