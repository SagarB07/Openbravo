//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_process;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class ImportTaxData implements FieldProvider {
static Logger log4j = Logger.getLogger(ImportTaxData.class);
  private String InitRecordNumber="0";
  public String iTaxId;
  public String cTaxId;
  public String tName;
  public String cTaxcategoryId;
  public String tcName;
  public String cBpTaxcategoryId;
  public String bptcName;
  public String parentTaxId;
  public String parentName;
  public String cCountryId;
  public String cRegionId;
  public String toCountryId;
  public String toRegionId;
  public String n;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("I_TAX_ID") || fieldName.equals("iTaxId"))
      return iTaxId;
    else if (fieldName.equalsIgnoreCase("C_TAX_ID") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("T_NAME") || fieldName.equals("tName"))
      return tName;
    else if (fieldName.equalsIgnoreCase("C_TAXCATEGORY_ID") || fieldName.equals("cTaxcategoryId"))
      return cTaxcategoryId;
    else if (fieldName.equalsIgnoreCase("TC_NAME") || fieldName.equals("tcName"))
      return tcName;
    else if (fieldName.equalsIgnoreCase("C_BP_TAXCATEGORY_ID") || fieldName.equals("cBpTaxcategoryId"))
      return cBpTaxcategoryId;
    else if (fieldName.equalsIgnoreCase("BPTC_NAME") || fieldName.equals("bptcName"))
      return bptcName;
    else if (fieldName.equalsIgnoreCase("PARENT_TAX_ID") || fieldName.equals("parentTaxId"))
      return parentTaxId;
    else if (fieldName.equalsIgnoreCase("PARENT_NAME") || fieldName.equals("parentName"))
      return parentName;
    else if (fieldName.equalsIgnoreCase("C_COUNTRY_ID") || fieldName.equals("cCountryId"))
      return cCountryId;
    else if (fieldName.equalsIgnoreCase("C_REGION_ID") || fieldName.equals("cRegionId"))
      return cRegionId;
    else if (fieldName.equalsIgnoreCase("TO_COUNTRY_ID") || fieldName.equals("toCountryId"))
      return toCountryId;
    else if (fieldName.equalsIgnoreCase("TO_REGION_ID") || fieldName.equals("toRegionId"))
      return toRegionId;
    else if (fieldName.equalsIgnoreCase("N"))
      return n;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ImportTaxData[] select(ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    return select(connectionProvider, ad_client_id, 0, 0);
  }

  public static ImportTaxData[] select(ConnectionProvider connectionProvider, String ad_client_id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT I_Tax_ID, C_Tax_ID, T_Name, C_TaxCategory_ID, TC_Name, C_BP_TaxCategory_ID, BPTC_Name," +
      "               parent_tax_id, parent_Name, C_Country_ID, C_Region_ID, TO_Country_Id, TO_Region_ID, " +
      "               '' as n" +
      "			  FROM I_Tax" +
      "			  WHERE I_IsImported='N'" +
      "        AND AD_Client_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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
        ImportTaxData objectImportTaxData = new ImportTaxData();
        objectImportTaxData.iTaxId = UtilSql.getValue(result, "I_TAX_ID");
        objectImportTaxData.cTaxId = UtilSql.getValue(result, "C_TAX_ID");
        objectImportTaxData.tName = UtilSql.getValue(result, "T_NAME");
        objectImportTaxData.cTaxcategoryId = UtilSql.getValue(result, "C_TAXCATEGORY_ID");
        objectImportTaxData.tcName = UtilSql.getValue(result, "TC_NAME");
        objectImportTaxData.cBpTaxcategoryId = UtilSql.getValue(result, "C_BP_TAXCATEGORY_ID");
        objectImportTaxData.bptcName = UtilSql.getValue(result, "BPTC_NAME");
        objectImportTaxData.parentTaxId = UtilSql.getValue(result, "PARENT_TAX_ID");
        objectImportTaxData.parentName = UtilSql.getValue(result, "PARENT_NAME");
        objectImportTaxData.cCountryId = UtilSql.getValue(result, "C_COUNTRY_ID");
        objectImportTaxData.cRegionId = UtilSql.getValue(result, "C_REGION_ID");
        objectImportTaxData.toCountryId = UtilSql.getValue(result, "TO_COUNTRY_ID");
        objectImportTaxData.toRegionId = UtilSql.getValue(result, "TO_REGION_ID");
        objectImportTaxData.n = UtilSql.getValue(result, "N");
        objectImportTaxData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportTaxData);
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
    ImportTaxData objectImportTaxData[] = new ImportTaxData[vector.size()];
    vector.copyInto(objectImportTaxData);
    return(objectImportTaxData);
  }

  public static String selectTaxCategoryId(ConnectionProvider connectionProvider, String name, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_TaxCategory_ID" +
      "			  FROM C_TaxCategory" +
      "			  WHERE Name = ?" +
      "        AND AD_Client_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_TAXCATEGORY_ID");
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

  public static String selectBPTaxCategoryId(ConnectionProvider connectionProvider, String name, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_BP_TaxCategory_ID" +
      "			  FROM C_BP_TaxCategory" +
      "			  WHERE Name = ?" +
      "        AND AD_Client_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_BP_TAXCATEGORY_ID");
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

  public static String selectTaxId(ConnectionProvider connectionProvider, String parentName, String name, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select t.c_tax_id" +
      "         from c_tax t left join c_tax t1 " +
      "                             on t.parent_tax_id = t1.c_tax_id " +
      "                            and t1.name = ? " +
      "        where t.name = ?" +
      "          and coalesce(to_char(t1.name),'.')=coalesce(to_char(?),'.')" +
      "          and t.ad_client_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_TAX_ID");
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

  public static int deleteOld(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      DELETE FROM I_Tax WHERE I_IsImported='Y'" +
      "      AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRecords(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax " +
      "        SET AD_Client_ID = COALESCE(AD_Client_ID, ?)," +
      "        AD_Org_ID = COALESCE(AD_Org_ID, '0')," +
      "        IsActive = COALESCE(IsActive, 'Y')," +
      "        Created = COALESCE(Created, now())," +
      "        CreatedBy = COALESCE(CreatedBy, '0')," +
      "        Updated = COALESCE(Updated, now())," +
      "        UpdatedBy = COALESCE(UpdatedBy, '0')," +
      "        I_ErrorMsg = NULL," +
      "        I_IsImported = 'N' " +
      "        WHERE I_IsImported<>'Y' OR I_IsImported IS NULL";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateTaxCategoryId(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET C_TaxCategory_ID=(" +
      "          SELECT C_TaxCategory_ID " +
      "          FROM C_TaxCategory C" +
      "			    WHERE I_Tax.TC_Name=C.Name" +
      "          AND C.AD_Client_ID=I_Tax.AD_Client_ID" +
      "        )" +
      "			  WHERE C_TaxCategory_ID IS NULL" +
      "        AND TC_Name IS NOT NULL" +
      "			  AND I_IsImported='N'" +
      "        AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateBPTaxCategoryId(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET C_BP_TaxCategory_ID=(" +
      "          SELECT C_BP_TaxCategory_ID " +
      "          FROM C_BP_TaxCategory C" +
      "			    WHERE I_Tax.BPTC_Name=C.Name" +
      "          AND C.AD_Client_ID=I_Tax.AD_Client_ID" +
      "        )" +
      "			  WHERE C_BP_TaxCategory_ID IS NULL" +
      "        AND BPTC_Name IS NOT NULL" +
      "			  AND I_IsImported='N'" +
      "        AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateTaxId(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET C_Tax_ID=(" +
      "          SELECT C_Tax_ID " +
      "          FROM C_Tax C" +
      "			    WHERE I_Tax.T_Name=C.Name" +
      "          AND C.AD_Client_ID=I_Tax.AD_Client_ID" +
      "        )" +
      "			  WHERE C_Tax_ID IS NULL" +
      "        AND T_Name IS NOT NULL" +
      "			  AND I_IsImported='N'" +
      "        AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateCountryFromId(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET C_Country_ID=(" +
      "          SELECT MAX(C_Country_ID) " +
      "            FROM C_Country c" +
      "  			   WHERE c.AD_Client_ID IN ('0', I_Tax.AD_Client_ID)" +
      "             AND  (UPPER(c.CountryCode) = UPPER(I_Tax.from_code_Country)" +
      "               OR  UPPER(c.Name) = UPPER(I_Tax.from_code_Country)))" +
      "			  WHERE C_Country_ID IS NULL" +
      "        AND from_code_Country IS NOT NULL" +
      "			  AND I_IsImported<>'Y'" +
      "        AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateCountryFromError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Country From, '" +
      "			  WHERE C_Country_ID IS NULL" +
      "          AND from_code_Country IS NOT NULL" +
      "  			  AND I_IsImported<>'Y'" +
      "          AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateCountryToId(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET TO_Country_ID=(" +
      "          SELECT MAX(C_Country_ID) " +
      "            FROM C_Country c" +
      "  			   WHERE c.AD_Client_ID IN ('0', I_Tax.AD_Client_ID)" +
      "             AND  (UPPER(c.CountryCode) = UPPER(I_Tax.to_code_Country)" +
      "               OR  UPPER(c.Name) = UPPER(I_Tax.to_code_Country)))" +
      "			  WHERE TO_Country_ID IS NULL" +
      "        AND to_code_Country IS NOT NULL" +
      "			  AND I_IsImported<>'Y'" +
      "        AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateCountryToError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Country To, '" +
      "			  WHERE TO_Country_ID IS NULL" +
      "          AND to_code_Country IS NOT NULL" +
      "  			  AND I_IsImported<>'Y'" +
      "          AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRegionFromId(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET C_Region_ID=(" +
      "          SELECT MAX(C_Region_ID) " +
      "            FROM C_Region r" +
      "  			   WHERE r.AD_Client_ID IN ('0', I_Tax.AD_Client_ID)" +
      "             AND  (UPPER(r.Value) = UPPER(I_Tax.from_code_region)" +
      "               OR  UPPER(r.Name) = UPPER(I_Tax.from_code_region)))" +
      "			  WHERE C_Region_ID IS NULL" +
      "        AND from_code_Region IS NOT NULL" +
      "			  AND I_IsImported<>'Y'" +
      "        AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRegionFromError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Region From, '" +
      "			  WHERE C_Region_ID IS NULL" +
      "          AND from_code_Region IS NOT NULL" +
      "  			  AND I_IsImported<>'Y'" +
      "          AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRegionToId(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET TO_Region_ID=(" +
      "          SELECT MAX(C_Region_ID) " +
      "            FROM C_Region r" +
      "  			   WHERE r.AD_Client_ID IN ('0', I_Tax.AD_Client_ID)" +
      "             AND  (UPPER(r.Value) = UPPER(I_Tax.to_code_region)" +
      "               OR  UPPER(r.Name) = UPPER(I_Tax.to_code_region)))" +
      "			  WHERE TO_Region_ID IS NULL" +
      "        AND to_code_Region IS NOT NULL" +
      "			  AND I_IsImported<>'Y'" +
      "        AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int updateRegionToError(Connection conn, ConnectionProvider connectionProvider, String ad_client_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'ERR=Invalid Region To, '" +
      "			  WHERE TO_Region_ID IS NULL" +
      "          AND to_code_Region IS NOT NULL" +
      "  			  AND I_IsImported<>'Y'" +
      "          AND AD_Client_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_client_id);

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

  public static int insertTaxCategory(Connection conn, ConnectionProvider connectionProvider, String CTaxCategoryID, String ITaxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  INSERT INTO C_TaxCategory " +
      "          (C_TaxCategory_ID, AD_Client_ID, AD_Org_ID," +
      "          IsActive,Created,CreatedBy,Updated,UpdatedBy," +
      "          Name, Description)" +
      "  		  SELECT ?, AD_Client_ID, AD_Org_ID," +
      "            'Y',now(),CreatedBy,now(),UpdatedBy," +
      "            TC_Name, TC_Description" +
      "			  	  FROM I_Tax" +
      "				    WHERE I_Tax_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CTaxCategoryID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);

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

  public static int updateTaxCategory(Connection conn, ConnectionProvider connectionProvider, String ITaxID, String CTaxCategoryID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  UPDATE C_TaxCategory " +
      "           SET updated = now()," +
      "               updatedBy = (SELECT updatedBy FROM I_Tax WHERE I_Tax_ID = ?)," +
      "               description = COALESCE((SELECT TC_Description FROM I_Tax WHERE I_Tax_ID = ?),description)" +
      "         WHERE C_TaxCategory_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CTaxCategoryID);

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

  public static int insertBPTaxCategory(Connection conn, ConnectionProvider connectionProvider, String CBPTaxCategoryID, String ITaxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  INSERT INTO C_BP_TaxCategory " +
      "          (C_BP_TaxCategory_ID, AD_Client_ID, AD_Org_ID," +
      "          IsActive,Created,CreatedBy,Updated,UpdatedBy," +
      "          Name, Description)" +
      "  		  SELECT ?, AD_Client_ID, AD_Org_ID," +
      "            'Y',now(),CreatedBy,now(),UpdatedBy," +
      "            BPTC_Name, BPTC_Description" +
      "			  	  FROM I_Tax" +
      "				    WHERE I_Tax_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CBPTaxCategoryID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);

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

  public static int updateBPTaxCategory(Connection conn, ConnectionProvider connectionProvider, String ITaxID, String CTaxCategoryID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  UPDATE C_BP_TaxCategory " +
      "           SET updated        = now()," +
      "               updatedBy      = (SELECT updatedBy FROM I_Tax WHERE I_Tax_ID = ?)," +
      "               description    = COALESCE((SELECT BPTC_Description FROM I_Tax WHERE I_Tax_ID = ?),description)" +
      "         WHERE C_BP_TaxCategory_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CTaxCategoryID);

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

  public static int insertDefaultTax(Connection conn, ConnectionProvider connectionProvider, String TaxID, String TaxCategory, String ITaxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  INSERT INTO C_Tax" +
      "        (C_Tax_ID, AD_Client_ID, AD_Org_ID," +
      "          IsActive,Created,CreatedBy,Updated,UpdatedBy," +
      "          Name, ValidFrom, Rate," +
      "          c_TaxCategory_ID)" +
      "        SELECT ?, AD_Client_ID, AD_Org_ID," +
      "            'Y',now(),CreatedBy,now(),UpdatedBy," +
      "            parent_Name, COALESCE(ValidFrom,now()), 0," +
      "            ?" +
      "			  	  FROM I_Tax" +
      "				    WHERE I_Tax_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, TaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, TaxCategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);

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

  public static int insertTax(Connection conn, ConnectionProvider connectionProvider, String TaxID, String TaxCategory, String BPTaxCategory, String ParentTax, String ITaxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  INSERT INTO C_Tax" +
      "        (C_Tax_ID, AD_Client_ID, AD_Org_ID," +
      "          IsActive,Created,CreatedBy,Updated,UpdatedBy," +
      "          Name, Description, ValidFrom, Rate," +
      "          c_TaxCategory_ID, c_BP_TaxCategory_ID, PARENT_TAX_ID," +
      "          TAXINDICATOR, ISSUMMARY, ISTAXEXEMPT,    " +
      "          SOPOTYPE, LINE, CASCADE)" +
      "  		  SELECT ?, AD_Client_ID, AD_Org_ID," +
      "            'Y',now(),CreatedBy,now(),UpdatedBy," +
      "            T_Name, T_Description, COALESCE(ValidFrom,now()), Rate," +
      "            ?, ?, ?," +
      "            TAXINDICATOR, COALESCE(ISSUMMARY,'N'), COALESCE(ISTAXEXEMPT,'N'),    " +
      "            COALESCE(SOPOTYPE,'B'), LINE, COALESCE(CASCADE,'N')" +
      "			  	  FROM I_Tax" +
      "				    WHERE I_Tax_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, TaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, TaxCategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, BPTaxCategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ParentTax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);

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

  public static int updateTax(Connection conn, ConnectionProvider connectionProvider, String ITaxID, String TaxCategoryID, String BPTaxCategoryID, String ParentTax, String CTaxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			  UPDATE C_Tax " +
      "           SET updated            = now()," +
      "               updatedBy          = (SELECT updatedBy FROM I_Tax WHERE I_Tax_ID = ?)," +
      "               description        = COALESCE((SELECT T_Description     FROM I_Tax WHERE I_Tax_ID = ?), description)," +
      "               ValidFrom          = COALESCE((SELECT ValidFrom         FROM I_Tax WHERE I_Tax_ID = ?), ValidFrom)," +
      "               Rate               = COALESCE((SELECT Rate              FROM I_Tax WHERE I_Tax_ID = ?), Rate)," +
      "               C_TaxCategory_ID   = COALESCE(?,C_TaxCategory_ID)," +
      "               C_BP_TaxCategory_ID= COALESCE(?,C_BP_TaxCategory_ID)," +
      "               Parent_Tax_ID      = COALESCE(?,Parent_Tax_ID)," +
      "               TAXINDICATOR       = COALESCE((SELECT TAXINDICATOR      FROM I_Tax WHERE I_Tax_ID = ?),TAXINDICATOR),   " +
      "               ISSUMMARY          = COALESCE((SELECT ISSUMMARY         FROM I_Tax WHERE I_Tax_ID = ?),ISSUMMARY),      " +
      "               ISTAXEXEMPT        = COALESCE((SELECT ISTAXEXEMPT       FROM I_Tax WHERE I_Tax_ID = ?),ISTAXEXEMPT),    " +
      "               SOPOTYPE           = COALESCE((SELECT SOPOTYPE          FROM I_Tax WHERE I_Tax_ID = ?),SOPOTYPE),       " +
      "               LINE               = COALESCE((SELECT LINE              FROM I_Tax WHERE I_Tax_ID = ?),LINE),           " +
      "               CASCADE            = COALESCE((SELECT CASCADE           FROM I_Tax WHERE I_Tax_ID = ?),CASCADE) " +
      "         WHERE C_Tax_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, TaxCategoryID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, BPTaxCategoryID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ParentTax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CTaxID);

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

  public static String hasLocation(Connection conn, ConnectionProvider connectionProvider, String taxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(*) AS N" +
      "          FROM C_TAX" +
      "         WHERE (C_Country_ID is not null" +
      "            OR C_Region_ID is not null" +
      "            OR TO_Country_ID is not null" +
      "            OR TO_Region_ID is not null)" +
      "           AND C_Tax_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "N");
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

  public static int updateTaxRegion(Connection conn, ConnectionProvider connectionProvider, String ItaxID, String taxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         UPDATE C_Tax" +
      "            SET C_Country_ID  = (SELECT C_Country_ID  FROM I_Tax WHERE I_Tax_ID = ?)," +
      "                C_Region_ID   = (SELECT C_Region_ID   FROM I_Tax WHERE I_Tax_ID = ?)," +
      "                TO_Country_ID = (SELECT TO_Country_ID FROM I_Tax WHERE I_Tax_ID = ?)," +
      "                TO_Region_ID  = (SELECT TO_Region_ID  FROM I_Tax WHERE I_Tax_ID = ?)" +
      "          WHERE C_Tax_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxID);

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

  public static String existsLocation(Connection conn, ConnectionProvider connectionProvider, String ItaxID, String CtaxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(*) AS N" +
      "          FROM (SELECT 1" +
      "                  FROM C_TAX" +
      "                 WHERE COALESCE(C_Country_ID,'0') =(SELECT COALESCE(C_Country_ID,'0')  FROM I_Tax WHERE I_Tax_ID = ?)" +
      "                   AND COALESCE(C_Region_ID,'0')  =(SELECT COALESCE(C_Region_ID,'0')   FROM I_Tax WHERE I_Tax_ID = ?)" +
      "                   AND COALESCE(TO_Country_ID,'0')=(SELECT COALESCE(TO_Country_ID,'0') FROM I_Tax WHERE I_Tax_ID = ?)" +
      "                   AND COALESCE(TO_Region_ID,'0') =(SELECT COALESCE(TO_Region_ID,'0')  FROM I_Tax WHERE I_Tax_ID = ?)" +
      "                   AND C_Tax_ID = ?" +
      "                UNION" +
      "                SELECT 1" +
      "                  FROM C_TAX_ZONE" +
      "                 WHERE COALESCE(FROM_Country_ID,'0')=(SELECT COALESCE(C_Country_ID,'0')   FROM I_Tax WHERE I_Tax_ID = ?)" +
      "                   AND COALESCE(FROM_Region_ID,'0') =(SELECT COALESCE(C_Region_ID,'0')    FROM I_Tax WHERE I_Tax_ID = ?)" +
      "                   AND COALESCE(TO_Country_ID,'0')  =(SELECT COALESCE(TO_Country_ID,'0')  FROM I_Tax WHERE I_Tax_ID = ?)" +
      "                   AND COALESCE(TO_Region_ID,'0')   =(SELECT COALESCE(TO_Region_ID,'0')   FROM I_Tax WHERE I_Tax_ID = ?)" +
      "                   AND C_Tax_ID = ?) AAA";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CtaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CtaxID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "N");
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

  public static int insertTaxZone(Connection conn, ConnectionProvider connectionProvider, String taxZoneID, String cTaxID, String ItaxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         INSERT INTO C_Tax_Zone" +
      "           (C_Tax_ZONE_ID, AD_Client_ID, AD_Org_ID," +
      "            IsActive,Created,CreatedBy,Updated,UpdatedBy," +
      "            C_Tax_ID, From_Country_ID, From_Region_ID," +
      "            TO_country_ID, To_region_ID)" +
      "         SELECT ?, AD_Client_ID, AD_Org_ID," +
      "                'Y',now(),CreatedBy,now(),UpdatedBy," +
      "                ?, C_Country_ID, C_Region_ID," +
      "                TO_Country_ID, To_Region_ID" +
      "           FROM I_Tax" +
      "          WHERE I_Tax_id = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxZoneID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ItaxID);

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

  public static int taxError(ConnectionProvider connectionProvider, String error, String i_tax_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||?" +
      "				WHERE I_Tax_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, error);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, i_tax_id);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int setImported(Connection conn, ConnectionProvider connectionProvider, String CTaxCategoryID, String ITaxID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Tax" +
      "        SET I_IsImported='Y', " +
      "            C_TaxCategory_id = ?," +
      "            Updated=now(), Processed='Y'" +
      "        WHERE I_Tax_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CTaxCategoryID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ITaxID);

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

  public static int updateSetImportedError(ConnectionProvider connectionProvider, String i_tax_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE I_Tax" +
      "			  SET I_IsImported='E', I_ErrorMsg=COALESCE(TO_CHAR(I_ErrorMsg),'')||'Set Imported, '" +
      "				WHERE I_Tax_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, i_tax_id);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateNotImported(ConnectionProvider connectionProvider, String adClientId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "				UPDATE I_Tax" +
      "        SET I_IsImported='N', Updated=now()" +
      "			  WHERE I_IsImported<>'Y'" +
      "        AND AD_CLIENT_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }
}
