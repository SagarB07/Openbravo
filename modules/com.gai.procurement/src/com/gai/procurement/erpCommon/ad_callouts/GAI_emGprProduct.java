package com.gai.procurement.erpCommon.ad_callouts;

import java.util.ArrayList;
import java.util.List;

import org.openbravo.dal.core.DalUtil;
import org.openbravo.dal.core.OBContext;
import org.openbravo.dal.service.OBDal;
import org.openbravo.base.exception.OBException;
import org.openbravo.base.structure.BaseOBObject;

import javax.servlet.ServletException;
import org.openbravo.erpCommon.ad_callouts.SimpleCallout;
import org.openbravo.service.db.CallStoredProcedure;


public class GAI_emGprProduct extends SimpleCallout {

	@Override
	protected void execute(CalloutInfo info) throws ServletException {
		String strProduct = info.getStringParameter("inpemGprPproductId",null);

		info.addResult("inpmProductId", strProduct);	
		
	}

	private static final long serialVersionUID = 1L;

}