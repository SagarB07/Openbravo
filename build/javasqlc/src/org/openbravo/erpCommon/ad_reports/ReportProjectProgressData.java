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

class ReportProjectProgressData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportProjectProgressData.class);
  private String InitRecordNumber="0";
  public String projectid;
  public String projectname;
  public String projectdescription;
  public String projectcomments;
  public String projectstatus;
  public String customername;
  public String personincharge;
  public String startingdate;
  public String contractdate;
  public String endingdate;
  public String dayselapsed;
  public String projectcontractduration;
  public String daysdelayed;
  public String timeburned;
  public String completionperc;
  public String cumdaysdelayed;
  public String phaseid;
  public String phasename;
  public String phasestartingdate;
  public String phasecontractdate;
  public String phasecontractduration;
  public String phasecomplete;
  public String phasecomp;
  public String phaseendingdate;
  public String phasedaysdelayed;
  public String taskid;
  public String taskname;
  public String taskstartingdate;
  public String taskcontractdate;
  public String taskcontractduration;
  public String taskcomplete;
  public String taskcomp;
  public String taskendingdate;
  public String taskdaysdelayed;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PROJECTID"))
      return projectid;
    else if (fieldName.equalsIgnoreCase("PROJECTNAME"))
      return projectname;
    else if (fieldName.equalsIgnoreCase("PROJECTDESCRIPTION"))
      return projectdescription;
    else if (fieldName.equalsIgnoreCase("PROJECTCOMMENTS"))
      return projectcomments;
    else if (fieldName.equalsIgnoreCase("PROJECTSTATUS"))
      return projectstatus;
    else if (fieldName.equalsIgnoreCase("CUSTOMERNAME"))
      return customername;
    else if (fieldName.equalsIgnoreCase("PERSONINCHARGE"))
      return personincharge;
    else if (fieldName.equalsIgnoreCase("STARTINGDATE"))
      return startingdate;
    else if (fieldName.equalsIgnoreCase("CONTRACTDATE"))
      return contractdate;
    else if (fieldName.equalsIgnoreCase("ENDINGDATE"))
      return endingdate;
    else if (fieldName.equalsIgnoreCase("DAYSELAPSED"))
      return dayselapsed;
    else if (fieldName.equalsIgnoreCase("PROJECTCONTRACTDURATION"))
      return projectcontractduration;
    else if (fieldName.equalsIgnoreCase("DAYSDELAYED"))
      return daysdelayed;
    else if (fieldName.equalsIgnoreCase("TIMEBURNED"))
      return timeburned;
    else if (fieldName.equalsIgnoreCase("COMPLETIONPERC"))
      return completionperc;
    else if (fieldName.equalsIgnoreCase("CUMDAYSDELAYED"))
      return cumdaysdelayed;
    else if (fieldName.equalsIgnoreCase("PHASEID"))
      return phaseid;
    else if (fieldName.equalsIgnoreCase("PHASENAME"))
      return phasename;
    else if (fieldName.equalsIgnoreCase("PHASESTARTINGDATE"))
      return phasestartingdate;
    else if (fieldName.equalsIgnoreCase("PHASECONTRACTDATE"))
      return phasecontractdate;
    else if (fieldName.equalsIgnoreCase("PHASECONTRACTDURATION"))
      return phasecontractduration;
    else if (fieldName.equalsIgnoreCase("PHASECOMPLETE"))
      return phasecomplete;
    else if (fieldName.equalsIgnoreCase("PHASECOMP"))
      return phasecomp;
    else if (fieldName.equalsIgnoreCase("PHASEENDINGDATE"))
      return phaseendingdate;
    else if (fieldName.equalsIgnoreCase("PHASEDAYSDELAYED"))
      return phasedaysdelayed;
    else if (fieldName.equalsIgnoreCase("TASKID"))
      return taskid;
    else if (fieldName.equalsIgnoreCase("TASKNAME"))
      return taskname;
    else if (fieldName.equalsIgnoreCase("TASKSTARTINGDATE"))
      return taskstartingdate;
    else if (fieldName.equalsIgnoreCase("TASKCONTRACTDATE"))
      return taskcontractdate;
    else if (fieldName.equalsIgnoreCase("TASKCONTRACTDURATION"))
      return taskcontractduration;
    else if (fieldName.equalsIgnoreCase("TASKCOMPLETE"))
      return taskcomplete;
    else if (fieldName.equalsIgnoreCase("TASKCOMP"))
      return taskcomp;
    else if (fieldName.equalsIgnoreCase("TASKENDINGDATE"))
      return taskendingdate;
    else if (fieldName.equalsIgnoreCase("TASKDAYSDELAYED"))
      return taskdaysdelayed;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportProjectProgressData[] select(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adUserOrg, String dateStartFrom, String dateStartTo, String dateContractFrom, String dateContractTo, String dateEndingFrom, String dateEndingTo, String cProjectId, String cProjectStatus, String cBPartnerId, String projectResponsible, String olderFirst)    throws ServletException {
    return select(connectionProvider, adLanguage, adUserClient, adUserOrg, dateStartFrom, dateStartTo, dateContractFrom, dateContractTo, dateEndingFrom, dateEndingTo, cProjectId, cProjectStatus, cBPartnerId, projectResponsible, olderFirst, 0, 0);
  }

  public static ReportProjectProgressData[] select(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adUserOrg, String dateStartFrom, String dateStartTo, String dateContractFrom, String dateContractTo, String dateEndingFrom, String dateEndingTo, String cProjectId, String cProjectStatus, String cBPartnerId, String projectResponsible, String olderFirst, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT" +
      "		PR.C_PROJECT_ID AS PROJECTID, PR.NAME AS PROJECTNAME, PR.DESCRIPTION AS PROJECTDESCRIPTION, PR.NOTE AS PROJECTCOMMENTS," +
      "		REFLISTV.NAME AS PROJECTSTATUS, BPCUSTOMER.NAME AS CUSTOMERNAME, BPRESPONSIBLE.NAME AS PERSONINCHARGE," +
      "		PR.STARTDATE AS STARTINGDATE, PR.DATECONTRACT AS CONTRACTDATE, PR.DATEFINISH AS ENDINGDATE," +
      "		'' AS  DAYSELAPSED, '' AS PROJECTCONTRACTDURATION, '' AS DAYSDELAYED," +
      "		'' AS TIMEBURNED, ''AS COMPLETIONPERC, '' AS CUMDAYSDELAYED," +
      "		PRP.C_PROJECTPHASE_ID AS PHASEID, PRP.NAME AS PHASENAME, PRP.STARTDATE AS PHASESTARTINGDATE, PRP.DATECONTRACT AS PHASECONTRACTDATE, '' AS PHASECONTRACTDURATION, " +
      "		AD_MESSAGE_GET2(PRP.ISCOMPLETE,?) AS PHASECOMPLETE, PRP.ISCOMPLETE AS PHASECOMP, PRP.ENDDATE AS PHASEENDINGDATE, '' AS PHASEDAYSDELAYED," +
      "		PRT.C_PROJECTTASK_ID AS TASKID, PRT.NAME AS TASKNAME, PRT.STARTDATE AS TASKSTARTINGDATE, PRT.DATECONTRACT AS TASKCONTRACTDATE, '' AS TASKCONTRACTDURATION," +
      "		AD_MESSAGE_GET2(PRT.ISCOMPLETE,?) AS TASKCOMPLETE, PRT.ISCOMPLETE AS TASKCOMP, PRT.ENDDATE AS TASKENDINGDATE, '' AS TASKDAYSDELAYED" +
      "	  FROM AD_REF_LIST_V REFLISTV, C_BPARTNER BPCUSTOMER, C_PROJECT PR" +
      "		LEFT JOIN C_BPARTNER BPRESPONSIBLE ON PR.RESPONSIBLE_ID = BPRESPONSIBLE.C_BPARTNER_ID" +
      "	  	LEFT JOIN C_PROJECTPHASE PRP ON PR.C_PROJECT_ID = PRP.C_PROJECT_ID" +
      "	  	LEFT JOIN C_PROJECTTASK PRT ON PRP.C_PROJECTPHASE_ID = PRT.C_PROJECTPHASE_ID" +
      "	  WHERE PR.C_BPARTNER_ID = BPCUSTOMER.C_BPARTNER_ID" +
      "	  	AND REFLISTV.AD_REFERENCE_ID = '800002'" +
      "	    AND REFLISTV.AD_LANGUAGE = ?" +
      "	    AND REFLISTV.VALUE = PR.PROJECTSTATUS" +
      "	    AND PR.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "	    AND PR.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "	    AND 1=1";
    strSql = strSql + ((dateStartFrom==null || dateStartFrom.equals(""))?"":"  AND PR.STARTDATE >= TO_DATE(?) ");
    strSql = strSql + ((dateStartTo==null || dateStartTo.equals(""))?"":"  AND PR.STARTDATE < TO_DATE(?) ");
    strSql = strSql + ((dateContractFrom==null || dateContractFrom.equals(""))?"":"  AND PR.DATECONTRACT >= TO_DATE(?) ");
    strSql = strSql + ((dateContractTo==null || dateContractTo.equals(""))?"":"  AND PR.DATECONTRACT < TO_DATE(?) ");
    strSql = strSql + ((dateEndingFrom==null || dateEndingFrom.equals(""))?"":"  AND PR.DATEFINISH >= TO_DATE(?) ");
    strSql = strSql + ((dateEndingTo==null || dateEndingTo.equals(""))?"":"  AND PR.DATEFINISH < TO_DATE(?) ");
    strSql = strSql + ((cProjectId==null || cProjectId.equals(""))?"":"  AND PR.C_PROJECT_ID = ? ");
    strSql = strSql + ((cProjectStatus==null || cProjectStatus.equals(""))?"":"  AND PR.PROJECTSTATUS IN" + cProjectStatus);
    strSql = strSql + ((cBPartnerId==null || cBPartnerId.equals(""))?"":"  AND PR.C_BPARTNER_ID = ? ");
    strSql = strSql + ((projectResponsible==null || projectResponsible.equals(""))?"":"  AND PR.RESPONSIBLE_ID = ? ");
    strSql = strSql + 
      "      ORDER BY PR.NAME";
    strSql = strSql + ((olderFirst==null || olderFirst.equals(""))?"":olderFirst);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (dateStartFrom != null && !(dateStartFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateStartFrom);
      }
      if (dateStartTo != null && !(dateStartTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateStartTo);
      }
      if (dateContractFrom != null && !(dateContractFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateContractFrom);
      }
      if (dateContractTo != null && !(dateContractTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateContractTo);
      }
      if (dateEndingFrom != null && !(dateEndingFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateEndingFrom);
      }
      if (dateEndingTo != null && !(dateEndingTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateEndingTo);
      }
      if (cProjectId != null && !(cProjectId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      }
      if (cProjectStatus != null && !(cProjectStatus.equals(""))) {
        }
      if (cBPartnerId != null && !(cBPartnerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBPartnerId);
      }
      if (projectResponsible != null && !(projectResponsible.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, projectResponsible);
      }
      if (olderFirst != null && !(olderFirst.equals(""))) {
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
        ReportProjectProgressData objectReportProjectProgressData = new ReportProjectProgressData();
        objectReportProjectProgressData.projectid = UtilSql.getValue(result, "PROJECTID");
        objectReportProjectProgressData.projectname = UtilSql.getValue(result, "PROJECTNAME");
        objectReportProjectProgressData.projectdescription = UtilSql.getValue(result, "PROJECTDESCRIPTION");
        objectReportProjectProgressData.projectcomments = UtilSql.getValue(result, "PROJECTCOMMENTS");
        objectReportProjectProgressData.projectstatus = UtilSql.getValue(result, "PROJECTSTATUS");
        objectReportProjectProgressData.customername = UtilSql.getValue(result, "CUSTOMERNAME");
        objectReportProjectProgressData.personincharge = UtilSql.getValue(result, "PERSONINCHARGE");
        objectReportProjectProgressData.startingdate = UtilSql.getDateValue(result, "STARTINGDATE", "dd-MM-yyyy");
        objectReportProjectProgressData.contractdate = UtilSql.getDateValue(result, "CONTRACTDATE", "dd-MM-yyyy");
        objectReportProjectProgressData.endingdate = UtilSql.getDateValue(result, "ENDINGDATE", "dd-MM-yyyy");
        objectReportProjectProgressData.dayselapsed = UtilSql.getValue(result, "DAYSELAPSED");
        objectReportProjectProgressData.projectcontractduration = UtilSql.getValue(result, "PROJECTCONTRACTDURATION");
        objectReportProjectProgressData.daysdelayed = UtilSql.getValue(result, "DAYSDELAYED");
        objectReportProjectProgressData.timeburned = UtilSql.getValue(result, "TIMEBURNED");
        objectReportProjectProgressData.completionperc = UtilSql.getValue(result, "COMPLETIONPERC");
        objectReportProjectProgressData.cumdaysdelayed = UtilSql.getValue(result, "CUMDAYSDELAYED");
        objectReportProjectProgressData.phaseid = UtilSql.getValue(result, "PHASEID");
        objectReportProjectProgressData.phasename = UtilSql.getValue(result, "PHASENAME");
        objectReportProjectProgressData.phasestartingdate = UtilSql.getDateValue(result, "PHASESTARTINGDATE", "dd-MM-yyyy");
        objectReportProjectProgressData.phasecontractdate = UtilSql.getDateValue(result, "PHASECONTRACTDATE", "dd-MM-yyyy");
        objectReportProjectProgressData.phasecontractduration = UtilSql.getValue(result, "PHASECONTRACTDURATION");
        objectReportProjectProgressData.phasecomplete = UtilSql.getValue(result, "PHASECOMPLETE");
        objectReportProjectProgressData.phasecomp = UtilSql.getValue(result, "PHASECOMP");
        objectReportProjectProgressData.phaseendingdate = UtilSql.getDateValue(result, "PHASEENDINGDATE", "dd-MM-yyyy");
        objectReportProjectProgressData.phasedaysdelayed = UtilSql.getValue(result, "PHASEDAYSDELAYED");
        objectReportProjectProgressData.taskid = UtilSql.getValue(result, "TASKID");
        objectReportProjectProgressData.taskname = UtilSql.getValue(result, "TASKNAME");
        objectReportProjectProgressData.taskstartingdate = UtilSql.getDateValue(result, "TASKSTARTINGDATE", "dd-MM-yyyy");
        objectReportProjectProgressData.taskcontractdate = UtilSql.getDateValue(result, "TASKCONTRACTDATE", "dd-MM-yyyy");
        objectReportProjectProgressData.taskcontractduration = UtilSql.getValue(result, "TASKCONTRACTDURATION");
        objectReportProjectProgressData.taskcomplete = UtilSql.getValue(result, "TASKCOMPLETE");
        objectReportProjectProgressData.taskcomp = UtilSql.getValue(result, "TASKCOMP");
        objectReportProjectProgressData.taskendingdate = UtilSql.getDateValue(result, "TASKENDINGDATE", "dd-MM-yyyy");
        objectReportProjectProgressData.taskdaysdelayed = UtilSql.getValue(result, "TASKDAYSDELAYED");
        objectReportProjectProgressData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportProjectProgressData);
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
    ReportProjectProgressData objectReportProjectProgressData[] = new ReportProjectProgressData[vector.size()];
    vector.copyInto(objectReportProjectProgressData);
    return(objectReportProjectProgressData);
  }

  public static ReportProjectProgressData[] set()    throws ServletException {
    ReportProjectProgressData objectReportProjectProgressData[] = new ReportProjectProgressData[1];
    objectReportProjectProgressData[0] = new ReportProjectProgressData();
    objectReportProjectProgressData[0].projectid = "";
    objectReportProjectProgressData[0].projectname = "";
    objectReportProjectProgressData[0].projectdescription = "";
    objectReportProjectProgressData[0].projectcomments = "";
    objectReportProjectProgressData[0].projectstatus = "";
    objectReportProjectProgressData[0].customername = "";
    objectReportProjectProgressData[0].personincharge = "";
    objectReportProjectProgressData[0].startingdate = "";
    objectReportProjectProgressData[0].contractdate = "";
    objectReportProjectProgressData[0].endingdate = "";
    objectReportProjectProgressData[0].dayselapsed = "";
    objectReportProjectProgressData[0].projectcontractduration = "";
    objectReportProjectProgressData[0].daysdelayed = "";
    objectReportProjectProgressData[0].timeburned = "";
    objectReportProjectProgressData[0].completionperc = "";
    objectReportProjectProgressData[0].cumdaysdelayed = "";
    objectReportProjectProgressData[0].phaseid = "";
    objectReportProjectProgressData[0].phasename = "";
    objectReportProjectProgressData[0].phasestartingdate = "";
    objectReportProjectProgressData[0].phasecontractdate = "";
    objectReportProjectProgressData[0].phasecontractduration = "";
    objectReportProjectProgressData[0].phasecomplete = "";
    objectReportProjectProgressData[0].phasecomp = "";
    objectReportProjectProgressData[0].phaseendingdate = "";
    objectReportProjectProgressData[0].phasedaysdelayed = "";
    objectReportProjectProgressData[0].taskid = "";
    objectReportProjectProgressData[0].taskname = "";
    objectReportProjectProgressData[0].taskstartingdate = "";
    objectReportProjectProgressData[0].taskcontractdate = "";
    objectReportProjectProgressData[0].taskcontractduration = "";
    objectReportProjectProgressData[0].taskcomplete = "";
    objectReportProjectProgressData[0].taskcomp = "";
    objectReportProjectProgressData[0].taskendingdate = "";
    objectReportProjectProgressData[0].taskdaysdelayed = "";
    return objectReportProjectProgressData;
  }
}
