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
package org.openbravo.model.procurement;

import com.gai.budget.data.GBGRequisitionV;
import com.gai.investasi.data.GnvMasterDataDireksi;
import com.gai.module.master.data.GmmMasterDepartment;
import com.gai.module.master.data.GmmMetodePembelian;
import com.gai.procurement.persetujuan.data.GppPerspembelian;

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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.Budget;
import org.openbravo.model.pricing.pricelist.PriceList;
/**
 * Entity class for entity ProcurementRequisition (stored in table M_Requisition).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Requisition extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Requisition";
    public static final String ENTITY_NAME = "ProcurementRequisition";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_DOCUMENTNO = "documentNo";
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";
    public static final String PROPERTY_PRICELIST = "priceList";
    public static final String PROPERTY_CURRENCY = "currency";
    public static final String PROPERTY_CREATEPO = "createPO";
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";
    public static final String PROPERTY_DOCUMENTACTION = "documentAction";
    public static final String PROPERTY_PROCESSED = "processed";
    public static final String PROPERTY_USERCONTACT = "userContact";
    public static final String PROPERTY_PROCESSNOW = "processNow";
    public static final String PROPERTY_GBGBUDGET = "gbgBudget";
    public static final String PROPERTY_GNVMASTERDATADIREKSI = "gnvMasterDatadireksi";
    public static final String PROPERTY_GNVMASTERDATADIREKSI2 = "gnvMasterDatadireksi2";
    public static final String PROPERTY_GNVMASTERDATADIREKSI3 = "gnvMasterDatadireksi3";
    public static final String PROPERTY_GMMMETODEPEMBELIAN = "gmmMetodepembelian";
    public static final String PROPERTY_GMMMASTERDEPARTMENT = "gmmMasterDepartment";
    public static final String PROPERTY_GMMDIPERIKAS = "gmmDiperikas";
    public static final String PROPERTY_GMMDISETUJUI = "gmmDisetujui";
    public static final String PROPERTY_GMMDISETUJUI2 = "gmmDisetujui2";
    public static final String PROPERTY_GMMDISETUJUI3 = "gmmDisetujui3";
    public static final String PROPERTY_GMMDISETUJUI4 = "gmmDisetujui4";
    public static final String PROPERTY_GPPPERSETUJUAN = "gppPersetujuan";
    public static final String PROPERTY_GPPBTNPERSETUJUAN = "gppBtnpersetujuan";
    public static final String PROPERTY_GPRNOMORPENAWARAN = "gprNomorpenawaran";
    public static final String PROPERTY_GPRTANGGALPENAWARAN = "gprTanggalpenawaran";
    public static final String PROPERTY_GPRPERIHAL = "gprPerihal";
    public static final String PROPERTY_GRQRECEIVESTATUS = "grqReceivestatus";
    public static final String PROPERTY_GRQBTNRECEIVE = "grqBtnreceive";
    public static final String PROPERTY_GPRBTNREVISI = "gprBtnrevisi";
    public static final String PROPERTY_GPRNOFILLING = "gprNofilling";
    public static final String PROPERTY_GBGREQUISITIONVLIST = "gBGRequisitionVList";
    public static final String PROPERTY_GPPPERSPEMBELIANLIST = "gPPPERSPEMBELIANList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONLINELIST = "procurementRequisitionLineList";

    public Requisition() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_CREATEPO, false);
        setDefaultValue(PROPERTY_DOCUMENTSTATUS, "DR");
        setDefaultValue(PROPERTY_DOCUMENTACTION, "CO");
        setDefaultValue(PROPERTY_PROCESSED, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_GPPPERSETUJUAN, false);
        setDefaultValue(PROPERTY_GPPBTNPERSETUJUAN, false);
        setDefaultValue(PROPERTY_GRQRECEIVESTATUS, "NR");
        setDefaultValue(PROPERTY_GRQBTNRECEIVE, false);
        setDefaultValue(PROPERTY_GPRBTNREVISI, false);
        setDefaultValue(PROPERTY_GBGREQUISITIONVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GPPPERSPEMBELIANLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONLINELIST, new ArrayList<Object>());
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

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }

    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }

    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    public PriceList getPriceList() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }

    public void setPriceList(PriceList priceList) {
        set(PROPERTY_PRICELIST, priceList);
    }

    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }

    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    public Boolean isCreatePO() {
        return (Boolean) get(PROPERTY_CREATEPO);
    }

    public void setCreatePO(Boolean createPO) {
        set(PROPERTY_CREATEPO, createPO);
    }

    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }

    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    public String getDocumentAction() {
        return (String) get(PROPERTY_DOCUMENTACTION);
    }

    public void setDocumentAction(String documentAction) {
        set(PROPERTY_DOCUMENTACTION, documentAction);
    }

    public Boolean isProcessed() {
        return (Boolean) get(PROPERTY_PROCESSED);
    }

    public void setProcessed(Boolean processed) {
        set(PROPERTY_PROCESSED, processed);
    }

    public User getUserContact() {
        return (User) get(PROPERTY_USERCONTACT);
    }

    public void setUserContact(User userContact) {
        set(PROPERTY_USERCONTACT, userContact);
    }

    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }

    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
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

    public GnvMasterDataDireksi getGnvMasterDatadireksi2() {
        return (GnvMasterDataDireksi) get(PROPERTY_GNVMASTERDATADIREKSI2);
    }

    public void setGnvMasterDatadireksi2(GnvMasterDataDireksi gnvMasterDatadireksi2) {
        set(PROPERTY_GNVMASTERDATADIREKSI2, gnvMasterDatadireksi2);
    }

    public GnvMasterDataDireksi getGnvMasterDatadireksi3() {
        return (GnvMasterDataDireksi) get(PROPERTY_GNVMASTERDATADIREKSI3);
    }

    public void setGnvMasterDatadireksi3(GnvMasterDataDireksi gnvMasterDatadireksi3) {
        set(PROPERTY_GNVMASTERDATADIREKSI3, gnvMasterDatadireksi3);
    }

    public GmmMetodePembelian getGmmMetodepembelian() {
        return (GmmMetodePembelian) get(PROPERTY_GMMMETODEPEMBELIAN);
    }

    public void setGmmMetodepembelian(GmmMetodePembelian gmmMetodepembelian) {
        set(PROPERTY_GMMMETODEPEMBELIAN, gmmMetodepembelian);
    }

    public GmmMasterDepartment getGmmMasterDepartment() {
        return (GmmMasterDepartment) get(PROPERTY_GMMMASTERDEPARTMENT);
    }

    public void setGmmMasterDepartment(GmmMasterDepartment gmmMasterDepartment) {
        set(PROPERTY_GMMMASTERDEPARTMENT, gmmMasterDepartment);
    }

    public GmmMasterDepartment getGmmDiperikas() {
        return (GmmMasterDepartment) get(PROPERTY_GMMDIPERIKAS);
    }

    public void setGmmDiperikas(GmmMasterDepartment gmmDiperikas) {
        set(PROPERTY_GMMDIPERIKAS, gmmDiperikas);
    }

    public GmmMasterDepartment getGmmDisetujui() {
        return (GmmMasterDepartment) get(PROPERTY_GMMDISETUJUI);
    }

    public void setGmmDisetujui(GmmMasterDepartment gmmDisetujui) {
        set(PROPERTY_GMMDISETUJUI, gmmDisetujui);
    }

    public GmmMasterDepartment getGmmDisetujui2() {
        return (GmmMasterDepartment) get(PROPERTY_GMMDISETUJUI2);
    }

    public void setGmmDisetujui2(GmmMasterDepartment gmmDisetujui2) {
        set(PROPERTY_GMMDISETUJUI2, gmmDisetujui2);
    }

    public GmmMasterDepartment getGmmDisetujui3() {
        return (GmmMasterDepartment) get(PROPERTY_GMMDISETUJUI3);
    }

    public void setGmmDisetujui3(GmmMasterDepartment gmmDisetujui3) {
        set(PROPERTY_GMMDISETUJUI3, gmmDisetujui3);
    }

    public GmmMasterDepartment getGmmDisetujui4() {
        return (GmmMasterDepartment) get(PROPERTY_GMMDISETUJUI4);
    }

    public void setGmmDisetujui4(GmmMasterDepartment gmmDisetujui4) {
        set(PROPERTY_GMMDISETUJUI4, gmmDisetujui4);
    }

    public Boolean isGppPersetujuan() {
        return (Boolean) get(PROPERTY_GPPPERSETUJUAN);
    }

    public void setGppPersetujuan(Boolean gppPersetujuan) {
        set(PROPERTY_GPPPERSETUJUAN, gppPersetujuan);
    }

    public Boolean isGppBtnpersetujuan() {
        return (Boolean) get(PROPERTY_GPPBTNPERSETUJUAN);
    }

    public void setGppBtnpersetujuan(Boolean gppBtnpersetujuan) {
        set(PROPERTY_GPPBTNPERSETUJUAN, gppBtnpersetujuan);
    }

    public String getGprNomorpenawaran() {
        return (String) get(PROPERTY_GPRNOMORPENAWARAN);
    }

    public void setGprNomorpenawaran(String gprNomorpenawaran) {
        set(PROPERTY_GPRNOMORPENAWARAN, gprNomorpenawaran);
    }

    public Date getGprTanggalpenawaran() {
        return (Date) get(PROPERTY_GPRTANGGALPENAWARAN);
    }

    public void setGprTanggalpenawaran(Date gprTanggalpenawaran) {
        set(PROPERTY_GPRTANGGALPENAWARAN, gprTanggalpenawaran);
    }

    public String getGprPerihal() {
        return (String) get(PROPERTY_GPRPERIHAL);
    }

    public void setGprPerihal(String gprPerihal) {
        set(PROPERTY_GPRPERIHAL, gprPerihal);
    }

    public String getGrqReceivestatus() {
        return (String) get(PROPERTY_GRQRECEIVESTATUS);
    }

    public void setGrqReceivestatus(String grqReceivestatus) {
        set(PROPERTY_GRQRECEIVESTATUS, grqReceivestatus);
    }

    public Boolean isGrqBtnreceive() {
        return (Boolean) get(PROPERTY_GRQBTNRECEIVE);
    }

    public void setGrqBtnreceive(Boolean grqBtnreceive) {
        set(PROPERTY_GRQBTNRECEIVE, grqBtnreceive);
    }

    public Boolean isGprBtnrevisi() {
        return (Boolean) get(PROPERTY_GPRBTNREVISI);
    }

    public void setGprBtnrevisi(Boolean gprBtnrevisi) {
        set(PROPERTY_GPRBTNREVISI, gprBtnrevisi);
    }

    public String getGprNofilling() {
        return (String) get(PROPERTY_GPRNOFILLING);
    }

    public void setGprNofilling(String gprNofilling) {
        set(PROPERTY_GPRNOFILLING, gprNofilling);
    }

    @SuppressWarnings("unchecked")
    public List<GBGRequisitionV> getGBGRequisitionVList() {
      return (List<GBGRequisitionV>) get(PROPERTY_GBGREQUISITIONVLIST);
    }

    public void setGBGRequisitionVList(List<GBGRequisitionV> gBGRequisitionVList) {
        set(PROPERTY_GBGREQUISITIONVLIST, gBGRequisitionVList);
    }

    @SuppressWarnings("unchecked")
    public List<GppPerspembelian> getGPPPERSPEMBELIANList() {
      return (List<GppPerspembelian>) get(PROPERTY_GPPPERSPEMBELIANLIST);
    }

    public void setGPPPERSPEMBELIANList(List<GppPerspembelian> gPPPERSPEMBELIANList) {
        set(PROPERTY_GPPPERSPEMBELIANLIST, gPPPERSPEMBELIANList);
    }

    @SuppressWarnings("unchecked")
    public List<RequisitionLine> getProcurementRequisitionLineList() {
      return (List<RequisitionLine>) get(PROPERTY_PROCUREMENTREQUISITIONLINELIST);
    }

    public void setProcurementRequisitionLineList(List<RequisitionLine> procurementRequisitionLineList) {
        set(PROPERTY_PROCUREMENTREQUISITIONLINELIST, procurementRequisitionLineList);
    }

}
