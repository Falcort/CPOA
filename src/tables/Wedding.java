package tables;

import java.time.LocalDate;


public class Wedding {
    private int numVIP1;
    private LocalDate weddingDate;
    private int numVIP2;
    private String placeWedding;
    private LocalDate divorceDate;

    public Wedding(int numVIP1, LocalDate weddingDate, int numVIP2, String placeWedding, LocalDate divorceDate) {
        this.numVIP1 = numVIP1;
        this.divorceDate = divorceDate;
        this.numVIP2 = numVIP2;
        this.placeWedding = placeWedding;
        this.divorceDate = divorceDate;
    }

    public Wedding(){   
    }

    public int getNumVIP1() {
        return numVIP1;
    }

    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public int getNumVIP2() {
        return numVIP2;
    }

    public String getPlaceWedding() {
        return placeWedding;
    }

    public LocalDate getDivorceDate() {
        return divorceDate;
    }

    public void setNumVIP1(int numVIP1) {
        this.numVIP1 = numVIP1;
    }

    public void setWeddingDate(LocalDate weddingDate) {
        this.weddingDate = weddingDate;
    }

    public void setNumVIP2(int numVIP2) {
        this.numVIP2 = numVIP2;
    }

    public void setPlaceWedding(String placeWedding) {
        this.placeWedding = placeWedding;
    }

    public void setDivorceDate(LocalDate divorceDate) {
        this.divorceDate = divorceDate;
    }
    
    
}
