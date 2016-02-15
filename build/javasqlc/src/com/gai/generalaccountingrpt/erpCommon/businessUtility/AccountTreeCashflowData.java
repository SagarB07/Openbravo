//Sqlc generated V1.O00-1
package com.gai.generalaccountingrpt.erpCommon.businessUtility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

public class AccountTreeCashflowData implements FieldProvider {
static Logger log4j = Logger.getLogger(AccountTreeCashflowData.class);
  private String InitRecordNumber="0";
  public String nodeId;
  public String parentId;
  public String seqno;
  public String id;
  public String name;
  public String description;
  public String issummary;
  public String accountsign;
  public String showelement;
  public String elementLevel;
  public String qty;
  public String qtyRef;
  public String qtyOperation;
  public String qtyOperationRef;
  public String qtycredit;
  public String qtycreditRef;
  public String showvaluecond;
  public String elementlevel;
  public String value;
  public String calculated;
  public String svcreset;
  public String svcresetref;
  public String isalwaysshown;
  public String sign;
  public String monthoftrx;
  public String accounttype;
  public String position;
  public String qtyBef;
  public String qtycreditBef;
  public String qtyOperationBef;
  public String svcresetbef;
  public String elevel;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("NODE_ID") || fieldName.equals("nodeId"))
      return nodeId;
    else if (fieldName.equalsIgnoreCase("PARENT_ID") || fieldName.equals("parentId"))
      return parentId;
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ISSUMMARY"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("ACCOUNTSIGN"))
      return accountsign;
    else if (fieldName.equalsIgnoreCase("SHOWELEMENT"))
      return showelement;
    else if (fieldName.equalsIgnoreCase("ELEMENT_LEVEL") || fieldName.equals("elementLevel"))
      return elementLevel;
    else if (fieldName.equalsIgnoreCase("QTY"))
      return qty;
    else if (fieldName.equalsIgnoreCase("QTY_REF") || fieldName.equals("qtyRef"))
      return qtyRef;
    else if (fieldName.equalsIgnoreCase("QTY_OPERATION") || fieldName.equals("qtyOperation"))
      return qtyOperation;
    else if (fieldName.equalsIgnoreCase("QTY_OPERATION_REF") || fieldName.equals("qtyOperationRef"))
      return qtyOperationRef;
    else if (fieldName.equalsIgnoreCase("QTYCREDIT"))
      return qtycredit;
    else if (fieldName.equalsIgnoreCase("QTYCREDIT_REF") || fieldName.equals("qtycreditRef"))
      return qtycreditRef;
    else if (fieldName.equalsIgnoreCase("SHOWVALUECOND"))
      return showvaluecond;
    else if (fieldName.equalsIgnoreCase("ELEMENTLEVEL"))
      return elementlevel;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("CALCULATED"))
      return calculated;
    else if (fieldName.equalsIgnoreCase("SVCRESET"))
      return svcreset;
    else if (fieldName.equalsIgnoreCase("SVCRESETREF"))
      return svcresetref;
    else if (fieldName.equalsIgnoreCase("ISALWAYSSHOWN"))
      return isalwaysshown;
    else if (fieldName.equalsIgnoreCase("SIGN"))
      return sign;
    else if (fieldName.equalsIgnoreCase("MONTHOFTRX"))
      return monthoftrx;
    else if (fieldName.equalsIgnoreCase("ACCOUNTTYPE"))
      return accounttype;
    else if (fieldName.equalsIgnoreCase("POSITION"))
      return position;
    else if (fieldName.equalsIgnoreCase("QTY_BEF") || fieldName.equals("qtyBef"))
      return qtyBef;
    else if (fieldName.equalsIgnoreCase("QTYCREDIT_BEF") || fieldName.equals("qtycreditBef"))
      return qtycreditBef;
    else if (fieldName.equalsIgnoreCase("QTY_OPERATION_BEF") || fieldName.equals("qtyOperationBef"))
      return qtyOperationBef;
    else if (fieldName.equalsIgnoreCase("SVCRESETBEF"))
      return svcresetbef;
    else if (fieldName.equalsIgnoreCase("ELEVEL"))
      return elevel;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AccountTreeCashflowData[] select(ConnectionProvider connectionProvider, String conCodigo, String adTreeId)    throws ServletException {
    return select(connectionProvider, conCodigo, adTreeId, 0, 0);
  }

  public static AccountTreeCashflowData[] select(ConnectionProvider connectionProvider, String conCodigo, String adTreeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT tn.Node_ID,tn.Parent_ID,tn.SeqNo, m.C_ElementValue_ID AS ID, " +
      "        ((CASE ? WHEN 'Y' THEN TO_CHAR(m.Value) || ' - ' ELSE '' END) || m.Name) AS NAME,m.Description, m.IsSummary, " +
      "        m.ACCOUNTSIGN, m.ShowElement, 0 as element_level, 0 as qty, 0 as qty_ref, 0 as qty_operation, 0 as qty_operation_ref, " +
      "        0 as QTYCREDIT, 0 as QTYCREDIT_REF, m.ShowValueCond, m.ElementLevel, m.Value, " +
      "        'N' AS CALCULATED, 'N' AS SVCRESET, 'N' AS SVCRESETREF, m.isalwaysshown, '' as sign," +
      "        '' as monthoftrx, m.accounttype, m.EM_Gar_Position as position, 0 AS QTY_BEF, 0 AS QTYCREDIT_BEF, 0 AS qty_operation_bef, 'N' AS SVCRESETBEF" +
      "		, m.ElementLevel as elevel" +
      "        FROM AD_TreeNode tn, C_ElementValue m" +
      "        WHERE tn.IsActive='Y' " +
      "        AND tn.Node_ID = m.C_ElementValue_ID " +
      "        AND tn.AD_Tree_ID = ? " +
      "        ORDER BY m.EM_Gar_Position, m.value";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, conCodigo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTreeId);

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
        AccountTreeCashflowData objectAccountTreeCashflowData = new AccountTreeCashflowData();
        objectAccountTreeCashflowData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeCashflowData.parentId = UtilSql.getValue(result, "PARENT_ID");
        objectAccountTreeCashflowData.seqno = UtilSql.getValue(result, "SEQNO");
        objectAccountTreeCashflowData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeCashflowData.name = UtilSql.getValue(result, "NAME");
        objectAccountTreeCashflowData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAccountTreeCashflowData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectAccountTreeCashflowData.accountsign = UtilSql.getValue(result, "ACCOUNTSIGN");
        objectAccountTreeCashflowData.showelement = UtilSql.getValue(result, "SHOWELEMENT");
        objectAccountTreeCashflowData.elementLevel = UtilSql.getValue(result, "ELEMENT_LEVEL");
        objectAccountTreeCashflowData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeCashflowData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeCashflowData.qtyOperation = UtilSql.getValue(result, "QTY_OPERATION");
        objectAccountTreeCashflowData.qtyOperationRef = UtilSql.getValue(result, "QTY_OPERATION_REF");
        objectAccountTreeCashflowData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeCashflowData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeCashflowData.showvaluecond = UtilSql.getValue(result, "SHOWVALUECOND");
        objectAccountTreeCashflowData.elementlevel = UtilSql.getValue(result, "ELEMENTLEVEL");
        objectAccountTreeCashflowData.value = UtilSql.getValue(result, "VALUE");
        objectAccountTreeCashflowData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectAccountTreeCashflowData.svcreset = UtilSql.getValue(result, "SVCRESET");
        objectAccountTreeCashflowData.svcresetref = UtilSql.getValue(result, "SVCRESETREF");
        objectAccountTreeCashflowData.isalwaysshown = UtilSql.getValue(result, "ISALWAYSSHOWN");
        objectAccountTreeCashflowData.sign = UtilSql.getValue(result, "SIGN");
        objectAccountTreeCashflowData.monthoftrx = UtilSql.getValue(result, "MONTHOFTRX");
        objectAccountTreeCashflowData.accounttype = UtilSql.getValue(result, "ACCOUNTTYPE");
        objectAccountTreeCashflowData.position = UtilSql.getValue(result, "POSITION");
        objectAccountTreeCashflowData.qtyBef = UtilSql.getValue(result, "QTY_BEF");
        objectAccountTreeCashflowData.qtycreditBef = UtilSql.getValue(result, "QTYCREDIT_BEF");
        objectAccountTreeCashflowData.qtyOperationBef = UtilSql.getValue(result, "QTY_OPERATION_BEF");
        objectAccountTreeCashflowData.svcresetbef = UtilSql.getValue(result, "SVCRESETBEF");
        objectAccountTreeCashflowData.elevel = UtilSql.getValue(result, "ELEVEL");
        objectAccountTreeCashflowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeCashflowData);
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
    AccountTreeCashflowData objectAccountTreeCashflowData[] = new AccountTreeCashflowData[vector.size()];
    vector.copyInto(objectAccountTreeCashflowData);
    return(objectAccountTreeCashflowData);
  }

  public static AccountTreeCashflowData[] selectTrl(ConnectionProvider connectionProvider, String conCodigo, String adLanguage, String adTreeId)    throws ServletException {
    return selectTrl(connectionProvider, conCodigo, adLanguage, adTreeId, 0, 0);
  }

  public static AccountTreeCashflowData[] selectTrl(ConnectionProvider connectionProvider, String conCodigo, String adLanguage, String adTreeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT tn.Node_ID,tn.Parent_ID,tn.SeqNo, m.C_ElementValue_ID AS ID, ((CASE ? WHEN 'Y' THEN TO_CHAR(m.Value) || ' - ' ELSE '' END) || COALESCE(mt.Name, m.Name)) as Name, " +
      "        COALESCE(mt.Description, m.Description) as description ,m.IsSummary, m.ACCOUNTSIGN, " +
      "        m.ShowElement, 0 as element_level, 0 as qty, 0 as qty_ref, 0 as qty_operation, 0 as qty_operation_ref, " +
      "        m.ShowValueCond, m.ElementLevel, m.Value, 'N' AS CALCULATED, 'N' AS SVCRESET, 'N' AS SVCRESETREF, m.isalwaysshown, m.accounttype, m.EM_Gar_Position as position, 0 AS QTY_BEF, 0 AS QTYCREDIT_BEF, 0 AS qty_operation_bef, 'N' AS SVCRESETBEF" +
      "        , m.ElementLevel as elevel" +
      "		FROM C_ElementValue m left join C_ElementValue_Trl mt on m.C_ElementValue_ID = mt.C_ElementValue_ID " +
      "                                                              and mt.AD_Language = ?," +
      "              AD_TreeNode tn" +
      "        WHERE tn.IsActive='Y' " +
      "        AND tn.Node_ID = m.C_ElementValue_ID " +
      "        AND tn.AD_Tree_ID = ? " +
      "        ORDER BY m.EM_Gar_Position, m.value" +
      "        --tn.SeqNo, COALESCE(tn.Parent_ID, '-1'), ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, conCodigo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTreeId);

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
        AccountTreeCashflowData objectAccountTreeCashflowData = new AccountTreeCashflowData();
        objectAccountTreeCashflowData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeCashflowData.parentId = UtilSql.getValue(result, "PARENT_ID");
        objectAccountTreeCashflowData.seqno = UtilSql.getValue(result, "SEQNO");
        objectAccountTreeCashflowData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeCashflowData.name = UtilSql.getValue(result, "NAME");
        objectAccountTreeCashflowData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAccountTreeCashflowData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectAccountTreeCashflowData.accountsign = UtilSql.getValue(result, "ACCOUNTSIGN");
        objectAccountTreeCashflowData.showelement = UtilSql.getValue(result, "SHOWELEMENT");
        objectAccountTreeCashflowData.elementLevel = UtilSql.getValue(result, "ELEMENT_LEVEL");
        objectAccountTreeCashflowData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeCashflowData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeCashflowData.qtyOperation = UtilSql.getValue(result, "QTY_OPERATION");
        objectAccountTreeCashflowData.qtyOperationRef = UtilSql.getValue(result, "QTY_OPERATION_REF");
        objectAccountTreeCashflowData.showvaluecond = UtilSql.getValue(result, "SHOWVALUECOND");
        objectAccountTreeCashflowData.elementlevel = UtilSql.getValue(result, "ELEMENTLEVEL");
        objectAccountTreeCashflowData.value = UtilSql.getValue(result, "VALUE");
        objectAccountTreeCashflowData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectAccountTreeCashflowData.svcreset = UtilSql.getValue(result, "SVCRESET");
        objectAccountTreeCashflowData.svcresetref = UtilSql.getValue(result, "SVCRESETREF");
        objectAccountTreeCashflowData.isalwaysshown = UtilSql.getValue(result, "ISALWAYSSHOWN");
        objectAccountTreeCashflowData.accounttype = UtilSql.getValue(result, "ACCOUNTTYPE");
        objectAccountTreeCashflowData.position = UtilSql.getValue(result, "POSITION");
        objectAccountTreeCashflowData.qtyBef = UtilSql.getValue(result, "QTY_BEF");
        objectAccountTreeCashflowData.qtycreditBef = UtilSql.getValue(result, "QTYCREDIT_BEF");
        objectAccountTreeCashflowData.qtyOperationBef = UtilSql.getValue(result, "QTY_OPERATION_BEF");
        objectAccountTreeCashflowData.svcresetbef = UtilSql.getValue(result, "SVCRESETBEF");
        objectAccountTreeCashflowData.elevel = UtilSql.getValue(result, "ELEVEL");
        objectAccountTreeCashflowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeCashflowData);
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
    AccountTreeCashflowData objectAccountTreeCashflowData[] = new AccountTreeCashflowData[vector.size()];
    vector.copyInto(objectAccountTreeCashflowData);
    return(objectAccountTreeCashflowData);
  }

  public static AccountTreeCashflowData[] selectAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String dateFromRef, String dateToRef, String agnoRef)    throws ServletException {
    return selectAcct(connectionProvider, adOrgClient, adUserClient, dateFrom, dateTo, acctschema, org, agno, dateFromRef, dateToRef, agnoRef, 0, 0);
  }

  public static AccountTreeCashflowData[] selectAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String dateFromRef, String dateToRef, String agnoRef, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ID, SUM(QTY) AS QTY, SUM(QTYCREDIT) AS QTYCREDIT, SUM(QTY_REF) AS QTY_REF, SUM(QTYCREDIT_REF) AS QTYCREDIT_REF " +
      "        FROM (" +
      "        SELECT m.C_ElementValue_ID as id, (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty, " +
      "        (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit, 0 as qty_ref, 0 as qtyCredit_ref, EXTRACT('MONTH', f.dateacct) as monthoftrx" +
      "                FROM C_ElementValue m, Fact_Acct f, C_Period p, C_Year y " +
      "                WHERE m.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "                AND m.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "                AND 1=1 ";
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND f.DATEACCT >= to_date(?) ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND f.DATEACCT < to_date(?) ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "                AND f.FACTACCTTYPE <> 'R'" +
      "                AND f.FACTACCTTYPE <> 'C'" +
      "                AND m.C_ElementValue_ID = f.Account_ID" +
      "            AND 0=0 AND f.AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "            AND f.C_PERIOD_ID = p.C_PERIOD_ID " +
      "            AND p.C_YEAR_ID = y.C_YEAR_ID" +
      "            AND Y.YEAR IN (";
    strSql = strSql + ((agno==null || agno.equals(""))?"":agno);
    strSql = strSql + 
      ") " +
      "        UNION ALL" +
      "        SELECT m.C_ElementValue_ID as id, 0 AS QTY, 0 as qtyCredit, (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty_ref, " +
      "                (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit_ref," +
      "                EXTRACT('MONTH', f.dateacct) as monthoftrx " +
      "                FROM C_ElementValue m, Fact_Acct f, C_Period p, C_Year y " +
      "                WHERE m.AD_Org_ID IN(";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "                AND m.AD_Client_ID IN(";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "                AND 2=2 ";
    strSql = strSql + ((dateFromRef==null || dateFromRef.equals(""))?"":"  AND f.DATEACCT >= to_date(?) ");
    strSql = strSql + ((dateToRef==null || dateToRef.equals(""))?"":"  AND f.DATEACCT < to_date(?) ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "                AND f.FACTACCTTYPE <> 'R'" +
      "                AND f.FACTACCTTYPE <> 'C'" +
      "                AND m.C_ElementValue_ID = f.Account_ID" +
      "            AND 1=1 AND f.AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "            AND f.C_PERIOD_ID = p.C_PERIOD_ID " +
      "            AND p.C_YEAR_ID = y.C_YEAR_ID" +
      "            AND y.YEAR IN (";
    strSql = strSql + ((agnoRef==null || agnoRef.equals(""))?"":agnoRef);
    strSql = strSql + 
      ") " +
      "        ) AA" +
      "        GROUP BY ID";

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
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (org != null && !(org.equals(""))) {
        }
      if (agno != null && !(agno.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (dateFromRef != null && !(dateFromRef.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFromRef);
      }
      if (dateToRef != null && !(dateToRef.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateToRef);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (org != null && !(org.equals(""))) {
        }
      if (agnoRef != null && !(agnoRef.equals(""))) {
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
        AccountTreeCashflowData objectAccountTreeCashflowData = new AccountTreeCashflowData();
        objectAccountTreeCashflowData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeCashflowData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeCashflowData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeCashflowData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeCashflowData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeCashflowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeCashflowData);
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
    AccountTreeCashflowData objectAccountTreeCashflowData[] = new AccountTreeCashflowData[vector.size()];
    vector.copyInto(objectAccountTreeCashflowData);
    return(objectAccountTreeCashflowData);
  }

  public static AccountTreeCashflowData[] selectFactAcctKomp(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef, String dateFromBef, String dateToBef, String agnoBef)    throws ServletException {
    return selectFactAcctKomp(connectionProvider, adOrgClient, adUserClient, dateFrom, dateTo, acctschema, org, agno, openingEntryOwner, dateFromRef, dateToRef, agnoRef, openingEntryOwnerRef, dateFromBef, dateToBef, agnoBef, 0, 0);
  }

  public static AccountTreeCashflowData[] selectFactAcctKomp(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef, String dateFromBef, String dateToBef, String agnoBef, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ID, SUM(QTY) AS QTY, SUM(QTYCREDIT) AS QTYCREDIT, SUM(QTY_REF) AS QTY_REF, SUM(QTYCREDIT_REF) AS QTYCREDIT_REF, SUM(QTY_BEF) AS QTY_BEF, SUM(QTYCREDIT_BEF) AS QTYCREDIT_BEF" +
      "        FROM (" +
      "        SELECT m.C_ElementValue_ID as id, (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty, " +
      "        (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit, 0 as qty_ref, 0 as qtyCredit_ref," +
      "                0 AS qty_bef, " +
      "                0 AS qtyCredit_bef" +
      "                FROM C_ElementValue m, Fact_Acct f, C_Period p, C_Year y " +
      "                WHERE m.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "                AND m.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "                AND 1=1 ";
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND f.DATEACCT >= to_date(?) ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND f.DATEACCT < to_date(?) ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "                AND f.FACTACCTTYPE <> 'R'" +
      "                AND f.FACTACCTTYPE <> 'C'" +
      "                AND m.C_ElementValue_ID = f.Account_ID" +
      "            AND 0=0 AND f.AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "            AND f.C_PERIOD_ID = p.C_PERIOD_ID " +
      "            AND p.C_YEAR_ID = y.C_YEAR_ID" +
      "            AND Y.YEAR IN (";
    strSql = strSql + ((agno==null || agno.equals(""))?"":agno);
    strSql = strSql + 
      ") " +
      "            and not exists (select 1 from ad_org_closing, c_year year " +
      "                           where open_fact_acct_group_id = f.fact_acct_group_id" +
      "                           and ad_org_closing.c_year_id = year.c_year_id" +
      "                           and year.year <> ?)" +
      "        UNION ALL" +
      "        SELECT m.C_ElementValue_ID as id, 0 AS QTY, 0 as qtyCredit, (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty_ref, " +
      "                (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit_ref," +
      "                0 AS qty_bef, " +
      "                0 AS qtyCredit_bef " +
      "                FROM C_ElementValue m, Fact_Acct f, C_Period p, C_Year y " +
      "                WHERE m.AD_Org_ID IN(";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "                AND m.AD_Client_ID IN(";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "                AND 2=2 ";
    strSql = strSql + ((dateFromRef==null || dateFromRef.equals(""))?"":"  AND f.DATEACCT >= to_date(?) ");
    strSql = strSql + ((dateToRef==null || dateToRef.equals(""))?"":"  AND f.DATEACCT < to_date(?) ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "                AND f.FACTACCTTYPE <> 'R'" +
      "                AND f.FACTACCTTYPE <> 'C'" +
      "                AND m.C_ElementValue_ID = f.Account_ID" +
      "            AND 1=1 AND f.AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "            AND f.C_PERIOD_ID = p.C_PERIOD_ID " +
      "            AND p.C_YEAR_ID = y.C_YEAR_ID" +
      "            AND y.YEAR IN (";
    strSql = strSql + ((agnoRef==null || agnoRef.equals(""))?"":agnoRef);
    strSql = strSql + 
      ") " +
      "            and not exists (select 1 from ad_org_closing, c_year year " +
      "                           where open_fact_acct_group_id = f.fact_acct_group_id" +
      "                           and ad_org_closing.c_year_id = year.c_year_id" +
      "                           and year.year <> ?)" +
      "        UNION ALL" +
      "        SELECT m.C_ElementValue_ID as id, 0 AS QTY, 0 as qtyCredit, 0 AS qty_ref, 0 AS qtyCredit_ref," +
      "                (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty_bef, " +
      "                (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit_bef" +
      "                FROM C_ElementValue m, Fact_Acct f, C_Period p, C_Year y " +
      "                WHERE m.AD_Org_ID IN ('3') " +
      "                AND m.AD_Client_ID IN ('3') " +
      "                AND 3=3 " +
      "                AND f.DATEACCT >= to_date(?)" +
      "                AND f.DATEACCT < to_date(?)" +
      "                AND f.FACTACCTTYPE <> 'R'" +
      "                AND f.FACTACCTTYPE <> 'C'" +
      "                AND m.C_ElementValue_ID = f.Account_ID" +
      "            AND 1=1 AND f.AD_ORG_ID IN ('1')" +
      "            AND f.C_PERIOD_ID = p.C_PERIOD_ID " +
      "            AND p.C_YEAR_ID = y.C_YEAR_ID" +
      "            AND y.YEAR IN (?)" +
      "        ) AA" +
      "        GROUP BY ID";

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
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (org != null && !(org.equals(""))) {
        }
      if (agno != null && !(agno.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, openingEntryOwner);
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (dateFromRef != null && !(dateFromRef.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFromRef);
      }
      if (dateToRef != null && !(dateToRef.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateToRef);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (org != null && !(org.equals(""))) {
        }
      if (agnoRef != null && !(agnoRef.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, openingEntryOwnerRef);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFromBef);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateToBef);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, agnoBef);

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
        AccountTreeCashflowData objectAccountTreeCashflowData = new AccountTreeCashflowData();
        objectAccountTreeCashflowData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeCashflowData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeCashflowData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeCashflowData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeCashflowData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeCashflowData.qtyBef = UtilSql.getValue(result, "QTY_BEF");
        objectAccountTreeCashflowData.qtycreditBef = UtilSql.getValue(result, "QTYCREDIT_BEF");
        objectAccountTreeCashflowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeCashflowData);
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
    AccountTreeCashflowData objectAccountTreeCashflowData[] = new AccountTreeCashflowData[vector.size()];
    vector.copyInto(objectAccountTreeCashflowData);
    return(objectAccountTreeCashflowData);
  }

  public static AccountTreeCashflowData[] selectFactAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef)    throws ServletException {
    return selectFactAcct(connectionProvider, adOrgClient, adUserClient, dateFrom, dateTo, acctschema, org, agno, openingEntryOwner, dateFromRef, dateToRef, agnoRef, openingEntryOwnerRef, 0, 0);
  }

  public static AccountTreeCashflowData[] selectFactAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ID, SUM(QTY) AS QTY, SUM(QTYCREDIT) AS QTYCREDIT, SUM(QTY_REF) AS QTY_REF, SUM(QTYCREDIT_REF) AS QTYCREDIT_REF, SUM(QTY_BEF) AS QTY_BEF, SUM(QTYCREDIT_BEF) AS QTYCREDIT_BEF" +
      "        FROM (" +
      "        SELECT m.C_ElementValue_ID as id, (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty, " +
      "        (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit, 0 as qty_ref, 0 as qtyCredit_ref," +
      "                0 AS qty_bef, " +
      "                0 AS qtyCredit_bef" +
      "                FROM C_ElementValue m, Fact_Acct f, C_Period p, C_Year y " +
      "                WHERE m.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "                AND m.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "                AND 1=1 ";
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND f.DATEACCT >= to_date(?) ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND f.DATEACCT < to_date(?) ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "                AND f.FACTACCTTYPE <> 'R'" +
      "                AND f.FACTACCTTYPE <> 'C'" +
      "                AND m.C_ElementValue_ID = f.Account_ID" +
      "            AND 0=0 AND f.AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "            AND f.C_PERIOD_ID = p.C_PERIOD_ID " +
      "            AND f.EM_Gcs_IsCashflow = 'Y'" +
      "            AND p.C_YEAR_ID = y.C_YEAR_ID" +
      "            AND Y.YEAR IN (";
    strSql = strSql + ((agno==null || agno.equals(""))?"":agno);
    strSql = strSql + 
      ") " +
      "            and not exists (select 1 from ad_org_closing, c_year year " +
      "                           where open_fact_acct_group_id = f.fact_acct_group_id" +
      "                           and ad_org_closing.c_year_id = year.c_year_id" +
      "                           and year.year <> ?)" +
      "        UNION ALL" +
      "        SELECT m.C_ElementValue_ID as id, 0 AS QTY, 0 as qtyCredit, (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty_ref, " +
      "                (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit_ref," +
      "                0 AS qty_bef, " +
      "                0 AS qtyCredit_bef " +
      "                FROM C_ElementValue m, Fact_Acct f, C_Period p, C_Year y " +
      "                WHERE m.AD_Org_ID IN(";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "                AND m.AD_Client_ID IN(";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "                AND 2=2 ";
    strSql = strSql + ((dateFromRef==null || dateFromRef.equals(""))?"":"  AND f.DATEACCT >= to_date(?) ");
    strSql = strSql + ((dateToRef==null || dateToRef.equals(""))?"":"  AND f.DATEACCT < to_date(?) ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ? ");
    strSql = strSql + 
      "                AND f.FACTACCTTYPE <> 'R'" +
      "                AND f.FACTACCTTYPE <> 'C'" +
      "                AND m.C_ElementValue_ID = f.Account_ID" +
      "            AND 1=1 AND f.AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "            AND f.C_PERIOD_ID = p.C_PERIOD_ID " +
      "            AND f.EM_Gcs_IsCashflow = 'Y'" +
      "            AND p.C_YEAR_ID = y.C_YEAR_ID" +
      "            AND y.YEAR IN (";
    strSql = strSql + ((agnoRef==null || agnoRef.equals(""))?"":agnoRef);
    strSql = strSql + 
      ") " +
      "            and not exists (select 1 from ad_org_closing, c_year year " +
      "                           where open_fact_acct_group_id = f.fact_acct_group_id" +
      "                           and ad_org_closing.c_year_id = year.c_year_id" +
      "                           and year.year <> ?)" +
      "        ) AA" +
      "        GROUP BY ID";

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
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (org != null && !(org.equals(""))) {
        }
      if (agno != null && !(agno.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, openingEntryOwner);
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (dateFromRef != null && !(dateFromRef.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFromRef);
      }
      if (dateToRef != null && !(dateToRef.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateToRef);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (org != null && !(org.equals(""))) {
        }
      if (agnoRef != null && !(agnoRef.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, openingEntryOwnerRef);

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
        AccountTreeCashflowData objectAccountTreeCashflowData = new AccountTreeCashflowData();
        objectAccountTreeCashflowData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeCashflowData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeCashflowData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeCashflowData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeCashflowData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeCashflowData.qtyBef = UtilSql.getValue(result, "QTY_BEF");
        objectAccountTreeCashflowData.qtycreditBef = UtilSql.getValue(result, "QTYCREDIT_BEF");
        objectAccountTreeCashflowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeCashflowData);
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
    AccountTreeCashflowData objectAccountTreeCashflowData[] = new AccountTreeCashflowData[vector.size()];
    vector.copyInto(objectAccountTreeCashflowData);
    return(objectAccountTreeCashflowData);
  }

  public static AccountTreeCashflowData[] selectForms(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient)    throws ServletException {
    return selectForms(connectionProvider, adOrgClient, adUserClient, 0, 0);
  }

  public static AccountTreeCashflowData[] selectForms(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT m.C_ElementValue_ID as id, o.account_id as node_id, o.sign as ACCOUNTSIGN" +
      "        FROM C_ElementValue m, C_ELEMENTVALUE_OPERAND o  " +
      "        WHERE m.isActive='Y' " +
      "        AND m.AD_Org_ID IN(";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND m.AD_Client_ID IN(";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND m.C_ElementValue_ID = o.C_ElementValue_ID" +
      "        AND o.isactive = 'Y' " +
      "        order by m.C_elementvalue_id, o.seqno";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
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
        AccountTreeCashflowData objectAccountTreeCashflowData = new AccountTreeCashflowData();
        objectAccountTreeCashflowData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeCashflowData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeCashflowData.accountsign = UtilSql.getValue(result, "ACCOUNTSIGN");
        objectAccountTreeCashflowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeCashflowData);
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
    AccountTreeCashflowData objectAccountTreeCashflowData[] = new AccountTreeCashflowData[vector.size()];
    vector.copyInto(objectAccountTreeCashflowData);
    return(objectAccountTreeCashflowData);
  }

  public static AccountTreeCashflowData[] selectOperands(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String element)    throws ServletException {
    return selectOperands(connectionProvider, adOrgClient, adUserClient, element, 0, 0);
  }

  public static AccountTreeCashflowData[] selectOperands(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String element, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT m.C_ElementValue_ID as id, o.account_id as node_id, o.sign" +
      "        FROM C_ElementValue m, C_ELEMENTVALUE_OPERAND o, C_ElementValue n" +
      "        WHERE m.isActive='Y' " +
      "        AND m.AD_Org_ID IN(";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        AND m.AD_Client_ID IN(";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND m.C_Element_ID = ?" +
      "        AND m.C_ElementValue_ID = o.C_ElementValue_ID" +
      "        AND n.C_ElementValue_ID = o.C_ElementValue_ID" +
      "        AND o.isactive = 'Y' " +
      "        order by m.C_elementvalue_id, o.seqno";

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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, element);

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
        AccountTreeCashflowData objectAccountTreeCashflowData = new AccountTreeCashflowData();
        objectAccountTreeCashflowData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeCashflowData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeCashflowData.sign = UtilSql.getValue(result, "SIGN");
        objectAccountTreeCashflowData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeCashflowData);
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
    AccountTreeCashflowData objectAccountTreeCashflowData[] = new AccountTreeCashflowData[vector.size()];
    vector.copyInto(objectAccountTreeCashflowData);
    return(objectAccountTreeCashflowData);
  }
}
