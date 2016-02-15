//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.GeneralLedgerConfiguration;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

/**
WAD Generated class
 */
class DefaultsData implements FieldProvider {
static Logger log4j = Logger.getLogger(DefaultsData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cReceivableAcct;
  public String cPrepaymentAcct;
  public String writeoffAcct;
  public String writeoffRevAcct;
  public String vLiabilityAcct;
  public String vPrepaymentAcct;
  public String notinvoicedreceiptsAcct;
  public String doubtfuldebtAcct;
  public String baddebtexpenseAcct;
  public String baddebtrevenueAcct;
  public String allowancefordoubtfulAcct;
  public String pAssetAcct;
  public String pExpenseAcct;
  public String pDefExpenseAcct;
  public String pRevenueAcct;
  public String pDefRevenueAcct;
  public String pCogsAcct;
  public String withholdingAcct;
  public String pInvoicepricevarianceAcct;
  public String pRevenueReturnAcct;
  public String pCogsReturnAcct;
  public String wInventoryAcct;
  public String wDifferencesAcct;
  public String wRevaluationAcct;
  public String pjWipAcct;
  public String bAssetAcct;
  public String bIntransitAcct;
  public String bExpenseAcct;
  public String bRevaluationgainAcct;
  public String bRevaluationlossAcct;
  public String tDueAcct;
  public String tCreditAcct;
  public String chExpenseAcct;
  public String cbAssetAcct;
  public String cbDifferencesAcct;
  public String cbCashtransferAcct;
  public String cbExpenseAcct;
  public String cbReceiptAcct;
  public String bPaymentselectAcct;
  public String aDepreciationAcct;
  public String aAccumdepreciationAcct;
  public String processing;
  public String eExpenseAcct;
  public String ePrepaymentAcct;
  public String pjAssetAcct;
  public String vLiabilityServicesAcct;
  public String notinvoicedrevenueAcct;
  public String pPurchasepricevarianceAcct;
  public String paydiscountExpAcct;
  public String paydiscountRevAcct;
  public String unrealizedgainAcct;
  public String unrealizedlossAcct;
  public String realizedgainAcct;
  public String realizedlossAcct;
  public String tExpenseAcct;
  public String tLiabilityAcct;
  public String tReceivablesAcct;
  public String bInterestrevAcct;
  public String bInterestexpAcct;
  public String bUnidentifiedAcct;
  public String bSettlementgainAcct;
  public String chRevenueAcct;
  public String unearnedrevenueAcct;
  public String notinvoicedreceivablesAcct;
  public String pTradediscountrecAcct;
  public String pTradediscountgrantAcct;
  public String wInvactualadjustAcct;
  public String bUnallocatedcashAcct;
  public String bSettlementlossAcct;
  public String cAcctschemaDefaultId;
  public String aDisposalLoss;
  public String aDisposalGain;
  public String isactive;
  public String cAcctschemaId;
  public String adClientId;
  public String adOrgId;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBYR"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATED_TIME_STAMP") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("UPDATEDBYR"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("C_RECEIVABLE_ACCT") || fieldName.equals("cReceivableAcct"))
      return cReceivableAcct;
    else if (fieldName.equalsIgnoreCase("C_PREPAYMENT_ACCT") || fieldName.equals("cPrepaymentAcct"))
      return cPrepaymentAcct;
    else if (fieldName.equalsIgnoreCase("WRITEOFF_ACCT") || fieldName.equals("writeoffAcct"))
      return writeoffAcct;
    else if (fieldName.equalsIgnoreCase("WRITEOFF_REV_ACCT") || fieldName.equals("writeoffRevAcct"))
      return writeoffRevAcct;
    else if (fieldName.equalsIgnoreCase("V_LIABILITY_ACCT") || fieldName.equals("vLiabilityAcct"))
      return vLiabilityAcct;
    else if (fieldName.equalsIgnoreCase("V_PREPAYMENT_ACCT") || fieldName.equals("vPrepaymentAcct"))
      return vPrepaymentAcct;
    else if (fieldName.equalsIgnoreCase("NOTINVOICEDRECEIPTS_ACCT") || fieldName.equals("notinvoicedreceiptsAcct"))
      return notinvoicedreceiptsAcct;
    else if (fieldName.equalsIgnoreCase("DOUBTFULDEBT_ACCT") || fieldName.equals("doubtfuldebtAcct"))
      return doubtfuldebtAcct;
    else if (fieldName.equalsIgnoreCase("BADDEBTEXPENSE_ACCT") || fieldName.equals("baddebtexpenseAcct"))
      return baddebtexpenseAcct;
    else if (fieldName.equalsIgnoreCase("BADDEBTREVENUE_ACCT") || fieldName.equals("baddebtrevenueAcct"))
      return baddebtrevenueAcct;
    else if (fieldName.equalsIgnoreCase("ALLOWANCEFORDOUBTFUL_ACCT") || fieldName.equals("allowancefordoubtfulAcct"))
      return allowancefordoubtfulAcct;
    else if (fieldName.equalsIgnoreCase("P_ASSET_ACCT") || fieldName.equals("pAssetAcct"))
      return pAssetAcct;
    else if (fieldName.equalsIgnoreCase("P_EXPENSE_ACCT") || fieldName.equals("pExpenseAcct"))
      return pExpenseAcct;
    else if (fieldName.equalsIgnoreCase("P_DEF_EXPENSE_ACCT") || fieldName.equals("pDefExpenseAcct"))
      return pDefExpenseAcct;
    else if (fieldName.equalsIgnoreCase("P_REVENUE_ACCT") || fieldName.equals("pRevenueAcct"))
      return pRevenueAcct;
    else if (fieldName.equalsIgnoreCase("P_DEF_REVENUE_ACCT") || fieldName.equals("pDefRevenueAcct"))
      return pDefRevenueAcct;
    else if (fieldName.equalsIgnoreCase("P_COGS_ACCT") || fieldName.equals("pCogsAcct"))
      return pCogsAcct;
    else if (fieldName.equalsIgnoreCase("WITHHOLDING_ACCT") || fieldName.equals("withholdingAcct"))
      return withholdingAcct;
    else if (fieldName.equalsIgnoreCase("P_INVOICEPRICEVARIANCE_ACCT") || fieldName.equals("pInvoicepricevarianceAcct"))
      return pInvoicepricevarianceAcct;
    else if (fieldName.equalsIgnoreCase("P_REVENUE_RETURN_ACCT") || fieldName.equals("pRevenueReturnAcct"))
      return pRevenueReturnAcct;
    else if (fieldName.equalsIgnoreCase("P_COGS_RETURN_ACCT") || fieldName.equals("pCogsReturnAcct"))
      return pCogsReturnAcct;
    else if (fieldName.equalsIgnoreCase("W_INVENTORY_ACCT") || fieldName.equals("wInventoryAcct"))
      return wInventoryAcct;
    else if (fieldName.equalsIgnoreCase("W_DIFFERENCES_ACCT") || fieldName.equals("wDifferencesAcct"))
      return wDifferencesAcct;
    else if (fieldName.equalsIgnoreCase("W_REVALUATION_ACCT") || fieldName.equals("wRevaluationAcct"))
      return wRevaluationAcct;
    else if (fieldName.equalsIgnoreCase("PJ_WIP_ACCT") || fieldName.equals("pjWipAcct"))
      return pjWipAcct;
    else if (fieldName.equalsIgnoreCase("B_ASSET_ACCT") || fieldName.equals("bAssetAcct"))
      return bAssetAcct;
    else if (fieldName.equalsIgnoreCase("B_INTRANSIT_ACCT") || fieldName.equals("bIntransitAcct"))
      return bIntransitAcct;
    else if (fieldName.equalsIgnoreCase("B_EXPENSE_ACCT") || fieldName.equals("bExpenseAcct"))
      return bExpenseAcct;
    else if (fieldName.equalsIgnoreCase("B_REVALUATIONGAIN_ACCT") || fieldName.equals("bRevaluationgainAcct"))
      return bRevaluationgainAcct;
    else if (fieldName.equalsIgnoreCase("B_REVALUATIONLOSS_ACCT") || fieldName.equals("bRevaluationlossAcct"))
      return bRevaluationlossAcct;
    else if (fieldName.equalsIgnoreCase("T_DUE_ACCT") || fieldName.equals("tDueAcct"))
      return tDueAcct;
    else if (fieldName.equalsIgnoreCase("T_CREDIT_ACCT") || fieldName.equals("tCreditAcct"))
      return tCreditAcct;
    else if (fieldName.equalsIgnoreCase("CH_EXPENSE_ACCT") || fieldName.equals("chExpenseAcct"))
      return chExpenseAcct;
    else if (fieldName.equalsIgnoreCase("CB_ASSET_ACCT") || fieldName.equals("cbAssetAcct"))
      return cbAssetAcct;
    else if (fieldName.equalsIgnoreCase("CB_DIFFERENCES_ACCT") || fieldName.equals("cbDifferencesAcct"))
      return cbDifferencesAcct;
    else if (fieldName.equalsIgnoreCase("CB_CASHTRANSFER_ACCT") || fieldName.equals("cbCashtransferAcct"))
      return cbCashtransferAcct;
    else if (fieldName.equalsIgnoreCase("CB_EXPENSE_ACCT") || fieldName.equals("cbExpenseAcct"))
      return cbExpenseAcct;
    else if (fieldName.equalsIgnoreCase("CB_RECEIPT_ACCT") || fieldName.equals("cbReceiptAcct"))
      return cbReceiptAcct;
    else if (fieldName.equalsIgnoreCase("B_PAYMENTSELECT_ACCT") || fieldName.equals("bPaymentselectAcct"))
      return bPaymentselectAcct;
    else if (fieldName.equalsIgnoreCase("A_DEPRECIATION_ACCT") || fieldName.equals("aDepreciationAcct"))
      return aDepreciationAcct;
    else if (fieldName.equalsIgnoreCase("A_ACCUMDEPRECIATION_ACCT") || fieldName.equals("aAccumdepreciationAcct"))
      return aAccumdepreciationAcct;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("E_EXPENSE_ACCT") || fieldName.equals("eExpenseAcct"))
      return eExpenseAcct;
    else if (fieldName.equalsIgnoreCase("E_PREPAYMENT_ACCT") || fieldName.equals("ePrepaymentAcct"))
      return ePrepaymentAcct;
    else if (fieldName.equalsIgnoreCase("PJ_ASSET_ACCT") || fieldName.equals("pjAssetAcct"))
      return pjAssetAcct;
    else if (fieldName.equalsIgnoreCase("V_LIABILITY_SERVICES_ACCT") || fieldName.equals("vLiabilityServicesAcct"))
      return vLiabilityServicesAcct;
    else if (fieldName.equalsIgnoreCase("NOTINVOICEDREVENUE_ACCT") || fieldName.equals("notinvoicedrevenueAcct"))
      return notinvoicedrevenueAcct;
    else if (fieldName.equalsIgnoreCase("P_PURCHASEPRICEVARIANCE_ACCT") || fieldName.equals("pPurchasepricevarianceAcct"))
      return pPurchasepricevarianceAcct;
    else if (fieldName.equalsIgnoreCase("PAYDISCOUNT_EXP_ACCT") || fieldName.equals("paydiscountExpAcct"))
      return paydiscountExpAcct;
    else if (fieldName.equalsIgnoreCase("PAYDISCOUNT_REV_ACCT") || fieldName.equals("paydiscountRevAcct"))
      return paydiscountRevAcct;
    else if (fieldName.equalsIgnoreCase("UNREALIZEDGAIN_ACCT") || fieldName.equals("unrealizedgainAcct"))
      return unrealizedgainAcct;
    else if (fieldName.equalsIgnoreCase("UNREALIZEDLOSS_ACCT") || fieldName.equals("unrealizedlossAcct"))
      return unrealizedlossAcct;
    else if (fieldName.equalsIgnoreCase("REALIZEDGAIN_ACCT") || fieldName.equals("realizedgainAcct"))
      return realizedgainAcct;
    else if (fieldName.equalsIgnoreCase("REALIZEDLOSS_ACCT") || fieldName.equals("realizedlossAcct"))
      return realizedlossAcct;
    else if (fieldName.equalsIgnoreCase("T_EXPENSE_ACCT") || fieldName.equals("tExpenseAcct"))
      return tExpenseAcct;
    else if (fieldName.equalsIgnoreCase("T_LIABILITY_ACCT") || fieldName.equals("tLiabilityAcct"))
      return tLiabilityAcct;
    else if (fieldName.equalsIgnoreCase("T_RECEIVABLES_ACCT") || fieldName.equals("tReceivablesAcct"))
      return tReceivablesAcct;
    else if (fieldName.equalsIgnoreCase("B_INTERESTREV_ACCT") || fieldName.equals("bInterestrevAcct"))
      return bInterestrevAcct;
    else if (fieldName.equalsIgnoreCase("B_INTERESTEXP_ACCT") || fieldName.equals("bInterestexpAcct"))
      return bInterestexpAcct;
    else if (fieldName.equalsIgnoreCase("B_UNIDENTIFIED_ACCT") || fieldName.equals("bUnidentifiedAcct"))
      return bUnidentifiedAcct;
    else if (fieldName.equalsIgnoreCase("B_SETTLEMENTGAIN_ACCT") || fieldName.equals("bSettlementgainAcct"))
      return bSettlementgainAcct;
    else if (fieldName.equalsIgnoreCase("CH_REVENUE_ACCT") || fieldName.equals("chRevenueAcct"))
      return chRevenueAcct;
    else if (fieldName.equalsIgnoreCase("UNEARNEDREVENUE_ACCT") || fieldName.equals("unearnedrevenueAcct"))
      return unearnedrevenueAcct;
    else if (fieldName.equalsIgnoreCase("NOTINVOICEDRECEIVABLES_ACCT") || fieldName.equals("notinvoicedreceivablesAcct"))
      return notinvoicedreceivablesAcct;
    else if (fieldName.equalsIgnoreCase("P_TRADEDISCOUNTREC_ACCT") || fieldName.equals("pTradediscountrecAcct"))
      return pTradediscountrecAcct;
    else if (fieldName.equalsIgnoreCase("P_TRADEDISCOUNTGRANT_ACCT") || fieldName.equals("pTradediscountgrantAcct"))
      return pTradediscountgrantAcct;
    else if (fieldName.equalsIgnoreCase("W_INVACTUALADJUST_ACCT") || fieldName.equals("wInvactualadjustAcct"))
      return wInvactualadjustAcct;
    else if (fieldName.equalsIgnoreCase("B_UNALLOCATEDCASH_ACCT") || fieldName.equals("bUnallocatedcashAcct"))
      return bUnallocatedcashAcct;
    else if (fieldName.equalsIgnoreCase("B_SETTLEMENTLOSS_ACCT") || fieldName.equals("bSettlementlossAcct"))
      return bSettlementlossAcct;
    else if (fieldName.equalsIgnoreCase("C_ACCTSCHEMA_DEFAULT_ID") || fieldName.equals("cAcctschemaDefaultId"))
      return cAcctschemaDefaultId;
    else if (fieldName.equalsIgnoreCase("A_DISPOSAL_LOSS") || fieldName.equals("aDisposalLoss"))
      return aDisposalLoss;
    else if (fieldName.equalsIgnoreCase("A_DISPOSAL_GAIN") || fieldName.equals("aDisposalGain"))
      return aDisposalGain;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("C_ACCTSCHEMA_ID") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("LANGUAGE"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static DefaultsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cAcctschemaId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cAcctschemaId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static DefaultsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cAcctschemaId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_AcctSchema_Default.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_AcctSchema_Default.CreatedBy) as CreatedByR, " +
      "        to_char(C_AcctSchema_Default.Updated, ?) as updated, " +
      "        to_char(C_AcctSchema_Default.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_AcctSchema_Default.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_AcctSchema_Default.UpdatedBy) as UpdatedByR," +
      "        C_AcctSchema_Default.C_Receivable_Acct, " +
      "C_AcctSchema_Default.C_Prepayment_Acct, " +
      "C_AcctSchema_Default.WriteOff_Acct, " +
      "C_AcctSchema_Default.Writeoff_Rev_Acct, " +
      "C_AcctSchema_Default.V_Liability_Acct, " +
      "C_AcctSchema_Default.V_Prepayment_Acct, " +
      "C_AcctSchema_Default.NotInvoicedReceipts_Acct, " +
      "C_AcctSchema_Default.DoubtfulDebt_Acct, " +
      "C_AcctSchema_Default.Baddebtexpense_Acct, " +
      "C_AcctSchema_Default.BadDebtRevenue_Acct, " +
      "C_AcctSchema_Default.Allowancefordoubtful_Acct, " +
      "C_AcctSchema_Default.P_Asset_Acct, " +
      "C_AcctSchema_Default.P_Expense_Acct, " +
      "C_AcctSchema_Default.P_Def_Expense_Acct, " +
      "C_AcctSchema_Default.P_Revenue_Acct, " +
      "C_AcctSchema_Default.P_Def_Revenue_Acct, " +
      "C_AcctSchema_Default.P_Cogs_Acct, " +
      "C_AcctSchema_Default.Withholding_Acct, " +
      "C_AcctSchema_Default.P_InvoicePriceVariance_Acct, " +
      "C_AcctSchema_Default.P_Revenue_Return_Acct, " +
      "C_AcctSchema_Default.P_Cogs_Return_Acct, " +
      "C_AcctSchema_Default.W_Inventory_Acct, " +
      "C_AcctSchema_Default.W_Differences_Acct, " +
      "C_AcctSchema_Default.W_Revaluation_Acct, " +
      "C_AcctSchema_Default.PJ_WIP_Acct, " +
      "C_AcctSchema_Default.B_Asset_Acct, " +
      "C_AcctSchema_Default.B_InTransit_Acct, " +
      "C_AcctSchema_Default.B_Expense_Acct, " +
      "C_AcctSchema_Default.B_RevaluationGain_Acct, " +
      "C_AcctSchema_Default.B_RevaluationLoss_Acct, " +
      "C_AcctSchema_Default.T_Due_Acct, " +
      "C_AcctSchema_Default.T_Credit_Acct, " +
      "C_AcctSchema_Default.Ch_Expense_Acct, " +
      "C_AcctSchema_Default.CB_Asset_Acct, " +
      "C_AcctSchema_Default.CB_Differences_Acct, " +
      "C_AcctSchema_Default.CB_CashTransfer_Acct, " +
      "C_AcctSchema_Default.CB_Expense_Acct, " +
      "C_AcctSchema_Default.CB_Receipt_Acct, " +
      "C_AcctSchema_Default.B_PaymentSelect_Acct, " +
      "C_AcctSchema_Default.A_Depreciation_Acct, " +
      "C_AcctSchema_Default.A_Accumdepreciation_Acct, " +
      "C_AcctSchema_Default.Processing, " +
      "C_AcctSchema_Default.E_Expense_Acct, " +
      "C_AcctSchema_Default.E_Prepayment_Acct, " +
      "C_AcctSchema_Default.PJ_Asset_Acct, " +
      "C_AcctSchema_Default.V_Liability_Services_Acct, " +
      "C_AcctSchema_Default.NotInvoicedRevenue_Acct, " +
      "C_AcctSchema_Default.P_PurchasePriceVariance_Acct, " +
      "C_AcctSchema_Default.PayDiscount_Exp_Acct, " +
      "C_AcctSchema_Default.PayDiscount_Rev_Acct, " +
      "C_AcctSchema_Default.UnrealizedGain_Acct, " +
      "C_AcctSchema_Default.UnrealizedLoss_Acct, " +
      "C_AcctSchema_Default.RealizedGain_Acct, " +
      "C_AcctSchema_Default.RealizedLoss_Acct, " +
      "C_AcctSchema_Default.T_Expense_Acct, " +
      "C_AcctSchema_Default.T_Liability_Acct, " +
      "C_AcctSchema_Default.T_Receivables_Acct, " +
      "C_AcctSchema_Default.B_InterestRev_Acct, " +
      "C_AcctSchema_Default.B_InterestExp_Acct, " +
      "C_AcctSchema_Default.B_Unidentified_Acct, " +
      "C_AcctSchema_Default.B_SettlementGain_Acct, " +
      "C_AcctSchema_Default.Ch_Revenue_Acct, " +
      "C_AcctSchema_Default.UnEarnedRevenue_Acct, " +
      "C_AcctSchema_Default.NotInvoicedReceivables_Acct, " +
      "C_AcctSchema_Default.P_TradeDiscountRec_Acct, " +
      "C_AcctSchema_Default.P_TradeDiscountGrant_Acct, " +
      "C_AcctSchema_Default.W_InvActualAdjust_Acct, " +
      "C_AcctSchema_Default.B_UnallocatedCash_Acct, " +
      "C_AcctSchema_Default.B_SettlementLoss_Acct, " +
      "C_AcctSchema_Default.C_Acctschema_Default_ID, " +
      "C_AcctSchema_Default.A_Disposal_Loss, " +
      "C_AcctSchema_Default.A_Disposal_Gain, " +
      "COALESCE(C_AcctSchema_Default.IsActive, 'N') AS IsActive, " +
      "C_AcctSchema_Default.C_AcctSchema_ID, " +
      "C_AcctSchema_Default.AD_Client_ID, " +
      "C_AcctSchema_Default.AD_Org_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_AcctSchema_Default" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cAcctschemaId==null || cAcctschemaId.equals(""))?"":"  AND C_AcctSchema_Default.C_AcctSchema_ID = ?  ");
    strSql = strSql + 
      "        AND C_AcctSchema_Default.C_Acctschema_Default_ID = ? " +
      "        AND C_AcctSchema_Default.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_AcctSchema_Default.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (cAcctschemaId != null && !(cAcctschemaId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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
        DefaultsData objectDefaultsData = new DefaultsData();
        objectDefaultsData.created = UtilSql.getValue(result, "CREATED");
        objectDefaultsData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectDefaultsData.updated = UtilSql.getValue(result, "UPDATED");
        objectDefaultsData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectDefaultsData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectDefaultsData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectDefaultsData.cReceivableAcct = UtilSql.getValue(result, "C_RECEIVABLE_ACCT");
        objectDefaultsData.cPrepaymentAcct = UtilSql.getValue(result, "C_PREPAYMENT_ACCT");
        objectDefaultsData.writeoffAcct = UtilSql.getValue(result, "WRITEOFF_ACCT");
        objectDefaultsData.writeoffRevAcct = UtilSql.getValue(result, "WRITEOFF_REV_ACCT");
        objectDefaultsData.vLiabilityAcct = UtilSql.getValue(result, "V_LIABILITY_ACCT");
        objectDefaultsData.vPrepaymentAcct = UtilSql.getValue(result, "V_PREPAYMENT_ACCT");
        objectDefaultsData.notinvoicedreceiptsAcct = UtilSql.getValue(result, "NOTINVOICEDRECEIPTS_ACCT");
        objectDefaultsData.doubtfuldebtAcct = UtilSql.getValue(result, "DOUBTFULDEBT_ACCT");
        objectDefaultsData.baddebtexpenseAcct = UtilSql.getValue(result, "BADDEBTEXPENSE_ACCT");
        objectDefaultsData.baddebtrevenueAcct = UtilSql.getValue(result, "BADDEBTREVENUE_ACCT");
        objectDefaultsData.allowancefordoubtfulAcct = UtilSql.getValue(result, "ALLOWANCEFORDOUBTFUL_ACCT");
        objectDefaultsData.pAssetAcct = UtilSql.getValue(result, "P_ASSET_ACCT");
        objectDefaultsData.pExpenseAcct = UtilSql.getValue(result, "P_EXPENSE_ACCT");
        objectDefaultsData.pDefExpenseAcct = UtilSql.getValue(result, "P_DEF_EXPENSE_ACCT");
        objectDefaultsData.pRevenueAcct = UtilSql.getValue(result, "P_REVENUE_ACCT");
        objectDefaultsData.pDefRevenueAcct = UtilSql.getValue(result, "P_DEF_REVENUE_ACCT");
        objectDefaultsData.pCogsAcct = UtilSql.getValue(result, "P_COGS_ACCT");
        objectDefaultsData.withholdingAcct = UtilSql.getValue(result, "WITHHOLDING_ACCT");
        objectDefaultsData.pInvoicepricevarianceAcct = UtilSql.getValue(result, "P_INVOICEPRICEVARIANCE_ACCT");
        objectDefaultsData.pRevenueReturnAcct = UtilSql.getValue(result, "P_REVENUE_RETURN_ACCT");
        objectDefaultsData.pCogsReturnAcct = UtilSql.getValue(result, "P_COGS_RETURN_ACCT");
        objectDefaultsData.wInventoryAcct = UtilSql.getValue(result, "W_INVENTORY_ACCT");
        objectDefaultsData.wDifferencesAcct = UtilSql.getValue(result, "W_DIFFERENCES_ACCT");
        objectDefaultsData.wRevaluationAcct = UtilSql.getValue(result, "W_REVALUATION_ACCT");
        objectDefaultsData.pjWipAcct = UtilSql.getValue(result, "PJ_WIP_ACCT");
        objectDefaultsData.bAssetAcct = UtilSql.getValue(result, "B_ASSET_ACCT");
        objectDefaultsData.bIntransitAcct = UtilSql.getValue(result, "B_INTRANSIT_ACCT");
        objectDefaultsData.bExpenseAcct = UtilSql.getValue(result, "B_EXPENSE_ACCT");
        objectDefaultsData.bRevaluationgainAcct = UtilSql.getValue(result, "B_REVALUATIONGAIN_ACCT");
        objectDefaultsData.bRevaluationlossAcct = UtilSql.getValue(result, "B_REVALUATIONLOSS_ACCT");
        objectDefaultsData.tDueAcct = UtilSql.getValue(result, "T_DUE_ACCT");
        objectDefaultsData.tCreditAcct = UtilSql.getValue(result, "T_CREDIT_ACCT");
        objectDefaultsData.chExpenseAcct = UtilSql.getValue(result, "CH_EXPENSE_ACCT");
        objectDefaultsData.cbAssetAcct = UtilSql.getValue(result, "CB_ASSET_ACCT");
        objectDefaultsData.cbDifferencesAcct = UtilSql.getValue(result, "CB_DIFFERENCES_ACCT");
        objectDefaultsData.cbCashtransferAcct = UtilSql.getValue(result, "CB_CASHTRANSFER_ACCT");
        objectDefaultsData.cbExpenseAcct = UtilSql.getValue(result, "CB_EXPENSE_ACCT");
        objectDefaultsData.cbReceiptAcct = UtilSql.getValue(result, "CB_RECEIPT_ACCT");
        objectDefaultsData.bPaymentselectAcct = UtilSql.getValue(result, "B_PAYMENTSELECT_ACCT");
        objectDefaultsData.aDepreciationAcct = UtilSql.getValue(result, "A_DEPRECIATION_ACCT");
        objectDefaultsData.aAccumdepreciationAcct = UtilSql.getValue(result, "A_ACCUMDEPRECIATION_ACCT");
        objectDefaultsData.processing = UtilSql.getValue(result, "PROCESSING");
        objectDefaultsData.eExpenseAcct = UtilSql.getValue(result, "E_EXPENSE_ACCT");
        objectDefaultsData.ePrepaymentAcct = UtilSql.getValue(result, "E_PREPAYMENT_ACCT");
        objectDefaultsData.pjAssetAcct = UtilSql.getValue(result, "PJ_ASSET_ACCT");
        objectDefaultsData.vLiabilityServicesAcct = UtilSql.getValue(result, "V_LIABILITY_SERVICES_ACCT");
        objectDefaultsData.notinvoicedrevenueAcct = UtilSql.getValue(result, "NOTINVOICEDREVENUE_ACCT");
        objectDefaultsData.pPurchasepricevarianceAcct = UtilSql.getValue(result, "P_PURCHASEPRICEVARIANCE_ACCT");
        objectDefaultsData.paydiscountExpAcct = UtilSql.getValue(result, "PAYDISCOUNT_EXP_ACCT");
        objectDefaultsData.paydiscountRevAcct = UtilSql.getValue(result, "PAYDISCOUNT_REV_ACCT");
        objectDefaultsData.unrealizedgainAcct = UtilSql.getValue(result, "UNREALIZEDGAIN_ACCT");
        objectDefaultsData.unrealizedlossAcct = UtilSql.getValue(result, "UNREALIZEDLOSS_ACCT");
        objectDefaultsData.realizedgainAcct = UtilSql.getValue(result, "REALIZEDGAIN_ACCT");
        objectDefaultsData.realizedlossAcct = UtilSql.getValue(result, "REALIZEDLOSS_ACCT");
        objectDefaultsData.tExpenseAcct = UtilSql.getValue(result, "T_EXPENSE_ACCT");
        objectDefaultsData.tLiabilityAcct = UtilSql.getValue(result, "T_LIABILITY_ACCT");
        objectDefaultsData.tReceivablesAcct = UtilSql.getValue(result, "T_RECEIVABLES_ACCT");
        objectDefaultsData.bInterestrevAcct = UtilSql.getValue(result, "B_INTERESTREV_ACCT");
        objectDefaultsData.bInterestexpAcct = UtilSql.getValue(result, "B_INTERESTEXP_ACCT");
        objectDefaultsData.bUnidentifiedAcct = UtilSql.getValue(result, "B_UNIDENTIFIED_ACCT");
        objectDefaultsData.bSettlementgainAcct = UtilSql.getValue(result, "B_SETTLEMENTGAIN_ACCT");
        objectDefaultsData.chRevenueAcct = UtilSql.getValue(result, "CH_REVENUE_ACCT");
        objectDefaultsData.unearnedrevenueAcct = UtilSql.getValue(result, "UNEARNEDREVENUE_ACCT");
        objectDefaultsData.notinvoicedreceivablesAcct = UtilSql.getValue(result, "NOTINVOICEDRECEIVABLES_ACCT");
        objectDefaultsData.pTradediscountrecAcct = UtilSql.getValue(result, "P_TRADEDISCOUNTREC_ACCT");
        objectDefaultsData.pTradediscountgrantAcct = UtilSql.getValue(result, "P_TRADEDISCOUNTGRANT_ACCT");
        objectDefaultsData.wInvactualadjustAcct = UtilSql.getValue(result, "W_INVACTUALADJUST_ACCT");
        objectDefaultsData.bUnallocatedcashAcct = UtilSql.getValue(result, "B_UNALLOCATEDCASH_ACCT");
        objectDefaultsData.bSettlementlossAcct = UtilSql.getValue(result, "B_SETTLEMENTLOSS_ACCT");
        objectDefaultsData.cAcctschemaDefaultId = UtilSql.getValue(result, "C_ACCTSCHEMA_DEFAULT_ID");
        objectDefaultsData.aDisposalLoss = UtilSql.getValue(result, "A_DISPOSAL_LOSS");
        objectDefaultsData.aDisposalGain = UtilSql.getValue(result, "A_DISPOSAL_GAIN");
        objectDefaultsData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectDefaultsData.cAcctschemaId = UtilSql.getValue(result, "C_ACCTSCHEMA_ID");
        objectDefaultsData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDefaultsData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDefaultsData.language = UtilSql.getValue(result, "LANGUAGE");
        objectDefaultsData.adUserClient = "";
        objectDefaultsData.adOrgClient = "";
        objectDefaultsData.createdby = "";
        objectDefaultsData.trBgcolor = "";
        objectDefaultsData.totalCount = "";
        objectDefaultsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDefaultsData);
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
    DefaultsData objectDefaultsData[] = new DefaultsData[vector.size()];
    vector.copyInto(objectDefaultsData);
    return(objectDefaultsData);
  }

/**
Create a registry
 */
  public static DefaultsData[] set(String cAcctschemaId, String pRevenueReturnAcct, String adClientId, String adOrgId, String isactive, String created, String createdby, String createdbyr, String updatedby, String updatedbyr, String wInventoryAcct, String wDifferencesAcct, String pRevenueAcct, String pExpenseAcct, String pAssetAcct, String pCogsAcct, String eExpenseAcct, String ePrepaymentAcct, String cReceivableAcct, String cPrepaymentAcct, String vLiabilityAcct, String vPrepaymentAcct, String vLiabilityServicesAcct, String pjAssetAcct, String doubtfuldebtAcct, String notinvoicedrevenueAcct, String notinvoicedreceiptsAcct, String processing, String wRevaluationAcct, String pPurchasepricevarianceAcct, String paydiscountExpAcct, String writeoffAcct, String paydiscountRevAcct, String unrealizedgainAcct, String unrealizedlossAcct, String realizedgainAcct, String realizedlossAcct, String withholdingAcct, String pjWipAcct, String tExpenseAcct, String tLiabilityAcct, String tReceivablesAcct, String tDueAcct, String tCreditAcct, String bIntransitAcct, String bAssetAcct, String bExpenseAcct, String bInterestrevAcct, String bInterestexpAcct, String bUnidentifiedAcct, String bSettlementgainAcct, String bSettlementlossAcct, String bRevaluationgainAcct, String bRevaluationlossAcct, String chExpenseAcct, String chRevenueAcct, String unearnedrevenueAcct, String notinvoicedreceivablesAcct, String cbAssetAcct, String cbDifferencesAcct, String cbExpenseAcct, String cbReceiptAcct, String pDefRevenueAcct, String pInvoicepricevarianceAcct, String pTradediscountrecAcct, String pTradediscountgrantAcct, String wInvactualadjustAcct, String bPaymentselectAcct, String bUnallocatedcashAcct, String cbCashtransferAcct, String cAcctschemaDefaultId, String aAccumdepreciationAcct, String aDepreciationAcct, String aDisposalGain, String aDisposalLoss, String pCogsReturnAcct, String allowancefordoubtfulAcct, String writeoffRevAcct, String pDefExpenseAcct, String baddebtrevenueAcct, String baddebtexpenseAcct)    throws ServletException {
    DefaultsData objectDefaultsData[] = new DefaultsData[1];
    objectDefaultsData[0] = new DefaultsData();
    objectDefaultsData[0].created = created;
    objectDefaultsData[0].createdbyr = createdbyr;
    objectDefaultsData[0].updated = "";
    objectDefaultsData[0].updatedTimeStamp = "";
    objectDefaultsData[0].updatedby = updatedby;
    objectDefaultsData[0].updatedbyr = updatedbyr;
    objectDefaultsData[0].cReceivableAcct = cReceivableAcct;
    objectDefaultsData[0].cPrepaymentAcct = cPrepaymentAcct;
    objectDefaultsData[0].writeoffAcct = writeoffAcct;
    objectDefaultsData[0].writeoffRevAcct = writeoffRevAcct;
    objectDefaultsData[0].vLiabilityAcct = vLiabilityAcct;
    objectDefaultsData[0].vPrepaymentAcct = vPrepaymentAcct;
    objectDefaultsData[0].notinvoicedreceiptsAcct = notinvoicedreceiptsAcct;
    objectDefaultsData[0].doubtfuldebtAcct = doubtfuldebtAcct;
    objectDefaultsData[0].baddebtexpenseAcct = baddebtexpenseAcct;
    objectDefaultsData[0].baddebtrevenueAcct = baddebtrevenueAcct;
    objectDefaultsData[0].allowancefordoubtfulAcct = allowancefordoubtfulAcct;
    objectDefaultsData[0].pAssetAcct = pAssetAcct;
    objectDefaultsData[0].pExpenseAcct = pExpenseAcct;
    objectDefaultsData[0].pDefExpenseAcct = pDefExpenseAcct;
    objectDefaultsData[0].pRevenueAcct = pRevenueAcct;
    objectDefaultsData[0].pDefRevenueAcct = pDefRevenueAcct;
    objectDefaultsData[0].pCogsAcct = pCogsAcct;
    objectDefaultsData[0].withholdingAcct = withholdingAcct;
    objectDefaultsData[0].pInvoicepricevarianceAcct = pInvoicepricevarianceAcct;
    objectDefaultsData[0].pRevenueReturnAcct = pRevenueReturnAcct;
    objectDefaultsData[0].pCogsReturnAcct = pCogsReturnAcct;
    objectDefaultsData[0].wInventoryAcct = wInventoryAcct;
    objectDefaultsData[0].wDifferencesAcct = wDifferencesAcct;
    objectDefaultsData[0].wRevaluationAcct = wRevaluationAcct;
    objectDefaultsData[0].pjWipAcct = pjWipAcct;
    objectDefaultsData[0].bAssetAcct = bAssetAcct;
    objectDefaultsData[0].bIntransitAcct = bIntransitAcct;
    objectDefaultsData[0].bExpenseAcct = bExpenseAcct;
    objectDefaultsData[0].bRevaluationgainAcct = bRevaluationgainAcct;
    objectDefaultsData[0].bRevaluationlossAcct = bRevaluationlossAcct;
    objectDefaultsData[0].tDueAcct = tDueAcct;
    objectDefaultsData[0].tCreditAcct = tCreditAcct;
    objectDefaultsData[0].chExpenseAcct = chExpenseAcct;
    objectDefaultsData[0].cbAssetAcct = cbAssetAcct;
    objectDefaultsData[0].cbDifferencesAcct = cbDifferencesAcct;
    objectDefaultsData[0].cbCashtransferAcct = cbCashtransferAcct;
    objectDefaultsData[0].cbExpenseAcct = cbExpenseAcct;
    objectDefaultsData[0].cbReceiptAcct = cbReceiptAcct;
    objectDefaultsData[0].bPaymentselectAcct = bPaymentselectAcct;
    objectDefaultsData[0].aDepreciationAcct = aDepreciationAcct;
    objectDefaultsData[0].aAccumdepreciationAcct = aAccumdepreciationAcct;
    objectDefaultsData[0].processing = processing;
    objectDefaultsData[0].eExpenseAcct = eExpenseAcct;
    objectDefaultsData[0].ePrepaymentAcct = ePrepaymentAcct;
    objectDefaultsData[0].pjAssetAcct = pjAssetAcct;
    objectDefaultsData[0].vLiabilityServicesAcct = vLiabilityServicesAcct;
    objectDefaultsData[0].notinvoicedrevenueAcct = notinvoicedrevenueAcct;
    objectDefaultsData[0].pPurchasepricevarianceAcct = pPurchasepricevarianceAcct;
    objectDefaultsData[0].paydiscountExpAcct = paydiscountExpAcct;
    objectDefaultsData[0].paydiscountRevAcct = paydiscountRevAcct;
    objectDefaultsData[0].unrealizedgainAcct = unrealizedgainAcct;
    objectDefaultsData[0].unrealizedlossAcct = unrealizedlossAcct;
    objectDefaultsData[0].realizedgainAcct = realizedgainAcct;
    objectDefaultsData[0].realizedlossAcct = realizedlossAcct;
    objectDefaultsData[0].tExpenseAcct = tExpenseAcct;
    objectDefaultsData[0].tLiabilityAcct = tLiabilityAcct;
    objectDefaultsData[0].tReceivablesAcct = tReceivablesAcct;
    objectDefaultsData[0].bInterestrevAcct = bInterestrevAcct;
    objectDefaultsData[0].bInterestexpAcct = bInterestexpAcct;
    objectDefaultsData[0].bUnidentifiedAcct = bUnidentifiedAcct;
    objectDefaultsData[0].bSettlementgainAcct = bSettlementgainAcct;
    objectDefaultsData[0].chRevenueAcct = chRevenueAcct;
    objectDefaultsData[0].unearnedrevenueAcct = unearnedrevenueAcct;
    objectDefaultsData[0].notinvoicedreceivablesAcct = notinvoicedreceivablesAcct;
    objectDefaultsData[0].pTradediscountrecAcct = pTradediscountrecAcct;
    objectDefaultsData[0].pTradediscountgrantAcct = pTradediscountgrantAcct;
    objectDefaultsData[0].wInvactualadjustAcct = wInvactualadjustAcct;
    objectDefaultsData[0].bUnallocatedcashAcct = bUnallocatedcashAcct;
    objectDefaultsData[0].bSettlementlossAcct = bSettlementlossAcct;
    objectDefaultsData[0].cAcctschemaDefaultId = cAcctschemaDefaultId;
    objectDefaultsData[0].aDisposalLoss = aDisposalLoss;
    objectDefaultsData[0].aDisposalGain = aDisposalGain;
    objectDefaultsData[0].isactive = isactive;
    objectDefaultsData[0].cAcctschemaId = cAcctschemaId;
    objectDefaultsData[0].adClientId = adClientId;
    objectDefaultsData[0].adOrgId = adOrgId;
    objectDefaultsData[0].language = "";
    return objectDefaultsData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef3440_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as CreatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "CREATEDBY");
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

/**
Select for auxiliar field
 */
  public static String selectDef3442_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as UpdatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATEDBY");
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

/**
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_AcctSchema_Default.C_AcctSchema_ID AS NAME" +
      "        FROM C_AcctSchema_Default" +
      "        WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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

/**
Select for parent field
 */
  public static String selectParent(ConnectionProvider connectionProvider, String cAcctschemaId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_AcctSchema left join (select C_AcctSchema_ID, Name from C_AcctSchema) table1 on (C_AcctSchema.C_AcctSchema_ID = table1.C_AcctSchema_ID) WHERE C_AcctSchema.C_AcctSchema_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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

/**
Select for parent field
 */
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cAcctschemaId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_AcctSchema left join (select C_AcctSchema_ID, Name from C_AcctSchema) table1 on (C_AcctSchema.C_AcctSchema_ID = table1.C_AcctSchema_ID) WHERE C_AcctSchema.C_AcctSchema_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_AcctSchema_Default" +
      "        SET C_Receivable_Acct = (?) , C_Prepayment_Acct = (?) , WriteOff_Acct = (?) , Writeoff_Rev_Acct = (?) , V_Liability_Acct = (?) , V_Prepayment_Acct = (?) , NotInvoicedReceipts_Acct = (?) , DoubtfulDebt_Acct = (?) , Baddebtexpense_Acct = (?) , BadDebtRevenue_Acct = (?) , Allowancefordoubtful_Acct = (?) , P_Asset_Acct = (?) , P_Expense_Acct = (?) , P_Def_Expense_Acct = (?) , P_Revenue_Acct = (?) , P_Def_Revenue_Acct = (?) , P_Cogs_Acct = (?) , Withholding_Acct = (?) , P_InvoicePriceVariance_Acct = (?) , P_Revenue_Return_Acct = (?) , P_Cogs_Return_Acct = (?) , W_Inventory_Acct = (?) , W_Differences_Acct = (?) , W_Revaluation_Acct = (?) , PJ_WIP_Acct = (?) , B_Asset_Acct = (?) , B_InTransit_Acct = (?) , B_Expense_Acct = (?) , B_RevaluationGain_Acct = (?) , B_RevaluationLoss_Acct = (?) , T_Due_Acct = (?) , T_Credit_Acct = (?) , Ch_Expense_Acct = (?) , CB_Asset_Acct = (?) , CB_Differences_Acct = (?) , CB_CashTransfer_Acct = (?) , CB_Expense_Acct = (?) , CB_Receipt_Acct = (?) , B_PaymentSelect_Acct = (?) , A_Depreciation_Acct = (?) , A_Accumdepreciation_Acct = (?) , Processing = (?) , E_Expense_Acct = (?) , E_Prepayment_Acct = (?) , PJ_Asset_Acct = (?) , V_Liability_Services_Acct = (?) , NotInvoicedRevenue_Acct = (?) , P_PurchasePriceVariance_Acct = (?) , PayDiscount_Exp_Acct = (?) , PayDiscount_Rev_Acct = (?) , UnrealizedGain_Acct = (?) , UnrealizedLoss_Acct = (?) , RealizedGain_Acct = (?) , RealizedLoss_Acct = (?) , T_Expense_Acct = (?) , T_Liability_Acct = (?) , T_Receivables_Acct = (?) , B_InterestRev_Acct = (?) , B_InterestExp_Acct = (?) , B_Unidentified_Acct = (?) , B_SettlementGain_Acct = (?) , Ch_Revenue_Acct = (?) , UnEarnedRevenue_Acct = (?) , NotInvoicedReceivables_Acct = (?) , P_TradeDiscountRec_Acct = (?) , P_TradeDiscountGrant_Acct = (?) , W_InvActualAdjust_Acct = (?) , B_UnallocatedCash_Acct = (?) , B_SettlementLoss_Acct = (?) , A_Disposal_Loss = (?) , A_Disposal_Gain = (?) , IsActive = (?) , C_AcctSchema_ID = (?) , C_Acctschema_Default_ID = (?) , AD_Client_ID = (?) , AD_Org_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ? " +
      "                 AND C_AcctSchema_Default.C_AcctSchema_ID = ? " +
      "        AND C_AcctSchema_Default.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_AcctSchema_Default.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReceivableAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceiptsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, doubtfuldebtAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtexpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allowancefordoubtfulAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, withholdingAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pInvoicepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wInventoryAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wDifferencesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wRevaluationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pjWipAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bIntransitAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bRevaluationgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bRevaluationlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tDueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tCreditAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbDifferencesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbCashtransferAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbReceiptAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bPaymentselectAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDepreciationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAccumdepreciationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, eExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ePrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pjAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityServicesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pPurchasepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountExpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tReceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bInterestrevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bInterestexpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bUnidentifiedAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bSettlementgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unearnedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountrecAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountgrantAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wInvactualadjustAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bUnallocatedcashAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bSettlementlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDisposalLoss);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDisposalGain);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaDefaultId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaDefaultId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO C_AcctSchema_Default " +
      "        (C_Receivable_Acct, C_Prepayment_Acct, WriteOff_Acct, Writeoff_Rev_Acct, V_Liability_Acct, V_Prepayment_Acct, NotInvoicedReceipts_Acct, DoubtfulDebt_Acct, Baddebtexpense_Acct, BadDebtRevenue_Acct, Allowancefordoubtful_Acct, P_Asset_Acct, P_Expense_Acct, P_Def_Expense_Acct, P_Revenue_Acct, P_Def_Revenue_Acct, P_Cogs_Acct, Withholding_Acct, P_InvoicePriceVariance_Acct, P_Revenue_Return_Acct, P_Cogs_Return_Acct, W_Inventory_Acct, W_Differences_Acct, W_Revaluation_Acct, PJ_WIP_Acct, B_Asset_Acct, B_InTransit_Acct, B_Expense_Acct, B_RevaluationGain_Acct, B_RevaluationLoss_Acct, T_Due_Acct, T_Credit_Acct, Ch_Expense_Acct, CB_Asset_Acct, CB_Differences_Acct, CB_CashTransfer_Acct, CB_Expense_Acct, CB_Receipt_Acct, B_PaymentSelect_Acct, A_Depreciation_Acct, A_Accumdepreciation_Acct, Processing, E_Expense_Acct, E_Prepayment_Acct, PJ_Asset_Acct, V_Liability_Services_Acct, NotInvoicedRevenue_Acct, P_PurchasePriceVariance_Acct, PayDiscount_Exp_Acct, PayDiscount_Rev_Acct, UnrealizedGain_Acct, UnrealizedLoss_Acct, RealizedGain_Acct, RealizedLoss_Acct, T_Expense_Acct, T_Liability_Acct, T_Receivables_Acct, B_InterestRev_Acct, B_InterestExp_Acct, B_Unidentified_Acct, B_SettlementGain_Acct, Ch_Revenue_Acct, UnEarnedRevenue_Acct, NotInvoicedReceivables_Acct, P_TradeDiscountRec_Acct, P_TradeDiscountGrant_Acct, W_InvActualAdjust_Acct, B_UnallocatedCash_Acct, B_SettlementLoss_Acct, C_Acctschema_Default_ID, A_Disposal_Loss, A_Disposal_Gain, IsActive, C_AcctSchema_ID, AD_Client_ID, AD_Org_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cReceivableAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vPrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceiptsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, doubtfuldebtAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtexpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, baddebtrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allowancefordoubtfulAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pDefRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, withholdingAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pInvoicepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsReturnAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wInventoryAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wDifferencesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wRevaluationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pjWipAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bIntransitAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bRevaluationgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bRevaluationlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tDueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tCreditAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbDifferencesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbCashtransferAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbReceiptAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bPaymentselectAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDepreciationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAccumdepreciationAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, eExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ePrepaymentAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pjAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vLiabilityServicesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pPurchasepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountExpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paydiscountRevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unrealizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, realizedlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tLiabilityAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tReceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bInterestrevAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bInterestexpAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bUnidentifiedAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bSettlementgainAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unearnedrevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, notinvoicedreceivablesAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountrecAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountgrantAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wInvactualadjustAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bUnallocatedcashAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bSettlementlossAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaDefaultId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDisposalLoss);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aDisposalGain);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int delete(ConnectionProvider connectionProvider, String param1, String cAcctschemaId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_AcctSchema_Default" +
      "        WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ? " +
      "                 AND C_AcctSchema_Default.C_AcctSchema_ID = ? " +
      "        AND C_AcctSchema_Default.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_AcctSchema_Default.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM C_AcctSchema_Default" +
      "         WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_ORG_ID");
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

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM C_AcctSchema_Default" +
      "         WHERE C_AcctSchema_Default.C_Acctschema_Default_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
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
}
