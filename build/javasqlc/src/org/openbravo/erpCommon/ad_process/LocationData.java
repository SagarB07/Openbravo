//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_process;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class LocationData implements FieldProvider {
static Logger log4j = Logger.getLogger(LocationData.class);
  private String InitRecordNumber="0";
  public String cLocationId;
  public String address1;
  public String address2;
  public String city;
  public String postal;
  public String cRegionId;
  public String cCountryId;
  public String adClientId;
  public String adOrgId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_LOCATION_ID") || fieldName.equals("cLocationId"))
      return cLocationId;
    else if (fieldName.equalsIgnoreCase("ADDRESS1"))
      return address1;
    else if (fieldName.equalsIgnoreCase("ADDRESS2"))
      return address2;
    else if (fieldName.equalsIgnoreCase("CITY"))
      return city;
    else if (fieldName.equalsIgnoreCase("POSTAL"))
      return postal;
    else if (fieldName.equalsIgnoreCase("C_REGION_ID") || fieldName.equals("cRegionId"))
      return cRegionId;
    else if (fieldName.equalsIgnoreCase("C_COUNTRY_ID") || fieldName.equals("cCountryId"))
      return cCountryId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static LocationData[] select(ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    return select(connectionProvider, ad_client_id, 0, 0);
  }

  public static LocationData[] select(ConnectionProvider connectionProvider, String ad_client_id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_Location_ID, Address1, Address2, City, Postal, C_Region_ID, C_Country_ID," +
      "				AD_Client_ID, AD_Org_ID" +
      "			  FROM C_Location" +
      "			  WHERE AD_Client_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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
        LocationData objectLocationData = new LocationData();
        objectLocationData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectLocationData.address1 = UtilSql.getValue(result, "ADDRESS1");
        objectLocationData.address2 = UtilSql.getValue(result, "ADDRESS2");
        objectLocationData.city = UtilSql.getValue(result, "CITY");
        objectLocationData.postal = UtilSql.getValue(result, "POSTAL");
        objectLocationData.cRegionId = UtilSql.getValue(result, "C_REGION_ID");
        objectLocationData.cCountryId = UtilSql.getValue(result, "C_COUNTRY_ID");
        objectLocationData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectLocationData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectLocationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectLocationData);
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
    LocationData objectLocationData[] = new LocationData[vector.size()];
    vector.copyInto(objectLocationData);
    return(objectLocationData);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  INSERT INTO C_Location (C_Location_ID, AD_Client_ID, AD_Org_ID, isActive, Created, CreatedBy, Updated, UpdatedBy," +
      "				Address1, Address2, City, Postal, C_Region_ID, C_Country_ID)" +
      "					VALUES (?, ?, ?, 'Y', now(), ?, now(), ?, ?, ?, ?, ?, ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, address1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, address2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, city);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, postal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cRegionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCountryId);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }
}
