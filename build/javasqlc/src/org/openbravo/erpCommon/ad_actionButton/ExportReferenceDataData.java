//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_actionButton;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class ExportReferenceDataData implements FieldProvider {
static Logger log4j = Logger.getLogger(ExportReferenceDataData.class);
  private String InitRecordNumber="0";
  public String adDatasetId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String value;
  public String name;
  public String description;
  public String adModuleId;
  public String export;
  public String javapackage;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_DATASET_ID") || fieldName.equals("adDatasetId"))
      return adDatasetId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBY"))
      return createdby;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("AD_MODULE_ID") || fieldName.equals("adModuleId"))
      return adModuleId;
    else if (fieldName.equalsIgnoreCase("EXPORT"))
      return export;
    else if (fieldName.equalsIgnoreCase("JAVAPACKAGE"))
      return javapackage;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ExportReferenceDataData[] selectDataset(ConnectionProvider connectionProvider, String key)    throws ServletException {
    return selectDataset(connectionProvider, key, 0, 0);
  }

  public static ExportReferenceDataData[] selectDataset(ConnectionProvider connectionProvider, String key, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_DATASET_ID, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY, VALUE, NAME, DESCRIPTION, AD_MODULE_ID, " +
      "        EXPORT, '' AS JAVAPACKAGE" +
      "        FROM AD_DATASET" +
      "        WHERE AD_DATASET_ID = ?" +
      "        AND EXPORTALLOWED = 'Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

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
        ExportReferenceDataData objectExportReferenceDataData = new ExportReferenceDataData();
        objectExportReferenceDataData.adDatasetId = UtilSql.getValue(result, "AD_DATASET_ID");
        objectExportReferenceDataData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectExportReferenceDataData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectExportReferenceDataData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectExportReferenceDataData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectExportReferenceDataData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectExportReferenceDataData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectExportReferenceDataData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectExportReferenceDataData.value = UtilSql.getValue(result, "VALUE");
        objectExportReferenceDataData.name = UtilSql.getValue(result, "NAME");
        objectExportReferenceDataData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectExportReferenceDataData.adModuleId = UtilSql.getValue(result, "AD_MODULE_ID");
        objectExportReferenceDataData.export = UtilSql.getValue(result, "EXPORT");
        objectExportReferenceDataData.javapackage = UtilSql.getValue(result, "JAVAPACKAGE");
        objectExportReferenceDataData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectExportReferenceDataData);
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
    ExportReferenceDataData objectExportReferenceDataData[] = new ExportReferenceDataData[vector.size()];
    vector.copyInto(objectExportReferenceDataData);
    return(objectExportReferenceDataData);
  }

  public static ExportReferenceDataData[] selectModule(ConnectionProvider connectionProvider, String key)    throws ServletException {
    return selectModule(connectionProvider, key, 0, 0);
  }

  public static ExportReferenceDataData[] selectModule(ConnectionProvider connectionProvider, String key, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT JAVAPACKAGE" +
      "        FROM AD_MODULE" +
      "        WHERE AD_MODULE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

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
        ExportReferenceDataData objectExportReferenceDataData = new ExportReferenceDataData();
        objectExportReferenceDataData.javapackage = UtilSql.getValue(result, "JAVAPACKAGE");
        objectExportReferenceDataData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectExportReferenceDataData);
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
    ExportReferenceDataData objectExportReferenceDataData[] = new ExportReferenceDataData[vector.size()];
    vector.copyInto(objectExportReferenceDataData);
    return(objectExportReferenceDataData);
  }
}
