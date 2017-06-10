package database;

import java.sql.Connection;
import java.sql.Date;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import tables.VIP;
import tables.Wedding;

public class DaoWedding
{

    private final Connection connection;

    public DaoWedding(Connection connection)
    {
        this.connection = connection;
    }

    public void recupererWedding(List<Wedding> weddings) throws SQLException
    {
        String query = "SELECT numVIP1, (SELECT lastNameVIP FROM VIP WHERE numVIP1 = numVIP) AS nVIP1, (SELECT firstNameVIP FROM VIP WHERE numVIP1=numVIP) AS pVIP1, weddingDate, partnerVIP, (SELECT lastNameVIP FROM VIP WHERE partnerVIP= numVIP) AS nVIP2, (SELECT firstNameVIP FROM VIP WHERE partnerVIP= numVIP) AS pVIP2, weddingPlace, dateDivorce FROM EVENEMENT;";
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(query);
        while (rset.next())
        {
            int i;
            int numVIP1 = rset.getInt(1);
            String lastNameVIP1 = rset.getString(2) + " " + rset.getString(3);
            LocalDate weddingDate = rset.getDate(4).toLocalDate();
            int numVIP2 = rset.getInt(5);
            String lastNameVIP2 = rset.getString(6) + " " + rset.getString(7);
            String placeWedding = rset.getString(8);
            LocalDate divorceDate;
            if (rset.getDate(9) == null)
            {
                divorceDate = LocalDate.parse("0001-01-01");
            } else
            {
                divorceDate = rset.getDate(9).toLocalDate();
            }
            Wedding wedding = new Wedding(numVIP1, lastNameVIP1, weddingDate, numVIP2, lastNameVIP2, placeWedding, divorceDate);
            weddings.add(wedding);
        }
        rset.close();
        stmt.close();
    }

    public void insertWedding(Wedding wedding) throws SQLException
    {
        String query = "INSERT INTO EVENEMENT(numVIP1, weddingDate, partnerVIP, weddingPlace, dateDivorce) VALUES (?,?,?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, wedding.getNumVIP1());
        pstmt.setDate(2, java.sql.Date.valueOf(wedding.getWeddingDate()));
        pstmt.setInt(3, wedding.getNumVIP2());
        pstmt.setString(4, wedding.getPlaceWedding());
        if (LocalDate.parse("0001-01-01").equals(wedding.getDivorceDate()))
        {
            pstmt.setDate(5, null);
        } else
        {
            pstmt.setDate(5, java.sql.Date.valueOf(wedding.getDivorceDate()));
        }
        pstmt.executeUpdate();
        pstmt.close();
        updateWeddingCodeStatusVIP1Maried(wedding.getNumVIP1());
        updateWeddingCodeStatusVIP2Maried(wedding.getNumVIP2());
    }

    public void updateWeddingCodeStatusVIP1Maried(int id) throws SQLException
    {
        String query = "UPDATE VIP SET codeStatut='Maried' WHERE numVIP=" + id;
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void updateWeddingCodeStatusVIP2Maried(int id) throws SQLException
    {
        String query = "UPDATE VIP SET codeStatut='Maried' WHERE numVIP=" + id;
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void updateWedding(Wedding wedding) throws SQLException
    {
        try
        {
            String query = "UPDATE EVENEMENT SET dateDivorce=? WHERE numVIP1=? AND weddingDate=?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setDate(1, java.sql.Date.valueOf(wedding.getDivorceDate()));
            pstmt.setInt(2, wedding.getNumVIP1());
            pstmt.setDate(3, java.sql.Date.valueOf(wedding.getWeddingDate()));
            pstmt.executeUpdate();
            pstmt.close();
            updateWeddingCodeStatusVIPFree(wedding.getNumVIP1());
            updateWeddingCodeStatusVIPFree(wedding.getNumVIP2());
        } catch (SQLException e)
        {
            System.out.println("Insertion error : " + e.getMessage());
        }
    }

    public void updateWeddingCodeStatusVIPFree(int id) throws SQLException
    {
        String query = "UPDATE VIP SET codeStatut='Free' WHERE numVIP=" + id;
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
