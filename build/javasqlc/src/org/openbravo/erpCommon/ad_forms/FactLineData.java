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

class FactLineData implements FieldProvider {
static Logger log4j = Logger.getLogger(FactLineData.class);
  private String InitRecordNumber="0";
  public String location;
  public String org;
  public String salesregion;
  public String unearnedrevenue;
  public String account;
  public String value;
  public String description;
  public String iscashflow;
  public String iscashflowyes;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("LOCATION"))
      return location;
    else if (fieldName.equalsIgnoreCase("ORG"))
      return org;
    else if (fieldName.equalsIgnoreCase("SALESREGION"))
      return salesregion;
    else if (fieldName.equalsIgnoreCase("UNEARNEDREVENUE"))
      return unearnedrevenue;
    else if (fieldName.equalsIgnoreCase("ACCOUNT"))
      return account;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("ISCASHFLOW"))
      return iscashflow;
    else if (fieldName.equalsIgnoreCase("ISCASHFLOWYES"))
      return iscashflowyes;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static FactLineData[] select(ConnectionProvider connectionProvider, String AD_Org_ID)    throws ServletException {
    return select(connectionProvider, AD_Org_ID, 0, 0);
  }

  public static FactLineData[] select(ConnectionProvider connectionProvider, String AD_Org_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_Location_ID as location, '' AS ORG, '' AS SALESREGION, '' AS UNEARNEDREVENUE, '' AS ACCOUNT, '' as value," +
      "        '' AS DESCRIPTION, '' AS isCashflow, '' AS isCashflowYes" +
      "        FROM AD_OrgInfo WHERE AD_Org_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Org_ID);

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
        FactLineData objectFactLineData = new FactLineData();
        objectFactLineData.location = UtilSql.getValue(result, "LOCATION");
        objectFactLineData.org = UtilSql.getValue(result, "ORG");
        objectFactLineData.salesregion = UtilSql.getValue(result, "SALESREGION");
        objectFactLineData.unearnedrevenue = UtilSql.getValue(result, "UNEARNEDREVENUE");
        objectFactLineData.account = UtilSql.getValue(result, "ACCOUNT");
        objectFactLineData.value = UtilSql.getValue(result, "VALUE");
        objectFactLineData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectFactLineData.iscashflow = UtilSql.getValue(result, "ISCASHFLOW");
        objectFactLineData.iscashflowyes = UtilSql.getValue(result, "ISCASHFLOWYES");
        objectFactLineData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFactLineData);
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
    FactLineData objectFactLineData[] = new FactLineData[vector.size()];
    vector.copyInto(objectFactLineData);
    return(objectFactLineData);
  }

  public static FactLineData[] selectOrg(ConnectionProvider connectionProvider, String M_Locator_ID, String AD_Client_ID)    throws ServletException {
    return selectOrg(connectionProvider, M_Locator_ID, AD_Client_ID, 0, 0);
  }

  public static FactLineData[] selectOrg(ConnectionProvider connectionProvider, String M_Locator_ID, String AD_Client_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_Org_ID as org FROM M_Locator WHERE M_Locator_ID=? AND AD_Client_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Locator_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Client_ID);

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
        FactLineData objectFactLineData = new FactLineData();
        objectFactLineData.org = UtilSql.getValue(result, "ORG");
        objectFactLineData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFactLineData);
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
    FactLineData objectFactLineData[] = new FactLineData[vector.size()];
    vector.copyInto(objectFactLineData);
    return(objectFactLineData);
  }

  public static FactLineData[] selectLocation(ConnectionProvider connectionProvider, String C_BPartner_Location_ID)    throws ServletException {
    return selectLocation(connectionProvider, C_BPartner_Location_ID, 0, 0);
  }

  public static FactLineData[] selectLocation(ConnectionProvider connectionProvider, String C_BPartner_Location_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_Location_ID as location FROM C_BPartner_Location WHERE C_BPartner_Location_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_Location_ID);

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
        FactLineData objectFactLineData = new FactLineData();
        objectFactLineData.location = UtilSql.getValue(result, "LOCATION");
        objectFactLineData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFactLineData);
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
    FactLineData objectFactLineData[] = new FactLineData[vector.size()];
    vector.copyInto(objectFactLineData);
    return(objectFactLineData);
  }

  public static FactLineData[] selectSalesRegion(ConnectionProvider connectionProvider, String C_BPartner_Location_ID)    throws ServletException {
    return selectSalesRegion(connectionProvider, C_BPartner_Location_ID, 0, 0);
  }

  public static FactLineData[] selectSalesRegion(ConnectionProvider connectionProvider, String C_BPartner_Location_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_SalesRegion_ID as salesregion FROM C_BPartner_Location WHERE C_BPartner_Location_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_Location_ID);

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
        FactLineData objectFactLineData = new FactLineData();
        objectFactLineData.salesregion = UtilSql.getValue(result, "SALESREGION");
        objectFactLineData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFactLineData);
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
    FactLineData objectFactLineData[] = new FactLineData[vector.size()];
    vector.copyInto(objectFactLineData);
    return(objectFactLineData);
  }

  public static int insertFactAct(Connection conn, ConnectionProvider connectionProvider, String m_Fact_Acct_ID, String AD_Client_ID, String AD_Org_ID, String AD_User_ID, String m_C_AcctSchema_ID, String Account_ID, String AccountValue, String AccountDescription, String DateDoc, String DateAcct, String C_Period_ID, String m_AD_Table_ID, String m_Record_ID, String m_Line_ID, String m_GL_Category_ID, String C_Tax_ID, String m_PostingType, String m_C_Currency_ID, String m_AmtSourceDr, String m_AmtSourceCr, String m_AmtAcctDr, String m_AmtAcctCr, String C_UOM_ID, String Qty, String m_M_Locator_ID, String M_Product_ID, String C_BPartner_ID, String AD_OrgTrx_ID, String C_LocFrom_ID, String C_LocTo_ID, String C_SalesRegion_ID, String C_Project_ID, String C_Campaign_ID, String C_Activity_ID, String User1_ID, String User2_ID, String description, String m_Fact_Acct_Group_ID, String seqNo, String DocBaseType, String Record_ID2, String aAssetId, String cWithholdingId, String cDocTypeId, String cCostcenterId, String FactAcctType, String emGaiDocumentno, String emGcsIsCashflow)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO Fact_Acct" +
      "          (Fact_Acct_ID,AD_Client_ID,AD_Org_ID,IsActive,Created,CreatedBy,Updated,UpdatedBy," +
      "        C_AcctSchema_ID,Account_ID, AcctValue, AcctDescription,DateTrx,DateAcct," +
      "        C_Period_ID,AD_Table_ID,Record_ID,Line_ID," +
      "        GL_Category_ID,C_Tax_ID,PostingType,C_Currency_ID," +
      "        AmtSourceDR,AmtSourceCR,AmtAcctDR,AmtAcctCR," +
      "        C_UOM_ID,Qty,M_Locator_ID,M_Product_ID,C_BPartner_ID,AD_OrgTrx_ID,C_LocFrom_ID,C_LocTo_ID,C_SalesRegion_ID," +
      "        C_Project_ID,C_Campaign_ID,C_Activity_ID,User1_ID,User2_ID,Description, Fact_Acct_Group_ID, SeqNo, DocBaseType," +
      "        Record_ID2, A_ASSET_ID, C_WithHolding_ID, C_DocType_ID, C_Costcenter_ID, FACTACCTTYPE, em_gai_documentno," +
      "        EM_Gcs_IsCashflow)" +
      "        VALUES" +
      "          (?, ?, ?,'Y',now(),?,now(),?," +
      "           ?, ?, ?, ?, TO_DATE(?), TO_DATE(?)," +
      "           ?, ?, ?, ?," +
      "           ?, ?, ?, ?," +
      "           TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?)," +
      "           ?, TO_NUMBER(?), ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?, ?, TO_NUMBER(?), ?," +
      "           ?, ?, ?, ?, ?, ?, ?, ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_Fact_Acct_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Client_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_Org_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_User_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_User_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_C_AcctSchema_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Account_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AccountValue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AccountDescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateDoc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DateAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Period_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_AD_Table_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_Record_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_Line_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_GL_Category_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Tax_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_PostingType);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_C_Currency_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_AmtSourceDr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_AmtSourceCr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_AmtAcctDr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_AmtAcctCr);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_UOM_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_M_Locator_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_OrgTrx_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_LocFrom_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_LocTo_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_SalesRegion_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Project_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Campaign_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Activity_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, User1_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, User2_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, m_Fact_Acct_Group_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqNo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, DocBaseType);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Record_ID2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cWithholdingId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDocTypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FactAcctType);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGaiDocumentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGcsIsCashflow);

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

  public static int updateDateBalanced(Connection conn, ConnectionProvider connectionProvider, String recordID2)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      update Fact_Acct set Datebalanced=(select max(financialm1_.DateAcct) " +
      "                                   from Fact_Acct financialm1_ " +
      "                                   where financialm1_.Record_ID2=Fact_Acct.Record_ID2 " +
      "                                   and financialm1_.C_AcctSchema_ID=Fact_Acct.C_AcctSchema_ID" +
      "                                   and financialm1_.Account_ID=Fact_Acct.Account_ID" +
      "                                   group by financialm1_.Record_ID2 " +
      "                                   having sum(financialm1_.AmtAcctCr-financialm1_.AmtAcctDr)=0) " +
      "        where " +
      "        Record_ID2 = ?" +
      "        and Datebalanced is null " +
      "        and exists (select 1 " +
      "                       from Fact_Acct financialm2_ " +
      "                       where financialm2_.Record_ID2=Fact_Acct.Record_ID2" +
      "                       and financialm2_.C_AcctSchema_ID=Fact_Acct.C_AcctSchema_ID " +
      "                       and financialm2_.Account_ID=Fact_Acct.Account_ID" +
      "                       group by financialm2_.Record_ID2 " +
      "                       having sum(financialm2_.AmtAcctCr-financialm2_.AmtAcctDr)=0)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, recordID2);

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

  public static int updateFactAcct(Connection conn, ConnectionProvider connectionProvider, String table, String record)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE Fact_Acct SET FACTACCTTYPE = 'O'" +
      "        WHERE AD_TABLE_ID = ?" +
      "        AND RECORD_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, table);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, record);

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

  public static FactLineData[] selectLocationFromLocator(ConnectionProvider connectionProvider, String M_Locator_ID)    throws ServletException {
    return selectLocationFromLocator(connectionProvider, M_Locator_ID, 0, 0);
  }

  public static FactLineData[] selectLocationFromLocator(ConnectionProvider connectionProvider, String M_Locator_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT w.C_Location_ID as location FROM M_Warehouse w, M_Locator l" +
      "        WHERE w.M_Warehouse_ID=l.M_Warehouse_ID AND l.M_Locator_ID=?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Locator_ID);

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
        FactLineData objectFactLineData = new FactLineData();
        objectFactLineData.location = UtilSql.getValue(result, "LOCATION");
        objectFactLineData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFactLineData);
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
    FactLineData objectFactLineData[] = new FactLineData[vector.size()];
    vector.copyInto(objectFactLineData);
    return(objectFactLineData);
  }

  public static FactLineData[] selectAccountValue(ConnectionProvider connectionProvider, String cElementvalueId)    throws ServletException {
    return selectAccountValue(connectionProvider, cElementvalueId, 0, 0);
  }

  public static FactLineData[] selectAccountValue(ConnectionProvider connectionProvider, String cElementvalueId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select value, name as description from c_elementvalue where c_elementvalue_id =?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cElementvalueId);

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
        FactLineData objectFactLineData = new FactLineData();
        objectFactLineData.value = UtilSql.getValue(result, "VALUE");
        objectFactLineData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectFactLineData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFactLineData);
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
    FactLineData objectFactLineData[] = new FactLineData[vector.size()];
    vector.copyInto(objectFactLineData);
    return(objectFactLineData);
  }

  public static String selectIsCashflow(ConnectionProvider connectionProvider, String cElementvalueId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT EM_GCS_ISCASHFLOW as isCashflow FROM c_elementvalue where c_elementvalue_id=?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cElementvalueId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISCASHFLOW");
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

  public static FactLineData[] selectCashflowYes(ConnectionProvider connectionProvider, String table, String record)    throws ServletException {
    return selectCashflowYes(connectionProvider, table, record, 0, 0);
  }

  public static FactLineData[] selectCashflowYes(ConnectionProvider connectionProvider, String table, String record, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT EM_GCS_ISCASHFLOW as isCashflowYes " +
      "        FROM Fact_Acct " +
      "        WHERE AD_TABLE_ID = ?" +
      "        AND RECORD_ID = ?" +
      "        AND EM_GCS_ISCASHFLOW = 'Y'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, table);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, record);

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
        FactLineData objectFactLineData = new FactLineData();
        objectFactLineData.iscashflowyes = UtilSql.getValue(result, "ISCASHFLOWYES");
        objectFactLineData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFactLineData);
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
    FactLineData objectFactLineData[] = new FactLineData[vector.size()];
    vector.copyInto(objectFactLineData);
    return(objectFactLineData);
  }

  public static int updateFACashflow(Connection conn, ConnectionProvider connectionProvider, String table, String record)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE Fact_Acct SET EM_Gcs_IsCashflow = 'Y'" +
      "        WHERE AD_TABLE_ID = ?" +
      "        AND RECORD_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, table);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, record);

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
