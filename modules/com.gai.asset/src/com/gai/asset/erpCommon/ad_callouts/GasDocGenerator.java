package com.gai.asset.erpCommon.ad_callouts;

import javax.servlet.ServletException;

import org.openbravo.erpCommon.ad_callouts.SimpleCallout;

public class GasDocGenerator extends SimpleCallout {

	@Override
	protected void execute(CalloutInfo info) throws ServletException {
		String currentNext = "0";
		String strDocTypeTargetId = info.getStringParameter("inpemGasDoctypeId", null);
		String strWindowId = info.getStringParameter("inpwindowId", null);

		//baru inpdocumentno
		String oldAssetId = info.getStringParameter("inpaAssetId", null);
		String oldDocumentValue = "";
		String oldDocumentName = "";
		String documentValue = "";
		//end baru
		GasDocGeneratorData[] data;
		String strWindowName;
		//selectWindow
		//String TabID=info.getStringParameter("inpTabId", null);

		strWindowName = GasDocGeneratorData.selectWindow(this, strWindowId);
		data = GasDocGeneratorData.selectDoc(this, strDocTypeTargetId);

		if (data != null && data.length > 0) {
			if (data[0].isdocnocontrolled.equals("Y")) {
				currentNext = "<" + data[0].currentnext + ">";
				currentNext = data[0].prefix+data[0].currentnext;
				documentValue = data[0].name; //baru
			}
		}

		//Asset
		if (strWindowName.equals("Assets"))	{
			//baru
			data = GasDocGeneratorData.selectAsset(this, oldAssetId);
			if (data != null && data.length > 0) {
				//oldDocumentName = data[0].name;
				oldDocumentValue = data[0].kode;
			}
			//end baru
		}	 

		info.addResult("inpemGasDoctypeId", strDocTypeTargetId);
		//baru
		//cek bila name dari document lama sama dengan name document baru
		//bila sama maka itu termasuk update, sehingga tidak memperbaharui yg baru
		if ( (oldDocumentName.equals(documentValue)) ) {
			info.addResult("inpvalue",oldDocumentValue);
			//info.addResult("inpname",oldDocumentName);
		}
		else {
			info.addResult("inpvalue", currentNext);
		}
		//end baru

	}

	private static final long serialVersionUID = 1L;

}
