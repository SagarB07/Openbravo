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

class VersionUtilityData implements FieldProvider {
static Logger log4j = Logger.getLogger(VersionUtilityData.class);
  private String InitRecordNumber="0";
  public String adModuleId;
  public String name;
  public String version;
  public String type;
  public String adModuleDependencyId;
  public String adDependentModuleId;
  public String dependantModuleName;
  public String startversion;
  public String endversion;
  public String dependencyEnforcement;
  public String userEditableEnforcement;
  public String instanceEnforcement;
  public String installed;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_MODULE_ID") || fieldName.equals("adModuleId"))
      return adModuleId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("VERSION"))
      return version;
    else if (fieldName.equalsIgnoreCase("TYPE"))
      return type;
    else if (fieldName.equalsIgnoreCase("AD_MODULE_DEPENDENCY_ID") || fieldName.equals("adModuleDependencyId"))
      return adModuleDependencyId;
    else if (fieldName.equalsIgnoreCase("AD_DEPENDENT_MODULE_ID") || fieldName.equals("adDependentModuleId"))
      return adDependentModuleId;
    else if (fieldName.equalsIgnoreCase("DEPENDANT_MODULE_NAME") || fieldName.equals("dependantModuleName"))
      return dependantModuleName;
    else if (fieldName.equalsIgnoreCase("STARTVERSION"))
      return startversion;
    else if (fieldName.equalsIgnoreCase("ENDVERSION"))
      return endversion;
    else if (fieldName.equalsIgnoreCase("DEPENDENCY_ENFORCEMENT") || fieldName.equals("dependencyEnforcement"))
      return dependencyEnforcement;
    else if (fieldName.equalsIgnoreCase("USER_EDITABLE_ENFORCEMENT") || fieldName.equals("userEditableEnforcement"))
      return userEditableEnforcement;
    else if (fieldName.equalsIgnoreCase("INSTANCE_ENFORCEMENT") || fieldName.equals("instanceEnforcement"))
      return instanceEnforcement;
    else if (fieldName.equalsIgnoreCase("INSTALLED"))
      return installed;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static VersionUtilityData[] dummy(ConnectionProvider connectionProvider)    throws ServletException {
    return dummy(connectionProvider, 0, 0);
  }

  public static VersionUtilityData[] dummy(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select '' as ad_module_id, '' as name, '' as version, '' as type," +
      "          '' as ad_module_dependency_id, '' as ad_dependent_module_id, '' as dependant_module_name, '' as startVersion, '' as endVersion," +
      "          '' as dependency_enforcement, '' as user_editable_enforcement, '' as instance_enforcement, '' as installed" +
      "        from dual";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        VersionUtilityData objectVersionUtilityData = new VersionUtilityData();
        objectVersionUtilityData.adModuleId = UtilSql.getValue(result, "AD_MODULE_ID");
        objectVersionUtilityData.name = UtilSql.getValue(result, "NAME");
        objectVersionUtilityData.version = UtilSql.getValue(result, "VERSION");
        objectVersionUtilityData.type = UtilSql.getValue(result, "TYPE");
        objectVersionUtilityData.adModuleDependencyId = UtilSql.getValue(result, "AD_MODULE_DEPENDENCY_ID");
        objectVersionUtilityData.adDependentModuleId = UtilSql.getValue(result, "AD_DEPENDENT_MODULE_ID");
        objectVersionUtilityData.dependantModuleName = UtilSql.getValue(result, "DEPENDANT_MODULE_NAME");
        objectVersionUtilityData.startversion = UtilSql.getValue(result, "STARTVERSION");
        objectVersionUtilityData.endversion = UtilSql.getValue(result, "ENDVERSION");
        objectVersionUtilityData.dependencyEnforcement = UtilSql.getValue(result, "DEPENDENCY_ENFORCEMENT");
        objectVersionUtilityData.userEditableEnforcement = UtilSql.getValue(result, "USER_EDITABLE_ENFORCEMENT");
        objectVersionUtilityData.instanceEnforcement = UtilSql.getValue(result, "INSTANCE_ENFORCEMENT");
        objectVersionUtilityData.installed = UtilSql.getValue(result, "INSTALLED");
        objectVersionUtilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectVersionUtilityData);
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
    VersionUtilityData objectVersionUtilityData[] = new VersionUtilityData[vector.size()];
    vector.copyInto(objectVersionUtilityData);
    return(objectVersionUtilityData);
  }

  public static VersionUtilityData[] readModules(ConnectionProvider connectionProvider)    throws ServletException {
    return readModules(connectionProvider, 0, 0);
  }

  public static VersionUtilityData[] readModules(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select m.ad_module_id, m.name, m.version, m.type, 'Y' as installed" +
      "        from ad_module m" +
      "        union" +
      "        select m.ad_module_id, m.name, m.version, m.type, 'N'" +
      "        from ad_module_install m" +
      "        order by installed desc, ad_module_id";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        VersionUtilityData objectVersionUtilityData = new VersionUtilityData();
        objectVersionUtilityData.adModuleId = UtilSql.getValue(result, "AD_MODULE_ID");
        objectVersionUtilityData.name = UtilSql.getValue(result, "NAME");
        objectVersionUtilityData.version = UtilSql.getValue(result, "VERSION");
        objectVersionUtilityData.type = UtilSql.getValue(result, "TYPE");
        objectVersionUtilityData.installed = UtilSql.getValue(result, "INSTALLED");
        objectVersionUtilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectVersionUtilityData);
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
    VersionUtilityData objectVersionUtilityData[] = new VersionUtilityData[vector.size()];
    vector.copyInto(objectVersionUtilityData);
    return(objectVersionUtilityData);
  }

  public static VersionUtilityData[] readDependencies(ConnectionProvider connectionProvider, String ad_module_id, String included)    throws ServletException {
    return readDependencies(connectionProvider, ad_module_id, included, 0, 0);
  }

  public static VersionUtilityData[] readDependencies(ConnectionProvider connectionProvider, String ad_module_id, String included, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select ad_module_dependency_id," +
      "          ad_dependent_module_id," +
      "          dependant_module_name," +
      "          startVersion, endVersion, " +
      "          dependency_enforcement, user_editable_enforcement, instance_enforcement" +
      "        from ad_module_dependency" +
      "        where ad_module_id = ?" +
      "        and isIncluded = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_module_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, included);

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
        VersionUtilityData objectVersionUtilityData = new VersionUtilityData();
        objectVersionUtilityData.adModuleDependencyId = UtilSql.getValue(result, "AD_MODULE_DEPENDENCY_ID");
        objectVersionUtilityData.adDependentModuleId = UtilSql.getValue(result, "AD_DEPENDENT_MODULE_ID");
        objectVersionUtilityData.dependantModuleName = UtilSql.getValue(result, "DEPENDANT_MODULE_NAME");
        objectVersionUtilityData.startversion = UtilSql.getValue(result, "STARTVERSION");
        objectVersionUtilityData.endversion = UtilSql.getValue(result, "ENDVERSION");
        objectVersionUtilityData.dependencyEnforcement = UtilSql.getValue(result, "DEPENDENCY_ENFORCEMENT");
        objectVersionUtilityData.userEditableEnforcement = UtilSql.getValue(result, "USER_EDITABLE_ENFORCEMENT");
        objectVersionUtilityData.instanceEnforcement = UtilSql.getValue(result, "INSTANCE_ENFORCEMENT");
        objectVersionUtilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectVersionUtilityData);
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
    VersionUtilityData objectVersionUtilityData[] = new VersionUtilityData[vector.size()];
    vector.copyInto(objectVersionUtilityData);
    return(objectVersionUtilityData);
  }

  public static VersionUtilityData[] readDependenciesToInstall(ConnectionProvider connectionProvider, String ad_module_id, String included)    throws ServletException {
    return readDependenciesToInstall(connectionProvider, ad_module_id, included, 0, 0);
  }

  public static VersionUtilityData[] readDependenciesToInstall(ConnectionProvider connectionProvider, String ad_module_id, String included, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select ad_module_dependency_id," +
      "          ad_dependent_module_id," +
      "          dependant_module_name," +
      "          startVersion, endVersion, " +
      "          dependency_enforcement, user_editable_enforcement, " +
      "          (select max(instance_enforcement) " +
      "             from ad_module_dependency d " +
      "            where d.ad_dependent_module_id = i.ad_dependent_module_id " +
      "              and d.ad_module_id=i.ad_module_id) as instance_enforcement" +
      "        from ad_module_dependency_inst i " +
      "       where ad_module_id = ?" +
      "         and isIncluded = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_module_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, included);

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
        VersionUtilityData objectVersionUtilityData = new VersionUtilityData();
        objectVersionUtilityData.adModuleDependencyId = UtilSql.getValue(result, "AD_MODULE_DEPENDENCY_ID");
        objectVersionUtilityData.adDependentModuleId = UtilSql.getValue(result, "AD_DEPENDENT_MODULE_ID");
        objectVersionUtilityData.dependantModuleName = UtilSql.getValue(result, "DEPENDANT_MODULE_NAME");
        objectVersionUtilityData.startversion = UtilSql.getValue(result, "STARTVERSION");
        objectVersionUtilityData.endversion = UtilSql.getValue(result, "ENDVERSION");
        objectVersionUtilityData.dependencyEnforcement = UtilSql.getValue(result, "DEPENDENCY_ENFORCEMENT");
        objectVersionUtilityData.userEditableEnforcement = UtilSql.getValue(result, "USER_EDITABLE_ENFORCEMENT");
        objectVersionUtilityData.instanceEnforcement = UtilSql.getValue(result, "INSTANCE_ENFORCEMENT");
        objectVersionUtilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectVersionUtilityData);
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
    VersionUtilityData objectVersionUtilityData[] = new VersionUtilityData[vector.size()];
    vector.copyInto(objectVersionUtilityData);
    return(objectVersionUtilityData);
  }
}
