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

class DocLineGLJournalData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocLineGLJournalData.class);
  private String InitRecordNumber="0";
  public String glJournallineId;
  public String adClientId;
  public String adOrgId;
  public String line;
  public String description;
  public String cCurrencyId;
  public String amtsourcedr;
  public String amtsourcecr;
  public String currencyratetype;
  public String currencyrate;
  public String dateacct;
  public String amtacctdr;
  public String amtacctcr;
  public String cUomId;
  public String qty;
  public String cAcctschemaId;
  public String cValidcombinationId;
  public String accountId;
  public String adOrgtrxId;
  public String cLocfromId;
  public String cLoctoId;
  public String mProductId;
  public String cBpartnerId;
  public String cSalesregionId;
  public String cProjectId;
  public String cCampaignId;
  public String cActivityId;
  public String user1Id;
  public String user2Id;
  public String cCostcenterId;
  public String aAssetId;
  public String cDebtPaymentId;
  public String cWithholdingId;
  public String cTaxId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("GL_JOURNALLINE_ID") || fieldName.equals("glJournallineId"))
      return glJournallineId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("AMTSOURCEDR"))
      return amtsourcedr;
    else if (fieldName.equalsIgnoreCase("AMTSOURCECR"))
      return amtsourcecr;
    else if (fieldName.equalsIgnoreCase("CURRENCYRATETYPE"))
      return currencyratetype;
    else if (fieldName.equalsIgnoreCase("CURRENCYRATE"))
      return currencyrate;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("AMTACCTDR"))
      return amtacctdr;
    else if (fieldName.equalsIgnoreCase("AMTACCTCR"))
      return amtacctcr;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("QTY"))
      return qty;
    else if (fieldName.equalsIgnoreCase("C_ACCTSCHEMA_ID") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
    else if (fieldName.equalsIgnoreCase("C_VALIDCOMBINATION_ID") || fieldName.equals("cValidcombinationId"))
      return cValidcombinationId;
    else if (fieldName.equalsIgnoreCase("ACCOUNT_ID") || fieldName.equals("accountId"))
      return accountId;
    else if (fieldName.equalsIgnoreCase("AD_ORGTRX_ID") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("C_LOCFROM_ID") || fieldName.equals("cLocfromId"))
      return cLocfromId;
    else if (fieldName.equalsIgnoreCase("C_LOCTO_ID") || fieldName.equals("cLoctoId"))
      return cLoctoId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
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
    else if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("A_ASSET_ID") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("C_DEBT_PAYMENT_ID") || fieldName.equals("cDebtPaymentId"))
      return cDebtPaymentId;
    else if (fieldName.equalsIgnoreCase("C_WITHHOLDING_ID") || fieldName.equals("cWithholdingId"))
      return cWithholdingId;
    else if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocLineGLJournalData[] select(ConnectionProvider connectionProvider, String GL_Journal_ID)    throws ServletException {
    return select(connectionProvider, GL_Journal_ID, 0, 0);
  }

  public static DocLineGLJournalData[] select(ConnectionProvider connectionProvider, String GL_Journal_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT jl.GL_JournalLine_ID,jl.AD_Client_ID,jl.AD_Org_ID,jl.Line,jl.Description," +
      "        jl.C_Currency_ID,jl.AmtSourceDr,jl.AmtSourceCr,jl.CurrencyRateType,jl.CurrencyRate," +
      "        j.DateAcct,jl.AmtAcctDr,jl.AmtAcctCr,jl.C_UOM_ID,jl.Qty,vc.C_AcctSchema_ID,vc.C_ValidCombination_ID," +
      "        vc.Account_ID,vc.AD_OrgTrx_ID,vc.C_LocFrom_ID,vc.C_LocTo_ID," +
      "        COALESCE(jl.M_Product_ID, vc.M_Product_ID) as M_Product_ID," +
      "        COALESCE(jl.C_BPartner_ID, vc.C_BPartner_ID) as C_BPartner_ID," +
      "        COALESCE(jl.C_SalesRegion_ID,vc.C_SalesRegion_ID) as C_SalesRegion_ID," +
      "        COALESCE(jl.C_Project_ID,vc.C_Project_ID) as C_Project_ID," +
      "        COALESCE(jl.C_Campaign_ID,vc.C_Campaign_ID) as C_Campaign_ID," +
      "        COALESCE(jl.C_Activity_ID,vc.C_Activity_ID) as C_Activity_ID," +
      "        COALESCE(jl.User1_ID,vc.User1_ID) as User1_ID," +
      "        COALESCE(jl.User2_ID,vc.User2_ID) as User2_ID," +
      "        jl.C_COSTCENTER_ID, jl.A_ASSET_ID," +
      "        jl.C_DEBT_PAYMENT_ID, jl.C_WithHolding_ID, jl.C_Tax_ID" +
      "        FROM C_ValidCombination vc, GL_JournalLine jl , GL_Journal j" +
      "        WHERE j.GL_JOURNAL_ID = jl.GL_JOURNAL_ID" +
      "        and vc.C_ValidCombination_ID=jl.C_ValidCombination_ID" +
      "        AND jl.GL_Journal_ID = ?" +
      "        AND jl.IsActive='Y'" +
      "        AND vc.IsFullyQualified='Y'" +
      "        ORDER BY jl.Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, GL_Journal_ID);

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
        DocLineGLJournalData objectDocLineGLJournalData = new DocLineGLJournalData();
        objectDocLineGLJournalData.glJournallineId = UtilSql.getValue(result, "GL_JOURNALLINE_ID");
        objectDocLineGLJournalData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocLineGLJournalData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocLineGLJournalData.line = UtilSql.getValue(result, "LINE");
        objectDocLineGLJournalData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocLineGLJournalData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocLineGLJournalData.amtsourcedr = UtilSql.getValue(result, "AMTSOURCEDR");
        objectDocLineGLJournalData.amtsourcecr = UtilSql.getValue(result, "AMTSOURCECR");
        objectDocLineGLJournalData.currencyratetype = UtilSql.getValue(result, "CURRENCYRATETYPE");
        objectDocLineGLJournalData.currencyrate = UtilSql.getValue(result, "CURRENCYRATE");
        objectDocLineGLJournalData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocLineGLJournalData.amtacctdr = UtilSql.getValue(result, "AMTACCTDR");
        objectDocLineGLJournalData.amtacctcr = UtilSql.getValue(result, "AMTACCTCR");
        objectDocLineGLJournalData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocLineGLJournalData.qty = UtilSql.getValue(result, "QTY");
        objectDocLineGLJournalData.cAcctschemaId = UtilSql.getValue(result, "C_ACCTSCHEMA_ID");
        objectDocLineGLJournalData.cValidcombinationId = UtilSql.getValue(result, "C_VALIDCOMBINATION_ID");
        objectDocLineGLJournalData.accountId = UtilSql.getValue(result, "ACCOUNT_ID");
        objectDocLineGLJournalData.adOrgtrxId = UtilSql.getValue(result, "AD_ORGTRX_ID");
        objectDocLineGLJournalData.cLocfromId = UtilSql.getValue(result, "C_LOCFROM_ID");
        objectDocLineGLJournalData.cLoctoId = UtilSql.getValue(result, "C_LOCTO_ID");
        objectDocLineGLJournalData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocLineGLJournalData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocLineGLJournalData.cSalesregionId = UtilSql.getValue(result, "C_SALESREGION_ID");
        objectDocLineGLJournalData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocLineGLJournalData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocLineGLJournalData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocLineGLJournalData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocLineGLJournalData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocLineGLJournalData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocLineGLJournalData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectDocLineGLJournalData.cDebtPaymentId = UtilSql.getValue(result, "C_DEBT_PAYMENT_ID");
        objectDocLineGLJournalData.cWithholdingId = UtilSql.getValue(result, "C_WITHHOLDING_ID");
        objectDocLineGLJournalData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocLineGLJournalData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineGLJournalData);
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
    DocLineGLJournalData objectDocLineGLJournalData[] = new DocLineGLJournalData[vector.size()];
    vector.copyInto(objectDocLineGLJournalData);
    return(objectDocLineGLJournalData);
  }
}
