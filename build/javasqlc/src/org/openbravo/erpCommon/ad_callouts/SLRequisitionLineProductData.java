//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class SLRequisitionLineProductData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLRequisitionLineProductData.class);
  private String InitRecordNumber="0";
  public String pricelistVersion;
  public String pricelist;
  public String pricelimit;
  public String pricestd;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PRICELIST_VERSION") || fieldName.equals("pricelistVersion"))
      return pricelistVersion;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("PRICELIMIT"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("PRICESTD"))
      return pricestd;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLRequisitionLineProductData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static SLRequisitionLineProductData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT '' AS pricelist_version, '' AS pricelist, '' AS pricelimit, '' AS pricestd  FROM DUAL";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        SLRequisitionLineProductData objectSLRequisitionLineProductData = new SLRequisitionLineProductData();
        objectSLRequisitionLineProductData.pricelistVersion = UtilSql.getValue(result, "PRICELIST_VERSION");
        objectSLRequisitionLineProductData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectSLRequisitionLineProductData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectSLRequisitionLineProductData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectSLRequisitionLineProductData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLRequisitionLineProductData);
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
    SLRequisitionLineProductData objectSLRequisitionLineProductData[] = new SLRequisitionLineProductData[vector.size()];
    vector.copyInto(objectSLRequisitionLineProductData);
    return(objectSLRequisitionLineProductData);
  }

  public static String selectPriceList(ConnectionProvider connectionProvider, String mRequisitionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_Requisition.M_Pricelist_ID as pricelist_version" +
      "      FROM M_Requisition" +
      "      WHERE M_Requisition.M_Requisition_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "PRICELIST_VERSION");
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

  public static String selectPriceListVersion(ConnectionProvider connectionProvider, String mPriceListId, String duedate)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_GET_PRICELIST_VERSION(?, to_date(?)) as pricelist_version" +
      "      FROM DUAL";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPriceListId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, duedate);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "PRICELIST_VERSION");
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

  public static SLRequisitionLineProductData[] getPrices(ConnectionProvider connectionProvider, String mProductId, String mPriceListVersionId)    throws ServletException {
    return getPrices(connectionProvider, mProductId, mPriceListVersionId, 0, 0);
  }

  public static SLRequisitionLineProductData[] getPrices(ConnectionProvider connectionProvider, String mProductId, String mPriceListVersionId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_BOM_PRICELIMIT(?, ?) AS pricelimit," +
      "             M_BOM_PRICELIST(?, ?) AS pricelist," +
      "             M_BOM_PRICESTD(?, ?) AS pricestd" +
      "      FROM DUAL";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPriceListVersionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPriceListVersionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPriceListVersionId);

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
        SLRequisitionLineProductData objectSLRequisitionLineProductData = new SLRequisitionLineProductData();
        objectSLRequisitionLineProductData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectSLRequisitionLineProductData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectSLRequisitionLineProductData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectSLRequisitionLineProductData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLRequisitionLineProductData);
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
    SLRequisitionLineProductData objectSLRequisitionLineProductData[] = new SLRequisitionLineProductData[vector.size()];
    vector.copyInto(objectSLRequisitionLineProductData);
    return(objectSLRequisitionLineProductData);
  }

  public static String hasSecondaryUOM(ConnectionProvider connectionProvider, String mProductId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT (CASE COUNT(*) WHEN 0 THEN 0 ELSE 1 END) AS TOTAL " +
      "      FROM M_PRODUCT_UOM " +
      "      WHERE M_PRODUCT_ID = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TOTAL");
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

  public static String attribute(ConnectionProvider connectionProvider, String mAttributesetinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT description " +
      "      FROM M_AttributeSetInstance " +
      "      WHERE M_AttributeSetInstance_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "DESCRIPTION");
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