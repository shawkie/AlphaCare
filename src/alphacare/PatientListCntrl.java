/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import javax.swing.JOptionPane;

/**
 * Controller that will handle lists of patients that a medical professional has access to.
 * @author hamtaro
 */
public class PatientListCntrl {
    private PatientListModel model;
    private PatientListView patientListView;

    public PatientListCntrl() {
        model = new PatientListModel();
        patientListView = new PatientListView(this);
    }
    
    public void switchToPatientListView(){
        patientListView.setVisible(true);
    }
    
    public PatientListModel getPatientList(){
        return model;
    }
    
    public void addNewPatient(){
        int idNum = model.getPatientList().size() + 1;
        String name = JOptionPane.showInputDialog("Enter the Patient's Name:");
        String address = JOptionPane.showInputDialog("Enter the Patient's Address:");
        String birthdate = JOptionPane.showInputDialog("Enter the Patient's Birthdate:");
        
        model.getPatientList().add(new PatientModel(idNum,name,address,birthdate));
    }
    
}
