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

import java.math.BigDecimal;
import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.calendar.Period;
/**
 * Entity class for entity GAI_WORKSHEET_V (stored in table GAI_WORKSHEET_V).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GAIWorksheetV extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GAI_WORKSHEET_V";
    public static final String ENTITY_NAME = "GAI_WORKSHEET_V";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_KODEKPS = "kodeKPS";
    public static final String PROPERTY_PERIOD = "period";
    public static final String PROPERTY_DATETRANSACTION = "dateTransaction";
    public static final String PROPERTY_DOCUMENTNO = "documentNo";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_REFERENCENO = "referenceNo";
    public static final String PROPERTY_DEBIT = "debit";
    public static final String PROPERTY_CREDIT = "credit";
    public static final String PROPERTY_ACCOUNTVALUE = "accountValue";
    public static final String PROPERTY_ACCOUNTDESCRIPTION = "accountDescription";
    public static final String PROPERTY_ACCOUNTVALUEPARENT = "accountValueParent";
    public static final String PROPERTY_ACCOUNTNAMEPARENT = "accountNameParent";

    public GAIWorksheetV() {
        setDefaultValue(PROPERTY_ACTIVE, true);
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

    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }

    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    public String getKodeKPS() {
        return (String) get(PROPERTY_KODEKPS);
    }

    public void setKodeKPS(String kodeKPS) {
        set(PROPERTY_KODEKPS, kodeKPS);
    }

    public Period getPeriod() {
        return (Period) get(PROPERTY_PERIOD);
    }

    public void setPeriod(Period period) {
        set(PROPERTY_PERIOD, period);
    }

    public Date getDateTransaction() {
        return (Date) get(PROPERTY_DATETRANSACTION);
    }

    public void setDateTransaction(Date dateTransaction) {
        set(PROPERTY_DATETRANSACTION, dateTransaction);
    }

    public String getDocumentNo() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }

    public void setDocumentNo(String documentNo) {
        set(PROPERTY_DOCUMENTNO, documentNo);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public String getReferenceNo() {
        return (String) get(PROPERTY_REFERENCENO);
    }

    public void setReferenceNo(String referenceNo) {
        set(PROPERTY_REFERENCENO, referenceNo);
    }

    public BigDecimal getDebit() {
        return (BigDecimal) get(PROPERTY_DEBIT);
    }

    public void setDebit(BigDecimal debit) {
        set(PROPERTY_DEBIT, debit);
    }

    public BigDecimal getCredit() {
        return (BigDecimal) get(PROPERTY_CREDIT);
    }

    public void setCredit(BigDecimal credit) {
        set(PROPERTY_CREDIT, credit);
    }

    public String getAccountValue() {
        return (String) get(PROPERTY_ACCOUNTVALUE);
    }

    public void setAccountValue(String accountValue) {
        set(PROPERTY_ACCOUNTVALUE, accountValue);
    }

    public String getAccountDescription() {
        return (String) get(PROPERTY_ACCOUNTDESCRIPTION);
    }

    public void setAccountDescription(String accountDescription) {
        set(PROPERTY_ACCOUNTDESCRIPTION, accountDescription);
    }

    public String getAccountValueParent() {
        return (String) get(PROPERTY_ACCOUNTVALUEPARENT);
    }

    public void setAccountValueParent(String accountValueParent) {
        set(PROPERTY_ACCOUNTVALUEPARENT, accountValueParent);
    }

    public String getAccountNameParent() {
        return (String) get(PROPERTY_ACCOUNTNAMEPARENT);
    }

    public void setAccountNameParent(String accountNameParent) {
        set(PROPERTY_ACCOUNTNAMEPARENT, accountNameParent);
    }

}
