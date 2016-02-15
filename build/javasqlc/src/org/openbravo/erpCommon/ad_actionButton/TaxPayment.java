//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_actionButton;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class TaxPayment implements FieldProvider {
static Logger log4j = Logger.getLogger(TaxPayment.class);
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String cTaxpaymentId;
  public String name;
  public String datefrom;
  public String dateto;
  public String generatepayment;
  public String processing;
  public String processed;
  public String cSettlementId;
  public String glJournalId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("C_TAXPAYMENT_ID") || fieldName.equals("cTaxpaymentId"))
      return cTaxpaymentId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DATEFROM"))
      return datefrom;
    else if (fieldName.equalsIgnoreCase("DATETO"))
      return dateto;
    else if (fieldName.equalsIgnoreCase("GENERATEPAYMENT"))
      return generatepayment;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("C_SETTLEMENT_ID") || fieldName.equals("cSettlementId"))
      return cSettlementId;
    else if (fieldName.equalsIgnoreCase("GL_JOURNAL_ID") || fieldName.equals("glJournalId"))
      return glJournalId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Tax Payment for a period
 */
  public static TaxPayment[] select(ConnectionProvider connectionProvider, String parTaxPaymId)    throws ServletException {
    return select(connectionProvider, parTaxPaymId, 0, 0);
  }

/**
Tax Payment for a period
 */
  public static TaxPayment[] select(ConnectionProvider connectionProvider, String parTaxPaymId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_Client_ID, AD_Org_ID, C_TaxPayment_ID, Name, DateFrom, DateTo, GeneratePayment, Processing, Processed, C_Settlement_ID,GL_Journal_ID" +
      "		FROM C_TAXPAYMENT" +
      "		WHERE 1=1";
    strSql = strSql + ((parTaxPaymId==null || parTaxPaymId.equals(""))?"":"  and c_taxpayment_id in ( ? )   ");

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (parTaxPaymId != null && !(parTaxPaymId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parTaxPaymId);
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
        TaxPayment objectTaxPayment = new TaxPayment();
        objectTaxPayment.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectTaxPayment.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectTaxPayment.cTaxpaymentId = UtilSql.getValue(result, "C_TAXPAYMENT_ID");
        objectTaxPayment.name = UtilSql.getValue(result, "NAME");
        objectTaxPayment.datefrom = UtilSql.getDateValue(result, "DATEFROM", "dd-MM-yyyy");
        objectTaxPayment.dateto = UtilSql.getDateValue(result, "DATETO", "dd-MM-yyyy");
        objectTaxPayment.generatepayment = UtilSql.getValue(result, "GENERATEPAYMENT");
        objectTaxPayment.processing = UtilSql.getValue(result, "PROCESSING");
        objectTaxPayment.processed = UtilSql.getValue(result, "PROCESSED");
        objectTaxPayment.cSettlementId = UtilSql.getValue(result, "C_SETTLEMENT_ID");
        objectTaxPayment.glJournalId = UtilSql.getValue(result, "GL_JOURNAL_ID");
        objectTaxPayment.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTaxPayment);
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
    TaxPayment objectTaxPayment[] = new TaxPayment[vector.size()];
    vector.copyInto(objectTaxPayment);
    return(objectTaxPayment);
  }

/**
delete All Tax Register Lines Child
 */
  public static int updateGeneratePayment(ConnectionProvider connectionProvider, String GeneratePayment, String updateby, String taxpayment_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "  		UPDATE C_TAXPAYMENT " +
      "  		SET GeneratePayment = ? , UPDATED=now() , UPDATEDBY = ? " +
      "  		WHERE C_TaxPayment_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, "N", GeneratePayment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updateby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxpayment_id);

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
delete Tax Register
 */
  public static int deleteRegisterChild(ConnectionProvider connectionProvider, String taxpayment_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "  		DELETE FROM C_TAXREGISTER" +
      "  		WHERE C_TaxPayment_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxpayment_id);

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
delete All Tax Register Lines Child
 */
  public static int deleteRegisterLinesChild(ConnectionProvider connectionProvider, String taxpayment_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "  		DELETE FROM C_TAXREGISTERLINE " +
      "  		WHERE C_TaxRegister_ID in " +
      "  			( SELECT C_TaxRegister_ID " +
      "  				FROM C_TAXREGISTER " +
      "  				WHERE C_TaxPayment_ID = ? ) ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxpayment_id);

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

  public static String selectCrossPeriodCount(ConnectionProvider connectionProvider, String adClientId, String adUserOrg, String DateFrom, String DateTo)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     SELECT COUNT(*) FROM C_TAXPAYMENT WHERE PROCESSED='Y' " +
      "     AND AD_CLIENT_ID = ?" +
      "     AND AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "     AND ((DATEFROM <= TO_DATE(?) AND DATETO >=TO_DATE(?)" +
      "     OR DATEFROM <= TO_DATE(?) AND DATETO >=TO_DATE(?))" +
      "     OR " +
      "     (DATEFROM >= TO_DATE(?) AND DATETO <=TO_DATE(?)" +
      "     ))";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateFrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateFrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateTo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateTo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateFrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateTo);

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
Update Tax Register Totals
 */
  public static String calculateVatPayment(ConnectionProvider connectionProvider, String taxpayment_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "  	   select sum(case when  c_taxregister.C_TAXREGISTER_TYPE_ID in " +
      "        (select C_TAXREGISTER_TYPE_ID from c_taxregister_type where c_taxregister_type.ISSOTRX='Y')" +
      "        then coalesce(taxtotalamt,0) - coalesce(lastregaccumamt,0)" +
      "        else coalesce(lastregaccumamt,0) - coalesce(taxtotalamt,0) end ) as VatPayment" +
      "        from c_taxregister where c_taxregister.C_TAXPAYMENT_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxpayment_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "VATPAYMENT");
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