/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.util.ArrayList;

/**
 * Model that holds the list that holds different patients.
 * @author hamtaro
 */
public class PatientListModel {
    private ArrayList<PatientModel> patientList;
    
    private static final PatientListModel PATIENTLIST = new PatientListModel();
    
    public PatientListModel(){
        patientList = new ArrayList();
    }
    
    public static PatientListModel getInstance(){
        return PATIENTLIST;
    }
    
    public ArrayList<PatientModel> getPatientList() {
        return patientList;
    }
    
    public PatientModel getPatient(int id) {
       for (PatientModel patient : patientList) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
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
