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

public class ComboTableQueryData implements FieldProvider {
static Logger log4j = Logger.getLogger(ComboTableQueryData.class);
  private String InitRecordNumber="0";
  public String referenceid;
  public String tablename;
  public String keyname;
  public String displayname;
  public String isvaluedisplayed;
  public String columnname;
  public String whereclause;
  public String orderbyclause;
  public String clause;
  public String name;
  public String reference;
  public String required;
  public String referencevalue;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("REFERENCEID"))
      return referenceid;
    else if (fieldName.equalsIgnoreCase("TABLENAME"))
      return tablename;
    else if (fieldName.equalsIgnoreCase("KEYNAME"))
      return keyname;
    else if (fieldName.equalsIgnoreCase("DISPLAYNAME"))
      return displayname;
    else if (fieldName.equalsIgnoreCase("ISVALUEDISPLAYED"))
      return isvaluedisplayed;
    else if (fieldName.equalsIgnoreCase("COLUMNNAME"))
      return columnname;
    else if (fieldName.equalsIgnoreCase("WHERECLAUSE"))
      return whereclause;
    else if (fieldName.equalsIgnoreCase("ORDERBYCLAUSE"))
      return orderbyclause;
    else if (fieldName.equalsIgnoreCase("CLAUSE"))
      return clause;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("REFERENCE"))
      return reference;
    else if (fieldName.equalsIgnoreCase("REQUIRED"))
      return required;
    else if (fieldName.equalsIgnoreCase("REFERENCEVALUE"))
      return referencevalue;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ComboTableQueryData[] selectRefTable(ConnectionProvider connectionProvider, String reference)    throws ServletException {
    return selectRefTable(connectionProvider, reference, 0, 0);
  }

  public static ComboTableQueryData[] selectRefTable(ConnectionProvider connectionProvider, String reference, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT ad_ref_table.ad_reference_id as referenceId, ad_table.tablename as tableName, c1.columnname as keyName, c2.columnname as displayName, isvaluedisplayed, c2.columnname as columnname, " +
      "        whereclause, orderbyclause, '' as clause," +
      "        c2.columnname as name, c2.ad_reference_id as reference, 'Y' as required, c2.AD_REFERENCE_VALUE_ID as referenceValue" +
      "       FROM ad_ref_table, ad_table, ad_column c1, ad_column c2" +
      "        WHERE ad_ref_table.ad_table_id = ad_table.ad_table_id" +
      "          AND ad_ref_table.ad_key = c1.ad_column_id" +
      "          AND ad_ref_table.ad_display = c2.ad_column_id" +
      "          AND ad_ref_table.ad_reference_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reference);

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
        ComboTableQueryData objectComboTableQueryData = new ComboTableQueryData();
        objectComboTableQueryData.referenceid = UtilSql.getValue(result, "REFERENCEID");
        objectComboTableQueryData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectComboTableQueryData.keyname = UtilSql.getValue(result, "KEYNAME");
        objectComboTableQueryData.displayname = UtilSql.getValue(result, "DISPLAYNAME");
        objectComboTableQueryData.isvaluedisplayed = UtilSql.getValue(result, "ISVALUEDISPLAYED");
        objectComboTableQueryData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectComboTableQueryData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectComboTableQueryData.orderbyclause = UtilSql.getValue(result, "ORDERBYCLAUSE");
        objectComboTableQueryData.clause = UtilSql.getValue(result, "CLAUSE");
        objectComboTableQueryData.name = UtilSql.getValue(result, "NAME");
        objectComboTableQueryData.reference = UtilSql.getValue(result, "REFERENCE");
        objectComboTableQueryData.required = UtilSql.getValue(result, "REQUIRED");
        objectComboTableQueryData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectComboTableQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectComboTableQueryData);
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
    ComboTableQueryData objectComboTableQueryData[] = new ComboTableQueryData[vector.size()];
    vector.copyInto(objectComboTableQueryData);
    return(objectComboTableQueryData);
  }

  public static boolean isValueDisplayed(ConnectionProvider connectionProvider, String reference)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT count(*) as isvaluedisplayed" +
      "         FROM ad_reference" +
      "        WHERE ad_reference_id = ?" +
      "          AND isvaluedisplayed = 'Y'";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reference);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "ISVALUEDISPLAYED").equals("0");
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
    return(boolReturn);
  }

  public static ComboTableQueryData[] identifierColumns(ConnectionProvider connectionProvider, String tableName)    throws ServletException {
    return identifierColumns(connectionProvider, tableName, 0, 0);
  }

  public static ComboTableQueryData[] identifierColumns(ConnectionProvider connectionProvider, String tableName, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ad_column.columnname as name, ad_reference_id as reference, ismandatory as required, " +
      "        REPLACE(replace(REPLACE(AD_ELEMENT.columnname, 'Substitute_ID', 'M_Product_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as columnname, ad_reference_value_id as referencevalue, ad_table.tablename AS tablename " +
      "        FROM ad_column left join ad_element on ad_column.ad_element_id = ad_element.ad_element_id, " +
      "             ad_table " +
      "        WHERE UPPER(ad_table.tablename) = UPPER(?)" +
      "          AND ad_column.ad_table_id = ad_table.ad_table_id" +
      "          AND isidentifier = 'Y'" +
      "        ORDER BY ad_column.SeqNo";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tableName);

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
        ComboTableQueryData objectComboTableQueryData = new ComboTableQueryData();
        objectComboTableQueryData.name = UtilSql.getValue(result, "NAME");
        objectComboTableQueryData.reference = UtilSql.getValue(result, "REFERENCE");
        objectComboTableQueryData.required = UtilSql.getValue(result, "REQUIRED");
        objectComboTableQueryData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectComboTableQueryData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectComboTableQueryData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectComboTableQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectComboTableQueryData);
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
    ComboTableQueryData objectComboTableQueryData[] = new ComboTableQueryData[vector.size()];
    vector.copyInto(objectComboTableQueryData);
    return(objectComboTableQueryData);
  }

  public static String getValidation(ConnectionProvider connectionProvider, String adValRuleId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT CODE" +
      "        FROM AD_VAL_RULE " +
      "        WHERE AD_VAL_RULE_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adValRuleId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "CODE");
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

  public static ComboTableQueryData[] selectTranslatedColumn(ConnectionProvider connectionProvider, String tablename, String columnname)    throws ServletException {
    return selectTranslatedColumn(connectionProvider, tablename, columnname, 0, 0);
  }

  public static ComboTableQueryData[] selectTranslatedColumn(ConnectionProvider connectionProvider, String tablename, String columnname, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT T_TRL.TABLENAME AS TABLENAME, C_TRL.COLUMNNAME AS COLUMNNAME, C_ID.COLUMNNAME AS REFERENCE" +
      "        FROM AD_COLUMN C, AD_TABLE T, AD_TABLE T_TRL, AD_COLUMN C_TRL, " +
      "        AD_COLUMN C_ID" +
      "        WHERE T.AD_TABLE_ID = C.AD_TABLE_ID " +
      "        AND UPPER(T.TABLENAME) = UPPER(?)" +
      "        AND C.ISTRANSLATED = 'Y'" +
      "        AND UPPER(C.COLUMNNAME) = UPPER(?)" +
      "        AND (UPPER(T.TABLENAME) || '_TRL') = UPPER(T_TRL.TABLENAME) " +
      "        AND T_TRL.AD_TABLE_ID = C_TRL.AD_TABLE_ID " +
      "        AND UPPER(C.COLUMNNAME) = UPPER(C_TRL.COLUMNNAME)" +
      "        AND T.AD_TABLE_ID = C_ID.AD_TABLE_ID " +
      "        AND (C_ID.ISSECONDARYKEY = 'Y' OR C_ID.ISKEY = 'Y')" +
      "        AND UPPER(C_ID.COLUMNNAME) <> 'AD_LANGUAGE'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnname);

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
        ComboTableQueryData objectComboTableQueryData = new ComboTableQueryData();
        objectComboTableQueryData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectComboTableQueryData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectComboTableQueryData.reference = UtilSql.getValue(result, "REFERENCE");
        objectComboTableQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectComboTableQueryData);
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
    ComboTableQueryData objectComboTableQueryData[] = new ComboTableQueryData[vector.size()];
    vector.copyInto(objectComboTableQueryData);
    return(objectComboTableQueryData);
  }

  public static String getReferenceID(ConnectionProvider connectionProvider, String value, String validationtype)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_REFERENCE_ID" +
      "        FROM AD_REFERENCE " +
      "        WHERE UPPER(NAME) = UPPER(?) " +
      "        AND PARENTREFERENCE_ID = ?" +
      "        AND AD_MODULE_ID = '0'";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, validationtype);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_REFERENCE_ID");
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

  public static String getBaseReferenceID(ConnectionProvider connectionProvider, String value)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_REFERENCE_ID" +
      "        FROM AD_REFERENCE " +
      "        WHERE UPPER(NAME) = UPPER(?) " +
      "        AND isBaseReference = 'Y'";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_REFERENCE_ID");
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

  public static String getValidationID(ConnectionProvider connectionProvider, String value)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_VAL_RULE_ID" +
      "        FROM AD_VAL_RULE " +
      "        WHERE UPPER(NAME) = UPPER(?)";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_VAL_RULE_ID");
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
