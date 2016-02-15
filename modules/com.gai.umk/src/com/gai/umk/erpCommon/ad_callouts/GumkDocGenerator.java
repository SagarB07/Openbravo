package com.gai.umk.erpCommon.ad_callouts;

import javax.servlet.ServletException;

import org.openbravo.erpCommon.ad_callouts.SimpleCallout;

public class GumkDocGenerator extends SimpleCallout {

	@Override
	protected void execute(CalloutInfo info) throws ServletException {
		String currentNext = "0";
		String strDocTypeTargetId = info.getStringParameter("inpcDoctypeId", null);
		String strWindowId = info.getStringParameter("inpwindowId", null);

		//baru inpdocumentno
		String oldUmkId = info.getStringParameter("inpgumkUmkId", null);
		String oldDocumentno = "";
		String oldDocumentName = "";
		String nameDocumentno = "";
		//end baru
		GumkDocGeneratorData[] data;
		String strWindowName;
		//selectWindow
		//String TabID=info.getStringParameter("inpTabId", null);

		strWindowName = GumkDocGeneratorData.selectWindow(this, strWindowId);
		data = GumkDocGeneratorData.selectDoc(this, strDocTypeTargetId);

		if (data != null && data.length > 0) {
			if (data[0].isdocnocontrolled.equals("Y")) {
				currentNext = "<" + data[0].currentnext + ">";
				currentNext = data[0].currentnext+data[0].suffix;
				nameDocumentno = data[0].name; //baru
			}
		}

		//UMK
		if (strWindowName.equals("UMK"))	{
			//baru
			data = GumkDocGeneratorData.selectUmk(this, oldUmkId);
			if (data != null && data.length > 0) {
				//oldDocumentName = data[0].name;
				oldDocumentno = data[0].documentno;
			}
			//end baru
		}	 

		info.addResult("inpcDoctypeId", strDocTypeTargetId);
		//info.addResult("inpcDoctypetargetId", strDocTypeTargetId);
		//baru
		//cek bila name dari document lama sama dengan name document baru
		//bila sama maka itu termasuk update, sehingga tidak memperbaharui yg baru
		if ( (oldDocumentName.equals(nameDocumentno)) ) {
			info.addResult("inpdocumentno",oldDocumentno);
			//info.addResult("inpname",oldDocumentName);
		}
		else {
			info.addResult("inpdocumentno", currentNext);
		}
		//end baru

	}

	private static final long serialVersionUID = 1L;

}
