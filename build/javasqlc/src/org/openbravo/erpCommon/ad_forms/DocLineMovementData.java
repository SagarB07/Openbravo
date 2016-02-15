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

class DocLineMovementData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocLineMovementData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String mProductId;
  public String line;
  public String description;
  public String cUomId;
  public String mMovementlineId;
  public String mLocatorId;
  public String mLocatortoId;
  public String movementqty;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("M_MOVEMENTLINE_ID") || fieldName.equals("mMovementlineId"))
      return mMovementlineId;
    else if (fieldName.equalsIgnoreCase("M_LOCATOR_ID") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("M_LOCATORTO_ID") || fieldName.equals("mLocatortoId"))
      return mLocatortoId;
    else if (fieldName.equalsIgnoreCase("MOVEMENTQTY"))
      return movementqty;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocLineMovementData[] select(ConnectionProvider connectionProvider, String M_Movement_ID)    throws ServletException {
    return select(connectionProvider, M_Movement_ID, 0, 0);
  }

  public static DocLineMovementData[] select(ConnectionProvider connectionProvider, String M_Movement_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT ML.AD_ORG_ID, ML.M_PRODUCT_ID, ML.LINE, ML.DESCRIPTION," +
      "          ML.C_UOM_ID, ML.M_MOVEMENTLINE_ID, ML.M_LOCATOR_ID, ML.M_LOCATORTO_ID," +
      "          ML.MOVEMENTQTY" +
      "          FROM M_MOVEMENTLINE ML WHERE M_MOVEMENT_ID=? ORDER BY LINE";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Movement_ID);

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
        DocLineMovementData objectDocLineMovementData = new DocLineMovementData();
        objectDocLineMovementData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocLineMovementData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocLineMovementData.line = UtilSql.getValue(result, "LINE");
        objectDocLineMovementData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocLineMovementData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocLineMovementData.mMovementlineId = UtilSql.getValue(result, "M_MOVEMENTLINE_ID");
        objectDocLineMovementData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectDocLineMovementData.mLocatortoId = UtilSql.getValue(result, "M_LOCATORTO_ID");
        objectDocLineMovementData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectDocLineMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineMovementData);
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
    DocLineMovementData objectDocLineMovementData[] = new DocLineMovementData[vector.size()];
    vector.copyInto(objectDocLineMovementData);
    return(objectDocLineMovementData);
  }
}
