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
package org.openbravo.model.common.enterprise;

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
/**
 * Entity class for entity OrganizationType (stored in table AD_OrgType).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class OrganizationType extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_OrgType";
    public static final String ENTITY_NAME = "OrganizationType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_DEFAULT = "default";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_LEGALENTITY = "legalEntity";
    public static final String PROPERTY_BUSINESSUNIT = "businessUnit";
    public static final String PROPERTY_TRANSACTIONSALLOWED = "transactionsAllowed";
    public static final String PROPERTY_LEGALENTITYWITHACCOUNTING = "legalEntityWithAccounting";
    public static final String PROPERTY_ORGANIZATIONLIST = "organizationList";

    public OrganizationType() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DEFAULT, false);
        setDefaultValue(PROPERTY_LEGALENTITY, false);
        setDefaultValue(PROPERTY_BUSINESSUNIT, false);
        setDefaultValue(PROPERTY_TRANSACTIONSALLOWED, false);
        setDefaultValue(PROPERTY_LEGALENTITYWITHACCOUNTING, false);
        setDefaultValue(PROPERTY_ORGANIZATIONLIST, new ArrayList<Object>());
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

    public Boolean isDefault() {
        return (Boolean) get(PROPERTY_DEFAULT);
    }

    public void setDefault(Boolean deflt) {
        set(PROPERTY_DEFAULT, deflt);
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

    public Boolean isLegalEntity() {
        return (Boolean) get(PROPERTY_LEGALENTITY);
    }

    public void setLegalEntity(Boolean legalEntity) {
        set(PROPERTY_LEGALENTITY, legalEntity);
    }

    public Boolean isBusinessUnit() {
        return (Boolean) get(PROPERTY_BUSINESSUNIT);
    }

    public void setBusinessUnit(Boolean businessUnit) {
        set(PROPERTY_BUSINESSUNIT, businessUnit);
    }

    public Boolean isTransactionsAllowed() {
        return (Boolean) get(PROPERTY_TRANSACTIONSALLOWED);
    }

    public void setTransactionsAllowed(Boolean transactionsAllowed) {
        set(PROPERTY_TRANSACTIONSALLOWED, transactionsAllowed);
    }

    public Boolean isLegalEntityWithAccounting() {
        return (Boolean) get(PROPERTY_LEGALENTITYWITHACCOUNTING);
    }

    public void setLegalEntityWithAccounting(Boolean legalEntityWithAccounting) {
        set(PROPERTY_LEGALENTITYWITHACCOUNTING, legalEntityWithAccounting);
    }

    @SuppressWarnings("unchecked")
    public List<Organization> getOrganizationList() {
      return (List<Organization>) get(PROPERTY_ORGANIZATIONLIST);
    }

    public void setOrganizationList(List<Organization> organizationList) {
        set(PROPERTY_ORGANIZATIONLIST, organizationList);
    }

}
