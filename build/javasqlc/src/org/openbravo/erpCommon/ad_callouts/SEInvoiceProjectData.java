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

class SEInvoiceProjectData implements FieldProvider {
static Logger log4j = Logger.getLogger(SEInvoiceProjectData.class);
  private String InitRecordNumber="0";
  public String paymentterm;
  public String paymentrule;
  public String finPaymentmethodId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PAYMENTTERM"))
      return paymentterm;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_ID") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SEInvoiceProjectData[] select(ConnectionProvider connectionProvider, String cProjectId)    throws ServletException {
    return select(connectionProvider, cProjectId, 0, 0);
  }

  public static SEInvoiceProjectData[] select(ConnectionProvider connectionProvider, String cProjectId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_PROJECT.C_PAYMENTTERM_ID AS PAYMENTTERM, C_PROJECT.PAYMENTRULE AS PAYMENTRULE, " +
      "        C_PROJECT.FIN_PAYMENTMETHOD_ID" +
      "        FROM C_PROJECT" +
      "        WHERE C_PROJECT_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);

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
        SEInvoiceProjectData objectSEInvoiceProjectData = new SEInvoiceProjectData();
        objectSEInvoiceProjectData.paymentterm = UtilSql.getValue(result, "PAYMENTTERM");
        objectSEInvoiceProjectData.paymentrule = UtilSql.getValue(result, "PAYMENTRULE");
        objectSEInvoiceProjectData.finPaymentmethodId = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_ID");
        objectSEInvoiceProjectData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSEInvoiceProjectData);
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
    SEInvoiceProjectData objectSEInvoiceProjectData[] = new SEInvoiceProjectData[vector.size()];
    vector.copyInto(objectSEInvoiceProjectData);
    return(objectSEInvoiceProjectData);
  }
}