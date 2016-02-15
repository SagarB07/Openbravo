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

class ReportWorkRequirementDailyData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportWorkRequirementDailyData.class);
  private String InitRecordNumber="0";
  public String wrid;
  public String startdate;
  public String enddate;
  public String wrpid;
  public String quantity;
  public String wrpname;
  public String processplan;
  public String process;
  public String needqty;
  public String seqno;
  public String negative;
  public String inprocess;
  public String description;
  public String prodproduct;
  public String name;
  public String docno;
  public String wrname;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("WRID"))
      return wrid;
    else if (fieldName.equalsIgnoreCase("STARTDATE"))
      return startdate;
    else if (fieldName.equalsIgnoreCase("ENDDATE"))
      return enddate;
    else if (fieldName.equalsIgnoreCase("WRPID"))
      return wrpid;
    else if (fieldName.equalsIgnoreCase("QUANTITY"))
      return quantity;
    else if (fieldName.equalsIgnoreCase("WRPNAME"))
      return wrpname;
    else if (fieldName.equalsIgnoreCase("PROCESSPLAN"))
      return processplan;
    else if (fieldName.equalsIgnoreCase("PROCESS"))
      return process;
    else if (fieldName.equalsIgnoreCase("NEEDQTY"))
      return needqty;
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("NEGATIVE"))
      return negative;
    else if (fieldName.equalsIgnoreCase("INPROCESS"))
      return inprocess;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("PRODPRODUCT"))
      return prodproduct;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DOCNO"))
      return docno;
    else if (fieldName.equalsIgnoreCase("WRNAME"))
      return wrname;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportWorkRequirementDailyData[] select(ConnectionProvider connectionProvider, String language, String adUserClient, String adUserOrg, String parStartDateFrom, String parStartDateTo, String parProcessPlan)    throws ServletException {
    return select(connectionProvider, language, adUserClient, adUserOrg, parStartDateFrom, parStartDateTo, parProcessPlan, 0, 0);
  }

  public static ReportWorkRequirementDailyData[] select(ConnectionProvider connectionProvider, String language, String adUserClient, String adUserOrg, String parStartDateFrom, String parStartDateTo, String parProcessPlan, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT wr.MA_WorkRequirement_ID AS wrid, wr.STARTDATE AS startdate, wr.ENDDATE AS enddate, " +
      "      wrp.MA_WRPhase_ID AS wrpid, COALESCE(wr.CONVERSIONRATE,1)*wrp.DONEQUANTITY AS quantity, " +
      "      AD_COLUMN_IDENTIFIER('MA_WRPHASE', to_char(wrp.MA_WRPhase_ID),?) AS WRPNAME," +
      "      AD_COLUMN_IDENTIFIER('MA_PROCESSPLAN', to_char(ppv.MA_PROCESSPLAN_ID),?) AS PROCESSPLAN," +
      "      AD_COLUMN_IDENTIFIER('MA_PROCESS', to_char(wrp.MA_PROCESS_ID), ?) AS PROCESS," +
      "      COALESCE(wr.CONVERSIONRATE,1)*(wrp.QUANTITY-wrp.DONEQUANTITY) AS needqty, " +
      "      wrp.SeqNO, 'Bordes' AS negative," +
      "        '123' AS inprocess, s.description AS description,'product' AS prodproduct,'' AS name, wr.DocumentNo as docno," +
      "        AD_COLUMN_IDENTIFIER('MA_WORKREQUIREMENT', to_char(wr.MA_WORKREQUIREMENT_ID), ?) AS WRNAME" +
      "      FROM MA_WorkRequirement wr, MA_WRPhase wrp," +
      "        MA_Sequence s, MA_ProcessPlan_Version ppv" +
      "      WHERE wr.MA_WORKREQUIREMENT_ID = wrp.MA_WORKREQUIREMENT_ID" +
      "        AND s.MA_ProcessPlan_Version_ID = ppv.MA_ProcessPlan_Version_ID" +
      "        AND s.MA_Sequence_ID = wrp.MA_Sequence_ID" +
      "        AND ppv.datefrom <= wr.startdate" +
      "        AND ppv.dateto > wr.startdate" +
      "        AND wrp.CLOSED = 'N'" +
      "        AND wr.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND wr.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "        AND 1=1";
    strSql = strSql + ((parStartDateFrom==null || parStartDateFrom.equals(""))?"":" AND wr.STARTDATE >= TO_DATE(?) ");
    strSql = strSql + ((parStartDateTo==null || parStartDateTo.equals(""))?"":" AND wr.STARTDATE <= TO_DATE(?) ");
    strSql = strSql + ((parProcessPlan==null || parProcessPlan.equals(""))?"":" AND ppv.MA_ProcessPlan_id = ? ");
    strSql = strSql + 
      "      ORDER BY enddate, wr.DocumentNo, wr.MA_WorkRequirement_ID, wrp.SeqNo, wrp.MA_WRPhase_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (parStartDateFrom != null && !(parStartDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parStartDateFrom);
      }
      if (parStartDateTo != null && !(parStartDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parStartDateTo);
      }
      if (parProcessPlan != null && !(parProcessPlan.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parProcessPlan);
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
        ReportWorkRequirementDailyData objectReportWorkRequirementDailyData = new ReportWorkRequirementDailyData();
        objectReportWorkRequirementDailyData.wrid = UtilSql.getValue(result, "WRID");
        objectReportWorkRequirementDailyData.startdate = UtilSql.getDateValue(result, "STARTDATE", "dd-MM-yyyy");
        objectReportWorkRequirementDailyData.enddate = UtilSql.getDateValue(result, "ENDDATE", "dd-MM-yyyy");
        objectReportWorkRequirementDailyData.wrpid = UtilSql.getValue(result, "WRPID");
        objectReportWorkRequirementDailyData.quantity = UtilSql.getValue(result, "QUANTITY");
        objectReportWorkRequirementDailyData.wrpname = UtilSql.getValue(result, "WRPNAME");
        objectReportWorkRequirementDailyData.processplan = UtilSql.getValue(result, "PROCESSPLAN");
        objectReportWorkRequirementDailyData.process = UtilSql.getValue(result, "PROCESS");
        objectReportWorkRequirementDailyData.needqty = UtilSql.getValue(result, "NEEDQTY");
        objectReportWorkRequirementDailyData.seqno = UtilSql.getValue(result, "SEQNO");
        objectReportWorkRequirementDailyData.negative = UtilSql.getValue(result, "NEGATIVE");
        objectReportWorkRequirementDailyData.inprocess = UtilSql.getValue(result, "INPROCESS");
        objectReportWorkRequirementDailyData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectReportWorkRequirementDailyData.prodproduct = UtilSql.getValue(result, "PRODPRODUCT");
        objectReportWorkRequirementDailyData.name = UtilSql.getValue(result, "NAME");
        objectReportWorkRequirementDailyData.docno = UtilSql.getValue(result, "DOCNO");
        objectReportWorkRequirementDailyData.wrname = UtilSql.getValue(result, "WRNAME");
        objectReportWorkRequirementDailyData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportWorkRequirementDailyData);
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
    ReportWorkRequirementDailyData objectReportWorkRequirementDailyData[] = new ReportWorkRequirementDailyData[vector.size()];
    vector.copyInto(objectReportWorkRequirementDailyData);
    return(objectReportWorkRequirementDailyData);
  }
}
