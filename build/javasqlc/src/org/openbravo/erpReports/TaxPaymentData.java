//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class TaxPaymentData implements FieldProvider {
static Logger log4j = Logger.getLogger(TaxPaymentData.class);
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String cTaxpaymentId;
  public String name;
  public String datefrom;
  public String dateto;
  public String generatepayment;
  public String processing;
  public String processed;
  public String cSettlementId;
  public String glJournalId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("C_TAXPAYMENT_ID") || fieldName.equals("cTaxpaymentId"))
      return cTaxpaymentId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DATEFROM"))
      return datefrom;
    else if (fieldName.equalsIgnoreCase("DATETO"))
      return dateto;
    else if (fieldName.equalsIgnoreCase("GENERATEPAYMENT"))
      return generatepayment;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("C_SETTLEMENT_ID") || fieldName.equals("cSettlementId"))
      return cSettlementId;
    else if (fieldName.equalsIgnoreCase("GL_JOURNAL_ID") || fieldName.equals("glJournalId"))
      return glJournalId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Tax Payment for a period
 */
  public static TaxPaymentData[] select(ConnectionProvider connectionProvider, String parTaxPaymId)    throws ServletException {
    return select(connectionProvider, parTaxPaymId, 0, 0);
  }

/**
Tax Payment for a period
 */
  public static TaxPaymentData[] select(ConnectionProvider connectionProvider, String parTaxPaymId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_Client_ID, AD_Org_ID, C_TaxPayment_ID, Name, DateFrom, DateTo, GeneratePayment, Processing, Processed, C_Settlement_ID,GL_Journal_ID" +
      "		FROM C_TAXPAYMENT" +
      "		WHERE 1=1";
    strSql = strSql + ((parTaxPaymId==null || parTaxPaymId.equals(""))?"":"  and c_taxpayment_id in ( ? )   ");

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (parTaxPaymId != null && !(parTaxPaymId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parTaxPaymId);
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
        TaxPaymentData objectTaxPaymentData = new TaxPaymentData();
        objectTaxPaymentData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectTaxPaymentData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectTaxPaymentData.cTaxpaymentId = UtilSql.getValue(result, "C_TAXPAYMENT_ID");
        objectTaxPaymentData.name = UtilSql.getValue(result, "NAME");
        objectTaxPaymentData.datefrom = UtilSql.getDateValue(result, "DATEFROM", "dd-MM-yyyy");
        objectTaxPaymentData.dateto = UtilSql.getDateValue(result, "DATETO", "dd-MM-yyyy");
        objectTaxPaymentData.generatepayment = UtilSql.getValue(result, "GENERATEPAYMENT");
        objectTaxPaymentData.processing = UtilSql.getValue(result, "PROCESSING");
        objectTaxPaymentData.processed = UtilSql.getValue(result, "PROCESSED");
        objectTaxPaymentData.cSettlementId = UtilSql.getValue(result, "C_SETTLEMENT_ID");
        objectTaxPaymentData.glJournalId = UtilSql.getValue(result, "GL_JOURNAL_ID");
        objectTaxPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTaxPaymentData);
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
    TaxPaymentData objectTaxPaymentData[] = new TaxPaymentData[vector.size()];
    vector.copyInto(objectTaxPaymentData);
    return(objectTaxPaymentData);
  }
}
