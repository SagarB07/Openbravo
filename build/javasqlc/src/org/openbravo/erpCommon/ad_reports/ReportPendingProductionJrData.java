//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class ReportPendingProductionJrData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportPendingProductionJrData.class);
  private String InitRecordNumber="0";
  public String docno;
  public String ordered;
  public String promised;
  public String bpname;
  public String rname;
  public String value;
  public String pname;
  public String qtyordered;
  public String qtyonhand;
  public String preqtyonhand;
  public String negative;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("DOCNO"))
      return docno;
    else if (fieldName.equalsIgnoreCase("ORDERED"))
      return ordered;
    else if (fieldName.equalsIgnoreCase("PROMISED"))
      return promised;
    else if (fieldName.equalsIgnoreCase("BPNAME"))
      return bpname;
    else if (fieldName.equalsIgnoreCase("RNAME"))
      return rname;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("PNAME"))
      return pname;
    else if (fieldName.equalsIgnoreCase("QTYORDERED"))
      return qtyordered;
    else if (fieldName.equalsIgnoreCase("QTYONHAND"))
      return qtyonhand;
    else if (fieldName.equalsIgnoreCase("PREQTYONHAND"))
      return preqtyonhand;
    else if (fieldName.equalsIgnoreCase("NEGATIVE"))
      return negative;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportPendingProductionJrData[] select(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg)    throws ServletException {
    return select(connectionProvider, adUserClient, adUserOrg, 0, 0);
  }

  public static ReportPendingProductionJrData[] select(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_ORDER.DOCUMENTNO AS DOCNO, C_ORDER.DATEORDERED AS ORDERED, C_ORDER.DATEPROMISED AS PROMISED," +
      "             C_BPARTNER.NAME AS BPNAME, C_REGION.NAME AS RNAME, M_PRODUCT.VALUE, M_PRODUCT.NAME AS PNAME," +
      "             C_ORDERLINE.QTYORDERED, STORAGE_DETAIL.QTYONHAND, STORAGE_DETAIL.PREQTYONHAND," +
      "              CASE  WHEN C_ORDERLINE.QTYORDERED - STORAGE_DETAIL.QTYONHAND - STORAGE_DETAIL.PREQTYONHAND>0 THEN 'Color' ELSE 'Bordes' END AS NEGATIVE" +
      "         FROM C_ORDER, C_ORDERLINE, C_BPARTNER, M_PRODUCT, C_BPARTNER_LOCATION, C_LOCATION, C_REGION," +
      "            (SELECT M_PRODUCT_ID, SUM(QTYONHAND) AS QTYONHAND, SUM(PREQTYONHAND) AS PREQTYONHAND  " +
      "             FROM M_STORAGE_DETAIL GROUP BY M_STORAGE_DETAIL.M_PRODUCT_ID) STORAGE_DETAIL " +
      "         WHERE C_ORDER.C_ORDER_ID = C_ORDERLINE.C_ORDER_ID" +
      "           AND C_ORDER.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "           AND C_ORDERLINE.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "           AND STORAGE_DETAIL.M_PRODUCT_ID = C_ORDERLINE.M_PRODUCT_ID" +
      "           AND C_BPARTNER_LOCATION.C_BPARTNER_LOCATION_ID = C_ORDER.C_BPARTNER_LOCATION_ID" +
      "           AND C_BPARTNER_LOCATION.C_LOCATION_ID = C_LOCATION.C_LOCATION_ID" +
      "           AND C_LOCATION.C_REGION_ID = C_REGION.C_REGION_ID" +
      "           AND C_ORDER.DOCSTATUS='CO'" +
      "           AND C_ORDER.C_ORDER_ID IN (SELECT C_Order_ID FROM M_InOut_Candidate_v)" +
      "           AND C_ORDER.ISSOTRX='Y' " +
      "           AND C_ORDER.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "           AND C_ORDER.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "         ORDER BY C_ORDER.DATEORDERED";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }

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
        ReportPendingProductionJrData objectReportPendingProductionJrData = new ReportPendingProductionJrData();
        objectReportPendingProductionJrData.docno = UtilSql.getValue(result, "DOCNO");
        objectReportPendingProductionJrData.ordered = UtilSql.getDateValue(result, "ORDERED", "dd-MM-yyyy");
        objectReportPendingProductionJrData.promised = UtilSql.getDateValue(result, "PROMISED", "dd-MM-yyyy");
        objectReportPendingProductionJrData.bpname = UtilSql.getValue(result, "BPNAME");
        objectReportPendingProductionJrData.rname = UtilSql.getValue(result, "RNAME");
        objectReportPendingProductionJrData.value = UtilSql.getValue(result, "VALUE");
        objectReportPendingProductionJrData.pname = UtilSql.getValue(result, "PNAME");
        objectReportPendingProductionJrData.qtyordered = UtilSql.getValue(result, "QTYORDERED");
        objectReportPendingProductionJrData.qtyonhand = UtilSql.getValue(result, "QTYONHAND");
        objectReportPendingProductionJrData.preqtyonhand = UtilSql.getValue(result, "PREQTYONHAND");
        objectReportPendingProductionJrData.negative = UtilSql.getValue(result, "NEGATIVE");
        objectReportPendingProductionJrData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportPendingProductionJrData);
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
    ReportPendingProductionJrData objectReportPendingProductionJrData[] = new ReportPendingProductionJrData[vector.size()];
    vector.copyInto(objectReportPendingProductionJrData);
    return(objectReportPendingProductionJrData);
  }
}
