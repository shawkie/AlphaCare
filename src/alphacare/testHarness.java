/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;


public class testHarness {
    private PatientModel patientModel;
    private PatientView patientView;
    
    public void testHarness(){
        patientModel.setName("Hamzah");
        patientModel.setAddress("1013 S. Allen St");
        patientModel.setBirthdate("10101997");
        patientView.getPatientInfo("Hamzah Wahi, 1013 S. Allen ST, 10101997");
    }
}
