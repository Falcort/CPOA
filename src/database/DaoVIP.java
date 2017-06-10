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

    public void recupererVIP(List<VIP> VIPs) throws SQLException
    {
        String requete = "select * from VIP";
        Statement stmt = connexion.createStatement();
        ResultSet rset = stmt.executeQuery(requete);
        while (rset.next())
        {
            int numVIP = rset.getInt(1);
            String lastName = rset.getString(2);
            String firstName = rset.getString(3);
            String civility = rset.getString(4);
            LocalDate bornDate = rset.getDate(5).toLocalDate();
            String bornPlace = rset.getString(6);
            String codeStatus = rset.getString(7);
            String codeRole = rset.getString(8);
            String nationality = rset.getString(9);
            VIP vip = new VIP(numVIP, firstName, lastName, civility, bornDate, bornPlace, codeStatus, codeRole, nationality);
            VIPs.add(vip);
        }
        rset.close();
        stmt.close();
    }

    public void insererVIP(VIP vip) throws SQLException
    {
        String query = "INSERT INTO VIP(lastNameVIP, firstNameVIP, civilityVIP, bornDate, bornPlace, codeStatus, codeRole, nationality) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(query);
        pstmt.setString(1, vip.getLastName());
        pstmt.setString(2, vip.getFirstName());
        pstmt.setString(3, vip.getCivility());
        pstmt.setDate(4, java.sql.Date.valueOf(vip.getBornDate()));
        pstmt.setString(5, vip.getWhereBorn());
        pstmt.setString(6, vip.getCodeStatus());
        pstmt.setString(7, vip.getCodeRole());
        pstmt.setString(8, vip.getNationality());
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void deleteVIP(int numVIP) throws SQLException
    {
        String query = "DELETE FROM VIP WHERE numVIP = ?";
        PreparedStatement pstmt = connexion.prepareStatement(query);
        pstmt.setInt(1, numVIP);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
