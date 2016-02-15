//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class SLWorkRequirementSequence implements FieldProvider {
static Logger log4j = Logger.getLogger(SLWorkRequirementSequence.class);
  private String InitRecordNumber="0";
  public String maProcessId;
  public String costcenteruse;
  public String preptime;
  public String noqty;
  public String groupuse;
  public String quantity;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("MA_PROCESS_ID") || fieldName.equals("maProcessId"))
      return maProcessId;
    else if (fieldName.equalsIgnoreCase("COSTCENTERUSE"))
      return costcenteruse;
    else if (fieldName.equalsIgnoreCase("PREPTIME"))
      return preptime;
    else if (fieldName.equalsIgnoreCase("NOQTY"))
      return noqty;
    else if (fieldName.equalsIgnoreCase("GROUPUSE"))
      return groupuse;
    else if (fieldName.equalsIgnoreCase("QUANTITY"))
      return quantity;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLWorkRequirementSequence[] select(ConnectionProvider connectionProvider, String maSequenceId)    throws ServletException {
    return select(connectionProvider, maSequenceId, 0, 0);
  }

  public static SLWorkRequirementSequence[] select(ConnectionProvider connectionProvider, String maSequenceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  s.MA_Process_ID, s.COSTCENTERUSE, s.PREPTIME, s.NOQTY, s.GROUPUSE, '' AS quantity" +
      "        FROM    MA_Sequence s" +
      "        WHERE   MA_Sequence_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maSequenceId);

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
        SLWorkRequirementSequence objectSLWorkRequirementSequence = new SLWorkRequirementSequence();
        objectSLWorkRequirementSequence.maProcessId = UtilSql.getValue(result, "MA_PROCESS_ID");
        objectSLWorkRequirementSequence.costcenteruse = UtilSql.getValue(result, "COSTCENTERUSE");
        objectSLWorkRequirementSequence.preptime = UtilSql.getValue(result, "PREPTIME");
        objectSLWorkRequirementSequence.noqty = UtilSql.getValue(result, "NOQTY");
        objectSLWorkRequirementSequence.groupuse = UtilSql.getValue(result, "GROUPUSE");
        objectSLWorkRequirementSequence.quantity = UtilSql.getValue(result, "QUANTITY");
        objectSLWorkRequirementSequence.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLWorkRequirementSequence);
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
    SLWorkRequirementSequence objectSLWorkRequirementSequence[] = new SLWorkRequirementSequence[vector.size()];
    vector.copyInto(objectSLWorkRequirementSequence);
    return(objectSLWorkRequirementSequence);
  }
}
