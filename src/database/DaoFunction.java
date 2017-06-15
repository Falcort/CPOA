package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import metier.VIP;

public class DaoFunction
{

    private final Connection connection;

    public DaoFunction(Connection connection)
    {
        this.connection = connection;
    }

    public String verifyCodeStatus(int id) throws SQLException, Exception
    {
        String requete = "SELECT codeStatus FROM VIP WHERE numVIP='" + id + "'";
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(requete);

        while (rset.next())
        {
            String codeStatus = rset.getString(1);
            rset.close();
            stmt.close();
            return codeStatus;
        }
        rset.close();
        stmt.close();
        throw new Exception("error form numVIP");
    }

}
