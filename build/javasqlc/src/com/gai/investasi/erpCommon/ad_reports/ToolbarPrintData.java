//Sqlc generated V1.O00-1
package com.gai.investasi.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class ToolbarPrintData implements FieldProvider {
static Logger log4j = Logger.getLogger(ToolbarPrintData.class);
  private String InitRecordNumber="0";
  public String type;
  public String gnvInvestasiLineId;
  public String organisasi;
  public String managerkeuangan;
  public String nomor;
  public String perihal;
  public String cabangbank;
  public String nominal;
  public String amount;
  public String bankCabang;
  public String nobilyet;
  public String bulan;
  public String bulanSay;
  public String hari;
  public String hariSay;
  public String tanggalawal;
  public String tanggalakhir;
  public String alamat;
  public String sukuBunga;
  public String bankCabangHader;
  public String tanggal;
  public String sukubunga;
  public String bank;
  public String statuskepemilikan;
  public String car;
  public String npl;
  public String ldr;
  public String kesimpulanrasio;
  public String kepada;
  public String dari;
  public String now;
  public String currency;
  public String organizationid;
  public String bi;
  public String lps;
  public String deskripsiLine;
  public String kesimpulanLine;
  public String today;
  public String kesimpulan;
  public String jatuhtempo;
  public String totalasset;
  public String kesipulanrasio;
  public String jangkawaktu;
  public String statusapprove;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("TYPE"))
      return type;
    else if (fieldName.equalsIgnoreCase("GNV_INVESTASI_LINE_ID") || fieldName.equals("gnvInvestasiLineId"))
      return gnvInvestasiLineId;
    else if (fieldName.equalsIgnoreCase("ORGANISASI"))
      return organisasi;
    else if (fieldName.equalsIgnoreCase("MANAGERKEUANGAN"))
      return managerkeuangan;
    else if (fieldName.equalsIgnoreCase("NOMOR"))
      return nomor;
    else if (fieldName.equalsIgnoreCase("PERIHAL"))
      return perihal;
    else if (fieldName.equalsIgnoreCase("CABANGBANK"))
      return cabangbank;
    else if (fieldName.equalsIgnoreCase("NOMINAL"))
      return nominal;
    else if (fieldName.equalsIgnoreCase("AMOUNT"))
      return amount;
    else if (fieldName.equalsIgnoreCase("BANK_CABANG") || fieldName.equals("bankCabang"))
      return bankCabang;
    else if (fieldName.equalsIgnoreCase("NOBILYET"))
      return nobilyet;
    else if (fieldName.equalsIgnoreCase("BULAN"))
      return bulan;
    else if (fieldName.equalsIgnoreCase("BULAN_SAY") || fieldName.equals("bulanSay"))
      return bulanSay;
    else if (fieldName.equalsIgnoreCase("HARI"))
      return hari;
    else if (fieldName.equalsIgnoreCase("HARI_SAY") || fieldName.equals("hariSay"))
      return hariSay;
    else if (fieldName.equalsIgnoreCase("TANGGALAWAL"))
      return tanggalawal;
    else if (fieldName.equalsIgnoreCase("TANGGALAKHIR"))
      return tanggalakhir;
    else if (fieldName.equalsIgnoreCase("ALAMAT"))
      return alamat;
    else if (fieldName.equalsIgnoreCase("SUKU_BUNGA") || fieldName.equals("sukuBunga"))
      return sukuBunga;
    else if (fieldName.equalsIgnoreCase("BANK_CABANG_HADER") || fieldName.equals("bankCabangHader"))
      return bankCabangHader;
    else if (fieldName.equalsIgnoreCase("TANGGAL"))
      return tanggal;
    else if (fieldName.equalsIgnoreCase("SUKUBUNGA"))
      return sukubunga;
    else if (fieldName.equalsIgnoreCase("BANK"))
      return bank;
    else if (fieldName.equalsIgnoreCase("STATUSKEPEMILIKAN"))
      return statuskepemilikan;
    else if (fieldName.equalsIgnoreCase("CAR"))
      return car;
    else if (fieldName.equalsIgnoreCase("NPL"))
      return npl;
    else if (fieldName.equalsIgnoreCase("LDR"))
      return ldr;
    else if (fieldName.equalsIgnoreCase("KESIMPULANRASIO"))
      return kesimpulanrasio;
    else if (fieldName.equalsIgnoreCase("KEPADA"))
      return kepada;
    else if (fieldName.equalsIgnoreCase("DARI"))
      return dari;
    else if (fieldName.equalsIgnoreCase("NOW"))
      return now;
    else if (fieldName.equalsIgnoreCase("CURRENCY"))
      return currency;
    else if (fieldName.equalsIgnoreCase("ORGANIZATIONID"))
      return organizationid;
    else if (fieldName.equalsIgnoreCase("BI"))
      return bi;
    else if (fieldName.equalsIgnoreCase("LPS"))
      return lps;
    else if (fieldName.equalsIgnoreCase("DESKRIPSI_LINE") || fieldName.equals("deskripsiLine"))
      return deskripsiLine;
    else if (fieldName.equalsIgnoreCase("KESIMPULAN_LINE") || fieldName.equals("kesimpulanLine"))
      return kesimpulanLine;
    else if (fieldName.equalsIgnoreCase("TODAY"))
      return today;
    else if (fieldName.equalsIgnoreCase("KESIMPULAN"))
      return kesimpulan;
    else if (fieldName.equalsIgnoreCase("JATUHTEMPO"))
      return jatuhtempo;
    else if (fieldName.equalsIgnoreCase("TOTALASSET"))
      return totalasset;
    else if (fieldName.equalsIgnoreCase("KESIPULANRASIO"))
      return kesipulanrasio;
    else if (fieldName.equalsIgnoreCase("JANGKAWAKTU"))
      return jangkawaktu;
    else if (fieldName.equalsIgnoreCase("STATUSAPPROVE"))
      return statusapprove;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ToolbarPrintData[] select(ConnectionProvider connectionProvider, String recordId)    throws ServletException {
    return select(connectionProvider, recordId, 0, 0);
  }

  public static ToolbarPrintData[] select(ConnectionProvider connectionProvider, String recordId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		SELECT GIL.STATUSINVESTASI AS type, GIL.GNV_INVESTASI_LINE_ID  AS GNV_INVESTASI_LINE_ID ,GIL.AD_ORG_ID AS ORGANISASI,au.name as managerkeuangan,GIL.DOCUMENTNO AS NOMOR, GIH.DESCRIPTION AS PERIHAL, CB.NAME AS CABANGBANK," +
      "    GIL.AMOUNT AS NOMINAL, gil.AMOUNT as amount, cb.NAME as bank_cabang,GIL.NOBILYET AS NOBILYET," +
      "		trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL) ) as bulan," +
      "		 GAI_SAY_AMOUNT(trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL)),'IDR') as bulan_say," +
      "		GIL.TANGGALAKHIR - add_months( GIL.TANGGALAWAL, trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL)) ) as Hari," +
      "		GAI_SAY_AMOUNT(GIL.TANGGALAKHIR - add_months( GIL.TANGGALAWAL, trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL))),'IDR') as Hari_say," +
      "    gil.TANGGALAWAL as TANGGALAWAL,	gil.TANGGALAKHIR AS TANGGALAKHIR,CBL.NAME as alamat, " +
      "		gil.RATE as suku_bunga, cbp.NAME AS bank_cabang_hader," +
      "		TANGGALAWAL||' s/d '|| TANGGALAKHIR as tanggal,GIL.RATE as sukubunga, CB.NAME as bank, GIL.STATUSKEPEMILIKAN AS STATUSKEPEMILIKAN," +
      "		GIL.CAR  as car, GIL.NPL  AS NPL, GIL.LDR  AS LDR , GIL.KESIMPULANRASIO as KESIMPULANRASIO, GIL.KEPADA as KEPADA, GIL.DARI as DARI, NOW() as NOW, CU.ISO_CODE AS CURRENCY," +
      "		GIL.AD_ORG_ID AS ORGANIZATIONID,Gil.BI AS BI,	Gil.LPS AS LPS,Gil.DESCRIPTION as deskripsi_line,	Gil.KESIMPULAN as kesimpulan_line,	NOW() as today,	KESIMPULAN as kesimpulan," +
      "    TANGGALAKHIR as JATUHTEMPO,Gil.TOTALASSET AS TOTALASSET,	Gil.kesimpulanrasio AS KESIPULANRASIO," +
      "    ((GIL.TANGGALAKHIR - GIL.TANGGALAWAL)|| '('||(GAI_SAY_AMOUNT((GIL.TANGGALAKHIR - GIL.TANGGALAWAL),'IDR')||')'|| ' hari') ) AS JANGKAWAKTU, GIL.STATUSAPPROVED AS statusapprove" +
      "    FROM  GNV_INVESTASI_LINE GIL" +
      "		LEFT JOIN GNV_INVESTASI_HEADER GIH ON GIL.GNV_INVESTASI_HEADER_ID = GIH.GNV_INVESTASI_HEADER_ID" +
      "		LEFT JOIN C_BPARTNER CB ON CB.C_BPARTNER_ID = GIL.C_BPARTNER_ID" +
      "    LEFT JOIN C_BPARTNER CBP ON CB.C_BPARTNER_ID = GIH.C_BPARTNER_ID" +
      "    LEFT JOIN C_BPARTNER_LOCATION CBL ON CBL.C_BPARTNER_ID= CB.C_BPARTNER_ID" +
      "		left join C_CURRENCY cu ON CU.C_CURRENCY_ID = GIL.C_CURRENCY_ID" +
      "		, ad_user au" +
      "		WHERE" +
      "		GIL.GNV_INVESTASI_LINE_ID IN (";
    strSql = strSql + ((recordId==null || recordId.equals(""))?"":recordId);
    strSql = strSql + 
      ")" +
      "		and GIL.STATUSINVESTASI = 'Penempatan Deposito On Call'" +
      "		--and AU.AD_ORG_ID = GIL.AD_ORG_ID" +
      "		and AU.TITLE = 'Manajer Keuangan'";

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
        ToolbarPrintData objectToolbarPrintData = new ToolbarPrintData();
        objectToolbarPrintData.type = UtilSql.getValue(result, "TYPE");
        objectToolbarPrintData.gnvInvestasiLineId = UtilSql.getValue(result, "GNV_INVESTASI_LINE_ID");
        objectToolbarPrintData.organisasi = UtilSql.getValue(result, "ORGANISASI");
        objectToolbarPrintData.managerkeuangan = UtilSql.getValue(result, "MANAGERKEUANGAN");
        objectToolbarPrintData.nomor = UtilSql.getValue(result, "NOMOR");
        objectToolbarPrintData.perihal = UtilSql.getValue(result, "PERIHAL");
        objectToolbarPrintData.cabangbank = UtilSql.getValue(result, "CABANGBANK");
        objectToolbarPrintData.nominal = UtilSql.getValue(result, "NOMINAL");
        objectToolbarPrintData.amount = UtilSql.getValue(result, "AMOUNT");
        objectToolbarPrintData.bankCabang = UtilSql.getValue(result, "BANK_CABANG");
        objectToolbarPrintData.nobilyet = UtilSql.getValue(result, "NOBILYET");
        objectToolbarPrintData.bulan = UtilSql.getValue(result, "BULAN");
        objectToolbarPrintData.bulanSay = UtilSql.getValue(result, "BULAN_SAY");
        objectToolbarPrintData.hari = UtilSql.getValue(result, "HARI");
        objectToolbarPrintData.hariSay = UtilSql.getValue(result, "HARI_SAY");
        objectToolbarPrintData.tanggalawal = UtilSql.getDateValue(result, "TANGGALAWAL", "dd-MM-yyyy");
        objectToolbarPrintData.tanggalakhir = UtilSql.getDateValue(result, "TANGGALAKHIR", "dd-MM-yyyy");
        objectToolbarPrintData.alamat = UtilSql.getValue(result, "ALAMAT");
        objectToolbarPrintData.sukuBunga = UtilSql.getValue(result, "SUKU_BUNGA");
        objectToolbarPrintData.bankCabangHader = UtilSql.getValue(result, "BANK_CABANG_HADER");
        objectToolbarPrintData.tanggal = UtilSql.getValue(result, "TANGGAL");
        objectToolbarPrintData.sukubunga = UtilSql.getValue(result, "SUKUBUNGA");
        objectToolbarPrintData.bank = UtilSql.getValue(result, "BANK");
        objectToolbarPrintData.statuskepemilikan = UtilSql.getValue(result, "STATUSKEPEMILIKAN");
        objectToolbarPrintData.car = UtilSql.getValue(result, "CAR");
        objectToolbarPrintData.npl = UtilSql.getValue(result, "NPL");
        objectToolbarPrintData.ldr = UtilSql.getValue(result, "LDR");
        objectToolbarPrintData.kesimpulanrasio = UtilSql.getValue(result, "KESIMPULANRASIO");
        objectToolbarPrintData.kepada = UtilSql.getValue(result, "KEPADA");
        objectToolbarPrintData.dari = UtilSql.getValue(result, "DARI");
        objectToolbarPrintData.now = UtilSql.getDateValue(result, "NOW", "dd-MM-yyyy");
        objectToolbarPrintData.currency = UtilSql.getValue(result, "CURRENCY");
        objectToolbarPrintData.organizationid = UtilSql.getValue(result, "ORGANIZATIONID");
        objectToolbarPrintData.bi = UtilSql.getValue(result, "BI");
        objectToolbarPrintData.lps = UtilSql.getValue(result, "LPS");
        objectToolbarPrintData.deskripsiLine = UtilSql.getValue(result, "DESKRIPSI_LINE");
        objectToolbarPrintData.kesimpulanLine = UtilSql.getValue(result, "KESIMPULAN_LINE");
        objectToolbarPrintData.today = UtilSql.getDateValue(result, "TODAY", "dd-MM-yyyy");
        objectToolbarPrintData.kesimpulan = UtilSql.getValue(result, "KESIMPULAN");
        objectToolbarPrintData.jatuhtempo = UtilSql.getDateValue(result, "JATUHTEMPO", "dd-MM-yyyy");
        objectToolbarPrintData.totalasset = UtilSql.getValue(result, "TOTALASSET");
        objectToolbarPrintData.kesipulanrasio = UtilSql.getValue(result, "KESIPULANRASIO");
        objectToolbarPrintData.jangkawaktu = UtilSql.getValue(result, "JANGKAWAKTU");
        objectToolbarPrintData.statusapprove = UtilSql.getValue(result, "STATUSAPPROVE");
        objectToolbarPrintData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectToolbarPrintData);
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
    ToolbarPrintData objectToolbarPrintData[] = new ToolbarPrintData[vector.size()];
    vector.copyInto(objectToolbarPrintData);
    return(objectToolbarPrintData);
  }

  public static ToolbarPrintData[] selectPenempatanDepositoOnCall(ConnectionProvider connectionProvider, String recordId)    throws ServletException {
    return selectPenempatanDepositoOnCall(connectionProvider, recordId, 0, 0);
  }

  public static ToolbarPrintData[] selectPenempatanDepositoOnCall(ConnectionProvider connectionProvider, String recordId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    	SELECT GIL.GNV_INVESTASI_LINE_ID as GNV_INVESTASI_LINE_ID ,GIL.AD_ORG_ID AS ORGANISASI,au.name as managerkeuangan,GIL.DOCUMENTNO AS NOMOR, GIH.DESCRIPTION AS PERIHAL, CB.NAME AS CABANGBANK, GIL.AMOUNT AS NOMINAL," +
      "		trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL) ) as bulan," +
      "		 GAI_SAY_AMOUNT(trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL)),'IDR') as bulan_say," +
      "		GIL.TANGGALAKHIR - add_months( GIL.TANGGALAWAL, trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL)) ) as Hari," +
      "		GAI_SAY_AMOUNT(GIL.TANGGALAKHIR - add_months( GIL.TANGGALAWAL, trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL))),'IDR') as Hari_say," +
      "		TANGGALAWAL||' s/d '|| TANGGALAKHIR as tanggal,GIL.RATE as sukubunga, CB.NAME as bank, GIL.STATUSKEPEMILIKAN AS STATUSKEPEMILIKAN," +
      "		GIL.CAR  as car, GIL.NPL  AS NPL, GIL.LDR  AS LDR , GIL.KESIMPULANRASIO, GIL.KEPADA, GIL.DARI, NOW() as NOW, CU.ISO_CODE AS CURRENCY," +
      "		GIL.AD_ORG_ID AS ORGANIZATIONID" +
      "		FROM  GNV_INVESTASI_LINE GIL" +
      "		LEFT JOIN GNV_INVESTASI_HEADER GIH ON GIL.GNV_INVESTASI_HEADER_ID = GIH.GNV_INVESTASI_HEADER_ID" +
      "		LEFT JOIN C_BPARTNER CB ON CB.C_BPARTNER_ID = GIL.C_BPARTNER_ID" +
      "		left join C_CURRENCY cu ON CU.C_CURRENCY_ID = GIL.C_CURRENCY_ID" +
      "		, ad_user au" +
      "		WHERE" +
      "		GIL.GNV_INVESTASI_LINE_ID IN (";
    strSql = strSql + ((recordId==null || recordId.equals(""))?"":recordId);
    strSql = strSql + 
      ")" +
      "		and GIL.STATUSINVESTASI = 'Penempatan Deposito On Call'" +
      "		--and AU.AD_ORG_ID = GIL.AD_ORG_ID" +
      "		and AU.TITLE = 'Manajer Keuangan'";

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
        ToolbarPrintData objectToolbarPrintData = new ToolbarPrintData();
        objectToolbarPrintData.gnvInvestasiLineId = UtilSql.getValue(result, "GNV_INVESTASI_LINE_ID");
        objectToolbarPrintData.organisasi = UtilSql.getValue(result, "ORGANISASI");
        objectToolbarPrintData.managerkeuangan = UtilSql.getValue(result, "MANAGERKEUANGAN");
        objectToolbarPrintData.nomor = UtilSql.getValue(result, "NOMOR");
        objectToolbarPrintData.perihal = UtilSql.getValue(result, "PERIHAL");
        objectToolbarPrintData.cabangbank = UtilSql.getValue(result, "CABANGBANK");
        objectToolbarPrintData.nominal = UtilSql.getValue(result, "NOMINAL");
        objectToolbarPrintData.bulan = UtilSql.getValue(result, "BULAN");
        objectToolbarPrintData.bulanSay = UtilSql.getValue(result, "BULAN_SAY");
        objectToolbarPrintData.hari = UtilSql.getValue(result, "HARI");
        objectToolbarPrintData.hariSay = UtilSql.getValue(result, "HARI_SAY");
        objectToolbarPrintData.tanggal = UtilSql.getValue(result, "TANGGAL");
        objectToolbarPrintData.sukubunga = UtilSql.getValue(result, "SUKUBUNGA");
        objectToolbarPrintData.bank = UtilSql.getValue(result, "BANK");
        objectToolbarPrintData.statuskepemilikan = UtilSql.getValue(result, "STATUSKEPEMILIKAN");
        objectToolbarPrintData.car = UtilSql.getValue(result, "CAR");
        objectToolbarPrintData.npl = UtilSql.getValue(result, "NPL");
        objectToolbarPrintData.ldr = UtilSql.getValue(result, "LDR");
        objectToolbarPrintData.kesimpulanrasio = UtilSql.getValue(result, "KESIMPULANRASIO");
        objectToolbarPrintData.kepada = UtilSql.getValue(result, "KEPADA");
        objectToolbarPrintData.dari = UtilSql.getValue(result, "DARI");
        objectToolbarPrintData.now = UtilSql.getDateValue(result, "NOW", "dd-MM-yyyy");
        objectToolbarPrintData.currency = UtilSql.getValue(result, "CURRENCY");
        objectToolbarPrintData.organizationid = UtilSql.getValue(result, "ORGANIZATIONID");
        objectToolbarPrintData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectToolbarPrintData);
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
    ToolbarPrintData objectToolbarPrintData[] = new ToolbarPrintData[vector.size()];
    vector.copyInto(objectToolbarPrintData);
    return(objectToolbarPrintData);
  }

  public static ToolbarPrintData[] selectPenempatanMudharabah(ConnectionProvider connectionProvider, String recordId)    throws ServletException {
    return selectPenempatanMudharabah(connectionProvider, recordId, 0, 0);
  }

  public static ToolbarPrintData[] selectPenempatanMudharabah(ConnectionProvider connectionProvider, String recordId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "		select" +
      "		au.name as managerkeuangan," +
      "		gil.AD_ORG_ID as ORGANIZATIONID," +
      "		gil.DOCUMENTNO as nomor," +
      "		gil.KEPADA as kepada," +
      "		gil.DARI as dari," +
      "		gil.PERIHAL as perihal," +
      "		gil.AMOUNT as amount," +
      "		cb.NAME as bank_cabang," +
      "		gil.TANGGALAWAL as TANGGALAWAL," +
      "		gil.TANGGALAKHIR AS TANGGALAKHIR," +
      "		 trunc(months_between(gil.TANGGALAKHIR,gil.TANGGALAWAL) ) AS bulan," +
      "		 GAI_SAY_AMOUNT(trunc(months_between(gil.TANGGALAKHIR,gil.TANGGALAWAL)),'IDR') as bulan_say," +
      "		 gil.TANGGALAKHIR - add_months( gil.TANGGALAWAL, trunc(months_between(gil.TANGGALAKHIR,gil.TANGGALAWAL)) ) AS Hari," +
      "		GAI_SAY_AMOUNT(gil.TANGGALAKHIR - add_months( gil.TANGGALAWAL, trunc(months_between(gil.TANGGALAKHIR,gil.TANGGALAWAL))) ,'IDR') as Hari_Say," +
      "		gil.RATE as suku_bunga," +
      "		cbp.NAME AS bank_cabang_hader," +
      "		gil.CAR AS CAR," +
      "		gil.NPL AS NPL," +
      "		gil.LDR AS LDR," +
      "		Gil.BI AS BI," +
      "		Gil.LPS AS LPS," +
      "		Gil.DESCRIPTION as deskripsi_line," +
      "		Gil.KESIMPULAN as kesimpulan_line," +
      "		NOW() as today," +
      "		Gil.TOTALASSET AS TOTALASSET," +
      "		Gil.kesimpulanrasio AS KESIPULANRASIO," +
      "		 Gil.AD_ORG_ID AS ORGANIZATIONID" +
      "		from GNV_INVESTASI_HEADER gih" +
      "		left join GNV_INVESTASI_lINE gil on (gil.GNV_INVESTASI_HEADER_ID = gih.GNV_INVESTASI_HEADER_ID)" +
      "		left join C_BPARTNER cb ON (cb.C_BPARTNER_ID = gil.C_BPARTNER_ID)" +
      "		left join C_BPARTNER cbp ON (cbp.C_BPARTNER_ID = gih.C_BPARTNER_ID)" +
      "		, ad_user au" +
      "		WHERE" +
      "		GIL.GNV_INVESTASI_LINE_ID IN (";
    strSql = strSql + ((recordId==null || recordId.equals(""))?"":recordId);
    strSql = strSql + 
      ")" +
      "		and gil.STATUSINVESTASI = 'Penempatan Mudharabah'" +
      "		--and AU.AD_ORG_ID = gil.AD_ORG_ID" +
      "		and AU.TITLE = 'Manajer Keuangan'";

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
        ToolbarPrintData objectToolbarPrintData = new ToolbarPrintData();
        objectToolbarPrintData.managerkeuangan = UtilSql.getValue(result, "MANAGERKEUANGAN");
        objectToolbarPrintData.organizationid = UtilSql.getValue(result, "ORGANIZATIONID");
        objectToolbarPrintData.nomor = UtilSql.getValue(result, "NOMOR");
        objectToolbarPrintData.kepada = UtilSql.getValue(result, "KEPADA");
        objectToolbarPrintData.dari = UtilSql.getValue(result, "DARI");
        objectToolbarPrintData.perihal = UtilSql.getValue(result, "PERIHAL");
        objectToolbarPrintData.amount = UtilSql.getValue(result, "AMOUNT");
        objectToolbarPrintData.bankCabang = UtilSql.getValue(result, "BANK_CABANG");
        objectToolbarPrintData.tanggalawal = UtilSql.getDateValue(result, "TANGGALAWAL", "dd-MM-yyyy");
        objectToolbarPrintData.tanggalakhir = UtilSql.getDateValue(result, "TANGGALAKHIR", "dd-MM-yyyy");
        objectToolbarPrintData.bulan = UtilSql.getValue(result, "BULAN");
        objectToolbarPrintData.bulanSay = UtilSql.getValue(result, "BULAN_SAY");
        objectToolbarPrintData.hari = UtilSql.getValue(result, "HARI");
        objectToolbarPrintData.hariSay = UtilSql.getValue(result, "HARI_SAY");
        objectToolbarPrintData.sukuBunga = UtilSql.getValue(result, "SUKU_BUNGA");
        objectToolbarPrintData.bankCabangHader = UtilSql.getValue(result, "BANK_CABANG_HADER");
        objectToolbarPrintData.car = UtilSql.getValue(result, "CAR");
        objectToolbarPrintData.npl = UtilSql.getValue(result, "NPL");
        objectToolbarPrintData.ldr = UtilSql.getValue(result, "LDR");
        objectToolbarPrintData.bi = UtilSql.getValue(result, "BI");
        objectToolbarPrintData.lps = UtilSql.getValue(result, "LPS");
        objectToolbarPrintData.deskripsiLine = UtilSql.getValue(result, "DESKRIPSI_LINE");
        objectToolbarPrintData.kesimpulanLine = UtilSql.getValue(result, "KESIMPULAN_LINE");
        objectToolbarPrintData.today = UtilSql.getDateValue(result, "TODAY", "dd-MM-yyyy");
        objectToolbarPrintData.totalasset = UtilSql.getValue(result, "TOTALASSET");
        objectToolbarPrintData.kesipulanrasio = UtilSql.getValue(result, "KESIPULANRASIO");
        objectToolbarPrintData.organizationid = UtilSql.getValue(result, "ORGANIZATIONID");
        objectToolbarPrintData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectToolbarPrintData);
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
    ToolbarPrintData objectToolbarPrintData[] = new ToolbarPrintData[vector.size()];
    vector.copyInto(objectToolbarPrintData);
    return(objectToolbarPrintData);
  }

  public static ToolbarPrintData[] selectPerpanjanganMudharabah(ConnectionProvider connectionProvider, String recordId)    throws ServletException {
    return selectPerpanjanganMudharabah(connectionProvider, recordId, 0, 0);
  }

  public static ToolbarPrintData[] selectPerpanjanganMudharabah(ConnectionProvider connectionProvider, String recordId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    	SELECT GIL.GNV_INVESTASI_LINE_ID AS GNV_INVESTASI_LINE_ID,GIL.AD_ORG_ID AS ORGANISASI,au.name as managerkeuangan,GIL.DOCUMENTNO AS NOMOR , GIL.KEPADA AS KEPADA," +
      "		GIL.DARI AS DARI, GIH.DESCRIPTION AS PERIHAL, CB.NAME AS CABANGBANK, GIL.NOBILYET AS NOBILYET," +
      "		GIL.AMOUNT AS NOMINAL," +
      "		((GIL.TANGGALAKHIR - GIL.TANGGALAWAL)|| '('||(GAI_SAY_AMOUNT((GIL.TANGGALAKHIR - GIL.TANGGALAWAL),'IDR')||')'|| ' hari') ) AS JANGKAWAKTU," +
      "		GIL.TANGGALAWAL AS TANGGALAWAL," +
      "		TANGGALAKHIR as JATUHTEMPO,GIL.RATE as sukubunga," +
      "		GIL.CAR  as car, GIL.NPL  AS NPL, GIL.LDR  AS LDR , GIL.KESIMPULANRASIO AS KESIMPULANRASIO, NOW() AS NOW, CU.ISO_CODE AS CURRENCY," +
      "		GIL.DESCRIPTION as deskripsi_line, GIL.BI AS BI, GIL.LPS AS LPS, GIL.KESIMPULAN AS KESIMPULAN," +
      "		trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL) ) AS bulan," +
      "		 GAI_SAY_AMOUNT(trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL)),'IDR') as bulan_say," +
      "		GIL.TANGGALAKHIR - add_months( GIL.TANGGALAWAL, trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL)) ) AS Hari," +
      "		GAI_SAY_AMOUNT(GIL.TANGGALAKHIR - add_months( GIL.TANGGALAWAL, trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL))),'IDR') AS Hari_say," +
      "		GIL.AD_ORG_ID AS ORGANIZATIONID" +
      "		FROM  GNV_INVESTASI_LINE GIL" +
      "		LEFT JOIN GNV_INVESTASI_HEADER GIH ON GIL.GNV_INVESTASI_HEADER_ID = GIH.GNV_INVESTASI_HEADER_ID" +
      "		LEFT JOIN C_BPARTNER CB ON CB.C_BPARTNER_ID = GIL.C_BPARTNER_ID" +
      "		left join C_CURRENCY cu ON CU.C_CURRENCY_ID = GIL.C_CURRENCY_ID" +
      "		, ad_user au" +
      "		WHERE" +
      "		GIL.GNV_INVESTASI_LINE_ID IN (";
    strSql = strSql + ((recordId==null || recordId.equals(""))?"":recordId);
    strSql = strSql + 
      ")" +
      "		and" +
      "		GIL.STATUSINVESTASI = 'Perpanjangan Mudharabah'" +
      "		--and AU.AD_ORG_ID = GIL.AD_ORG_ID" +
      "		and" +
      "		AU.TITLE = 'Manajer Keuangan'";

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
        ToolbarPrintData objectToolbarPrintData = new ToolbarPrintData();
        objectToolbarPrintData.gnvInvestasiLineId = UtilSql.getValue(result, "GNV_INVESTASI_LINE_ID");
        objectToolbarPrintData.organisasi = UtilSql.getValue(result, "ORGANISASI");
        objectToolbarPrintData.managerkeuangan = UtilSql.getValue(result, "MANAGERKEUANGAN");
        objectToolbarPrintData.nomor = UtilSql.getValue(result, "NOMOR");
        objectToolbarPrintData.kepada = UtilSql.getValue(result, "KEPADA");
        objectToolbarPrintData.dari = UtilSql.getValue(result, "DARI");
        objectToolbarPrintData.perihal = UtilSql.getValue(result, "PERIHAL");
        objectToolbarPrintData.cabangbank = UtilSql.getValue(result, "CABANGBANK");
        objectToolbarPrintData.nobilyet = UtilSql.getValue(result, "NOBILYET");
        objectToolbarPrintData.nominal = UtilSql.getValue(result, "NOMINAL");
        objectToolbarPrintData.jangkawaktu = UtilSql.getValue(result, "JANGKAWAKTU");
        objectToolbarPrintData.tanggalawal = UtilSql.getDateValue(result, "TANGGALAWAL", "dd-MM-yyyy");
        objectToolbarPrintData.jatuhtempo = UtilSql.getDateValue(result, "JATUHTEMPO", "dd-MM-yyyy");
        objectToolbarPrintData.sukubunga = UtilSql.getValue(result, "SUKUBUNGA");
        objectToolbarPrintData.car = UtilSql.getValue(result, "CAR");
        objectToolbarPrintData.npl = UtilSql.getValue(result, "NPL");
        objectToolbarPrintData.ldr = UtilSql.getValue(result, "LDR");
        objectToolbarPrintData.kesimpulanrasio = UtilSql.getValue(result, "KESIMPULANRASIO");
        objectToolbarPrintData.now = UtilSql.getDateValue(result, "NOW", "dd-MM-yyyy");
        objectToolbarPrintData.currency = UtilSql.getValue(result, "CURRENCY");
        objectToolbarPrintData.deskripsiLine = UtilSql.getValue(result, "DESKRIPSI_LINE");
        objectToolbarPrintData.bi = UtilSql.getValue(result, "BI");
        objectToolbarPrintData.lps = UtilSql.getValue(result, "LPS");
        objectToolbarPrintData.kesimpulan = UtilSql.getValue(result, "KESIMPULAN");
        objectToolbarPrintData.bulan = UtilSql.getValue(result, "BULAN");
        objectToolbarPrintData.bulanSay = UtilSql.getValue(result, "BULAN_SAY");
        objectToolbarPrintData.hari = UtilSql.getValue(result, "HARI");
        objectToolbarPrintData.hariSay = UtilSql.getValue(result, "HARI_SAY");
        objectToolbarPrintData.organizationid = UtilSql.getValue(result, "ORGANIZATIONID");
        objectToolbarPrintData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectToolbarPrintData);
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
    ToolbarPrintData objectToolbarPrintData[] = new ToolbarPrintData[vector.size()];
    vector.copyInto(objectToolbarPrintData);
    return(objectToolbarPrintData);
  }

  public static ToolbarPrintData[] selectPencairanMudharabah(ConnectionProvider connectionProvider, String recordId)    throws ServletException {
    return selectPencairanMudharabah(connectionProvider, recordId, 0, 0);
  }

  public static ToolbarPrintData[] selectPencairanMudharabah(ConnectionProvider connectionProvider, String recordId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    	SELECT GIL.STATUSINVESTASI AS type, GIL.GNV_INVESTASI_LINE_ID  AS GNV_INVESTASI_LINE_ID ,GIL.AD_ORG_ID AS ORGANISASI,au.name as managerkeuangan,GIL.DOCUMENTNO AS NOMOR, GIH.DESCRIPTION AS PERIHAL, CB.NAME AS CABANGBANK," +
      "    GIL.AMOUNT AS NOMINAL, gil.AMOUNT as amount, cb.NAME as bank_cabang,GIL.NOBILYET AS NOBILYET," +
      "		trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL) ) as bulan," +
      "		 GAI_SAY_AMOUNT(trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL)),'IDR') as bulan_say," +
      "		GIL.TANGGALAKHIR - add_months( GIL.TANGGALAWAL, trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL)) ) as Hari," +
      "		GAI_SAY_AMOUNT(GIL.TANGGALAKHIR - add_months( GIL.TANGGALAWAL, trunc(months_between(GIL.TANGGALAKHIR,GIL.TANGGALAWAL))),'IDR') as Hari_say," +
      "    gil.TANGGALAWAL as TANGGALAWAL,	gil.TANGGALAKHIR AS TANGGALAKHIR,CBL.NAME as alamat, " +
      "		 gil.RATE as suku_bunga, cbp.NAME AS bank_cabang_hader," +
      "		TANGGALAWAL||' s/d '|| TANGGALAKHIR as tanggal,GIL.RATE as sukubunga, CB.NAME as bank, GIL.STATUSKEPEMILIKAN AS STATUSKEPEMILIKAN," +
      "		GIL.CAR  as car, GIL.NPL  AS NPL, GIL.LDR  AS LDR , GIL.KESIMPULANRASIO as KESIMPULANRASIO, GIL.KEPADA as KEPADA, GIL.DARI as DARI, NOW() as NOW, CU.ISO_CODE AS CURRENCY," +
      "		GIL.AD_ORG_ID AS ORGANIZATIONID,Gil.BI AS BI,	Gil.LPS AS LPS,Gil.DESCRIPTION as deskripsi_line,	Gil.KESIMPULAN as kesimpulan_line,	NOW() as today,	KESIMPULAN as kesimpulan," +
      "    TANGGALAKHIR as JATUHTEMPO,Gil.TOTALASSET AS TOTALASSET,	Gil.kesimpulanrasio AS KESIPULANRASIO," +
      "    ((GIL.TANGGALAKHIR - GIL.TANGGALAWAL)|| '('||(GAI_SAY_AMOUNT((GIL.TANGGALAKHIR - GIL.TANGGALAWAL),'IDR')||')'|| ' hari') ) AS JANGKAWAKTU" +
      "    FROM  GNV_INVESTASI_LINE GIL" +
      "		LEFT JOIN GNV_INVESTASI_HEADER GIH ON GIL.GNV_INVESTASI_HEADER_ID = GIH.GNV_INVESTASI_HEADER_ID" +
      "		LEFT JOIN C_BPARTNER CB ON CB.C_BPARTNER_ID = GIL.C_BPARTNER_ID" +
      "    LEFT JOIN C_BPARTNER CBP ON CB.C_BPARTNER_ID = GIH.C_BPARTNER_ID" +
      "    LEFT JOIN C_BPARTNER_LOCATION CBL ON CBL.C_BPARTNER_ID= CB.C_BPARTNER_ID" +
      "		left join C_CURRENCY cu ON CU.C_CURRENCY_ID = GIL.C_CURRENCY_ID" +
      "		, ad_user au" +
      "		WHERE" +
      "		GIL.GNV_INVESTASI_LINE_ID IN (";
    strSql = strSql + ((recordId==null || recordId.equals(""))?"":recordId);
    strSql = strSql + 
      ")" +
      "		and gil.STATUSINVESTASI = 'Pencairan Mudharabah'" +
      "		--and AU.AD_ORG_ID = GIL.AD_ORG_ID" +
      "		and AU.TITLE = 'Manajer Keuangan'";

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
        ToolbarPrintData objectToolbarPrintData = new ToolbarPrintData();
        objectToolbarPrintData.type = UtilSql.getValue(result, "TYPE");
        objectToolbarPrintData.gnvInvestasiLineId = UtilSql.getValue(result, "GNV_INVESTASI_LINE_ID");
        objectToolbarPrintData.organisasi = UtilSql.getValue(result, "ORGANISASI");
        objectToolbarPrintData.managerkeuangan = UtilSql.getValue(result, "MANAGERKEUANGAN");
        objectToolbarPrintData.nomor = UtilSql.getValue(result, "NOMOR");
        objectToolbarPrintData.perihal = UtilSql.getValue(result, "PERIHAL");
        objectToolbarPrintData.cabangbank = UtilSql.getValue(result, "CABANGBANK");
        objectToolbarPrintData.nominal = UtilSql.getValue(result, "NOMINAL");
        objectToolbarPrintData.amount = UtilSql.getValue(result, "AMOUNT");
        objectToolbarPrintData.bankCabang = UtilSql.getValue(result, "BANK_CABANG");
        objectToolbarPrintData.nobilyet = UtilSql.getValue(result, "NOBILYET");
        objectToolbarPrintData.bulan = UtilSql.getValue(result, "BULAN");
        objectToolbarPrintData.bulanSay = UtilSql.getValue(result, "BULAN_SAY");
        objectToolbarPrintData.hari = UtilSql.getValue(result, "HARI");
        objectToolbarPrintData.hariSay = UtilSql.getValue(result, "HARI_SAY");
        objectToolbarPrintData.tanggalawal = UtilSql.getDateValue(result, "TANGGALAWAL", "dd-MM-yyyy");
        objectToolbarPrintData.tanggalakhir = UtilSql.getDateValue(result, "TANGGALAKHIR", "dd-MM-yyyy");
        objectToolbarPrintData.alamat = UtilSql.getValue(result, "ALAMAT");
        objectToolbarPrintData.sukuBunga = UtilSql.getValue(result, "SUKU_BUNGA");
        objectToolbarPrintData.bankCabangHader = UtilSql.getValue(result, "BANK_CABANG_HADER");
        objectToolbarPrintData.tanggal = UtilSql.getValue(result, "TANGGAL");
        objectToolbarPrintData.sukubunga = UtilSql.getValue(result, "SUKUBUNGA");
        objectToolbarPrintData.bank = UtilSql.getValue(result, "BANK");
        objectToolbarPrintData.statuskepemilikan = UtilSql.getValue(result, "STATUSKEPEMILIKAN");
        objectToolbarPrintData.car = UtilSql.getValue(result, "CAR");
        objectToolbarPrintData.npl = UtilSql.getValue(result, "NPL");
        objectToolbarPrintData.ldr = UtilSql.getValue(result, "LDR");
        objectToolbarPrintData.kesimpulanrasio = UtilSql.getValue(result, "KESIMPULANRASIO");
        objectToolbarPrintData.kepada = UtilSql.getValue(result, "KEPADA");
        objectToolbarPrintData.dari = UtilSql.getValue(result, "DARI");
        objectToolbarPrintData.now = UtilSql.getDateValue(result, "NOW", "dd-MM-yyyy");
        objectToolbarPrintData.currency = UtilSql.getValue(result, "CURRENCY");
        objectToolbarPrintData.organizationid = UtilSql.getValue(result, "ORGANIZATIONID");
        objectToolbarPrintData.bi = UtilSql.getValue(result, "BI");
        objectToolbarPrintData.lps = UtilSql.getValue(result, "LPS");
        objectToolbarPrintData.deskripsiLine = UtilSql.getValue(result, "DESKRIPSI_LINE");
        objectToolbarPrintData.kesimpulanLine = UtilSql.getValue(result, "KESIMPULAN_LINE");
        objectToolbarPrintData.today = UtilSql.getDateValue(result, "TODAY", "dd-MM-yyyy");
        objectToolbarPrintData.kesimpulan = UtilSql.getValue(result, "KESIMPULAN");
        objectToolbarPrintData.jatuhtempo = UtilSql.getDateValue(result, "JATUHTEMPO", "dd-MM-yyyy");
        objectToolbarPrintData.totalasset = UtilSql.getValue(result, "TOTALASSET");
        objectToolbarPrintData.kesipulanrasio = UtilSql.getValue(result, "KESIPULANRASIO");
        objectToolbarPrintData.jangkawaktu = UtilSql.getValue(result, "JANGKAWAKTU");
        objectToolbarPrintData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectToolbarPrintData);
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
    ToolbarPrintData objectToolbarPrintData[] = new ToolbarPrintData[vector.size()];
    vector.copyInto(objectToolbarPrintData);
    return(objectToolbarPrintData);
  }

  public static ToolbarPrintData[] selectType(ConnectionProvider connectionProvider, String recordId)    throws ServletException {
    return selectType(connectionProvider, recordId, 0, 0);
  }

  public static ToolbarPrintData[] selectType(ConnectionProvider connectionProvider, String recordId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    	SELECT GIL.STATUSINVESTASI AS type, GIL.STATUSAPPROVED AS statusapprove" +
      "		FROM  GNV_INVESTASI_LINE GIL" +
      "		WHERE" +
      "		GIL.GNV_INVESTASI_LINE_ID IN (";
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
        ToolbarPrintData objectToolbarPrintData = new ToolbarPrintData();
        objectToolbarPrintData.type = UtilSql.getValue(result, "TYPE");
        objectToolbarPrintData.statusapprove = UtilSql.getValue(result, "STATUSAPPROVE");
        objectToolbarPrintData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectToolbarPrintData);
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
    ToolbarPrintData objectToolbarPrintData[] = new ToolbarPrintData[vector.size()];
    vector.copyInto(objectToolbarPrintData);
    return(objectToolbarPrintData);
  }
}
