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

class DocLineBankData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocLineBankData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String line;
  public String description;
  public String cChargeId;
  public String chargeamt;
  public String dateacct;
  public String cBankstatementlineId;
  public String valutadate;
  public String cDebtPaymentId;
  public String stmtamt;
  public String trxamt;
  public String cBpartnerId;
  public String ismanual;
  public String convertchargeamt;
  public String cCurrencyId;
  public String cGlitemId;
  public String glitemCreditAcct;
  public String glitemDebitAcct;
  public String cProjectId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("C_BANKSTATEMENTLINE_ID") || fieldName.equals("cBankstatementlineId"))
      return cBankstatementlineId;
    else if (fieldName.equalsIgnoreCase("VALUTADATE"))
      return valutadate;
    else if (fieldName.equalsIgnoreCase("C_DEBT_PAYMENT_ID") || fieldName.equals("cDebtPaymentId"))
      return cDebtPaymentId;
    else if (fieldName.equalsIgnoreCase("STMTAMT"))
      return stmtamt;
    else if (fieldName.equalsIgnoreCase("TRXAMT"))
      return trxamt;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("ISMANUAL"))
      return ismanual;
    else if (fieldName.equalsIgnoreCase("CONVERTCHARGEAMT"))
      return convertchargeamt;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_GLITEM_ID") || fieldName.equals("cGlitemId"))
      return cGlitemId;
    else if (fieldName.equalsIgnoreCase("GLITEM_CREDIT_ACCT") || fieldName.equals("glitemCreditAcct"))
      return glitemCreditAcct;
    else if (fieldName.equalsIgnoreCase("GLITEM_DEBIT_ACCT") || fieldName.equals("glitemDebitAcct"))
      return glitemDebitAcct;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocLineBankData[] select(ConnectionProvider connectionProvider, String C_BANKSTATEMENT_ID)    throws ServletException {
    return select(connectionProvider, C_BANKSTATEMENT_ID, 0, 0);
  }

  public static DocLineBankData[] select(ConnectionProvider connectionProvider, String C_BANKSTATEMENT_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT BL.AD_ORG_ID, BL.LINE, BL.DESCRIPTION, BL.C_CHARGE_ID, BL.CHARGEAMT," +
      "      BL.DATEACCT, BL.C_BANKSTATEMENTLINE_ID, BL.VALUTADATE, BL.C_DEBT_PAYMENT_ID," +
      "      BL.STMTAMT, BL.TRXAMT, DP.C_BPARTNER_ID AS C_BPARTNER_ID, DP.ISMANUAL AS ISMANUAL,  " +
      "      bl.CONVERTCHARGEAMT, bl.C_Currency_ID, BL.C_GLITEM_ID, '' AS glitem_credit_acct, '' AS glitem_debit_acct," +
      "      DP.C_Project_ID AS C_Project_ID" +
      "      FROM C_BANKSTATEMENTLINE BL left join C_DEBT_PAYMENT DP on BL.C_DEBT_PAYMENT_ID = DP.C_DEBT_PAYMENT_ID" +
      "      WHERE C_BANKSTATEMENT_ID = ? " +
      "      ORDER BY BL.DATEACCT, LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BANKSTATEMENT_ID);

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
        DocLineBankData objectDocLineBankData = new DocLineBankData();
        objectDocLineBankData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocLineBankData.line = UtilSql.getValue(result, "LINE");
        objectDocLineBankData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocLineBankData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocLineBankData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocLineBankData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocLineBankData.cBankstatementlineId = UtilSql.getValue(result, "C_BANKSTATEMENTLINE_ID");
        objectDocLineBankData.valutadate = UtilSql.getDateValue(result, "VALUTADATE", "dd-MM-yyyy");
        objectDocLineBankData.cDebtPaymentId = UtilSql.getValue(result, "C_DEBT_PAYMENT_ID");
        objectDocLineBankData.stmtamt = UtilSql.getValue(result, "STMTAMT");
        objectDocLineBankData.trxamt = UtilSql.getValue(result, "TRXAMT");
        objectDocLineBankData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocLineBankData.ismanual = UtilSql.getValue(result, "ISMANUAL");
        objectDocLineBankData.convertchargeamt = UtilSql.getValue(result, "CONVERTCHARGEAMT");
        objectDocLineBankData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocLineBankData.cGlitemId = UtilSql.getValue(result, "C_GLITEM_ID");
        objectDocLineBankData.glitemCreditAcct = UtilSql.getValue(result, "GLITEM_CREDIT_ACCT");
        objectDocLineBankData.glitemDebitAcct = UtilSql.getValue(result, "GLITEM_DEBIT_ACCT");
        objectDocLineBankData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocLineBankData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineBankData);
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
    DocLineBankData objectDocLineBankData[] = new DocLineBankData[vector.size()];
    vector.copyInto(objectDocLineBankData);
    return(objectDocLineBankData);
  }

  public static String selectChargeAccount(ConnectionProvider connectionProvider, String cBankaccountId, String cAcctschemaId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select b_expense_acct from c_bankaccount_acct" +
      "      where c_bankaccount_id = ?" +
      "      and c_acctschema_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "B_EXPENSE_ACCT");
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

  public static String selectLinesPeriodClosed(ConnectionProvider connectionProvider, String cBankaccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT COUNT(*) AS COUNT" +
      "      FROM C_BANKSTATEMENTLINE BL" +
      "      WHERE C_CHK_OPEN_PERIOD(BL.AD_Org_ID, BL.DATEACCT, 'CMB', NULL)<>1" +
      "      AND C_BANKSTATEMENT_ID = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankaccountId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COUNT");
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

  public static DocLineBankData[] selectGlitem(ConnectionProvider connectionProvider, String C_Glitem_ID, String C_AcctSchema_ID)    throws ServletException {
    return selectGlitem(connectionProvider, C_Glitem_ID, C_AcctSchema_ID, 0, 0);
  }

  public static DocLineBankData[] selectGlitem(ConnectionProvider connectionProvider, String C_Glitem_ID, String C_AcctSchema_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT GLITEM_DEBIT_ACCT, GLITEM_CREDIT_ACCT" +
      "    FROM C_GLITEM_ACCT " +
      "    WHERE C_GLITEM_id = ?" +
      "    AND C_ACCTSCHEMA_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Glitem_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_AcctSchema_ID);

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
        DocLineBankData objectDocLineBankData = new DocLineBankData();
        objectDocLineBankData.glitemDebitAcct = UtilSql.getValue(result, "GLITEM_DEBIT_ACCT");
        objectDocLineBankData.glitemCreditAcct = UtilSql.getValue(result, "GLITEM_CREDIT_ACCT");
        objectDocLineBankData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineBankData);
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
    DocLineBankData objectDocLineBankData[] = new DocLineBankData[vector.size()];
    vector.copyInto(objectDocLineBankData);
    return(objectDocLineBankData);
  }
}
