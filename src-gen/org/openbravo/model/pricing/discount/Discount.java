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
package org.openbravo.model.pricing.discount;

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
import org.openbravo.model.common.invoice.InvoiceDiscount;
import org.openbravo.model.common.order.OrderDiscount;
import org.openbravo.model.common.plm.Product;
/**
 * Entity class for entity PricingDiscount (stored in table C_Discount).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Discount extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "C_Discount";
    public static final String ENTITY_NAME = "PricingDiscount";
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
    public static final String PROPERTY_DISCOUNT = "discount";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_BUSINESSPARTNERDISCOUNTLIST = "businessPartnerDiscountList";
    public static final String PROPERTY_INVOICEDISCOUNTLIST = "invoiceDiscountList";
    public static final String PROPERTY_ORDERDISCOUNTLIST = "orderDiscountList";

    public Discount() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_DISCOUNT, new BigDecimal(0));
        setDefaultValue(PROPERTY_BUSINESSPARTNERDISCOUNTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_INVOICEDISCOUNTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERDISCOUNTLIST, new ArrayList<Object>());
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

    public BigDecimal getDiscount() {
        return (BigDecimal) get(PROPERTY_DISCOUNT);
    }

    public void setDiscount(BigDecimal discount) {
        set(PROPERTY_DISCOUNT, discount);
    }

    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }

    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    @SuppressWarnings("unchecked")
    public List<org.openbravo.model.common.businesspartner.Discount> getBusinessPartnerDiscountList() {
      return (List<org.openbravo.model.common.businesspartner.Discount>) get(PROPERTY_BUSINESSPARTNERDISCOUNTLIST);
    }

    public void setBusinessPartnerDiscountList(List<org.openbravo.model.common.businesspartner.Discount> businessPartnerDiscountList) {
        set(PROPERTY_BUSINESSPARTNERDISCOUNTLIST, businessPartnerDiscountList);
    }

    @SuppressWarnings("unchecked")
    public List<InvoiceDiscount> getInvoiceDiscountList() {
      return (List<InvoiceDiscount>) get(PROPERTY_INVOICEDISCOUNTLIST);
    }

    public void setInvoiceDiscountList(List<InvoiceDiscount> invoiceDiscountList) {
        set(PROPERTY_INVOICEDISCOUNTLIST, invoiceDiscountList);
    }

    @SuppressWarnings("unchecked")
    public List<OrderDiscount> getOrderDiscountList() {
      return (List<OrderDiscount>) get(PROPERTY_ORDERDISCOUNTLIST);
    }

    public void setOrderDiscountList(List<OrderDiscount> orderDiscountList) {
        set(PROPERTY_ORDERDISCOUNTLIST, orderDiscountList);
    }

}
