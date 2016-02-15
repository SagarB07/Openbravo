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

class AcctSchemaData implements FieldProvider {
static Logger log4j = Logger.getLogger(AcctSchemaData.class);
  private String InitRecordNumber="0";
  public String name;
  public String gaap;
  public String isaccrual;
  public String costingmethod;
  public String cCurrencyId;
  public String hasalias;
  public String istradediscountposted;
  public String isdiscountcorrectstax;
  public String adClientId;
  public String usesuspensebalancing;
  public String suspensebalancingAcct;
  public String usesuspenseerror;
  public String suspenseerrorAcct;
  public String usecurrencybalancing;
  public String currencybalancingAcct;
  public String retainedearningAcct;
  public String incomesummaryAcct;
  public String intercompanyduetoAcct;
  public String intercompanyduefromAcct;
  public String cAcctschemaId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("GAAP"))
      return gaap;
    else if (fieldName.equalsIgnoreCase("ISACCRUAL"))
      return isaccrual;
    else if (fieldName.equalsIgnoreCase("COSTINGMETHOD"))
      return costingmethod;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("HASALIAS"))
      return hasalias;
    else if (fieldName.equalsIgnoreCase("ISTRADEDISCOUNTPOSTED"))
      return istradediscountposted;
    else if (fieldName.equalsIgnoreCase("ISDISCOUNTCORRECTSTAX"))
      return isdiscountcorrectstax;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("USESUSPENSEBALANCING"))
      return usesuspensebalancing;
    else if (fieldName.equalsIgnoreCase("SUSPENSEBALANCING_ACCT") || fieldName.equals("suspensebalancingAcct"))
      return suspensebalancingAcct;
    else if (fieldName.equalsIgnoreCase("USESUSPENSEERROR"))
      return usesuspenseerror;
    else if (fieldName.equalsIgnoreCase("SUSPENSEERROR_ACCT") || fieldName.equals("suspenseerrorAcct"))
      return suspenseerrorAcct;
    else if (fieldName.equalsIgnoreCase("USECURRENCYBALANCING"))
      return usecurrencybalancing;
    else if (fieldName.equalsIgnoreCase("CURRENCYBALANCING_ACCT") || fieldName.equals("currencybalancingAcct"))
      return currencybalancingAcct;
    else if (fieldName.equalsIgnoreCase("RETAINEDEARNING_ACCT") || fieldName.equals("retainedearningAcct"))
      return retainedearningAcct;
    else if (fieldName.equalsIgnoreCase("INCOMESUMMARY_ACCT") || fieldName.equals("incomesummaryAcct"))
      return incomesummaryAcct;
    else if (fieldName.equalsIgnoreCase("INTERCOMPANYDUETO_ACCT") || fieldName.equals("intercompanyduetoAcct"))
      return intercompanyduetoAcct;
    else if (fieldName.equalsIgnoreCase("INTERCOMPANYDUEFROM_ACCT") || fieldName.equals("intercompanyduefromAcct"))
      return intercompanyduefromAcct;
    else if (fieldName.equalsIgnoreCase("C_ACCTSCHEMA_ID") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AcctSchemaData[] select(ConnectionProvider connectionProvider, String C_AcctSchema_ID)    throws ServletException {
    return select(connectionProvider, C_AcctSchema_ID, 0, 0);
  }

  public static AcctSchemaData[] select(ConnectionProvider connectionProvider, String C_AcctSchema_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT Name,GAAP,IsAccrual,CostingMethod,C_Currency_ID,HasAlias, IsTradeDiscountPosted," +
      "      IsDiscountCorrectsTax, AD_Client_ID, '' as UseSuspenseBalancing, '' as SuspenseBalancing_Acct," +
      "      '' as UseSuspenseError, '' as SuspenseError_Acct, '' as UseCurrencyBalancing, '' as CurrencyBalancing_Acct," +
      "      '' as RetainedEarning_Acct, '' as IncomeSummary_Acct, '' as InterCompanyDueTo_Acct, '' as InterCompanyDueFrom_Acct," +
      "      '' as C_AcctSchema_ID" +
      "      FROM C_AcctSchema" +
      "      WHERE C_AcctSchema_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_AcctSchema_ID);

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
        AcctSchemaData objectAcctSchemaData = new AcctSchemaData();
        objectAcctSchemaData.name = UtilSql.getValue(result, "NAME");
        objectAcctSchemaData.gaap = UtilSql.getValue(result, "GAAP");
        objectAcctSchemaData.isaccrual = UtilSql.getValue(result, "ISACCRUAL");
        objectAcctSchemaData.costingmethod = UtilSql.getValue(result, "COSTINGMETHOD");
        objectAcctSchemaData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectAcctSchemaData.hasalias = UtilSql.getValue(result, "HASALIAS");
        objectAcctSchemaData.istradediscountposted = UtilSql.getValue(result, "ISTRADEDISCOUNTPOSTED");
        objectAcctSchemaData.isdiscountcorrectstax = UtilSql.getValue(result, "ISDISCOUNTCORRECTSTAX");
        objectAcctSchemaData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAcctSchemaData.usesuspensebalancing = UtilSql.getValue(result, "USESUSPENSEBALANCING");
        objectAcctSchemaData.suspensebalancingAcct = UtilSql.getValue(result, "SUSPENSEBALANCING_ACCT");
        objectAcctSchemaData.usesuspenseerror = UtilSql.getValue(result, "USESUSPENSEERROR");
        objectAcctSchemaData.suspenseerrorAcct = UtilSql.getValue(result, "SUSPENSEERROR_ACCT");
        objectAcctSchemaData.usecurrencybalancing = UtilSql.getValue(result, "USECURRENCYBALANCING");
        objectAcctSchemaData.currencybalancingAcct = UtilSql.getValue(result, "CURRENCYBALANCING_ACCT");
        objectAcctSchemaData.retainedearningAcct = UtilSql.getValue(result, "RETAINEDEARNING_ACCT");
        objectAcctSchemaData.incomesummaryAcct = UtilSql.getValue(result, "INCOMESUMMARY_ACCT");
        objectAcctSchemaData.intercompanyduetoAcct = UtilSql.getValue(result, "INTERCOMPANYDUETO_ACCT");
        objectAcctSchemaData.intercompanyduefromAcct = UtilSql.getValue(result, "INTERCOMPANYDUEFROM_ACCT");
        objectAcctSchemaData.cAcctschemaId = UtilSql.getValue(result, "C_ACCTSCHEMA_ID");
        objectAcctSchemaData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAcctSchemaData);
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
    AcctSchemaData objectAcctSchemaData[] = new AcctSchemaData[vector.size()];
    vector.copyInto(objectAcctSchemaData);
    return(objectAcctSchemaData);
  }

  public static AcctSchemaData[] selectAcctSchemaGL(ConnectionProvider connectionProvider, String C_AcctSchema_ID)    throws ServletException {
    return selectAcctSchemaGL(connectionProvider, C_AcctSchema_ID, 0, 0);
  }

  public static AcctSchemaData[] selectAcctSchemaGL(ConnectionProvider connectionProvider, String C_AcctSchema_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT UseSuspenseBalancing,SuspenseBalancing_Acct, UseSuspenseError,SuspenseError_Acct, UseCurrencyBalancing," +
      "      CurrencyBalancing_Acct, RetainedEarning_Acct,IncomeSummary_Acct, InterCompanyDueTo_Acct,InterCompanyDueFrom_Acct" +
      "      FROM C_AcctSchema_GL" +
      "      WHERE C_AcctSchema_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_AcctSchema_ID);

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
        AcctSchemaData objectAcctSchemaData = new AcctSchemaData();
        objectAcctSchemaData.usesuspensebalancing = UtilSql.getValue(result, "USESUSPENSEBALANCING");
        objectAcctSchemaData.suspensebalancingAcct = UtilSql.getValue(result, "SUSPENSEBALANCING_ACCT");
        objectAcctSchemaData.usesuspenseerror = UtilSql.getValue(result, "USESUSPENSEERROR");
        objectAcctSchemaData.suspenseerrorAcct = UtilSql.getValue(result, "SUSPENSEERROR_ACCT");
        objectAcctSchemaData.usecurrencybalancing = UtilSql.getValue(result, "USECURRENCYBALANCING");
        objectAcctSchemaData.currencybalancingAcct = UtilSql.getValue(result, "CURRENCYBALANCING_ACCT");
        objectAcctSchemaData.retainedearningAcct = UtilSql.getValue(result, "RETAINEDEARNING_ACCT");
        objectAcctSchemaData.incomesummaryAcct = UtilSql.getValue(result, "INCOMESUMMARY_ACCT");
        objectAcctSchemaData.intercompanyduetoAcct = UtilSql.getValue(result, "INTERCOMPANYDUETO_ACCT");
        objectAcctSchemaData.intercompanyduefromAcct = UtilSql.getValue(result, "INTERCOMPANYDUEFROM_ACCT");
        objectAcctSchemaData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAcctSchemaData);
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
    AcctSchemaData objectAcctSchemaData[] = new AcctSchemaData[vector.size()];
    vector.copyInto(objectAcctSchemaData);
    return(objectAcctSchemaData);
  }

  public static AcctSchemaData[] selectAcctSchemas(ConnectionProvider connectionProvider, String AD_Client_ID, String AD_Org_ID)    throws ServletException {
    return selectAcctSchemas(connectionProvider, AD_Client_ID, AD_Org_ID, 0, 0);
  }

  public static AcctSchemaData[] selectAcctSchemas(ConnectionProvider connectionProvider, String AD_Client_ID, String AD_Org_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		SELECT distinct ad_org_acctschema.C_AcctSchema_ID" +
      "		FROM ad_org_acctschema, c_acctschema" +
      "		WHERE ad_org_acctschema.c_acctschema_id = c_acctschema.c_acctschema_id" +
      "		 and ad_org_acctschema.AD_Client_ID=?" +
      "		 and (ad_isorgincluded(?, ad_org_acctschema.AD_org_ID, ad_org_acctschema.AD_Client_ID) <> -1 OR ? = '0')" +
      "		 and c_acctschema.isactive = 'Y'" +
      "		 and ad_org_acctschema.isactive = 'Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Client_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Org_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Org_ID);

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
        AcctSchemaData objectAcctSchemaData = new AcctSchemaData();
        objectAcctSchemaData.cAcctschemaId = UtilSql.getValue(result, "C_ACCTSCHEMA_ID");
        objectAcctSchemaData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAcctSchemaData);
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
    AcctSchemaData objectAcctSchemaData[] = new AcctSchemaData[vector.size()];
    vector.copyInto(objectAcctSchemaData);
    return(objectAcctSchemaData);
  }

  public static boolean selectAcctSchemaTable(ConnectionProvider connectionProvider, String c_acctschema_id, String ad_table_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT count(C_ACCTSCHEMA_TABLE_ID) AS TOTAL FROM C_ACCTSCHEMA_TABLE" +
      "        WHERE C_ACCTSCHEMA_ID = ?" +
      "        AND AD_TABLE_ID = ?" +
      "        AND ISACTIVE = 'Y'";

    ResultSet result;
    boolean boolReturn = false;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_acctschema_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_table_id);

      result = st.executeQuery();
      if(result.next()) {
        boolReturn = !UtilSql.getValue(result, "TOTAL").equals("0");
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
    return(boolReturn);
  }
}
