package modele;

import application.Main;
import database.DaoTag;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Tag;

public class ModeleJTableTag extends AbstractTableModel
{

    private final List<Tag> leConteneur;

    private final String[] title;

    private final DaoTag DaoTAG;

    public ModeleJTableTag()
    {
        this.leConteneur = new ArrayList<>();
        this.title = new String[]
        {
            "Num VIP", "num Photo"
        };
        this.DaoTAG = Main.getDaoTag();
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
        Tag tag = leConteneur.get(row);
        switch (column)
        {
            case 0:
                return tag.getNumVIP();
            case 1:
                return tag.getNumPhoto();
        }
        return null;
    }

    @Override
    public String getColumnName(int column)
    {
        return title[column];
    }

    public void loadTag() throws SQLException
    {
        DaoTAG.recupererTAG(leConteneur);
        this.fireTableDataChanged();
    }

    public void insertTag(Tag tag) throws SQLException
    {
        DaoTAG.insererTAG(tag);
        leConteneur.add(tag);
        this.fireTableDataChanged();
    }

    public void deleteTag(int numLine) throws SQLException
    {
        int numVIP1 = (int) getValueAt(numLine, 0);
        DaoTAG.deleteTAG(numVIP1);
        leConteneur.remove(numLine);
        this.fireTableDataChanged();
    }
}
