package modele;

import application.Main;
import database.DaoVIP;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.VIP;

public class ModeleJTableVIP extends AbstractTableModel
{

    private final List<VIP> leConteneur;

    private final String[] title;

    private final DaoVIP DaoVIP;

    public ModeleJTableVIP()
    {
        this.leConteneur = new ArrayList<>();
        this.title = new String[]
        {
            "Num", "Last Name", "First Name", "Civility", "Birthdate", "Born place", "Status", "Role", "Nationality"
        };
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
                return vip.getCivility();
            case 4:
                return vip.getBornDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            case 5:
                return vip.getWhereBorn();
            case 6:
                return vip.getCodeStatus();
            case 7:
                return vip.getCodeRole();
            case 8:
                return vip.getNationality();
        }
        return null;
    }

    @Override
    public String getColumnName(int column)
    {
        return title[column];
    }

    public void loadVIP() throws SQLException
    {
        DaoVIP.recupererVIP(leConteneur);
        this.fireTableDataChanged();
    }

    public void insertVIP(VIP vip) throws SQLException
    {
        DaoVIP.insererVIP(vip);
        leConteneur.add(vip);
        this.fireTableDataChanged();
    }

    public void deleteVIP(int numLine) throws SQLException
    {
        int numVIP = (int) getValueAt(numLine, 0);
        DaoVIP.deleteVIP(numVIP);
        leConteneur.remove(numLine);
        this.fireTableDataChanged();
    }
}
