//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class ReportBankJRData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportBankJRData.class);
  private String InitRecordNumber="0";
  public String name;
  public String name2;
  public String cBankaccountId;
  public String bankaccount;
  public String trxamt;
  public String payamt;
  public String bankstatementId;
  public String statementdate;
  public String begining;
  public String ending;
  public String currency;
  public String line;
  public String description;
  public String initialbalance;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("NAME2"))
      return name2;
    else if (fieldName.equalsIgnoreCase("C_BANKACCOUNT_ID") || fieldName.equals("cBankaccountId"))
      return cBankaccountId;
    else if (fieldName.equalsIgnoreCase("BANKACCOUNT"))
      return bankaccount;
    else if (fieldName.equalsIgnoreCase("TRXAMT"))
      return trxamt;
    else if (fieldName.equalsIgnoreCase("PAYAMT"))
      return payamt;
    else if (fieldName.equalsIgnoreCase("BANKSTATEMENT_ID") || fieldName.equals("bankstatementId"))
      return bankstatementId;
    else if (fieldName.equalsIgnoreCase("STATEMENTDATE"))
      return statementdate;
    else if (fieldName.equalsIgnoreCase("BEGINING"))
      return begining;
    else if (fieldName.equalsIgnoreCase("ENDING"))
      return ending;
    else if (fieldName.equalsIgnoreCase("CURRENCY"))
      return currency;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("INITIALBALANCE"))
      return initialbalance;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportBankJRData[] select(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adUserOrg, String parDateFrom, String parDateTo, String parBankaccount)    throws ServletException {
    return select(connectionProvider, adLanguage, adUserClient, adUserOrg, parDateFrom, parDateTo, parBankaccount, 0, 0);
  }

  public static ReportBankJRData[] select(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adUserOrg, String parDateFrom, String parDateTo, String parBankaccount, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_BANK.NAME AS NAME, C_BANKSTATEMENT.NAME AS NAME2, C_BANKSTATEMENT.C_BANKACCOUNT_ID AS C_BANKACCOUNT_ID, " +
      "      AD_COLUMN_IDENTIFIER('C_BANKACCOUNT',TO_CHAR(C_BANKACCOUNT.C_BANKACCOUNT_ID),?) AS bankaccount, " +
      "      C_BANKSTATEMENTLINE.STMTAMT AS TRXAMT, C_DEBT_PAYMENT.AMOUNT AS PAYAMT, C_BANKSTATEMENT.C_BANKSTATEMENT_ID AS BANKSTATEMENT_ID," +
      "      C_BANKSTATEMENTLINE.DATEACCT AS STATEMENTDATE, C_BANKSTATEMENT.BEGINNINGBALANCE AS BEGINING, C_BANKSTATEMENT.ENDINGBALANCE AS ENDING, " +
      "      C_CURRENCY.DESCRIPTION AS CURRENCY, C_BANKSTATEMENTLINE.LINE AS LINE, C_BANKSTATEMENTLINE.DESCRIPTION AS DESCRIPTION, " +
      "      INITIALBALANCE.TOTAL_AMT AS INITIALBALANCE" +
      "      FROM C_BANKSTATEMENTLINE left join C_DEBT_PAYMENT on C_BANKSTATEMENTLINE.C_DEBT_PAYMENT_ID = C_DEBT_PAYMENT.C_DEBT_PAYMENT_ID," +
      "      C_BANK, C_BANKACCOUNT, C_BANKSTATEMENT,   C_CURRENCY, (" +
      "        SELECT SUM(TOTAL_AMT) AS TOTAL_AMT, C_BANKACCOUNT_ID FROM     " +
      "	        (SELECT COALESCE(SUM(C_BANKSTATEMENTLINE.STMTAMT),0) AS TOTAL_AMT, C_BANKACCOUNT.C_BANKACCOUNT_ID" +
      "	        FROM C_BANK, C_BANKACCOUNT, C_BANKSTATEMENT, C_BANKSTATEMENTLINE" +
      "	        WHERE C_BANK.C_BANK_ID = C_BANKACCOUNT.C_BANK_ID " +
      "	        AND C_BANKACCOUNT.C_BANKACCOUNT_ID = C_BANKSTATEMENT.C_BANKACCOUNT_ID " +
      "	        AND C_BANKSTATEMENT.C_BANKSTATEMENT_ID = C_BANKSTATEMENTLINE.C_BANKSTATEMENT_ID " +
      "        	AND 3=3 AND C_BANK.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        	AND 3=3 AND C_BANK.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "	        AND C_BANKSTATEMENTLINE.DATEACCT < TO_DATE(?)" +
      "	        AND C_BANKSTATEMENT.PROCESSED='Y'" +
      "	        GROUP BY C_BANKACCOUNT.C_BANKACCOUNT_ID" +
      "	        UNION ALL" +
      "	        SELECT 0 AS TOTAL_AMT, C_BANKACCOUNT_ID" +
      "	        FROM C_BANKACCOUNT) AAA" +
      "        GROUP BY C_BANKACCOUNT_ID" +
      "      ) INITIALBALANCE" +
      "      WHERE C_BANK.c_bank_id = C_BANKACCOUNT.C_BANK_ID " +
      "      AND C_BANKACCOUNT.C_BANKACCOUNT_ID = C_BANKSTATEMENT.C_BANKACCOUNT_ID " +
      "      AND C_BANKSTATEMENT.C_BANKSTATEMENT_ID = C_BANKSTATEMENTLINE.C_BANKSTATEMENT_ID " +
      "      AND C_BANKACCOUNT.C_CURRENCY_ID = C_CURRENCY.C_CURRENCY_ID" +
      "      AND C_BANKACCOUNT.C_BANKACCOUNT_ID = INITIALBALANCE.C_BANKACCOUNT_ID" +
      "      AND 4=4 AND C_BANK.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND 4=4 AND C_BANK.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":" AND C_BANKSTATEMENTLINE.DATEACCT >= TO_DATE(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":" AND C_BANKSTATEMENTLINE.DATEACCT < TO_DATE(?) ");
    strSql = strSql + ((parBankaccount==null || parBankaccount.equals(""))?"":" AND c_bankaccount.c_bankaccount_id = ? ");
    strSql = strSql + 
      "      AND C_BANKSTATEMENT.PROCESSED='Y'" +
      "      ORDER BY STATEMENTDATE, LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (parBankaccount != null && !(parBankaccount.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parBankaccount);
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
        ReportBankJRData objectReportBankJRData = new ReportBankJRData();
        objectReportBankJRData.name = UtilSql.getValue(result, "NAME");
        objectReportBankJRData.name2 = UtilSql.getValue(result, "NAME2");
        objectReportBankJRData.cBankaccountId = UtilSql.getValue(result, "C_BANKACCOUNT_ID");
        objectReportBankJRData.bankaccount = UtilSql.getValue(result, "BANKACCOUNT");
        objectReportBankJRData.trxamt = UtilSql.getValue(result, "TRXAMT");
        objectReportBankJRData.payamt = UtilSql.getValue(result, "PAYAMT");
        objectReportBankJRData.bankstatementId = UtilSql.getValue(result, "BANKSTATEMENT_ID");
        objectReportBankJRData.statementdate = UtilSql.getDateValue(result, "STATEMENTDATE", "dd-MM-yyyy");
        objectReportBankJRData.begining = UtilSql.getValue(result, "BEGINING");
        objectReportBankJRData.ending = UtilSql.getValue(result, "ENDING");
        objectReportBankJRData.currency = UtilSql.getValue(result, "CURRENCY");
        objectReportBankJRData.line = UtilSql.getValue(result, "LINE");
        objectReportBankJRData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectReportBankJRData.initialbalance = UtilSql.getValue(result, "INITIALBALANCE");
        objectReportBankJRData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportBankJRData);
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
    ReportBankJRData objectReportBankJRData[] = new ReportBankJRData[vector.size()];
    vector.copyInto(objectReportBankJRData);
    return(objectReportBankJRData);
  }

  public static ReportBankJRData[] set()    throws ServletException {
    ReportBankJRData objectReportBankJRData[] = new ReportBankJRData[1];
    objectReportBankJRData[0] = new ReportBankJRData();
    objectReportBankJRData[0].name = "";
    objectReportBankJRData[0].name2 = "";
    objectReportBankJRData[0].cBankaccountId = "";
    objectReportBankJRData[0].bankaccount = "";
    objectReportBankJRData[0].trxamt = "";
    objectReportBankJRData[0].payamt = "";
    objectReportBankJRData[0].bankstatementId = "";
    objectReportBankJRData[0].statementdate = "";
    objectReportBankJRData[0].begining = "";
    objectReportBankJRData[0].ending = "";
    objectReportBankJRData[0].currency = "";
    objectReportBankJRData[0].line = "";
    objectReportBankJRData[0].description = "";
    objectReportBankJRData[0].initialbalance = "";
    return objectReportBankJRData;
  }
}
