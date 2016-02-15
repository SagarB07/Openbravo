//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.ServiceProject;

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
class ProposalData implements FieldProvider {
static Logger log4j = Logger.getLogger(ProposalData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String datesend;
  public String adUserId;
  public String adUserIdr;
  public String issotrx;
  public String finPaymentmethodId;
  public String finPaymentmethodIdr;
  public String cPaymenttermId;
  public String cPaymenttermIdr;
  public String headernote;
  public String footnote;
  public String copyfrom;
  public String projectwon;
  public String paymentrule;
  public String cProjectId;
  public String cProjectproposalId;
  public String adClientId;
  public String isactive;
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
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_IDR") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_IDR") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("DATESEND"))
      return datesend;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("AD_USER_IDR") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_ID") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_IDR") || fieldName.equals("finPaymentmethodIdr"))
      return finPaymentmethodIdr;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_ID") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_IDR") || fieldName.equals("cPaymenttermIdr"))
      return cPaymenttermIdr;
    else if (fieldName.equalsIgnoreCase("HEADERNOTE"))
      return headernote;
    else if (fieldName.equalsIgnoreCase("FOOTNOTE"))
      return footnote;
    else if (fieldName.equalsIgnoreCase("COPYFROM"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("PROJECTWON"))
      return projectwon;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_PROJECTPROPOSAL_ID") || fieldName.equals("cProjectproposalId"))
      return cProjectproposalId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
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
  public static ProposalData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cProjectId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cProjectId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ProposalData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cProjectId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_ProjectProposal.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_ProjectProposal.CreatedBy) as CreatedByR, " +
      "        to_char(C_ProjectProposal.Updated, ?) as updated, " +
      "        to_char(C_ProjectProposal.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_ProjectProposal.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_ProjectProposal.UpdatedBy) as UpdatedByR," +
      "        C_ProjectProposal.C_BPartner_ID, " +
      "(CASE WHEN C_ProjectProposal.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_ProjectProposal.C_BPartner_Location_ID, " +
      "(CASE WHEN C_ProjectProposal.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "C_ProjectProposal.Datesend, " +
      "C_ProjectProposal.AD_User_ID, " +
      "(CASE WHEN C_ProjectProposal.AD_User_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "COALESCE(C_ProjectProposal.IsSOTrx, 'N') AS IsSOTrx, " +
      "C_ProjectProposal.FIN_Paymentmethod_ID, " +
      "(CASE WHEN C_ProjectProposal.FIN_Paymentmethod_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS FIN_Paymentmethod_IDR, " +
      "C_ProjectProposal.C_PaymentTerm_ID, " +
      "(CASE WHEN C_ProjectProposal.C_PaymentTerm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'') ) END) AS C_PaymentTerm_IDR, " +
      "C_ProjectProposal.HeaderNote, " +
      "C_ProjectProposal.FootNote, " +
      "C_ProjectProposal.CopyFrom, " +
      "C_ProjectProposal.Projectwon, " +
      "C_ProjectProposal.PaymentRule, " +
      "C_ProjectProposal.C_Project_ID, " +
      "C_ProjectProposal.C_Projectproposal_ID, " +
      "C_ProjectProposal.AD_Client_ID, " +
      "COALESCE(C_ProjectProposal.IsActive, 'N') AS IsActive, " +
      "C_ProjectProposal.AD_Org_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_ProjectProposal left join (select C_BPartner_ID, Name from C_BPartner) table1 on (C_ProjectProposal.C_BPartner_ID = table1.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table2 on (C_ProjectProposal.C_BPartner_Location_ID = table2.C_BPartner_Location_ID) left join (select AD_User_ID, Name from AD_User) table3 on (C_ProjectProposal.AD_User_ID = table3.AD_User_ID) left join (select FIN_Paymentmethod_ID, Name from FIN_Paymentmethod) table4 on (C_ProjectProposal.FIN_Paymentmethod_ID = table4.FIN_Paymentmethod_ID) left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table5 on (C_ProjectProposal.C_PaymentTerm_ID = table5.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL5 on (table5.C_PaymentTerm_ID = tableTRL5.C_PaymentTerm_ID and tableTRL5.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cProjectId==null || cProjectId.equals(""))?"":"  AND C_ProjectProposal.C_Project_ID = ?  ");
    strSql = strSql + 
      "        AND C_ProjectProposal.C_Projectproposal_ID = ? " +
      "        AND C_ProjectProposal.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_ProjectProposal.AD_Org_ID IN (";
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
      if (cProjectId != null && !(cProjectId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
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
        ProposalData objectProposalData = new ProposalData();
        objectProposalData.created = UtilSql.getValue(result, "CREATED");
        objectProposalData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectProposalData.updated = UtilSql.getValue(result, "UPDATED");
        objectProposalData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectProposalData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectProposalData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectProposalData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectProposalData.cBpartnerIdr = UtilSql.getValue(result, "C_BPARTNER_IDR");
        objectProposalData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectProposalData.cBpartnerLocationIdr = UtilSql.getValue(result, "C_BPARTNER_LOCATION_IDR");
        objectProposalData.datesend = UtilSql.getDateValue(result, "DATESEND", "dd-MM-yyyy");
        objectProposalData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectProposalData.adUserIdr = UtilSql.getValue(result, "AD_USER_IDR");
        objectProposalData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectProposalData.finPaymentmethodId = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_ID");
        objectProposalData.finPaymentmethodIdr = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_IDR");
        objectProposalData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectProposalData.cPaymenttermIdr = UtilSql.getValue(result, "C_PAYMENTTERM_IDR");
        objectProposalData.headernote = UtilSql.getValue(result, "HEADERNOTE");
        objectProposalData.footnote = UtilSql.getValue(result, "FOOTNOTE");
        objectProposalData.copyfrom = UtilSql.getValue(result, "COPYFROM");
        objectProposalData.projectwon = UtilSql.getValue(result, "PROJECTWON");
        objectProposalData.paymentrule = UtilSql.getValue(result, "PAYMENTRULE");
        objectProposalData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectProposalData.cProjectproposalId = UtilSql.getValue(result, "C_PROJECTPROPOSAL_ID");
        objectProposalData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectProposalData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectProposalData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectProposalData.language = UtilSql.getValue(result, "LANGUAGE");
        objectProposalData.adUserClient = "";
        objectProposalData.adOrgClient = "";
        objectProposalData.createdby = "";
        objectProposalData.trBgcolor = "";
        objectProposalData.totalCount = "";
        objectProposalData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectProposalData);
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
    ProposalData objectProposalData[] = new ProposalData[vector.size()];
    vector.copyInto(objectProposalData);
    return(objectProposalData);
  }

/**
Create a registry
 */
  public static ProposalData[] set(String cProjectId, String cProjectproposalId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String cBpartnerId, String cBpartnerIdr, String datesend, String cBpartnerLocationId, String adUserId, String copyfrom, String headernote, String footnote, String issotrx, String projectwon, String paymentrule, String cPaymenttermId, String finPaymentmethodId)    throws ServletException {
    ProposalData objectProposalData[] = new ProposalData[1];
    objectProposalData[0] = new ProposalData();
    objectProposalData[0].created = "";
    objectProposalData[0].createdbyr = createdbyr;
    objectProposalData[0].updated = "";
    objectProposalData[0].updatedTimeStamp = "";
    objectProposalData[0].updatedby = updatedby;
    objectProposalData[0].updatedbyr = updatedbyr;
    objectProposalData[0].cBpartnerId = cBpartnerId;
    objectProposalData[0].cBpartnerIdr = cBpartnerIdr;
    objectProposalData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectProposalData[0].cBpartnerLocationIdr = "";
    objectProposalData[0].datesend = datesend;
    objectProposalData[0].adUserId = adUserId;
    objectProposalData[0].adUserIdr = "";
    objectProposalData[0].issotrx = issotrx;
    objectProposalData[0].finPaymentmethodId = finPaymentmethodId;
    objectProposalData[0].finPaymentmethodIdr = "";
    objectProposalData[0].cPaymenttermId = cPaymenttermId;
    objectProposalData[0].cPaymenttermIdr = "";
    objectProposalData[0].headernote = headernote;
    objectProposalData[0].footnote = footnote;
    objectProposalData[0].copyfrom = copyfrom;
    objectProposalData[0].projectwon = projectwon;
    objectProposalData[0].paymentrule = paymentrule;
    objectProposalData[0].cProjectId = cProjectId;
    objectProposalData[0].cProjectproposalId = cProjectproposalId;
    objectProposalData[0].adClientId = adClientId;
    objectProposalData[0].isactive = isactive;
    objectProposalData[0].adOrgId = adOrgId;
    objectProposalData[0].language = "";
    return objectProposalData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef800068_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef800070_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef800072_2(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_BPartner_ID FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_BPartner.C_BPartner_ID = table2.C_BPartner_ID) WHERE C_BPartner.isActive='Y' AND C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_BPARTNER_ID");
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
      "        SELECT C_ProjectProposal.C_Project_ID AS NAME" +
      "        FROM C_ProjectProposal" +
      "        WHERE C_ProjectProposal.C_Projectproposal_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String cProjectId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_Project left join (select C_Project_ID, Value, Name from C_Project) table1 on (C_Project.C_Project_ID = table1.C_Project_ID) WHERE C_Project.C_Project_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cProjectId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_Project left join (select C_Project_ID, Value, Name from C_Project) table1 on (C_Project.C_Project_ID = table1.C_Project_ID) WHERE C_Project.C_Project_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);

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
      "        UPDATE C_ProjectProposal" +
      "        SET C_BPartner_ID = (?) , C_BPartner_Location_ID = (?) , Datesend = TO_DATE(?) , AD_User_ID = (?) , IsSOTrx = (?) , FIN_Paymentmethod_ID = (?) , C_PaymentTerm_ID = (?) , HeaderNote = (?) , FootNote = (?) , CopyFrom = (?) , Projectwon = (?) , PaymentRule = (?) , C_Project_ID = (?) , C_Projectproposal_ID = (?) , AD_Client_ID = (?) , IsActive = (?) , AD_Org_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_ProjectProposal.C_Projectproposal_ID = ? " +
      "                 AND C_ProjectProposal.C_Project_ID = ? " +
      "        AND C_ProjectProposal.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_ProjectProposal.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datesend);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, headernote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, footnote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectwon);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectproposalId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectproposalId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
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
      "        INSERT INTO C_ProjectProposal " +
      "        (C_BPartner_ID, C_BPartner_Location_ID, Datesend, AD_User_ID, IsSOTrx, FIN_Paymentmethod_ID, C_PaymentTerm_ID, HeaderNote, FootNote, CopyFrom, Projectwon, PaymentRule, C_Project_ID, C_Projectproposal_ID, AD_Client_ID, IsActive, AD_Org_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datesend);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, headernote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, footnote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectwon);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectproposalId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cProjectId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_ProjectProposal" +
      "        WHERE C_ProjectProposal.C_Projectproposal_ID = ? " +
      "                 AND C_ProjectProposal.C_Project_ID = ? " +
      "        AND C_ProjectProposal.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_ProjectProposal.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
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
      "          FROM C_ProjectProposal" +
      "         WHERE C_ProjectProposal.C_Projectproposal_ID = ? ";

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
      "          FROM C_ProjectProposal" +
      "         WHERE C_ProjectProposal.C_Projectproposal_ID = ? ";

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
