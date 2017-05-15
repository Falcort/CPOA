/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import metier.classmetier1;

/**
 *
 * @author Alain
 */
public class DaoDept {

    private final Connection connexion;

    public DaoDept(Connection connexion) {
        this.connexion = connexion;
    }

    public void recupererDepartements(List<classmetier1> lesDepartements) throws SQLException {
        String requete = "select * from DEPT";
        Statement stmt = connexion.createStatement();
        ResultSet rset = stmt.executeQuery(requete);
         while (rset.next()) {       // traitement du résulat
            int num = rset.getInt(1);
            String nom = rset.getString(2);
            String loc = rset.getString(3);
            classmetier1 dept = new classmetier1(num, nom, loc);
            lesDepartements.add(dept);
        }        
        rset.close();
        stmt.close();
    } // recupererGroupes
    
} // class DaoGroupe
