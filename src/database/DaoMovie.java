package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import tables.Movie;
import java.util.List;

public class DaoMovie {

    private final Connection connection;

    public DaoMovie(Connection connection) {
        this.connection = connection;
    }

    public void recupererMovie(List<Movie> movies) throws SQLException {
        String query = "SELECT * FROM MOVIE";
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(query);
        while (rset.next()) {
            int visa = rset.getInt(1);
            String title = rset.getString(2);
            LocalDate date = rset.getDate(3).toLocalDate();
            String gender = rset.getString(4);
            Movie movie = new Movie(visa, title, date, gender);
            movies.add(movie);
        }
        rset.close();
        stmt.close();
    }

    public void insertMovie(Movie movie) throws SQLException {
        String query = "INSERT INTO MOVIE(numVisa, title, gender, releaseDate) VALUES (?,?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, movie.getNumVisa());
        pstmt.setString(2, movie.getTitle());
        pstmt.setString(3, movie.getGenre());
        pstmt.setDate(4, java.sql.Date.valueOf(movie.getReleaseDate()));
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void deleteMovie(int numMovie) throws SQLException {
        String query = "DELETE FROM MOVIE WHERE numVisa = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, numMovie);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
