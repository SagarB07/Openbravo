//Sqlc generated V1.O00-1
package org.openbravo.wad;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

public class TableRelationData implements FieldProvider {
static Logger log4j = Logger.getLogger(TableRelationData.class);
  private String InitRecordNumber="0";
  public String referenceid;
  public String tablename;
  public String keyname;
  public String displayname;
  public String isvaluedisplayed;
  public String fromclause;
  public String istranslated;
  public String whereclause;
  public String orderbyclause;
  public String clause;
  public String code;
  public String adValRuleId;
  public String parameters;
  public String name;
  public String reference;
  public String required;
  public String referencevalue;
  public String referencekey;
  public String referencevaluekey;

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
    else if (fieldName.equalsIgnoreCase("FROMCLAUSE"))
      return fromclause;
    else if (fieldName.equalsIgnoreCase("ISTRANSLATED"))
      return istranslated;
    else if (fieldName.equalsIgnoreCase("WHERECLAUSE"))
      return whereclause;
    else if (fieldName.equalsIgnoreCase("ORDERBYCLAUSE"))
      return orderbyclause;
    else if (fieldName.equalsIgnoreCase("CLAUSE"))
      return clause;
    else if (fieldName.equalsIgnoreCase("CODE"))
      return code;
    else if (fieldName.equalsIgnoreCase("AD_VAL_RULE_ID") || fieldName.equals("adValRuleId"))
      return adValRuleId;
    else if (fieldName.equalsIgnoreCase("PARAMETERS"))
      return parameters;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("REFERENCE"))
      return reference;
    else if (fieldName.equalsIgnoreCase("REQUIRED"))
      return required;
    else if (fieldName.equalsIgnoreCase("REFERENCEVALUE"))
      return referencevalue;
    else if (fieldName.equalsIgnoreCase("REFERENCEKEY"))
      return referencekey;
    else if (fieldName.equalsIgnoreCase("REFERENCEVALUEKEY"))
      return referencevaluekey;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
The table references in dictionary
 */
  public static TableRelationData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

/**
The table references in dictionary
 */
  public static TableRelationData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_ref_table.ad_reference_id as referenceId, ad_table.tablename as tableName, c1.columnname as keyName, c2.columnname as displayName, isvaluedisplayed, ad_table.tablename as fromclause, c2.isTranslated, " +
      "        whereclause, orderbyclause, '' as clause, '' as code, '' as AD_VAL_RULE_ID, '' as parameters," +
      "        c2.columnname as name, c2.ad_reference_id as reference, 'Y' as required, c2.AD_REFERENCE_VALUE_ID as referenceValue, " +
      "        '' as referenceKey, '' as referencevalueKey" +
      "       FROM ad_ref_table, ad_table, ad_column c1, ad_column c2" +
      "        WHERE ad_ref_table.ad_table_id = ad_table.ad_table_id" +
      "          AND ad_ref_table.ad_key = c1.ad_column_id" +
      "          AND ad_ref_table.ad_display = c2.ad_column_id" +
      "       ORDER BY AD_REF_TABLE.ad_reference_id";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

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
        TableRelationData objectTableRelationData = new TableRelationData();
        objectTableRelationData.referenceid = UtilSql.getValue(result, "REFERENCEID");
        objectTableRelationData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectTableRelationData.keyname = UtilSql.getValue(result, "KEYNAME");
        objectTableRelationData.displayname = UtilSql.getValue(result, "DISPLAYNAME");
        objectTableRelationData.isvaluedisplayed = UtilSql.getValue(result, "ISVALUEDISPLAYED");
        objectTableRelationData.fromclause = UtilSql.getValue(result, "FROMCLAUSE");
        objectTableRelationData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectTableRelationData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectTableRelationData.orderbyclause = UtilSql.getValue(result, "ORDERBYCLAUSE");
        objectTableRelationData.clause = UtilSql.getValue(result, "CLAUSE");
        objectTableRelationData.code = UtilSql.getValue(result, "CODE");
        objectTableRelationData.adValRuleId = UtilSql.getValue(result, "AD_VAL_RULE_ID");
        objectTableRelationData.parameters = UtilSql.getValue(result, "PARAMETERS");
        objectTableRelationData.name = UtilSql.getValue(result, "NAME");
        objectTableRelationData.reference = UtilSql.getValue(result, "REFERENCE");
        objectTableRelationData.required = UtilSql.getValue(result, "REQUIRED");
        objectTableRelationData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectTableRelationData.referencekey = UtilSql.getValue(result, "REFERENCEKEY");
        objectTableRelationData.referencevaluekey = UtilSql.getValue(result, "REFERENCEVALUEKEY");
        objectTableRelationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableRelationData);
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
    TableRelationData objectTableRelationData[] = new TableRelationData[vector.size()];
    vector.copyInto(objectTableRelationData);
    return(objectTableRelationData);
  }

/**
The table references in dictionary
 */
  public static TableRelationData[] selectRefTable(ConnectionProvider connectionProvider, String reference)    throws ServletException {
    return selectRefTable(connectionProvider, reference, 0, 0);
  }

/**
The table references in dictionary
 */
  public static TableRelationData[] selectRefTable(ConnectionProvider connectionProvider, String reference, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT ad_ref_table.ad_reference_id as referenceId, ad_table.tablename as tableName, c1.columnname as keyName, c2.columnname as displayName, isvaluedisplayed," +
      "        whereclause, orderbyclause, '' as clause, c2.isTranslated, " +
      "        c2.columnname as name, c2.ad_reference_id as reference, 'Y' as required, c2.AD_REFERENCE_VALUE_ID as referenceValue, " +
      "        c1.ad_reference_id as referenceKey, c1.ad_reference_value_id as referencevalueKey" +
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
        TableRelationData objectTableRelationData = new TableRelationData();
        objectTableRelationData.referenceid = UtilSql.getValue(result, "REFERENCEID");
        objectTableRelationData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectTableRelationData.keyname = UtilSql.getValue(result, "KEYNAME");
        objectTableRelationData.displayname = UtilSql.getValue(result, "DISPLAYNAME");
        objectTableRelationData.isvaluedisplayed = UtilSql.getValue(result, "ISVALUEDISPLAYED");
        objectTableRelationData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectTableRelationData.orderbyclause = UtilSql.getValue(result, "ORDERBYCLAUSE");
        objectTableRelationData.clause = UtilSql.getValue(result, "CLAUSE");
        objectTableRelationData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectTableRelationData.name = UtilSql.getValue(result, "NAME");
        objectTableRelationData.reference = UtilSql.getValue(result, "REFERENCE");
        objectTableRelationData.required = UtilSql.getValue(result, "REQUIRED");
        objectTableRelationData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectTableRelationData.referencekey = UtilSql.getValue(result, "REFERENCEKEY");
        objectTableRelationData.referencevaluekey = UtilSql.getValue(result, "REFERENCEVALUEKEY");
        objectTableRelationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableRelationData);
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
    TableRelationData objectTableRelationData[] = new TableRelationData[vector.size()];
    vector.copyInto(objectTableRelationData);
    return(objectTableRelationData);
  }

/**
The table references in dictionary
 */
  public static boolean existsTableColumn(ConnectionProvider connectionProvider, String tablename, String columnname)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(t.AD_TABLE_ID) AS TOTAL FROM AD_TABLE t, AD_COLUMN c " +
      "        WHERE c.ad_table_id = t.ad_table_id " +
      "        AND UPPER(t.TABLENAME) = UPPER(?) " +
      "        AND UPPER(c.columnname) = UPPER(?)";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columnname);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "TOTAL").equals("0");
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
}
