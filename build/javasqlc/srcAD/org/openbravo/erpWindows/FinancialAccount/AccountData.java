//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.FinancialAccount;

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
class AccountData implements FieldProvider {
static Logger log4j = Logger.getLogger(AccountData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String name;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String type;
  public String typer;
  public String description;
  public String cLocationId;
  public String cLocationIdr;
  public String cBpartnerId;
  public String isactive;
  public String isdefault;
  public String currentbalance;
  public String creditlimit;
  public String initialbalance;
  public String finMatchingAlgorithmId;
  public String finMatchingAlgorithmIdr;
  public String genericaccountno;
  public String iban;
  public String swiftcode;
  public String ineNumber;
  public String cCountryId;
  public String cCountryIdr;
  public String bankformat;
  public String bankformatr;
  public String emGacNoperkiraan;
  public String typewriteoff;
  public String typewriteoffr;
  public String writeofflimit;
  public String emAprmImportbankfile;
  public String emAprmMatchtransForce;
  public String emAprmMatchtransactions;
  public String emAprmReconcile;
  public String emAprmAddtransactions;
  public String codebank;
  public String codebranch;
  public String bankDigitcontrol;
  public String accountDigitcontrol;
  public String codeaccount;
  public String accountno;
  public String finFinancialAccountId;
  public String routingno;
  public String adClientId;
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
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("TYPE"))
      return type;
    else if (fieldName.equalsIgnoreCase("TYPER"))
      return typer;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_LOCATION_ID") || fieldName.equals("cLocationId"))
      return cLocationId;
    else if (fieldName.equalsIgnoreCase("C_LOCATION_IDR") || fieldName.equals("cLocationIdr"))
      return cLocationIdr;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ISDEFAULT"))
      return isdefault;
    else if (fieldName.equalsIgnoreCase("CURRENTBALANCE"))
      return currentbalance;
    else if (fieldName.equalsIgnoreCase("CREDITLIMIT"))
      return creditlimit;
    else if (fieldName.equalsIgnoreCase("INITIALBALANCE"))
      return initialbalance;
    else if (fieldName.equalsIgnoreCase("FIN_MATCHING_ALGORITHM_ID") || fieldName.equals("finMatchingAlgorithmId"))
      return finMatchingAlgorithmId;
    else if (fieldName.equalsIgnoreCase("FIN_MATCHING_ALGORITHM_IDR") || fieldName.equals("finMatchingAlgorithmIdr"))
      return finMatchingAlgorithmIdr;
    else if (fieldName.equalsIgnoreCase("GENERICACCOUNTNO"))
      return genericaccountno;
    else if (fieldName.equalsIgnoreCase("IBAN"))
      return iban;
    else if (fieldName.equalsIgnoreCase("SWIFTCODE"))
      return swiftcode;
    else if (fieldName.equalsIgnoreCase("INE_NUMBER") || fieldName.equals("ineNumber"))
      return ineNumber;
    else if (fieldName.equalsIgnoreCase("C_COUNTRY_ID") || fieldName.equals("cCountryId"))
      return cCountryId;
    else if (fieldName.equalsIgnoreCase("C_COUNTRY_IDR") || fieldName.equals("cCountryIdr"))
      return cCountryIdr;
    else if (fieldName.equalsIgnoreCase("BANKFORMAT"))
      return bankformat;
    else if (fieldName.equalsIgnoreCase("BANKFORMATR"))
      return bankformatr;
    else if (fieldName.equalsIgnoreCase("EM_GAC_NOPERKIRAAN") || fieldName.equals("emGacNoperkiraan"))
      return emGacNoperkiraan;
    else if (fieldName.equalsIgnoreCase("TYPEWRITEOFF"))
      return typewriteoff;
    else if (fieldName.equalsIgnoreCase("TYPEWRITEOFFR"))
      return typewriteoffr;
    else if (fieldName.equalsIgnoreCase("WRITEOFFLIMIT"))
      return writeofflimit;
    else if (fieldName.equalsIgnoreCase("EM_APRM_IMPORTBANKFILE") || fieldName.equals("emAprmImportbankfile"))
      return emAprmImportbankfile;
    else if (fieldName.equalsIgnoreCase("EM_APRM_MATCHTRANS_FORCE") || fieldName.equals("emAprmMatchtransForce"))
      return emAprmMatchtransForce;
    else if (fieldName.equalsIgnoreCase("EM_APRM_MATCHTRANSACTIONS") || fieldName.equals("emAprmMatchtransactions"))
      return emAprmMatchtransactions;
    else if (fieldName.equalsIgnoreCase("EM_APRM_RECONCILE") || fieldName.equals("emAprmReconcile"))
      return emAprmReconcile;
    else if (fieldName.equalsIgnoreCase("EM_APRM_ADDTRANSACTIONS") || fieldName.equals("emAprmAddtransactions"))
      return emAprmAddtransactions;
    else if (fieldName.equalsIgnoreCase("CODEBANK"))
      return codebank;
    else if (fieldName.equalsIgnoreCase("CODEBRANCH"))
      return codebranch;
    else if (fieldName.equalsIgnoreCase("BANK_DIGITCONTROL") || fieldName.equals("bankDigitcontrol"))
      return bankDigitcontrol;
    else if (fieldName.equalsIgnoreCase("ACCOUNT_DIGITCONTROL") || fieldName.equals("accountDigitcontrol"))
      return accountDigitcontrol;
    else if (fieldName.equalsIgnoreCase("CODEACCOUNT"))
      return codeaccount;
    else if (fieldName.equalsIgnoreCase("ACCOUNTNO"))
      return accountno;
    else if (fieldName.equalsIgnoreCase("FIN_FINANCIAL_ACCOUNT_ID") || fieldName.equals("finFinancialAccountId"))
      return finFinancialAccountId;
    else if (fieldName.equalsIgnoreCase("ROUTINGNO"))
      return routingno;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
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
  public static AccountData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static AccountData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(FIN_Financial_Account.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Financial_Account.CreatedBy) as CreatedByR, " +
      "        to_char(FIN_Financial_Account.Updated, ?) as updated, " +
      "        to_char(FIN_Financial_Account.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        FIN_Financial_Account.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Financial_Account.UpdatedBy) as UpdatedByR," +
      "        FIN_Financial_Account.AD_Org_ID, " +
      "(CASE WHEN FIN_Financial_Account.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "FIN_Financial_Account.Name, " +
      "FIN_Financial_Account.C_Currency_ID, " +
      "(CASE WHEN FIN_Financial_Account.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "FIN_Financial_Account.Type, " +
      "(CASE WHEN FIN_Financial_Account.Type IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS TypeR, " +
      "FIN_Financial_Account.Description, " +
      "FIN_Financial_Account.C_Location_ID, " +
      "(CASE WHEN FIN_Financial_Account.C_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Address1), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Address2), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Postal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.City), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'') ) END) AS C_Location_IDR, " +
      "FIN_Financial_Account.C_Bpartner_ID, " +
      "COALESCE(FIN_Financial_Account.Isactive, 'N') AS Isactive, " +
      "COALESCE(FIN_Financial_Account.Isdefault, 'N') AS Isdefault, " +
      "FIN_Financial_Account.Currentbalance, " +
      "FIN_Financial_Account.Creditlimit, " +
      "FIN_Financial_Account.InitialBalance, " +
      "FIN_Financial_Account.FIN_Matching_Algorithm_ID, " +
      "(CASE WHEN FIN_Financial_Account.FIN_Matching_Algorithm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS FIN_Matching_Algorithm_IDR, " +
      "FIN_Financial_Account.GenericAccountNo, " +
      "FIN_Financial_Account.Iban, " +
      "FIN_Financial_Account.Swiftcode, " +
      "FIN_Financial_Account.INE_Number, " +
      "FIN_Financial_Account.C_Country_ID, " +
      "(CASE WHEN FIN_Financial_Account.C_Country_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL8.Name IS NULL THEN TO_CHAR(table8.Name) ELSE TO_CHAR(tableTRL8.Name) END)), ''))),'') ) END) AS C_Country_IDR, " +
      "FIN_Financial_Account.BankFormat, " +
      "(CASE WHEN FIN_Financial_Account.BankFormat IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS BankFormatR, " +
      "FIN_Financial_Account.EM_Gac_Noperkiraan, " +
      "FIN_Financial_Account.Typewriteoff, " +
      "(CASE WHEN FIN_Financial_Account.Typewriteoff IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS TypewriteoffR, " +
      "FIN_Financial_Account.Writeofflimit, " +
      "FIN_Financial_Account.EM_APRM_ImportBankFile, " +
      "FIN_Financial_Account.EM_APRM_MatchTrans_Force, " +
      "FIN_Financial_Account.EM_APRM_MatchTransactions, " +
      "FIN_Financial_Account.EM_APRM_Reconcile, " +
      "FIN_Financial_Account.EM_APRM_AddTransactions, " +
      "FIN_Financial_Account.Codebank, " +
      "FIN_Financial_Account.Codebranch, " +
      "FIN_Financial_Account.Bank_Digitcontrol, " +
      "FIN_Financial_Account.Account_Digitcontrol, " +
      "FIN_Financial_Account.Codeaccount, " +
      "FIN_Financial_Account.Accountno, " +
      "FIN_Financial_Account.Fin_Financial_Account_ID, " +
      "FIN_Financial_Account.Routingno, " +
      "FIN_Financial_Account.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM FIN_Financial_Account left join (select AD_Org_ID, Value from AD_Org) table1 on (FIN_Financial_Account.AD_Org_ID = table1.AD_Org_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (FIN_Financial_Account.C_Currency_ID = table2.C_Currency_ID) left join ad_ref_list_v list1 on (FIN_Financial_Account.Type = list1.value and list1.ad_reference_id = 'A6BDFA712FF948CE903C4C463E832FC1' and list1.ad_language = ?)  left join (select C_Location_ID, Address1, Address2, Postal, City, C_Region_ID, C_Country_ID from C_Location) table3 on (FIN_Financial_Account.C_Location_ID = table3.C_Location_ID) left join (select C_Region_ID, Name from C_Region) table4 on (table3.C_Region_ID = table4.C_Region_ID) left join (select C_Country_ID, Name from C_Country) table5 on (table3.C_Country_ID = table5.C_Country_ID) left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL5 on (table5.C_Country_ID = tableTRL5.C_Country_ID and tableTRL5.AD_Language = ?)  left join (select FIN_Matching_Algorithm_ID, Name from FIN_Matching_Algorithm) table7 on (FIN_Financial_Account.FIN_Matching_Algorithm_ID = table7.FIN_Matching_Algorithm_ID) left join (select C_Country_ID, Name from C_Country) table8 on (FIN_Financial_Account.C_Country_ID = table8.C_Country_ID) left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL8 on (table8.C_Country_ID = tableTRL8.C_Country_ID and tableTRL8.AD_Language = ?)  left join ad_ref_list_v list2 on (FIN_Financial_Account.BankFormat = list2.value and list2.ad_reference_id = 'C123B7BF5B2C438D84D2E509734776B5' and list2.ad_language = ?)  left join ad_ref_list_v list3 on (FIN_Financial_Account.Typewriteoff = list3.value and list3.ad_reference_id = 'C3531F85C14B4515AB7259F0D338050D' and list3.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND FIN_Financial_Account.Fin_Financial_Account_ID = ? " +
      "        AND FIN_Financial_Account.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND FIN_Financial_Account.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
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
        AccountData objectAccountData = new AccountData();
        objectAccountData.created = UtilSql.getValue(result, "CREATED");
        objectAccountData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectAccountData.updated = UtilSql.getValue(result, "UPDATED");
        objectAccountData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectAccountData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectAccountData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectAccountData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAccountData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectAccountData.name = UtilSql.getValue(result, "NAME");
        objectAccountData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectAccountData.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectAccountData.type = UtilSql.getValue(result, "TYPE");
        objectAccountData.typer = UtilSql.getValue(result, "TYPER");
        objectAccountData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAccountData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectAccountData.cLocationIdr = UtilSql.getValue(result, "C_LOCATION_IDR");
        objectAccountData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectAccountData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectAccountData.isdefault = UtilSql.getValue(result, "ISDEFAULT");
        objectAccountData.currentbalance = UtilSql.getValue(result, "CURRENTBALANCE");
        objectAccountData.creditlimit = UtilSql.getValue(result, "CREDITLIMIT");
        objectAccountData.initialbalance = UtilSql.getValue(result, "INITIALBALANCE");
        objectAccountData.finMatchingAlgorithmId = UtilSql.getValue(result, "FIN_MATCHING_ALGORITHM_ID");
        objectAccountData.finMatchingAlgorithmIdr = UtilSql.getValue(result, "FIN_MATCHING_ALGORITHM_IDR");
        objectAccountData.genericaccountno = UtilSql.getValue(result, "GENERICACCOUNTNO");
        objectAccountData.iban = UtilSql.getValue(result, "IBAN");
        objectAccountData.swiftcode = UtilSql.getValue(result, "SWIFTCODE");
        objectAccountData.ineNumber = UtilSql.getValue(result, "INE_NUMBER");
        objectAccountData.cCountryId = UtilSql.getValue(result, "C_COUNTRY_ID");
        objectAccountData.cCountryIdr = UtilSql.getValue(result, "C_COUNTRY_IDR");
        objectAccountData.bankformat = UtilSql.getValue(result, "BANKFORMAT");
        objectAccountData.bankformatr = UtilSql.getValue(result, "BANKFORMATR");
        objectAccountData.emGacNoperkiraan = UtilSql.getValue(result, "EM_GAC_NOPERKIRAAN");
        objectAccountData.typewriteoff = UtilSql.getValue(result, "TYPEWRITEOFF");
        objectAccountData.typewriteoffr = UtilSql.getValue(result, "TYPEWRITEOFFR");
        objectAccountData.writeofflimit = UtilSql.getValue(result, "WRITEOFFLIMIT");
        objectAccountData.emAprmImportbankfile = UtilSql.getValue(result, "EM_APRM_IMPORTBANKFILE");
        objectAccountData.emAprmMatchtransForce = UtilSql.getValue(result, "EM_APRM_MATCHTRANS_FORCE");
        objectAccountData.emAprmMatchtransactions = UtilSql.getValue(result, "EM_APRM_MATCHTRANSACTIONS");
        objectAccountData.emAprmReconcile = UtilSql.getValue(result, "EM_APRM_RECONCILE");
        objectAccountData.emAprmAddtransactions = UtilSql.getValue(result, "EM_APRM_ADDTRANSACTIONS");
        objectAccountData.codebank = UtilSql.getValue(result, "CODEBANK");
        objectAccountData.codebranch = UtilSql.getValue(result, "CODEBRANCH");
        objectAccountData.bankDigitcontrol = UtilSql.getValue(result, "BANK_DIGITCONTROL");
        objectAccountData.accountDigitcontrol = UtilSql.getValue(result, "ACCOUNT_DIGITCONTROL");
        objectAccountData.codeaccount = UtilSql.getValue(result, "CODEACCOUNT");
        objectAccountData.accountno = UtilSql.getValue(result, "ACCOUNTNO");
        objectAccountData.finFinancialAccountId = UtilSql.getValue(result, "FIN_FINANCIAL_ACCOUNT_ID");
        objectAccountData.routingno = UtilSql.getValue(result, "ROUTINGNO");
        objectAccountData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAccountData.language = UtilSql.getValue(result, "LANGUAGE");
        objectAccountData.adUserClient = "";
        objectAccountData.adOrgClient = "";
        objectAccountData.createdby = "";
        objectAccountData.trBgcolor = "";
        objectAccountData.totalCount = "";
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

/**
Create a registry
 */
  public static AccountData[] set(String bankformat, String emGacNoperkiraan, String writeofflimit, String typewriteoff, String initialbalance, String cCountryId, String finFinancialAccountId, String adClientId, String adOrgId, String createdby, String createdbyr, String updatedby, String updatedbyr, String isactive, String cCurrencyId, String name, String description, String type, String cBpartnerId, String cLocationId, String cLocationIdr, String routingno, String swiftcode, String codebank, String codebranch, String bankDigitcontrol, String ineNumber, String accountDigitcontrol, String codeaccount, String accountno, String currentbalance, String creditlimit, String iban, String isdefault, String emAprmMatchtransForce, String genericaccountno, String emAprmImportbankfile, String emAprmMatchtransactions, String emAprmReconcile, String emAprmAddtransactions, String finMatchingAlgorithmId)    throws ServletException {
    AccountData objectAccountData[] = new AccountData[1];
    objectAccountData[0] = new AccountData();
    objectAccountData[0].created = "";
    objectAccountData[0].createdbyr = createdbyr;
    objectAccountData[0].updated = "";
    objectAccountData[0].updatedTimeStamp = "";
    objectAccountData[0].updatedby = updatedby;
    objectAccountData[0].updatedbyr = updatedbyr;
    objectAccountData[0].adOrgId = adOrgId;
    objectAccountData[0].adOrgIdr = "";
    objectAccountData[0].name = name;
    objectAccountData[0].cCurrencyId = cCurrencyId;
    objectAccountData[0].cCurrencyIdr = "";
    objectAccountData[0].type = type;
    objectAccountData[0].typer = "";
    objectAccountData[0].description = description;
    objectAccountData[0].cLocationId = cLocationId;
    objectAccountData[0].cLocationIdr = cLocationIdr;
    objectAccountData[0].cBpartnerId = cBpartnerId;
    objectAccountData[0].isactive = isactive;
    objectAccountData[0].isdefault = isdefault;
    objectAccountData[0].currentbalance = currentbalance;
    objectAccountData[0].creditlimit = creditlimit;
    objectAccountData[0].initialbalance = initialbalance;
    objectAccountData[0].finMatchingAlgorithmId = finMatchingAlgorithmId;
    objectAccountData[0].finMatchingAlgorithmIdr = "";
    objectAccountData[0].genericaccountno = genericaccountno;
    objectAccountData[0].iban = iban;
    objectAccountData[0].swiftcode = swiftcode;
    objectAccountData[0].ineNumber = ineNumber;
    objectAccountData[0].cCountryId = cCountryId;
    objectAccountData[0].cCountryIdr = "";
    objectAccountData[0].bankformat = bankformat;
    objectAccountData[0].bankformatr = "";
    objectAccountData[0].emGacNoperkiraan = emGacNoperkiraan;
    objectAccountData[0].typewriteoff = typewriteoff;
    objectAccountData[0].typewriteoffr = "";
    objectAccountData[0].writeofflimit = writeofflimit;
    objectAccountData[0].emAprmImportbankfile = emAprmImportbankfile;
    objectAccountData[0].emAprmMatchtransForce = emAprmMatchtransForce;
    objectAccountData[0].emAprmMatchtransactions = emAprmMatchtransactions;
    objectAccountData[0].emAprmReconcile = emAprmReconcile;
    objectAccountData[0].emAprmAddtransactions = emAprmAddtransactions;
    objectAccountData[0].codebank = codebank;
    objectAccountData[0].codebranch = codebranch;
    objectAccountData[0].bankDigitcontrol = bankDigitcontrol;
    objectAccountData[0].accountDigitcontrol = accountDigitcontrol;
    objectAccountData[0].codeaccount = codeaccount;
    objectAccountData[0].accountno = accountno;
    objectAccountData[0].finFinancialAccountId = finFinancialAccountId;
    objectAccountData[0].routingno = routingno;
    objectAccountData[0].adClientId = adClientId;
    objectAccountData[0].language = "";
    return objectAccountData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux4FD70C86888041D695C59CFA792BBCC6(ConnectionProvider connectionProvider, String FIN_Financial_Account_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select fin_reconciliation_id from fin_reconciliation where created = (" +
      "select max(created)" +
      "from fin_reconciliation " +
      "where fin_financial_account_id = ?) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_Financial_Account_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "FIN_RECONCILIATION_ID");
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
  public static String selectAux1FF62A68BA95425CA76E4317DD195C62(ConnectionProvider connectionProvider, String FIN_Financial_Account_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select coalesce(fin_reconciliation_id,'') from fin_reconciliation where fin_financial_account_id = ? and processed = 'N' ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_Financial_Account_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COALESCE(FIN_RECONCILIATION_ID,'')");
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
  public static String selectAuxA72A59A036BB47B09105AC5C3361C99C(ConnectionProvider connectionProvider, String fin_financial_account_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT count(*) FROM aprm_finacc_transaction_v inner join fin_finacc_transaction ON aprm_finacc_transaction_v.aprm_finacc_transaction_v_id = fin_finacc_transaction.fin_finacc_transaction_id WHERE aprm_finacc_transaction_v.fin_financial_account_id=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fin_financial_account_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COUNT(*)");
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
  public static String selectDef7891269C8404655DE040007F010155CE_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Createdby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedbyR);

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
  public static String selectDef7891269C8406655DE040007F010155CE_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Updatedby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedbyR);

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
Select for auxiliar field
 */
  public static String selectDef828EE0AE80485FA1E040007F010067C7_2(ConnectionProvider connectionProvider, String paramLanguage, String C_Location_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Address1), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Address2), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Postal), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.City), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))), '') ) as C_Location_ID FROM C_Location left join (select C_Location_ID, Address1, Address2, Postal, City, C_Region_ID, C_Country_ID from C_Location) table2 on (C_Location.C_Location_ID = table2.C_Location_ID)left join (select C_Region_ID, Name from C_Region) table3 on (table2.C_Region_ID = table3.C_Region_ID)left join (select C_Country_ID, Name from C_Country) table4 on (table2.C_Country_ID = table4.C_Country_ID)left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL4 on (table4.C_Country_ID = tableTRL4.C_Country_ID and tableTRL4.AD_Language = ?)  WHERE C_Location.isActive='Y' AND C_Location.C_Location_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Location_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_LOCATION_ID");
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
      "        UPDATE FIN_Financial_Account" +
      "        SET AD_Org_ID = (?) , Name = (?) , C_Currency_ID = (?) , Type = (?) , Description = (?) , C_Location_ID = (?) , C_Bpartner_ID = (?) , Isactive = (?) , Isdefault = (?) , Currentbalance = TO_NUMBER(?) , Creditlimit = TO_NUMBER(?) , InitialBalance = TO_NUMBER(?) , FIN_Matching_Algorithm_ID = (?) , GenericAccountNo = (?) , Iban = (?) , Swiftcode = (?) , INE_Number = (?) , C_Country_ID = (?) , BankFormat = (?) , EM_Gac_Noperkiraan = (?) , Typewriteoff = (?) , Writeofflimit = TO_NUMBER(?) , EM_APRM_ImportBankFile = (?) , EM_APRM_MatchTrans_Force = (?) , EM_APRM_MatchTransactions = (?) , EM_APRM_Reconcile = (?) , EM_APRM_AddTransactions = (?) , Codebank = (?) , Codebranch = (?) , Bank_Digitcontrol = (?) , Account_Digitcontrol = (?) , Codeaccount = (?) , Accountno = (?) , Fin_Financial_Account_ID = (?) , Routingno = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE FIN_Financial_Account.Fin_Financial_Account_ID = ? " +
      "        AND FIN_Financial_Account.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Financial_Account.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, type);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefault);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currentbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditlimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, initialbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finMatchingAlgorithmId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, genericaccountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iban);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, swiftcode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ineNumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCountryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bankformat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGacNoperkiraan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, typewriteoff);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeofflimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmImportbankfile);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmMatchtransForce);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmMatchtransactions);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmReconcile);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmAddtransactions);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, codebank);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, codebranch);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bankDigitcontrol);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountDigitcontrol);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, codeaccount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, routingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
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
      "        INSERT INTO FIN_Financial_Account " +
      "        (AD_Org_ID, Name, C_Currency_ID, Type, Description, C_Location_ID, C_Bpartner_ID, Isactive, Isdefault, Currentbalance, Creditlimit, InitialBalance, FIN_Matching_Algorithm_ID, GenericAccountNo, Iban, Swiftcode, INE_Number, C_Country_ID, BankFormat, EM_Gac_Noperkiraan, Typewriteoff, Writeofflimit, EM_APRM_ImportBankFile, EM_APRM_MatchTrans_Force, EM_APRM_MatchTransactions, EM_APRM_Reconcile, EM_APRM_AddTransactions, Codebank, Codebranch, Bank_Digitcontrol, Account_Digitcontrol, Codeaccount, Accountno, Fin_Financial_Account_ID, Routingno, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, type);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdefault);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, currentbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditlimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, initialbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finMatchingAlgorithmId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, genericaccountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iban);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, swiftcode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ineNumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCountryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bankformat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGacNoperkiraan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, typewriteoff);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeofflimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmImportbankfile);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmMatchtransForce);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmMatchtransactions);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmReconcile);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmAddtransactions);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, codebank);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, codebranch);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bankDigitcontrol);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountDigitcontrol);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, codeaccount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, routingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM FIN_Financial_Account" +
      "        WHERE FIN_Financial_Account.Fin_Financial_Account_ID = ? " +
      "        AND FIN_Financial_Account.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Financial_Account.AD_Org_ID IN (";
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
      "          FROM FIN_Financial_Account" +
      "         WHERE FIN_Financial_Account.Fin_Financial_Account_ID = ? ";

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
      "          FROM FIN_Financial_Account" +
      "         WHERE FIN_Financial_Account.Fin_Financial_Account_ID = ? ";

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
