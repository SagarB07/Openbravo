//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.com.gai.investasi.Investasi;

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
class Investasi11112E5A2512480B836813A44708197BData implements FieldProvider {
static Logger log4j = Logger.getLogger(Investasi11112E5A2512480B836813A44708197BData.class);
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
  public String area;
  public String gnvTypeinvestasiId;
  public String description;
  public String cBpartnerId;
  public String totalamount;
  public String totalnisbah;
  public String btncomplete;
  public String emGpvTglpositioning;
  public String emGpvAmountposition;
  public String emGpvPositioning;
  public String gnvInvestasiHeaderId;
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
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("AREA"))
      return area;
    else if (fieldName.equalsIgnoreCase("GNV_TYPEINVESTASI_ID") || fieldName.equals("gnvTypeinvestasiId"))
      return gnvTypeinvestasiId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("TOTALAMOUNT"))
      return totalamount;
    else if (fieldName.equalsIgnoreCase("TOTALNISBAH"))
      return totalnisbah;
    else if (fieldName.equalsIgnoreCase("BTNCOMPLETE"))
      return btncomplete;
    else if (fieldName.equalsIgnoreCase("EM_GPV_TGLPOSITIONING") || fieldName.equals("emGpvTglpositioning"))
      return emGpvTglpositioning;
    else if (fieldName.equalsIgnoreCase("EM_GPV_AMOUNTPOSITION") || fieldName.equals("emGpvAmountposition"))
      return emGpvAmountposition;
    else if (fieldName.equalsIgnoreCase("EM_GPV_POSITIONING") || fieldName.equals("emGpvPositioning"))
      return emGpvPositioning;
    else if (fieldName.equalsIgnoreCase("GNV_INVESTASI_HEADER_ID") || fieldName.equals("gnvInvestasiHeaderId"))
      return gnvInvestasiHeaderId;
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
  public static Investasi11112E5A2512480B836813A44708197BData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Investasi11112E5A2512480B836813A44708197BData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(GNV_INVESTASI_HEADER.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GNV_INVESTASI_HEADER.CreatedBy) as CreatedByR, " +
      "        to_char(GNV_INVESTASI_HEADER.Updated, ?) as updated, " +
      "        to_char(GNV_INVESTASI_HEADER.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        GNV_INVESTASI_HEADER.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GNV_INVESTASI_HEADER.UpdatedBy) as UpdatedByR," +
      "        GNV_INVESTASI_HEADER.AD_Org_ID, " +
      "(CASE WHEN GNV_INVESTASI_HEADER.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "COALESCE(GNV_INVESTASI_HEADER.Isactive, 'N') AS Isactive, " +
      "GNV_INVESTASI_HEADER.Area, " +
      "GNV_INVESTASI_HEADER.GNV_Typeinvestasi_ID, " +
      "GNV_INVESTASI_HEADER.Description, " +
      "GNV_INVESTASI_HEADER.C_Bpartner_ID, " +
      "GNV_INVESTASI_HEADER.Totalamount, " +
      "GNV_INVESTASI_HEADER.Totalnisbah, " +
      "GNV_INVESTASI_HEADER.Btncomplete, " +
      "GNV_INVESTASI_HEADER.EM_Gpv_Tglpositioning, " +
      "GNV_INVESTASI_HEADER.EM_Gpv_Amountposition, " +
      "GNV_INVESTASI_HEADER.EM_Gpv_Positioning, " +
      "GNV_INVESTASI_HEADER.GNV_Investasi_Header_ID, " +
      "GNV_INVESTASI_HEADER.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM GNV_INVESTASI_HEADER left join (select AD_Org_ID, Value from AD_Org) table1 on (GNV_INVESTASI_HEADER.AD_Org_ID = table1.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND GNV_INVESTASI_HEADER.GNV_Investasi_Header_ID = ? " +
      "        AND GNV_INVESTASI_HEADER.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND GNV_INVESTASI_HEADER.AD_Org_ID IN (";
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
        Investasi11112E5A2512480B836813A44708197BData objectInvestasi11112E5A2512480B836813A44708197BData = new Investasi11112E5A2512480B836813A44708197BData();
        objectInvestasi11112E5A2512480B836813A44708197BData.created = UtilSql.getValue(result, "CREATED");
        objectInvestasi11112E5A2512480B836813A44708197BData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectInvestasi11112E5A2512480B836813A44708197BData.updated = UtilSql.getValue(result, "UPDATED");
        objectInvestasi11112E5A2512480B836813A44708197BData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectInvestasi11112E5A2512480B836813A44708197BData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectInvestasi11112E5A2512480B836813A44708197BData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectInvestasi11112E5A2512480B836813A44708197BData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectInvestasi11112E5A2512480B836813A44708197BData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectInvestasi11112E5A2512480B836813A44708197BData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectInvestasi11112E5A2512480B836813A44708197BData.area = UtilSql.getValue(result, "AREA");
        objectInvestasi11112E5A2512480B836813A44708197BData.gnvTypeinvestasiId = UtilSql.getValue(result, "GNV_TYPEINVESTASI_ID");
        objectInvestasi11112E5A2512480B836813A44708197BData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectInvestasi11112E5A2512480B836813A44708197BData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectInvestasi11112E5A2512480B836813A44708197BData.totalamount = UtilSql.getValue(result, "TOTALAMOUNT");
        objectInvestasi11112E5A2512480B836813A44708197BData.totalnisbah = UtilSql.getValue(result, "TOTALNISBAH");
        objectInvestasi11112E5A2512480B836813A44708197BData.btncomplete = UtilSql.getValue(result, "BTNCOMPLETE");
        objectInvestasi11112E5A2512480B836813A44708197BData.emGpvTglpositioning = UtilSql.getDateValue(result, "EM_GPV_TGLPOSITIONING", "dd-MM-yyyy");
        objectInvestasi11112E5A2512480B836813A44708197BData.emGpvAmountposition = UtilSql.getValue(result, "EM_GPV_AMOUNTPOSITION");
        objectInvestasi11112E5A2512480B836813A44708197BData.emGpvPositioning = UtilSql.getValue(result, "EM_GPV_POSITIONING");
        objectInvestasi11112E5A2512480B836813A44708197BData.gnvInvestasiHeaderId = UtilSql.getValue(result, "GNV_INVESTASI_HEADER_ID");
        objectInvestasi11112E5A2512480B836813A44708197BData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectInvestasi11112E5A2512480B836813A44708197BData.language = UtilSql.getValue(result, "LANGUAGE");
        objectInvestasi11112E5A2512480B836813A44708197BData.adUserClient = "";
        objectInvestasi11112E5A2512480B836813A44708197BData.adOrgClient = "";
        objectInvestasi11112E5A2512480B836813A44708197BData.createdby = "";
        objectInvestasi11112E5A2512480B836813A44708197BData.trBgcolor = "";
        objectInvestasi11112E5A2512480B836813A44708197BData.totalCount = "";
        objectInvestasi11112E5A2512480B836813A44708197BData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectInvestasi11112E5A2512480B836813A44708197BData);
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
    Investasi11112E5A2512480B836813A44708197BData objectInvestasi11112E5A2512480B836813A44708197BData[] = new Investasi11112E5A2512480B836813A44708197BData[vector.size()];
    vector.copyInto(objectInvestasi11112E5A2512480B836813A44708197BData);
    return(objectInvestasi11112E5A2512480B836813A44708197BData);
  }

/**
Create a registry
 */
  public static Investasi11112E5A2512480B836813A44708197BData[] set(String emGpvTglpositioning, String gnvTypeinvestasiId, String emGpvAmountposition, String totalamount, String adOrgId, String description, String area, String cBpartnerId, String createdby, String createdbyr, String emGpvPositioning, String btncomplete, String updatedby, String updatedbyr, String gnvInvestasiHeaderId, String totalnisbah, String adClientId, String isactive)    throws ServletException {
    Investasi11112E5A2512480B836813A44708197BData objectInvestasi11112E5A2512480B836813A44708197BData[] = new Investasi11112E5A2512480B836813A44708197BData[1];
    objectInvestasi11112E5A2512480B836813A44708197BData[0] = new Investasi11112E5A2512480B836813A44708197BData();
    objectInvestasi11112E5A2512480B836813A44708197BData[0].created = "";
    objectInvestasi11112E5A2512480B836813A44708197BData[0].createdbyr = createdbyr;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].updated = "";
    objectInvestasi11112E5A2512480B836813A44708197BData[0].updatedTimeStamp = "";
    objectInvestasi11112E5A2512480B836813A44708197BData[0].updatedby = updatedby;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].updatedbyr = updatedbyr;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].adOrgId = adOrgId;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].adOrgIdr = "";
    objectInvestasi11112E5A2512480B836813A44708197BData[0].isactive = isactive;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].area = area;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].gnvTypeinvestasiId = gnvTypeinvestasiId;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].description = description;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].cBpartnerId = cBpartnerId;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].totalamount = totalamount;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].totalnisbah = totalnisbah;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].btncomplete = btncomplete;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].emGpvTglpositioning = emGpvTglpositioning;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].emGpvAmountposition = emGpvAmountposition;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].emGpvPositioning = emGpvPositioning;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].gnvInvestasiHeaderId = gnvInvestasiHeaderId;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].adClientId = adClientId;
    objectInvestasi11112E5A2512480B836813A44708197BData[0].language = "";
    return objectInvestasi11112E5A2512480B836813A44708197BData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef9B2CE3343C3E4089844C31E7BAF398FD_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefC66E4039186945B9AF58049F73F54E49_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE GNV_INVESTASI_HEADER" +
      "        SET AD_Org_ID = (?) , Isactive = (?) , Area = (?) , GNV_Typeinvestasi_ID = (?) , Description = (?) , C_Bpartner_ID = (?) , Totalamount = TO_NUMBER(?) , Totalnisbah = TO_NUMBER(?) , Btncomplete = (?) , EM_Gpv_Tglpositioning = TO_DATE(?) , EM_Gpv_Amountposition = TO_NUMBER(?) , EM_Gpv_Positioning = (?) , GNV_Investasi_Header_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE GNV_INVESTASI_HEADER.GNV_Investasi_Header_ID = ? " +
      "        AND GNV_INVESTASI_HEADER.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GNV_INVESTASI_HEADER.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, area);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvTypeinvestasiId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalamount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalnisbah);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btncomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGpvTglpositioning);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGpvAmountposition);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGpvPositioning);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvInvestasiHeaderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvInvestasiHeaderId);
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
      "        INSERT INTO GNV_INVESTASI_HEADER " +
      "        (AD_Org_ID, Isactive, Area, GNV_Typeinvestasi_ID, Description, C_Bpartner_ID, Totalamount, Totalnisbah, Btncomplete, EM_Gpv_Tglpositioning, EM_Gpv_Amountposition, EM_Gpv_Positioning, GNV_Investasi_Header_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_DATE(?), TO_NUMBER(?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, area);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvTypeinvestasiId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalamount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalnisbah);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btncomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGpvTglpositioning);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGpvAmountposition);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGpvPositioning);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvInvestasiHeaderId);
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
      "        DELETE FROM GNV_INVESTASI_HEADER" +
      "        WHERE GNV_INVESTASI_HEADER.GNV_Investasi_Header_ID = ? " +
      "        AND GNV_INVESTASI_HEADER.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GNV_INVESTASI_HEADER.AD_Org_ID IN (";
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
      "          FROM GNV_INVESTASI_HEADER" +
      "         WHERE GNV_INVESTASI_HEADER.GNV_Investasi_Header_ID = ? ";

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
      "          FROM GNV_INVESTASI_HEADER" +
      "         WHERE GNV_INVESTASI_HEADER.GNV_Investasi_Header_ID = ? ";

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
