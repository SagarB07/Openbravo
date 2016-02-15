//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class DocCashData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocCashData.class);
  private String InitRecordNumber="0";
  public String cCashbookId;
  public String adOrgId;
  public String cCurrencyId;
  public String cCashId;
  public String adClientId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String name;
  public String description;
  public String statementdate;
  public String dateacct;
  public String statementdifference;
  public String posted;
  public String adOrgtrxId;
  public String cProjectId;
  public String cCampaignId;
  public String cActivityId;
  public String user1Id;
  public String user2Id;
  public String issotrx;
  public String cBpartnerId;
  public String isreceipt;
  public String accountId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_CASHBOOK_ID") || fieldName.equals("cCashbookId"))
      return cCashbookId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CASH_ID") || fieldName.equals("cCashId"))
      return cCashId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBY"))
      return createdby;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("STATEMENTDATE"))
      return statementdate;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("STATEMENTDIFFERENCE"))
      return statementdifference;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("ISRECEIPT"))
      return isreceipt;
    else if (fieldName.equalsIgnoreCase("ACCOUNT_ID") || fieldName.equals("accountId"))
      return accountId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocCashData[] select(ConnectionProvider connectionProvider, String cash)    throws ServletException {
    return select(connectionProvider, cash, 0, 0);
  }

  public static DocCashData[] select(ConnectionProvider connectionProvider, String cash, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "	SELECT cb.C_CashBook_ID, cb.AD_Org_ID, cb.C_Currency_ID, '' AS C_CASH_ID, '' AS AD_CLIENT_ID, '' AS ISACTIVE," +
      "	'' AS CREATED, '' AS CREATEDBY, '' AS UPDATED, '' AS UPDATEDBY, '' AS NAME, '' AS DESCRIPTION, '' AS STATEMENTDATE," +
      "	'' AS DATEACCT,'' AS STATEMENTDIFFERENCE," +
      "	'' AS POSTED, '' AS AD_ORGTRX_ID, '' AS C_PROJECT_ID, '' AS C_CAMPAIGN_ID, '' AS C_ACTIVITY_ID, '' AS USER1_ID, '' AS USER2_ID," +
      "	'' as ISSOTRX, '' AS C_BPARTNER_ID, '' AS ISRECEIPT, '' AS ACCOUNT_ID" +
      "	FROM C_Cash c, C_CashBook cb " +
      "	WHERE c.C_CashBook_ID=cb.C_CashBook_ID AND c.C_Cash_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cash);

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
        DocCashData objectDocCashData = new DocCashData();
        objectDocCashData.cCashbookId = UtilSql.getValue(result, "C_CASHBOOK_ID");
        objectDocCashData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocCashData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocCashData.cCashId = UtilSql.getValue(result, "C_CASH_ID");
        objectDocCashData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocCashData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocCashData.created = UtilSql.getValue(result, "CREATED");
        objectDocCashData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectDocCashData.updated = UtilSql.getValue(result, "UPDATED");
        objectDocCashData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDocCashData.name = UtilSql.getValue(result, "NAME");
        objectDocCashData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocCashData.statementdate = UtilSql.getValue(result, "STATEMENTDATE");
        objectDocCashData.dateacct = UtilSql.getValue(result, "DATEACCT");
        objectDocCashData.statementdifference = UtilSql.getValue(result, "STATEMENTDIFFERENCE");
        objectDocCashData.posted = UtilSql.getValue(result, "POSTED");
        objectDocCashData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocCashData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocCashData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocCashData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocCashData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocCashData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocCashData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectDocCashData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocCashData.isreceipt = UtilSql.getValue(result, "ISRECEIPT");
        objectDocCashData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocCashData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocCashData);
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
    DocCashData objectDocCashData[] = new DocCashData[vector.size()];
    vector.copyInto(objectDocCashData);
    return(objectDocCashData);
  }

  public static DocCashData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return selectRegistro(connectionProvider, client, id, 0, 0);
  }

  public static DocCashData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C.AD_CLIENT_ID, C.AD_ORG_ID, C.AD_ORGTRX_ID, C.C_PROJECT_ID, C.C_CAMPAIGN_ID," +
      "        C.C_ACTIVITY_ID, C.USER1_ID, C.USER2_ID, C.NAME, C.DATEACCT, C.POSTED, C.STATEMENTDATE," +
      "        C.STATEMENTDIFFERENCE" +
      "        FROM C_CASH C" +
      "        WHERE AD_CLIENT_ID=? " +
      "        AND C_CASH_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DocCashData objectDocCashData = new DocCashData();
        objectDocCashData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocCashData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocCashData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocCashData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocCashData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocCashData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocCashData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocCashData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocCashData.name = UtilSql.getValue(result, "NAME");
        objectDocCashData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocCashData.posted = UtilSql.getValue(result, "POSTED");
        objectDocCashData.statementdate = UtilSql.getDateValue(result, "STATEMENTDATE", "dd-MM-yyyy");
        objectDocCashData.statementdifference = UtilSql.getValue(result, "STATEMENTDIFFERENCE");
        objectDocCashData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocCashData);
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
    DocCashData objectDocCashData[] = new DocCashData[vector.size()];
    vector.copyInto(objectDocCashData);
    return(objectDocCashData);
  }

  public static DocCashData[] selectBankInTransitAcct(ConnectionProvider connectionProvider, String C_BANKACCOUNT_ID, String C_ACCTSCHEMA_ID)    throws ServletException {
    return selectBankInTransitAcct(connectionProvider, C_BANKACCOUNT_ID, C_ACCTSCHEMA_ID, 0, 0);
  }

  public static DocCashData[] selectBankInTransitAcct(ConnectionProvider connectionProvider, String C_BANKACCOUNT_ID, String C_ACCTSCHEMA_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		SELECT B_INTRANSIT_ACCT  AS ACCOUNT_ID" +
      "		FROM C_BANKACCOUNT_ACCT" +
      "		WHERE C_BANKACCOUNT_ID = ?" +
      "		AND C_BANKACCOUNT_ACCT.C_ACCTSCHEMA_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BANKACCOUNT_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ACCTSCHEMA_ID);

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
        DocCashData objectDocCashData = new DocCashData();
        objectDocCashData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocCashData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocCashData);
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
    DocCashData objectDocCashData[] = new DocCashData[vector.size()];
    vector.copyInto(objectDocCashData);
    return(objectDocCashData);
  }
}
