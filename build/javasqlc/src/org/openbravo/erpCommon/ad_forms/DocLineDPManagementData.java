//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class DocLineDPManagementData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocLineDPManagementData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String cDpManagementlineId;
  public String statusFrom;
  public String statusTo;
  public String isreceipt;
  public String amount;
  public String cBpartnerId;
  public String cDebtPaymentId;
  public String cCurrencyId;
  public String ismanual;
  public String isdirectposting;
  public String conversiondate;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("C_DP_MANAGEMENTLINE_ID") || fieldName.equals("cDpManagementlineId"))
      return cDpManagementlineId;
    else if (fieldName.equalsIgnoreCase("STATUS_FROM") || fieldName.equals("statusFrom"))
      return statusFrom;
    else if (fieldName.equalsIgnoreCase("STATUS_TO") || fieldName.equals("statusTo"))
      return statusTo;
    else if (fieldName.equalsIgnoreCase("ISRECEIPT"))
      return isreceipt;
    else if (fieldName.equalsIgnoreCase("AMOUNT"))
      return amount;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_DEBT_PAYMENT_ID") || fieldName.equals("cDebtPaymentId"))
      return cDebtPaymentId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("ISMANUAL"))
      return ismanual;
    else if (fieldName.equalsIgnoreCase("ISDIRECTPOSTING"))
      return isdirectposting;
    else if (fieldName.equalsIgnoreCase("CONVERSIONDATE"))
      return conversiondate;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocLineDPManagementData[] select(ConnectionProvider connectionProvider, String C_DP_ManagementLine_ID)    throws ServletException {
    return select(connectionProvider, C_DP_ManagementLine_ID, 0, 0);
  }

  public static DocLineDPManagementData[] select(ConnectionProvider connectionProvider, String C_DP_ManagementLine_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ml.AD_ORG_ID, ml.C_DP_MANAGEMENTLINE_ID, STATUS_FROM, STATUS_TO, DP.ISRECEIPT, AMOUNT, DP.C_BPARTNER_ID," +
      "        ML.C_DEBT_PAYMENT_ID, DP.C_CURRENCY_ID, DP.ISMANUAL, DP.ISDIRECTPOSTING," +
      "                                  TRUNC(COALESCE((SELECT O.DATEACCT" +
      "                                  FROM C_ORDER O" +
      "                                        WHERE DP.C_ORDER_ID = O.C_ORDER_ID)," +
      "                                     (SELECT I.DATEACCT" +
      "                                       FROM C_INVOICE I" +
      "                                        WHERE DP.C_INVOICE_ID = I.C_INVOICE_ID)," +
      "                                    (SELECT ST2.DATEACCT" +
      "                                     FROM C_SETTLEMENT ST2" +
      "                                     WHERE DP.C_SETTLEMENT_GENERATE_ID = ST2.C_SETTLEMENT_ID))) AS CONVERSIONDATE" +
      "          FROM C_DP_MANAGEMENTLINE ML," +
      "               C_DEBT_PAYMENT   DP" +
      "         WHERE C_DP_MANAGEMENT_ID = ?" +
      "           AND DP.C_DEBT_PAYMENT_ID = ML.C_DEBT_PAYMENT_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_DP_ManagementLine_ID);

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
        DocLineDPManagementData objectDocLineDPManagementData = new DocLineDPManagementData();
        objectDocLineDPManagementData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocLineDPManagementData.cDpManagementlineId = UtilSql.getValue(result, "C_DP_MANAGEMENTLINE_ID");
        objectDocLineDPManagementData.statusFrom = UtilSql.getValue(result, "STATUS_FROM");
        objectDocLineDPManagementData.statusTo = UtilSql.getValue(result, "STATUS_TO");
        objectDocLineDPManagementData.isreceipt = UtilSql.getValue(result, "ISRECEIPT");
        objectDocLineDPManagementData.amount = UtilSql.getValue(result, "AMOUNT");
        objectDocLineDPManagementData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocLineDPManagementData.cDebtPaymentId = UtilSql.getValue(result, "C_DEBT_PAYMENT_ID");
        objectDocLineDPManagementData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocLineDPManagementData.ismanual = UtilSql.getValue(result, "ISMANUAL");
        objectDocLineDPManagementData.isdirectposting = UtilSql.getValue(result, "ISDIRECTPOSTING");
        objectDocLineDPManagementData.conversiondate = UtilSql.getDateValue(result, "CONVERSIONDATE", "dd-MM-yyyy");
        objectDocLineDPManagementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineDPManagementData);
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
    DocLineDPManagementData objectDocLineDPManagementData[] = new DocLineDPManagementData[vector.size()];
    vector.copyInto(objectDocLineDPManagementData);
    return(objectDocLineDPManagementData);
  }
}
