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
import org.openbravo.database.RDBMSIndependent;
import org.openbravo.exception.*;

class AccountData implements FieldProvider {
static Logger log4j = Logger.getLogger(AccountData.class);
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String updated;
  public String updatedby;
  public String alias;
  public String combination;
  public String description;
  public String isfullyqualified;
  public String cAcctschemaId;
  public String accountId;
  public String mProductId;
  public String cBpartnerId;
  public String adOrgtrxId;
  public String cLocfromId;
  public String cLoctoId;
  public String cSalesregionId;
  public String cProjectId;
  public String cCampaignId;
  public String cActivityId;
  public String user1Id;
  public String user2Id;
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

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("ALIAS"))
      return alias;
    else if (fieldName.equalsIgnoreCase("COMBINATION"))
      return combination;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ISFULLYQUALIFIED"))
      return isfullyqualified;
    else if (fieldName.equalsIgnoreCase("C_ACCTSCHEMA_ID") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
    else if (fieldName.equalsIgnoreCase("ACCOUNT_ID") || fieldName.equals("accountId"))
      return accountId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("C_LOCFROM_ID") || fieldName.equals("cLocfromId"))
      return cLocfromId;
    else if (fieldName.equalsIgnoreCase("C_LOCTO_ID") || fieldName.equals("cLoctoId"))
      return cLoctoId;
    else if (fieldName.equalsIgnoreCase("C_SALESREGION_ID") || fieldName.equals("cSalesregionId"))
      return cSalesregionId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
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
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AccountData[] select(ConnectionProvider connectionProvider, String C_AcctSchema_ID)    throws ServletException {
    return select(connectionProvider, C_AcctSchema_ID, 0, 0);
  }

  public static AccountData[] select(ConnectionProvider connectionProvider, String C_AcctSchema_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_CLIENT_ID,AD_ORG_ID, ISACTIVE, UPDATED,UPDATEDBY,ALIAS, COMBINATION, DESCRIPTION, ISFULLYQUALIFIED," +
      "      C_ACCTSCHEMA_ID, ACCOUNT_ID, M_PRODUCT_ID, C_BPARTNER_ID,AD_ORGTRX_ID, C_LOCFROM_ID, C_LOCTO_ID, C_SALESREGION_ID," +
      "      C_PROJECT_ID, C_CAMPAIGN_ID, C_ACTIVITY_ID, USER1_ID,USER2_ID, '' as UseSuspenseBalancing, '' as SuspenseBalancing_Acct," +
      "      '' as UseSuspenseError, '' as SuspenseError_Acct, '' as UseCurrencyBalancing, '' as CurrencyBalancing_Acct, " +
      "      '' as RetainedEarning_Acct, '' as IncomeSummary_Acct, '' as InterCompanyDueTo_Acct, '' as InterCompanyDueFrom_Acct" +
      "      FROM C_ValidCombination " +
      "      WHERE C_ValidCombination_ID=?";

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
        AccountData objectAccountData = new AccountData();
        objectAccountData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAccountData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAccountData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectAccountData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectAccountData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectAccountData.alias = UtilSql.getValue(result, "ALIAS");
        objectAccountData.combination = UtilSql.getValue(result, "COMBINATION");
        objectAccountData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAccountData.isfullyqualified = UtilSql.getValue(result, "ISFULLYQUALIFIED");
        objectAccountData.cAcctschemaId = UtilSql.getValue(result, "C_ACCTSCHEMA_ID");
        objectAccountData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectAccountData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectAccountData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectAccountData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectAccountData.cLocfromId = UtilSql.getValue(result, "C_LOCFROM_ID");
        objectAccountData.cLoctoId = UtilSql.getValue(result, "C_LOCTO_ID");
        objectAccountData.cSalesregionId = UtilSql.getValue(result, "C_SALESREGION_ID");
        objectAccountData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectAccountData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectAccountData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectAccountData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectAccountData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectAccountData.usesuspensebalancing = UtilSql.getValue(result, "USESUSPENSEBALANCING");
        objectAccountData.suspensebalancingAcct = UtilSql.getValue(result, "SUSPENSEBALANCING_ACCT");
        objectAccountData.usesuspenseerror = UtilSql.getValue(result, "USESUSPENSEERROR");
        objectAccountData.suspenseerrorAcct = UtilSql.getValue(result, "SUSPENSEERROR_ACCT");
        objectAccountData.usecurrencybalancing = UtilSql.getValue(result, "USECURRENCYBALANCING");
        objectAccountData.currencybalancingAcct = UtilSql.getValue(result, "CURRENCYBALANCING_ACCT");
        objectAccountData.retainedearningAcct = UtilSql.getValue(result, "RETAINEDEARNING_ACCT");
        objectAccountData.incomesummaryAcct = UtilSql.getValue(result, "INCOMESUMMARY_ACCT");
        objectAccountData.intercompanyduetoAcct = UtilSql.getValue(result, "INTERCOMPANYDUETO_ACCT");
        objectAccountData.intercompanyduefromAcct = UtilSql.getValue(result, "INTERCOMPANYDUEFROM_ACCT");
        objectAccountData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountData);
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
    AccountData objectAccountData[] = new AccountData[vector.size()];
    vector.copyInto(objectAccountData);
    return(objectAccountData);
  }

  public static AccountData[] selectConnection(Connection conn, ConnectionProvider connectionProvider, String C_AcctSchema_ID)    throws ServletException {
    return selectConnection(conn, connectionProvider, C_AcctSchema_ID, 0, 0);
  }

  public static AccountData[] selectConnection(Connection conn, ConnectionProvider connectionProvider, String C_AcctSchema_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_CLIENT_ID,AD_ORG_ID, ISACTIVE, UPDATED,UPDATEDBY,ALIAS, COMBINATION, DESCRIPTION, ISFULLYQUALIFIED," +
      "      C_ACCTSCHEMA_ID, ACCOUNT_ID, M_PRODUCT_ID, C_BPARTNER_ID,AD_ORGTRX_ID, C_LOCFROM_ID, C_LOCTO_ID, C_SALESREGION_ID," +
      "      C_PROJECT_ID, C_CAMPAIGN_ID, C_ACTIVITY_ID, USER1_ID,USER2_ID, '' as UseSuspenseBalancing, '' as SuspenseBalancing_Acct," +
      "      '' as UseSuspenseError, '' as SuspenseError_Acct, '' as UseCurrencyBalancing, '' as CurrencyBalancing_Acct, " +
      "      '' as RetainedEarning_Acct, '' as IncomeSummary_Acct, '' as InterCompanyDueTo_Acct, '' as InterCompanyDueFrom_Acct" +
      "      FROM C_ValidCombination " +
      "      WHERE C_ValidCombination_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
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
        AccountData objectAccountData = new AccountData();
        objectAccountData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAccountData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAccountData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectAccountData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectAccountData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectAccountData.alias = UtilSql.getValue(result, "ALIAS");
        objectAccountData.combination = UtilSql.getValue(result, "COMBINATION");
        objectAccountData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAccountData.isfullyqualified = UtilSql.getValue(result, "ISFULLYQUALIFIED");
        objectAccountData.cAcctschemaId = UtilSql.getValue(result, "C_ACCTSCHEMA_ID");
        objectAccountData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectAccountData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectAccountData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectAccountData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectAccountData.cLocfromId = UtilSql.getValue(result, "C_LOCFROM_ID");
        objectAccountData.cLoctoId = UtilSql.getValue(result, "C_LOCTO_ID");
        objectAccountData.cSalesregionId = UtilSql.getValue(result, "C_SALESREGION_ID");
        objectAccountData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectAccountData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectAccountData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectAccountData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectAccountData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectAccountData.usesuspensebalancing = UtilSql.getValue(result, "USESUSPENSEBALANCING");
        objectAccountData.suspensebalancingAcct = UtilSql.getValue(result, "SUSPENSEBALANCING_ACCT");
        objectAccountData.usesuspenseerror = UtilSql.getValue(result, "USESUSPENSEERROR");
        objectAccountData.suspenseerrorAcct = UtilSql.getValue(result, "SUSPENSEERROR_ACCT");
        objectAccountData.usecurrencybalancing = UtilSql.getValue(result, "USECURRENCYBALANCING");
        objectAccountData.currencybalancingAcct = UtilSql.getValue(result, "CURRENCYBALANCING_ACCT");
        objectAccountData.retainedearningAcct = UtilSql.getValue(result, "RETAINEDEARNING_ACCT");
        objectAccountData.incomesummaryAcct = UtilSql.getValue(result, "INCOMESUMMARY_ACCT");
        objectAccountData.intercompanyduetoAcct = UtilSql.getValue(result, "INTERCOMPANYDUETO_ACCT");
        objectAccountData.intercompanyduefromAcct = UtilSql.getValue(result, "INTERCOMPANYDUEFROM_ACCT");
        objectAccountData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountData);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    AccountData objectAccountData[] = new AccountData[vector.size()];
    vector.copyInto(objectAccountData);
    return(objectAccountData);
  }

  public static RespuestaCS GetValidAccountCombination(Connection conn, ConnectionProvider connectionProvider, String AdClientId, String AdOrgId, String CAcctSchemaId, String AccountId, String CInValidCombinationId, String mustBeFullyQualified, String alias, String createdBy, String MProductId, String CBPartnerId, String AdOrgTrxId, String CLocFromId, String CLocToId, String CSalesRegionId, String CProjectId, String CCampaignId, String CActivityId, String user1Id, String user2Id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        CALL C_ValidCombination_Get(?,?,?,?," +
      "                                    ?,?,?,?," +
      "                                    ?,?,?,?,?,?,?, ?,?,?,?,?)";

    RespuestaCS objectRespuestaCS = new RespuestaCS();
    CallableStatement st = null;
    if (connectionProvider.getRDBMS().equalsIgnoreCase("ORACLE")) {

    int iParameter = 0;
    try {
      st = connectionProvider.getCallableStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      int iParameterCValidCombinationId = iParameter + 1;
      iParameter++; st.registerOutParameter(iParameter, 12);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AdClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AdOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CAcctSchemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CInValidCombinationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mustBeFullyQualified);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, alias);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdBy);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, MProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CBPartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AdOrgTrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CLocFromId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CLocToId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CSalesRegionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);

      st.execute();
      objectRespuestaCS.CValidCombinationId= UtilSql.getStringCallableStatement(st, iParameterCValidCombinationId);
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    }
    else {
      Vector<String> parametersData = new Vector<String>();
      Vector<String> parametersTypes = new Vector<String>();
      parametersData.addElement("CValidCombinationId");
      parametersTypes.addElement("out");
      parametersData.addElement(AdClientId);
      parametersTypes.addElement("in");
      parametersData.addElement(AdOrgId);
      parametersTypes.addElement("in");
      parametersData.addElement(CAcctSchemaId);
      parametersTypes.addElement("in");
      parametersData.addElement(AccountId);
      parametersTypes.addElement("in");
      parametersData.addElement(CInValidCombinationId);
      parametersTypes.addElement("in");
      parametersData.addElement(mustBeFullyQualified);
      parametersTypes.addElement("in");
      parametersData.addElement(alias);
      parametersTypes.addElement("in");
      parametersData.addElement(createdBy);
      parametersTypes.addElement("in");
      parametersData.addElement(MProductId);
      parametersTypes.addElement("in");
      parametersData.addElement(CBPartnerId);
      parametersTypes.addElement("in");
      parametersData.addElement(AdOrgTrxId);
      parametersTypes.addElement("in");
      parametersData.addElement(CLocFromId);
      parametersTypes.addElement("in");
      parametersData.addElement(CLocToId);
      parametersTypes.addElement("in");
      parametersData.addElement(CSalesRegionId);
      parametersTypes.addElement("in");
      parametersData.addElement(CProjectId);
      parametersTypes.addElement("in");
      parametersData.addElement(CCampaignId);
      parametersTypes.addElement("in");
      parametersData.addElement(CActivityId);
      parametersTypes.addElement("in");
      parametersData.addElement(user1Id);
      parametersTypes.addElement("in");
      parametersData.addElement(user2Id);
      parametersTypes.addElement("in");
      Vector<String> vecTotal = new Vector<String>();
      try {
        vecTotal =       RDBMSIndependent.getCallableResult(conn, connectionProvider, strSql, parametersData, parametersTypes, 1);
      objectRespuestaCS.CValidCombinationId = (String) vecTotal.elementAt(0);
      } catch(SQLException e){
        log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
        throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
      } catch(NoConnectionAvailableException ec){
        log4j.error("Connection error in query: " + strSql + "Exception:"+ ec);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(PoolNotFoundException ep){
        log4j.error("Pool error in query: " + strSql + "Exception:"+ ep);
        throw new ServletException("@CODE=NoConnectionAvailable");
      } catch(Exception ex){
        log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
        throw new ServletException("@CODE=@" + ex.getMessage());
      }
    }
    return(objectRespuestaCS);
  }
}
