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

class DocGLJournalData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocGLJournalData.class);
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String documentno;
  public String dateacct;
  public String datedoc;
  public String cCurrencyId;
  public String cDoctypeId;
  public String posted;
  public String postingtype;
  public String isopening;
  public String cCampaignId;
  public String cProjectId;
  public String user1Id;
  public String user2Id;
  public String cCostcenterId;
  public String aAssetId;
  public String cBpartnerId;
  public String mProductId;
  public String period;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("DATEDOC"))
      return datedoc;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("POSTINGTYPE"))
      return postingtype;
    else if (fieldName.equalsIgnoreCase("ISOPENING"))
      return isopening;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
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
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("PERIOD"))
      return period;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocGLJournalData[] select(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return select(connectionProvider, client, id, 0, 0);
  }

  public static DocGLJournalData[] select(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT G.AD_CLIENT_ID, G.AD_ORG_ID, G.DOCUMENTNO, G.DATEACCT, G.DATEDOC," +
      "        G.C_CURRENCY_ID, G.C_DOCTYPE_ID, G.POSTED, G.POSTINGTYPE, G.ISOPENING," +
      "        G.C_CAMPAIGN_ID, G.C_PROJECT_ID, G.USER1_ID, G.USER2_ID, G.C_COSTCENTER_ID," +
      "        G.A_ASSET_ID, G.C_BPARTNER_ID, G.M_PRODUCT_ID, G.C_PERIOD_ID AS PERIOD" +
      "        FROM GL_JOURNAL G" +
      "        WHERE AD_CLIENT_ID=?" +
      "        AND GL_JOURNAL_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

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
        DocGLJournalData objectDocGLJournalData = new DocGLJournalData();
        objectDocGLJournalData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocGLJournalData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocGLJournalData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocGLJournalData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocGLJournalData.datedoc = UtilSql.getDateValue(result, "DATEDOC", "dd-MM-yyyy");
        objectDocGLJournalData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocGLJournalData.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectDocGLJournalData.posted = UtilSql.getValue(result, "POSTED");
        objectDocGLJournalData.postingtype = UtilSql.getValue(result, "POSTINGTYPE");
        objectDocGLJournalData.isopening = UtilSql.getValue(result, "ISOPENING");
        objectDocGLJournalData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocGLJournalData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocGLJournalData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocGLJournalData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocGLJournalData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectDocGLJournalData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectDocGLJournalData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectDocGLJournalData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectDocGLJournalData.period = UtilSql.getValue(result, "PERIOD");
        objectDocGLJournalData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocGLJournalData);
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
    DocGLJournalData objectDocGLJournalData[] = new DocGLJournalData[vector.size()];
    vector.copyInto(objectDocGLJournalData);
    return(objectDocGLJournalData);
  }

  public static String selectAcctSchema(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_ACCTSCHEMA_ID" +
      "        FROM GL_JOURNAL G" +
      "        WHERE AD_CLIENT_ID=?" +
      "        AND GL_JOURNAL_ID=?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_ACCTSCHEMA_ID");
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

  public static DocGLJournalData[] periodOpen(ConnectionProvider connectionProvider, String period)    throws ServletException {
    return periodOpen(connectionProvider, period, 0, 0);
  }

  public static DocGLJournalData[] periodOpen(ConnectionProvider connectionProvider, String period, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select max(c_period.c_period_id) as period" +
      "      from c_period, c_periodcontrol" +
      "      where c_period.c_period_id = c_periodcontrol.c_period_id" +
      "      and c_periodcontrol.docbasetype = 'GLJ'" +
      "      and c_periodcontrol.periodstatus = 'O'" +
      "      and c_periodcontrol.c_period_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, period);

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
        DocGLJournalData objectDocGLJournalData = new DocGLJournalData();
        objectDocGLJournalData.period = UtilSql.getValue(result, "PERIOD");
        objectDocGLJournalData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocGLJournalData);
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
    DocGLJournalData objectDocGLJournalData[] = new DocGLJournalData[vector.size()];
    vector.copyInto(objectDocGLJournalData);
    return(objectDocGLJournalData);
  }
}
