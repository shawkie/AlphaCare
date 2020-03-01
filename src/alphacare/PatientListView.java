package alphacare;
import java.util.ArrayList;
import javax.swing.JFrame;

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
    private PatientListModel model;
    private String patientListInfo;

    public String getPatientInfo(String patientListInfo) {
        return patientListInfo;
    }
    private PatientListView(PatientListModel model){
        
    }
}
