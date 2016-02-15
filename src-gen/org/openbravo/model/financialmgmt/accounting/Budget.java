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
package org.openbravo.model.financialmgmt.accounting;

import com.gai.budget.data.GBGRequisitionV;
import com.gai.budget.data.GbgAdditionalBudget;
import com.gai.module.master.data.GmmMasterDepartment;
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
import org.openbravo.model.dataimport.BudgetLine;
import org.openbravo.model.financialmgmt.calendar.Year;
import org.openbravo.model.procurement.Requisition;
/**
 * Entity class for entity FinancialMgmtBudget (stored in table C_Budget).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Budget extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Budget";
    public static final String ENTITY_NAME = "FinancialMgmtBudget";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_YEAR = "year";
    public static final String PROPERTY_COPYBUDGET = "copyBudget";
    public static final String PROPERTY_BUDGETTYPE = "budgetType";
    public static final String PROPERTY_EXPORTTOEXCEL = "exportToExcel";
    public static final String PROPERTY_EXPORTACTUALDATA = "exportActualData";
    public static final String PROPERTY_PROCESS = "process";
    public static final String PROPERTY_GBGBUDGETAMT = "gbgBudgetamt";
    public static final String PROPERTY_GBGACTUALAMT = "gbgActualamt";
    public static final String PROPERTY_GBGESTIMASIAMT = "gbgEstimasiamt";
    public static final String PROPERTY_GBGAVAILABLEAMT = "gbgAvailableamt";
    public static final String PROPERTY_GBGADDITIONALBUDGET = "gbgAdditionalbudget";
    public static final String PROPERTY_GBGSAVED = "gbgSaved";
    public static final String PROPERTY_GBGDOCSTATUS = "gbgDocstatus";
    public static final String PROPERTY_GBGBTNAPPROVE = "gbgBtnapprove";
    public static final String PROPERTY_GMMMASTERDEPARTMENT = "gmmMasterDepartment";
    public static final String PROPERTY_DATAIMPORTBUDGETLINELIST = "dataImportBudgetLineList";
    public static final String PROPERTY_FINANCIALMGMTBUDGETLINELIST = "financialMgmtBudgetLineList";
    public static final String PROPERTY_GBGADDITIONALBUDGETLIST = "gBGAdditionalBudgetList";
    public static final String PROPERTY_GBGREQUISITIONVLIST = "gBGRequisitionVList";
    public static final String PROPERTY_PROCUREMENTREQUISITIONEMGBGBUDGETIDLIST = "procurementRequisitionEMGbgBudgetIDList";
    public static final String PROPERTY_GUMKUMKEMGBGBUDGETIDLIST = "gumkUmkEMGbgBudgetIDList";

    public Budget() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_COPYBUDGET, false);
        setDefaultValue(PROPERTY_BUDGETTYPE, "F");
        setDefaultValue(PROPERTY_EXPORTTOEXCEL, false);
        setDefaultValue(PROPERTY_EXPORTACTUALDATA, false);
        setDefaultValue(PROPERTY_PROCESS, false);
        setDefaultValue(PROPERTY_GBGBUDGETAMT, new BigDecimal(0));
        setDefaultValue(PROPERTY_GBGACTUALAMT, new BigDecimal(0));
        setDefaultValue(PROPERTY_GBGESTIMASIAMT, new BigDecimal(0));
        setDefaultValue(PROPERTY_GBGAVAILABLEAMT, new BigDecimal(0));
        setDefaultValue(PROPERTY_GBGADDITIONALBUDGET, false);
        setDefaultValue(PROPERTY_GBGSAVED, false);
        setDefaultValue(PROPERTY_GBGBTNAPPROVE, false);
        setDefaultValue(PROPERTY_DATAIMPORTBUDGETLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_FINANCIALMGMTBUDGETLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GBGADDITIONALBUDGETLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GBGREQUISITIONVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PROCUREMENTREQUISITIONEMGBGBUDGETIDLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GUMKUMKEMGBGBUDGETIDLIST, new ArrayList<Object>());
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

    public String getName() {
        return (String) get(PROPERTY_NAME);
    }

    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public Year getYear() {
        return (Year) get(PROPERTY_YEAR);
    }

    public void setYear(Year year) {
        set(PROPERTY_YEAR, year);
    }

    public Boolean isCopyBudget() {
        return (Boolean) get(PROPERTY_COPYBUDGET);
    }

    public void setCopyBudget(Boolean copyBudget) {
        set(PROPERTY_COPYBUDGET, copyBudget);
    }

    public String getBudgetType() {
        return (String) get(PROPERTY_BUDGETTYPE);
    }

    public void setBudgetType(String budgetType) {
        set(PROPERTY_BUDGETTYPE, budgetType);
    }

    public Boolean isExportToExcel() {
        return (Boolean) get(PROPERTY_EXPORTTOEXCEL);
    }

    public void setExportToExcel(Boolean exportToExcel) {
        set(PROPERTY_EXPORTTOEXCEL, exportToExcel);
    }

    public Boolean isExportActualData() {
        return (Boolean) get(PROPERTY_EXPORTACTUALDATA);
    }

    public void setExportActualData(Boolean exportActualData) {
        set(PROPERTY_EXPORTACTUALDATA, exportActualData);
    }

    public Boolean isProcess() {
        return (Boolean) get(PROPERTY_PROCESS);
    }

    public void setProcess(Boolean process) {
        set(PROPERTY_PROCESS, process);
    }

    public BigDecimal getGbgBudgetamt() {
        return (BigDecimal) get(PROPERTY_GBGBUDGETAMT);
    }

    public void setGbgBudgetamt(BigDecimal gbgBudgetamt) {
        set(PROPERTY_GBGBUDGETAMT, gbgBudgetamt);
    }

    public BigDecimal getGbgActualamt() {
        return (BigDecimal) get(PROPERTY_GBGACTUALAMT);
    }

    public void setGbgActualamt(BigDecimal gbgActualamt) {
        set(PROPERTY_GBGACTUALAMT, gbgActualamt);
    }

    public BigDecimal getGbgEstimasiamt() {
        return (BigDecimal) get(PROPERTY_GBGESTIMASIAMT);
    }

    public void setGbgEstimasiamt(BigDecimal gbgEstimasiamt) {
        set(PROPERTY_GBGESTIMASIAMT, gbgEstimasiamt);
    }

    public BigDecimal getGbgAvailableamt() {
        return (BigDecimal) get(PROPERTY_GBGAVAILABLEAMT);
    }

    public void setGbgAvailableamt(BigDecimal gbgAvailableamt) {
        set(PROPERTY_GBGAVAILABLEAMT, gbgAvailableamt);
    }

    public Boolean isGbgAdditionalbudget() {
        return (Boolean) get(PROPERTY_GBGADDITIONALBUDGET);
    }

    public void setGbgAdditionalbudget(Boolean gbgAdditionalbudget) {
        set(PROPERTY_GBGADDITIONALBUDGET, gbgAdditionalbudget);
    }

    public Boolean isGbgSaved() {
        return (Boolean) get(PROPERTY_GBGSAVED);
    }

    public void setGbgSaved(Boolean gbgSaved) {
        set(PROPERTY_GBGSAVED, gbgSaved);
    }

    public String getGbgDocstatus() {
        return (String) get(PROPERTY_GBGDOCSTATUS);
    }

    public void setGbgDocstatus(String gbgDocstatus) {
        set(PROPERTY_GBGDOCSTATUS, gbgDocstatus);
    }

    public Boolean isGbgBtnapprove() {
        return (Boolean) get(PROPERTY_GBGBTNAPPROVE);
    }

    public void setGbgBtnapprove(Boolean gbgBtnapprove) {
        set(PROPERTY_GBGBTNAPPROVE, gbgBtnapprove);
    }

    public GmmMasterDepartment getGmmMasterDepartment() {
        return (GmmMasterDepartment) get(PROPERTY_GMMMASTERDEPARTMENT);
    }

    public void setGmmMasterDepartment(GmmMasterDepartment gmmMasterDepartment) {
        set(PROPERTY_GMMMASTERDEPARTMENT, gmmMasterDepartment);
    }

    @SuppressWarnings("unchecked")
    public List<BudgetLine> getDataImportBudgetLineList() {
      return (List<BudgetLine>) get(PROPERTY_DATAIMPORTBUDGETLINELIST);
    }

    public void setDataImportBudgetLineList(List<BudgetLine> dataImportBudgetLineList) {
        set(PROPERTY_DATAIMPORTBUDGETLINELIST, dataImportBudgetLineList);
    }

    @SuppressWarnings("unchecked")
    public List<org.openbravo.model.financialmgmt.accounting.BudgetLine> getFinancialMgmtBudgetLineList() {
      return (List<org.openbravo.model.financialmgmt.accounting.BudgetLine>) get(PROPERTY_FINANCIALMGMTBUDGETLINELIST);
    }

    public void setFinancialMgmtBudgetLineList(List<org.openbravo.model.financialmgmt.accounting.BudgetLine> financialMgmtBudgetLineList) {
        set(PROPERTY_FINANCIALMGMTBUDGETLINELIST, financialMgmtBudgetLineList);
    }

    @SuppressWarnings("unchecked")
    public List<GbgAdditionalBudget> getGBGAdditionalBudgetList() {
      return (List<GbgAdditionalBudget>) get(PROPERTY_GBGADDITIONALBUDGETLIST);
    }

    public void setGBGAdditionalBudgetList(List<GbgAdditionalBudget> gBGAdditionalBudgetList) {
        set(PROPERTY_GBGADDITIONALBUDGETLIST, gBGAdditionalBudgetList);
    }

    @SuppressWarnings("unchecked")
    public List<GBGRequisitionV> getGBGRequisitionVList() {
      return (List<GBGRequisitionV>) get(PROPERTY_GBGREQUISITIONVLIST);
    }

    public void setGBGRequisitionVList(List<GBGRequisitionV> gBGRequisitionVList) {
        set(PROPERTY_GBGREQUISITIONVLIST, gBGRequisitionVList);
    }

    @SuppressWarnings("unchecked")
    public List<Requisition> getProcurementRequisitionEMGbgBudgetIDList() {
      return (List<Requisition>) get(PROPERTY_PROCUREMENTREQUISITIONEMGBGBUDGETIDLIST);
    }

    public void setProcurementRequisitionEMGbgBudgetIDList(List<Requisition> procurementRequisitionEMGbgBudgetIDList) {
        set(PROPERTY_PROCUREMENTREQUISITIONEMGBGBUDGETIDLIST, procurementRequisitionEMGbgBudgetIDList);
    }

    @SuppressWarnings("unchecked")
    public List<GumkUmk> getGumkUmkEMGbgBudgetIDList() {
      return (List<GumkUmk>) get(PROPERTY_GUMKUMKEMGBGBUDGETIDLIST);
    }

    public void setGumkUmkEMGbgBudgetIDList(List<GumkUmk> gumkUmkEMGbgBudgetIDList) {
        set(PROPERTY_GUMKUMKEMGBGBUDGETIDLIST, gumkUmkEMGbgBudgetIDList);
    }

}
