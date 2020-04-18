package alphacare;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    private String patientListInfo;
    private JLabel patietListLabel;
    private JPanel content;
    
    public String getPatientInfo(String patientListInfo) {
        return patientListInfo;
    }
    public PatientListView(PatientListCntrl patientListCntrl){
        this.patientListCntrl = patientListCntrl;
        content = new JPanel();
        patietListLabel = new JLabel("Patient List");
       
        
        content.setPreferredSize(new Dimension(350, 150));
        content.add(patietListLabel);
        
        this.setContentPane(content);
        this.pack();// helps display nicers
        this.setTitle("Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
