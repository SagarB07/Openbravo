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

class SLOrderPriceListData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLOrderPriceListData.class);
  private String InitRecordNumber="0";
  public String istaxincluded;
  public String cCurrencyId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ISTAXINCLUDED"))
      return istaxincluded;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLOrderPriceListData[] select(ConnectionProvider connectionProvider, String mPricelistId)    throws ServletException {
    return select(connectionProvider, mPricelistId, 0, 0);
  }

  public static SLOrderPriceListData[] select(ConnectionProvider connectionProvider, String mPricelistId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT pl.IsTaxIncluded, pl.C_Currency_ID " +
      "        FROM M_PriceList pl " +
      "        WHERE pl.M_PriceList_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);

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
        SLOrderPriceListData objectSLOrderPriceListData = new SLOrderPriceListData();
        objectSLOrderPriceListData.istaxincluded = UtilSql.getValue(result, "ISTAXINCLUDED");
        objectSLOrderPriceListData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectSLOrderPriceListData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLOrderPriceListData);
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
    SLOrderPriceListData objectSLOrderPriceListData[] = new SLOrderPriceListData[vector.size()];
    vector.copyInto(objectSLOrderPriceListData);
    return(objectSLOrderPriceListData);
  }
}
