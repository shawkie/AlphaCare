/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * View that allows user to see a particular record and its details.
 * @author Brendan
 */

public class RecordView extends JFrame{
    private RecordListModel model;
    private int currentIndex;
    private PatientListCntrl pListCntrl;
    private JLabel nameLabel;
    private JLabel IDLabel;
    
    public RecordView (RecordListModel model){
        
    }

    public RecordView(PatientListCntrl patientListCntrl, int startingIndex) {
        pListCntrl = patientListCntrl;
        currentIndex = startingIndex;
        initComponents();
    }

    private void initComponents() {
        
    }

    
}
