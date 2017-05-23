package modele;

import application.Main;
import database.DaoVIP;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tables.VIP;

public class ModeleJTableVIP extends AbstractTableModel
{
    private final List<VIP> leConteneur;
    
    private final String[] title;
    
    private final DaoVIP DaoVIP;
    
    public ModeleJTableVIP()
    {
        this.leConteneur = new ArrayList<>();
        this.title = new String[]{"Num", "Last Name", "First Name", "Civilite", "Birthdate", "Born place", "Status", "Role"};
        this.DaoVIP = Main.getDaoVIP();
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
        VIP vip = leConteneur.get(row);
        switch (column)
        {
            case 0:
                return vip.getNumVIP();
            case 1:
                return vip.getLastName();
            case 2:
                return vip.getFirstName();
            case 3:
                return vip.getCivilite();
            case 4:
                return vip.getBornDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            case 5:
                return vip.getWhereBorn();
            case 6:
                return vip.getCodeStatus();
            case 7:
                return vip.getCodeRole();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return title[column];
    }
    
    public void chargerLesVIP() throws SQLException
    {
        DaoVIP.recupererVIP(leConteneur);
        this.fireTableDataChanged();
    }
}