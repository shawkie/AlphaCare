package alphacare;
import java.awt.Dimension;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * View that will show patients to user that has access to those particular patients.
 * @author Brendan
 */


public class PatientListView extends JFrame{
    private PatientListCntrl patientListCntrl;
    private JPanel content;
    private PatientListModel pList;
    private JTable table;
    private DefaultListModel<String> listModel;
    
    public String getPatientInfo(String patientListInfo) {
        return patientListInfo;
    }
    public PatientListView(PatientListCntrl patientListCntrl){
        this.patientListCntrl = patientListCntrl;
        pList = patientListCntrl.getPatientList();
        
        initComponents();
        
    }

    private void initComponents() {
        setTitle("Patient Directory");
        setSize(600,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        content = new JPanel();
        content.setPreferredSize(new Dimension(350, 150));
        
    }
}
