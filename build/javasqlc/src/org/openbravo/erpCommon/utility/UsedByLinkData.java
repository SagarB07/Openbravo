//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class UsedByLinkData implements FieldProvider {
static Logger log4j = Logger.getLogger(UsedByLinkData.class);
  private String InitRecordNumber="0";
  public String elementName;
  public String name;
  public String referencedColumnId;
  public String tablename;
  public String columnname;
  public String adTabId;
  public String hastree;
  public String id;
  public String whereclause;
  public String total;
  public String windowname;
  public String tabname;
  public String accessible;
  public String adWindowId;
  public String adMenuName;
  public String uipattern;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ELEMENT_NAME") || fieldName.equals("elementName"))
      return elementName;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("REFERENCED_COLUMN_ID") || fieldName.equals("referencedColumnId"))
      return referencedColumnId;
    else if (fieldName.equalsIgnoreCase("TABLENAME"))
      return tablename;
    else if (fieldName.equalsIgnoreCase("COLUMNNAME"))
      return columnname;
    else if (fieldName.equalsIgnoreCase("AD_TAB_ID") || fieldName.equals("adTabId"))
      return adTabId;
    else if (fieldName.equalsIgnoreCase("HASTREE"))
      return hastree;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("WHERECLAUSE"))
      return whereclause;
    else if (fieldName.equalsIgnoreCase("TOTAL"))
      return total;
    else if (fieldName.equalsIgnoreCase("WINDOWNAME"))
      return windowname;
    else if (fieldName.equalsIgnoreCase("TABNAME"))
      return tabname;
    else if (fieldName.equalsIgnoreCase("ACCESSIBLE"))
      return accessible;
    else if (fieldName.equalsIgnoreCase("AD_WINDOW_ID") || fieldName.equals("adWindowId"))
      return adWindowId;
    else if (fieldName.equalsIgnoreCase("AD_MENU_NAME") || fieldName.equals("adMenuName"))
      return adMenuName;
    else if (fieldName.equalsIgnoreCase("UIPATTERN"))
      return uipattern;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static UsedByLinkData[] select(ConnectionProvider connectionProvider, String adClientId, String adLanguage, String role, String columnnId, String columnname, String adTableId, String colList)    throws ServletException {
    return select(connectionProvider, adClientId, adLanguage, role, columnnId, columnname, adTableId, colList, 0, 0);
  }

  public static UsedByLinkData[] select(ConnectionProvider connectionProvider, String adClientId, String adLanguage, String role, String columnnId, String columnname, String adTableId, String colList, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_PARENT_MENU_ELEMENT(M.AD_MENU_ID, ?, ?) AS ELEMENT_NAME, " +
      "        ((case when Wt.NAME IS NULL then W.NAME else  Wt.NAME end) || ' - ' || " +
      "        (case when TBt.NAME IS NULL then TB.NAME else TBt.NAME end)) AS NAME, " +
      "        a.referenced_column_id," +
      "        T.TABLENAME, C.COLUMNNAME, TB.AD_TAB_ID, '' AS HASTREE, '' AS ID, '' AS WHERECLAUSE, 0 AS TOTAL, " +
      "        (case when Wt.NAME IS NULL then W.NAME else  Wt.NAME end) AS WINDOWNAME, " +
      "        (case when TBt.NAME IS NULL then TB.NAME else TBt.NAME end) AS TABNAME," +
      "        (CASE WHEN (SELECT COUNT(*)" +
      "                     FROM AD_WINDOW_ACCESS WA" +
      "                    WHERE W.AD_WINDOW_ID = WA.AD_WINDOW_ID" +
      "                      AND WA.ISACTIVE = 'Y'" +
      "                      AND WA.AD_ROLE_ID = ?)=0 THEN 'N'" +
      "                                               ELSE 'Y' " +
      "                                               END) AS ACCESSIBLE," +
      "        W.AD_WINDOW_ID as AD_WINDOW_ID," +
      "        '' as AD_MENU_NAME," +
      "        '' as UIPATTERN" +
      "        FROM  (" +
      "          SELECT AD_COLUMN_ID, ? as referenced_column_id " +
      "            FROM AD_COLUMN" +
      "           WHERE UPPER(COLUMNNAME) = UPPER(?) " +
      "             AND (ISPARENT='Y' OR AD_REFERENCE_ID IN ('19', '35'))" +
      "        UNION " +
      "          SELECT AD_COLUMN.AD_COLUMN_ID, ? as referenced_column_id  " +
      "            FROM AD_COLUMN, AD_ELEMENT " +
      "           WHERE AD_COLUMN.AD_ELEMENT_ID = AD_ELEMENT.AD_ELEMENT_ID " +
      "             AND UPPER(REPLACE(REPLACE(REPLACE(AD_ELEMENT.columnname, 'Substitute_ID', 'M_Product_ID'),'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID')) = UPPER(?) " +
      "             AND AD_REFERENCE_ID IN ('30', '31')" +
      "             AND AD_REFERENCE_VALUE_ID IS NULL" +
      "        UNION" +
      "          SELECT C.AD_COLUMN_ID, s.ad_column_id as referenced_column_id" +
      "            FROM AD_COLUMN C, AD_REF_SEARCH S" +
      "           WHERE C.AD_REFERENCE_ID = '30'" +
      "             AND S.AD_TABLE_ID = ?" +
      "             AND C.AD_REFERENCE_VALUE_ID = S.AD_REFERENCE_ID" +
      "        UNION " +
      "           SELECT C.AD_COLUMN_ID, r.ad_key as referenced_column_id " +
      "             FROM AD_COLUMN C, AD_REF_TABLE R " +
      "            WHERE C.AD_REFERENCE_ID = '18' " +
      "              AND C.AD_REFERENCE_VALUE_ID = R.AD_REFERENCE_ID" +
      "              AND R.AD_TABLE_ID = ?" +
      "        UNION " +
      "          SELECT AD_COLUMN_ID, ? as referenced_column_id " +
      "            FROM AD_COLUMN " +
      "           WHERE AD_REFERENCE_ID = '21' " +
      "             AND UPPER(?) = 'C_LOCATION_ID'" +
      "        UNION" +
      "            SELECT AD_COLUMN_ID, AD_COLUMN_ID as referenced_column_id " +
      "              FROM AD_COLUMN" +
      "             WHERE AD_COLUMN_ID IN (";
    strSql = strSql + ((colList==null || colList.equals(""))?"":colList);
    strSql = strSql + 
      ")" +
      "        ) A, AD_TABLE T, AD_COLUMN C, AD_MENU M, " +
      "        AD_WINDOW W left join  AD_WINDOW_TRL Wt on W.AD_WINDOW_ID = Wt.AD_WINDOW_ID " +
      "                                                AND Wt.AD_LANGUAGE  = ?," +
      "        AD_TAB TB left join AD_TAB_TRL TBt on TB.AD_TAB_ID = TBt.AD_TAB_ID " +
      "                                          AND TBt.AD_LANGUAGE  = ?," +
      "        AD_FIELD F left join AD_FIELD_TRL Ft on F.AD_FIELD_ID = Ft.AD_FIELD_ID" +
      "                                            AND Ft.AD_LANGUAGE  = ? " +
      "        WHERE W.AD_WINDOW_ID = TB.AD_WINDOW_ID" +
      "        AND TB.AD_TABLE_ID = T.AD_TABLE_ID" +
      "        AND T.AD_TABLE_ID = C.AD_TABLE_ID " +
      "        AND UPPER(T.dataorigintype) = 'TABLE'" +
      "        AND C.AD_COLUMN_ID = A.AD_COLUMN_ID " +
      "        AND C.AD_COLUMN_ID = F.AD_COLUMN_ID " +
      "        AND W.AD_WINDOW_ID = M.AD_WINDOW_ID " +
      "        AND TB.ISACTIVE = 'Y' " +
      "        AND W.ISACTIVE = 'Y' " +
      "        AND (TB.WHERECLAUSE IS NULL OR TB.WHERECLAUSE NOT LIKE '%@%') " +
      "        AND C.SQLLOGIC is NULL" +
      "        GROUP BY M.AD_MENU_ID, (case when Wt.NAME IS NULL then W.NAME else  Wt.NAME end), " +
      "        (case when TBt.NAME IS NULL then TB.NAME else TBt.NAME end), a.referenced_column_id, T.TABLENAME, C.COLUMNNAME, TB.AD_TAB_ID, W.AD_WINDOW_ID" +
      "        ORDER BY 1, (case when Wt.NAME IS NULL then W.NAME else  Wt.NAME end), " +
      "        (case when TBt.NAME IS NULL then TB.NAME else TBt.NAME end), T.TABLENAME, C.COLUMNNAME, TB.AD_TAB_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, role);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnnId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnnId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnnId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnname);
      if (colList != null && !(colList.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);

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
        UsedByLinkData objectUsedByLinkData = new UsedByLinkData();
        objectUsedByLinkData.elementName = UtilSql.getValue(result, "ELEMENT_NAME");
        objectUsedByLinkData.name = UtilSql.getValue(result, "NAME");
        objectUsedByLinkData.referencedColumnId = UtilSql.getValue(result, "REFERENCED_COLUMN_ID");
        objectUsedByLinkData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectUsedByLinkData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectUsedByLinkData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectUsedByLinkData.hastree = UtilSql.getValue(result, "HASTREE");
        objectUsedByLinkData.id = UtilSql.getValue(result, "ID");
        objectUsedByLinkData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectUsedByLinkData.total = UtilSql.getValue(result, "TOTAL");
        objectUsedByLinkData.windowname = UtilSql.getValue(result, "WINDOWNAME");
        objectUsedByLinkData.tabname = UtilSql.getValue(result, "TABNAME");
        objectUsedByLinkData.accessible = UtilSql.getValue(result, "ACCESSIBLE");
        objectUsedByLinkData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectUsedByLinkData.adMenuName = UtilSql.getValue(result, "AD_MENU_NAME");
        objectUsedByLinkData.uipattern = UtilSql.getValue(result, "UIPATTERN");
        objectUsedByLinkData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUsedByLinkData);
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
    UsedByLinkData objectUsedByLinkData[] = new UsedByLinkData[vector.size()];
    vector.copyInto(objectUsedByLinkData);
    return(objectUsedByLinkData);
  }

  public static String tabName(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT W.NAME || ' - ' || TB.NAME AS NAME " +
      "        FROM AD_WINDOW W, AD_TAB TB " +
      "        WHERE W.AD_WINDOW_ID = TB.AD_WINDOW_ID " +
      "        AND TB.AD_TAB_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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

  public static String tabNameLanguage(ConnectionProvider connectionProvider, String adLanguage, String adTabId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ((case when Wt.NAME IS NULL then W.NAME else Wt.NAME end) || ' - ' || " +
      "        (case when TBt.NAME IS NULL then TB.NAME else TBt.NAME end)) AS NAME " +
      "        FROM AD_WINDOW W left join AD_WINDOW_TRL Wt on W.AD_WINDOW_ID = Wt.AD_WINDOW_ID " +
      "                                                    AND Wt.AD_LANGUAGE  = ? , " +
      "             AD_TAB TB left join AD_TAB_TRL TBt on TB.AD_TAB_ID = TBt.AD_TAB_ID " +
      "                                                AND TBt.AD_LANGUAGE  = ? " +
      "        WHERE W.AD_WINDOW_ID = TB.AD_WINDOW_ID " +
      "        AND TB.AD_TAB_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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

  public static UsedByLinkData[] keyColumns(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    return keyColumns(connectionProvider, adTabId, 0, 0);
  }

  public static UsedByLinkData[] keyColumns(ConnectionProvider connectionProvider, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C.COLUMNNAME AS NAME " +
      "        FROM AD_COLUMN C, AD_FIELD F " +
      "        WHERE C.AD_COLUMN_ID = F.AD_COLUMN_ID " +
      "        AND C.ISACTIVE = 'Y' " +
      "        AND COALESCE(C.ISKEY,C.ISSECONDARYKEY) = 'Y'" +
      "        AND F.AD_TAB_ID = ? " +
      "        ORDER BY C.SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

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
        UsedByLinkData objectUsedByLinkData = new UsedByLinkData();
        objectUsedByLinkData.name = UtilSql.getValue(result, "NAME");
        objectUsedByLinkData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUsedByLinkData);
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
    UsedByLinkData objectUsedByLinkData[] = new UsedByLinkData[vector.size()];
    vector.copyInto(objectUsedByLinkData);
    return(objectUsedByLinkData);
  }

  public static UsedByLinkData[] windowRef(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    return windowRef(connectionProvider, adTabId, 0, 0);
  }

  public static UsedByLinkData[] windowRef(ConnectionProvider connectionProvider, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT W.NAME AS WINDOWNAME, T.NAME AS TABNAME, T.HASTREE, T.WHERECLAUSE " +
      "        FROM AD_WINDOW W, AD_TAB T" +
      "        WHERE W.AD_WINDOW_ID = T.AD_WINDOW_ID " +
      "        AND T.AD_TAB_ID = ? ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

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
        UsedByLinkData objectUsedByLinkData = new UsedByLinkData();
        objectUsedByLinkData.windowname = UtilSql.getValue(result, "WINDOWNAME");
        objectUsedByLinkData.tabname = UtilSql.getValue(result, "TABNAME");
        objectUsedByLinkData.hastree = UtilSql.getValue(result, "HASTREE");
        objectUsedByLinkData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectUsedByLinkData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUsedByLinkData);
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
    UsedByLinkData objectUsedByLinkData[] = new UsedByLinkData[vector.size()];
    vector.copyInto(objectUsedByLinkData);
    return(objectUsedByLinkData);
  }

  public static UsedByLinkData[] selectLinks(ConnectionProvider connectionProvider, String fields, String tablename, String keyColumn, String adLanguage, String tabid, String columnname, String keyId, String whereclause)    throws ServletException {
    return selectLinks(connectionProvider, fields, tablename, keyColumn, adLanguage, tabid, columnname, keyId, whereclause, 0, 0);
  }

  public static UsedByLinkData[] selectLinks(ConnectionProvider connectionProvider, String fields, String tablename, String keyColumn, String adLanguage, String tabid, String columnname, String keyId, String whereclause, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (";
    strSql = strSql + ((fields==null || fields.equals(""))?"":fields);
    strSql = strSql + 
      ") AS ID," +
      "        (AD_COLUMN_IDENTIFIER(?,TO_CHAR(";
    strSql = strSql + ((keyColumn==null || keyColumn.equals(""))?"":keyColumn);
    strSql = strSql + 
      "),?)) AS NAME," +
      "        tab1.AD_TAB_ID AS AD_TAB_ID," +
      "        tab1.AD_WINDOW_ID AS AD_WINDOW_ID," +
      "        table1.NAME AS TABLENAME," +
      "        menu1.NAME AS AD_MENU_NAME," +
      "        tab1.UIPATTERN" +
      "        FROM ";
    strSql = strSql + ((tablename==null || tablename.equals(""))?"":tablename);
    strSql = strSql + 
      "        LEFT OUTER JOIN AD_TAB   tab1 ON (tab1.AD_TAB_ID = ?)" +
      "        LEFT OUTER JOIN AD_TABLE table1 ON (tab1.AD_TABLE_ID = table1.AD_TABLE_ID)" +
      "        LEFT OUTER JOIN AD_MENU  menu1 ON (menu1.AD_WINDOW_ID = tab1.AD_WINDOW_ID)" +
      "        WHERE ";
    strSql = strSql + ((columnname==null || columnname.equals(""))?"":columnname);
    strSql = strSql + 
      " = ? " +
      "        AND 1=1 ";
    strSql = strSql + ((whereclause==null || whereclause.equals(""))?"":whereclause);
    strSql = strSql + 
      "        ORDER BY 2";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (fields != null && !(fields.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablename);
      if (keyColumn != null && !(keyColumn.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (tablename != null && !(tablename.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tabid);
      if (columnname != null && !(columnname.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, keyId);
      if (whereclause != null && !(whereclause.equals(""))) {
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
        UsedByLinkData objectUsedByLinkData = new UsedByLinkData();
        objectUsedByLinkData.id = UtilSql.getValue(result, "ID");
        objectUsedByLinkData.name = UtilSql.getValue(result, "NAME");
        objectUsedByLinkData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectUsedByLinkData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectUsedByLinkData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectUsedByLinkData.adMenuName = UtilSql.getValue(result, "AD_MENU_NAME");
        objectUsedByLinkData.uipattern = UtilSql.getValue(result, "UIPATTERN");
        objectUsedByLinkData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUsedByLinkData);
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
    UsedByLinkData objectUsedByLinkData[] = new UsedByLinkData[vector.size()];
    vector.copyInto(objectUsedByLinkData);
    return(objectUsedByLinkData);
  }

  public static String countLinks(ConnectionProvider connectionProvider, String tablename, String columnname, String keyId, String whereclause)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(*) AS ID" +
      "        FROM ";
    strSql = strSql + ((tablename==null || tablename.equals(""))?"":tablename);
    strSql = strSql + 
      "        WHERE ";
    strSql = strSql + ((columnname==null || columnname.equals(""))?"":columnname);
    strSql = strSql + 
      " = ? ";
    strSql = strSql + ((whereclause==null || whereclause.equals(""))?"":whereclause);

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (tablename != null && !(tablename.equals(""))) {
        }
      if (columnname != null && !(columnname.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, keyId);
      if (whereclause != null && !(whereclause.equals(""))) {
        }

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

  public static UsedByLinkData[] parentTabTableName(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    return parentTabTableName(connectionProvider, adTabId, 0, 0);
  }

  public static UsedByLinkData[] parentTabTableName(ConnectionProvider connectionProvider, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT T2.AD_TAB_ID, AD_TABLE.TABLENAME " +
      "        FROM AD_TAB T1, AD_TAB T2, AD_TABLE " +
      "        WHERE T1.AD_TAB_ID = ? " +
      "        AND T2.AD_WINDOW_ID = T1.AD_WINDOW_ID " +
      "        AND T2.AD_TABLE_ID = AD_TABLE.AD_TABLE_ID " +
      "        AND T2.TABLEVEL = T1.TABLEVEL-1" +
      "        AND T2.SEQNO < T1.SEQNO" +
      "        ORDER BY T2.SEQNO DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

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
        UsedByLinkData objectUsedByLinkData = new UsedByLinkData();
        objectUsedByLinkData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectUsedByLinkData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectUsedByLinkData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUsedByLinkData);
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
    UsedByLinkData objectUsedByLinkData[] = new UsedByLinkData[vector.size()];
    vector.copyInto(objectUsedByLinkData);
    return(objectUsedByLinkData);
  }

/**
Name of the columns parent of the tab
 */
  public static UsedByLinkData[] parentsColumnName(ConnectionProvider connectionProvider, String tab, String parentTab)    throws ServletException {
    return parentsColumnName(connectionProvider, tab, parentTab, 0, 0);
  }

/**
Name of the columns parent of the tab
 */
  public static UsedByLinkData[] parentsColumnName(ConnectionProvider connectionProvider, String tab, String parentTab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ColumnName AS NAME" +
      "        FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id AND ad_tab_id = ? AND isParent='Y' " +
      "        AND EXISTS(SELECT 1 FROM AD_COLUMN c, AD_FIELD f WHERE c.ad_column_id = f.ad_column_id AND c.iskey='Y'" +
      "        AND ad_tab_id=? AND UPPER(c.columnname) = UPPER(AD_COLUMN.columnname))";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentTab);

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
        UsedByLinkData objectUsedByLinkData = new UsedByLinkData();
        objectUsedByLinkData.name = UtilSql.getValue(result, "NAME");
        objectUsedByLinkData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUsedByLinkData);
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
    UsedByLinkData objectUsedByLinkData[] = new UsedByLinkData[vector.size()];
    vector.copyInto(objectUsedByLinkData);
    return(objectUsedByLinkData);
  }

/**
Name of the columns parent of the tab
 */
  public static UsedByLinkData[] parentsColumnReal(ConnectionProvider connectionProvider, String tab, String parentTab)    throws ServletException {
    return parentsColumnReal(connectionProvider, tab, parentTab, 0, 0);
  }

/**
Name of the columns parent of the tab
 */
  public static UsedByLinkData[] parentsColumnReal(ConnectionProvider connectionProvider, String tab, String parentTab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ColumnName AS NAME " +
      "        FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id AND ad_tab_id = ?" +
      "        AND UPPER(columnname) IN (SELECT UPPER(columnname) FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id " +
      "        AND AD_COLUMN.iskey='Y' " +
      "        AND AD_FIELD.ad_tab_id=?)";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentTab);

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
        UsedByLinkData objectUsedByLinkData = new UsedByLinkData();
        objectUsedByLinkData.name = UtilSql.getValue(result, "NAME");
        objectUsedByLinkData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUsedByLinkData);
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
    UsedByLinkData objectUsedByLinkData[] = new UsedByLinkData[vector.size()];
    vector.copyInto(objectUsedByLinkData);
    return(objectUsedByLinkData);
  }

  public static String getTabTableName(ConnectionProvider connectionProvider, String adTableId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT TABLENAME FROM AD_TABLE " +
      "        WHERE AD_TABLE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TABLENAME");
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

  public static String selectIdentifier(ConnectionProvider connectionProvider, String keyid, String language, String adTableId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_COLUMN_IDENTIFIER(tablename, to_char(?), to_char(?)) as recordidentifier" +
      "        FROM AD_TABLE" +
      "        WHERE AD_TABLE_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, keyid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "RECORDIDENTIFIER");
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

  public static String getCountOfSelfReference(ConnectionProvider connectionProvider, String adTableId, String tableName)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT count(*) as ID " +
      "        FROM AD_TABLE " +
      "        WHERE AD_TABLE_ID = ? " +
      "        AND TABLENAME = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tableName);

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

  public static String selectKeyValue(ConnectionProvider connectionProvider, String columnnname, String tablename, String keyColumn, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ";
    strSql = strSql + ((columnnname==null || columnnname.equals(""))?"":columnnname);
    strSql = strSql + 
      " as ID" +
      "        FROM ";
    strSql = strSql + ((tablename==null || tablename.equals(""))?"":tablename);
    strSql = strSql + 
      "        WHERE ";
    strSql = strSql + ((keyColumn==null || keyColumn.equals(""))?"":keyColumn);
    strSql = strSql + 
      " = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (columnnname != null && !(columnnname.equals(""))) {
        }
      if (tablename != null && !(tablename.equals(""))) {
        }
      if (keyColumn != null && !(keyColumn.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

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

  public static String selectKeyColumnId(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_COLUMN_ID as ID" +
      "        FROM AD_COLUMN" +
      "        WHERE AD_TABLE_ID = ?" +
      "          AND ISKEY='Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

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

  public static String selectColumnName(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COLUMNNAME as ID" +
      "        FROM AD_COLUMN" +
      "        WHERE AD_column_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

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
}
