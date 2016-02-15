//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.businessUtility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

public class BpartnerMiscData implements FieldProvider {
static Logger log4j = Logger.getLogger(BpartnerMiscData.class);
  private String InitRecordNumber="0";
  public String cPaymenttermId;
  public String mPricelistId;
  public String paymentrule;
  public String poreference;
  public String soDescription;
  public String isdiscountprinted;
  public String invoicerule;
  public String deliveryrule;
  public String deliveryviarule;
  public String creditavailable;
  public String poPricelistId;
  public String paymentrulepo;
  public String poPaymenttermId;
  public String salesrepId;
  public String finPaymentmethodId;
  public String poPaymentmethodId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_PAYMENTTERM_ID") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("M_PRICELIST_ID") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULE"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("SO_DESCRIPTION") || fieldName.equals("soDescription"))
      return soDescription;
    else if (fieldName.equalsIgnoreCase("ISDISCOUNTPRINTED"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("INVOICERULE"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("DELIVERYRULE"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("DELIVERYVIARULE"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("CREDITAVAILABLE"))
      return creditavailable;
    else if (fieldName.equalsIgnoreCase("PO_PRICELIST_ID") || fieldName.equals("poPricelistId"))
      return poPricelistId;
    else if (fieldName.equalsIgnoreCase("PAYMENTRULEPO"))
      return paymentrulepo;
    else if (fieldName.equalsIgnoreCase("PO_PAYMENTTERM_ID") || fieldName.equals("poPaymenttermId"))
      return poPaymenttermId;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENTMETHOD_ID") || fieldName.equals("finPaymentmethodId"))
      return finPaymentmethodId;
    else if (fieldName.equalsIgnoreCase("PO_PAYMENTMETHOD_ID") || fieldName.equals("poPaymentmethodId"))
      return poPaymentmethodId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static BpartnerMiscData[] select(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    return select(connectionProvider, cBpartnerId, 0, 0);
  }

  public static BpartnerMiscData[] select(ConnectionProvider connectionProvider, String cBpartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT p.C_PaymentTerm_ID," +
      "      p.M_PriceList_ID,p.PaymentRule,p.POReference," +
      "      p.SO_Description,COALESCE(p.IsDiscountPrinted,'N') AS IsDiscountPrinted," +
      "      p.InvoiceRule,p.DeliveryRule,DeliveryViaRule," +
      "      COALESCE(p.SO_CreditLimit-p.SO_CreditUsed,-1) AS CreditAvailable," +
      "      p.PO_PriceList_ID, p.PaymentRulePO, p.PO_PaymentTerm_ID, p.salesrep_Id," +
      "      p.fin_paymentmethod_id, p.po_paymentmethod_id" +
      "      FROM C_BPartner p" +
      "      WHERE p.C_BPartner_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
        BpartnerMiscData objectBpartnerMiscData = new BpartnerMiscData();
        objectBpartnerMiscData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectBpartnerMiscData.mPricelistId = UtilSql.getValue(result, "M_PRICELIST_ID");
        objectBpartnerMiscData.paymentrule = UtilSql.getValue(result, "PAYMENTRULE");
        objectBpartnerMiscData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectBpartnerMiscData.soDescription = UtilSql.getValue(result, "SO_DESCRIPTION");
        objectBpartnerMiscData.isdiscountprinted = UtilSql.getValue(result, "ISDISCOUNTPRINTED");
        objectBpartnerMiscData.invoicerule = UtilSql.getValue(result, "INVOICERULE");
        objectBpartnerMiscData.deliveryrule = UtilSql.getValue(result, "DELIVERYRULE");
        objectBpartnerMiscData.deliveryviarule = UtilSql.getValue(result, "DELIVERYVIARULE");
        objectBpartnerMiscData.creditavailable = UtilSql.getValue(result, "CREDITAVAILABLE");
        objectBpartnerMiscData.poPricelistId = UtilSql.getValue(result, "PO_PRICELIST_ID");
        objectBpartnerMiscData.paymentrulepo = UtilSql.getValue(result, "PAYMENTRULEPO");
        objectBpartnerMiscData.poPaymenttermId = UtilSql.getValue(result, "PO_PAYMENTTERM_ID");
        objectBpartnerMiscData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectBpartnerMiscData.finPaymentmethodId = UtilSql.getValue(result, "FIN_PAYMENTMETHOD_ID");
        objectBpartnerMiscData.poPaymentmethodId = UtilSql.getValue(result, "PO_PAYMENTMETHOD_ID");
        objectBpartnerMiscData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBpartnerMiscData);
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
    BpartnerMiscData objectBpartnerMiscData[] = new BpartnerMiscData[vector.size()];
    vector.copyInto(objectBpartnerMiscData);
    return(objectBpartnerMiscData);
  }

  public static BpartnerMiscData[] selectPaymentTerm(ConnectionProvider connectionProvider, String adOrgId, String adClientId)    throws ServletException {
    return selectPaymentTerm(connectionProvider, adOrgId, adClientId, 0, 0);
  }

  public static BpartnerMiscData[] selectPaymentTerm(ConnectionProvider connectionProvider, String adOrgId, String adClientId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT pt.C_PaymentTerm_ID" +
      "      FROM C_PaymentTerm pt" +
      "      WHERE AD_ISORGINCLUDED(?, pt.ad_org_id, ?) <> -1" +
      "      AND ad_client_id = ?" +
      "      AND isdefault = 'Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

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
        BpartnerMiscData objectBpartnerMiscData = new BpartnerMiscData();
        objectBpartnerMiscData.cPaymenttermId = UtilSql.getValue(result, "C_PAYMENTTERM_ID");
        objectBpartnerMiscData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBpartnerMiscData);
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
    BpartnerMiscData objectBpartnerMiscData[] = new BpartnerMiscData[vector.size()];
    vector.copyInto(objectBpartnerMiscData);
    return(objectBpartnerMiscData);
  }
}
