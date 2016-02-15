//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.businessUtility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

public class PAttributeSetData implements FieldProvider {
static Logger log4j = Logger.getLogger(PAttributeSetData.class);
  private String InitRecordNumber="0";
  public String mAttributesetId;
  public String name;
  public String description;
  public String guaranteedays;
  public String isguaranteedate;
  public String islot;
  public String isserno;
  public String mLotctlId;
  public String mSernoctlId;
  public String islist;
  public String elementname;
  public String mAttributeId;
  public String isinstanceattribute;
  public String mAttributesetinstanceId;
  public String guaranteedate;
  public String lot;
  public String serno;
  public String mAttributevalueId;
  public String value;
  public String attrsetvaluetype;
  public String ismandatory;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("M_ATTRIBUTESET_ID") || fieldName.equals("mAttributesetId"))
      return mAttributesetId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("GUARANTEEDAYS"))
      return guaranteedays;
    else if (fieldName.equalsIgnoreCase("ISGUARANTEEDATE"))
      return isguaranteedate;
    else if (fieldName.equalsIgnoreCase("ISLOT"))
      return islot;
    else if (fieldName.equalsIgnoreCase("ISSERNO"))
      return isserno;
    else if (fieldName.equalsIgnoreCase("M_LOTCTL_ID") || fieldName.equals("mLotctlId"))
      return mLotctlId;
    else if (fieldName.equalsIgnoreCase("M_SERNOCTL_ID") || fieldName.equals("mSernoctlId"))
      return mSernoctlId;
    else if (fieldName.equalsIgnoreCase("ISLIST"))
      return islist;
    else if (fieldName.equalsIgnoreCase("ELEMENTNAME"))
      return elementname;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTE_ID") || fieldName.equals("mAttributeId"))
      return mAttributeId;
    else if (fieldName.equalsIgnoreCase("ISINSTANCEATTRIBUTE"))
      return isinstanceattribute;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("GUARANTEEDATE"))
      return guaranteedate;
    else if (fieldName.equalsIgnoreCase("LOT"))
      return lot;
    else if (fieldName.equalsIgnoreCase("SERNO"))
      return serno;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTEVALUE_ID") || fieldName.equals("mAttributevalueId"))
      return mAttributevalueId;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("ATTRSETVALUETYPE"))
      return attrsetvaluetype;
    else if (fieldName.equalsIgnoreCase("ISMANDATORY"))
      return ismandatory;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static PAttributeSetData[] select(ConnectionProvider connectionProvider, String mAttributesetId)    throws ServletException {
    return select(connectionProvider, mAttributesetId, 0, 0);
  }

  public static PAttributeSetData[] select(ConnectionProvider connectionProvider, String mAttributesetId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT A_S.M_ATTRIBUTESET_ID, A_S.NAME, A_S.DESCRIPTION, A_S.GUARANTEEDAYS, A_S.ISGUARANTEEDATE, A_S.ISLOT, A_S.ISSERNO, " +
      "        A_S.M_LOTCTL_ID, A_S.M_SERNOCTL_ID, A.ISLIST, A.NAME AS ELEMENTNAME, A.M_ATTRIBUTE_ID, " +
      "        A.ISINSTANCEATTRIBUTE, '' AS M_ATTRIBUTESETINSTANCE_ID, '' as GUARANTEEDATE, '' as LOT, '' as SERNO, " +
      "        '' as M_ATTRIBUTEVALUE_ID, '' as VALUE, '' AS ATTRSETVALUETYPE, A.ISMANDATORY " +
      "        FROM M_ATTRIBUTESET A_S left join M_ATTRIBUTEUSE A_U on a_s.M_ATTRIBUTESET_ID = a_u.M_ATTRIBUTESET_ID" +
      "                                left join M_ATTRIBUTE A on A_U.M_ATTRIBUTE_ID = A.M_ATTRIBUTE_ID" +
      "                                                        and A_U.ISACTIVE = 'Y'" +
      "        WHERE  A_S.ISACTIVE = 'Y'" +
      "        AND A_S.M_ATTRIBUTESET_ID = ? " +
      "        ORDER BY A_U.SEQNO";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);

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
        PAttributeSetData objectPAttributeSetData = new PAttributeSetData();
        objectPAttributeSetData.mAttributesetId = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
        objectPAttributeSetData.name = UtilSql.getValue(result, "NAME");
        objectPAttributeSetData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectPAttributeSetData.guaranteedays = UtilSql.getValue(result, "GUARANTEEDAYS");
        objectPAttributeSetData.isguaranteedate = UtilSql.getValue(result, "ISGUARANTEEDATE");
        objectPAttributeSetData.islot = UtilSql.getValue(result, "ISLOT");
        objectPAttributeSetData.isserno = UtilSql.getValue(result, "ISSERNO");
        objectPAttributeSetData.mLotctlId = UtilSql.getValue(result, "M_LOTCTL_ID");
        objectPAttributeSetData.mSernoctlId = UtilSql.getValue(result, "M_SERNOCTL_ID");
        objectPAttributeSetData.islist = UtilSql.getValue(result, "ISLIST");
        objectPAttributeSetData.elementname = UtilSql.getValue(result, "ELEMENTNAME");
        objectPAttributeSetData.mAttributeId = UtilSql.getValue(result, "M_ATTRIBUTE_ID");
        objectPAttributeSetData.isinstanceattribute = UtilSql.getValue(result, "ISINSTANCEATTRIBUTE");
        objectPAttributeSetData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectPAttributeSetData.guaranteedate = UtilSql.getValue(result, "GUARANTEEDATE");
        objectPAttributeSetData.lot = UtilSql.getValue(result, "LOT");
        objectPAttributeSetData.serno = UtilSql.getValue(result, "SERNO");
        objectPAttributeSetData.mAttributevalueId = UtilSql.getValue(result, "M_ATTRIBUTEVALUE_ID");
        objectPAttributeSetData.value = UtilSql.getValue(result, "VALUE");
        objectPAttributeSetData.attrsetvaluetype = UtilSql.getValue(result, "ATTRSETVALUETYPE");
        objectPAttributeSetData.ismandatory = UtilSql.getValue(result, "ISMANDATORY");
        objectPAttributeSetData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPAttributeSetData);
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
    PAttributeSetData objectPAttributeSetData[] = new PAttributeSetData[vector.size()];
    vector.copyInto(objectPAttributeSetData);
    return(objectPAttributeSetData);
  }

  public static PAttributeSetData[] set()    throws ServletException {
    PAttributeSetData objectPAttributeSetData[] = new PAttributeSetData[1];
    objectPAttributeSetData[0] = new PAttributeSetData();
    objectPAttributeSetData[0].mAttributesetId = "";
    objectPAttributeSetData[0].name = "";
    objectPAttributeSetData[0].description = "";
    objectPAttributeSetData[0].guaranteedays = "";
    objectPAttributeSetData[0].isguaranteedate = "";
    objectPAttributeSetData[0].islot = "";
    objectPAttributeSetData[0].isserno = "";
    objectPAttributeSetData[0].mLotctlId = "";
    objectPAttributeSetData[0].mSernoctlId = "";
    objectPAttributeSetData[0].islist = "";
    objectPAttributeSetData[0].elementname = "";
    objectPAttributeSetData[0].mAttributeId = "";
    objectPAttributeSetData[0].isinstanceattribute = "";
    objectPAttributeSetData[0].mAttributesetinstanceId = "";
    objectPAttributeSetData[0].guaranteedate = "";
    objectPAttributeSetData[0].lot = "";
    objectPAttributeSetData[0].serno = "";
    objectPAttributeSetData[0].mAttributevalueId = "";
    objectPAttributeSetData[0].value = "";
    objectPAttributeSetData[0].attrsetvaluetype = "";
    objectPAttributeSetData[0].ismandatory = "";
    return objectPAttributeSetData;
  }

  public static PAttributeSetData[] selectProductAttr(ConnectionProvider connectionProvider, String mProductId)    throws ServletException {
    return selectProductAttr(connectionProvider, mProductId, 0, 0);
  }

  public static PAttributeSetData[] selectProductAttr(ConnectionProvider connectionProvider, String mProductId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT P.m_attributeset_id, P.m_attributesetinstance_id, P.attrsetvaluetype, M.DESCRIPTION " +
      "         FROM M_PRODUCT P left join M_ATTRIBUTESETINSTANCE M on P.M_ATTRIBUTESETINSTANCE_ID = M.M_ATTRIBUTESETINSTANCE_ID" +
      "         WHERE P.m_product_id=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

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
        PAttributeSetData objectPAttributeSetData = new PAttributeSetData();
        objectPAttributeSetData.mAttributesetId = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
        objectPAttributeSetData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectPAttributeSetData.attrsetvaluetype = UtilSql.getValue(result, "ATTRSETVALUETYPE");
        objectPAttributeSetData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectPAttributeSetData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPAttributeSetData);
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
    PAttributeSetData objectPAttributeSetData[] = new PAttributeSetData[vector.size()];
    vector.copyInto(objectPAttributeSetData);
    return(objectPAttributeSetData);
  }
}
