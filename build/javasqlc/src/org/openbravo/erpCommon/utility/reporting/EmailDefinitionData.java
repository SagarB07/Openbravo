//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.utility.reporting;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class EmailDefinitionData implements FieldProvider {
static Logger log4j = Logger.getLogger(EmailDefinitionData.class);
  private String InitRecordNumber="0";
  public String position;
  public String adLanguage;
  public String subject;
  public String body;
  public String isdefault;
  public String id;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("POSITION"))
      return position;
    else if (fieldName.equalsIgnoreCase("AD_LANGUAGE") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("SUBJECT"))
      return subject;
    else if (fieldName.equalsIgnoreCase("BODY"))
      return body;
    else if (fieldName.equalsIgnoreCase("ISDEFAULT"))
      return isdefault;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static EmailDefinitionData[] getEmailDefinitions(ConnectionProvider connectionProvider, String adOrgId, String docTypeTemplateId)    throws ServletException {
    return getEmailDefinitions(connectionProvider, adOrgId, docTypeTemplateId, 0, 0);
  }

  public static EmailDefinitionData[] getEmailDefinitions(ConnectionProvider connectionProvider, String adOrgId, String docTypeTemplateId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select" +
      "		    '1' as position,		" +
      "			emaildefinitions.ad_language as ad_language," +
      "			emaildefinitions.subject as subject," +
      "			emaildefinitions.body as body," +
      "			emaildefinitions.isdefault as isdefault," +
      "			emaildefinitions.c_poc_emaildefinition_id as id" +
      "		from" +
      "			c_poc_emaildefinition emaildefinitions" +
      "		where" +
      "			ad_isorgincluded(?,emaildefinitions.ad_org_id, emaildefinitions.ad_client_id)<>-1 and" +
      "			emaildefinitions.c_poc_doctype_template_id = ?" +
      "		order by ad_isorgincluded(?,emaildefinitions.ad_org_id, emaildefinitions.ad_client_id) desc";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docTypeTemplateId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

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
        EmailDefinitionData objectEmailDefinitionData = new EmailDefinitionData();
        objectEmailDefinitionData.position = UtilSql.getValue(result, "POSITION");
        objectEmailDefinitionData.adLanguage = UtilSql.getValue(result, "AD_LANGUAGE");
        objectEmailDefinitionData.subject = UtilSql.getValue(result, "SUBJECT");
        objectEmailDefinitionData.body = UtilSql.getValue(result, "BODY");
        objectEmailDefinitionData.isdefault = UtilSql.getValue(result, "ISDEFAULT");
        objectEmailDefinitionData.id = UtilSql.getValue(result, "ID");
        objectEmailDefinitionData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEmailDefinitionData);
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
    EmailDefinitionData objectEmailDefinitionData[] = new EmailDefinitionData[vector.size()];
    vector.copyInto(objectEmailDefinitionData);
    return(objectEmailDefinitionData);
  }
}
