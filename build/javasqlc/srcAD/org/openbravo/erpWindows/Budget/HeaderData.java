//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Budget;

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
  public String adOrgId;
  public String adOrgIdr;
  public String name;
  public String cYearId;
  public String cYearIdr;
  public String exportactual;
  public String description;
  public String isactive;
  public String exportexcel;
  public String copybudget;
  public String budgetType;
  public String process;
  public String emGbgBudgetamt;
  public String emGbgActualamt;
  public String emGbgEstimasiamt;
  public String emGbgAvailableamt;
  public String emGbgAdditionalbudget;
  public String emGbgSaved;
  public String emGbgDocstatus;
  public String emGbgDocstatusr;
  public String emGbgBtnapprove;
  public String emGmmMasterDepartmentId;
  public String cBudgetId;
  public String adClientId;
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
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("C_YEAR_ID") || fieldName.equals("cYearId"))
      return cYearId;
    else if (fieldName.equalsIgnoreCase("C_YEAR_IDR") || fieldName.equals("cYearIdr"))
      return cYearIdr;
    else if (fieldName.equalsIgnoreCase("EXPORTACTUAL"))
      return exportactual;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("EXPORTEXCEL"))
      return exportexcel;
    else if (fieldName.equalsIgnoreCase("COPYBUDGET"))
      return copybudget;
    else if (fieldName.equalsIgnoreCase("BUDGET_TYPE") || fieldName.equals("budgetType"))
      return budgetType;
    else if (fieldName.equalsIgnoreCase("PROCESS"))
      return process;
    else if (fieldName.equalsIgnoreCase("EM_GBG_BUDGETAMT") || fieldName.equals("emGbgBudgetamt"))
      return emGbgBudgetamt;
    else if (fieldName.equalsIgnoreCase("EM_GBG_ACTUALAMT") || fieldName.equals("emGbgActualamt"))
      return emGbgActualamt;
    else if (fieldName.equalsIgnoreCase("EM_GBG_ESTIMASIAMT") || fieldName.equals("emGbgEstimasiamt"))
      return emGbgEstimasiamt;
    else if (fieldName.equalsIgnoreCase("EM_GBG_AVAILABLEAMT") || fieldName.equals("emGbgAvailableamt"))
      return emGbgAvailableamt;
    else if (fieldName.equalsIgnoreCase("EM_GBG_ADDITIONALBUDGET") || fieldName.equals("emGbgAdditionalbudget"))
      return emGbgAdditionalbudget;
    else if (fieldName.equalsIgnoreCase("EM_GBG_SAVED") || fieldName.equals("emGbgSaved"))
      return emGbgSaved;
    else if (fieldName.equalsIgnoreCase("EM_GBG_DOCSTATUS") || fieldName.equals("emGbgDocstatus"))
      return emGbgDocstatus;
    else if (fieldName.equalsIgnoreCase("EM_GBG_DOCSTATUSR") || fieldName.equals("emGbgDocstatusr"))
      return emGbgDocstatusr;
    else if (fieldName.equalsIgnoreCase("EM_GBG_BTNAPPROVE") || fieldName.equals("emGbgBtnapprove"))
      return emGbgBtnapprove;
    else if (fieldName.equalsIgnoreCase("EM_GMM_MASTER_DEPARTMENT_ID") || fieldName.equals("emGmmMasterDepartmentId"))
      return emGmmMasterDepartmentId;
    else if (fieldName.equalsIgnoreCase("C_BUDGET_ID") || fieldName.equals("cBudgetId"))
      return cBudgetId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
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
      "        SELECT to_char(C_Budget.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Budget.CreatedBy) as CreatedByR, " +
      "        to_char(C_Budget.Updated, ?) as updated, " +
      "        to_char(C_Budget.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Budget.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Budget.UpdatedBy) as UpdatedByR," +
      "        C_Budget.AD_Org_ID, " +
      "(CASE WHEN C_Budget.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_Budget.Name, " +
      "C_Budget.C_Year_ID, " +
      "(CASE WHEN C_Budget.C_Year_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Year), ''))),'') ) END) AS C_Year_IDR, " +
      "COALESCE(C_Budget.ExportActual, 'N') AS ExportActual, " +
      "C_Budget.Description, " +
      "COALESCE(C_Budget.IsActive, 'N') AS IsActive, " +
      "C_Budget.Exportexcel, " +
      "C_Budget.Copybudget, " +
      "C_Budget.Budget_Type, " +
      "C_Budget.Process, " +
      "C_Budget.EM_Gbg_Budgetamt, " +
      "C_Budget.EM_Gbg_Actualamt, " +
      "C_Budget.EM_Gbg_Estimasiamt, " +
      "C_Budget.EM_Gbg_Availableamt, " +
      "C_Budget.EM_Gbg_Additionalbudget, " +
      "COALESCE(C_Budget.EM_Gbg_Saved, 'N') AS EM_Gbg_Saved, " +
      "C_Budget.EM_Gbg_Docstatus, " +
      "(CASE WHEN C_Budget.EM_Gbg_Docstatus IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS EM_Gbg_DocstatusR, " +
      "C_Budget.EM_Gbg_Btnapprove, " +
      "C_Budget.EM_Gmm_Master_Department_ID, " +
      "C_Budget.C_Budget_ID, " +
      "C_Budget.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Budget left join (select AD_Org_ID, Value from AD_Org) table1 on (C_Budget.AD_Org_ID = table1.AD_Org_ID) left join (select C_Year_ID, Year from C_Year) table2 on (C_Budget.C_Year_ID = table2.C_Year_ID) left join ad_ref_list_v list1 on (C_Budget.EM_Gbg_Docstatus = list1.value and list1.ad_reference_id = '4E509E264EFE4A7EACBBD3769D776A90' and list1.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND C_Budget.C_Budget_ID = ? " +
      "        AND C_Budget.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_Budget.AD_Org_ID IN (";
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
        HeaderData objectHeaderData = new HeaderData();
        objectHeaderData.created = UtilSql.getValue(result, "CREATED");
        objectHeaderData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectHeaderData.updated = UtilSql.getValue(result, "UPDATED");
        objectHeaderData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectHeaderData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectHeaderData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectHeaderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectHeaderData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectHeaderData.name = UtilSql.getValue(result, "NAME");
        objectHeaderData.cYearId = UtilSql.getValue(result, "C_YEAR_ID");
        objectHeaderData.cYearIdr = UtilSql.getValue(result, "C_YEAR_IDR");
        objectHeaderData.exportactual = UtilSql.getValue(result, "EXPORTACTUAL");
        objectHeaderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectHeaderData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectHeaderData.exportexcel = UtilSql.getValue(result, "EXPORTEXCEL");
        objectHeaderData.copybudget = UtilSql.getValue(result, "COPYBUDGET");
        objectHeaderData.budgetType = UtilSql.getValue(result, "BUDGET_TYPE");
        objectHeaderData.process = UtilSql.getValue(result, "PROCESS");
        objectHeaderData.emGbgBudgetamt = UtilSql.getValue(result, "EM_GBG_BUDGETAMT");
        objectHeaderData.emGbgActualamt = UtilSql.getValue(result, "EM_GBG_ACTUALAMT");
        objectHeaderData.emGbgEstimasiamt = UtilSql.getValue(result, "EM_GBG_ESTIMASIAMT");
        objectHeaderData.emGbgAvailableamt = UtilSql.getValue(result, "EM_GBG_AVAILABLEAMT");
        objectHeaderData.emGbgAdditionalbudget = UtilSql.getValue(result, "EM_GBG_ADDITIONALBUDGET");
        objectHeaderData.emGbgSaved = UtilSql.getValue(result, "EM_GBG_SAVED");
        objectHeaderData.emGbgDocstatus = UtilSql.getValue(result, "EM_GBG_DOCSTATUS");
        objectHeaderData.emGbgDocstatusr = UtilSql.getValue(result, "EM_GBG_DOCSTATUSR");
        objectHeaderData.emGbgBtnapprove = UtilSql.getValue(result, "EM_GBG_BTNAPPROVE");
        objectHeaderData.emGmmMasterDepartmentId = UtilSql.getValue(result, "EM_GMM_MASTER_DEPARTMENT_ID");
        objectHeaderData.cBudgetId = UtilSql.getValue(result, "C_BUDGET_ID");
        objectHeaderData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
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
  public static HeaderData[] set(String exportactual, String emGbgEstimasiamt, String emGmmMasterDepartmentId, String emGbgAvailableamt, String emGbgActualamt, String emGbgBtnapprove, String emGbgBudgetamt, String emGbgSaved, String emGbgDocstatus, String cBudgetId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String name, String description, String cYearId, String copybudget, String budgetType, String exportexcel, String process, String emGbgAdditionalbudget)    throws ServletException {
    HeaderData objectHeaderData[] = new HeaderData[1];
    objectHeaderData[0] = new HeaderData();
    objectHeaderData[0].created = "";
    objectHeaderData[0].createdbyr = createdbyr;
    objectHeaderData[0].updated = "";
    objectHeaderData[0].updatedTimeStamp = "";
    objectHeaderData[0].updatedby = updatedby;
    objectHeaderData[0].updatedbyr = updatedbyr;
    objectHeaderData[0].adOrgId = adOrgId;
    objectHeaderData[0].adOrgIdr = "";
    objectHeaderData[0].name = name;
    objectHeaderData[0].cYearId = cYearId;
    objectHeaderData[0].cYearIdr = "";
    objectHeaderData[0].exportactual = exportactual;
    objectHeaderData[0].description = description;
    objectHeaderData[0].isactive = isactive;
    objectHeaderData[0].exportexcel = exportexcel;
    objectHeaderData[0].copybudget = copybudget;
    objectHeaderData[0].budgetType = budgetType;
    objectHeaderData[0].process = process;
    objectHeaderData[0].emGbgBudgetamt = emGbgBudgetamt;
    objectHeaderData[0].emGbgActualamt = emGbgActualamt;
    objectHeaderData[0].emGbgEstimasiamt = emGbgEstimasiamt;
    objectHeaderData[0].emGbgAvailableamt = emGbgAvailableamt;
    objectHeaderData[0].emGbgAdditionalbudget = emGbgAdditionalbudget;
    objectHeaderData[0].emGbgSaved = emGbgSaved;
    objectHeaderData[0].emGbgDocstatus = emGbgDocstatus;
    objectHeaderData[0].emGbgDocstatusr = "";
    objectHeaderData[0].emGbgBtnapprove = emGbgBtnapprove;
    objectHeaderData[0].emGmmMasterDepartmentId = emGmmMasterDepartmentId;
    objectHeaderData[0].cBudgetId = cBudgetId;
    objectHeaderData[0].adClientId = adClientId;
    objectHeaderData[0].language = "";
    return objectHeaderData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef802838_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef802840_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_Budget" +
      "        SET AD_Org_ID = (?) , Name = (?) , C_Year_ID = (?) , ExportActual = (?) , Description = (?) , IsActive = (?) , Exportexcel = (?) , Copybudget = (?) , Budget_Type = (?) , Process = (?) , EM_Gbg_Budgetamt = TO_NUMBER(?) , EM_Gbg_Actualamt = TO_NUMBER(?) , EM_Gbg_Estimasiamt = TO_NUMBER(?) , EM_Gbg_Availableamt = TO_NUMBER(?) , EM_Gbg_Additionalbudget = (?) , EM_Gbg_Saved = (?) , EM_Gbg_Docstatus = (?) , EM_Gbg_Btnapprove = (?) , EM_Gmm_Master_Department_ID = (?) , C_Budget_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_Budget.C_Budget_ID = ? " +
      "        AND C_Budget.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Budget.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, exportactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, exportexcel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copybudget);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, budgetType);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, process);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgBudgetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgActualamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgEstimasiamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgAvailableamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgAdditionalbudget);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgSaved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgDocstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgBtnapprove);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMasterDepartmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBudgetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBudgetId);
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
      "        INSERT INTO C_Budget " +
      "        (AD_Org_ID, Name, C_Year_ID, ExportActual, Description, IsActive, Exportexcel, Copybudget, Budget_Type, Process, EM_Gbg_Budgetamt, EM_Gbg_Actualamt, EM_Gbg_Estimasiamt, EM_Gbg_Availableamt, EM_Gbg_Additionalbudget, EM_Gbg_Saved, EM_Gbg_Docstatus, EM_Gbg_Btnapprove, EM_Gmm_Master_Department_ID, C_Budget_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, exportactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, exportexcel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copybudget);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, budgetType);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, process);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgBudgetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgActualamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgEstimasiamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgAvailableamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgAdditionalbudget);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgSaved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgDocstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGbgBtnapprove);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMasterDepartmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBudgetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
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
      "        DELETE FROM C_Budget" +
      "        WHERE C_Budget.C_Budget_ID = ? " +
      "        AND C_Budget.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Budget.AD_Org_ID IN (";
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
      "          FROM C_Budget" +
      "         WHERE C_Budget.C_Budget_ID = ? ";

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
      "          FROM C_Budget" +
      "         WHERE C_Budget.C_Budget_ID = ? ";

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
