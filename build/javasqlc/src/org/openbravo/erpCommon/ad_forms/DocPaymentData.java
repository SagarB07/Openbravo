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

class DocPaymentData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocPaymentData.class);
  private String InitRecordNumber="0";
  public String sysdate1;
  public String accountId;
  public String cSettlementId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String documentno;
  public String datetrx;
  public String cDoctypeId;
  public String processing;
  public String processed;
  public String posted;
  public String cProjectId;
  public String cCampaignId;
  public String cActivityId;
  public String user1Id;
  public String user2Id;
  public String createfrom;
  public String cCurrencyId;
  public String cancelednotchargeamt;
  public String generatedamt;
  public String chargedamt;
  public String description;
  public String createfile;
  public String dateacct;
  public String settlementtype;
  public String creditAcct;
  public String debitAcct;
  public String amountdebit;
  public String amountcredit;
  public String amount;
  public String cTaxId;
  public String cWithholdingId;
  public String isdirectposting;
  public String ismanual;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("SYSDATE1"))
      return sysdate1;
    else if (fieldName.equalsIgnoreCase("ACCOUNT_ID") || fieldName.equals("accountId"))
      return accountId;
    else if (fieldName.equalsIgnoreCase("C_SETTLEMENT_ID") || fieldName.equals("cSettlementId"))
      return cSettlementId;
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
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DATETRX"))
      return datetrx;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
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
    else if (fieldName.equalsIgnoreCase("CREATEFROM"))
      return createfrom;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("CANCELEDNOTCHARGEAMT"))
      return cancelednotchargeamt;
    else if (fieldName.equalsIgnoreCase("GENERATEDAMT"))
      return generatedamt;
    else if (fieldName.equalsIgnoreCase("CHARGEDAMT"))
      return chargedamt;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("CREATEFILE"))
      return createfile;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("SETTLEMENTTYPE"))
      return settlementtype;
    else if (fieldName.equalsIgnoreCase("CREDIT_ACCT") || fieldName.equals("creditAcct"))
      return creditAcct;
    else if (fieldName.equalsIgnoreCase("DEBIT_ACCT") || fieldName.equals("debitAcct"))
      return debitAcct;
    else if (fieldName.equalsIgnoreCase("AMOUNTDEBIT"))
      return amountdebit;
    else if (fieldName.equalsIgnoreCase("AMOUNTCREDIT"))
      return amountcredit;
    else if (fieldName.equalsIgnoreCase("AMOUNT"))
      return amount;
    else if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("C_WITHHOLDING_ID") || fieldName.equals("cWithholdingId"))
      return cWithholdingId;
    else if (fieldName.equalsIgnoreCase("ISDIRECTPOSTING"))
      return isdirectposting;
    else if (fieldName.equalsIgnoreCase("ISMANUAL"))
      return ismanual;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocPaymentData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static DocPaymentData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT now() AS SYSDATE1, '' AS account_ID, '' AS C_SETTLEMENT_ID, '' AS AD_CLIENT_ID, '' AS AD_ORG_ID, '' AS ISACTIVE," +
      "        '' AS CREATED, '' AS CREATEDBY, '' AS UPDATED, '' AS UPDATEDBY, '' AS DOCUMENTNO, '' AS DATETRX, '' AS C_DOCTYPE_ID," +
      "        '' AS PROCESSING, '' AS PROCESSED, '' AS POSTED, '' AS C_PROJECT_ID, '' AS C_CAMPAIGN_ID, '' AS C_ACTIVITY_ID," +
      "        '' AS USER1_ID, '' AS USER2_ID, '' AS CREATEFROM, '' AS C_CURRENCY_ID, '' AS CANCELEDNOTCHARGEAMT, '' AS GENERATEDAMT," +
      "        '' AS CHARGEDAMT, '' AS DESCRIPTION, '' AS CREATEFILE, '' AS DATEACCT, '' AS SETTLEMENTTYPE, '' AS CREDIT_ACCT, '' AS DEBIT_ACCT," +
      "        '' AS AMOUNTDEBIT, '' AS AMOUNTCREDIT, '' AS AMOUNT, '' AS C_TAX_ID, '' AS C_WITHHOLDING_ID, '' AS ISDIRECTPOSTING, '' AS ISMANUAL" +
      "        FROM DUAL";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        DocPaymentData objectDocPaymentData = new DocPaymentData();
        objectDocPaymentData.sysdate1 = UtilSql.getDateValue(result, "SYSDATE1", "dd-MM-yyyy");
        objectDocPaymentData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocPaymentData.cSettlementId = UtilSql.getValue(result, "C_SETTLEMENT_ID");
        objectDocPaymentData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocPaymentData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocPaymentData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDocPaymentData.created = UtilSql.getValue(result, "CREATED");
        objectDocPaymentData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectDocPaymentData.updated = UtilSql.getValue(result, "UPDATED");
        objectDocPaymentData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDocPaymentData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocPaymentData.datetrx = UtilSql.getValue(result, "DATETRX");
        objectDocPaymentData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectDocPaymentData.processing = UtilSql.getValue(result, "PROCESSING");
        objectDocPaymentData.processed = UtilSql.getValue(result, "PROCESSED");
        objectDocPaymentData.posted = UtilSql.getValue(result, "POSTED");
        objectDocPaymentData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocPaymentData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocPaymentData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocPaymentData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocPaymentData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocPaymentData.createfrom = UtilSql.getValue(result, "CREATEFROM");
        objectDocPaymentData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocPaymentData.cancelednotchargeamt = UtilSql.getValue(result, "CANCELEDNOTCHARGEAMT");
        objectDocPaymentData.generatedamt = UtilSql.getValue(result, "GENERATEDAMT");
        objectDocPaymentData.chargedamt = UtilSql.getValue(result, "CHARGEDAMT");
        objectDocPaymentData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocPaymentData.createfile = UtilSql.getValue(result, "CREATEFILE");
        objectDocPaymentData.dateacct = UtilSql.getValue(result, "DATEACCT");
        objectDocPaymentData.settlementtype = UtilSql.getValue(result, "SETTLEMENTTYPE");
        objectDocPaymentData.creditAcct = UtilSql.getValue(result, "CREDIT_ACCT");
        objectDocPaymentData.debitAcct = UtilSql.getValue(result, "DEBIT_ACCT");
        objectDocPaymentData.amountdebit = UtilSql.getValue(result, "AMOUNTDEBIT");
        objectDocPaymentData.amountcredit = UtilSql.getValue(result, "AMOUNTCREDIT");
        objectDocPaymentData.amount = UtilSql.getValue(result, "AMOUNT");
        objectDocPaymentData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocPaymentData.cWithholdingId = UtilSql.getValue(result, "C_WITHHOLDING_ID");
        objectDocPaymentData.isdirectposting = UtilSql.getValue(result, "ISDIRECTPOSTING");
        objectDocPaymentData.ismanual = UtilSql.getValue(result, "ISMANUAL");
        objectDocPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocPaymentData);
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
    DocPaymentData objectDocPaymentData[] = new DocPaymentData[vector.size()];
    vector.copyInto(objectDocPaymentData);
    return(objectDocPaymentData);
  }

  public static DocPaymentData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return selectRegistro(connectionProvider, client, id, 0, 0);
  }

  public static DocPaymentData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT S.AD_CLIENT_ID, S.AD_ORG_ID, S.C_PROJECT_ID, S.C_CAMPAIGN_ID, S.C_ACTIVITY_ID," +
      "        S.USER1_ID, S.USER2_ID, S.DOCUMENTNO, S.DATEACCT, S.C_CURRENCY_ID, S.C_DOCTYPE_ID," +
      "        S.CHARGEDAMT, S.POSTED, S.DATETRX, S.SETTLEMENTTYPE" +
      "        FROM C_SETTLEMENT S" +
      "        WHERE AD_Client_ID=?" +
      "        AND C_SETTLEMENT_ID=?";

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
        DocPaymentData objectDocPaymentData = new DocPaymentData();
        objectDocPaymentData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocPaymentData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocPaymentData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocPaymentData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocPaymentData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocPaymentData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocPaymentData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocPaymentData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocPaymentData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocPaymentData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocPaymentData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectDocPaymentData.chargedamt = UtilSql.getValue(result, "CHARGEDAMT");
        objectDocPaymentData.posted = UtilSql.getValue(result, "POSTED");
        objectDocPaymentData.datetrx = UtilSql.getDateValue(result, "DATETRX", "dd-MM-yyyy");
        objectDocPaymentData.settlementtype = UtilSql.getValue(result, "SETTLEMENTTYPE");
        objectDocPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocPaymentData);
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
    DocPaymentData objectDocPaymentData[] = new DocPaymentData[vector.size()];
    vector.copyInto(objectDocPaymentData);
    return(objectDocPaymentData);
  }

  public static DocPaymentData[] selectBPartnerCustomerAcct(ConnectionProvider connectionProvider, String C_BPARTNER_ID, String C_ACCTSCHEMA_ID, String STATUS)    throws ServletException {
    return selectBPartnerCustomerAcct(connectionProvider, C_BPARTNER_ID, C_ACCTSCHEMA_ID, STATUS, 0, 0);
  }

  public static DocPaymentData[] selectBPartnerCustomerAcct(ConnectionProvider connectionProvider, String C_BPARTNER_ID, String C_ACCTSCHEMA_ID, String STATUS, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(" +
      "          (SELECT C_RECEIVABLE_ACCT" +
      "          FROM C_BP_CUSTOMER_ACCT" +
      "          WHERE C_BPARTNER_ID = ?" +
      "          AND C_ACCTSCHEMA_ID = ?" +
      "          AND STATUS = ?)," +
      "          (SELECT C_RECEIVABLE_ACCT" +
      "          FROM C_BP_CUSTOMER_ACCT" +
      "          WHERE C_BPARTNER_ID = ?" +
      "          AND C_ACCTSCHEMA_ID = ?" +
      "          AND STATUS IS NULL)) AS ACCOUNT_ID FROM DUAL";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPARTNER_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ACCTSCHEMA_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, STATUS);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPARTNER_ID);
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
        DocPaymentData objectDocPaymentData = new DocPaymentData();
        objectDocPaymentData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocPaymentData);
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
    DocPaymentData objectDocPaymentData[] = new DocPaymentData[vector.size()];
    vector.copyInto(objectDocPaymentData);
    return(objectDocPaymentData);
  }

  public static DocPaymentData[] selectBPartnerVendorAcct(ConnectionProvider connectionProvider, String C_BPARTNER_ID, String C_ACCTSCHEMA_ID, String STATUS)    throws ServletException {
    return selectBPartnerVendorAcct(connectionProvider, C_BPARTNER_ID, C_ACCTSCHEMA_ID, STATUS, 0, 0);
  }

  public static DocPaymentData[] selectBPartnerVendorAcct(ConnectionProvider connectionProvider, String C_BPARTNER_ID, String C_ACCTSCHEMA_ID, String STATUS, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(" +
      "          (SELECT V_LIABILITY_ACCT" +
      "          FROM C_BP_VENDOR_ACCT" +
      "          WHERE C_BPARTNER_ID = ?" +
      "          AND C_ACCTSCHEMA_ID = ?" +
      "          AND STATUS = ?)," +
      "          (SELECT V_LIABILITY_ACCT" +
      "          FROM C_BP_VENDOR_ACCT" +
      "          WHERE C_BPARTNER_ID = ?" +
      "          AND C_ACCTSCHEMA_ID = ?" +
      "          AND STATUS IS NULL)) AS ACCOUNT_ID FROM DUAL";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPARTNER_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ACCTSCHEMA_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, STATUS);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPARTNER_ID);
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
        DocPaymentData objectDocPaymentData = new DocPaymentData();
        objectDocPaymentData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocPaymentData);
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
    DocPaymentData objectDocPaymentData[] = new DocPaymentData[vector.size()];
    vector.copyInto(objectDocPaymentData);
    return(objectDocPaymentData);
  }

  public static DocPaymentData[] selectBankStatementLineAcct(ConnectionProvider connectionProvider, String C_BANKSTATEMENTLINE_ID, String C_ACCTSCHEMA_ID)    throws ServletException {
    return selectBankStatementLineAcct(connectionProvider, C_BANKSTATEMENTLINE_ID, C_ACCTSCHEMA_ID, 0, 0);
  }

  public static DocPaymentData[] selectBankStatementLineAcct(ConnectionProvider connectionProvider, String C_BANKSTATEMENTLINE_ID, String C_ACCTSCHEMA_ID, int firstRegister, int numberRegisters)    throws ServletException {
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
        DocPaymentData objectDocPaymentData = new DocPaymentData();
        objectDocPaymentData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocPaymentData);
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
    DocPaymentData objectDocPaymentData[] = new DocPaymentData[vector.size()];
    vector.copyInto(objectDocPaymentData);
    return(objectDocPaymentData);
  }

  public static DocPaymentData[] selectCashLineAcct(ConnectionProvider connectionProvider, String C_CASHLINE_ID, String C_ACCTSCHEMA_ID)    throws ServletException {
    return selectCashLineAcct(connectionProvider, C_CASHLINE_ID, C_ACCTSCHEMA_ID, 0, 0);
  }

  public static DocPaymentData[] selectCashLineAcct(ConnectionProvider connectionProvider, String C_CASHLINE_ID, String C_ACCTSCHEMA_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		SELECT CB_RECEIPT_ACCT  AS ACCOUNT_ID" +
      "		FROM C_CASHLINE, C_CASH, C_CASHBOOK, C_CASHBOOK_ACCT" +
      "		WHERE C_CASHLINE.C_CASH_ID = C_CASH.C_CASH_ID" +
      "		AND C_CASH.C_CASHBOOK_ID = C_CASHBOOK.C_CASHBOOK_ID" +
      "		AND C_CASHBOOK.C_CASHBOOK_ID = C_CASHBOOK_ACCT.C_CASHBOOK_ID" +
      "		AND C_CASHLINE_ID = ?" +
      "		AND C_CASHBOOK_ACCT.C_ACCTSCHEMA_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_CASHLINE_ID);
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
        DocPaymentData objectDocPaymentData = new DocPaymentData();
        objectDocPaymentData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocPaymentData);
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
    DocPaymentData objectDocPaymentData[] = new DocPaymentData[vector.size()];
    vector.copyInto(objectDocPaymentData);
    return(objectDocPaymentData);
  }

  public static DocPaymentData[] selectManual(ConnectionProvider connectionProvider, String C_ACCTSCHEMA_ID, String C_DEBT_PAYMENT_ID)    throws ServletException {
    return selectManual(connectionProvider, C_ACCTSCHEMA_ID, C_DEBT_PAYMENT_ID, 0, 0);
  }

  public static DocPaymentData[] selectManual(ConnectionProvider connectionProvider, String C_ACCTSCHEMA_ID, String C_DEBT_PAYMENT_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT B.AMOUNTCREDIT AS AMOUNTCREDIT, B.AMOUNTDEBIT AS AMOUNTDEBIT, GA.Glitem_Credit_Acct AS CREDIT_ACCT, GA.Glitem_Debit_Acct AS DEBIT_ACCT," +
      "        G.C_TAX_ID, G.C_WITHHOLDING_ID" +
      "        FROM C_DEBT_PAYMENT D, C_DEBT_PAYMENT_BALANCING B, C_GLITEM G, C_Glitem_Acct GA" +
      "        WHERE D.C_DEBT_PAYMENT_ID = B.C_DEBT_PAYMENT_ID" +
      "        AND B.C_GLITEM_ID = G.C_GLITEM_ID" +
      "        AND G.C_GLITEM_ID = GA.C_GLITEM_ID" +
      "        AND GA.C_ACCTSCHEMA_ID = ?" +
      "        AND D.C_DEBT_PAYMENT_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ACCTSCHEMA_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_DEBT_PAYMENT_ID);

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
        DocPaymentData objectDocPaymentData = new DocPaymentData();
        objectDocPaymentData.amountcredit = UtilSql.getValue(result, "AMOUNTCREDIT");
        objectDocPaymentData.amountdebit = UtilSql.getValue(result, "AMOUNTDEBIT");
        objectDocPaymentData.creditAcct = UtilSql.getValue(result, "CREDIT_ACCT");
        objectDocPaymentData.debitAcct = UtilSql.getValue(result, "DEBIT_ACCT");
        objectDocPaymentData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocPaymentData.cWithholdingId = UtilSql.getValue(result, "C_WITHHOLDING_ID");
        objectDocPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocPaymentData);
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
    DocPaymentData objectDocPaymentData[] = new DocPaymentData[vector.size()];
    vector.copyInto(objectDocPaymentData);
    return(objectDocPaymentData);
  }

  public static DocPaymentData[] selectDirectManual(ConnectionProvider connectionProvider, String C_ACCTSCHEMA_ID, String C_DEBT_PAYMENT_ID)    throws ServletException {
    return selectDirectManual(connectionProvider, C_ACCTSCHEMA_ID, C_DEBT_PAYMENT_ID, 0, 0);
  }

  public static DocPaymentData[] selectDirectManual(ConnectionProvider connectionProvider, String C_ACCTSCHEMA_ID, String C_DEBT_PAYMENT_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_GLITEM_ACCT.GLITEM_CREDIT_ACCT AS CREDIT_ACCT," +
      "        C_GLITEM_ACCT.GLITEM_DEBIT_ACCT AS DEBIT_ACCT, C_DEBT_PAYMENT.AMOUNT AS AMOUNT," +
      "        G.C_TAX_ID, G.C_WITHHOLDING_ID" +
      "        FROM C_DEBT_PAYMENT, C_GLITEM G, C_GLITEM_ACCT" +
      "        WHERE G.C_GLITEM_ID = C_GLITEM_ACCT.C_GLITEM_ID" +
      "        AND G.C_GLITEM_ID = C_DEBT_PAYMENT.C_GLITEM_ID" +
      "        AND C_GLITEM_ACCT.C_ACCTSCHEMA_ID = ?" +
      "        AND C_DEBT_PAYMENT.C_DEBT_PAYMENT_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_ACCTSCHEMA_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_DEBT_PAYMENT_ID);

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
        DocPaymentData objectDocPaymentData = new DocPaymentData();
        objectDocPaymentData.creditAcct = UtilSql.getValue(result, "CREDIT_ACCT");
        objectDocPaymentData.debitAcct = UtilSql.getValue(result, "DEBIT_ACCT");
        objectDocPaymentData.amount = UtilSql.getValue(result, "AMOUNT");
        objectDocPaymentData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocPaymentData.cWithholdingId = UtilSql.getValue(result, "C_WITHHOLDING_ID");
        objectDocPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocPaymentData);
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
    DocPaymentData objectDocPaymentData[] = new DocPaymentData[vector.size()];
    vector.copyInto(objectDocPaymentData);
    return(objectDocPaymentData);
  }

  public static DocPaymentData[] paymentsInformation(ConnectionProvider connectionProvider, String settlementID)    throws ServletException {
    return paymentsInformation(connectionProvider, settlementID, 0, 0);
  }

  public static DocPaymentData[] paymentsInformation(ConnectionProvider connectionProvider, String settlementID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(DP.ISMANUAL,'N') AS ISMANUAL, COALESCE(DP.ISDIRECTPOSTING,'N') AS ISDIRECTPOSTING" +
      "        FROM C_SETTLEMENT S LEFT JOIN C_DEBT_PAYMENT DP" +
      "          ON DP.C_SETTLEMENT_GENERATE_ID = S.C_SETTLEMENT_ID" +
      "        WHERE S.C_SETTLEMENT_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, settlementID);

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
        DocPaymentData objectDocPaymentData = new DocPaymentData();
        objectDocPaymentData.ismanual = UtilSql.getValue(result, "ISMANUAL");
        objectDocPaymentData.isdirectposting = UtilSql.getValue(result, "ISDIRECTPOSTING");
        objectDocPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocPaymentData);
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
    DocPaymentData objectDocPaymentData[] = new DocPaymentData[vector.size()];
    vector.copyInto(objectDocPaymentData);
    return(objectDocPaymentData);
  }
}
