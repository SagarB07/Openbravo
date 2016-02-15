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

class AcctSchemaElementData implements FieldProvider {
static Logger log4j = Logger.getLogger(AcctSchemaElementData.class);
  private String InitRecordNumber="0";
  public String cAcctschemaElementId;
  public String seqno;
  public String name;
  public String elementtype;
  public String cElementId;
  public String ismandatory;
  public String isbalanced;
  public String orgId;
  public String cElementvalueId;
  public String cBpartnerId;
  public String mProductId;
  public String cActivityId;
  public String cLocationId;
  public String cCampaignId;
  public String cProjectId;
  public String cSalesregionId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_ACCTSCHEMA_ELEMENT_ID") || fieldName.equals("cAcctschemaElementId"))
      return cAcctschemaElementId;
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("ELEMENTTYPE"))
      return elementtype;
    else if (fieldName.equalsIgnoreCase("C_ELEMENT_ID") || fieldName.equals("cElementId"))
      return cElementId;
    else if (fieldName.equalsIgnoreCase("ISMANDATORY"))
      return ismandatory;
    else if (fieldName.equalsIgnoreCase("ISBALANCED"))
      return isbalanced;
    else if (fieldName.equalsIgnoreCase("ORG_ID") || fieldName.equals("orgId"))
      return orgId;
    else if (fieldName.equalsIgnoreCase("C_ELEMENTVALUE_ID") || fieldName.equals("cElementvalueId"))
      return cElementvalueId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("C_LOCATION_ID") || fieldName.equals("cLocationId"))
      return cLocationId;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_SALESREGION_ID") || fieldName.equals("cSalesregionId"))
      return cSalesregionId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AcctSchemaElementData[] select(ConnectionProvider connectionProvider, String C_AcctSchema_ID)    throws ServletException {
    return select(connectionProvider, C_AcctSchema_ID, 0, 0);
  }

  public static AcctSchemaElementData[] select(ConnectionProvider connectionProvider, String C_AcctSchema_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT C_AcctSchema_Element_ID,SeqNo,Name,ElementType,C_Element_ID,IsMandatory,IsBalanced, " +
      "      Org_ID,C_ElementValue_ID,C_BPartner_ID,M_Product_ID,C_Activity_ID,C_Location_ID," +
      "      C_Campaign_ID,C_Project_ID,C_SalesRegion_ID " +
      "      FROM C_AcctSchema_Element " +
      "      WHERE C_AcctSchema_ID=? " +
      "      AND IsActive='Y' " +
      "      ORDER BY SeqNo";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_AcctSchema_ID);

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
        AcctSchemaElementData objectAcctSchemaElementData = new AcctSchemaElementData();
        objectAcctSchemaElementData.cAcctschemaElementId = UtilSql.getValue(result, "C_ACCTSCHEMA_ELEMENT_ID");
        objectAcctSchemaElementData.seqno = UtilSql.getValue(result, "SEQNO");
        objectAcctSchemaElementData.name = UtilSql.getValue(result, "NAME");
        objectAcctSchemaElementData.elementtype = UtilSql.getValue(result, "ELEMENTTYPE");
        objectAcctSchemaElementData.cElementId = UtilSql.getValue(result, "C_ELEMENT_ID");
        objectAcctSchemaElementData.ismandatory = UtilSql.getValue(result, "ISMANDATORY");
        objectAcctSchemaElementData.isbalanced = UtilSql.getValue(result, "ISBALANCED");
        objectAcctSchemaElementData.orgId = UtilSql.getValue(result, "ORG_ID");
        objectAcctSchemaElementData.cElementvalueId = UtilSql.getValue(result, "C_ELEMENTVALUE_ID");
        objectAcctSchemaElementData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectAcctSchemaElementData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectAcctSchemaElementData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectAcctSchemaElementData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectAcctSchemaElementData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectAcctSchemaElementData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectAcctSchemaElementData.cSalesregionId = UtilSql.getValue(result, "C_SALESREGION_ID");
        objectAcctSchemaElementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAcctSchemaElementData);
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
    AcctSchemaElementData objectAcctSchemaElementData[] = new AcctSchemaElementData[vector.size()];
    vector.copyInto(objectAcctSchemaElementData);
    return(objectAcctSchemaElementData);
  }
}
