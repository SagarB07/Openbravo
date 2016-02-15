package com.gai.accounting.cashflow.erpCommon.ad_process;

import java.util.ArrayList;
import java.util.List;

import org.openbravo.scheduling.ProcessBundle;
import org.openbravo.scheduling.ProcessLogger;
import org.openbravo.service.db.DalBaseProcess;
import org.openbravo.service.db.CallStoredProcedure;

/**
 * @author GAI
 * Call Procedure GAI_ResetPosted
 *
 */
public class GAI_IsCashflow extends DalBaseProcess {

  @Override
  protected void doExecute(ProcessBundle bundle) throws Exception {
  	List<Object> param = new ArrayList<Object>();
  	param.add(null);   
  	CallStoredProcedure.getInstance().call("GCS_ISCASHFLOW", param, null, false, false);
  }
}
