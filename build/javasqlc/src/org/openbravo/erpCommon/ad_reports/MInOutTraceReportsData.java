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

class MInOutTraceReportsData implements FieldProvider {
static Logger log4j = Logger.getLogger(MInOutTraceReportsData.class);
  private String InitRecordNumber="0";
  public String mProductId;
  public String productName;
  public String mAttributesetinstanceId;
  public String attributeName;
  public String mLocatorId;
  public String locatorName;
  public String html;
  public String id;
  public String movementtype;
  public String movementdate;
  public String movementqty;
  public String mInventorylineId;
  public String mMovementlineId;
  public String mInoutlineId;
  public String mProductionlineId;
  public String cProjectissueId;
  public String mProductUomId;
  public String quantityorder;
  public String cUomId;
  public String movementtypeName;
  public String productUomName;
  public String uomName;
  public String vendorName;
  public String name;
  public String inventoryName;
  public String movementName;
  public String inoutName;
  public String productionName;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("PRODUCT_NAME") || fieldName.equals("productName"))
      return productName;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("ATTRIBUTE_NAME") || fieldName.equals("attributeName"))
      return attributeName;
    else if (fieldName.equalsIgnoreCase("M_LOCATOR_ID") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("LOCATOR_NAME") || fieldName.equals("locatorName"))
      return locatorName;
    else if (fieldName.equalsIgnoreCase("HTML"))
      return html;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("MOVEMENTTYPE"))
      return movementtype;
    else if (fieldName.equalsIgnoreCase("MOVEMENTDATE"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("MOVEMENTQTY"))
      return movementqty;
    else if (fieldName.equalsIgnoreCase("M_INVENTORYLINE_ID") || fieldName.equals("mInventorylineId"))
      return mInventorylineId;
    else if (fieldName.equalsIgnoreCase("M_MOVEMENTLINE_ID") || fieldName.equals("mMovementlineId"))
      return mMovementlineId;
    else if (fieldName.equalsIgnoreCase("M_INOUTLINE_ID") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCTIONLINE_ID") || fieldName.equals("mProductionlineId"))
      return mProductionlineId;
    else if (fieldName.equalsIgnoreCase("C_PROJECTISSUE_ID") || fieldName.equals("cProjectissueId"))
      return cProjectissueId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_UOM_ID") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("QUANTITYORDER"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("MOVEMENTTYPE_NAME") || fieldName.equals("movementtypeName"))
      return movementtypeName;
    else if (fieldName.equalsIgnoreCase("PRODUCT_UOM_NAME") || fieldName.equals("productUomName"))
      return productUomName;
    else if (fieldName.equalsIgnoreCase("UOM_NAME") || fieldName.equals("uomName"))
      return uomName;
    else if (fieldName.equalsIgnoreCase("VENDOR_NAME") || fieldName.equals("vendorName"))
      return vendorName;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("INVENTORY_NAME") || fieldName.equals("inventoryName"))
      return inventoryName;
    else if (fieldName.equalsIgnoreCase("MOVEMENT_NAME") || fieldName.equals("movementName"))
      return movementName;
    else if (fieldName.equalsIgnoreCase("INOUT_NAME") || fieldName.equals("inoutName"))
      return inoutName;
    else if (fieldName.equalsIgnoreCase("PRODUCTION_NAME") || fieldName.equals("productionName"))
      return productionName;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static MInOutTraceReportsData[] select(ConnectionProvider connectionProvider, String adLanguage, String parmProductId, String parmAttributeSetInstanceId, String adUserOrg, String adUserClient)    throws ServletException {
    return select(connectionProvider, adLanguage, parmProductId, parmAttributeSetInstanceId, adUserOrg, adUserClient, 0, 0);
  }

  public static MInOutTraceReportsData[] select(ConnectionProvider connectionProvider, String adLanguage, String parmProductId, String parmAttributeSetInstanceId, String adUserOrg, String adUserClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT DISTINCT t.M_PRODUCT_ID, AD_COLUMN_IDENTIFIER(TO_CHAR('M_Product'), TO_CHAR(T.M_PRODUCT_ID), TO_CHAR(?)) AS product_name, " +
      "          t.M_ATTRIBUTESETINSTANCE_ID, AD_COLUMN_IDENTIFIER(TO_CHAR('M_AttributeSetInstance'), TO_CHAR(T.M_ATTRIBUTESETINSTANCE_ID), TO_CHAR(?)) AS attribute_name, " +
      "          t.M_LOCATOR_ID, AD_COLUMN_IDENTIFIER(TO_CHAR('M_LOCATOR'), TO_CHAR(T.M_LOCATOR_ID), TO_CHAR(?)) as locator_name," +
      "          '' AS html, ''  AS ID, '' AS MOVEMENTTYPE, '' AS MOVEMENTDATE, '' AS MOVEMENTQTY, '' AS M_INVENTORYLINE_ID, '' AS M_MOVEMENTLINE_ID," +
      "          '' AS M_INOUTLINE_ID, '' AS M_PRODUCTIONLINE_ID, '' AS C_PROJECTISSUE_ID, '' AS M_PRODUCT_UOM_ID, '' AS QUANTITYORDER, '' AS C_UOM_ID," +
      "          '' AS MOVEMENTTYPE_NAME, '' AS PRODUCT_UOM_NAME, '' AS UOM_NAME, '' AS VENDOR_NAME, '' AS NAME, '' AS INVENTORY_NAME, '' AS MOVEMENT_NAME," +
      "          '' AS INOUT_NAME, '' AS PRODUCTION_NAME" +
      "      FROM M_TRANSACTION t" +
      "      WHERE 1=1";
    strSql = strSql + ((parmProductId==null || parmProductId.equals(""))?"":" AND T.M_PRODUCT_ID = ? ");
    strSql = strSql + ((parmAttributeSetInstanceId==null || parmAttributeSetInstanceId.equals(""))?"":" AND T.M_ATTRIBUTESETINSTANCE_ID = ? ");
    strSql = strSql + 
      "      AND t.AD_ORG_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")" +
      "      AND t.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      GROUP BY t.M_PRODUCT_ID, t.M_ATTRIBUTESETINSTANCE_ID, t.M_LOCATOR_ID";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (parmProductId != null && !(parmProductId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parmProductId);
      }
      if (parmAttributeSetInstanceId != null && !(parmAttributeSetInstanceId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parmAttributeSetInstanceId);
      }
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
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
        MInOutTraceReportsData objectMInOutTraceReportsData = new MInOutTraceReportsData();
        objectMInOutTraceReportsData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectMInOutTraceReportsData.productName = UtilSql.getValue(result, "PRODUCT_NAME");
        objectMInOutTraceReportsData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectMInOutTraceReportsData.attributeName = UtilSql.getValue(result, "ATTRIBUTE_NAME");
        objectMInOutTraceReportsData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectMInOutTraceReportsData.locatorName = UtilSql.getValue(result, "LOCATOR_NAME");
        objectMInOutTraceReportsData.html = UtilSql.getValue(result, "HTML");
        objectMInOutTraceReportsData.id = UtilSql.getValue(result, "ID");
        objectMInOutTraceReportsData.movementtype = UtilSql.getValue(result, "MOVEMENTTYPE");
        objectMInOutTraceReportsData.movementdate = UtilSql.getValue(result, "MOVEMENTDATE");
        objectMInOutTraceReportsData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectMInOutTraceReportsData.mInventorylineId = UtilSql.getValue(result, "M_INVENTORYLINE_ID");
        objectMInOutTraceReportsData.mMovementlineId = UtilSql.getValue(result, "M_MOVEMENTLINE_ID");
        objectMInOutTraceReportsData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectMInOutTraceReportsData.mProductionlineId = UtilSql.getValue(result, "M_PRODUCTIONLINE_ID");
        objectMInOutTraceReportsData.cProjectissueId = UtilSql.getValue(result, "C_PROJECTISSUE_ID");
        objectMInOutTraceReportsData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectMInOutTraceReportsData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectMInOutTraceReportsData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectMInOutTraceReportsData.movementtypeName = UtilSql.getValue(result, "MOVEMENTTYPE_NAME");
        objectMInOutTraceReportsData.productUomName = UtilSql.getValue(result, "PRODUCT_UOM_NAME");
        objectMInOutTraceReportsData.uomName = UtilSql.getValue(result, "UOM_NAME");
        objectMInOutTraceReportsData.vendorName = UtilSql.getValue(result, "VENDOR_NAME");
        objectMInOutTraceReportsData.name = UtilSql.getValue(result, "NAME");
        objectMInOutTraceReportsData.inventoryName = UtilSql.getValue(result, "INVENTORY_NAME");
        objectMInOutTraceReportsData.movementName = UtilSql.getValue(result, "MOVEMENT_NAME");
        objectMInOutTraceReportsData.inoutName = UtilSql.getValue(result, "INOUT_NAME");
        objectMInOutTraceReportsData.productionName = UtilSql.getValue(result, "PRODUCTION_NAME");
        objectMInOutTraceReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMInOutTraceReportsData);
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
    MInOutTraceReportsData objectMInOutTraceReportsData[] = new MInOutTraceReportsData[vector.size()];
    vector.copyInto(objectMInOutTraceReportsData);
    return(objectMInOutTraceReportsData);
  }

  public static MInOutTraceReportsData[] selectChilds(ConnectionProvider connectionProvider, String adLanguage, String mAttributesetinstanceId, String mProductId, String mLocatorId, String plusQty, String minusQty)    throws ServletException {
    return selectChilds(connectionProvider, adLanguage, mAttributesetinstanceId, mProductId, mLocatorId, plusQty, minusQty, 0, 0);
  }

  public static MInOutTraceReportsData[] selectChilds(ConnectionProvider connectionProvider, String adLanguage, String mAttributesetinstanceId, String mProductId, String mLocatorId, String plusQty, String minusQty, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT T.M_TRANSACTION_ID AS ID, T.MOVEMENTTYPE, T.M_LOCATOR_ID, T.M_PRODUCT_ID, T.MOVEMENTDATE, " +
      "          RTRIM(RTRIM(TO_CHAR(ROUND(T.MOVEMENTQTY,2)),'0'),'.')  AS MOVEMENTQTY, T.M_INVENTORYLINE_ID, T.M_MOVEMENTLINE_ID, T.M_INOUTLINE_ID, T.M_PRODUCTIONLINE_ID, " +
      "          T.C_PROJECTISSUE_ID, T.M_ATTRIBUTESETINSTANCE_ID, T.M_PRODUCT_UOM_ID, ROUND(T.QUANTITYORDER,4) AS QUANTITYORDER, T.C_UOM_ID, " +
      "          L.NAME AS MOVEMENTTYPE_NAME, " +
      "          (CASE WHEN T.M_PRODUCT_UOM_ID IS NOT NULL THEN TO_CHAR(C2.UOMSYMBOL) END) AS PRODUCT_UOM_NAME, " +
      "          C1.UOMSYMBOL AS UOM_NAME, " +
      "          AD_COLUMN_IDENTIFIER(TO_CHAR('M_Product'), TO_CHAR(T.M_PRODUCT_ID), TO_CHAR(?)) AS PRODUCT_NAME," +
      "          AD_COLUMN_IDENTIFIER(TO_CHAR('M_AttributeSetInstance'), TO_CHAR(T.M_ATTRIBUTESETINSTANCE_ID), TO_CHAR(?)) AS ATTRIBUTE_NAME," +
      "          (SELECT NAME FROM C_BPARTNER WHERE C_BPARTNER_ID = M.C_BPARTNER_ID) || ' - ' || M.DOCUMENTNO AS VENDOR_NAME, " +
      "          AD_COLUMN_IDENTIFIER(TO_CHAR('M_LOCATOR'), TO_CHAR(T.M_LOCATOR_ID), TO_CHAR(?)) AS LOCATOR_NAME, '' AS NAME, " +
      "          AD_COLUMN_IDENTIFIER(TO_CHAR('M_InventoryLine'), TO_CHAR(T.M_INVENTORYLINE_ID), TO_CHAR(?)) AS INVENTORY_NAME, " +
      "          AD_COLUMN_IDENTIFIER(TO_CHAR('M_MovementLine'), TO_CHAR(T.M_MOVEMENTLINE_ID), TO_CHAR(?)) AS MOVEMENT_NAME, " +
      "          AD_COLUMN_IDENTIFIER(TO_CHAR('M_InoutLine'), TO_CHAR(T.M_INOUTLINE_ID), TO_CHAR(?)) AS INOUT_NAME, " +
      "          AD_COLUMN_IDENTIFIER(TO_CHAR('M_ProductionLine'), TO_CHAR(T.M_PRODUCTIONLINE_ID), TO_CHAR(?)) AS PRODUCTION_NAME" +
      "      FROM  M_TRANSACTION T  LEFT OUTER JOIN  M_INOUTLINE ML  ON  T.M_INOUTLINE_ID  = ML.M_INOUTLINE_ID   " +
      "		       LEFT OUTER JOIN  M_INOUT M  ON  ML.M_INOUT_ID  = M.M_INOUT_ID   " +
      "            	       LEFT OUTER JOIN  M_PRODUCT_UOM M_P  ON  T.M_PRODUCT_UOM_ID  = M_P.M_PRODUCT_UOM_ID   " +
      "                       LEFT OUTER JOIN  C_UOM C2  ON  M_P.C_UOM_ID  = C2.C_UOM_ID ," +
      "       AD_REF_LIST_V L," +
      "       C_UOM C1 " +
      "    WHERE	 T.MOVEMENTTYPE  = L.VALUE" +
      "     AND	L.AD_REFERENCE_ID  = '189'" +
      "     AND	L.AD_LANGUAGE  = ?" +
      "     AND	T.C_UOM_ID  = C1.C_UOM_ID" +
      "     AND	T.M_ATTRIBUTESETINSTANCE_ID  = ?" +
      "     AND	T.M_PRODUCT_ID  = ?" +
      "     AND	T.M_LOCATOR_ID  = ?" +
      "     AND 1=1";
    strSql = strSql + ((plusQty.equals("plusQty"))?"  AND (T.MOVEMENTTYPE <> 'P+' AND  T.MOVEMENTQTY > 0) ":"");
    strSql = strSql + ((minusQty.equals("minusQty"))?"  AND (T.MOVEMENTTYPE <> 'P+' AND  T.MOVEMENTQTY < 0) ":"");
    strSql = strSql + 
      "    ORDER BY T.MOVEMENTDATE," +
      "       T.CREATED ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      if (plusQty != null && !(plusQty.equals(""))) {
        }
      if (minusQty != null && !(minusQty.equals(""))) {
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
        MInOutTraceReportsData objectMInOutTraceReportsData = new MInOutTraceReportsData();
        objectMInOutTraceReportsData.id = UtilSql.getValue(result, "ID");
        objectMInOutTraceReportsData.movementtype = UtilSql.getValue(result, "MOVEMENTTYPE");
        objectMInOutTraceReportsData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectMInOutTraceReportsData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectMInOutTraceReportsData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectMInOutTraceReportsData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectMInOutTraceReportsData.mInventorylineId = UtilSql.getValue(result, "M_INVENTORYLINE_ID");
        objectMInOutTraceReportsData.mMovementlineId = UtilSql.getValue(result, "M_MOVEMENTLINE_ID");
        objectMInOutTraceReportsData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectMInOutTraceReportsData.mProductionlineId = UtilSql.getValue(result, "M_PRODUCTIONLINE_ID");
        objectMInOutTraceReportsData.cProjectissueId = UtilSql.getValue(result, "C_PROJECTISSUE_ID");
        objectMInOutTraceReportsData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectMInOutTraceReportsData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectMInOutTraceReportsData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectMInOutTraceReportsData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectMInOutTraceReportsData.movementtypeName = UtilSql.getValue(result, "MOVEMENTTYPE_NAME");
        objectMInOutTraceReportsData.productUomName = UtilSql.getValue(result, "PRODUCT_UOM_NAME");
        objectMInOutTraceReportsData.uomName = UtilSql.getValue(result, "UOM_NAME");
        objectMInOutTraceReportsData.productName = UtilSql.getValue(result, "PRODUCT_NAME");
        objectMInOutTraceReportsData.attributeName = UtilSql.getValue(result, "ATTRIBUTE_NAME");
        objectMInOutTraceReportsData.vendorName = UtilSql.getValue(result, "VENDOR_NAME");
        objectMInOutTraceReportsData.locatorName = UtilSql.getValue(result, "LOCATOR_NAME");
        objectMInOutTraceReportsData.name = UtilSql.getValue(result, "NAME");
        objectMInOutTraceReportsData.inventoryName = UtilSql.getValue(result, "INVENTORY_NAME");
        objectMInOutTraceReportsData.movementName = UtilSql.getValue(result, "MOVEMENT_NAME");
        objectMInOutTraceReportsData.inoutName = UtilSql.getValue(result, "INOUT_NAME");
        objectMInOutTraceReportsData.productionName = UtilSql.getValue(result, "PRODUCTION_NAME");
        objectMInOutTraceReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMInOutTraceReportsData);
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
    MInOutTraceReportsData objectMInOutTraceReportsData[] = new MInOutTraceReportsData[vector.size()];
    vector.copyInto(objectMInOutTraceReportsData);
    return(objectMInOutTraceReportsData);
  }

  public static MInOutTraceReportsData[] selectProductionOut(ConnectionProvider connectionProvider, String adLanguage, String mProductionlineId)    throws ServletException {
    return selectProductionOut(connectionProvider, adLanguage, mProductionlineId, 0, 0);
  }

  public static MInOutTraceReportsData[] selectProductionOut(ConnectionProvider connectionProvider, String adLanguage, String mProductionlineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT T.M_TRANSACTION_ID AS ID, T.MOVEMENTTYPE, T.M_LOCATOR_ID, T.M_PRODUCT_ID, T.MOVEMENTDATE, " +
      "      ROUND(T.MOVEMENTQTY,4) AS MOVEMENTQTY, T.M_INVENTORYLINE_ID, T.M_MOVEMENTLINE_ID, T.M_INOUTLINE_ID, T.M_PRODUCTIONLINE_ID, " +
      "      T.C_PROJECTISSUE_ID, T.M_ATTRIBUTESETINSTANCE_ID, T.M_PRODUCT_UOM_ID, ROUND(T.QUANTITYORDER,4) AS QUANTITYORDER, T.C_UOM_ID, " +
      "      L.NAME AS MOVEMENTTYPE_NAME, " +
      "      (CASE WHEN T.M_PRODUCT_UOM_ID IS NOT NULL THEN TO_CHAR(C2.UOMSYMBOL) END) AS PRODUCT_UOM_NAME, " +
      "      C1.UOMSYMBOL AS UOM_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_Product'), TO_CHAR(T.M_PRODUCT_ID), TO_CHAR(?)) AS PRODUCT_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_LOCATOR'), TO_CHAR(T.M_LOCATOR_ID), TO_CHAR(?)) AS LOCATOR_NAME, '' AS NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_InventoryLine'), TO_CHAR(T.M_INVENTORYLINE_ID), TO_CHAR(?)) AS INVENTORY_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_MovementLine'), TO_CHAR(T.M_MOVEMENTLINE_ID), TO_CHAR(?)) AS MOVEMENT_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_InoutLine'), TO_CHAR(T.M_INOUTLINE_ID), TO_CHAR(?)) AS INOUT_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_AttributeSetInstance'), TO_CHAR(T.M_ATTRIBUTESETINSTANCE_ID), TO_CHAR(?)) AS ATTRIBUTE_NAME," +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_ProductionLine'), TO_CHAR(T.M_PRODUCTIONLINE_ID), TO_CHAR(?)) AS PRODUCTION_NAME" +
      "      FROM M_PRODUCT_UOM M_P left join C_UOM C2 on M_P.C_UOM_ID = C2.C_UOM_ID" +
      "                             right join M_TRANSACTION T on M_P.M_PRODUCT_UOM_ID = T.M_PRODUCT_UOM_ID," +
      "      AD_REF_LIST_V L, C_UOM C1 " +
      "      WHERE T.MOVEMENTTYPE = 'P+' " +
      "      AND T.MOVEMENTTYPE = L.VALUE " +
      "      AND L.AD_REFERENCE_ID = '189' " +
      "      AND L.AD_LANGUAGE = ? " +
      "      AND T.C_UOM_ID = C1.C_UOM_ID " +
      "      AND EXISTS (SELECT 1 FROM M_PRODUCTIONLINE " +
      "        WHERE M_PRODUCTIONLINE_ID = T.M_PRODUCTIONLINE_ID " +
      "        AND M_PRODUCTIONPLAN_ID = (" +
      "        SELECT M_PRODUCTIONPLAN_ID FROM M_PRODUCTIONLINE WHERE M_PRODUCTIONLINE_ID = ?)) " +
      "      AND T.MOVEMENTQTY > 0" +
      "      AND T.M_PRODUCTIONLINE_ID <> ?" +
      "      AND T.M_ATTRIBUTESETINSTANCE_ID <> '0'" +
      "      ORDER BY T.MOVEMENTDATE, T.CREATED";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductionlineId);

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
        MInOutTraceReportsData objectMInOutTraceReportsData = new MInOutTraceReportsData();
        objectMInOutTraceReportsData.id = UtilSql.getValue(result, "ID");
        objectMInOutTraceReportsData.movementtype = UtilSql.getValue(result, "MOVEMENTTYPE");
        objectMInOutTraceReportsData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectMInOutTraceReportsData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectMInOutTraceReportsData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectMInOutTraceReportsData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectMInOutTraceReportsData.mInventorylineId = UtilSql.getValue(result, "M_INVENTORYLINE_ID");
        objectMInOutTraceReportsData.mMovementlineId = UtilSql.getValue(result, "M_MOVEMENTLINE_ID");
        objectMInOutTraceReportsData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectMInOutTraceReportsData.mProductionlineId = UtilSql.getValue(result, "M_PRODUCTIONLINE_ID");
        objectMInOutTraceReportsData.cProjectissueId = UtilSql.getValue(result, "C_PROJECTISSUE_ID");
        objectMInOutTraceReportsData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectMInOutTraceReportsData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectMInOutTraceReportsData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectMInOutTraceReportsData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectMInOutTraceReportsData.movementtypeName = UtilSql.getValue(result, "MOVEMENTTYPE_NAME");
        objectMInOutTraceReportsData.productUomName = UtilSql.getValue(result, "PRODUCT_UOM_NAME");
        objectMInOutTraceReportsData.uomName = UtilSql.getValue(result, "UOM_NAME");
        objectMInOutTraceReportsData.productName = UtilSql.getValue(result, "PRODUCT_NAME");
        objectMInOutTraceReportsData.locatorName = UtilSql.getValue(result, "LOCATOR_NAME");
        objectMInOutTraceReportsData.name = UtilSql.getValue(result, "NAME");
        objectMInOutTraceReportsData.inventoryName = UtilSql.getValue(result, "INVENTORY_NAME");
        objectMInOutTraceReportsData.movementName = UtilSql.getValue(result, "MOVEMENT_NAME");
        objectMInOutTraceReportsData.inoutName = UtilSql.getValue(result, "INOUT_NAME");
        objectMInOutTraceReportsData.attributeName = UtilSql.getValue(result, "ATTRIBUTE_NAME");
        objectMInOutTraceReportsData.productionName = UtilSql.getValue(result, "PRODUCTION_NAME");
        objectMInOutTraceReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMInOutTraceReportsData);
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
    MInOutTraceReportsData objectMInOutTraceReportsData[] = new MInOutTraceReportsData[vector.size()];
    vector.copyInto(objectMInOutTraceReportsData);
    return(objectMInOutTraceReportsData);
  }

  public static MInOutTraceReportsData[] selectProductionIn(ConnectionProvider connectionProvider, String adLanguage, String mProductionlineId)    throws ServletException {
    return selectProductionIn(connectionProvider, adLanguage, mProductionlineId, 0, 0);
  }

  public static MInOutTraceReportsData[] selectProductionIn(ConnectionProvider connectionProvider, String adLanguage, String mProductionlineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT T.M_TRANSACTION_ID AS ID, T.MOVEMENTTYPE, T.M_LOCATOR_ID, T.M_PRODUCT_ID, T.MOVEMENTDATE, " +
      "      ROUND(T.MOVEMENTQTY,4) AS MOVEMENTQTY, T.M_INVENTORYLINE_ID, T.M_MOVEMENTLINE_ID, T.M_INOUTLINE_ID, T.M_PRODUCTIONLINE_ID, " +
      "      T.C_PROJECTISSUE_ID, T.M_ATTRIBUTESETINSTANCE_ID, T.M_PRODUCT_UOM_ID, ROUND(T.QUANTITYORDER,4) AS QUANTITYORDER, T.C_UOM_ID, " +
      "      L.NAME AS MOVEMENTTYPE_NAME, " +
      "      (CASE WHEN T.M_PRODUCT_UOM_ID IS NOT NULL THEN TO_CHAR(C2.UOMSYMBOL) END) AS PRODUCT_UOM_NAME, " +
      "      C1.UOMSYMBOL AS UOM_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_Product'), TO_CHAR(T.M_PRODUCT_ID), TO_CHAR(?)) AS PRODUCT_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_LOCATOR'), TO_CHAR(T.M_LOCATOR_ID), TO_CHAR(?)) AS LOCATOR_NAME, '' AS NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_InventoryLine'), TO_CHAR(T.M_INVENTORYLINE_ID), TO_CHAR(?)) AS INVENTORY_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_MovementLine'), TO_CHAR(T.M_MOVEMENTLINE_ID), TO_CHAR(?)) AS MOVEMENT_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_InoutLine'), TO_CHAR(T.M_INOUTLINE_ID), TO_CHAR(?)) AS INOUT_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_AttributeSetInstance'), TO_CHAR(T.M_ATTRIBUTESETINSTANCE_ID), TO_CHAR(?)) AS ATTRIBUTE_NAME," +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_ProductionLine'), TO_CHAR(T.M_PRODUCTIONLINE_ID), TO_CHAR(?)) AS PRODUCTION_NAME" +
      "      FROM  M_PRODUCT_UOM M_P left join  C_UOM C2 on M_P.C_UOM_ID = C2.C_UOM_ID" +
      "                              right join M_TRANSACTION T on M_P.M_PRODUCT_UOM_ID = T.M_PRODUCT_UOM_ID ," +
      "      AD_REF_LIST_V L, C_UOM C1" +
      "      WHERE T.MOVEMENTTYPE = 'P+' " +
      "      AND T.MOVEMENTTYPE = L.VALUE " +
      "      AND L.AD_REFERENCE_ID = '189' " +
      "      AND L.AD_LANGUAGE = ? " +
      "      AND T.C_UOM_ID = C1.C_UOM_ID " +
      "      AND EXISTS (SELECT 1 FROM M_PRODUCTIONLINE " +
      "        WHERE M_PRODUCTIONLINE_ID = T.M_PRODUCTIONLINE_ID " +
      "        AND M_PRODUCTIONPLAN_ID = (" +
      "        SELECT M_PRODUCTIONPLAN_ID FROM M_PRODUCTIONLINE WHERE M_PRODUCTIONLINE_ID = ?)) " +
      "      AND T.MOVEMENTQTY < 0" +
      "      AND T.M_PRODUCTIONLINE_ID <> ?" +
      "      AND T.M_ATTRIBUTESETINSTANCE_ID <> '0'" +
      "      ORDER BY T.MOVEMENTDATE, T.CREATED";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductionlineId);

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
        MInOutTraceReportsData objectMInOutTraceReportsData = new MInOutTraceReportsData();
        objectMInOutTraceReportsData.id = UtilSql.getValue(result, "ID");
        objectMInOutTraceReportsData.movementtype = UtilSql.getValue(result, "MOVEMENTTYPE");
        objectMInOutTraceReportsData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectMInOutTraceReportsData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectMInOutTraceReportsData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectMInOutTraceReportsData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectMInOutTraceReportsData.mInventorylineId = UtilSql.getValue(result, "M_INVENTORYLINE_ID");
        objectMInOutTraceReportsData.mMovementlineId = UtilSql.getValue(result, "M_MOVEMENTLINE_ID");
        objectMInOutTraceReportsData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectMInOutTraceReportsData.mProductionlineId = UtilSql.getValue(result, "M_PRODUCTIONLINE_ID");
        objectMInOutTraceReportsData.cProjectissueId = UtilSql.getValue(result, "C_PROJECTISSUE_ID");
        objectMInOutTraceReportsData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectMInOutTraceReportsData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectMInOutTraceReportsData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectMInOutTraceReportsData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectMInOutTraceReportsData.movementtypeName = UtilSql.getValue(result, "MOVEMENTTYPE_NAME");
        objectMInOutTraceReportsData.productUomName = UtilSql.getValue(result, "PRODUCT_UOM_NAME");
        objectMInOutTraceReportsData.uomName = UtilSql.getValue(result, "UOM_NAME");
        objectMInOutTraceReportsData.productName = UtilSql.getValue(result, "PRODUCT_NAME");
        objectMInOutTraceReportsData.locatorName = UtilSql.getValue(result, "LOCATOR_NAME");
        objectMInOutTraceReportsData.name = UtilSql.getValue(result, "NAME");
        objectMInOutTraceReportsData.inventoryName = UtilSql.getValue(result, "INVENTORY_NAME");
        objectMInOutTraceReportsData.movementName = UtilSql.getValue(result, "MOVEMENT_NAME");
        objectMInOutTraceReportsData.inoutName = UtilSql.getValue(result, "INOUT_NAME");
        objectMInOutTraceReportsData.attributeName = UtilSql.getValue(result, "ATTRIBUTE_NAME");
        objectMInOutTraceReportsData.productionName = UtilSql.getValue(result, "PRODUCTION_NAME");
        objectMInOutTraceReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMInOutTraceReportsData);
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
    MInOutTraceReportsData objectMInOutTraceReportsData[] = new MInOutTraceReportsData[vector.size()];
    vector.copyInto(objectMInOutTraceReportsData);
    return(objectMInOutTraceReportsData);
  }

  public static MInOutTraceReportsData[] selectMovement(ConnectionProvider connectionProvider, String adLanguage, String movementtype, String mMovementlineId)    throws ServletException {
    return selectMovement(connectionProvider, adLanguage, movementtype, mMovementlineId, 0, 0);
  }

  public static MInOutTraceReportsData[] selectMovement(ConnectionProvider connectionProvider, String adLanguage, String movementtype, String mMovementlineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT T.M_TRANSACTION_ID AS ID, T.MOVEMENTTYPE, T.M_LOCATOR_ID, T.M_PRODUCT_ID, T.MOVEMENTDATE, " +
      "      ROUND(T.MOVEMENTQTY,4) AS MOVEMENTQTY, T.M_INVENTORYLINE_ID, T.M_MOVEMENTLINE_ID, T.M_INOUTLINE_ID, T.M_PRODUCTIONLINE_ID, " +
      "      T.C_PROJECTISSUE_ID, T.M_ATTRIBUTESETINSTANCE_ID, T.M_PRODUCT_UOM_ID, ROUND(T.QUANTITYORDER,4) AS QUANTITYORDER, T.C_UOM_ID, " +
      "      L.NAME AS MOVEMENTTYPE_NAME, " +
      "      (CASE WHEN T.M_PRODUCT_UOM_ID IS NOT NULL THEN TO_CHAR(C2.UOMSYMBOL) END) AS PRODUCT_UOM_NAME, " +
      "      C1.UOMSYMBOL AS UOM_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_Product'), TO_CHAR(T.M_PRODUCT_ID), TO_CHAR(?)) AS PRODUCT_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_LOCATOR'), TO_CHAR(T.M_LOCATOR_ID), TO_CHAR(?)) AS LOCATOR_NAME, '' AS NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_InventoryLine'), TO_CHAR(T.M_INVENTORYLINE_ID), TO_CHAR(?)) AS INVENTORY_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_MovementLine'), TO_CHAR(T.M_MOVEMENTLINE_ID), TO_CHAR(?)) AS MOVEMENT_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_InoutLine'), TO_CHAR(T.M_INOUTLINE_ID), TO_CHAR(?)) AS INOUT_NAME, " +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_AttributeSetInstance'), TO_CHAR(T.M_ATTRIBUTESETINSTANCE_ID), TO_CHAR(?)) AS ATTRIBUTE_NAME," +
      "      AD_COLUMN_IDENTIFIER(TO_CHAR('M_ProductionLine'), TO_CHAR(T.M_PRODUCTIONLINE_ID), TO_CHAR(?)) AS PRODUCTION_NAME" +
      "      FROM M_PRODUCT_UOM M_P left join C_UOM C2 on  M_P.C_UOM_ID = C2.C_UOM_ID " +
      "                             right join M_TRANSACTION T on  M_P.M_PRODUCT_UOM_ID = T.M_PRODUCT_UOM_ID," +
      "      AD_REF_LIST_V L, C_UOM C1 " +
      "      WHERE T.MOVEMENTTYPE = ?" +
      "      AND T.MOVEMENTTYPE = L.VALUE " +
      "      AND L.AD_REFERENCE_ID = '189' " +
      "      AND L.AD_LANGUAGE = ? " +
      "      AND T.C_UOM_ID = C1.C_UOM_ID " +
      "      AND T.M_MOVEMENTLINE_ID = ?" +
      "      AND T.M_ATTRIBUTESETINSTANCE_ID <> '0'" +
      "      ORDER BY T.MOVEMENTDATE, T.CREATED";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mMovementlineId);

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
        MInOutTraceReportsData objectMInOutTraceReportsData = new MInOutTraceReportsData();
        objectMInOutTraceReportsData.id = UtilSql.getValue(result, "ID");
        objectMInOutTraceReportsData.movementtype = UtilSql.getValue(result, "MOVEMENTTYPE");
        objectMInOutTraceReportsData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectMInOutTraceReportsData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectMInOutTraceReportsData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectMInOutTraceReportsData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectMInOutTraceReportsData.mInventorylineId = UtilSql.getValue(result, "M_INVENTORYLINE_ID");
        objectMInOutTraceReportsData.mMovementlineId = UtilSql.getValue(result, "M_MOVEMENTLINE_ID");
        objectMInOutTraceReportsData.mInoutlineId = UtilSql.getValue(result, "M_INOUTLINE_ID");
        objectMInOutTraceReportsData.mProductionlineId = UtilSql.getValue(result, "M_PRODUCTIONLINE_ID");
        objectMInOutTraceReportsData.cProjectissueId = UtilSql.getValue(result, "C_PROJECTISSUE_ID");
        objectMInOutTraceReportsData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectMInOutTraceReportsData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectMInOutTraceReportsData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectMInOutTraceReportsData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectMInOutTraceReportsData.movementtypeName = UtilSql.getValue(result, "MOVEMENTTYPE_NAME");
        objectMInOutTraceReportsData.productUomName = UtilSql.getValue(result, "PRODUCT_UOM_NAME");
        objectMInOutTraceReportsData.uomName = UtilSql.getValue(result, "UOM_NAME");
        objectMInOutTraceReportsData.productName = UtilSql.getValue(result, "PRODUCT_NAME");
        objectMInOutTraceReportsData.locatorName = UtilSql.getValue(result, "LOCATOR_NAME");
        objectMInOutTraceReportsData.name = UtilSql.getValue(result, "NAME");
        objectMInOutTraceReportsData.inventoryName = UtilSql.getValue(result, "INVENTORY_NAME");
        objectMInOutTraceReportsData.movementName = UtilSql.getValue(result, "MOVEMENT_NAME");
        objectMInOutTraceReportsData.inoutName = UtilSql.getValue(result, "INOUT_NAME");
        objectMInOutTraceReportsData.attributeName = UtilSql.getValue(result, "ATTRIBUTE_NAME");
        objectMInOutTraceReportsData.productionName = UtilSql.getValue(result, "PRODUCTION_NAME");
        objectMInOutTraceReportsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMInOutTraceReportsData);
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
    MInOutTraceReportsData objectMInOutTraceReportsData[] = new MInOutTraceReportsData[vector.size()];
    vector.copyInto(objectMInOutTraceReportsData);
    return(objectMInOutTraceReportsData);
  }

  public static String selectMproduct(ConnectionProvider connectionProvider, String mProductId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_PRODUCT.NAME" +
      "      FROM M_PRODUCT" +
      "      WHERE M_PRODUCT.M_PRODUCT_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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
