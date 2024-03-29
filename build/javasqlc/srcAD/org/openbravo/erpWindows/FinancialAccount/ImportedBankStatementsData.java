//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.FinancialAccount;

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
class ImportedBankStatementsData implements FieldProvider {
static Logger log4j = Logger.getLogger(ImportedBankStatementsData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String documentno;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String name;
  public String isactive;
  public String importdate;
  public String statementdate;
  public String filename;
  public String finReconciliationId;
  public String notes;
  public String posted;
  public String postedBtn;
  public String emAprmProcessBsForce;
  public String emAprmProcessBsForceBtn;
  public String emAprmProcessBs;
  public String emAprmProcessBsBtn;
  public String adOrgId;
  public String processing;
  public String processed;
  public String finBankstatementId;
  public String adClientId;
  public String finFinancialAccountId;
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
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_IDR") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("IMPORTDATE"))
      return importdate;
    else if (fieldName.equalsIgnoreCase("STATEMENTDATE"))
      return statementdate;
    else if (fieldName.equalsIgnoreCase("FILENAME"))
      return filename;
    else if (fieldName.equalsIgnoreCase("FIN_RECONCILIATION_ID") || fieldName.equals("finReconciliationId"))
      return finReconciliationId;
    else if (fieldName.equalsIgnoreCase("NOTES"))
      return notes;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("POSTED_BTN") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("EM_APRM_PROCESS_BS_FORCE") || fieldName.equals("emAprmProcessBsForce"))
      return emAprmProcessBsForce;
    else if (fieldName.equalsIgnoreCase("EM_APRM_PROCESS_BS_FORCE_BTN") || fieldName.equals("emAprmProcessBsForceBtn"))
      return emAprmProcessBsForceBtn;
    else if (fieldName.equalsIgnoreCase("EM_APRM_PROCESS_BS") || fieldName.equals("emAprmProcessBs"))
      return emAprmProcessBs;
    else if (fieldName.equalsIgnoreCase("EM_APRM_PROCESS_BS_BTN") || fieldName.equals("emAprmProcessBsBtn"))
      return emAprmProcessBsBtn;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("FIN_BANKSTATEMENT_ID") || fieldName.equals("finBankstatementId"))
      return finBankstatementId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("FIN_FINANCIAL_ACCOUNT_ID") || fieldName.equals("finFinancialAccountId"))
      return finFinancialAccountId;
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
  public static ImportedBankStatementsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finFinancialAccountId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, finFinancialAccountId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ImportedBankStatementsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finFinancialAccountId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(FIN_BankStatement.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_BankStatement.CreatedBy) as CreatedByR, " +
      "        to_char(FIN_BankStatement.Updated, ?) as updated, " +
      "        to_char(FIN_BankStatement.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        FIN_BankStatement.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_BankStatement.UpdatedBy) as UpdatedByR," +
      "        FIN_BankStatement.DocumentNo, " +
      "FIN_BankStatement.C_Doctype_ID, " +
      "(CASE WHEN FIN_BankStatement.C_Doctype_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS C_Doctype_IDR, " +
      "FIN_BankStatement.Name, " +
      "COALESCE(FIN_BankStatement.Isactive, 'N') AS Isactive, " +
      "FIN_BankStatement.Importdate, " +
      "FIN_BankStatement.Statementdate, " +
      "FIN_BankStatement.Filename, " +
      "FIN_BankStatement.FIN_Reconciliation_ID, " +
      "FIN_BankStatement.Notes, " +
      "FIN_BankStatement.Posted, " +
      "list1.name as Posted_BTN, " +
      "FIN_BankStatement.EM_APRM_Process_BS_Force, " +
      "list2.name as EM_APRM_Process_BS_Force_BTN, " +
      "FIN_BankStatement.EM_APRM_Process_BS, " +
      "list3.name as EM_APRM_Process_BS_BTN, " +
      "FIN_BankStatement.AD_Org_ID, " +
      "COALESCE(FIN_BankStatement.Processing, 'N') AS Processing, " +
      "COALESCE(FIN_BankStatement.Processed, 'N') AS Processed, " +
      "FIN_BankStatement.FIN_Bankstatement_ID, " +
      "FIN_BankStatement.AD_Client_ID, " +
      "FIN_BankStatement.FIN_Financial_Account_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM FIN_BankStatement left join (select C_Doctype_ID, Name from C_Doctype) table1 on (FIN_BankStatement.C_Doctype_ID = table1.C_Doctype_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL1 on (table1.C_DocType_ID = tableTRL1.C_DocType_ID and tableTRL1.AD_Language = ?)  left join ad_ref_list_v list1 on (list1.ad_reference_id = '234' and list1.ad_language = ?  AND FIN_BankStatement.Posted = TO_CHAR(list1.value)) left join ad_ref_list_v list2 on (list2.ad_reference_id = 'EC75B6F5A9504DB6B3F3356EA85F15EE' and list2.ad_language = ?  AND FIN_BankStatement.EM_APRM_Process_BS_Force = TO_CHAR(list2.value)) left join ad_ref_list_v list3 on (list3.ad_reference_id = 'EC75B6F5A9504DB6B3F3356EA85F15EE' and list3.ad_language = ?  AND FIN_BankStatement.EM_APRM_Process_BS = TO_CHAR(list3.value))" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((finFinancialAccountId==null || finFinancialAccountId.equals(""))?"":"  AND FIN_BankStatement.FIN_Financial_Account_ID = ?  ");
    strSql = strSql + 
      "        AND FIN_BankStatement.FIN_Bankstatement_ID = ? " +
      "        AND FIN_BankStatement.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND FIN_BankStatement.AD_Org_ID IN (";
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
      if (finFinancialAccountId != null && !(finFinancialAccountId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
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
        ImportedBankStatementsData objectImportedBankStatementsData = new ImportedBankStatementsData();
        objectImportedBankStatementsData.created = UtilSql.getValue(result, "CREATED");
        objectImportedBankStatementsData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectImportedBankStatementsData.updated = UtilSql.getValue(result, "UPDATED");
        objectImportedBankStatementsData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectImportedBankStatementsData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectImportedBankStatementsData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectImportedBankStatementsData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectImportedBankStatementsData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectImportedBankStatementsData.cDoctypeIdr = UtilSql.getValue(result, "C_DOCTYPE_IDR");
        objectImportedBankStatementsData.name = UtilSql.getValue(result, "NAME");
        objectImportedBankStatementsData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectImportedBankStatementsData.importdate = UtilSql.getDateValue(result, "IMPORTDATE", "dd-MM-yyyy");
        objectImportedBankStatementsData.statementdate = UtilSql.getDateValue(result, "STATEMENTDATE", "dd-MM-yyyy");
        objectImportedBankStatementsData.filename = UtilSql.getValue(result, "FILENAME");
        objectImportedBankStatementsData.finReconciliationId = UtilSql.getValue(result, "FIN_RECONCILIATION_ID");
        objectImportedBankStatementsData.notes = UtilSql.getValue(result, "NOTES");
        objectImportedBankStatementsData.posted = UtilSql.getValue(result, "POSTED");
        objectImportedBankStatementsData.postedBtn = UtilSql.getValue(result, "POSTED_BTN");
        objectImportedBankStatementsData.emAprmProcessBsForce = UtilSql.getValue(result, "EM_APRM_PROCESS_BS_FORCE");
        objectImportedBankStatementsData.emAprmProcessBsForceBtn = UtilSql.getValue(result, "EM_APRM_PROCESS_BS_FORCE_BTN");
        objectImportedBankStatementsData.emAprmProcessBs = UtilSql.getValue(result, "EM_APRM_PROCESS_BS");
        objectImportedBankStatementsData.emAprmProcessBsBtn = UtilSql.getValue(result, "EM_APRM_PROCESS_BS_BTN");
        objectImportedBankStatementsData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectImportedBankStatementsData.processing = UtilSql.getValue(result, "PROCESSING");
        objectImportedBankStatementsData.processed = UtilSql.getValue(result, "PROCESSED");
        objectImportedBankStatementsData.finBankstatementId = UtilSql.getValue(result, "FIN_BANKSTATEMENT_ID");
        objectImportedBankStatementsData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectImportedBankStatementsData.finFinancialAccountId = UtilSql.getValue(result, "FIN_FINANCIAL_ACCOUNT_ID");
        objectImportedBankStatementsData.language = UtilSql.getValue(result, "LANGUAGE");
        objectImportedBankStatementsData.adUserClient = "";
        objectImportedBankStatementsData.adOrgClient = "";
        objectImportedBankStatementsData.createdby = "";
        objectImportedBankStatementsData.trBgcolor = "";
        objectImportedBankStatementsData.totalCount = "";
        objectImportedBankStatementsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportedBankStatementsData);
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
    ImportedBankStatementsData objectImportedBankStatementsData[] = new ImportedBankStatementsData[vector.size()];
    vector.copyInto(objectImportedBankStatementsData);
    return(objectImportedBankStatementsData);
  }

/**
Create a registry
 */
  public static ImportedBankStatementsData[] set(String finFinancialAccountId, String posted, String postedBtn, String emAprmProcessBsForce, String emAprmProcessBsForceBtn, String finBankstatementId, String adClientId, String adOrgId, String createdby, String createdbyr, String updatedby, String updatedbyr, String isactive, String documentno, String name, String notes, String cDoctypeId, String filename, String importdate, String statementdate, String finReconciliationId, String processing, String processed, String emAprmProcessBs, String emAprmProcessBsBtn)    throws ServletException {
    ImportedBankStatementsData objectImportedBankStatementsData[] = new ImportedBankStatementsData[1];
    objectImportedBankStatementsData[0] = new ImportedBankStatementsData();
    objectImportedBankStatementsData[0].created = "";
    objectImportedBankStatementsData[0].createdbyr = createdbyr;
    objectImportedBankStatementsData[0].updated = "";
    objectImportedBankStatementsData[0].updatedTimeStamp = "";
    objectImportedBankStatementsData[0].updatedby = updatedby;
    objectImportedBankStatementsData[0].updatedbyr = updatedbyr;
    objectImportedBankStatementsData[0].documentno = documentno;
    objectImportedBankStatementsData[0].cDoctypeId = cDoctypeId;
    objectImportedBankStatementsData[0].cDoctypeIdr = "";
    objectImportedBankStatementsData[0].name = name;
    objectImportedBankStatementsData[0].isactive = isactive;
    objectImportedBankStatementsData[0].importdate = importdate;
    objectImportedBankStatementsData[0].statementdate = statementdate;
    objectImportedBankStatementsData[0].filename = filename;
    objectImportedBankStatementsData[0].finReconciliationId = finReconciliationId;
    objectImportedBankStatementsData[0].notes = notes;
    objectImportedBankStatementsData[0].posted = posted;
    objectImportedBankStatementsData[0].postedBtn = postedBtn;
    objectImportedBankStatementsData[0].emAprmProcessBsForce = emAprmProcessBsForce;
    objectImportedBankStatementsData[0].emAprmProcessBsForceBtn = emAprmProcessBsForceBtn;
    objectImportedBankStatementsData[0].emAprmProcessBs = emAprmProcessBs;
    objectImportedBankStatementsData[0].emAprmProcessBsBtn = emAprmProcessBsBtn;
    objectImportedBankStatementsData[0].adOrgId = adOrgId;
    objectImportedBankStatementsData[0].processing = processing;
    objectImportedBankStatementsData[0].processed = processed;
    objectImportedBankStatementsData[0].finBankstatementId = finBankstatementId;
    objectImportedBankStatementsData[0].adClientId = adClientId;
    objectImportedBankStatementsData[0].finFinancialAccountId = finFinancialAccountId;
    objectImportedBankStatementsData[0].language = "";
    return objectImportedBankStatementsData;
  }

/**
Select for auxiliar field
 */
  public static String selectAuxB1C25B989C164EDFB7F9B26CB799DDAA(ConnectionProvider connectionProvider, String FIN_BankStatement_ID, String FIN_Financial_Account_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT 1 FROM DUAL WHERE EXISTS (SELECT 1 FROM FIN_BANKSTATEMENTLINE WHERE FIN_FINACC_TRANSACTION_ID IS NOT NULL AND FIN_BANKSTATEMENT_ID = ?) OR EXISTS (SELECT 1 FROM FIN_BANKSTATEMENTLINE, FIN_BANKSTATEMENT  WHERE DATETRX > (SELECT MAX(DATETRX) FROM FIN_BANKSTATEMENTLINE WHERE FIN_BANKSTATEMENT_ID = ?) AND  FIN_BANKSTATEMENT.FIN_BANKSTATEMENT_ID = FIN_BANKSTATEMENTLINE.FIN_BANKSTATEMENT_ID AND FIN_BANKSTATEMENT.FIN_FINANCIAL_ACCOUNT_ID = ?)  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_BankStatement_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_BankStatement_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_Financial_Account_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "1");
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
  public static String selectDef8189F49FFEA56E56E040007F01003E83_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef8189F49FFEA76E56E040007F01003E83_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT FIN_BankStatement.FIN_Financial_Account_ID AS NAME" +
      "        FROM FIN_BankStatement" +
      "        WHERE FIN_BankStatement.FIN_Bankstatement_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String finFinancialAccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.EM_Gac_Noperkiraan), ''))) AS NAME FROM FIN_Financial_Account left join (select FIN_Financial_Account_ID, Name, C_Currency_ID, EM_Gac_Noperkiraan from FIN_Financial_Account) table1 on (FIN_Financial_Account.FIN_Financial_Account_ID = table1.FIN_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (table1.C_Currency_ID = table2.C_Currency_ID) WHERE FIN_Financial_Account.FIN_Financial_Account_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String finFinancialAccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.EM_Gac_Noperkiraan), ''))) AS NAME FROM FIN_Financial_Account left join (select FIN_Financial_Account_ID, Name, C_Currency_ID, EM_Gac_Noperkiraan from FIN_Financial_Account) table1 on (FIN_Financial_Account.FIN_Financial_Account_ID = table1.FIN_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (table1.C_Currency_ID = table2.C_Currency_ID) WHERE FIN_Financial_Account.FIN_Financial_Account_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);

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
      "        UPDATE FIN_BankStatement" +
      "        SET DocumentNo = (?) , C_Doctype_ID = (?) , Name = (?) , Isactive = (?) , Importdate = TO_DATE(?) , Statementdate = TO_DATE(?) , Filename = (?) , FIN_Reconciliation_ID = (?) , Notes = (?) , Posted = (?) , EM_APRM_Process_BS_Force = (?) , EM_APRM_Process_BS = (?) , AD_Org_ID = (?) , Processing = (?) , Processed = (?) , FIN_Bankstatement_ID = (?) , AD_Client_ID = (?) , FIN_Financial_Account_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE FIN_BankStatement.FIN_Bankstatement_ID = ? " +
      "                 AND FIN_BankStatement.FIN_Financial_Account_ID = ? " +
      "        AND FIN_BankStatement.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_BankStatement.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, importdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, filename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finReconciliationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessBsForce);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessBs);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finBankstatementId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finBankstatementId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
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
      "        INSERT INTO FIN_BankStatement " +
      "        (DocumentNo, C_Doctype_ID, Name, Isactive, Importdate, Statementdate, Filename, FIN_Reconciliation_ID, Notes, Posted, EM_APRM_Process_BS_Force, EM_APRM_Process_BS, AD_Org_ID, Processing, Processed, FIN_Bankstatement_ID, AD_Client_ID, FIN_Financial_Account_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, importdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, filename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finReconciliationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessBsForce);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmProcessBs);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finBankstatementId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String finFinancialAccountId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM FIN_BankStatement" +
      "        WHERE FIN_BankStatement.FIN_Bankstatement_ID = ? " +
      "                 AND FIN_BankStatement.FIN_Financial_Account_ID = ? " +
      "        AND FIN_BankStatement.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_BankStatement.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
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
      "          FROM FIN_BankStatement" +
      "         WHERE FIN_BankStatement.FIN_Bankstatement_ID = ? ";

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
      "          FROM FIN_BankStatement" +
      "         WHERE FIN_BankStatement.FIN_Bankstatement_ID = ? ";

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
