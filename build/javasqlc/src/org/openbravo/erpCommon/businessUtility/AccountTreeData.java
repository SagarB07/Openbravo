//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.businessUtility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

public class AccountTreeData implements FieldProvider {
static Logger log4j = Logger.getLogger(AccountTreeData.class);
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
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AccountTreeData[] select(ConnectionProvider connectionProvider, String conCodigo, String adTreeId)    throws ServletException {
    return select(connectionProvider, conCodigo, adTreeId, 0, 0);
  }

  public static AccountTreeData[] select(ConnectionProvider connectionProvider, String conCodigo, String adTreeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT tn.Node_ID,tn.Parent_ID,tn.SeqNo, m.C_ElementValue_ID AS ID, " +
      "        ((CASE ? WHEN 'Y' THEN TO_CHAR(m.Value) || ' - ' ELSE '' END) || m.Name) AS NAME,m.Description, m.IsSummary, " +
      "        m.ACCOUNTSIGN, m.ShowElement, 0 as element_level, 0 as qty, 0 as qty_ref, 0 as qty_operation, 0 as qty_operation_ref, " +
      "        0 as QTYCREDIT, 0 as QTYCREDIT_REF, m.ShowValueCond, m.ElementLevel, m.Value, " +
      "        'N' AS CALCULATED, 'N' AS SVCRESET, 'N' AS SVCRESETREF, m.isalwaysshown, '' as sign" +
      "        FROM AD_TreeNode tn, C_ElementValue m" +
      "        WHERE tn.IsActive='Y' " +
      "        AND tn.Node_ID = m.C_ElementValue_ID " +
      "        AND tn.AD_Tree_ID = ? " +
      "        ORDER BY COALESCE(tn.Parent_ID, '-1'), m.Value" +
      "        --tn.SeqNo";

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
        AccountTreeData objectAccountTreeData = new AccountTreeData();
        objectAccountTreeData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeData.parentId = UtilSql.getValue(result, "PARENT_ID");
        objectAccountTreeData.seqno = UtilSql.getValue(result, "SEQNO");
        objectAccountTreeData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeData.name = UtilSql.getValue(result, "NAME");
        objectAccountTreeData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAccountTreeData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectAccountTreeData.accountsign = UtilSql.getValue(result, "ACCOUNTSIGN");
        objectAccountTreeData.showelement = UtilSql.getValue(result, "SHOWELEMENT");
        objectAccountTreeData.elementLevel = UtilSql.getValue(result, "ELEMENT_LEVEL");
        objectAccountTreeData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeData.qtyOperation = UtilSql.getValue(result, "QTY_OPERATION");
        objectAccountTreeData.qtyOperationRef = UtilSql.getValue(result, "QTY_OPERATION_REF");
        objectAccountTreeData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeData.showvaluecond = UtilSql.getValue(result, "SHOWVALUECOND");
        objectAccountTreeData.elementlevel = UtilSql.getValue(result, "ELEMENTLEVEL");
        objectAccountTreeData.value = UtilSql.getValue(result, "VALUE");
        objectAccountTreeData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectAccountTreeData.svcreset = UtilSql.getValue(result, "SVCRESET");
        objectAccountTreeData.svcresetref = UtilSql.getValue(result, "SVCRESETREF");
        objectAccountTreeData.isalwaysshown = UtilSql.getValue(result, "ISALWAYSSHOWN");
        objectAccountTreeData.sign = UtilSql.getValue(result, "SIGN");
        objectAccountTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeData);
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
    AccountTreeData objectAccountTreeData[] = new AccountTreeData[vector.size()];
    vector.copyInto(objectAccountTreeData);
    return(objectAccountTreeData);
  }

  public static AccountTreeData[] selectTrl(ConnectionProvider connectionProvider, String conCodigo, String adLanguage, String adTreeId)    throws ServletException {
    return selectTrl(connectionProvider, conCodigo, adLanguage, adTreeId, 0, 0);
  }

  public static AccountTreeData[] selectTrl(ConnectionProvider connectionProvider, String conCodigo, String adLanguage, String adTreeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT tn.Node_ID,tn.Parent_ID,tn.SeqNo, m.C_ElementValue_ID AS ID, ((CASE ? WHEN 'Y' THEN TO_CHAR(m.Value) || ' - ' ELSE '' END) || COALESCE(mt.Name, m.Name)) as Name, " +
      "        COALESCE(mt.Description, m.Description) as description ,m.IsSummary, m.ACCOUNTSIGN, " +
      "        m.ShowElement, 0 as element_level, 0 as qty, 0 as qty_ref, 0 as qty_operation, 0 as qty_operation_ref, " +
      "        m.ShowValueCond, m.ElementLevel, m.Value, 'N' AS CALCULATED, 'N' AS SVCRESET, 'N' AS SVCRESETREF, m.isalwaysshown" +
      "        FROM C_ElementValue m left join C_ElementValue_Trl mt on m.C_ElementValue_ID = mt.C_ElementValue_ID " +
      "                                                              and mt.AD_Language = ? ," +
      "              AD_TreeNode tn" +
      "        WHERE tn.IsActive='Y' " +
      "        AND tn.Node_ID = m.C_ElementValue_ID " +
      "        AND tn.AD_Tree_ID = ? " +
      "        ORDER BY COALESCE(tn.Parent_ID, '-1'), tn.SeqNo ";

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
        AccountTreeData objectAccountTreeData = new AccountTreeData();
        objectAccountTreeData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeData.parentId = UtilSql.getValue(result, "PARENT_ID");
        objectAccountTreeData.seqno = UtilSql.getValue(result, "SEQNO");
        objectAccountTreeData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeData.name = UtilSql.getValue(result, "NAME");
        objectAccountTreeData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAccountTreeData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectAccountTreeData.accountsign = UtilSql.getValue(result, "ACCOUNTSIGN");
        objectAccountTreeData.showelement = UtilSql.getValue(result, "SHOWELEMENT");
        objectAccountTreeData.elementLevel = UtilSql.getValue(result, "ELEMENT_LEVEL");
        objectAccountTreeData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeData.qtyOperation = UtilSql.getValue(result, "QTY_OPERATION");
        objectAccountTreeData.qtyOperationRef = UtilSql.getValue(result, "QTY_OPERATION_REF");
        objectAccountTreeData.showvaluecond = UtilSql.getValue(result, "SHOWVALUECOND");
        objectAccountTreeData.elementlevel = UtilSql.getValue(result, "ELEMENTLEVEL");
        objectAccountTreeData.value = UtilSql.getValue(result, "VALUE");
        objectAccountTreeData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectAccountTreeData.svcreset = UtilSql.getValue(result, "SVCRESET");
        objectAccountTreeData.svcresetref = UtilSql.getValue(result, "SVCRESETREF");
        objectAccountTreeData.isalwaysshown = UtilSql.getValue(result, "ISALWAYSSHOWN");
        objectAccountTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeData);
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
    AccountTreeData objectAccountTreeData[] = new AccountTreeData[vector.size()];
    vector.copyInto(objectAccountTreeData);
    return(objectAccountTreeData);
  }

  public static AccountTreeData[] selectAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String dateFromRef, String dateToRef, String agnoRef)    throws ServletException {
    return selectAcct(connectionProvider, adOrgClient, adUserClient, dateFrom, dateTo, acctschema, org, agno, dateFromRef, dateToRef, agnoRef, 0, 0);
  }

  public static AccountTreeData[] selectAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String dateFromRef, String dateToRef, String agnoRef, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ID, SUM(QTY) AS QTY, SUM(QTYCREDIT) AS QTYCREDIT, SUM(QTY_REF) AS QTY_REF, SUM(QTYCREDIT_REF) AS QTYCREDIT_REF " +
      "        FROM (" +
      "        SELECT m.C_ElementValue_ID as id, (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty, " +
      "        (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit, 0 as qty_ref, 0 as qtyCredit_ref" +
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
      "                (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit_ref " +
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
        AccountTreeData objectAccountTreeData = new AccountTreeData();
        objectAccountTreeData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeData);
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
    AccountTreeData objectAccountTreeData[] = new AccountTreeData[vector.size()];
    vector.copyInto(objectAccountTreeData);
    return(objectAccountTreeData);
  }

  public static AccountTreeData[] selectFactAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef)    throws ServletException {
    return selectFactAcct(connectionProvider, adOrgClient, adUserClient, dateFrom, dateTo, acctschema, org, agno, openingEntryOwner, dateFromRef, dateToRef, agnoRef, openingEntryOwnerRef, 0, 0);
  }

  public static AccountTreeData[] selectFactAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ID, SUM(QTY) AS QTY, SUM(QTYCREDIT) AS QTYCREDIT, SUM(QTY_REF) AS QTY_REF, SUM(QTYCREDIT_REF) AS QTYCREDIT_REF " +
      "        FROM (" +
      "        SELECT m.C_ElementValue_ID as id, (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty, " +
      "        (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit, 0 as qty_ref, 0 as qtyCredit_ref" +
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
      "                (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit_ref " +
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
        AccountTreeData objectAccountTreeData = new AccountTreeData();
        objectAccountTreeData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeData);
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
    AccountTreeData objectAccountTreeData[] = new AccountTreeData[vector.size()];
    vector.copyInto(objectAccountTreeData);
    return(objectAccountTreeData);
  }

  public static AccountTreeData[] selectForms(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient)    throws ServletException {
    return selectForms(connectionProvider, adOrgClient, adUserClient, 0, 0);
  }

  public static AccountTreeData[] selectForms(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, int firstRegister, int numberRegisters)    throws ServletException {
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
        AccountTreeData objectAccountTreeData = new AccountTreeData();
        objectAccountTreeData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeData.accountsign = UtilSql.getValue(result, "ACCOUNTSIGN");
        objectAccountTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeData);
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
    AccountTreeData objectAccountTreeData[] = new AccountTreeData[vector.size()];
    vector.copyInto(objectAccountTreeData);
    return(objectAccountTreeData);
  }

  public static AccountTreeData[] selectOperands(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String element)    throws ServletException {
    return selectOperands(connectionProvider, adOrgClient, adUserClient, element, 0, 0);
  }

  public static AccountTreeData[] selectOperands(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String element, int firstRegister, int numberRegisters)    throws ServletException {
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
        AccountTreeData objectAccountTreeData = new AccountTreeData();
        objectAccountTreeData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeData.sign = UtilSql.getValue(result, "SIGN");
        objectAccountTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeData);
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
    AccountTreeData objectAccountTreeData[] = new AccountTreeData[vector.size()];
    vector.copyInto(objectAccountTreeData);
    return(objectAccountTreeData);
  }
}
