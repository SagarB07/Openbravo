//Sqlc generated V1.O00-1
package com.gai.umk.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class UmkToolbarPrintData implements FieldProvider {
static Logger log4j = Logger.getLogger(UmkToolbarPrintData.class);
  private String InitRecordNumber="0";
  public String hariIni;
  public String nominalPenjaguannUmk;
  public String tanggalPenerimaanUmk;
  public String description;
  public String totAmountRealisasi;
  public String selisih;
  public String complete;
  public String realisasi;
  public String status;
  public String documentno;
  public String memointernaldari;
  public String tanggalmemointernal;
  public String nomemointernal;
  public String kantorCabang;
  public String namaUser;
  public String umkTerbilang;
  public String anggaran;
  public String sisaanggaran;
  public String namabudget;
  public String cYearId;
  public String year;
  public String perihal;
  public String kepada;
  public String dari;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("HARI_INI") || fieldName.equals("hariIni"))
      return hariIni;
    else if (fieldName.equalsIgnoreCase("NOMINAL_PENJAGUANN_UMK") || fieldName.equals("nominalPenjaguannUmk"))
      return nominalPenjaguannUmk;
    else if (fieldName.equalsIgnoreCase("TANGGAL_PENERIMAAN_UMK") || fieldName.equals("tanggalPenerimaanUmk"))
      return tanggalPenerimaanUmk;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("TOT_AMOUNT_REALISASI") || fieldName.equals("totAmountRealisasi"))
      return totAmountRealisasi;
    else if (fieldName.equalsIgnoreCase("SELISIH"))
      return selisih;
    else if (fieldName.equalsIgnoreCase("COMPLETE"))
      return complete;
    else if (fieldName.equalsIgnoreCase("REALISASI"))
      return realisasi;
    else if (fieldName.equalsIgnoreCase("STATUS"))
      return status;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("MEMOINTERNALDARI"))
      return memointernaldari;
    else if (fieldName.equalsIgnoreCase("TANGGALMEMOINTERNAL"))
      return tanggalmemointernal;
    else if (fieldName.equalsIgnoreCase("NOMEMOINTERNAL"))
      return nomemointernal;
    else if (fieldName.equalsIgnoreCase("KANTOR_CABANG") || fieldName.equals("kantorCabang"))
      return kantorCabang;
    else if (fieldName.equalsIgnoreCase("NAMA_USER") || fieldName.equals("namaUser"))
      return namaUser;
    else if (fieldName.equalsIgnoreCase("UMK_TERBILANG") || fieldName.equals("umkTerbilang"))
      return umkTerbilang;
    else if (fieldName.equalsIgnoreCase("ANGGARAN"))
      return anggaran;
    else if (fieldName.equalsIgnoreCase("SISAANGGARAN"))
      return sisaanggaran;
    else if (fieldName.equalsIgnoreCase("NAMABUDGET"))
      return namabudget;
    else if (fieldName.equalsIgnoreCase("C_YEAR_ID") || fieldName.equals("cYearId"))
      return cYearId;
    else if (fieldName.equalsIgnoreCase("YEAR"))
      return year;
    else if (fieldName.equalsIgnoreCase("PERIHAL"))
      return perihal;
    else if (fieldName.equalsIgnoreCase("KEPADA"))
      return kepada;
    else if (fieldName.equalsIgnoreCase("DARI"))
      return dari;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static UmkToolbarPrintData[] select(ConnectionProvider connectionProvider, String recordId)    throws ServletException {
    return select(connectionProvider, recordId, 0, 0);
  }

  public static UmkToolbarPrintData[] select(ConnectionProvider connectionProvider, String recordId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select now() as hari_ini,gu.nominal_penjaguann_umk, gu.tanggal_penerimaan_umk as tanggal_penerimaan_umk , gu.description as description,gu.tot_amount_realisasi as tot_amount_realisasi, gu.selisih as selisih, gu.complete as complete, gu.realisasi as realisasi, gu.status as status, gu.documentno as documentno, gu.memointernaldari as memointernaldari, gu.tanggalmemointernal as tanggalmemointernal, gu.nomemointernal as nomemointernal, ad_org.name as kantor_cabang,ad_user.name as nama_user," +
      "		gai_say_amount(gu.nominal_penjaguann_umk,'IDR') as umk_terbilang," +
      "		CBUD.EM_GBG_BUDGETAMT AS ANGGARAN, CBUD.EM_GBG_ACTUALAMT AS SISAANGGARAN," +
      "		cbud.name as namabudget, cbud.c_year_id as c_year_id,cy.year as year," +
      "		gu.perihal as PERIHAL, gmdd.jabatan as KEPADA, gmd.department as DARI" +
      "		from gumk_umk gu" +
      "		LEFT JOIN C_BUDGET CBUD ON CBUD.C_BUDGET_ID = gu.EM_GBG_BUDGET_ID" +
      "		left join c_year cy on cy.c_year_id = cbud.c_year_id" +
      "		left join ad_org on (gu.ad_org_id=ad_org.ad_org_id)" +
      "		left join ad_user on (ad_user.ad_user_id=gu.ad_user_id)" +
      "		left join gmm_master_department gmd ON gmd.gmm_master_department_id = gu.em_gmm_master_department_id" +
      "		left join gnv_master_datadireksi gmdd on gmdd.gnv_master_datadireksi_id = gu.Em_Gnv_Master_Datadireksi_Id" +
      "		where GU.GUMK_UMK_ID IN (";
    strSql = strSql + ((recordId==null || recordId.equals(""))?"":recordId);
    strSql = strSql + 
      ")";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      if (recordId != null && !(recordId.equals(""))) {
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
        UmkToolbarPrintData objectUmkToolbarPrintData = new UmkToolbarPrintData();
        objectUmkToolbarPrintData.hariIni = UtilSql.getDateValue(result, "HARI_INI", "dd-MM-yyyy");
        objectUmkToolbarPrintData.nominalPenjaguannUmk = UtilSql.getValue(result, "NOMINAL_PENJAGUANN_UMK");
        objectUmkToolbarPrintData.tanggalPenerimaanUmk = UtilSql.getDateValue(result, "TANGGAL_PENERIMAAN_UMK", "dd-MM-yyyy");
        objectUmkToolbarPrintData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectUmkToolbarPrintData.totAmountRealisasi = UtilSql.getValue(result, "TOT_AMOUNT_REALISASI");
        objectUmkToolbarPrintData.selisih = UtilSql.getValue(result, "SELISIH");
        objectUmkToolbarPrintData.complete = UtilSql.getValue(result, "COMPLETE");
        objectUmkToolbarPrintData.realisasi = UtilSql.getValue(result, "REALISASI");
        objectUmkToolbarPrintData.status = UtilSql.getValue(result, "STATUS");
        objectUmkToolbarPrintData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectUmkToolbarPrintData.memointernaldari = UtilSql.getValue(result, "MEMOINTERNALDARI");
        objectUmkToolbarPrintData.tanggalmemointernal = UtilSql.getDateValue(result, "TANGGALMEMOINTERNAL", "dd-MM-yyyy");
        objectUmkToolbarPrintData.nomemointernal = UtilSql.getValue(result, "NOMEMOINTERNAL");
        objectUmkToolbarPrintData.kantorCabang = UtilSql.getValue(result, "KANTOR_CABANG");
        objectUmkToolbarPrintData.namaUser = UtilSql.getValue(result, "NAMA_USER");
        objectUmkToolbarPrintData.umkTerbilang = UtilSql.getValue(result, "UMK_TERBILANG");
        objectUmkToolbarPrintData.anggaran = UtilSql.getValue(result, "ANGGARAN");
        objectUmkToolbarPrintData.sisaanggaran = UtilSql.getValue(result, "SISAANGGARAN");
        objectUmkToolbarPrintData.namabudget = UtilSql.getValue(result, "NAMABUDGET");
        objectUmkToolbarPrintData.cYearId = UtilSql.getValue(result, "C_YEAR_ID");
        objectUmkToolbarPrintData.year = UtilSql.getValue(result, "YEAR");
        objectUmkToolbarPrintData.perihal = UtilSql.getValue(result, "PERIHAL");
        objectUmkToolbarPrintData.kepada = UtilSql.getValue(result, "KEPADA");
        objectUmkToolbarPrintData.dari = UtilSql.getValue(result, "DARI");
        objectUmkToolbarPrintData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectUmkToolbarPrintData);
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
    UmkToolbarPrintData objectUmkToolbarPrintData[] = new UmkToolbarPrintData[vector.size()];
    vector.copyInto(objectUmkToolbarPrintData);
    return(objectUmkToolbarPrintData);
  }
}
