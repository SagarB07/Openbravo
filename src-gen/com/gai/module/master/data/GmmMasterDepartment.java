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
package com.gai.module.master.data;

import com.gai.asset.data.GasHistoricalAsset;
import com.gai.procurement.persetujuan.data.GppPerspembelian;
import com.gai.umk.data.GumkUmk;

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
import org.openbravo.model.financialmgmt.accounting.Budget;
import org.openbravo.model.financialmgmt.assetmgmt.Asset;
import org.openbravo.model.procurement.Requisition;
/**
 * Entity class for entity GMM_MASTER_DEPARTMENT (stored in table GMM_MASTER_DEPARTMENT).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GmmMasterDepartment extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GMM_MASTER_DEPARTMENT";
    public static final String ENTITY_NAME = "GMM_MASTER_DEPARTMENT";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_DEPARTMENT = "department";
    public static final String PROPERTY_DEPARTMENTHEAD = "departmentHead";
    public static final String PROPERTY_USER = "user";
    public static final String PROPERTY_ADUSEREMGMMMASTERDEPARTMENTIDLIST = "aDUserEMGmmMasterDepartmentIDList";
    public static final String PROPERTY_FINANCIALMGMTASSETEMGMMMASTERDEPARTMENTIDLIST = "financialMgmtAssetEMGmmMasterDepartmentIDList";
    public static final String PROPERTY_FINANCIALMGMTBUDGETEMGMMMASTERDEPARTMENTIDLIST = "financialMgmtBudgetEMGmmMasterDepartmentIDList";
    public static final String PROPERTY_GASHISTORICALASSETEMGMMMASTERDEPARTMENTIDLIST = "gASHISTORICALASSETEMGmmMasterDepartmentIDList";
    public static final String PROPERTY_GPPPERSPEMBELIANEMGMMMASTERDEPTIDLIST = "gPPPERSPEMBELIANEMGmmMasterDeptIDList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGMMMASTERDEPARTMENTIDLIST = "procurementRequisitionEMGmmMasterDepartmentIDList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGMMDIPERIKASIDLIST = "procurementRequisitionEMGmmDiperikasIDList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUIIDLIST = "procurementRequisitionEMGmmDisetujuiIDList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI2IDLIST = "procurementRequisitionEMGmmDisetujui2IDList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI3IDLIST = "procurementRequisitionEMGmmDisetujui3IDList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI4IDLIST = "procurementRequisitionEMGmmDisetujui4IDList";
    public static final String PROPERTY_GUMKUMKEMGMMMASTERDEPARTMENTIDLIST = "gumkUmkEMGmmMasterDepartmentIDList";

    public GmmMasterDepartment() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_ADUSEREMGMMMASTERDEPARTMENTIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTASSETEMGMMMASTERDEPARTMENTIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTBUDGETEMGMMMASTERDEPARTMENTIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GASHISTORICALASSETEMGMMMASTERDEPARTMENTIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GPPPERSPEMBELIANEMGMMMASTERDEPTIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGMMMASTERDEPARTMENTIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGMMDIPERIKASIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUIIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI2IDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI3IDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI4IDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GUMKUMKEMGMMMASTERDEPARTMENTIDLIST, new ArrayList<Object>());
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

    public String getDepartment() {
        return (String) get(PROPERTY_DEPARTMENT);
    }

    public void setDepartment(String department) {
        set(PROPERTY_DEPARTMENT, department);
    }

    public String getDepartmentHead() {
        return (String) get(PROPERTY_DEPARTMENTHEAD);
    }

    public void setDepartmentHead(String departmentHead) {
        set(PROPERTY_DEPARTMENTHEAD, departmentHead);
    }

    public User getUser() {
        return (User) get(PROPERTY_USER);
    }

    public void setUser(User user) {
        set(PROPERTY_USER, user);
    }

    @SuppressWarnings("unchecked")
    public List<User> getADUserEMGmmMasterDepartmentIDList() {
      return (List<User>) get(PROPERTY_ADUSEREMGMMMASTERDEPARTMENTIDLIST);
    }

    public void setADUserEMGmmMasterDepartmentIDList(List<User> aDUserEMGmmMasterDepartmentIDList) {
        set(PROPERTY_ADUSEREMGMMMASTERDEPARTMENTIDLIST, aDUserEMGmmMasterDepartmentIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Asset> getFinancialMgmtAssetEMGmmMasterDepartmentIDList() {
      return (List<Asset>) get(PROPERTY_FINANCIALMGMTASSETEMGMMMASTERDEPARTMENTIDLIST);
    }

    public void setFinancialMgmtAssetEMGmmMasterDepartmentIDList(List<Asset> financialMgmtAssetEMGmmMasterDepartmentIDList) {
        set(PROPERTY_FINANCIALMGMTASSETEMGMMMASTERDEPARTMENTIDLIST, financialMgmtAssetEMGmmMasterDepartmentIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Budget> getFinancialMgmtBudgetEMGmmMasterDepartmentIDList() {
      return (List<Budget>) get(PROPERTY_FINANCIALMGMTBUDGETEMGMMMASTERDEPARTMENTIDLIST);
    }

    public void setFinancialMgmtBudgetEMGmmMasterDepartmentIDList(List<Budget> financialMgmtBudgetEMGmmMasterDepartmentIDList) {
        set(PROPERTY_FINANCIALMGMTBUDGETEMGMMMASTERDEPARTMENTIDLIST, financialMgmtBudgetEMGmmMasterDepartmentIDList);
    }

    @SuppressWarnings("unchecked")
    public List<GasHistoricalAsset> getGASHISTORICALASSETEMGmmMasterDepartmentIDList() {
      return (List<GasHistoricalAsset>) get(PROPERTY_GASHISTORICALASSETEMGMMMASTERDEPARTMENTIDLIST);
    }

    public void setGASHISTORICALASSETEMGmmMasterDepartmentIDList(List<GasHistoricalAsset> gASHISTORICALASSETEMGmmMasterDepartmentIDList) {
        set(PROPERTY_GASHISTORICALASSETEMGMMMASTERDEPARTMENTIDLIST, gASHISTORICALASSETEMGmmMasterDepartmentIDList);
    }

    @SuppressWarnings("unchecked")
    public List<GppPerspembelian> getGPPPERSPEMBELIANEMGmmMasterDeptIDList() {
      return (List<GppPerspembelian>) get(PROPERTY_GPPPERSPEMBELIANEMGMMMASTERDEPTIDLIST);
    }

    public void setGPPPERSPEMBELIANEMGmmMasterDeptIDList(List<GppPerspembelian> gPPPERSPEMBELIANEMGmmMasterDeptIDList) {
        set(PROPERTY_GPPPERSPEMBELIANEMGMMMASTERDEPTIDLIST, gPPPERSPEMBELIANEMGmmMasterDeptIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGmmMasterDepartmentIDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGMMMASTERDEPARTMENTIDLIST);
    }

    public void setProcurementRequisitionEMGmmMasterDepartmentIDList(List<Requisition> procurementRequisitionEMGmmMasterDepartmentIDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGMMMASTERDEPARTMENTIDLIST, procurementRequisitionEMGmmMasterDepartmentIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGmmDiperikasIDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGMMDIPERIKASIDLIST);
    }

    public void setProcurementRequisitionEMGmmDiperikasIDList(List<Requisition> procurementRequisitionEMGmmDiperikasIDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGMMDIPERIKASIDLIST, procurementRequisitionEMGmmDiperikasIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGmmDisetujuiIDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUIIDLIST);
    }

    public void setProcurementRequisitionEMGmmDisetujuiIDList(List<Requisition> procurementRequisitionEMGmmDisetujuiIDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUIIDLIST, procurementRequisitionEMGmmDisetujuiIDList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGmmDisetujui2IDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI2IDLIST);
    }

    public void setProcurementRequisitionEMGmmDisetujui2IDList(List<Requisition> procurementRequisitionEMGmmDisetujui2IDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI2IDLIST, procurementRequisitionEMGmmDisetujui2IDList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGmmDisetujui3IDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI3IDLIST);
    }

    public void setProcurementRequisitionEMGmmDisetujui3IDList(List<Requisition> procurementRequisitionEMGmmDisetujui3IDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI3IDLIST, procurementRequisitionEMGmmDisetujui3IDList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGmmDisetujui4IDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI4IDLIST);
    }

    public void setProcurementRequisitionEMGmmDisetujui4IDList(List<Requisition> procurementRequisitionEMGmmDisetujui4IDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGMMDISETUJUI4IDLIST, procurementRequisitionEMGmmDisetujui4IDList);
    }

    @SuppressWarnings("unchecked")
    public List<GumkUmk> getGumkUmkEMGmmMasterDepartmentIDList() {
      return (List<GumkUmk>) get(PROPERTY_GUMKUMKEMGMMMASTERDEPARTMENTIDLIST);
    }

    public void setGumkUmkEMGmmMasterDepartmentIDList(List<GumkUmk> gumkUmkEMGmmMasterDepartmentIDList) {
        set(PROPERTY_GUMKUMKEMGMMMASTERDEPARTMENTIDLIST, gumkUmkEMGmmMasterDepartmentIDList);
    }

}
