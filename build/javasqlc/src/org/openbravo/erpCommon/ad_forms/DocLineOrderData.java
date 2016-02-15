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

class DocLineOrderData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocLineOrderData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String cBpartnerId;
  public String mProductId;
  public String line;
  public String description;
  public String cUomId;
  public String cTaxId;
  public String cChargeId;
  public String chargeamt;
  public String cOrderlineId;
  public String qtyordered;
  public String linenetamt;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("C_CHARGE_ID") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("CHARGEAMT"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("C_ORDERLINE_ID") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("QTYORDERED"))
      return qtyordered;
    else if (fieldName.equalsIgnoreCase("LINENETAMT"))
      return linenetamt;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocLineOrderData[] select(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    return select(connectionProvider, C_Order_ID, 0, 0);
  }

  public static DocLineOrderData[] select(ConnectionProvider connectionProvider, String C_Order_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT OL.AD_ORG_ID, OL.C_BPARTNER_ID, OL.M_PRODUCT_ID, OL.LINE, OL.DESCRIPTION," +
      "          OL.C_UOM_ID, OL.C_TAX_ID, OL.C_CHARGE_ID, OL.CHARGEAMT, OL.C_ORDERLINE_ID," +
      "          OL.QTYORDERED, OL.LINENETAMT" +
      "          FROM C_OrderLine OL WHERE C_Order_ID=? ORDER BY Line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Order_ID);

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
        DocLineOrderData objectDocLineOrderData = new DocLineOrderData();
        objectDocLineOrderData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocLineOrderData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocLineOrderData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocLineOrderData.line = UtilSql.getValue(result, "LINE");
        objectDocLineOrderData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocLineOrderData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectDocLineOrderData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectDocLineOrderData.cChargeId = UtilSql.getValue(result, "C_CHARGE_ID");
        objectDocLineOrderData.chargeamt = UtilSql.getValue(result, "CHARGEAMT");
        objectDocLineOrderData.cOrderlineId = UtilSql.getValue(result, "C_ORDERLINE_ID");
        objectDocLineOrderData.qtyordered = UtilSql.getValue(result, "QTYORDERED");
        objectDocLineOrderData.linenetamt = UtilSql.getValue(result, "LINENETAMT");
        objectDocLineOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocLineOrderData);
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
    DocLineOrderData objectDocLineOrderData[] = new DocLineOrderData[vector.size()];
    vector.copyInto(objectDocLineOrderData);
    return(objectDocLineOrderData);
  }
}
