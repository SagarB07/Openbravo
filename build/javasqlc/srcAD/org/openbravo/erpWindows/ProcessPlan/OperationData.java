//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.ProcessPlan;

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
class OperationData implements FieldProvider {
static Logger log4j = Logger.getLogger(OperationData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String seqno;
  public String value;
  public String name;
  public String maProcessId;
  public String maProcessIdr;
  public String estimatedtime;
  public String costcenteruse;
  public String preptime;
  public String description;
  public String multiplier;
  public String noqty;
  public String groupuse;
  public String outsourced;
  public String outsourcingcost;
  public String isdefault;
  public String isactive;
  public String costcentercost;
  public String usedmaterial;
  public String maSequenceId;
  public String adOrgId;
  public String adClientId;
  public String calculated;
  public String maProcessplanVersionId;
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
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("MA_PROCESS_ID") || fieldName.equals("maProcessId"))
      return maProcessId;
    else if (fieldName.equalsIgnoreCase("MA_PROCESS_IDR") || fieldName.equals("maProcessIdr"))
      return maProcessIdr;
    else if (fieldName.equalsIgnoreCase("ESTIMATEDTIME"))
      return estimatedtime;
    else if (fieldName.equalsIgnoreCase("COSTCENTERUSE"))
      return costcenteruse;
    else if (fieldName.equalsIgnoreCase("PREPTIME"))
      return preptime;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("MULTIPLIER"))
      return multiplier;
    else if (fieldName.equalsIgnoreCase("NOQTY"))
      return noqty;
    else if (fieldName.equalsIgnoreCase("GROUPUSE"))
      return groupuse;
    else if (fieldName.equalsIgnoreCase("OUTSOURCED"))
      return outsourced;
    else if (fieldName.equalsIgnoreCase("OUTSOURCINGCOST"))
      return outsourcingcost;
    else if (fieldName.equalsIgnoreCase("ISDEFAULT"))
      return isdefault;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("COSTCENTERCOST"))
      return costcentercost;
    else if (fieldName.equalsIgnoreCase("USEDMATERIAL"))
      return usedmaterial;
    else if (fieldName.equalsIgnoreCase("MA_SEQUENCE_ID") || fieldName.equals("maSequenceId"))
      return maSequenceId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("CALCULATED"))
      return calculated;
    else if (fieldName.equalsIgnoreCase("MA_PROCESSPLAN_VERSION_ID") || fieldName.equals("maProcessplanVersionId"))
      return maProcessplanVersionId;
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
  public static OperationData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String maProcessplanVersionId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, maProcessplanVersionId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OperationData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String maProcessplanVersionId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(MA_Sequence.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = MA_Sequence.CreatedBy) as CreatedByR, " +
      "        to_char(MA_Sequence.Updated, ?) as updated, " +
      "        to_char(MA_Sequence.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        MA_Sequence.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = MA_Sequence.UpdatedBy) as UpdatedByR," +
      "        MA_Sequence.SeqNo, " +
      "MA_Sequence.Value, " +
      "MA_Sequence.Name, " +
      "MA_Sequence.MA_Process_ID, " +
      "(CASE WHEN MA_Sequence.MA_Process_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS MA_Process_IDR, " +
      "MA_Sequence.Estimatedtime, " +
      "MA_Sequence.CostCenterUse, " +
      "MA_Sequence.Preptime, " +
      "MA_Sequence.Description, " +
      "MA_Sequence.Multiplier, " +
      "COALESCE(MA_Sequence.Noqty, 'N') AS Noqty, " +
      "COALESCE(MA_Sequence.Groupuse, 'N') AS Groupuse, " +
      "COALESCE(MA_Sequence.Outsourced, 'N') AS Outsourced, " +
      "MA_Sequence.Outsourcingcost, " +
      "COALESCE(MA_Sequence.Isdefault, 'N') AS Isdefault, " +
      "COALESCE(MA_Sequence.IsActive, 'N') AS IsActive, " +
      "MA_Sequence.Costcentercost, " +
      "COALESCE(MA_Sequence.Usedmaterial, 'N') AS Usedmaterial, " +
      "MA_Sequence.MA_Sequence_ID, " +
      "MA_Sequence.AD_Org_ID, " +
      "MA_Sequence.AD_Client_ID, " +
      "COALESCE(MA_Sequence.Calculated, 'N') AS Calculated, " +
      "MA_Sequence.MA_Processplan_Version_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM MA_Sequence left join (select MA_Process_ID, Name from MA_Process) table1 on (MA_Sequence.MA_Process_ID = table1.MA_Process_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((maProcessplanVersionId==null || maProcessplanVersionId.equals(""))?"":"  AND MA_Sequence.MA_Processplan_Version_ID = ?  ");
    strSql = strSql + 
      "        AND MA_Sequence.MA_Sequence_ID = ? " +
      "        AND MA_Sequence.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND MA_Sequence.AD_Org_ID IN (";
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
      if (maProcessplanVersionId != null && !(maProcessplanVersionId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanVersionId);
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
        OperationData objectOperationData = new OperationData();
        objectOperationData.created = UtilSql.getValue(result, "CREATED");
        objectOperationData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectOperationData.updated = UtilSql.getValue(result, "UPDATED");
        objectOperationData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectOperationData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectOperationData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectOperationData.seqno = UtilSql.getValue(result, "SEQNO");
        objectOperationData.value = UtilSql.getValue(result, "VALUE");
        objectOperationData.name = UtilSql.getValue(result, "NAME");
        objectOperationData.maProcessId = UtilSql.getValue(result, "MA_PROCESS_ID");
        objectOperationData.maProcessIdr = UtilSql.getValue(result, "MA_PROCESS_IDR");
        objectOperationData.estimatedtime = UtilSql.getValue(result, "ESTIMATEDTIME");
        objectOperationData.costcenteruse = UtilSql.getValue(result, "COSTCENTERUSE");
        objectOperationData.preptime = UtilSql.getValue(result, "PREPTIME");
        objectOperationData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectOperationData.multiplier = UtilSql.getValue(result, "MULTIPLIER");
        objectOperationData.noqty = UtilSql.getValue(result, "NOQTY");
        objectOperationData.groupuse = UtilSql.getValue(result, "GROUPUSE");
        objectOperationData.outsourced = UtilSql.getValue(result, "OUTSOURCED");
        objectOperationData.outsourcingcost = UtilSql.getValue(result, "OUTSOURCINGCOST");
        objectOperationData.isdefault = UtilSql.getValue(result, "ISDEFAULT");
        objectOperationData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectOperationData.costcentercost = UtilSql.getValue(result, "COSTCENTERCOST");
        objectOperationData.usedmaterial = UtilSql.getValue(result, "USEDMATERIAL");
        objectOperationData.maSequenceId = UtilSql.getValue(result, "MA_SEQUENCE_ID");
        objectOperationData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectOperationData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectOperationData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectOperationData.maProcessplanVersionId = UtilSql.getValue(result, "MA_PROCESSPLAN_VERSION_ID");
        objectOperationData.language = UtilSql.getValue(result, "LANGUAGE");
        objectOperationData.adUserClient = "";
        objectOperationData.adOrgClient = "";
        objectOperationData.createdby = "";
        objectOperationData.trBgcolor = "";
        objectOperationData.totalCount = "";
        objectOperationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOperationData);
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
    OperationData objectOperationData[] = new OperationData[vector.size()];
    vector.copyInto(objectOperationData);
    return(objectOperationData);
  }

/**
Create a registry
 */
  public static OperationData[] set(String maProcessplanVersionId, String usedmaterial, String maSequenceId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String maProcessId, String value, String name, String description, String costcenteruse, String preptime, String multiplier, String seqno, String noqty, String groupuse, String calculated, String outsourced, String outsourcingcost, String costcentercost, String isdefault, String estimatedtime)    throws ServletException {
    OperationData objectOperationData[] = new OperationData[1];
    objectOperationData[0] = new OperationData();
    objectOperationData[0].created = "";
    objectOperationData[0].createdbyr = createdbyr;
    objectOperationData[0].updated = "";
    objectOperationData[0].updatedTimeStamp = "";
    objectOperationData[0].updatedby = updatedby;
    objectOperationData[0].updatedbyr = updatedbyr;
    objectOperationData[0].seqno = seqno;
    objectOperationData[0].value = value;
    objectOperationData[0].name = name;
    objectOperationData[0].maProcessId = maProcessId;
    objectOperationData[0].maProcessIdr = "";
    objectOperationData[0].estimatedtime = estimatedtime;
    objectOperationData[0].costcenteruse = costcenteruse;
    objectOperationData[0].preptime = preptime;
    objectOperationData[0].description = description;
    objectOperationData[0].multiplier = multiplier;
    objectOperationData[0].noqty = noqty;
    objectOperationData[0].groupuse = groupuse;
    objectOperationData[0].outsourced = outsourced;
    objectOperationData[0].outsourcingcost = outsourcingcost;
    objectOperationData[0].isdefault = isdefault;
    objectOperationData[0].isactive = isactive;
    objectOperationData[0].costcentercost = costcentercost;
    objectOperationData[0].usedmaterial = usedmaterial;
    objectOperationData[0].maSequenceId = maSequenceId;
    objectOperationData[0].adOrgId = adOrgId;
    objectOperationData[0].adClientId = adClientId;
    objectOperationData[0].calculated = calculated;
    objectOperationData[0].maProcessplanVersionId = maProcessplanVersionId;
    objectOperationData[0].language = "";
    return objectOperationData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef801524_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef801526_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef801758(ConnectionProvider connectionProvider, String MA_PROCESSPLAN_VERSION_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(SEQNO),0)+10 AS DefaultValue FROM MA_SEQUENCE WHERE MA_PROCESSPLAN_VERSION_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, MA_PROCESSPLAN_VERSION_ID);

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

/**
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MA_Sequence.MA_Processplan_Version_ID AS NAME" +
      "        FROM MA_Sequence" +
      "        WHERE MA_Sequence.MA_Sequence_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String maProcessplanVersionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))) AS NAME FROM MA_ProcessPlan_Version left join (select MA_Processplan_Version_ID, MA_Processplan_ID, DocumentNo from MA_Processplan_Version) table1 on (MA_ProcessPlan_Version.MA_Processplan_Version_ID = table1.MA_Processplan_Version_ID) left join (select MA_Processplan_ID, Name from MA_Processplan) table2 on (table1.MA_Processplan_ID = table2.MA_Processplan_ID) WHERE MA_ProcessPlan_Version.MA_Processplan_Version_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanVersionId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String maProcessplanVersionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))) AS NAME FROM MA_ProcessPlan_Version left join (select MA_Processplan_Version_ID, MA_Processplan_ID, DocumentNo from MA_Processplan_Version) table1 on (MA_ProcessPlan_Version.MA_Processplan_Version_ID = table1.MA_Processplan_Version_ID) left join (select MA_Processplan_ID, Name from MA_Processplan) table2 on (table1.MA_Processplan_ID = table2.MA_Processplan_ID) WHERE MA_ProcessPlan_Version.MA_Processplan_Version_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanVersionId);

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
      "        UPDATE MA_Sequence" +
      "        SET SeqNo = TO_NUMBER(?) , Value = (?) , Name = (?) , MA_Process_ID = (?) , Estimatedtime = TO_NUMBER(?) , CostCenterUse = TO_NUMBER(?) , Preptime = TO_NUMBER(?) , Description = (?) , Multiplier = TO_NUMBER(?) , Noqty = (?) , Groupuse = (?) , Outsourced = (?) , Outsourcingcost = TO_NUMBER(?) , Isdefault = (?) , IsActive = (?) , Costcentercost = TO_NUMBER(?) , Usedmaterial = (?) , MA_Sequence_ID = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , Calculated = (?) , MA_Processplan_Version_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE MA_Sequence.MA_Sequence_ID = ? " +
      "                 AND MA_Sequence.MA_Processplan_Version_ID = ? " +
      "        AND MA_Sequence.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MA_Sequence.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, estimatedtime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costcenteruse);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, preptime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, multiplier);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, noqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, groupuse);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, outsourced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, outsourcingcost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefault);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costcentercost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, usedmaterial);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maSequenceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanVersionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maSequenceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanVersionId);
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
      "        INSERT INTO MA_Sequence " +
      "        (SeqNo, Value, Name, MA_Process_ID, Estimatedtime, CostCenterUse, Preptime, Description, Multiplier, Noqty, Groupuse, Outsourced, Outsourcingcost, Isdefault, IsActive, Costcentercost, Usedmaterial, MA_Sequence_ID, AD_Org_ID, AD_Client_ID, Calculated, MA_Processplan_Version_ID, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, estimatedtime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costcenteruse);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, preptime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, multiplier);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, noqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, groupuse);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, outsourced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, outsourcingcost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefault);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costcentercost);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, usedmaterial);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maSequenceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanVersionId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String maProcessplanVersionId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM MA_Sequence" +
      "        WHERE MA_Sequence.MA_Sequence_ID = ? " +
      "                 AND MA_Sequence.MA_Processplan_Version_ID = ? " +
      "        AND MA_Sequence.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MA_Sequence.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanVersionId);
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
      "          FROM MA_Sequence" +
      "         WHERE MA_Sequence.MA_Sequence_ID = ? ";

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
      "          FROM MA_Sequence" +
      "         WHERE MA_Sequence.MA_Sequence_ID = ? ";

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
