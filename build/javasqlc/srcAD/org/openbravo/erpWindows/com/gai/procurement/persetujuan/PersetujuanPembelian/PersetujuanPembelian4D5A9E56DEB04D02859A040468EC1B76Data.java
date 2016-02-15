//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.com.gai.procurement.persetujuan.PersetujuanPembelian;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

/**
WAD Generated class
 */
class PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data implements FieldProvider {
static Logger log4j = Logger.getLogger(PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String isactive;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String documentno;
  public String docstatus;
  public String docstatusr;
  public String needbydate;
  public String cBpartnerId;
  public String keterangan;
  public String description;
  public String quantity;
  public String price;
  public String diskon;
  public String unitprice;
  public String dasar;
  public String adUserId;
  public String adUserIdr;
  public String divisi;
  public String complete;
  public String emGmmMasterDeptId;
  public String mRequisitionId;
  public String mRequisitionIdr;
  public String diperiksaId;
  public String dirkeuId;
  public String mankeuId;
  public String gppPerspembelianId;
  public String adClientId;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBYR"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATED_TIME_STAMP") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("UPDATEDBYR"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_ID") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("C_DOCTYPE_IDR") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DOCSTATUS"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("DOCSTATUSR"))
      return docstatusr;
    else if (fieldName.equalsIgnoreCase("NEEDBYDATE"))
      return needbydate;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("KETERANGAN"))
      return keterangan;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("QUANTITY"))
      return quantity;
    else if (fieldName.equalsIgnoreCase("PRICE"))
      return price;
    else if (fieldName.equalsIgnoreCase("DISKON"))
      return diskon;
    else if (fieldName.equalsIgnoreCase("UNITPRICE"))
      return unitprice;
    else if (fieldName.equalsIgnoreCase("DASAR"))
      return dasar;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("AD_USER_IDR") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("DIVISI"))
      return divisi;
    else if (fieldName.equalsIgnoreCase("COMPLETE"))
      return complete;
    else if (fieldName.equalsIgnoreCase("EM_GMM_MASTER_DEPT_ID") || fieldName.equals("emGmmMasterDeptId"))
      return emGmmMasterDeptId;
    else if (fieldName.equalsIgnoreCase("M_REQUISITION_ID") || fieldName.equals("mRequisitionId"))
      return mRequisitionId;
    else if (fieldName.equalsIgnoreCase("M_REQUISITION_IDR") || fieldName.equals("mRequisitionIdr"))
      return mRequisitionIdr;
    else if (fieldName.equalsIgnoreCase("DIPERIKSA_ID") || fieldName.equals("diperiksaId"))
      return diperiksaId;
    else if (fieldName.equalsIgnoreCase("DIRKEU_ID") || fieldName.equals("dirkeuId"))
      return dirkeuId;
    else if (fieldName.equalsIgnoreCase("MANKEU_ID") || fieldName.equals("mankeuId"))
      return mankeuId;
    else if (fieldName.equalsIgnoreCase("GPP_PERSPEMBELIAN_ID") || fieldName.equals("gppPerspembelianId"))
      return gppPerspembelianId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("LANGUAGE"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(GPP_PERSPEMBELIAN.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GPP_PERSPEMBELIAN.CreatedBy) as CreatedByR, " +
      "        to_char(GPP_PERSPEMBELIAN.Updated, ?) as updated, " +
      "        to_char(GPP_PERSPEMBELIAN.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        GPP_PERSPEMBELIAN.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = GPP_PERSPEMBELIAN.UpdatedBy) as UpdatedByR," +
      "        GPP_PERSPEMBELIAN.AD_Org_ID, " +
      "(CASE WHEN GPP_PERSPEMBELIAN.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "COALESCE(GPP_PERSPEMBELIAN.Isactive, 'N') AS Isactive, " +
      "GPP_PERSPEMBELIAN.C_Doctype_ID, " +
      "(CASE WHEN GPP_PERSPEMBELIAN.C_Doctype_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_Doctype_IDR, " +
      "GPP_PERSPEMBELIAN.Documentno, " +
      "GPP_PERSPEMBELIAN.Docstatus, " +
      "(CASE WHEN GPP_PERSPEMBELIAN.Docstatus IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS DocstatusR, " +
      "GPP_PERSPEMBELIAN.Needbydate, " +
      "GPP_PERSPEMBELIAN.C_Bpartner_ID, " +
      "GPP_PERSPEMBELIAN.Keterangan, " +
      "GPP_PERSPEMBELIAN.Description, " +
      "GPP_PERSPEMBELIAN.Quantity, " +
      "GPP_PERSPEMBELIAN.Price, " +
      "GPP_PERSPEMBELIAN.Diskon, " +
      "GPP_PERSPEMBELIAN.Unitprice, " +
      "GPP_PERSPEMBELIAN.Dasar, " +
      "GPP_PERSPEMBELIAN.AD_User_ID, " +
      "(CASE WHEN GPP_PERSPEMBELIAN.AD_User_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "GPP_PERSPEMBELIAN.Divisi, " +
      "GPP_PERSPEMBELIAN.Complete, " +
      "GPP_PERSPEMBELIAN.EM_Gmm_Master_Dept_ID, " +
      "GPP_PERSPEMBELIAN.M_Requisition_ID, " +
      "(CASE WHEN GPP_PERSPEMBELIAN.M_Requisition_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.DocumentNo), ''))),'') ) END) AS M_Requisition_IDR, " +
      "GPP_PERSPEMBELIAN.Diperiksa_ID, " +
      "GPP_PERSPEMBELIAN.Dirkeu_ID, " +
      "GPP_PERSPEMBELIAN.Mankeu_ID, " +
      "GPP_PERSPEMBELIAN.GPP_Perspembelian_ID, " +
      "GPP_PERSPEMBELIAN.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM GPP_PERSPEMBELIAN left join (select AD_Org_ID, Value from AD_Org) table1 on (GPP_PERSPEMBELIAN.AD_Org_ID = table1.AD_Org_ID) left join (select C_Doctype_ID, Name from C_Doctype) table2 on (GPP_PERSPEMBELIAN.C_Doctype_ID = table2.C_Doctype_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL2 on (table2.C_DocType_ID = tableTRL2.C_DocType_ID and tableTRL2.AD_Language = ?)  left join ad_ref_list_v list1 on (GPP_PERSPEMBELIAN.Docstatus = list1.value and list1.ad_reference_id = '8F416C326CB84BFF8F0E1C176E638FCB' and list1.ad_language = ?)  left join (select AD_User_ID, Name from AD_User) table4 on (GPP_PERSPEMBELIAN.AD_User_ID = table4.AD_User_ID) left join (select M_Requisition_ID, DocumentNo from M_Requisition) table5 on (GPP_PERSPEMBELIAN.M_Requisition_ID = table5.M_Requisition_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND GPP_PERSPEMBELIAN.GPP_Perspembelian_ID = ? " +
      "        AND GPP_PERSPEMBELIAN.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND GPP_PERSPEMBELIAN.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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
        PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data = new PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data();
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.created = UtilSql.getValue(result, "CREATED");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.updated = UtilSql.getValue(result, "UPDATED");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.cDoctypeId = UtilSql.getValue(result, "C_DOCTYPE_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.cDoctypeIdr = UtilSql.getValue(result, "C_DOCTYPE_IDR");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.docstatus = UtilSql.getValue(result, "DOCSTATUS");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.docstatusr = UtilSql.getValue(result, "DOCSTATUSR");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.needbydate = UtilSql.getDateValue(result, "NEEDBYDATE", "dd-MM-yyyy");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.keterangan = UtilSql.getValue(result, "KETERANGAN");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.description = UtilSql.getValue(result, "DESCRIPTION");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.quantity = UtilSql.getValue(result, "QUANTITY");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.price = UtilSql.getValue(result, "PRICE");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.diskon = UtilSql.getValue(result, "DISKON");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.unitprice = UtilSql.getValue(result, "UNITPRICE");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.dasar = UtilSql.getValue(result, "DASAR");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.adUserIdr = UtilSql.getValue(result, "AD_USER_IDR");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.divisi = UtilSql.getValue(result, "DIVISI");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.complete = UtilSql.getValue(result, "COMPLETE");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.emGmmMasterDeptId = UtilSql.getValue(result, "EM_GMM_MASTER_DEPT_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.mRequisitionId = UtilSql.getValue(result, "M_REQUISITION_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.mRequisitionIdr = UtilSql.getValue(result, "M_REQUISITION_IDR");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.diperiksaId = UtilSql.getValue(result, "DIPERIKSA_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.dirkeuId = UtilSql.getValue(result, "DIRKEU_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.mankeuId = UtilSql.getValue(result, "MANKEU_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.gppPerspembelianId = UtilSql.getValue(result, "GPP_PERSPEMBELIAN_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.language = UtilSql.getValue(result, "LANGUAGE");
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.adUserClient = "";
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.adOrgClient = "";
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.createdby = "";
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.trBgcolor = "";
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.totalCount = "";
        objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data);
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
    PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[] = new PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[vector.size()];
    vector.copyInto(objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data);
    return(objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data);
  }

/**
Create a registry
 */
  public static PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[] set(String emGmmMasterDeptId, String dirkeuId, String docstatus, String dasar, String keterangan, String description, String updatedby, String updatedbyr, String quantity, String mRequisitionId, String adClientId, String divisi, String adOrgId, String needbydate, String cDoctypeId, String gppPerspembelianId, String documentno, String diskon, String unitprice, String createdby, String createdbyr, String complete, String cBpartnerId, String isactive, String adUserId, String price, String diperiksaId, String mankeuId)    throws ServletException {
    PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[] = new PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[1];
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0] = new PersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data();
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].created = "";
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].createdbyr = createdbyr;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].updated = "";
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].updatedTimeStamp = "";
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].updatedby = updatedby;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].updatedbyr = updatedbyr;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].adOrgId = adOrgId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].adOrgIdr = "";
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].isactive = isactive;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].cDoctypeId = cDoctypeId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].cDoctypeIdr = "";
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].documentno = documentno;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].docstatus = docstatus;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].docstatusr = "";
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].needbydate = needbydate;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].cBpartnerId = cBpartnerId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].keterangan = keterangan;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].description = description;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].quantity = quantity;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].price = price;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].diskon = diskon;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].unitprice = unitprice;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].dasar = dasar;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].adUserId = adUserId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].adUserIdr = "";
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].divisi = divisi;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].complete = complete;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].emGmmMasterDeptId = emGmmMasterDeptId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].mRequisitionId = mRequisitionId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].mRequisitionIdr = "";
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].diperiksaId = diperiksaId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].dirkeuId = dirkeuId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].mankeuId = mankeuId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].gppPerspembelianId = gppPerspembelianId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].adClientId = adClientId;
    objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data[0].language = "";
    return objectPersetujuanPembelian4D5A9E56DEB04D02859A040468EC1B76Data;
  }

/**
Select for auxiliar field
 */
  public static String selectAux50432C3020E94B859089E0F6EC1EF47C(ConnectionProvider connectionProvider, String GPP_Perspembelian_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COUNT(LINENO) FROM GPP_PERSPEMBLINE WHERE GPP_Perspembelian_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, GPP_Perspembelian_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COUNT(LINENO)");
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

/**
Select for auxiliar field
 */
  public static String selectDef4C4FB55AF3DE4711929780BCC9B71E71_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Updatedby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedbyR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATEDBY");
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

/**
Select for auxiliar field
 */
  public static String selectDef9D34DA26FE5244F283CA1388FE73A4A7(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        Select C_DocType_ID From C_DocType Where DocBaseType='GPP_STJ' ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_DOCTYPE_ID");
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

/**
Select for auxiliar field
 */
  public static String selectDefC30E886745F04299BCE59F05B6246538_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Createdby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedbyR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "CREATEDBY");
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE GPP_PERSPEMBELIAN" +
      "        SET AD_Org_ID = (?) , Isactive = (?) , C_Doctype_ID = (?) , Documentno = (?) , Docstatus = (?) , Needbydate = TO_DATE(?) , C_Bpartner_ID = (?) , Keterangan = (?) , Description = (?) , Quantity = TO_NUMBER(?) , Price = TO_NUMBER(?) , Diskon = TO_NUMBER(?) , Unitprice = TO_NUMBER(?) , Dasar = (?) , AD_User_ID = (?) , Divisi = (?) , Complete = (?) , EM_Gmm_Master_Dept_ID = (?) , M_Requisition_ID = (?) , Diperiksa_ID = (?) , Dirkeu_ID = (?) , Mankeu_ID = (?) , GPP_Perspembelian_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE GPP_PERSPEMBELIAN.GPP_Perspembelian_ID = ? " +
      "        AND GPP_PERSPEMBELIAN.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GPP_PERSPEMBELIAN.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, needbydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, keterangan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, price);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, diskon);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unitprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dasar);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, divisi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, complete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMasterDeptId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, diperiksaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dirkeuId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mankeuId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gppPerspembelianId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gppPerspembelianId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

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

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO GPP_PERSPEMBELIAN " +
      "        (AD_Org_ID, Isactive, C_Doctype_ID, Documentno, Docstatus, Needbydate, C_Bpartner_ID, Keterangan, Description, Quantity, Price, Diskon, Unitprice, Dasar, AD_User_ID, Divisi, Complete, EM_Gmm_Master_Dept_ID, M_Requisition_ID, Diperiksa_ID, Dirkeu_ID, Mankeu_ID, GPP_Perspembelian_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, needbydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, keterangan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, price);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, diskon);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unitprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dasar);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, divisi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, complete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMasterDeptId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, diperiksaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dirkeuId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mankeuId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, gppPerspembelianId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM GPP_PERSPEMBELIAN" +
      "        WHERE GPP_PERSPEMBELIAN.GPP_Perspembelian_ID = ? " +
      "        AND GPP_PERSPEMBELIAN.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND GPP_PERSPEMBELIAN.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

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

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM GPP_PERSPEMBELIAN" +
      "         WHERE GPP_PERSPEMBELIAN.GPP_Perspembelian_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_ORG_ID");
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

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM GPP_PERSPEMBELIAN" +
      "         WHERE GPP_PERSPEMBELIAN.GPP_Perspembelian_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
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
