//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Organization;

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
class OrganizationData implements FieldProvider {
static Logger log4j = Logger.getLogger(OrganizationData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String value;
  public String name;
  public String description;
  public String isactive;
  public String issummary;
  public String socialName;
  public String adOrgtypeId;
  public String adOrgtypeIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String isperiodcontrolallowed;
  public String cCalendarId;
  public String cCalendarIdr;
  public String isready;
  public String cAcctschemaId;
  public String cAcctschemaIdr;
  public String adClientId;
  public String adOrgId;
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
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ISSUMMARY"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("SOCIAL_NAME") || fieldName.equals("socialName"))
      return socialName;
    else if (fieldName.equalsIgnoreCase("AD_ORGTYPE_ID") || fieldName.equals("adOrgtypeId"))
      return adOrgtypeId;
    else if (fieldName.equalsIgnoreCase("AD_ORGTYPE_IDR") || fieldName.equals("adOrgtypeIdr"))
      return adOrgtypeIdr;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("ISPERIODCONTROLALLOWED"))
      return isperiodcontrolallowed;
    else if (fieldName.equalsIgnoreCase("C_CALENDAR_ID") || fieldName.equals("cCalendarId"))
      return cCalendarId;
    else if (fieldName.equalsIgnoreCase("C_CALENDAR_IDR") || fieldName.equals("cCalendarIdr"))
      return cCalendarIdr;
    else if (fieldName.equalsIgnoreCase("ISREADY"))
      return isready;
    else if (fieldName.equalsIgnoreCase("C_ACCTSCHEMA_ID") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
    else if (fieldName.equalsIgnoreCase("C_ACCTSCHEMA_IDR") || fieldName.equals("cAcctschemaIdr"))
      return cAcctschemaIdr;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
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
  public static OrganizationData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OrganizationData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_Org.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Org.CreatedBy) as CreatedByR, " +
      "        to_char(AD_Org.Updated, ?) as updated, " +
      "        to_char(AD_Org.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_Org.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_Org.UpdatedBy) as UpdatedByR," +
      "        AD_Org.Value, " +
      "AD_Org.Name, " +
      "AD_Org.Description, " +
      "COALESCE(AD_Org.IsActive, 'N') AS IsActive, " +
      "COALESCE(AD_Org.IsSummary, 'N') AS IsSummary, " +
      "AD_Org.Social_Name, " +
      "AD_Org.AD_Orgtype_ID, " +
      "(CASE WHEN AD_Org.AD_Orgtype_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Orgtype_IDR, " +
      "AD_Org.C_Currency_ID, " +
      "(CASE WHEN AD_Org.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "COALESCE(AD_Org.IsPeriodControlAllowed, 'N') AS IsPeriodControlAllowed, " +
      "AD_Org.C_Calendar_ID, " +
      "(CASE WHEN AD_Org.C_Calendar_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_Calendar_IDR, " +
      "AD_Org.IsReady, " +
      "AD_Org.C_Acctschema_ID, " +
      "(CASE WHEN AD_Org.C_Acctschema_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_Acctschema_IDR, " +
      "AD_Org.AD_Client_ID, " +
      "AD_Org.AD_Org_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM AD_Org left join (select AD_Orgtype_ID, Name from AD_Orgtype) table1 on (AD_Org.AD_Orgtype_ID = table1.AD_Orgtype_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (AD_Org.C_Currency_ID = table2.C_Currency_ID) left join (select C_Calendar_ID, Name from C_Calendar) table3 on (AD_Org.C_Calendar_ID = table3.C_Calendar_ID) left join (select C_Acctschema_ID, Name from C_Acctschema) table4 on (AD_Org.C_Acctschema_ID = table4.C_Acctschema_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND AD_Org.AD_Org_ID = ? " +
      "        AND AD_Org.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND AD_Org.AD_Org_ID IN (";
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
        OrganizationData objectOrganizationData = new OrganizationData();
        objectOrganizationData.created = UtilSql.getValue(result, "CREATED");
        objectOrganizationData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectOrganizationData.updated = UtilSql.getValue(result, "UPDATED");
        objectOrganizationData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectOrganizationData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectOrganizationData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectOrganizationData.value = UtilSql.getValue(result, "VALUE");
        objectOrganizationData.name = UtilSql.getValue(result, "NAME");
        objectOrganizationData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectOrganizationData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectOrganizationData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectOrganizationData.socialName = UtilSql.getValue(result, "SOCIAL_NAME");
        objectOrganizationData.adOrgtypeId = UtilSql.getValue(result, "AD_ORGTYPE_ID");
        objectOrganizationData.adOrgtypeIdr = UtilSql.getValue(result, "AD_ORGTYPE_IDR");
        objectOrganizationData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectOrganizationData.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectOrganizationData.isperiodcontrolallowed = UtilSql.getValue(result, "ISPERIODCONTROLALLOWED");
        objectOrganizationData.cCalendarId = UtilSql.getValue(result, "C_CALENDAR_ID");
        objectOrganizationData.cCalendarIdr = UtilSql.getValue(result, "C_CALENDAR_IDR");
        objectOrganizationData.isready = UtilSql.getValue(result, "ISREADY");
        objectOrganizationData.cAcctschemaId = UtilSql.getValue(result, "C_ACCTSCHEMA_ID");
        objectOrganizationData.cAcctschemaIdr = UtilSql.getValue(result, "C_ACCTSCHEMA_IDR");
        objectOrganizationData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectOrganizationData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectOrganizationData.language = UtilSql.getValue(result, "LANGUAGE");
        objectOrganizationData.adUserClient = "";
        objectOrganizationData.adOrgClient = "";
        objectOrganizationData.createdby = "";
        objectOrganizationData.trBgcolor = "";
        objectOrganizationData.totalCount = "";
        objectOrganizationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrganizationData);
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
    OrganizationData objectOrganizationData[] = new OrganizationData[vector.size()];
    vector.copyInto(objectOrganizationData);
    return(objectOrganizationData);
  }

/**
Create a registry
 */
  public static OrganizationData[] set(String value, String issummary, String cAcctschemaId, String name, String description, String adClientId, String adOrgId, String adOrgtypeId, String isperiodcontrolallowed, String cCalendarId, String isready, String socialName, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String cCurrencyId)    throws ServletException {
    OrganizationData objectOrganizationData[] = new OrganizationData[1];
    objectOrganizationData[0] = new OrganizationData();
    objectOrganizationData[0].created = "";
    objectOrganizationData[0].createdbyr = createdbyr;
    objectOrganizationData[0].updated = "";
    objectOrganizationData[0].updatedTimeStamp = "";
    objectOrganizationData[0].updatedby = updatedby;
    objectOrganizationData[0].updatedbyr = updatedbyr;
    objectOrganizationData[0].value = value;
    objectOrganizationData[0].name = name;
    objectOrganizationData[0].description = description;
    objectOrganizationData[0].isactive = isactive;
    objectOrganizationData[0].issummary = issummary;
    objectOrganizationData[0].socialName = socialName;
    objectOrganizationData[0].adOrgtypeId = adOrgtypeId;
    objectOrganizationData[0].adOrgtypeIdr = "";
    objectOrganizationData[0].cCurrencyId = cCurrencyId;
    objectOrganizationData[0].cCurrencyIdr = "";
    objectOrganizationData[0].isperiodcontrolallowed = isperiodcontrolallowed;
    objectOrganizationData[0].cCalendarId = cCalendarId;
    objectOrganizationData[0].cCalendarIdr = "";
    objectOrganizationData[0].isready = isready;
    objectOrganizationData[0].cAcctschemaId = cAcctschemaId;
    objectOrganizationData[0].cAcctschemaIdr = "";
    objectOrganizationData[0].adClientId = adClientId;
    objectOrganizationData[0].adOrgId = adOrgId;
    objectOrganizationData[0].language = "";
    return objectOrganizationData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux022E77136C554D3A9A23E95A724E7BC1(ConnectionProvider connectionProvider, String AD_ORG_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT 'Y' FROM AD_ORGTYPE OT join ad_org o on (ot.ad_orgtype_id = o.ad_orgtype_id)" +
      "WHERE ((IsAcctLegalEntity<>'N' or IsLegalEntity<>'Y') or (o.C_ACCTSCHEMA_ID is not null)) and o.ad_org_id=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "'Y'");
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
  public static String selectAuxCA8005C0F23945E89C4AD3C7899E5E89(ConnectionProvider connectionProvider, String AD_ORG_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT 'Y' FROM ad_org, ad_orgtype WHERE ad_org.ad_orgtype_id= ad_orgtype.ad_orgtype_id AND ad_org.ad_org_id=? AND (ISBUSINESSUNIT='Y' OR (ISLEGALENTITY='Y' AND ISACCTLEGALENTITY='Y')) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "'Y'");
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
  public static String selectDef713_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef715_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE AD_Org" +
      "        SET Value = (?) , Name = (?) , Description = (?) , IsActive = (?) , IsSummary = (?) , Social_Name = (?) , AD_Orgtype_ID = (?) , C_Currency_ID = (?) , IsPeriodControlAllowed = (?) , C_Calendar_ID = (?) , IsReady = (?) , C_Acctschema_ID = (?) , AD_Client_ID = (?) , AD_Org_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE AD_Org.AD_Org_ID = ? " +
      "        AND AD_Org.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Org.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, socialName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isperiodcontrolallowed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCalendarId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isready);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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
      "        INSERT INTO AD_Org " +
      "        (Value, Name, Description, IsActive, IsSummary, Social_Name, AD_Orgtype_ID, C_Currency_ID, IsPeriodControlAllowed, C_Calendar_ID, IsReady, C_Acctschema_ID, AD_Client_ID, AD_Org_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, socialName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isperiodcontrolallowed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCalendarId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isready);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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
      "        DELETE FROM AD_Org" +
      "        WHERE AD_Org.AD_Org_ID = ? " +
      "        AND AD_Org.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_Org.AD_Org_ID IN (";
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
      "          FROM AD_Org" +
      "         WHERE AD_Org.AD_Org_ID = ? ";

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
      "          FROM AD_Org" +
      "         WHERE AD_Org.AD_Org_ID = ? ";

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
