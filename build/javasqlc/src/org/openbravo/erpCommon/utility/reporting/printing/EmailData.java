//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility.reporting.printing;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class EmailData implements FieldProvider {
static Logger log4j = Logger.getLogger(EmailData.class);
  private String InitRecordNumber="0";
  public String cPocEmailId;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String created;
  public String createdby;
  public String updated;
  public String updatedby;
  public String emailType;
  public String addressFrom;
  public String addressTo;
  public String addressCc;
  public String addressBcc;
  public String dateofemail;
  public String subject;
  public String body;
  public String cBpartnerId;
  public String adTableId;
  public String documentId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("C_POC_EMAIL_ID") || fieldName.equals("cPocEmailId"))
      return cPocEmailId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBY"))
      return createdby;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("EMAIL_TYPE") || fieldName.equals("emailType"))
      return emailType;
    else if (fieldName.equalsIgnoreCase("ADDRESS_FROM") || fieldName.equals("addressFrom"))
      return addressFrom;
    else if (fieldName.equalsIgnoreCase("ADDRESS_TO") || fieldName.equals("addressTo"))
      return addressTo;
    else if (fieldName.equalsIgnoreCase("ADDRESS_CC") || fieldName.equals("addressCc"))
      return addressCc;
    else if (fieldName.equalsIgnoreCase("ADDRESS_BCC") || fieldName.equals("addressBcc"))
      return addressBcc;
    else if (fieldName.equalsIgnoreCase("DATEOFEMAIL"))
      return dateofemail;
    else if (fieldName.equalsIgnoreCase("SUBJECT"))
      return subject;
    else if (fieldName.equalsIgnoreCase("BODY"))
      return body;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("AD_TABLE_ID") || fieldName.equals("adTableId"))
      return adTableId;
    else if (fieldName.equalsIgnoreCase("DOCUMENT_ID") || fieldName.equals("documentId"))
      return documentId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static EmailData[] getEmail(ConnectionProvider connectionProvider, String emailId)    throws ServletException {
    return getEmail(connectionProvider, emailId, 0, 0);
  }

  public static EmailData[] getEmail(ConnectionProvider connectionProvider, String emailId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select			" +
      "			C_POC_EMAIL_ID, " +
      "			AD_CLIENT_ID ," +
      "			AD_ORG_ID ," +
      "			ISACTIVE ," +
      "			CREATED ," +
      "			CREATEDBY, " +
      "			UPDATED ," +
      "			UPDATEDBY, " +
      "			EMAIL_TYPE," +
      "			ADDRESS_FROM ," +
      "			ADDRESS_TO ," +
      "			ADDRESS_CC ," +
      "			ADDRESS_BCC ," +
      "			DATEOFEMAIL, " +
      "			SUBJECT ," +
      "			BODY ," +
      "			C_BPARTNER_ID," +
      "			AD_TABLE_ID," +
      "			DOCUMENT_ID" +
      "		from" +
      "			C_POC_EMAIL" +
      "		where" +
      "			1=1";
    strSql = strSql + ((emailId==null || emailId.equals(""))?"":"              and C_POC_EMAIL.C_POC_EMAIL_ID in          " + emailId);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (emailId != null && !(emailId.equals(""))) {
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
        EmailData objectEmailData = new EmailData();
        objectEmailData.cPocEmailId = UtilSql.getValue(result, "C_POC_EMAIL_ID");
        objectEmailData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectEmailData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectEmailData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectEmailData.created = UtilSql.getDateValue(result, "CREATED", "dd-MM-yyyy");
        objectEmailData.createdby = UtilSql.getValue(result, "CREATEDBY");
        objectEmailData.updated = UtilSql.getDateValue(result, "UPDATED", "dd-MM-yyyy");
        objectEmailData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectEmailData.emailType = UtilSql.getValue(result, "EMAIL_TYPE");
        objectEmailData.addressFrom = UtilSql.getValue(result, "ADDRESS_FROM");
        objectEmailData.addressTo = UtilSql.getValue(result, "ADDRESS_TO");
        objectEmailData.addressCc = UtilSql.getValue(result, "ADDRESS_CC");
        objectEmailData.addressBcc = UtilSql.getValue(result, "ADDRESS_BCC");
        objectEmailData.dateofemail = UtilSql.getDateValue(result, "DATEOFEMAIL", "dd-MM-yyyy");
        objectEmailData.subject = UtilSql.getValue(result, "SUBJECT");
        objectEmailData.body = UtilSql.getValue(result, "BODY");
        objectEmailData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectEmailData.adTableId = UtilSql.getValue(result, "AD_TABLE_ID");
        objectEmailData.documentId = UtilSql.getValue(result, "DOCUMENT_ID");
        objectEmailData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEmailData);
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
    EmailData objectEmailData[] = new EmailData[vector.size()];
    vector.copyInto(objectEmailData);
    return(objectEmailData);
  }

  public static int insertEmail(Connection conn, ConnectionProvider connectionProvider, String bmPocEmailId, String adClientId, String adOrgId, String adUserId, String type, String from, String to, String cc, String bcc, String dateOfEmail, String subject, String body, String cBpartnerId, String adTableId, String documentId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO" +
      "        	C_POC_EMAIL" +
      "        	(" +
      "				C_POC_EMAIL_ID, " +
      "				AD_CLIENT_ID ," +
      "				AD_ORG_ID ," +
      "				ISACTIVE ," +
      "				CREATED ," +
      "				CREATEDBY, " +
      "				UPDATED ," +
      "				UPDATEDBY, " +
      "				EMAIL_TYPE," +
      "				ADDRESS_FROM ," +
      "				ADDRESS_TO ," +
      "				ADDRESS_CC ," +
      "				ADDRESS_BCC ," +
      "				DATEOFEMAIL, " +
      "				SUBJECT ," +
      "				BODY ," +
      "				C_BPARTNER_ID," +
      "				AD_TABLE_ID," +
      "				DOCUMENT_ID" +
      "        	)" +
      "        	VALUES" +
      "        	(" +
      "        		?," +
      "        		?," +
      "        		?, " +
      "        		'Y', " +
      "        		now(), " +
      "        		?," +
      "				now()," +
      "				?," +
      "				?," +
      "				?," +
      "				?," +
      "				?," +
      "				?," +
      "				TO_DATE(?, 'YYYYMMDDHH24MISS')," +
      "				?," +
      "				?," +
      "				?," +
      "				?," +
      "				?" +
      "			)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bmPocEmailId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, type);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, from);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, to);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bcc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateOfEmail);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, subject);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, body);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adTableId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentId);

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

  public static String getSenderAddress(ConnectionProvider connectionProvider, String adClientId, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select" +
      "            C_poc_configuration.smtpServerSenderAddress" +
      "        from" +
      "            C_poc_configuration" +
      "        where" +
      "            C_poc_configuration.ad_client_id = ? AND" +
      "            (C_poc_configuration.ad_org_id = ? OR C_poc_configuration.ad_org_id = '0') AND" +
      "            C_poc_configuration.isActive = 'Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "SMTPSERVERSENDERADDRESS");
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
