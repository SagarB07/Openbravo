//Sqlc generated V1.O00-1
package com.gai.asset.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class GasGetPOData implements FieldProvider {
static Logger log4j = Logger.getLogger(GasGetPOData.class);
  private String InitRecordNumber="0";
  public String product;
  public String tanggal;
  public String assetvalue;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PRODUCT"))
      return product;
    else if (fieldName.equalsIgnoreCase("TANGGAL"))
      return tanggal;
    else if (fieldName.equalsIgnoreCase("ASSETVALUE"))
      return assetvalue;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static GasGetPOData[] select(ConnectionProvider connectionProvider, String cOrderlineId)    throws ServletException {
    return select(connectionProvider, cOrderlineId, 0, 0);
  }

  public static GasGetPOData[] select(ConnectionProvider connectionProvider, String cOrderlineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT col.M_PRODUCT_ID AS product, co.DATEORDERED AS tanggal, col.LINENETAMT as assetvalue " +
      "		FROM C_ORDERLINE col " +
      "		LEFT JOIN C_ORDER CO ON CO.C_ORDER_ID = COL.C_ORDER_ID" +
      "		where COL.C_ORDERLINE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);

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
        GasGetPOData objectGasGetPOData = new GasGetPOData();
        objectGasGetPOData.product = UtilSql.getValue(result, "PRODUCT");
        objectGasGetPOData.tanggal = UtilSql.getDateValue(result, "TANGGAL", "dd-MM-yyyy");
        objectGasGetPOData.assetvalue = UtilSql.getValue(result, "ASSETVALUE");
        objectGasGetPOData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGasGetPOData);
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
    GasGetPOData objectGasGetPOData[] = new GasGetPOData[vector.size()];
    vector.copyInto(objectGasGetPOData);
    return(objectGasGetPOData);
  }
}
