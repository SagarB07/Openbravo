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

class ReportProductMovementData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportProductMovementData.class);
  private String InitRecordNumber="0";
  public String value;
  public String name;
  public String movementdate;
  public String partnername;
  public String attr;
  public String waOrigin;
  public String xOrigin;
  public String yOrigin;
  public String zOrigin;
  public String waDestiny;
  public String xDestiny;
  public String yDestiny;
  public String zDestiny;
  public String out;
  public String movementqty;
  public String issotrx;
  public String mInoutId;
  public String documentno;
  public String mMovementlineId;
  public String movement;
  public String movementDescription;
  public String mInventoryId;
  public String mMovementId;
  public String mProductionplanId;
  public String productionPlan;
  public String mInternalConsumptionId;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("MOVEMENTDATE"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("PARTNERNAME"))
      return partnername;
    else if (fieldName.equalsIgnoreCase("ATTR"))
      return attr;
    else if (fieldName.equalsIgnoreCase("WA_ORIGIN") || fieldName.equals("waOrigin"))
      return waOrigin;
    else if (fieldName.equalsIgnoreCase("X_ORIGIN") || fieldName.equals("xOrigin"))
      return xOrigin;
    else if (fieldName.equalsIgnoreCase("Y_ORIGIN") || fieldName.equals("yOrigin"))
      return yOrigin;
    else if (fieldName.equalsIgnoreCase("Z_ORIGIN") || fieldName.equals("zOrigin"))
      return zOrigin;
    else if (fieldName.equalsIgnoreCase("WA_DESTINY") || fieldName.equals("waDestiny"))
      return waDestiny;
    else if (fieldName.equalsIgnoreCase("X_DESTINY") || fieldName.equals("xDestiny"))
      return xDestiny;
    else if (fieldName.equalsIgnoreCase("Y_DESTINY") || fieldName.equals("yDestiny"))
      return yDestiny;
    else if (fieldName.equalsIgnoreCase("Z_DESTINY") || fieldName.equals("zDestiny"))
      return zDestiny;
    else if (fieldName.equalsIgnoreCase("OUT"))
      return out;
    else if (fieldName.equalsIgnoreCase("MOVEMENTQTY"))
      return movementqty;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("M_INOUT_ID") || fieldName.equals("mInoutId"))
      return mInoutId;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("M_MOVEMENTLINE_ID") || fieldName.equals("mMovementlineId"))
      return mMovementlineId;
    else if (fieldName.equalsIgnoreCase("MOVEMENT"))
      return movement;
    else if (fieldName.equalsIgnoreCase("MOVEMENT_DESCRIPTION") || fieldName.equals("movementDescription"))
      return movementDescription;
    else if (fieldName.equalsIgnoreCase("M_INVENTORY_ID") || fieldName.equals("mInventoryId"))
      return mInventoryId;
    else if (fieldName.equalsIgnoreCase("M_MOVEMENT_ID") || fieldName.equals("mMovementId"))
      return mMovementId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCTIONPLAN_ID") || fieldName.equals("mProductionplanId"))
      return mProductionplanId;
    else if (fieldName.equalsIgnoreCase("PRODUCTION_PLAN") || fieldName.equals("productionPlan"))
      return productionPlan;
    else if (fieldName.equalsIgnoreCase("M_INTERNAL_CONSUMPTION_ID") || fieldName.equals("mInternalConsumptionId"))
      return mInternalConsumptionId;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportProductMovementData[] select(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId, String parmAttributeSetInstanceId, String isReturn)    throws ServletException {
    return select(connectionProvider, adLanguage, adUserClient, adOrgClient, parDateFrom, parDateTo, cBpartner, mProductId, parmAttributeSetInstanceId, isReturn, 0, 0);
  }

  public static ReportProductMovementData[] select(ConnectionProvider connectionProvider, String adLanguage, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId, String parmAttributeSetInstanceId, String isReturn, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_PRODUCT.VALUE, M_PRODUCT.NAME, M_TRANSACTION.MOVEMENTDATE, C_BPARTNER.NAME AS PARTNERNAME,M_ATTRIBUTESETINSTANCE.DESCRIPTION AS ATTR," +
      "      (CASE M_INOUT.ISSOTRX WHEN 'Y' THEN TO_CHAR(M_WAREHOUSE.NAME) ELSE '-' END)AS WA_ORIGIN," +
      "      (CASE M_INOUT.ISSOTRX WHEN 'Y' THEN TO_CHAR(M_LOCATOR.X) ELSE '-' END) AS X_ORIGIN, " +
      "      (CASE M_INOUT.ISSOTRX WHEN 'Y' THEN TO_CHAR(M_LOCATOR.Y) ELSE '-' END) AS Y_ORIGIN, " +
      "      (CASE M_INOUT.ISSOTRX WHEN 'Y' THEN TO_CHAR(M_LOCATOR.Z) ELSE '-' END) AS Z_ORIGIN," +
      "      (CASE M_INOUT.ISSOTRX WHEN 'Y' THEN '-' ELSE TO_CHAR(M_WAREHOUSE.NAME) END) AS WA_DESTINY, " +
      "      (CASE M_INOUT.ISSOTRX WHEN 'Y' THEN '-' ELSE TO_CHAR(M_LOCATOR.X) END) AS X_DESTINY, " +
      "      (CASE M_INOUT.ISSOTRX WHEN 'Y' THEN '-' ELSE TO_CHAR(M_LOCATOR.Y) END) AS Y_DESTINY, " +
      "      (CASE M_INOUT.ISSOTRX WHEN 'Y' THEN '-' ELSE TO_CHAR(M_LOCATOR.Z) END) AS Z_DESTINY," +
      "      AD_MESSAGE_GET2(M_INOUT.ISSOTRX,?) AS OUT," +
      "      (SUM(M_TRANSACTION.MOVEMENTQTY)||' '||C_UOM.NAME) AS MOVEMENTQTY, M_INOUT.ISSOTRX AS ISSOTRX, M_INOUT.M_INOUT_ID," +
      "      M_INOUT.DOCUMENTNO AS DOCUMENTNO, '' AS M_MOVEMENTLINE_ID, '' AS MOVEMENT, '' AS MOVEMENT_DESCRIPTION," +
      "      '' AS M_INVENTORY_ID, '' AS M_MOVEMENT_ID, '' AS M_PRODUCTIONPLAN_ID, '' AS PRODUCTION_PLAN, '' AS M_INTERNAL_CONSUMPTION_ID" +
      "      FROM M_PRODUCT right join M_TRANSACTION on M_TRANSACTION.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID" +
      "                     left join M_ATTRIBUTESETINSTANCE ON M_ATTRIBUTESETINSTANCE.M_ATTRIBUTESETINSTANCE_ID=M_TRANSACTION.M_ATTRIBUTESETINSTANCE_ID," +
      "           M_INOUT left join C_BPARTNER on M_INOUT.C_BPARTNER_ID=C_BPARTNER.C_BPARTNER_ID" +
      "           left join C_DOCTYPE on M_INOUT.C_DOCTYPE_ID = C_DOCTYPE.C_DOCTYPE_ID, " +
      "           M_LOCATOR, M_INOUTLINE, C_UOM, M_WAREHOUSE" +
      "      WHERE M_TRANSACTION.M_LOCATOR_ID = M_LOCATOR.M_LOCATOR_ID" +
      "      AND M_TRANSACTION.M_INOUTLINE_ID = M_INOUTLINE.M_INOUTLINE_ID" +
      "      AND M_INOUTLINE.M_INOUT_ID = M_INOUT.M_INOUT_ID" +
      "      AND M_TRANSACTION.C_UOM_ID = C_UOM.C_UOM_ID" +
      "      AND M_LOCATOR.M_WAREHOUSE_ID = M_WAREHOUSE.M_WAREHOUSE_ID " +
      "      AND M_TRANSACTION.M_INOUTLINE_ID IS NOT NULL " +
      "      AND M_TRANSACTION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND M_TRANSACTION.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE >= to_date(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE < to_date(?) ");
    strSql = strSql + ((cBpartner==null || cBpartner.equals(""))?"":"  AND C_BPARTNER.C_BPARTNER_ID = ? ");
    strSql = strSql + ((mProductId==null || mProductId.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_ID = ? ");
    strSql = strSql + ((parmAttributeSetInstanceId==null || parmAttributeSetInstanceId.equals(""))?"":" AND M_TRANSACTION.M_ATTRIBUTESETINSTANCE_ID = ? ");
    strSql = strSql + ((isReturn==null || isReturn.equals(""))?"":" AND C_DOCTYPE.ISRETURN = ? ");
    strSql = strSql + 
      "      GROUP BY M_PRODUCT.VALUE, M_PRODUCT.NAME, M_TRANSACTION.MOVEMENTDATE, C_BPARTNER.NAME, M_LOCATOR.X, M_LOCATOR.Y, " +
      "      M_LOCATOR.Z, M_INOUT.ISSOTRX, C_UOM.NAME, M_INOUT.M_INOUT_ID, M_INOUT.DOCUMENTNO, M_ATTRIBUTESETINSTANCE.DESCRIPTION," +
      "      M_WAREHOUSE.NAME" +
      "      ORDER BY C_BPARTNER.NAME, M_TRANSACTION.MOVEMENTDATE DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (cBpartner != null && !(cBpartner.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartner);
      }
      if (mProductId != null && !(mProductId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      }
      if (parmAttributeSetInstanceId != null && !(parmAttributeSetInstanceId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parmAttributeSetInstanceId);
      }
      if (isReturn != null && !(isReturn.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, isReturn);
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
        ReportProductMovementData objectReportProductMovementData = new ReportProductMovementData();
        objectReportProductMovementData.value = UtilSql.getValue(result, "VALUE");
        objectReportProductMovementData.name = UtilSql.getValue(result, "NAME");
        objectReportProductMovementData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectReportProductMovementData.partnername = UtilSql.getValue(result, "PARTNERNAME");
        objectReportProductMovementData.attr = UtilSql.getValue(result, "ATTR");
        objectReportProductMovementData.waOrigin = UtilSql.getValue(result, "WA_ORIGIN");
        objectReportProductMovementData.xOrigin = UtilSql.getValue(result, "X_ORIGIN");
        objectReportProductMovementData.yOrigin = UtilSql.getValue(result, "Y_ORIGIN");
        objectReportProductMovementData.zOrigin = UtilSql.getValue(result, "Z_ORIGIN");
        objectReportProductMovementData.waDestiny = UtilSql.getValue(result, "WA_DESTINY");
        objectReportProductMovementData.xDestiny = UtilSql.getValue(result, "X_DESTINY");
        objectReportProductMovementData.yDestiny = UtilSql.getValue(result, "Y_DESTINY");
        objectReportProductMovementData.zDestiny = UtilSql.getValue(result, "Z_DESTINY");
        objectReportProductMovementData.out = UtilSql.getValue(result, "OUT");
        objectReportProductMovementData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectReportProductMovementData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectReportProductMovementData.mInoutId = UtilSql.getValue(result, "M_INOUT_ID");
        objectReportProductMovementData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectReportProductMovementData.mMovementlineId = UtilSql.getValue(result, "M_MOVEMENTLINE_ID");
        objectReportProductMovementData.movement = UtilSql.getValue(result, "MOVEMENT");
        objectReportProductMovementData.movementDescription = UtilSql.getValue(result, "MOVEMENT_DESCRIPTION");
        objectReportProductMovementData.mInventoryId = UtilSql.getValue(result, "M_INVENTORY_ID");
        objectReportProductMovementData.mMovementId = UtilSql.getValue(result, "M_MOVEMENT_ID");
        objectReportProductMovementData.mProductionplanId = UtilSql.getValue(result, "M_PRODUCTIONPLAN_ID");
        objectReportProductMovementData.productionPlan = UtilSql.getValue(result, "PRODUCTION_PLAN");
        objectReportProductMovementData.mInternalConsumptionId = UtilSql.getValue(result, "M_INTERNAL_CONSUMPTION_ID");
        objectReportProductMovementData.rownum = Long.toString(countRecord);
        objectReportProductMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportProductMovementData);
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
    ReportProductMovementData objectReportProductMovementData[] = new ReportProductMovementData[vector.size()];
    vector.copyInto(objectReportProductMovementData);
    return(objectReportProductMovementData);
  }

  public static ReportProductMovementData[] selectInventory(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId, String mAttributeSetInstanceId)    throws ServletException {
    return selectInventory(connectionProvider, adUserClient, adOrgClient, parDateFrom, parDateTo, cBpartner, mProductId, mAttributeSetInstanceId, 0, 0);
  }

  public static ReportProductMovementData[] selectInventory(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId, String mAttributeSetInstanceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_PRODUCT.VALUE, M_PRODUCT.NAME, M_WAREHOUSE.NAME as WA_ORIGIN, " +
      "      M_LOCATOR.X AS X_ORIGIN, M_LOCATOR.Y AS Y_ORIGIN, M_LOCATOR.Z AS Z_ORIGIN, C_BPARTNER.NAME AS PARTNERNAME, " +
      "      (SUM(M_TRANSACTION.MOVEMENTQTY)||' '||C_UOM.NAME) AS MOVEMENTQTY, M_TRANSACTION.MOVEMENTDATE, 'No' AS OUT," +
      "      M_INVENTORY.M_INVENTORY_ID, M_INVENTORY.NAME AS MOVEMENT, M_INVENTORY.NAME AS MOVEMENT_DESCRIPTION" +
      "      FROM M_PRODUCT left join C_BPARTNER on M_PRODUCT.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "                     right join M_TRANSACTION on M_TRANSACTION.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID," +
      "          M_LOCATOR,  C_UOM, M_INVENTORYLINE, M_INVENTORY,  M_WAREHOUSE" +
      "      WHERE  M_TRANSACTION.M_LOCATOR_ID = M_LOCATOR.M_LOCATOR_ID" +
      "      AND M_TRANSACTION.C_UOM_ID = C_UOM.C_UOM_ID" +
      "      AND M_TRANSACTION.M_INVENTORYLINE_ID = M_INVENTORYLINE.M_INVENTORYLINE_ID" +
      "      AND M_INVENTORYLINE.M_INVENTORY_ID = M_INVENTORY.M_INVENTORY_ID" +
      "      AND M_LOCATOR.M_WAREHOUSE_ID = M_WAREHOUSE.M_WAREHOUSE_ID " +
      "      AND M_TRANSACTION.M_INVENTORYLINE_ID IS NOT NULL" +
      "      AND M_TRANSACTION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND M_TRANSACTION.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE >= to_date(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE < to_date(?) ");
    strSql = strSql + ((cBpartner==null || cBpartner.equals(""))?"":"  AND C_BPARTNER.C_BPARTNER_ID = ? ");
    strSql = strSql + ((mProductId==null || mProductId.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_ID = ? ");
    strSql = strSql + ((mAttributeSetInstanceId==null || mAttributeSetInstanceId.equals(""))?"":" AND M_TRANSACTION.M_ATTRIBUTESETINSTANCE_ID = ? ");
    strSql = strSql + 
      "      GROUP BY M_PRODUCT.VALUE, M_PRODUCT.NAME, M_LOCATOR.X, M_LOCATOR.Y, M_LOCATOR.Z, C_BPARTNER.NAME, C_UOM.NAME, " +
      "      M_TRANSACTION.MOVEMENTDATE, M_INVENTORY.M_INVENTORY_ID, M_INVENTORY.NAME, M_WAREHOUSE.NAME" +
      "      HAVING SUM(M_TRANSACTION.MOVEMENTQTY) <> 0" +
      "      ORDER BY C_BPARTNER.NAME, M_TRANSACTION.MOVEMENTDATE DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (cBpartner != null && !(cBpartner.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartner);
      }
      if (mProductId != null && !(mProductId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      }
      if (mAttributeSetInstanceId != null && !(mAttributeSetInstanceId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributeSetInstanceId);
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
        ReportProductMovementData objectReportProductMovementData = new ReportProductMovementData();
        objectReportProductMovementData.value = UtilSql.getValue(result, "VALUE");
        objectReportProductMovementData.name = UtilSql.getValue(result, "NAME");
        objectReportProductMovementData.waOrigin = UtilSql.getValue(result, "WA_ORIGIN");
        objectReportProductMovementData.xOrigin = UtilSql.getValue(result, "X_ORIGIN");
        objectReportProductMovementData.yOrigin = UtilSql.getValue(result, "Y_ORIGIN");
        objectReportProductMovementData.zOrigin = UtilSql.getValue(result, "Z_ORIGIN");
        objectReportProductMovementData.partnername = UtilSql.getValue(result, "PARTNERNAME");
        objectReportProductMovementData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectReportProductMovementData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectReportProductMovementData.out = UtilSql.getValue(result, "OUT");
        objectReportProductMovementData.mInventoryId = UtilSql.getValue(result, "M_INVENTORY_ID");
        objectReportProductMovementData.movement = UtilSql.getValue(result, "MOVEMENT");
        objectReportProductMovementData.movementDescription = UtilSql.getValue(result, "MOVEMENT_DESCRIPTION");
        objectReportProductMovementData.rownum = Long.toString(countRecord);
        objectReportProductMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportProductMovementData);
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
    ReportProductMovementData objectReportProductMovementData[] = new ReportProductMovementData[vector.size()];
    vector.copyInto(objectReportProductMovementData);
    return(objectReportProductMovementData);
  }

  public static ReportProductMovementData[] selectMovement(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId)    throws ServletException {
    return selectMovement(connectionProvider, adUserClient, adOrgClient, parDateFrom, parDateTo, cBpartner, mProductId, 0, 0);
  }

  public static ReportProductMovementData[] selectMovement(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_PRODUCT.VALUE, M_PRODUCT.NAME, M_WAREHOUSE.NAME as WA_ORIGIN, M_LOCATOR.X AS X_ORIGIN, " +
      "        M_LOCATOR.Y AS Y_ORIGIN, M_LOCATOR.Z AS Z_ORIGIN, M_L_WAREHOUSE.NAME as WA_DESTINY," +
      "        M_L.X AS X_DESTINY, M_L.Y AS Y_DESTINY, M_L.Z AS Z_DESTINY, C_BPARTNER.NAME AS PARTNERNAME, " +
      "        (M_TRANSACTION.MOVEMENTQTY||' '||C_UOM.NAME) AS MOVEMENTQTY, M_TRANSACTION.MOVEMENTDATE, 'No' AS OUT," +
      "        M_MOVEMENTLINE.M_MOVEMENT_ID, M_MOVEMENT.NAME AS MOVEMENT" +
      "        FROM  M_PRODUCT left join C_BPARTNER on M_PRODUCT.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "                        right join M_TRANSACTION on M_TRANSACTION.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID," +
      "        M_MOVEMENTLINE, M_LOCATOR, M_LOCATOR M_L,  C_UOM,M_MOVEMENT,  M_WAREHOUSE, M_WAREHOUSE M_L_WAREHOUSE" +
      "        WHERE M_TRANSACTION.M_MOVEMENTLINE_ID = M_MOVEMENTLINE.M_MOVEMENTLINE_ID" +
      "        AND M_MOVEMENTLINE.M_LOCATOR_ID = M_LOCATOR.M_LOCATOR_ID" +
      "        AND M_MOVEMENTLINE.M_LOCATORTO_ID = M_L.M_LOCATOR_ID" +
      "        AND M_TRANSACTION.C_UOM_ID = C_UOM.C_UOM_ID" +
      "        AND M_LOCATOR.M_WAREHOUSE_ID = M_WAREHOUSE.M_WAREHOUSE_ID" +
      "        AND M_L.M_WAREHOUSE_ID = M_L_WAREHOUSE.M_WAREHOUSE_ID" +
      "        AND M_TRANSACTION.M_MOVEMENTLINE_ID IS NOT NULL" +
      "        AND M_MOVEMENTLINE.M_MOVEMENT_ID = M_MOVEMENT.M_MOVEMENT_ID" +
      "        AND M_TRANSACTION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND M_TRANSACTION.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "        AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE >= to_date(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE < to_date(?) ");
    strSql = strSql + ((cBpartner==null || cBpartner.equals(""))?"":"  AND C_BPARTNER.C_BPARTNER_ID = ? ");
    strSql = strSql + ((mProductId==null || mProductId.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_ID = ? ");
    strSql = strSql + 
      "        AND M_TRANSACTION.MOVEMENTQTY >0" +
      "        ORDER BY C_BPARTNER.NAME, M_TRANSACTION.MOVEMENTDATE DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (cBpartner != null && !(cBpartner.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartner);
      }
      if (mProductId != null && !(mProductId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
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
        ReportProductMovementData objectReportProductMovementData = new ReportProductMovementData();
        objectReportProductMovementData.value = UtilSql.getValue(result, "VALUE");
        objectReportProductMovementData.name = UtilSql.getValue(result, "NAME");
        objectReportProductMovementData.waOrigin = UtilSql.getValue(result, "WA_ORIGIN");
        objectReportProductMovementData.xOrigin = UtilSql.getValue(result, "X_ORIGIN");
        objectReportProductMovementData.yOrigin = UtilSql.getValue(result, "Y_ORIGIN");
        objectReportProductMovementData.zOrigin = UtilSql.getValue(result, "Z_ORIGIN");
        objectReportProductMovementData.waDestiny = UtilSql.getValue(result, "WA_DESTINY");
        objectReportProductMovementData.xDestiny = UtilSql.getValue(result, "X_DESTINY");
        objectReportProductMovementData.yDestiny = UtilSql.getValue(result, "Y_DESTINY");
        objectReportProductMovementData.zDestiny = UtilSql.getValue(result, "Z_DESTINY");
        objectReportProductMovementData.partnername = UtilSql.getValue(result, "PARTNERNAME");
        objectReportProductMovementData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectReportProductMovementData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectReportProductMovementData.out = UtilSql.getValue(result, "OUT");
        objectReportProductMovementData.mMovementId = UtilSql.getValue(result, "M_MOVEMENT_ID");
        objectReportProductMovementData.movement = UtilSql.getValue(result, "MOVEMENT");
        objectReportProductMovementData.rownum = Long.toString(countRecord);
        objectReportProductMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportProductMovementData);
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
    ReportProductMovementData objectReportProductMovementData[] = new ReportProductMovementData[vector.size()];
    vector.copyInto(objectReportProductMovementData);
    return(objectReportProductMovementData);
  }

  public static ReportProductMovementData[] selectProduction(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId)    throws ServletException {
    return selectProduction(connectionProvider, adUserClient, adOrgClient, parDateFrom, parDateTo, cBpartner, mProductId, 0, 0);
  }

  public static ReportProductMovementData[] selectProduction(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_PRODUCT.VALUE, M_PRODUCT.NAME, M_WAREHOUSE.NAME as WA_ORIGIN, M_LOCATOR.X AS X_ORIGIN, M_LOCATOR.Y AS Y_ORIGIN, M_LOCATOR.Z AS Z_ORIGIN," +
      "        C_BPARTNER.NAME AS PARTNERNAME, '-' AS WA_DESTINY, '-' AS X_DESTINY, '-' AS Y_DESTINY, '-' AS Z_DESTINY, " +
      "        (SUM(M_TRANSACTION.MOVEMENTQTY)||' '||C_UOM.NAME) AS MOVEMENTQTY, M_TRANSACTION.MOVEMENTDATE, 'No' AS OUT, M_PRODUCTION.ISSOTRX AS ISSOTRX," +
      "        M_PRODUCTIONPLAN.M_PRODUCTIONPLAN_ID, ((CASE WHEN M_PRODUCTION.NAME IS NULL THEN M_PRODUCTION.DOCUMENTNO ELSE M_PRODUCTION.NAME END) || ' - ' || M_PRODUCTIONPLAN.LINE) AS PRODUCTION_PLAN" +
      "        FROM M_PRODUCT left join C_BPARTNER on M_PRODUCT.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "                       right join M_TRANSACTION on M_TRANSACTION.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID," +
      "             M_LOCATOR, C_UOM, M_PRODUCTIONLINE, M_PRODUCTIONPLAN, M_PRODUCTION, M_WAREHOUSE" +
      "        WHERE M_TRANSACTION.M_LOCATOR_ID = M_LOCATOR.M_LOCATOR_ID" +
      "        AND M_TRANSACTION.C_UOM_ID = C_UOM.C_UOM_ID" +
      "        AND M_TRANSACTION.M_PRODUCTIONLINE_ID = M_PRODUCTIONLINE.M_PRODUCTIONLINE_ID" +
      "        AND M_PRODUCTIONLINE.M_PRODUCTIONPLAN_ID = M_PRODUCTIONPLAN.M_PRODUCTIONPLAN_ID" +
      "        AND M_PRODUCTIONPLAN.M_PRODUCTION_ID = M_PRODUCTION.M_PRODUCTION_ID" +
      "        AND M_LOCATOR.M_WAREHOUSE_ID = M_WAREHOUSE.M_WAREHOUSE_ID" +
      "        AND M_TRANSACTION.M_PRODUCTIONLINE_ID IS NOT NULL" +
      "        AND M_TRANSACTION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "        AND M_TRANSACTION.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "        AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE >= to_date(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE < to_date(?) ");
    strSql = strSql + ((cBpartner==null || cBpartner.equals(""))?"":"  AND C_BPARTNER.C_BPARTNER_ID = ? ");
    strSql = strSql + ((mProductId==null || mProductId.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_ID = ? ");
    strSql = strSql + 
      "        GROUP BY M_PRODUCT.VALUE, M_PRODUCT.NAME, M_LOCATOR.X, M_LOCATOR.Y, M_LOCATOR.Z, C_BPARTNER.NAME, C_UOM.NAME, " +
      "        M_TRANSACTION.MOVEMENTDATE,M_PRODUCTIONPLAN.M_PRODUCTIONPLAN_ID, M_PRODUCTION.NAME, M_PRODUCTIONPLAN.LINE, M_PRODUCTION.ISSOTRX, M_PRODUCTION.DOCUMENTNO, M_WAREHOUSE.NAME" +
      "        HAVING SUM(M_TRANSACTION.MOVEMENTQTY) <> 0" +
      "        ORDER BY C_BPARTNER.NAME, M_TRANSACTION.MOVEMENTDATE DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (cBpartner != null && !(cBpartner.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartner);
      }
      if (mProductId != null && !(mProductId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
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
        ReportProductMovementData objectReportProductMovementData = new ReportProductMovementData();
        objectReportProductMovementData.value = UtilSql.getValue(result, "VALUE");
        objectReportProductMovementData.name = UtilSql.getValue(result, "NAME");
        objectReportProductMovementData.waOrigin = UtilSql.getValue(result, "WA_ORIGIN");
        objectReportProductMovementData.xOrigin = UtilSql.getValue(result, "X_ORIGIN");
        objectReportProductMovementData.yOrigin = UtilSql.getValue(result, "Y_ORIGIN");
        objectReportProductMovementData.zOrigin = UtilSql.getValue(result, "Z_ORIGIN");
        objectReportProductMovementData.partnername = UtilSql.getValue(result, "PARTNERNAME");
        objectReportProductMovementData.waDestiny = UtilSql.getValue(result, "WA_DESTINY");
        objectReportProductMovementData.xDestiny = UtilSql.getValue(result, "X_DESTINY");
        objectReportProductMovementData.yDestiny = UtilSql.getValue(result, "Y_DESTINY");
        objectReportProductMovementData.zDestiny = UtilSql.getValue(result, "Z_DESTINY");
        objectReportProductMovementData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectReportProductMovementData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectReportProductMovementData.out = UtilSql.getValue(result, "OUT");
        objectReportProductMovementData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectReportProductMovementData.mProductionplanId = UtilSql.getValue(result, "M_PRODUCTIONPLAN_ID");
        objectReportProductMovementData.productionPlan = UtilSql.getValue(result, "PRODUCTION_PLAN");
        objectReportProductMovementData.rownum = Long.toString(countRecord);
        objectReportProductMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportProductMovementData);
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
    ReportProductMovementData objectReportProductMovementData[] = new ReportProductMovementData[vector.size()];
    vector.copyInto(objectReportProductMovementData);
    return(objectReportProductMovementData);
  }

  public static ReportProductMovementData[] selectInternalConsumption(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId)    throws ServletException {
    return selectInternalConsumption(connectionProvider, adUserClient, adOrgClient, parDateFrom, parDateTo, cBpartner, mProductId, 0, 0);
  }

  public static ReportProductMovementData[] selectInternalConsumption(ConnectionProvider connectionProvider, String adUserClient, String adOrgClient, String parDateFrom, String parDateTo, String cBpartner, String mProductId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT M_PRODUCT.VALUE, M_PRODUCT.NAME, M_WAREHOUSE.NAME as WA_ORIGIN, " +
      "      M_LOCATOR.X AS X_ORIGIN, M_LOCATOR.Y AS Y_ORIGIN, M_LOCATOR.Z AS Z_ORIGIN, C_BPARTNER.NAME AS PARTNERNAME, " +
      "      (SUM(M_TRANSACTION.MOVEMENTQTY)||' '||C_UOM.NAME) AS MOVEMENTQTY, M_TRANSACTION.MOVEMENTDATE, 'No' AS OUT," +
      "      M_INTERNAL_CONSUMPTION.M_INTERNAL_CONSUMPTION_ID, M_INTERNAL_CONSUMPTION.NAME AS MOVEMENT, M_INTERNAL_CONSUMPTION.NAME AS MOVEMENT_DESCRIPTION" +
      "      FROM M_PRODUCT left join C_BPARTNER on M_PRODUCT.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "                     right join M_TRANSACTION on M_TRANSACTION.M_PRODUCT_ID = M_PRODUCT.M_PRODUCT_ID," +
      "          M_LOCATOR,  C_UOM, M_INTERNAL_CONSUMPTIONLINE, M_INTERNAL_CONSUMPTION, M_WAREHOUSE" +
      "      WHERE  M_TRANSACTION.M_LOCATOR_ID = M_LOCATOR.M_LOCATOR_ID" +
      "      AND M_TRANSACTION.C_UOM_ID = C_UOM.C_UOM_ID" +
      "      AND M_TRANSACTION.M_INTERNAL_CONSUMPTIONLINE_ID = M_INTERNAL_CONSUMPTIONLINE.M_INTERNAL_CONSUMPTIONLINE_ID" +
      "      AND M_INTERNAL_CONSUMPTIONLINE.M_INTERNAL_CONSUMPTION_ID = M_INTERNAL_CONSUMPTION.M_INTERNAL_CONSUMPTION_ID" +
      "      AND M_LOCATOR.M_WAREHOUSE_ID = M_WAREHOUSE.M_WAREHOUSE_ID" +
      "      AND M_TRANSACTION.M_INTERNAL_CONSUMPTIONLINE_ID IS NOT NULL" +
      "      AND M_TRANSACTION.AD_CLIENT_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ")" +
      "      AND M_TRANSACTION.AD_ORG_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ")" +
      "      AND 1=1";
    strSql = strSql + ((parDateFrom==null || parDateFrom.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE >= to_date(?) ");
    strSql = strSql + ((parDateTo==null || parDateTo.equals(""))?"":"  AND M_TRANSACTION.MOVEMENTDATE < to_date(?) ");
    strSql = strSql + ((cBpartner==null || cBpartner.equals(""))?"":"  AND C_BPARTNER.C_BPARTNER_ID = ? ");
    strSql = strSql + ((mProductId==null || mProductId.equals(""))?"":"  AND M_PRODUCT.M_PRODUCT_ID = ? ");
    strSql = strSql + 
      "      GROUP BY M_PRODUCT.VALUE, M_PRODUCT.NAME, M_LOCATOR.X, M_LOCATOR.Y, M_LOCATOR.Z, C_BPARTNER.NAME, C_UOM.NAME, " +
      "      M_TRANSACTION.MOVEMENTDATE, M_INTERNAL_CONSUMPTION.M_INTERNAL_CONSUMPTION_ID, M_INTERNAL_CONSUMPTION.NAME, M_INTERNAL_CONSUMPTION.DESCRIPTION, M_WAREHOUSE.NAME" +
      "      HAVING SUM(M_TRANSACTION.MOVEMENTQTY) <> 0" +
      "      ORDER BY C_BPARTNER.NAME, M_TRANSACTION.MOVEMENTDATE DESC";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (parDateFrom != null && !(parDateFrom.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateFrom);
      }
      if (parDateTo != null && !(parDateTo.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parDateTo);
      }
      if (cBpartner != null && !(cBpartner.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartner);
      }
      if (mProductId != null && !(mProductId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
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
        ReportProductMovementData objectReportProductMovementData = new ReportProductMovementData();
        objectReportProductMovementData.value = UtilSql.getValue(result, "VALUE");
        objectReportProductMovementData.name = UtilSql.getValue(result, "NAME");
        objectReportProductMovementData.waOrigin = UtilSql.getValue(result, "WA_ORIGIN");
        objectReportProductMovementData.xOrigin = UtilSql.getValue(result, "X_ORIGIN");
        objectReportProductMovementData.yOrigin = UtilSql.getValue(result, "Y_ORIGIN");
        objectReportProductMovementData.zOrigin = UtilSql.getValue(result, "Z_ORIGIN");
        objectReportProductMovementData.partnername = UtilSql.getValue(result, "PARTNERNAME");
        objectReportProductMovementData.movementqty = UtilSql.getValue(result, "MOVEMENTQTY");
        objectReportProductMovementData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectReportProductMovementData.out = UtilSql.getValue(result, "OUT");
        objectReportProductMovementData.mInternalConsumptionId = UtilSql.getValue(result, "M_INTERNAL_CONSUMPTION_ID");
        objectReportProductMovementData.movement = UtilSql.getValue(result, "MOVEMENT");
        objectReportProductMovementData.movementDescription = UtilSql.getValue(result, "MOVEMENT_DESCRIPTION");
        objectReportProductMovementData.rownum = Long.toString(countRecord);
        objectReportProductMovementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportProductMovementData);
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
    ReportProductMovementData objectReportProductMovementData[] = new ReportProductMovementData[vector.size()];
    vector.copyInto(objectReportProductMovementData);
    return(objectReportProductMovementData);
  }

  public static String selectBpartner(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_BPARTNER.NAME" +
      "      FROM C_BPARTNER" +
      "      WHERE C_BPARTNER.C_BPARTNER_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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

  public static ReportProductMovementData[] set()    throws ServletException {
    ReportProductMovementData objectReportProductMovementData[] = new ReportProductMovementData[1];
    objectReportProductMovementData[0] = new ReportProductMovementData();
    objectReportProductMovementData[0].name = "";
    return objectReportProductMovementData;
  }
}
