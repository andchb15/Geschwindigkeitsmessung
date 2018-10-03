package ex0004;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Christopher Andrä
 */
public class VeloCityTableModel extends AbstractTableModel
{

    private ArrayList<Measurement> liste = new ArrayList();
    private static final String[] colnames =
    {
        "Datum", "Uhrzeit", "Kennzeichen", "Gemessen", "Erlaubt", "Übertretung"
    };

    @Override
    public int getRowCount()
    {
        return liste.size();
    }

    @Override
    public int getColumnCount()
    {
        return colnames.length;
    }

    @Override
    public String getColumnName(int column)
    {
        return colnames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Measurement m = liste.get(rowIndex);
        switch (columnIndex)
        {
            case 0:
                return m.getDate();
            case 1:
                return m.getTime();
            case 2:
                return m.getKennzeichen();
            case 3:
                return m.getGemesseneGeschw();
            case 4:
                return m.getErlaubteGeschw();
            case 5:
                return m.getUeberttretung();
            default:
                return "???";
        }

    }

}
