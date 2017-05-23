package database;

import tables.VIP;
import java.sql.Connection;
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
}
