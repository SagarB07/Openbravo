//Sqlc generated V1.O00-1
package com.gai.procurement.persetujuan.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class GppGetHargaPenawaranData implements FieldProvider {
static Logger log4j = Logger.getLogger(GppGetHargaPenawaranData.class);
  private String InitRecordNumber="0";
  public String hargapenawaran;
  public String diskon;
  public String penawaran;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("HARGAPENAWARAN"))
      return hargapenawaran;
    else if (fieldName.equalsIgnoreCase("DISKON"))
      return diskon;
    else if (fieldName.equalsIgnoreCase("PENAWARAN"))
      return penawaran;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static GppGetHargaPenawaranData[] select(ConnectionProvider connectionProvider, String cBpartnerId, String gppPerspembelianId)    throws ServletException {
    return select(connectionProvider, cBpartnerId, gppPerspembelianId, 0, 0);
  }

  public static GppGetHargaPenawaranData[] select(ConnectionProvider connectionProvider, String cBpartnerId, String gppPerspembelianId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NETHARGAPENAWARAN as hargapenawaran, GP.DISKON as diskon, GP.HARGAPENAWARAN as penawaran" +
      "        FROM GPP_PERSPEMBLINE GP" +
      "        LEFT JOIN C_BPARTNER CB ON GP.C_BPARTNER_ID= CB.C_BPARTNER_ID" +
      "        LEFT JOIN GPP_PERSPEMBELIAN G ON G.GPP_PERSPEMBELIAN_ID = GP.GPP_PERSPEMBELIAN_ID" +
      "        WHERE " +
      "        CB.C_BPARTNER_ID = ?" +
      "        and " +
      "        G.GPP_PERSPEMBELIAN_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gppPerspembelianId);

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
        GppGetHargaPenawaranData objectGppGetHargaPenawaranData = new GppGetHargaPenawaranData();
        objectGppGetHargaPenawaranData.hargapenawaran = UtilSql.getValue(result, "HARGAPENAWARAN");
        objectGppGetHargaPenawaranData.diskon = UtilSql.getValue(result, "DISKON");
        objectGppGetHargaPenawaranData.penawaran = UtilSql.getValue(result, "PENAWARAN");
        objectGppGetHargaPenawaranData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGppGetHargaPenawaranData);
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
    GppGetHargaPenawaranData objectGppGetHargaPenawaranData[] = new GppGetHargaPenawaranData[vector.size()];
    vector.copyInto(objectGppGetHargaPenawaranData);
    return(objectGppGetHargaPenawaranData);
  }
}
