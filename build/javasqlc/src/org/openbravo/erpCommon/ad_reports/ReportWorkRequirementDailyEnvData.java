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

class ReportWorkRequirementDailyEnvData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportWorkRequirementDailyEnvData.class);
  private String InitRecordNumber="0";
  public String prodname;
  public String day;
  public String quantity;
  public String dayword;
  public String wrdocno;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PRODNAME"))
      return prodname;
    else if (fieldName.equalsIgnoreCase("DAY"))
      return day;
    else if (fieldName.equalsIgnoreCase("QUANTITY"))
      return quantity;
    else if (fieldName.equalsIgnoreCase("DAYWORD"))
      return dayword;
    else if (fieldName.equalsIgnoreCase("WRDOCNO"))
      return wrdocno;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportWorkRequirementDailyEnvData[] select(ConnectionProvider connectionProvider, String adLanguageId, String adUserClient, String adUserOrg, String parStartDateFrom, String parStartDateTo, String parProcessPlan)    throws ServletException {
    return select(connectionProvider, adLanguageId, adUserClient, adUserOrg, parStartDateFrom, parStartDateTo, parProcessPlan, 0, 0);
  }

  public static ReportWorkRequirementDailyEnvData[] select(ConnectionProvider connectionProvider, String adLanguageId, String adUserClient, String adUserOrg, String parStartDateFrom, String parStartDateTo, String parProcessPlan, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT pd.Name as prodname, wr.startdate as day, wrp.quantity*wrpp.movementqty/pd.unitsperpallet as quantity, " +
      "      AD_REF_LIST_V.NAME as dayword, wr.documentno as wrdocno" +
      "      FROM MA_WorkRequirement wr, MA_WRPhase wrp, MA_WRPhaseProduct wrpp, M_Product pd, AD_REF_LIST_V" +
      "      WHERE wr.MA_WORKREQUIREMENT_ID = wrp.MA_WORKREQUIREMENT_ID" +
      "        AND wrp.MA_WRPHASE_ID = wrpp.MA_WRPHASE_ID" +
      "        AND wrpp.M_PRODUCT_ID = pd.M_PRODUCT_ID" +
      "	AND TO_CHAR(WR.STARTDATE, 'D') = AD_REF_LIST_V.VALUE" +
      "	AND AD_REF_LIST_V.AD_REFERENCE_ID = '167'" +
      "	AND AD_REF_LIST_V.AD_LANGUAGE = ?" +
      "        AND wrp.CLOSED = 'N'" +
      "        AND wrpp.PRODUCTIONTYPE = '+'" +
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
    strSql = strSql + ((parProcessPlan==null || parProcessPlan.equals(""))?"":" AND wr.MA_ProcessPlan_id = ? ");
    strSql = strSql + 
      "      ORDER BY wr.enddate, wrp.SeqNo";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguageId);
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
        ReportWorkRequirementDailyEnvData objectReportWorkRequirementDailyEnvData = new ReportWorkRequirementDailyEnvData();
        objectReportWorkRequirementDailyEnvData.prodname = UtilSql.getValue(result, "PRODNAME");
        objectReportWorkRequirementDailyEnvData.day = UtilSql.getDateValue(result, "DAY", "dd-MM-yyyy");
        objectReportWorkRequirementDailyEnvData.quantity = UtilSql.getValue(result, "QUANTITY");
        objectReportWorkRequirementDailyEnvData.dayword = UtilSql.getValue(result, "DAYWORD");
        objectReportWorkRequirementDailyEnvData.wrdocno = UtilSql.getValue(result, "WRDOCNO");
        objectReportWorkRequirementDailyEnvData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportWorkRequirementDailyEnvData);
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
    ReportWorkRequirementDailyEnvData objectReportWorkRequirementDailyEnvData[] = new ReportWorkRequirementDailyEnvData[vector.size()];
    vector.copyInto(objectReportWorkRequirementDailyEnvData);
    return(objectReportWorkRequirementDailyEnvData);
  }
}