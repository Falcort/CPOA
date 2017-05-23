package database;

import tables.VIP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

public class DaoVIP
{
    private final Connection connexion;

    public DaoVIP(Connection connexion)
    {
        this.connexion = connexion;
    }

    public void recupererVIP(List<VIP> VIPs) throws SQLException {
        String requete = "select * from VIP";
        Statement stmt = connexion.createStatement();
        ResultSet rset = stmt.executeQuery(requete);
        while (rset.next())
        {
            int numVIP = rset.getInt(1);
            String lastName = rset.getString(2);
            String firstName = rset.getString(3);
            String civilite = rset.getString(4);
            LocalDate bornDate = rset.getDate(5).toLocalDate();
            String whereDate = rset.getString(6);
            String codeStatus = rset.getString(7);
            String codeRole = rset.getString(8);
            VIP vip = new VIP(numVIP, firstName, lastName, civilite, bornDate, whereDate, codeStatus, codeRole);
            VIPs.add(vip);
        }        
        rset.close();
        stmt.close();
    }
    
    public void insererVIP(VIP vip) throws SQLException
    {
        String query = "INSERT INTO VIP(nomVIP, prénomVIP, civilitéVIP, dateNaissance, lieuNaissance, codeStatut, codeRole) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(query);
        pstmt.setString(1, vip.getLastName());
        pstmt.setString(2, vip.getFirstName());
        pstmt.setString(3, vip.getCivilite());
        pstmt.setDate(4, java.sql.Date.valueOf(vip.getBornDate()));
        pstmt.setString(5, vip.getWhereBorn());
        pstmt.setString(6, vip.getCodeStatus());
        pstmt.setString(7, vip.getCodeRole());
        pstmt.executeUpdate();
        pstmt.close();
    }
}
