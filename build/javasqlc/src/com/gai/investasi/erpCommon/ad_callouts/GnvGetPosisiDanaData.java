//Sqlc generated V1.O00-1
package com.gai.investasi.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class GnvGetPosisiDanaData implements FieldProvider {
static Logger log4j = Logger.getLogger(GnvGetPosisiDanaData.class);
  private String InitRecordNumber="0";
  public String danasaatini;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("DANASAATINI"))
      return danasaatini;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static GnvGetPosisiDanaData[] select(ConnectionProvider connectionProvider, String gnvInvestasiHeaderId, String tanggal)    throws ServletException {
    return select(connectionProvider, gnvInvestasiHeaderId, tanggal, 0, 0);
  }

  public static GnvGetPosisiDanaData[] select(ConnectionProvider connectionProvider, String gnvInvestasiHeaderId, String tanggal, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	select sum(gil.AMOUNT) as danasaatini from GNV_INVESTASI_LINE gil where gil.GNV_INVESTASI_HEADER_ID = ?" +
      "		and gil.TANGGALAWAL between (select min(gil2.TANGGALAWAL) from GNV_INVESTASI_LINE gil2 where gil2.GNV_INVESTASI_HEADER_ID =gil.GNV_INVESTASI_HEADER_ID ) and " +
      "		to_date(?)  ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gnvInvestasiHeaderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tanggal);

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
        GnvGetPosisiDanaData objectGnvGetPosisiDanaData = new GnvGetPosisiDanaData();
        objectGnvGetPosisiDanaData.danasaatini = UtilSql.getValue(result, "DANASAATINI");
        objectGnvGetPosisiDanaData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGnvGetPosisiDanaData);
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
    GnvGetPosisiDanaData objectGnvGetPosisiDanaData[] = new GnvGetPosisiDanaData[vector.size()];
    vector.copyInto(objectGnvGetPosisiDanaData);
    return(objectGnvGetPosisiDanaData);
  }
}
