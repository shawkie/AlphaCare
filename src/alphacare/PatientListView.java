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
    private ArrayList<PatientModel> patientList;
    
    public PatientModel getPatient(int patientNum) {
       return (PatientModel) patientList.get(patientNum);
    }
    
    public PatientModel getPatient(String patientName){
        for (PatientModel patient : patientList) {
            if(patient.getName().equals(patientName)){
                return patient;
            }
        }
        return null;
    }
     
     public void putPatient(PatientModel putRecord){
         patientList.add(putRecord);
     }
     
    @Override
    public String toString() {
        return "PatientListModel{ Holds ArrayList of Patients of size: " + patientList.size() + '}';
    }
}
