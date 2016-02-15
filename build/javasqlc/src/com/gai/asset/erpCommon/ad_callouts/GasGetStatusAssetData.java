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

class GasGetStatusAssetData implements FieldProvider {
static Logger log4j = Logger.getLogger(GasGetStatusAssetData.class);
  private String InitRecordNumber="0";
  public String tanggalakhir;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("TANGGALAKHIR"))
      return tanggalakhir;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static GasGetStatusAssetData[] select(ConnectionProvider connectionProvider, String aAssetId)    throws ServletException {
    return select(connectionProvider, aAssetId, 0, 0);
  }

  public static GasGetStatusAssetData[] select(ConnectionProvider connectionProvider, String aAssetId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT EM_GAS_TANGGALAKHIRGARANSI as tanggalakhir FROM A_ASSET WHERE A_ASSET_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);

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
        GasGetStatusAssetData objectGasGetStatusAssetData = new GasGetStatusAssetData();
        objectGasGetStatusAssetData.tanggalakhir = UtilSql.getDateValue(result, "TANGGALAKHIR", "dd-MM-yyyy");
        objectGasGetStatusAssetData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGasGetStatusAssetData);
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
    GasGetStatusAssetData objectGasGetStatusAssetData[] = new GasGetStatusAssetData[vector.size()];
    vector.copyInto(objectGasGetStatusAssetData);
    return(objectGasGetStatusAssetData);
  }
}
