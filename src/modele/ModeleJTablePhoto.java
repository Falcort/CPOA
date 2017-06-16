package modele;

import application.Main;
import database.DaoPhoto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Photo;

public class ModeleJTablePhoto extends AbstractTableModel
{

    private final List<Photo> leConteneur;

    private final String[] title;

    private final DaoPhoto DaoPhoto;

    public ModeleJTablePhoto()
    {
        this.leConteneur = new ArrayList<>();
        this.title = new String[]
        {
            "Place photo", "Year Photo", "Path photo"
        };
        this.DaoPhoto = Main.getDaoPhoto();
    }

    @Override
    public int getRowCount()
    {
        return leConteneur.size();
    }

    @Override
    public int getColumnCount()
    {
        return title.length;
    }

    @Override
    public Object getValueAt(int row, int column)
    {
        Photo photo = leConteneur.get(row);
        switch (column)
        {
            case 0:
                return photo.getPlacePhoto();
            case 1:
                return photo.getYearPhoto();
            case 2:
                return photo.getWayPhoto();            
        }
        return null;
    }

    @Override
    public String getColumnName(int column)
    {
        return title[column];
    }

    public void loadPhoto() throws SQLException
    {
        DaoPhoto.recupererPhoto(leConteneur);
        this.fireTableDataChanged();
    }

    public void insertPhoto(Photo photo) throws SQLException
    {
        DaoPhoto.insererPhoto(photo);
        leConteneur.add(photo);
        this.fireTableDataChanged();
    }

}
