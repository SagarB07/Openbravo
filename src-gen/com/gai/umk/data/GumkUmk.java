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
package com.gai.umk.data;

import com.gai.investasi.data.GnvMasterDataDireksi;
import com.gai.module.master.data.GmmMasterDepartment;

import java.math.BigDecimal;
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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.Budget;
import org.openbravo.model.financialmgmt.payment.FIN_FinancialAccount;
import org.openbravo.model.financialmgmt.payment.FIN_Payment;
import org.openbravo.model.financialmgmt.payment.FIN_PaymentMethod;
/**
 * Entity class for entity gumk_umk (stored in table gumk_umk).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GumkUmk extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "gumk_umk";
    public static final String ENTITY_NAME = "gumk_umk";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_USER = "user";
    public static final String PROPERTY_NOMINALPENJAGUANNUMK = "nominalPenjaguannUmk";
    public static final String PROPERTY_TANGGALPENERIMAANUMK = "tanggalPenerimaanUmk";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_TOTAMOUNTREALISASI = "tOTAmountRealisasi";
    public static final String PROPERTY_SELISIH = "selisih";
    public static final String PROPERTY_COMPLETE = "complete";
    public static final String PROPERTY_REALISASI = "realisasi";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_DOCUMENTNO = "documentno";
    public static final String PROPERTY_CURRENCY = "currency";
    public static final String PROPERTY_FINPAYMENTMETHOD = "fINPaymentmethod";
    public static final String PROPERTY_FINFINANCIALACCOUNT = "fINFinancialAccount";
    public static final String PROPERTY_DOCTYPE = "doctype";
    public static final String PROPERTY_GUMKJENISUMK = "gumkJenisumk";
    public static final String PROPERTY_MEMOINTERNALDARI = "memointernaldari";
    public static final String PROPERTY_TANGGALMEMOINTERNAL = "tanggalmemointernal";
    public static final String PROPERTY_NOMEMOINTERNAL = "nomemointernal";
    public static final String PROPERTY_PERIHAL = "perihal";
    public static final String PROPERTY_POSTED = "posted";
    public static final String PROPERTY_JENUMK = "jENUmk";
    public static final String PROPERTY_GBGBUDGET = "gbgBudget";
    public static final String PROPERTY_GNVMASTERDATADIREKSI = "gnvMasterDatadireksi";
    public static final String PROPERTY_GMMMASTERDEPARTMENT = "gmmMasterDepartment";
    public static final String PROPERTY_BTNREACTIVE = "bTNReactive";
    public static final String PROPERTY_FINPAYMENTEMGUMKUMKIDLIST = "fINPaymentEMGumkUmkIDList";
    public static final String PROPERTY_GUMKREALISASILIST = "gumkRealisasiList";

    public GumkUmk() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_NOMINALPENJAGUANNUMK, new BigDecimal(0));
        setDefaultValue(PROPERTY_TOTAMOUNTREALISASI, new BigDecimal(0));
        setDefaultValue(PROPERTY_SELISIH, new BigDecimal(0));
        setDefaultValue(PROPERTY_COMPLETE, false);
        setDefaultValue(PROPERTY_REALISASI, false);
        setDefaultValue(PROPERTY_STATUS, "draft");
        setDefaultValue(PROPERTY_JENUMK, "Non Belanja Modal");
        setDefaultValue(PROPERTY_BTNREACTIVE, false);
        setDefaultValue(PROPERTY_FINPAYMENTEMGUMKUMKIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GUMKREALISASILIST, new ArrayList<Object>());
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

    public User getUser() {
        return (User) get(PROPERTY_USER);
    }

    public void setUser(User user) {
        set(PROPERTY_USER, user);
    }

    public BigDecimal getNominalPenjaguannUmk() {
        return (BigDecimal) get(PROPERTY_NOMINALPENJAGUANNUMK);
    }

    public void setNominalPenjaguannUmk(BigDecimal nominalPenjaguannUmk) {
        set(PROPERTY_NOMINALPENJAGUANNUMK, nominalPenjaguannUmk);
    }

    public Date getTanggalPenerimaanUmk() {
        return (Date) get(PROPERTY_TANGGALPENERIMAANUMK);
    }

    public void setTanggalPenerimaanUmk(Date tanggalPenerimaanUmk) {
        set(PROPERTY_TANGGALPENERIMAANUMK, tanggalPenerimaanUmk);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public BigDecimal getTOTAmountRealisasi() {
        return (BigDecimal) get(PROPERTY_TOTAMOUNTREALISASI);
    }

    public void setTOTAmountRealisasi(BigDecimal tOTAmountRealisasi) {
        set(PROPERTY_TOTAMOUNTREALISASI, tOTAmountRealisasi);
    }

    public BigDecimal getSelisih() {
        return (BigDecimal) get(PROPERTY_SELISIH);
    }

    public void setSelisih(BigDecimal selisih) {
        set(PROPERTY_SELISIH, selisih);
    }

    public Boolean isComplete() {
        return (Boolean) get(PROPERTY_COMPLETE);
    }

    public void setComplete(Boolean complete) {
        set(PROPERTY_COMPLETE, complete);
    }

    public Boolean isRealisasi() {
        return (Boolean) get(PROPERTY_REALISASI);
    }

    public void setRealisasi(Boolean realisasi) {
        set(PROPERTY_REALISASI, realisasi);
    }

    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }

    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    public String getDocumentno() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }

    public void setDocumentno(String documentno) {
        set(PROPERTY_DOCUMENTNO, documentno);
    }

    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }

    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    public FIN_PaymentMethod getFINPaymentmethod() {
        return (FIN_PaymentMethod) get(PROPERTY_FINPAYMENTMETHOD);
    }

    public void setFINPaymentmethod(FIN_PaymentMethod fINPaymentmethod) {
        set(PROPERTY_FINPAYMENTMETHOD, fINPaymentmethod);
    }

    public FIN_FinancialAccount getFINFinancialAccount() {
        return (FIN_FinancialAccount) get(PROPERTY_FINFINANCIALACCOUNT);
    }

    public void setFINFinancialAccount(FIN_FinancialAccount fINFinancialAccount) {
        set(PROPERTY_FINFINANCIALACCOUNT, fINFinancialAccount);
    }

    public DocumentType getDoctype() {
        return (DocumentType) get(PROPERTY_DOCTYPE);
    }

    public void setDoctype(DocumentType doctype) {
        set(PROPERTY_DOCTYPE, doctype);
    }

    public GumkJenisUmk getGumkJenisumk() {
        return (GumkJenisUmk) get(PROPERTY_GUMKJENISUMK);
    }

    public void setGumkJenisumk(GumkJenisUmk gumkJenisumk) {
        set(PROPERTY_GUMKJENISUMK, gumkJenisumk);
    }

    public String getMemointernaldari() {
        return (String) get(PROPERTY_MEMOINTERNALDARI);
    }

    public void setMemointernaldari(String memointernaldari) {
        set(PROPERTY_MEMOINTERNALDARI, memointernaldari);
    }

    public Date getTanggalmemointernal() {
        return (Date) get(PROPERTY_TANGGALMEMOINTERNAL);
    }

    public void setTanggalmemointernal(Date tanggalmemointernal) {
        set(PROPERTY_TANGGALMEMOINTERNAL, tanggalmemointernal);
    }

    public String getNomemointernal() {
        return (String) get(PROPERTY_NOMEMOINTERNAL);
    }

    public void setNomemointernal(String nomemointernal) {
        set(PROPERTY_NOMEMOINTERNAL, nomemointernal);
    }

    public String getPerihal() {
        return (String) get(PROPERTY_PERIHAL);
    }

    public void setPerihal(String perihal) {
        set(PROPERTY_PERIHAL, perihal);
    }

    public String getPosted() {
        return (String) get(PROPERTY_POSTED);
    }

    public void setPosted(String posted) {
        set(PROPERTY_POSTED, posted);
    }

    public String getJENUmk() {
        return (String) get(PROPERTY_JENUMK);
    }

    public void setJENUmk(String jENUmk) {
        set(PROPERTY_JENUMK, jENUmk);
    }

    public Budget getGbgBudget() {
        return (Budget) get(PROPERTY_GBGBUDGET);
    }

    public void setGbgBudget(Budget gbgBudget) {
        set(PROPERTY_GBGBUDGET, gbgBudget);
    }

    public GnvMasterDataDireksi getGnvMasterDatadireksi() {
        return (GnvMasterDataDireksi) get(PROPERTY_GNVMASTERDATADIREKSI);
    }

    public void setGnvMasterDatadireksi(GnvMasterDataDireksi gnvMasterDatadireksi) {
        set(PROPERTY_GNVMASTERDATADIREKSI, gnvMasterDatadireksi);
    }

    public GmmMasterDepartment getGmmMasterDepartment() {
        return (GmmMasterDepartment) get(PROPERTY_GMMMASTERDEPARTMENT);
    }

    public void setGmmMasterDepartment(GmmMasterDepartment gmmMasterDepartment) {
        set(PROPERTY_GMMMASTERDEPARTMENT, gmmMasterDepartment);
    }

    public Boolean isBTNReactive() {
        return (Boolean) get(PROPERTY_BTNREACTIVE);
    }

    public void setBTNReactive(Boolean bTNReactive) {
        set(PROPERTY_BTNREACTIVE, bTNReactive);
    }

    @SuppressWarnings("unchecked")
    public List<FIN_Payment> getFINPaymentEMGumkUmkIDList() {
      return (List<FIN_Payment>) get(PROPERTY_FINPAYMENTEMGUMKUMKIDLIST);
    }

    public void setFINPaymentEMGumkUmkIDList(List<FIN_Payment> fINPaymentEMGumkUmkIDList) {
        set(PROPERTY_FINPAYMENTEMGUMKUMKIDLIST, fINPaymentEMGumkUmkIDList);
    }

    @SuppressWarnings("unchecked")
    public List<GumkRealisasi> getGumkRealisasiList() {
      return (List<GumkRealisasi>) get(PROPERTY_GUMKREALISASILIST);
    }

    public void setGumkRealisasiList(List<GumkRealisasi> gumkRealisasiList) {
        set(PROPERTY_GUMKREALISASILIST, gumkRealisasiList);
    }

}
