package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            String title = rset.getString(2);
            int numVIP2 = rset.getInt(3);
            Wedding wedding = new Wedding(visa, title, date, gender);
            weddings.add(wedding);
        }
        rset.close();
        stmt.close();
    }
    
    public void insertWedding(Wedding wedding) throws SQLException
    {
        String query = "INSERT INTO FILM(numVisa, title, gender, releaseDate) VALUES (?,?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, wedding.getNumVisa());
        pstmt.setString(2, wedding.getTitle());
        pstmt.setString(3, wedding.getGenre());
        pstmt.setInt(4, wedding.getReleaseDate());
        pstmt.executeUpdate();
        pstmt.close();
    }
    
    public void deleteWedding(int numWedding) throws SQLException
    {
        String query = "DELETE FROM FILM WHERE numVIP = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, numWedding);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
