package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import tables.Wedding;

public class DaoWedding {
    private final Connection connection;
    
    public DaoWedding(Connection connection)
    {
        this.connection = connection;
    }
    
    public void recupererWedding(List<Wedding> weddings) throws SQLException
    {
        String query = "SELECT * FROM EVENEMENT";
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(query);
        while (rset.next())
        {
            int numVIP1 = rset.getInt(1);
            LocalDate weddingDate = rset.getDate(2).toLocalDate();
            int numVIP2 = rset.getInt(3);
            String placeWedding = rset.getString(4);
            LocalDate divorceDate = rset.getDate(5).toLocalDate();
            Wedding wedding = new Wedding(numVIP1, weddingDate, numVIP2, placeWedding, divorceDate);
            weddings.add(wedding);
        }
        rset.close();
        stmt.close();
    }
    
    public void insertWedding(Wedding wedding) throws SQLException
    {
        String query = "INSERT INTO EVENEMENT(numVIP, dateMariage, numCojoint, lieuMariage, dateDivorce) VALUES (?,?,?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, wedding.getNumVIP1());
        pstmt.setDate(2, java.sql.Date.valueOf(wedding.getWeddingDate()));
        pstmt.setInt(3, wedding.getNumVIP2());
        pstmt.setString(4, wedding.getPlaceWedding());
        pstmt.setDate(5, java.sql.Date.valueOf(wedding.getDivorceDate()));
        pstmt.executeUpdate();
        pstmt.close();
    }
    
    public void deleteWedding(int numWedding) throws SQLException
    {
        String query = "DELETE FROM EVENEMENT WHERE numWedding = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, numWedding);
        pstmt.executeUpdate();
        pstmt.close();
    }
}