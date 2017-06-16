package database;

import metier.Tag;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import database.DaoTag;

public class DaoTag
{

    private final Connection connexion;

    public DaoTag(Connection connexion)
    {
        this.connexion = connexion;
    }

    public void recupererTAG(List<Tag> TAGs) throws SQLException
    {
        String requete = "select * from TAG";
        Statement stmt = connexion.createStatement();
        ResultSet rset = stmt.executeQuery(requete);
        while (rset.next())
        {
            int numVIP = rset.getInt(1);
            int numPhoto = rset.getInt(2);
            Tag tag = new Tag(numVIP, numPhoto);
            TAGs.add(tag);
        }
        rset.close();
        stmt.close();
    }

    public void insererTAG(Tag tag) throws SQLException
    {
        String query = "INSERT INTO TAG(numVIP, idPhoto) VALUES (?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(query);
        pstmt.setInt(1, tag.getNumVIP());
        pstmt.setInt(2, tag.getNumPhoto());
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void deleteTAG(int numVIP) throws SQLException
    {
        String query = "DELETE FROM TAG WHERE numVIP = ?";
        PreparedStatement pstmt = connexion.prepareStatement(query);
        pstmt.setInt(1, numVIP);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
