//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.modules;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

public class ModuleTreeData implements FieldProvider {
static Logger log4j = Logger.getLogger(ModuleTreeData.class);
  private String InitRecordNumber="0";
  public String type;
  public String nodeId;
  public String name;
  public String display;
  public String linkclick;
  public String linkname;
  public String linkclick1;
  public String linkname1;
  public String description;
  public String version;
  public String statusName;
  public String status;
  public String updateAvailable;
  public String help;
  public String author;
  public String url;
  public String levelno;
  public String leveltree;
  public String icon;
  public String icon2;
  public String endline;
  public String updateversion;
  public String updatedescription;
  public String position;
  public String updateVerId;
  public String style;
  public String seqno;
  public String modulename;
  public String versionLabel;
  public String enabled;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("TYPE"))
      return type;
    else if (fieldName.equalsIgnoreCase("NODE_ID") || fieldName.equals("nodeId"))
      return nodeId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DISPLAY"))
      return display;
    else if (fieldName.equalsIgnoreCase("LINKCLICK"))
      return linkclick;
    else if (fieldName.equalsIgnoreCase("LINKNAME"))
      return linkname;
    else if (fieldName.equalsIgnoreCase("LINKCLICK1"))
      return linkclick1;
    else if (fieldName.equalsIgnoreCase("LINKNAME1"))
      return linkname1;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("VERSION"))
      return version;
    else if (fieldName.equalsIgnoreCase("STATUS_NAME") || fieldName.equals("statusName"))
      return statusName;
    else if (fieldName.equalsIgnoreCase("STATUS"))
      return status;
    else if (fieldName.equalsIgnoreCase("UPDATE_AVAILABLE") || fieldName.equals("updateAvailable"))
      return updateAvailable;
    else if (fieldName.equalsIgnoreCase("HELP"))
      return help;
    else if (fieldName.equalsIgnoreCase("AUTHOR"))
      return author;
    else if (fieldName.equalsIgnoreCase("URL"))
      return url;
    else if (fieldName.equalsIgnoreCase("LEVELNO"))
      return levelno;
    else if (fieldName.equalsIgnoreCase("LEVELTREE"))
      return leveltree;
    else if (fieldName.equalsIgnoreCase("ICON"))
      return icon;
    else if (fieldName.equalsIgnoreCase("ICON2"))
      return icon2;
    else if (fieldName.equalsIgnoreCase("ENDLINE"))
      return endline;
    else if (fieldName.equalsIgnoreCase("UPDATEVERSION"))
      return updateversion;
    else if (fieldName.equalsIgnoreCase("UPDATEDESCRIPTION"))
      return updatedescription;
    else if (fieldName.equalsIgnoreCase("POSITION"))
      return position;
    else if (fieldName.equalsIgnoreCase("UPDATE_VER_ID") || fieldName.equals("updateVerId"))
      return updateVerId;
    else if (fieldName.equalsIgnoreCase("STYLE"))
      return style;
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("MODULENAME"))
      return modulename;
    else if (fieldName.equalsIgnoreCase("VERSION_LABEL") || fieldName.equals("versionLabel"))
      return versionLabel;
    else if (fieldName.equalsIgnoreCase("ENABLED"))
      return enabled;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ModuleTreeData[] select(ConnectionProvider connectionProvider, String lang)    throws ServletException {
    return select(connectionProvider, lang, 0, 0);
  }

  public static ModuleTreeData[] select(ConnectionProvider connectionProvider, String lang, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT COALESCE(MI.Type, M.Type) as Type, COALESCE(MI.AD_Module_ID, M.AD_Module_ID) as Node_ID, " +
      "                (CASE WHEN MI.AD_Module_ID IS NOT NULL " +
      "                         THEN AD_Column_Identifier('AD_Module_Install',MI.AD_Module_Install_ID, ?)" +
      "                         ELSE AD_Column_Identifier('AD_Module',M.AD_Module_ID, ?) END) as Name, " +
      "                 (SELECT CASE WHEN COUNT(*)>0 THEN 'block' ELSE 'none' END" +
      "                    FROM AD_Module M2" +
      "                    WHERE M2.AD_Module_ID = M.AD_Module_ID" +
      "                    AND EXISTS" +
      "                    (SELECT 1" +
      "                            FROM AD_Module_Dependency" +
      "                           WHERE AD_Module_ID = M2.AD_Module_ID" +
      "                             AND IsIncluded = 'Y'" +
      "                           UNION" +
      "                           SELECT 1" +
      "                            FROM AD_Module_Dependency_Inst" +
      "                           WHERE AD_Module_ID = M2.AD_Module_ID" +
      "                             AND IsIncluded = 'Y'))                as display," +
      "                     '' as linkClick," +
      "                     '' as linkName," +
      "                     '' as linkClick1," +
      "                     '' as linkName1," +
      "                     '' as Description," +
      "                     COALESCE(MI.version, M.version) as Version," +
      "                     '' as Status_Name," +
      "                     M.Status," +
      "                     M.Update_Available," +
      "                     COALESCE(MI.help, M.help) as help," +
      "                     COALESCE(MI.author, M.author) as author," +
      "                     COALESCE(MI.url, M.url) as url," +
      "                     '' as levelno," +
      "                     '' as leveltree," +
      "                     '' as icon," +
      "                     '' as icon2," +
      "                     '' as endline," +
      "                     '' as updateversion," +
      "                     '' as updatedescription," +
      "                     '' as position," +
      "                     '' as UPDATE_VER_ID," +
      "                     '' as style," +
      "                     coalesce (MI.Seqno, M.SeqNo) as Seqno," +
      "                     coalesce (mi.name, m.name) as ModuleName," +
      "                     coalesce (mi.version_label, m.version_label) as version_label," +
      "                     m.enabled" +
      "           FROM AD_Module M left join AD_Module_Install MI" +
      "                                   on M.AD_Module_ID = MI.AD_Module_ID" +
      "          WHERE NOT EXISTS (SELECT 1 " +
      "                              FROM AD_Module_Dependency" +
      "                             WHERE AD_Dependent_Module_ID = M.AD_Module_ID" +
      "                               AND IsIncluded = 'Y') " +
      "            AND m.ISACTIVE = 'Y'" +
      "          UNION" +
      "          SELECT Type, AD_Module_ID as Node_ID, " +
      "                 AD_Column_Identifier('AD_Module_Install',AD_Module_Install_ID, ?) as Name, " +
      "                 (SELECT CASE WHEN COUNT(*)>0 THEN 'block' ELSE 'none' END" +
      "                    FROM AD_Module_Dependency_Inst" +
      "                   WHERE AD_Module_ID = M.AD_Module_ID" +
      "                     AND IsIncluded = 'Y')                as display," +
      "                     '' as linkClick," +
      "                     '' as linkName," +
      "                     '' as linkClick1," +
      "                     '' as linkName1," +
      "                     '' as Description," +
      "                     m.Version," +
      "                     '' as Status_Name," +
      "                     M.Status," +
      "                     M.Update_Available," +
      "                     M.help," +
      "                     M.author," +
      "                     M.url," +
      "                     '' as levelno," +
      "                     '' as leveltree," +
      "                     '' as icon," +
      "                     '' as icon2," +
      "                     '' as endline," +
      "                     '' as updateversion," +
      "                     '' as updatedescription," +
      "                     '' as position," +
      "                     '' as UPDATE_VER_ID," +
      "                     '' as style," +
      "                     Seqno," +
      "                     m.name as ModuleName," +
      "                     m.version_label," +
      "                     'Y' as enabled" +
      "           FROM AD_Module_Install M " +
      "          WHERE NOT EXISTS (SELECT 1 " +
      "                              FROM AD_Module_Dependency_Inst" +
      "                             WHERE AD_Dependent_Module_ID = M.AD_Module_ID" +
      "                               AND IsIncluded = 'Y') " +
      "            AND NOT EXISTS (SELECT 1 " +
      "                               FROM AD_MODULE" +
      "                              WHERE AD_Module_ID = M.AD_Module_ID)" +
      "            AND ISACTIVE = 'Y'" +
      "            order by Seqno, name";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);

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
        ModuleTreeData objectModuleTreeData = new ModuleTreeData();
        objectModuleTreeData.type = UtilSql.getValue(result, "TYPE");
        objectModuleTreeData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectModuleTreeData.name = UtilSql.getValue(result, "NAME");
        objectModuleTreeData.display = UtilSql.getValue(result, "DISPLAY");
        objectModuleTreeData.linkclick = UtilSql.getValue(result, "LINKCLICK");
        objectModuleTreeData.linkname = UtilSql.getValue(result, "LINKNAME");
        objectModuleTreeData.linkclick1 = UtilSql.getValue(result, "LINKCLICK1");
        objectModuleTreeData.linkname1 = UtilSql.getValue(result, "LINKNAME1");
        objectModuleTreeData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectModuleTreeData.version = UtilSql.getValue(result, "VERSION");
        objectModuleTreeData.statusName = UtilSql.getValue(result, "STATUS_NAME");
        objectModuleTreeData.status = UtilSql.getValue(result, "STATUS");
        objectModuleTreeData.updateAvailable = UtilSql.getValue(result, "UPDATE_AVAILABLE");
        objectModuleTreeData.help = UtilSql.getValue(result, "HELP");
        objectModuleTreeData.author = UtilSql.getValue(result, "AUTHOR");
        objectModuleTreeData.url = UtilSql.getValue(result, "URL");
        objectModuleTreeData.levelno = UtilSql.getValue(result, "LEVELNO");
        objectModuleTreeData.leveltree = UtilSql.getValue(result, "LEVELTREE");
        objectModuleTreeData.icon = UtilSql.getValue(result, "ICON");
        objectModuleTreeData.icon2 = UtilSql.getValue(result, "ICON2");
        objectModuleTreeData.endline = UtilSql.getValue(result, "ENDLINE");
        objectModuleTreeData.updateversion = UtilSql.getValue(result, "UPDATEVERSION");
        objectModuleTreeData.updatedescription = UtilSql.getValue(result, "UPDATEDESCRIPTION");
        objectModuleTreeData.position = UtilSql.getValue(result, "POSITION");
        objectModuleTreeData.updateVerId = UtilSql.getValue(result, "UPDATE_VER_ID");
        objectModuleTreeData.style = UtilSql.getValue(result, "STYLE");
        objectModuleTreeData.seqno = UtilSql.getValue(result, "SEQNO");
        objectModuleTreeData.modulename = UtilSql.getValue(result, "MODULENAME");
        objectModuleTreeData.versionLabel = UtilSql.getValue(result, "VERSION_LABEL");
        objectModuleTreeData.enabled = UtilSql.getValue(result, "ENABLED");
        objectModuleTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectModuleTreeData);
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
    ModuleTreeData objectModuleTreeData[] = new ModuleTreeData[vector.size()];
    vector.copyInto(objectModuleTreeData);
    return(objectModuleTreeData);
  }

  public static ModuleTreeData[] selectSubTree(ConnectionProvider connectionProvider, String lang, String rootNode)    throws ServletException {
    return selectSubTree(connectionProvider, lang, rootNode, 0, 0);
  }

  public static ModuleTreeData[] selectSubTree(ConnectionProvider connectionProvider, String lang, String rootNode, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT M.Type, M.AD_Module_ID as Node_ID, " +
      "                 (CASE WHEN MI.AD_MODULE_ID IS NULL " +
      "                                      THEN AD_Column_Identifier('AD_Module',m.AD_Module_ID, ?)" +
      "                                      ELSE AD_Column_Identifier('AD_Module_Install',MI.AD_Module_Install_ID, ?) END )as Name, " +
      "                 (SELECT CASE WHEN COUNT(*)>0 THEN 'block' ELSE 'none' END" +
      "                    FROM AD_Module M2" +
      "                    WHERE M2.AD_Module_ID = M.AD_Module_ID" +
      "                    AND EXISTS" +
      "                    (SELECT 1" +
      "                            FROM AD_Module_Dependency" +
      "                           WHERE AD_Module_ID = M2.AD_Module_ID" +
      "                             AND IsIncluded = 'Y'" +
      "                           UNION" +
      "                           SELECT 1" +
      "                            FROM AD_Module_Dependency_Inst" +
      "                           WHERE AD_Module_ID = M2.AD_Module_ID" +
      "                             AND IsIncluded = 'Y'))                as display," +
      "                     m.Status," +
      "                     m.Update_Available," +
      "                     coalesce(MI.version, M.version) as Version," +
      "                     coalesce(mi.name, m.name) as moduleName," +
      "                     coalesce(mi.version_label, m.version_label) as version_label," +
      "                     m.enabled," +
      "                     COALESCE(MI.author, M.author) as author" +
      "            FROM AD_MODULE M LEFT JOIN AD_MODULE_INSTALL MI" +
      "                                    ON MI.AD_MODULE_ID = M.AD_MODULE_ID" +
      "           WHERE EXISTS (SELECT 1 " +
      "                           FROM AD_Module_Dependency " +
      "                          WHERE AD_Module_ID = ?" +
      "                            AND AD_Dependent_Module_ID = M.AD_Module_ID" +
      "                            AND IsIncluded = 'Y'" +
      "                          UNION" +
      "                          SELECT 1 " +
      "                           FROM AD_Module_Dependency_Inst" +
      "                          WHERE AD_Module_ID = ?" +
      "                            AND AD_Dependent_Module_ID = M.AD_Module_ID" +
      "                            AND IsIncluded = 'Y')" +
      "             AND M.ISACTIVE = 'Y'" +
      "            UNION" +
      "             SELECT Type, AD_Module_ID as Node_ID, AD_Column_Identifier('AD_Module_Install',AD_Module_Install_ID, ?) as Name, " +
      "                 (SELECT CASE WHEN COUNT(*)>0 THEN 'block' ELSE 'none' END" +
      "                    FROM AD_Module_Dependency" +
      "                   WHERE AD_Module_ID = M.AD_Module_ID" +
      "                     AND IsIncluded = 'Y')                as display," +
      "                     Status," +
      "                     Update_Available," +
      "                     m.version," +
      "                     m.name as moduleName," +
      "                     m.version_label," +
      "                     'Y' as enabled," +
      "                     m.author" +
      "            FROM AD_MODULE_Install M" +
      "           WHERE EXISTS (SELECT 1 " +
      "                           FROM AD_Module_Dependency_Inst " +
      "                          WHERE AD_Module_ID = ?" +
      "                            AND AD_Dependent_Module_ID = M.AD_Module_ID" +
      "                            AND IsIncluded = 'Y')" +
      "             AND NOT EXISTS (SELECT 1" +
      "                               FROM AD_MODULE" +
      "                              WHERE AD_Module_ID = M.AD_Module_ID)" +
      "             AND ISACTIVE = 'Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rootNode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rootNode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rootNode);

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
        ModuleTreeData objectModuleTreeData = new ModuleTreeData();
        objectModuleTreeData.type = UtilSql.getValue(result, "TYPE");
        objectModuleTreeData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectModuleTreeData.name = UtilSql.getValue(result, "NAME");
        objectModuleTreeData.display = UtilSql.getValue(result, "DISPLAY");
        objectModuleTreeData.status = UtilSql.getValue(result, "STATUS");
        objectModuleTreeData.updateAvailable = UtilSql.getValue(result, "UPDATE_AVAILABLE");
        objectModuleTreeData.version = UtilSql.getValue(result, "VERSION");
        objectModuleTreeData.modulename = UtilSql.getValue(result, "MODULENAME");
        objectModuleTreeData.versionLabel = UtilSql.getValue(result, "VERSION_LABEL");
        objectModuleTreeData.enabled = UtilSql.getValue(result, "ENABLED");
        objectModuleTreeData.author = UtilSql.getValue(result, "AUTHOR");
        objectModuleTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectModuleTreeData);
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
    ModuleTreeData objectModuleTreeData[] = new ModuleTreeData[vector.size()];
    vector.copyInto(objectModuleTreeData);
    return(objectModuleTreeData);
  }

  public static ModuleTreeData[] selectDescription(ConnectionProvider connectionProvider, String lang, String node)    throws ServletException {
    return selectDescription(connectionProvider, lang, node, 0, 0);
  }

  public static ModuleTreeData[] selectDescription(ConnectionProvider connectionProvider, String lang, String node, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT COALESCE(MI.Name, M.Name) as Name," +
      "                 M.Version || (CASE WHEN MI.Version IS NULL " +
      "                                            THEN ''" +
      "                                            ELSE ' -> '||MI.Version END) as Version," +
      "                 COALESCE(MI.Description, T.Description, M.Description) as Description," +
      "                 COALESCE(MI.help, T.help, M.Help) as Help," +
      "                 COALESCE(MI.Author, M.author) as author," +
      "                 COALESCE(MI.url, M.url) as url," +
      "                 COALESCE(MI.status, M.status) as status," +
      "                 M.Update_Available," +
      "                 M.AD_Module_ID as Node_ID," +
      "                 COALESCE(RT.Name, R.Name) as Status_Name," +
      "                 COALESCE(T.UpdateInfo, M.UpdateInfo) as UpdateDescription," +
      "                 M.UPDATE_AVAILABLE as UpdateVersion," +
      "                 M.UPDATE_VER_ID" +
      "            FROM AD_MODULE M LEFT JOIN AD_MODULE_TRL T " +
      "                                     ON T.AD_Module_ID = M.AD_Module_ID" +
      "                                    AND T.AD_Language = ?" +
      "                              LEFT JOIN AD_MODULE_INSTALL MI" +
      "                                     ON MI.AD_MODULE_ID = M.AD_MODULE_ID," +
      "                 AD_REF_LIST R LEFT JOIN AD_REF_LIST_TRL RT" +
      "                                     ON RT.AD_Ref_List_ID = R.AD_Ref_list_ID" +
      "                                     AND RT.AD_Language = ? " +
      "           WHERE M.AD_Module_ID = ?" +
      "             AND R.AD_REFERENCE_ID = '725CD8C6882C40AFB4D1C27B1AEF8BB4'" +
      "             AND R.Value = M.Status" +
      "           UNION" +
      "           SELECT M.Name as Name," +
      "                 M.Version ," +
      "                 M.Description," +
      "                 M.Help," +
      "                 M.author," +
      "                 M.url," +
      "                 M.status," +
      "                 M.Update_Available," +
      "                 M.AD_Module_ID as Node_ID," +
      "                 COALESCE(RT.Name, R.Name) as Status_Name," +
      "                 m.UpdateInfo," +
      "                 M.UPDATE_AVAILABLE as UpdateVersion," +
      "                 M.UPDATE_VER_ID" +
      "            FROM AD_MODULE_INSTALL M," +
      "                 AD_REF_LIST R LEFT JOIN AD_REF_LIST_TRL RT" +
      "                                     ON RT.AD_Ref_List_ID = R.AD_Ref_list_ID" +
      "                                     AND RT.AD_Language = ? " +
      "           WHERE M.AD_Module_ID = ?" +
      "             AND R.AD_REFERENCE_ID = '725CD8C6882C40AFB4D1C27B1AEF8BB4'" +
      "             AND R.Value = M.Status";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, node);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, node);

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
        ModuleTreeData objectModuleTreeData = new ModuleTreeData();
        objectModuleTreeData.name = UtilSql.getValue(result, "NAME");
        objectModuleTreeData.version = UtilSql.getValue(result, "VERSION");
        objectModuleTreeData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectModuleTreeData.help = UtilSql.getValue(result, "HELP");
        objectModuleTreeData.author = UtilSql.getValue(result, "AUTHOR");
        objectModuleTreeData.url = UtilSql.getValue(result, "URL");
        objectModuleTreeData.status = UtilSql.getValue(result, "STATUS");
        objectModuleTreeData.updateAvailable = UtilSql.getValue(result, "UPDATE_AVAILABLE");
        objectModuleTreeData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectModuleTreeData.statusName = UtilSql.getValue(result, "STATUS_NAME");
        objectModuleTreeData.updatedescription = UtilSql.getValue(result, "UPDATEDESCRIPTION");
        objectModuleTreeData.updateversion = UtilSql.getValue(result, "UPDATEVERSION");
        objectModuleTreeData.updateVerId = UtilSql.getValue(result, "UPDATE_VER_ID");
        objectModuleTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectModuleTreeData);
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
    ModuleTreeData objectModuleTreeData[] = new ModuleTreeData[vector.size()];
    vector.copyInto(objectModuleTreeData);
    return(objectModuleTreeData);
  }

  public static ModuleTreeData[] selectUpdateDescription(ConnectionProvider connectionProvider, String lang, String node)    throws ServletException {
    return selectUpdateDescription(connectionProvider, lang, node, 0, 0);
  }

  public static ModuleTreeData[] selectUpdateDescription(ConnectionProvider connectionProvider, String lang, String node, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT COALESCE(T.UpdateInfo, M.UpdateInfo) as description," +
      "                 UPDATE_AVAILABLE as Version," +
      "                 M.AD_Module_ID as Node_ID" +
      "            FROM AD_MODULE M LEFT JOIN AD_MODULE_TRL T" +
      "                                    ON T.AD_Module_ID = M.AD_Module_ID" +
      "                                   AND T.AD_Language = ?" +
      "           WHERE M.AD_Module_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, node);

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
        ModuleTreeData objectModuleTreeData = new ModuleTreeData();
        objectModuleTreeData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectModuleTreeData.version = UtilSql.getValue(result, "VERSION");
        objectModuleTreeData.nodeId = UtilSql.getValue(result, "NODE_ID");
        objectModuleTreeData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectModuleTreeData);
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
    ModuleTreeData objectModuleTreeData[] = new ModuleTreeData[vector.size()];
    vector.copyInto(objectModuleTreeData);
    return(objectModuleTreeData);
  }

  public static String selectParent(ConnectionProvider connectionProvider, String node)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT MAX(AD_Module_ID) as Node_ID" +
      "            FROM AD_MODULE_DEPENDENCY" +
      "           WHERE AD_Dependent_Module_ID = ?" +
      "             AND IsIncluded = 'Y'" +
      "           UNION" +
      "          SELECT MAX(AD_Module_ID) as Node_ID" +
      "            FROM AD_MODULE_DEPENDENCY_INST" +
      "           WHERE AD_Dependent_Module_ID = ?" +
      "             AND IsIncluded = 'Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, node);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, node);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NODE_ID");
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
