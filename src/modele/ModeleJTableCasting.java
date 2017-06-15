package modele;

import application.Main;
import database.DaoCasting;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Casting;

public class ModeleJTableCasting extends AbstractTableModel
{

    private final List<Casting> leConteneur;
    private final String[] title;
    private final DaoCasting DaoCasting;

    public ModeleJTableCasting()
    {
        this.leConteneur = new ArrayList<>();
        this.title = new String[]
        {
            "Visa", "Num VIP Casting", "Role"
        };
        this.DaoCasting = Main.getDaoCasting();
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
        Casting casting = leConteneur.get(row);
        switch (column)
        {
            case 0:
                return casting.getNumVISACasting();
            case 1:
                return casting.getNumVIPCasting();
            case 2:
                return casting.getRoleCasting();
        }
        return null;
    }

    @Override
    public String getColumnName(int column)
    {
        return title[column];
    }

    public void loadCasting() throws SQLException
    {
        DaoCasting.recupererCasting(leConteneur);
        this.fireTableDataChanged();
    }

    public void insertCasting(Casting casting) throws SQLException
    {
        DaoCasting.insertCasting(casting);
        leConteneur.add(casting);
        this.fireTableDataChanged();
    }

}
