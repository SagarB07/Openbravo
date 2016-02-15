/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2001-2014 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
 */

package com.gai.generalaccountingrpt.erpCommon.ad_reports;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.security.OrganizationStructureProvider;
import org.openbravo.dal.service.OBCriteria;
import org.openbravo.dal.service.OBDal;
import org.openbravo.data.FieldProvider;
/*
import org.openbravo.erpCommon.businessUtility.AccountTree;
import org.openbravo.erpCommon.businessUtility.AccountTreeData;
*/
import org.openbravo.erpCommon.businessUtility.AccountingSchemaMiscData;
import org.openbravo.erpCommon.businessUtility.Tree;
import org.openbravo.erpCommon.businessUtility.WindowTabs;
import org.openbravo.erpCommon.utility.ComboTableData;
import org.openbravo.erpCommon.utility.DateTimeData;
import org.openbravo.erpCommon.utility.FieldProviderFactory;
import org.openbravo.erpCommon.utility.LeftTabsBar;
import org.openbravo.erpCommon.utility.NavigationBar;
import org.openbravo.erpCommon.utility.OBDateUtils;
import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.ToolBar;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.erpCommon.utility.WindowTreeData;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.OrganizationClosing;
import org.openbravo.model.financialmgmt.calendar.Calendar;
import org.openbravo.model.financialmgmt.calendar.Year;
import org.openbravo.xmlEngine.XmlDocument;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import com.gai.generalaccountingrpt.erpCommon.businessUtility.AccountTree;
import com.gai.generalaccountingrpt.erpCommon.businessUtility.AccountTreeData;

import com.gai.generalaccountingrpt.erpCommon.businessUtility.AccountTreeCashflow;
import com.gai.generalaccountingrpt.erpCommon.businessUtility.AccountTreeCashflowData;

//mutasi
import com.gai.generalaccountingrpt.erpCommon.businessUtility.AccountTreeMutasi;
import com.gai.generalaccountingrpt.erpCommon.businessUtility.AccountTreeMutasiData;

import com.gai.generalaccountingrpt.erpCommon.businessUtility.AccountTreeKomperhensif;
import com.gai.generalaccountingrpt.erpCommon.businessUtility.AccountTreeKomperhensifData;

public class GeneralAccountingRpt extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  private static final String C_ELEMENT_VALUE_TABLE_ID = "188";

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);

    if (vars.commandIn("DEFAULT")) {
      String strDateFrom = vars.getGlobalVariable("inpDateFrom",
          "GeneralAccountingRpt|dateFrom", "");
      String strDateTo = vars.getGlobalVariable("inpDateTo", "GeneralAccountingRpt|dateTo", "");
      String strDateFromRef = vars.getGlobalVariable("inpDateFromRef",
          "GeneralAccountingRpt|dateFromRef", "");
      String strDateToRef = vars.getGlobalVariable("inpDateToRef",
          "GeneralAccountingRpt|dateToRef", "");
      String strAsDateTo = vars.getGlobalVariable("inpAsDateTo",
          "GeneralAccountingRpt|asDateTo", "");
      String strAsDateToRef = vars.getGlobalVariable("inpAsDateToRef",
          "GeneralAccountingRpt|asDateToRef", "");
      String strPageNo = vars
          .getGlobalVariable("inpPageNo", "GeneralAccountingRpt|PageNo", "1");
      String strElementValue = vars.getGlobalVariable("inpcElementvalueId",
          "GeneralAccountingRpt|C_ElementValue_ID", "");
      String strConImporte = vars.getGlobalVariable("inpConImporte",
          "GeneralAccountingRpt|conImporte", "N");
      String strConCodigo = vars.getGlobalVariable("inpConCodigo",
          "GeneralAccountingRpt|conCodigo", "N");
      String strLevel = vars.getGlobalVariable("inpLevel", "GeneralAccountingRpt|level", "");

      printPageDataSheet(response, vars, "", "", strDateFrom, strDateTo, strPageNo, strDateFromRef,
          strDateToRef, strAsDateTo, strAsDateToRef, strElementValue, strConImporte, "", strLevel,
          strConCodigo, "");

    } else if (vars.commandIn("PRINT_PDF")) {
      String strcAcctSchemaId = vars.getStringParameter("inpcAcctSchemaId", "");
      String strAgno = vars.getRequiredGlobalVariable("inpAgno", "GeneralAccountingRpt|agno");
      String strAgnoRef = vars.getRequiredGlobalVariable("inpAgnoRef",
          "GeneralAccountingRpt|agnoRef");
      String strDateFrom = vars.getRequestGlobalVariable("inpDateFrom",
          "GeneralAccountingRpt|dateFrom");
      String strDateTo = vars.getRequestGlobalVariable("inpDateTo",
          "GeneralAccountingRpt|dateTo");
      String strDateFromRef = vars.getRequestGlobalVariable("inpDateFromRef",
          "GeneralAccountingRpt|dateFromRef");
      String strDateToRef = vars.getRequestGlobalVariable("inpDateToRef",
          "GeneralAccountingRpt|dateToRef");
      String strPageNo = vars.getRequestGlobalVariable("inpPageNo",
          "GeneralAccountingRpt|PageNo");
      String strAsDateTo = vars.getRequestGlobalVariable("inpAsDateTo",
          "GeneralAccountingRpt|asDateTo");
      String strAsDateToRef = vars.getRequestGlobalVariable("inpAsDateToRef",
          "GeneralAccountingRpt|asDateToRef");
      String strElementValue = vars.getRequiredGlobalVariable("inpcElementvalueId",
          "GeneralAccountingRpt|C_ElementValue_ID");
      String strConImporte = vars.getRequestGlobalVariable("inpConImporte",
          "GeneralAccountingRpt|conImporte");
      String strConCodigo = vars.getRequestGlobalVariable("inpConCodigo",
          "GeneralAccountingRpt|conCodigo");
      String strOrg = vars.getRequestGlobalVariable("inpOrganizacion",
          "GeneralAccountingRpt|organizacion");
      String strLevel = vars.getRequestGlobalVariable("inpLevel", "GeneralAccountingRpt|level");
      //setHistoryCommand(request, "FIND");

      log4j.debug("Element ID : " + strElementValue);

      String strCalculateOpening = strElementValue.substring(0, 1);
      strElementValue = strElementValue.substring(1, strElementValue.length());
      String strRptSub = GeneralAccountingRptData.selectRptName(this,
        strElementValue);
      String strReportName = strRptSub.substring(strRptSub.indexOf("_")+1);

      log4j.debug("strRptSub : " + strRptSub);

      if (strReportName.equals("MutasiPL")) {
        printPageDataMutasi(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "pdf", strRptSub,
          strCalculateOpening);
      } else if (strReportName.equals("LabaRugiKomprehensif") || strReportName.equals("ArusKas") || strReportName.equals("RealisasiAnggaran")){
	  	log4j.debug("Masuk Laba Rugi Komperhensif");
        printPageDataKomperhensif(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "pdf", strRptSub,
          strCalculateOpening);
      } else if (strReportName.equals("Cashflow")){
      log4j.debug("Masuk Cashflow");
        printPageDataCashflow(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "pdf", strRptSub,
          strCalculateOpening);
      } else {
        printPageData(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "pdf", strRptSub,
          strCalculateOpening);
      }

        /*printPageData(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "pdf");
        */
    } else if (vars.commandIn("PRINT_XLS")) {
      String strcAcctSchemaId = vars.getStringParameter("inpcAcctSchemaId", "");
      String strAgno = vars.getRequiredGlobalVariable("inpAgno", "GeneralAccountingRpt|agno");
      String strAgnoRef = vars.getRequiredGlobalVariable("inpAgnoRef",
          "GeneralAccountingRpt|agnoRef");
      String strDateFrom = vars.getRequestGlobalVariable("inpDateFrom",
          "GeneralAccountingRpt|dateFrom");
      String strDateTo = vars.getRequestGlobalVariable("inpDateTo",
          "GeneralAccountingRpt|dateTo");
      String strDateFromRef = vars.getRequestGlobalVariable("inpDateFromRef",
          "GeneralAccountingRpt|dateFromRef");
      String strDateToRef = vars.getRequestGlobalVariable("inpDateToRef",
          "GeneralAccountingRpt|dateToRef");
      String strPageNo = vars.getRequestGlobalVariable("inpPageNo",
          "GeneralAccountingRpt|PageNo");
      String strAsDateTo = vars.getRequestGlobalVariable("inpAsDateTo",
          "GeneralAccountingRpt|asDateTo");
      String strAsDateToRef = vars.getRequestGlobalVariable("inpAsDateToRef",
          "GeneralAccountingRpt|asDateToRef");
      String strElementValue = vars.getRequiredGlobalVariable("inpcElementvalueId",
          "GeneralAccountingRpt|C_ElementValue_ID");
      String strConImporte = vars.getRequestGlobalVariable("inpConImporte",
          "GeneralAccountingRpt|conImporte");
      String strConCodigo = vars.getRequestGlobalVariable("inpConCodigo",
          "GeneralAccountingRpt|conCodigo");
      String strOrg = vars.getRequestGlobalVariable("inpOrganizacion",
          "GeneralAccountingRpt|organizacion");
      String strLevel = vars.getRequestGlobalVariable("inpLevel", "GeneralAccountingRpt|level");
      //setHistoryCommand(request, "FIND");

      log4j.debug("Element ID : " + strElementValue);

      String strCalculateOpening = strElementValue.substring(0, 1);
      strElementValue = strElementValue.substring(1, strElementValue.length());
      String strRptSub = GeneralAccountingRptData.selectRptName(this,
        strElementValue);
      String strReportName = strRptSub.substring(strRptSub.indexOf("_")+1);

      log4j.debug("strRptSub : " + strRptSub);

      if (strReportName.equals("MutasiPL")) {
        printPageDataMutasi(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "xls", strRptSub,
          strCalculateOpening);
      } else if (strReportName.equals("LabaRugiKomprehensif") || strReportName.equals("ArusKas") || strReportName.equals("RealisasiAnggaran")){
      log4j.debug("Masuk Laba Rugi Komperhensif");
        printPageDataKomperhensif(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "xls", strRptSub,
          strCalculateOpening);
      } else if (strReportName.equals("Cashflow")){
      log4j.debug("Masuk Cashflow");
        printPageDataCashflow(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "xls", strRptSub,
          strCalculateOpening);
      } else {
        printPageData(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "xls", strRptSub,
          strCalculateOpening);
      }

      /*printPageData(request, response, vars, strAgno, strAgnoRef, strDateFrom, strDateTo,
          strDateFromRef, strDateToRef, strAsDateTo, strAsDateToRef, strElementValue,
          strConImporte, strOrg, strLevel, strConCodigo, strcAcctSchemaId, strPageNo, "xls",
          strRptSub, strCalculateOpening);*/
    } else
      pageError(response);
  }

  private void printPageData(HttpServletRequest request, HttpServletResponse response,
      VariablesSecureApp vars, String strYearId, String strYearRefId, String strDateFrom,
      String strDateTo, String strDateFromRef, String strDateToRef, String strAsDateTo,
      String strAsDateToRef, String strElementValue, String strConImporte, String strOrg,
      String strLevel, String strConCodigo, String strcAcctSchemaId, String strPageNo, String strOutput,
      String strRptSub, String strCalculateOpening)
      throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: datasheet");

    //String strCalculateOpening = strElementValue.substring(0, 1);
    //strElementValue = strElementValue.substring(1, strElementValue.length());
    GeneralAccountingRptData[] strGroups = GeneralAccountingRptData.selectGroups(this,
        strElementValue);

    //String strRptSub = GeneralAccountingRptData.selectRptName(this,
    //    strElementValue);

    //get 1 year before from year param
    /*SimpleDateFormat formaterDateYear = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat formaterYear = new SimpleDateFormat("yyyy");

    java.util.Calendar beginDate = java.util.Calendar.getInstance();
    java.util.Calendar endDate = java.util.Calendar.getInstance();

    try {
          beginDate.setTime(formaterDateYear.parse(strDateFrom));
          endDate.setTime(formaterDateYear.parse(strDateTo));
    } catch (ParseException e) {
            e.printStackTrace();
    }

    beginDate.add(java.util.Calendar.YEAR, -1);
    endDate.add(java.util.Calendar.YEAR, -1);

    String strDateFromBef = formaterDateYear.format(beginDate.getTime()).toUpperCase();
    String strDateToBef = formaterDateYear.format(endDate.getTime()).toUpperCase();
    String stryearBef = formaterYear.format(endDate.getTime()).toUpperCase();

    log4j.debug("strDateFromBef: " + strDateFromBef + " - strDateToBef: "
            + strDateToBef + " - stryearBef: " + stryearBef);
    */
    //end

    try {
      strGroups[strGroups.length - 1].pagebreak = "";

      String[][] strElementValueDes = new String[strGroups.length][];
      if (log4j.isDebugEnabled())
        log4j.debug("strElementValue:" + strElementValue + " - strGroups.length:"
            + strGroups.length);
      for (int i = 0; i < strGroups.length; i++) {
        GeneralAccountingRptData[] strElements = GeneralAccountingRptData.selectElements(
            this, strGroups[i].id);
        strElementValueDes[i] = new String[strElements.length];
        if (log4j.isDebugEnabled())
          log4j.debug("strElements.length:" + strElements.length);
        for (int j = 0; j < strElements.length; j++) {
          strElementValueDes[i][j] = strElements[j].id;
        }
      }

      String strTreeOrg = GeneralAccountingRptData.treeOrg(this, vars.getClient());

      AccountTree[] acct = new AccountTree[strGroups.length];
      AccountTreeData[][] elements = new AccountTreeData[strGroups.length][];

      WindowTreeData[] dataTree = WindowTreeData.selectTreeIDWithTableId(this,
          Utility.stringList(vars.getClient()), C_ELEMENT_VALUE_TABLE_ID);
      String TreeID = "";
      if (dataTree != null && dataTree.length != 0)
        TreeID = dataTree[0].id;
      OBContext.setAdminMode(false);
      try {
        String openingEntryOwner = "";
        String openingEntryOwnerRef = "";
        // For each year, the initial and closing date is obtained
        Year year = OBDal.getInstance().get(Year.class, strYearId);
        Year yearRef = OBDal.getInstance().get(Year.class, strYearRefId);
        HashMap<String, Date> startingEndingDate = getStartingEndingDate(year);
        HashMap<String, Date> startingEndingDateRef = getStartingEndingDate(yearRef);
        // Years to be included as no closing is present
        String strYearsToClose = "";
        String strYearsToCloseRef = "";
        if (strCalculateOpening.equals("Y")) {
          strCalculateOpening = "N";
          strDateTo = strAsDateTo;
          strDateToRef = strAsDateToRef;
          strDateFrom = "";
          strDateFromRef = "";
          String[] yearsInfo = getYearsToClose(startingEndingDate.get("startingDate"), strOrg,
              year.getCalendar(), strcAcctSchemaId, false);
          strYearsToClose = yearsInfo[0];
          openingEntryOwner = yearsInfo[1];
          if (strYearsToClose.length() > 0) {
            strCalculateOpening = "Y";
            strYearsToClose = "," + strYearsToClose;
          }
          yearsInfo = getYearsToClose(startingEndingDateRef.get("startingDate"), strOrg,
              yearRef.getCalendar(), strcAcctSchemaId, true);
          strYearsToCloseRef = yearsInfo[0];
          openingEntryOwnerRef = yearsInfo[1];
          if (strYearsToCloseRef.length() > 0) {
            strCalculateOpening = "Y";
            strYearsToCloseRef = "," + strYearsToCloseRef;
          }
        }
        // Income summary amount is calculated and included in the balance sheet data
        String strIncomeSummaryAccount = GeneralAccountingRptData.incomesummary(this,
            strcAcctSchemaId);

        for (int i = 0; i < strGroups.length; i++) {
          // All account tree is obtained
          if (vars.getLanguage().equals("en_US")) {
            elements[i] = AccountTreeData.select(this, strConCodigo, TreeID);
          } else {
            elements[i] = AccountTreeData.selectTrl(this, strConCodigo, vars.getLanguage(), TreeID);
          }

          // For each account with movements in the year, debit and credit total amounts are
          // calculated according to fact_acct movements.
          /*AccountTreeData[] accounts = AccountTreeData.selectFactAcct(this,
              Utility.getContext(this, vars, "#AccessibleOrgTree", "GeneralAccountingRpt"),
              Utility.getContext(this, vars, "#User_Client", "GeneralAccountingRpt"),
              strDateFrom, DateTimeData.nDaysAfter(this, strDateTo, "1"), strcAcctSchemaId,
              Tree.getMembers(this, strTreeOrg, strOrg), "'" + year.getFiscalYear() + "'"
                  + strYearsToClose, openingEntryOwner, strDateFromRef,
              DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear() + "'"
                  + strYearsToCloseRef, openingEntryOwnerRef, strDateFromBef,
              DateTimeData.nDaysAfter(this, strDateToBef, "1"), stryearBef
              );*/

          AccountTreeData[] accounts = AccountTreeData.selectFactAcct(this,
              Utility.getContext(this, vars, "#AccessibleOrgTree", "GeneralAccountingRpt"),
              Utility.getContext(this, vars, "#User_Client", "GeneralAccountingRpt"),
              strDateFrom, DateTimeData.nDaysAfter(this, strDateTo, "1"), strcAcctSchemaId,
              Tree.getMembers(this, strTreeOrg, strOrg), "'" + year.getFiscalYear() + "'"
                  + strYearsToClose, openingEntryOwner, strDateFromRef,
              DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear() + "'"
                  + strYearsToCloseRef, openingEntryOwnerRef);

          {
            if (log4j.isDebugEnabled())
              log4j.debug("*********** strIncomeSummaryAccount: " + strIncomeSummaryAccount);
            String strISyear = processIncomeSummary(strDateFrom,
                DateTimeData.nDaysAfter(this, strDateTo, "1"), "'" + year.getFiscalYear() + "'"
                    + strYearsToClose, strTreeOrg, strOrg, strcAcctSchemaId);

            if (log4j.isDebugEnabled())
              log4j.debug("*********** strISyear: " + strISyear);
            String strISyearRef = processIncomeSummary(strDateFromRef,
                DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear()
                    + "'" + strYearsToCloseRef, strTreeOrg, strOrg, strcAcctSchemaId);

            if (log4j.isDebugEnabled())
              log4j.debug("*********** strISyearRef: " + strISyearRef);

            //accounts = appendRecords(accounts, strIncomeSummaryAccount, strISyear, strISyearRef);
            accounts = appendRecords(accounts, strIncomeSummaryAccount, strISyear, strISyearRef);
          }
          // Report tree is built with given the account tree, and the amounts obtained from
          // fact_acct
          acct[i] = new AccountTree(vars, this, elements[i], accounts, strElementValueDes[i]);

          if (acct[i] != null) {
            acct[i].filterSVC();
            acct[i].filter(strConImporte.equals("Y"), strLevel, false);
          } else if (log4j.isDebugEnabled())
            log4j.debug("acct null!!!");
        }

        String strReportPath = null;
        String strBalanceSheetExcel = null;
        String strReportName = null;

        strReportPath = "@basedesign@/com/gai/generalaccountingrpt/erpCommon/ad_reports/" + strRptSub + ".jrxml";
        strBalanceSheetExcel = strRptSub.substring(strRptSub.indexOf("_")+1);
        strReportName = strRptSub.substring(strRptSub.indexOf("_")+1);

        if (strBalanceSheetExcel.equals("BalanceSheet") && strOutput.equals("xls")){
            strReportPath = "@basedesign@/com/gai/generalaccountingrpt/erpCommon/ad_reports/GeneralAcc_" + strBalanceSheetExcel + "Excel.jrxml";
        }

        HashMap<String, Object> parameters = new HashMap<String, Object>();

        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd-MM-yyyy");

        parameters.put("group", strGroups);
        parameters.put("agno", year.getFiscalYear());

        parameters.put("agno2", yearRef.getFiscalYear());
        parameters.put("column", year.getFiscalYear());
        parameters.put("columnRef", yearRef.getFiscalYear());
        parameters.put("org", OrganizationData.selectOrgName(this, strOrg));
        parameters.put("column1", year.getFiscalYear());
        parameters.put("columnRef1", yearRef.getFiscalYear());
        parameters.put("companyName",
            GeneralAccountingRptData.companyName(this, vars.getClient()));
        parameters.put("date", DateTimeData.today(this));
        if (strDateFrom.equals(""))
          strDateFrom = OBDateUtils.formatDate(startingEndingDate.get("startingDate"));
        if (strDateTo.equals(""))
          strDateTo = OBDateUtils.formatDate(startingEndingDate.get("endingDate"));
        if (strDateFromRef.equals(""))
          strDateFromRef = OBDateUtils.formatDate(startingEndingDateRef.get("startingDate"));
        if (strDateToRef.equals(""))
          strDateToRef = OBDateUtils.formatDate(startingEndingDateRef.get("endingDate"));
        try {
          parameters.put("periodFrom", dateFormat.parse(strDateFrom));
          parameters.put("periodTo", dateFormat.parse(strDateTo));
          parameters.put("periodRefFrom", dateFormat.parse(strDateFromRef));
          parameters.put("periodRefTo", dateFormat.parse(strDateToRef));
        } catch (ParseException e) {
          //Handle exception here, most of the time you will just log it.
          e.printStackTrace();
        }

        parameters.put("agnoInitial", year.getFiscalYear());
        parameters.put("agnoRef", yearRef.getFiscalYear());

        parameters.put(
            "principalTitle",
            strCalculateOpening.equals("Y") ? GeneralAccountingRptData.rptTitle(this,
                strElementValue) + " (Provisional)" : GeneralAccountingRptData.rptTitle(this,
                strElementValue));

        parameters.put("pageNo", strPageNo);

        List<HashMap<String, String>> hashMapList = new ArrayList<HashMap<String, String>>();

          AccountTreeData[][] trees = new AccountTreeData[strGroups.length][];
          for (int i = 0; i < strGroups.length; i++)
            trees[i] = acct[i].getAccounts();

          for (int i = 0; i < trees.length; i++) {
            for (int j = 0; j < trees[i].length; j++) {
              HashMap<String, String> hashMap = new HashMap<String, String>();
              hashMap.put("elementLevel", trees[i][j].elementLevel);
              hashMap.put("name", trees[i][j].name);
              hashMap.put("qty", trees[i][j].qty);
              hashMap.put("qtyRef", trees[i][j].qtyRef);
              hashMap.put("groupname", strGroups[i].name);
              hashMap.put("pagebreak", strGroups[i].pagebreak);
              //syariah
              hashMap.put("description", trees[i][j].description);
              hashMap.put("accounttype", trees[i][j].accounttype);
              hashMap.put("position", trees[i][j].position);
			        hashMap.put("eLevel", trees[i][j].elevel);
              //hashMap.put("anggaran", trees[i][j].anggaran);
              //hashMap.put("qtyBef", trees[i][j].qtyBef);

              hashMapList.add(hashMap);
            }
          }
        //end
        FieldProvider[] data = FieldProviderFactory.getFieldProviderArray(hashMapList);
        renderJR(vars, response, strReportPath, strReportName, strOutput, parameters, data, null);

      } finally {
        OBContext.restorePreviousMode();
      }

    } catch (ArrayIndexOutOfBoundsException e) {
      advisePopUp(request, response, "ERROR",
          Utility.messageBD(this, "ReportWithoutNodes", vars.getLanguage()));

    }
  }

  //cashflow
  private void printPageDataCashflow(HttpServletRequest request, HttpServletResponse response,
      VariablesSecureApp vars, String strYearId, String strYearRefId, String strDateFrom,
      String strDateTo, String strDateFromRef, String strDateToRef, String strAsDateTo,
      String strAsDateToRef, String strElementValue, String strConImporte, String strOrg,
      String strLevel, String strConCodigo, String strcAcctSchemaId, String strPageNo, String strOutput,
      String strRptSub, String strCalculateOpening)
      throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: datasheet");

    //String strCalculateOpening = strElementValue.substring(0, 1);
    //strElementValue = strElementValue.substring(1, strElementValue.length());
    GeneralAccountingRptData[] strGroups = GeneralAccountingRptData.selectGroups(this,
        strElementValue);

    try {
      strGroups[strGroups.length - 1].pagebreak = "";

      String[][] strElementValueDes = new String[strGroups.length][];
      if (log4j.isDebugEnabled())
        log4j.debug("strElementValue:" + strElementValue + " - strGroups.length:"
            + strGroups.length);
      for (int i = 0; i < strGroups.length; i++) {
        GeneralAccountingRptData[] strElements = GeneralAccountingRptData.selectElements(
            this, strGroups[i].id);
        strElementValueDes[i] = new String[strElements.length];
        if (log4j.isDebugEnabled())
          log4j.debug("strElements.length:" + strElements.length);
        for (int j = 0; j < strElements.length; j++) {
          strElementValueDes[i][j] = strElements[j].id;
        }
      }

      String strTreeOrg = GeneralAccountingRptData.treeOrg(this, vars.getClient());

      AccountTreeCashflow[] acct = new AccountTreeCashflow[strGroups.length];
      AccountTreeCashflowData[][] elements = new AccountTreeCashflowData[strGroups.length][];

      WindowTreeData[] dataTree = WindowTreeData.selectTreeIDWithTableId(this,
          Utility.stringList(vars.getClient()), C_ELEMENT_VALUE_TABLE_ID);
      String TreeID = "";
      if (dataTree != null && dataTree.length != 0)
        TreeID = dataTree[0].id;
      OBContext.setAdminMode(false);
      try {
        String openingEntryOwner = "";
        String openingEntryOwnerRef = "";
        // For each year, the initial and closing date is obtained
        Year year = OBDal.getInstance().get(Year.class, strYearId);
        Year yearRef = OBDal.getInstance().get(Year.class, strYearRefId);
        HashMap<String, Date> startingEndingDate = getStartingEndingDate(year);
        HashMap<String, Date> startingEndingDateRef = getStartingEndingDate(yearRef);
        // Years to be included as no closing is present
        String strYearsToClose = "";
        String strYearsToCloseRef = "";
        if (strCalculateOpening.equals("Y")) {
          strCalculateOpening = "N";
          strDateTo = strAsDateTo;
          strDateToRef = strAsDateToRef;
          strDateFrom = "";
          strDateFromRef = "";
          String[] yearsInfo = getYearsToClose(startingEndingDate.get("startingDate"), strOrg,
              year.getCalendar(), strcAcctSchemaId, false);
          strYearsToClose = yearsInfo[0];
          openingEntryOwner = yearsInfo[1];
          if (strYearsToClose.length() > 0) {
            strCalculateOpening = "Y";
            strYearsToClose = "," + strYearsToClose;
          }
          yearsInfo = getYearsToClose(startingEndingDateRef.get("startingDate"), strOrg,
              yearRef.getCalendar(), strcAcctSchemaId, true);
          strYearsToCloseRef = yearsInfo[0];
          openingEntryOwnerRef = yearsInfo[1];
          if (strYearsToCloseRef.length() > 0) {
            strCalculateOpening = "Y";
            strYearsToCloseRef = "," + strYearsToCloseRef;
          }
        }
        // Income summary amount is calculated and included in the balance sheet data
        String strIncomeSummaryAccount = GeneralAccountingRptData.incomesummary(this,
            strcAcctSchemaId);

        for (int i = 0; i < strGroups.length; i++) {
          // All account tree is obtained
          if (vars.getLanguage().equals("en_US")) {
            elements[i] = AccountTreeCashflowData.select(this, strConCodigo, TreeID);
          } else {
            elements[i] = AccountTreeCashflowData.selectTrl(this, strConCodigo, vars.getLanguage(), TreeID);
          }

          // For each account with movements in the year, debit and credit total amounts are
          // calculated according to fact_acct movements.
          /*AccountTreeData[] accounts = AccountTreeData.selectFactAcct(this,
              Utility.getContext(this, vars, "#AccessibleOrgTree", "GeneralAccountingRpt"),
              Utility.getContext(this, vars, "#User_Client", "GeneralAccountingRpt"),
              strDateFrom, DateTimeData.nDaysAfter(this, strDateTo, "1"), strcAcctSchemaId,
              Tree.getMembers(this, strTreeOrg, strOrg), "'" + year.getFiscalYear() + "'"
                  + strYearsToClose, openingEntryOwner, strDateFromRef,
              DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear() + "'"
                  + strYearsToCloseRef, openingEntryOwnerRef, strDateFromBef,
              DateTimeData.nDaysAfter(this, strDateToBef, "1"), stryearBef
              );*/

          AccountTreeCashflowData[] accounts = AccountTreeCashflowData.selectFactAcct(this,
              Utility.getContext(this, vars, "#AccessibleOrgTree", "GeneralAccountingRpt"),
              Utility.getContext(this, vars, "#User_Client", "GeneralAccountingRpt"),
              strDateFrom, DateTimeData.nDaysAfter(this, strDateTo, "1"), strcAcctSchemaId,
              Tree.getMembers(this, strTreeOrg, strOrg), "'" + year.getFiscalYear() + "'"
                  + strYearsToClose, openingEntryOwner, strDateFromRef,
              DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear() + "'"
                  + strYearsToCloseRef, openingEntryOwnerRef);

          {
            if (log4j.isDebugEnabled())
              log4j.debug("*********** strIncomeSummaryAccount: " + strIncomeSummaryAccount);
            String strISyear = processIncomeSummary(strDateFrom,
                DateTimeData.nDaysAfter(this, strDateTo, "1"), "'" + year.getFiscalYear() + "'"
                    + strYearsToClose, strTreeOrg, strOrg, strcAcctSchemaId);

            if (log4j.isDebugEnabled())
              log4j.debug("*********** strISyear: " + strISyear);
            String strISyearRef = processIncomeSummary(strDateFromRef,
                DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear()
                    + "'" + strYearsToCloseRef, strTreeOrg, strOrg, strcAcctSchemaId);

            if (log4j.isDebugEnabled())
              log4j.debug("*********** strISyearRef: " + strISyearRef);

            //accounts = appendRecords(accounts, strIncomeSummaryAccount, strISyear, strISyearRef);
            accounts = appendRecordsCashflow(accounts, strIncomeSummaryAccount, strISyear, strISyearRef);
          }
          // Report tree is built with given the account tree, and the amounts obtained from
          // fact_acct
          acct[i] = new AccountTreeCashflow(vars, this, elements[i], accounts, strElementValueDes[i]);

          if (acct[i] != null) {
            acct[i].filterSVC();
            acct[i].filter(strConImporte.equals("Y"), strLevel, false);
          } else if (log4j.isDebugEnabled())
            log4j.debug("acct null!!!");
        }

        String strReportPath = null;
        String strBalanceSheetExcel = null;
        String strReportName = null;

        strReportPath = "@basedesign@/com/gai/generalaccountingrpt/erpCommon/ad_reports/" + strRptSub + ".jrxml";
        strBalanceSheetExcel = strRptSub.substring(strRptSub.indexOf("_")+1);
        strReportName = strRptSub.substring(strRptSub.indexOf("_")+1);

        if (strBalanceSheetExcel.equals("BalanceSheet") && strOutput.equals("xls")){
            strReportPath = "@basedesign@/com/gai/generalaccountingrpt/erpCommon/ad_reports/GeneralAcc_" + strBalanceSheetExcel + "Excel.jrxml";
        }

        HashMap<String, Object> parameters = new HashMap<String, Object>();

        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd-MM-yyyy");

        parameters.put("group", strGroups);
        parameters.put("agno", year.getFiscalYear());

        parameters.put("agno2", yearRef.getFiscalYear());
        parameters.put("column", year.getFiscalYear());
        parameters.put("columnRef", yearRef.getFiscalYear());
        parameters.put("org", OrganizationData.selectOrgName(this, strOrg));
        parameters.put("column1", year.getFiscalYear());
        parameters.put("columnRef1", yearRef.getFiscalYear());
        parameters.put("companyName",
            GeneralAccountingRptData.companyName(this, vars.getClient()));
        parameters.put("date", DateTimeData.today(this));
        if (strDateFrom.equals(""))
          strDateFrom = OBDateUtils.formatDate(startingEndingDate.get("startingDate"));
        if (strDateTo.equals(""))
          strDateTo = OBDateUtils.formatDate(startingEndingDate.get("endingDate"));
        if (strDateFromRef.equals(""))
          strDateFromRef = OBDateUtils.formatDate(startingEndingDateRef.get("startingDate"));
        if (strDateToRef.equals(""))
          strDateToRef = OBDateUtils.formatDate(startingEndingDateRef.get("endingDate"));
        try {
          parameters.put("periodFrom", dateFormat.parse(strDateFrom));
          parameters.put("periodTo", dateFormat.parse(strDateTo));
          parameters.put("periodRefFrom", dateFormat.parse(strDateFromRef));
          parameters.put("periodRefTo", dateFormat.parse(strDateToRef));
        } catch (ParseException e) {
          //Handle exception here, most of the time you will just log it.
          e.printStackTrace();
        }

        parameters.put("agnoInitial", year.getFiscalYear());
        parameters.put("agnoRef", yearRef.getFiscalYear());

        parameters.put(
            "principalTitle",
            strCalculateOpening.equals("Y") ? GeneralAccountingRptData.rptTitle(this,
                strElementValue) + " (Provisional)" : GeneralAccountingRptData.rptTitle(this,
                strElementValue));

        parameters.put("pageNo", strPageNo);

        List<HashMap<String, String>> hashMapList = new ArrayList<HashMap<String, String>>();

          AccountTreeCashflowData[][] trees = new AccountTreeCashflowData[strGroups.length][];
          for (int i = 0; i < strGroups.length; i++)
            trees[i] = acct[i].getAccounts();

          for (int i = 0; i < trees.length; i++) {
            for (int j = 0; j < trees[i].length; j++) {
              HashMap<String, String> hashMap = new HashMap<String, String>();
              hashMap.put("elementLevel", trees[i][j].elementLevel);
              hashMap.put("name", trees[i][j].name);
              hashMap.put("qty", trees[i][j].qty);
              hashMap.put("qtyRef", trees[i][j].qtyRef);
              hashMap.put("groupname", strGroups[i].name);
              hashMap.put("pagebreak", strGroups[i].pagebreak);
              //syariah
              hashMap.put("description", trees[i][j].description);
              hashMap.put("accounttype", trees[i][j].accounttype);
              hashMap.put("position", trees[i][j].position);
              hashMap.put("eLevel", trees[i][j].elevel);

              hashMapList.add(hashMap);
            }
          }
        //end
        FieldProvider[] data = FieldProviderFactory.getFieldProviderArray(hashMapList);
        renderJR(vars, response, strReportPath, strReportName, strOutput, parameters, data, null);

      } finally {
        OBContext.restorePreviousMode();
      }

    } catch (ArrayIndexOutOfBoundsException e) {
      advisePopUp(request, response, "ERROR",
          Utility.messageBD(this, "ReportWithoutNodes", vars.getLanguage()));

    }
  }
  //end cashflow

  //for 1 year before
  private void printPageDataKomperhensif(HttpServletRequest request, HttpServletResponse response,
      VariablesSecureApp vars, String strYearId, String strYearRefId, String strDateFrom,
      String strDateTo, String strDateFromRef, String strDateToRef, String strAsDateTo,
      String strAsDateToRef, String strElementValue, String strConImporte, String strOrg,
      String strLevel, String strConCodigo, String strcAcctSchemaId, String strPageNo, String strOutput,
      String strRptSub, String strCalculateOpening)
      throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: datasheet");

    //String strCalculateOpening = strElementValue.substring(0, 1);
    //strElementValue = strElementValue.substring(1, strElementValue.length());
    GeneralAccountingRptData[] strGroups = GeneralAccountingRptData.selectGroups(this,
        strElementValue);

    //String strRptSub = GeneralAccountingRptData.selectRptName(this,
    //    strElementValue);

    //get 1 year before from year param
    SimpleDateFormat formaterDateYear = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat formaterYear = new SimpleDateFormat("yyyy");

    java.util.Calendar beginDate = java.util.Calendar.getInstance();
    java.util.Calendar endDate = java.util.Calendar.getInstance();

    try {
          beginDate.setTime(formaterDateYear.parse(strDateFrom));
          endDate.setTime(formaterDateYear.parse(strDateTo));
    } catch (ParseException e) {
            e.printStackTrace();
    }

    beginDate.add(java.util.Calendar.YEAR, -1);
    endDate.add(java.util.Calendar.YEAR, -1);

    String strDateFromBef = formaterDateYear.format(beginDate.getTime()).toUpperCase();
    String strDateToBef = formaterDateYear.format(endDate.getTime()).toUpperCase();
    String stryearBef = formaterYear.format(endDate.getTime()).toUpperCase();

    String strDateFromAud = "01-01-"+stryearBef;
    String strDateToAud = "31-12-"+stryearBef;
    String stryearAud = stryearBef;

    log4j.debug("strDateFromBef: " + strDateFromBef + " - strDateToBef: "
            + strDateToBef + " - stryearBef: " + stryearBef);

    //end

    try {
      strGroups[strGroups.length - 1].pagebreak = "";

      String[][] strElementValueDes = new String[strGroups.length][];
      if (log4j.isDebugEnabled())
        log4j.debug("strElementValue:" + strElementValue + " - strGroups.length:"
            + strGroups.length);
      for (int i = 0; i < strGroups.length; i++) {
        GeneralAccountingRptData[] strElements = GeneralAccountingRptData.selectElements(
            this, strGroups[i].id);
        strElementValueDes[i] = new String[strElements.length];
        if (log4j.isDebugEnabled())
          log4j.debug("strElements.length:" + strElements.length);
        for (int j = 0; j < strElements.length; j++) {
          strElementValueDes[i][j] = strElements[j].id;
        }
      }

      String strTreeOrg = GeneralAccountingRptData.treeOrg(this, vars.getClient());

      AccountTreeKomperhensif[] acct = new AccountTreeKomperhensif[strGroups.length];
      AccountTreeKomperhensifData[][] elements = new AccountTreeKomperhensifData[strGroups.length][];

      WindowTreeData[] dataTree = WindowTreeData.selectTreeIDWithTableId(this,
          Utility.stringList(vars.getClient()), C_ELEMENT_VALUE_TABLE_ID);
      String TreeID = "";
      if (dataTree != null && dataTree.length != 0)
        TreeID = dataTree[0].id;
      OBContext.setAdminMode(false);
      try {
        String openingEntryOwner = "";
        String openingEntryOwnerRef = "";
        // For each year, the initial and closing date is obtained
        Year year = OBDal.getInstance().get(Year.class, strYearId);
        Year yearRef = OBDal.getInstance().get(Year.class, strYearRefId);
        HashMap<String, Date> startingEndingDate = getStartingEndingDate(year);
        HashMap<String, Date> startingEndingDateRef = getStartingEndingDate(yearRef);
        // Years to be included as no closing is present
        String strYearsToClose = "";
        String strYearsToCloseRef = "";
        if (strCalculateOpening.equals("Y")) {
          strCalculateOpening = "N";
          strDateTo = strAsDateTo;
          strDateToRef = strAsDateToRef;
          strDateFrom = "";
          strDateFromRef = "";
          String[] yearsInfo = getYearsToClose(startingEndingDate.get("startingDate"), strOrg,
              year.getCalendar(), strcAcctSchemaId, false);
          strYearsToClose = yearsInfo[0];
          openingEntryOwner = yearsInfo[1];
          if (strYearsToClose.length() > 0) {
            strCalculateOpening = "Y";
            strYearsToClose = "," + strYearsToClose;
          }
          yearsInfo = getYearsToClose(startingEndingDateRef.get("startingDate"), strOrg,
              yearRef.getCalendar(), strcAcctSchemaId, true);
          strYearsToCloseRef = yearsInfo[0];
          openingEntryOwnerRef = yearsInfo[1];
          if (strYearsToCloseRef.length() > 0) {
            strCalculateOpening = "Y";
            strYearsToCloseRef = "," + strYearsToCloseRef;
          }
        }
		
        // Income summary amount is calculated and included in the balance sheet data
        String strIncomeSummaryAccount = GeneralAccountingRptData.incomesummary(this,
            strcAcctSchemaId);

        for (int i = 0; i < strGroups.length; i++) {
          // All account tree is obtained
          if (vars.getLanguage().equals("en_US")) {
            elements[i] = AccountTreeKomperhensifData.select(this, "'" + yearRef.getFiscalYear() + "'", stryearBef, strConCodigo, TreeID);
          } else {
            elements[i] = AccountTreeKomperhensifData.selectTrl(this, strConCodigo, vars.getLanguage(), TreeID);
          }

          log4j.debug("yearRef.getFiscalYear() " + "'" + yearRef.getFiscalYear() + "'" + strYearsToCloseRef);

          // For each account with movements in the year, debit and credit total amounts are
          // calculated according to fact_acct movements.
          AccountTreeKomperhensifData[] accounts = AccountTreeKomperhensifData.selectFactAcctKomp(this,
              Utility.getContext(this, vars, "#AccessibleOrgTree", "GeneralAccountingRpt"),
              Utility.getContext(this, vars, "#User_Client", "GeneralAccountingRpt"),
              strDateFrom, DateTimeData.nDaysAfter(this, strDateTo, "1"), strcAcctSchemaId,
              Tree.getMembers(this, strTreeOrg, strOrg), "'" + year.getFiscalYear() + "'"
                  + strYearsToClose, openingEntryOwner, strDateFromRef,
              DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear() + "'"
                  + strYearsToCloseRef, openingEntryOwnerRef,
              /*Utility.getContext(this, vars, "#AccessibleOrgTree", "GeneralAccountingRpt"),
              Utility.getContext(this, vars, "#User_Client", "GeneralAccountingRpt"),*/
              strDateFromBef, DateTimeData.nDaysAfter(this, strDateToBef, "1"),
			        stryearBef,
              strDateFromAud, DateTimeData.nDaysAfter(this, strDateToAud, "1"),
              stryearAud
              );//15

          /*AccountTreeKomperhensifData[] accounts = AccountTreeKomperhensifData.selectFactAcct(this,
              Utility.getContext(this, vars, "#AccessibleOrgTree", "GeneralAccountingRpt"),
              Utility.getContext(this, vars, "#User_Client", "GeneralAccountingRpt"),
              strDateFrom, DateTimeData.nDaysAfter(this, strDateTo, "1"), strcAcctSchemaId,
              Tree.getMembers(this, strTreeOrg, strOrg), "'" + year.getFiscalYear() + "'"
                  + strYearsToClose, openingEntryOwner, strDateFromRef,
              DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear() + "'"
                  + strYearsToCloseRef, openingEntryOwnerRef);*/

          {
            if (log4j.isDebugEnabled())
              log4j.debug("*********** strIncomeSummaryAccount: " + strIncomeSummaryAccount);
            String strISyear = processIncomeSummary(strDateFrom,
                DateTimeData.nDaysAfter(this, strDateTo, "1"), "'" + year.getFiscalYear() + "'"
                    + strYearsToClose, strTreeOrg, strOrg, strcAcctSchemaId);

            if (log4j.isDebugEnabled())
              log4j.debug("*********** strISyear: " + strISyear);
            String strISyearRef = processIncomeSummary(strDateFromRef,
                DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear()
                    + "'" + strYearsToCloseRef, strTreeOrg, strOrg, strcAcctSchemaId);

            if (log4j.isDebugEnabled())
              log4j.debug("*********** strISyearRef: " + strISyearRef);

            String strISyearBef = processIncomeSummary(strDateFromBef,
                DateTimeData.nDaysAfter(this, strDateToBef, "1"), stryearBef, strTreeOrg, strOrg, strcAcctSchemaId);

            if (log4j.isDebugEnabled())
              log4j.debug("*********** strISyearBef: " + strISyearBef);

            String strISyearAud = processIncomeSummary(strDateFromAud,
                DateTimeData.nDaysAfter(this, strDateToAud, "1"), stryearAud, strTreeOrg, strOrg, strcAcctSchemaId);

            if (log4j.isDebugEnabled())
              log4j.debug("*********** strISyearAud: " + strISyearAud);

            accounts = appendRecordsBef(accounts, strIncomeSummaryAccount, strISyear, strISyearRef, strISyearBef, strISyearAud);
          }
          // Report tree is built with given the account tree, and the amounts obtained from
          // fact_acct
          acct[i] = new AccountTreeKomperhensif(vars, this, elements[i], accounts, strElementValueDes[i]);

          if (acct[i] != null) {
            acct[i].filterSVC();
            acct[i].filter(strConImporte.equals("Y"), strLevel, false);
          } else if (log4j.isDebugEnabled())
            log4j.debug("acct null!!!");
        }

        String strReportPath = null;
        String strBalanceSheetExcel = null;
        String strReportName = null;

        strReportPath = "@basedesign@/com/gai/generalaccountingrpt/erpCommon/ad_reports/" + strRptSub + ".jrxml";
        strBalanceSheetExcel = strRptSub.substring(strRptSub.indexOf("_")+1);
        strReportName = strRptSub.substring(strRptSub.indexOf("_")+1);

        if (strBalanceSheetExcel.equals("BalanceSheet") && strOutput.equals("xls")){
            strReportPath = "@basedesign@/com/gai/generalaccountingrpt/erpCommon/ad_reports/GeneralAcc_" + strBalanceSheetExcel + "Excel.jrxml";
        }

        HashMap<String, Object> parameters = new HashMap<String, Object>();

        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd-MM-yyyy");

        parameters.put("group", strGroups);
        parameters.put("agno", year.getFiscalYear());

        parameters.put("agno2", yearRef.getFiscalYear());
        parameters.put("column", year.getFiscalYear());
        parameters.put("columnRef", yearRef.getFiscalYear());
        parameters.put("org", OrganizationData.selectOrgName(this, strOrg));
        parameters.put("column1", year.getFiscalYear());
        parameters.put("columnRef1", yearRef.getFiscalYear());
        parameters.put("companyName",
            GeneralAccountingRptData.companyName(this, vars.getClient()));
        parameters.put("date", DateTimeData.today(this));
        if (strDateFrom.equals(""))
          strDateFrom = OBDateUtils.formatDate(startingEndingDate.get("startingDate"));
        if (strDateTo.equals(""))
          strDateTo = OBDateUtils.formatDate(startingEndingDate.get("endingDate"));
        if (strDateFromRef.equals(""))
          strDateFromRef = OBDateUtils.formatDate(startingEndingDateRef.get("startingDate"));
        if (strDateToRef.equals(""))
          strDateToRef = OBDateUtils.formatDate(startingEndingDateRef.get("endingDate"));
        try {
          parameters.put("periodFrom", dateFormat.parse(strDateFrom));
          parameters.put("periodTo", dateFormat.parse(strDateTo));
          parameters.put("periodRefFrom", dateFormat.parse(strDateFromRef));
          parameters.put("periodRefTo", dateFormat.parse(strDateToRef));
        } catch (ParseException e) {
          //Handle exception here, most of the time you will just log it.
          e.printStackTrace();
        }

        parameters.put("agnoInitial", year.getFiscalYear());
        parameters.put("agnoRef", yearRef.getFiscalYear());
        parameters.put("agnoBef", stryearBef);

        parameters.put(
            "principalTitle",
            strCalculateOpening.equals("Y") ? GeneralAccountingRptData.rptTitle(this,
                strElementValue) + " (Provisional)" : GeneralAccountingRptData.rptTitle(this,
                strElementValue));

        parameters.put("pageNo", strPageNo);

        List<HashMap<String, String>> hashMapList = new ArrayList<HashMap<String, String>>();

          AccountTreeKomperhensifData[][] trees = new AccountTreeKomperhensifData[strGroups.length][];
          for (int i = 0; i < strGroups.length; i++)
            trees[i] = acct[i].getAccounts();

          for (int i = 0; i < trees.length; i++) {
            for (int j = 0; j < trees[i].length; j++) {
              HashMap<String, String> hashMap = new HashMap<String, String>();
              hashMap.put("elementLevel", trees[i][j].elementLevel);
              hashMap.put("name", trees[i][j].name);
              hashMap.put("qty", trees[i][j].qty);
              hashMap.put("qtyRef", trees[i][j].qtyRef);
              hashMap.put("groupname", strGroups[i].name);
              hashMap.put("pagebreak", strGroups[i].pagebreak);
              //syariah
              hashMap.put("description", trees[i][j].description);
              hashMap.put("accounttype", trees[i][j].accounttype);
              hashMap.put("position", trees[i][j].position);
              hashMap.put("eLevel", trees[i][j].elevel);
              hashMap.put("anggaran", trees[i][j].anggaran);
              hashMap.put("anggaranBef", trees[i][j].anggaranBef);
              hashMap.put("qtyBef", trees[i][j].qtyBef);
              hashMap.put("qtyAud", trees[i][j].qtyAud);
              //hashMap.put("qtyAnggaran", trees[i][j].qtyAnggaran);
              //hashMap.put("anggaran_th_ini", trees[i][j].anggaranThIni);
              //hashMap.put("anggaran_th_lalu", trees[i][j].anggaranThLalu);

			        log4j.debug("account name : "+trees[i][j].name+" - qtyRef: "+ trees[i][j].qtyRef +" - qtyBef: " + trees[i][j].qtyBef+" - anggaran: "+trees[i][j].anggaran+" - anggaranBef: "+trees[i][j].anggaranBef);

              hashMapList.add(hashMap);
            }
          }
        //end
        FieldProvider[] data = FieldProviderFactory.getFieldProviderArray(hashMapList);
        renderJR(vars, response, strReportPath, strReportName, strOutput, parameters, data, null);

      } finally {
        OBContext.restorePreviousMode();
      }

    } catch (ArrayIndexOutOfBoundsException e) {
      advisePopUp(request, response, "ERROR",
          Utility.messageBD(this, "ReportWithoutNodes", vars.getLanguage()));

    }
  }

  //for Mutasi
  private void printPageDataMutasi(HttpServletRequest request, HttpServletResponse response,
      VariablesSecureApp vars, String strYearId, String strYearRefId, String strDateFrom,
      String strDateTo, String strDateFromRef, String strDateToRef, String strAsDateTo,
      String strAsDateToRef, String strElementValue, String strConImporte, String strOrg,
      String strLevel, String strConCodigo, String strcAcctSchemaId, String strPageNo, String strOutput,
      String strRptSub, String strCalculateOpening)
      throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: datasheet");

    //String strCalculateOpening = strElementValue.substring(0, 1);
    //strElementValue = strElementValue.substring(1, strElementValue.length());
    GeneralAccountingRptData[] strGroups = GeneralAccountingRptData.selectGroups(this,
        strElementValue);
    //syariah
    //String strRptSub = GeneralAccountingRptData.selectRptName(this,
        //strElementValue);

    SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
    SimpleDateFormat dateFormater = new SimpleDateFormat("M");
    String strMonth="";
    String strReportPath = null;
    String strBalanceSheetExcel = null;
    String strReportName = null;
    List<HashMap<String, String>> hashMapList = new ArrayList<HashMap<String, String>>();
    HashMap<String, Object> parameters = new HashMap<String, Object>();

    java.util.Calendar beginCalendar = java.util.Calendar.getInstance();
    java.util.Calendar finishCalendar = java.util.Calendar.getInstance();

    try {
          beginCalendar.setTime(formater.parse(strDateFrom));
          finishCalendar.setTime(formater.parse(strDateTo));
    } catch (ParseException e) {
            e.printStackTrace();
    }

    try {
      strGroups[strGroups.length - 1].pagebreak = "";

      String[][] strElementValueDes = new String[strGroups.length][];
      if (log4j.isDebugEnabled())
        log4j.debug("strElementValue:" + strElementValue + " - strGroups.length:"
            + strGroups.length);
      for (int i = 0; i < strGroups.length; i++) {
        GeneralAccountingRptData[] strElements = GeneralAccountingRptData.selectElements(
            this, strGroups[i].id);
        strElementValueDes[i] = new String[strElements.length];
        if (log4j.isDebugEnabled())
          log4j.debug("strElements.length:" + strElements.length);
        for (int j = 0; j < strElements.length; j++) {
          strElementValueDes[i][j] = strElements[j].id;
        }
      }

      String strTreeOrg = GeneralAccountingRptData.treeOrg(this, vars.getClient());

      //mutasi
      AccountTreeMutasi[] acctMutasi = new AccountTreeMutasi[strGroups.length];
      AccountTreeMutasiData[][] elementsMutasi = new AccountTreeMutasiData[strGroups.length][];

      WindowTreeData[] dataTree = WindowTreeData.selectTreeIDWithTableId(this,
          Utility.stringList(vars.getClient()), C_ELEMENT_VALUE_TABLE_ID);
      String TreeID = "";
      if (dataTree != null && dataTree.length != 0)
        TreeID = dataTree[0].id;
      OBContext.setAdminMode(false);

      try {
        while (beginCalendar.before(finishCalendar)) {

          String openingEntryOwner = "";
          String openingEntryOwnerRef = "";
          // For each year, the initial and closing date is obtained
          Year year = OBDal.getInstance().get(Year.class, strYearId);
          Year yearRef = OBDal.getInstance().get(Year.class, strYearRefId);
          HashMap<String, Date> startingEndingDate = getStartingEndingDate(year);
          HashMap<String, Date> startingEndingDateRef = getStartingEndingDate(yearRef);
          // Years to be included as no closing is present
          String strYearsToClose = "";
          String strYearsToCloseRef = "";
          if (strCalculateOpening.equals("Y")) {
            strCalculateOpening = "N";
            strDateTo = strAsDateTo;
            strDateToRef = strAsDateToRef;
            strDateFrom = "";
            strDateFromRef = "";
            String[] yearsInfo = getYearsToClose(startingEndingDate.get("startingDate"), strOrg,
                year.getCalendar(), strcAcctSchemaId, false);
            strYearsToClose = yearsInfo[0];
            openingEntryOwner = yearsInfo[1];
            if (strYearsToClose.length() > 0) {
              strCalculateOpening = "Y";
              strYearsToClose = "," + strYearsToClose;
            }
            yearsInfo = getYearsToClose(startingEndingDateRef.get("startingDate"), strOrg,
                yearRef.getCalendar(), strcAcctSchemaId, true);
            strYearsToCloseRef = yearsInfo[0];
            openingEntryOwnerRef = yearsInfo[1];
            if (strYearsToCloseRef.length() > 0) {
              strCalculateOpening = "Y";
              strYearsToCloseRef = "," + strYearsToCloseRef;
            }
          }
          // Income summary amount is calculated and included in the balance sheet data
          String strIncomeSummaryAccount = GeneralAccountingRptData.incomesummary(this,
              strcAcctSchemaId);
          int i = 0;

          strMonth = dateFormater.format(beginCalendar.getTime()).toUpperCase();

          for (i = 0; i < strGroups.length; i++) {
            // All account tree is obtained
            if (vars.getLanguage().equals("en_US")) {
              elementsMutasi[i] = AccountTreeMutasiData.select(this, strConCodigo, TreeID);
            } else {
              elementsMutasi[i] = AccountTreeMutasiData.selectTrl(this, strConCodigo, vars.getLanguage(), TreeID);
            }

            // For each account with movements in the year, debit and credit total amounts are
            // calculated according to fact_acct movements.


            //AccountTreeMutasiData[] accountsMutasi = null;

              AccountTreeMutasiData[] accountsMutasi = AccountTreeMutasiData.selectFactAcct(this,
                  Utility.getContext(this, vars, "#AccessibleOrgTree", "GeneralAccountingRpt"),
                  Utility.getContext(this, vars, "#User_Client", "GeneralAccountingRpt"),
                  strMonth, strcAcctSchemaId,
                  Tree.getMembers(this, strTreeOrg, strOrg), "'" + year.getFiscalYear() + "'"
                      + strYearsToClose, openingEntryOwner);

              {
                if (log4j.isDebugEnabled())
                  log4j.debug("*********** strIncomeSummaryAccount: " + strIncomeSummaryAccount);

                  String strISyearMutasi = processIncomeSummaryMutasi(strDateFrom,
                      DateTimeData.nDaysAfter(this, strDateTo, "1"), "'" + year.getFiscalYear() + "'"
                          + strYearsToClose, strTreeOrg, strOrg, strcAcctSchemaId, strMonth);

                    if (log4j.isDebugEnabled())
                      log4j.debug("*********** strISyearMutasi: " + strISyearMutasi);

                  String strISyearRefMutasi = processIncomeSummaryMutasi(strDateFromRef,
                      DateTimeData.nDaysAfter(this, strDateToRef, "1"), "'" + yearRef.getFiscalYear()
                          + "'" + strYearsToCloseRef, strTreeOrg, strOrg, strcAcctSchemaId, strMonth);

                    if (log4j.isDebugEnabled())
                      log4j.debug("*********** strISyearRefMutasi: " + strISyearRefMutasi);

                  accountsMutasi = appendRecordsMutasi(accountsMutasi, strIncomeSummaryAccount, strISyearMutasi, strISyearRefMutasi);
                }

            // Report tree is built with given the account tree, and the amounts obtained from
            // fact_acct

            acctMutasi[i] = new AccountTreeMutasi(vars, this, elementsMutasi[i], accountsMutasi, strElementValueDes[i]);

            if (acctMutasi[i] != null) {
              acctMutasi[i].filterSVC();
              acctMutasi[i].filter(strConImporte.equals("Y"), strLevel, false);
            } else if (log4j.isDebugEnabled())
              log4j.debug("acct Mutasi null!!!");
          }

        strReportPath = "@basedesign@/com/gai/generalaccountingrpt/erpCommon/ad_reports/" + strRptSub + ".jrxml";
        strBalanceSheetExcel = strRptSub.substring(strRptSub.indexOf("_")+1);
        strReportName = strRptSub.substring(strRptSub.indexOf("_")+1);

        if (strBalanceSheetExcel.equals("BalanceSheet") && strOutput.equals("xls")){
            strReportPath = "@basedesign@/com/gai/generalaccountingrpt/erpCommon/ad_reports/GeneralAcc_" + strBalanceSheetExcel + "Excel.jrxml";
        }

        //parameters = new HashMap<String, Object>();

        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd-MM-yyyy");

        parameters.put("group", strGroups);
        parameters.put("agno", year.getFiscalYear());

        parameters.put("agno2", yearRef.getFiscalYear());
        parameters.put("column", year.getFiscalYear());
        parameters.put("columnRef", yearRef.getFiscalYear());
        parameters.put("org", OrganizationData.selectOrgName(this, strOrg));
        parameters.put("column1", year.getFiscalYear());
        parameters.put("columnRef1", yearRef.getFiscalYear());
        parameters.put("companyName",
            GeneralAccountingRptData.companyName(this, vars.getClient()));
        parameters.put("date", DateTimeData.today(this));
        if (strDateFrom.equals(""))
          strDateFrom = OBDateUtils.formatDate(startingEndingDate.get("startingDate"));
        if (strDateTo.equals(""))
          strDateTo = OBDateUtils.formatDate(startingEndingDate.get("endingDate"));
        if (strDateFromRef.equals(""))
          strDateFromRef = OBDateUtils.formatDate(startingEndingDateRef.get("startingDate"));
        if (strDateToRef.equals(""))
          strDateToRef = OBDateUtils.formatDate(startingEndingDateRef.get("endingDate"));
        try {
          parameters.put("periodFrom", dateFormat.parse(strDateFrom));
          parameters.put("periodTo", dateFormat.parse(strDateTo));
          parameters.put("periodRefFrom", dateFormat.parse(strDateFromRef));
          parameters.put("periodRefTo", dateFormat.parse(strDateToRef));
        } catch (ParseException e) {
          //Handle exception here, most of the time you will just log it.
          e.printStackTrace();
        }

        parameters.put("agnoInitial", year.getFiscalYear());
        parameters.put("agnoRef", yearRef.getFiscalYear());

        parameters.put("monthAcct", strMonth);

        parameters.put(
            "principalTitle",
            strCalculateOpening.equals("Y") ? GeneralAccountingRptData.rptTitle(this,
                strElementValue) + " (Provisional)" : GeneralAccountingRptData.rptTitle(this,
                strElementValue));

        parameters.put("pageNo", strPageNo);

        //hashMapList = new ArrayList<HashMap<String, String>>();

          //mutasi
          AccountTreeMutasiData[][] treesMutasi = new AccountTreeMutasiData[strGroups.length][];

          for (i = 0; i < strGroups.length; i++)
            treesMutasi[i] = acctMutasi[i].getAccounts();


          for (i = 0; i < treesMutasi.length; i++) {
            for (int j = 0; j < treesMutasi[i].length; j++) {
              HashMap<String, String> hashMap = new HashMap<String, String>();
              hashMap.put("elementLevel", treesMutasi[i][j].elementLevel);
              hashMap.put("name", treesMutasi[i][j].name);
              hashMap.put("qty", treesMutasi[i][j].qty);
              hashMap.put("qtyRef", treesMutasi[i][j].qtyRef);
              hashMap.put("groupname", strGroups[i].name);
              hashMap.put("pagebreak", strGroups[i].pagebreak);
              //syariah
              hashMap.put("description", treesMutasi[i][j].description);
              hashMap.put("accounttype", treesMutasi[i][j].accounttype);
              hashMap.put("dateacct", strMonth);
              //hashMap.put("quantity", treesMutasi[i][j].quantity);
              hashMap.put("kodeacc", treesMutasi[i][j].kodeacc);

              log4j.debug("Name : " + treesMutasi[i][j].name +" Nilai " +treesMutasi[i][j].qty + " Bulan : " + treesMutasi[i][j].monthacct);

              hashMapList.add(hashMap);
            }
          }

      beginCalendar.add(java.util.Calendar.MONTH, 1);
    } //end while

        FieldProvider[] data = FieldProviderFactory.getFieldProviderArray(hashMapList);
        renderJR(vars, response, strReportPath, strReportName, strOutput, parameters, data, null);

      } finally {
        OBContext.restorePreviousMode();
      }

    } catch (ArrayIndexOutOfBoundsException e) {
      advisePopUp(request, response, "ERROR",
          Utility.messageBD(this, "ReportWithoutNodes", vars.getLanguage()));

    }
  }
  //end Mutasi

  private String[] getYearsToClose(Date startingDate, String strOrg, Calendar calendar,
      String strcAcctSchemaId, boolean isYearRef) {
    String openingEntryOwner = "";
    ArrayList<Year> previousYears = getOrderedPreviousYears(startingDate, calendar);
    Set<String> notClosedYears = new HashSet<String>();
    for (Year previousYear : previousYears) {
      for (Organization org : getCalendarOwnerOrgs(strOrg)) {
        if (isNotClosed(previousYear, org, strcAcctSchemaId)) {
          notClosedYears.add(previousYear.getFiscalYear());
        } else {
          openingEntryOwner = previousYear.getFiscalYear();
        }
      }
    }
    String[] result = { Utility.getInStrSet(notClosedYears), openingEntryOwner };
    return result;
  }

  private Set<Organization> getCalendarOwnerOrgs(String strOrg) {
    Set<Organization> calendarOwnerOrgs = new HashSet<Organization>();
    Organization organization = OBDal.getInstance().get(Organization.class, strOrg);
    if (organization.isAllowPeriodControl()) {
      calendarOwnerOrgs.add(organization);
    }
    for (String child : new OrganizationStructureProvider().getChildTree(strOrg, false)) {
      calendarOwnerOrgs.addAll(getCalendarOwnerOrgs(child));
    }
    return calendarOwnerOrgs;
  }

  private boolean isNotClosed(Year year, Organization org, String strcAcctSchemaId) {
    OBContext.setAdminMode(false);
    try {
      OBCriteria<OrganizationClosing> obc = OBDal.getInstance().createCriteria(
          OrganizationClosing.class);
      obc.createAlias(OrganizationClosing.PROPERTY_ORGACCTSCHEMA, "oa");
      obc.add(Restrictions.eq("organization", org));
      obc.add(Restrictions.eq(OrganizationClosing.PROPERTY_YEAR, year));
      obc.add(Restrictions.eq("oa.accountingSchema.id", strcAcctSchemaId));
      obc.add(Restrictions.isNotNull(OrganizationClosing.PROPERTY_CLOSINGFACTACCTGROUP));
      obc.setMaxResults(1);
      return obc.uniqueResult() == null ? true : false;
    } finally {
      OBContext.restorePreviousMode();
    }
  }

  private ArrayList<Year> getOrderedPreviousYears(Date startingDate, Calendar calendar) {
    final StringBuilder hqlString = new StringBuilder();
    ArrayList<Year> result = new ArrayList<Year>();
    hqlString.append("select y");
    hqlString.append(" from FinancialMgmtYear y, FinancialMgmtPeriod as p");
    hqlString
        .append(" where p.year = y  and p.endingDate < :date and y.calendar = :calendar order by p.startingDate");
    final Session session = OBDal.getInstance().getSession();
    final Query query = session.createQuery(hqlString.toString());
    query.setParameter("date", startingDate);
    query.setParameter("calendar", calendar);
    for (Object resultObject : query.list()) {
      final Year previousYear = (Year) resultObject;
      if (!(result.contains(previousYear))) {
        result.add(previousYear);
      }
    }
    return result;
  }

  private HashMap<String, Date> getStartingEndingDate(Year year) {
    final StringBuilder hqlString = new StringBuilder();
    HashMap<String, Date> result = new HashMap<String, Date>();
    result.put("startingDate", null);
    result.put("endingDate", null);
    hqlString.append("select min(p.startingDate) as startingDate, max(p.endingDate) as endingDate");
    hqlString.append(" from FinancialMgmtPeriod as p");
    hqlString.append(" where p.year = :year");

    final Session session = OBDal.getInstance().getSession();
    final Query query = session.createQuery(hqlString.toString());
    query.setParameter("year", year);
    for (Object resultObject : query.list()) {
      if (resultObject.getClass().isArray()) {
        final Object[] values = (Object[]) resultObject;
        result.put("startingDate", (Date) values[0]);
        result.put("endingDate", (Date) values[1]);
      }
    }
    return result;
  }

  private AccountTreeData[] appendRecords(AccountTreeData[] data, String strIncomeSummary,
      String strISyear, String strISyearRef) throws ServletException {
    if (data == null || strIncomeSummary == null || strIncomeSummary.equals("")
        || strISyear == null || strISyear.equals("") || strISyearRef == null
        || strISyearRef.equals(""))
      return data;
    AccountTreeData[] data2 = new AccountTreeData[data.length + 1];
    boolean found = false;
    for (int i = 0; i < data.length; i++) {
      if (data[i].id.equals(strIncomeSummary)) {
        found = true;
        BigDecimal isYear = new BigDecimal(strISyear);
        BigDecimal isYearRef = new BigDecimal(strISyearRef);

        data[i].qty = (new BigDecimal(data[i].qty).subtract(isYear)).toPlainString();
        data[i].qtycredit = (new BigDecimal(data[i].qtycredit).add(isYear)).toPlainString();
        data[i].qtyRef = (new BigDecimal(data[i].qtyRef).subtract(isYearRef)).toPlainString();
        data[i].qtycreditRef = (new BigDecimal(data[i].qtycreditRef).add(isYearRef))
            .toPlainString();
      }
      data2[i] = data[i];
    }
    if (!found) {
      data2[data2.length - 1] = new AccountTreeData();
      data2[data2.length - 1].id = strIncomeSummary;
      data2[data2.length - 1].qty = new BigDecimal(strISyear).negate().toPlainString();
      data2[data2.length - 1].qtycredit = strISyear;
      data2[data2.length - 1].qtyRef = new BigDecimal(strISyearRef).negate().toPlainString();
      data2[data2.length - 1].qtycreditRef = strISyearRef;
    } else
      return data;
    return data2;
  }

  //cashflow
  private AccountTreeCashflowData[] appendRecordsCashflow(AccountTreeCashflowData[] data, String strIncomeSummary,
      String strISyear, String strISyearRef) throws ServletException {
    if (data == null || strIncomeSummary == null || strIncomeSummary.equals("")
        || strISyear == null || strISyear.equals("") || strISyearRef == null
        || strISyearRef.equals(""))
      return data;
    AccountTreeCashflowData[] data2 = new AccountTreeCashflowData[data.length + 1];
    boolean found = false;
    for (int i = 0; i < data.length; i++) {
      if (data[i].id.equals(strIncomeSummary)) {
        found = true;
        BigDecimal isYear = new BigDecimal(strISyear);
        BigDecimal isYearRef = new BigDecimal(strISyearRef);

        data[i].qty = (new BigDecimal(data[i].qty).subtract(isYear)).toPlainString();
        data[i].qtycredit = (new BigDecimal(data[i].qtycredit).add(isYear)).toPlainString();
        data[i].qtyRef = (new BigDecimal(data[i].qtyRef).subtract(isYearRef)).toPlainString();
        data[i].qtycreditRef = (new BigDecimal(data[i].qtycreditRef).add(isYearRef))
            .toPlainString();
      }
      data2[i] = data[i];
    }
    if (!found) {
      data2[data2.length - 1] = new AccountTreeCashflowData();
      data2[data2.length - 1].id = strIncomeSummary;
      data2[data2.length - 1].qty = new BigDecimal(strISyear).negate().toPlainString();
      data2[data2.length - 1].qtycredit = strISyear;
      data2[data2.length - 1].qtyRef = new BigDecimal(strISyearRef).negate().toPlainString();
      data2[data2.length - 1].qtycreditRef = strISyearRef;
    } else
      return data;
    return data2;
  }

  //1 year before
  private AccountTreeKomperhensifData[] appendRecordsBef(AccountTreeKomperhensifData[] data, String strIncomeSummary,
      String strISyear, String strISyearRef, String strISyearBef, String strISyearAud) throws ServletException {
    if (data == null || strIncomeSummary == null || strIncomeSummary.equals("")
        || strISyear == null || strISyear.equals("") || strISyearRef == null
        || strISyearRef.equals(""))
      return data;
    AccountTreeKomperhensifData[] data2 = new AccountTreeKomperhensifData[data.length + 1];
    boolean found = false;
    for (int i = 0; i < data.length; i++) {
      if (data[i].id.equals(strIncomeSummary)) {
        found = true;
        BigDecimal isYear = new BigDecimal(strISyear);
        BigDecimal isYearRef = new BigDecimal(strISyearRef);
        //qty 1 year before
        BigDecimal isYearBef = new BigDecimal(strISyearBef);
        //qty audited
        BigDecimal isYearAud = new BigDecimal(strISyearAud);

        data[i].qty = (new BigDecimal(data[i].qty).subtract(isYear)).toPlainString();
        data[i].qtycredit = (new BigDecimal(data[i].qtycredit).add(isYear)).toPlainString();
        data[i].qtyRef = (new BigDecimal(data[i].qtyRef).subtract(isYearRef)).toPlainString();
        data[i].qtycreditRef = (new BigDecimal(data[i].qtycreditRef).add(isYearRef))
            .toPlainString();
        //qty 1 year before
        data[i].qtyBef = (new BigDecimal(data[i].qtyBef).subtract(isYearBef)).toPlainString();
        data[i].qtycreditBef = (new BigDecimal(data[i].qtycreditBef).add(isYearBef))
            .toPlainString();
        //qty audited
        data[i].qtyAud = (new BigDecimal(data[i].qtyAud).subtract(isYearAud)).toPlainString();
        data[i].qtycreditAud = (new BigDecimal(data[i].qtycreditAud).add(isYearAud))
            .toPlainString();
        //anggaran
        //data[i].qtyAnggaran = (new BigDecimal(data[i].qtyAnggaran)).toPlainString();
        //data[i].anggaranThIni = (new BigDecimal(data[i].anggaranThIni)).toPlainString();
        //data[i].anggaranThLalu = (new BigDecimal(data[i].anggaranThLalu)).toPlainString();
      }
      data2[i] = data[i];
    }
    if (!found) {
      data2[data2.length - 1] = new AccountTreeKomperhensifData();
      data2[data2.length - 1].id = strIncomeSummary;
      data2[data2.length - 1].qty = new BigDecimal(strISyear).negate().toPlainString();
      data2[data2.length - 1].qtycredit = strISyear;
      data2[data2.length - 1].qtyRef = new BigDecimal(strISyearRef).negate().toPlainString();
      data2[data2.length - 1].qtycreditRef = strISyearRef;
      //qty 1 year before
      data2[data2.length - 1].qtyBef = new BigDecimal(strISyearBef).negate().toPlainString();
      data2[data2.length - 1].qtycreditBef = strISyearBef;
      //qty audited
      data2[data2.length - 1].qtyAud = new BigDecimal(strISyearAud).negate().toPlainString();
      data2[data2.length - 1].qtycreditAud = strISyearAud;
      //anggaran
      //data2[data2.length - 1].qtyAnggaran = (BigDecimal.ZERO).toString();
      //data2[data2.length - 1].anggaranThIni = (BigDecimal.ZERO).toPlainString();
      //data2[data2.length - 1].anggaranThLalu = (BigDecimal.ZERO).toPlainString();
    } else
      return data;
    return data2;
  }

  //mutasi
  private AccountTreeMutasiData[] appendRecordsMutasi(AccountTreeMutasiData[] data, String strIncomeSummary,
      String strISyearMutasi, String strISyearRefMutasi) throws ServletException {
    if (data == null || strIncomeSummary == null || strIncomeSummary.equals("")
        || strISyearMutasi == null || strISyearMutasi.equals("") || strISyearRefMutasi == null
        || strISyearRefMutasi.equals(""))
      return data;
    AccountTreeMutasiData[] data2 = new AccountTreeMutasiData[data.length + 1];
    boolean found = false;
    for (int i = 0; i < data.length; i++) {
      if (data[i].id.equals(strIncomeSummary)) {
        found = true;
        BigDecimal isYearMutasi = new BigDecimal(strISyearMutasi);
        BigDecimal isYearRefMutasi = new BigDecimal(strISyearRefMutasi);
        data[i].qty = (new BigDecimal(data[i].qty).subtract(isYearMutasi)).toPlainString();
        data[i].qtycredit = (new BigDecimal(data[i].qtycredit).add(isYearMutasi)).toPlainString();
        data[i].qtyRef = (new BigDecimal(data[i].qtyRef).subtract(isYearRefMutasi)).toPlainString();
        data[i].qtycreditRef = (new BigDecimal(data[i].qtycreditRef).add(isYearRefMutasi))
            .toPlainString();
        //data[i].monthacct = data[i].monthacct;
        //test
        //data[i].quantity = (new BigDecimal(data[i].quantity).add(isYearRefMutasi))
          //  .toPlainString();
      }
      data2[i] = data[i];
    }
    if (!found) {
      data2[data2.length - 1] = new AccountTreeMutasiData();
      data2[data2.length - 1].id = strIncomeSummary;
      data2[data2.length - 1].qty = new BigDecimal(strISyearMutasi).negate().toPlainString();
      data2[data2.length - 1].qtycredit = strISyearMutasi;
      data2[data2.length - 1].qtyRef = new BigDecimal(strISyearRefMutasi).negate().toPlainString();
      data2[data2.length - 1].qtycreditRef = strISyearRefMutasi;
      /*data2[data2.length - 1].monthacct = "1";
      data2[data2.length - 1].quantity = new BigDecimal(strISyearRefMutasi).negate().toPlainString();  */
    } else
      return data;
    return data2;
  }
  //end mutasi

  //GET TOTAL
  private String processIncomeSummary(String strDateFrom, String strDateTo, String strAgno,
      String strTreeOrg, String strOrg, String strcAcctSchemaId) throws ServletException,
      IOException {
    String strISRevenue = GeneralAccountingRptData.selectPyG(this, "R", strDateFrom, strDateTo,
        strcAcctSchemaId, strAgno, Tree.getMembers(this, strTreeOrg, strOrg));
    String strISExpense = GeneralAccountingRptData.selectPyG(this, "E", strDateFrom, strDateTo,
        strcAcctSchemaId, strAgno, Tree.getMembers(this, strTreeOrg, strOrg));
    BigDecimal totalRevenue = new BigDecimal(strISRevenue);
    BigDecimal totalExpense = new BigDecimal(strISExpense);
    BigDecimal total = totalRevenue.add(totalExpense);
    if (log4j.isDebugEnabled())
      log4j.debug(total.toString());
    return total.toString();
  }

  //for Mutasi
  private String processIncomeSummaryMutasi(String strDateFrom, String strDateTo, String strAgno,
      String strTreeOrg, String strOrg, String strcAcctSchemaId, String strMonth) throws ServletException,
      IOException {
    /*BigDecimal totalRevenue = BigDecimal.ZERO;
    BigDecimal totalExpense = BigDecimal.ZERO;
    BigDecimal total = BigDecimal.ZERO;*/
    /*GeneralAccountingRptData[] isRevenue = GeneralAccountingRptData.selectPyGMutasi(this, "R", strDateFrom, strDateTo,
        strcAcctSchemaId, strAgno, Tree.getMembers(this, strTreeOrg, strOrg));
    GeneralAccountingRptData[] isExpense = GeneralAccountingRptData.selectPyGMutasi(this, "E", strDateFrom, strDateTo,
        strcAcctSchemaId, strAgno, Tree.getMembers(this, strTreeOrg, strOrg));*/

    String strISRevenue = GeneralAccountingRptData.selectPyGMutasi(this, "R", strMonth,
        strcAcctSchemaId, strAgno, Tree.getMembers(this, strTreeOrg, strOrg));
    String strISExpense = GeneralAccountingRptData.selectPyGMutasi(this, "E", strMonth,
        strcAcctSchemaId, strAgno, Tree.getMembers(this, strTreeOrg, strOrg));

    /*for (int i=0; i<=isRevenue.length(); i++){
        totalRevenue = isRevenue[i].name;
    }

    for (int i=0; i<=isExpense.length(); i++){
        totalExpense = isRevenue[i].name;
    }*/

    if (strISRevenue==null){
      strISRevenue="0";
    }

    if (strISExpense==null){
      strISExpense="0";
    }

    BigDecimal totalRevenue = new BigDecimal(strISRevenue);
    BigDecimal totalExpense = new BigDecimal(strISExpense);
    BigDecimal total = totalRevenue.add(totalExpense);

    if (log4j.isDebugEnabled())
      log4j.debug(total.toString());
    return total.toString();
  }
  //end Mutasi

  private void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars,
      String strAgno, String strAgnoRef, String strDateFrom, String strDateTo, String strPageNo,
      String strDateFromRef, String strDateToRef, String strAsDateTo, String strAsDateToRef,
      String strElementValue, String strConImporte, String strOrg, String strLevel,
      String strConCodigo, String strcAcctSchemaId) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
        "com/gai/generalaccountingrpt/erpCommon/ad_reports/GeneralAccountingRpt").createXmlDocument();

    ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "GeneralAccountingRpt", false, "",
        "", "", false, "ad_reports", strReplaceWith, false, true);
    toolbar.prepareSimpleToolBarTemplate();
    xmlDocument.setParameter("toolbar", toolbar.toString());

    try {
      WindowTabs tabs = new WindowTabs(this, vars,
          "com.gai.generalaccountingrpt.erpCommon.ad_reports.GeneralAccountingRpt");
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      xmlDocument.setParameter("theme", vars.getTheme());
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(),
          "GeneralAccountingRpt.html", classInfo.id, classInfo.type, strReplaceWith,
          tabs.breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "GeneralAccountingRpt.html",
          strReplaceWith);
      xmlDocument.setParameter("leftTabs", lBar.manualTemplate());
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
    {
      OBError myMessage = vars.getMessage("GeneralAccountingRpt");
      vars.removeMessage("GeneralAccountingRpt");
      if (myMessage != null) {
        xmlDocument.setParameter("messageType", myMessage.getType());
        xmlDocument.setParameter("messageTitle", myMessage.getTitle());
        xmlDocument.setParameter("messageMessage", myMessage.getMessage());
      }
    }

    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("agno", strAgno);
    xmlDocument.setParameter("agnoRef", strAgnoRef);
    xmlDocument.setParameter("dateFrom", strDateFrom);
    xmlDocument.setParameter("dateFromdisplayFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("dateFromsaveFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("dateTo", strDateTo);
    xmlDocument.setParameter("dateTodisplayFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("dateTosaveFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("dateFromRef", strDateFromRef);
    xmlDocument.setParameter("dateFromRefdisplayFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("dateFromRefsaveFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("dateToRef", strDateToRef);
    xmlDocument.setParameter("PageNo", strPageNo);
    xmlDocument.setParameter("dateToRefdisplayFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("dateToRefsaveFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("asDateTo", strAsDateTo);
    xmlDocument.setParameter("asDateTodisplayFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("asDateTosaveFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("asDateToRef", strAsDateToRef);
    xmlDocument.setParameter("asDateToRefdisplayFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("asDateToRefsaveFormat", vars.getSessionValue("#AD_SqlDateFormat"));
    xmlDocument.setParameter("conImporte", strConImporte);
    xmlDocument.setParameter("conCodigo", strConCodigo);
    xmlDocument.setParameter("C_Org_ID", strOrg);
    xmlDocument.setParameter("C_ElementValue_ID", strElementValue);
    xmlDocument.setParameter("level", strLevel);
    xmlDocument.setParameter("cAcctschemaId", strcAcctSchemaId);
    xmlDocument.setData("reportC_ACCTSCHEMA_ID", "liststructure", AccountingSchemaMiscData
        .selectC_ACCTSCHEMA_ID(this,
            Utility.getContext(this, vars, "#AccessibleOrgTree", "GeneralAccountingRpt"),
            Utility.getContext(this, vars, "#User_Client", "GeneralAccountingRpt"),
            strcAcctSchemaId));
    try {
      ComboTableData comboTableData = new ComboTableData(vars, this, "LIST", "",
          "C_ElementValue level", "", Utility.getContext(this, vars, "#AccessibleOrgTree",
              "GeneralAccountingRpt"), Utility.getContext(this, vars, "#User_Client",
              "GeneralAccountingRpt"), 0);
      Utility.fillSQLParameters(this, vars, null, comboTableData, "GeneralAccountingRpt", "");
      xmlDocument.setData("reportLevel", "liststructure", comboTableData.select(false));
      comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }

    String strOrgList = "";
    String[] orgList = OBContext.getOBContext().getReadableOrganizations();
    int i = 0;
    for (String org : orgList) {
      if (i == 0) {
        strOrgList += "'" + org + "'";
      } else {
        strOrgList += ",'" + org + "'";
      }
      i++;
    }

    xmlDocument.setParameter(
        "orgs",
        Utility.arrayDobleEntrada("arrOrgs",
            GeneralAccountingRptData.selectOrgsDouble(this, vars.getClient(), strOrgList)));
    xmlDocument.setParameter(
        "accountingReports",
        Utility.arrayDobleEntrada("arrAccountingReports",
            GeneralAccountingRptData.selectRptDouble(this)));
    xmlDocument.setParameter(
        "years",
        Utility.arrayDobleEntrada("arrYears",
            GeneralAccountingRptData.selectYearsDouble(this, vars.getUserClient())));
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(xmlDocument.print());
    out.close();
  }

  public String getServletInfo() {
    return "Servlet GeneralAccountingRptData";
  } // end of getServletInfo() method
}
