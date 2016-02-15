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

			var r = confirm("[Confirmation] Print this record ?");
			if (r == true) {
			
				//if (idtab === '64152ADB14AD42569F0E290E0FE749C3' ) {  //Fund Delivery Confirmation
					command = 'PRINT_GL'; //==java
				/*	alert('Cashflow Projection > ' +' <br>*Record : '+string_id+" ("+command+")");
				}*/
				
			postParams['Command'] = command;
			postParams['inpRecordId'] = string_id;
			OB.Utilities.openProcessPopup(OB.Application.contextUrl + '/com.gai.procurement.erpCommon.ad_reports/ToolbarRequisition.html', false, postParams, 200, 320);
	
			} else {
				//do nothing
			}			

		  },
		  buttonType: 'gpr_toolbarprint',
		  prompt: 'Print Lembar Persetujuan',
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
  OB.ToolbarRegistry.registerButton(buttonToolbarPrint.buttonType, isc.OBToolbarIconButton, buttonToolbarPrint, 100, ['800249']);
}());
