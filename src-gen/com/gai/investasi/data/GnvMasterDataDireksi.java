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

import com.gai.umk.data.GumkUmk;

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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.procurement.Requisition;
/**
 * Entity class for entity GNV_Master_DataDireksi (stored in table GNV_Master_DataDireksi).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GnvMasterDataDireksi extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GNV_Master_DataDireksi";
    public static final String ENTITY_NAME = "GNV_Master_DataDireksi";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_LINENO = "lineNo";
    public static final String PROPERTY_NAMA = "nama";
    public static final String PROPERTY_JABATAN = "jabatan";
    public static final String PROPERTY_GNVINVESTASILINELIST = "gNVINVESTASILINEList";
    public static final String PROPERTY_GNVINVESTASILINEGNVMASTERDATADIREKSI2IDLIST = "gNVINVESTASILINEGNVMasterDatadireksi2IDList";
    public static final String PROPERTY_GNVINVESTASILINEGNVPENANDATANGANIDLIST = "gNVINVESTASILINEGNVPenandatanganIDList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSIIDLIST = "procurementRequisitionEMGnvMasterDatadireksiIDList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSI2IDLIST = "procurementRequisitionEMGnvMasterDatadireksi2IDList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSI3IDLIST = "procurementRequisitionEMGnvMasterDatadireksi3IDList";
    public static final String PROPERTY_GUMKUMKEMGNVMASTERDATADIREKSIIDLIST = "gumkUmkEMGnvMasterDatadireksiIDList";

    public GnvMasterDataDireksi() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_GNVINVESTASILINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GNVINVESTASILINEGNVMASTERDATADIREKSI2IDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GNVINVESTASILINEGNVPENANDATANGANIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSIIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSI2IDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSI3IDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GUMKUMKEMGNVMASTERDATADIREKSIIDLIST, new ArrayList<Object>());
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

    public BigDecimal getLineNo() {
        return (BigDecimal) get(PROPERTY_LINENO);
    }

    public void setLineNo(BigDecimal lineNo) {
        set(PROPERTY_LINENO, lineNo);
    }

    public String getNama() {
        return (String) get(PROPERTY_NAMA);
    }

    public void setNama(String nama) {
        set(PROPERTY_NAMA, nama);
    }

    public String getJabatan() {
        return (String) get(PROPERTY_JABATAN);
    }

    public void setJabatan(String jabatan) {
        set(PROPERTY_JABATAN, jabatan);
    }

    @SuppressWarnings("unchecked")
    public List<GnvInvestasiLine> getGNVINVESTASILINEList() {
      return (List<GnvInvestasiLine>) get(PROPERTY_GNVINVESTASILINELIST);
    }

    public void setGNVINVESTASILINEList(List<GnvInvestasiLine> gNVINVESTASILINEList) {
        set(PROPERTY_GNVINVESTASILINELIST, gNVINVESTASILINEList);
    }

    @SuppressWarnings("unchecked")
    public List<GnvInvestasiLine> getGNVINVESTASILINEGNVMasterDatadireksi2IDList() {
      return (List<GnvInvestasiLine>) get(PROPERTY_GNVINVESTASILINEGNVMASTERDATADIREKSI2IDLIST);
    }

    public void setGNVINVESTASILINEGNVMasterDatadireksi2IDList(List<GnvInvestasiLine> gNVINVESTASILINEGNVMasterDatadireksi2IDList) {
        set(PROPERTY_GNVINVESTASILINEGNVMASTERDATADIREKSI2IDLIST, gNVINVESTASILINEGNVMasterDatadireksi2IDList);
    }

    @SuppressWarnings("unchecked")
    public List<GnvInvestasiLine> getGNVINVESTASILINEGNVPenandatanganIDList() {
      return (List<GnvInvestasiLine>) get(PROPERTY_GNVINVESTASILINEGNVPENANDATANGANIDLIST);
    }

    public void setGNVINVESTASILINEGNVPenandatanganIDList(List<GnvInvestasiLine> gNVINVESTASILINEGNVPenandatanganIDList) {
        set(PROPERTY_GNVINVESTASILINEGNVPENANDATANGANIDLIST, gNVINVESTASILINEGNVPenandatanganIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGnvMasterDatadireksiIDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSIIDLIST);
    }

    public void setProcurementRequisitionEMGnvMasterDatadireksiIDList(List<Requisition> procurementRequisitionEMGnvMasterDatadireksiIDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSIIDLIST, procurementRequisitionEMGnvMasterDatadireksiIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGnvMasterDatadireksi2IDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSI2IDLIST);
    }

    public void setProcurementRequisitionEMGnvMasterDatadireksi2IDList(List<Requisition> procurementRequisitionEMGnvMasterDatadireksi2IDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSI2IDLIST, procurementRequisitionEMGnvMasterDatadireksi2IDList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGnvMasterDatadireksi3IDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSI3IDLIST);
    }

    public void setProcurementRequisitionEMGnvMasterDatadireksi3IDList(List<Requisition> procurementRequisitionEMGnvMasterDatadireksi3IDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGNVMASTERDATADIREKSI3IDLIST, procurementRequisitionEMGnvMasterDatadireksi3IDList);
    }

    @SuppressWarnings("unchecked")
    public List<GumkUmk> getGumkUmkEMGnvMasterDatadireksiIDList() {
      return (List<GumkUmk>) get(PROPERTY_GUMKUMKEMGNVMASTERDATADIREKSIIDLIST);
    }

    public void setGumkUmkEMGnvMasterDatadireksiIDList(List<GumkUmk> gumkUmkEMGnvMasterDatadireksiIDList) {
        set(PROPERTY_GUMKUMKEMGNVMASTERDATADIREKSIIDLIST, gumkUmkEMGnvMasterDatadireksiIDList);
    }

}
