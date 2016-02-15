package com.gai.budget.erpCommon.ad_callouts;

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

import java.math.BigDecimal;

public class GBG_Amount extends SimpleCallout {

	@Override
	protected void execute(CalloutInfo info) throws ServletException {

		String strBudget = info.getStringParameter("inpemGbgBudgetamt", null);

		info.addResult("inpemGbgAvailableamt", strBudget);
		info.addResult("inpemGbgEstimasiamt", strBudget);

	}

	private static final long serialVersionUID = 1L;

}
