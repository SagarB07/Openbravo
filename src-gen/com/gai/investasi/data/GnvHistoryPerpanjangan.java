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
package com.gai.investasi.data;

import com.gai.module.master.data.GmmMaster_StatusBank;

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity GNV_HISTORY_PERPANJANGAN (stored in table GNV_HISTORY_PERPANJANGAN).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GnvHistoryPerpanjangan extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GNV_HISTORY_PERPANJANGAN";
    public static final String ENTITY_NAME = "GNV_HISTORY_PERPANJANGAN";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_LINENO = "lineno";
    public static final String PROPERTY_NOBILYET = "nobilyet";
    public static final String PROPERTY_TANGGALAWAL = "tanggalawal";
    public static final String PROPERTY_TANGGALAKHIR = "tanggalakhir";
    public static final String PROPERTY_AMOUNT = "amount";
    public static final String PROPERTY_RATE = "rate";
    public static final String PROPERTY_CURRENCY = "currency";
    public static final String PROPERTY_DOCUMENTNO = "documentno";
    public static final String PROPERTY_PERIHAL = "perihal";
    public static final String PROPERTY_BPARTNER = "bpartner";
    public static final String PROPERTY_CAR = "car";
    public static final String PROPERTY_NPL = "npl";
    public static final String PROPERTY_LDR = "ldr";
    public static final String PROPERTY_BI = "bi";
    public static final String PROPERTY_LPS = "lps";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_KESIMPULAN = "kesimpulan";
    public static final String PROPERTY_GNVTYPEINVESTASI = "gNVTypeinvestasi";
    public static final String PROPERTY_TOTALASSET = "totalasset";
    public static final String PROPERTY_KESIMPULANRASIO = "kesimpulanrasio";
    public static final String PROPERTY_STATUSKEPEMILIKAN = "statuskepemilikan";
    public static final String PROPERTY_RASIOKEUANGAN = "rasiokeuangan";
    public static final String PROPERTY_STATUSINVESTASI = "statusinvestasi";
    public static final String PROPERTY_GNVINVESTASILINE = "gNVInvestasiLine";
    public static final String PROPERTY_STATUSAPPROVED = "statusapproved";
    public static final String PROPERTY_NOMORSURAT = "nomorsurat";
    public static final String PROPERTY_GMMMASTERSTATUSBANK = "gmmMasterStatusbank";

    public GnvHistoryPerpanjangan() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
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

    public BigDecimal getLineno() {
        return (BigDecimal) get(PROPERTY_LINENO);
    }

    public void setLineno(BigDecimal lineno) {
        set(PROPERTY_LINENO, lineno);
    }

    public String getNobilyet() {
        return (String) get(PROPERTY_NOBILYET);
    }

    public void setNobilyet(String nobilyet) {
        set(PROPERTY_NOBILYET, nobilyet);
    }

    public Date getTanggalawal() {
        return (Date) get(PROPERTY_TANGGALAWAL);
    }

    public void setTanggalawal(Date tanggalawal) {
        set(PROPERTY_TANGGALAWAL, tanggalawal);
    }

    public Date getTanggalakhir() {
        return (Date) get(PROPERTY_TANGGALAKHIR);
    }

    public void setTanggalakhir(Date tanggalakhir) {
        set(PROPERTY_TANGGALAKHIR, tanggalakhir);
    }

    public BigDecimal getAmount() {
        return (BigDecimal) get(PROPERTY_AMOUNT);
    }

    public void setAmount(BigDecimal amount) {
        set(PROPERTY_AMOUNT, amount);
    }

    public BigDecimal getRate() {
        return (BigDecimal) get(PROPERTY_RATE);
    }

    public void setRate(BigDecimal rate) {
        set(PROPERTY_RATE, rate);
    }

    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }

    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    public String getDocumentno() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }

    public void setDocumentno(String documentno) {
        set(PROPERTY_DOCUMENTNO, documentno);
    }

    public String getPerihal() {
        return (String) get(PROPERTY_PERIHAL);
    }

    public void setPerihal(String perihal) {
        set(PROPERTY_PERIHAL, perihal);
    }

    public BusinessPartner getBpartner() {
        return (BusinessPartner) get(PROPERTY_BPARTNER);
    }

    public void setBpartner(BusinessPartner bpartner) {
        set(PROPERTY_BPARTNER, bpartner);
    }

    public BigDecimal getCar() {
        return (BigDecimal) get(PROPERTY_CAR);
    }

    public void setCar(BigDecimal car) {
        set(PROPERTY_CAR, car);
    }

    public BigDecimal getNpl() {
        return (BigDecimal) get(PROPERTY_NPL);
    }

    public void setNpl(BigDecimal npl) {
        set(PROPERTY_NPL, npl);
    }

    public BigDecimal getLdr() {
        return (BigDecimal) get(PROPERTY_LDR);
    }

    public void setLdr(BigDecimal ldr) {
        set(PROPERTY_LDR, ldr);
    }

    public BigDecimal getBi() {
        return (BigDecimal) get(PROPERTY_BI);
    }

    public void setBi(BigDecimal bi) {
        set(PROPERTY_BI, bi);
    }

    public BigDecimal getLps() {
        return (BigDecimal) get(PROPERTY_LPS);
    }

    public void setLps(BigDecimal lps) {
        set(PROPERTY_LPS, lps);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public String getKesimpulan() {
        return (String) get(PROPERTY_KESIMPULAN);
    }

    public void setKesimpulan(String kesimpulan) {
        set(PROPERTY_KESIMPULAN, kesimpulan);
    }

    public GnvTypeInvestasi getGNVTypeinvestasi() {
        return (GnvTypeInvestasi) get(PROPERTY_GNVTYPEINVESTASI);
    }

    public void setGNVTypeinvestasi(GnvTypeInvestasi gNVTypeinvestasi) {
        set(PROPERTY_GNVTYPEINVESTASI, gNVTypeinvestasi);
    }

    public BigDecimal getTotalasset() {
        return (BigDecimal) get(PROPERTY_TOTALASSET);
    }

    public void setTotalasset(BigDecimal totalasset) {
        set(PROPERTY_TOTALASSET, totalasset);
    }

    public String getKesimpulanrasio() {
        return (String) get(PROPERTY_KESIMPULANRASIO);
    }

    public void setKesimpulanrasio(String kesimpulanrasio) {
        set(PROPERTY_KESIMPULANRASIO, kesimpulanrasio);
    }

    public String getStatuskepemilikan() {
        return (String) get(PROPERTY_STATUSKEPEMILIKAN);
    }

    public void setStatuskepemilikan(String statuskepemilikan) {
        set(PROPERTY_STATUSKEPEMILIKAN, statuskepemilikan);
    }

    public String getRasiokeuangan() {
        return (String) get(PROPERTY_RASIOKEUANGAN);
    }

    public void setRasiokeuangan(String rasiokeuangan) {
        set(PROPERTY_RASIOKEUANGAN, rasiokeuangan);
    }

    public String getStatusinvestasi() {
        return (String) get(PROPERTY_STATUSINVESTASI);
    }

    public void setStatusinvestasi(String statusinvestasi) {
        set(PROPERTY_STATUSINVESTASI, statusinvestasi);
    }

    public GnvInvestasiLine getGNVInvestasiLine() {
        return (GnvInvestasiLine) get(PROPERTY_GNVINVESTASILINE);
    }

    public void setGNVInvestasiLine(GnvInvestasiLine gNVInvestasiLine) {
        set(PROPERTY_GNVINVESTASILINE, gNVInvestasiLine);
    }

    public String getStatusapproved() {
        return (String) get(PROPERTY_STATUSAPPROVED);
    }

    public void setStatusapproved(String statusapproved) {
        set(PROPERTY_STATUSAPPROVED, statusapproved);
    }

    public String getNomorsurat() {
        return (String) get(PROPERTY_NOMORSURAT);
    }

    public void setNomorsurat(String nomorsurat) {
        set(PROPERTY_NOMORSURAT, nomorsurat);
    }

    public GmmMaster_StatusBank getGmmMasterStatusbank() {
        return (GmmMaster_StatusBank) get(PROPERTY_GMMMASTERSTATUSBANK);
    }

    public void setGmmMasterStatusbank(GmmMaster_StatusBank gmmMasterStatusbank) {
        set(PROPERTY_GMMMASTERSTATUSBANK, gmmMasterStatusbank);
    }

}
