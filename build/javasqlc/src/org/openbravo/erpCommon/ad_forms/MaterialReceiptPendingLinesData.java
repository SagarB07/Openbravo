//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class MaterialReceiptPendingLinesData implements FieldProvider {
static Logger log4j = Logger.getLogger(MaterialReceiptPendingLinesData.class);
  private String InitRecordNumber="0";
  public String cOrderlineId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String cOrderId;
  public String line;
  public String cBpartnerId;
  public String cBpartnerLocationId;
  public String dateordered;
  public String datepromised;
  public String datedelivered;
  public String dateinvoiced;
  public String description;
  public String mProductId;
  public String mWarehouseId;
  public String directship;
  public String cUomId;
  public String qtyordered;
  public String qtyreserved;
  public String qtydelivered;
  public String qtyinvoiced;
  public String mShipperId;
  public String cCurrencyId;
  public String pricelist;
  public String priceactual;
  public String pricelimit;
  public String linenetamt;
  public String discount;
  public String freightamt;
  public String cChargeId;
  public String chargeamt;
  public String cTaxId;
  public String sResourceassignmentId;
  public String refOrderlineId;
  public String mAttributesetinstanceId;
  public String isdescription;
  public String quantityorder;
  public String mProductUomId;
  public String cProjectId;
  public String user1Id;
  public String user2Id;
  public String cCostcenterId;
  public String aAssetId;
  public String rownum;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_ORDERLINE_ID") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBY"))
      return createdby;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("C_ORDER_ID") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("DATEORDERED"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("DATEPROMISED"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("DATEDELIVERED"))
      return datedelivered;
    else if (fieldName.equalsIgnoreCase("DATEINVOICED"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_WAREHOUSE_ID") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("DIRECTSHIP"))
      return directship;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("QTYORDERED"))
      return qtyordered;
    else if (fieldName.equalsIgnoreCase("QTYRESERVED"))
      return qtyreserved;
    else if (fieldName.equalsIgnoreCase("QTYDELIVERED"))
      return qtydelivered;
    else if (fieldName.equalsIgnoreCase("QTYINVOICED"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("M_SHIPPER_ID") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("PRICELIST"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("PRICEACTUAL"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("PRICELIMIT"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("LINENETAMT"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("DISCOUNT"))
      return discount;
    else if (fieldName.equalsIgnoreCase("FREIGHTAMT"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("S_RESOURCEASSIGNMENT_ID") || fieldName.equals("sResourceassignmentId"))
      return sResourceassignmentId;
    else if (fieldName.equalsIgnoreCase("REF_ORDERLINE_ID") || fieldName.equals("refOrderlineId"))
      return refOrderlineId;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("ISDESCRIPTION"))
      return isdescription;
    else if (fieldName.equalsIgnoreCase("QUANTITYORDER"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_UOM_ID") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("A_ASSET_ID") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equals("rownum"))
      return rownum;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static MaterialReceiptPendingLinesData[] select(ConnectionProvider connectionProvider, String cOrderlineId)    throws ServletException {
    return select(connectionProvider, cOrderlineId, 0, 0);
  }

  public static MaterialReceiptPendingLinesData[] select(ConnectionProvider connectionProvider, String cOrderlineId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT OL.C_ORDERLINE_ID, OL.AD_CLIENT_ID, OL.AD_ORG_ID, OL.ISACTIVE, OL.CREATED," +
      "             OL.CREATEDBY, OL.UPDATED, OL.UPDATEDBY, OL.C_ORDER_ID," +
      "             OL.LINE, OL.C_BPARTNER_ID, OL.C_BPARTNER_LOCATION_ID, OL.DATEORDERED," +
      "             OL.DATEPROMISED, OL.DATEDELIVERED, OL.DATEINVOICED, OL.DESCRIPTION," +
      "             OL.M_PRODUCT_ID, OL.M_WAREHOUSE_ID, OL.DIRECTSHIP, OL.C_UOM_ID, OL.QTYORDERED," +
      "             OL.QTYRESERVED, OL.QTYDELIVERED, OL.QTYINVOICED, OL.M_SHIPPER_ID," +
      "             OL.C_CURRENCY_ID, OL.PRICELIST, OL.PRICEACTUAL, OL.PRICELIMIT, OL.LINENETAMT," +
      "             OL.DISCOUNT, OL.FREIGHTAMT, OL.C_CHARGE_ID, OL.CHARGEAMT," +
      "             OL.C_TAX_ID, OL.S_RESOURCEASSIGNMENT_ID, OL.REF_ORDERLINE_ID, OL.M_ATTRIBUTESETINSTANCE_ID," +
      "             OL.ISDESCRIPTION, OL.QUANTITYORDER, OL.M_PRODUCT_UOM_ID," +
      "             COALESCE(OL.C_PROJECT_ID, O.C_PROJECT_ID) AS C_PROJECT_ID," +
      "             COALESCE(OL.USER1_ID, O.USER1_ID) AS USER1_ID," +
      "             COALESCE(OL.USER2_ID, O.USER2_ID) AS USER2_ID," +
      "             COALESCE(OL.C_COSTCENTER_ID, O.C_COSTCENTER_ID) AS C_COSTCENTER_ID," +
      "             COALESCE(OL.A_ASSET_ID, O.A_ASSET_ID) AS A_ASSET_ID" +
      "      FROM C_ORDERLINE OL, C_ORDER O" +
      "      WHERE OL.C_ORDER_ID = O.C_ORDER_ID " +
      "            AND OL.C_ORDERLINE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);

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
        MaterialReceiptPendingLinesData objectMaterialReceiptPendingLinesData = new MaterialReceiptPendingLinesData();
        objectMaterialReceiptPendingLinesData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectMaterialReceiptPendingLinesData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectMaterialReceiptPendingLinesData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectMaterialReceiptPendingLinesData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectMaterialReceiptPendingLinesData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectMaterialReceiptPendingLinesData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectMaterialReceiptPendingLinesData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectMaterialReceiptPendingLinesData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectMaterialReceiptPendingLinesData.cOrderId = UtilSql.getValue(result, "C_ORDER_ID");
        objectMaterialReceiptPendingLinesData.line = UtilSql.getValue(result, "LINE");
        objectMaterialReceiptPendingLinesData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectMaterialReceiptPendingLinesData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectMaterialReceiptPendingLinesData.dateordered = UtilSql.getDateValue(result, "DATEORDERED", "dd-MM-yyyy");
        objectMaterialReceiptPendingLinesData.datepromised = UtilSql.getDateValue(result, "DATEPROMISED", "dd-MM-yyyy");
        objectMaterialReceiptPendingLinesData.datedelivered = UtilSql.getDateValue(result, "DATEDELIVERED", "dd-MM-yyyy");
        objectMaterialReceiptPendingLinesData.dateinvoiced = UtilSql.getDateValue(result, "DATEINVOICED", "dd-MM-yyyy");
        objectMaterialReceiptPendingLinesData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectMaterialReceiptPendingLinesData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectMaterialReceiptPendingLinesData.mWarehouseId = UtilSql.getValue(result, "M_WAREHOUSE_ID");
        objectMaterialReceiptPendingLinesData.directship = UtilSql.getValue(result, "DIRECTSHIP");
        objectMaterialReceiptPendingLinesData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectMaterialReceiptPendingLinesData.qtyordered = UtilSql.getValue(result, "QTYORDERED");
        objectMaterialReceiptPendingLinesData.qtyreserved = UtilSql.getValue(result, "QTYRESERVED");
        objectMaterialReceiptPendingLinesData.qtydelivered = UtilSql.getValue(result, "QTYDELIVERED");
        objectMaterialReceiptPendingLinesData.qtyinvoiced = UtilSql.getValue(result, "QTYINVOICED");
        objectMaterialReceiptPendingLinesData.mShipperId = UtilSql.getValue(result, "M_SHIPPER_ID");
        objectMaterialReceiptPendingLinesData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectMaterialReceiptPendingLinesData.pricelist = UtilSql.getValue(result, "PRICELIST");
        objectMaterialReceiptPendingLinesData.priceactual = UtilSql.getValue(result, "PRICEACTUAL");
        objectMaterialReceiptPendingLinesData.pricelimit = UtilSql.getValue(result, "PRICELIMIT");
        objectMaterialReceiptPendingLinesData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectMaterialReceiptPendingLinesData.discount = UtilSql.getValue(result, "DISCOUNT");
        objectMaterialReceiptPendingLinesData.freightamt = UtilSql.getValue(result, "FREIGHTAMT");
        objectMaterialReceiptPendingLinesData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectMaterialReceiptPendingLinesData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectMaterialReceiptPendingLinesData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectMaterialReceiptPendingLinesData.sResourceassignmentId = UtilSql.getValue(result, "S_RESOURCEASSIGNMENT_ID");
        objectMaterialReceiptPendingLinesData.refOrderlineId = UtilSql.getValue(result, "REF_ORDERLINE_ID");
        objectMaterialReceiptPendingLinesData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectMaterialReceiptPendingLinesData.isdescription = UtilSql.getValue(result, "ISDESCRIPTION");
        objectMaterialReceiptPendingLinesData.quantityorder = UtilSql.getValue(result, "QUANTITYORDER");
        objectMaterialReceiptPendingLinesData.mProductUomId = UtilSql.getValue(result, "M_PRODUCT_UOM_ID");
        objectMaterialReceiptPendingLinesData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectMaterialReceiptPendingLinesData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectMaterialReceiptPendingLinesData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectMaterialReceiptPendingLinesData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectMaterialReceiptPendingLinesData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectMaterialReceiptPendingLinesData.rownum = Long.toString(countRecord);
        objectMaterialReceiptPendingLinesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMaterialReceiptPendingLinesData);
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
    MaterialReceiptPendingLinesData objectMaterialReceiptPendingLinesData[] = new MaterialReceiptPendingLinesData[vector.size()];
    vector.copyInto(objectMaterialReceiptPendingLinesData);
    return(objectMaterialReceiptPendingLinesData);
  }

  public static int insert(Connection conn, ConnectionProvider connectionProvider, String mInoutlineId, String adClientId, String adOrgId, String isactive, String createdby, String updatedby, String line, String description, String mInoutId, String cOrderlineId, String mLocatorId, String mProductId, String cUomId, String movementqty, String isinvoiced, String mAttributesetinstanceId, String isdescription, String quantityorder, String mProductUomId, String cProjectId, String user1Id, String user2Id, String cCostcenterId, String aAssetId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      INSERT INTO M_INOUTLINE" +
      "        (M_INOUTLINE_ID, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE," +
      "         CREATED, CREATEDBY, UPDATED, UPDATEDBY, " +
      "         LINE, DESCRIPTION, M_INOUT_ID, C_ORDERLINE_ID, M_LOCATOR_ID, M_PRODUCT_ID, C_UOM_ID, " +
      "         MOVEMENTQTY, ISINVOICED, M_ATTRIBUTESETINSTANCE_ID, ISDESCRIPTION, QUANTITYORDER, M_PRODUCT_UOM_ID," +
      "         C_PROJECT_ID, USER1_ID, USER2_ID, C_COSTCENTER_ID, A_ASSET_ID)" +
      "      VALUES" +
      "        (?,?,?,?," +
      "         now(),?,now(),?," +
      "         TO_NUMBER(?),?,?,?,?,?,?," +
      "         TO_NUMBER(?),?,?,?,TO_NUMBER(?),?," +
      "         ?,?,?,?,?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }
}
