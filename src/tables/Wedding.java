package tables;

import java.time.LocalDate;

public class Wedding
{

    private int numVIP1;
    private LocalDate weddingDate;
    private int numVIP2;
    private String placeWedding;
    private LocalDate divorceDate;
    private String lastNameVIP1;
    private String lastNameVIP2;

    public Wedding(int numVIP1, String lastNameVIP1, LocalDate weddingDate, int numVIP2, String lastNameVIP2, String placeWedding, LocalDate divorceDate)
    {
        this.numVIP1 = numVIP1;
        this.weddingDate = weddingDate;
        this.numVIP2 = numVIP2;
        this.placeWedding = placeWedding;
        this.divorceDate = divorceDate;
        this.lastNameVIP1 = lastNameVIP1;
        this.lastNameVIP2 = lastNameVIP2;
    }

    public String getLastNameVIP1()
    {
        return lastNameVIP1;
    }

    public void setLastNameVIP1(String lastNameVIP1)
    {
        this.lastNameVIP1 = lastNameVIP1;
    }

    public String getLastNameVIP2()
    {
        return lastNameVIP2;
    }

    public void setLastNameVIP2(String lastNameVIP2)
    {
        this.lastNameVIP2 = lastNameVIP2;
    }

    public Wedding()
    {
    }

    public int getNumVIP1()
    {
        return numVIP1;
    }

    public LocalDate getWeddingDate()
    {
        return weddingDate;
    }

    public int getNumVIP2()
    {
        return numVIP2;
    }

    public String getPlaceWedding()
    {
        return placeWedding;
    }

    public LocalDate getDivorceDate()
    {
        return divorceDate;
    }

    public void setNumVIP1(int numVIP1)
    {
        this.numVIP1 = numVIP1;
    }

    public void setWeddingDate(LocalDate weddingDate)
    {
        this.weddingDate = weddingDate;
    }

    public void setNumVIP2(int numVIP2)
    {
        this.numVIP2 = numVIP2;
    }

    public void setPlaceWedding(String placeWedding)
    {
        this.placeWedding = placeWedding;
    }

    public void setDivorceDate(LocalDate divorceDate)
    {
        this.divorceDate = divorceDate;
    }

}
