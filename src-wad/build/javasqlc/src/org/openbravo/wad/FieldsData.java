//Sqlc generated V1.O00-1
package org.openbravo.wad;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import java.util.*;

public class FieldsData implements FieldProvider {
static Logger log4j = Logger.getLogger(FieldsData.class);
  private String InitRecordNumber="0";
  public String adcolumnid;
  public String realname;
  public String name;
  public String nameref;
  public String xmltext;
  public String reference;
  public String referencevalue;
  public String required;
  public String isdisplayed;
  public String isupdateable;
  public String defaultvalue;
  public String fieldlength;
  public String textAlign;
  public String xmlFormat;
  public String displaylength;
  public String columnname;
  public String whereclause;
  public String tablename;
  public String type;
  public String issessionattr;
  public String iskey;
  public String isparent;
  public String accesslevel;
  public String isreadonly;
  public String issecondarykey;
  public String showinrelation;
  public String isencrypted;
  public String sortno;
  public String istranslated;
  public String id;
  public String htmltext;
  public String htmltexttrl;
  public String xmltexttrl;
  public String tablenametrl;
  public String nowrap;
  public String iscolumnencrypted;
  public String isdesencryptable;
  public String adReferenceValueId;
  public String adValRuleId;
  public String isjasper;
  public String isactive;
  public String adTabId;
  public String parentTabName;
  public String orgcode;
  public String tablemodule;
  public String columnmodule;
  public String clientcode;
  public String isautosave;
  public String adFieldId;
  public String trytext;
  public String catchtext;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ADCOLUMNID"))
      return adcolumnid;
    else if (fieldName.equalsIgnoreCase("REALNAME"))
      return realname;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("NAMEREF"))
      return nameref;
    else if (fieldName.equalsIgnoreCase("XMLTEXT"))
      return xmltext;
    else if (fieldName.equalsIgnoreCase("REFERENCE"))
      return reference;
    else if (fieldName.equalsIgnoreCase("REFERENCEVALUE"))
      return referencevalue;
    else if (fieldName.equalsIgnoreCase("REQUIRED"))
      return required;
    else if (fieldName.equalsIgnoreCase("ISDISPLAYED"))
      return isdisplayed;
    else if (fieldName.equalsIgnoreCase("ISUPDATEABLE"))
      return isupdateable;
    else if (fieldName.equalsIgnoreCase("DEFAULTVALUE"))
      return defaultvalue;
    else if (fieldName.equalsIgnoreCase("FIELDLENGTH"))
      return fieldlength;
    else if (fieldName.equalsIgnoreCase("TEXT_ALIGN") || fieldName.equals("textAlign"))
      return textAlign;
    else if (fieldName.equalsIgnoreCase("XML_FORMAT") || fieldName.equals("xmlFormat"))
      return xmlFormat;
    else if (fieldName.equalsIgnoreCase("DISPLAYLENGTH"))
      return displaylength;
    else if (fieldName.equalsIgnoreCase("COLUMNNAME"))
      return columnname;
    else if (fieldName.equalsIgnoreCase("WHERECLAUSE"))
      return whereclause;
    else if (fieldName.equalsIgnoreCase("TABLENAME"))
      return tablename;
    else if (fieldName.equalsIgnoreCase("TYPE"))
      return type;
    else if (fieldName.equalsIgnoreCase("ISSESSIONATTR"))
      return issessionattr;
    else if (fieldName.equalsIgnoreCase("ISKEY"))
      return iskey;
    else if (fieldName.equalsIgnoreCase("ISPARENT"))
      return isparent;
    else if (fieldName.equalsIgnoreCase("ACCESSLEVEL"))
      return accesslevel;
    else if (fieldName.equalsIgnoreCase("ISREADONLY"))
      return isreadonly;
    else if (fieldName.equalsIgnoreCase("ISSECONDARYKEY"))
      return issecondarykey;
    else if (fieldName.equalsIgnoreCase("SHOWINRELATION"))
      return showinrelation;
    else if (fieldName.equalsIgnoreCase("ISENCRYPTED"))
      return isencrypted;
    else if (fieldName.equalsIgnoreCase("SORTNO"))
      return sortno;
    else if (fieldName.equalsIgnoreCase("ISTRANSLATED"))
      return istranslated;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("HTMLTEXT"))
      return htmltext;
    else if (fieldName.equalsIgnoreCase("HTMLTEXTTRL"))
      return htmltexttrl;
    else if (fieldName.equalsIgnoreCase("XMLTEXTTRL"))
      return xmltexttrl;
    else if (fieldName.equalsIgnoreCase("TABLENAMETRL"))
      return tablenametrl;
    else if (fieldName.equalsIgnoreCase("NOWRAP"))
      return nowrap;
    else if (fieldName.equalsIgnoreCase("ISCOLUMNENCRYPTED"))
      return iscolumnencrypted;
    else if (fieldName.equalsIgnoreCase("ISDESENCRYPTABLE"))
      return isdesencryptable;
    else if (fieldName.equalsIgnoreCase("AD_REFERENCE_VALUE_ID") || fieldName.equals("adReferenceValueId"))
      return adReferenceValueId;
    else if (fieldName.equalsIgnoreCase("AD_VAL_RULE_ID") || fieldName.equals("adValRuleId"))
      return adValRuleId;
    else if (fieldName.equalsIgnoreCase("ISJASPER"))
      return isjasper;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("AD_TAB_ID") || fieldName.equals("adTabId"))
      return adTabId;
    else if (fieldName.equalsIgnoreCase("PARENT_TAB_NAME") || fieldName.equals("parentTabName"))
      return parentTabName;
    else if (fieldName.equalsIgnoreCase("ORGCODE"))
      return orgcode;
    else if (fieldName.equalsIgnoreCase("TABLEMODULE"))
      return tablemodule;
    else if (fieldName.equalsIgnoreCase("COLUMNMODULE"))
      return columnmodule;
    else if (fieldName.equalsIgnoreCase("CLIENTCODE"))
      return clientcode;
    else if (fieldName.equalsIgnoreCase("ISAUTOSAVE"))
      return isautosave;
    else if (fieldName.equalsIgnoreCase("AD_FIELD_ID") || fieldName.equals("adFieldId"))
      return adFieldId;
    else if (fieldName.equals("trytext"))
      return trytext;
    else if (fieldName.equals("catchtext"))
      return catchtext;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] select(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return select(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] select(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_column.ad_column_id as adColumnId, ad_column.ColumnName as realName, ad_column.ColumnName As Name, '' as NameRef, " +
      "        'x' as xmltext, ad_reference_id as reference, ad_reference_value_id as referencevalue," +
      "        ismandatory as required, (CASE ad_field.isActive WHEN 'N' THEN 'N' ELSE isDisplayed END) as isdisplayed, isupdateable as isupdateable," +
      "        REPLACE(ad_column.defaultvalue, CHR(10), '') As defaultValue, " +
      "        ad_column.fieldlength As fieldLength, " +
      "        'Medio' as Text_Align, '' AS Xml_Format, " +
      "        ad_field.displaylength, REPLACE(replace(REPLACE(REPLACE(AD_ELEMENT.columnname, 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as columnname, " +
      "        '' as WHERECLAUSE, ad_table.tablename, 'StringParameter' as Type, ad_column.ISSESSIONATTR, ad_column.iskey, " +
      "        isParent, '' as ACCESSLEVEL, ad_field.isreadonly, '' as issecondarykey, ad_field.showInRelation, ad_column.isEncrypted," +
      "        ad_field.SORTNO, ad_column.istranslated, '' as id, '' as htmltext, '' as htmltexttrl, '' as xmltexttrl, '' as tablenametrl, " +
      "        0 AS NOWRAP, ad_column.isEncrypted AS isColumnEncrypted, ad_column.isDesencryptable, ad_reference_value_id, ad_column.ad_val_rule_id, '' AS isjasper, ad_field.isactive, '' as AD_Tab_ID, '' as parent_tab_name, '' as orgcode," +
      "        '' as tableModule, '' as columnModule, '' as clientcode, '' as isautosave, '' as ad_field_id" +
      "      FROM ad_column left join ad_element on ad_column.ad_element_id = ad_element.ad_element_id," +
      "           ad_field,  ad_table" +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "        AND ad_column.ad_table_id = ad_table.ad_table_id " +
      "        AND ad_column.isActive = 'Y' " +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND upper(ad_column.columnname) <> 'BINARYDATA' " +
      "        AND ad_tab_id = ?" +
      "      ORDER BY ad_field.SEQNO";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.adcolumnid = UtilSql.getValue(result, "ADCOLUMNID");
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.nameref = UtilSql.getValue(result, "NAMEREF");
        objectFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.required = UtilSql.getValue(result, "REQUIRED");
        objectFieldsData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectFieldsData.isupdateable = UtilSql.getValue(result, "ISUPDATEABLE");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectFieldsData.textAlign = UtilSql.getValue(result, "TEXT_ALIGN");
        objectFieldsData.xmlFormat = UtilSql.getValue(result, "XML_FORMAT");
        objectFieldsData.displaylength = UtilSql.getValue(result, "DISPLAYLENGTH");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.type = UtilSql.getValue(result, "TYPE");
        objectFieldsData.issessionattr = UtilSql.getValue(result, "ISSESSIONATTR");
        objectFieldsData.iskey = UtilSql.getValue(result, "ISKEY");
        objectFieldsData.isparent = UtilSql.getValue(result, "ISPARENT");
        objectFieldsData.accesslevel = UtilSql.getValue(result, "ACCESSLEVEL");
        objectFieldsData.isreadonly = UtilSql.getValue(result, "ISREADONLY");
        objectFieldsData.issecondarykey = UtilSql.getValue(result, "ISSECONDARYKEY");
        objectFieldsData.showinrelation = UtilSql.getValue(result, "SHOWINRELATION");
        objectFieldsData.isencrypted = UtilSql.getValue(result, "ISENCRYPTED");
        objectFieldsData.sortno = UtilSql.getValue(result, "SORTNO");
        objectFieldsData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectFieldsData.id = UtilSql.getValue(result, "ID");
        objectFieldsData.htmltext = UtilSql.getValue(result, "HTMLTEXT");
        objectFieldsData.htmltexttrl = UtilSql.getValue(result, "HTMLTEXTTRL");
        objectFieldsData.xmltexttrl = UtilSql.getValue(result, "XMLTEXTTRL");
        objectFieldsData.tablenametrl = UtilSql.getValue(result, "TABLENAMETRL");
        objectFieldsData.nowrap = UtilSql.getValue(result, "NOWRAP");
        objectFieldsData.iscolumnencrypted = UtilSql.getValue(result, "ISCOLUMNENCRYPTED");
        objectFieldsData.isdesencryptable = UtilSql.getValue(result, "ISDESENCRYPTABLE");
        objectFieldsData.adReferenceValueId = UtilSql.getValue(result, "AD_REFERENCE_VALUE_ID");
        objectFieldsData.adValRuleId = UtilSql.getValue(result, "AD_VAL_RULE_ID");
        objectFieldsData.isjasper = UtilSql.getValue(result, "ISJASPER");
        objectFieldsData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectFieldsData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectFieldsData.parentTabName = UtilSql.getValue(result, "PARENT_TAB_NAME");
        objectFieldsData.orgcode = UtilSql.getValue(result, "ORGCODE");
        objectFieldsData.tablemodule = UtilSql.getValue(result, "TABLEMODULE");
        objectFieldsData.columnmodule = UtilSql.getValue(result, "COLUMNMODULE");
        objectFieldsData.clientcode = UtilSql.getValue(result, "CLIENTCODE");
        objectFieldsData.isautosave = UtilSql.getValue(result, "ISAUTOSAVE");
        objectFieldsData.adFieldId = UtilSql.getValue(result, "AD_FIELD_ID");
        objectFieldsData.trytext = "";
        objectFieldsData.catchtext = "";
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Create a registry
 */
  public static FieldsData[] set()    throws ServletException {
    FieldsData objectFieldsData[] = new FieldsData[1];
    objectFieldsData[0] = new FieldsData();
    objectFieldsData[0].adcolumnid = "";
    objectFieldsData[0].realname = "";
    objectFieldsData[0].name = "";
    objectFieldsData[0].nameref = "";
    objectFieldsData[0].xmltext = "";
    objectFieldsData[0].reference = "";
    objectFieldsData[0].referencevalue = "";
    objectFieldsData[0].required = "";
    objectFieldsData[0].isdisplayed = "";
    objectFieldsData[0].isupdateable = "";
    objectFieldsData[0].defaultvalue = "";
    objectFieldsData[0].fieldlength = "";
    objectFieldsData[0].textAlign = "";
    objectFieldsData[0].xmlFormat = "";
    objectFieldsData[0].displaylength = "";
    objectFieldsData[0].columnname = "";
    objectFieldsData[0].whereclause = "";
    objectFieldsData[0].tablename = "";
    objectFieldsData[0].type = "";
    objectFieldsData[0].issessionattr = "";
    objectFieldsData[0].iskey = "";
    objectFieldsData[0].isparent = "";
    objectFieldsData[0].accesslevel = "";
    objectFieldsData[0].isreadonly = "";
    objectFieldsData[0].issecondarykey = "";
    objectFieldsData[0].showinrelation = "";
    objectFieldsData[0].isencrypted = "";
    objectFieldsData[0].sortno = "";
    objectFieldsData[0].istranslated = "";
    objectFieldsData[0].id = "";
    objectFieldsData[0].htmltext = "";
    objectFieldsData[0].htmltexttrl = "";
    objectFieldsData[0].xmltexttrl = "";
    objectFieldsData[0].tablenametrl = "";
    objectFieldsData[0].nowrap = "";
    objectFieldsData[0].iscolumnencrypted = "";
    objectFieldsData[0].isdesencryptable = "";
    objectFieldsData[0].adReferenceValueId = "";
    objectFieldsData[0].adValRuleId = "";
    objectFieldsData[0].isjasper = "";
    objectFieldsData[0].isactive = "";
    objectFieldsData[0].adTabId = "";
    objectFieldsData[0].parentTabName = "";
    objectFieldsData[0].orgcode = "";
    objectFieldsData[0].tablemodule = "";
    objectFieldsData[0].columnmodule = "";
    objectFieldsData[0].clientcode = "";
    objectFieldsData[0].isautosave = "";
    objectFieldsData[0].adFieldId = "";
    return objectFieldsData;
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static FieldsData[] selectAuxiliar(ConnectionProvider connectionProvider, String sql, String tab)    throws ServletException {
    return selectAuxiliar(connectionProvider, sql, tab, 0, 0);
  }

/**
Names of the columns and name of the fields of a tab
 */
  public static FieldsData[] selectAuxiliar(ConnectionProvider connectionProvider, String sql, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_AUXILIARINPUT_ID as reference, name as realname, name as columnname, name as name, " +
      "      code as defaultValue, 'x' as xmltext, '' as WHERECLAUSE" +
      "      FROM ad_auxiliarinput " +
      "      WHERE ";
    strSql = strSql + ((sql==null || sql.equals(""))?"":" code LIKE ? || '%' AND  ");
    strSql = strSql + 
      "ad_tab_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (sql != null && !(sql.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, sql);
      }
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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Name of the column key of the tab
 */
  public static FieldsData[] tableKeyColumnName(ConnectionProvider connectionProvider, String tablename)    throws ServletException {
    return tableKeyColumnName(connectionProvider, tablename, 0, 0);
  }

/**
Name of the column key of the tab
 */
  public static FieldsData[] tableKeyColumnName(ConnectionProvider connectionProvider, String tablename, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ad_column.ColumnName As Name " +
      "        FROM ad_table, ad_column " +
      "        WHERE ad_table.ad_table_id = ad_column.ad_table_id" +
      "          AND UPPER(ad_table.tablename) = UPPER(?) " +
      "          AND ad_column.isActive = 'Y'" +
      "          and ad_column.iskey='Y'" +
      "        UNION" +
      "        SELECT ad_column.ColumnName As Name " +
      "        FROM ad_table, ad_column " +
      "        WHERE ad_table.ad_table_id = ad_column.ad_table_id" +
      "          AND UPPER(ad_table.tablename) = UPPER(?) " +
      "          AND ad_column.isActive = 'Y'" +
      "          and ad_column.issecondarykey='Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tablename);

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Name of the column key of the tab
 */
  public static FieldsData[] keyColumnName(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return keyColumnName(connectionProvider, tab, 0, 0);
  }

/**
Name of the column key of the tab
 */
  public static FieldsData[] keyColumnName(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ColumnName As Name, issecondarykey FROM ad_table, ad_column, ad_tab " +
      "        WHERE ad_table.ad_table_id = ad_column.ad_table_id" +
      "          AND ad_tab.ad_table_id = ad_table.ad_table_id" +
      "          AND ad_tab_id = ? " +
      "          and iskey='Y'";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.issecondarykey = UtilSql.getValue(result, "ISSECONDARYKEY");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Name of the columns parent of the tab
 */
  public static FieldsData[] parentsColumnNameSortTab(ConnectionProvider connectionProvider, String parentTab, String adTableId)    throws ServletException {
    return parentsColumnNameSortTab(connectionProvider, parentTab, adTableId, 0, 0);
  }

/**
Name of the columns parent of the tab
 */
  public static FieldsData[] parentsColumnNameSortTab(ConnectionProvider connectionProvider, String parentTab, String adTableId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_FIELD.AD_FIELD_ID, ColumnName AS NAME, AD_REFERENCE_id AS reference, ad_reference_value_id AS referencevalue," +
      "        (SELECT tableNAME FROM AD_TABLE, AD_TAB WHERE AD_TABLE.ad_table_id = AD_TAB.ad_table_id" +
      "        AND AD_TAB.ad_tab_id=?) AS tablename," +
      "        (SELECT P.ad_module_id FROM AD_TABLE T, AD_PACKAGE P WHERE T.ad_table_id = AD_COLUMN.ad_table_id AND T.AD_PACKAGE_ID = P.AD_PACKAGE_ID) as tableModule," +
      "        AD_COLUMN.AD_Module_ID as columnModule" +
      "        FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id AND ad_table_id = ? AND isParent='Y' ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentTab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.adFieldId = UtilSql.getValue(result, "AD_FIELD_ID");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.tablemodule = UtilSql.getValue(result, "TABLEMODULE");
        objectFieldsData.columnmodule = UtilSql.getValue(result, "COLUMNMODULE");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Name of the columns parent of the tab
 */
  public static FieldsData[] parentsColumnName(ConnectionProvider connectionProvider, String parentTab, String tab)    throws ServletException {
    return parentsColumnName(connectionProvider, parentTab, tab, 0, 0);
  }

/**
Name of the columns parent of the tab
 */
  public static FieldsData[] parentsColumnName(ConnectionProvider connectionProvider, String parentTab, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_FIELD.AD_FIELD_ID, ColumnName AS NAME, AD_REFERENCE_id AS reference, ad_reference_value_id AS referencevalue," +
      "        (SELECT tableNAME FROM AD_TABLE, AD_TAB WHERE AD_TABLE.ad_table_id = AD_TAB.ad_table_id" +
      "        AND AD_TAB.ad_tab_id=?) AS tablename, ? as AD_Tab_ID, (select name from ad_tab where ad_tab_id = ?) as parent_tab_name," +
      "        (SELECT P.ad_module_id FROM AD_TABLE T, AD_PACKAGE P WHERE T.ad_table_id = AD_COLUMN.ad_table_id AND T.AD_PACKAGE_ID = P.AD_PACKAGE_ID) as tableModule," +
      "        AD_COLUMN.AD_Module_ID as columnModule, " +
      "          (SELECT c.issecondarykey " +
      "             FROM AD_COLUMN c, AD_FIELD f " +
      "            WHERE c.ad_column_id = f.ad_column_id AND (c.iskey='Y' OR c.issecondarykey='Y')" +
      "              AND ad_tab_id=? AND UPPER(c.columnname) = UPPER(AD_COLUMN.columnname)) as issecondarykey " +
      "        FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id AND ad_tab_id = ? AND isParent='Y' " +
      "        AND EXISTS (SELECT 1 FROM AD_COLUMN c, AD_FIELD f WHERE c.ad_column_id = f.ad_column_id AND (c.iskey='Y' OR c.issecondarykey='Y')" +
      "        AND ad_tab_id=? AND UPPER(c.columnname) = UPPER(AD_COLUMN.columnname))";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentTab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentTab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentTab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentTab);
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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.adFieldId = UtilSql.getValue(result, "AD_FIELD_ID");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.adTabId = UtilSql.getValue(result, "AD_TAB_ID");
        objectFieldsData.parentTabName = UtilSql.getValue(result, "PARENT_TAB_NAME");
        objectFieldsData.tablemodule = UtilSql.getValue(result, "TABLEMODULE");
        objectFieldsData.columnmodule = UtilSql.getValue(result, "COLUMNMODULE");
        objectFieldsData.issecondarykey = UtilSql.getValue(result, "ISSECONDARYKEY");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Name of the columns parent of the tab
 */
  public static FieldsData[] parentsColumnReal(ConnectionProvider connectionProvider, String parentTab, String tab)    throws ServletException {
    return parentsColumnReal(connectionProvider, parentTab, tab, 0, 0);
  }

/**
Name of the columns parent of the tab
 */
  public static FieldsData[] parentsColumnReal(ConnectionProvider connectionProvider, String parentTab, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_FIELD.AD_FIELD_ID, ColumnName AS NAME, AD_REFERENCE_id AS reference, ad_reference_value_id AS referencevalue," +
      "        (SELECT tableNAME FROM AD_TABLE, AD_TAB WHERE AD_TABLE.ad_table_id = AD_TAB.ad_table_id" +
      "        AND AD_TAB.ad_tab_id=?) AS tablename," +
      "        (SELECT P.ad_module_id FROM AD_TABLE T, AD_PACKAGE P WHERE T.ad_table_id = AD_COLUMN.ad_table_id AND T.AD_PACKAGE_ID = P.AD_PACKAGE_ID) as tableModule," +
      "        AD_COLUMN.AD_Module_ID as columnModule" +
      "        FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id AND ad_tab_id = ?" +
      "        AND (UPPER(columnname) IN (SELECT UPPER(columnname) " +
      "                                    FROM AD_FIELD, AD_COLUMN " +
      "                                   WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id " +
      "                                     AND AD_COLUMN.iskey='Y' " +
      "                                     AND AD_FIELD.ad_tab_id=?)" +
      "            OR (UPPER(columnname) LIKE 'EM_%'  " +
      "               AND UPPER(SUBSTR(COLUMNNAME,4)) IN  (SELECT UPPER(columnname) " +
      "                                    FROM AD_FIELD, AD_COLUMN " +
      "                                   WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id " +
      "                                     AND AD_COLUMN.iskey='Y' " +
      "                                     AND AD_FIELD.ad_tab_id=?)))";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentTab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentTab);
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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.adFieldId = UtilSql.getValue(result, "AD_FIELD_ID");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.tablemodule = UtilSql.getValue(result, "TABLEMODULE");
        objectFieldsData.columnmodule = UtilSql.getValue(result, "COLUMNMODULE");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Name of the table of the tab
 */
  public static String tableName(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ad_table.TABLEName FROM ad_tab, ad_table" +
      "        WHERE ad_table.ad_table_id = ad_tab.ad_table_id and ad_tab_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

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

/**
Names of the columns of the fields of a tab that are updatables
 */
  public static FieldsData[] selectUpdatables(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectUpdatables(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns of the fields of a tab that are updatables
 */
  public static FieldsData[] selectUpdatables(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ColumnName As Name, '?' AS Xml_Format, ad_column.ad_reference_id as reference, " +
      "      ad_column.ad_reference_value_id as referencevalue FROM ad_field, ad_column " +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "      and UPPER(ad_column.columnname) not in ('CREATED', 'UPDATED', 'CREATEDBY', 'UPDATEDBY') " +
      "      and ad_tab_id = ? " +
      "      AND upper(ad_column.columnname) <> 'BINARYDATA' " +
      "      AND ad_field.ignoreinwad='N'" +
      "      AND ad_column.isEncrypted <> 'Y'" +
      "      AND ad_column.isactive = 'Y'" +
      "      ORDER BY ad_field.SEQNO";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.xmlFormat = UtilSql.getValue(result, "XML_FORMAT");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Name of the table of the tab
 */
  public static String columnIdentifier(ConnectionProvider connectionProvider, String tableName)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(columnname) AS NAME FROM AD_COLUMN, AD_TABLE " +
      "        WHERE AD_TABLE.TABLENAME = ?" +
      "          AND AD_COLUMN.ad_table_id = AD_TABLE.ad_table_id" +
      "          AND isidentifier = 'Y' " +
      "          AND SeqNo = (CASE TO_CHAR(AD_TABLE.TABLENAME) " +
      "                          WHEN 'C_PaySelectionCheck' THEN 2 " +
      "                          ELSE (SELECT MIN(SeqNo) " +
      "                                  FROM AD_Column " +
      "                                 WHERE AD_Table_ID=AD_TABLE.AD_Table_ID " +
      "                                   AND IsIdentifier='Y')" +
      "                           END)";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tableName);

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
identifier columns of a table
 */
  public static FieldsData[] identifierColumns(ConnectionProvider connectionProvider, String tableName)    throws ServletException {
    return identifierColumns(connectionProvider, tableName, 0, 0);
  }

/**
identifier columns of a table
 */
  public static FieldsData[] identifierColumns(ConnectionProvider connectionProvider, String tableName, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ad_column.columnname as name, ad_reference_id as reference, ismandatory as required, " +
      "        REPLACE(replace(REPLACE(REPLACE(AD_ELEMENT.columnname, 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as columnname, ad_reference_value_id as referencevalue, " +
      "        ad_column.istranslated, ad_table.tablename, ad_reference_value_id" +
      "        FROM ad_column left join ad_element on ad_column.ad_element_id = ad_element.ad_element_id, " +
      "             ad_table " +
      "        WHERE UPPER(ad_table.tablename) = UPPER(?)" +
      "          AND ad_column.ad_table_id = ad_table.ad_table_id" +
      "          AND isidentifier = 'Y' " +
      "        order by seqno";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.required = UtilSql.getValue(result, "REQUIRED");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.adReferenceValueId = UtilSql.getValue(result, "AD_REFERENCE_VALUE_ID");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Names of the columns to order by
 */
  public static FieldsData[] selectSequence(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectSequence(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns to order by
 */
  public static FieldsData[] selectSequence(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ColumnName As Name" +
      "      FROM ad_field, ad_column" +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "        AND ad_tab_id = ?" +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND ad_field.SORTNO is not null" +
      "      ORDER BY ad_field.SORTNO, ad_field.SEQNO";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
isSOTrx of the window
 */
  public static String isSOTrx(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT isSOTrx FROM AD_WINDOW, AD_TAB " +
      "      WHERE AD_TAB.AD_WINDOW_ID = AD_WINDOW.AD_WINDOW_ID " +
      "      AND AD_TAB.AD_TAB_ID = ?";

    ResultSet result;
    String strReturn = "N";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISSOTRX");
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
Default values of the columns
 */
  public static FieldsData[] selectDefaultValue(ConnectionProvider connectionProvider, String sql, String tab)    throws ServletException {
    return selectDefaultValue(connectionProvider, sql, tab, 0, 0);
  }

/**
Default values of the columns
 */
  public static FieldsData[] selectDefaultValue(ConnectionProvider connectionProvider, String sql, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_column.AD_COLUMN_ID as adColumnId, ad_column.ISMANDATORY as required, " +
      "      REPLACE(replace(REPLACE(REPLACE(columnname, 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as Name, " +
      "      REPLACE(ad_column.defaultvalue, CHR(10), '') as defaultValue, '' as WHERECLAUSE, " +
      "      ad_reference_id as reference," +
      "      isdisplayed, ad_column.columnname as columnname, ad_table.ACCESSLEVEL, " +
      "      ad_table.TABLENAME as NameRef, ad_reference_value_id as referencevalue, ad_column.name as realname" +
      "      FROM ad_field, ad_column, ad_table" +
      "      WHERE ";
    strSql = strSql + ((sql==null || sql.equals(""))?"":" ad_column.defaultvalue LIKE ? || '%' AND  ");
    strSql = strSql + 
      "ad_field.ad_column_id = ad_column.ad_column_id" +
      "        AND ad_column.AD_TABLE_ID = ad_table.AD_TABLE_ID " +
      "        AND ad_tab_id = ? " +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND upper(ad_column.columnname) <> 'BINARYDATA'" +
      "      union" +
      "      SELECT ad_column.AD_COLUMN_ID as reference, ad_column.ISMANDATORY as required, " +
      "      columnname as Name, " +
      "      REPLACE(ad_column.defaultvalue, CHR(10), '') as defaultValue, '' as WHERECLAUSE, " +
      "      ad_reference_id as referencevalue," +
      "      'Y', ad_column.columnname as columnname, ad_table.ACCESSLEVEL, " +
      "      ad_table.TABLENAME as NameRef, ad_reference_value_id as type, ad_column.name as realname" +
      "      FROM ad_column, ad_table, ad_tab t" +
      "      WHERE lower(columnname) in ('createdby', 'updatedby')" +
      "      AND ad_column.AD_TABLE_ID = ad_table.AD_TABLE_ID " +
      "        AND t.ad_tab_id = ?" +
      "        and ad_table.ad_table_id = t.ad_table_id" +
      "      ORDER BY adcolumnid";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (sql != null && !(sql.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, sql);
      }
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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.adcolumnid = UtilSql.getValue(result, "ADCOLUMNID");
        objectFieldsData.required = UtilSql.getValue(result, "REQUIRED");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.accesslevel = UtilSql.getValue(result, "ACCESSLEVEL");
        objectFieldsData.nameref = UtilSql.getValue(result, "NAMEREF");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectSession(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectSession(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectSession(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT REPLACE(replace(REPLACE(REPLACE(AD_ELEMENT.columnname, 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as realName, REPLACE(replace(REPLACE(REPLACE(AD_ELEMENT.columnname, 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') As Name, " +
      "        ad_reference_id as reference, ad_reference_value_id as referencevalue, 'x' as xmltext," +
      "        ismandatory as required, isDisplayed as isdisplayed, isupdateable as isupdateable," +
      "        ad_column.defaultvalue As defaultValue, ad_column.fieldlength As fieldLength," +
      "        ad_field.displaylength, REPLACE(replace(REPLACE(REPLACE(AD_ELEMENT.columnname, 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as columnname" +
      "      FROM ad_field, ad_column left join ad_element on ad_column.ad_element_id = ad_element.ad_element_id" +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "        AND ad_tab_id = ?" +
      "        AND (ad_column.ISSESSIONATTR = 'Y' " +
      "        OR ad_column.iskey = 'Y') " +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND upper(ad_column.columnname) <> 'BINARYDATA' " +
      "        AND ad_column.ColumnName <> 'Created'" +
      "      ORDER BY ad_field.SEQNO";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectFieldsData.required = UtilSql.getValue(result, "REQUIRED");
        objectFieldsData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectFieldsData.isupdateable = UtilSql.getValue(result, "ISUPDATEABLE");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectFieldsData.displaylength = UtilSql.getValue(result, "DISPLAYLENGTH");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectDocumentsNo(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectDocumentsNo(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectDocumentsNo(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_column.AD_COLUMN_ID as reference, REPLACE(replace(REPLACE(REPLACE(columnname, 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as Name, " +
      "      ad_column.defaultvalue as defaultValue, '' as WHERECLAUSE, ad_reference_id as referencevalue," +
      "      isdisplayed, ad_column.columnname as columnname, ad_table.ACCESSLEVEL, " +
      "      ad_table.TABLENAME as NameRef, '' as realname" +
      "      FROM ad_field, ad_column, ad_table" +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id" +
      "        AND ad_column.AD_TABLE_ID = ad_table.AD_TABLE_ID " +
      "        AND ad_tab_id = ? " +
      "        AND ad_field.ignoreinwad='N'" +
      "        and isParent='N'" +
      "        and ad_column.columnname = 'DocumentNo'" +
      "        and ad_column.defaultvalue is null" +
      "      ORDER BY ad_field.SEQNO";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.accesslevel = UtilSql.getValue(result, "ACCESSLEVEL");
        objectFieldsData.nameref = UtilSql.getValue(result, "NAMEREF");
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectActionButton(ConnectionProvider connectionProvider)    throws ServletException {
    return selectActionButton(connectionProvider, 0, 0);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectActionButton(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT distinct ad_column.columnname, " +
      "      ad_column.ad_process_id as reference, ad_process.procedurename as name, " +
      "      ad_column.ad_reference_id as type, ad_column.ad_reference_value_id as referencevalue," +
      "      ad_val_rule_id as defaultvalue, ad_column.fieldlength, ad_field.name as realname, " +
      "      ad_process.description as tablename, ad_process.help as xmltext, ad_column.ad_reference_value_id, ad_process.isjasper, ad_column.isautosave" +
      "      FROM ad_column, ad_process, ad_field" +
      "      where ad_column.ad_process_id = ad_process.ad_process_id " +
      "      and ad_column.ad_column_id = ad_field.ad_column_id  " +
      "      AND ad_field.ignoreinwad='N'" +
      "      AND (ad_process.procedurename is not null " +
      "           or ad_process.isjasper = 'Y'" +
      "           or (UIPattern='S' AND EXISTS (SELECT 1 FROM AD_MODEL_OBJECT WHERE AD_PROCESS_ID = AD_PROCESS.AD_PROCESS_ID))) " +
      "      and ad_column.columnname not in('DocAction', 'PaymentRule') " +
      "      and (ad_column.columnname <> 'CreateFrom'" +
      "      or ad_column.ad_process_id is not null)" +
      "      and (ad_column.columnname <> 'Posted'" +
      "      or ad_column.ad_process_id is not null)" +
      "      and ad_column.ad_column_id in (select ad_column_id from ad_field where isdisplayed='Y' and isactive='Y')" +
      "      and ad_column.isactive='Y'" +
      "      order by ad_column.ad_process_id";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.type = UtilSql.getValue(result, "TYPE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectFieldsData.adReferenceValueId = UtilSql.getValue(result, "AD_REFERENCE_VALUE_ID");
        objectFieldsData.isjasper = UtilSql.getValue(result, "ISJASPER");
        objectFieldsData.isautosave = UtilSql.getValue(result, "ISAUTOSAVE");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Names of the columns of the fields of a tab
 */
  public static boolean buildActionButton(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT count(*) as total" +
      "      FROM ad_column, ad_process, ad_field, ad_system_info si" +
      "      where ad_column.ad_process_id = ad_process.ad_process_id " +
      "      and ad_column.ad_column_id = ad_field.ad_column_id " +
      "      AND (ad_process.procedurename is not null " +
      "           or ad_process.isjasper = 'Y'" +
      "           or (UIPattern='S' AND EXISTS (SELECT 1 FROM AD_MODEL_OBJECT WHERE AD_PROCESS_ID = AD_PROCESS.AD_PROCESS_ID)))" +
      "      and ad_column.columnname not in('DocAction', 'PaymentRule') " +
      "      and (ad_column.columnname <> 'CreateFrom'" +
      "      or ad_column.ad_process_id is not null)" +
      "      and ad_field.ignoreinwad='N'" +
      "      and (ad_column.columnname <> 'Posted'" +
      "      or ad_column.ad_process_id is not null)" +
      "      and ad_column.ad_column_id in (select ad_column_id from ad_field where isdisplayed='Y' and isactive='Y')" +
      "      and ad_column.isactive='Y'" +
      "      and (ad_process.updated > si.last_build" +
      "           or exists (select 1 " +
      "                        from ad_process_para pp " +
      "                       where pp.ad_process_id = ad_process.ad_process_id" +
      "                         and pp.updated > si.last_build))";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

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

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectActionButtonGenerics(ConnectionProvider connectionProvider)    throws ServletException {
    return selectActionButtonGenerics(connectionProvider, 0, 0);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectActionButtonGenerics(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DISTINCT 'ActionButton'  AS columnname, " +
      "        ad_process_id AS reference, procedurename AS NAME, " +
      "        '' AS TYPE, '' AS referencevalue," +
      "        '' AS defaultvalue, '' AS fieldlength, '' AS realname, " +
      "        description AS tablename, help AS xmltext, isjasper, '' AS isautosave" +
      "        FROM AD_PROCESS" +
      "        WHERE isactive='Y'" +
      "        AND UIPattern='S'" +
      "        and ad_process_id in (select ad_process_id from ad_menu)" +
      "        ORDER BY ad_process_id";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.type = UtilSql.getValue(result, "TYPE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectFieldsData.isjasper = UtilSql.getValue(result, "ISJASPER");
        objectFieldsData.isautosave = UtilSql.getValue(result, "ISAUTOSAVE");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Names of the columns of the fields of a tab
 */
  public static String isHighVolume(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ishighvolume FROM AD_TAB, AD_TABLE " +
      "      WHERE AD_TAB.ad_table_id = AD_TABLE.ad_table_id" +
      "      AND AD_TAB.ad_tab_id=?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISHIGHVOLUME");
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
Names of the columns of the fields of a tab
 */
  public static String isSingleRow(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT issinglerow FROM AD_TAB " +
      "      WHERE ad_tab_id=?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISSINGLEROW");
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
Names of the columns of the fields of a tab
 */
  public static String hasCreateFromButton(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(ad_column.ad_process_id, '-1') AS total " +
      "        FROM AD_FIELD, AD_COLUMN, AD_TABLE" +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id" +
      "        AND AD_COLUMN.AD_TABLE_ID = AD_TABLE.AD_TABLE_ID " +
      "        AND ad_tab_id = ? " +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND AD_COLUMN.ad_reference_id = '28'" +
      "        AND AD_COLUMN.COLUMNNAME = 'CreateFrom'" +
      "        AND AD_COLUMN.AD_PROCESS_ID IS NULL" +
      "        AND AD_FIELD.ISDISPLAYED = 'Y'";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TOTAL");
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
Names of the columns of the fields of a tab
 */
  public static String hasPostedButton(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(ad_column.ad_process_id, '-1') AS total " +
      "        FROM AD_FIELD, AD_COLUMN, AD_TABLE" +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id" +
      "        AND AD_COLUMN.AD_TABLE_ID = AD_TABLE.AD_TABLE_ID " +
      "        AND ad_tab_id = ? " +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND AD_COLUMN.ad_reference_id = '28'" +
      "        AND AD_COLUMN.COLUMNNAME = 'Posted'" +
      "        AND AD_COLUMN.AD_PROCESS_ID IS NULL" +
      "        AND AD_FIELD.ISDISPLAYED = 'Y'";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TOTAL");
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
Method need to be synchronized with src/org/openbravo/erpCommon/businessUtility/Buscador_data.xsql::selectValidationTab
 */
  public static FieldsData[] selectValidationTab(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectValidationTab(connectionProvider, tab, 0, 0);
  }

/**
Method need to be synchronized with src/org/openbravo/erpCommon/businessUtility/Buscador_data.xsql::selectValidationTab
 */
  public static FieldsData[] selectValidationTab(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c.ad_column_id as id, c.columnname, t.WHERECLAUSE as whereClause, v.code as referencevalue, c.ad_reference_id as reference," +
      "        c.ad_reference_value_id as NameRef, c.ad_val_rule_id as defaultvalue, f.isdisplayed, c.istranslated, c.columnname as name," +
      "        (case when t.whereclause is not null or v.code is not null then 'C' else 'R' end) as type /*Combo reaload or Reference*/ " +
      "        FROM AD_FIELD f, " +
      "             AD_COLUMN c left join  AD_VAL_RULE v on c.AD_VAL_RULE_ID = v.AD_VAL_RULE_ID" +
      "                         left join AD_REF_TABLE t on (CASE c.ad_reference_id WHEN '18' THEN c.AD_REFERENCE_VALUE_ID ELSE '0' END) = t.AD_REFERENCE_ID     " +
      "        WHERE f.AD_COLUMN_ID = c.ad_column_id" +
      "        AND f.ad_tab_id = ? " +
      "        AND f.ignoreinwad='N'" +
      "        AND (t.whereclause IS NOT NULL" +
      "            OR v.code IS NOT NULL" +
      "            OR c.ad_reference_id in ('19','18','17'))";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.id = UtilSql.getValue(result, "ID");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.nameref = UtilSql.getValue(result, "NAMEREF");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectFieldsData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.type = UtilSql.getValue(result, "TYPE");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Obtains all processes that might require combo reload
 */
  public static FieldsData[] selectProcessesWithReloads(ConnectionProvider connectionProvider)    throws ServletException {
    return selectProcessesWithReloads(connectionProvider, 0, 0);
  }

/**
Obtains all processes that might require combo reload
 */
  public static FieldsData[] selectProcessesWithReloads(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT distinct c.AD_PROCESS_id as id" +
      "        FROM AD_PROCESS_PARA c left join  AD_VAL_RULE v on c.AD_VAL_RULE_ID = v.AD_VAL_RULE_ID" +
      "                         left join AD_REF_TABLE t on (CASE c.ad_reference_id WHEN '18' THEN c.AD_REFERENCE_VALUE_ID ELSE '0' END) = t.AD_REFERENCE_ID     " +
      "        WHERE (t.whereclause IS NOT NULL" +
      "            OR v.code IS NOT NULL" +
      "            OR c.ad_reference_id in ('19','18','17'))";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.id = UtilSql.getValue(result, "ID");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Obtains all param for processes that might require combo reload
 */
  public static FieldsData[] selectValidationProcess(ConnectionProvider connectionProvider, String processId)    throws ServletException {
    return selectValidationProcess(connectionProvider, processId, 0, 0);
  }

/**
Obtains all param for processes that might require combo reload
 */
  public static FieldsData[] selectValidationProcess(ConnectionProvider connectionProvider, String processId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT c.AD_PROCESS_PARA_id as id, c.columnname, t.WHERECLAUSE as whereClause, v.code as referencevalue, c.ad_reference_id as reference," +
      "        c.ad_reference_value_id as NameRef, c.ad_val_rule_id as defaultvalue,  c.columnname as name," +
      "        (case when t.whereclause is not null or v.code is not null then 'C' else 'R' end) as type /*Combo reaload or Reference*/ " +
      "        FROM AD_PROCESS_PARA c left join  AD_VAL_RULE v on c.AD_VAL_RULE_ID = v.AD_VAL_RULE_ID" +
      "                         left join AD_REF_TABLE t on (CASE c.ad_reference_id WHEN '18' THEN c.AD_REFERENCE_VALUE_ID ELSE '0' END) = t.AD_REFERENCE_ID     " +
      "        WHERE (t.whereclause IS NOT NULL" +
      "            OR v.code IS NOT NULL" +
      "            OR c.ad_reference_id in ('19','18','17'))" +
      "         AND c.AD_Process_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processId);

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.id = UtilSql.getValue(result, "ID");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.nameref = UtilSql.getValue(result, "NAMEREF");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.type = UtilSql.getValue(result, "TYPE");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

  public static boolean processHasOrgParam(ConnectionProvider connectionProvider, String processId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         select count(*)" +
      "           from ad_process_para " +
      "          where lower(columnname) = 'ad_org_id'" +
      "            and ad_process_id = ?";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processId);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "COUNT(*)").equals("0");
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

/**
Fields of reference table in a tab
 */
  public static FieldsData[] selectColumnTable(ConnectionProvider connectionProvider, String adTabId, String adColumnId)    throws ServletException {
    return selectColumnTable(connectionProvider, adTabId, adColumnId, 0, 0);
  }

/**
Fields of reference table in a tab
 */
  public static FieldsData[] selectColumnTable(ConnectionProvider connectionProvider, String adTabId, String adColumnId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ColumnName As Name, 'x' as xmltext, ad_reference_value_id as referencevalue, " +
      "      ad_val_rule.CODE as defaultValue, ad_val_rule.AD_VAL_RULE_ID as columnname," +
      "      ad_ref_table.WHERECLAUSE, ad_table.tablename, 'TableList' as tablenametrl, ad_table.name as nameref, " +
      "      '18' as reference, 'Y' as required, ad_column.istranslated " +
      "      FROM ad_field, ad_column left join ad_val_rule on ad_column.AD_VAL_RULE_ID = ad_val_rule.AD_VAL_RULE_ID, ad_ref_table, ad_table " +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "      AND ad_ref_table.ad_table_id = ad_table.ad_table_id " +
      "      AND ad_column.AD_REFERENCE_VALUE_ID = ad_ref_table.AD_REFERENCE_ID  " +
      "      and ad_field.ISDISPLAYED = 'Y'" +
      "      AND ad_field.ad_tab_id = ?" +
      "      AND ad_field.ignoreinwad='N'" +
      "      AND ad_column.ad_column_id = ? " +
      "      AND ad_column.ad_reference_id = '18'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adColumnId);

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.tablenametrl = UtilSql.getValue(result, "TABLENAMETRL");
        objectFieldsData.nameref = UtilSql.getValue(result, "NAMEREF");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.required = UtilSql.getValue(result, "REQUIRED");
        objectFieldsData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

  public static FieldsData[] selectColumnTableProcess(ConnectionProvider connectionProvider, String processParaId)    throws ServletException {
    return selectColumnTableProcess(connectionProvider, processParaId, 0, 0);
  }

  public static FieldsData[] selectColumnTableProcess(ConnectionProvider connectionProvider, String processParaId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ColumnName As Name, 'x' as xmltext, ad_reference_value_id as referencevalue, " +
      "      ad_val_rule.CODE as defaultValue, ad_val_rule.AD_VAL_RULE_ID as columnname," +
      "      ad_ref_table.WHERECLAUSE, ad_table.tablename, 'TableList' as tablenametrl, ad_table.name as nameref, " +
      "      '18' as reference, 'Y' as required, 'N'as istranslated " +
      "      FROM ad_process_para p left join ad_val_rule on p.AD_VAL_RULE_ID = ad_val_rule.AD_VAL_RULE_ID, " +
      "           ad_ref_table, " +
      "           ad_table " +
      "      WHERE ad_ref_table.ad_table_id = ad_table.ad_table_id " +
      "      AND p.AD_REFERENCE_VALUE_ID = ad_ref_table.AD_REFERENCE_ID  " +
      "      AND p.ad_process_para_id = ?" +
      "      AND p.ad_reference_id = '18'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processParaId);

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.tablenametrl = UtilSql.getValue(result, "TABLENAMETRL");
        objectFieldsData.nameref = UtilSql.getValue(result, "NAMEREF");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.required = UtilSql.getValue(result, "REQUIRED");
        objectFieldsData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Fields of reference table in a tab
 */
  public static FieldsData[] selectColumnTableDir(ConnectionProvider connectionProvider, String adTabId, String adColumnId)    throws ServletException {
    return selectColumnTableDir(connectionProvider, adTabId, adColumnId, 0, 0);
  }

/**
Fields of reference table in a tab
 */
  public static FieldsData[] selectColumnTableDir(ConnectionProvider connectionProvider, String adTabId, String adColumnId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ColumnName As Name, 'x' as xmltext, ColumnName as referencevalue, " +
      "      ad_val_rule.CODE as defaultValue, ad_val_rule.AD_VAL_RULE_ID as columnname, ad_table.tablename, " +
      "      'TableDir' as tablenametrl, '' as WHERECLAUSE, '19' as reference, ad_column.istranslated " +
      "      FROM ad_field, ad_column left join ad_val_rule on ad_column.AD_VAL_RULE_ID = ad_val_rule.AD_VAL_RULE_ID , ad_table " +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "      and ad_column.ad_table_id = ad_table.ad_table_id " +
      "      and ad_field.ISDISPLAYED = 'Y'" +
      "      AND ad_field.ad_tab_id = ?" +
      "      AND ad_field.ignoreinwad='N'" +
      "      AND ad_column.ad_column_id = ? " +
      "      AND ad_reference_id = '19'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adColumnId);

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectFieldsData.tablenametrl = UtilSql.getValue(result, "TABLENAMETRL");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

  public static FieldsData[] selectColumnTableDirProcess(ConnectionProvider connectionProvider, String processParaId)    throws ServletException {
    return selectColumnTableDirProcess(connectionProvider, processParaId, 0, 0);
  }

  public static FieldsData[] selectColumnTableDirProcess(ConnectionProvider connectionProvider, String processParaId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ColumnName As Name, 'x' as xmltext, ColumnName as referencevalue, " +
      "      ad_val_rule.CODE as defaultValue, ad_val_rule.AD_VAL_RULE_ID as columnname,  " +
      "      'TableDir' as tablenametrl, '' as WHERECLAUSE, '19' as reference, 'N' as istranslated " +
      "      FROM ad_process_para p left join ad_val_rule on p.AD_VAL_RULE_ID = ad_val_rule.AD_VAL_RULE_ID" +
      "      WHERE p.ad_process_para_id = ?" +
      "      AND ad_reference_id = '19'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processParaId);

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.xmltext = UtilSql.getValue(result, "XMLTEXT");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.tablenametrl = UtilSql.getValue(result, "TABLENAMETRL");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Names of the columns of the fields of a tab
 */
  public static String columnName(ConnectionProvider connectionProvider, String adColumnId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT columnname FROM AD_column " +
      "      WHERE ad_column_id=?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adColumnId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COLUMNNAME");
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
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectIdentify(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectIdentify(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectIdentify(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_column.AD_COLUMN_ID as reference, REPLACE(replace(REPLACE(REPLACE(columnname, 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as Name, " +
      "      ad_column.defaultvalue as defaultValue, '' as WHERECLAUSE, ad_reference_id as referencevalue," +
      "      isdisplayed, ad_column.columnname as columnname, ad_table.ACCESSLEVEL, " +
      "      ad_table.TABLENAME as NameRef, '' as realname, ad_column.ISSESSIONATTR, ad_column.istranslated " +
      "      FROM ad_field, ad_column, ad_table" +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id" +
      "        AND ad_column.AD_TABLE_ID = ad_table.AD_TABLE_ID " +
      "        AND ad_tab_id = ? " +
      "        and ismandatory='Y' " +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND upper(ad_column.columnname) = 'VALUE'" +
      "      ORDER BY ad_field.SEQNO";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.reference = UtilSql.getValue(result, "REFERENCE");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectFieldsData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectFieldsData.referencevalue = UtilSql.getValue(result, "REFERENCEVALUE");
        objectFieldsData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.accesslevel = UtilSql.getValue(result, "ACCESSLEVEL");
        objectFieldsData.nameref = UtilSql.getValue(result, "NAMEREF");
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.issessionattr = UtilSql.getValue(result, "ISSESSIONATTR");
        objectFieldsData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Names of the columns of the fields of a tab
 */
  public static String selectParentWhereClause(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT whereclause" +
      "      FROM ad_tab" +
      "      WHERE ad_tab_id = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "WHERECLAUSE");
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
Names of the columns of the fields of a tab
 */
  public static String hasEncryptionFields(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT count(*) AS total " +
      "        FROM AD_FIELD, AD_COLUMN" +
      "        WHERE AD_FIELD.ad_tab_id = ? " +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND ad_field.ad_column_id = ad_column.ad_column_id " +
      "        AND ad_column.isEncrypted = 'Y' " +
      "        AND ad_field.ISDISPLAYED = 'Y'";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TOTAL");
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
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectEncrypted(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectEncrypted(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectEncrypted(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ad_field.ad_field_id as id, ad_column.ColumnName, ad_column.ColumnName as realName, ad_column.ColumnName as Name, ad_column.isDesencryptable, '' AS Xml_Format, '' as htmltext " +
      "      FROM ad_field, ad_column" +
      "      WHERE ad_field.ad_column_id = ad_column.ad_column_id " +
      "        AND ad_column.isEncrypted = 'Y' " +
      "        AND ad_field.ISDISPLAYED = 'Y'" +
      "        AND ad_field.ignoreinwad='N'" +
      "        AND ad_tab_id = ?" +
      "      ORDER BY ad_field.SEQNO";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.id = UtilSql.getValue(result, "ID");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.name = UtilSql.getValue(result, "NAME");
        objectFieldsData.isdesencryptable = UtilSql.getValue(result, "ISDESENCRYPTABLE");
        objectFieldsData.xmlFormat = UtilSql.getValue(result, "XML_FORMAT");
        objectFieldsData.htmltext = UtilSql.getValue(result, "HTMLTEXT");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectButton(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return selectButton(connectionProvider, tab, 0, 0);
  }

/**
Names of the columns of the fields of a tab
 */
  public static FieldsData[] selectButton(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select ad_reference_value_id as id, columnname, columnname || '_BTN' as realName " +
      "      from ad_field f, ad_column c" +
      "      where f.ad_column_id = c.ad_column_id " +
      "      and f.ad_tab_id = ?" +
      "      and f.isactive = 'Y'" +
      "      and f.ignoreinwad='N'" +
      "      and f.isdisplayed = 'Y'" +
      "      and c.isactive = 'Y'" +
      "      and ad_reference_value_id is not null" +
      "      and c.ad_reference_id = '28' " +
      "      and c.columnname <> 'ChangeProjectStatus'";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.id = UtilSql.getValue(result, "ID");
        objectFieldsData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectFieldsData.realname = UtilSql.getValue(result, "REALNAME");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }

/**
Checks if the tab has action buttons
 */
  public static String hasActionButton(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select count(*) as actionButtons" +
      "      from ad_field f, ad_column c" +
      "      where f.ad_column_id = c.ad_column_id " +
      "      and f.ad_tab_id = ?" +
      "      and f.isactive = 'Y'" +
      "      and f.isdisplayed = 'Y'" +
      "      and f.ignoreinwad='N'" +
      "      and c.isactive = 'Y'" +
      "      and ad_reference_value_id is not null" +
      "      and c.ad_reference_id = '28' ";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ACTIONBUTTONS");
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
Checks if the tab has action buttons
 */
  public static String hasButtonFixed(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          select count(*) as total" +
      "        from ad_field f," +
      "             ad_column c" +
      "       where f.ad_tab_id = ?" +
      "         and f.ad_column_id = c.ad_column_id" +
      "         and ad_reference_id = '28'" +
      "         and f.ignoreinwad='N'" +
      "         and f.isdisplayed = 'Y'" +
      "         and f.isactive='Y'";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TOTAL");
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

  public static FieldsData[] explicitAccessProcess(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return explicitAccessProcess(connectionProvider, tab, 0, 0);
  }

  public static FieldsData[] explicitAccessProcess(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select p.ad_process_id as id" +
      "        from ad_process p, ad_column c, ad_field f" +
      "       where f.ad_tab_id = ?" +
      "         and f.ad_column_id = c.ad_column_id" +
      "         and c.ad_process_id = p.ad_process_id" +
      "         and p.is_explicit_access = 'Y'";

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
        FieldsData objectFieldsData = new FieldsData();
        objectFieldsData.id = UtilSql.getValue(result, "ID");
        objectFieldsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFieldsData);
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
    FieldsData objectFieldsData[] = new FieldsData[vector.size()];
    vector.copyInto(objectFieldsData);
    return(objectFieldsData);
  }
}
