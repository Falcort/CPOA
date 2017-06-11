package database;

import tables.Casting;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DaoCasting {

    private final Connection connexion;

    public DaoCasting(Connection connexion) {
        this.connexion = connexion;
    }

    public void recupererCasting(List<Casting> Castings) throws SQLException {
        String requete = "select * from CASTING";
        Statement stmt = connexion.createStatement();
        ResultSet rset = stmt.executeQuery(requete);
        while (rset.next()) {
            int numVISACasting = rset.getInt(1);
            int numVIPCasting = rset.getInt(2);
            String roleCasting = rset.getString(3);
            Casting casting = new Casting(numVISACasting, numVIPCasting, roleCasting);
            Castings.add(casting);
        }
        rset.close();
        stmt.close();
    }

    public void insertCasting(Casting casting) throws SQLException {
        String query = "INSERT INTO CASTING(numVISA, numVIP, role) VALUES (?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(query);
        pstmt.setInt(1, casting.getNumVISACasting());
        pstmt.setInt(2, casting.getNumVIPCasting());
        pstmt.setString(3, casting.getRoleCasting());
        pstmt.executeUpdate();
        pstmt.close();
    }
}
