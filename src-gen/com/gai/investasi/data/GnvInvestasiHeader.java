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

import com.gai.module.data.GAI_KANTOR;

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
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity GNV_INVESTASI_HEADER (stored in table GNV_INVESTASI_HEADER).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class GnvInvestasiHeader extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "GNV_INVESTASI_HEADER";
    public static final String ENTITY_NAME = "GNV_INVESTASI_HEADER";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_AREA = "area";
    public static final String PROPERTY_GNVTYPEINVESTASI = "gNVTypeinvestasi";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_CURRENCY = "currency";
    public static final String PROPERTY_TOTALAMOUNT = "totalamount";
    public static final String PROPERTY_TOTALNISBAH = "totalnisbah";
    public static final String PROPERTY_BTNCOMPLETE = "btncomplete";
    public static final String PROPERTY_BPARTNER = "bpartner";
    public static final String PROPERTY_GAIKANTOR = "gaiKantor";
    public static final String PROPERTY_GPVTGLPOSITIONING = "gpvTglpositioning";
    public static final String PROPERTY_GPVAMOUNTPOSITION = "gpvAmountposition";
    public static final String PROPERTY_GPVPOSITIONING = "gpvPositioning";
    public static final String PROPERTY_GNVINVESTASIACCTLIST = "gNVINVESTASIACCTList";
    public static final String PROPERTY_GNVINVESTASILINELIST = "gNVINVESTASILINEList";

    public GnvInvestasiHeader() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_BTNCOMPLETE, false);
        setDefaultValue(PROPERTY_GPVAMOUNTPOSITION, new BigDecimal(0));
        setDefaultValue(PROPERTY_GPVPOSITIONING, false);
        setDefaultValue(PROPERTY_GNVINVESTASIACCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_GNVINVESTASILINELIST, new ArrayList<Object>());
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

    public String getArea() {
        return (String) get(PROPERTY_AREA);
    }

    public void setArea(String area) {
        set(PROPERTY_AREA, area);
    }

    public GnvTypeInvestasi getGNVTypeinvestasi() {
        return (GnvTypeInvestasi) get(PROPERTY_GNVTYPEINVESTASI);
    }

    public void setGNVTypeinvestasi(GnvTypeInvestasi gNVTypeinvestasi) {
        set(PROPERTY_GNVTYPEINVESTASI, gNVTypeinvestasi);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }

    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    public BigDecimal getTotalamount() {
        return (BigDecimal) get(PROPERTY_TOTALAMOUNT);
    }

    public void setTotalamount(BigDecimal totalamount) {
        set(PROPERTY_TOTALAMOUNT, totalamount);
    }

    public BigDecimal getTotalnisbah() {
        return (BigDecimal) get(PROPERTY_TOTALNISBAH);
    }

    public void setTotalnisbah(BigDecimal totalnisbah) {
        set(PROPERTY_TOTALNISBAH, totalnisbah);
    }

    public Boolean isBtncomplete() {
        return (Boolean) get(PROPERTY_BTNCOMPLETE);
    }

    public void setBtncomplete(Boolean btncomplete) {
        set(PROPERTY_BTNCOMPLETE, btncomplete);
    }

    public BusinessPartner getBpartner() {
        return (BusinessPartner) get(PROPERTY_BPARTNER);
    }

    public void setBpartner(BusinessPartner bpartner) {
        set(PROPERTY_BPARTNER, bpartner);
    }

    public GAI_KANTOR getGaiKantor() {
        return (GAI_KANTOR) get(PROPERTY_GAIKANTOR);
    }

    public void setGaiKantor(GAI_KANTOR gaiKantor) {
        set(PROPERTY_GAIKANTOR, gaiKantor);
    }

    public Date getGpvTglpositioning() {
        return (Date) get(PROPERTY_GPVTGLPOSITIONING);
    }

    public void setGpvTglpositioning(Date gpvTglpositioning) {
        set(PROPERTY_GPVTGLPOSITIONING, gpvTglpositioning);
    }

    public BigDecimal getGpvAmountposition() {
        return (BigDecimal) get(PROPERTY_GPVAMOUNTPOSITION);
    }

    public void setGpvAmountposition(BigDecimal gpvAmountposition) {
        set(PROPERTY_GPVAMOUNTPOSITION, gpvAmountposition);
    }

    public Boolean isGpvPositioning() {
        return (Boolean) get(PROPERTY_GPVPOSITIONING);
    }

    public void setGpvPositioning(Boolean gpvPositioning) {
        set(PROPERTY_GPVPOSITIONING, gpvPositioning);
    }

    @SuppressWarnings("unchecked")
    public List<GnvInvestasiAcct> getGNVINVESTASIACCTList() {
      return (List<GnvInvestasiAcct>) get(PROPERTY_GNVINVESTASIACCTLIST);
    }

    public void setGNVINVESTASIACCTList(List<GnvInvestasiAcct> gNVINVESTASIACCTList) {
        set(PROPERTY_GNVINVESTASIACCTLIST, gNVINVESTASIACCTList);
    }

    @SuppressWarnings("unchecked")
    public List<GnvInvestasiLine> getGNVINVESTASILINEList() {
      return (List<GnvInvestasiLine>) get(PROPERTY_GNVINVESTASILINELIST);
    }

    public void setGNVINVESTASILINEList(List<GnvInvestasiLine> gNVINVESTASILINEList) {
        set(PROPERTY_GNVINVESTASILINELIST, gNVINVESTASILINEList);
    }

}
