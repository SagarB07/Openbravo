//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Product;

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
class ProductData implements FieldProvider {
static Logger log4j = Logger.getLogger(ProductData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String managevariants;
  public String adOrgId;
  public String adOrgIdr;
  public String value;
  public String name;
  public String adImageId;
  public String cUomId;
  public String cUomIdr;
  public String mProductCategoryId;
  public String mProductCategoryIdr;
  public String cTaxcategoryId;
  public String cTaxcategoryIdr;
  public String isgeneric;
  public String ispurchased;
  public String issold;
  public String genericProductId;
  public String genericProductIdr;
  public String description;
  public String producttype;
  public String producttyper;
  public String isstocked;
  public String weight;
  public String cUomWeightId;
  public String cUomWeightIdr;
  public String costtype;
  public String costtyper;
  public String coststd;
  public String mAttributesetId;
  public String mAttributesetIdr;
  public String attrsetvaluetype;
  public String attrsetvaluetyper;
  public String mAttributesetinstanceId;
  public String mAttributesetinstanceIdr;
  public String isactive;
  public String upc;
  public String mBrandId;
  public String mBrandIdr;
  public String salesrepId;
  public String cBpartnerId;
  public String imageurl;
  public String descriptionurl;
  public String production;
  public String maProcessplanId;
  public String maProcessplanIdr;
  public String issummary;
  public String mLocatorId;
  public String volume;
  public String shelfwidth;
  public String shelfheight;
  public String shelfdepth;
  public String unitsperpallet;
  public String discontinued;
  public String discontinuedby;
  public String isbom;
  public String isinvoiceprintdetails;
  public String ispicklistprintdetails;
  public String isverified;
  public String processing;
  public String isquantityvariable;
  public String sExpensetypeId;
  public String sResourceId;
  public String isdeferredrevenue;
  public String isdeferredexpense;
  public String bookusingpoprice;
  public String characteristicDesc;
  public String revplantype;
  public String revplantyper;
  public String periodnumber;
  public String defaultperiod;
  public String defaultperiodr;
  public String expplantype;
  public String expplantyper;
  public String periodnumberExp;
  public String defaultperiodExp;
  public String defaultperiodExpr;
  public String calculated;
  public String capacity;
  public String delaymin;
  public String mrpPlannerId;
  public String mrpPlanningmethodId;
  public String qtymax;
  public String qtymin;
  public String qtystd;
  public String qtytype;
  public String stockmin;
  public String createvariants;
  public String updateinvariants;
  public String mProductId;
  public String adClientId;
  public String sku;
  public String classification;
  public String documentnote;
  public String help;
  public String mFreightcategoryId;
  public String downloadurl;
  public String versionno;
  public String guaranteedays;
  public String stockMin;
  public String enforceAttribute;
  public String ispriceprinted;
  public String name2;
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
    else if (fieldName.equalsIgnoreCase("MANAGEVARIANTS"))
      return managevariants;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("VALUE"))
      return value;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("AD_IMAGE_ID") || fieldName.equals("adImageId"))
      return adImageId;
    else if (fieldName.equalsIgnoreCase("C_UOM_ID") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("C_UOM_IDR") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_CATEGORY_ID") || fieldName.equals("mProductCategoryId"))
      return mProductCategoryId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_CATEGORY_IDR") || fieldName.equals("mProductCategoryIdr"))
      return mProductCategoryIdr;
    else if (fieldName.equalsIgnoreCase("C_TAXCATEGORY_ID") || fieldName.equals("cTaxcategoryId"))
      return cTaxcategoryId;
    else if (fieldName.equalsIgnoreCase("C_TAXCATEGORY_IDR") || fieldName.equals("cTaxcategoryIdr"))
      return cTaxcategoryIdr;
    else if (fieldName.equalsIgnoreCase("ISGENERIC"))
      return isgeneric;
    else if (fieldName.equalsIgnoreCase("ISPURCHASED"))
      return ispurchased;
    else if (fieldName.equalsIgnoreCase("ISSOLD"))
      return issold;
    else if (fieldName.equalsIgnoreCase("GENERIC_PRODUCT_ID") || fieldName.equals("genericProductId"))
      return genericProductId;
    else if (fieldName.equalsIgnoreCase("GENERIC_PRODUCT_IDR") || fieldName.equals("genericProductIdr"))
      return genericProductIdr;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("PRODUCTTYPE"))
      return producttype;
    else if (fieldName.equalsIgnoreCase("PRODUCTTYPER"))
      return producttyper;
    else if (fieldName.equalsIgnoreCase("ISSTOCKED"))
      return isstocked;
    else if (fieldName.equalsIgnoreCase("WEIGHT"))
      return weight;
    else if (fieldName.equalsIgnoreCase("C_UOM_WEIGHT_ID") || fieldName.equals("cUomWeightId"))
      return cUomWeightId;
    else if (fieldName.equalsIgnoreCase("C_UOM_WEIGHT_IDR") || fieldName.equals("cUomWeightIdr"))
      return cUomWeightIdr;
    else if (fieldName.equalsIgnoreCase("COSTTYPE"))
      return costtype;
    else if (fieldName.equalsIgnoreCase("COSTTYPER"))
      return costtyper;
    else if (fieldName.equalsIgnoreCase("COSTSTD"))
      return coststd;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESET_ID") || fieldName.equals("mAttributesetId"))
      return mAttributesetId;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESET_IDR") || fieldName.equals("mAttributesetIdr"))
      return mAttributesetIdr;
    else if (fieldName.equalsIgnoreCase("ATTRSETVALUETYPE"))
      return attrsetvaluetype;
    else if (fieldName.equalsIgnoreCase("ATTRSETVALUETYPER"))
      return attrsetvaluetyper;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_ID") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("M_ATTRIBUTESETINSTANCE_IDR") || fieldName.equals("mAttributesetinstanceIdr"))
      return mAttributesetinstanceIdr;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("UPC"))
      return upc;
    else if (fieldName.equalsIgnoreCase("M_BRAND_ID") || fieldName.equals("mBrandId"))
      return mBrandId;
    else if (fieldName.equalsIgnoreCase("M_BRAND_IDR") || fieldName.equals("mBrandIdr"))
      return mBrandIdr;
    else if (fieldName.equalsIgnoreCase("SALESREP_ID") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("IMAGEURL"))
      return imageurl;
    else if (fieldName.equalsIgnoreCase("DESCRIPTIONURL"))
      return descriptionurl;
    else if (fieldName.equalsIgnoreCase("PRODUCTION"))
      return production;
    else if (fieldName.equalsIgnoreCase("MA_PROCESSPLAN_ID") || fieldName.equals("maProcessplanId"))
      return maProcessplanId;
    else if (fieldName.equalsIgnoreCase("MA_PROCESSPLAN_IDR") || fieldName.equals("maProcessplanIdr"))
      return maProcessplanIdr;
    else if (fieldName.equalsIgnoreCase("ISSUMMARY"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("M_LOCATOR_ID") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("VOLUME"))
      return volume;
    else if (fieldName.equalsIgnoreCase("SHELFWIDTH"))
      return shelfwidth;
    else if (fieldName.equalsIgnoreCase("SHELFHEIGHT"))
      return shelfheight;
    else if (fieldName.equalsIgnoreCase("SHELFDEPTH"))
      return shelfdepth;
    else if (fieldName.equalsIgnoreCase("UNITSPERPALLET"))
      return unitsperpallet;
    else if (fieldName.equalsIgnoreCase("DISCONTINUED"))
      return discontinued;
    else if (fieldName.equalsIgnoreCase("DISCONTINUEDBY"))
      return discontinuedby;
    else if (fieldName.equalsIgnoreCase("ISBOM"))
      return isbom;
    else if (fieldName.equalsIgnoreCase("ISINVOICEPRINTDETAILS"))
      return isinvoiceprintdetails;
    else if (fieldName.equalsIgnoreCase("ISPICKLISTPRINTDETAILS"))
      return ispicklistprintdetails;
    else if (fieldName.equalsIgnoreCase("ISVERIFIED"))
      return isverified;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("ISQUANTITYVARIABLE"))
      return isquantityvariable;
    else if (fieldName.equalsIgnoreCase("S_EXPENSETYPE_ID") || fieldName.equals("sExpensetypeId"))
      return sExpensetypeId;
    else if (fieldName.equalsIgnoreCase("S_RESOURCE_ID") || fieldName.equals("sResourceId"))
      return sResourceId;
    else if (fieldName.equalsIgnoreCase("ISDEFERREDREVENUE"))
      return isdeferredrevenue;
    else if (fieldName.equalsIgnoreCase("ISDEFERREDEXPENSE"))
      return isdeferredexpense;
    else if (fieldName.equalsIgnoreCase("BOOKUSINGPOPRICE"))
      return bookusingpoprice;
    else if (fieldName.equalsIgnoreCase("CHARACTERISTIC_DESC") || fieldName.equals("characteristicDesc"))
      return characteristicDesc;
    else if (fieldName.equalsIgnoreCase("REVPLANTYPE"))
      return revplantype;
    else if (fieldName.equalsIgnoreCase("REVPLANTYPER"))
      return revplantyper;
    else if (fieldName.equalsIgnoreCase("PERIODNUMBER"))
      return periodnumber;
    else if (fieldName.equalsIgnoreCase("DEFAULTPERIOD"))
      return defaultperiod;
    else if (fieldName.equalsIgnoreCase("DEFAULTPERIODR"))
      return defaultperiodr;
    else if (fieldName.equalsIgnoreCase("EXPPLANTYPE"))
      return expplantype;
    else if (fieldName.equalsIgnoreCase("EXPPLANTYPER"))
      return expplantyper;
    else if (fieldName.equalsIgnoreCase("PERIODNUMBER_EXP") || fieldName.equals("periodnumberExp"))
      return periodnumberExp;
    else if (fieldName.equalsIgnoreCase("DEFAULTPERIOD_EXP") || fieldName.equals("defaultperiodExp"))
      return defaultperiodExp;
    else if (fieldName.equalsIgnoreCase("DEFAULTPERIOD_EXPR") || fieldName.equals("defaultperiodExpr"))
      return defaultperiodExpr;
    else if (fieldName.equalsIgnoreCase("CALCULATED"))
      return calculated;
    else if (fieldName.equalsIgnoreCase("CAPACITY"))
      return capacity;
    else if (fieldName.equalsIgnoreCase("DELAYMIN"))
      return delaymin;
    else if (fieldName.equalsIgnoreCase("MRP_PLANNER_ID") || fieldName.equals("mrpPlannerId"))
      return mrpPlannerId;
    else if (fieldName.equalsIgnoreCase("MRP_PLANNINGMETHOD_ID") || fieldName.equals("mrpPlanningmethodId"))
      return mrpPlanningmethodId;
    else if (fieldName.equalsIgnoreCase("QTYMAX"))
      return qtymax;
    else if (fieldName.equalsIgnoreCase("QTYMIN"))
      return qtymin;
    else if (fieldName.equalsIgnoreCase("QTYSTD"))
      return qtystd;
    else if (fieldName.equalsIgnoreCase("QTYTYPE"))
      return qtytype;
    else if (fieldName.equalsIgnoreCase("STOCKMIN"))
      return stockmin;
    else if (fieldName.equalsIgnoreCase("CREATEVARIANTS"))
      return createvariants;
    else if (fieldName.equalsIgnoreCase("UPDATEINVARIANTS"))
      return updateinvariants;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("SKU"))
      return sku;
    else if (fieldName.equalsIgnoreCase("CLASSIFICATION"))
      return classification;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNOTE"))
      return documentnote;
    else if (fieldName.equalsIgnoreCase("HELP"))
      return help;
    else if (fieldName.equalsIgnoreCase("M_FREIGHTCATEGORY_ID") || fieldName.equals("mFreightcategoryId"))
      return mFreightcategoryId;
    else if (fieldName.equalsIgnoreCase("DOWNLOADURL"))
      return downloadurl;
    else if (fieldName.equalsIgnoreCase("VERSIONNO"))
      return versionno;
    else if (fieldName.equalsIgnoreCase("GUARANTEEDAYS"))
      return guaranteedays;
    else if (fieldName.equalsIgnoreCase("STOCK_MIN") || fieldName.equals("stockMin"))
      return stockMin;
    else if (fieldName.equalsIgnoreCase("ENFORCE_ATTRIBUTE") || fieldName.equals("enforceAttribute"))
      return enforceAttribute;
    else if (fieldName.equalsIgnoreCase("ISPRICEPRINTED"))
      return ispriceprinted;
    else if (fieldName.equalsIgnoreCase("NAME2"))
      return name2;
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
  public static ProductData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ProductData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Product.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product.CreatedBy) as CreatedByR, " +
      "        to_char(M_Product.Updated, ?) as updated, " +
      "        to_char(M_Product.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Product.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product.UpdatedBy) as UpdatedByR," +
      "        M_Product.ManageVariants, " +
      "M_Product.AD_Org_ID, " +
      "(CASE WHEN M_Product.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_Product.Value, " +
      "M_Product.Name, " +
      "M_Product.AD_Image_ID, " +
      "M_Product.C_UOM_ID, " +
      "(CASE WHEN M_Product.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "M_Product.M_Product_Category_ID, " +
      "(CASE WHEN M_Product.M_Product_Category_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_Category_IDR, " +
      "M_Product.C_TaxCategory_ID, " +
      "(CASE WHEN M_Product.C_TaxCategory_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS C_TaxCategory_IDR, " +
      "COALESCE(M_Product.IsGeneric, 'N') AS IsGeneric, " +
      "COALESCE(M_Product.IsPurchased, 'N') AS IsPurchased, " +
      "COALESCE(M_Product.IsSold, 'N') AS IsSold, " +
      "M_Product.Generic_Product_ID, " +
      "(CASE WHEN M_Product.Generic_Product_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL8.Name IS NULL THEN TO_CHAR(table8.Name) ELSE TO_CHAR(tableTRL8.Name) END)), ''))),'') ) END) AS Generic_Product_IDR, " +
      "M_Product.Description, " +
      "M_Product.ProductType, " +
      "(CASE WHEN M_Product.ProductType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS ProductTypeR, " +
      "COALESCE(M_Product.IsStocked, 'N') AS IsStocked, " +
      "M_Product.Weight, " +
      "M_Product.C_Uom_Weight_ID, " +
      "(CASE WHEN M_Product.C_Uom_Weight_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL10.Name IS NULL THEN TO_CHAR(table10.Name) ELSE TO_CHAR(tableTRL10.Name) END)), ''))),'') ) END) AS C_Uom_Weight_IDR, " +
      "M_Product.Costtype, " +
      "(CASE WHEN M_Product.Costtype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS CosttypeR, " +
      "M_Product.Coststd, " +
      "M_Product.M_AttributeSet_ID, " +
      "(CASE WHEN M_Product.M_AttributeSet_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Name), ''))),'') ) END) AS M_AttributeSet_IDR, " +
      "M_Product.Attrsetvaluetype, " +
      "(CASE WHEN M_Product.Attrsetvaluetype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS AttrsetvaluetypeR, " +
      "M_Product.M_AttributeSetInstance_ID, " +
      "(CASE WHEN M_Product.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "COALESCE(M_Product.IsActive, 'N') AS IsActive, " +
      "M_Product.UPC, " +
      "M_Product.M_Brand_ID, " +
      "(CASE WHEN M_Product.M_Brand_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Name), ''))),'') ) END) AS M_Brand_IDR, " +
      "M_Product.SalesRep_ID, " +
      "M_Product.C_BPartner_ID, " +
      "M_Product.ImageURL, " +
      "M_Product.DescriptionURL, " +
      "COALESCE(M_Product.Production, 'N') AS Production, " +
      "M_Product.MA_Processplan_ID, " +
      "(CASE WHEN M_Product.MA_Processplan_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.Name), ''))),'') ) END) AS MA_Processplan_IDR, " +
      "COALESCE(M_Product.IsSummary, 'N') AS IsSummary, " +
      "M_Product.M_Locator_ID, " +
      "M_Product.Volume, " +
      "M_Product.ShelfWidth, " +
      "M_Product.ShelfHeight, " +
      "M_Product.ShelfDepth, " +
      "M_Product.UnitsPerPallet, " +
      "COALESCE(M_Product.Discontinued, 'N') AS Discontinued, " +
      "M_Product.DiscontinuedBy, " +
      "COALESCE(M_Product.IsBOM, 'N') AS IsBOM, " +
      "COALESCE(M_Product.IsInvoicePrintDetails, 'N') AS IsInvoicePrintDetails, " +
      "COALESCE(M_Product.IsPickListPrintDetails, 'N') AS IsPickListPrintDetails, " +
      "COALESCE(M_Product.IsVerified, 'N') AS IsVerified, " +
      "M_Product.Processing, " +
      "COALESCE(M_Product.Isquantityvariable, 'N') AS Isquantityvariable, " +
      "M_Product.S_ExpenseType_ID, " +
      "M_Product.S_Resource_ID, " +
      "COALESCE(M_Product.Isdeferredrevenue, 'N') AS Isdeferredrevenue, " +
      "COALESCE(M_Product.Isdeferredexpense, 'N') AS Isdeferredexpense, " +
      "COALESCE(M_Product.Bookusingpoprice, 'N') AS Bookusingpoprice, " +
      "M_Product.Characteristic_Desc, " +
      "M_Product.Revplantype, " +
      "(CASE WHEN M_Product.Revplantype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list4.name),'') ) END) AS RevplantypeR, " +
      "M_Product.Periodnumber, " +
      "M_Product.DefaultPeriod, " +
      "(CASE WHEN M_Product.DefaultPeriod IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list5.name),'') ) END) AS DefaultPeriodR, " +
      "M_Product.Expplantype, " +
      "(CASE WHEN M_Product.Expplantype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list6.name),'') ) END) AS ExpplantypeR, " +
      "M_Product.Periodnumber_Exp, " +
      "M_Product.DefaultPeriod_Exp, " +
      "(CASE WHEN M_Product.DefaultPeriod_Exp IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list7.name),'') ) END) AS DefaultPeriod_ExpR, " +
      "COALESCE(M_Product.Calculated, 'N') AS Calculated, " +
      "M_Product.Capacity, " +
      "M_Product.Delaymin, " +
      "M_Product.MRP_Planner_ID, " +
      "M_Product.MRP_Planningmethod_ID, " +
      "M_Product.Qtymax, " +
      "M_Product.Qtymin, " +
      "M_Product.Qtystd, " +
      "COALESCE(M_Product.Qtytype, 'N') AS Qtytype, " +
      "M_Product.Stockmin, " +
      "M_Product.CreateVariants, " +
      "M_Product.Updateinvariants, " +
      "M_Product.M_Product_ID, " +
      "M_Product.AD_Client_ID, " +
      "M_Product.SKU, " +
      "M_Product.Classification, " +
      "M_Product.DocumentNote, " +
      "M_Product.Help, " +
      "M_Product.M_FreightCategory_ID, " +
      "M_Product.DownloadURL, " +
      "M_Product.VersionNo, " +
      "M_Product.GuaranteeDays, " +
      "M_Product.Stock_Min, " +
      "COALESCE(M_Product.Enforce_Attribute, 'N') AS Enforce_Attribute, " +
      "COALESCE(M_Product.Ispriceprinted, 'N') AS Ispriceprinted, " +
      "M_Product.Name2, " +
      "        ? AS LANGUAGE " +
      "        FROM M_Product left join (select AD_Org_ID, Value from AD_Org) table1 on (M_Product.AD_Org_ID = table1.AD_Org_ID) left join (select C_UOM_ID, Name from C_UOM) table2 on (M_Product.C_UOM_ID = table2.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL2 on (table2.C_UOM_ID = tableTRL2.C_UOM_ID and tableTRL2.AD_Language = ?)  left join (select M_Product_Category_ID, Name from M_Product_Category) table4 on (M_Product.M_Product_Category_ID = table4.M_Product_Category_ID) left join (select M_Product_Category_ID,AD_Language, Name from M_Product_Category_TRL) tableTRL4 on (table4.M_Product_Category_ID = tableTRL4.M_Product_Category_ID and tableTRL4.AD_Language = ?)  left join (select C_TaxCategory_ID, Name from C_TaxCategory) table6 on (M_Product.C_TaxCategory_ID = table6.C_TaxCategory_ID) left join (select C_TaxCategory_ID,AD_Language, Name from C_TaxCategory_TRL) tableTRL6 on (table6.C_TaxCategory_ID = tableTRL6.C_TaxCategory_ID and tableTRL6.AD_Language = ?)  left join (select M_Product_ID, Name from M_Product) table8 on (M_Product.Generic_Product_ID =  table8.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL8 on (table8.M_Product_ID = tableTRL8.M_Product_ID and tableTRL8.AD_Language = ?)  left join ad_ref_list_v list1 on (M_Product.ProductType = list1.value and list1.ad_reference_id = '270' and list1.ad_language = ?)  left join (select C_UOM_ID, Name from C_UOM) table10 on (M_Product.C_Uom_Weight_ID =  table10.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL10 on (table10.C_UOM_ID = tableTRL10.C_UOM_ID and tableTRL10.AD_Language = ?)  left join ad_ref_list_v list2 on (M_Product.Costtype = list2.value and list2.ad_reference_id = '800025' and list2.ad_language = ?)  left join (select M_AttributeSet_ID, Name from M_AttributeSet) table12 on (M_Product.M_AttributeSet_ID = table12.M_AttributeSet_ID) left join ad_ref_list_v list3 on (M_Product.Attrsetvaluetype = list3.value and list3.ad_reference_id = '5AD08D5DF85549E0BCC0DEBDE4C0D340' and list3.ad_language = ?)  left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table13 on (M_Product.M_AttributeSetInstance_ID = table13.M_AttributeSetInstance_ID) left join (select M_Brand_ID, Name from M_Brand) table14 on (M_Product.M_Brand_ID = table14.M_Brand_ID) left join (select MA_Processplan_ID, Name from MA_Processplan) table15 on (M_Product.MA_Processplan_ID = table15.MA_Processplan_ID) left join ad_ref_list_v list4 on (M_Product.Revplantype = list4.value and list4.ad_reference_id = '73625A8F22EF4CD7808603156BA606D7' and list4.ad_language = ?)  left join ad_ref_list_v list5 on (M_Product.DefaultPeriod = list5.value and list5.ad_reference_id = '6669508E338F4A10BA3E0D241D133E62' and list5.ad_language = ?)  left join ad_ref_list_v list6 on (M_Product.Expplantype = list6.value and list6.ad_reference_id = '73625A8F22EF4CD7808603156BA606D7' and list6.ad_language = ?)  left join ad_ref_list_v list7 on (M_Product.DefaultPeriod_Exp = list7.value and list7.ad_reference_id = '6669508E338F4A10BA3E0D241D133E62' and list7.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND M_Product.M_Product_ID = ? " +
      "        AND M_Product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_Product.AD_Org_ID IN (";
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
        ProductData objectProductData = new ProductData();
        objectProductData.created = UtilSql.getValue(result, "CREATED");
        objectProductData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectProductData.updated = UtilSql.getValue(result, "UPDATED");
        objectProductData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectProductData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectProductData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectProductData.managevariants = UtilSql.getValue(result, "MANAGEVARIANTS");
        objectProductData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectProductData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectProductData.value = UtilSql.getValue(result, "VALUE");
        objectProductData.name = UtilSql.getValue(result, "NAME");
        objectProductData.adImageId = UtilSql.getValue(result, "AD_IMAGE_ID");
        objectProductData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectProductData.cUomIdr = UtilSql.getValue(result, "C_UOM_IDR");
        objectProductData.mProductCategoryId = UtilSql.getValue(result, "M_PRODUCT_CATEGORY_ID");
        objectProductData.mProductCategoryIdr = UtilSql.getValue(result, "M_PRODUCT_CATEGORY_IDR");
        objectProductData.cTaxcategoryId = UtilSql.getValue(result, "C_TAXCATEGORY_ID");
        objectProductData.cTaxcategoryIdr = UtilSql.getValue(result, "C_TAXCATEGORY_IDR");
        objectProductData.isgeneric = UtilSql.getValue(result, "ISGENERIC");
        objectProductData.ispurchased = UtilSql.getValue(result, "ISPURCHASED");
        objectProductData.issold = UtilSql.getValue(result, "ISSOLD");
        objectProductData.genericProductId = UtilSql.getValue(result, "GENERIC_PRODUCT_ID");
        objectProductData.genericProductIdr = UtilSql.getValue(result, "GENERIC_PRODUCT_IDR");
        objectProductData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectProductData.producttype = UtilSql.getValue(result, "PRODUCTTYPE");
        objectProductData.producttyper = UtilSql.getValue(result, "PRODUCTTYPER");
        objectProductData.isstocked = UtilSql.getValue(result, "ISSTOCKED");
        objectProductData.weight = UtilSql.getValue(result, "WEIGHT");
        objectProductData.cUomWeightId = UtilSql.getValue(result, "C_UOM_WEIGHT_ID");
        objectProductData.cUomWeightIdr = UtilSql.getValue(result, "C_UOM_WEIGHT_IDR");
        objectProductData.costtype = UtilSql.getValue(result, "COSTTYPE");
        objectProductData.costtyper = UtilSql.getValue(result, "COSTTYPER");
        objectProductData.coststd = UtilSql.getValue(result, "COSTSTD");
        objectProductData.mAttributesetId = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
        objectProductData.mAttributesetIdr = UtilSql.getValue(result, "M_ATTRIBUTESET_IDR");
        objectProductData.attrsetvaluetype = UtilSql.getValue(result, "ATTRSETVALUETYPE");
        objectProductData.attrsetvaluetyper = UtilSql.getValue(result, "ATTRSETVALUETYPER");
        objectProductData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectProductData.mAttributesetinstanceIdr = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_IDR");
        objectProductData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectProductData.upc = UtilSql.getValue(result, "UPC");
        objectProductData.mBrandId = UtilSql.getValue(result, "M_BRAND_ID");
        objectProductData.mBrandIdr = UtilSql.getValue(result, "M_BRAND_IDR");
        objectProductData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectProductData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectProductData.imageurl = UtilSql.getValue(result, "IMAGEURL");
        objectProductData.descriptionurl = UtilSql.getValue(result, "DESCRIPTIONURL");
        objectProductData.production = UtilSql.getValue(result, "PRODUCTION");
        objectProductData.maProcessplanId = UtilSql.getValue(result, "MA_PROCESSPLAN_ID");
        objectProductData.maProcessplanIdr = UtilSql.getValue(result, "MA_PROCESSPLAN_IDR");
        objectProductData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectProductData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectProductData.volume = UtilSql.getValue(result, "VOLUME");
        objectProductData.shelfwidth = UtilSql.getValue(result, "SHELFWIDTH");
        objectProductData.shelfheight = UtilSql.getValue(result, "SHELFHEIGHT");
        objectProductData.shelfdepth = UtilSql.getValue(result, "SHELFDEPTH");
        objectProductData.unitsperpallet = UtilSql.getValue(result, "UNITSPERPALLET");
        objectProductData.discontinued = UtilSql.getValue(result, "DISCONTINUED");
        objectProductData.discontinuedby = UtilSql.getDateValue(result, "DISCONTINUEDBY", "dd-MM-yyyy");
        objectProductData.isbom = UtilSql.getValue(result, "ISBOM");
        objectProductData.isinvoiceprintdetails = UtilSql.getValue(result, "ISINVOICEPRINTDETAILS");
        objectProductData.ispicklistprintdetails = UtilSql.getValue(result, "ISPICKLISTPRINTDETAILS");
        objectProductData.isverified = UtilSql.getValue(result, "ISVERIFIED");
        objectProductData.processing = UtilSql.getValue(result, "PROCESSING");
        objectProductData.isquantityvariable = UtilSql.getValue(result, "ISQUANTITYVARIABLE");
        objectProductData.sExpensetypeId = UtilSql.getValue(result, "S_EXPENSETYPE_ID");
        objectProductData.sResourceId = UtilSql.getValue(result, "S_RESOURCE_ID");
        objectProductData.isdeferredrevenue = UtilSql.getValue(result, "ISDEFERREDREVENUE");
        objectProductData.isdeferredexpense = UtilSql.getValue(result, "ISDEFERREDEXPENSE");
        objectProductData.bookusingpoprice = UtilSql.getValue(result, "BOOKUSINGPOPRICE");
        objectProductData.characteristicDesc = UtilSql.getValue(result, "CHARACTERISTIC_DESC");
        objectProductData.revplantype = UtilSql.getValue(result, "REVPLANTYPE");
        objectProductData.revplantyper = UtilSql.getValue(result, "REVPLANTYPER");
        objectProductData.periodnumber = UtilSql.getValue(result, "PERIODNUMBER");
        objectProductData.defaultperiod = UtilSql.getValue(result, "DEFAULTPERIOD");
        objectProductData.defaultperiodr = UtilSql.getValue(result, "DEFAULTPERIODR");
        objectProductData.expplantype = UtilSql.getValue(result, "EXPPLANTYPE");
        objectProductData.expplantyper = UtilSql.getValue(result, "EXPPLANTYPER");
        objectProductData.periodnumberExp = UtilSql.getValue(result, "PERIODNUMBER_EXP");
        objectProductData.defaultperiodExp = UtilSql.getValue(result, "DEFAULTPERIOD_EXP");
        objectProductData.defaultperiodExpr = UtilSql.getValue(result, "DEFAULTPERIOD_EXPR");
        objectProductData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectProductData.capacity = UtilSql.getValue(result, "CAPACITY");
        objectProductData.delaymin = UtilSql.getValue(result, "DELAYMIN");
        objectProductData.mrpPlannerId = UtilSql.getValue(result, "MRP_PLANNER_ID");
        objectProductData.mrpPlanningmethodId = UtilSql.getValue(result, "MRP_PLANNINGMETHOD_ID");
        objectProductData.qtymax = UtilSql.getValue(result, "QTYMAX");
        objectProductData.qtymin = UtilSql.getValue(result, "QTYMIN");
        objectProductData.qtystd = UtilSql.getValue(result, "QTYSTD");
        objectProductData.qtytype = UtilSql.getValue(result, "QTYTYPE");
        objectProductData.stockmin = UtilSql.getValue(result, "STOCKMIN");
        objectProductData.createvariants = UtilSql.getValue(result, "CREATEVARIANTS");
        objectProductData.updateinvariants = UtilSql.getValue(result, "UPDATEINVARIANTS");
        objectProductData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectProductData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectProductData.sku = UtilSql.getValue(result, "SKU");
        objectProductData.classification = UtilSql.getValue(result, "CLASSIFICATION");
        objectProductData.documentnote = UtilSql.getValue(result, "DOCUMENTNOTE");
        objectProductData.help = UtilSql.getValue(result, "HELP");
        objectProductData.mFreightcategoryId = UtilSql.getValue(result, "M_FREIGHTCATEGORY_ID");
        objectProductData.downloadurl = UtilSql.getValue(result, "DOWNLOADURL");
        objectProductData.versionno = UtilSql.getValue(result, "VERSIONNO");
        objectProductData.guaranteedays = UtilSql.getValue(result, "GUARANTEEDAYS");
        objectProductData.stockMin = UtilSql.getValue(result, "STOCK_MIN");
        objectProductData.enforceAttribute = UtilSql.getValue(result, "ENFORCE_ATTRIBUTE");
        objectProductData.ispriceprinted = UtilSql.getValue(result, "ISPRICEPRINTED");
        objectProductData.name2 = UtilSql.getValue(result, "NAME2");
        objectProductData.language = UtilSql.getValue(result, "LANGUAGE");
        objectProductData.adUserClient = "";
        objectProductData.adOrgClient = "";
        objectProductData.createdby = "";
        objectProductData.trBgcolor = "";
        objectProductData.totalCount = "";
        objectProductData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectProductData);
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
    ProductData objectProductData[] = new ProductData[vector.size()];
    vector.copyInto(objectProductData);
    return(objectProductData);
  }

/**
Select for relation
 */
  public static ProductData[] select(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String parValue, String parName, String parM_Product_Category_ID, String parProductType, String parC_TaxCategory_ID, String parSessionDate, String parSessionUser, String adUserClient, String adOrgClient, String orderbyclause)    throws ServletException {
    return select(connectionProvider, dateTimeFormat, paramLanguage, parValue, parName, parM_Product_Category_ID, parProductType, parC_TaxCategory_ID, parSessionDate, parSessionUser, adUserClient, adOrgClient, orderbyclause, 0, 0);
  }

/**
Select for relation
 */
  public static ProductData[] select(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String parValue, String parName, String parM_Product_Category_ID, String parProductType, String parC_TaxCategory_ID, String parSessionDate, String parSessionUser, String adUserClient, String adOrgClient, String orderbyclause, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Product.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product.CreatedBy) as CreatedByR, " +
      "        to_char(M_Product.Updated, ?) as updated, " +
      "        to_char(M_Product.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Product.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product.UpdatedBy) as UpdatedByR, " +
      "        M_Product.ManageVariants, " +
      "M_Product.AD_Org_ID, " +
      "(CASE WHEN M_Product.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_Product.Value, " +
      "M_Product.Name, " +
      "M_Product.AD_Image_ID, " +
      "M_Product.C_UOM_ID, " +
      "(CASE WHEN M_Product.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "M_Product.M_Product_Category_ID, " +
      "(CASE WHEN M_Product.M_Product_Category_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_Category_IDR, " +
      "M_Product.C_TaxCategory_ID, " +
      "(CASE WHEN M_Product.C_TaxCategory_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS C_TaxCategory_IDR, " +
      "COALESCE(M_Product.IsGeneric, 'N') AS IsGeneric, " +
      "COALESCE(M_Product.IsPurchased, 'N') AS IsPurchased, " +
      "COALESCE(M_Product.IsSold, 'N') AS IsSold, " +
      "M_Product.Generic_Product_ID, " +
      "(CASE WHEN M_Product.Generic_Product_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL8.Name IS NULL THEN TO_CHAR(table8.Name) ELSE TO_CHAR(tableTRL8.Name) END)), ''))),'') ) END) AS Generic_Product_IDR, " +
      "M_Product.Description, " +
      "M_Product.ProductType, " +
      "(CASE WHEN M_Product.ProductType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS ProductTypeR, " +
      "COALESCE(M_Product.IsStocked, 'N') AS IsStocked, " +
      "M_Product.Weight, " +
      "M_Product.C_Uom_Weight_ID, " +
      "(CASE WHEN M_Product.C_Uom_Weight_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL10.Name IS NULL THEN TO_CHAR(table10.Name) ELSE TO_CHAR(tableTRL10.Name) END)), ''))),'') ) END) AS C_Uom_Weight_IDR, " +
      "M_Product.Costtype, " +
      "(CASE WHEN M_Product.Costtype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS CosttypeR, " +
      "M_Product.Coststd, " +
      "M_Product.M_AttributeSet_ID, " +
      "(CASE WHEN M_Product.M_AttributeSet_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Name), ''))),'') ) END) AS M_AttributeSet_IDR, " +
      "M_Product.Attrsetvaluetype, " +
      "(CASE WHEN M_Product.Attrsetvaluetype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS AttrsetvaluetypeR, " +
      "M_Product.M_AttributeSetInstance_ID, " +
      "(CASE WHEN M_Product.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "COALESCE(M_Product.IsActive, 'N') AS IsActive, " +
      "M_Product.UPC, " +
      "M_Product.M_Brand_ID, " +
      "(CASE WHEN M_Product.M_Brand_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Name), ''))),'') ) END) AS M_Brand_IDR, " +
      "M_Product.SalesRep_ID, " +
      "M_Product.C_BPartner_ID, " +
      "M_Product.ImageURL, " +
      "M_Product.DescriptionURL, " +
      "COALESCE(M_Product.Production, 'N') AS Production, " +
      "M_Product.MA_Processplan_ID, " +
      "(CASE WHEN M_Product.MA_Processplan_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.Name), ''))),'') ) END) AS MA_Processplan_IDR, " +
      "COALESCE(M_Product.IsSummary, 'N') AS IsSummary, " +
      "M_Product.M_Locator_ID, " +
      "M_Product.Volume, " +
      "M_Product.ShelfWidth, " +
      "M_Product.ShelfHeight, " +
      "M_Product.ShelfDepth, " +
      "M_Product.UnitsPerPallet, " +
      "COALESCE(M_Product.Discontinued, 'N') AS Discontinued, " +
      "M_Product.DiscontinuedBy, " +
      "COALESCE(M_Product.IsBOM, 'N') AS IsBOM, " +
      "COALESCE(M_Product.IsInvoicePrintDetails, 'N') AS IsInvoicePrintDetails, " +
      "COALESCE(M_Product.IsPickListPrintDetails, 'N') AS IsPickListPrintDetails, " +
      "COALESCE(M_Product.IsVerified, 'N') AS IsVerified, " +
      "M_Product.Processing, " +
      "COALESCE(M_Product.Isquantityvariable, 'N') AS Isquantityvariable, " +
      "M_Product.S_ExpenseType_ID, " +
      "M_Product.S_Resource_ID, " +
      "COALESCE(M_Product.Isdeferredrevenue, 'N') AS Isdeferredrevenue, " +
      "COALESCE(M_Product.Isdeferredexpense, 'N') AS Isdeferredexpense, " +
      "COALESCE(M_Product.Bookusingpoprice, 'N') AS Bookusingpoprice, " +
      "M_Product.Characteristic_Desc, " +
      "M_Product.Revplantype, " +
      "(CASE WHEN M_Product.Revplantype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list4.name),'') ) END) AS RevplantypeR, " +
      "M_Product.Periodnumber, " +
      "M_Product.DefaultPeriod, " +
      "(CASE WHEN M_Product.DefaultPeriod IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list5.name),'') ) END) AS DefaultPeriodR, " +
      "M_Product.Expplantype, " +
      "(CASE WHEN M_Product.Expplantype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list6.name),'') ) END) AS ExpplantypeR, " +
      "M_Product.Periodnumber_Exp, " +
      "M_Product.DefaultPeriod_Exp, " +
      "(CASE WHEN M_Product.DefaultPeriod_Exp IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list7.name),'') ) END) AS DefaultPeriod_ExpR, " +
      "COALESCE(M_Product.Calculated, 'N') AS Calculated, " +
      "M_Product.Capacity, " +
      "M_Product.Delaymin, " +
      "M_Product.MRP_Planner_ID, " +
      "M_Product.MRP_Planningmethod_ID, " +
      "M_Product.Qtymax, " +
      "M_Product.Qtymin, " +
      "M_Product.Qtystd, " +
      "COALESCE(M_Product.Qtytype, 'N') AS Qtytype, " +
      "M_Product.Stockmin, " +
      "M_Product.CreateVariants, " +
      "M_Product.Updateinvariants, " +
      "M_Product.M_Product_ID, " +
      "M_Product.AD_Client_ID, " +
      "M_Product.SKU, " +
      "M_Product.Classification, " +
      "M_Product.DocumentNote, " +
      "M_Product.Help, " +
      "M_Product.M_FreightCategory_ID, " +
      "M_Product.DownloadURL, " +
      "M_Product.VersionNo, " +
      "M_Product.GuaranteeDays, " +
      "M_Product.Stock_Min, " +
      "COALESCE(M_Product.Enforce_Attribute, 'N') AS Enforce_Attribute, " +
      "COALESCE(M_Product.Ispriceprinted, 'N') AS Ispriceprinted, " +
      "M_Product.Name2, " +
      "        '' AS TR_BGCOLOR, '' as total_count," +
      "        ? AS LANGUAGE, '' AS AD_USER_CLIENT, '' AS AD_ORG_CLIENT" +
      "        FROM M_Product left join (select AD_Org_ID, Value from AD_Org) table1 on (M_Product.AD_Org_ID = table1.AD_Org_ID) left join (select C_UOM_ID, Name from C_UOM) table2 on (M_Product.C_UOM_ID = table2.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL2 on (table2.C_UOM_ID = tableTRL2.C_UOM_ID and tableTRL2.AD_Language = ?)  left join (select M_Product_Category_ID, Name from M_Product_Category) table4 on (M_Product.M_Product_Category_ID = table4.M_Product_Category_ID) left join (select M_Product_Category_ID,AD_Language, Name from M_Product_Category_TRL) tableTRL4 on (table4.M_Product_Category_ID = tableTRL4.M_Product_Category_ID and tableTRL4.AD_Language = ?)  left join (select C_TaxCategory_ID, Name from C_TaxCategory) table6 on (M_Product.C_TaxCategory_ID = table6.C_TaxCategory_ID) left join (select C_TaxCategory_ID,AD_Language, Name from C_TaxCategory_TRL) tableTRL6 on (table6.C_TaxCategory_ID = tableTRL6.C_TaxCategory_ID and tableTRL6.AD_Language = ?)  left join (select M_Product_ID, Name from M_Product) table8 on (M_Product.Generic_Product_ID =  table8.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL8 on (table8.M_Product_ID = tableTRL8.M_Product_ID and tableTRL8.AD_Language = ?)  left join ad_ref_list_v list1 on (M_Product.ProductType = list1.value and list1.ad_reference_id = '270' and list1.ad_language = ?)  left join (select C_UOM_ID, Name from C_UOM) table10 on (M_Product.C_Uom_Weight_ID =  table10.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL10 on (table10.C_UOM_ID = tableTRL10.C_UOM_ID and tableTRL10.AD_Language = ?)  left join ad_ref_list_v list2 on (M_Product.Costtype = list2.value and list2.ad_reference_id = '800025' and list2.ad_language = ?)  left join (select M_AttributeSet_ID, Name from M_AttributeSet) table12 on (M_Product.M_AttributeSet_ID = table12.M_AttributeSet_ID) left join ad_ref_list_v list3 on (M_Product.Attrsetvaluetype = list3.value and list3.ad_reference_id = '5AD08D5DF85549E0BCC0DEBDE4C0D340' and list3.ad_language = ?)  left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table13 on (M_Product.M_AttributeSetInstance_ID = table13.M_AttributeSetInstance_ID) left join (select M_Brand_ID, Name from M_Brand) table14 on (M_Product.M_Brand_ID = table14.M_Brand_ID) left join (select MA_Processplan_ID, Name from MA_Processplan) table15 on (M_Product.MA_Processplan_ID = table15.MA_Processplan_ID) left join ad_ref_list_v list4 on (M_Product.Revplantype = list4.value and list4.ad_reference_id = '73625A8F22EF4CD7808603156BA606D7' and list4.ad_language = ?)  left join ad_ref_list_v list5 on (M_Product.DefaultPeriod = list5.value and list5.ad_reference_id = '6669508E338F4A10BA3E0D241D133E62' and list5.ad_language = ?)  left join ad_ref_list_v list6 on (M_Product.Expplantype = list6.value and list6.ad_reference_id = '73625A8F22EF4CD7808603156BA606D7' and list6.ad_language = ?)  left join ad_ref_list_v list7 on (M_Product.DefaultPeriod_Exp = list7.value and list7.ad_reference_id = '6669508E338F4A10BA3E0D241D133E62' and list7.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((parValue==null || parValue.equals(""))?"":"  AND (M_Product.Value) LIKE (?) ");
    strSql = strSql + ((parName==null || parName.equals(""))?"":"  AND C_IGNORE_ACCENT(M_Product.Name) LIKE C_IGNORE_ACCENT(?) ");
    strSql = strSql + ((parM_Product_Category_ID==null || parM_Product_Category_ID.equals(""))?"":"  AND (M_Product.M_Product_Category_ID) = (?) ");
    strSql = strSql + ((parProductType==null || parProductType.equals(""))?"":"  AND (M_Product.ProductType) = (?) ");
    strSql = strSql + ((parC_TaxCategory_ID==null || parC_TaxCategory_ID.equals(""))?"":"  AND (M_Product.C_TaxCategory_ID) = (?) ");
    strSql = strSql + ((parSessionDate.equals("parSessionDate"))?"  AND 1 = 1 ":"");
    strSql = strSql + ((parSessionUser.equals("parSessionUser"))?"  AND 1 = 1 ":"");
    strSql = strSql + 
      "        AND M_Product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") " +
      "        ORDER BY ";
    strSql = strSql + ((orderbyclause==null || orderbyclause.equals(""))?"":orderbyclause);
    strSql = strSql + 
      ", 1";

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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (parValue != null && !(parValue.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parValue);
      }
      if (parName != null && !(parName.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parName);
      }
      if (parM_Product_Category_ID != null && !(parM_Product_Category_ID.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parM_Product_Category_ID);
      }
      if (parProductType != null && !(parProductType.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parProductType);
      }
      if (parC_TaxCategory_ID != null && !(parC_TaxCategory_ID.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parC_TaxCategory_ID);
      }
      if (parSessionDate != null && !(parSessionDate.equals(""))) {
        }
      if (parSessionUser != null && !(parSessionUser.equals(""))) {
        }
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }
      if (orderbyclause != null && !(orderbyclause.equals(""))) {
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
        ProductData objectProductData = new ProductData();
        objectProductData.created = UtilSql.getValue(result, "CREATED");
        objectProductData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectProductData.updated = UtilSql.getValue(result, "UPDATED");
        objectProductData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectProductData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectProductData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectProductData.managevariants = UtilSql.getValue(result, "MANAGEVARIANTS");
        objectProductData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectProductData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectProductData.value = UtilSql.getValue(result, "VALUE");
        objectProductData.name = UtilSql.getValue(result, "NAME");
        objectProductData.adImageId = UtilSql.getValue(result, "AD_IMAGE_ID");
        objectProductData.cUomId = UtilSql.getValue(result, "C_UOM_ID");
        objectProductData.cUomIdr = UtilSql.getValue(result, "C_UOM_IDR");
        objectProductData.mProductCategoryId = UtilSql.getValue(result, "M_PRODUCT_CATEGORY_ID");
        objectProductData.mProductCategoryIdr = UtilSql.getValue(result, "M_PRODUCT_CATEGORY_IDR");
        objectProductData.cTaxcategoryId = UtilSql.getValue(result, "C_TAXCATEGORY_ID");
        objectProductData.cTaxcategoryIdr = UtilSql.getValue(result, "C_TAXCATEGORY_IDR");
        objectProductData.isgeneric = UtilSql.getValue(result, "ISGENERIC");
        objectProductData.ispurchased = UtilSql.getValue(result, "ISPURCHASED");
        objectProductData.issold = UtilSql.getValue(result, "ISSOLD");
        objectProductData.genericProductId = UtilSql.getValue(result, "GENERIC_PRODUCT_ID");
        objectProductData.genericProductIdr = UtilSql.getValue(result, "GENERIC_PRODUCT_IDR");
        objectProductData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectProductData.producttype = UtilSql.getValue(result, "PRODUCTTYPE");
        objectProductData.producttyper = UtilSql.getValue(result, "PRODUCTTYPER");
        objectProductData.isstocked = UtilSql.getValue(result, "ISSTOCKED");
        objectProductData.weight = UtilSql.getValue(result, "WEIGHT");
        objectProductData.cUomWeightId = UtilSql.getValue(result, "C_UOM_WEIGHT_ID");
        objectProductData.cUomWeightIdr = UtilSql.getValue(result, "C_UOM_WEIGHT_IDR");
        objectProductData.costtype = UtilSql.getValue(result, "COSTTYPE");
        objectProductData.costtyper = UtilSql.getValue(result, "COSTTYPER");
        objectProductData.coststd = UtilSql.getValue(result, "COSTSTD");
        objectProductData.mAttributesetId = UtilSql.getValue(result, "M_ATTRIBUTESET_ID");
        objectProductData.mAttributesetIdr = UtilSql.getValue(result, "M_ATTRIBUTESET_IDR");
        objectProductData.attrsetvaluetype = UtilSql.getValue(result, "ATTRSETVALUETYPE");
        objectProductData.attrsetvaluetyper = UtilSql.getValue(result, "ATTRSETVALUETYPER");
        objectProductData.mAttributesetinstanceId = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
        objectProductData.mAttributesetinstanceIdr = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_IDR");
        objectProductData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectProductData.upc = UtilSql.getValue(result, "UPC");
        objectProductData.mBrandId = UtilSql.getValue(result, "M_BRAND_ID");
        objectProductData.mBrandIdr = UtilSql.getValue(result, "M_BRAND_IDR");
        objectProductData.salesrepId = UtilSql.getValue(result, "SALESREP_ID");
        objectProductData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectProductData.imageurl = UtilSql.getValue(result, "IMAGEURL");
        objectProductData.descriptionurl = UtilSql.getValue(result, "DESCRIPTIONURL");
        objectProductData.production = UtilSql.getValue(result, "PRODUCTION");
        objectProductData.maProcessplanId = UtilSql.getValue(result, "MA_PROCESSPLAN_ID");
        objectProductData.maProcessplanIdr = UtilSql.getValue(result, "MA_PROCESSPLAN_IDR");
        objectProductData.issummary = UtilSql.getValue(result, "ISSUMMARY");
        objectProductData.mLocatorId = UtilSql.getValue(result, "M_LOCATOR_ID");
        objectProductData.volume = UtilSql.getValue(result, "VOLUME");
        objectProductData.shelfwidth = UtilSql.getValue(result, "SHELFWIDTH");
        objectProductData.shelfheight = UtilSql.getValue(result, "SHELFHEIGHT");
        objectProductData.shelfdepth = UtilSql.getValue(result, "SHELFDEPTH");
        objectProductData.unitsperpallet = UtilSql.getValue(result, "UNITSPERPALLET");
        objectProductData.discontinued = UtilSql.getValue(result, "DISCONTINUED");
        objectProductData.discontinuedby = UtilSql.getDateValue(result, "DISCONTINUEDBY", "dd-MM-yyyy");
        objectProductData.isbom = UtilSql.getValue(result, "ISBOM");
        objectProductData.isinvoiceprintdetails = UtilSql.getValue(result, "ISINVOICEPRINTDETAILS");
        objectProductData.ispicklistprintdetails = UtilSql.getValue(result, "ISPICKLISTPRINTDETAILS");
        objectProductData.isverified = UtilSql.getValue(result, "ISVERIFIED");
        objectProductData.processing = UtilSql.getValue(result, "PROCESSING");
        objectProductData.isquantityvariable = UtilSql.getValue(result, "ISQUANTITYVARIABLE");
        objectProductData.sExpensetypeId = UtilSql.getValue(result, "S_EXPENSETYPE_ID");
        objectProductData.sResourceId = UtilSql.getValue(result, "S_RESOURCE_ID");
        objectProductData.isdeferredrevenue = UtilSql.getValue(result, "ISDEFERREDREVENUE");
        objectProductData.isdeferredexpense = UtilSql.getValue(result, "ISDEFERREDEXPENSE");
        objectProductData.bookusingpoprice = UtilSql.getValue(result, "BOOKUSINGPOPRICE");
        objectProductData.characteristicDesc = UtilSql.getValue(result, "CHARACTERISTIC_DESC");
        objectProductData.revplantype = UtilSql.getValue(result, "REVPLANTYPE");
        objectProductData.revplantyper = UtilSql.getValue(result, "REVPLANTYPER");
        objectProductData.periodnumber = UtilSql.getValue(result, "PERIODNUMBER");
        objectProductData.defaultperiod = UtilSql.getValue(result, "DEFAULTPERIOD");
        objectProductData.defaultperiodr = UtilSql.getValue(result, "DEFAULTPERIODR");
        objectProductData.expplantype = UtilSql.getValue(result, "EXPPLANTYPE");
        objectProductData.expplantyper = UtilSql.getValue(result, "EXPPLANTYPER");
        objectProductData.periodnumberExp = UtilSql.getValue(result, "PERIODNUMBER_EXP");
        objectProductData.defaultperiodExp = UtilSql.getValue(result, "DEFAULTPERIOD_EXP");
        objectProductData.defaultperiodExpr = UtilSql.getValue(result, "DEFAULTPERIOD_EXPR");
        objectProductData.calculated = UtilSql.getValue(result, "CALCULATED");
        objectProductData.capacity = UtilSql.getValue(result, "CAPACITY");
        objectProductData.delaymin = UtilSql.getValue(result, "DELAYMIN");
        objectProductData.mrpPlannerId = UtilSql.getValue(result, "MRP_PLANNER_ID");
        objectProductData.mrpPlanningmethodId = UtilSql.getValue(result, "MRP_PLANNINGMETHOD_ID");
        objectProductData.qtymax = UtilSql.getValue(result, "QTYMAX");
        objectProductData.qtymin = UtilSql.getValue(result, "QTYMIN");
        objectProductData.qtystd = UtilSql.getValue(result, "QTYSTD");
        objectProductData.qtytype = UtilSql.getValue(result, "QTYTYPE");
        objectProductData.stockmin = UtilSql.getValue(result, "STOCKMIN");
        objectProductData.createvariants = UtilSql.getValue(result, "CREATEVARIANTS");
        objectProductData.updateinvariants = UtilSql.getValue(result, "UPDATEINVARIANTS");
        objectProductData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectProductData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectProductData.sku = UtilSql.getValue(result, "SKU");
        objectProductData.classification = UtilSql.getValue(result, "CLASSIFICATION");
        objectProductData.documentnote = UtilSql.getValue(result, "DOCUMENTNOTE");
        objectProductData.help = UtilSql.getValue(result, "HELP");
        objectProductData.mFreightcategoryId = UtilSql.getValue(result, "M_FREIGHTCATEGORY_ID");
        objectProductData.downloadurl = UtilSql.getValue(result, "DOWNLOADURL");
        objectProductData.versionno = UtilSql.getValue(result, "VERSIONNO");
        objectProductData.guaranteedays = UtilSql.getValue(result, "GUARANTEEDAYS");
        objectProductData.stockMin = UtilSql.getValue(result, "STOCK_MIN");
        objectProductData.enforceAttribute = UtilSql.getValue(result, "ENFORCE_ATTRIBUTE");
        objectProductData.ispriceprinted = UtilSql.getValue(result, "ISPRICEPRINTED");
        objectProductData.name2 = UtilSql.getValue(result, "NAME2");
        objectProductData.trBgcolor = UtilSql.getValue(result, "TR_BGCOLOR");
        objectProductData.totalCount = UtilSql.getValue(result, "TOTAL_COUNT");
        objectProductData.language = UtilSql.getValue(result, "LANGUAGE");
        objectProductData.adUserClient = UtilSql.getValue(result, "AD_USER_CLIENT");
        objectProductData.adOrgClient = UtilSql.getValue(result, "AD_ORG_CLIENT");
        objectProductData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectProductData);
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
    ProductData objectProductData[] = new ProductData[vector.size()];
    vector.copyInto(objectProductData);
    return(objectProductData);
  }

/**
Create a registry
 */
  public static ProductData[] set(String mProductId, String adClientId, String adOrgId, String isactive, String createdby, String createdbyr, String updatedby, String updatedbyr, String name, String description, String issummary, String cUomId, String isstocked, String ispurchased, String issold, String volume, String weight, String revplantype, String value, String mProductCategoryId, String cTaxcategoryId, String upc, String sku, String shelfwidth, String shelfheight, String shelfdepth, String unitsperpallet, String discontinued, String discontinuedby, String defaultperiod, String documentnote, String help, String classification, String salesrepId, String bookusingpoprice, String isbom, String isinvoiceprintdetails, String ispicklistprintdetails, String isverified, String processing, String capacity, String delaymin, String mrpPlannerId, String mrpPlanningmethodId, String qtymax, String qtymin, String qtystd, String qtytype, String stockmin, String sExpensetypeId, String sResourceId, String producttype, String imageurl, String descriptionurl, String versionno, String guaranteedays, String attrsetvaluetype, String adImageId, String cBpartnerId, String ispriceprinted, String name2, String costtype, String coststd, String stockMin, String enforceAttribute, String calculated, String maProcessplanId, String production, String isdeferredrevenue, String mAttributesetId, String mAttributesetinstanceId, String mAttributesetinstanceIdr, String downloadurl, String mFreightcategoryId, String mLocatorId, String isdeferredexpense, String defaultperiodExp, String expplantype, String periodnumberExp, String updateinvariants, String mBrandId, String isgeneric, String genericProductId, String createvariants, String characteristicDesc, String managevariants, String cUomWeightId, String isquantityvariable, String periodnumber)    throws ServletException {
    ProductData objectProductData[] = new ProductData[1];
    objectProductData[0] = new ProductData();
    objectProductData[0].created = "";
    objectProductData[0].createdbyr = createdbyr;
    objectProductData[0].updated = "";
    objectProductData[0].updatedTimeStamp = "";
    objectProductData[0].updatedby = updatedby;
    objectProductData[0].updatedbyr = updatedbyr;
    objectProductData[0].managevariants = managevariants;
    objectProductData[0].adOrgId = adOrgId;
    objectProductData[0].adOrgIdr = "";
    objectProductData[0].value = value;
    objectProductData[0].name = name;
    objectProductData[0].adImageId = adImageId;
    objectProductData[0].cUomId = cUomId;
    objectProductData[0].cUomIdr = "";
    objectProductData[0].mProductCategoryId = mProductCategoryId;
    objectProductData[0].mProductCategoryIdr = "";
    objectProductData[0].cTaxcategoryId = cTaxcategoryId;
    objectProductData[0].cTaxcategoryIdr = "";
    objectProductData[0].isgeneric = isgeneric;
    objectProductData[0].ispurchased = ispurchased;
    objectProductData[0].issold = issold;
    objectProductData[0].genericProductId = genericProductId;
    objectProductData[0].genericProductIdr = "";
    objectProductData[0].description = description;
    objectProductData[0].producttype = producttype;
    objectProductData[0].producttyper = "";
    objectProductData[0].isstocked = isstocked;
    objectProductData[0].weight = weight;
    objectProductData[0].cUomWeightId = cUomWeightId;
    objectProductData[0].cUomWeightIdr = "";
    objectProductData[0].costtype = costtype;
    objectProductData[0].costtyper = "";
    objectProductData[0].coststd = coststd;
    objectProductData[0].mAttributesetId = mAttributesetId;
    objectProductData[0].mAttributesetIdr = "";
    objectProductData[0].attrsetvaluetype = attrsetvaluetype;
    objectProductData[0].attrsetvaluetyper = "";
    objectProductData[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectProductData[0].mAttributesetinstanceIdr = mAttributesetinstanceIdr;
    objectProductData[0].isactive = isactive;
    objectProductData[0].upc = upc;
    objectProductData[0].mBrandId = mBrandId;
    objectProductData[0].mBrandIdr = "";
    objectProductData[0].salesrepId = salesrepId;
    objectProductData[0].cBpartnerId = cBpartnerId;
    objectProductData[0].imageurl = imageurl;
    objectProductData[0].descriptionurl = descriptionurl;
    objectProductData[0].production = production;
    objectProductData[0].maProcessplanId = maProcessplanId;
    objectProductData[0].maProcessplanIdr = "";
    objectProductData[0].issummary = issummary;
    objectProductData[0].mLocatorId = mLocatorId;
    objectProductData[0].volume = volume;
    objectProductData[0].shelfwidth = shelfwidth;
    objectProductData[0].shelfheight = shelfheight;
    objectProductData[0].shelfdepth = shelfdepth;
    objectProductData[0].unitsperpallet = unitsperpallet;
    objectProductData[0].discontinued = discontinued;
    objectProductData[0].discontinuedby = discontinuedby;
    objectProductData[0].isbom = isbom;
    objectProductData[0].isinvoiceprintdetails = isinvoiceprintdetails;
    objectProductData[0].ispicklistprintdetails = ispicklistprintdetails;
    objectProductData[0].isverified = isverified;
    objectProductData[0].processing = processing;
    objectProductData[0].isquantityvariable = isquantityvariable;
    objectProductData[0].sExpensetypeId = sExpensetypeId;
    objectProductData[0].sResourceId = sResourceId;
    objectProductData[0].isdeferredrevenue = isdeferredrevenue;
    objectProductData[0].isdeferredexpense = isdeferredexpense;
    objectProductData[0].bookusingpoprice = bookusingpoprice;
    objectProductData[0].characteristicDesc = characteristicDesc;
    objectProductData[0].revplantype = revplantype;
    objectProductData[0].revplantyper = "";
    objectProductData[0].periodnumber = periodnumber;
    objectProductData[0].defaultperiod = defaultperiod;
    objectProductData[0].defaultperiodr = "";
    objectProductData[0].expplantype = expplantype;
    objectProductData[0].expplantyper = "";
    objectProductData[0].periodnumberExp = periodnumberExp;
    objectProductData[0].defaultperiodExp = defaultperiodExp;
    objectProductData[0].defaultperiodExpr = "";
    objectProductData[0].calculated = calculated;
    objectProductData[0].capacity = capacity;
    objectProductData[0].delaymin = delaymin;
    objectProductData[0].mrpPlannerId = mrpPlannerId;
    objectProductData[0].mrpPlanningmethodId = mrpPlanningmethodId;
    objectProductData[0].qtymax = qtymax;
    objectProductData[0].qtymin = qtymin;
    objectProductData[0].qtystd = qtystd;
    objectProductData[0].qtytype = qtytype;
    objectProductData[0].stockmin = stockmin;
    objectProductData[0].createvariants = createvariants;
    objectProductData[0].updateinvariants = updateinvariants;
    objectProductData[0].mProductId = mProductId;
    objectProductData[0].adClientId = adClientId;
    objectProductData[0].sku = sku;
    objectProductData[0].classification = classification;
    objectProductData[0].documentnote = documentnote;
    objectProductData[0].help = help;
    objectProductData[0].mFreightcategoryId = mFreightcategoryId;
    objectProductData[0].downloadurl = downloadurl;
    objectProductData[0].versionno = versionno;
    objectProductData[0].guaranteedays = guaranteedays;
    objectProductData[0].stockMin = stockMin;
    objectProductData[0].enforceAttribute = enforceAttribute;
    objectProductData[0].ispriceprinted = ispriceprinted;
    objectProductData[0].name2 = name2;
    objectProductData[0].trBgcolor = "";
    objectProductData[0].totalCount = "";
    objectProductData[0].language = "";
    objectProductData[0].adUserClient = "";
    objectProductData[0].adOrgClient = "";
    return objectProductData;
  }

/**
Select for auxiliar field
 */
  public static String selectAuxE63B6F9E7F2849D8837B8CD083A35597(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select  (CASE COUNT(*) WHEN 0 THEN 0 ELSE 1 END) AS TOTAL from m_product_ch where m_product_id=? and isvariant='N' ";

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
        strReturn = UtilSql.getValue(result, "TOTAL");
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
  public static String selectDef1407_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef1409_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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

/**
Select for auxiliar field
 */
  public static String selectDef2012(ConnectionProvider connectionProvider, String AD_ORG_ID, String AD_CLIENT_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT MAX(M_PRODUCT_CATEGORY_ID) FROM M_PRODUCT_CATEGORY WHERE AD_ISORGINCLUDED(?, AD_ORG_ID, ?) <> -1 AND ISDEFAULT = 'Y' AND AD_CLIENT_ID = ? AND ISSUMMARY='N' ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_CLIENT_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_CLIENT_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "MAX(M_PRODUCT_CATEGORY_ID)");
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
  public static String selectDef8418_2(ConnectionProvider connectionProvider, String M_AttributeSetInstance_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Description), ''))), '') ) as M_AttributeSetInstance_ID FROM M_AttributeSetInstance left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table2 on (M_AttributeSetInstance.M_AttributeSetInstance_ID = table2.M_AttributeSetInstance_ID) WHERE M_AttributeSetInstance.isActive='Y' AND M_AttributeSetInstance.M_AttributeSetInstance_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_AttributeSetInstance_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_ATTRIBUTESETINSTANCE_ID");
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
      "        UPDATE M_Product" +
      "        SET ManageVariants = (?) , AD_Org_ID = (?) , Value = (?) , Name = (?) , AD_Image_ID = (?) , C_UOM_ID = (?) , M_Product_Category_ID = (?) , C_TaxCategory_ID = (?) , IsGeneric = (?) , IsPurchased = (?) , IsSold = (?) , Generic_Product_ID = (?) , Description = (?) , ProductType = (?) , IsStocked = (?) , Weight = TO_NUMBER(?) , C_Uom_Weight_ID = (?) , Costtype = (?) , Coststd = TO_NUMBER(?) , M_AttributeSet_ID = (?) , Attrsetvaluetype = (?) , M_AttributeSetInstance_ID = (?) , IsActive = (?) , UPC = (?) , M_Brand_ID = (?) , SalesRep_ID = (?) , C_BPartner_ID = (?) , ImageURL = (?) , DescriptionURL = (?) , Production = (?) , MA_Processplan_ID = (?) , IsSummary = (?) , M_Locator_ID = (?) , Volume = TO_NUMBER(?) , ShelfWidth = TO_NUMBER(?) , ShelfHeight = TO_NUMBER(?) , ShelfDepth = TO_NUMBER(?) , UnitsPerPallet = TO_NUMBER(?) , Discontinued = (?) , DiscontinuedBy = TO_DATE(?) , IsBOM = (?) , IsInvoicePrintDetails = (?) , IsPickListPrintDetails = (?) , IsVerified = (?) , Processing = (?) , Isquantityvariable = (?) , S_ExpenseType_ID = (?) , S_Resource_ID = (?) , Isdeferredrevenue = (?) , Isdeferredexpense = (?) , Bookusingpoprice = (?) , Characteristic_Desc = (?) , Revplantype = (?) , Periodnumber = TO_NUMBER(?) , DefaultPeriod = (?) , Expplantype = (?) , Periodnumber_Exp = TO_NUMBER(?) , DefaultPeriod_Exp = (?) , Calculated = (?) , Capacity = TO_NUMBER(?) , Delaymin = TO_NUMBER(?) , MRP_Planner_ID = (?) , MRP_Planningmethod_ID = (?) , Qtymax = TO_NUMBER(?) , Qtymin = TO_NUMBER(?) , Qtystd = TO_NUMBER(?) , Qtytype = (?) , Stockmin = TO_NUMBER(?) , CreateVariants = (?) , Updateinvariants = (?) , M_Product_ID = (?) , AD_Client_ID = (?) , SKU = (?) , Classification = (?) , DocumentNote = (?) , Help = (?) , M_FreightCategory_ID = (?) , DownloadURL = (?) , VersionNo = (?) , GuaranteeDays = TO_NUMBER(?) , Stock_Min = TO_NUMBER(?) , Enforce_Attribute = (?) , Ispriceprinted = (?) , Name2 = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_Product.M_Product_ID = ? " +
      "        AND M_Product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, managevariants);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adImageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isgeneric);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issold);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, genericProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, producttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomWeightId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, coststd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, attrsetvaluetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mBrandId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, imageurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, descriptionurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, production);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, volume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfwidth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfheight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfdepth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unitsperpallet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiceprintdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispicklistprintdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isverified);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isquantityvariable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sExpensetypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeferredrevenue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeferredexpense);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bookusingpoprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, characteristicDesc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, revplantype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultperiod);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, expplantype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodnumberExp);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultperiodExp);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, capacity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, delaymin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpPlannerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpPlanningmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtystd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtytype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockmin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createvariants);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updateinvariants);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sku);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, classification);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentnote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mFreightcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, downloadurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, versionno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedays);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockMin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enforceAttribute);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispriceprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
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
      "        INSERT INTO M_Product " +
      "        (ManageVariants, AD_Org_ID, Value, Name, AD_Image_ID, C_UOM_ID, M_Product_Category_ID, C_TaxCategory_ID, IsGeneric, IsPurchased, IsSold, Generic_Product_ID, Description, ProductType, IsStocked, Weight, C_Uom_Weight_ID, Costtype, Coststd, M_AttributeSet_ID, Attrsetvaluetype, M_AttributeSetInstance_ID, IsActive, UPC, M_Brand_ID, SalesRep_ID, C_BPartner_ID, ImageURL, DescriptionURL, Production, MA_Processplan_ID, IsSummary, M_Locator_ID, Volume, ShelfWidth, ShelfHeight, ShelfDepth, UnitsPerPallet, Discontinued, DiscontinuedBy, IsBOM, IsInvoicePrintDetails, IsPickListPrintDetails, IsVerified, Processing, Isquantityvariable, S_ExpenseType_ID, S_Resource_ID, Isdeferredrevenue, Isdeferredexpense, Bookusingpoprice, Characteristic_Desc, Revplantype, Periodnumber, DefaultPeriod, Expplantype, Periodnumber_Exp, DefaultPeriod_Exp, Calculated, Capacity, Delaymin, MRP_Planner_ID, MRP_Planningmethod_ID, Qtymax, Qtymin, Qtystd, Qtytype, Stockmin, CreateVariants, Updateinvariants, M_Product_ID, AD_Client_ID, SKU, Classification, DocumentNote, Help, M_FreightCategory_ID, DownloadURL, VersionNo, GuaranteeDays, Stock_Min, Enforce_Attribute, Ispriceprinted, Name2, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, managevariants);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adImageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isgeneric);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issold);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, genericProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, producttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomWeightId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, coststd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, attrsetvaluetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mBrandId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, imageurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, descriptionurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, production);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, volume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfwidth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfheight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfdepth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unitsperpallet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiceprintdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispicklistprintdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isverified);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isquantityvariable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sExpensetypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeferredrevenue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdeferredexpense);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bookusingpoprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, characteristicDesc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, revplantype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultperiod);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, expplantype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, periodnumberExp);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultperiodExp);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, capacity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, delaymin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpPlannerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpPlanningmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtystd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtytype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockmin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createvariants);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updateinvariants);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sku);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, classification);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentnote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mFreightcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, downloadurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, versionno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedays);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockMin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enforceAttribute);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispriceprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name2);
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
      "        DELETE FROM M_Product" +
      "        WHERE M_Product.M_Product_ID = ? " +
      "        AND M_Product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product.AD_Org_ID IN (";
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
      "          FROM M_Product" +
      "         WHERE M_Product.M_Product_ID = ? ";

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
      "          FROM M_Product" +
      "         WHERE M_Product.M_Product_ID = ? ";

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
