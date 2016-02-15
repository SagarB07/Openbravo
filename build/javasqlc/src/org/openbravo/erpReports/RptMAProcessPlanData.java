//Sqlc generated V1.O00-1
package org.openbravo.erpReports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class RptMAProcessPlanData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptMAProcessPlanData.class);
  private String InitRecordNumber="0";
  public String processplan;
  public String ratio;
  public String secud;
  public String desde;
  public String hasta;
  public String secuencia;
  public String sec;
  public String description;
  public String proceso;
  public String seqno;
  public String groupuse;
  public String vacio;
  public String producto;
  public String tipo;
  public String bold;
  public String quantity;
  public String ud;
  public String componentcost;
  public String decrease;
  public String rejected;
  public String maProcessplanId;
  public String maSequenceId;
  public String explodephases;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("PROCESSPLAN"))
      return processplan;
    else if (fieldName.equalsIgnoreCase("RATIO"))
      return ratio;
    else if (fieldName.equalsIgnoreCase("SECUD"))
      return secud;
    else if (fieldName.equalsIgnoreCase("DESDE"))
      return desde;
    else if (fieldName.equalsIgnoreCase("HASTA"))
      return hasta;
    else if (fieldName.equalsIgnoreCase("SECUENCIA"))
      return secuencia;
    else if (fieldName.equalsIgnoreCase("SEC"))
      return sec;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("PROCESO"))
      return proceso;
    else if (fieldName.equalsIgnoreCase("SEQNO"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("GROUPUSE"))
      return groupuse;
    else if (fieldName.equalsIgnoreCase("VACIO"))
      return vacio;
    else if (fieldName.equalsIgnoreCase("PRODUCTO"))
      return producto;
    else if (fieldName.equalsIgnoreCase("TIPO"))
      return tipo;
    else if (fieldName.equalsIgnoreCase("BOLD"))
      return bold;
    else if (fieldName.equalsIgnoreCase("QUANTITY"))
      return quantity;
    else if (fieldName.equalsIgnoreCase("UD"))
      return ud;
    else if (fieldName.equalsIgnoreCase("COMPONENTCOST"))
      return componentcost;
    else if (fieldName.equalsIgnoreCase("DECREASE"))
      return decrease;
    else if (fieldName.equalsIgnoreCase("REJECTED"))
      return rejected;
    else if (fieldName.equalsIgnoreCase("MA_PROCESSPLAN_ID") || fieldName.equals("maProcessplanId"))
      return maProcessplanId;
    else if (fieldName.equalsIgnoreCase("MA_SEQUENCE_ID") || fieldName.equals("maSequenceId"))
      return maSequenceId;
    else if (fieldName.equalsIgnoreCase("EXPLODEPHASES"))
      return explodephases;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptMAProcessPlanData[] select(ConnectionProvider connectionProvider, String language, String maProcessPlanId)    throws ServletException {
    return select(connectionProvider, language, maProcessPlanId, 0, 0);
  }

  public static RptMAProcessPlanData[] select(ConnectionProvider connectionProvider, String language, String maProcessPlanId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT pp.NAME as processplan, pp.CONVERSIONRATE as ratio, pp.SECONDARYUNIT as secud, v.DATEFROM as desde, " +
      "              v.DATETO as hasta, s.NAME as secuencia, s.VALUE as sec, s.DESCRIPTION, pr.NAME as proceso," +
      "              s.SEQNO, AD_MESSAGE_GET2(s.GROUPUSE, to_char(?)) as groupuse, AD_MESSAGE_GET2(s.NOQTY, to_char(?)) as vacio," +
      "              p.name as producto, sp.PRODUCTIONTYPE as tipo, AD_MESSAGE_GET2(sp.PRODUCTIONTYPE, to_char(?)) as bold," +
      "              sp.QUANTITY, c.UOMSYMBOL as ud, sp.COMPONENTCOST, sp.DECREASE, sp.REJECTED," +
      "              pp.MA_ProcessPlan_ID, s.MA_Sequence_ID, AD_MESSAGE_GET2(pp.EXPLODEPHASES, to_char(?)) as explodephases" +
      "          FROM MA_Processplan pp, MA_processplan_version v, ma_sequence s, ma_sequenceproduct sp, " +
      "              m_product p, ma_process pr, C_UOM c" +
      "          where pp.MA_PROCESSPLAN_ID = v.MA_PROCESSPLAN_ID" +
      "            and v.MA_PROCESSPLAN_VERSION_ID = s.MA_PROCESSPLAN_VERSION_ID" +
      "            and s.MA_SEQUENCE_ID = sp.MA_SEQUENCE_ID" +
      "            and sp.M_PRODUCT_ID = p.M_PRODUCT_ID" +
      "            and sp.C_UOM_ID = c.C_UOM_ID" +
      "            and s.MA_PROCESS_ID = pr.MA_PROCESS_ID" +
      "            and v.DATEFROM <= now()" +
      "            and v.DATETO > now()" +
      "            and 1=1";
    strSql = strSql + ((maProcessPlanId==null || maProcessPlanId.equals(""))?"":"           and pp.ma_processplan_id IN        " + maProcessPlanId);
    strSql = strSql + 
      "          order by pp.ma_processplan_id, pp.NAME, s.seqno, sp.productiontype, p.name";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (maProcessPlanId != null && !(maProcessPlanId.equals(""))) {
        }

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        RptMAProcessPlanData objectRptMAProcessPlanData = new RptMAProcessPlanData();
        objectRptMAProcessPlanData.processplan = UtilSql.getValue(result, "PROCESSPLAN");
        objectRptMAProcessPlanData.ratio = UtilSql.getValue(result, "RATIO");
        objectRptMAProcessPlanData.secud = UtilSql.getValue(result, "SECUD");
        objectRptMAProcessPlanData.desde = UtilSql.getDateValue(result, "DESDE", "dd-MM-yyyy");
        objectRptMAProcessPlanData.hasta = UtilSql.getDateValue(result, "HASTA", "dd-MM-yyyy");
        objectRptMAProcessPlanData.secuencia = UtilSql.getValue(result, "SECUENCIA");
        objectRptMAProcessPlanData.sec = UtilSql.getValue(result, "SEC");
        objectRptMAProcessPlanData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectRptMAProcessPlanData.proceso = UtilSql.getValue(result, "PROCESO");
        objectRptMAProcessPlanData.seqno = UtilSql.getValue(result, "SEQNO");
        objectRptMAProcessPlanData.groupuse = UtilSql.getValue(result, "GROUPUSE");
        objectRptMAProcessPlanData.vacio = UtilSql.getValue(result, "VACIO");
        objectRptMAProcessPlanData.producto = UtilSql.getValue(result, "PRODUCTO");
        objectRptMAProcessPlanData.tipo = UtilSql.getValue(result, "TIPO");
        objectRptMAProcessPlanData.bold = UtilSql.getValue(result, "BOLD");
        objectRptMAProcessPlanData.quantity = UtilSql.getValue(result, "QUANTITY");
        objectRptMAProcessPlanData.ud = UtilSql.getValue(result, "UD");
        objectRptMAProcessPlanData.componentcost = UtilSql.getValue(result, "COMPONENTCOST");
        objectRptMAProcessPlanData.decrease = UtilSql.getValue(result, "DECREASE");
        objectRptMAProcessPlanData.rejected = UtilSql.getValue(result, "REJECTED");
        objectRptMAProcessPlanData.maProcessplanId = UtilSql.getValue(result, "MA_PROCESSPLAN_ID");
        objectRptMAProcessPlanData.maSequenceId = UtilSql.getValue(result, "MA_SEQUENCE_ID");
        objectRptMAProcessPlanData.explodephases = UtilSql.getValue(result, "EXPLODEPHASES");
        objectRptMAProcessPlanData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptMAProcessPlanData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    RptMAProcessPlanData objectRptMAProcessPlanData[] = new RptMAProcessPlanData[vector.size()];
    vector.copyInto(objectRptMAProcessPlanData);
    return(objectRptMAProcessPlanData);
  }

  public static RptMAProcessPlanData[] set()    throws ServletException {
    RptMAProcessPlanData objectRptMAProcessPlanData[] = new RptMAProcessPlanData[1];
    objectRptMAProcessPlanData[0] = new RptMAProcessPlanData();
    objectRptMAProcessPlanData[0].processplan = "";
    objectRptMAProcessPlanData[0].ratio = "";
    objectRptMAProcessPlanData[0].secud = "";
    objectRptMAProcessPlanData[0].desde = "";
    objectRptMAProcessPlanData[0].hasta = "";
    objectRptMAProcessPlanData[0].secuencia = "";
    objectRptMAProcessPlanData[0].sec = "";
    objectRptMAProcessPlanData[0].description = "";
    objectRptMAProcessPlanData[0].proceso = "";
    objectRptMAProcessPlanData[0].seqno = "";
    objectRptMAProcessPlanData[0].groupuse = "";
    objectRptMAProcessPlanData[0].vacio = "";
    objectRptMAProcessPlanData[0].producto = "";
    objectRptMAProcessPlanData[0].tipo = "";
    objectRptMAProcessPlanData[0].bold = "";
    objectRptMAProcessPlanData[0].quantity = "";
    objectRptMAProcessPlanData[0].ud = "";
    objectRptMAProcessPlanData[0].componentcost = "";
    objectRptMAProcessPlanData[0].decrease = "";
    objectRptMAProcessPlanData[0].rejected = "";
    objectRptMAProcessPlanData[0].maProcessplanId = "";
    objectRptMAProcessPlanData[0].maSequenceId = "";
    objectRptMAProcessPlanData[0].explodephases = "";
    return objectRptMAProcessPlanData;
  }
}
