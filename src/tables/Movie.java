package tables;

import java.time.LocalDate;

public class Movie
{

    private int numVisa;
    private String title;
    private LocalDate releaseDate;
    private String genre;

    public Movie()
    {

    }

    public Movie(int numVisa, String title, LocalDate releaseDate, String genre)
    {
        this.numVisa = numVisa;
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public int getNumVisa()
    {
        return numVisa;
    }

    public String getTitle()
    {
        return title;
    }

    public LocalDate getReleaseDate()
    {
        return releaseDate;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setNumVisa(int numVisa)
    {
        this.numVisa = numVisa;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setReleaseDate(LocalDate releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

}
