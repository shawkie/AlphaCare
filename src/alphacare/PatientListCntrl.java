/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

/**
 * Controller that will handle lists of patients that a medical professional has access to.
 * @author hamtaro
 */
public class PatientListCntrl {
    private PatientListModel model;
    private PatientListView patientListView;

    public PatientListCntrl() {
        //this.model = model;
        this.patientListView = new PatientListView(this);
    }
    
    public void switchToPatientListView(){
        patientListView.setVisible(true);
    }
}
