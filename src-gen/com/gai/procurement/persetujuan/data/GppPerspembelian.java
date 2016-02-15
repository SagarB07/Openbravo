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
package com.gai.procurement.persetujuan.data;

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
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.procurement.Requisition;
/**
 * Entity class for entity GPP_PERSPEMBELIAN (stored in table GPP_PERSPEMBELIAN).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GppPerspembelian extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GPP_PERSPEMBELIAN";
    public static final String ENTITY_NAME = "GPP_PERSPEMBELIAN";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_DOCUMENTNO = "documentno";
    public static final String PROPERTY_NEEDBYDATE = "needbydate";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_QUANTITY = "quantity";
    public static final String PROPERTY_UNITPRICE = "unitprice";
    public static final String PROPERTY_BPARTNER = "bpartner";
    public static final String PROPERTY_DASAR = "dasar";
    public static final String PROPERTY_USER = "user";
    public static final String PROPERTY_DIVISI = "divisi";
    public static final String PROPERTY_COMPLETE = "complete";
    public static final String PROPERTY_REQUISITION = "requisition";
    public static final String PROPERTY_DOCUMENTTYPE = "documentType";
    public static final String PROPERTY_DOCUMENTSTATUS = "documentStatus";
    public static final String PROPERTY_DIPERIKSA = "diperiksa";
    public static final String PROPERTY_DIRKEU = "dirkeu";
    public static final String PROPERTY_MANKEU = "mankeu";
    public static final String PROPERTY_DISKON = "diskon";
    public static final String PROPERTY_PRICE = "price";
    public static final String PROPERTY_GMMMASTERDEPT = "gmmMasterDept";
    public static final String PROPERTY_KETERANGAN = "keterangan";
    public static final String PROPERTY_GPPPERSPEMBLINELIST = "gPPPERSPEMBLINEList";

    public GppPerspembelian() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_DIVISI, "Umum");
        setDefaultValue(PROPERTY_COMPLETE, false);
        setDefaultValue(PROPERTY_DOCUMENTSTATUS, "DR");
        setDefaultValue(PROPERTY_GPPPERSPEMBLINELIST, new ArrayList<Object>());
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

    public String getDocumentno() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }

    public void setDocumentno(String documentno) {
        set(PROPERTY_DOCUMENTNO, documentno);
    }

    public Date getNeedbydate() {
        return (Date) get(PROPERTY_NEEDBYDATE);
    }

    public void setNeedbydate(Date needbydate) {
        set(PROPERTY_NEEDBYDATE, needbydate);
    }

    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }

    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public BigDecimal getQuantity() {
        return (BigDecimal) get(PROPERTY_QUANTITY);
    }

    public void setQuantity(BigDecimal quantity) {
        set(PROPERTY_QUANTITY, quantity);
    }

    public BigDecimal getUnitprice() {
        return (BigDecimal) get(PROPERTY_UNITPRICE);
    }

    public void setUnitprice(BigDecimal unitprice) {
        set(PROPERTY_UNITPRICE, unitprice);
    }

    public BusinessPartner getBpartner() {
        return (BusinessPartner) get(PROPERTY_BPARTNER);
    }

    public void setBpartner(BusinessPartner bpartner) {
        set(PROPERTY_BPARTNER, bpartner);
    }

    public String getDasar() {
        return (String) get(PROPERTY_DASAR);
    }

    public void setDasar(String dasar) {
        set(PROPERTY_DASAR, dasar);
    }

    public User getUser() {
        return (User) get(PROPERTY_USER);
    }

    public void setUser(User user) {
        set(PROPERTY_USER, user);
    }

    public String getDivisi() {
        return (String) get(PROPERTY_DIVISI);
    }

    public void setDivisi(String divisi) {
        set(PROPERTY_DIVISI, divisi);
    }

    public Boolean isComplete() {
        return (Boolean) get(PROPERTY_COMPLETE);
    }

    public void setComplete(Boolean complete) {
        set(PROPERTY_COMPLETE, complete);
    }

    public Requisition getRequisition() {
        return (Requisition) get(PROPERTY_REQUISITION);
    }

    public void setRequisition(Requisition requisition) {
        set(PROPERTY_REQUISITION, requisition);
    }

    public DocumentType getDocumentType() {
        return (DocumentType) get(PROPERTY_DOCUMENTTYPE);
    }

    public void setDocumentType(DocumentType documentType) {
        set(PROPERTY_DOCUMENTTYPE, documentType);
    }

    public String getDocumentStatus() {
        return (String) get(PROPERTY_DOCUMENTSTATUS);
    }

    public void setDocumentStatus(String documentStatus) {
        set(PROPERTY_DOCUMENTSTATUS, documentStatus);
    }

    public User getDiperiksa() {
        return (User) get(PROPERTY_DIPERIKSA);
    }

    public void setDiperiksa(User diperiksa) {
        set(PROPERTY_DIPERIKSA, diperiksa);
    }

    public User getDirkeu() {
        return (User) get(PROPERTY_DIRKEU);
    }

    public void setDirkeu(User dirkeu) {
        set(PROPERTY_DIRKEU, dirkeu);
    }

    public User getMankeu() {
        return (User) get(PROPERTY_MANKEU);
    }

    public void setMankeu(User mankeu) {
        set(PROPERTY_MANKEU, mankeu);
    }

    public BigDecimal getDiskon() {
        return (BigDecimal) get(PROPERTY_DISKON);
    }

    public void setDiskon(BigDecimal diskon) {
        set(PROPERTY_DISKON, diskon);
    }

    public BigDecimal getPrice() {
        return (BigDecimal) get(PROPERTY_PRICE);
    }

    public void setPrice(BigDecimal price) {
        set(PROPERTY_PRICE, price);
    }

    public GmmMasterDepartment getGmmMasterDept() {
        return (GmmMasterDepartment) get(PROPERTY_GMMMASTERDEPT);
    }

    public void setGmmMasterDept(GmmMasterDepartment gmmMasterDept) {
        set(PROPERTY_GMMMASTERDEPT, gmmMasterDept);
    }

    public String getKeterangan() {
        return (String) get(PROPERTY_KETERANGAN);
    }

    public void setKeterangan(String keterangan) {
        set(PROPERTY_KETERANGAN, keterangan);
    }

    @SuppressWarnings("unchecked")
    public List<GppPerspembline> getGPPPERSPEMBLINEList() {
      return (List<GppPerspembline>) get(PROPERTY_GPPPERSPEMBLINELIST);
    }

    public void setGPPPERSPEMBLINEList(List<GppPerspembline> gPPPERSPEMBLINEList) {
        set(PROPERTY_GPPPERSPEMBLINELIST, gPPPERSPEMBLINEList);
    }

}
