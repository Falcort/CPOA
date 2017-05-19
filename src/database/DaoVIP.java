/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Tables.VIP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Thinkpad-Falcort
 */
public class DaoVIP
{
    private final Connection connexion;

    public DaoVIP(Connection connexion) {
        this.connexion = connexion;
    }

    public void recupererVIP(List<VIP> VIPs) throws SQLException {
        String requete = "select * from VIP";
        Statement stmt = connexion.createStatement();
        ResultSet rset = stmt.executeQuery(requete);
         while (rset.next()) {       // traitement du résulat
            int numVIP = rset.getInt(1);
            String firstName = rset.getString(2);
            String lastName = rset.getString(3);
            String civilite = rset.getString(4);
            String bornDate = rset.getString(5);
            String whereDate = rset.getString(6);
            String codeStatus = rset.getString(7);
            String codeRole = rset.getString(8);
            VIP vip = new VIP(numVIP, firstName, lastName, civilite, bornDate, whereDate, codeStatus, codeRole);
            VIPs.add(vip);
        }        
        rset.close();
        stmt.close();
    } // recupererGroupes
}
