package modele;

import application.Main;
import database.DaoMovie;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tables.Movie;


public class ModeleJTableMovie extends AbstractTableModel {
     private final List<Movie> leConteneur;
     private final String[] title;
     private final DaoMovie DaoMovie;
     
      public ModeleJTableMovie()
    {
        this.leConteneur = new ArrayList<>();
        this.title = new String[]{"Visa", "Title", "Year of release", "Film genre"};
        this.DaoMovie = Main.getDaoMovie();
    }
     
    @Override
    public int getRowCount()
    {
        return leConteneur.size();
    }

    @Override
    public int getColumnCount()
    {
        return title.length;
    }

    @Override
    public Object getValueAt(int row, int column)
    {
        Movie movie = leConteneur.get(row);
        switch (column)
        {
            case 0:
                return movie.getNumVisa();
            case 1:
                return movie.getTitle();
            case 2:
                return movie.getReleaseDate();
            case 3:
                return movie.getGenre();
        }
        return null;
    }
     
    @Override
    public String getColumnName(int column)
    {
        return title[column];
    }
    
    public void chargerMovie() throws SQLException
    {
        DaoMovie.recupererMovie(leConteneur);
        this.fireTableDataChanged();
    }
    
    public void insertMovie(Movie movie) throws SQLException
    {
        DaoMovie.insertMovie(movie);
        leConteneur.add(movie);
        this.fireTableDataChanged();
    }
    
    public void deleteMovie(int numLine) throws SQLException
    {
        int numMovie = (int) getValueAt(numLine, 0);
        DaoMovie.deleteMovie(numMovie);
        leConteneur.remove(numLine);
        this.fireTableDataChanged();
    }

   }
