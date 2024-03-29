//Sqlc generated V1.O00-1
package org.openbravo.wad;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

public class EditionFieldsData implements FieldProvider {
static Logger log4j = Logger.getLogger(EditionFieldsData.class);
  private String InitRecordNumber="0";
  public String adFieldId;
  public String seqno;
  public String adcolumnid;
  public String columnname;
  public String columnnameinp;
  public String name;
  public String required;
  public String referencevalue;
  public String reference;
  public String displaysize;
  public String htmltext;
  public String xmltext;
  public String issameline;
  public String isdisplayed;
  public String isupdateable;
  public String isparent;
  public String fieldlength;
  public String searchname;
  public String adCalloutId;
  public String validateonnew;
  public String adProcessId;
  public String isreadonly;
  public String displaylogic;
  public String isencrypted;
  public String fieldgroup;
  public String tabid;
  public String adColumnId;
  public String adValRuleId;
  public String displaylength;
  public String value;
  public String adWindowId;
  public String valuemin;
  public String valuemax;
  public String realname;
  public String javaClassName;
  public String realcolumnname;
  public String xsqltext;
  public String iscolumnencrypted;
  public String isdesencryptable;
  public String referenceName;
  public String referenceNameTrl;
  public String classname;
  public String mappingname;
  public String calloutname;
  public String classnameCallout;
  public String mappingnameCallout;
  public String columnnameEnd;
  public String isactive;
  public String readonlylogic;
  public String adReferenceId;
  public String adReferenceValueId;
  public String isautosave;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_FIELD_ID") || fieldName.equals("adFieldId"))
      return adFieldId;
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("ADCOLUMNID"))
      return adcolumnid;
    else if (fieldName.equalsIgnoreCase("COLUMNNAME"))
      return columnname;
    else if (fieldName.equalsIgnoreCase("COLUMNNAMEINP"))
      return columnnameinp;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("REQUIRED"))
      return required;
    else if (fieldName.equalsIgnoreCase("REFERENCEVALUE"))
      return referencevalue;
    else if (fieldName.equalsIgnoreCase("REFERENCE"))
      return reference;
    else if (fieldName.equalsIgnoreCase("DISPLAYSIZE"))
      return displaysize;
    else if (fieldName.equalsIgnoreCase("HTMLTEXT"))
      return htmltext;
    else if (fieldName.equalsIgnoreCase("XMLTEXT"))
      return xmltext;
    else if (fieldName.equalsIgnoreCase("ISSAMELINE"))
      return issameline;
    else if (fieldName.equalsIgnoreCase("ISDISPLAYED"))
      return isdisplayed;
    else if (fieldName.equalsIgnoreCase("ISUPDATEABLE"))
      return isupdateable;
    else if (fieldName.equalsIgnoreCase("ISPARENT"))
      return isparent;
    else if (fieldName.equalsIgnoreCase("FIELDLENGTH"))
      return fieldlength;
    else if (fieldName.equalsIgnoreCase("SEARCHNAME"))
      return searchname;
    else if (fieldName.equalsIgnoreCase("AD_CALLOUT_ID") || fieldName.equals("adCalloutId"))
      return adCalloutId;
    else if (fieldName.equalsIgnoreCase("VALIDATEONNEW"))
      return validateonnew;
    else if (fieldName.equalsIgnoreCase("AD_PROCESS_ID") || fieldName.equals("adProcessId"))
      return adProcessId;
    else if (fieldName.equalsIgnoreCase("ISREADONLY"))
      return isreadonly;
    else if (fieldName.equalsIgnoreCase("DISPLAYLOGIC"))
      return displaylogic;
    else if (fieldName.equalsIgnoreCase("ISENCRYPTED"))
      return isencrypted;
    else if (fieldName.equalsIgnoreCase("FIELDGROUP"))
      return fieldgroup;
    else if (fieldName.equalsIgnoreCase("TABID"))
      return tabid;
    else if (fieldName.equalsIgnoreCase("AD_COLUMN_ID") || fieldName.equals("adColumnId"))
      return adColumnId;
    else if (fieldName.equalsIgnoreCase("AD_VAL_RULE_ID") || fieldName.equals("adValRuleId"))
      return adValRuleId;
    else if (fieldName.equalsIgnoreCase("DISPLAYLENGTH"))
      return displaylength;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("AD_WINDOW_ID") || fieldName.equals("adWindowId"))
      return adWindowId;
    else if (fieldName.equalsIgnoreCase("VALUEMIN"))
      return valuemin;
    else if (fieldName.equalsIgnoreCase("VALUEMAX"))
      return valuemax;
    else if (fieldName.equalsIgnoreCase("REALNAME"))
      return realname;
    else if (fieldName.equalsIgnoreCase("JAVA_CLASS_NAME") || fieldName.equals("javaClassName"))
      return javaClassName;
    else if (fieldName.equalsIgnoreCase("REALCOLUMNNAME"))
      return realcolumnname;
    else if (fieldName.equalsIgnoreCase("XSQLTEXT"))
      return xsqltext;
    else if (fieldName.equalsIgnoreCase("ISCOLUMNENCRYPTED"))
      return iscolumnencrypted;
    else if (fieldName.equalsIgnoreCase("ISDESENCRYPTABLE"))
      return isdesencryptable;
    else if (fieldName.equalsIgnoreCase("REFERENCE_NAME") || fieldName.equals("referenceName"))
      return referenceName;
    else if (fieldName.equalsIgnoreCase("REFERENCE_NAME_TRL") || fieldName.equals("referenceNameTrl"))
      return referenceNameTrl;
    else if (fieldName.equalsIgnoreCase("CLASSNAME"))
      return classname;
    else if (fieldName.equalsIgnoreCase("MAPPINGNAME"))
      return mappingname;
    else if (fieldName.equalsIgnoreCase("CALLOUTNAME"))
      return calloutname;
    else if (fieldName.equalsIgnoreCase("CLASSNAME_CALLOUT") || fieldName.equals("classnameCallout"))
      return classnameCallout;
    else if (fieldName.equalsIgnoreCase("MAPPINGNAME_CALLOUT") || fieldName.equals("mappingnameCallout"))
      return mappingnameCallout;
    else if (fieldName.equalsIgnoreCase("COLUMNNAME_END") || fieldName.equals("columnnameEnd"))
      return columnnameEnd;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("READONLYLOGIC"))
      return readonlylogic;
    else if (fieldName.equalsIgnoreCase("AD_REFERENCE_ID") || fieldName.equals("adReferenceId"))
      return adReferenceId;
    else if (fieldName.equalsIgnoreCase("AD_REFERENCE_VALUE_ID") || fieldName.equals("adReferenceValueId"))
      return adReferenceValueId;
    else if (fieldName.equalsIgnoreCase("ISAUTOSAVE"))
      return isautosave;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] select(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return select(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] select(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_field.ad_field_id, ad_field.seqno, ad_column.ad_column_id As adColumnId, ad_column.ColumnName As columnName, ad_column.ColumnName As columnNameInp, " +
      "      ad_field.name as Name, ismandatory as required, ad_reference_value_id as referenceValue, " +
      "      ad_column.ad_reference_id as reference, displayLength as displaySize, 'x' as htmltext, '' as xmltext, " +
      "      isSameLine as issameline, (CASE ad_field.isActive WHEN 'N' THEN 'N' ELSE isDisplayed END) as isdisplayed, isupdateable as isupdateable, " +
      "      isparent, ad_column.FIELDLENGTH, (CASE WHEN (ad_column.AD_REFERENCE_ID<>'30' OR AD_REFERENCE_VALUE_ID IS NULL) THEN REPLACE(REPLACE(REPLACE(ad_element.name, 'Substitute', 'Product'), 'BOM', ''), 'M_LocatorTo_ID', 'M_Locator_ID') ELSE (SELECT NAME FROM AD_REFERENCE WHERE AD_REFERENCE.AD_REFERENCE_ID=ad_column.AD_REFERENCE_VALUE_ID) END) as searchName, ad_column.ad_callout_id, " +
      "      ad_column.validateonnew, ad_column.ad_process_id, ad_field.isreadonly, to_char(ad_field.DISPLAYLOGIC) as displaylogic, ad_column.isEncrypted, AD_FIELD.AD_FIELDGROUP_ID AS FieldGroup, ad_field.ad_tab_id as tabid, '' as ad_column_id, ad_column.ad_val_rule_id, '' as displaylength, '' as value, '' as ad_window_id, " +
      "      AD_COLUMN.ValueMin, AD_COLUMN.ValueMax, REPLACE(REPLACE(REPLACE(REPLACE(ad_column.columnname, 'Substitute', 'M_Product'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM', ''), 'M_LocatorTo_ID', 'M_Locator_ID') as realName, mom.mappingname as java_class_name, '' as realcolumnname, '' as xsqltext, ad_column.isEncrypted AS isColumnEncrypted, ad_column.isDesencryptable, " +
      "      ad_reference.name as reference_name, ad_reference.name as reference_name_trl, '' AS CLASSNAME, '' AS MAPPINGNAME, ad_callout.name as calloutname, " +
      "      moc.classname as classname_callout, momc.mappingname as mappingname_callout, '' AS COLUMNNAME_END, ad_field.isactive, ad_column.readonlylogic, " +
      "      ad_column.ad_reference_id, ad_column.ad_reference_value_id, ad_column.isautosave" +
      "      FROM ad_column left join ad_element on ad_column.ad_element_id = ad_element.ad_element_id" +
      "                     left join ad_process on ad_column.ad_process_id = ad_process.ad_process_id" +
      "                     left join ad_reference on ad_column.ad_reference_id = ad_reference.ad_reference_id" +
      "                     left join ad_model_object mo on ad_process.ad_process_id = mo.ad_process_id" +
      "                                                 and mo.action   = 'P' " +
      "                                                 AND mo.isactive = 'Y' " +
      "                                                 AND mo.isdefault= 'Y'" +
      "                     left join ad_model_object_mapping mom on mo.ad_model_object_id = mom.ad_model_object_id" +
      "                                                AND mom.isactive = 'Y' " +
      "                                                AND mom.isdefault= 'Y'" +
      "                     left join ad_callout on ad_column.ad_callout_id = ad_callout.ad_callout_id" +
      "                     left join ad_model_object moc on ad_callout.ad_callout_id = moc.ad_callout_id" +
      "                                                AND moc.isactive = 'Y'" +
      "                                                AND moc.isdefault = 'Y' " +
      "                                                AND moc.action = 'C'" +
      "                     left join ad_model_object_mapping momc on moc.ad_model_object_id = momc.ad_model_object_id" +
      "                                                AND momc.isactive = 'Y' " +
      "                                                AND momc.isdefault= 'Y'," +
      "            ad_field" +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "        AND ad_field.ad_tab_id = ?" +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND ad_column.isActive = 'Y'" +
      "              union " +
      "      select null, (case when upper(columnname)='CREATED' then 10000 " +
      "                   when upper(columnname)='CREATEDBY' then 10001" +
      "                   when upper(columnname)='UPDATED' then 10002" +
      "                   else 10003" +
      "              end), c.ad_column_id, columnname,  columnname, c.name, 'N', " +
      "             c.ad_reference_value_id, c.ad_reference_id, 44, 'x', " +
      "             null, " +
      "             (case when upper(columnname) in ('CREATED', 'UPDATED') then 'N'" +
      "                   else 'Y'" +
      "               end), 'Y', 'N', 'N', c.FIELDLENGTH, c.name, null, 'Y', " +
      "             null, 'Y', '@ShowAudit@=''Y''', 'N', '1000100001' as fieldgroup, tb.ad_tab_id, null, null, null, null, null, null, null, c.columnname, " +
      "             null, null, null, 'N', 'N', r.name, r.name, null, null, null, null, null, null, 'Y', null, c.ad_reference_id, c.ad_reference_value_id, c.isautosave" +
      "       from ad_column c, ad_tab tb, ad_reference r" +
      "      where c.ad_table_id = tb.ad_table_id" +
      "        and upper(columnname) in ('CREATED', 'CREATEDBY', 'UPDATED', 'UPDATEDBY')" +
      "        and tb.ad_tab_id = ?" +
      "        and r.ad_reference_id = c.ad_reference_id" +
      "      ORDER BY SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

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
        EditionFieldsData objectEditionFieldsData = new EditionFieldsData();
        objectEditionFieldsData.adFieldId = UtilSql.getValue(result, "AD_FIELD_ID");
        objectEditionFieldsData.seqno = UtilSql.getValue(result, "SEQNO");
        objectEditionFieldsData.adcolumnid = UtilSql.getValue(result, "ADCOLUMNID");
        objectEditionFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectEditionFieldsData.columnnameinp = UtilSql.getValue(result, "COLUMNNAMEINP");
        objectEditionFieldsData.name = UtilSql.getValue(result, "NAME");
        objectEditionFieldsData.required = UtilSql.getValue(result, "REQUIRED");
        objectEditionFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectEditionFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectEditionFieldsData.displaysize = UtilSql.getValue(result, "DISPLAYSIZE");
        objectEditionFieldsData.htmltext = UtilSql.getValue(result, "HTMLTEXT");
        objectEditionFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectEditionFieldsData.issameline = UtilSql.getValue(result, "ISSAMELINE");
        objectEditionFieldsData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectEditionFieldsData.isupdateable = UtilSql.getValue(result, "ISUPDATEABLE");
        objectEditionFieldsData.isparent = UtilSql.getValue(result, "ISPARENT");
        objectEditionFieldsData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectEditionFieldsData.searchname = UtilSql.getValue(result, "SEARCHNAME");
        objectEditionFieldsData.adCalloutId = UtilSql.getValue(result, "AD_CALLOUT_ID");
        objectEditionFieldsData.validateonnew = UtilSql.getValue(result, "VALIDATEONNEW");
        objectEditionFieldsData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
        objectEditionFieldsData.isreadonly = UtilSql.getValue(result, "ISREADONLY");
        objectEditionFieldsData.displaylogic = UtilSql.getValue(result, "DISPLAYLOGIC");
        objectEditionFieldsData.isencrypted = UtilSql.getValue(result, "ISENCRYPTED");
        objectEditionFieldsData.fieldgroup = UtilSql.getValue(result, "FIELDGROUP");
        objectEditionFieldsData.tabid = UtilSql.getValue(result, "TABID");
        objectEditionFieldsData.adColumnId = UtilSql.getValue(result, "AD_COLUMN_ID");
        objectEditionFieldsData.adValRuleId = UtilSql.getValue(result, "AD_VAL_RULE_ID");
        objectEditionFieldsData.displaylength = UtilSql.getValue(result, "DISPLAYLENGTH");
        objectEditionFieldsData.value = UtilSql.getValue(result, "VALUE");
        objectEditionFieldsData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectEditionFieldsData.valuemin = UtilSql.getValue(result, "VALUEMIN");
        objectEditionFieldsData.valuemax = UtilSql.getValue(result, "VALUEMAX");
        objectEditionFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectEditionFieldsData.javaClassName = UtilSql.getValue(result, "JAVA_CLASS_NAME");
        objectEditionFieldsData.realcolumnname = UtilSql.getValue(result, "REALCOLUMNNAME");
        objectEditionFieldsData.xsqltext = UtilSql.getValue(result, "XSQLTEXT");
        objectEditionFieldsData.iscolumnencrypted = UtilSql.getValue(result, "ISCOLUMNENCRYPTED");
        objectEditionFieldsData.isdesencryptable = UtilSql.getValue(result, "ISDESENCRYPTABLE");
        objectEditionFieldsData.referenceName = UtilSql.getValue(result, "REFERENCE_NAME");
        objectEditionFieldsData.referenceNameTrl = UtilSql.getValue(result, "REFERENCE_NAME_TRL");
        objectEditionFieldsData.classname = UtilSql.getValue(result, "CLASSNAME");
        objectEditionFieldsData.mappingname = UtilSql.getValue(result, "MAPPINGNAME");
        objectEditionFieldsData.calloutname = UtilSql.getValue(result, "CALLOUTNAME");
        objectEditionFieldsData.classnameCallout = UtilSql.getValue(result, "CLASSNAME_CALLOUT");
        objectEditionFieldsData.mappingnameCallout = UtilSql.getValue(result, "MAPPINGNAME_CALLOUT");
        objectEditionFieldsData.columnnameEnd = UtilSql.getValue(result, "COLUMNNAME_END");
        objectEditionFieldsData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectEditionFieldsData.readonlylogic = UtilSql.getValue(result, "READONLYLOGIC");
        objectEditionFieldsData.adReferenceId = UtilSql.getValue(result, "AD_REFERENCE_ID");
        objectEditionFieldsData.adReferenceValueId = UtilSql.getValue(result, "AD_REFERENCE_VALUE_ID");
        objectEditionFieldsData.isautosave = UtilSql.getValue(result, "ISAUTOSAVE");
        objectEditionFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEditionFieldsData);
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
    EditionFieldsData objectEditionFieldsData[] = new EditionFieldsData[vector.size()];
    vector.copyInto(objectEditionFieldsData);
    return(objectEditionFieldsData);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] selectAuxiliar(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectAuxiliar(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] selectAuxiliar(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_auxiliarinput_id as reference, name as columnname, name as columnnameinp, code as name, '' as htmltext " +
      "      FROM ad_auxiliarinput " +
      "      WHERE ad_tab_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

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
        EditionFieldsData objectEditionFieldsData = new EditionFieldsData();
        objectEditionFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectEditionFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectEditionFieldsData.columnnameinp = UtilSql.getValue(result, "COLUMNNAMEINP");
        objectEditionFieldsData.name = UtilSql.getValue(result, "NAME");
        objectEditionFieldsData.htmltext = UtilSql.getValue(result, "HTMLTEXT");
        objectEditionFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEditionFieldsData);
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
    EditionFieldsData objectEditionFieldsData[] = new EditionFieldsData[vector.size()];
    vector.copyInto(objectEditionFieldsData);
    return(objectEditionFieldsData);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] selectDisplayLogic(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectDisplayLogic(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] selectDisplayLogic(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_field.seqno, ad_column.ColumnName As columnName, ad_column.ColumnName As columnNameInp, " +
      "      ad_field.name as Name, ismandatory as required, ad_reference_value_id as referenceValue, " +
      "      ad_column.ad_reference_id as reference, displayLength as displaySize, 'x' as htmltext, " +
      "      isSameLine as issameline, isDisplayed as isdisplayed, isupdateable as isupdateable, " +
      "      isparent, ad_column.FIELDLENGTH, ad_element.name as searchName, ad_column.ad_callout_id, " +
      "      ad_column.ad_process_id, ad_field.isreadonly, to_char(ad_field.DISPLAYLOGIC) as displaylogic, ad_field.ad_tab_id as tabid, " +
      "      ad_callout.name as calloutname, moc.classname as classname_callout, momc.mappingname as mappingname_callout " +
      "      FROM ad_field, " +
      "           ad_column left join ad_element on ad_column.ad_element_id = ad_element.ad_element_id" +
      "           left join ad_callout on ad_column.ad_callout_id = ad_callout.ad_callout_id " +
      "           left join ad_model_object moc on ad_callout.ad_callout_id = moc.ad_callout_id " +
      "                              AND moc.action = 'C' " +
      "                              AND moc.isactive = 'Y'" +
      "                              AND moc.isdefault = 'Y' " +
      "           left join ad_model_object_mapping momc on moc.ad_model_object_id = momc.ad_model_object_id " +
      "                              AND momc.isactive = 'Y' " +
      "                              AND momc.isdefault = 'Y'" +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "        AND ad_field.displaylogic is not null " +
      "        AND AD_FIELD.ISDISPLAYED = 'Y' " +
      "        AND ad_field.ad_tab_id = ?" +
      "      union" +
      "      select (case when upper(columnname)='CREATED' then 10000 " +
      "                   when upper(columnname)='CREATEDBY' then 10001" +
      "                   when upper(columnname)='UPDATED' then 10002" +
      "                   else 10003" +
      "              end), columnname,  columnname, c.name, 'N', " +
      "             c.ad_reference_value_id, c.ad_reference_id, 44, 'x', " +
      "             'N', 'Y', 'N', 'N', c.FIELDLENGTH, c.name, null, " +
      "             null, 'Y', '@ShowAudit@=''Y''', tb.ad_tab_id, null, null, null" +
      "       from ad_column c, ad_tab tb, ad_reference r" +
      "      where c.ad_table_id = tb.ad_table_id" +
      "        and upper(columnname) in ('CREATED', 'CREATEDBY', 'UPDATED', 'UPDATEDBY')" +
      "        and tb.ad_tab_id = ?" +
      "        and r.ad_reference_id = c.ad_reference_id" +
      "      ORDER BY SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

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
        EditionFieldsData objectEditionFieldsData = new EditionFieldsData();
        objectEditionFieldsData.seqno = UtilSql.getValue(result, "SEQNO");
        objectEditionFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectEditionFieldsData.columnnameinp = UtilSql.getValue(result, "COLUMNNAMEINP");
        objectEditionFieldsData.name = UtilSql.getValue(result, "NAME");
        objectEditionFieldsData.required = UtilSql.getValue(result, "REQUIRED");
        objectEditionFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectEditionFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectEditionFieldsData.displaysize = UtilSql.getValue(result, "DISPLAYSIZE");
        objectEditionFieldsData.htmltext = UtilSql.getValue(result, "HTMLTEXT");
        objectEditionFieldsData.issameline = UtilSql.getValue(result, "ISSAMELINE");
        objectEditionFieldsData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectEditionFieldsData.isupdateable = UtilSql.getValue(result, "ISUPDATEABLE");
        objectEditionFieldsData.isparent = UtilSql.getValue(result, "ISPARENT");
        objectEditionFieldsData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectEditionFieldsData.searchname = UtilSql.getValue(result, "SEARCHNAME");
        objectEditionFieldsData.adCalloutId = UtilSql.getValue(result, "AD_CALLOUT_ID");
        objectEditionFieldsData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
        objectEditionFieldsData.isreadonly = UtilSql.getValue(result, "ISREADONLY");
        objectEditionFieldsData.displaylogic = UtilSql.getValue(result, "DISPLAYLOGIC");
        objectEditionFieldsData.tabid = UtilSql.getValue(result, "TABID");
        objectEditionFieldsData.calloutname = UtilSql.getValue(result, "CALLOUTNAME");
        objectEditionFieldsData.classnameCallout = UtilSql.getValue(result, "CLASSNAME_CALLOUT");
        objectEditionFieldsData.mappingnameCallout = UtilSql.getValue(result, "MAPPINGNAME_CALLOUT");
        objectEditionFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEditionFieldsData);
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
    EditionFieldsData objectEditionFieldsData[] = new EditionFieldsData[vector.size()];
    vector.copyInto(objectEditionFieldsData);
    return(objectEditionFieldsData);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] selectReadOnlyLogic(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectReadOnlyLogic(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] selectReadOnlyLogic(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_field.seqno, ad_column.ColumnName As columnName, ad_column.ColumnName As columnNameInp, " +
      "      ad_field.name as Name, ismandatory as required, ad_reference_value_id as referenceValue, " +
      "      ad_column.ad_reference_id as reference, displayLength as displaySize, 'x' as htmltext, " +
      "      isSameLine as issameline, isDisplayed as isdisplayed, isupdateable as isupdateable, " +
      "      isparent, ad_column.FIELDLENGTH, ad_element.name as searchName, ad_column.ad_callout_id, " +
      "      ad_column.ad_process_id, ad_field.isreadonly, to_char(ad_field.DISPLAYLOGIC) as displaylogic, ad_field.ad_tab_id as tabid, " +
      "      ad_callout.name as calloutname, moc.classname as classname_callout, momc.mappingname as mappingname_callout," +
      "      ad_column.readonlylogic " +
      "      FROM ad_field, " +
      "           ad_column left join ad_element on ad_column.ad_element_id = ad_element.ad_element_id" +
      "           left join ad_callout on ad_column.ad_callout_id = ad_callout.ad_callout_id " +
      "           left join ad_model_object moc on ad_callout.ad_callout_id = moc.ad_callout_id " +
      "                              AND moc.action = 'C' " +
      "                              AND moc.isactive = 'Y'" +
      "                              AND moc.isdefault = 'Y' " +
      "           left join ad_model_object_mapping momc on moc.ad_model_object_id = momc.ad_model_object_id " +
      "                              AND momc.isactive = 'Y' " +
      "                              AND momc.isdefault = 'Y'" +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "        AND ad_column.readonlylogic is not null " +
      "        AND AD_FIELD.ISDISPLAYED = 'Y' " +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND ad_field.ad_tab_id = ?" +
      "        AND ad_field.isreadonly='N'" +
      "        AND ad_column.isupdateable='Y'" +
      "       order by seqno";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

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
        EditionFieldsData objectEditionFieldsData = new EditionFieldsData();
        objectEditionFieldsData.seqno = UtilSql.getValue(result, "SEQNO");
        objectEditionFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectEditionFieldsData.columnnameinp = UtilSql.getValue(result, "COLUMNNAMEINP");
        objectEditionFieldsData.name = UtilSql.getValue(result, "NAME");
        objectEditionFieldsData.required = UtilSql.getValue(result, "REQUIRED");
        objectEditionFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectEditionFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectEditionFieldsData.displaysize = UtilSql.getValue(result, "DISPLAYSIZE");
        objectEditionFieldsData.htmltext = UtilSql.getValue(result, "HTMLTEXT");
        objectEditionFieldsData.issameline = UtilSql.getValue(result, "ISSAMELINE");
        objectEditionFieldsData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectEditionFieldsData.isupdateable = UtilSql.getValue(result, "ISUPDATEABLE");
        objectEditionFieldsData.isparent = UtilSql.getValue(result, "ISPARENT");
        objectEditionFieldsData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectEditionFieldsData.searchname = UtilSql.getValue(result, "SEARCHNAME");
        objectEditionFieldsData.adCalloutId = UtilSql.getValue(result, "AD_CALLOUT_ID");
        objectEditionFieldsData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
        objectEditionFieldsData.isreadonly = UtilSql.getValue(result, "ISREADONLY");
        objectEditionFieldsData.displaylogic = UtilSql.getValue(result, "DISPLAYLOGIC");
        objectEditionFieldsData.tabid = UtilSql.getValue(result, "TABID");
        objectEditionFieldsData.calloutname = UtilSql.getValue(result, "CALLOUTNAME");
        objectEditionFieldsData.classnameCallout = UtilSql.getValue(result, "CLASSNAME_CALLOUT");
        objectEditionFieldsData.mappingnameCallout = UtilSql.getValue(result, "MAPPINGNAME_CALLOUT");
        objectEditionFieldsData.readonlylogic = UtilSql.getValue(result, "READONLYLOGIC");
        objectEditionFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEditionFieldsData);
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
    EditionFieldsData objectEditionFieldsData[] = new EditionFieldsData[vector.size()];
    vector.copyInto(objectEditionFieldsData);
    return(objectEditionFieldsData);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static String fieldGroupName(ConnectionProvider connectionProvider, String adFieldgroupId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select name " +
      "      from ad_fieldgroup " +
      "      where ad_fieldgroup_id=? " +
      "      and isactive='Y'";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adFieldgroupId);

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

/**
Campos de búsqueda
 */
  public static EditionFieldsData[] selectSerchFieldsSelection(ConnectionProvider connectionProvider, String adLanguage, String adTabId)    throws ServletException {
    return selectSerchFieldsSelection(connectionProvider, adLanguage, adTabId, 0, 0);
  }

/**
Campos de búsqueda
 */
  public static EditionFieldsData[] selectSerchFieldsSelection(ConnectionProvider connectionProvider, String adLanguage, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_COLUMN.ad_column_id, (CASE WHEN AD_FIELD_TRL.NAME IS NULL THEN AD_FIELD.NAME ELSE AD_FIELD_TRL.NAME END) AS NAME, " +
      "        ad_column.ad_reference_id as reference, ad_reference_value_id as referencevalue, ad_val_rule_id, fieldlength, displaylength, " +
      "        columnname, '' as value, ad_tab.ad_window_id, columnname as columnnameinp, '' as htmltext, '' as xmltext, " +
      "        columnname as realcolumnname, '' as xsqltext " +
      "        FROM AD_COLUMN, " +
      "             AD_FIELD left join AD_FIELD_TRL on AD_FIELD.ad_field_id = AD_FIELD_TRL.ad_field_id " +
      "                                            AND AD_FIELD_TRL.AD_LANGUAGE =? , " +
      "             AD_TAB " +
      "        WHERE AD_COLUMN.ad_column_id = AD_FIELD.ad_column_id" +
      "        AND AD_FIELD.ad_tab_id = AD_TAB.ad_tab_id " +
      "        AND AD_COLUMN.isactive='Y'" +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND AD_FIELD.isactive='Y' " +
      "        AND ISSELECTIONCOLUMN='Y' " +
      "        AND ad_field.ad_tab_id=?" +
      "        ORDER BY AD_COLUMN.seqno, AD_FIELD.seqno";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
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
        EditionFieldsData objectEditionFieldsData = new EditionFieldsData();
        objectEditionFieldsData.adColumnId = UtilSql.getValue(result, "AD_COLUMN_ID");
        objectEditionFieldsData.name = UtilSql.getValue(result, "NAME");
        objectEditionFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectEditionFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectEditionFieldsData.adValRuleId = UtilSql.getValue(result, "AD_VAL_RULE_ID");
        objectEditionFieldsData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectEditionFieldsData.displaylength = UtilSql.getValue(result, "DISPLAYLENGTH");
        objectEditionFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectEditionFieldsData.value = UtilSql.getValue(result, "VALUE");
        objectEditionFieldsData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectEditionFieldsData.columnnameinp = UtilSql.getValue(result, "COLUMNNAMEINP");
        objectEditionFieldsData.htmltext = UtilSql.getValue(result, "HTMLTEXT");
        objectEditionFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectEditionFieldsData.realcolumnname = UtilSql.getValue(result, "REALCOLUMNNAME");
        objectEditionFieldsData.xsqltext = UtilSql.getValue(result, "XSQLTEXT");
        objectEditionFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEditionFieldsData);
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
    EditionFieldsData objectEditionFieldsData[] = new EditionFieldsData[vector.size()];
    vector.copyInto(objectEditionFieldsData);
    return(objectEditionFieldsData);
  }

/**
Campos de búsqueda
 */
  public static EditionFieldsData[] selectSerchFields(ConnectionProvider connectionProvider, String adLanguage, String adTabId)    throws ServletException {
    return selectSerchFields(connectionProvider, adLanguage, adTabId, 0, 0);
  }

/**
Campos de búsqueda
 */
  public static EditionFieldsData[] selectSerchFields(ConnectionProvider connectionProvider, String adLanguage, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_COLUMN.ad_column_id, (CASE WHEN AD_FIELD_TRL.NAME IS NULL THEN AD_FIELD.NAME ELSE AD_FIELD_TRL.NAME END) AS NAME, " +
      "        ad_column.ad_reference_id as reference, ad_reference_value_id as referencevalue, ad_val_rule_id, fieldlength, displaylength, " +
      "        columnname, '' as value, ad_tab.ad_window_id, columnname as columnnameinp, '' as htmltext, '' as xmltext, " +
      "        columnname as realcolumnname, '' as xsqltext " +
      "        FROM AD_COLUMN, " +
      "             AD_FIELD left join AD_FIELD_TRL on AD_FIELD.ad_field_id = AD_FIELD_TRL.ad_field_id " +
      "                                            AND AD_FIELD_TRL.AD_LANGUAGE =? , " +
      "             AD_TAB " +
      "        WHERE AD_COLUMN.ad_column_id = AD_FIELD.ad_column_id" +
      "        AND AD_FIELD.ad_tab_id = AD_TAB.ad_tab_id " +
      "        AND AD_COLUMN.isactive='Y'" +
      "        AND AD_FIELD.isactive='Y' " +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND isidentifier='Y'" +
      "        AND ad_field.ad_tab_id=?" +
      "        ORDER BY AD_COLUMN.seqno, AD_FIELD.seqno";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
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
        EditionFieldsData objectEditionFieldsData = new EditionFieldsData();
        objectEditionFieldsData.adColumnId = UtilSql.getValue(result, "AD_COLUMN_ID");
        objectEditionFieldsData.name = UtilSql.getValue(result, "NAME");
        objectEditionFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectEditionFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectEditionFieldsData.adValRuleId = UtilSql.getValue(result, "AD_VAL_RULE_ID");
        objectEditionFieldsData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectEditionFieldsData.displaylength = UtilSql.getValue(result, "DISPLAYLENGTH");
        objectEditionFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectEditionFieldsData.value = UtilSql.getValue(result, "VALUE");
        objectEditionFieldsData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectEditionFieldsData.columnnameinp = UtilSql.getValue(result, "COLUMNNAMEINP");
        objectEditionFieldsData.htmltext = UtilSql.getValue(result, "HTMLTEXT");
        objectEditionFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectEditionFieldsData.realcolumnname = UtilSql.getValue(result, "REALCOLUMNNAME");
        objectEditionFieldsData.xsqltext = UtilSql.getValue(result, "XSQLTEXT");
        objectEditionFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEditionFieldsData);
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
    EditionFieldsData objectEditionFieldsData[] = new EditionFieldsData[vector.size()];
    vector.copyInto(objectEditionFieldsData);
    return(objectEditionFieldsData);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] selectSearchs(ConnectionProvider connectionProvider, String columntype, String searchId)    throws ServletException {
    return selectSearchs(connectionProvider, columntype, searchId, 0, 0);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static EditionFieldsData[] selectSearchs(ConnectionProvider connectionProvider, String columntype, String searchId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT R.NAME, T.TABLENAME AS REFERENCE, C.COLUMNNAME AS COLUMNNAME, RSC.NAME AS COLUMNNAMEINP, " +
      "      RSC.COLUMNNAME AS REFERENCEVALUE, MO.CLASSNAME, MOM.MAPPINGNAME, RSC.COLUMN_SUFFIX AS COLUMNNAME_END," +
      "      c.ad_column_id" +
      "      FROM AD_REFERENCE R left join AD_REF_SEARCH RS  on R.AD_REFERENCE_ID = RS.AD_REFERENCE_ID " +
      "                          left join AD_REF_SEARCH_COLUMN RSC on RS.AD_REF_SEARCH_ID = RSC.AD_REF_SEARCH_ID" +
      "                                AND RSC.COLUMNTYPE = ?, " +
      "           AD_MODEL_OBJECT MO, AD_MODEL_OBJECT_MAPPING MOM, " +
      "           AD_TABLE T, AD_COLUMN C " +
      "      WHERE R.parentreference_id = '30' " +
      "      AND R.AD_REFERENCE_ID = ?" +
      "      AND R.AD_REFERENCE_ID = MO.AD_REFERENCE_ID" +
      "      AND MO.ACTION = 'S' " +
      "      AND MO.ISACTIVE = 'Y'" +
      "      AND MO.ISDEFAULT = 'Y'" +
      "      AND MO.AD_MODEL_OBJECT_ID = MOM.AD_MODEL_OBJECT_ID " +
      "      AND MOM.ISACTIVE = 'Y' " +
      "      AND MOM.ISDEFAULT = 'Y'" +
      "      AND RS.AD_TABLE_ID = T.AD_TABLE_ID " +
      "      AND RS.AD_COLUMN_ID = C.AD_COLUMN_ID ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, columntype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, searchId);

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
        EditionFieldsData objectEditionFieldsData = new EditionFieldsData();
        objectEditionFieldsData.name = UtilSql.getValue(result, "NAME");
        objectEditionFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectEditionFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectEditionFieldsData.columnnameinp = UtilSql.getValue(result, "COLUMNNAMEINP");
        objectEditionFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectEditionFieldsData.classname = UtilSql.getValue(result, "CLASSNAME");
        objectEditionFieldsData.mappingname = UtilSql.getValue(result, "MAPPINGNAME");
        objectEditionFieldsData.columnnameEnd = UtilSql.getValue(result, "COLUMNNAME_END");
        objectEditionFieldsData.adColumnId = UtilSql.getValue(result, "AD_COLUMN_ID");
        objectEditionFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEditionFieldsData);
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
    EditionFieldsData objectEditionFieldsData[] = new EditionFieldsData[vector.size()];
    vector.copyInto(objectEditionFieldsData);
    return(objectEditionFieldsData);
  }

  public static EditionFieldsData[] selectFirstFocused(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    return selectFirstFocused(connectionProvider, adTabId, 0, 0);
  }

  public static EditionFieldsData[] selectFirstFocused(ConnectionProvider connectionProvider, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select c.columnname, c.ad_reference_id as reference" +
      "          from ad_column c," +
      "               ad_field f" +
      "        where c.isactive = 'Y'" +
      "          and f.isactive = 'Y'" +
      "          and f.isdisplayed = 'Y'" +
      "          and c.ad_column_id = f.ad_column_id" +
      "          and f.ad_tab_id = ?" +
      "          and f.isfirstFocusedField='Y'" +
      "        order by f.seqno";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
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
        EditionFieldsData objectEditionFieldsData = new EditionFieldsData();
        objectEditionFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectEditionFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectEditionFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEditionFieldsData);
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
    EditionFieldsData objectEditionFieldsData[] = new EditionFieldsData[vector.size()];
    vector.copyInto(objectEditionFieldsData);
    return(objectEditionFieldsData);
  }

  public static String isOrgKey(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select count(*) as reference" +
      "          from ad_column c," +
      "               ad_tab t" +
      "        where ad_tab_id = ?" +
      "          and c.ad_table_id = t.ad_table_id" +
      "          and c.isSecondaryKey = 'Y'" +
      "          and upper(c.columnname)='AD_ORG_ID'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "REFERENCE");
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
