
package alphacare;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * View that will show a high level view of a patient.
 * @author Brendan
 */

public class PatientView extends JFrame {
    private PatientModel model;
    private String patientInfo;

    public PatientView(){
        
    }
    public String getPatientInfo(String patientInfo) {
        return patientInfo;
    }
    private  PatientView(PatientModel model){
        
    }
}
