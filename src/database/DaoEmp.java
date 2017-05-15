/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import metier.classmetier2;

/**
 *
 * @author Alain
 */
public class DaoEmp {

    private final Connection connexion;

    public DaoEmp(Connection connexion) throws SQLException {
        this.connexion = connexion;
    }

    public void lireLesEmployes(List<classmetier2> lesEmployes) throws SQLException {
        String requete = "select * from EMP";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {       // traitement du résulat
            int num = rset.getInt(1);
            String nom = rset.getString(2);
            String job = rset.getString(3);
            LocalDate date = rset.getDate(4).toLocalDate();
            int dept = rset.getInt(5);
            classmetier2 temp = new classmetier2(num, nom, job, date, dept);
            lesEmployes.add(temp);
        }
        rset.close();
        pstmt.close();
    }

    public void supprimerEmploye(int numEmp) throws SQLException {
        String requete = "delete from EMP where empno = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numEmp);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void insererEmploye(classmetier2 emp) throws SQLException {
        String requete = "insert into EMP (empno, ename, job, hiredate, deptno) values(?,?,?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, emp.getNumEmp());
        pstmt.setString(2, emp.getNomEmp());
        pstmt.setString(3, emp.getJobEmp());
        pstmt.setDate(4, java.sql.Date.valueOf(emp.getDateEmp()));
        pstmt.setInt(5, emp.getDeptEmp());
        pstmt.executeUpdate();
        pstmt.close();
    }
}
