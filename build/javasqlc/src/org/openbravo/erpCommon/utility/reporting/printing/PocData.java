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

class PocData implements FieldProvider {
static Logger log4j = Logger.getLogger(PocData.class);
  private String InitRecordNumber="0";
  public String documentId;
  public String docstatus;
  public String ourreference;
  public String yourreference;
  public String salesrepUserId;
  public String salesrepEmail;
  public String salesrepName;
  public String bpartnerId;
  public String bpartnerName;
  public String contactUserId;
  public String contactEmail;
  public String contactName;
  public String adUserId;
  public String userEmail;
  public String userName;
  public String reportLocation;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("DOCUMENT_ID") || fieldName.equals("documentId"))
      return documentId;
    else if (fieldName.equalsIgnoreCase("DOCSTATUS"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("OURREFERENCE"))
      return ourreference;
    else if (fieldName.equalsIgnoreCase("YOURREFERENCE"))
      return yourreference;
    else if (fieldName.equalsIgnoreCase("SALESREP_USER_ID") || fieldName.equals("salesrepUserId"))
      return salesrepUserId;
    else if (fieldName.equalsIgnoreCase("SALESREP_EMAIL") || fieldName.equals("salesrepEmail"))
      return salesrepEmail;
    else if (fieldName.equalsIgnoreCase("SALESREP_NAME") || fieldName.equals("salesrepName"))
      return salesrepName;
    else if (fieldName.equalsIgnoreCase("BPARTNER_ID") || fieldName.equals("bpartnerId"))
      return bpartnerId;
    else if (fieldName.equalsIgnoreCase("BPARTNER_NAME") || fieldName.equals("bpartnerName"))
      return bpartnerName;
    else if (fieldName.equalsIgnoreCase("CONTACT_USER_ID") || fieldName.equals("contactUserId"))
      return contactUserId;
    else if (fieldName.equalsIgnoreCase("CONTACT_EMAIL") || fieldName.equals("contactEmail"))
      return contactEmail;
    else if (fieldName.equalsIgnoreCase("CONTACT_NAME") || fieldName.equals("contactName"))
      return contactName;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("USER_EMAIL") || fieldName.equals("userEmail"))
      return userEmail;
    else if (fieldName.equalsIgnoreCase("USER_NAME") || fieldName.equals("userName"))
      return userName;
    else if (fieldName.equalsIgnoreCase("REPORT_LOCATION") || fieldName.equals("reportLocation"))
      return reportLocation;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static PocData[] dummy(ConnectionProvider connectionProvider)    throws ServletException {
    return dummy(connectionProvider, 0, 0);
  }

  public static PocData[] dummy(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select" +
      "			'' as document_id," +
      "			'' as docstatus," +
      "			'' as ourreference," +
      "			'' as yourreference," +
      "			'' as salesrep_user_id," +
      "			'' as salesrep_email," +
      "			'' as salesrep_name," +
      "			'' as bpartner_id," +
      "			'' as bpartner_name," +
      "			'' as contact_user_id," +
      "			'' as contact_email," +
      "			'' as contact_name," +
      "			'' as ad_user_id," +
      "			'' as user_email," +
      "			'' as user_name," +
      "			'' as report_location" +
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
        PocData objectPocData = new PocData();
        objectPocData.documentId = UtilSql.getValue(result, "DOCUMENT_ID");
        objectPocData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectPocData.ourreference = UtilSql.getValue(result, "OURREFERENCE");
        objectPocData.yourreference = UtilSql.getValue(result, "YOURREFERENCE");
        objectPocData.salesrepUserId = UtilSql.getValue(result, "SALESREP_USER_ID");
        objectPocData.salesrepEmail = UtilSql.getValue(result, "SALESREP_EMAIL");
        objectPocData.salesrepName = UtilSql.getValue(result, "SALESREP_NAME");
        objectPocData.bpartnerId = UtilSql.getValue(result, "BPARTNER_ID");
        objectPocData.bpartnerName = UtilSql.getValue(result, "BPARTNER_NAME");
        objectPocData.contactUserId = UtilSql.getValue(result, "CONTACT_USER_ID");
        objectPocData.contactEmail = UtilSql.getValue(result, "CONTACT_EMAIL");
        objectPocData.contactName = UtilSql.getValue(result, "CONTACT_NAME");
        objectPocData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectPocData.userEmail = UtilSql.getValue(result, "USER_EMAIL");
        objectPocData.userName = UtilSql.getValue(result, "USER_NAME");
        objectPocData.reportLocation = UtilSql.getValue(result, "REPORT_LOCATION");
        objectPocData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPocData);
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
    PocData objectPocData[] = new PocData[vector.size()];
    vector.copyInto(objectPocData);
    return(objectPocData);
  }

  public static PocData[] getContactDetailsForOrders(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    return getContactDetailsForOrders(connectionProvider, cOrderId, 0, 0);
  }

  public static PocData[] getContactDetailsForOrders(ConnectionProvider connectionProvider, String cOrderId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select" +
      "			c_order.c_order_id as document_id," +
      "			c_order.docstatus as docstatus," +
      "			c_order.documentno as ourreference," +
      "			c_order.poreference as yourreference," +
      "			c_order.salesrep_id as salesrep_user_id," +
      "			salesrep.email as salesrep_email," +
      "			salesrep.name as salesrep_name," +
      "			c_order.c_bpartner_id as bpartner_id," +
      "			c_bpartner.name as bpartner_name," +
      "			c_order.ad_user_id as contact_user_id," +
      "			customercontact.email as contact_email," +
      "			customercontact.name as contact_name" +
      "		from" +
      "			c_order" +
      "				left join ad_user customercontact on c_order.ad_user_id = customercontact.ad_user_id" +
      "				left join ad_user salesrep on c_order.salesrep_id = salesrep.ad_user_id" +
      "				left join c_bpartner on c_order.c_bpartner_id = c_bpartner.c_bpartner_id" +
      "		where" +
      "			1=1";
    strSql = strSql + ((cOrderId==null || cOrderId.equals(""))?"":"              and c_order.c_order_id in          " + cOrderId);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (cOrderId != null && !(cOrderId.equals(""))) {
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
        PocData objectPocData = new PocData();
        objectPocData.documentId = UtilSql.getValue(result, "DOCUMENT_ID");
        objectPocData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectPocData.ourreference = UtilSql.getValue(result, "OURREFERENCE");
        objectPocData.yourreference = UtilSql.getValue(result, "YOURREFERENCE");
        objectPocData.salesrepUserId = UtilSql.getValue(result, "SALESREP_USER_ID");
        objectPocData.salesrepEmail = UtilSql.getValue(result, "SALESREP_EMAIL");
        objectPocData.salesrepName = UtilSql.getValue(result, "SALESREP_NAME");
        objectPocData.bpartnerId = UtilSql.getValue(result, "BPARTNER_ID");
        objectPocData.bpartnerName = UtilSql.getValue(result, "BPARTNER_NAME");
        objectPocData.contactUserId = UtilSql.getValue(result, "CONTACT_USER_ID");
        objectPocData.contactEmail = UtilSql.getValue(result, "CONTACT_EMAIL");
        objectPocData.contactName = UtilSql.getValue(result, "CONTACT_NAME");
        objectPocData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPocData);
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
    PocData objectPocData[] = new PocData[vector.size()];
    vector.copyInto(objectPocData);
    return(objectPocData);
  }

  public static PocData[] getContactDetailsForInvoices(ConnectionProvider connectionProvider, String cInvoiceId)    throws ServletException {
    return getContactDetailsForInvoices(connectionProvider, cInvoiceId, 0, 0);
  }

  public static PocData[] getContactDetailsForInvoices(ConnectionProvider connectionProvider, String cInvoiceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select" +
      "			c_invoice.c_invoice_id as document_id," +
      "			c_invoice.docstatus as docstatus," +
      "			c_invoice.documentno as ourreference," +
      "			c_invoice.poreference as yourreference," +
      "			c_invoice.salesrep_id as salesrep_user_id," +
      "			salesrep.email as salesrep_email," +
      "			salesrep.name as salesrep_name," +
      "			c_invoice.c_bpartner_id as bpartner_id," +
      "			c_bpartner.name as bpartner_name," +
      "			c_invoice.ad_user_id as contact_user_id," +
      "			customercontact.email as contact_email," +
      "			customercontact.name as contact_name" +
      "		from" +
      "			c_invoice" +
      "				left join ad_user customercontact on c_invoice.ad_user_id = customercontact.ad_user_id" +
      "				left join ad_user salesrep on c_invoice.salesrep_id = salesrep.ad_user_id" +
      "				left join c_bpartner on c_invoice.c_bpartner_id = c_bpartner.c_bpartner_id" +
      "		where" +
      "			1=1";
    strSql = strSql + ((cInvoiceId==null || cInvoiceId.equals(""))?"":"              and c_invoice.c_invoice_id in          " + cInvoiceId);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (cInvoiceId != null && !(cInvoiceId.equals(""))) {
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
        PocData objectPocData = new PocData();
        objectPocData.documentId = UtilSql.getValue(result, "DOCUMENT_ID");
        objectPocData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectPocData.ourreference = UtilSql.getValue(result, "OURREFERENCE");
        objectPocData.yourreference = UtilSql.getValue(result, "YOURREFERENCE");
        objectPocData.salesrepUserId = UtilSql.getValue(result, "SALESREP_USER_ID");
        objectPocData.salesrepEmail = UtilSql.getValue(result, "SALESREP_EMAIL");
        objectPocData.salesrepName = UtilSql.getValue(result, "SALESREP_NAME");
        objectPocData.bpartnerId = UtilSql.getValue(result, "BPARTNER_ID");
        objectPocData.bpartnerName = UtilSql.getValue(result, "BPARTNER_NAME");
        objectPocData.contactUserId = UtilSql.getValue(result, "CONTACT_USER_ID");
        objectPocData.contactEmail = UtilSql.getValue(result, "CONTACT_EMAIL");
        objectPocData.contactName = UtilSql.getValue(result, "CONTACT_NAME");
        objectPocData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPocData);
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
    PocData objectPocData[] = new PocData[vector.size()];
    vector.copyInto(objectPocData);
    return(objectPocData);
  }

  public static PocData[] getContactDetailsForShipments(ConnectionProvider connectionProvider, String mInoutId)    throws ServletException {
    return getContactDetailsForShipments(connectionProvider, mInoutId, 0, 0);
  }

  public static PocData[] getContactDetailsForShipments(ConnectionProvider connectionProvider, String mInoutId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "			select" +
      "				m_inout.m_inout_id as document_id," +
      "				m_inout.docstatus as docstatus," +
      "				m_inout.documentno as ourreference," +
      "				m_inout.poreference as yourreference," +
      "				m_inout.salesrep_id as salesrep_user_id," +
      "				salesrep.email as salesrep_email," +
      "				salesrep.name as salesrep_name," +
      "				m_inout.c_bpartner_id as bpartner_id," +
      "				c_bpartner.name as bpartner_name," +
      "				m_inout.ad_user_id as contact_user_id," +
      "				customercontact.email as contact_email," +
      "				customercontact.name as contact_name" +
      "			from" +
      "				m_inout" +
      "					left join ad_user customercontact on m_inout.ad_user_id = customercontact.ad_user_id" +
      "					left join ad_user salesrep on m_inout.salesrep_id = salesrep.ad_user_id" +
      "					left join c_bpartner on m_inout.c_bpartner_id = c_bpartner.c_bpartner_id" +
      "			where" +
      "				1=1";
    strSql = strSql + ((mInoutId==null || mInoutId.equals(""))?"":"              and m_inout.m_inout_id in          " + mInoutId);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (mInoutId != null && !(mInoutId.equals(""))) {
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
        PocData objectPocData = new PocData();
        objectPocData.documentId = UtilSql.getValue(result, "DOCUMENT_ID");
        objectPocData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectPocData.ourreference = UtilSql.getValue(result, "OURREFERENCE");
        objectPocData.yourreference = UtilSql.getValue(result, "YOURREFERENCE");
        objectPocData.salesrepUserId = UtilSql.getValue(result, "SALESREP_USER_ID");
        objectPocData.salesrepEmail = UtilSql.getValue(result, "SALESREP_EMAIL");
        objectPocData.salesrepName = UtilSql.getValue(result, "SALESREP_NAME");
        objectPocData.bpartnerId = UtilSql.getValue(result, "BPARTNER_ID");
        objectPocData.bpartnerName = UtilSql.getValue(result, "BPARTNER_NAME");
        objectPocData.contactUserId = UtilSql.getValue(result, "CONTACT_USER_ID");
        objectPocData.contactEmail = UtilSql.getValue(result, "CONTACT_EMAIL");
        objectPocData.contactName = UtilSql.getValue(result, "CONTACT_NAME");
        objectPocData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPocData);
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
    PocData objectPocData[] = new PocData[vector.size()];
    vector.copyInto(objectPocData);
    return(objectPocData);
  }

  public static PocData[] getContactDetailsForPayments(ConnectionProvider connectionProvider, String finPaymentId)    throws ServletException {
    return getContactDetailsForPayments(connectionProvider, finPaymentId, 0, 0);
  }

  public static PocData[] getContactDetailsForPayments(ConnectionProvider connectionProvider, String finPaymentId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            select" +
      "                fin_payment.fin_payment_id as document_id," +
      "                fin_payment.status as docstatus," +
      "                fin_payment.documentno as ourreference," +
      "                fin_payment.referenceno as yourreference," +
      "                salesrep.ad_user_id as salesrep_user_id," +
      "                salesrep.email as salesrep_email," +
      "                salesrep.name as salesrep_name," +
      "                fin_payment.c_bpartner_id as bpartner_id," +
      "                bp.name as bpartner_name," +
      "                contact.ad_user_id as contact_user_id," +
      "                contact.email as contact_email," +
      "                contact.name as contact_name" +
      "            from" +
      "                fin_payment" +
      "                    join c_bpartner bp on fin_payment.c_bpartner_id = bp.c_bpartner_id" +
      "                    left join ad_user contact on bp.c_bpartner_id = contact.c_bpartner_id" +
      "                    left join ad_user salesrep on bp.salesrep_id = salesrep.c_bpartner_id" +
      "            where" +
      "                1=1";
    strSql = strSql + ((finPaymentId==null || finPaymentId.equals(""))?"":"              and fin_payment.fin_payment_id in          " + finPaymentId);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (finPaymentId != null && !(finPaymentId.equals(""))) {
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
        PocData objectPocData = new PocData();
        objectPocData.documentId = UtilSql.getValue(result, "DOCUMENT_ID");
        objectPocData.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectPocData.ourreference = UtilSql.getValue(result, "OURREFERENCE");
        objectPocData.yourreference = UtilSql.getValue(result, "YOURREFERENCE");
        objectPocData.salesrepUserId = UtilSql.getValue(result, "SALESREP_USER_ID");
        objectPocData.salesrepEmail = UtilSql.getValue(result, "SALESREP_EMAIL");
        objectPocData.salesrepName = UtilSql.getValue(result, "SALESREP_NAME");
        objectPocData.bpartnerId = UtilSql.getValue(result, "BPARTNER_ID");
        objectPocData.bpartnerName = UtilSql.getValue(result, "BPARTNER_NAME");
        objectPocData.contactUserId = UtilSql.getValue(result, "CONTACT_USER_ID");
        objectPocData.contactEmail = UtilSql.getValue(result, "CONTACT_EMAIL");
        objectPocData.contactName = UtilSql.getValue(result, "CONTACT_NAME");
        objectPocData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPocData);
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
    PocData objectPocData[] = new PocData[vector.size()];
    vector.copyInto(objectPocData);
    return(objectPocData);
  }

  public static PocData[] getContactDetailsForUser(ConnectionProvider connectionProvider, String adUserId)    throws ServletException {
    return getContactDetailsForUser(connectionProvider, adUserId, 0, 0);
  }

  public static PocData[] getContactDetailsForUser(ConnectionProvider connectionProvider, String adUserId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select" +
      "			ad_user.ad_user_id," +
      "			ad_user.email as user_email," +
      "			ad_user.name as user_name" +
      "		from" +
      "			ad_user" +
      "		where" +
      "			ad_user.ad_user_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);

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
        PocData objectPocData = new PocData();
        objectPocData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectPocData.userEmail = UtilSql.getValue(result, "USER_EMAIL");
        objectPocData.userName = UtilSql.getValue(result, "USER_NAME");
        objectPocData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPocData);
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
    PocData objectPocData[] = new PocData[vector.size()];
    vector.copyInto(objectPocData);
    return(objectPocData);
  }
}
