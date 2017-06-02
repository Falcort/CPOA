package tables;


public class Movie {
    private int numVisa;
    private String title;
    private int releaseDate;
    private String genre;
    
    public Movie()
    {   
        
    }
    
    public Movie(int numVisa, String title, int releaseDate, String genre)
    {
        this.numVisa = numVisa;
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public int getNumVisa() {
        return numVisa;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setNumVisa(int numVisa) {
        this.numVisa = numVisa;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
