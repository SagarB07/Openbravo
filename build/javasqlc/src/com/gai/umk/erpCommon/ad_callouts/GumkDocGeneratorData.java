//Sqlc generated V1.O00-1
package com.gai.umk.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class GumkDocGeneratorData implements FieldProvider {
static Logger log4j = Logger.getLogger(GumkDocGeneratorData.class);
  private String InitRecordNumber="0";
  public String documentno;
  public String gname;
  public String docsubtypeso;
  public String isdocnocontrolled;
  public String currentnext;
  public String currentnextsys;
  public String name;
  public String adSequenceId;
  public String issotrx;
  public String suffix;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("GNAME"))
      return gname;
    else if (fieldName.equalsIgnoreCase("DOCSUBTYPESO"))
      return docsubtypeso;
    else if (fieldName.equalsIgnoreCase("ISDOCNOCONTROLLED"))
      return isdocnocontrolled;
    else if (fieldName.equalsIgnoreCase("CURRENTNEXT"))
      return currentnext;
    else if (fieldName.equalsIgnoreCase("CURRENTNEXTSYS"))
      return currentnextsys;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("AD_SEQUENCE_ID") || fieldName.equals("adSequenceId"))
      return adSequenceId;
    else if (fieldName.equalsIgnoreCase("ISSOTRX"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("SUFFIX"))
      return suffix;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
seelct documentno
 */
  public static GumkDocGeneratorData[] selectDoc(ConnectionProvider connectionProvider, String cDoctypeId)    throws ServletException {
    return selectDoc(connectionProvider, cDoctypeId, 0, 0);
  }

/**
seelct documentno
 */
  public static GumkDocGeneratorData[] selectDoc(ConnectionProvider connectionProvider, String cDoctypeId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT '' as DOCUMENTNO , '' as GName," +
      "        COALESCE(d.DocSubTypeSO, '--') as DocSubTypeSO," +
      "        d.IsDocNoControlled, s.CurrentNext, s.CurrentNextSys, d.name," +
      "        s.AD_Sequence_ID, d.IsSOTrx, s.suffix" +
      "        FROM C_DocType d left join AD_Sequence s on d.DocNoSequence_ID=s.AD_Sequence_ID" +
      "        WHERE C_DocType_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);

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
        GumkDocGeneratorData objectGumkDocGeneratorData = new GumkDocGeneratorData();
        objectGumkDocGeneratorData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectGumkDocGeneratorData.gname = UtilSql.getValue(result, "GNAME");
        objectGumkDocGeneratorData.docsubtypeso = UtilSql.getValue(result, "DOCSUBTYPESO");
        objectGumkDocGeneratorData.isdocnocontrolled = UtilSql.getValue(result, "ISDOCNOCONTROLLED");
        objectGumkDocGeneratorData.currentnext = UtilSql.getValue(result, "CURRENTNEXT");
        objectGumkDocGeneratorData.currentnextsys = UtilSql.getValue(result, "CURRENTNEXTSYS");
        objectGumkDocGeneratorData.name = UtilSql.getValue(result, "NAME");
        objectGumkDocGeneratorData.adSequenceId = UtilSql.getValue(result, "AD_SEQUENCE_ID");
        objectGumkDocGeneratorData.issotrx = UtilSql.getValue(result, "ISSOTRX");
        objectGumkDocGeneratorData.suffix = UtilSql.getValue(result, "SUFFIX");
        objectGumkDocGeneratorData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGumkDocGeneratorData);
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
    GumkDocGeneratorData objectGumkDocGeneratorData[] = new GumkDocGeneratorData[vector.size()];
    vector.copyInto(objectGumkDocGeneratorData);
    return(objectGumkDocGeneratorData);
  }

/**
Select Document No
 */
  public static GumkDocGeneratorData[] selectUmk(ConnectionProvider connectionProvider, String gumkUmkId)    throws ServletException {
    return selectUmk(connectionProvider, gumkUmkId, 0, 0);
  }

/**
Select Document No
 */
  public static GumkDocGeneratorData[] selectUmk(ConnectionProvider connectionProvider, String gumkUmkId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT GU.Documentno, CD.Name as name" +
      "        FROM Gumk_Umk GU,C_DocType CD" +
      "        WHERE GU.C_DocType_ID=CD.C_DocType_ID" +
      "        AND Gumk_Umk_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gumkUmkId);

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
        GumkDocGeneratorData objectGumkDocGeneratorData = new GumkDocGeneratorData();
        objectGumkDocGeneratorData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectGumkDocGeneratorData.name = UtilSql.getValue(result, "NAME");
        objectGumkDocGeneratorData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectGumkDocGeneratorData);
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
    GumkDocGeneratorData objectGumkDocGeneratorData[] = new GumkDocGeneratorData[vector.size()];
    vector.copyInto(objectGumkDocGeneratorData);
    return(objectGumkDocGeneratorData);
  }

/**
Select Document No
 */
  public static String selectWindow(ConnectionProvider connectionProvider, String adWindowId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT Name" +
      "        FROM AD_Window" +
      "        WHERE AD_Window_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adWindowId);

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
