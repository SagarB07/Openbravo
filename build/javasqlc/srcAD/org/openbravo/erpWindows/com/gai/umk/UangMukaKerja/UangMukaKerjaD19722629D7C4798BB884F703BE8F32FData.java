//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.com.gai.umk.UangMukaKerja;

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
class UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData implements FieldProvider {
static Logger log4j = Logger.getLogger(UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String isactive;
  public String documentno;
  public String nominalPenjaguannUmk;
  public String tanggalPenerimaanUmk;
  public String emGnvMasterDatadireksiId;
  public String emGmmMasterDepartmentId;
  public String adUserId;
  public String description;
  public String totAmountRealisasi;
  public String selisih;
  public String complete;
  public String realisasi;
  public String status;
  public String statusr;
  public String cCurrencyId;
  public String finPaymentmethodId;
  public String finFinancialAccountId;
  public String finFinancialAccountIdr;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String gumkJenisumkId;
  public String tanggalmemointernal;
  public String nomemointernal;
  public String memointernaldari;
  public String perihal;
  public String emGbgBudgetId;
  public String posted;
  public String postedBtn;
  public String btnReactive;
  public String adClientId;
  public String gumkUmkId;
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
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("NOMINAL_PENJAGUANN_UMK") || fieldName.equals("nominalPenjaguannUmk"))
      return nominalPenjaguannUmk;
    else if (fieldName.equalsIgnoreCase("TANGGAL_PENERIMAAN_UMK") || fieldName.equals("tanggalPenerimaanUmk"))
      return tanggalPenerimaanUmk;
    else if (fieldName.equalsIgnoreCase("EM_GNV_MASTER_DATADIREKSI_ID") || fieldName.equals("emGnvMasterDatadireksiId"))
      return emGnvMasterDatadireksiId;
    else if (fieldName.equalsIgnoreCase("EM_GMM_MASTER_DEPARTMENT_ID") || fieldName.equals("emGmmMasterDepartmentId"))
      return emGmmMasterDepartmentId;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("TOT_AMOUNT_REALISASI") || fieldName.equals("totAmountRealisasi"))
      return totAmountRealisasi;
    else if (fieldName.equalsIgnoreCase("SELISIH"))
      return selisih;
    else if (fieldName.equalsIgnoreCase("COMPLETE"))
      return complete;
    else if (fieldName.equalsIgnoreCase("REALISASI"))
      return realisasi;
    else if (fieldName.equalsIgnoreCase("STATUS"))
      return status;
    else if (fieldName.equalsIgnoreCase("STATUSR"))
      return statusr;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_ID") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("FIN_FINANCIAL_ACCOUNT_ID") || fieldName.equals("finFinancialAccountId"))
      return finFinancialAccountId;
    else if (fieldName.equalsIgnoreCase("FIN_FINANCIAL_ACCOUNT_IDR") || fieldName.equals("finFinancialAccountIdr"))
      return finFinancialAccountIdr;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_IDR") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("GUMK_JENISUMK_ID") || fieldName.equals("gumkJenisumkId"))
      return gumkJenisumkId;
    else if (fieldName.equalsIgnoreCase("TANGGALMEMOINTERNAL"))
      return tanggalmemointernal;
    else if (fieldName.equalsIgnoreCase("NOMEMOINTERNAL"))
      return nomemointernal;
    else if (fieldName.equalsIgnoreCase("MEMOINTERNALDARI"))
      return memointernaldari;
    else if (fieldName.equalsIgnoreCase("PERIHAL"))
      return perihal;
    else if (fieldName.equalsIgnoreCase("EM_GBG_BUDGET_ID") || fieldName.equals("emGbgBudgetId"))
      return emGbgBudgetId;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("POSTED_BTN") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("BTN_REACTIVE") || fieldName.equals("btnReactive"))
      return btnReactive;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("GUMK_UMK_ID") || fieldName.equals("gumkUmkId"))
      return gumkUmkId;
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
  public static UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(gumk_umk.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = gumk_umk.CreatedBy) as CreatedByR, " +
      "        to_char(gumk_umk.Updated, ?) as updated, " +
      "        to_char(gumk_umk.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        gumk_umk.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = gumk_umk.UpdatedBy) as UpdatedByR," +
      "        gumk_umk.AD_Org_ID, " +
      "(CASE WHEN gumk_umk.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "COALESCE(gumk_umk.Isactive, 'N') AS Isactive, " +
      "gumk_umk.Documentno, " +
      "gumk_umk.Nominal_Penjaguann_Umk, " +
      "gumk_umk.Tanggal_Penerimaan_Umk, " +
      "gumk_umk.EM_Gnv_Master_Datadireksi_ID, " +
      "gumk_umk.EM_Gmm_Master_Department_ID, " +
      "gumk_umk.AD_User_ID, " +
      "gumk_umk.Description, " +
      "gumk_umk.TOT_Amount_Realisasi, " +
      "gumk_umk.Selisih, " +
      "gumk_umk.Complete, " +
      "gumk_umk.Realisasi, " +
      "gumk_umk.Status, " +
      "(CASE WHEN gumk_umk.Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS StatusR, " +
      "gumk_umk.C_Currency_ID, " +
      "gumk_umk.FIN_Paymentmethod_ID, " +
      "gumk_umk.FIN_Financial_Account_ID, " +
      "(CASE WHEN gumk_umk.FIN_Financial_Account_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.ISO_Code), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.EM_Gac_Noperkiraan), ''))),'') ) END) AS FIN_Financial_Account_IDR, " +
      "gumk_umk.C_Doctype_ID, " +
      "(CASE WHEN gumk_umk.C_Doctype_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS C_Doctype_IDR, " +
      "gumk_umk.Gumk_Jenisumk_ID, " +
      "gumk_umk.Tanggalmemointernal, " +
      "gumk_umk.Nomemointernal, " +
      "gumk_umk.Memointernaldari, " +
      "gumk_umk.Perihal, " +
      "gumk_umk.EM_Gbg_Budget_ID, " +
      "gumk_umk.Posted, " +
      "list2.name as Posted_BTN, " +
      "gumk_umk.BTN_Reactive, " +
      "gumk_umk.AD_Client_ID, " +
      "gumk_umk.Gumk_Umk_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM gumk_umk left join (select AD_Org_ID, Value from AD_Org) table1 on (gumk_umk.AD_Org_ID = table1.AD_Org_ID) left join ad_ref_list_v list1 on (gumk_umk.Status = list1.value and list1.ad_reference_id = '8D57A5E1511D48AEAABCCBC52953E89B' and list1.ad_language = ?)  left join (select FIN_Financial_Account_ID, Name, C_Currency_ID, EM_Gac_Noperkiraan from FIN_Financial_Account) table2 on (gumk_umk.FIN_Financial_Account_ID = table2.FIN_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table3 on (table2.C_Currency_ID = table3.C_Currency_ID) left join (select C_Doctype_ID, Name from C_Doctype) table4 on (gumk_umk.C_Doctype_ID = table4.C_Doctype_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL4 on (table4.C_DocType_ID = tableTRL4.C_DocType_ID and tableTRL4.AD_Language = ?)  left join ad_ref_list_v list2 on (list2.ad_reference_id = '234' and list2.ad_language = ?  AND gumk_umk.Posted = TO_CHAR(list2.value))" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND gumk_umk.Gumk_Umk_ID = ? " +
      "        AND gumk_umk.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND gumk_umk.AD_Org_ID IN (";
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
        UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData = new UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData();
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.created = UtilSql.getValue(result, "CREATED");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.updated = UtilSql.getValue(result, "UPDATED");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.nominalPenjaguannUmk = UtilSql.getValue(result, "NOMINAL_PENJAGUANN_UMK");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.tanggalPenerimaanUmk = UtilSql.getDateValue(result, "TANGGAL_PENERIMAAN_UMK", "dd-MM-yyyy");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.emGnvMasterDatadireksiId = UtilSql.getValue(result, "EM_GNV_MASTER_DATADIREKSI_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.emGmmMasterDepartmentId = UtilSql.getValue(result, "EM_GMM_MASTER_DEPARTMENT_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.totAmountRealisasi = UtilSql.getValue(result, "TOT_AMOUNT_REALISASI");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.selisih = UtilSql.getValue(result, "SELISIH");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.complete = UtilSql.getValue(result, "COMPLETE");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.realisasi = UtilSql.getValue(result, "REALISASI");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.status = UtilSql.getValue(result, "STATUS");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.statusr = UtilSql.getValue(result, "STATUSR");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.finPaymentmethodId = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.finFinancialAccountId = UtilSql.getValue(result, "FIN_FINANCIAL_ACCOUNT_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.finFinancialAccountIdr = UtilSql.getValue(result, "FIN_FINANCIAL_ACCOUNT_IDR");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.cDoctypeIdr = UtilSql.getValue(result, "C_DOCTYPE_IDR");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.gumkJenisumkId = UtilSql.getValue(result, "GUMK_JENISUMK_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.tanggalmemointernal = UtilSql.getDateValue(result, "TANGGALMEMOINTERNAL", "dd-MM-yyyy");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.nomemointernal = UtilSql.getValue(result, "NOMEMOINTERNAL");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.memointernaldari = UtilSql.getValue(result, "MEMOINTERNALDARI");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.perihal = UtilSql.getValue(result, "PERIHAL");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.emGbgBudgetId = UtilSql.getValue(result, "EM_GBG_BUDGET_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.posted = UtilSql.getValue(result, "POSTED");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.postedBtn = UtilSql.getValue(result, "POSTED_BTN");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.btnReactive = UtilSql.getValue(result, "BTN_REACTIVE");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.gumkUmkId = UtilSql.getValue(result, "GUMK_UMK_ID");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.language = UtilSql.getValue(result, "LANGUAGE");
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.adUserClient = "";
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.adOrgClient = "";
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.createdby = "";
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.trBgcolor = "";
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.totalCount = "";
        objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData);
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
    UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[] = new UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[vector.size()];
    vector.copyInto(objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData);
    return(objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData);
  }

/**
Create a registry
 */
  public static UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[] set(String adOrgId, String nomemointernal, String description, String status, String gumkUmkId, String isactive, String posted, String postedBtn, String memointernaldari, String cDoctypeId, String complete, String emGnvMasterDatadireksiId, String cCurrencyId, String perihal, String documentno, String emGbgBudgetId, String tanggalPenerimaanUmk, String selisih, String finPaymentmethodId, String emGmmMasterDepartmentId, String finFinancialAccountId, String tanggalmemointernal, String adClientId, String nominalPenjaguannUmk, String totAmountRealisasi, String btnReactive, String realisasi, String gumkJenisumkId, String updatedby, String updatedbyr, String createdby, String createdbyr, String adUserId)    throws ServletException {
    UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[] = new UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[1];
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0] = new UangMukaKerjaD19722629D7C4798BB884F703BE8F32FData();
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].created = "";
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].createdbyr = createdbyr;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].updated = "";
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].updatedTimeStamp = "";
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].updatedby = updatedby;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].updatedbyr = updatedbyr;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].adOrgId = adOrgId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].adOrgIdr = "";
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].isactive = isactive;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].documentno = documentno;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].nominalPenjaguannUmk = nominalPenjaguannUmk;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].tanggalPenerimaanUmk = tanggalPenerimaanUmk;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].emGnvMasterDatadireksiId = emGnvMasterDatadireksiId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].emGmmMasterDepartmentId = emGmmMasterDepartmentId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].adUserId = adUserId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].description = description;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].totAmountRealisasi = totAmountRealisasi;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].selisih = selisih;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].complete = complete;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].realisasi = realisasi;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].status = status;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].statusr = "";
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].cCurrencyId = cCurrencyId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].finPaymentmethodId = finPaymentmethodId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].finFinancialAccountId = finFinancialAccountId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].finFinancialAccountIdr = "";
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].cDoctypeId = cDoctypeId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].cDoctypeIdr = "";
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].gumkJenisumkId = gumkJenisumkId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].tanggalmemointernal = tanggalmemointernal;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].nomemointernal = nomemointernal;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].memointernaldari = memointernaldari;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].perihal = perihal;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].emGbgBudgetId = emGbgBudgetId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].posted = posted;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].postedBtn = postedBtn;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].btnReactive = btnReactive;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].adClientId = adClientId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].gumkUmkId = gumkUmkId;
    objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData[0].language = "";
    return objectUangMukaKerjaD19722629D7C4798BB884F703BE8F32FData;
  }

/**
Select for auxiliar field
 */
  public static String selectAuxA75FAAF5624C4CEBB7517BD70911DD1D(ConnectionProvider connectionProvider, String GUMK_UMK_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (CASE WHEN GU.STATUS = 'complete' AND COUNT(GR.GUMK_REALISASI_ID) > 0 THEN 'Y' ELSE 'N' END) AS ISYES FROM (GUMK_UMK GU LEFT JOIN GUMK_REALISASI GR ON GU.GUMK_UMK_ID=GR.GUMK_UMK_ID) WHERE GU.GUMK_UMK_ID = ? GROUP BY GU.STATUS ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, GUMK_UMK_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISYES");
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
  public static String selectDef3D36CB8249144F90AA95B3D60A3EE9A6(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        Select C_DocType_ID From C_DocType Where Name = 'Uang Muka Payment' ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
  public static String selectDef90F612F15466443C99DAE9DD6FDA605B(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT FIN_Paymentmethod_ID FROM FIN_Paymentmethod WHERE name ='Cash' ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_ID");
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
  public static String selectDefAC6D49613B4946D597F5FB2FCF7D57CF(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT FIN_Financial_Account_ID FROM FIN_Financial_Account WHERE name ='KAS KANTOR PUSAT' ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "FIN_FINANCIAL_ACCOUNT_ID");
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
  public static String selectDefE7EEE8F405834A73B16FBED7F27C51BA(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select GUMK_JENISUMK_ID from  GUMK_JENISUMK where value= 'Non Belanja Modal' ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "GUMK_JENISUMK_ID");
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
  public static String selectDefF1F608507BB8459A9106FA012C1F1678_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDefFA50AA599C794479A7EB9A37B098437E_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE gumk_umk" +
      "        SET AD_Org_ID = (?) , Isactive = (?) , Documentno = (?) , Nominal_Penjaguann_Umk = TO_NUMBER(?) , Tanggal_Penerimaan_Umk = TO_DATE(?) , EM_Gnv_Master_Datadireksi_ID = (?) , EM_Gmm_Master_Department_ID = (?) , AD_User_ID = (?) , Description = (?) , TOT_Amount_Realisasi = TO_NUMBER(?) , Selisih = TO_NUMBER(?) , Complete = (?) , Realisasi = (?) , Status = (?) , C_Currency_ID = (?) , FIN_Paymentmethod_ID = (?) , FIN_Financial_Account_ID = (?) , C_Doctype_ID = (?) , Gumk_Jenisumk_ID = (?) , Tanggalmemointernal = TO_DATE(?) , Nomemointernal = (?) , Memointernaldari = (?) , Perihal = (?) , EM_Gbg_Budget_ID = (?) , Posted = (?) , BTN_Reactive = (?) , AD_Client_ID = (?) , Gumk_Umk_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE gumk_umk.Gumk_Umk_ID = ? " +
      "        AND gumk_umk.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND gumk_umk.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nominalPenjaguannUmk);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tanggalPenerimaanUmk);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGnvMasterDatadireksiId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMasterDepartmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totAmountRealisasi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, selisih);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, complete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realisasi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gumkJenisumkId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tanggalmemointernal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nomemointernal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, memointernaldari);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, perihal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgBudgetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btnReactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gumkUmkId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gumkUmkId);
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
      "        INSERT INTO gumk_umk " +
      "        (AD_Org_ID, Isactive, Documentno, Nominal_Penjaguann_Umk, Tanggal_Penerimaan_Umk, EM_Gnv_Master_Datadireksi_ID, EM_Gmm_Master_Department_ID, AD_User_ID, Description, TOT_Amount_Realisasi, Selisih, Complete, Realisasi, Status, C_Currency_ID, FIN_Paymentmethod_ID, FIN_Financial_Account_ID, C_Doctype_ID, Gumk_Jenisumk_ID, Tanggalmemointernal, Nomemointernal, Memointernaldari, Perihal, EM_Gbg_Budget_ID, Posted, BTN_Reactive, AD_Client_ID, Gumk_Umk_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_NUMBER(?), TO_DATE(?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nominalPenjaguannUmk);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tanggalPenerimaanUmk);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGnvMasterDatadireksiId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMasterDepartmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totAmountRealisasi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, selisih);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, complete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realisasi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gumkJenisumkId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tanggalmemointernal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nomemointernal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, memointernaldari);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, perihal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgBudgetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btnReactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gumkUmkId);
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
      "        DELETE FROM gumk_umk" +
      "        WHERE gumk_umk.Gumk_Umk_ID = ? " +
      "        AND gumk_umk.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND gumk_umk.AD_Org_ID IN (";
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
      "          FROM gumk_umk" +
      "         WHERE gumk_umk.Gumk_Umk_ID = ? ";

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
      "          FROM gumk_umk" +
      "         WHERE gumk_umk.Gumk_Umk_ID = ? ";

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
