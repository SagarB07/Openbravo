//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.info;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class InvoiceData implements FieldProvider {
static Logger log4j = Logger.getLogger(InvoiceData.class);
  private String InitRecordNumber="0";
  public String rn1;
  public String cInvoiceId;
  public String bpartnername;
  public String dateinvoiced;
  public String documentno;
  public String currency;
  public String grandtotal;
  public String openamt;
  public String issotrx;
  public String description;
  public String poreference;
  public String dateacct;
  public String adClientId;
  public String cCurrencyId;
  public String rowkey;
  public String convertedamount;
  public String name;
  public String nameHidden;
  public String value;
  public String position;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("RN1"))
      return rn1;
    else if (fieldName.equalsIgnoreCase("C_INVOICE_ID") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("BPARTNERNAME"))
      return bpartnername;
    else if (fieldName.equalsIgnoreCase("DATEINVOICED"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("CURRENCY"))
      return currency;
    else if (fieldName.equalsIgnoreCase("GRANDTOTAL"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("OPENAMT"))
      return openamt;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("ROWKEY"))
      return rowkey;
    else if (fieldName.equalsIgnoreCase("CONVERTEDAMOUNT"))
      return convertedamount;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("NAME_HIDDEN") || fieldName.equals("nameHidden"))
      return nameHidden;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equals("position"))
      return position;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static InvoiceData[] select(ConnectionProvider connectionProvider, String rownum, String dateFormat, String adUserClient, String adUserOrg, String key, String description, String businesPartner, String order, String dateFrom, String dateTo, String grandTotalFrom, String grandTotalTo, String sotrx, String orderBy, String oraLimit, String pgLimit)    throws ServletException {
    return select(connectionProvider, rownum, dateFormat, adUserClient, adUserOrg, key, description, businesPartner, order, dateFrom, dateTo, grandTotalFrom, grandTotalTo, sotrx, orderBy, oraLimit, pgLimit, 0, 0);
  }

  public static InvoiceData[] select(ConnectionProvider connectionProvider, String rownum, String dateFormat, String adUserClient, String adUserOrg, String key, String description, String businesPartner, String order, String dateFrom, String dateTo, String grandTotalFrom, String grandTotalTo, String sotrx, String orderBy, String oraLimit, String pgLimit, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT B.*," +
      "        	C_Invoice_ID || '@_##_@' || DocumentNo || ' - ' || TO_CHAR(DateInvoiced, TO_CHAR(?)) as RowKey," +
      "        	C_Base_Convert(GrandTotal, C_Currency_ID, AD_Client_ID, DateAcct, '0') AS ConvertedAmount," +
      "            DocumentNo||' - '||TO_CHAR(DateInvoiced,to_char(?))||' - '||GrandTotal AS Name," +
      "          	REPLACE(DocumentNo||' - '||TO_CHAR(DateInvoiced,to_char(?))||' - '||GrandTotal, '''', CHR(92) || '''') AS Name_HIDDEN, '' AS value" +
      "        FROM ( SELECT ";
    strSql = strSql + ((rownum==null || rownum.equals(""))?"":rownum);
    strSql = strSql + 
      " AS RN1, A.* FROM ( " +
      "          SELECT" +
      "          i.C_Invoice_ID," +
      "          bp.name AS BPartnerName," +
      "          i.DateInvoiced," +
      "          i.DocumentNo," +
      "          (SELECT ISO_Code FROM C_Currency c WHERE c.C_Currency_ID=i.C_Currency_ID) AS Currency," +
      "          i.GrandTotal," +
      "          0 AS OpenAmt," +
      "          i.IsSOTrx," +
      "          i.Description," +
      "          i.POReference," +
      "          i.DateAcct, i.AD_Client_ID, i.C_Currency_ID" +
      "          FROM C_Invoice_v i LEFT JOIN C_BPartner bp ON bp.C_BPartner_ID=i.C_BPartner_ID" +
      "          WHERE i.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "          AND i.AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ") " +
      "          AND i.IsActive='Y'";
    strSql = strSql + ((key==null || key.equals("") || key.equals("%") )?"":"  AND UPPER(i.DocumentNo) LIKE UPPER(?)  ");
    strSql = strSql + ((description==null || description.equals("") || description.equals("%") )?"":"  AND UPPER(i.Description) LIKE UPPER(?)  ");
    strSql = strSql + ((businesPartner==null || businesPartner.equals(""))?"":"  AND i.C_BPartner_ID = ?  ");
    strSql = strSql + ((order==null || order.equals(""))?"":"  AND i.POReference = ?  ");
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND i.DateInvoiced >= TO_DATE(?)  ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND i.DateInvoiced < TO_DATE(?)  ");
    strSql = strSql + ((grandTotalFrom==null || grandTotalFrom.equals(""))?"":"  AND i.GrandTotal >= TO_NUMBER(?)  ");
    strSql = strSql + ((grandTotalTo==null || grandTotalTo.equals(""))?"":"  AND i.GrandTotal <= TO_NUMBER(?)  ");
    strSql = strSql + ((sotrx==null || sotrx.equals(""))?"":"  AND i.IsSOTrx = ?  ");
    strSql = strSql + 
      "          ORDER BY ";
    strSql = strSql + ((orderBy==null || orderBy.equals(""))?"":orderBy);
    strSql = strSql + 
      "        ) A ) B" +
      "        WHERE 1=1";
    strSql = strSql + ((oraLimit==null || oraLimit.equals(""))?"":" AND RN1 BETWEEN " + oraLimit);
    strSql = strSql + ((pgLimit==null || pgLimit.equals(""))?"":" LIMIT " + pgLimit);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (rownum != null && !(rownum.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFormat);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (key != null && !(key.equals("")) && !(key.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      }
      if (description != null && !(description.equals("")) && !(description.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      }
      if (businesPartner != null && !(businesPartner.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, businesPartner);
      }
      if (order != null && !(order.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, order);
      }
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (grandTotalFrom != null && !(grandTotalFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandTotalFrom);
      }
      if (grandTotalTo != null && !(grandTotalTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandTotalTo);
      }
      if (sotrx != null && !(sotrx.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, sotrx);
      }
      if (orderBy != null && !(orderBy.equals(""))) {
        }
      if (oraLimit != null && !(oraLimit.equals(""))) {
        }
      if (pgLimit != null && !(pgLimit.equals(""))) {
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
        InvoiceData objectInvoiceData = new InvoiceData();
        objectInvoiceData.rn1 = UtilSql.getValue(result, "RN1");
        objectInvoiceData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectInvoiceData.bpartnername = UtilSql.getValue(result, "BPARTNERNAME");
        objectInvoiceData.dateinvoiced = UtilSql.getDateValue(result, "DATEINVOICED", "dd-MM-yyyy");
        objectInvoiceData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectInvoiceData.currency = UtilSql.getValue(result, "CURRENCY");
        objectInvoiceData.grandtotal = UtilSql.getValue(result, "GRANDTOTAL");
        objectInvoiceData.openamt = UtilSql.getValue(result, "OPENAMT");
        objectInvoiceData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectInvoiceData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectInvoiceData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectInvoiceData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectInvoiceData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectInvoiceData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectInvoiceData.rowkey = UtilSql.getValue(result, "ROWKEY");
        objectInvoiceData.convertedamount = UtilSql.getValue(result, "CONVERTEDAMOUNT");
        objectInvoiceData.name = UtilSql.getValue(result, "NAME");
        objectInvoiceData.nameHidden = UtilSql.getValue(result, "NAME_HIDDEN");
        objectInvoiceData.value = UtilSql.getValue(result, "VALUE");
        objectInvoiceData.position = Long.toString(countRecord);
        objectInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectInvoiceData);
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
    InvoiceData objectInvoiceData[] = new InvoiceData[vector.size()];
    vector.copyInto(objectInvoiceData);
    return(objectInvoiceData);
  }

  public static String countRows(ConnectionProvider connectionProvider, String rownum, String adUserClient, String adUserOrg, String key, String description, String businesPartner, String order, String dateFrom, String dateTo, String grandTotalFrom, String grandTotalTo, String sotrx, String pgLimit, String oraLimit1, String oraLimit2)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT COUNT(*) AS value FROM ( SELECT ";
    strSql = strSql + ((rownum==null || rownum.equals(""))?"":rownum);
    strSql = strSql + 
      " AS rn1, B.* FROM (" +
      "            SELECT 1 FROM C_Invoice_v i" +
      "            WHERE i.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "            AND i.AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ") " +
      "            AND i.IsActive='Y'";
    strSql = strSql + ((key==null || key.equals("") || key.equals("%") )?"":"  AND UPPER(i.DocumentNo) LIKE UPPER(?)  ");
    strSql = strSql + ((description==null || description.equals("") || description.equals("%") )?"":"  AND UPPER(i.Description) LIKE UPPER(?)  ");
    strSql = strSql + ((businesPartner==null || businesPartner.equals(""))?"":"  AND i.C_BPartner_ID = ?  ");
    strSql = strSql + ((order==null || order.equals(""))?"":"  AND i.POReference = ?  ");
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND i.DateInvoiced >= TO_DATE(?)  ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND i.DateInvoiced < TO_DATE(?)  ");
    strSql = strSql + ((grandTotalFrom==null || grandTotalFrom.equals(""))?"":"  AND i.GrandTotal >= TO_NUMBER(?)  ");
    strSql = strSql + ((grandTotalTo==null || grandTotalTo.equals(""))?"":"  AND i.GrandTotal <= TO_NUMBER(?)  ");
    strSql = strSql + ((sotrx==null || sotrx.equals(""))?"":"  AND i.IsSOTrx = ?  ");
    strSql = strSql + 
      "            AND 1=1";
    strSql = strSql + ((pgLimit==null || pgLimit.equals(""))?"":" LIMIT " + pgLimit);
    strSql = strSql + 
      "          ) B";
    strSql = strSql + ((oraLimit1==null || oraLimit1.equals(""))?"":"  WHERE ROWNUM <= " + oraLimit1);
    strSql = strSql + 
      "          ) A ";
    strSql = strSql + ((oraLimit2==null || oraLimit2.equals(""))?"":" WHERE RN1 BETWEEN " + oraLimit2);

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (rownum != null && !(rownum.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (key != null && !(key.equals("")) && !(key.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      }
      if (description != null && !(description.equals("")) && !(description.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      }
      if (businesPartner != null && !(businesPartner.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, businesPartner);
      }
      if (order != null && !(order.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, order);
      }
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (grandTotalFrom != null && !(grandTotalFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandTotalFrom);
      }
      if (grandTotalTo != null && !(grandTotalTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandTotalTo);
      }
      if (sotrx != null && !(sotrx.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, sotrx);
      }
      if (pgLimit != null && !(pgLimit.equals(""))) {
        }
      if (oraLimit1 != null && !(oraLimit1.equals(""))) {
        }
      if (oraLimit2 != null && !(oraLimit2.equals(""))) {
        }

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "VALUE");
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

  public static InvoiceData[] selectKey(ConnectionProvider connectionProvider, String dateFormat, String adUserClient, String adUserOrg, String sotrx, String key)    throws ServletException {
    return selectKey(connectionProvider, dateFormat, adUserClient, adUserOrg, sotrx, key, 0, 0);
  }

  public static InvoiceData[] selectKey(ConnectionProvider connectionProvider, String dateFormat, String adUserClient, String adUserOrg, String sotrx, String key, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT" +
      "          i.C_Invoice_ID, i.DocumentNo||' - '||TO_CHAR(i.DateInvoiced,to_char(?))||' - '||i.GrandTotal AS Name," +
      "          (SELECT Name FROM C_BPartner bp WHERE bp.C_BPartner_ID=i.C_BPartner_ID) AS BPartnerName," +
      "          i.DateInvoiced," +
      "          i.DocumentNo," +
      "          (SELECT ISO_Code FROM C_Currency c WHERE c.C_Currency_ID=i.C_Currency_ID) AS Currency," +
      "          i.GrandTotal," +
      "          C_Base_Convert(i.GrandTotal, i.C_Currency_ID, i.AD_Client_ID, i.DateAcct, '0') AS ConvertedAmount," +
      "          0 AS OpenAmt," +
      "          i.IsSOTrx," +
      "          i.Description," +
      "          i.POReference" +
      "          FROM C_Invoice_v i" +
      "          WHERE i.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "          AND i.AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ") " +
      "          AND i.IsActive='Y'";
    strSql = strSql + ((sotrx==null || sotrx.equals(""))?"":"  AND i.IsSOTrx = ?  ");
    strSql = strSql + 
      "          AND UPPER(i.DocumentNo) LIKE UPPER(?)";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFormat);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (sotrx != null && !(sotrx.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, sotrx);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

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
        InvoiceData objectInvoiceData = new InvoiceData();
        objectInvoiceData.cInvoiceId = UtilSql.getValue(result, "C_INVOICE_ID");
        objectInvoiceData.name = UtilSql.getValue(result, "NAME");
        objectInvoiceData.bpartnername = UtilSql.getValue(result, "BPARTNERNAME");
        objectInvoiceData.dateinvoiced = UtilSql.getDateValue(result, "DATEINVOICED", "dd-MM-yyyy");
        objectInvoiceData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectInvoiceData.currency = UtilSql.getValue(result, "CURRENCY");
        objectInvoiceData.grandtotal = UtilSql.getValue(result, "GRANDTOTAL");
        objectInvoiceData.convertedamount = UtilSql.getValue(result, "CONVERTEDAMOUNT");
        objectInvoiceData.openamt = UtilSql.getValue(result, "OPENAMT");
        objectInvoiceData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectInvoiceData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectInvoiceData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectInvoiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectInvoiceData);
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
    InvoiceData objectInvoiceData[] = new InvoiceData[vector.size()];
    vector.copyInto(objectInvoiceData);
    return(objectInvoiceData);
  }
}
