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
package org.openbravo.client.application;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.ui.Field;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBUIAPP_GC_Field (stored in table OBUIAPP_GC_Field).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GCField extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBUIAPP_GC_Field";
    public static final String ENTITY_NAME = "OBUIAPP_GC_Field";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_OBUIAPPGCTAB = "obuiappGcTab";
    public static final String PROPERTY_FIELD = "field";
    public static final String PROPERTY_FILTERABLE = "filterable";
    public static final String PROPERTY_SORTABLE = "sortable";
    public static final String PROPERTY_TEXTFILTERBEHAVIOR = "textFilterBehavior";
    public static final String PROPERTY_FILTERONCHANGE = "filterOnChange";
    public static final String PROPERTY_THRESHOLDTOFILTER = "thresholdToFilter";

    public GCField() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_FILTERABLE, "D");
        setDefaultValue(PROPERTY_SORTABLE, "D");
        setDefaultValue(PROPERTY_TEXTFILTERBEHAVIOR, "D");
        setDefaultValue(PROPERTY_FILTERONCHANGE, "D");
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

    public GCTab getObuiappGcTab() {
        return (GCTab) get(PROPERTY_OBUIAPPGCTAB);
    }

    public void setObuiappGcTab(GCTab obuiappGcTab) {
        set(PROPERTY_OBUIAPPGCTAB, obuiappGcTab);
    }

    public Field getField() {
        return (Field) get(PROPERTY_FIELD);
    }

    public void setField(Field field) {
        set(PROPERTY_FIELD, field);
    }

    public String getFilterable() {
        return (String) get(PROPERTY_FILTERABLE);
    }

    public void setFilterable(String filterable) {
        set(PROPERTY_FILTERABLE, filterable);
    }

    public String getSortable() {
        return (String) get(PROPERTY_SORTABLE);
    }

    public void setSortable(String sortable) {
        set(PROPERTY_SORTABLE, sortable);
    }

    public String getTextFilterBehavior() {
        return (String) get(PROPERTY_TEXTFILTERBEHAVIOR);
    }

    public void setTextFilterBehavior(String textFilterBehavior) {
        set(PROPERTY_TEXTFILTERBEHAVIOR, textFilterBehavior);
    }

    public String getFilterOnChange() {
        return (String) get(PROPERTY_FILTERONCHANGE);
    }

    public void setFilterOnChange(String filterOnChange) {
        set(PROPERTY_FILTERONCHANGE, filterOnChange);
    }

    public Long getThresholdToFilter() {
        return (Long) get(PROPERTY_THRESHOLDTOFILTER);
    }

    public void setThresholdToFilter(Long thresholdToFilter) {
        set(PROPERTY_THRESHOLDTOFILTER, thresholdToFilter);
    }

}
