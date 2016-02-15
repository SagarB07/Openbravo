//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.com.gai.investasi.Nisbah;

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
class Nisbah047EEE3EF6374CDD829A8E3DB224F36AData implements FieldProvider {
static Logger log4j = Logger.getLogger(Nisbah047EEE3EF6374CDD829A8E3DB224F36AData.class);
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
  public String lineno;
  public String periode;
  public String jumlahhari;
  public String amount;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String gnvInvestasiLineId;
  public String accountingdate;
  public String posted;
  public String postedBtn;
  public String documentno;
  public String adClientId;
  public String gnvInvestasiDetailId;
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
    else if (fieldName.equalsIgnoreCase("LINENO"))
      return lineno;
    else if (fieldName.equalsIgnoreCase("PERIODE"))
      return periode;
    else if (fieldName.equalsIgnoreCase("JUMLAHHARI"))
      return jumlahhari;
    else if (fieldName.equalsIgnoreCase("AMOUNT"))
      return amount;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("GNV_INVESTASI_LINE_ID") || fieldName.equals("gnvInvestasiLineId"))
      return gnvInvestasiLineId;
    else if (fieldName.equalsIgnoreCase("ACCOUNTINGDATE"))
      return accountingdate;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("POSTED_BTN") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("GNV_INVESTASI_DETAIL_ID") || fieldName.equals("gnvInvestasiDetailId"))
      return gnvInvestasiDetailId;
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
  public static Nisbah047EEE3EF6374CDD829A8E3DB224F36AData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Nisbah047EEE3EF6374CDD829A8E3DB224F36AData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(GNV_INVESTASI_DETAIL.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GNV_INVESTASI_DETAIL.CreatedBy) as CreatedByR, " +
      "        to_char(GNV_INVESTASI_DETAIL.Updated, ?) as updated, " +
      "        to_char(GNV_INVESTASI_DETAIL.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        GNV_INVESTASI_DETAIL.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GNV_INVESTASI_DETAIL.UpdatedBy) as UpdatedByR," +
      "        GNV_INVESTASI_DETAIL.AD_Org_ID, " +
      "(CASE WHEN GNV_INVESTASI_DETAIL.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "COALESCE(GNV_INVESTASI_DETAIL.Isactive, 'N') AS Isactive, " +
      "GNV_INVESTASI_DETAIL.Lineno, " +
      "GNV_INVESTASI_DETAIL.Periode, " +
      "GNV_INVESTASI_DETAIL.Jumlahhari, " +
      "GNV_INVESTASI_DETAIL.Amount, " +
      "GNV_INVESTASI_DETAIL.C_Currency_ID, " +
      "(CASE WHEN GNV_INVESTASI_DETAIL.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "GNV_INVESTASI_DETAIL.GNV_Investasi_Line_ID, " +
      "GNV_INVESTASI_DETAIL.Accountingdate, " +
      "GNV_INVESTASI_DETAIL.Posted, " +
      "list1.name as Posted_BTN, " +
      "GNV_INVESTASI_DETAIL.Documentno, " +
      "GNV_INVESTASI_DETAIL.AD_Client_ID, " +
      "GNV_INVESTASI_DETAIL.GNV_Investasi_Detail_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM GNV_INVESTASI_DETAIL left join (select AD_Org_ID, Value from AD_Org) table1 on (GNV_INVESTASI_DETAIL.AD_Org_ID = table1.AD_Org_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (GNV_INVESTASI_DETAIL.C_Currency_ID = table2.C_Currency_ID) left join ad_ref_list_v list1 on (list1.ad_reference_id = '234' and list1.ad_language = ?  AND GNV_INVESTASI_DETAIL.Posted = TO_CHAR(list1.value))" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND GNV_INVESTASI_DETAIL.GNV_Investasi_Detail_ID = ? " +
      "        AND GNV_INVESTASI_DETAIL.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND GNV_INVESTASI_DETAIL.AD_Org_ID IN (";
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
        Nisbah047EEE3EF6374CDD829A8E3DB224F36AData objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData = new Nisbah047EEE3EF6374CDD829A8E3DB224F36AData();
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.created = UtilSql.getValue(result, "CREATED");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.updated = UtilSql.getValue(result, "UPDATED");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.lineno = UtilSql.getValue(result, "LINENO");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.periode = UtilSql.getValue(result, "PERIODE");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.jumlahhari = UtilSql.getValue(result, "JUMLAHHARI");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.amount = UtilSql.getValue(result, "AMOUNT");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.gnvInvestasiLineId = UtilSql.getValue(result, "GNV_INVESTASI_LINE_ID");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.accountingdate = UtilSql.getDateValue(result, "ACCOUNTINGDATE", "dd-MM-yyyy");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.posted = UtilSql.getValue(result, "POSTED");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.postedBtn = UtilSql.getValue(result, "POSTED_BTN");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.gnvInvestasiDetailId = UtilSql.getValue(result, "GNV_INVESTASI_DETAIL_ID");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.language = UtilSql.getValue(result, "LANGUAGE");
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.adUserClient = "";
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.adOrgClient = "";
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.createdby = "";
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.trBgcolor = "";
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.totalCount = "";
        objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData);
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
    Nisbah047EEE3EF6374CDD829A8E3DB224F36AData objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[] = new Nisbah047EEE3EF6374CDD829A8E3DB224F36AData[vector.size()];
    vector.copyInto(objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData);
    return(objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData);
  }

/**
Create a registry
 */
  public static Nisbah047EEE3EF6374CDD829A8E3DB224F36AData[] set(String adOrgId, String jumlahhari, String amount, String gnvInvestasiDetailId, String cCurrencyId, String posted, String postedBtn, String isactive, String updatedby, String updatedbyr, String gnvInvestasiLineId, String createdby, String createdbyr, String documentno, String adClientId, String periode, String accountingdate, String lineno)    throws ServletException {
    Nisbah047EEE3EF6374CDD829A8E3DB224F36AData objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[] = new Nisbah047EEE3EF6374CDD829A8E3DB224F36AData[1];
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0] = new Nisbah047EEE3EF6374CDD829A8E3DB224F36AData();
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].created = "";
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].createdbyr = createdbyr;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].updated = "";
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].updatedTimeStamp = "";
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].updatedby = updatedby;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].updatedbyr = updatedbyr;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].adOrgId = adOrgId;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].adOrgIdr = "";
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].isactive = isactive;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].lineno = lineno;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].periode = periode;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].jumlahhari = jumlahhari;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].amount = amount;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].cCurrencyId = cCurrencyId;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].cCurrencyIdr = "";
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].gnvInvestasiLineId = gnvInvestasiLineId;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].accountingdate = accountingdate;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].posted = posted;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].postedBtn = postedBtn;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].documentno = documentno;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].adClientId = adClientId;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].gnvInvestasiDetailId = gnvInvestasiDetailId;
    objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData[0].language = "";
    return objectNisbah047EEE3EF6374CDD829A8E3DB224F36AData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef9B39F07FFF414354A475A2CA829DBEAB_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDefAF710ADD493C44F084369951725732F1_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefF17D441E6E024C98A34F199C4E5210EF(ConnectionProvider connectionProvider, String GNV_Investasi_Line_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(Lineno),0)+10 AS DefaultValue FROM GNV_INVESTASI_DETAIL WHERE GNV_INVESTASI_LINE_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, GNV_Investasi_Line_ID);

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
      "        UPDATE GNV_INVESTASI_DETAIL" +
      "        SET AD_Org_ID = (?) , Isactive = (?) , Lineno = TO_NUMBER(?) , Periode = (?) , Jumlahhari = TO_NUMBER(?) , Amount = TO_NUMBER(?) , C_Currency_ID = (?) , GNV_Investasi_Line_ID = (?) , Accountingdate = TO_DATE(?) , Posted = (?) , Documentno = (?) , AD_Client_ID = (?) , GNV_Investasi_Detail_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE GNV_INVESTASI_DETAIL.GNV_Investasi_Detail_ID = ? " +
      "        AND GNV_INVESTASI_DETAIL.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GNV_INVESTASI_DETAIL.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, jumlahhari);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvInvestasiLineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountingdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvInvestasiDetailId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvInvestasiDetailId);
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
      "        INSERT INTO GNV_INVESTASI_DETAIL " +
      "        (AD_Org_ID, Isactive, Lineno, Periode, Jumlahhari, Amount, C_Currency_ID, GNV_Investasi_Line_ID, Accountingdate, Posted, Documentno, AD_Client_ID, GNV_Investasi_Detail_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_DATE(?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lineno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, jumlahhari);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvInvestasiLineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountingdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvInvestasiDetailId);
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
      "        DELETE FROM GNV_INVESTASI_DETAIL" +
      "        WHERE GNV_INVESTASI_DETAIL.GNV_Investasi_Detail_ID = ? " +
      "        AND GNV_INVESTASI_DETAIL.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GNV_INVESTASI_DETAIL.AD_Org_ID IN (";
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
      "          FROM GNV_INVESTASI_DETAIL" +
      "         WHERE GNV_INVESTASI_DETAIL.GNV_Investasi_Detail_ID = ? ";

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
      "          FROM GNV_INVESTASI_DETAIL" +
      "         WHERE GNV_INVESTASI_DETAIL.GNV_Investasi_Detail_ID = ? ";

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
