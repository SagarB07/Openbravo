//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.info;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class AttributeSetInstanceData implements FieldProvider {
static Logger log4j = Logger.getLogger(AttributeSetInstanceData.class);
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
  public String islockable;
  public String isinstanceattribute;
  public String mAttributesetinstanceId;
  public String guaranteedate;
  public String lot;
  public String serno;
  public String mAttributevalueId;
  public String value;
  public String ismandatory;
  public String islocked;
  public String lockDescription;

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
    else if (fieldName.equalsIgnoreCase("ISLOCKABLE"))
      return islockable;
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
    else if (fieldName.equalsIgnoreCase("ISMANDATORY"))
      return ismandatory;
    else if (fieldName.equalsIgnoreCase("ISLOCKED"))
      return islocked;
    else if (fieldName.equalsIgnoreCase("LOCK_DESCRIPTION") || fieldName.equals("lockDescription"))
      return lockDescription;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AttributeSetInstanceData[] select(ConnectionProvider connectionProvider, String mAttributesetId)    throws ServletException {
    return select(connectionProvider, mAttributesetId, 0, 0);
  }

  public static AttributeSetInstanceData[] select(ConnectionProvider connectionProvider, String mAttributesetId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT A_S.M_ATTRIBUTESET_ID, A_S.NAME, A_S.DESCRIPTION, A_S.GUARANTEEDAYS, A_S.ISGUARANTEEDATE, A_S.ISLOT, A_S.ISSERNO, " +
      "        A_S.M_LOTCTL_ID, A_S.M_SERNOCTL_ID, A.ISLIST, A.NAME AS ELEMENTNAME, A.M_ATTRIBUTE_ID, " +
      "        A_S.ISLOCKABLE, A.ISINSTANCEATTRIBUTE, '' AS M_ATTRIBUTESETINSTANCE_ID, '' as GUARANTEEDATE, '' as LOT, '' as SERNO, " +
      "        '' as M_ATTRIBUTEVALUE_ID, '' as VALUE, A.ISMANDATORY, '' AS ISLOCKED, '' AS LOCK_DESCRIPTION " +
      "        FROM M_ATTRIBUTESET A_S left join (M_ATTRIBUTEUSE A_U " +
      "                                           join M_ATTRIBUTE A on A_U.M_ATTRIBUTE_ID = A.M_ATTRIBUTE_ID" +
      "                                                                 and A_U.ISACTIVE= 'Y'" +
      "                                                                 and A.ISACTIVE= 'Y')" +
      "                                on a_s.M_ATTRIBUTESET_ID = a_u.M_ATTRIBUTESET_ID" +
      "        WHERE A_S.ISACTIVE = 'Y'" +
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
        AttributeSetInstanceData objectAttributeSetInstanceData = new AttributeSetInstanceData();
        objectAttributeSetInstanceData.mAttributesetId = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
        objectAttributeSetInstanceData.name = UtilSql.getValue(result, "NAME");
        objectAttributeSetInstanceData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAttributeSetInstanceData.guaranteedays = UtilSql.getValue(result, "GUARANTEEDAYS");
        objectAttributeSetInstanceData.isguaranteedate = UtilSql.getValue(result, "ISGUARANTEEDATE");
        objectAttributeSetInstanceData.islot = UtilSql.getValue(result, "ISLOT");
        objectAttributeSetInstanceData.isserno = UtilSql.getValue(result, "ISSERNO");
        objectAttributeSetInstanceData.mLotctlId = UtilSql.getValue(result, "M_LOTCTL_ID");
        objectAttributeSetInstanceData.mSernoctlId = UtilSql.getValue(result, "M_SERNOCTL_ID");
        objectAttributeSetInstanceData.islist = UtilSql.getValue(result, "ISLIST");
        objectAttributeSetInstanceData.elementname = UtilSql.getValue(result, "ELEMENTNAME");
        objectAttributeSetInstanceData.mAttributeId = UtilSql.getValue(result, "M_ATTRIBUTE_ID");
        objectAttributeSetInstanceData.islockable = UtilSql.getValue(result, "ISLOCKABLE");
        objectAttributeSetInstanceData.isinstanceattribute = UtilSql.getValue(result, "ISINSTANCEATTRIBUTE");
        objectAttributeSetInstanceData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectAttributeSetInstanceData.guaranteedate = UtilSql.getValue(result, "GUARANTEEDATE");
        objectAttributeSetInstanceData.lot = UtilSql.getValue(result, "LOT");
        objectAttributeSetInstanceData.serno = UtilSql.getValue(result, "SERNO");
        objectAttributeSetInstanceData.mAttributevalueId = UtilSql.getValue(result, "M_ATTRIBUTEVALUE_ID");
        objectAttributeSetInstanceData.value = UtilSql.getValue(result, "VALUE");
        objectAttributeSetInstanceData.ismandatory = UtilSql.getValue(result, "ISMANDATORY");
        objectAttributeSetInstanceData.islocked = UtilSql.getValue(result, "ISLOCKED");
        objectAttributeSetInstanceData.lockDescription = UtilSql.getValue(result, "LOCK_DESCRIPTION");
        objectAttributeSetInstanceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttributeSetInstanceData);
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
    AttributeSetInstanceData objectAttributeSetInstanceData[] = new AttributeSetInstanceData[vector.size()];
    vector.copyInto(objectAttributeSetInstanceData);
    return(objectAttributeSetInstanceData);
  }

  public static AttributeSetInstanceData[] selectInstance(ConnectionProvider connectionProvider, String mAttributesetinstanceId)    throws ServletException {
    return selectInstance(connectionProvider, mAttributesetinstanceId, 0, 0);
  }

  public static AttributeSetInstanceData[] selectInstance(ConnectionProvider connectionProvider, String mAttributesetinstanceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT A_S.DESCRIPTION, A_S.GUARANTEEDATE, A_S.LOT, A_S.SERNO, A_S.M_ATTRIBUTESET_ID, " +
      "        A.M_ATTRIBUTEVALUE_ID, A.M_ATTRIBUTE_ID, A.VALUE, A_S.ISLOCKED, A_S.LOCK_DESCRIPTION " +
      "        FROM M_ATTRIBUTESETINSTANCE A_S left join M_ATTRIBUTEINSTANCE A on A_S.M_ATTRIBUTESETINSTANCE_ID = A.M_ATTRIBUTESETINSTANCE_ID" +
      "        WHERE A_S.M_ATTRIBUTESETINSTANCE_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);

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
        AttributeSetInstanceData objectAttributeSetInstanceData = new AttributeSetInstanceData();
        objectAttributeSetInstanceData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAttributeSetInstanceData.guaranteedate = UtilSql.getDateValue(result, "GUARANTEEDATE", "dd-MM-yyyy");
        objectAttributeSetInstanceData.lot = UtilSql.getValue(result, "LOT");
        objectAttributeSetInstanceData.serno = UtilSql.getValue(result, "SERNO");
        objectAttributeSetInstanceData.mAttributesetId = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
        objectAttributeSetInstanceData.mAttributevalueId = UtilSql.getValue(result, "M_ATTRIBUTEVALUE_ID");
        objectAttributeSetInstanceData.mAttributeId = UtilSql.getValue(result, "M_ATTRIBUTE_ID");
        objectAttributeSetInstanceData.value = UtilSql.getValue(result, "VALUE");
        objectAttributeSetInstanceData.islocked = UtilSql.getValue(result, "ISLOCKED");
        objectAttributeSetInstanceData.lockDescription = UtilSql.getValue(result, "LOCK_DESCRIPTION");
        objectAttributeSetInstanceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttributeSetInstanceData);
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
    AttributeSetInstanceData objectAttributeSetInstanceData[] = new AttributeSetInstanceData[vector.size()];
    vector.copyInto(objectAttributeSetInstanceData);
    return(objectAttributeSetInstanceData);
  }

  public static AttributeSetInstanceData[] selectList(ConnectionProvider connectionProvider, String mAttributeId)    throws ServletException {
    return selectList(connectionProvider, mAttributeId, 0, 0);
  }

  public static AttributeSetInstanceData[] selectList(ConnectionProvider connectionProvider, String mAttributeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_ATTRIBUTEVALUE_ID AS VALUE, NAME, DESCRIPTION " +
      "        FROM M_ATTRIBUTEVALUE" +
      "        WHERE M_ATTRIBUTE_ID = ?" +
      "        AND ISACTIVE='Y'" +
      "        ORDER BY NAME";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributeId);

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
        AttributeSetInstanceData objectAttributeSetInstanceData = new AttributeSetInstanceData();
        objectAttributeSetInstanceData.value = UtilSql.getValue(result, "VALUE");
        objectAttributeSetInstanceData.name = UtilSql.getValue(result, "NAME");
        objectAttributeSetInstanceData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAttributeSetInstanceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttributeSetInstanceData);
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
    AttributeSetInstanceData objectAttributeSetInstanceData[] = new AttributeSetInstanceData[vector.size()];
    vector.copyInto(objectAttributeSetInstanceData);
    return(objectAttributeSetInstanceData);
  }

  public static String selectDescription(ConnectionProvider connectionProvider, String mAttributesetinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT DESCRIPTION FROM M_ATTRIBUTESETINSTANCE WHERE M_ATTRIBUTESETINSTANCE_ID = ?";

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

  public static String selectNextLot(ConnectionProvider connectionProvider, String mLotctlId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(TO_CHAR(PREFIX),'') || CURRENTNEXT || COALESCE(TO_CHAR(SUFFIX),'') AS TOTAL" +
      "        FROM M_LOTCTL " +
      "        WHERE M_LOTCTL_ID = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLotctlId);

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

  public static String selectNextSerNo(ConnectionProvider connectionProvider, String mSernoctlId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(TO_CHAR(PREFIX),'') || CURRENTNEXT || COALESCE(TO_CHAR(SUFFIX),'') AS TOTAL" +
      "        FROM M_SERNOCTL " +
      "        WHERE M_SERNOCTL_ID = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mSernoctlId);

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

  public static AttributeSetInstanceData[] selectProductAttr(ConnectionProvider connectionProvider, String mProductId)    throws ServletException {
    return selectProductAttr(connectionProvider, mProductId, 0, 0);
  }

  public static AttributeSetInstanceData[] selectProductAttr(ConnectionProvider connectionProvider, String mProductId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT m_attributeset_id, m_attributesetinstance_id FROM M_PRODUCT WHERE m_product_id=?";

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
        AttributeSetInstanceData objectAttributeSetInstanceData = new AttributeSetInstanceData();
        objectAttributeSetInstanceData.mAttributesetId = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
        objectAttributeSetInstanceData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectAttributeSetInstanceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttributeSetInstanceData);
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
    AttributeSetInstanceData objectAttributeSetInstanceData[] = new AttributeSetInstanceData[vector.size()];
    vector.copyInto(objectAttributeSetInstanceData);
    return(objectAttributeSetInstanceData);
  }

  public static String selectAttributeSet(ConnectionProvider connectionProvider, String mAttributesetinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT s.M_ATTRIBUTESET_ID" +
      "        FROM M_ATTRIBUTESETINSTANCE s" +
      "        WHERE s.M_ATTRIBUTESETINSTANCE_ID = ?";

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
        strReturn = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
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

  public static String isInstanceAttribute(ConnectionProvider connectionProvider, String mAttributesetId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (CASE A_S.ISLOCKABLE WHEN 'Y' THEN 1 ELSE (CASE A_S.ISLOT WHEN 'Y' THEN 1 ELSE (CASE A_S.ISSERNO WHEN 'Y' THEN 1 ELSE (CASE A_S.ISGUARANTEEDATE WHEN 'Y' THEN 1 ELSE " +
      "        (CASE (SELECT MAX(ISINSTANCEATTRIBUTE) FROM M_ATTRIBUTE, M_ATTRIBUTEUSE " +
      "                WHERE M_ATTRIBUTE.M_ATTRIBUTE_ID = M_ATTRIBUTEUSE.M_ATTRIBUTE_ID" +
      "                AND M_ATTRIBUTEUSE.M_ATTRIBUTESET_ID = A_S.M_ATTRIBUTESET_ID) WHEN 'Y' THEN 1 ELSE 0 END) END) END) END) END) AS TOTAL " +
      "        FROM M_ATTRIBUTESET A_S" +
      "        WHERE A_S.ISACTIVE = 'Y'" +
      "        AND A_S.M_ATTRIBUTESET_ID = ? ";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);

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
}
