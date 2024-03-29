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

class ReportPricelistData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportPricelistData.class);
  private String InitRecordNumber="0";
  public String mPricelistVersionId;
  public String versionName;
  public String mProductCategoryId;
  public String categoryName;
  public String mProductId;
  public String productName;
  public String pricelimit;
  public String pricelist;
  public String pricestd;
  public String name;
  public String id;
  public String valid;
  public String uomname;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("M_PRICELIST_VERSION_ID") || fieldName.equals("mPricelistVersionId"))
      return mPricelistVersionId;
    else if (fieldName.equalsIgnoreCase("VERSION_NAME") || fieldName.equals("versionName"))
      return versionName;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_CATEGORY_ID") || fieldName.equals("mProductCategoryId"))
      return mProductCategoryId;
    else if (fieldName.equalsIgnoreCase("CATEGORY_NAME") || fieldName.equals("categoryName"))
      return categoryName;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("PRODUCT_NAME") || fieldName.equals("productName"))
      return productName;
    else if (fieldName.equalsIgnoreCase("PRICELIMIT"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("PRICESTD"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("VALID"))
      return valid;
    else if (fieldName.equalsIgnoreCase("UOMNAME"))
      return uomname;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportPricelistData[] selectTrl(ConnectionProvider connectionProvider, String validFromTrl, String adUserClient, String adOrgClient, String mPricelistVersionId, String mProductCategoryId, String mProduct)    throws ServletException {
    return selectTrl(connectionProvider, validFromTrl, adUserClient, adOrgClient, mPricelistVersionId, mProductCategoryId, mProduct, 0, 0);
  }

  public static ReportPricelistData[] selectTrl(ConnectionProvider connectionProvider, String validFromTrl, String adUserClient, String adOrgClient, String mPricelistVersionId, String mProductCategoryId, String mProduct, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID, M_PRICELIST_VERSION.NAME||'   '||?||'  '|| M_PRICELIST_VERSION.VALIDFROM AS VERSION_NAME," +
      "      M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID, M_PRODUCT_CATEGORY.NAME AS CATEGORY_NAME," +
      "      M_PRODUCT.M_PRODUCT_ID, (CASE WHEN M_PRODUCT.VALUE IS NULL THEN M_PRODUCT.NAME ELSE M_PRODUCT.VALUE||' - '||M_PRODUCT.NAME END) AS PRODUCT_NAME, M_PRODUCTPRICE.PRICELIMIT, M_PRODUCTPRICE.PRICELIST, M_PRODUCTPRICE.PRICESTD, '' as name, '' as id, '' AS VALID, '' AS UOMNAME" +
      "      FROM M_PRICELIST_VERSION, M_PRODUCTPRICE, M_PRODUCT, M_PRODUCT_CATEGORY" +
      "      WHERE M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID = M_PRODUCTPRICE.M_PRICELIST_VERSION_ID" +
      "      AND M_PRODUCTPRICE.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "      AND M_PRODUCT.M_PRODUCT_CATEGORY_ID = M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID" +
      "      AND M_PRICELIST_VERSION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND M_PRICELIST_VERSION.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((mPricelistVersionId==null || mPricelistVersionId.equals(""))?"":"  AND M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID = ? ");
    strSql = strSql + ((mProductCategoryId==null || mProductCategoryId.equals(""))?"":" AND M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID = ? ");
    strSql = strSql + ((mProduct==null || mProduct.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_ID IN" + mProduct);
    strSql = strSql + 
      "      ORDER BY VERSION_NAME, CATEGORY_NAME, M_PRODUCT.NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, validFromTrl);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (mPricelistVersionId != null && !(mPricelistVersionId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistVersionId);
      }
      if (mProductCategoryId != null && !(mProductCategoryId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      }
      if (mProduct != null && !(mProduct.equals(""))) {
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
        ReportPricelistData objectReportPricelistData = new ReportPricelistData();
        objectReportPricelistData.mPricelistVersionId = UtilSql.getValue(result, "M_PRICELIST_VERSION_ID");
        objectReportPricelistData.versionName = UtilSql.getValue(result, "VERSION_NAME");
        objectReportPricelistData.mProductCategoryId = UtilSql.getValue(result, "M_PRODUCT_CATEGORY_ID");
        objectReportPricelistData.categoryName = UtilSql.getValue(result, "CATEGORY_NAME");
        objectReportPricelistData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectReportPricelistData.productName = UtilSql.getValue(result, "PRODUCT_NAME");
        objectReportPricelistData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectReportPricelistData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectReportPricelistData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectReportPricelistData.name = UtilSql.getValue(result, "NAME");
        objectReportPricelistData.id = UtilSql.getValue(result, "ID");
        objectReportPricelistData.valid = UtilSql.getValue(result, "VALID");
        objectReportPricelistData.uomname = UtilSql.getValue(result, "UOMNAME");
        objectReportPricelistData.rownum = Long.toString(countRecord);
        objectReportPricelistData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportPricelistData);
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
    ReportPricelistData objectReportPricelistData[] = new ReportPricelistData[vector.size()];
    vector.copyInto(objectReportPricelistData);
    return(objectReportPricelistData);
  }

  public static ReportPricelistData[] set()    throws ServletException {
    ReportPricelistData objectReportPricelistData[] = new ReportPricelistData[1];
    objectReportPricelistData[0] = new ReportPricelistData();
    objectReportPricelistData[0].mPricelistVersionId = "";
    objectReportPricelistData[0].versionName = "";
    objectReportPricelistData[0].mProductCategoryId = "";
    objectReportPricelistData[0].categoryName = "";
    objectReportPricelistData[0].mProductId = "";
    objectReportPricelistData[0].productName = "";
    objectReportPricelistData[0].pricelimit = "";
    objectReportPricelistData[0].pricelist = "";
    objectReportPricelistData[0].pricestd = "";
    objectReportPricelistData[0].name = "";
    objectReportPricelistData[0].id = "";
    objectReportPricelistData[0].valid = "";
    objectReportPricelistData[0].uomname = "";
    return objectReportPricelistData;
  }

  public static ReportPricelistData[] selectPDFTrl(ConnectionProvider connectionProvider, String validFromTrl, String adUserClient, String adOrgClient, String mPricelistVersionId, String mProductCategoryId, String mProduct)    throws ServletException {
    return selectPDFTrl(connectionProvider, validFromTrl, adUserClient, adOrgClient, mPricelistVersionId, mProductCategoryId, mProduct, 0, 0);
  }

  public static ReportPricelistData[] selectPDFTrl(ConnectionProvider connectionProvider, String validFromTrl, String adUserClient, String adOrgClient, String mPricelistVersionId, String mProductCategoryId, String mProduct, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_PRICELIST_VERSION.NAME||'   '||?||'  '|| M_PRICELIST_VERSION.VALIDFROM AS VERSION_NAME, M_PRODUCT_CATEGORY.NAME AS CATEGORY_NAME," +
      "      (CASE WHEN M_PRODUCT.VALUE IS NULL THEN M_PRODUCT.NAME ELSE M_PRODUCT.VALUE||' - '||M_PRODUCT.NAME END) AS PRODUCT_NAME, M_PRODUCTPRICE.PRICESTD, C_UOM.NAME AS UOMNAME, (CASE WHEN M_PRICELIST_VERSION.VALIDFROM IS NOT NULL THEN '('||?||' '||M_PRICELIST_VERSION.VALIDFROM||')' END) AS VALID" +
      "      FROM M_PRODUCT left join C_UOM on M_PRODUCT.C_UOM_ID = C_UOM.C_UOM_ID," +
      "      M_PRICELIST_VERSION inner join M_PRICELIST ON M_PRICELIST_VERSION.M_PRICELIST_ID = M_PRICELIST.M_PRICELIST_ID," +
      "      M_PRODUCTPRICE, M_PRODUCT_CATEGORY" +
      "      WHERE M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID = M_PRODUCTPRICE.M_PRICELIST_VERSION_ID" +
      "      AND M_PRODUCTPRICE.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "      AND M_PRODUCT.M_PRODUCT_CATEGORY_ID = M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID" +
      "      AND M_PRICELIST_VERSION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND M_PRICELIST_VERSION.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((mPricelistVersionId==null || mPricelistVersionId.equals(""))?"":"  AND M_PRICELIST_VERSION.M_PRICELIST_VERSION_ID = ? ");
    strSql = strSql + ((mProductCategoryId==null || mProductCategoryId.equals(""))?"":" AND M_PRODUCT_CATEGORY.M_PRODUCT_CATEGORY_ID = ? ");
    strSql = strSql + ((mProduct==null || mProduct.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_ID IN" + mProduct);
    strSql = strSql + 
      "      ORDER BY VERSION_NAME, CATEGORY_NAME, M_PRODUCT.NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, validFromTrl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, validFromTrl);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (mPricelistVersionId != null && !(mPricelistVersionId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistVersionId);
      }
      if (mProductCategoryId != null && !(mProductCategoryId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      }
      if (mProduct != null && !(mProduct.equals(""))) {
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
        ReportPricelistData objectReportPricelistData = new ReportPricelistData();
        objectReportPricelistData.versionName = UtilSql.getValue(result, "VERSION_NAME");
        objectReportPricelistData.categoryName = UtilSql.getValue(result, "CATEGORY_NAME");
        objectReportPricelistData.productName = UtilSql.getValue(result, "PRODUCT_NAME");
        objectReportPricelistData.pricestd = UtilSql.getValue(result, "PRICESTD");
        objectReportPricelistData.uomname = UtilSql.getValue(result, "UOMNAME");
        objectReportPricelistData.valid = UtilSql.getValue(result, "VALID");
        objectReportPricelistData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportPricelistData);
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
    ReportPricelistData objectReportPricelistData[] = new ReportPricelistData[vector.size()];
    vector.copyInto(objectReportPricelistData);
    return(objectReportPricelistData);
  }
}
