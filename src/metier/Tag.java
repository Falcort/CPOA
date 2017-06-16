package metier;

public class Tag
{
    private int numVIP;
    private int numPhoto;
    
    
    public Tag(int numVIP, int numPhoto)
    {
        this.numVIP = numVIP;
        this.numPhoto = numPhoto;
    }

    public Tag()
    {

    }

    public int getNumVIP() {
        return numVIP;
    }

    public int getNumPhoto() {
        return numPhoto;
    }

    public void setNumVIP(int numVIP) {
        this.numVIP = numVIP;
    }

    public void setNumPhoto(int numPhoto) {
        this.numPhoto = numPhoto;
    }

}