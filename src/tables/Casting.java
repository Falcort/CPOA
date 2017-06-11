package tables;


public class Casting {
    private int numVISACasting;
    private int numVIPCasting;
    
    public Casting()
    {

    }

    public Casting(int numVISACasting, int numVIPCasting)
    {
        this.numVISACasting = numVISACasting;
        this.numVIPCasting = numVIPCasting;
    }

    public int getNumVISACasting() {
        return numVISACasting;
    }

    public int getNumVIPCasting() {
        return numVIPCasting;
    }

    public void setNumVISACasting(int numVISACasting) {
        this.numVISACasting = numVISACasting;
    }

    public void setNumVIPCasting(int numVIPCasting) {
        this.numVIPCasting = numVIPCasting;
    }
    
}
