package modele;

import application.Main;
import database.DaoVIP;
import database.DaoWedding;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Wedding;

public class ModeleJTableWedding extends AbstractTableModel
{

    private List<Wedding> leConteneur;

    private final String[] title;

    private final DaoWedding DaoWedding;

    public ModeleJTableWedding()
    {
        this.leConteneur = new ArrayList<>();
        this.title = new String[]
        {
            "Num VIP1", "LastName FirstName VIP1", "Wedding Date", "Num VIP2", "LastName FirstName VIP2", "Wedding Place", "Divorce Date"
        };
        this.DaoWedding = Main.getDaoWedding();
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
        Wedding wedding = leConteneur.get(row);
        switch (column)
        {
            case 0:
                return wedding.getNumVIP1();
            case 1:
                return wedding.getLastNameVIP1();
            case 2:
                return wedding.getWeddingDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            case 3:
                return wedding.getNumVIP2();
            case 4:
                return wedding.getLastNameVIP2();
            case 5:
                return wedding.getPlaceWedding();
            case 6:
                if (wedding.getDivorceDate().equals(LocalDate.parse("0001-01-01")))
                {
                    return "Not divorced";
                } else
                {
                    return wedding.getDivorceDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                }
        }
        return null;
    }

    @Override
    public String getColumnName(int column)
    {
        return title[column];
    }

    public void loadWedding() throws SQLException
    {
        DaoWedding.recupererWedding(leConteneur);
        this.fireTableDataChanged();
    }

    public void insertWedding(Wedding wedding) throws SQLException
    {
        DaoWedding.insertWedding(wedding);
        leConteneur.add(wedding);
        leConteneur = new ArrayList<>();
        DaoWedding.recupererWedding(leConteneur);
        this.fireTableDataChanged();
    }

    public void updateWedding(Wedding wedding) throws SQLException
    {
        DaoWedding.updateWedding(wedding);
        leConteneur = new ArrayList<>();
        DaoWedding.recupererWedding(leConteneur);
        this.fireTableDataChanged();
    }

}
