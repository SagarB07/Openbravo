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

public class AccountTreeKomperhensifData implements FieldProvider {
static Logger log4j = Logger.getLogger(AccountTreeKomperhensifData.class);
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
  public String qtyAud;
  public String qtycreditAud;
  public String svcresetaud;
  public String qtyOperationAud;
  public String anggaran;
  public String anggaranBef;
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
    else if (fieldName.equalsIgnoreCase("QTY_AUD") || fieldName.equals("qtyAud"))
      return qtyAud;
    else if (fieldName.equalsIgnoreCase("QTYCREDIT_AUD") || fieldName.equals("qtycreditAud"))
      return qtycreditAud;
    else if (fieldName.equalsIgnoreCase("SVCRESETAUD"))
      return svcresetaud;
    else if (fieldName.equalsIgnoreCase("QTY_OPERATION_AUD") || fieldName.equals("qtyOperationAud"))
      return qtyOperationAud;
    else if (fieldName.equalsIgnoreCase("ANGGARAN"))
      return anggaran;
    else if (fieldName.equalsIgnoreCase("ANGGARAN_BEF") || fieldName.equals("anggaranBef"))
      return anggaranBef;
    else if (fieldName.equalsIgnoreCase("ELEVEL"))
      return elevel;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AccountTreeKomperhensifData[] select(ConnectionProvider connectionProvider, String year, String yearBef, String conCodigo, String adTreeId)    throws ServletException {
    return select(connectionProvider, year, yearBef, conCodigo, adTreeId, 0, 0);
  }

  public static AccountTreeKomperhensifData[] select(ConnectionProvider connectionProvider, String year, String yearBef, String conCodigo, String adTreeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT tn.Node_ID,tn.Parent_ID,tn.SeqNo, m.C_ElementValue_ID AS ID, " +
      "        ((CASE ? WHEN 'Y' THEN TO_CHAR(m.Value) || ' - ' ELSE '' END) || m.Name) AS NAME,m.Description, m.IsSummary, " +
      "        m.ACCOUNTSIGN, m.ShowElement, 0 as element_level, 0 as qty, 0 as qty_ref, 0 as qty_operation, 0 as qty_operation_ref, " +
      "        0 as QTYCREDIT, 0 as QTYCREDIT_REF, m.ShowValueCond, m.ElementLevel, m.Value, " +
      "        'N' AS CALCULATED, 'N' AS SVCRESET, 'N' AS SVCRESETREF, m.isalwaysshown, '' as sign," +
      "        '' as monthoftrx, m.accounttype, m.EM_Gar_Position as position,0 AS QTY_BEF, 0 AS QTYCREDIT_BEF, 0 AS qty_operation_bef, 'N' AS SVCRESETBEF, 0 AS qty_aud, 0 AS qtyCredit_aud, " +
      "		'N' AS SVCRESETAUD, 0 as qty_operation_aud," +
      "        COALESCE((Select coalesce(sum(b.amount),1) as anggaran" +
      "		        FROM c_budgetline b, c_budget bg, C_Year yr" +
      "		        where b.c_elementvalue_id = m.c_elementvalue_id" +
      "		        and bg.c_budget_id = b.c_budget_id" +
      "		        and yr.C_Year_ID = bg.c_year_id" +
      "		        AND yr.YEAR IN (";
    strSql = strSql + ((year==null || year.equals(""))?"":year);
    strSql = strSql + 
      ")), 1) as anggaran," +
      "		COALESCE((Select coalesce(sum(b.amount),1) as anggaran_bef" +
      "		        FROM c_budgetline b, c_budget bg, C_Year y" +
      "		        where b.c_elementvalue_id = m.c_elementvalue_id" +
      "		        and bg.c_budget_id = b.c_budget_id" +
      "		        and y.C_Year_ID = bg.c_year_id" +
      "		        AND y.YEAR IN (";
    strSql = strSql + ((yearBef==null || yearBef.equals(""))?"":yearBef);
    strSql = strSql + 
      ")), 1) as anggaran_bef" +
      "        , m.ElementLevel as elevel" +
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
      if (year != null && !(year.equals(""))) {
        }
      if (yearBef != null && !(yearBef.equals(""))) {
        }
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
        AccountTreeKomperhensifData objectAccountTreeKomperhensifData = new AccountTreeKomperhensifData();
        objectAccountTreeKomperhensifData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeKomperhensifData.parentId = UtilSql.getValue(result, "PARENT_ID");
        objectAccountTreeKomperhensifData.seqno = UtilSql.getValue(result, "SEQNO");
        objectAccountTreeKomperhensifData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeKomperhensifData.name = UtilSql.getValue(result, "NAME");
        objectAccountTreeKomperhensifData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAccountTreeKomperhensifData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectAccountTreeKomperhensifData.accountsign = UtilSql.getValue(result, "ACCOUNTSIGN");
        objectAccountTreeKomperhensifData.showelement = UtilSql.getValue(result, "SHOWELEMENT");
        objectAccountTreeKomperhensifData.elementLevel = UtilSql.getValue(result, "ELEMENT_LEVEL");
        objectAccountTreeKomperhensifData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeKomperhensifData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeKomperhensifData.qtyOperation = UtilSql.getValue(result, "QTY_OPERATION");
        objectAccountTreeKomperhensifData.qtyOperationRef = UtilSql.getValue(result, "QTY_OPERATION_REF");
        objectAccountTreeKomperhensifData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeKomperhensifData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeKomperhensifData.showvaluecond = UtilSql.getValue(result, "SHOWVALUECOND");
        objectAccountTreeKomperhensifData.elementlevel = UtilSql.getValue(result, "ELEMENTLEVEL");
        objectAccountTreeKomperhensifData.value = UtilSql.getValue(result, "VALUE");
        objectAccountTreeKomperhensifData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectAccountTreeKomperhensifData.svcreset = UtilSql.getValue(result, "SVCRESET");
        objectAccountTreeKomperhensifData.svcresetref = UtilSql.getValue(result, "SVCRESETREF");
        objectAccountTreeKomperhensifData.isalwaysshown = UtilSql.getValue(result, "ISALWAYSSHOWN");
        objectAccountTreeKomperhensifData.sign = UtilSql.getValue(result, "SIGN");
        objectAccountTreeKomperhensifData.monthoftrx = UtilSql.getValue(result, "MONTHOFTRX");
        objectAccountTreeKomperhensifData.accounttype = UtilSql.getValue(result, "ACCOUNTTYPE");
        objectAccountTreeKomperhensifData.position = UtilSql.getValue(result, "POSITION");
        objectAccountTreeKomperhensifData.qtyBef = UtilSql.getValue(result, "QTY_BEF");
        objectAccountTreeKomperhensifData.qtycreditBef = UtilSql.getValue(result, "QTYCREDIT_BEF");
        objectAccountTreeKomperhensifData.qtyOperationBef = UtilSql.getValue(result, "QTY_OPERATION_BEF");
        objectAccountTreeKomperhensifData.svcresetbef = UtilSql.getValue(result, "SVCRESETBEF");
        objectAccountTreeKomperhensifData.qtyAud = UtilSql.getValue(result, "QTY_AUD");
        objectAccountTreeKomperhensifData.qtycreditAud = UtilSql.getValue(result, "QTYCREDIT_AUD");
        objectAccountTreeKomperhensifData.svcresetaud = UtilSql.getValue(result, "SVCRESETAUD");
        objectAccountTreeKomperhensifData.qtyOperationAud = UtilSql.getValue(result, "QTY_OPERATION_AUD");
        objectAccountTreeKomperhensifData.anggaran = UtilSql.getValue(result, "ANGGARAN");
        objectAccountTreeKomperhensifData.anggaranBef = UtilSql.getValue(result, "ANGGARAN_BEF");
        objectAccountTreeKomperhensifData.elevel = UtilSql.getValue(result, "ELEVEL");
        objectAccountTreeKomperhensifData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeKomperhensifData);
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
    AccountTreeKomperhensifData objectAccountTreeKomperhensifData[] = new AccountTreeKomperhensifData[vector.size()];
    vector.copyInto(objectAccountTreeKomperhensifData);
    return(objectAccountTreeKomperhensifData);
  }

  public static AccountTreeKomperhensifData[] selectTrl(ConnectionProvider connectionProvider, String conCodigo, String adLanguage, String adTreeId)    throws ServletException {
    return selectTrl(connectionProvider, conCodigo, adLanguage, adTreeId, 0, 0);
  }

  public static AccountTreeKomperhensifData[] selectTrl(ConnectionProvider connectionProvider, String conCodigo, String adLanguage, String adTreeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT tn.Node_ID,tn.Parent_ID,tn.SeqNo, m.C_ElementValue_ID AS ID, ((CASE ? WHEN 'Y' THEN TO_CHAR(m.Value) || ' - ' ELSE '' END) || COALESCE(mt.Name, m.Name)) as Name, " +
      "        COALESCE(mt.Description, m.Description) as description ,m.IsSummary, m.ACCOUNTSIGN, " +
      "        m.ShowElement, 0 as element_level, 0 as qty, 0 as qty_ref, 0 as qty_operation, 0 as qty_operation_ref, " +
      "        m.ShowValueCond, m.ElementLevel, m.Value, 'N' AS CALCULATED, 'N' AS SVCRESET, 'N' AS SVCRESETREF, m.isalwaysshown, m.accounttype, m.EM_Gar_Position as position, COALESCE(CBL.AMOUNT,1) as anggaran, 0 AS QTY_BEF, 0 AS QTYCREDIT_BEF, 0 AS qty_operation_bef, 'N' AS SVCRESETBEF, 0 AS qty_aud, 0 AS qtyCredit_aud, 'N' AS SVCRESETAUD, 0 as qty_operation_aud" +
      "        , m.ElementLevel as elevel" +
      "        FROM C_ElementValue m left join C_ElementValue_Trl mt on m.C_ElementValue_ID = mt.C_ElementValue_ID " +
      "                                                              and mt.AD_Language = ? " +
      "             LEFT JOIN C_BUDGETLINE cbl on CBL.C_ELEMENTVALUE_ID = M.C_ELEMENTVALUE_ID," +
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
        AccountTreeKomperhensifData objectAccountTreeKomperhensifData = new AccountTreeKomperhensifData();
        objectAccountTreeKomperhensifData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeKomperhensifData.parentId = UtilSql.getValue(result, "PARENT_ID");
        objectAccountTreeKomperhensifData.seqno = UtilSql.getValue(result, "SEQNO");
        objectAccountTreeKomperhensifData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeKomperhensifData.name = UtilSql.getValue(result, "NAME");
        objectAccountTreeKomperhensifData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAccountTreeKomperhensifData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectAccountTreeKomperhensifData.accountsign = UtilSql.getValue(result, "ACCOUNTSIGN");
        objectAccountTreeKomperhensifData.showelement = UtilSql.getValue(result, "SHOWELEMENT");
        objectAccountTreeKomperhensifData.elementLevel = UtilSql.getValue(result, "ELEMENT_LEVEL");
        objectAccountTreeKomperhensifData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeKomperhensifData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeKomperhensifData.qtyOperation = UtilSql.getValue(result, "QTY_OPERATION");
        objectAccountTreeKomperhensifData.qtyOperationRef = UtilSql.getValue(result, "QTY_OPERATION_REF");
        objectAccountTreeKomperhensifData.showvaluecond = UtilSql.getValue(result, "SHOWVALUECOND");
        objectAccountTreeKomperhensifData.elementlevel = UtilSql.getValue(result, "ELEMENTLEVEL");
        objectAccountTreeKomperhensifData.value = UtilSql.getValue(result, "VALUE");
        objectAccountTreeKomperhensifData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectAccountTreeKomperhensifData.svcreset = UtilSql.getValue(result, "SVCRESET");
        objectAccountTreeKomperhensifData.svcresetref = UtilSql.getValue(result, "SVCRESETREF");
        objectAccountTreeKomperhensifData.isalwaysshown = UtilSql.getValue(result, "ISALWAYSSHOWN");
        objectAccountTreeKomperhensifData.accounttype = UtilSql.getValue(result, "ACCOUNTTYPE");
        objectAccountTreeKomperhensifData.position = UtilSql.getValue(result, "POSITION");
        objectAccountTreeKomperhensifData.anggaran = UtilSql.getValue(result, "ANGGARAN");
        objectAccountTreeKomperhensifData.qtyBef = UtilSql.getValue(result, "QTY_BEF");
        objectAccountTreeKomperhensifData.qtycreditBef = UtilSql.getValue(result, "QTYCREDIT_BEF");
        objectAccountTreeKomperhensifData.qtyOperationBef = UtilSql.getValue(result, "QTY_OPERATION_BEF");
        objectAccountTreeKomperhensifData.svcresetbef = UtilSql.getValue(result, "SVCRESETBEF");
        objectAccountTreeKomperhensifData.qtyAud = UtilSql.getValue(result, "QTY_AUD");
        objectAccountTreeKomperhensifData.qtycreditAud = UtilSql.getValue(result, "QTYCREDIT_AUD");
        objectAccountTreeKomperhensifData.svcresetaud = UtilSql.getValue(result, "SVCRESETAUD");
        objectAccountTreeKomperhensifData.qtyOperationAud = UtilSql.getValue(result, "QTY_OPERATION_AUD");
        objectAccountTreeKomperhensifData.elevel = UtilSql.getValue(result, "ELEVEL");
        objectAccountTreeKomperhensifData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeKomperhensifData);
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
    AccountTreeKomperhensifData objectAccountTreeKomperhensifData[] = new AccountTreeKomperhensifData[vector.size()];
    vector.copyInto(objectAccountTreeKomperhensifData);
    return(objectAccountTreeKomperhensifData);
  }

  public static AccountTreeKomperhensifData[] selectAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String dateFromRef, String dateToRef, String agnoRef)    throws ServletException {
    return selectAcct(connectionProvider, adOrgClient, adUserClient, dateFrom, dateTo, acctschema, org, agno, dateFromRef, dateToRef, agnoRef, 0, 0);
  }

  public static AccountTreeKomperhensifData[] selectAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String dateFromRef, String dateToRef, String agnoRef, int firstRegister, int numberRegisters)    throws ServletException {
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
      "                (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit_ref" +
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
        AccountTreeKomperhensifData objectAccountTreeKomperhensifData = new AccountTreeKomperhensifData();
        objectAccountTreeKomperhensifData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeKomperhensifData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeKomperhensifData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeKomperhensifData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeKomperhensifData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeKomperhensifData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeKomperhensifData);
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
    AccountTreeKomperhensifData objectAccountTreeKomperhensifData[] = new AccountTreeKomperhensifData[vector.size()];
    vector.copyInto(objectAccountTreeKomperhensifData);
    return(objectAccountTreeKomperhensifData);
  }

  public static AccountTreeKomperhensifData[] selectFactAcctKomp(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef, String dateFromBef, String dateToBef, String agnoBef, String dateFromAud, String dateToAud, String agnoAud)    throws ServletException {
    return selectFactAcctKomp(connectionProvider, adOrgClient, adUserClient, dateFrom, dateTo, acctschema, org, agno, openingEntryOwner, dateFromRef, dateToRef, agnoRef, openingEntryOwnerRef, dateFromBef, dateToBef, agnoBef, dateFromAud, dateToAud, agnoAud, 0, 0);
  }

  public static AccountTreeKomperhensifData[] selectFactAcctKomp(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef, String dateFromBef, String dateToBef, String agnoBef, String dateFromAud, String dateToAud, String agnoAud, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ID, SUM(QTY) AS QTY, SUM(QTYCREDIT) AS QTYCREDIT, SUM(QTY_REF) AS QTY_REF, SUM(QTYCREDIT_REF) AS QTYCREDIT_REF, SUM(QTY_BEF) AS QTY_BEF, SUM(QTYCREDIT_BEF) AS QTYCREDIT_BEF, SUM(QTY_AUD) AS QTY_AUD, SUM(QTYCREDIT_AUD) AS QTYCREDIT_AUD" +
      "        FROM (" +
      "        SELECT m.C_ElementValue_ID as id, (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty, " +
      "        (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit, 0 as qty_ref, 0 as qtyCredit_ref," +
      "                0 AS qty_bef, " +
      "                0 AS qtyCredit_bef, 0 AS qty_aud, " +
      "                0 AS qtyCredit_aud" +
      "                FROM C_ElementValue m, " +
      "                Fact_Acct f, C_Period p, C_Year y " +
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
      "                0 AS qtyCredit_bef, 0 AS qty_aud, " +
      "                0 AS qtyCredit_aud" +
      "                FROM C_ElementValue m, " +
      "                Fact_Acct f, C_Period p, C_Year y " +
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
      "                (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit_bef," +
      "                0 AS qty_aud, " +
      "                0 AS qtyCredit_aud" +
      "                FROM C_ElementValue m, " +
      "                Fact_Acct f, C_Period p, C_Year y " +
      "                WHERE f.FACTACCTTYPE <> 'R'" +
      "                AND 3=3 ";
    strSql = strSql + ((dateFromBef==null || dateFromBef.equals(""))?"":"  AND f.DATEACCT >= to_date(?)  ");
    strSql = strSql + ((dateToBef==null || dateToBef.equals(""))?"":"  AND f.DATEACCT < to_date(?)  ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ?  ");
    strSql = strSql + 
      "                AND f.FACTACCTTYPE <> 'C'" +
      "                AND m.C_ElementValue_ID = f.Account_ID" +
      "            AND 2=2 AND f.AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "            AND f.C_PERIOD_ID = p.C_PERIOD_ID " +
      "            AND p.C_YEAR_ID = y.C_YEAR_ID" +
      "            AND y.YEAR IN (?)" +
      "        UNION ALL" +
      "        SELECT m.C_ElementValue_ID as id, 0 AS QTY, 0 as qtyCredit, 0 AS qty_ref, " +
      "                0 AS qtyCredit_ref," +
      "                0 AS qty_bef, " +
      "                0 AS qtyCredit_bef," +
      "                (COALESCE(f.AMTACCTDR,0) - COALESCE(f.AMTACCTCR, 0)) AS qty_aud, " +
      "                (COALESCE(f.AMTACCTCR,0) - COALESCE(f.AMTACCTDR, 0)) AS qtyCredit_aud" +
      "                FROM C_ElementValue m, " +
      "                Fact_Acct f, C_Period p, C_Year y " +
      "                WHERE f.FACTACCTTYPE <> 'R'  " +
      "                AND 4=4 ";
    strSql = strSql + ((dateFromAud==null || dateFromAud.equals(""))?"":"  AND f.DATEACCT >= to_date(?)  ");
    strSql = strSql + ((dateToAud==null || dateToAud.equals(""))?"":"  AND f.DATEACCT < to_date(?)  ");
    strSql = strSql + ((acctschema==null || acctschema.equals(""))?"":"  AND f.C_ACCTSCHEMA_ID = ?  ");
    strSql = strSql + 
      "                AND f.FACTACCTTYPE <> 'R'" +
      "                AND f.FACTACCTTYPE <> 'C'" +
      "                AND m.C_ElementValue_ID = f.Account_ID" +
      "            AND 3=3 AND f.AD_ORG_ID IN (";
    strSql = strSql + ((org==null || org.equals(""))?"":org);
    strSql = strSql + 
      ")" +
      "            AND f.C_PERIOD_ID = p.C_PERIOD_ID " +
      "            AND p.C_YEAR_ID = y.C_YEAR_ID" +
      "            AND y.YEAR IN (?) " +
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
      if (dateFromBef != null && !(dateFromBef.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFromBef);
      }
      if (dateToBef != null && !(dateToBef.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateToBef);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (org != null && !(org.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, agnoBef);
      if (dateFromAud != null && !(dateFromAud.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFromAud);
      }
      if (dateToAud != null && !(dateToAud.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateToAud);
      }
      if (acctschema != null && !(acctschema.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctschema);
      }
      if (org != null && !(org.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, agnoAud);

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
        AccountTreeKomperhensifData objectAccountTreeKomperhensifData = new AccountTreeKomperhensifData();
        objectAccountTreeKomperhensifData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeKomperhensifData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeKomperhensifData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeKomperhensifData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeKomperhensifData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeKomperhensifData.qtyBef = UtilSql.getValue(result, "QTY_BEF");
        objectAccountTreeKomperhensifData.qtycreditBef = UtilSql.getValue(result, "QTYCREDIT_BEF");
        objectAccountTreeKomperhensifData.qtyAud = UtilSql.getValue(result, "QTY_AUD");
        objectAccountTreeKomperhensifData.qtycreditAud = UtilSql.getValue(result, "QTYCREDIT_AUD");
        objectAccountTreeKomperhensifData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeKomperhensifData);
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
    AccountTreeKomperhensifData objectAccountTreeKomperhensifData[] = new AccountTreeKomperhensifData[vector.size()];
    vector.copyInto(objectAccountTreeKomperhensifData);
    return(objectAccountTreeKomperhensifData);
  }

  public static AccountTreeKomperhensifData[] selectFactAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef)    throws ServletException {
    return selectFactAcct(connectionProvider, adOrgClient, adUserClient, dateFrom, dateTo, acctschema, org, agno, openingEntryOwner, dateFromRef, dateToRef, agnoRef, openingEntryOwnerRef, 0, 0);
  }

  public static AccountTreeKomperhensifData[] selectFactAcct(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String dateFrom, String dateTo, String acctschema, String org, String agno, String openingEntryOwner, String dateFromRef, String dateToRef, String agnoRef, String openingEntryOwnerRef, int firstRegister, int numberRegisters)    throws ServletException {
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
        AccountTreeKomperhensifData objectAccountTreeKomperhensifData = new AccountTreeKomperhensifData();
        objectAccountTreeKomperhensifData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeKomperhensifData.qty = UtilSql.getValue(result, "QTY");
        objectAccountTreeKomperhensifData.qtycredit = UtilSql.getValue(result, "QTYCREDIT");
        objectAccountTreeKomperhensifData.qtyRef = UtilSql.getValue(result, "QTY_REF");
        objectAccountTreeKomperhensifData.qtycreditRef = UtilSql.getValue(result, "QTYCREDIT_REF");
        objectAccountTreeKomperhensifData.qtyBef = UtilSql.getValue(result, "QTY_BEF");
        objectAccountTreeKomperhensifData.qtycreditBef = UtilSql.getValue(result, "QTYCREDIT_BEF");
        objectAccountTreeKomperhensifData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeKomperhensifData);
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
    AccountTreeKomperhensifData objectAccountTreeKomperhensifData[] = new AccountTreeKomperhensifData[vector.size()];
    vector.copyInto(objectAccountTreeKomperhensifData);
    return(objectAccountTreeKomperhensifData);
  }

  public static AccountTreeKomperhensifData[] selectForms(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient)    throws ServletException {
    return selectForms(connectionProvider, adOrgClient, adUserClient, 0, 0);
  }

  public static AccountTreeKomperhensifData[] selectForms(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, int firstRegister, int numberRegisters)    throws ServletException {
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
        AccountTreeKomperhensifData objectAccountTreeKomperhensifData = new AccountTreeKomperhensifData();
        objectAccountTreeKomperhensifData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeKomperhensifData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeKomperhensifData.accountsign = UtilSql.getValue(result, "ACCOUNTSIGN");
        objectAccountTreeKomperhensifData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeKomperhensifData);
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
    AccountTreeKomperhensifData objectAccountTreeKomperhensifData[] = new AccountTreeKomperhensifData[vector.size()];
    vector.copyInto(objectAccountTreeKomperhensifData);
    return(objectAccountTreeKomperhensifData);
  }

  public static AccountTreeKomperhensifData[] selectOperands(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String element)    throws ServletException {
    return selectOperands(connectionProvider, adOrgClient, adUserClient, element, 0, 0);
  }

  public static AccountTreeKomperhensifData[] selectOperands(ConnectionProvider connectionProvider, String adOrgClient, String adUserClient, String element, int firstRegister, int numberRegisters)    throws ServletException {
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
        AccountTreeKomperhensifData objectAccountTreeKomperhensifData = new AccountTreeKomperhensifData();
        objectAccountTreeKomperhensifData.id = UtilSql.getValue(result, "ID");
        objectAccountTreeKomperhensifData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectAccountTreeKomperhensifData.sign = UtilSql.getValue(result, "SIGN");
        objectAccountTreeKomperhensifData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountTreeKomperhensifData);
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
    AccountTreeKomperhensifData objectAccountTreeKomperhensifData[] = new AccountTreeKomperhensifData[vector.size()];
    vector.copyInto(objectAccountTreeKomperhensifData);
    return(objectAccountTreeKomperhensifData);
  }
}
