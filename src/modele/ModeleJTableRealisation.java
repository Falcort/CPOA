package modele;

import application.Main;
import database.DaoRealisation;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Realisation;

public class ModeleJTableRealisation extends AbstractTableModel
{

    private final List<Realisation> leConteneur;
    private final String[] title;
    private final DaoRealisation DaoRealisation;

    public ModeleJTableRealisation()
    {
        this.leConteneur = new ArrayList<>();
        this.title = new String[]
        {
            "Visa", "Num VIP Realisation"
        };
        this.DaoRealisation = Main.getDaoRealisation();
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
        Realisation realisation = leConteneur.get(row);
        switch (column)
        {
            case 0:
                return realisation.getNumVISARealisation();
            case 1:
                return realisation.getNumVIPRealisation();
        }
        return null;
    }

    @Override
    public String getColumnName(int column)
    {
        return title[column];
    }

    public void loadRealisation() throws SQLException
    {
        DaoRealisation.recupererRealisation(leConteneur);
        this.fireTableDataChanged();
    }

    public void insertRealisation(Realisation realisation) throws SQLException
    {
        DaoRealisation.insertRealisation(realisation);
        leConteneur.add(realisation);
        this.fireTableDataChanged();
    }

}
