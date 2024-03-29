//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class OrganizationData implements FieldProvider {
static Logger log4j = Logger.getLogger(OrganizationData.class);
  private String InitRecordNumber="0";
  public String padre;
  public String id;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PADRE"))
      return padre;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static OrganizationData[] selectLogin(ConnectionProvider connectionProvider)    throws ServletException {
    return selectLogin(connectionProvider, 0, 0);
  }

  public static OrganizationData[] selectLogin(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT A_R_O.AD_ROLE_ID AS PADRE, A_O.AD_ORG_ID AS ID, A_O.NAME" +
      "        FROM AD_ORG A_O, AD_ROLE_ORGACCESS A_R_O, AD_ROLE R " +
      "        WHERE A_R_O.AD_ORG_ID = A_O.AD_ORG_ID " +
      "        AND A_R_O.ISACTIVE = 'Y' " +
      "        AND A_R_O.AD_ROLE_ID = R.AD_ROLE_ID " +
      "        AND R.ISACTIVE = 'Y' " +
      "        ORDER BY A_R_O.AD_ROLE_ID, A_O.NAME";

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
        OrganizationData objectOrganizationData = new OrganizationData();
        objectOrganizationData.padre = UtilSql.getValue(result, "PADRE");
        objectOrganizationData.id = UtilSql.getValue(result, "ID");
        objectOrganizationData.name = UtilSql.getValue(result, "NAME");
        objectOrganizationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrganizationData);
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
    OrganizationData objectOrganizationData[] = new OrganizationData[vector.size()];
    vector.copyInto(objectOrganizationData);
    return(objectOrganizationData);
  }
}
