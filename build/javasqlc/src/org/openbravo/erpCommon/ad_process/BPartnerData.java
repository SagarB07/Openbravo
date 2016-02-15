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

class BPartnerData implements FieldProvider {
static Logger log4j = Logger.getLogger(BPartnerData.class);
  private String InitRecordNumber="0";
  public String cBpartnerId;
  public String cBpartnerLocationId;
  public String addr;
  public String adUserId;
  public String contactname;
  public String adClientId;
  public String adOrgId;
  public String value;
  public String iBpartnerId;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("ADDR"))
      return addr;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("CONTACTNAME"))
      return contactname;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("I_BPARTNER_ID") || fieldName.equals("iBpartnerId"))
      return iBpartnerId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static BPartnerData[] select(ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    return select(connectionProvider, ad_client_id, 0, 0);
  }

  public static BPartnerData[] select(ConnectionProvider connectionProvider, String ad_client_id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_BPartner_ID, C_BPartner_Location_ID," +
      "        COALESCE (Address1,Address2,City) AS Addr, AD_User_ID, ContactName," +
      "				AD_Client_ID, AD_Org_ID, Value, I_BPartner_ID, Name" +
      "			  FROM I_BPartner" +
      "			  WHERE I_IsImported='N'" +
      "        AND AD_Client_ID = ?";

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
        BPartnerData objectBPartnerData = new BPartnerData();
        objectBPartnerData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectBPartnerData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectBPartnerData.addr = UtilSql.getValue(result, "ADDR");
        objectBPartnerData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectBPartnerData.contactname = UtilSql.getValue(result, "CONTACTNAME");
        objectBPartnerData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectBPartnerData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectBPartnerData.value = UtilSql.getValue(result, "VALUE");
        objectBPartnerData.iBpartnerId = UtilSql.getValue(result, "I_BPARTNER_ID");
        objectBPartnerData.name = UtilSql.getValue(result, "NAME");
        objectBPartnerData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBPartnerData);
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
    BPartnerData objectBPartnerData[] = new BPartnerData[vector.size()];
    vector.copyInto(objectBPartnerData);
    return(objectBPartnerData);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  INSERT INTO C_BPartner (C_BPartner_ID, AD_Client_ID, AD_Org_ID," +
      "          IsActive,Created,CreatedBy,Updated,UpdatedBy,Value, Name, C_BP_Group_ID)" +
      "					VALUES (?, ?, ?, 'Y', now(), ?, now(), ?, ?, ?, (SELECT min(C_BP_Group_ID) FROM C_BP_Group WHERE IsDefault='Y' AND AD_Client_ID=?))";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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
