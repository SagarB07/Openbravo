//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_actionButton;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class CreateFile34Data implements FieldProvider {
static Logger log4j = Logger.getLogger(CreateFile34Data.class);
  private String InitRecordNumber="0";
  public String nif;
  public String hoy;
  public String duedate;
  public String nCuenta;
  public String dc;
  public String nombre;
  public String domicilio;
  public String plaza;
  public String hueco;
  public String provincia;
  public String concepto;
  public String payamt;
  public String lineas;
  public String ordenantes;
  public String taxid;
  public String dom;
  public String pla;
  public String prov;
  public String nom;
  public String acct;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("NIF"))
      return nif;
    else if (fieldName.equalsIgnoreCase("HOY"))
      return hoy;
    else if (fieldName.equalsIgnoreCase("DUEDATE"))
      return duedate;
    else if (fieldName.equalsIgnoreCase("N_CUENTA") || fieldName.equals("nCuenta"))
      return nCuenta;
    else if (fieldName.equalsIgnoreCase("DC"))
      return dc;
    else if (fieldName.equalsIgnoreCase("NOMBRE"))
      return nombre;
    else if (fieldName.equalsIgnoreCase("DOMICILIO"))
      return domicilio;
    else if (fieldName.equalsIgnoreCase("PLAZA"))
      return plaza;
    else if (fieldName.equalsIgnoreCase("HUECO"))
      return hueco;
    else if (fieldName.equalsIgnoreCase("PROVINCIA"))
      return provincia;
    else if (fieldName.equalsIgnoreCase("CONCEPTO"))
      return concepto;
    else if (fieldName.equalsIgnoreCase("PAYAMT"))
      return payamt;
    else if (fieldName.equalsIgnoreCase("LINEAS"))
      return lineas;
    else if (fieldName.equalsIgnoreCase("ORDENANTES"))
      return ordenantes;
    else if (fieldName.equalsIgnoreCase("TAXID"))
      return taxid;
    else if (fieldName.equalsIgnoreCase("DOM"))
      return dom;
    else if (fieldName.equalsIgnoreCase("PLA"))
      return pla;
    else if (fieldName.equalsIgnoreCase("PROV"))
      return prov;
    else if (fieldName.equalsIgnoreCase("NOM"))
      return nom;
    else if (fieldName.equalsIgnoreCase("ACCT"))
      return acct;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static CreateFile34Data[] select(ConnectionProvider connectionProvider, String cRemittanceId)    throws ServletException {
    return select(connectionProvider, cRemittanceId, 0, 0);
  }

  public static CreateFile34Data[] select(ConnectionProvider connectionProvider, String cRemittanceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    select lpad(oi.taxID,10)                                                             AS NIF," +
      "    TO_CHAR(now(), 'DD')||TO_CHAR(now(), 'MM')||TO_CHAR(now(), 'YY')                     AS HOY," +
      "    TO_CHAR(r.duedate, 'DD')||TO_CHAR(r.duedate, 'MM')||TO_CHAR(r.duedate, 'YY')         AS DUEDATE," +
      "    LPAD(B.CODEBANK,4,'0')||LPAD(B.CODEBRANCH,4,'0')||LPAD(ba.CODEACCOUNT,10,'0')        AS N_CUENTA," +
      "    LPAD(B.DIGITCONTROL||ba.DIGITCONTROL,2,'0')                                          AS DC," +
      "    REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(" +
      "    RPAD(O.NAME,36)" +
      "    ),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U')                                       AS NOMBRE," +
      "    REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(" +
      "    RPAD(l.Address1||' '||l.Address2,36)" +
      "    ),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U')                                       AS DOMICILIO," +
      "    REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(" +
      "    RPAD(l.City,36)" +
      "    ),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U')                                       AS PLAZA," +
      "    rpad(' ',7,' ')                                                                      AS HUECO," +
      "    ''                                                                                   AS PROVINCIA," +
      "    ''                                                                                   AS CONCEPTO," +
      "    ''                                                                                   AS PAYAMT," +
      "    ''                                                                                   AS LINEAS," +
      "    ''                                                                                   AS ORDENANTES," +
      "    oi.taxID                                                                             AS TAXID," +
      "    ''                                                                                   AS DOM," +
      "    ''                                                                                   AS PLA," +
      "    ''                                                                                   AS PROV," +
      "    ''                                                                                   AS NOM," +
      "    B.CODEBANK || B.CODEBRANCH || ba.CODEACCOUNT                                         AS ACCT" +
      "     from  c_bankAccount    ba," +
      "           ad_client        c," +
      "           c_Bank           b," +
      "           ad_orgInfo       oi," +
      "           ad_org           o," +
      "           c_remittance     r," +
      "           c_Location       l" +
      "     where c.Ad_Client_ID = r.AD_Client_Id" +
      "       and r.AD_ORG_ID = oi.ad_org_id" +
      "       and oi.ad_org_id = o.ad_org_id" +
      "       and r.C_BANKACCOUNT_ID = ba.c_bankAccount_id" +
      "       and b.c_bank_id = ba.c_bank_Id" +
      "       and oi.C_Location_ID = l.C_location_ID" +
      "      and r.C_Remittance_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cRemittanceId);

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
        CreateFile34Data objectCreateFile34Data = new CreateFile34Data();
        objectCreateFile34Data.nif = UtilSql.getValue(result, "NIF");
        objectCreateFile34Data.hoy = UtilSql.getValue(result, "HOY");
        objectCreateFile34Data.duedate = UtilSql.getValue(result, "DUEDATE");
        objectCreateFile34Data.nCuenta = UtilSql.getValue(result, "N_CUENTA");
        objectCreateFile34Data.dc = UtilSql.getValue(result, "DC");
        objectCreateFile34Data.nombre = UtilSql.getValue(result, "NOMBRE");
        objectCreateFile34Data.domicilio = UtilSql.getValue(result, "DOMICILIO");
        objectCreateFile34Data.plaza = UtilSql.getValue(result, "PLAZA");
        objectCreateFile34Data.hueco = UtilSql.getValue(result, "HUECO");
        objectCreateFile34Data.provincia = UtilSql.getValue(result, "PROVINCIA");
        objectCreateFile34Data.concepto = UtilSql.getValue(result, "CONCEPTO");
        objectCreateFile34Data.payamt = UtilSql.getValue(result, "PAYAMT");
        objectCreateFile34Data.lineas = UtilSql.getValue(result, "LINEAS");
        objectCreateFile34Data.ordenantes = UtilSql.getValue(result, "ORDENANTES");
        objectCreateFile34Data.taxid = UtilSql.getValue(result, "TAXID");
        objectCreateFile34Data.dom = UtilSql.getValue(result, "DOM");
        objectCreateFile34Data.pla = UtilSql.getValue(result, "PLA");
        objectCreateFile34Data.prov = UtilSql.getValue(result, "PROV");
        objectCreateFile34Data.nom = UtilSql.getValue(result, "NOM");
        objectCreateFile34Data.acct = UtilSql.getValue(result, "ACCT");
        objectCreateFile34Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFile34Data);
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
    CreateFile34Data objectCreateFile34Data[] = new CreateFile34Data[vector.size()];
    vector.copyInto(objectCreateFile34Data);
    return(objectCreateFile34Data);
  }

  public static CreateFile34Data[] selectLineas(ConnectionProvider connectionProvider, String cRemittanceId)    throws ServletException {
    return selectLineas(connectionProvider, cRemittanceId, 0, 0);
  }

  public static CreateFile34Data[] selectLineas(ConnectionProvider connectionProvider, String cRemittanceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT LPAD(BP.TAXID,12,' ')                      AS NIF, BP.TAXID," +
      "             LPAD(TO_CHAR(ROUND(DP.AMOUNT*100)),12,'0')                   AS PAYAMT," +
      "             SUBSTR(TRIM(LPAD(BP_A.ACCOUNTNO,20,'0')),1,4)|| /*BANCO*/" +
      "             SUBSTR(TRIM(LPAD(BP_A.ACCOUNTNO,20,'0')),5,4)|| /*OFICINA*/" +
      "             SUBSTR(TRIM(LPAD(BP_A.ACCOUNTNO,20,'0')),11) AS N_CUENTA," +
      "             SUBSTR(TRIM(LPAD(BP_A.ACCOUNTNO,20,'0')),9,2)AS DC, BP_A.ACCOUNTNO AS ACCT," +
      "             REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(RPAD(COALESCE(BP.NAME2,BP.NAME),36,' ')),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U') AS nombre," +
      "             REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(COALESCE(BP.NAME2,BP.NAME)),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U') AS NOM," +
      "             REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(RPAD(COALESCE(to_char(L.ADDRESS1),'')||' '||COALESCE(to_char(L.ADDRESS2),''),36,' ')),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U') AS DOMICILIO," +
      "             REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(COALESCE(to_char(L.ADDRESS2),'')||COALESCE(to_char(L.ADDRESS1),'')),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U') AS DOM," +
      "             REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(RPAD(COALESCE(to_char(L.POSTAL),''),5)||RPAD(COALESCE(to_char(L.CITY),''),31,' ')),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U') AS PLAZA," +
      "             REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(COALESCE(to_char(L.POSTAL),'')||COALESCE(to_char(L.CITY),'')),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U') AS PLA," +
      "             REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(RPAD(COALESCE(to_char(R.DESCRIPTION),' '),36,' ')),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U') AS PROVINCIA," +
      "             REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(R.DESCRIPTION),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U') AS PROV," +
      "             REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(UPPER(RPAD(COALESCE(to_char(DP.DESCRIPTION),' '),36,' ')),'Ã�','A'),'Ã‰','E'),'Ã�','I'),'Ã“','O'),'Ãš','U') AS CONCEPTO" +
      "             FROM c_remittanceline S, C_DEBT_PAYMENT DP," +
      "                                  C_BPARTNER BP left join C_BP_BANKACCOUNT BP_A on BP.C_BPARTNER_ID = BP_A.C_BPARTNER_ID" +
      "                                  LEFT JOIN C_BPARTNER_LOCATION BP_L on BP.C_BPARTNER_ID = BP_L.C_BPARTNER_ID" +
      "                                  LEFT JOIN C_LOCATION L on BP_L.C_LOCATION_ID = L.C_LOCATION_ID" +
      "                                  LEFT JOIN C_REGION R on L.C_REGION_ID = R.C_REGION_ID" +
      "      WHERE S.C_debt_payment_id = DP.C_debt_payment_id" +
      "      AND DP.C_BPARTNER_ID = BP.C_BPARTNER_ID" +
      "      AND BP_L.C_BPARTNER_LOCATION_ID = COALESCE(C_GETBPLOCATIONID(BP.C_BPARTNER_ID, 'B'),BP_L.C_BPARTNER_LOCATION_ID)" +
      "      AND (BP_A.C_BPARTNER_ID IS NULL OR BP_A.ISACTIVE = 'Y')" +
      "      and s.C_Remittance_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cRemittanceId);

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
        CreateFile34Data objectCreateFile34Data = new CreateFile34Data();
        objectCreateFile34Data.nif = UtilSql.getValue(result, "NIF");
        objectCreateFile34Data.taxid = UtilSql.getValue(result, "TAXID");
        objectCreateFile34Data.payamt = UtilSql.getValue(result, "PAYAMT");
        objectCreateFile34Data.nCuenta = UtilSql.getValue(result, "N_CUENTA");
        objectCreateFile34Data.dc = UtilSql.getValue(result, "DC");
        objectCreateFile34Data.acct = UtilSql.getValue(result, "ACCT");
        objectCreateFile34Data.nombre = UtilSql.getValue(result, "NOMBRE");
        objectCreateFile34Data.nom = UtilSql.getValue(result, "NOM");
        objectCreateFile34Data.domicilio = UtilSql.getValue(result, "DOMICILIO");
        objectCreateFile34Data.dom = UtilSql.getValue(result, "DOM");
        objectCreateFile34Data.plaza = UtilSql.getValue(result, "PLAZA");
        objectCreateFile34Data.pla = UtilSql.getValue(result, "PLA");
        objectCreateFile34Data.provincia = UtilSql.getValue(result, "PROVINCIA");
        objectCreateFile34Data.prov = UtilSql.getValue(result, "PROV");
        objectCreateFile34Data.concepto = UtilSql.getValue(result, "CONCEPTO");
        objectCreateFile34Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFile34Data);
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
    CreateFile34Data objectCreateFile34Data[] = new CreateFile34Data[vector.size()];
    vector.copyInto(objectCreateFile34Data);
    return(objectCreateFile34Data);
  }

  public static CreateFile34Data[] selectTotal(ConnectionProvider connectionProvider, String cRemittanceId)    throws ServletException {
    return selectTotal(connectionProvider, cRemittanceId, 0, 0);
  }

  public static CreateFile34Data[] selectTotal(ConnectionProvider connectionProvider, String cRemittanceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT lpad(Lpad(TO_CHAR(round(sum(DP.AMOUNT)*100)),12,'0'),27,' ') AS PAYAMT" +
      "      FROM C_DEBT_PAYMENT DP," +
      "           c_remittanceLine rl" +
      "     where dp.c_debt_payment_id = rl.c_debt_payment_id" +
      "       and rl.C_Remittance_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cRemittanceId);

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
        CreateFile34Data objectCreateFile34Data = new CreateFile34Data();
        objectCreateFile34Data.payamt = UtilSql.getValue(result, "PAYAMT");
        objectCreateFile34Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFile34Data);
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
    CreateFile34Data objectCreateFile34Data[] = new CreateFile34Data[vector.size()];
    vector.copyInto(objectCreateFile34Data);
    return(objectCreateFile34Data);
  }

  public static CreateFile34Data[] selectNLineas(ConnectionProvider connectionProvider, String nLineas, String nOrdenantes)    throws ServletException {
    return selectNLineas(connectionProvider, nLineas, nOrdenantes, 0, 0);
  }

  public static CreateFile34Data[] selectNLineas(ConnectionProvider connectionProvider, String nLineas, String nOrdenantes, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT LPAD(?,10,'0') AS LINEAS," +
      "              LPAD(?,8,'0')  AS ORDENANTES," +
      "              LPAD(' ',13,' ') AS HUECO" +
      "         FROM DUAL";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nLineas);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nOrdenantes);

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
        CreateFile34Data objectCreateFile34Data = new CreateFile34Data();
        objectCreateFile34Data.lineas = UtilSql.getValue(result, "LINEAS");
        objectCreateFile34Data.ordenantes = UtilSql.getValue(result, "ORDENANTES");
        objectCreateFile34Data.hueco = UtilSql.getValue(result, "HUECO");
        objectCreateFile34Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreateFile34Data);
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
    CreateFile34Data objectCreateFile34Data[] = new CreateFile34Data[vector.size()];
    vector.copyInto(objectCreateFile34Data);
    return(objectCreateFile34Data);
  }
}
