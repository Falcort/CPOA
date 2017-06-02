package modele;

import application.Main;
import database.DaoVIP;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tables.Wedding;


public class ModeleJTableWedding extends AbstractTableModel {
    private final List<Wedding> leConteneur;
    
    private final String[] title;
    
    private final DaoVIP DaoWedding;
    
    public ModeleJTableVIP()
    {
        this.leConteneur = new ArrayList<>();
        this.title = new String[]{"Num VIP1", "Wedding Date", "Num VIP2", "Wedding Place", "Birthdate", "Born place", "Status", "Role", "Nationality"};
        this.DaoWedding = Main.getDaoWedding();
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
