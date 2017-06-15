package metier;


public class Realisation {
    private int numVISARealisation;
    private int numVIPRealisation;
    
    public Realisation()
    {

    }

    public Realisation(int numVISARealisation, int numVIPRealisation)
    {
        this.numVISARealisation = numVISARealisation;
        this.numVIPRealisation = numVIPRealisation;
    }

    public int getNumVISARealisation() {
        return numVISARealisation;
    }

    public int getNumVIPRealisation() {
        return numVIPRealisation;
    }

    public void setNumVISARealisation(int numVISARealisation) {
        this.numVISARealisation = numVISARealisation;
    }

    public void setNumVIPRealisation(int numVIPRealisation) {
        this.numVIPRealisation = numVIPRealisation;
    }
    
}
