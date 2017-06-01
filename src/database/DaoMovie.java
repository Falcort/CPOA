/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tables.Movie;
import java.util.List;

/**
 *
 * @author Thinkpad-Falcort
 */
public class DaoMovie
{
    private final Connection connection;
    
    public DaoMovie(Connection connection)
    {
        this.connection = connection;
    }
    
    public void recupererMovie(List<Movie> movies) throws SQLException
    {
        String query = "SELECT * FROM FILM";
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(query);
        while (rset.next())
        {
            int visa = rset.getInt(1);
            String title = rset.getString(2);
            String gender = rset.getString(4);
            int date = rset.getInt(3);
            Movie movie = new Movie(visa, title, date, gender);
            movies.add(movie);
        }
        rset.close();
        stmt.close();
    }
}
