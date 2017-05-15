package metier;

/**
 *
 * @author Alain
 */
public class classmetier1 {

    private int numDept;
    private String nomDept;
    private String villeDept;

    public classmetier1() {
    }

    public classmetier1(int numDept, String nomDept, String villeDept) {
        this.numDept = numDept;
        this.nomDept = nomDept;
        this.villeDept = villeDept;
    }

    public int getNumDept() {
        return numDept;
    }

    public String getNomDept() {
        return nomDept;
    }

    public String getVilleDept() {
        return villeDept;
    }

}
