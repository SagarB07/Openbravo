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

class TaxRegisterType implements FieldProvider {
static Logger log4j = Logger.getLogger(TaxRegisterType.class);
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String cTaxregisterTypeId;
  public String registername;
  public String adSequenceId;
  public String cGlitemId;
  public String issotrx;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("C_TAXREGISTER_TYPE_ID") || fieldName.equals("cTaxregisterTypeId"))
      return cTaxregisterTypeId;
    else if (fieldName.equalsIgnoreCase("REGISTERNAME"))
      return registername;
    else if (fieldName.equalsIgnoreCase("AD_SEQUENCE_ID") || fieldName.equals("adSequenceId"))
      return adSequenceId;
    else if (fieldName.equalsIgnoreCase("C_GLITEM_ID") || fieldName.equals("cGlitemId"))
      return cGlitemId;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
All Active Tax Register Type  
 */
  public static TaxRegisterType[] select(ConnectionProvider connectionProvider, String adClientId, String adUserOrg)    throws ServletException {
    return select(connectionProvider, adClientId, adUserOrg, 0, 0);
  }

/**
All Active Tax Register Type  
 */
  public static TaxRegisterType[] select(ConnectionProvider connectionProvider, String adClientId, String adUserOrg, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_Client_ID, AD_Org_ID, C_TaxRegister_Type_ID, RegisterName, Ad_Sequence_ID, C_GLitem_ID, IsSoTrx" +
      "			FROM C_TAXREGISTER_TYPE" +
      "			WHERE ISACTIVE='Y'" +
      "      AND AD_CLIENT_ID = ?" +
      "      AND C_TAXREGISTER_TYPE.AD_Org_ID IN (";
    strSql = strSql + ((adUserOrg==null || adUserOrg.equals(""))?"":adUserOrg);
    strSql = strSql + 
      ")";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      if (adUserOrg != null && !(adUserOrg.equals(""))) {
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
        TaxRegisterType objectTaxRegisterType = new TaxRegisterType();
        objectTaxRegisterType.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectTaxRegisterType.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectTaxRegisterType.cTaxregisterTypeId = UtilSql.getValue(result, "C_TAXREGISTER_TYPE_ID");
        objectTaxRegisterType.registername = UtilSql.getValue(result, "REGISTERNAME");
        objectTaxRegisterType.adSequenceId = UtilSql.getValue(result, "AD_SEQUENCE_ID");
        objectTaxRegisterType.cGlitemId = UtilSql.getValue(result, "C_GLITEM_ID");
        objectTaxRegisterType.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectTaxRegisterType.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTaxRegisterType);
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
    TaxRegisterType objectTaxRegisterType[] = new TaxRegisterType[vector.size()];
    vector.copyInto(objectTaxRegisterType);
    return(objectTaxRegisterType);
  }
}
