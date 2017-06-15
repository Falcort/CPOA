package metier;


public class Casting {
    private int numVISACasting;
    private int numVIPCasting;
    private String roleCasting;
    
    public Casting()
    {

    }

    public Casting(int numVISACasting, int numVIPCasting, String roleCasting)
    {
        this.numVISACasting = numVISACasting;
        this.numVIPCasting = numVIPCasting;
        this.roleCasting = roleCasting;
    }

    public void setRoleCasting(String roleCasting) {
        this.roleCasting = roleCasting;
    }

    public String getRoleCasting() {
        return roleCasting;
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
