//Sqlc generated V1.O00-1
package org.openbravo.scheduling;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;

class TriggerData implements FieldProvider {
static Logger log4j = Logger.getLogger(TriggerData.class);
  private String InitRecordNumber="0";
  public String adProcessRequestId;
  public String timingOption;
  public String startTime;
  public String startDate;
  public String frequency;
  public String secondlyInterval;
  public String secondlyRepetitions;
  public String minutelyInterval;
  public String minutelyRepetitions;
  public String hourlyInterval;
  public String hourlyRepetitions;
  public String dailyInterval;
  public String dayMon;
  public String dayTue;
  public String dayWed;
  public String dayThu;
  public String dayFri;
  public String daySat;
  public String daySun;
  public String monthlyOption;
  public String monthlySpecificDay;
  public String monthlyDayOfWeek;
  public String finishes;
  public String finishesTime;
  public String finishesDate;
  public String dailyOption;
  public String cron;
  public String description;
  public String nextFireTime;
  public String preventconcurrent;
  public String processName;
  public String adProcessId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_PROCESS_REQUEST_ID") || fieldName.equals("adProcessRequestId"))
      return adProcessRequestId;
    else if (fieldName.equalsIgnoreCase("TIMING_OPTION") || fieldName.equals("timingOption"))
      return timingOption;
    else if (fieldName.equalsIgnoreCase("START_TIME") || fieldName.equals("startTime"))
      return startTime;
    else if (fieldName.equalsIgnoreCase("START_DATE") || fieldName.equals("startDate"))
      return startDate;
    else if (fieldName.equalsIgnoreCase("FREQUENCY"))
      return frequency;
    else if (fieldName.equalsIgnoreCase("SECONDLY_INTERVAL") || fieldName.equals("secondlyInterval"))
      return secondlyInterval;
    else if (fieldName.equalsIgnoreCase("SECONDLY_REPETITIONS") || fieldName.equals("secondlyRepetitions"))
      return secondlyRepetitions;
    else if (fieldName.equalsIgnoreCase("MINUTELY_INTERVAL") || fieldName.equals("minutelyInterval"))
      return minutelyInterval;
    else if (fieldName.equalsIgnoreCase("MINUTELY_REPETITIONS") || fieldName.equals("minutelyRepetitions"))
      return minutelyRepetitions;
    else if (fieldName.equalsIgnoreCase("HOURLY_INTERVAL") || fieldName.equals("hourlyInterval"))
      return hourlyInterval;
    else if (fieldName.equalsIgnoreCase("HOURLY_REPETITIONS") || fieldName.equals("hourlyRepetitions"))
      return hourlyRepetitions;
    else if (fieldName.equalsIgnoreCase("DAILY_INTERVAL") || fieldName.equals("dailyInterval"))
      return dailyInterval;
    else if (fieldName.equalsIgnoreCase("DAY_MON") || fieldName.equals("dayMon"))
      return dayMon;
    else if (fieldName.equalsIgnoreCase("DAY_TUE") || fieldName.equals("dayTue"))
      return dayTue;
    else if (fieldName.equalsIgnoreCase("DAY_WED") || fieldName.equals("dayWed"))
      return dayWed;
    else if (fieldName.equalsIgnoreCase("DAY_THU") || fieldName.equals("dayThu"))
      return dayThu;
    else if (fieldName.equalsIgnoreCase("DAY_FRI") || fieldName.equals("dayFri"))
      return dayFri;
    else if (fieldName.equalsIgnoreCase("DAY_SAT") || fieldName.equals("daySat"))
      return daySat;
    else if (fieldName.equalsIgnoreCase("DAY_SUN") || fieldName.equals("daySun"))
      return daySun;
    else if (fieldName.equalsIgnoreCase("MONTHLY_OPTION") || fieldName.equals("monthlyOption"))
      return monthlyOption;
    else if (fieldName.equalsIgnoreCase("MONTHLY_SPECIFIC_DAY") || fieldName.equals("monthlySpecificDay"))
      return monthlySpecificDay;
    else if (fieldName.equalsIgnoreCase("MONTHLY_DAY_OF_WEEK") || fieldName.equals("monthlyDayOfWeek"))
      return monthlyDayOfWeek;
    else if (fieldName.equalsIgnoreCase("FINISHES"))
      return finishes;
    else if (fieldName.equalsIgnoreCase("FINISHES_TIME") || fieldName.equals("finishesTime"))
      return finishesTime;
    else if (fieldName.equalsIgnoreCase("FINISHES_DATE") || fieldName.equals("finishesDate"))
      return finishesDate;
    else if (fieldName.equalsIgnoreCase("DAILY_OPTION") || fieldName.equals("dailyOption"))
      return dailyOption;
    else if (fieldName.equalsIgnoreCase("CRON"))
      return cron;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("NEXT_FIRE_TIME") || fieldName.equals("nextFireTime"))
      return nextFireTime;
    else if (fieldName.equalsIgnoreCase("PREVENTCONCURRENT"))
      return preventconcurrent;
    else if (fieldName.equalsIgnoreCase("PROCESS_NAME") || fieldName.equals("processName"))
      return processName;
    else if (fieldName.equalsIgnoreCase("AD_PROCESS_ID") || fieldName.equals("adProcessId"))
      return adProcessId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static TriggerData select(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      	SELECT AD_Process_Request_ID, Timing_Option, TO_CHAR(Start_Time, 'HH24:MI:SS') AS Start_Time, to_char(Start_Date, 'DD-MM-YYYY') AS Start_Date," +
      "      	Frequency, Secondly_Interval, Secondly_Repetitions, Minutely_Interval, Minutely_Repetitions," +
      "      	Hourly_Interval, Hourly_Repetitions, Daily_Interval, Day_Mon, Day_Tue," +
      "      	Day_Wed, Day_Thu, Day_Fri, Day_Sat, Day_Sun, Monthly_Option, Monthly_Specific_Day," +
      "      	Monthly_Day_Of_Week, Finishes, TO_CHAR(Finishes_Time, 'HH24:MI:SS') AS Finishes_Time, to_char(Finishes_Date, 'DD-MM-YYYY') as Finishes_Date," +
      "      	Daily_Option, Cron, r.Description, TO_CHAR(Next_Fire_Time, 'DD-MM-YYYY HH24:MI:SS') AS Next_Fire_Time, p.preventConcurrent, p.name as process_name, p.ad_process_id" +
      "      	FROM AD_Process_Request r, AD_Process p" +
      "      	WHERE AD_Process_Request_ID = ?" +
      "      	AND p.AD_Process_ID = r.AD_Process_ID";

    ResultSet result;
    TriggerData objectTriggerData = new TriggerData();
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        objectTriggerData.adProcessRequestId = UtilSql.getValue(result, "AD_PROCESS_REQUEST_ID");
        objectTriggerData.timingOption = UtilSql.getValue(result, "TIMING_OPTION");
        objectTriggerData.startTime = UtilSql.getValue(result, "START_TIME");
        objectTriggerData.startDate = UtilSql.getValue(result, "START_DATE");
        objectTriggerData.frequency = UtilSql.getValue(result, "FREQUENCY");
        objectTriggerData.secondlyInterval = UtilSql.getValue(result, "SECONDLY_INTERVAL");
        objectTriggerData.secondlyRepetitions = UtilSql.getValue(result, "SECONDLY_REPETITIONS");
        objectTriggerData.minutelyInterval = UtilSql.getValue(result, "MINUTELY_INTERVAL");
        objectTriggerData.minutelyRepetitions = UtilSql.getValue(result, "MINUTELY_REPETITIONS");
        objectTriggerData.hourlyInterval = UtilSql.getValue(result, "HOURLY_INTERVAL");
        objectTriggerData.hourlyRepetitions = UtilSql.getValue(result, "HOURLY_REPETITIONS");
        objectTriggerData.dailyInterval = UtilSql.getValue(result, "DAILY_INTERVAL");
        objectTriggerData.dayMon = UtilSql.getValue(result, "DAY_MON");
        objectTriggerData.dayTue = UtilSql.getValue(result, "DAY_TUE");
        objectTriggerData.dayWed = UtilSql.getValue(result, "DAY_WED");
        objectTriggerData.dayThu = UtilSql.getValue(result, "DAY_THU");
        objectTriggerData.dayFri = UtilSql.getValue(result, "DAY_FRI");
        objectTriggerData.daySat = UtilSql.getValue(result, "DAY_SAT");
        objectTriggerData.daySun = UtilSql.getValue(result, "DAY_SUN");
        objectTriggerData.monthlyOption = UtilSql.getValue(result, "MONTHLY_OPTION");
        objectTriggerData.monthlySpecificDay = UtilSql.getValue(result, "MONTHLY_SPECIFIC_DAY");
        objectTriggerData.monthlyDayOfWeek = UtilSql.getValue(result, "MONTHLY_DAY_OF_WEEK");
        objectTriggerData.finishes = UtilSql.getValue(result, "FINISHES");
        objectTriggerData.finishesTime = UtilSql.getValue(result, "FINISHES_TIME");
        objectTriggerData.finishesDate = UtilSql.getValue(result, "FINISHES_DATE");
        objectTriggerData.dailyOption = UtilSql.getValue(result, "DAILY_OPTION");
        objectTriggerData.cron = UtilSql.getValue(result, "CRON");
        objectTriggerData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectTriggerData.nextFireTime = UtilSql.getValue(result, "NEXT_FIRE_TIME");
        objectTriggerData.preventconcurrent = UtilSql.getValue(result, "PREVENTCONCURRENT");
        objectTriggerData.processName = UtilSql.getValue(result, "PROCESS_NAME");
        objectTriggerData.adProcessId = UtilSql.getValue(result, "AD_PROCESS_ID");
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
    return(objectTriggerData);
  }
}
