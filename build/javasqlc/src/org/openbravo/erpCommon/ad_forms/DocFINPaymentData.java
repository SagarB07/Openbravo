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

class DocFINPaymentData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocFINPaymentData.class);
  private String InitRecordNumber="0";
  public String cCostcenterId;
  public String user1Id;
  public String user2Id;
  public String issales;
  public String ispurchase;
  public String unclassreceive;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("ISSALES"))
      return issales;
    else if (fieldName.equalsIgnoreCase("ISPURCHASE"))
      return ispurchase;
    else if (fieldName.equalsIgnoreCase("UNCLASSRECEIVE"))
      return unclassreceive;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocFINPaymentData[] select(ConnectionProvider connectionProvider, String paymentId)    throws ServletException {
    return select(connectionProvider, paymentId, 0, 0);
  }

  public static DocFINPaymentData[] select(ConnectionProvider connectionProvider, String paymentId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c_costcenter_id,user1_id, user2_id," +
      "        '' AS issales, '' AS ispurchase, '' AS UNCLASSRECEIVE" +
      "        FROM fin_payment" +
      "        WHERE fin_payment_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentId);

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
        DocFINPaymentData objectDocFINPaymentData = new DocFINPaymentData();
        objectDocFINPaymentData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocFINPaymentData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocFINPaymentData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocFINPaymentData.issales = UtilSql.getValue(result, "ISSALES");
        objectDocFINPaymentData.ispurchase = UtilSql.getValue(result, "ISPURCHASE");
        objectDocFINPaymentData.unclassreceive = UtilSql.getValue(result, "UNCLASSRECEIVE");
        objectDocFINPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocFINPaymentData);
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
    DocFINPaymentData objectDocFINPaymentData[] = new DocFINPaymentData[vector.size()];
    vector.copyInto(objectDocFINPaymentData);
    return(objectDocFINPaymentData);
  }

  public static String selectIsSales(ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT EM_Gap_IscSales_Acct AS issales FROM AD_Client" +
      "      WHERE AD_Client_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISSALES");
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
    return(strReturn);
  }

  public static String selectIsPurchase(ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT EM_Gap_IscPrch_Acct AS ispurchase FROM AD_Client" +
      "      WHERE AD_Client_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISPURCHASE");
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
    return(strReturn);
  }

  public static DocFINPaymentData[] selectAccountUnclass(ConnectionProvider connectionProvider, String finFinancialAcct, String AcctSchema)    throws ServletException {
    return selectAccountUnclass(connectionProvider, finFinancialAcct, AcctSchema, 0, 0);
  }

  public static DocFINPaymentData[] selectAccountUnclass(ConnectionProvider connectionProvider, String finFinancialAcct, String AcctSchema, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT FCT.EM_GAP_UNCLASS_RC_ACCT AS UNCLASSRECEIVE" +
      "        FROM FIN_FINANCIAL_ACCOUNT FA, FIN_FINANCIAL_ACCOUNT_ACCT FCT" +
      "        WHERE FA.FIN_FINANCIAL_ACCOUNT_ID = FCT.FIN_FINANCIAL_ACCOUNT_ID" +
      "        AND FA.FIN_FINANCIAL_ACCOUNT_ID = ?" +
      "        AND FCT.C_ACCTSCHEMA_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AcctSchema);

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
        DocFINPaymentData objectDocFINPaymentData = new DocFINPaymentData();
        objectDocFINPaymentData.unclassreceive = UtilSql.getValue(result, "UNCLASSRECEIVE");
        objectDocFINPaymentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocFINPaymentData);
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
    DocFINPaymentData objectDocFINPaymentData[] = new DocFINPaymentData[vector.size()];
    vector.copyInto(objectDocFINPaymentData);
    return(objectDocFINPaymentData);
  }
}
