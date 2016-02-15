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

class TableSQLQueryData implements FieldProvider {
static Logger log4j = Logger.getLogger(TableSQLQueryData.class);
  private String InitRecordNumber="0";
  public String columnname;
  public String adReferenceId;
  public String adReferenceValueId;
  public String adValRuleId;
  public String fieldlength;
  public String defaultvalue;
  public String iskey;
  public String isparent;
  public String ismandatory;
  public String isupdateable;
  public String readonlylogic;
  public String isidentifier;
  public String seqno;
  public String istranslated;
  public String isencrypted;
  public String vformat;
  public String valuemin;
  public String valuemax;
  public String isselectioncolumn;
  public String adProcessId;
  public String issessionattr;
  public String issecondarykey;
  public String isdesencryptable;
  public String adCalloutId;
  public String name;
  public String adFieldgroupId;
  public String isdisplayed;
  public String displaylogic;
  public String displaylength;
  public String isreadonly;
  public String sortno;
  public String issameline;
  public String isfieldonly;
  public String showinrelation;
  public String adTableId;
  public String tablevel;
  public String hastree;
  public String whereclause;
  public String orderbyclause;
  public String adColumnsortorderId;
  public String adColumnsortyesnoId;
  public String issorttab;
  public String istabreadonly;
  public String filterclause;
  public String editreference;
  public String windowtype;
  public String issotrx;
  public String windowName;
  public String windowNameTrl;
  public String tabName;
  public String tabNameTrl;
  public String adWindowId;
  public String tablename;
  public String columnnameSearch;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("COLUMNNAME"))
      return columnname;
    else if (fieldName.equalsIgnoreCase("AD_REFERENCE_ID") || fieldName.equals("adReferenceId"))
      return adReferenceId;
    else if (fieldName.equalsIgnoreCase("AD_REFERENCE_VALUE_ID") || fieldName.equals("adReferenceValueId"))
      return adReferenceValueId;
    else if (fieldName.equalsIgnoreCase("AD_VAL_RULE_ID") || fieldName.equals("adValRuleId"))
      return adValRuleId;
    else if (fieldName.equalsIgnoreCase("FIELDLENGTH"))
      return fieldlength;
    else if (fieldName.equalsIgnoreCase("DEFAULTVALUE"))
      return defaultvalue;
    else if (fieldName.equalsIgnoreCase("ISKEY"))
      return iskey;
    else if (fieldName.equalsIgnoreCase("ISPARENT"))
      return isparent;
    else if (fieldName.equalsIgnoreCase("ISMANDATORY"))
      return ismandatory;
    else if (fieldName.equalsIgnoreCase("ISUPDATEABLE"))
      return isupdateable;
    else if (fieldName.equalsIgnoreCase("READONLYLOGIC"))
      return readonlylogic;
    else if (fieldName.equalsIgnoreCase("ISIDENTIFIER"))
      return isidentifier;
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("ISTRANSLATED"))
      return istranslated;
    else if (fieldName.equalsIgnoreCase("ISENCRYPTED"))
      return isencrypted;
    else if (fieldName.equalsIgnoreCase("VFORMAT"))
      return vformat;
    else if (fieldName.equalsIgnoreCase("VALUEMIN"))
      return valuemin;
    else if (fieldName.equalsIgnoreCase("VALUEMAX"))
      return valuemax;
    else if (fieldName.equalsIgnoreCase("ISSELECTIONCOLUMN"))
      return isselectioncolumn;
    else if (fieldName.equalsIgnoreCase("AD_PROCESS_ID") || fieldName.equals("adProcessId"))
      return adProcessId;
    else if (fieldName.equalsIgnoreCase("ISSESSIONATTR"))
      return issessionattr;
    else if (fieldName.equalsIgnoreCase("ISSECONDARYKEY"))
      return issecondarykey;
    else if (fieldName.equalsIgnoreCase("ISDESENCRYPTABLE"))
      return isdesencryptable;
    else if (fieldName.equalsIgnoreCase("AD_CALLOUT_ID") || fieldName.equals("adCalloutId"))
      return adCalloutId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("AD_FIELDGROUP_ID") || fieldName.equals("adFieldgroupId"))
      return adFieldgroupId;
    else if (fieldName.equalsIgnoreCase("ISDISPLAYED"))
      return isdisplayed;
    else if (fieldName.equalsIgnoreCase("DISPLAYLOGIC"))
      return displaylogic;
    else if (fieldName.equalsIgnoreCase("DISPLAYLENGTH"))
      return displaylength;
    else if (fieldName.equalsIgnoreCase("ISREADONLY"))
      return isreadonly;
    else if (fieldName.equalsIgnoreCase("SORTNO"))
      return sortno;
    else if (fieldName.equalsIgnoreCase("ISSAMELINE"))
      return issameline;
    else if (fieldName.equalsIgnoreCase("ISFIELDONLY"))
      return isfieldonly;
    else if (fieldName.equalsIgnoreCase("SHOWINRELATION"))
      return showinrelation;
    else if (fieldName.equalsIgnoreCase("AD_TABLE_ID") || fieldName.equals("adTableId"))
      return adTableId;
    else if (fieldName.equalsIgnoreCase("TABLEVEL"))
      return tablevel;
    else if (fieldName.equalsIgnoreCase("HASTREE"))
      return hastree;
    else if (fieldName.equalsIgnoreCase("WHERECLAUSE"))
      return whereclause;
    else if (fieldName.equalsIgnoreCase("ORDERBYCLAUSE"))
      return orderbyclause;
    else if (fieldName.equalsIgnoreCase("AD_COLUMNSORTORDER_ID") || fieldName.equals("adColumnsortorderId"))
      return adColumnsortorderId;
    else if (fieldName.equalsIgnoreCase("AD_COLUMNSORTYESNO_ID") || fieldName.equals("adColumnsortyesnoId"))
      return adColumnsortyesnoId;
    else if (fieldName.equalsIgnoreCase("ISSORTTAB"))
      return issorttab;
    else if (fieldName.equalsIgnoreCase("ISTABREADONLY"))
      return istabreadonly;
    else if (fieldName.equalsIgnoreCase("FILTERCLAUSE"))
      return filterclause;
    else if (fieldName.equalsIgnoreCase("EDITREFERENCE"))
      return editreference;
    else if (fieldName.equalsIgnoreCase("WINDOWTYPE"))
      return windowtype;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("WINDOW_NAME") || fieldName.equals("windowName"))
      return windowName;
    else if (fieldName.equalsIgnoreCase("WINDOW_NAME_TRL") || fieldName.equals("windowNameTrl"))
      return windowNameTrl;
    else if (fieldName.equalsIgnoreCase("TAB_NAME") || fieldName.equals("tabName"))
      return tabName;
    else if (fieldName.equalsIgnoreCase("TAB_NAME_TRL") || fieldName.equals("tabNameTrl"))
      return tabNameTrl;
    else if (fieldName.equalsIgnoreCase("AD_WINDOW_ID") || fieldName.equals("adWindowId"))
      return adWindowId;
    else if (fieldName.equalsIgnoreCase("TABLENAME"))
      return tablename;
    else if (fieldName.equalsIgnoreCase("COLUMNNAME_SEARCH") || fieldName.equals("columnnameSearch"))
      return columnnameSearch;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static TableSQLQueryData[] selectStructure(ConnectionProvider connectionProvider, String adTabId, String adLanguage)    throws ServletException {
    return selectStructure(connectionProvider, adTabId, adLanguage, 0, 0);
  }

  public static TableSQLQueryData[] selectStructure(ConnectionProvider connectionProvider, String adTabId, String adLanguage, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT c.ColumnName, c.AD_Reference_ID, c.AD_Reference_Value_ID, c.AD_Val_Rule_ID, " +
      "       c.FieldLength, c.DefaultValue, c.IsKey, c.IsParent, c.IsMandatory, c.IsUpdateable, " +
      "       c.ReadOnlyLogic, c.IsIdentifier, c.SeqNo, c.IsTranslated, c.IsEncrypted, c.VFormat, " +
      "       c.ValueMin, c.ValueMax, c.IsSelectionColumn, c.AD_Process_ID, c.IsSessionAttr, " +
      "       c.IsSecondaryKey, c.IsDesencryptable, c.AD_CallOut_ID, COALESCE(f_trl.Name, f.Name) AS Name, " +
      "       f.AD_FieldGroup_ID, f.IsDisplayed, f.DisplayLogic, f.DisplayLength, f.IsReadOnly, " +
      "       f.SortNo, f.IsSameLine, f.IsFieldOnly, f.ShowInRelation, " +
      "       c.AD_Table_ID, t.TabLevel, t.HasTree, t.WhereClause, t.OrderByClause, " +
      "       t.AD_ColumnSortOrder_ID, t.AD_ColumnSortYESNO_ID, t.IsSortTab, " +
      "       (CASE WHEN UIPATTERN='RO' THEN 'Y' ELSE 'N' END) AS IsTabReadOnly, " +
      "       t.FilterClause, t.EditReference, w.WindowType, w.IsSOTrx, w.name AS Window_Name, " +
      "       '' AS Window_Name_Trl, t.name AS Tab_Name, '' AS Tab_Name_Trl, t.AD_Window_ID, '' AS TableName, " +
      "       REPLACE(replace(REPLACE(REPLACE(REPLACE(REPLACE(c.columnname, 'C_Settlement_Generate_ID', 'C_Settlement_ID'), 'Ref_OrderLine_ID', 'C_OrderLine_ID'), 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as columnname_Search" +
      "       FROM AD_Tab t, AD_Window w, AD_Column c left join AD_Field f on c.AD_Column_ID = f.AD_Column_ID " +
      "                                  AND f.IsActive = 'Y' " +
      "                                  AND f.AD_Tab_ID = ? " +
      "                                  left join AD_Field_Trl f_trl on f.AD_Field_ID = f_trl.AD_Field_ID " +
      "                                  AND f_trl.AD_Language = ?" +
      "       WHERE t.AD_Table_ID = c.AD_Table_ID " +
      "       AND t.AD_Window_ID = w.AD_Window_ID" +
      "       AND t.AD_Tab_ID = ? " +
      "       AND c.IsActive = 'Y' " +
      "       ORDER BY f.SeqNo, c.SeqNo";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTabId);
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
        TableSQLQueryData objectTableSQLQueryData = new TableSQLQueryData();
        objectTableSQLQueryData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectTableSQLQueryData.adReferenceId = UtilSql.getValue(result, "AD_REFERENCE_ID");
        objectTableSQLQueryData.adReferenceValueId = UtilSql.getValue(result, "AD_REFERENCE_VALUE_ID");
        objectTableSQLQueryData.adValRuleId = UtilSql.getValue(result, "AD_VAL_RULE_ID");
        objectTableSQLQueryData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectTableSQLQueryData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectTableSQLQueryData.iskey = UtilSql.getValue(result, "ISKEY");
        objectTableSQLQueryData.isparent = UtilSql.getValue(result, "ISPARENT");
        objectTableSQLQueryData.ismandatory = UtilSql.getValue(result, "ISMANDATORY");
        objectTableSQLQueryData.isupdateable = UtilSql.getValue(result, "ISUPDATEABLE");
        objectTableSQLQueryData.readonlylogic = UtilSql.getValue(result, "READONLYLOGIC");
        objectTableSQLQueryData.isidentifier = UtilSql.getValue(result, "ISIDENTIFIER");
        objectTableSQLQueryData.seqno = UtilSql.getValue(result, "SEQNO");
        objectTableSQLQueryData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectTableSQLQueryData.isencrypted = UtilSql.getValue(result, "ISENCRYPTED");
        objectTableSQLQueryData.vformat = UtilSql.getValue(result, "VFORMAT");
        objectTableSQLQueryData.valuemin = UtilSql.getValue(result, "VALUEMIN");
        objectTableSQLQueryData.valuemax = UtilSql.getValue(result, "VALUEMAX");
        objectTableSQLQueryData.isselectioncolumn = UtilSql.getValue(result, "ISSELECTIONCOLUMN");
        objectTableSQLQueryData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
        objectTableSQLQueryData.issessionattr = UtilSql.getValue(result, "ISSESSIONATTR");
        objectTableSQLQueryData.issecondarykey = UtilSql.getValue(result, "ISSECONDARYKEY");
        objectTableSQLQueryData.isdesencryptable = UtilSql.getValue(result, "ISDESENCRYPTABLE");
        objectTableSQLQueryData.adCalloutId = UtilSql.getValue(result, "AD_CALLOUT_ID");
        objectTableSQLQueryData.name = UtilSql.getValue(result, "NAME");
        objectTableSQLQueryData.adFieldgroupId = UtilSql.getValue(result, "AD_FIELDGROUP_ID");
        objectTableSQLQueryData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectTableSQLQueryData.displaylogic = UtilSql.getValue(result, "DISPLAYLOGIC");
        objectTableSQLQueryData.displaylength = UtilSql.getValue(result, "DISPLAYLENGTH");
        objectTableSQLQueryData.isreadonly = UtilSql.getValue(result, "ISREADONLY");
        objectTableSQLQueryData.sortno = UtilSql.getValue(result, "SORTNO");
        objectTableSQLQueryData.issameline = UtilSql.getValue(result, "ISSAMELINE");
        objectTableSQLQueryData.isfieldonly = UtilSql.getValue(result, "ISFIELDONLY");
        objectTableSQLQueryData.showinrelation = UtilSql.getValue(result, "SHOWINRELATION");
        objectTableSQLQueryData.adTableId = UtilSql.getValue(result, "AD_TABLE_ID");
        objectTableSQLQueryData.tablevel = UtilSql.getValue(result, "TABLEVEL");
        objectTableSQLQueryData.hastree = UtilSql.getValue(result, "HASTREE");
        objectTableSQLQueryData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectTableSQLQueryData.orderbyclause = UtilSql.getValue(result, "ORDERBYCLAUSE");
        objectTableSQLQueryData.adColumnsortorderId = UtilSql.getValue(result, "AD_COLUMNSORTORDER_ID");
        objectTableSQLQueryData.adColumnsortyesnoId = UtilSql.getValue(result, "AD_COLUMNSORTYESNO_ID");
        objectTableSQLQueryData.issorttab = UtilSql.getValue(result, "ISSORTTAB");
        objectTableSQLQueryData.istabreadonly = UtilSql.getValue(result, "ISTABREADONLY");
        objectTableSQLQueryData.filterclause = UtilSql.getValue(result, "FILTERCLAUSE");
        objectTableSQLQueryData.editreference = UtilSql.getValue(result, "EDITREFERENCE");
        objectTableSQLQueryData.windowtype = UtilSql.getValue(result, "WINDOWTYPE");
        objectTableSQLQueryData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectTableSQLQueryData.windowName = UtilSql.getValue(result, "WINDOW_NAME");
        objectTableSQLQueryData.windowNameTrl = UtilSql.getValue(result, "WINDOW_NAME_TRL");
        objectTableSQLQueryData.tabName = UtilSql.getValue(result, "TAB_NAME");
        objectTableSQLQueryData.tabNameTrl = UtilSql.getValue(result, "TAB_NAME_TRL");
        objectTableSQLQueryData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectTableSQLQueryData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectTableSQLQueryData.columnnameSearch = UtilSql.getValue(result, "COLUMNNAME_SEARCH");
        objectTableSQLQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableSQLQueryData);
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
    TableSQLQueryData objectTableSQLQueryData[] = new TableSQLQueryData[vector.size()];
    vector.copyInto(objectTableSQLQueryData);
    return(objectTableSQLQueryData);
  }

  public static TableSQLQueryData[] selectKeyMapStructure(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    return selectKeyMapStructure(connectionProvider, adTabId, 0, 0);
  }

  public static TableSQLQueryData[] selectKeyMapStructure(ConnectionProvider connectionProvider, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT t.name as tab_name, w.name as window_name" +
      "         FROM AD_Tab t, AD_Window w" +
      "        WHERE t.AD_Window_ID = w.AD_Window_ID" +
      "          AND t.AD_Tab_ID = ?";

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
        TableSQLQueryData objectTableSQLQueryData = new TableSQLQueryData();
        objectTableSQLQueryData.tabName = UtilSql.getValue(result, "TAB_NAME");
        objectTableSQLQueryData.windowName = UtilSql.getValue(result, "WINDOW_NAME");
        objectTableSQLQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableSQLQueryData);
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
    TableSQLQueryData objectTableSQLQueryData[] = new TableSQLQueryData[vector.size()];
    vector.copyInto(objectTableSQLQueryData);
    return(objectTableSQLQueryData);
  }

  public static TableSQLQueryData[] selectRelationStructure(ConnectionProvider connectionProvider, String adLanguage, String adTabId)    throws ServletException {
    return selectRelationStructure(connectionProvider, adLanguage, adTabId, 0, 0);
  }

  public static TableSQLQueryData[] selectRelationStructure(ConnectionProvider connectionProvider, String adLanguage, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c.ColumnName, c.AD_Reference_ID, c.AD_Reference_Value_ID, c.AD_Val_Rule_ID," +
      "        c.FieldLength, c.DefaultValue, c.IsKey, c.IsParent, c.IsMandatory, c.IsUpdateable," +
      "        c.ReadOnlyLogic, c.IsIdentifier, c.SeqNo, c.IsTranslated, c.IsEncrypted, c.VFormat," +
      "        c.ValueMin, c.ValueMax, c.IsSelectionColumn, c.AD_Process_ID, c.IsSessionAttr," +
      "        c.IsSecondaryKey, c.IsDesencryptable, c.AD_CallOut_ID, COALESCE(f_trl.Name, f.Name) AS Name," +
      "        f.AD_FieldGroup_ID, f.IsDisplayed, f.DisplayLogic, f.DisplayLength, f.IsReadOnly," +
      "        f.SortNo, f.IsSameLine, f.IsFieldOnly, f.ShowInRelation," +
      "        c.AD_Table_ID, t.TabLevel, t.HasTree, t.WhereClause, t.OrderByClause," +
      "        t.AD_ColumnSortOrder_ID, t.AD_ColumnSortYESNO_ID, t.IsSortTab, (CASE WHEN UIPATTERN='RO' THEN 'Y' ELSE 'N' END) AS IsTabReadOnly," +
      "        t.FilterClause, t.EditReference," +
      "        '' AS WindowType, '' AS IsSOTrx, ''AS Window_Name," +
      "        '' AS Window_Name_Trl, t.name AS Tab_Name, '' AS Tab_Name_Trl, t.AD_Window_ID, '' AS TableName," +
      "        REPLACE(replace(REPLACE(REPLACE(REPLACE(REPLACE(c.columnname, 'C_Settlement_Generate_ID', 'C_Settlement_ID'), 'Ref_OrderLine_ID', 'C_OrderLine_ID'), 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as columnname_Search" +
      "        FROM AD_Tab t" +
      "             inner join AD_Column c on t.AD_Table_ID = c.AD_Table_ID" +
      "             left join AD_Field f on c.AD_Column_ID = f.AD_Column_ID AND f.IsActive = 'Y' AND f.AD_Tab_ID = t.AD_Tab_ID" +
      "             left join AD_Field_Trl f_trl on f.AD_Field_ID = f_trl.AD_Field_ID AND f_trl.AD_Language = ?" +
      "        WHERE t.AD_Tab_ID = ?" +
      "        AND c.IsActive = 'Y'" +
      "        AND (c.IsKey = 'Y' or c.IsSecondaryKey = 'Y' or c.IsSelectionColumn = 'Y' or (f.IsDisplayed='Y' and f.ShowInRelation='Y' and c.IsEncrypted='N'))" +
      "        ORDER BY f.Grid_SeqNo, f.SeqNo, c.SeqNo";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
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
        TableSQLQueryData objectTableSQLQueryData = new TableSQLQueryData();
        objectTableSQLQueryData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectTableSQLQueryData.adReferenceId = UtilSql.getValue(result, "AD_REFERENCE_ID");
        objectTableSQLQueryData.adReferenceValueId = UtilSql.getValue(result, "AD_REFERENCE_VALUE_ID");
        objectTableSQLQueryData.adValRuleId = UtilSql.getValue(result, "AD_VAL_RULE_ID");
        objectTableSQLQueryData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectTableSQLQueryData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectTableSQLQueryData.iskey = UtilSql.getValue(result, "ISKEY");
        objectTableSQLQueryData.isparent = UtilSql.getValue(result, "ISPARENT");
        objectTableSQLQueryData.ismandatory = UtilSql.getValue(result, "ISMANDATORY");
        objectTableSQLQueryData.isupdateable = UtilSql.getValue(result, "ISUPDATEABLE");
        objectTableSQLQueryData.readonlylogic = UtilSql.getValue(result, "READONLYLOGIC");
        objectTableSQLQueryData.isidentifier = UtilSql.getValue(result, "ISIDENTIFIER");
        objectTableSQLQueryData.seqno = UtilSql.getValue(result, "SEQNO");
        objectTableSQLQueryData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectTableSQLQueryData.isencrypted = UtilSql.getValue(result, "ISENCRYPTED");
        objectTableSQLQueryData.vformat = UtilSql.getValue(result, "VFORMAT");
        objectTableSQLQueryData.valuemin = UtilSql.getValue(result, "VALUEMIN");
        objectTableSQLQueryData.valuemax = UtilSql.getValue(result, "VALUEMAX");
        objectTableSQLQueryData.isselectioncolumn = UtilSql.getValue(result, "ISSELECTIONCOLUMN");
        objectTableSQLQueryData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
        objectTableSQLQueryData.issessionattr = UtilSql.getValue(result, "ISSESSIONATTR");
        objectTableSQLQueryData.issecondarykey = UtilSql.getValue(result, "ISSECONDARYKEY");
        objectTableSQLQueryData.isdesencryptable = UtilSql.getValue(result, "ISDESENCRYPTABLE");
        objectTableSQLQueryData.adCalloutId = UtilSql.getValue(result, "AD_CALLOUT_ID");
        objectTableSQLQueryData.name = UtilSql.getValue(result, "NAME");
        objectTableSQLQueryData.adFieldgroupId = UtilSql.getValue(result, "AD_FIELDGROUP_ID");
        objectTableSQLQueryData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectTableSQLQueryData.displaylogic = UtilSql.getValue(result, "DISPLAYLOGIC");
        objectTableSQLQueryData.displaylength = UtilSql.getValue(result, "DISPLAYLENGTH");
        objectTableSQLQueryData.isreadonly = UtilSql.getValue(result, "ISREADONLY");
        objectTableSQLQueryData.sortno = UtilSql.getValue(result, "SORTNO");
        objectTableSQLQueryData.issameline = UtilSql.getValue(result, "ISSAMELINE");
        objectTableSQLQueryData.isfieldonly = UtilSql.getValue(result, "ISFIELDONLY");
        objectTableSQLQueryData.showinrelation = UtilSql.getValue(result, "SHOWINRELATION");
        objectTableSQLQueryData.adTableId = UtilSql.getValue(result, "AD_TABLE_ID");
        objectTableSQLQueryData.tablevel = UtilSql.getValue(result, "TABLEVEL");
        objectTableSQLQueryData.hastree = UtilSql.getValue(result, "HASTREE");
        objectTableSQLQueryData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectTableSQLQueryData.orderbyclause = UtilSql.getValue(result, "ORDERBYCLAUSE");
        objectTableSQLQueryData.adColumnsortorderId = UtilSql.getValue(result, "AD_COLUMNSORTORDER_ID");
        objectTableSQLQueryData.adColumnsortyesnoId = UtilSql.getValue(result, "AD_COLUMNSORTYESNO_ID");
        objectTableSQLQueryData.issorttab = UtilSql.getValue(result, "ISSORTTAB");
        objectTableSQLQueryData.istabreadonly = UtilSql.getValue(result, "ISTABREADONLY");
        objectTableSQLQueryData.filterclause = UtilSql.getValue(result, "FILTERCLAUSE");
        objectTableSQLQueryData.editreference = UtilSql.getValue(result, "EDITREFERENCE");
        objectTableSQLQueryData.windowtype = UtilSql.getValue(result, "WINDOWTYPE");
        objectTableSQLQueryData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectTableSQLQueryData.windowName = UtilSql.getValue(result, "WINDOW_NAME");
        objectTableSQLQueryData.windowNameTrl = UtilSql.getValue(result, "WINDOW_NAME_TRL");
        objectTableSQLQueryData.tabName = UtilSql.getValue(result, "TAB_NAME");
        objectTableSQLQueryData.tabNameTrl = UtilSql.getValue(result, "TAB_NAME_TRL");
        objectTableSQLQueryData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectTableSQLQueryData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectTableSQLQueryData.columnnameSearch = UtilSql.getValue(result, "COLUMNNAME_SEARCH");
        objectTableSQLQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableSQLQueryData);
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
    TableSQLQueryData objectTableSQLQueryData[] = new TableSQLQueryData[vector.size()];
    vector.copyInto(objectTableSQLQueryData);
    return(objectTableSQLQueryData);
  }

  public static TableSQLQueryData[] selectRelationStructureAudit(ConnectionProvider connectionProvider, String adLanguage, String adTabId)    throws ServletException {
    return selectRelationStructureAudit(connectionProvider, adLanguage, adTabId, 0, 0);
  }

  public static TableSQLQueryData[] selectRelationStructureAudit(ConnectionProvider connectionProvider, String adLanguage, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c.ColumnName, c.ad_Reference_id, c.AD_Reference_Value_ID, c.AD_Val_Rule_ID," +
      "        c.FieldLength, c.DefaultValue, c.IsKey, c.IsParent, c.IsMandatory, c.IsUpdateable," +
      "        c.ReadOnlyLogic, c.IsIdentifier, c.SeqNo, c.IsTranslated, c.IsEncrypted, c.VFormat," +
      "        c.ValueMin, c.ValueMax, c.IsSelectionColumn, c.AD_Process_ID, c.IsSessionAttr," +
      "        c.IsSecondaryKey, c.IsDesencryptable, c.AD_CallOut_ID, COALESCE(f_trl.Name, f.Name, c.Name) AS Name," +
      "        f.AD_FieldGroup_ID, 'Y' as IsDisplayed, f.DisplayLogic, 22 as DisplayLength, f.IsReadOnly," +
      "        f.SortNo, f.IsSameLine, f.IsFieldOnly, 'Y' as ShowInRelation," +
      "        c.AD_Table_ID, t.TabLevel, t.HasTree, t.WhereClause, t.OrderByClause," +
      "        t.AD_ColumnSortOrder_ID, t.AD_ColumnSortYESNO_ID, t.IsSortTab, (CASE WHEN UIPATTERN='RO' THEN 'Y' ELSE 'N' END) AS IsTabReadOnly," +
      "        t.FilterClause, t.EditReference," +
      "        '' AS WindowType, '' AS IsSOTrx, ''AS Window_Name," +
      "        '' AS Window_Name_Trl, t.name AS Tab_Name, '' AS Tab_Name_Trl, t.AD_Window_ID, '' AS TableName," +
      "        REPLACE(replace(REPLACE(REPLACE(REPLACE(REPLACE(c.columnname, 'C_Settlement_Generate_ID', 'C_Settlement_ID'), 'Ref_OrderLine_ID', 'C_OrderLine_ID'), 'Substitute_ID', 'M_Product_ID'), 'C_Settlement_Cancel_ID', 'C_Settlement_ID'), 'BOM_ID', '_ID'), 'M_LocatorTo_ID', 'M_Locator_ID') as columnname_Search" +
      "        FROM AD_Tab t" +
      "             inner join AD_Column c on t.AD_Table_ID = c.AD_Table_ID" +
      "             left join AD_Field f on c.AD_Column_ID = f.AD_Column_ID AND f.IsActive = 'Y' AND f.AD_Tab_ID = t.AD_Tab_ID" +
      "             left join AD_Field_Trl f_trl on f.AD_Field_ID = f_trl.AD_Field_ID AND f_trl.AD_Language = ?" +
      "        WHERE t.AD_Tab_ID = ?" +
      "        AND c.IsActive = 'Y'" +
      "        AND upper(c.columnname) in ('UPDATED','UPDATEDBY','CREATED','CREATEDBY')" +
      "        ORDER BY (case when upper(columnname)='CREATED' then 10000 " +
      "                   when upper(columnname)='CREATEDBY' then 10001" +
      "                   when upper(columnname)='UPDATED' then 10002" +
      "                   else 10003" +
      "                  end)";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
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
        TableSQLQueryData objectTableSQLQueryData = new TableSQLQueryData();
        objectTableSQLQueryData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectTableSQLQueryData.adReferenceId = UtilSql.getValue(result, "AD_REFERENCE_ID");
        objectTableSQLQueryData.adReferenceValueId = UtilSql.getValue(result, "AD_REFERENCE_VALUE_ID");
        objectTableSQLQueryData.adValRuleId = UtilSql.getValue(result, "AD_VAL_RULE_ID");
        objectTableSQLQueryData.fieldlength = UtilSql.getValue(result, "FIELDLENGTH");
        objectTableSQLQueryData.defaultvalue = UtilSql.getValue(result, "DEFAULTVALUE");
        objectTableSQLQueryData.iskey = UtilSql.getValue(result, "ISKEY");
        objectTableSQLQueryData.isparent = UtilSql.getValue(result, "ISPARENT");
        objectTableSQLQueryData.ismandatory = UtilSql.getValue(result, "ISMANDATORY");
        objectTableSQLQueryData.isupdateable = UtilSql.getValue(result, "ISUPDATEABLE");
        objectTableSQLQueryData.readonlylogic = UtilSql.getValue(result, "READONLYLOGIC");
        objectTableSQLQueryData.isidentifier = UtilSql.getValue(result, "ISIDENTIFIER");
        objectTableSQLQueryData.seqno = UtilSql.getValue(result, "SEQNO");
        objectTableSQLQueryData.istranslated = UtilSql.getValue(result, "ISTRANSLATED");
        objectTableSQLQueryData.isencrypted = UtilSql.getValue(result, "ISENCRYPTED");
        objectTableSQLQueryData.vformat = UtilSql.getValue(result, "VFORMAT");
        objectTableSQLQueryData.valuemin = UtilSql.getValue(result, "VALUEMIN");
        objectTableSQLQueryData.valuemax = UtilSql.getValue(result, "VALUEMAX");
        objectTableSQLQueryData.isselectioncolumn = UtilSql.getValue(result, "ISSELECTIONCOLUMN");
        objectTableSQLQueryData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
        objectTableSQLQueryData.issessionattr = UtilSql.getValue(result, "ISSESSIONATTR");
        objectTableSQLQueryData.issecondarykey = UtilSql.getValue(result, "ISSECONDARYKEY");
        objectTableSQLQueryData.isdesencryptable = UtilSql.getValue(result, "ISDESENCRYPTABLE");
        objectTableSQLQueryData.adCalloutId = UtilSql.getValue(result, "AD_CALLOUT_ID");
        objectTableSQLQueryData.name = UtilSql.getValue(result, "NAME");
        objectTableSQLQueryData.adFieldgroupId = UtilSql.getValue(result, "AD_FIELDGROUP_ID");
        objectTableSQLQueryData.isdisplayed = UtilSql.getValue(result, "ISDISPLAYED");
        objectTableSQLQueryData.displaylogic = UtilSql.getValue(result, "DISPLAYLOGIC");
        objectTableSQLQueryData.displaylength = UtilSql.getValue(result, "DISPLAYLENGTH");
        objectTableSQLQueryData.isreadonly = UtilSql.getValue(result, "ISREADONLY");
        objectTableSQLQueryData.sortno = UtilSql.getValue(result, "SORTNO");
        objectTableSQLQueryData.issameline = UtilSql.getValue(result, "ISSAMELINE");
        objectTableSQLQueryData.isfieldonly = UtilSql.getValue(result, "ISFIELDONLY");
        objectTableSQLQueryData.showinrelation = UtilSql.getValue(result, "SHOWINRELATION");
        objectTableSQLQueryData.adTableId = UtilSql.getValue(result, "AD_TABLE_ID");
        objectTableSQLQueryData.tablevel = UtilSql.getValue(result, "TABLEVEL");
        objectTableSQLQueryData.hastree = UtilSql.getValue(result, "HASTREE");
        objectTableSQLQueryData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectTableSQLQueryData.orderbyclause = UtilSql.getValue(result, "ORDERBYCLAUSE");
        objectTableSQLQueryData.adColumnsortorderId = UtilSql.getValue(result, "AD_COLUMNSORTORDER_ID");
        objectTableSQLQueryData.adColumnsortyesnoId = UtilSql.getValue(result, "AD_COLUMNSORTYESNO_ID");
        objectTableSQLQueryData.issorttab = UtilSql.getValue(result, "ISSORTTAB");
        objectTableSQLQueryData.istabreadonly = UtilSql.getValue(result, "ISTABREADONLY");
        objectTableSQLQueryData.filterclause = UtilSql.getValue(result, "FILTERCLAUSE");
        objectTableSQLQueryData.editreference = UtilSql.getValue(result, "EDITREFERENCE");
        objectTableSQLQueryData.windowtype = UtilSql.getValue(result, "WINDOWTYPE");
        objectTableSQLQueryData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectTableSQLQueryData.windowName = UtilSql.getValue(result, "WINDOW_NAME");
        objectTableSQLQueryData.windowNameTrl = UtilSql.getValue(result, "WINDOW_NAME_TRL");
        objectTableSQLQueryData.tabName = UtilSql.getValue(result, "TAB_NAME");
        objectTableSQLQueryData.tabNameTrl = UtilSql.getValue(result, "TAB_NAME_TRL");
        objectTableSQLQueryData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectTableSQLQueryData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectTableSQLQueryData.columnnameSearch = UtilSql.getValue(result, "COLUMNNAME_SEARCH");
        objectTableSQLQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableSQLQueryData);
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
    TableSQLQueryData objectTableSQLQueryData[] = new TableSQLQueryData[vector.size()];
    vector.copyInto(objectTableSQLQueryData);
    return(objectTableSQLQueryData);
  }

  public static TableSQLQueryData[] selectWindowDefinition(ConnectionProvider connectionProvider, String adLanguage, String adTabId)    throws ServletException {
    return selectWindowDefinition(connectionProvider, adLanguage, adTabId, 0, 0);
  }

  public static TableSQLQueryData[] selectWindowDefinition(ConnectionProvider connectionProvider, String adLanguage, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT t.AD_Table_ID, t.TabLevel, (CASE WHEN UIPATTERN='RO' THEN 'Y' ELSE 'N' END) AS IsReadOnly, t.HasTree, t.WhereClause, t.OrderByClause, t.AD_Process_ID, " +
      "       t.AD_ColumnSortOrder_ID, t.AD_ColumnSortYESNO_ID, t.IsSortTab, t.FilterClause, t.EditReference, " +
      "       w.WindowType, w.IsSOTrx, w.Name AS Window_Name, COALESCE(w_trl.Name, w.Name) AS Window_Name_Trl, " +
      "       t.Name AS Tab_Name, COALESCE(t_trl.Name, t.Name) AS Tab_Name_Trl, w.AD_Window_ID, " +
      "       tb.TableName " +
      "       FROM AD_Tab t left join AD_Tab_TRL t_trl on t.AD_Tab_ID = t_trl.AD_Tab_ID " +
      "                     AND t_trl.AD_Language = ?, " +
      "            AD_Window w left join AD_Window_TRL w_trl on w.AD_Window_ID = w_trl.AD_Window_ID " +
      "                        AND w_trl.AD_Language = ?, " +
      "            AD_Table tb " +
      "       WHERE t.AD_Window_ID = w.AD_Window_ID " +
      "       AND t.AD_Tab_ID = ? " +
      "       AND t.AD_Table_ID = tb.AD_Table_ID ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
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
        TableSQLQueryData objectTableSQLQueryData = new TableSQLQueryData();
        objectTableSQLQueryData.adTableId = UtilSql.getValue(result, "AD_TABLE_ID");
        objectTableSQLQueryData.tablevel = UtilSql.getValue(result, "TABLEVEL");
        objectTableSQLQueryData.isreadonly = UtilSql.getValue(result, "ISREADONLY");
        objectTableSQLQueryData.hastree = UtilSql.getValue(result, "HASTREE");
        objectTableSQLQueryData.whereclause = UtilSql.getValue(result, "WHERECLAUSE");
        objectTableSQLQueryData.orderbyclause = UtilSql.getValue(result, "ORDERBYCLAUSE");
        objectTableSQLQueryData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
        objectTableSQLQueryData.adColumnsortorderId = UtilSql.getValue(result, "AD_COLUMNSORTORDER_ID");
        objectTableSQLQueryData.adColumnsortyesnoId = UtilSql.getValue(result, "AD_COLUMNSORTYESNO_ID");
        objectTableSQLQueryData.issorttab = UtilSql.getValue(result, "ISSORTTAB");
        objectTableSQLQueryData.filterclause = UtilSql.getValue(result, "FILTERCLAUSE");
        objectTableSQLQueryData.editreference = UtilSql.getValue(result, "EDITREFERENCE");
        objectTableSQLQueryData.windowtype = UtilSql.getValue(result, "WINDOWTYPE");
        objectTableSQLQueryData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectTableSQLQueryData.windowName = UtilSql.getValue(result, "WINDOW_NAME");
        objectTableSQLQueryData.windowNameTrl = UtilSql.getValue(result, "WINDOW_NAME_TRL");
        objectTableSQLQueryData.tabName = UtilSql.getValue(result, "TAB_NAME");
        objectTableSQLQueryData.tabNameTrl = UtilSql.getValue(result, "TAB_NAME_TRL");
        objectTableSQLQueryData.adWindowId = UtilSql.getValue(result, "AD_WINDOW_ID");
        objectTableSQLQueryData.tablename = UtilSql.getValue(result, "TABLENAME");
        objectTableSQLQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableSQLQueryData);
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
    TableSQLQueryData objectTableSQLQueryData[] = new TableSQLQueryData[vector.size()];
    vector.copyInto(objectTableSQLQueryData);
    return(objectTableSQLQueryData);
  }

  public static TableSQLQueryData[] selectOrderByFields(ConnectionProvider connectionProvider, String adTabId)    throws ServletException {
    return selectOrderByFields(connectionProvider, adTabId, 0, 0);
  }

  public static TableSQLQueryData[] selectOrderByFields(ConnectionProvider connectionProvider, String adTabId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT c.ColumnName" +
      "       FROM AD_Tab t, AD_Field f, AD_Column c" +
      "       WHERE t.AD_Tab_ID = f.AD_Tab_ID " +
      "       AND f.AD_Column_ID = c.AD_Column_ID " +
      "       AND t.AD_Tab_ID = ? " +
      "       AND c.IsActive = 'Y'" +
      "       AND f.IsActive = 'Y'" +
      "       AND f.SortNo IS NOT NULL" +
      "       ORDER BY f.SortNo";

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
        TableSQLQueryData objectTableSQLQueryData = new TableSQLQueryData();
        objectTableSQLQueryData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectTableSQLQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableSQLQueryData);
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
    TableSQLQueryData objectTableSQLQueryData[] = new TableSQLQueryData[vector.size()];
    vector.copyInto(objectTableSQLQueryData);
    return(objectTableSQLQueryData);
  }

/**
Name of the columns parent of the tab
 */
  public static String columnNameKey(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ColumnName" +
      "        FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id " +
      "        AND ad_tab_id = ? " +
      "        AND ad_Field.isActive = 'Y' " +
      "        AND ad_Column.isActive = 'Y' " +
      "        AND isKey='Y'";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tab);

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
Name of the columns parent of the tab
 */
  public static TableSQLQueryData[] parentsColumnName(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return parentsColumnName(connectionProvider, tab, 0, 0);
  }

/**
Name of the columns parent of the tab
 */
  public static TableSQLQueryData[] parentsColumnName(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ColumnName, AD_REFERENCE_id, ad_reference_value_id" +
      "        FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id " +
      "        AND ad_tab_id = ? " +
      "        AND isParent='Y' " +
      "        AND EXISTS (SELECT 1 FROM AD_COLUMN c, AD_FIELD f WHERE c.ad_column_id = f.ad_column_id AND (c.iskey='Y' OR c.isSecondaryKey = 'Y')" +
      "                    AND ad_tab_id=(SELECT max(t1.ad_tab_id)" +
      "                        FROM ad_tab t1, ad_tab t2" +
      "                        WHERE t1.ad_window_id = t2.ad_window_id" +
      "                        AND t2.ad_tab_id = AD_FIELD.AD_Tab_ID" +
      "                        AND t1.tablevel = (t2.tablevel -1)" +
      "                        AND t1.seqno =(SELECT max(t3.seqno)" +
      "                        FROM ad_tab t3" +
      "                        WHERE t3.ad_window_id = t2.ad_window_id" +
      "                        AND t3.tablevel = (t2.tablevel -1)" +
      "                        AND t3.seqno < t2.seqno))" +
      "                        AND (UPPER(c.columnname) = UPPER(AD_COLUMN.columnname)" +
      "                            OR (UPPER(AD_COLUMN.columnname) LIKE 'EM_%'" +
      "                                AND UPPER(SUBSTR(AD_COLUMN.columnname,4))=UPPER(c.columnname))))";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
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
        TableSQLQueryData objectTableSQLQueryData = new TableSQLQueryData();
        objectTableSQLQueryData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectTableSQLQueryData.adReferenceId = UtilSql.getValue(result, "AD_REFERENCE_ID");
        objectTableSQLQueryData.adReferenceValueId = UtilSql.getValue(result, "AD_REFERENCE_VALUE_ID");
        objectTableSQLQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableSQLQueryData);
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
    TableSQLQueryData objectTableSQLQueryData[] = new TableSQLQueryData[vector.size()];
    vector.copyInto(objectTableSQLQueryData);
    return(objectTableSQLQueryData);
  }

/**
Name of the columns parent of the tab
 */
  public static TableSQLQueryData[] parentsColumnNameKey(ConnectionProvider connectionProvider, String tab)    throws ServletException {
    return parentsColumnNameKey(connectionProvider, tab, 0, 0);
  }

/**
Name of the columns parent of the tab
 */
  public static TableSQLQueryData[] parentsColumnNameKey(ConnectionProvider connectionProvider, String tab, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ColumnName, AD_REFERENCE_id, ad_reference_value_id" +
      "        FROM AD_FIELD, AD_COLUMN " +
      "        WHERE AD_FIELD.ad_column_id = AD_COLUMN.ad_column_id " +
      "        AND ad_tab_id = ? " +
      "        AND isKey='Y' " +
      "        AND EXISTS(SELECT 1 FROM AD_Tab t1, ad_tab t2 " +
      "                        WHERE t1.ad_window_id = t2.ad_window_id" +
      "                        AND t2.ad_tab_id = AD_FIELD.AD_Tab_ID " +
      "                        AND t1.tablevel = (t2.tablevel -1)" +
      "                        AND t1.seqno < t2.seqno" +
      "                        AND t1.ad_table_id = t2.ad_table_id)                        ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
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
        TableSQLQueryData objectTableSQLQueryData = new TableSQLQueryData();
        objectTableSQLQueryData.columnname = UtilSql.getValue(result, "COLUMNNAME");
        objectTableSQLQueryData.adReferenceId = UtilSql.getValue(result, "AD_REFERENCE_ID");
        objectTableSQLQueryData.adReferenceValueId = UtilSql.getValue(result, "AD_REFERENCE_VALUE_ID");
        objectTableSQLQueryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTableSQLQueryData);
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
    TableSQLQueryData objectTableSQLQueryData[] = new TableSQLQueryData[vector.size()];
    vector.copyInto(objectTableSQLQueryData);
    return(objectTableSQLQueryData);
  }
}
