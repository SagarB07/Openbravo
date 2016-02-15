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

class GnvGetRasioKeuanganData implements FieldProvider {
static Logger log4j = Logger.getLogger(GnvGetRasioKeuanganData.class);
  private String InitRecordNumber="0";
  public String cBpartnerId;
  public String tanggal;
  public String car;
  public String npl;
  public String ldr;
  public String birate;
  public String lpsrate;
  public String totalaset;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("TANGGAL"))
      return tanggal;
    else if (fieldName.equalsIgnoreCase("CAR"))
      return car;
    else if (fieldName.equalsIgnoreCase("NPL"))
      return npl;
    else if (fieldName.equalsIgnoreCase("LDR"))
      return ldr;
    else if (fieldName.equalsIgnoreCase("BIRATE"))
      return birate;
    else if (fieldName.equalsIgnoreCase("LPSRATE"))
      return lpsrate;
    else if (fieldName.equalsIgnoreCase("TOTALASET"))
      return totalaset;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static GnvGetRasioKeuanganData[] select(ConnectionProvider connectionProvider, String cBpartnerId, String tglAwal)    throws ServletException {
    return select(connectionProvider, cBpartnerId, tglAwal, 0, 0);
  }

  public static GnvGetRasioKeuanganData[] select(ConnectionProvider connectionProvider, String cBpartnerId, String tglAwal, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT C_BPARTNER_ID,GMR.TANGGAL , GMR.CAR AS car, GMR.NPL AS npl ,GMR.LDR AS ldr, GMR.BIRATE AS birate ,GMR.LPSRATE AS lpsrate, " +
      "        GMR.TOTAL_ASSET as totalaset" +
      "        FROM GNV_MASTER_RASIOKEUANGAN GMR" +
      "        WHERE C_BPARTNER_ID = ?" +
      "        AND GMR.TANGGAL = " +
      "        (SELECT max(GMR2.TANGGAL)" +
      "        FROM GNV_MASTER_RASIOKEUANGAN GMR2" +
      "        WHERE GMR2.C_BPARTNER_ID IN" +
      "          (SELECT GIL2.C_BPARTNER_ID " +
      "          FROM GNV_INVESTASI_LINE GIL2" +
      "          )" +
      "        AND GMR2.TANGGAL <= (to_date(?)))";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tglAwal);

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
        GnvGetRasioKeuanganData objectGnvGetRasioKeuanganData = new GnvGetRasioKeuanganData();
        objectGnvGetRasioKeuanganData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectGnvGetRasioKeuanganData.tanggal = UtilSql.getDateValue(result, "TANGGAL", "dd-MM-yyyy");
        objectGnvGetRasioKeuanganData.car = UtilSql.getValue(result, "CAR");
        objectGnvGetRasioKeuanganData.npl = UtilSql.getValue(result, "NPL");
        objectGnvGetRasioKeuanganData.ldr = UtilSql.getValue(result, "LDR");
        objectGnvGetRasioKeuanganData.birate = UtilSql.getValue(result, "BIRATE");
        objectGnvGetRasioKeuanganData.lpsrate = UtilSql.getValue(result, "LPSRATE");
        objectGnvGetRasioKeuanganData.totalaset = UtilSql.getValue(result, "TOTALASET");
        objectGnvGetRasioKeuanganData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGnvGetRasioKeuanganData);
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
    GnvGetRasioKeuanganData objectGnvGetRasioKeuanganData[] = new GnvGetRasioKeuanganData[vector.size()];
    vector.copyInto(objectGnvGetRasioKeuanganData);
    return(objectGnvGetRasioKeuanganData);
  }
}
