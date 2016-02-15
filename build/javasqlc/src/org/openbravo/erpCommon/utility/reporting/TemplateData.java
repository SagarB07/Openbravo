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

public class TemplateData implements FieldProvider {
static Logger log4j = Logger.getLogger(TemplateData.class);
  private String InitRecordNumber="0";
  public String position;
  public String adOrgId;
  public String cPocDoctypeTemplateId;
  public String templateLocation;
  public String templateFilename;
  public String reportFilename;
  public String showLogo;
  public String showCompanyData;
  public String headerMargin;
  public String id;
  public String name;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("POSITION"))
      return position;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("C_POC_DOCTYPE_TEMPLATE_ID") || fieldName.equals("cPocDoctypeTemplateId"))
      return cPocDoctypeTemplateId;
    else if (fieldName.equalsIgnoreCase("TEMPLATE_LOCATION") || fieldName.equals("templateLocation"))
      return templateLocation;
    else if (fieldName.equalsIgnoreCase("TEMPLATE_FILENAME") || fieldName.equals("templateFilename"))
      return templateFilename;
    else if (fieldName.equalsIgnoreCase("REPORT_FILENAME") || fieldName.equals("reportFilename"))
      return reportFilename;
    else if (fieldName.equalsIgnoreCase("SHOW_LOGO") || fieldName.equals("showLogo"))
      return showLogo;
    else if (fieldName.equalsIgnoreCase("SHOW_COMPANY_DATA") || fieldName.equals("showCompanyData"))
      return showCompanyData;
    else if (fieldName.equalsIgnoreCase("HEADER_MARGIN") || fieldName.equals("headerMargin"))
      return headerMargin;
    else if (fieldName.equalsIgnoreCase("ID"))
      return id;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static TemplateData[] dummy(ConnectionProvider connectionProvider)    throws ServletException {
    return dummy(connectionProvider, 0, 0);
  }

  public static TemplateData[] dummy(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select" +
      "		    '' as position," +
      "			'' as ad_org_id," +
      "			'' as c_poc_doctype_template_id,			" +
      "			'' as template_location," +
      "			'' as template_filename," +
      "			'' as report_filename," +
      "            '' as show_logo," +
      "            '' as show_company_data," +
      "            '' as header_margin," +
      "			'' as id," +
      "			'' as name" +
      "		from" +
      "			dual";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

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
        TemplateData objectTemplateData = new TemplateData();
        objectTemplateData.position = UtilSql.getValue(result, "POSITION");
        objectTemplateData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectTemplateData.cPocDoctypeTemplateId = UtilSql.getValue(result, "C_POC_DOCTYPE_TEMPLATE_ID");
        objectTemplateData.templateLocation = UtilSql.getValue(result, "TEMPLATE_LOCATION");
        objectTemplateData.templateFilename = UtilSql.getValue(result, "TEMPLATE_FILENAME");
        objectTemplateData.reportFilename = UtilSql.getValue(result, "REPORT_FILENAME");
        objectTemplateData.showLogo = UtilSql.getValue(result, "SHOW_LOGO");
        objectTemplateData.showCompanyData = UtilSql.getValue(result, "SHOW_COMPANY_DATA");
        objectTemplateData.headerMargin = UtilSql.getValue(result, "HEADER_MARGIN");
        objectTemplateData.id = UtilSql.getValue(result, "ID");
        objectTemplateData.name = UtilSql.getValue(result, "NAME");
        objectTemplateData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTemplateData);
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
    TemplateData objectTemplateData[] = new TemplateData[vector.size()];
    vector.copyInto(objectTemplateData);
    return(objectTemplateData);
  }

  public static TemplateData[] getDocumentTemplates(ConnectionProvider connectionProvider, String docTypeId, String adOrgId)    throws ServletException {
    return getDocumentTemplates(connectionProvider, docTypeId, adOrgId, 0, 0);
  }

  public static TemplateData[] getDocumentTemplates(ConnectionProvider connectionProvider, String docTypeId, String adOrgId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select" +
      "		    '1' as position,		" +
      "			documenttemplate.ad_org_id as ad_org_id," +
      "			documenttemplate.c_poc_doctype_template_id as c_poc_doctype_template_id," +
      "			documenttemplate.c_poc_doctype_template_id as id,			" +
      "			documenttemplate.templatelocation as template_location," +
      "			documenttemplate.templatefilename as template_filename," +
      "			documenttemplate.name as name," +
      "			documenttemplate.reportfilename as report_filename," +
      "            documenttemplate.showlogo as show_logo," +
      "            documenttemplate.showcompanydata as show_company_data," +
      "            documenttemplate.headermargin as header_margin" +
      "		from" +
      "			C_poc_doctype_template documenttemplate" +
      "		where" +
      "			documenttemplate.c_doctype_id = ? and" +
      "			ad_isorgincluded(?,documenttemplate.ad_org_id,documenttemplate.ad_client_id)<>-1 and" +
      "			documenttemplate.isactive = 'Y'" +
      "		order by ad_isorgincluded(?,documenttemplate.ad_org_id,documenttemplate.ad_client_id) desc";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docTypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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
        TemplateData objectTemplateData = new TemplateData();
        objectTemplateData.position = UtilSql.getValue(result, "POSITION");
        objectTemplateData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectTemplateData.cPocDoctypeTemplateId = UtilSql.getValue(result, "C_POC_DOCTYPE_TEMPLATE_ID");
        objectTemplateData.id = UtilSql.getValue(result, "ID");
        objectTemplateData.templateLocation = UtilSql.getValue(result, "TEMPLATE_LOCATION");
        objectTemplateData.templateFilename = UtilSql.getValue(result, "TEMPLATE_FILENAME");
        objectTemplateData.name = UtilSql.getValue(result, "NAME");
        objectTemplateData.reportFilename = UtilSql.getValue(result, "REPORT_FILENAME");
        objectTemplateData.showLogo = UtilSql.getValue(result, "SHOW_LOGO");
        objectTemplateData.showCompanyData = UtilSql.getValue(result, "SHOW_COMPANY_DATA");
        objectTemplateData.headerMargin = UtilSql.getValue(result, "HEADER_MARGIN");
        objectTemplateData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTemplateData);
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
    TemplateData objectTemplateData[] = new TemplateData[vector.size()];
    vector.copyInto(objectTemplateData);
    return(objectTemplateData);
  }
}
