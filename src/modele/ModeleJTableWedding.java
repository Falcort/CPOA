package modele;

import application.Main;
import database.DaoVIP;
import java.time.format.DateTimeFormatter;
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
        this.title = new String[]{"Num VIP1", "Wedding Date", "Num VIP2", "Wedding Place", "Divorce Date"};
        this.DaoWedding = Main.getDaoWedding();
    }

    @Override
    public int getRowCount() {
        return leConteneur.size();
    }

    @Override
    public int getColumnCount() {
        return title.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
         Wedding wedding = leConteneur.get(row);
        switch (column)
        {
            case 0:
                return wedding.getNumVIP1();
            case 1:
                return wedding.getWeddingDate();
            case 2:
                return wedding.getNumVIP2();
            case 3:
                return wedding.getPlaceWedding();
            case 4:
                return wedding.getDivorceDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));   
        }
        return null;
    }
}
