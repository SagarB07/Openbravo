(function () {   
	  //printtoolbar
	  var buttonToolbarPrint = {
		  action: function(){
			var callback, ids = [], i, view = this.view, grid = view.viewGrid, selectedRecords = grid.getSelectedRecords(), idtab = view.tabId ;
			var string_id="",postParams = [];
			var command = "";
			for (i = 0; i < selectedRecords.length; i++) {
			  string_id= string_id +"'"+selectedRecords[i].id+"'"+",";
			}

			if (string_id.length > 0 ) {
			  string_id = string_id.substring(0,string_id.length-1);
			}

			var r = confirm("[Confirmation] Print Memo UMK ?");
			if (r == true) {
			
				//if (idtab === '64152ADB14AD42569F0E290E0FE749C3' ) {  //Fund Delivery Confirmation
					command = 'PRINT_GL'; //==java
				/*	alert('Cashflow Projection > ' +' <br>*Record : '+string_id+" ("+command+")");
				}*/
				
			postParams['Command'] = command;
			postParams['inpRecordId'] = string_id;
			OB.Utilities.openProcessPopup(OB.Application.contextUrl + '/com.gai.umk.erpCommon.ad_reports/UmkToolbarPrint.html', false, postParams, 200, 320);
	
			} else {
				//do nothing
			}			
		  },
		  buttonType: 'gumk_toolbarprint',//di css
		  prompt: 'Print Memo UMK',
		  updateState: function(){
			  var view = this.view, form = view.viewForm, grid = view.viewGrid, selectedRecords = grid.getSelectedRecords();
			  if (view.isShowingForm && form.isNew) {
				this.setDisabled(true);
			  } else if (view.isEditingGrid && grid.getEditForm().isNew) {
				this.setDisabled(true);
			  } else {
				this.setDisabled(selectedRecords.length === 0);
			  }
		  }
		};
		var buttonToolbarPrintRealisasi = {
		  action: function(){
			var callback, ids = [], i, view = this.view, grid = view.viewGrid, selectedRecords = grid.getSelectedRecords(), idtab = view.tabId ;
			var string_id="",postParams = [];
			var command = "";
			for (i = 0; i < selectedRecords.length; i++) {
			  string_id= string_id +"'"+selectedRecords[i].id+"'"+",";
			}

			if (string_id.length > 0 ) {
			  string_id = string_id.substring(0,string_id.length-1);
			}

			var r = confirm("[Confirmation] Pertanggung Jawaban UMK ?");
			if (r == true) {
			
				//if (idtab === '64152ADB14AD42569F0E290E0FE749C3' ) {  //Fund Delivery Confirmation
					command = 'PRINT_REALISASI'; //==java
				/*	alert('Cashflow Projection > ' +' <br>*Record : '+string_id+" ("+command+")");
				}*/
				
			postParams['Command'] = command;
			postParams['inpRecordId'] = string_id;
			OB.Utilities.openProcessPopup(OB.Application.contextUrl + '/com.gai.umk.erpCommon.ad_reports/UmkToolbarPrint.html', false, postParams, 200, 320);
	
			} else {
				//do nothing
			}			

		  },
		  buttonType: 'gumk_toolbarprintRealisasi',//di css
		  prompt: 'Print Pertanggung Jawaban UMK',
		  updateState: function(){
			  var view = this.view, form = view.viewForm, grid = view.viewGrid, selectedRecords = grid.getSelectedRecords();
			  if (view.isShowingForm && form.isNew) {
				this.setDisabled(true);
			  } else if (view.isEditingGrid && grid.getEditForm().isNew) {
				this.setDisabled(true);
			  } else {
				this.setDisabled(selectedRecords.length === 0);
			  }
		  }
		};
  // register the button for the sales order tab
  // the first parameter is a unique identification so that one button can not be registered multiple times.
  //register button print
  OB.ToolbarRegistry.registerButton(buttonToolbarPrint.buttonType, isc.OBToolbarIconButton, buttonToolbarPrint, 101, ['D19722629D7C4798BB884F703BE8F32F']);
  OB.ToolbarRegistry.registerButton(buttonToolbarPrintRealisasi.buttonType, isc.OBToolbarIconButton, buttonToolbarPrintRealisasi, 111, ['D19722629D7C4798BB884F703BE8F32F']);
}());
