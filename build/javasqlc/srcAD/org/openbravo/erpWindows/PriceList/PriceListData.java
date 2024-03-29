//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.PriceList;

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
class PriceListData implements FieldProvider {
static Logger log4j = Logger.getLogger(PriceListData.class);
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
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String description;
  public String issopricelist;
  public String costbased;
  public String basepricelistId;
  public String isactive;
  public String enforcepricelimit;
  public String istaxincluded;
  public String isdefault;
  public String adClientId;
  public String mPricelistId;
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
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ISSOPRICELIST"))
      return issopricelist;
    else if (fieldName.equalsIgnoreCase("COSTBASED"))
      return costbased;
    else if (fieldName.equalsIgnoreCase("BASEPRICELIST_ID") || fieldName.equals("basepricelistId"))
      return basepricelistId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ENFORCEPRICELIMIT"))
      return enforcepricelimit;
    else if (fieldName.equalsIgnoreCase("ISTAXINCLUDED"))
      return istaxincluded;
    else if (fieldName.equalsIgnoreCase("ISDEFAULT"))
      return isdefault;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
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
  public static PriceListData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static PriceListData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_PriceList.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_PriceList.CreatedBy) as CreatedByR, " +
      "        to_char(M_PriceList.Updated, ?) as updated, " +
      "        to_char(M_PriceList.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_PriceList.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_PriceList.UpdatedBy) as UpdatedByR," +
      "        M_PriceList.AD_Org_ID, " +
      "(CASE WHEN M_PriceList.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_PriceList.Name, " +
      "M_PriceList.C_Currency_ID, " +
      "(CASE WHEN M_PriceList.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "M_PriceList.Description, " +
      "COALESCE(M_PriceList.IsSOPriceList, 'N') AS IsSOPriceList, " +
      "COALESCE(M_PriceList.Costbased, 'N') AS Costbased, " +
      "M_PriceList.BasePriceList_ID, " +
      "COALESCE(M_PriceList.IsActive, 'N') AS IsActive, " +
      "COALESCE(M_PriceList.EnforcePriceLimit, 'N') AS EnforcePriceLimit, " +
      "COALESCE(M_PriceList.IsTaxIncluded, 'N') AS IsTaxIncluded, " +
      "COALESCE(M_PriceList.IsDefault, 'N') AS IsDefault, " +
      "M_PriceList.AD_Client_ID, " +
      "M_PriceList.M_PriceList_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM M_PriceList left join (select AD_Org_ID, Value from AD_Org) table1 on (M_PriceList.AD_Org_ID = table1.AD_Org_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (M_PriceList.C_Currency_ID = table2.C_Currency_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND M_PriceList.M_PriceList_ID = ? " +
      "        AND M_PriceList.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_PriceList.AD_Org_ID IN (";
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
        PriceListData objectPriceListData = new PriceListData();
        objectPriceListData.created = UtilSql.getValue(result, "CREATED");
        objectPriceListData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectPriceListData.updated = UtilSql.getValue(result, "UPDATED");
        objectPriceListData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectPriceListData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectPriceListData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectPriceListData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectPriceListData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectPriceListData.name = UtilSql.getValue(result, "NAME");
        objectPriceListData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectPriceListData.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectPriceListData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectPriceListData.issopricelist = UtilSql.getValue(result, "ISSOPRICELIST");
        objectPriceListData.costbased = UtilSql.getValue(result, "COSTBASED");
        objectPriceListData.basepricelistId = UtilSql.getValue(result, "BASEPRICELIST_ID");
        objectPriceListData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectPriceListData.enforcepricelimit = UtilSql.getValue(result, "ENFORCEPRICELIMIT");
        objectPriceListData.istaxincluded = UtilSql.getValue(result, "ISTAXINCLUDED");
        objectPriceListData.isdefault = UtilSql.getValue(result, "ISDEFAULT");
        objectPriceListData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectPriceListData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectPriceListData.language = UtilSql.getValue(result, "LANGUAGE");
        objectPriceListData.adUserClient = "";
        objectPriceListData.adOrgClient = "";
        objectPriceListData.createdby = "";
        objectPriceListData.trBgcolor = "";
        objectPriceListData.totalCount = "";
        objectPriceListData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPriceListData);
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
    PriceListData objectPriceListData[] = new PriceListData[vector.size()];
    vector.copyInto(objectPriceListData);
    return(objectPriceListData);
  }

/**
Create a registry
 */
  public static PriceListData[] set(String mPricelistId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String name, String description, String cCurrencyId, String issopricelist, String enforcepricelimit, String istaxincluded, String isdefault, String basepricelistId, String costbased)    throws ServletException {
    PriceListData objectPriceListData[] = new PriceListData[1];
    objectPriceListData[0] = new PriceListData();
    objectPriceListData[0].created = "";
    objectPriceListData[0].createdbyr = createdbyr;
    objectPriceListData[0].updated = "";
    objectPriceListData[0].updatedTimeStamp = "";
    objectPriceListData[0].updatedby = updatedby;
    objectPriceListData[0].updatedbyr = updatedbyr;
    objectPriceListData[0].adOrgId = adOrgId;
    objectPriceListData[0].adOrgIdr = "";
    objectPriceListData[0].name = name;
    objectPriceListData[0].cCurrencyId = cCurrencyId;
    objectPriceListData[0].cCurrencyIdr = "";
    objectPriceListData[0].description = description;
    objectPriceListData[0].issopricelist = issopricelist;
    objectPriceListData[0].costbased = costbased;
    objectPriceListData[0].basepricelistId = basepricelistId;
    objectPriceListData[0].isactive = isactive;
    objectPriceListData[0].enforcepricelimit = enforcepricelimit;
    objectPriceListData[0].istaxincluded = istaxincluded;
    objectPriceListData[0].isdefault = isdefault;
    objectPriceListData[0].adClientId = adClientId;
    objectPriceListData[0].mPricelistId = mPricelistId;
    objectPriceListData[0].language = "";
    return objectPriceListData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2105_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2107_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        UPDATE M_PriceList" +
      "        SET AD_Org_ID = (?) , Name = (?) , C_Currency_ID = (?) , Description = (?) , IsSOPriceList = (?) , Costbased = (?) , BasePriceList_ID = (?) , IsActive = (?) , EnforcePriceLimit = (?) , IsTaxIncluded = (?) , IsDefault = (?) , AD_Client_ID = (?) , M_PriceList_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_PriceList.M_PriceList_ID = ? " +
      "        AND M_PriceList.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_PriceList.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issopricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costbased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basepricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enforcepricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefault);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
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
      "        INSERT INTO M_PriceList " +
      "        (AD_Org_ID, Name, C_Currency_ID, Description, IsSOPriceList, Costbased, BasePriceList_ID, IsActive, EnforcePriceLimit, IsTaxIncluded, IsDefault, AD_Client_ID, M_PriceList_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issopricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costbased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basepricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enforcepricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefault);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
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
      "        DELETE FROM M_PriceList" +
      "        WHERE M_PriceList.M_PriceList_ID = ? " +
      "        AND M_PriceList.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_PriceList.AD_Org_ID IN (";
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
      "          FROM M_PriceList" +
      "         WHERE M_PriceList.M_PriceList_ID = ? ";

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
      "          FROM M_PriceList" +
      "         WHERE M_PriceList.M_PriceList_ID = ? ";

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
