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

class ReportCashFlowData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportCashFlowData.class);
  private String InitRecordNumber="0";
  public String parent;
  public String id;
  public String name;
  public String description;
  public String issummary;
  public String isshown;
  public String nodeId;
  public String total;
  public String filteredbyorganization;
  public String temporaryfiltertype;
  public String value;
  public String levelAccount;
  public String classAccount;
  public String classStyle;
  public String padre;
  public String startdate;
  public String enddate;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PARENT"))
      return parent;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ISSUMMARY"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("ISSHOWN"))
      return isshown;
    else if (fieldName.equalsIgnoreCase("NODE_ID") || fieldName.equals("nodeId"))
      return nodeId;
    else if (fieldName.equalsIgnoreCase("TOTAL"))
      return total;
    else if (fieldName.equalsIgnoreCase("FILTEREDBYORGANIZATION"))
      return filteredbyorganization;
    else if (fieldName.equalsIgnoreCase("TEMPORARYFILTERTYPE"))
      return temporaryfiltertype;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("LEVEL_ACCOUNT") || fieldName.equals("levelAccount"))
      return levelAccount;
    else if (fieldName.equalsIgnoreCase("CLASS_ACCOUNT") || fieldName.equals("classAccount"))
      return classAccount;
    else if (fieldName.equalsIgnoreCase("CLASS_STYLE") || fieldName.equals("classStyle"))
      return classStyle;
    else if (fieldName.equalsIgnoreCase("PADRE"))
      return padre;
    else if (fieldName.equalsIgnoreCase("STARTDATE"))
      return startdate;
    else if (fieldName.equalsIgnoreCase("ENDDATE"))
      return enddate;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportCashFlowData[] select(ConnectionProvider connectionProvider, String parent, String level, String adClientId, String adOrgId, String periodFrom, String periodTo, String accountId, String adAccountingElementId, String acctschema)    throws ServletException {
    return select(connectionProvider, parent, level, adClientId, adOrgId, periodFrom, periodTo, accountId, adAccountingElementId, acctschema, 0, 0);
  }

  public static ReportCashFlowData[] select(ConnectionProvider connectionProvider, String parent, String level, String adClientId, String adOrgId, String periodFrom, String periodTo, String accountId, String adAccountingElementId, String acctschema, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT ? as PARENT, AR.AD_ACCOUNTINGRPT_ELEMENT_ID AS ID, AR.NAME, AR.DESCRIPTION, AR.ISSUMMARY, AR.ISSHOWN," +
      "          AD_TREENODE.NODE_ID, COALESCE(CASE" +
      "          AR.ISSUMMARY WHEN 'N' THEN      sum(amount) ELSE 0 END,0) AS TOTAL, AR.FILTEREDBYORGANIZATION," +
      "          AR.TEMPORARYFILTERTYPE, '' AS VALUE, ? AS LEVEL_ACCOUNT, (CASE TO_NUMBER(?) WHEN 0 THEN" +
      "          '' ELSE '' END) AS CLASS_ACCOUNT, 'TEXT-INDENT: '||TO_CHAR(TO_NUMBER(?)*10)||'pt' AS CLASS_STYLE," +
      "          '' AS PADRE, '' AS STARTDATE, '' AS ENDDATE" +
      "          FROM AD_ACCOUNTINGRPT_ELEMENT AR left join (SELECT AMOUNT, C_ACCTSCHEMA_ID" +
      "          FROM FACT_ACCT, FACT_ACCT_CFS" +
      "          WHERE FACT_ACCT.AD_CLIENT_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ")" +
      "          AND FACT_ACCT.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")" +
      "		  AND FACT_ACCT.FACT_ACCT_ID = FACT_ACCT_CFS.FACT_ACCT_ID" +
      "          AND 1=1";
    strSql = strSql + ((periodFrom==null || periodFrom.equals(""))?"":"  AND FACT_ACCT.DATEACCT >= TO_DATE(?) ");
    strSql = strSql + ((periodTo==null || periodTo.equals(""))?"":"  AND FACT_ACCT.DATEACCT < TO_DATE(?) ");
    strSql = strSql + ((accountId==null || accountId.equals(""))?"":"  AND FACT_ACCT_CFS.ACCOUNT_ID = ? ");
    strSql = strSql + 
      ") A on AR.C_ACCTSCHEMA_ID = A.C_ACCTSCHEMA_ID," +
      "          AD_TREE, AD_TREENODE" +
      "          WHERE AD_TREE.AD_TREE_ID = AD_TREENODE.AD_TREE_ID" +
      "          AND AD_TREENODE.NODE_ID = AR.AD_ACCOUNTINGRPT_ELEMENT_ID" +
      "          AND AR.AD_ACCOUNTINGRPT_ELEMENT_ID = ?" +
      "          AND AR.C_ACCTSCHEMA_ID = ?" +
      "          AND AD_TREE.TREETYPE = 'AR'" +
      "          GROUP BY REPORT_TYPE, AR.AD_ACCOUNTINGRPT_ELEMENT_ID, AR.NAME, AR.DESCRIPTION, AR.ISSUMMARY, AR.ISSHOWN," +
      "          AD_TREENODE.NODE_ID," +
      "          AR.FILTEREDBYORGANIZATION, AR.TEMPORARYFILTERTYPE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parent);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, level);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, level);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, level);
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      if (adOrgId != null && !(adOrgId.equals(""))) {
        }
      if (periodFrom != null && !(periodFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodFrom);
      }
      if (periodTo != null && !(periodTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodTo);
      }
      if (accountId != null && !(accountId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAccountingElementId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);

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
        ReportCashFlowData objectReportCashFlowData = new ReportCashFlowData();
        objectReportCashFlowData.parent = UtilSql.getValue(result, "PARENT");
        objectReportCashFlowData.id = UtilSql.getValue(result, "ID");
        objectReportCashFlowData.name = UtilSql.getValue(result, "NAME");
        objectReportCashFlowData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectReportCashFlowData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectReportCashFlowData.isshown = UtilSql.getValue(result, "ISSHOWN");
        objectReportCashFlowData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectReportCashFlowData.total = UtilSql.getValue(result, "TOTAL");
        objectReportCashFlowData.filteredbyorganization = UtilSql.getValue(result, "FILTEREDBYORGANIZATION");
        objectReportCashFlowData.temporaryfiltertype = UtilSql.getValue(result, "TEMPORARYFILTERTYPE");
        objectReportCashFlowData.value = UtilSql.getValue(result, "VALUE");
        objectReportCashFlowData.levelAccount = UtilSql.getValue(result, "LEVEL_ACCOUNT");
        objectReportCashFlowData.classAccount = UtilSql.getValue(result, "CLASS_ACCOUNT");
        objectReportCashFlowData.classStyle = UtilSql.getValue(result, "CLASS_STYLE");
        objectReportCashFlowData.padre = UtilSql.getValue(result, "PADRE");
        objectReportCashFlowData.startdate = UtilSql.getValue(result, "STARTDATE");
        objectReportCashFlowData.enddate = UtilSql.getValue(result, "ENDDATE");
        objectReportCashFlowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportCashFlowData);
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
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[vector.size()];
    vector.copyInto(objectReportCashFlowData);
    return(objectReportCashFlowData);
  }

  public static ReportCashFlowData[] set()    throws ServletException {
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[1];
    objectReportCashFlowData[0] = new ReportCashFlowData();
    objectReportCashFlowData[0].parent = "";
    objectReportCashFlowData[0].id = "";
    objectReportCashFlowData[0].name = "";
    objectReportCashFlowData[0].description = "";
    objectReportCashFlowData[0].issummary = "";
    objectReportCashFlowData[0].isshown = "";
    objectReportCashFlowData[0].nodeId = "";
    objectReportCashFlowData[0].total = "";
    objectReportCashFlowData[0].filteredbyorganization = "";
    objectReportCashFlowData[0].temporaryfiltertype = "";
    objectReportCashFlowData[0].value = "";
    objectReportCashFlowData[0].levelAccount = "";
    objectReportCashFlowData[0].classAccount = "";
    objectReportCashFlowData[0].classStyle = "";
    objectReportCashFlowData[0].padre = "";
    objectReportCashFlowData[0].startdate = "";
    objectReportCashFlowData[0].enddate = "";
    return objectReportCashFlowData;
  }

  public static ReportCashFlowData[] selectMissingEntries(ConnectionProvider connectionProvider, String adClientId, String adOrgId, String acctschema, String periodFrom, String periodTo, String currentClient)    throws ServletException {
    return selectMissingEntries(connectionProvider, adClientId, adOrgId, acctschema, periodFrom, periodTo, currentClient, 0, 0);
  }

  public static ReportCashFlowData[] selectMissingEntries(ConnectionProvider connectionProvider, String adClientId, String adOrgId, String acctschema, String periodFrom, String periodTo, String currentClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT 1 as ID" +
      "        FROM FACT_ACCT" +
      "        WHERE FACT_ACCT.AD_CLIENT_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ")" +
      "        AND FACT_ACCT.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")" +
      "        AND FACT_ACCT.AD_TABLE_ID IN ('392','407')" +
      "        AND LINE_ID IS NOT NULL" +
      "        AND 1=1";
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND FACT_ACCT.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + ((periodFrom==null || periodFrom.equals(""))?"":"  AND FACT_ACCT.DATEACCT >= TO_DATE(?) ");
    strSql = strSql + ((periodTo==null || periodTo.equals(""))?"":"  AND FACT_ACCT.DATEACCT < TO_DATE(?) ");
    strSql = strSql + 
      "        AND AD_CLIENT_ID = ?" +
      "        AND NOT EXISTS (SELECT 1 FROM FACT_ACCT_CFS" +
      "                WHERE FACT_ACCT.FACT_ACCT_ID = FACT_ACCT_CFS.FACT_ACCT_ID)";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      if (adOrgId != null && !(adOrgId.equals(""))) {
        }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (periodFrom != null && !(periodFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodFrom);
      }
      if (periodTo != null && !(periodTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodTo);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currentClient);

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
        ReportCashFlowData objectReportCashFlowData = new ReportCashFlowData();
        objectReportCashFlowData.id = UtilSql.getValue(result, "ID");
        objectReportCashFlowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportCashFlowData);
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
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[vector.size()];
    vector.copyInto(objectReportCashFlowData);
    return(objectReportCashFlowData);
  }

  public static ReportCashFlowData[] selectChild(ConnectionProvider connectionProvider, String adClientId, String adOrgId, String adAccountingElementId, String tree)    throws ServletException {
    return selectChild(connectionProvider, adClientId, adOrgId, adAccountingElementId, tree, 0, 0);
  }

  public static ReportCashFlowData[] selectChild(ConnectionProvider connectionProvider, String adClientId, String adOrgId, String adAccountingElementId, String tree, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AR.AD_ACCOUNTINGRPT_ELEMENT_ID AS ID, AR.NAME, AR.DESCRIPTION, AR.ISSUMMARY, AR.ISSHOWN, AD_TREENODE.NODE_ID," +
      "      AR.FILTEREDBYORGANIZATION, AR.TEMPORARYFILTERTYPE" +
      "      FROM AD_TREE, AD_TREENODE, AD_ACCOUNTINGRPT_ELEMENT AR" +
      "      WHERE AD_TREE.AD_TREE_ID = AD_TREENODE.AD_TREE_ID" +
      "      AND AD_TREENODE.NODE_ID = AR.AD_ACCOUNTINGRPT_ELEMENT_ID" +
      "      AND AR.AD_CLIENT_ID IN (";
    strSql = strSql + ((adClientId==null || adClientId.equals(""))?"":adClientId);
    strSql = strSql + 
      ")" +
      "      AND AR.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgId==null || adOrgId.equals(""))?"":adOrgId);
    strSql = strSql + 
      ")" +
      "      AND AD_TREENODE.PARENT_ID = ?" +
      "      AND AD_TREE.AD_TREE_ID = ?" +
      "      GROUP BY AR.AD_ACCOUNTINGRPT_ELEMENT_ID, AR.NAME, AR.DESCRIPTION, AR.ISSUMMARY, AR.ISSHOWN, AD_TREENODE.NODE_ID," +
      "      AR.FILTEREDBYORGANIZATION, AR.TEMPORARYFILTERTYPE, AD_TREENODE.SEQNO" +
      "      ORDER BY AD_TREENODE.SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adClientId != null && !(adClientId.equals(""))) {
        }
      if (adOrgId != null && !(adOrgId.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAccountingElementId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tree);

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
        ReportCashFlowData objectReportCashFlowData = new ReportCashFlowData();
        objectReportCashFlowData.id = UtilSql.getValue(result, "ID");
        objectReportCashFlowData.name = UtilSql.getValue(result, "NAME");
        objectReportCashFlowData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectReportCashFlowData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectReportCashFlowData.isshown = UtilSql.getValue(result, "ISSHOWN");
        objectReportCashFlowData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectReportCashFlowData.filteredbyorganization = UtilSql.getValue(result, "FILTEREDBYORGANIZATION");
        objectReportCashFlowData.temporaryfiltertype = UtilSql.getValue(result, "TEMPORARYFILTERTYPE");
        objectReportCashFlowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportCashFlowData);
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
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[vector.size()];
    vector.copyInto(objectReportCashFlowData);
    return(objectReportCashFlowData);
  }

  public static String selectTree(ConnectionProvider connectionProvider, String client)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_TREE_ID AS ID FROM AD_TREE" +
      "        WHERE TREETYPE = 'AR'" +
      "        AND AD_CLIENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ID");
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

  public static ReportCashFlowData[] selectOrg(ConnectionProvider connectionProvider, String adOrgId, String adClientId)    throws ServletException {
    return selectOrg(connectionProvider, adOrgId, adClientId, 0, 0);
  }

  public static ReportCashFlowData[] selectOrg(ConnectionProvider connectionProvider, String adOrgId, String adClientId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_ORG.AD_ORG_ID AS ID, AD_ORG.NAME, AD_ORG.ISSUMMARY, AD_TREENODE.NODE_ID" +
      "      FROM AD_CLIENTINFO, AD_TREENODE, AD_ORG" +
      "      WHERE AD_CLIENTINFO.AD_TREE_ORG_ID = AD_TREENODE.AD_TREE_ID" +
      "      AND AD_TREENODE.NODE_ID = AD_ORG.AD_ORG_ID" +
      "      AND AD_TREENODE.PARENT_ID = ?" +
      "      AND AD_CLIENTINFO.AD_CLIENT_ID = ?" +
      "      ORDER BY ISSUMMARY DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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
        ReportCashFlowData objectReportCashFlowData = new ReportCashFlowData();
        objectReportCashFlowData.id = UtilSql.getValue(result, "ID");
        objectReportCashFlowData.name = UtilSql.getValue(result, "NAME");
        objectReportCashFlowData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectReportCashFlowData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectReportCashFlowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportCashFlowData);
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
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[vector.size()];
    vector.copyInto(objectReportCashFlowData);
    return(objectReportCashFlowData);
  }

  public static String processId(ConnectionProvider connectionProvider, String processId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_PROCESS.AD_PROCESS_ID AS ID" +
      "      FROM AD_PROCESS" +
      "      WHERE VALUE = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ID");
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

  public static String selectFormat(ConnectionProvider connectionProvider, String quarter, String dateFormat)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select TO_CHAR(TO_DATE(?), TO_CHAR(?)) from dual";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quarter);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFormat);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TO_CHAR(TO_DATE(:1),TO_CHAR(:2))");
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

  public static String selectAccounting(ConnectionProvider connectionProvider, String adAccountingrptElementId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ACCOUNT_ID AS ID" +
      "        FROM AD_ACCOUNTINGRPT_ELEMENT" +
      "        WHERE AD_ACCOUNTINGRPT_ELEMENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAccountingrptElementId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ID");
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

  public static ReportCashFlowData[] selectAD_Accountingrpt_Element_ID(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String adAccountingrptElementId, String acctschema)    throws ServletException {
    return selectAD_Accountingrpt_Element_ID(connectionProvider, adOrgClient, adUserClient, adAccountingrptElementId, acctschema, 0, 0);
  }

  public static ReportCashFlowData[] selectAD_Accountingrpt_Element_ID(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String adAccountingrptElementId, String acctschema, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_ACCOUNTINGRPT_ELEMENT_ID AS ID, NAME, FILTEREDBYORGANIZATION, TEMPORARYFILTERTYPE" +
      "      FROM AD_ACCOUNTINGRPT_ELEMENT" +
      "      WHERE AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND ISREPORT='Y'" +
      "      AND (isActive = 'Y' OR AD_ACCOUNTINGRPT_ELEMENT_ID = ? )" +
      "      AND 1=1";
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND C_ACCTSCHEMA_ID = ? ");

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAccountingrptElementId);
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
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
        ReportCashFlowData objectReportCashFlowData = new ReportCashFlowData();
        objectReportCashFlowData.id = UtilSql.getValue(result, "ID");
        objectReportCashFlowData.name = UtilSql.getValue(result, "NAME");
        objectReportCashFlowData.filteredbyorganization = UtilSql.getValue(result, "FILTEREDBYORGANIZATION");
        objectReportCashFlowData.temporaryfiltertype = UtilSql.getValue(result, "TEMPORARYFILTERTYPE");
        objectReportCashFlowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportCashFlowData);
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
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[vector.size()];
    vector.copyInto(objectReportCashFlowData);
    return(objectReportCashFlowData);
  }

  public static ReportCashFlowData[] selectAD_Accountingrpt_Element_ID_Double(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String adAccountingrptElementId)    throws ServletException {
    return selectAD_Accountingrpt_Element_ID_Double(connectionProvider, adOrgClient, adUserClient, adAccountingrptElementId, 0, 0);
  }

  public static ReportCashFlowData[] selectAD_Accountingrpt_Element_ID_Double(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String adAccountingrptElementId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_ACCTSCHEMA_ID AS PADRE, AD_ACCOUNTINGRPT_ELEMENT_ID AS ID, NAME, FILTEREDBYORGANIZATION, TEMPORARYFILTERTYPE" +
      "      FROM AD_ACCOUNTINGRPT_ELEMENT" +
      "      WHERE AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND TEMPORARYFILTERTYPE IN ('A','M')" +
      "      AND ISREPORT='Y'" +
      "      AND (isActive = 'Y' OR AD_ACCOUNTINGRPT_ELEMENT_ID = ? )" +
      "      AND 1=1";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAccountingrptElementId);

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
        ReportCashFlowData objectReportCashFlowData = new ReportCashFlowData();
        objectReportCashFlowData.padre = UtilSql.getValue(result, "PADRE");
        objectReportCashFlowData.id = UtilSql.getValue(result, "ID");
        objectReportCashFlowData.name = UtilSql.getValue(result, "NAME");
        objectReportCashFlowData.filteredbyorganization = UtilSql.getValue(result, "FILTEREDBYORGANIZATION");
        objectReportCashFlowData.temporaryfiltertype = UtilSql.getValue(result, "TEMPORARYFILTERTYPE");
        objectReportCashFlowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportCashFlowData);
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
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[vector.size()];
    vector.copyInto(objectReportCashFlowData);
    return(objectReportCashFlowData);
  }

  public static String selectType(ConnectionProvider connectionProvider, String adAccountingrptElementId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT TEMPORARYFILTERTYPE" +
      "      FROM AD_ACCOUNTINGRPT_ELEMENT" +
      "      WHERE AD_ACCOUNTINGRPT_ELEMENT_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adAccountingrptElementId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TEMPORARYFILTERTYPE");
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

  public static ReportCashFlowData[] selectCombo(ConnectionProvider connectionProvider, String adLanguage, String adClient, String adOrg)    throws ServletException {
    return selectCombo(connectionProvider, adLanguage, adClient, adOrg, 0, 0);
  }

  public static ReportCashFlowData[] selectCombo(ConnectionProvider connectionProvider, String adLanguage, String adClient, String adOrg, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT 'M' AS VALUE, C_PERIOD_ID AS ID, AD_COLUMN_IDENTIFIER('C_PERIOD',C_PERIOD_ID,?) AS NAME" +
      "      FROM C_PERIOD" +
      "      WHERE AD_CLIENT_ID IN (";
    strSql = strSql + ((adClient==null || adClient.equals(""))?"":adClient);
    strSql = strSql + 
      ")" +
      "        AND AD_ORG_ID IN (";
    strSql = strSql + ((adOrg==null || adOrg.equals(""))?"":adOrg);
    strSql = strSql + 
      ")" +
      "      UNION " +
      "      SELECT 'A' AS VALUE, C_YEAR_ID AS ID, AD_COLUMN_IDENTIFIER('C_YEAR', C_YEAR_ID, ?) AS NAME" +
      "      FROM C_YEAR" +
      "      WHERE AD_CLIENT_ID  IN (";
    strSql = strSql + ((adClient==null || adClient.equals(""))?"":adClient);
    strSql = strSql + 
      ")" +
      "        AND AD_ORG_ID  IN (";
    strSql = strSql + ((adOrg==null || adOrg.equals(""))?"":adOrg);
    strSql = strSql + 
      ")";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adClient != null && !(adClient.equals(""))) {
        }
      if (adOrg != null && !(adOrg.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adClient != null && !(adClient.equals(""))) {
        }
      if (adOrg != null && !(adOrg.equals(""))) {
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
        ReportCashFlowData objectReportCashFlowData = new ReportCashFlowData();
        objectReportCashFlowData.value = UtilSql.getValue(result, "VALUE");
        objectReportCashFlowData.id = UtilSql.getValue(result, "ID");
        objectReportCashFlowData.name = UtilSql.getValue(result, "NAME");
        objectReportCashFlowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportCashFlowData);
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
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[vector.size()];
    vector.copyInto(objectReportCashFlowData);
    return(objectReportCashFlowData);
  }

  public static ReportCashFlowData[] startEndMonth(ConnectionProvider connectionProvider, String cPeriodId)    throws ServletException {
    return startEndMonth(connectionProvider, cPeriodId, 0, 0);
  }

  public static ReportCashFlowData[] startEndMonth(ConnectionProvider connectionProvider, String cPeriodId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT STARTDATE, ENDDATE+1 AS ENDDATE" +
      "      FROM C_PERIOD" +
      "      WHERE C_PERIOD_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPeriodId);

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
        ReportCashFlowData objectReportCashFlowData = new ReportCashFlowData();
        objectReportCashFlowData.startdate = UtilSql.getDateValue(result, "STARTDATE", "dd-MM-yyyy");
        objectReportCashFlowData.enddate = UtilSql.getDateValue(result, "ENDDATE", "dd-MM-yyyy");
        objectReportCashFlowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportCashFlowData);
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
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[vector.size()];
    vector.copyInto(objectReportCashFlowData);
    return(objectReportCashFlowData);
  }

  public static ReportCashFlowData[] startEndYear(ConnectionProvider connectionProvider, String cYearId)    throws ServletException {
    return startEndYear(connectionProvider, cYearId, 0, 0);
  }

  public static ReportCashFlowData[] startEndYear(ConnectionProvider connectionProvider, String cYearId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select min(startdate) as startdate, max(enddate)+1 as enddate " +
      "      from c_period " +
      "      where c_year_id=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cYearId);

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
        ReportCashFlowData objectReportCashFlowData = new ReportCashFlowData();
        objectReportCashFlowData.startdate = UtilSql.getDateValue(result, "STARTDATE", "dd-MM-yyyy");
        objectReportCashFlowData.enddate = UtilSql.getDateValue(result, "ENDDATE", "dd-MM-yyyy");
        objectReportCashFlowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportCashFlowData);
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
    ReportCashFlowData objectReportCashFlowData[] = new ReportCashFlowData[vector.size()];
    vector.copyInto(objectReportCashFlowData);
    return(objectReportCashFlowData);
  }
}
