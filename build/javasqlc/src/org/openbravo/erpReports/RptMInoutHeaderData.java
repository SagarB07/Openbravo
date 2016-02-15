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

class RptMInoutHeaderData implements FieldProvider {
static Logger log4j = Logger.getLogger(RptMInoutHeaderData.class);
  private String InitRecordNumber="0";
  public String mInoutId;
  public String name;
  public String address;
  public String postal;
  public String region;
  public String documentno;
  public String movementdate;
  public String partnerValue;
  public String taxid;
  public String poreference;
  public String entity;
  public String entityLocation;
  public String datepromised;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("M_INOUT_ID") || fieldName.equals("mInoutId"))
      return mInoutId;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("ADDRESS"))
      return address;
    else if (fieldName.equalsIgnoreCase("POSTAL"))
      return postal;
    else if (fieldName.equalsIgnoreCase("REGION"))
      return region;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("MOVEMENTDATE"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("PARTNER_VALUE") || fieldName.equals("partnerValue"))
      return partnerValue;
    else if (fieldName.equalsIgnoreCase("TAXID"))
      return taxid;
    else if (fieldName.equalsIgnoreCase("POREFERENCE"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("ENTITY"))
      return entity;
    else if (fieldName.equalsIgnoreCase("ENTITY_LOCATION") || fieldName.equals("entityLocation"))
      return entityLocation;
    else if (fieldName.equalsIgnoreCase("DATEPROMISED"))
      return datepromised;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static RptMInoutHeaderData[] select(ConnectionProvider connectionProvider, String mInoutId)    throws ServletException {
    return select(connectionProvider, mInoutId, 0, 0);
  }

  public static RptMInoutHeaderData[] select(ConnectionProvider connectionProvider, String mInoutId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT M_INOUT.M_INOUT_ID, C_BPARTNER_LOCATION.NAME, COALESCE(TO_CHAR(C_LOCATION.ADDRESS1),'')||COALESCE(TO_CHAR(C_LOCATION.ADDRESS2),'') AS ADDRESS, COALESCE(TO_CHAR(C_LOCATION.POSTAL),'')||' - '||COALESCE(TO_CHAR(C_LOCATION.CITY),'') AS POSTAL," +
      "        C_REGION.NAME AS REGION, M_INOUT.DOCUMENTNO, M_INOUT.MOVEMENTDATE, C_BPARTNER.VALUE AS PARTNER_VALUE, C_BPARTNER.TAXID, " +
      "        MAX(C_ORDER.POREFERENCE) AS POREFERENCE, AD_CLIENT.DESCRIPTION AS ENTITY, C_LOCATION_DESCRIPTION(AD_ORGINFO.C_LOCATION_ID) AS ENTITY_LOCATION, C_ORDER.DATEPROMISED" +
      "        FROM C_BPARTNER_LOCATION right join M_INOUT on M_INOUT.C_BPARTNER_LOCATION_ID = C_BPARTNER_LOCATION.C_BPARTNER_LOCATION_ID" +
      "                                 left join C_LOCATION on C_BPARTNER_LOCATION.C_LOCATION_ID = C_LOCATION.C_LOCATION_ID" +
      "                                 left join C_REGION on C_LOCATION.C_REGION_ID = C_REGION.C_REGION_ID" +
      "                                 left join C_ORDER on M_INOUT.C_ORDER_ID = C_ORDER.C_ORDER_ID," +
      "             C_BPARTNER, AD_CLIENT, AD_ORGINFO" +
      "        WHERE M_INOUT.C_BPARTNER_ID = C_BPARTNER.C_BPARTNER_ID" +
      "        AND M_INOUT.AD_CLIENT_ID = AD_CLIENT.AD_CLIENT_ID" +
      "        AND M_INOUT.AD_ORG_ID = AD_ORGINFO.AD_ORG_ID" +
      "        AND COALESCE(C_BPARTNER_LOCATION.ISSHIPTO, 'Y') = 'Y'" +
      "        AND M_INOUT.M_INOUT_ID = ?" +
      "        GROUP BY M_INOUT.M_INOUT_ID, C_BPARTNER.NAME, C_BPARTNER_LOCATION.NAME, C_LOCATION.ADDRESS1, C_LOCATION.ADDRESS2, C_LOCATION.POSTAL, C_LOCATION.CITY, C_REGION.NAME, " +
      "        M_INOUT.DOCUMENTNO, M_INOUT.MOVEMENTDATE, C_BPARTNER.VALUE, C_BPARTNER.TAXID, AD_CLIENT.DESCRIPTION, AD_ORGINFO.C_LOCATION_ID, C_ORDER.DATEPROMISED";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutId);

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
        RptMInoutHeaderData objectRptMInoutHeaderData = new RptMInoutHeaderData();
        objectRptMInoutHeaderData.mInoutId = UtilSql.getValue(result, "M_INOUT_ID");
        objectRptMInoutHeaderData.name = UtilSql.getValue(result, "NAME");
        objectRptMInoutHeaderData.address = UtilSql.getValue(result, "ADDRESS");
        objectRptMInoutHeaderData.postal = UtilSql.getValue(result, "POSTAL");
        objectRptMInoutHeaderData.region = UtilSql.getValue(result, "REGION");
        objectRptMInoutHeaderData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectRptMInoutHeaderData.movementdate = UtilSql.getDateValue(result, "MOVEMENTDATE", "dd-MM-yyyy");
        objectRptMInoutHeaderData.partnerValue = UtilSql.getValue(result, "PARTNER_VALUE");
        objectRptMInoutHeaderData.taxid = UtilSql.getValue(result, "TAXID");
        objectRptMInoutHeaderData.poreference = UtilSql.getValue(result, "POREFERENCE");
        objectRptMInoutHeaderData.entity = UtilSql.getValue(result, "ENTITY");
        objectRptMInoutHeaderData.entityLocation = UtilSql.getValue(result, "ENTITY_LOCATION");
        objectRptMInoutHeaderData.datepromised = UtilSql.getDateValue(result, "DATEPROMISED", "dd-MM-yyyy");
        objectRptMInoutHeaderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRptMInoutHeaderData);
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
    RptMInoutHeaderData objectRptMInoutHeaderData[] = new RptMInoutHeaderData[vector.size()];
    vector.copyInto(objectRptMInoutHeaderData);
    return(objectRptMInoutHeaderData);
  }
}
