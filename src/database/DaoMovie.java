package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tables.Movie;
import java.util.List;


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
    
    public void insertMovie(Movie movie) throws SQLException
    {
        String query = "INSERT INTO FILM(numVisa, title, gender, releaseDate) VALUES (?,?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, movie.getNumVisa());
        pstmt.setString(2, movie.getTitle());
        pstmt.setString(3, movie.getGenre());
        pstmt.setInt(4, movie.getReleaseDate());
        pstmt.executeUpdate();
        pstmt.close();
    }
    
    public void deleteMovie(int numMovie) throws SQLException
    {
        String query = "DELETE FROM FILM WHERE numVIP = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, numMovie);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
