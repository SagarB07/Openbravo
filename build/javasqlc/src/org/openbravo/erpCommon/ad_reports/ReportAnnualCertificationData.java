//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class ReportAnnualCertificationData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportAnnualCertificationData.class);
  private String InitRecordNumber="0";
  public String mittente;
  public String erogante;
  public String addressorganization;
  public String businesspartner;
  public String orgid;
  public String taxid;
  public String fiscalcode;
  public String address1;
  public String postal;
  public String city;
  public String locode;
  public String dateplanned;
  public String name;
  public String codebank;
  public String codebranch;
  public String digitcontrolbank;
  public String digitcontrolbankaccount;
  public String codeaccount;
  public String summedlineamount;
  public String grandtotalamount;
  public String withholdingamount;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("MITTENTE"))
      return mittente;
    else if (fieldName.equalsIgnoreCase("EROGANTE"))
      return erogante;
    else if (fieldName.equalsIgnoreCase("ADDRESSORGANIZATION"))
      return addressorganization;
    else if (fieldName.equalsIgnoreCase("BUSINESSPARTNER"))
      return businesspartner;
    else if (fieldName.equalsIgnoreCase("ORGID"))
      return orgid;
    else if (fieldName.equalsIgnoreCase("TAXID"))
      return taxid;
    else if (fieldName.equalsIgnoreCase("FISCALCODE"))
      return fiscalcode;
    else if (fieldName.equalsIgnoreCase("ADDRESS1"))
      return address1;
    else if (fieldName.equalsIgnoreCase("POSTAL"))
      return postal;
    else if (fieldName.equalsIgnoreCase("CITY"))
      return city;
    else if (fieldName.equalsIgnoreCase("LOCODE"))
      return locode;
    else if (fieldName.equalsIgnoreCase("DATEPLANNED"))
      return dateplanned;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("CODEBANK"))
      return codebank;
    else if (fieldName.equalsIgnoreCase("CODEBRANCH"))
      return codebranch;
    else if (fieldName.equalsIgnoreCase("DIGITCONTROLBANK"))
      return digitcontrolbank;
    else if (fieldName.equalsIgnoreCase("DIGITCONTROLBANKACCOUNT"))
      return digitcontrolbankaccount;
    else if (fieldName.equalsIgnoreCase("CODEACCOUNT"))
      return codeaccount;
    else if (fieldName.equalsIgnoreCase("SUMMEDLINEAMOUNT"))
      return summedlineamount;
    else if (fieldName.equalsIgnoreCase("GRANDTOTALAMOUNT"))
      return grandtotalamount;
    else if (fieldName.equalsIgnoreCase("WITHHOLDINGAMOUNT"))
      return withholdingamount;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportAnnualCertificationData[] select(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String parDateFrom, String parDateTo, String cBpartnerId)    throws ServletException {
    return select(connectionProvider, adUserClient, adUserOrg, parDateFrom, parDateTo, cBpartnerId, 0, 0);
  }

  public static ReportAnnualCertificationData[] select(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String parDateFrom, String parDateTo, String cBpartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      " SELECT '' as Mittente, '' as Erogante,'' as  AddressOrganization,buspar.name as BusinessPartner,org.AD_ORG_ID as OrgID,buspar.taxid,buspar.fiscalcode,Loc.ADDRESS1,Loc.POSTAL,City.NAME as City,City.LOCODE," +
      " debpaycancel.DATEPLANNED,bank.Name,bank.Codebank,bank.Codebranch,bank.Digitcontrol as DigitcontrolBank,bankaccount.Digitcontrol as DigitcontrolBankAccount,bankaccount.Codeaccount," +
      " coalesce ( sum(invoic.TOTALLINES),0) as SummedLineAmount," +
      " coalesce ( sum(invoic.GRANDTOTAL),0) as GrandTotalAmount," +
      " coalesce ( sum(invoic.WITHHOLDINGAMOUNT),0) as WithHoldingAmount" +
      " FROM " +
      " (select * from C_INVOICE where ISACTIVE='Y' " +
      " and AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      " AND 3=3";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":"  AND AD_ORG_ID IN(?) ");
    strSql = strSql + 
      " ) invoic " +
      " join (select * from C_DEBT_PAYMENT_CANCEL where ISACTIVE='Y' " +
      " AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":" AND DATEPLANNED >= to_date(?)  ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":" AND DATEPLANNED < to_date(?)  ");
    strSql = strSql + 
      " ) debpaycancel on invoic.C_INVOICE_ID=debpaycancel.C_INVOICE_ID " +
      " join (select * from C_SETTLEMENT where ISACTIVE='Y' " +
      " and PROCESSED='Y' " +
      " ) settlm on settlm.C_SETTLEMENT_ID=debpaycancel.C_SETTLEMENT_ID" +
      " join (select * from C_DEBT_PAYMENT_GENERATE where ISACTIVE='Y' " +
      " ) debpaygenerate on settlm.C_SETTLEMENT_ID=debpaygenerate.C_SETTLEMENT_ID" +
      " join (select * from C_BPARTNER where ISACTIVE='Y' " +
      " AND 2=2";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND C_BPARTNER_ID IN" + cBpartnerId);
    strSql = strSql + 
      " ) buspar on buspar.C_BPARTNER_ID=invoic.C_BPARTNER_ID " +
      " left join (select C_BPARTNER_ID,C_LOCATION_ID from C_BPARTNER_LOCATION where ISACTIVE='Y' and ISBILLTO='Y') BprLoc  on buspar.C_BPARTNER_ID=BprLoc.C_BPARTNER_ID" +
      " left join (select C_LOCATION_ID,C_CITY_ID,ADDRESS1,POSTAL from C_LOCATION where ISACTIVE='Y' ) Loc on  BprLoc.C_LOCATION_ID = Loc.C_LOCATION_ID " +
      " left join (select C_CITY_ID,NAME,LOCODE from C_CITY where ISACTIVE='Y' ) City  on Loc.C_CITY_ID=City.C_CITY_ID " +
      " left join (select C_BankAccount_ID, C_Bank_ID, Digitcontrol, Codeaccount from C_BankAccount) bankaccount on (debpaygenerate.C_BankAccount_ID = bankaccount.C_BankAccount_ID) " +
      " left join (select C_Bank_ID, Name, Codebank, Codebranch, Digitcontrol from C_Bank) bank on (bank.C_Bank_ID = bankaccount.C_Bank_ID) " +
      " left join (select AD_ORG_ID from AD_ORG) org on (org.AD_ORG_ID = invoic.AD_ORG_ID)" +
      " group by buspar.name,buspar.taxid,buspar.fiscalcode,org.AD_ORG_ID,Loc.ADDRESS1,Loc.POSTAL,City.NAME,City.LOCODE ,debpaycancel.DATEPLANNED,bank.Name,bank.Codebank,bank.Codebranch,bank.Digitcontrol,bankaccount.Digitcontrol,bankaccount.Codeaccount" +
      " order by buspar.name asc";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserOrg);
      }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (cBpartnerId != null && !(cBpartnerId.equals(""))) {
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
        ReportAnnualCertificationData objectReportAnnualCertificationData = new ReportAnnualCertificationData();
        objectReportAnnualCertificationData.mittente = UtilSql.getValue(result, "MITTENTE");
        objectReportAnnualCertificationData.erogante = UtilSql.getValue(result, "EROGANTE");
        objectReportAnnualCertificationData.addressorganization = UtilSql.getValue(result, "ADDRESSORGANIZATION");
        objectReportAnnualCertificationData.businesspartner = UtilSql.getValue(result, "BUSINESSPARTNER");
        objectReportAnnualCertificationData.orgid = UtilSql.getValue(result, "ORGID");
        objectReportAnnualCertificationData.taxid = UtilSql.getValue(result, "TAXID");
        objectReportAnnualCertificationData.fiscalcode = UtilSql.getValue(result, "FISCALCODE");
        objectReportAnnualCertificationData.address1 = UtilSql.getValue(result, "ADDRESS1");
        objectReportAnnualCertificationData.postal = UtilSql.getValue(result, "POSTAL");
        objectReportAnnualCertificationData.city = UtilSql.getValue(result, "CITY");
        objectReportAnnualCertificationData.locode = UtilSql.getValue(result, "LOCODE");
        objectReportAnnualCertificationData.dateplanned = UtilSql.getDateValue(result, "DATEPLANNED", "dd-MM-yyyy");
        objectReportAnnualCertificationData.name = UtilSql.getValue(result, "NAME");
        objectReportAnnualCertificationData.codebank = UtilSql.getValue(result, "CODEBANK");
        objectReportAnnualCertificationData.codebranch = UtilSql.getValue(result, "CODEBRANCH");
        objectReportAnnualCertificationData.digitcontrolbank = UtilSql.getValue(result, "DIGITCONTROLBANK");
        objectReportAnnualCertificationData.digitcontrolbankaccount = UtilSql.getValue(result, "DIGITCONTROLBANKACCOUNT");
        objectReportAnnualCertificationData.codeaccount = UtilSql.getValue(result, "CODEACCOUNT");
        objectReportAnnualCertificationData.summedlineamount = UtilSql.getValue(result, "SUMMEDLINEAMOUNT");
        objectReportAnnualCertificationData.grandtotalamount = UtilSql.getValue(result, "GRANDTOTALAMOUNT");
        objectReportAnnualCertificationData.withholdingamount = UtilSql.getValue(result, "WITHHOLDINGAMOUNT");
        objectReportAnnualCertificationData.rownum = Long.toString(countRecord);
        objectReportAnnualCertificationData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportAnnualCertificationData);
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
    ReportAnnualCertificationData objectReportAnnualCertificationData[] = new ReportAnnualCertificationData[vector.size()];
    vector.copyInto(objectReportAnnualCertificationData);
    return(objectReportAnnualCertificationData);
  }

  public static ReportAnnualCertificationData[] set()    throws ServletException {
    ReportAnnualCertificationData objectReportAnnualCertificationData[] = new ReportAnnualCertificationData[1];
    objectReportAnnualCertificationData[0] = new ReportAnnualCertificationData();
    objectReportAnnualCertificationData[0].mittente = "";
    objectReportAnnualCertificationData[0].erogante = "";
    objectReportAnnualCertificationData[0].addressorganization = "";
    objectReportAnnualCertificationData[0].businesspartner = "";
    objectReportAnnualCertificationData[0].orgid = "";
    objectReportAnnualCertificationData[0].taxid = "";
    objectReportAnnualCertificationData[0].fiscalcode = "";
    objectReportAnnualCertificationData[0].address1 = "";
    objectReportAnnualCertificationData[0].postal = "";
    objectReportAnnualCertificationData[0].city = "";
    objectReportAnnualCertificationData[0].locode = "";
    objectReportAnnualCertificationData[0].dateplanned = "";
    objectReportAnnualCertificationData[0].name = "";
    objectReportAnnualCertificationData[0].codebank = "";
    objectReportAnnualCertificationData[0].codebranch = "";
    objectReportAnnualCertificationData[0].digitcontrolbank = "";
    objectReportAnnualCertificationData[0].digitcontrolbankaccount = "";
    objectReportAnnualCertificationData[0].codeaccount = "";
    objectReportAnnualCertificationData[0].summedlineamount = "";
    objectReportAnnualCertificationData[0].grandtotalamount = "";
    objectReportAnnualCertificationData[0].withholdingamount = "";
    return objectReportAnnualCertificationData;
  }
}
