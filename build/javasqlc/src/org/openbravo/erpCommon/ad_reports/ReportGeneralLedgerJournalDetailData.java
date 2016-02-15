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

class ReportGeneralLedgerJournalDetailData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportGeneralLedgerJournalDetailData.class);
  private String InitRecordNumber="0";
  public String identifier;
  public String dateacct;
  public String dp;
  public String display1;
  public String display2;
  public String value;
  public String name;
  public String amtacctdr;
  public String amtacctcr;
  public String description;
  public String ord;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("IDENTIFIER"))
      return identifier;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("DP"))
      return dp;
    else if (fieldName.equalsIgnoreCase("DISPLAY1"))
      return display1;
    else if (fieldName.equalsIgnoreCase("DISPLAY2"))
      return display2;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("AMTACCTDR"))
      return amtacctdr;
    else if (fieldName.equalsIgnoreCase("AMTACCTCR"))
      return amtacctcr;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ORD"))
      return ord;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportGeneralLedgerJournalDetailData[] select(ConnectionProvider connectionProvider, String factAcctGroupId, String dateacct)    throws ServletException {
    return select(connectionProvider, factAcctGroupId, dateacct, 0, 0);
  }

  public static ReportGeneralLedgerJournalDetailData[] select(ConnectionProvider connectionProvider, String factAcctGroupId, String dateacct, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT F.FACT_ACCT_GROUP_ID AS IDENTIFIER, F.DATEACCT, F.C_ACCTSCHEMA_ID || '/' ||F.RECORD_ID2 AS DP, (CASE WHEN RECORD_ID2 IS NULL THEN 'none' END) AS DISPLAY1, (CASE WHEN RECORD_ID2 IS NOT NULL THEN 'none' END) AS DISPLAY2, " +
      "        F.ACCTVALUE AS VALUE, F.ACCTDESCRIPTION AS NAME," +
      "        (CASE F.AMTACCTDR WHEN 0 THEN NULL ELSE F.AMTACCTDR END) AS AMTACCTDR, (CASE F.AMTACCTCR WHEN 0 THEN NULL ELSE F.AMTACCTCR END) AS AMTACCTCR, F.DESCRIPTION," +
      "        (CASE AMTACCTCR WHEN 0 THEN 0 ELSE 1 END) AS ORD" +
      "        FROM FACT_ACCT F" +
      "        WHERE FACT_ACCT_GROUP_ID = ?" +
      "        AND (DATEACCT = TO_DATE(?) OR TO_DATE(?) = NULL)" +
      "        ORDER BY F.FACT_ACCT_GROUP_ID,ORD,F.SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, factAcctGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);

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
        ReportGeneralLedgerJournalDetailData objectReportGeneralLedgerJournalDetailData = new ReportGeneralLedgerJournalDetailData();
        objectReportGeneralLedgerJournalDetailData.identifier = UtilSql.getValue(result, "IDENTIFIER");
        objectReportGeneralLedgerJournalDetailData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectReportGeneralLedgerJournalDetailData.dp = UtilSql.getValue(result, "DP");
        objectReportGeneralLedgerJournalDetailData.display1 = UtilSql.getValue(result, "DISPLAY1");
        objectReportGeneralLedgerJournalDetailData.display2 = UtilSql.getValue(result, "DISPLAY2");
        objectReportGeneralLedgerJournalDetailData.value = UtilSql.getValue(result, "VALUE");
        objectReportGeneralLedgerJournalDetailData.name = UtilSql.getValue(result, "NAME");
        objectReportGeneralLedgerJournalDetailData.amtacctdr = UtilSql.getValue(result, "AMTACCTDR");
        objectReportGeneralLedgerJournalDetailData.amtacctcr = UtilSql.getValue(result, "AMTACCTCR");
        objectReportGeneralLedgerJournalDetailData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectReportGeneralLedgerJournalDetailData.ord = UtilSql.getValue(result, "ORD");
        objectReportGeneralLedgerJournalDetailData.rownum = Long.toString(countRecord);
        objectReportGeneralLedgerJournalDetailData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportGeneralLedgerJournalDetailData);
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
    ReportGeneralLedgerJournalDetailData objectReportGeneralLedgerJournalDetailData[] = new ReportGeneralLedgerJournalDetailData[vector.size()];
    vector.copyInto(objectReportGeneralLedgerJournalDetailData);
    return(objectReportGeneralLedgerJournalDetailData);
  }

  public static ReportGeneralLedgerJournalDetailData[] selectByDP(ConnectionProvider connectionProvider, String DPid, String acctSchema)    throws ServletException {
    return selectByDP(connectionProvider, DPid, acctSchema, 0, 0);
  }

  public static ReportGeneralLedgerJournalDetailData[] selectByDP(ConnectionProvider connectionProvider, String DPid, String acctSchema, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT F.FACT_ACCT_GROUP_ID AS IDENTIFIER, F.DATEACCT, F.C_ACCTSCHEMA_ID || '/' ||F.RECORD_ID2 AS DP, (CASE WHEN RECORD_ID2 IS NULL THEN 'none' END) AS DISPLAY1, (CASE WHEN RECORD_ID2 IS NOT NULL THEN 'none' END) AS DISPLAY2, " +
      "        F.ACCTVALUE AS VALUE, F.ACCTDESCRIPTION AS NAME," +
      "        (CASE F.AMTACCTDR WHEN 0 THEN NULL ELSE F.AMTACCTDR END) AS AMTACCTDR, (CASE F.AMTACCTCR WHEN 0 THEN NULL ELSE F.AMTACCTCR END) AS AMTACCTCR, F.DESCRIPTION," +
      "        (CASE AMTACCTCR WHEN 0 THEN 0 ELSE 1 END) AS ORD" +
      "        FROM FACT_ACCT F" +
      "        WHERE FACT_ACCT_GROUP_ID IN (SELECT DISTINCT FACT_ACCT_GROUP_ID" +
      "                                       FROM FACT_ACCT" +
      "                                      WHERE RECORD_ID2=?" +
      "                                      AND C_ACCTSCHEMA_ID=?)" +
      "        ORDER BY F.DATEACCT, F.FACT_ACCT_GROUP_ID, ORD, F.SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DPid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctSchema);

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
        ReportGeneralLedgerJournalDetailData objectReportGeneralLedgerJournalDetailData = new ReportGeneralLedgerJournalDetailData();
        objectReportGeneralLedgerJournalDetailData.identifier = UtilSql.getValue(result, "IDENTIFIER");
        objectReportGeneralLedgerJournalDetailData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectReportGeneralLedgerJournalDetailData.dp = UtilSql.getValue(result, "DP");
        objectReportGeneralLedgerJournalDetailData.display1 = UtilSql.getValue(result, "DISPLAY1");
        objectReportGeneralLedgerJournalDetailData.display2 = UtilSql.getValue(result, "DISPLAY2");
        objectReportGeneralLedgerJournalDetailData.value = UtilSql.getValue(result, "VALUE");
        objectReportGeneralLedgerJournalDetailData.name = UtilSql.getValue(result, "NAME");
        objectReportGeneralLedgerJournalDetailData.amtacctdr = UtilSql.getValue(result, "AMTACCTDR");
        objectReportGeneralLedgerJournalDetailData.amtacctcr = UtilSql.getValue(result, "AMTACCTCR");
        objectReportGeneralLedgerJournalDetailData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectReportGeneralLedgerJournalDetailData.ord = UtilSql.getValue(result, "ORD");
        objectReportGeneralLedgerJournalDetailData.rownum = Long.toString(countRecord);
        objectReportGeneralLedgerJournalDetailData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportGeneralLedgerJournalDetailData);
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
    ReportGeneralLedgerJournalDetailData objectReportGeneralLedgerJournalDetailData[] = new ReportGeneralLedgerJournalDetailData[vector.size()];
    vector.copyInto(objectReportGeneralLedgerJournalDetailData);
    return(objectReportGeneralLedgerJournalDetailData);
  }
}