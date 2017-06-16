package metier;

public class Photo
{
    private String placePhoto;
    private int yearPhoto;
    private String wayPhoto;
    
    
    public Photo(String placePhoto, int yearPhoto, String wayPhoto)
    {
        this.placePhoto = placePhoto;
        this.yearPhoto = yearPhoto;
        this.wayPhoto = wayPhoto;
    }

    public Photo()
    {

    }

    public String getPlacePhoto() {
        return placePhoto;
    }

    public int getYearPhoto() {
        return yearPhoto;
    }

    public String getWayPhoto() {
        return wayPhoto;
    }

    public void setPlacePhoto(String placePhoto) {
        this.placePhoto = placePhoto;
    }

    public void setYearPhoto(int yearPhoto) {
        this.yearPhoto = yearPhoto;
    }

    public void setWayPhoto(String wayPhoto) {
        this.wayPhoto = wayPhoto;
    }

    
}
