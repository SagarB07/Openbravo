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

class DocBankData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocBankData.class);
  private String InitRecordNumber="0";
  public String cBankstatementlineId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String cBankstatementId;
  public String line;
  public String description;
  public String valutadate;
  public String dateacct;
  public String cCurrencyId;
  public String trxamt;
  public String stmtamt;
  public String cChargeId;
  public String chargeamt;
  public String memo;
  public String referenceno;
  public String cDebtPaymentId;
  public String convertchargeamt;
  public String cDebtPaymentCreate;
  public String cDpManagementId;
  public String cGlitemId;
  public String cBankId;
  public String name;
  public String routingno;
  public String cLocationId;
  public String swiftcode;
  public String isownbank;
  public String codebank;
  public String codebranch;
  public String digitcontrol;
  public String cCashId;
  public String statementdate;
  public String beginningbalance;
  public String endingbalance;
  public String statementdifference;
  public String processing;
  public String processed;
  public String posted;
  public String adOrgtrxId;
  public String cProjectId;
  public String cCampaignId;
  public String cActivityId;
  public String user1Id;
  public String user2Id;
  public String cBankaccountId;
  public String ismanual;
  public String createfrom;
  public String accountId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_BANKSTATEMENTLINE_ID") || fieldName.equals("cBankstatementlineId"))
      return cBankstatementlineId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
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
    else if (fieldName.equalsIgnoreCase("C_BANKSTATEMENT_ID") || fieldName.equals("cBankstatementId"))
      return cBankstatementId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("VALUTADATE"))
      return valutadate;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("TRXAMT"))
      return trxamt;
    else if (fieldName.equalsIgnoreCase("STMTAMT"))
      return stmtamt;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("MEMO"))
      return memo;
    else if (fieldName.equalsIgnoreCase("REFERENCENO"))
      return referenceno;
    else if (fieldName.equalsIgnoreCase("C_DEBT_PAYMENT_ID") || fieldName.equals("cDebtPaymentId"))
      return cDebtPaymentId;
    else if (fieldName.equalsIgnoreCase("CONVERTCHARGEAMT"))
      return convertchargeamt;
    else if (fieldName.equalsIgnoreCase("C_DEBT_PAYMENT_CREATE") || fieldName.equals("cDebtPaymentCreate"))
      return cDebtPaymentCreate;
    else if (fieldName.equalsIgnoreCase("C_DP_MANAGEMENT_ID") || fieldName.equals("cDpManagementId"))
      return cDpManagementId;
    else if (fieldName.equalsIgnoreCase("C_GLITEM_ID") || fieldName.equals("cGlitemId"))
      return cGlitemId;
    else if (fieldName.equalsIgnoreCase("C_BANK_ID") || fieldName.equals("cBankId"))
      return cBankId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("ROUTINGNO"))
      return routingno;
    else if (fieldName.equalsIgnoreCase("C_LOCATION_ID") || fieldName.equals("cLocationId"))
      return cLocationId;
    else if (fieldName.equalsIgnoreCase("SWIFTCODE"))
      return swiftcode;
    else if (fieldName.equalsIgnoreCase("ISOWNBANK"))
      return isownbank;
    else if (fieldName.equalsIgnoreCase("CODEBANK"))
      return codebank;
    else if (fieldName.equalsIgnoreCase("CODEBRANCH"))
      return codebranch;
    else if (fieldName.equalsIgnoreCase("DIGITCONTROL"))
      return digitcontrol;
    else if (fieldName.equalsIgnoreCase("C_CASH_ID") || fieldName.equals("cCashId"))
      return cCashId;
    else if (fieldName.equalsIgnoreCase("STATEMENTDATE"))
      return statementdate;
    else if (fieldName.equalsIgnoreCase("BEGINNINGBALANCE"))
      return beginningbalance;
    else if (fieldName.equalsIgnoreCase("ENDINGBALANCE"))
      return endingbalance;
    else if (fieldName.equalsIgnoreCase("STATEMENTDIFFERENCE"))
      return statementdifference;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
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
    else if (fieldName.equalsIgnoreCase("C_BANKACCOUNT_ID") || fieldName.equals("cBankaccountId"))
      return cBankaccountId;
    else if (fieldName.equalsIgnoreCase("ISMANUAL"))
      return ismanual;
    else if (fieldName.equalsIgnoreCase("CREATEFROM"))
      return createfrom;
    else if (fieldName.equalsIgnoreCase("ACCOUNT_ID") || fieldName.equals("accountId"))
      return accountId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocBankData[] select(ConnectionProvider connectionProvider, String C_BankAccount_ID)    throws ServletException {
    return select(connectionProvider, C_BankAccount_ID, 0, 0);
  }

  public static DocBankData[] select(ConnectionProvider connectionProvider, String C_BankAccount_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT B.*, '' AS C_BANK_ID, '' AS NAME, '' AS ROUTINGNO, '' AS C_LOCATION_ID, '' AS SWIFTCODE, '' AS ISOWNBANK, '' AS CODEBANK," +
      "        '' AS CODEBRANCH, '' AS DIGITCONTROL, '' AS C_CASH_ID, '' AS STATEMENTDATE, '' AS BEGINNINGBALANCE, '' AS ENDINGBALANCE," +
      "        '' AS STATEMENTDIFFERENCE, '' AS PROCESSING, '' AS PROCESSED, '' AS POSTED, '' AS AD_ORGTRX_ID, '' AS C_PROJECT_ID," +
      "        '' AS C_CAMPAIGN_ID, '' AS C_ACTIVITY_ID, '' AS USER1_ID, '' AS USER2_ID, '' AS C_BANKACCOUNT_ID, '' AS ISMANUAL, '' AS CREATEFROM," +
      "        '' AS ACCOUNT_ID" +
      "        FROM C_BankStatementLine B WHERE C_BankStatement_ID = ? ORDER BY Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BankAccount_ID);

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
        DocBankData objectDocBankData = new DocBankData();
        objectDocBankData.cBankstatementlineId = UtilSql.getValue(result, "C_BANKSTATEMENTLINE_ID");
        objectDocBankData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocBankData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocBankData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocBankData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectDocBankData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectDocBankData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectDocBankData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDocBankData.cBankstatementId = UtilSql.getValue(result, "C_BANKSTATEMENT_ID");
        objectDocBankData.line = UtilSql.getValue(result, "LINE");
        objectDocBankData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocBankData.valutadate = UtilSql.getDateValue(result, "VALUTADATE", "dd-MM-yyyy");
        objectDocBankData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocBankData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocBankData.trxamt = UtilSql.getValue(result, "TRXAMT");
        objectDocBankData.stmtamt = UtilSql.getValue(result, "STMTAMT");
        objectDocBankData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocBankData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocBankData.memo = UtilSql.getValue(result, "MEMO");
        objectDocBankData.referenceno = UtilSql.getValue(result, "REFERENCENO");
        objectDocBankData.cDebtPaymentId = UtilSql.getValue(result, "C_DEBT_PAYMENT_ID");
        objectDocBankData.convertchargeamt = UtilSql.getValue(result, "CONVERTCHARGEAMT");
        objectDocBankData.cDebtPaymentCreate = UtilSql.getValue(result, "C_DEBT_PAYMENT_CREATE");
        objectDocBankData.cDpManagementId = UtilSql.getValue(result, "C_DP_MANAGEMENT_ID");
        objectDocBankData.cGlitemId = UtilSql.getValue(result, "C_GLITEM_ID");
        objectDocBankData.cBankId = UtilSql.getValue(result, "C_BANK_ID");
        objectDocBankData.name = UtilSql.getValue(result, "NAME");
        objectDocBankData.routingno = UtilSql.getValue(result, "ROUTINGNO");
        objectDocBankData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectDocBankData.swiftcode = UtilSql.getValue(result, "SWIFTCODE");
        objectDocBankData.isownbank = UtilSql.getValue(result, "ISOWNBANK");
        objectDocBankData.codebank = UtilSql.getValue(result, "CODEBANK");
        objectDocBankData.codebranch = UtilSql.getValue(result, "CODEBRANCH");
        objectDocBankData.digitcontrol = UtilSql.getValue(result, "DIGITCONTROL");
        objectDocBankData.cCashId = UtilSql.getValue(result, "C_CASH_ID");
        objectDocBankData.statementdate = UtilSql.getValue(result, "STATEMENTDATE");
        objectDocBankData.beginningbalance = UtilSql.getValue(result, "BEGINNINGBALANCE");
        objectDocBankData.endingbalance = UtilSql.getValue(result, "ENDINGBALANCE");
        objectDocBankData.statementdifference = UtilSql.getValue(result, "STATEMENTDIFFERENCE");
        objectDocBankData.processing = UtilSql.getValue(result, "PROCESSING");
        objectDocBankData.processed = UtilSql.getValue(result, "PROCESSED");
        objectDocBankData.posted = UtilSql.getValue(result, "POSTED");
        objectDocBankData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocBankData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocBankData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocBankData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocBankData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocBankData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocBankData.cBankaccountId = UtilSql.getValue(result, "C_BANKACCOUNT_ID");
        objectDocBankData.ismanual = UtilSql.getValue(result, "ISMANUAL");
        objectDocBankData.createfrom = UtilSql.getValue(result, "CREATEFROM");
        objectDocBankData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocBankData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocBankData);
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
    DocBankData objectDocBankData[] = new DocBankData[vector.size()];
    vector.copyInto(objectDocBankData);
    return(objectDocBankData);
  }

  public static DocBankData[] selectCurrency(ConnectionProvider connectionProvider, String C_BankAccount_ID)    throws ServletException {
    return selectCurrency(connectionProvider, C_BankAccount_ID, 0, 0);
  }

  public static DocBankData[] selectCurrency(ConnectionProvider connectionProvider, String C_BankAccount_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_Currency_ID FROM C_BankAccount WHERE C_BankAccount_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BankAccount_ID);

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
        DocBankData objectDocBankData = new DocBankData();
        objectDocBankData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocBankData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocBankData);
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
    DocBankData objectDocBankData[] = new DocBankData[vector.size()];
    vector.copyInto(objectDocBankData);
    return(objectDocBankData);
  }

  public static DocBankData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return selectRegistro(connectionProvider, client, id, 0, 0);
  }

  public static DocBankData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT B.AD_CLIENT_ID, B.AD_ORG_ID, B.NAME, B.C_BANKACCOUNT_ID, B.POSTED," +
      "        B.STATEMENTDATE, B.STATEMENTDIFFERENCE" +
      "        FROM C_BANKSTATEMENT B          " +
      "        WHERE AD_Client_ID=? " +
      "        AND C_BANKSTATEMENT_ID=?";

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
        DocBankData objectDocBankData = new DocBankData();
        objectDocBankData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocBankData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocBankData.name = UtilSql.getValue(result, "NAME");
        objectDocBankData.cBankaccountId = UtilSql.getValue(result, "C_BANKACCOUNT_ID");
        objectDocBankData.posted = UtilSql.getValue(result, "POSTED");
        objectDocBankData.statementdate = UtilSql.getDateValue(result, "STATEMENTDATE", "dd-MM-yyyy");
        objectDocBankData.statementdifference = UtilSql.getValue(result, "STATEMENTDIFFERENCE");
        objectDocBankData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocBankData);
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
    DocBankData objectDocBankData[] = new DocBankData[vector.size()];
    vector.copyInto(objectDocBankData);
    return(objectDocBankData);
  }

  public static DocBankData[] selectBankInTransitAcct(ConnectionProvider connectionProvider, String C_BANKSTATEMENTLINE_ID, String C_ACCTSCHEMA_ID)    throws ServletException {
    return selectBankInTransitAcct(connectionProvider, C_BANKSTATEMENTLINE_ID, C_ACCTSCHEMA_ID, 0, 0);
  }

  public static DocBankData[] selectBankInTransitAcct(ConnectionProvider connectionProvider, String C_BANKSTATEMENTLINE_ID, String C_ACCTSCHEMA_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		SELECT B_INTRANSIT_ACCT  AS ACCOUNT_ID" +
      "		FROM C_BANKSTATEMENTLINE, C_BANKSTATEMENT, C_BANKACCOUNT, C_BANKACCOUNT_ACCT" +
      "		WHERE C_BANKSTATEMENTLINE.C_BANKSTATEMENT_ID = C_BANKSTATEMENT.C_BANKSTATEMENT_ID" +
      "		AND C_BANKSTATEMENT.C_BANKACCOUNT_ID = C_BANKACCOUNT.C_BANKACCOUNT_ID" +
      "		AND C_BANKACCOUNT.C_BANKACCOUNT_ID = C_BANKACCOUNT_ACCT.C_BANKACCOUNT_ID" +
      "		AND C_BANKSTATEMENTLINE_ID = ?" +
      "		AND C_BANKACCOUNT_ACCT.C_ACCTSCHEMA_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BANKSTATEMENTLINE_ID);
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
        DocBankData objectDocBankData = new DocBankData();
        objectDocBankData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocBankData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocBankData);
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
    DocBankData objectDocBankData[] = new DocBankData[vector.size()];
    vector.copyInto(objectDocBankData);
    return(objectDocBankData);
  }
}
