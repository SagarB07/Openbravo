//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.com.gai.othergoodsshipment.OtherGoodsShipment;

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
class Header7AA42294DB5A46428413F08AE357AFABData implements FieldProvider {
static Logger log4j = Logger.getLogger(Header7AA42294DB5A46428413F08AE357AFABData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String movementdate;
  public String name;
  public String mWarehouseId;
  public String mWarehouseIdr;
  public String description;
  public String generatelist;
  public String updateqty;
  public String processing;
  public String posted;
  public String postedBtn;
  public String cProjectId;
  public String cProjectIdr;
  public String cCostcenterId;
  public String aAssetId;
  public String cActivityId;
  public String user1Id;
  public String cCampaignId;
  public String user2Id;
  public String adOrgtrxId;
  public String emCgosProcess;
  public String emGinDoctype;
  public String emGinDoctyper;
  public String processed;
  public String isactive;
  public String adClientId;
  public String mInventoryId;
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
    else if (fieldName.equalsIgnoreCase("MOVEMENTDATE"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_IDR") || fieldName.equals("mWarehouseIdr"))
      return mWarehouseIdr;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("GENERATELIST"))
      return generatelist;
    else if (fieldName.equalsIgnoreCase("UPDATEQTY"))
      return updateqty;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("POSTED_BTN") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_IDR") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("A_ASSET_ID") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("EM_CGOS_PROCESS") || fieldName.equals("emCgosProcess"))
      return emCgosProcess;
    else if (fieldName.equalsIgnoreCase("EM_GIN_DOCTYPE") || fieldName.equals("emGinDoctype"))
      return emGinDoctype;
    else if (fieldName.equalsIgnoreCase("EM_GIN_DOCTYPER") || fieldName.equals("emGinDoctyper"))
      return emGinDoctyper;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("M_INVENTORY_ID") || fieldName.equals("mInventoryId"))
      return mInventoryId;
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
  public static Header7AA42294DB5A46428413F08AE357AFABData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Header7AA42294DB5A46428413F08AE357AFABData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Inventory.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Inventory.CreatedBy) as CreatedByR, " +
      "        to_char(M_Inventory.Updated, ?) as updated, " +
      "        to_char(M_Inventory.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Inventory.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Inventory.UpdatedBy) as UpdatedByR," +
      "        M_Inventory.AD_Org_ID, " +
      "(CASE WHEN M_Inventory.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_Inventory.MovementDate, " +
      "M_Inventory.Name, " +
      "M_Inventory.M_Warehouse_ID, " +
      "(CASE WHEN M_Inventory.M_Warehouse_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS M_Warehouse_IDR, " +
      "M_Inventory.Description, " +
      "M_Inventory.GenerateList, " +
      "M_Inventory.UpdateQty, " +
      "M_Inventory.Processing, " +
      "M_Inventory.Posted, " +
      "list1.name as Posted_BTN, " +
      "M_Inventory.C_Project_ID, " +
      "(CASE WHEN M_Inventory.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "M_Inventory.C_Costcenter_ID, " +
      "M_Inventory.A_Asset_ID, " +
      "M_Inventory.C_Activity_ID, " +
      "M_Inventory.User1_ID, " +
      "M_Inventory.C_Campaign_ID, " +
      "M_Inventory.User2_ID, " +
      "M_Inventory.AD_OrgTrx_ID, " +
      "M_Inventory.EM_Cgos_Process, " +
      "M_Inventory.EM_Gin_Doctype, " +
      "(CASE WHEN M_Inventory.EM_Gin_Doctype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS EM_Gin_DoctypeR, " +
      "COALESCE(M_Inventory.Processed, 'N') AS Processed, " +
      "COALESCE(M_Inventory.IsActive, 'N') AS IsActive, " +
      "M_Inventory.AD_Client_ID, " +
      "M_Inventory.M_Inventory_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM M_Inventory left join (select AD_Org_ID, Value from AD_Org) table1 on (M_Inventory.AD_Org_ID = table1.AD_Org_ID) left join (select M_Warehouse_ID, Name from M_Warehouse) table2 on (M_Inventory.M_Warehouse_ID =  table2.M_Warehouse_ID) left join ad_ref_list_v list1 on (list1.ad_reference_id = '234' and list1.ad_language = ?  AND M_Inventory.Posted = TO_CHAR(list1.value)) left join (select C_Project_ID, Value, Name from C_Project) table3 on (M_Inventory.C_Project_ID = table3.C_Project_ID) left join ad_ref_list_v list2 on (M_Inventory.EM_Gin_Doctype = list2.value and list2.ad_reference_id = '4207FBD787D44DAEB589BCF4DDD71E0F' and list2.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND M_Inventory.M_Inventory_ID = ? " +
      "        AND M_Inventory.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_Inventory.AD_Org_ID IN (";
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
        Header7AA42294DB5A46428413F08AE357AFABData objectHeader7AA42294DB5A46428413F08AE357AFABData = new Header7AA42294DB5A46428413F08AE357AFABData();
        objectHeader7AA42294DB5A46428413F08AE357AFABData.created = UtilSql.getValue(result, "CREATED");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.updated = UtilSql.getValue(result, "UPDATED");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.name = UtilSql.getValue(result, "NAME");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.mWarehouseIdr = UtilSql.getValue(result, "M_WAREHOUSE_IDR");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.generatelist = UtilSql.getValue(result, "GENERATELIST");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.updateqty = UtilSql.getValue(result, "UPDATEQTY");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.processing = UtilSql.getValue(result, "PROCESSING");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.posted = UtilSql.getValue(result, "POSTED");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.postedBtn = UtilSql.getValue(result, "POSTED_BTN");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.cProjectIdr = UtilSql.getValue(result, "C_PROJECT_IDR");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.emCgosProcess = UtilSql.getValue(result, "EM_CGOS_PROCESS");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.emGinDoctype = UtilSql.getValue(result, "EM_GIN_DOCTYPE");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.emGinDoctyper = UtilSql.getValue(result, "EM_GIN_DOCTYPER");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.processed = UtilSql.getValue(result, "PROCESSED");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.mInventoryId = UtilSql.getValue(result, "M_INVENTORY_ID");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.language = UtilSql.getValue(result, "LANGUAGE");
        objectHeader7AA42294DB5A46428413F08AE357AFABData.adUserClient = "";
        objectHeader7AA42294DB5A46428413F08AE357AFABData.adOrgClient = "";
        objectHeader7AA42294DB5A46428413F08AE357AFABData.createdby = "";
        objectHeader7AA42294DB5A46428413F08AE357AFABData.trBgcolor = "";
        objectHeader7AA42294DB5A46428413F08AE357AFABData.totalCount = "";
        objectHeader7AA42294DB5A46428413F08AE357AFABData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectHeader7AA42294DB5A46428413F08AE357AFABData);
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
    Header7AA42294DB5A46428413F08AE357AFABData objectHeader7AA42294DB5A46428413F08AE357AFABData[] = new Header7AA42294DB5A46428413F08AE357AFABData[vector.size()];
    vector.copyInto(objectHeader7AA42294DB5A46428413F08AE357AFABData);
    return(objectHeader7AA42294DB5A46428413F08AE357AFABData);
  }

/**
Create a registry
 */
  public static Header7AA42294DB5A46428413F08AE357AFABData[] set(String mInventoryId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String name, String description, String movementdate, String processed, String processing, String mWarehouseId, String updateqty, String generatelist, String emGinDoctype, String posted, String postedBtn, String user2Id, String user1Id, String cActivityId, String cCampaignId, String adOrgtrxId, String cProjectId, String cProjectIdr, String emCgosProcess, String aAssetId, String cCostcenterId)    throws ServletException {
    Header7AA42294DB5A46428413F08AE357AFABData objectHeader7AA42294DB5A46428413F08AE357AFABData[] = new Header7AA42294DB5A46428413F08AE357AFABData[1];
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0] = new Header7AA42294DB5A46428413F08AE357AFABData();
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].created = "";
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].createdbyr = createdbyr;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].updated = "";
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].updatedTimeStamp = "";
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].updatedby = updatedby;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].updatedbyr = updatedbyr;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].adOrgId = adOrgId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].adOrgIdr = "";
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].movementdate = movementdate;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].name = name;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].mWarehouseId = mWarehouseId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].mWarehouseIdr = "";
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].description = description;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].generatelist = generatelist;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].updateqty = updateqty;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].processing = processing;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].posted = posted;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].postedBtn = postedBtn;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].cProjectId = cProjectId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].cProjectIdr = cProjectIdr;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].cCostcenterId = cCostcenterId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].aAssetId = aAssetId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].cActivityId = cActivityId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].user1Id = user1Id;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].cCampaignId = cCampaignId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].user2Id = user2Id;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].adOrgtrxId = adOrgtrxId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].emCgosProcess = emCgosProcess;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].emGinDoctype = emGinDoctype;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].emGinDoctyper = "";
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].processed = processed;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].isactive = isactive;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].adClientId = adClientId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].mInventoryId = mInventoryId;
    objectHeader7AA42294DB5A46428413F08AE357AFABData[0].language = "";
    return objectHeader7AA42294DB5A46428413F08AE357AFABData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef3547_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef3549_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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

/**
Select for auxiliar field
 */
  public static String selectDef9592_2(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_Project_ID FROM C_Project left join (select C_Project_ID, Value, Name from C_Project) table2 on (C_Project.C_Project_ID = table2.C_Project_ID) WHERE C_Project.isActive='Y' AND C_Project.C_Project_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Project_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_PROJECT_ID");
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
Select for action search
 */
  public static String selectActDefM_Locator_ID(ConnectionProvider connectionProvider, String M_Locator_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT Value FROM M_Locator WHERE isActive='Y' AND M_Locator_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Locator_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "VALUE");
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
      "        UPDATE M_Inventory" +
      "        SET AD_Org_ID = (?) , MovementDate = TO_DATE(?) , Name = (?) , M_Warehouse_ID = (?) , Description = (?) , GenerateList = (?) , UpdateQty = (?) , Processing = (?) , Posted = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , A_Asset_ID = (?) , C_Activity_ID = (?) , User1_ID = (?) , C_Campaign_ID = (?) , User2_ID = (?) , AD_OrgTrx_ID = (?) , EM_Cgos_Process = (?) , EM_Gin_Doctype = (?) , Processed = (?) , IsActive = (?) , AD_Client_ID = (?) , M_Inventory_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_Inventory.M_Inventory_ID = ? " +
      "        AND M_Inventory.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Inventory.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updateqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emCgosProcess);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGinDoctype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInventoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInventoryId);
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
      "        INSERT INTO M_Inventory " +
      "        (AD_Org_ID, MovementDate, Name, M_Warehouse_ID, Description, GenerateList, UpdateQty, Processing, Posted, C_Project_ID, C_Costcenter_ID, A_Asset_ID, C_Activity_ID, User1_ID, C_Campaign_ID, User2_ID, AD_OrgTrx_ID, EM_Cgos_Process, EM_Gin_Doctype, Processed, IsActive, AD_Client_ID, M_Inventory_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updateqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emCgosProcess);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGinDoctype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInventoryId);
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
      "        DELETE FROM M_Inventory" +
      "        WHERE M_Inventory.M_Inventory_ID = ? " +
      "        AND M_Inventory.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Inventory.AD_Org_ID IN (";
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
      "          FROM M_Inventory" +
      "         WHERE M_Inventory.M_Inventory_ID = ? ";

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
      "          FROM M_Inventory" +
      "         WHERE M_Inventory.M_Inventory_ID = ? ";

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
