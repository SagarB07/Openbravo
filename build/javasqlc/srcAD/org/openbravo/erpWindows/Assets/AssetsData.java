//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Assets;

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
class AssetsData implements FieldProvider {
static Logger log4j = Logger.getLogger(AssetsData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String emGasDoctypeId;
  public String value;
  public String name;
  public String aAssetGroupId;
  public String aAssetGroupIdr;
  public String documentno;
  public String description;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String emGasOrderlineId;
  public String mProductId;
  public String mProductIdr;
  public String mLocatorId;
  public String mLocatorIdr;
  public String issummary;
  public String isstatic;
  public String emGasStatus;
  public String emGasStatusr;
  public String emGasTglmove;
  public String emGmmMasterDepartmentId;
  public String isdepreciated;
  public String emGaiKantorId;
  public String emGasNamapemegang;
  public String emGasKondisiasset;
  public String emGasKondisiassetr;
  public String amortizationtype;
  public String amortizationtyper;
  public String amortizationcalctype;
  public String amortizationcalctyper;
  public String annualamortizationpercentage;
  public String assetschedule;
  public String assetscheduler;
  public String uselifeyears;
  public String uselifemonths;
  public String is30daymonth;
  public String datepurchased;
  public String datecancelled;
  public String amortizationstartdate;
  public String amortizationenddate;
  public String assetvalueamt;
  public String residualassetvalueamt;
  public String amortizationvalueamt;
  public String depreciatedpreviousamt;
  public String processed;
  public String depreciatedvalue;
  public String depreciatedplan;
  public String isfullydepreciated;
  public String mAttributesetinstanceId;
  public String isactive;
  public String qty;
  public String cProjectId;
  public String cProjectIdr;
  public String processAsset;
  public String processAssetBtn;
  public String emGasButtonAsset;
  public String emGasSaved;
  public String emGasInventoryId;
  public String emGasIsgaransi;
  public String emGasSerialno;
  public String emGasAlamatsc;
  public String emGasTanggalawalgaransi;
  public String emGasTanggalakhirgaransi;
  public String emGasApprovewo;
  public String lifeuseunits;
  public String isinposession;
  public String profit;
  public String acctvalueamt;
  public String aAssetId;
  public String cBpartnerLocationId;
  public String cLocationId;
  public String isdisposed;
  public String assetdisposaldate;
  public String assetservicedate;
  public String adUserId;
  public String useunits;
  public String assetdepreciationdate;
  public String guaranteedate;
  public String isowned;
  public String cBpartnerId;
  public String lot;
  public String help;
  public String locationcomment;
  public String versionno;
  public String serno;
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
    else if (fieldName.equalsIgnoreCase("EM_GAS_DOCTYPE_ID") || fieldName.equals("emGasDoctypeId"))
      return emGasDoctypeId;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("A_ASSET_GROUP_ID") || fieldName.equals("aAssetGroupId"))
      return aAssetGroupId;
    else if (fieldName.equalsIgnoreCase("A_ASSET_GROUP_IDR") || fieldName.equals("aAssetGroupIdr"))
      return aAssetGroupIdr;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("EM_GAS_ORDERLINE_ID") || fieldName.equals("emGasOrderlineId"))
      return emGasOrderlineId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_IDR") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("M_LOCATOR_ID") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("M_LOCATOR_IDR") || fieldName.equals("mLocatorIdr"))
      return mLocatorIdr;
    else if (fieldName.equalsIgnoreCase("ISSUMMARY"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("ISSTATIC"))
      return isstatic;
    else if (fieldName.equalsIgnoreCase("EM_GAS_STATUS") || fieldName.equals("emGasStatus"))
      return emGasStatus;
    else if (fieldName.equalsIgnoreCase("EM_GAS_STATUSR") || fieldName.equals("emGasStatusr"))
      return emGasStatusr;
    else if (fieldName.equalsIgnoreCase("EM_GAS_TGLMOVE") || fieldName.equals("emGasTglmove"))
      return emGasTglmove;
    else if (fieldName.equalsIgnoreCase("EM_GMM_MASTER_DEPARTMENT_ID") || fieldName.equals("emGmmMasterDepartmentId"))
      return emGmmMasterDepartmentId;
    else if (fieldName.equalsIgnoreCase("ISDEPRECIATED"))
      return isdepreciated;
    else if (fieldName.equalsIgnoreCase("EM_GAI_KANTOR_ID") || fieldName.equals("emGaiKantorId"))
      return emGaiKantorId;
    else if (fieldName.equalsIgnoreCase("EM_GAS_NAMAPEMEGANG") || fieldName.equals("emGasNamapemegang"))
      return emGasNamapemegang;
    else if (fieldName.equalsIgnoreCase("EM_GAS_KONDISIASSET") || fieldName.equals("emGasKondisiasset"))
      return emGasKondisiasset;
    else if (fieldName.equalsIgnoreCase("EM_GAS_KONDISIASSETR") || fieldName.equals("emGasKondisiassetr"))
      return emGasKondisiassetr;
    else if (fieldName.equalsIgnoreCase("AMORTIZATIONTYPE"))
      return amortizationtype;
    else if (fieldName.equalsIgnoreCase("AMORTIZATIONTYPER"))
      return amortizationtyper;
    else if (fieldName.equalsIgnoreCase("AMORTIZATIONCALCTYPE"))
      return amortizationcalctype;
    else if (fieldName.equalsIgnoreCase("AMORTIZATIONCALCTYPER"))
      return amortizationcalctyper;
    else if (fieldName.equalsIgnoreCase("ANNUALAMORTIZATIONPERCENTAGE"))
      return annualamortizationpercentage;
    else if (fieldName.equalsIgnoreCase("ASSETSCHEDULE"))
      return assetschedule;
    else if (fieldName.equalsIgnoreCase("ASSETSCHEDULER"))
      return assetscheduler;
    else if (fieldName.equalsIgnoreCase("USELIFEYEARS"))
      return uselifeyears;
    else if (fieldName.equalsIgnoreCase("USELIFEMONTHS"))
      return uselifemonths;
    else if (fieldName.equalsIgnoreCase("IS30DAYMONTH"))
      return is30daymonth;
    else if (fieldName.equalsIgnoreCase("DATEPURCHASED"))
      return datepurchased;
    else if (fieldName.equalsIgnoreCase("DATECANCELLED"))
      return datecancelled;
    else if (fieldName.equalsIgnoreCase("AMORTIZATIONSTARTDATE"))
      return amortizationstartdate;
    else if (fieldName.equalsIgnoreCase("AMORTIZATIONENDDATE"))
      return amortizationenddate;
    else if (fieldName.equalsIgnoreCase("ASSETVALUEAMT"))
      return assetvalueamt;
    else if (fieldName.equalsIgnoreCase("RESIDUALASSETVALUEAMT"))
      return residualassetvalueamt;
    else if (fieldName.equalsIgnoreCase("AMORTIZATIONVALUEAMT"))
      return amortizationvalueamt;
    else if (fieldName.equalsIgnoreCase("DEPRECIATEDPREVIOUSAMT"))
      return depreciatedpreviousamt;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("DEPRECIATEDVALUE"))
      return depreciatedvalue;
    else if (fieldName.equalsIgnoreCase("DEPRECIATEDPLAN"))
      return depreciatedplan;
    else if (fieldName.equalsIgnoreCase("ISFULLYDEPRECIATED"))
      return isfullydepreciated;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("QTY"))
      return qty;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_IDR") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("PROCESS_ASSET") || fieldName.equals("processAsset"))
      return processAsset;
    else if (fieldName.equalsIgnoreCase("PROCESS_ASSET_BTN") || fieldName.equals("processAssetBtn"))
      return processAssetBtn;
    else if (fieldName.equalsIgnoreCase("EM_GAS_BUTTON_ASSET") || fieldName.equals("emGasButtonAsset"))
      return emGasButtonAsset;
    else if (fieldName.equalsIgnoreCase("EM_GAS_SAVED") || fieldName.equals("emGasSaved"))
      return emGasSaved;
    else if (fieldName.equalsIgnoreCase("EM_GAS_INVENTORY_ID") || fieldName.equals("emGasInventoryId"))
      return emGasInventoryId;
    else if (fieldName.equalsIgnoreCase("EM_GAS_ISGARANSI") || fieldName.equals("emGasIsgaransi"))
      return emGasIsgaransi;
    else if (fieldName.equalsIgnoreCase("EM_GAS_SERIALNO") || fieldName.equals("emGasSerialno"))
      return emGasSerialno;
    else if (fieldName.equalsIgnoreCase("EM_GAS_ALAMATSC") || fieldName.equals("emGasAlamatsc"))
      return emGasAlamatsc;
    else if (fieldName.equalsIgnoreCase("EM_GAS_TANGGALAWALGARANSI") || fieldName.equals("emGasTanggalawalgaransi"))
      return emGasTanggalawalgaransi;
    else if (fieldName.equalsIgnoreCase("EM_GAS_TANGGALAKHIRGARANSI") || fieldName.equals("emGasTanggalakhirgaransi"))
      return emGasTanggalakhirgaransi;
    else if (fieldName.equalsIgnoreCase("EM_GAS_APPROVEWO") || fieldName.equals("emGasApprovewo"))
      return emGasApprovewo;
    else if (fieldName.equalsIgnoreCase("LIFEUSEUNITS"))
      return lifeuseunits;
    else if (fieldName.equalsIgnoreCase("ISINPOSESSION"))
      return isinposession;
    else if (fieldName.equalsIgnoreCase("PROFIT"))
      return profit;
    else if (fieldName.equalsIgnoreCase("ACCTVALUEAMT"))
      return acctvalueamt;
    else if (fieldName.equalsIgnoreCase("A_ASSET_ID") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_LOCATION_ID") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("C_LOCATION_ID") || fieldName.equals("cLocationId"))
      return cLocationId;
    else if (fieldName.equalsIgnoreCase("ISDISPOSED"))
      return isdisposed;
    else if (fieldName.equalsIgnoreCase("ASSETDISPOSALDATE"))
      return assetdisposaldate;
    else if (fieldName.equalsIgnoreCase("ASSETSERVICEDATE"))
      return assetservicedate;
    else if (fieldName.equalsIgnoreCase("AD_USER_ID") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("USEUNITS"))
      return useunits;
    else if (fieldName.equalsIgnoreCase("ASSETDEPRECIATIONDATE"))
      return assetdepreciationdate;
    else if (fieldName.equalsIgnoreCase("GUARANTEEDATE"))
      return guaranteedate;
    else if (fieldName.equalsIgnoreCase("ISOWNED"))
      return isowned;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("LOT"))
      return lot;
    else if (fieldName.equalsIgnoreCase("HELP"))
      return help;
    else if (fieldName.equalsIgnoreCase("LOCATIONCOMMENT"))
      return locationcomment;
    else if (fieldName.equalsIgnoreCase("VERSIONNO"))
      return versionno;
    else if (fieldName.equalsIgnoreCase("SERNO"))
      return serno;
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
  public static AssetsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static AssetsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(A_Asset.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = A_Asset.CreatedBy) as CreatedByR, " +
      "        to_char(A_Asset.Updated, ?) as updated, " +
      "        to_char(A_Asset.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        A_Asset.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = A_Asset.UpdatedBy) as UpdatedByR," +
      "        A_Asset.AD_Org_ID, " +
      "(CASE WHEN A_Asset.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "A_Asset.EM_Gas_Doctype_ID, " +
      "A_Asset.Value, " +
      "A_Asset.Name, " +
      "A_Asset.A_Asset_Group_ID, " +
      "(CASE WHEN A_Asset.A_Asset_Group_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS A_Asset_Group_IDR, " +
      "A_Asset.DocumentNo, " +
      "A_Asset.Description, " +
      "A_Asset.C_Currency_ID, " +
      "(CASE WHEN A_Asset.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "A_Asset.EM_Gas_Orderline_ID, " +
      "A_Asset.M_Product_ID, " +
      "(CASE WHEN A_Asset.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "A_Asset.M_Locator_ID, " +
      "(CASE WHEN A_Asset.M_Locator_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Value), ''))),'') ) END) AS M_Locator_IDR, " +
      "COALESCE(A_Asset.Issummary, 'N') AS Issummary, " +
      "COALESCE(A_Asset.IsStatic, 'N') AS IsStatic, " +
      "A_Asset.EM_Gas_Status, " +
      "(CASE WHEN A_Asset.EM_Gas_Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS EM_Gas_StatusR, " +
      "A_Asset.EM_Gas_Tglmove, " +
      "A_Asset.EM_Gmm_Master_Department_ID, " +
      "COALESCE(A_Asset.IsDepreciated, 'N') AS IsDepreciated, " +
      "A_Asset.EM_Gai_Kantor_ID, " +
      "A_Asset.EM_Gas_Namapemegang, " +
      "A_Asset.EM_Gas_Kondisiasset, " +
      "(CASE WHEN A_Asset.EM_Gas_Kondisiasset IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS EM_Gas_KondisiassetR, " +
      "A_Asset.Amortizationtype, " +
      "(CASE WHEN A_Asset.Amortizationtype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS AmortizationtypeR, " +
      "A_Asset.Amortizationcalctype, " +
      "(CASE WHEN A_Asset.Amortizationcalctype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list4.name),'') ) END) AS AmortizationcalctypeR, " +
      "A_Asset.Annualamortizationpercentage, " +
      "A_Asset.Assetschedule, " +
      "(CASE WHEN A_Asset.Assetschedule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list5.name),'') ) END) AS AssetscheduleR, " +
      "A_Asset.UseLifeYears, " +
      "A_Asset.UseLifeMonths, " +
      "COALESCE(A_Asset.Is30DayMonth, 'N') AS Is30DayMonth, " +
      "A_Asset.Datepurchased, " +
      "A_Asset.Datecancelled, " +
      "A_Asset.Amortizationstartdate, " +
      "A_Asset.Amortizationenddate, " +
      "A_Asset.AssetValueAmt, " +
      "A_Asset.Residualassetvalueamt, " +
      "A_Asset.Amortizationvalueamt, " +
      "A_Asset.Depreciatedpreviousamt, " +
      "A_Asset.Processed, " +
      "A_Asset.Depreciatedvalue, " +
      "A_Asset.Depreciatedplan, " +
      "COALESCE(A_Asset.IsFullyDepreciated, 'N') AS IsFullyDepreciated, " +
      "A_Asset.M_AttributeSetInstance_ID, " +
      "COALESCE(A_Asset.IsActive, 'N') AS IsActive, " +
      "A_Asset.Qty, " +
      "A_Asset.C_Project_ID, " +
      "(CASE WHEN A_Asset.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "A_Asset.Process_Asset, " +
      "list6.name as Process_Asset_BTN, " +
      "A_Asset.EM_Gas_Button_Asset, " +
      "COALESCE(A_Asset.EM_Gas_Saved, 'N') AS EM_Gas_Saved, " +
      "A_Asset.EM_Gas_Inventory_ID, " +
      "COALESCE(A_Asset.EM_Gas_Isgaransi, 'N') AS EM_Gas_Isgaransi, " +
      "A_Asset.EM_Gas_Serialno, " +
      "A_Asset.EM_Gas_Alamatsc, " +
      "A_Asset.EM_Gas_Tanggalawalgaransi, " +
      "A_Asset.EM_Gas_Tanggalakhirgaransi, " +
      "A_Asset.EM_Gas_Approvewo, " +
      "A_Asset.LifeUseUnits, " +
      "COALESCE(A_Asset.IsInPosession, 'N') AS IsInPosession, " +
      "A_Asset.Profit, " +
      "A_Asset.Acctvalueamt, " +
      "A_Asset.A_Asset_ID, " +
      "A_Asset.C_BPartner_Location_ID, " +
      "A_Asset.C_Location_ID, " +
      "COALESCE(A_Asset.IsDisposed, 'N') AS IsDisposed, " +
      "A_Asset.AssetDisposalDate, " +
      "A_Asset.AssetServiceDate, " +
      "A_Asset.AD_User_ID, " +
      "A_Asset.UseUnits, " +
      "A_Asset.AssetDepreciationDate, " +
      "A_Asset.GuaranteeDate, " +
      "COALESCE(A_Asset.IsOwned, 'N') AS IsOwned, " +
      "A_Asset.C_BPartner_ID, " +
      "A_Asset.Lot, " +
      "A_Asset.Help, " +
      "A_Asset.LocationComment, " +
      "A_Asset.VersionNo, " +
      "A_Asset.SerNo, " +
      "A_Asset.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM A_Asset left join (select AD_Org_ID, Value from AD_Org) table1 on (A_Asset.AD_Org_ID = table1.AD_Org_ID) left join (select A_Asset_Group_ID, Name from A_Asset_Group) table2 on (A_Asset.A_Asset_Group_ID = table2.A_Asset_Group_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table3 on (A_Asset.C_Currency_ID = table3.C_Currency_ID) left join (select M_Product_ID, Name from M_Product) table4 on (A_Asset.M_Product_ID = table4.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  left join (select M_Locator_ID, Value from M_Locator) table6 on (A_Asset.M_Locator_ID = table6.M_Locator_ID) left join ad_ref_list_v list1 on (A_Asset.EM_Gas_Status = list1.value and list1.ad_reference_id = 'A6741E037151406D84B819B76BB26CCA' and list1.ad_language = ?)  left join ad_ref_list_v list2 on (A_Asset.EM_Gas_Kondisiasset = list2.value and list2.ad_reference_id = '0240EFB1169144FCB821036D12E39740' and list2.ad_language = ?)  left join ad_ref_list_v list3 on (A_Asset.Amortizationtype = list3.value and list3.ad_reference_id = '800040' and list3.ad_language = ?)  left join ad_ref_list_v list4 on (A_Asset.Amortizationcalctype = list4.value and list4.ad_reference_id = '800068' and list4.ad_language = ?)  left join ad_ref_list_v list5 on (A_Asset.Assetschedule = list5.value and list5.ad_reference_id = '800041' and list5.ad_language = ?)  left join (select C_Project_ID, Value, Name from C_Project) table7 on (A_Asset.C_Project_ID = table7.C_Project_ID) left join ad_ref_list_v list6 on (list6.ad_reference_id = '800042' and list6.ad_language = ?  AND A_Asset.Process_Asset = TO_CHAR(list6.value))" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND A_Asset.A_Asset_ID = ? " +
      "        AND A_Asset.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND A_Asset.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
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
        AssetsData objectAssetsData = new AssetsData();
        objectAssetsData.created = UtilSql.getValue(result, "CREATED");
        objectAssetsData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectAssetsData.updated = UtilSql.getValue(result, "UPDATED");
        objectAssetsData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectAssetsData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectAssetsData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectAssetsData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectAssetsData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectAssetsData.emGasDoctypeId = UtilSql.getValue(result, "EM_GAS_DOCTYPE_ID");
        objectAssetsData.value = UtilSql.getValue(result, "VALUE");
        objectAssetsData.name = UtilSql.getValue(result, "NAME");
        objectAssetsData.aAssetGroupId = UtilSql.getValue(result, "A_ASSET_GROUP_ID");
        objectAssetsData.aAssetGroupIdr = UtilSql.getValue(result, "A_ASSET_GROUP_IDR");
        objectAssetsData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectAssetsData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectAssetsData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectAssetsData.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectAssetsData.emGasOrderlineId = UtilSql.getValue(result, "EM_GAS_ORDERLINE_ID");
        objectAssetsData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectAssetsData.mProductIdr = UtilSql.getValue(result, "M_PRODUCT_IDR");
        objectAssetsData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectAssetsData.mLocatorIdr = UtilSql.getValue(result, "M_LOCATOR_IDR");
        objectAssetsData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectAssetsData.isstatic = UtilSql.getValue(result, "ISSTATIC");
        objectAssetsData.emGasStatus = UtilSql.getValue(result, "EM_GAS_STATUS");
        objectAssetsData.emGasStatusr = UtilSql.getValue(result, "EM_GAS_STATUSR");
        objectAssetsData.emGasTglmove = UtilSql.getDateValue(result, "EM_GAS_TGLMOVE", "dd-MM-yyyy");
        objectAssetsData.emGmmMasterDepartmentId = UtilSql.getValue(result, "EM_GMM_MASTER_DEPARTMENT_ID");
        objectAssetsData.isdepreciated = UtilSql.getValue(result, "ISDEPRECIATED");
        objectAssetsData.emGaiKantorId = UtilSql.getValue(result, "EM_GAI_KANTOR_ID");
        objectAssetsData.emGasNamapemegang = UtilSql.getValue(result, "EM_GAS_NAMAPEMEGANG");
        objectAssetsData.emGasKondisiasset = UtilSql.getValue(result, "EM_GAS_KONDISIASSET");
        objectAssetsData.emGasKondisiassetr = UtilSql.getValue(result, "EM_GAS_KONDISIASSETR");
        objectAssetsData.amortizationtype = UtilSql.getValue(result, "AMORTIZATIONTYPE");
        objectAssetsData.amortizationtyper = UtilSql.getValue(result, "AMORTIZATIONTYPER");
        objectAssetsData.amortizationcalctype = UtilSql.getValue(result, "AMORTIZATIONCALCTYPE");
        objectAssetsData.amortizationcalctyper = UtilSql.getValue(result, "AMORTIZATIONCALCTYPER");
        objectAssetsData.annualamortizationpercentage = UtilSql.getValue(result, "ANNUALAMORTIZATIONPERCENTAGE");
        objectAssetsData.assetschedule = UtilSql.getValue(result, "ASSETSCHEDULE");
        objectAssetsData.assetscheduler = UtilSql.getValue(result, "ASSETSCHEDULER");
        objectAssetsData.uselifeyears = UtilSql.getValue(result, "USELIFEYEARS");
        objectAssetsData.uselifemonths = UtilSql.getValue(result, "USELIFEMONTHS");
        objectAssetsData.is30daymonth = UtilSql.getValue(result, "IS30DAYMONTH");
        objectAssetsData.datepurchased = UtilSql.getDateValue(result, "DATEPURCHASED", "dd-MM-yyyy");
        objectAssetsData.datecancelled = UtilSql.getDateValue(result, "DATECANCELLED", "dd-MM-yyyy");
        objectAssetsData.amortizationstartdate = UtilSql.getDateValue(result, "AMORTIZATIONSTARTDATE", "dd-MM-yyyy");
        objectAssetsData.amortizationenddate = UtilSql.getDateValue(result, "AMORTIZATIONENDDATE", "dd-MM-yyyy");
        objectAssetsData.assetvalueamt = UtilSql.getValue(result, "ASSETVALUEAMT");
        objectAssetsData.residualassetvalueamt = UtilSql.getValue(result, "RESIDUALASSETVALUEAMT");
        objectAssetsData.amortizationvalueamt = UtilSql.getValue(result, "AMORTIZATIONVALUEAMT");
        objectAssetsData.depreciatedpreviousamt = UtilSql.getValue(result, "DEPRECIATEDPREVIOUSAMT");
        objectAssetsData.processed = UtilSql.getValue(result, "PROCESSED");
        objectAssetsData.depreciatedvalue = UtilSql.getValue(result, "DEPRECIATEDVALUE");
        objectAssetsData.depreciatedplan = UtilSql.getValue(result, "DEPRECIATEDPLAN");
        objectAssetsData.isfullydepreciated = UtilSql.getValue(result, "ISFULLYDEPRECIATED");
        objectAssetsData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectAssetsData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectAssetsData.qty = UtilSql.getValue(result, "QTY");
        objectAssetsData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectAssetsData.cProjectIdr = UtilSql.getValue(result, "C_PROJECT_IDR");
        objectAssetsData.processAsset = UtilSql.getValue(result, "PROCESS_ASSET");
        objectAssetsData.processAssetBtn = UtilSql.getValue(result, "PROCESS_ASSET_BTN");
        objectAssetsData.emGasButtonAsset = UtilSql.getValue(result, "EM_GAS_BUTTON_ASSET");
        objectAssetsData.emGasSaved = UtilSql.getValue(result, "EM_GAS_SAVED");
        objectAssetsData.emGasInventoryId = UtilSql.getValue(result, "EM_GAS_INVENTORY_ID");
        objectAssetsData.emGasIsgaransi = UtilSql.getValue(result, "EM_GAS_ISGARANSI");
        objectAssetsData.emGasSerialno = UtilSql.getValue(result, "EM_GAS_SERIALNO");
        objectAssetsData.emGasAlamatsc = UtilSql.getValue(result, "EM_GAS_ALAMATSC");
        objectAssetsData.emGasTanggalawalgaransi = UtilSql.getDateValue(result, "EM_GAS_TANGGALAWALGARANSI", "dd-MM-yyyy");
        objectAssetsData.emGasTanggalakhirgaransi = UtilSql.getDateValue(result, "EM_GAS_TANGGALAKHIRGARANSI", "dd-MM-yyyy");
        objectAssetsData.emGasApprovewo = UtilSql.getValue(result, "EM_GAS_APPROVEWO");
        objectAssetsData.lifeuseunits = UtilSql.getValue(result, "LIFEUSEUNITS");
        objectAssetsData.isinposession = UtilSql.getValue(result, "ISINPOSESSION");
        objectAssetsData.profit = UtilSql.getValue(result, "PROFIT");
        objectAssetsData.acctvalueamt = UtilSql.getValue(result, "ACCTVALUEAMT");
        objectAssetsData.aAssetId = UtilSql.getValue(result, "A_ASSET_ID");
        objectAssetsData.cBpartnerLocationId = UtilSql.getValue(result, "C_BPARTNER_LOCATION_ID");
        objectAssetsData.cLocationId = UtilSql.getValue(result, "C_LOCATION_ID");
        objectAssetsData.isdisposed = UtilSql.getValue(result, "ISDISPOSED");
        objectAssetsData.assetdisposaldate = UtilSql.getDateValue(result, "ASSETDISPOSALDATE", "dd-MM-yyyy");
        objectAssetsData.assetservicedate = UtilSql.getDateValue(result, "ASSETSERVICEDATE", "dd-MM-yyyy");
        objectAssetsData.adUserId = UtilSql.getValue(result, "AD_USER_ID");
        objectAssetsData.useunits = UtilSql.getValue(result, "USEUNITS");
        objectAssetsData.assetdepreciationdate = UtilSql.getDateValue(result, "ASSETDEPRECIATIONDATE", "dd-MM-yyyy");
        objectAssetsData.guaranteedate = UtilSql.getDateValue(result, "GUARANTEEDATE", "dd-MM-yyyy");
        objectAssetsData.isowned = UtilSql.getValue(result, "ISOWNED");
        objectAssetsData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectAssetsData.lot = UtilSql.getValue(result, "LOT");
        objectAssetsData.help = UtilSql.getValue(result, "HELP");
        objectAssetsData.locationcomment = UtilSql.getValue(result, "LOCATIONCOMMENT");
        objectAssetsData.versionno = UtilSql.getValue(result, "VERSIONNO");
        objectAssetsData.serno = UtilSql.getValue(result, "SERNO");
        objectAssetsData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectAssetsData.language = UtilSql.getValue(result, "LANGUAGE");
        objectAssetsData.adUserClient = "";
        objectAssetsData.adOrgClient = "";
        objectAssetsData.createdby = "";
        objectAssetsData.trBgcolor = "";
        objectAssetsData.totalCount = "";
        objectAssetsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAssetsData);
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
    AssetsData objectAssetsData[] = new AssetsData[vector.size()];
    vector.copyInto(objectAssetsData);
    return(objectAssetsData);
  }

/**
Create a registry
 */
  public static AssetsData[] set(String processAsset, String processAssetBtn, String emGasInventoryId, String emGasStatus, String cProjectId, String cProjectIdr, String emGasSerialno, String emGasSaved, String emGasTglmove, String emGmmMasterDepartmentId, String emGasDoctypeId, String datepurchased, String datecancelled, String amortizationstartdate, String amortizationenddate, String annualamortizationpercentage, String cCurrencyId, String assetvalueamt, String residualassetvalueamt, String mAttributesetinstanceId, String acctvalueamt, String amortizationtype, String amortizationvalueamt, String assetschedule, String documentno, String processed, String processedBtn, String profit, String qty, String depreciatedvalue, String depreciatedplan, String amortizationcalctype, String depreciatedpreviousamt, String lot, String adUserId, String isdisposed, String mLocatorId, String isinposession, String isactive, String assetdepreciationdate, String createdby, String createdbyr, String uselifeyears, String mProductId, String mProductIdr, String assetdisposaldate, String cLocationId, String aAssetGroupId, String adOrgId, String versionno, String value, String isowned, String name, String description, String locationcomment, String isdepreciated, String lifeuseunits, String help, String updatedby, String updatedbyr, String adClientId, String cBpartnerId, String guaranteedate, String uselifemonths, String assetservicedate, String useunits, String aAssetId, String serno, String cBpartnerLocationId, String emGasTanggalakhirgaransi, String isfullydepreciated, String emGasButtonAsset, String emGasTanggalawalgaransi, String emGaiKantorId, String emGasNamapemegang, String emGasOrderlineId, String isstatic, String issummary, String emGasKondisiasset, String emGasApprovewo, String emGasIsgaransi, String is30daymonth, String emGasAlamatsc)    throws ServletException {
    AssetsData objectAssetsData[] = new AssetsData[1];
    objectAssetsData[0] = new AssetsData();
    objectAssetsData[0].created = "";
    objectAssetsData[0].createdbyr = createdbyr;
    objectAssetsData[0].updated = "";
    objectAssetsData[0].updatedTimeStamp = "";
    objectAssetsData[0].updatedby = updatedby;
    objectAssetsData[0].updatedbyr = updatedbyr;
    objectAssetsData[0].adOrgId = adOrgId;
    objectAssetsData[0].adOrgIdr = "";
    objectAssetsData[0].emGasDoctypeId = emGasDoctypeId;
    objectAssetsData[0].value = value;
    objectAssetsData[0].name = name;
    objectAssetsData[0].aAssetGroupId = aAssetGroupId;
    objectAssetsData[0].aAssetGroupIdr = "";
    objectAssetsData[0].documentno = documentno;
    objectAssetsData[0].description = description;
    objectAssetsData[0].cCurrencyId = cCurrencyId;
    objectAssetsData[0].cCurrencyIdr = "";
    objectAssetsData[0].emGasOrderlineId = emGasOrderlineId;
    objectAssetsData[0].mProductId = mProductId;
    objectAssetsData[0].mProductIdr = mProductIdr;
    objectAssetsData[0].mLocatorId = mLocatorId;
    objectAssetsData[0].mLocatorIdr = "";
    objectAssetsData[0].issummary = issummary;
    objectAssetsData[0].isstatic = isstatic;
    objectAssetsData[0].emGasStatus = emGasStatus;
    objectAssetsData[0].emGasStatusr = "";
    objectAssetsData[0].emGasTglmove = emGasTglmove;
    objectAssetsData[0].emGmmMasterDepartmentId = emGmmMasterDepartmentId;
    objectAssetsData[0].isdepreciated = isdepreciated;
    objectAssetsData[0].emGaiKantorId = emGaiKantorId;
    objectAssetsData[0].emGasNamapemegang = emGasNamapemegang;
    objectAssetsData[0].emGasKondisiasset = emGasKondisiasset;
    objectAssetsData[0].emGasKondisiassetr = "";
    objectAssetsData[0].amortizationtype = amortizationtype;
    objectAssetsData[0].amortizationtyper = "";
    objectAssetsData[0].amortizationcalctype = amortizationcalctype;
    objectAssetsData[0].amortizationcalctyper = "";
    objectAssetsData[0].annualamortizationpercentage = annualamortizationpercentage;
    objectAssetsData[0].assetschedule = assetschedule;
    objectAssetsData[0].assetscheduler = "";
    objectAssetsData[0].uselifeyears = uselifeyears;
    objectAssetsData[0].uselifemonths = uselifemonths;
    objectAssetsData[0].is30daymonth = is30daymonth;
    objectAssetsData[0].datepurchased = datepurchased;
    objectAssetsData[0].datecancelled = datecancelled;
    objectAssetsData[0].amortizationstartdate = amortizationstartdate;
    objectAssetsData[0].amortizationenddate = amortizationenddate;
    objectAssetsData[0].assetvalueamt = assetvalueamt;
    objectAssetsData[0].residualassetvalueamt = residualassetvalueamt;
    objectAssetsData[0].amortizationvalueamt = amortizationvalueamt;
    objectAssetsData[0].depreciatedpreviousamt = depreciatedpreviousamt;
    objectAssetsData[0].processed = processed;
    objectAssetsData[0].depreciatedvalue = depreciatedvalue;
    objectAssetsData[0].depreciatedplan = depreciatedplan;
    objectAssetsData[0].isfullydepreciated = isfullydepreciated;
    objectAssetsData[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectAssetsData[0].isactive = isactive;
    objectAssetsData[0].qty = qty;
    objectAssetsData[0].cProjectId = cProjectId;
    objectAssetsData[0].cProjectIdr = cProjectIdr;
    objectAssetsData[0].processAsset = processAsset;
    objectAssetsData[0].processAssetBtn = processAssetBtn;
    objectAssetsData[0].emGasButtonAsset = emGasButtonAsset;
    objectAssetsData[0].emGasSaved = emGasSaved;
    objectAssetsData[0].emGasInventoryId = emGasInventoryId;
    objectAssetsData[0].emGasIsgaransi = emGasIsgaransi;
    objectAssetsData[0].emGasSerialno = emGasSerialno;
    objectAssetsData[0].emGasAlamatsc = emGasAlamatsc;
    objectAssetsData[0].emGasTanggalawalgaransi = emGasTanggalawalgaransi;
    objectAssetsData[0].emGasTanggalakhirgaransi = emGasTanggalakhirgaransi;
    objectAssetsData[0].emGasApprovewo = emGasApprovewo;
    objectAssetsData[0].lifeuseunits = lifeuseunits;
    objectAssetsData[0].isinposession = isinposession;
    objectAssetsData[0].profit = profit;
    objectAssetsData[0].acctvalueamt = acctvalueamt;
    objectAssetsData[0].aAssetId = aAssetId;
    objectAssetsData[0].cBpartnerLocationId = cBpartnerLocationId;
    objectAssetsData[0].cLocationId = cLocationId;
    objectAssetsData[0].isdisposed = isdisposed;
    objectAssetsData[0].assetdisposaldate = assetdisposaldate;
    objectAssetsData[0].assetservicedate = assetservicedate;
    objectAssetsData[0].adUserId = adUserId;
    objectAssetsData[0].useunits = useunits;
    objectAssetsData[0].assetdepreciationdate = assetdepreciationdate;
    objectAssetsData[0].guaranteedate = guaranteedate;
    objectAssetsData[0].isowned = isowned;
    objectAssetsData[0].cBpartnerId = cBpartnerId;
    objectAssetsData[0].lot = lot;
    objectAssetsData[0].help = help;
    objectAssetsData[0].locationcomment = locationcomment;
    objectAssetsData[0].versionno = versionno;
    objectAssetsData[0].serno = serno;
    objectAssetsData[0].adClientId = adClientId;
    objectAssetsData[0].language = "";
    return objectAssetsData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux42236E76CCB2491B8B2E5BCDA4E83624(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ATTRSETVALUETYPE FROM M_PRODUCT WHERE M_PRODUCT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ATTRSETVALUETYPE");
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
  public static String selectAux0C9EAE5805B14C159CE74DAF015A12C9(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_ATTRIBUTESET_ID FROM M_PRODUCT WHERE M_PRODUCT_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
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
  public static String selectAuxAD306651FEC841DF9D01E831482C6A09(ConnectionProvider connectionProvider, String A_Asset_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select 'Y' from dual where exists (select 1 from a_amortizationline where a_amortizationline.a_asset_id  = ?) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, A_Asset_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "'Y'");
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
  public static String selectAuxAC59D3426EB64B3B9A81E84936327146(ConnectionProvider connectionProvider, String A_Asset_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        Select Coalesce(Count(*),0) From GAS_Maintenance Where A_Asset_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, A_Asset_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "COALESCE(COUNT(*),0)");
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
  public static String selectDef3808ABE5D08E4650A2DE65596DB61F49_0(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))), '')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_Project_ID FROM C_Project left join (select C_Project_ID, Value, Name from C_Project) table2 on (C_Project.C_Project_ID = table2.C_Project_ID) WHERE C_Project.isActive='Y' AND C_Project.C_Project_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Project_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_PROJECT_ID");
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
  public static String selectDef7FB29BF27B5243019CA9FC9BE7BE6F25(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        Select C_DocType_ID From C_DocType Where DocBaseType = 'GAS_AST' ";

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
  public static String selectDef8045_1(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as CreatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedByR);

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

/**
Select for auxiliar field
 */
  public static String selectDef8047_2(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))), '') ) as M_Product_ID FROM M_Product left join (select M_Product_ID, Name from M_Product) table2 on (M_Product.M_Product_ID = table2.M_Product_ID)left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  WHERE M_Product.isActive='Y' AND M_Product.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_PRODUCT_ID");
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
  public static String selectDef8063_3(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as UpdatedBy FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedByR);

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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE A_Asset" +
      "        SET AD_Org_ID = (?) , EM_Gas_Doctype_ID = (?) , Value = (?) , Name = (?) , A_Asset_Group_ID = (?) , DocumentNo = (?) , Description = (?) , C_Currency_ID = (?) , EM_Gas_Orderline_ID = (?) , M_Product_ID = (?) , M_Locator_ID = (?) , Issummary = (?) , IsStatic = (?) , EM_Gas_Status = (?) , EM_Gas_Tglmove = TO_DATE(?) , EM_Gmm_Master_Department_ID = (?) , IsDepreciated = (?) , EM_Gai_Kantor_ID = (?) , EM_Gas_Namapemegang = (?) , EM_Gas_Kondisiasset = (?) , Amortizationtype = (?) , Amortizationcalctype = (?) , Annualamortizationpercentage = TO_NUMBER(?) , Assetschedule = (?) , UseLifeYears = TO_NUMBER(?) , UseLifeMonths = TO_NUMBER(?) , Is30DayMonth = (?) , Datepurchased = TO_DATE(?) , Datecancelled = TO_DATE(?) , Amortizationstartdate = TO_DATE(?) , Amortizationenddate = TO_DATE(?) , AssetValueAmt = TO_NUMBER(?) , Residualassetvalueamt = TO_NUMBER(?) , Amortizationvalueamt = TO_NUMBER(?) , Depreciatedpreviousamt = TO_NUMBER(?) , Processed = (?) , Depreciatedvalue = TO_NUMBER(?) , Depreciatedplan = TO_NUMBER(?) , IsFullyDepreciated = (?) , M_AttributeSetInstance_ID = (?) , IsActive = (?) , Qty = TO_NUMBER(?) , C_Project_ID = (?) , Process_Asset = (?) , EM_Gas_Button_Asset = (?) , EM_Gas_Saved = (?) , EM_Gas_Inventory_ID = (?) , EM_Gas_Isgaransi = (?) , EM_Gas_Serialno = (?) , EM_Gas_Alamatsc = (?) , EM_Gas_Tanggalawalgaransi = TO_DATE(?) , EM_Gas_Tanggalakhirgaransi = TO_DATE(?) , EM_Gas_Approvewo = (?) , LifeUseUnits = TO_NUMBER(?) , IsInPosession = (?) , Profit = TO_NUMBER(?) , Acctvalueamt = TO_NUMBER(?) , A_Asset_ID = (?) , C_BPartner_Location_ID = (?) , C_Location_ID = (?) , IsDisposed = (?) , AssetDisposalDate = TO_DATE(?) , AssetServiceDate = TO_DATE(?) , AD_User_ID = (?) , UseUnits = TO_NUMBER(?) , AssetDepreciationDate = TO_DATE(?) , GuaranteeDate = TO_DATE(?) , IsOwned = (?) , C_BPartner_ID = (?) , Lot = (?) , Help = (?) , LocationComment = (?) , VersionNo = (?) , SerNo = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE A_Asset.A_Asset_ID = ? " +
      "        AND A_Asset.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND A_Asset.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstatic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasTglmove);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMasterDepartmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGaiKantorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasNamapemegang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasKondisiasset);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationcalctype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, annualamortizationpercentage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetschedule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifeyears);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifemonths);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, is30daymonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datecancelled);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationstartdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationenddate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, residualassetvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedpreviousamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedvalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedplan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfullydepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processAsset);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasButtonAsset);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasSaved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasInventoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasIsgaransi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasSerialno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasAlamatsc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasTanggalawalgaransi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasTanggalakhirgaransi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasApprovewo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lifeuseunits);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinposession);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, profit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdisposed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetdisposaldate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetservicedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, useunits);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetdepreciationdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isowned);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lot);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, locationcomment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, versionno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
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
      "        INSERT INTO A_Asset " +
      "        (AD_Org_ID, EM_Gas_Doctype_ID, Value, Name, A_Asset_Group_ID, DocumentNo, Description, C_Currency_ID, EM_Gas_Orderline_ID, M_Product_ID, M_Locator_ID, Issummary, IsStatic, EM_Gas_Status, EM_Gas_Tglmove, EM_Gmm_Master_Department_ID, IsDepreciated, EM_Gai_Kantor_ID, EM_Gas_Namapemegang, EM_Gas_Kondisiasset, Amortizationtype, Amortizationcalctype, Annualamortizationpercentage, Assetschedule, UseLifeYears, UseLifeMonths, Is30DayMonth, Datepurchased, Datecancelled, Amortizationstartdate, Amortizationenddate, AssetValueAmt, Residualassetvalueamt, Amortizationvalueamt, Depreciatedpreviousamt, Processed, Depreciatedvalue, Depreciatedplan, IsFullyDepreciated, M_AttributeSetInstance_ID, IsActive, Qty, C_Project_ID, Process_Asset, EM_Gas_Button_Asset, EM_Gas_Saved, EM_Gas_Inventory_ID, EM_Gas_Isgaransi, EM_Gas_Serialno, EM_Gas_Alamatsc, EM_Gas_Tanggalawalgaransi, EM_Gas_Tanggalakhirgaransi, EM_Gas_Approvewo, LifeUseUnits, IsInPosession, Profit, Acctvalueamt, A_Asset_ID, C_BPartner_Location_ID, C_Location_ID, IsDisposed, AssetDisposalDate, AssetServiceDate, AD_User_ID, UseUnits, AssetDepreciationDate, GuaranteeDate, IsOwned, C_BPartner_ID, Lot, Help, LocationComment, VersionNo, SerNo, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), (?), TO_NUMBER(?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstatic);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasStatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasTglmove);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGmmMasterDepartmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGaiKantorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasNamapemegang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasKondisiasset);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationcalctype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, annualamortizationpercentage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetschedule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifeyears);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uselifemonths);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, is30daymonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datecancelled);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationstartdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationenddate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, residualassetvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amortizationvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedpreviousamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedvalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depreciatedplan);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfullydepreciated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processAsset);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasButtonAsset);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasSaved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasInventoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasIsgaransi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasSerialno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasAlamatsc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasTanggalawalgaransi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasTanggalakhirgaransi);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emGasApprovewo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lifeuseunits);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinposession);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, profit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, acctvalueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdisposed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetdisposaldate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetservicedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, useunits);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetdepreciationdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isowned);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lot);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, locationcomment);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, versionno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serno);
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
      "        DELETE FROM A_Asset" +
      "        WHERE A_Asset.A_Asset_ID = ? " +
      "        AND A_Asset.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND A_Asset.AD_Org_ID IN (";
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
      "          FROM A_Asset" +
      "         WHERE A_Asset.A_Asset_ID = ? ";

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
      "          FROM A_Asset" +
      "         WHERE A_Asset.A_Asset_ID = ? ";

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
