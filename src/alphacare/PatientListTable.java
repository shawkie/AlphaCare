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
    
    public String[] getColumnNames(){
        return columnNames;
    }
    
    public String getColumnName(int i){
        return columnNames[i];
    }
    
    
    @Override
    public int getRowCount() {
        return pList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return (Object) pList.get(rowIndex).getId();
            case 1:
                return (Object) pList.get(rowIndex).getName();
            default:
                return null;
        }
    }
    
}
