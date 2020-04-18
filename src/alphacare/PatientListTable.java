/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Jeffrey Oh
 */
public class PatientListTable extends AbstractTableModel {
    
    private final List<PatientModel> pList;
    private final String[] columnNames = {"Name", "Address"};
    
    public PatientListTable(List<PatientModel> pList){
        this.pList = pList;
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
