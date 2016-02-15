package com.gai.asset.actionHandler;

import javax.enterprise.event.Observes;

import org.apache.log4j.Logger;
import org.openbravo.base.model.Entity;
import org.openbravo.base.model.ModelProvider;
import org.openbravo.base.model.Property;
import org.openbravo.client.kernel.RequestContext;
import org.openbravo.client.kernel.event.EntityNewEvent;
import org.openbravo.client.kernel.event.EntityPersistenceEvent;
import org.openbravo.client.kernel.event.EntityPersistenceEventObserver;
import org.openbravo.client.kernel.event.EntityUpdateEvent;
import org.openbravo.dal.service.OBDal;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.model.common.enterprise.DocumentType;
import org.openbravo.service.db.DalConnectionProvider;

import org.openbravo.model.financialmgmt.assetmgmt.Asset;

public class GasAssetCodeHandler extends EntityPersistenceEventObserver {

	public void onUpdate(@Observes EntityUpdateEvent event) {
		handleEvent(event);
	}

	public void onSave(@Observes EntityNewEvent event) {
		handleEvent(event);
	}

	private void handleEvent(EntityPersistenceEvent event) {
		if (!isValidEvent(event)) return;
		if (event.getTargetInstance().getEntity() != imEntity) return;

		String getWindowId = RequestContext.get().getRequestParameter("windowId");
		
		if (getWindowId==null || getWindowId=="" || getWindowId.length()==0) {
			getWindowId = "backgroundProcess";
		}
		//cek apakah update terjadi di background process?
		if (getWindowId.equals("backgroundProcess")) {
			log4j.info("Window = "+getWindowId+"Tidak melakukan handler karena update berjalan di background process");
			//tidak melakukan apapun karena, proses update tidak terjadi di area yg memiliki window
		}
		else {
			log4j.info("Menjalankan Handler");
			Entity entity = imEntity;
			boolean isUpdate = (event instanceof EntityUpdateEvent);
			String searchKey = (String) event.getCurrentState(imSearcgKeyProperty);
			String prevSearchKey = (isUpdate) ? (String) ((EntityUpdateEvent) event).getPreviousState(imSearcgKeyProperty) : null;
			/*boolean processed = false;
			Object oProcessed = (imgcrRequisition == null ? false : event.getCurrentState(imgcrRequisition));
			if (oProcessed instanceof String) {
				processed = "Y".equals(oProcessed.toString());
			} else if (oProcessed instanceof Boolean) {
				processed = (Boolean) oProcessed;
			}*/
			log4j.info("isUpdate = " + isUpdate);
			log4j.info("searchKey = " + searchKey);
			log4j.info("prevSearchKey = " + prevSearchKey);
			//log4j.info("processed = " + processed);
			//if (!processed || !isUpdate) {
			if (!isUpdate) {
				final DocumentType docType = null;
				final DocumentType gaiDocTypeTarget = (imgaiDocTypeTargetProperty == null ? null : (DocumentType) event.getCurrentState(imgaiDocTypeTargetProperty));
				final String docTypeId = docType != null ? docType.getId() : "";
				final String gaiDocTypeTargetId = gaiDocTypeTarget != null ? gaiDocTypeTarget.getId() : "";
				String windowId = RequestContext.get().getRequestParameter("windowId");
				if (windowId == null) windowId = "";
				log4j.info("docTypeId = " + docTypeId);
				log4j.info("gaiDocTypeTargetId = " + gaiDocTypeTargetId);

				boolean forceUpdate = true;
				if (getWindowId.equals("800027")) {
					log4j.info("Conditional 1(Asset)");
					Utility.getDocumentNo(OBDal.getInstance().getConnection(false), new DalConnectionProvider(false), RequestContext.get().getVariablesSecureApp(), windowId, entity.getTableName(), docTypeId, gaiDocTypeTargetId, false, true);
				}
				else if (getWindowId.equals("backgroundProcess")) {
					log4j.info("Conditional 2(backgroundProcess)");
					//tidak melakukan apapun karena, proses update tidak terjadi di area yg memiliki window
				}
				else {//update terjadi di window selain kondisi ke 1 {Asset}
					log4j.info("Conditional 3(selain Asset)");
					searchKey = (forceUpdate) ? Utility.getDocumentNo(OBDal.getInstance().getConnection(false), new DalConnectionProvider(false), RequestContext.get().getVariablesSecureApp(), windowId, entity.getTableName(), docTypeId, gaiDocTypeTargetId, false, true) : prevSearchKey;
				}
				log4j.info("new searchKey = " + searchKey);
				event.setCurrentState(imSearcgKeyProperty, searchKey);
				log4j.info("event = " + event);
				log4j.info("getWindowId = " + getWindowId);
			}
		}
	}

	@Override
	protected synchronized Entity[] getObservedEntities() {
		return entities;
	}

	private static final Entity imEntity = ModelProvider.getInstance().getEntity(Asset.ENTITY_NAME);
	private static final Property imSearcgKeyProperty = imEntity.getProperty(Asset.PROPERTY_SEARCHKEY);
	private static final Property imgaiDocTypeTargetProperty = imEntity.getProperty(Asset.PROPERTY_GASDOCTYPE);
	private static final Entity[] entities = { imEntity };

	private static final Logger log4j = Logger.getLogger(GasAssetCodeHandler.class);

}
