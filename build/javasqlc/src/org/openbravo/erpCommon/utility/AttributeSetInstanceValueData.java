//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class AttributeSetInstanceValueData implements FieldProvider {
static Logger log4j = Logger.getLogger(AttributeSetInstanceValueData.class);
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

  public static AttributeSetInstanceValueData[] select(ConnectionProvider connectionProvider, String mAttributesetId)    throws ServletException {
    return select(connectionProvider, mAttributesetId, 0, 0);
  }

  public static AttributeSetInstanceValueData[] select(ConnectionProvider connectionProvider, String mAttributesetId, int firstRegister, int numberRegisters)    throws ServletException {
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
        AttributeSetInstanceValueData objectAttributeSetInstanceValueData = new AttributeSetInstanceValueData();
        objectAttributeSetInstanceValueData.mAttributesetId = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
        objectAttributeSetInstanceValueData.name = UtilSql.getValue(result, "NAME");
        objectAttributeSetInstanceValueData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAttributeSetInstanceValueData.guaranteedays = UtilSql.getValue(result, "GUARANTEEDAYS");
        objectAttributeSetInstanceValueData.isguaranteedate = UtilSql.getValue(result, "ISGUARANTEEDATE");
        objectAttributeSetInstanceValueData.islot = UtilSql.getValue(result, "ISLOT");
        objectAttributeSetInstanceValueData.isserno = UtilSql.getValue(result, "ISSERNO");
        objectAttributeSetInstanceValueData.mLotctlId = UtilSql.getValue(result, "M_LOTCTL_ID");
        objectAttributeSetInstanceValueData.mSernoctlId = UtilSql.getValue(result, "M_SERNOCTL_ID");
        objectAttributeSetInstanceValueData.islist = UtilSql.getValue(result, "ISLIST");
        objectAttributeSetInstanceValueData.elementname = UtilSql.getValue(result, "ELEMENTNAME");
        objectAttributeSetInstanceValueData.mAttributeId = UtilSql.getValue(result, "M_ATTRIBUTE_ID");
        objectAttributeSetInstanceValueData.islockable = UtilSql.getValue(result, "ISLOCKABLE");
        objectAttributeSetInstanceValueData.isinstanceattribute = UtilSql.getValue(result, "ISINSTANCEATTRIBUTE");
        objectAttributeSetInstanceValueData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectAttributeSetInstanceValueData.guaranteedate = UtilSql.getValue(result, "GUARANTEEDATE");
        objectAttributeSetInstanceValueData.lot = UtilSql.getValue(result, "LOT");
        objectAttributeSetInstanceValueData.serno = UtilSql.getValue(result, "SERNO");
        objectAttributeSetInstanceValueData.mAttributevalueId = UtilSql.getValue(result, "M_ATTRIBUTEVALUE_ID");
        objectAttributeSetInstanceValueData.value = UtilSql.getValue(result, "VALUE");
        objectAttributeSetInstanceValueData.ismandatory = UtilSql.getValue(result, "ISMANDATORY");
        objectAttributeSetInstanceValueData.islocked = UtilSql.getValue(result, "ISLOCKED");
        objectAttributeSetInstanceValueData.lockDescription = UtilSql.getValue(result, "LOCK_DESCRIPTION");
        objectAttributeSetInstanceValueData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttributeSetInstanceValueData);
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
    AttributeSetInstanceValueData objectAttributeSetInstanceValueData[] = new AttributeSetInstanceValueData[vector.size()];
    vector.copyInto(objectAttributeSetInstanceValueData);
    return(objectAttributeSetInstanceValueData);
  }

  public static String hasIdentical(ConnectionProvider connectionProvider, String description, String mAttributeSet)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT m_attributesetinstance_id " +
      "        FROM M_AttributeSetInstance " +
      "        WHERE (upper(description) = upper(?) OR ((description IS NULL) AND (? IS NULL)))" +
      "        AND M_AttributeSet_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributeSet);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
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

  public static String selectNextSerNo(Connection conn, ConnectionProvider connectionProvider, String mSernoctlId)    throws ServletException {
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
    st = connectionProvider.getPreparedStatement(conn, strSql);
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
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

  public static String selectAttributeValue(ConnectionProvider connectionProvider, String mAttributevalueId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NAME FROM M_ATTRIBUTEVALUE WHERE M_ATTRIBUTEVALUE_ID=?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributevalueId);

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

  public static int insert(Connection conn, ConnectionProvider connectionProvider, String mAttributeinstanceId, String mAttributesetinstanceId, String mAttributeId, String adClientId, String adOrgId, String adUserId, String mAttributevalueId, String value)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO M_ATTRIBUTEINSTANCE (M_ATTRIBUTEINSTANCE_ID, M_ATTRIBUTESETINSTANCE_ID, M_ATTRIBUTE_ID, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, " +
      "        CREATEDBY, UPDATED, UPDATEDBY, M_ATTRIBUTEVALUE_ID, VALUE) " +
      "        VALUES ( ?, ?, ?, ?, ?, 'Y', now(), ?, now(), ?, ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributeinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributevalueId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);

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

  public static int update(Connection conn, ConnectionProvider connectionProvider, String adUserId, String mAttributevalueId, String value, String mAttributesetinstanceId, String mAttributeId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_ATTRIBUTEINSTANCE SET UPDATED=now(), UPDATEDBY = ?, M_ATTRIBUTEVALUE_id = ?, VALUE=? " +
      "        WHERE M_ATTRIBUTESETINSTANCE_ID = ? " +
      "        AND M_ATTRIBUTE_ID = ? " +
      "        AND ISACTIVE = 'Y'";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributevalueId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributeId);

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

  public static int insertHeader(Connection conn, ConnectionProvider connectionProvider, String mAttributesetinstanceId, String adClientId, String adOrgId, String adUserId, String mAttributesetId, String serno, String lot, String guaranteedate, String mLotId, String islocked, String lockDescription)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO M_ATTRIBUTESETINSTANCE (M_ATTRIBUTESETINSTANCE_ID, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, " +
      "        UPDATED, UPDATEDBY, M_ATTRIBUTESET_ID, SERNO, LOT, GUARANTEEDATE, M_LOT_ID, ISLOCKED, LOCK_DESCRIPTION) " +
      "        VALUES ( ?, ?, ?, 'Y', now(), ?, now(), ?, ?, ?, ?, TO_DATE(?), ?, ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lot);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLotId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, islocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockDescription);

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

  public static int updateHeader(Connection conn, ConnectionProvider connectionProvider, String adUserId, String mAttributesetId, String serno, String lot, String guaranteedate, String mLotId, String islocked, String lockDescription, String mAttributesetinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_ATTRIBUTESETINSTANCE SET UPDATED=now(), UPDATEDBY = ?, M_ATTRIBUTESET_ID = ?, SERNO=?, LOT=?, GUARANTEEDATE=TO_DATE(?), " +
      "        M_LOT_ID = ?, ISLOCKED = ?, LOCK_DESCRIPTION = ? " +
      "        WHERE M_ATTRIBUTESETINSTANCE_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lot);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLotId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, islocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lockDescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);

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

  public static int updateHeaderDescription(Connection conn, ConnectionProvider connectionProvider, String adUserId, String description, String mAttributesetinstanceId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_ATTRIBUTESETINSTANCE SET UPDATED=now(), UPDATEDBY = ?, DESCRIPTION=? " +
      "        WHERE M_ATTRIBUTESETINSTANCE_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);

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

  public static int updateLotSequence(Connection conn, ConnectionProvider connectionProvider, String adUserId, String mLotctlId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_LOTCTL SET UPDATED=now(), UPDATEDBY = ?, CURRENTNEXT=(CURRENTNEXT + INCREMENTNO) " +
      "        WHERE M_LOTCTL_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLotctlId);

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

  public static int updateSerNoSequence(Connection conn, ConnectionProvider connectionProvider, String adUserId, String mSernoctlId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_SERNOCTL SET UPDATED=now(), UPDATEDBY = ?, CURRENTNEXT=(CURRENTNEXT + INCREMENTNO) " +
      "        WHERE M_SERNOCTL_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mSernoctlId);

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
