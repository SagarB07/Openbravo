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

class ShipmentReceiptData implements FieldProvider {
static Logger log4j = Logger.getLogger(ShipmentReceiptData.class);
  private String InitRecordNumber="0";
  public String rn1;
  public String clave;
  public String bpartnerName;
  public String movementdate;
  public String documentno;
  public String description;
  public String orderReference;
  public String salesTransaction;
  public String rowkey;
  public String position;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("RN1"))
      return rn1;
    else if (fieldName.equalsIgnoreCase("CLAVE"))
      return clave;
    else if (fieldName.equalsIgnoreCase("BPARTNER_NAME") || fieldName.equals("bpartnerName"))
      return bpartnerName;
    else if (fieldName.equalsIgnoreCase("MOVEMENTDATE"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ORDER_REFERENCE") || fieldName.equals("orderReference"))
      return orderReference;
    else if (fieldName.equalsIgnoreCase("SALES_TRANSACTION") || fieldName.equals("salesTransaction"))
      return salesTransaction;
    else if (fieldName.equalsIgnoreCase("ROWKEY"))
      return rowkey;
    else if (fieldName.equals("position"))
      return position;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ShipmentReceiptData[] select(ConnectionProvider connectionProvider, String rownum, String adUserClient, String adUserOrg, String key, String description, String businesPartner, String orderReference, String dateFrom, String dateTo, String salesTransaction, String orderBy, String oraLimit, String pgLimit)    throws ServletException {
    return select(connectionProvider, rownum, adUserClient, adUserOrg, key, description, businesPartner, orderReference, dateFrom, dateTo, salesTransaction, orderBy, oraLimit, pgLimit, 0, 0);
  }

  public static ShipmentReceiptData[] select(ConnectionProvider connectionProvider, String rownum, String adUserClient, String adUserOrg, String key, String description, String businesPartner, String orderReference, String dateFrom, String dateTo, String salesTransaction, String orderBy, String oraLimit, String pgLimit, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT * FROM ( SELECT ";
    strSql = strSql + ((rownum==null || rownum.equals(""))?"":rownum);
    strSql = strSql + 
      " AS RN1, A.* FROM (    " +
      "        SELECT MI.M_INOUT_ID AS CLAVE, CB.NAME AS BPARTNER_NAME, MI.MOVEMENTDATE, MI.DOCUMENTNO, MI.DESCRIPTION, MI.POREFERENCE AS ORDER_REFERENCE," +
      "        MI.ISSOTRX AS SALES_TRANSACTION," +
      "			MI.M_INOUT_ID || '@_##_@' || MI.DOCUMENTNO as rowkey" +
      "        FROM M_INOUT MI, C_BPARTNER CB" +
      "        WHERE MI.C_BPARTNER_ID = CB.C_BPARTNER_ID" +
      "        AND MI.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MI.AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ") " +
      "        AND MI.ISACTIVE = 'Y'";
    strSql = strSql + ((key==null || key.equals("") || key.equals("%") )?"":"  AND UPPER(MI.DOCUMENTNO) LIKE UPPER(?)  ");
    strSql = strSql + ((description==null || description.equals("") || description.equals("%") )?"":"  AND UPPER(MI.DESCRIPTION) LIKE UPPER(?)  ");
    strSql = strSql + ((businesPartner==null || businesPartner.equals(""))?"":"  AND MI.C_BPARTNER_ID=?  ");
    strSql = strSql + ((orderReference==null || orderReference.equals("") || orderReference.equals("%") )?"":"  AND UPPER(MI.POREFERENCE) LIKE UPPER(?)  ");
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND MI.MOVEMENTDATE >= to_date(?)  ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND MI.MOVEMENTDATE < to_date(?)  ");
    strSql = strSql + ((salesTransaction==null || salesTransaction.equals(""))?"":"  AND MI.ISSOTRX=?  ");
    strSql = strSql + 
      "        ORDER BY ";
    strSql = strSql + ((orderBy==null || orderBy.equals(""))?"":orderBy);
    strSql = strSql + 
      "		) A ) B" +
      "		WHERE 1=1";
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
      if (orderReference != null && !(orderReference.equals("")) && !(orderReference.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderReference);
      }
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (salesTransaction != null && !(salesTransaction.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesTransaction);
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
        ShipmentReceiptData objectShipmentReceiptData = new ShipmentReceiptData();
        objectShipmentReceiptData.rn1 = UtilSql.getValue(result, "RN1");
        objectShipmentReceiptData.clave = UtilSql.getValue(result, "CLAVE");
        objectShipmentReceiptData.bpartnerName = UtilSql.getValue(result, "BPARTNER_NAME");
        objectShipmentReceiptData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectShipmentReceiptData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectShipmentReceiptData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectShipmentReceiptData.orderReference = UtilSql.getValue(result, "ORDER_REFERENCE");
        objectShipmentReceiptData.salesTransaction = UtilSql.getValue(result, "SALES_TRANSACTION");
        objectShipmentReceiptData.rowkey = UtilSql.getValue(result, "ROWKEY");
        objectShipmentReceiptData.position = Long.toString(countRecord);
        objectShipmentReceiptData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectShipmentReceiptData);
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
    ShipmentReceiptData objectShipmentReceiptData[] = new ShipmentReceiptData[vector.size()];
    vector.copyInto(objectShipmentReceiptData);
    return(objectShipmentReceiptData);
  }

  public static String countRows(ConnectionProvider connectionProvider, String rownum, String adUserClient, String adUserOrg, String key, String description, String businesPartner, String orderReference, String dateFrom, String dateTo, String salesTransaction, String pgLimit, String oraLimit1, String oraLimit2)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT COUNT(*) AS VALUE FROM ( SELECT ";
    strSql = strSql + ((rownum==null || rownum.equals(""))?"":rownum);
    strSql = strSql + 
      " AS RN1, B.* FROM (    " +
      "        SELECT 1 FROM M_INOUT MI, C_BPARTNER CB" +
      "        WHERE MI.C_BPARTNER_ID = CB.C_BPARTNER_ID" +
      "        AND MI.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MI.AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ") " +
      "        AND MI.ISACTIVE = 'Y'";
    strSql = strSql + ((key==null || key.equals("") || key.equals("%") )?"":"  AND UPPER(MI.DOCUMENTNO) LIKE UPPER(?)  ");
    strSql = strSql + ((description==null || description.equals("") || description.equals("%") )?"":"  AND UPPER(MI.DESCRIPTION) LIKE UPPER(?)  ");
    strSql = strSql + ((businesPartner==null || businesPartner.equals(""))?"":"  AND MI.C_BPARTNER_ID=?  ");
    strSql = strSql + ((orderReference==null || orderReference.equals("") || orderReference.equals("%") )?"":"  AND UPPER(MI.POREFERENCE) LIKE UPPER(?)  ");
    strSql = strSql + ((dateFrom==null || dateFrom.equals(""))?"":"  AND MI.MOVEMENTDATE >= to_date(?)  ");
    strSql = strSql + ((dateTo==null || dateTo.equals(""))?"":"  AND MI.MOVEMENTDATE < to_date(?)  ");
    strSql = strSql + ((salesTransaction==null || salesTransaction.equals(""))?"":"  AND MI.ISSOTRX=?  ");
    strSql = strSql + 
      "		AND 1=1";
    strSql = strSql + ((pgLimit==null || pgLimit.equals(""))?"":" LIMIT " + pgLimit);
    strSql = strSql + 
      "		) B";
    strSql = strSql + ((oraLimit1==null || oraLimit1.equals(""))?"":"  WHERE ROWNUM <= " + oraLimit1);
    strSql = strSql + 
      "		) A ";
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
      if (orderReference != null && !(orderReference.equals("")) && !(orderReference.equals("%"))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderReference);
      }
      if (dateFrom != null && !(dateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateFrom);
      }
      if (dateTo != null && !(dateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTo);
      }
      if (salesTransaction != null && !(salesTransaction.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesTransaction);
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

  public static ShipmentReceiptData[] selectKey(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String salesTransaction, String key)    throws ServletException {
    return selectKey(connectionProvider, adUserClient, adUserOrg, salesTransaction, key, 0, 0);
  }

  public static ShipmentReceiptData[] selectKey(ConnectionProvider connectionProvider, String adUserClient, String adUserOrg, String salesTransaction, String key, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MI.M_INOUT_ID AS CLAVE, CB.NAME AS BPARTNER_NAME, MI.MOVEMENTDATE, MI.DOCUMENTNO, MI.DESCRIPTION, MI.POREFERENCE AS ORDER_REFERENCE," +
      "        MI.ISSOTRX AS SALES_TRANSACTION" +
      "        FROM M_INOUT MI, C_BPARTNER CB" +
      "        WHERE MI.C_BPARTNER_ID = CB.C_BPARTNER_ID" +
      "        AND MI.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MI.AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ") " +
      "        AND MI.ISACTIVE = 'Y'";
    strSql = strSql + ((salesTransaction==null || salesTransaction.equals(""))?"":"  AND MI.ISSOTRX=?  ");
    strSql = strSql + 
      "        AND UPPER(MI.DOCUMENTNO) LIKE UPPER(?)";

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
        }
      if (salesTransaction != null && !(salesTransaction.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesTransaction);
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
        ShipmentReceiptData objectShipmentReceiptData = new ShipmentReceiptData();
        objectShipmentReceiptData.clave = UtilSql.getValue(result, "CLAVE");
        objectShipmentReceiptData.bpartnerName = UtilSql.getValue(result, "BPARTNER_NAME");
        objectShipmentReceiptData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectShipmentReceiptData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectShipmentReceiptData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectShipmentReceiptData.orderReference = UtilSql.getValue(result, "ORDER_REFERENCE");
        objectShipmentReceiptData.salesTransaction = UtilSql.getValue(result, "SALES_TRANSACTION");
        objectShipmentReceiptData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectShipmentReceiptData);
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
    ShipmentReceiptData objectShipmentReceiptData[] = new ShipmentReceiptData[vector.size()];
    vector.copyInto(objectShipmentReceiptData);
    return(objectShipmentReceiptData);
  }
}