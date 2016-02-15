//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.MatchedInvoices;

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
class MatchedInvoiceData implements FieldProvider {
static Logger log4j = Logger.getLogger(MatchedInvoiceData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String cInvoicelineId;
  public String cInvoicelineIdr;
  public String mInoutlineId;
  public String mInoutlineIdr;
  public String mProductId;
  public String mProductIdr;
  public String qty;
  public String datetrx;
  public String processed;
  public String posted;
  public String postedBtn;
  public String adClientId;
  public String mMatchinvId;
  public String processing;
  public String isactive;
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
    else if (fieldName.equalsIgnoreCase("C_INVOICELINE_ID") || fieldName.equals("cInvoicelineId"))
      return cInvoicelineId;
    else if (fieldName.equalsIgnoreCase("C_INVOICELINE_IDR") || fieldName.equals("cInvoicelineIdr"))
      return cInvoicelineIdr;
    else if (fieldName.equalsIgnoreCase("M_INOUTLINE_ID") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("M_INOUTLINE_IDR") || fieldName.equals("mInoutlineIdr"))
      return mInoutlineIdr;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_IDR") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("QTY"))
      return qty;
    else if (fieldName.equalsIgnoreCase("DATETRX"))
      return datetrx;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("POSTED_BTN") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("M_MATCHINV_ID") || fieldName.equals("mMatchinvId"))
      return mMatchinvId;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
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
  public static MatchedInvoiceData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static MatchedInvoiceData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_MatchInv.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_MatchInv.CreatedBy) as CreatedByR, " +
      "        to_char(M_MatchInv.Updated, ?) as updated, " +
      "        to_char(M_MatchInv.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_MatchInv.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_MatchInv.UpdatedBy) as UpdatedByR," +
      "        M_MatchInv.AD_Org_ID, " +
      "(CASE WHEN M_MatchInv.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_MatchInv.C_InvoiceLine_ID, " +
      "(CASE WHEN M_MatchInv.C_InvoiceLine_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.DateInvoiced, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.GrandTotal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.LineNetAmt), ''))),'') ) END) AS C_InvoiceLine_IDR, " +
      "M_MatchInv.M_InOutLine_ID, " +
      "(CASE WHEN M_MatchInv.M_InOutLine_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.MovementQty), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table5.MovementDate, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS M_InOutLine_IDR, " +
      "M_MatchInv.M_Product_ID, " +
      "(CASE WHEN M_MatchInv.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL8.Name IS NULL THEN TO_CHAR(table8.Name) ELSE TO_CHAR(tableTRL8.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "M_MatchInv.Qty, " +
      "M_MatchInv.DateTrx, " +
      "COALESCE(M_MatchInv.Processed, 'N') AS Processed, " +
      "M_MatchInv.Posted, " +
      "list1.name as Posted_BTN, " +
      "M_MatchInv.AD_Client_ID, " +
      "M_MatchInv.M_MatchInv_ID, " +
      "COALESCE(M_MatchInv.Processing, 'N') AS Processing, " +
      "COALESCE(M_MatchInv.IsActive, 'N') AS IsActive, " +
      "        ? AS LANGUAGE " +
      "        FROM M_MatchInv left join (select AD_Org_ID, Value from AD_Org) table1 on (M_MatchInv.AD_Org_ID = table1.AD_Org_ID) left join (select C_InvoiceLine_ID, C_Invoice_ID, Line, LineNetAmt from C_InvoiceLine) table2 on (M_MatchInv.C_InvoiceLine_ID = table2.C_InvoiceLine_ID) left join (select C_Invoice_ID, DocumentNo, DateInvoiced, GrandTotal from C_Invoice) table3 on (table2.C_Invoice_ID = table3.C_Invoice_ID) left join (select M_InOutLine_ID, Line, MovementQty, M_InOut_ID, M_Product_ID from M_InOutLine) table4 on (M_MatchInv.M_InOutLine_ID = table4.M_InOutLine_ID) left join (select M_InOut_ID, DocumentNo, MovementDate from M_InOut) table5 on (table4.M_InOut_ID = table5.M_InOut_ID) left join (select M_Product_ID, Name from M_Product) table6 on (table4.M_Product_ID = table6.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL6 on (table6.M_Product_ID = tableTRL6.M_Product_ID and tableTRL6.AD_Language = ?)  left join (select M_Product_ID, Name from M_Product) table8 on (M_MatchInv.M_Product_ID = table8.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL8 on (table8.M_Product_ID = tableTRL8.M_Product_ID and tableTRL8.AD_Language = ?)  left join ad_ref_list_v list1 on (list1.ad_reference_id = '234' and list1.ad_language = ?  AND M_MatchInv.Posted = TO_CHAR(list1.value))" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND M_MatchInv.M_MatchInv_ID = ? " +
      "        AND M_MatchInv.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_MatchInv.AD_Org_ID IN (";
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
        MatchedInvoiceData objectMatchedInvoiceData = new MatchedInvoiceData();
        objectMatchedInvoiceData.created = UtilSql.getValue(result, "CREATED");
        objectMatchedInvoiceData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectMatchedInvoiceData.updated = UtilSql.getValue(result, "UPDATED");
        objectMatchedInvoiceData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectMatchedInvoiceData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectMatchedInvoiceData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectMatchedInvoiceData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectMatchedInvoiceData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectMatchedInvoiceData.cInvoicelineId = UtilSql.getValue(result, "C_INVOICELINE_ID");
        objectMatchedInvoiceData.cInvoicelineIdr = UtilSql.getValue(result, "C_INVOICELINE_IDR");
        objectMatchedInvoiceData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectMatchedInvoiceData.mInoutlineIdr = UtilSql.getValue(result, "M_INOUTLINE_IDR");
        objectMatchedInvoiceData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectMatchedInvoiceData.mProductIdr = UtilSql.getValue(result, "M_PRODUCT_IDR");
        objectMatchedInvoiceData.qty = UtilSql.getValue(result, "QTY");
        objectMatchedInvoiceData.datetrx = UtilSql.getDateValue(result, "DATETRX", "dd-MM-yyyy");
        objectMatchedInvoiceData.processed = UtilSql.getValue(result, "PROCESSED");
        objectMatchedInvoiceData.posted = UtilSql.getValue(result, "POSTED");
        objectMatchedInvoiceData.postedBtn = UtilSql.getValue(result, "POSTED_BTN");
        objectMatchedInvoiceData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectMatchedInvoiceData.mMatchinvId = UtilSql.getValue(result, "M_MATCHINV_ID");
        objectMatchedInvoiceData.processing = UtilSql.getValue(result, "PROCESSING");
        objectMatchedInvoiceData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectMatchedInvoiceData.language = UtilSql.getValue(result, "LANGUAGE");
        objectMatchedInvoiceData.adUserClient = "";
        objectMatchedInvoiceData.adOrgClient = "";
        objectMatchedInvoiceData.createdby = "";
        objectMatchedInvoiceData.trBgcolor = "";
        objectMatchedInvoiceData.totalCount = "";
        objectMatchedInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMatchedInvoiceData);
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
    MatchedInvoiceData objectMatchedInvoiceData[] = new MatchedInvoiceData[vector.size()];
    vector.copyInto(objectMatchedInvoiceData);
    return(objectMatchedInvoiceData);
  }

/**
Create a registry
 */
  public static MatchedInvoiceData[] set(String mMatchinvId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String mInoutlineId, String mInoutlineIdr, String cInvoicelineId, String cInvoicelineIdr, String mProductId, String mProductIdr, String datetrx, String processing, String processed, String posted, String postedBtn, String qty)    throws ServletException {
    MatchedInvoiceData objectMatchedInvoiceData[] = new MatchedInvoiceData[1];
    objectMatchedInvoiceData[0] = new MatchedInvoiceData();
    objectMatchedInvoiceData[0].created = "";
    objectMatchedInvoiceData[0].createdbyr = createdbyr;
    objectMatchedInvoiceData[0].updated = "";
    objectMatchedInvoiceData[0].updatedTimeStamp = "";
    objectMatchedInvoiceData[0].updatedby = updatedby;
    objectMatchedInvoiceData[0].updatedbyr = updatedbyr;
    objectMatchedInvoiceData[0].adOrgId = adOrgId;
    objectMatchedInvoiceData[0].adOrgIdr = "";
    objectMatchedInvoiceData[0].cInvoicelineId = cInvoicelineId;
    objectMatchedInvoiceData[0].cInvoicelineIdr = cInvoicelineIdr;
    objectMatchedInvoiceData[0].mInoutlineId = mInoutlineId;
    objectMatchedInvoiceData[0].mInoutlineIdr = mInoutlineIdr;
    objectMatchedInvoiceData[0].mProductId = mProductId;
    objectMatchedInvoiceData[0].mProductIdr = mProductIdr;
    objectMatchedInvoiceData[0].qty = qty;
    objectMatchedInvoiceData[0].datetrx = datetrx;
    objectMatchedInvoiceData[0].processed = processed;
    objectMatchedInvoiceData[0].posted = posted;
    objectMatchedInvoiceData[0].postedBtn = postedBtn;
    objectMatchedInvoiceData[0].adClientId = adClientId;
    objectMatchedInvoiceData[0].mMatchinvId = mMatchinvId;
    objectMatchedInvoiceData[0].processing = processing;
    objectMatchedInvoiceData[0].isactive = isactive;
    objectMatchedInvoiceData[0].language = "";
    return objectMatchedInvoiceData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef6502_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef6504_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef6505_2(ConnectionProvider connectionProvider, String paramLanguage, String M_InOutLine_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Line), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.MovementQty), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.MovementDate, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))), '') ) as M_InOutLine_ID FROM M_InOutLine left join (select M_InOutLine_ID, Line, MovementQty, M_InOut_ID, M_Product_ID from M_InOutLine) table2 on (M_InOutLine.M_InOutLine_ID = table2.M_InOutLine_ID)left join (select M_InOut_ID, DocumentNo, MovementDate from M_InOut) table3 on (table2.M_InOut_ID = table3.M_InOut_ID)left join (select M_Product_ID, Name from M_Product) table4 on (table2.M_Product_ID = table4.M_Product_ID)left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  WHERE M_InOutLine.isActive='Y' AND M_InOutLine.M_InOutLine_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_InOutLine_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_INOUTLINE_ID");
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
  public static String selectDef6506_3(ConnectionProvider connectionProvider, String C_InvoiceLine_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.DateInvoiced, 'DD-MM-YYYY')), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.GrandTotal), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Line), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.LineNetAmt), ''))), '') ) as C_InvoiceLine_ID FROM C_InvoiceLine left join (select C_InvoiceLine_ID, C_Invoice_ID, Line, LineNetAmt from C_InvoiceLine) table2 on (C_InvoiceLine.C_InvoiceLine_ID = table2.C_InvoiceLine_ID)left join (select C_Invoice_ID, DocumentNo, DateInvoiced, GrandTotal from C_Invoice) table3 on (table2.C_Invoice_ID = table3.C_Invoice_ID) WHERE C_InvoiceLine.isActive='Y' AND C_InvoiceLine.C_InvoiceLine_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_InvoiceLine_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_INVOICELINE_ID");
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
  public static String selectDef6507_4(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
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
      "        UPDATE M_MatchInv" +
      "        SET AD_Org_ID = (?) , C_InvoiceLine_ID = (?) , M_InOutLine_ID = (?) , M_Product_ID = (?) , Qty = TO_NUMBER(?) , DateTrx = TO_DATE(?) , Processed = (?) , Posted = (?) , AD_Client_ID = (?) , M_MatchInv_ID = (?) , Processing = (?) , IsActive = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_MatchInv.M_MatchInv_ID = ? " +
      "        AND M_MatchInv.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_MatchInv.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datetrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mMatchinvId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mMatchinvId);
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
      "        INSERT INTO M_MatchInv " +
      "        (AD_Org_ID, C_InvoiceLine_ID, M_InOutLine_ID, M_Product_ID, Qty, DateTrx, Processed, Posted, AD_Client_ID, M_MatchInv_ID, Processing, IsActive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_NUMBER(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datetrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mMatchinvId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
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
      "        DELETE FROM M_MatchInv" +
      "        WHERE M_MatchInv.M_MatchInv_ID = ? " +
      "        AND M_MatchInv.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_MatchInv.AD_Org_ID IN (";
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
      "          FROM M_MatchInv" +
      "         WHERE M_MatchInv.M_MatchInv_ID = ? ";

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
      "          FROM M_MatchInv" +
      "         WHERE M_MatchInv.M_MatchInv_ID = ? ";

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
