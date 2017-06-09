package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import tables.Wedding;

public class DaoWedding {

    private final Connection connection;

    public DaoWedding(Connection connection) {
        this.connection = connection;
    }

    public void recupererWedding(List<Wedding> weddings) throws SQLException {
        String query = "SELECT numVIP1, (SELECT nomVIP FROM VIP WHERE numVIP1 = numVIP) AS nVIP1, (SELECT prenomVIP FROM VIP WHERE numVIP1=numVIP) AS pVIP1, dateMariage, numVIPConjoint, (SELECT nomVIP FROM VIP WHERE numVIPConjoint = numVIP) AS nVIP2, (SELECT prenomVIP FROM VIP WHERE numVIPConjoint = numVIP) AS pVIP2, lieuMariage, dateDivorce FROM EVENEMENT;";
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(query);
        while (rset.next()) {
            int numVIP1 = rset.getInt(1);
            LocalDate weddingDate = rset.getDate(2).toLocalDate();
            int numVIP2 = rset.getInt(3);
            String placeWedding = rset.getString(4);
            LocalDate divorceDate;
            if (rset.getDate(5) == null) {
                divorceDate = LocalDate.parse("0001-01-01");
            } else {
                divorceDate = rset.getDate(5).toLocalDate();
            }
            Wedding wedding = new Wedding(numVIP1, weddingDate, numVIP2, placeWedding, divorceDate);
            weddings.add(wedding);
        }
        rset.close();
        stmt.close();
    }

    public void insertWedding(Wedding wedding) throws SQLException {
        String query = "INSERT INTO EVENEMENT(numVIP1, dateMariage, numVIPConjoint, lieuMariage, dateDivorce) VALUES (?,?,?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, wedding.getNumVIP1());
        pstmt.setDate(2, java.sql.Date.valueOf(wedding.getWeddingDate()));
        pstmt.setInt(3, wedding.getNumVIP2());
        pstmt.setString(4, wedding.getPlaceWedding());
        pstmt.setDate(5, java.sql.Date.valueOf(wedding.getDivorceDate()));
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void addDivorce(int numWedding) throws SQLException {
        String query = "UPDATE FROM EVENEMENT WHERE numWedding = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, numWedding);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
