//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.IndirectCost;

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
class ValueData implements FieldProvider {
static Logger log4j = Logger.getLogger(ValueData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String datefrom;
  public String dateto;
  public String costUom;
  public String costUomr;
  public String cost;
  public String total;
  public String calculate;
  public String calculated;
  public String isactive;
  public String maIndirectCostValueId;
  public String adOrgId;
  public String adClientId;
  public String maIndirectCostId;
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
    else if (fieldName.equalsIgnoreCase("DATEFROM"))
      return datefrom;
    else if (fieldName.equalsIgnoreCase("DATETO"))
      return dateto;
    else if (fieldName.equalsIgnoreCase("COST_UOM") || fieldName.equals("costUom"))
      return costUom;
    else if (fieldName.equalsIgnoreCase("COST_UOMR") || fieldName.equals("costUomr"))
      return costUomr;
    else if (fieldName.equalsIgnoreCase("COST"))
      return cost;
    else if (fieldName.equalsIgnoreCase("TOTAL"))
      return total;
    else if (fieldName.equalsIgnoreCase("CALCULATE"))
      return calculate;
    else if (fieldName.equalsIgnoreCase("CALCULATED"))
      return calculated;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("MA_INDIRECT_COST_VALUE_ID") || fieldName.equals("maIndirectCostValueId"))
      return maIndirectCostValueId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("MA_INDIRECT_COST_ID") || fieldName.equals("maIndirectCostId"))
      return maIndirectCostId;
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
  public static ValueData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String maIndirectCostId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, maIndirectCostId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ValueData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String maIndirectCostId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(MA_Indirect_Cost_Value.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = MA_Indirect_Cost_Value.CreatedBy) as CreatedByR, " +
      "        to_char(MA_Indirect_Cost_Value.Updated, ?) as updated, " +
      "        to_char(MA_Indirect_Cost_Value.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        MA_Indirect_Cost_Value.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = MA_Indirect_Cost_Value.UpdatedBy) as UpdatedByR," +
      "        MA_Indirect_Cost_Value.DateFrom, " +
      "MA_Indirect_Cost_Value.DateTo, " +
      "MA_Indirect_Cost_Value.Cost_Uom, " +
      "(CASE WHEN MA_Indirect_Cost_Value.Cost_Uom IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS Cost_UomR, " +
      "MA_Indirect_Cost_Value.Cost, " +
      "MA_Indirect_Cost_Value.Total, " +
      "MA_Indirect_Cost_Value.Calculate, " +
      "COALESCE(MA_Indirect_Cost_Value.Calculated, 'N') AS Calculated, " +
      "COALESCE(MA_Indirect_Cost_Value.IsActive, 'N') AS IsActive, " +
      "MA_Indirect_Cost_Value.MA_Indirect_Cost_Value_ID, " +
      "MA_Indirect_Cost_Value.AD_Org_ID, " +
      "MA_Indirect_Cost_Value.AD_Client_ID, " +
      "MA_Indirect_Cost_Value.MA_Indirect_Cost_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM MA_Indirect_Cost_Value left join ad_ref_list_v list1 on (MA_Indirect_Cost_Value.Cost_Uom = list1.value and list1.ad_reference_id = '800088' and list1.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((maIndirectCostId==null || maIndirectCostId.equals(""))?"":"  AND MA_Indirect_Cost_Value.MA_Indirect_Cost_ID = ?  ");
    strSql = strSql + 
      "        AND MA_Indirect_Cost_Value.MA_Indirect_Cost_Value_ID = ? " +
      "        AND MA_Indirect_Cost_Value.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND MA_Indirect_Cost_Value.AD_Org_ID IN (";
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
      if (maIndirectCostId != null && !(maIndirectCostId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostId);
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
        ValueData objectValueData = new ValueData();
        objectValueData.created = UtilSql.getValue(result, "CREATED");
        objectValueData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectValueData.updated = UtilSql.getValue(result, "UPDATED");
        objectValueData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectValueData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectValueData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectValueData.datefrom = UtilSql.getDateValue(result, "DATEFROM", "dd-MM-yyyy");
        objectValueData.dateto = UtilSql.getDateValue(result, "DATETO", "dd-MM-yyyy");
        objectValueData.costUom = UtilSql.getValue(result, "COST_UOM");
        objectValueData.costUomr = UtilSql.getValue(result, "COST_UOMR");
        objectValueData.cost = UtilSql.getValue(result, "COST");
        objectValueData.total = UtilSql.getValue(result, "TOTAL");
        objectValueData.calculate = UtilSql.getValue(result, "CALCULATE");
        objectValueData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectValueData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectValueData.maIndirectCostValueId = UtilSql.getValue(result, "MA_INDIRECT_COST_VALUE_ID");
        objectValueData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectValueData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectValueData.maIndirectCostId = UtilSql.getValue(result, "MA_INDIRECT_COST_ID");
        objectValueData.language = UtilSql.getValue(result, "LANGUAGE");
        objectValueData.adUserClient = "";
        objectValueData.adOrgClient = "";
        objectValueData.createdby = "";
        objectValueData.trBgcolor = "";
        objectValueData.totalCount = "";
        objectValueData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectValueData);
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
    ValueData objectValueData[] = new ValueData[vector.size()];
    vector.copyInto(objectValueData);
    return(objectValueData);
  }

/**
Create a registry
 */
  public static ValueData[] set(String maIndirectCostId, String maIndirectCostValueId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String datefrom, String dateto, String total, String cost, String calculate, String costUom, String calculated)    throws ServletException {
    ValueData objectValueData[] = new ValueData[1];
    objectValueData[0] = new ValueData();
    objectValueData[0].created = "";
    objectValueData[0].createdbyr = createdbyr;
    objectValueData[0].updated = "";
    objectValueData[0].updatedTimeStamp = "";
    objectValueData[0].updatedby = updatedby;
    objectValueData[0].updatedbyr = updatedbyr;
    objectValueData[0].datefrom = datefrom;
    objectValueData[0].dateto = dateto;
    objectValueData[0].costUom = costUom;
    objectValueData[0].costUomr = "";
    objectValueData[0].cost = cost;
    objectValueData[0].total = total;
    objectValueData[0].calculate = calculate;
    objectValueData[0].calculated = calculated;
    objectValueData[0].isactive = isactive;
    objectValueData[0].maIndirectCostValueId = maIndirectCostValueId;
    objectValueData[0].adOrgId = adOrgId;
    objectValueData[0].adClientId = adClientId;
    objectValueData[0].maIndirectCostId = maIndirectCostId;
    objectValueData[0].language = "";
    return objectValueData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef803192_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef803194_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        SELECT MA_Indirect_Cost_Value.MA_Indirect_Cost_ID AS NAME" +
      "        FROM MA_Indirect_Cost_Value" +
      "        WHERE MA_Indirect_Cost_Value.MA_Indirect_Cost_Value_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String maIndirectCostId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM MA_Indirect_Cost left join (select MA_Indirect_Cost_ID, Name from MA_Indirect_Cost) table1 on (MA_Indirect_Cost.MA_Indirect_Cost_ID = table1.MA_Indirect_Cost_ID) WHERE MA_Indirect_Cost.MA_Indirect_Cost_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String maIndirectCostId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM MA_Indirect_Cost left join (select MA_Indirect_Cost_ID, Name from MA_Indirect_Cost) table1 on (MA_Indirect_Cost.MA_Indirect_Cost_ID = table1.MA_Indirect_Cost_ID) WHERE MA_Indirect_Cost.MA_Indirect_Cost_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostId);

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
      "        UPDATE MA_Indirect_Cost_Value" +
      "        SET DateFrom = TO_DATE(?) , DateTo = TO_DATE(?) , Cost_Uom = (?) , Cost = TO_NUMBER(?) , Total = TO_NUMBER(?) , Calculate = (?) , Calculated = (?) , IsActive = (?) , MA_Indirect_Cost_Value_ID = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , MA_Indirect_Cost_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE MA_Indirect_Cost_Value.MA_Indirect_Cost_Value_ID = ? " +
      "                 AND MA_Indirect_Cost_Value.MA_Indirect_Cost_ID = ? " +
      "        AND MA_Indirect_Cost_Value.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MA_Indirect_Cost_Value.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costUom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, total);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostValueId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostValueId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostId);
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
      "        INSERT INTO MA_Indirect_Cost_Value " +
      "        (DateFrom, DateTo, Cost_Uom, Cost, Total, Calculate, Calculated, IsActive, MA_Indirect_Cost_Value_ID, AD_Org_ID, AD_Client_ID, MA_Indirect_Cost_ID, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_DATE(?), TO_DATE(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costUom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, total);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostValueId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String maIndirectCostId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM MA_Indirect_Cost_Value" +
      "        WHERE MA_Indirect_Cost_Value.MA_Indirect_Cost_Value_ID = ? " +
      "                 AND MA_Indirect_Cost_Value.MA_Indirect_Cost_ID = ? " +
      "        AND MA_Indirect_Cost_Value.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MA_Indirect_Cost_Value.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maIndirectCostId);
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
      "          FROM MA_Indirect_Cost_Value" +
      "         WHERE MA_Indirect_Cost_Value.MA_Indirect_Cost_Value_ID = ? ";

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
      "          FROM MA_Indirect_Cost_Value" +
      "         WHERE MA_Indirect_Cost_Value.MA_Indirect_Cost_Value_ID = ? ";

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
