//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Commission;

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
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String frequencytype;
  public String frequencytyper;
  public String mProductId;
  public String mProductIdr;
  public String docbasistype;
  public String docbasistyper;
  public String description;
  public String createfrom;
  public String processing;
  public String datelastrun;
  public String basisstatus;
  public String basisstatusr;
  public String basisamt;
  public String basisamtr;
  public String isactive;
  public String listdetails;
  public String iscascade;
  public String cCommissionId;
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
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_IDR") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("FREQUENCYTYPE"))
      return frequencytype;
    else if (fieldName.equalsIgnoreCase("FREQUENCYTYPER"))
      return frequencytyper;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_IDR") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("DOCBASISTYPE"))
      return docbasistype;
    else if (fieldName.equalsIgnoreCase("DOCBASISTYPER"))
      return docbasistyper;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("CREATEFROM"))
      return createfrom;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("DATELASTRUN"))
      return datelastrun;
    else if (fieldName.equalsIgnoreCase("BASISSTATUS"))
      return basisstatus;
    else if (fieldName.equalsIgnoreCase("BASISSTATUSR"))
      return basisstatusr;
    else if (fieldName.equalsIgnoreCase("BASISAMT"))
      return basisamt;
    else if (fieldName.equalsIgnoreCase("BASISAMTR"))
      return basisamtr;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("LISTDETAILS"))
      return listdetails;
    else if (fieldName.equalsIgnoreCase("ISCASCADE"))
      return iscascade;
    else if (fieldName.equalsIgnoreCase("C_COMMISSION_ID") || fieldName.equals("cCommissionId"))
      return cCommissionId;
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
      "        SELECT to_char(C_Commission.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Commission.CreatedBy) as CreatedByR, " +
      "        to_char(C_Commission.Updated, ?) as updated, " +
      "        to_char(C_Commission.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Commission.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Commission.UpdatedBy) as UpdatedByR," +
      "        C_Commission.AD_Org_ID, " +
      "(CASE WHEN C_Commission.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_Commission.Name, " +
      "C_Commission.C_BPartner_ID, " +
      "(CASE WHEN C_Commission.C_BPartner_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_Commission.C_Currency_ID, " +
      "(CASE WHEN C_Commission.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "C_Commission.FrequencyType, " +
      "(CASE WHEN C_Commission.FrequencyType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS FrequencyTypeR, " +
      "C_Commission.M_Product_ID, " +
      "(CASE WHEN C_Commission.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "C_Commission.DocBasisType, " +
      "(CASE WHEN C_Commission.DocBasisType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS DocBasisTypeR, " +
      "C_Commission.Description, " +
      "C_Commission.CreateFrom, " +
      "C_Commission.Processing, " +
      "C_Commission.DateLastRun, " +
      "C_Commission.Basisstatus, " +
      "(CASE WHEN C_Commission.Basisstatus IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS BasisstatusR, " +
      "C_Commission.Basisamt, " +
      "(CASE WHEN C_Commission.Basisamt IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list4.name),'') ) END) AS BasisamtR, " +
      "COALESCE(C_Commission.IsActive, 'N') AS IsActive, " +
      "COALESCE(C_Commission.ListDetails, 'N') AS ListDetails, " +
      "COALESCE(C_Commission.iscascade, 'N') AS iscascade, " +
      "C_Commission.C_Commission_ID, " +
      "C_Commission.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Commission left join (select AD_Org_ID, Value from AD_Org) table1 on (C_Commission.AD_Org_ID = table1.AD_Org_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_Commission.C_BPartner_ID =  table2.C_BPartner_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table3 on (C_Commission.C_Currency_ID = table3.C_Currency_ID) left join ad_ref_list_v list1 on (C_Commission.FrequencyType = list1.value and list1.ad_reference_id = '225' and list1.ad_language = ?)  left join (select M_Product_ID, Name from M_Product) table4 on (C_Commission.M_Product_ID = table4.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  left join ad_ref_list_v list2 on (C_Commission.DocBasisType = list2.value and list2.ad_reference_id = '224' and list2.ad_language = ?)  left join ad_ref_list_v list3 on (C_Commission.Basisstatus = list3.value and list3.ad_reference_id = '9750460836504FF9ADD6A60DD871EA00' and list3.ad_language = ?)  left join ad_ref_list_v list4 on (C_Commission.Basisamt = list4.value and list4.ad_reference_id = '772B5918358B443A83F82F81A9A4BFB6' and list4.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND C_Commission.C_Commission_ID = ? " +
      "        AND C_Commission.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_Commission.AD_Org_ID IN (";
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
        objectHeaderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectHeaderData.cBpartnerIdr = UtilSql.getValue(result, "C_BPARTNER_IDR");
        objectHeaderData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectHeaderData.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectHeaderData.frequencytype = UtilSql.getValue(result, "FREQUENCYTYPE");
        objectHeaderData.frequencytyper = UtilSql.getValue(result, "FREQUENCYTYPER");
        objectHeaderData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectHeaderData.mProductIdr = UtilSql.getValue(result, "M_PRODUCT_IDR");
        objectHeaderData.docbasistype = UtilSql.getValue(result, "DOCBASISTYPE");
        objectHeaderData.docbasistyper = UtilSql.getValue(result, "DOCBASISTYPER");
        objectHeaderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectHeaderData.createfrom = UtilSql.getValue(result, "CREATEFROM");
        objectHeaderData.processing = UtilSql.getValue(result, "PROCESSING");
        objectHeaderData.datelastrun = UtilSql.getDateValue(result, "DATELASTRUN", "dd-MM-yyyy");
        objectHeaderData.basisstatus = UtilSql.getValue(result, "BASISSTATUS");
        objectHeaderData.basisstatusr = UtilSql.getValue(result, "BASISSTATUSR");
        objectHeaderData.basisamt = UtilSql.getValue(result, "BASISAMT");
        objectHeaderData.basisamtr = UtilSql.getValue(result, "BASISAMTR");
        objectHeaderData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectHeaderData.listdetails = UtilSql.getValue(result, "LISTDETAILS");
        objectHeaderData.iscascade = UtilSql.getValue(result, "ISCASCADE");
        objectHeaderData.cCommissionId = UtilSql.getValue(result, "C_COMMISSION_ID");
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
  public static HeaderData[] set(String basisstatus, String basisamt, String cCommissionId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String name, String description, String cBpartnerId, String cCurrencyId, String frequencytype, String docbasistype, String datelastrun, String createfrom, String processing, String listdetails, String mProductId, String mProductIdr, String iscascade)    throws ServletException {
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
    objectHeaderData[0].cBpartnerId = cBpartnerId;
    objectHeaderData[0].cBpartnerIdr = "";
    objectHeaderData[0].cCurrencyId = cCurrencyId;
    objectHeaderData[0].cCurrencyIdr = "";
    objectHeaderData[0].frequencytype = frequencytype;
    objectHeaderData[0].frequencytyper = "";
    objectHeaderData[0].mProductId = mProductId;
    objectHeaderData[0].mProductIdr = mProductIdr;
    objectHeaderData[0].docbasistype = docbasistype;
    objectHeaderData[0].docbasistyper = "";
    objectHeaderData[0].description = description;
    objectHeaderData[0].createfrom = createfrom;
    objectHeaderData[0].processing = processing;
    objectHeaderData[0].datelastrun = datelastrun;
    objectHeaderData[0].basisstatus = basisstatus;
    objectHeaderData[0].basisstatusr = "";
    objectHeaderData[0].basisamt = basisamt;
    objectHeaderData[0].basisamtr = "";
    objectHeaderData[0].isactive = isactive;
    objectHeaderData[0].listdetails = listdetails;
    objectHeaderData[0].iscascade = iscascade;
    objectHeaderData[0].cCommissionId = cCommissionId;
    objectHeaderData[0].adClientId = adClientId;
    objectHeaderData[0].language = "";
    return objectHeaderData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef5672_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef5674_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef802829_2(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))), '') ) as M_Product_ID FROM M_Product left join (select M_Product_ID, Name from M_Product) table2 on (M_Product.M_Product_ID = table2.M_Product_ID)left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  WHERE M_Product.isActive='Y' AND M_Product.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_PRODUCT_ID");
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
      "        UPDATE C_Commission" +
      "        SET AD_Org_ID = (?) , Name = (?) , C_BPartner_ID = (?) , C_Currency_ID = (?) , FrequencyType = (?) , M_Product_ID = (?) , DocBasisType = (?) , Description = (?) , CreateFrom = (?) , Processing = (?) , DateLastRun = TO_DATE(?) , Basisstatus = (?) , Basisamt = (?) , IsActive = (?) , ListDetails = (?) , iscascade = (?) , C_Commission_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_Commission.C_Commission_ID = ? " +
      "        AND C_Commission.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Commission.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, frequencytype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docbasistype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datelastrun);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basisstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basisamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, listdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscascade);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
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
      "        INSERT INTO C_Commission " +
      "        (AD_Org_ID, Name, C_BPartner_ID, C_Currency_ID, FrequencyType, M_Product_ID, DocBasisType, Description, CreateFrom, Processing, DateLastRun, Basisstatus, Basisamt, IsActive, ListDetails, iscascade, C_Commission_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, frequencytype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docbasistype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datelastrun);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basisstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basisamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, listdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscascade);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
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
      "        DELETE FROM C_Commission" +
      "        WHERE C_Commission.C_Commission_ID = ? " +
      "        AND C_Commission.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Commission.AD_Org_ID IN (";
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
      "          FROM C_Commission" +
      "         WHERE C_Commission.C_Commission_ID = ? ";

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
      "          FROM C_Commission" +
      "         WHERE C_Commission.C_Commission_ID = ? ";

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
