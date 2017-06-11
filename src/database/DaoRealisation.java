package database;

import tables.Casting;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import tables.Realisation;

public class DaoRealisation {

    private final Connection connexion;

    public DaoRealisation(Connection connexion) {
        this.connexion = connexion;
    }

    public void recupererRealisation(List<Realisation> Realisations) throws SQLException {
        String requete = "select * from REALISATION";
        Statement stmt = connexion.createStatement();
        ResultSet rset = stmt.executeQuery(requete);
        while (rset.next()) {
            int numVISARealisation = rset.getInt(1);
            int numVIPRealisation = rset.getInt(2);
            Realisation realisation = new Realisation(numVISARealisation, numVIPRealisation);
            Realisations.add(realisation);
        }
        rset.close();
        stmt.close();
    }

    public void insertRealisation(Realisation realisation) throws SQLException {
        String query = "INSERT INTO REALISATION(numVISA, numVIP) VALUES (?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(query);
        pstmt.setInt(1, realisation.getNumVISARealisation());
        pstmt.setInt(2, realisation.getNumVIPRealisation());
        pstmt.executeUpdate();
        pstmt.close();
    }
}
