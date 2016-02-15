/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2008-2014 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
*/
package com.gai.module.data;

import com.gai.asset.data.GasHistoricalAsset;
import com.gai.investasi.data.GnvInvestasiHeader;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.invoice.Invoice;
import org.openbravo.model.financialmgmt.accounting.AccountingFact;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.financialmgmt.payment.FIN_Payment;
/**
 * Entity class for entity GAI_MasterKantor (stored in table GAI_KANTOR).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GAI_KANTOR extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GAI_KANTOR";
    public static final String ENTITY_NAME = "GAI_MasterKantor";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_SEARCHKEY = "searchKey";
    public static final String PROPERTY_COMMERCIALNAME = "commercialName";
    public static final String PROPERTY_REGIONAL = "regional";
    public static final String PROPERTY_FINPAYMENTEMGAIKANTORIDLIST = "fINPaymentEMGaiKantorIDList";
    public static final String PROPERTY_FINANCIALMGMTACCOUNTINGFACTEMGAIKANTORIDLIST = "financialMgmtAccountingFactEMGaiKantorIDList";
    public static final String PROPERTY_FINANCIALMGMTASSETEMGAIKANTORIDLIST = "financialMgmtAssetEMGaiKantorIDList";
    public static final String PROPERTY_GASHISTORICALASSETEMGAIKANTORIDLIST = "gASHISTORICALASSETEMGaiKantorIDList";
    public static final String PROPERTY_GNVINVESTASIHEADEREMGAIKANTORIDLIST = "gNVINVESTASIHEADEREMGaiKantorIDList";
    public static final String PROPERTY_INVOICEEMGAIKANTORIDLIST = "invoiceEMGaiKantorIDList";

    public GAI_KANTOR() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FINPAYMENTEMGAIKANTORIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTACCOUNTINGFACTEMGAIKANTORIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTASSETEMGAIKANTORIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GASHISTORICALASSETEMGAIKANTORIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GNVINVESTASIHEADEREMGAIKANTORIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICEEMGAIKANTORIDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    public String getId() {
        return (String) get(PROPERTY_ID);
    }

    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }

    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }

    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }

    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }

    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }

    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }

    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }

    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }

    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    public String getCommercialName() {
        return (String) get(PROPERTY_COMMERCIALNAME);
    }

    public void setCommercialName(String commercialName) {
        set(PROPERTY_COMMERCIALNAME, commercialName);
    }

    public String getRegional() {
        return (String) get(PROPERTY_REGIONAL);
    }

    public void setRegional(String regional) {
        set(PROPERTY_REGIONAL, regional);
    }

    @SuppressWarnings("unchecked")
    public List<FIN_Payment> getFINPaymentEMGaiKantorIDList() {
      return (List<FIN_Payment>) get(PROPERTY_FINPAYMENTEMGAIKANTORIDLIST);
    }

    public void setFINPaymentEMGaiKantorIDList(List<FIN_Payment> fINPaymentEMGaiKantorIDList) {
        set(PROPERTY_FINPAYMENTEMGAIKANTORIDLIST, fINPaymentEMGaiKantorIDList);
    }

    @SuppressWarnings("unchecked")
    public List<AccountingFact> getFinancialMgmtAccountingFactEMGaiKantorIDList() {
      return (List<AccountingFact>) get(PROPERTY_FINANCIALMGMTACCOUNTINGFACTEMGAIKANTORIDLIST);
    }

    public void setFinancialMgmtAccountingFactEMGaiKantorIDList(List<AccountingFact> financialMgmtAccountingFactEMGaiKantorIDList) {
        set(PROPERTY_FINANCIALMGMTACCOUNTINGFACTEMGAIKANTORIDLIST, financialMgmtAccountingFactEMGaiKantorIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Asset> getFinancialMgmtAssetEMGaiKantorIDList() {
      return (List<Asset>) get(PROPERTY_FINANCIALMGMTASSETEMGAIKANTORIDLIST);
    }

    public void setFinancialMgmtAssetEMGaiKantorIDList(List<Asset> financialMgmtAssetEMGaiKantorIDList) {
        set(PROPERTY_FINANCIALMGMTASSETEMGAIKANTORIDLIST, financialMgmtAssetEMGaiKantorIDList);
    }

    @SuppressWarnings("unchecked")
    public List<GasHistoricalAsset> getGASHISTORICALASSETEMGaiKantorIDList() {
      return (List<GasHistoricalAsset>) get(PROPERTY_GASHISTORICALASSETEMGAIKANTORIDLIST);
    }

    public void setGASHISTORICALASSETEMGaiKantorIDList(List<GasHistoricalAsset> gASHISTORICALASSETEMGaiKantorIDList) {
        set(PROPERTY_GASHISTORICALASSETEMGAIKANTORIDLIST, gASHISTORICALASSETEMGaiKantorIDList);
    }

    @SuppressWarnings("unchecked")
    public List<GnvInvestasiHeader> getGNVINVESTASIHEADEREMGaiKantorIDList() {
      return (List<GnvInvestasiHeader>) get(PROPERTY_GNVINVESTASIHEADEREMGAIKANTORIDLIST);
    }

    public void setGNVINVESTASIHEADEREMGaiKantorIDList(List<GnvInvestasiHeader> gNVINVESTASIHEADEREMGaiKantorIDList) {
        set(PROPERTY_GNVINVESTASIHEADEREMGAIKANTORIDLIST, gNVINVESTASIHEADEREMGaiKantorIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Invoice> getInvoiceEMGaiKantorIDList() {
      return (List<Invoice>) get(PROPERTY_INVOICEEMGAIKANTORIDLIST);
    }

    public void setInvoiceEMGaiKantorIDList(List<Invoice> invoiceEMGaiKantorIDList) {
        set(PROPERTY_INVOICEEMGAIKANTORIDLIST, invoiceEMGaiKantorIDList);
    }

}
