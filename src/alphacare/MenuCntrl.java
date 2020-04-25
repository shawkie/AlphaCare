/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

/**
 *
 * @author bso5036
 */
public class MenuCntrl {
    private MenuView menuView;
    private PatientListCntrl patientListCntrl;
    private ScheduleAppointment scheduleAppointment;
    
    public MenuCntrl(){
        menuView = new MenuView(this);
        patientListCntrl = new PatientListCntrl();
    }
    
    public void switchToMenu(){
        menuView.setVisible(true);
    }
    
    public void switchToPaitentList(){
        System.out.println("Patient List");
        menuView.setVisible(false);
        patientListCntrl.switchToPatientListView();
    }
    
    public void switchToAppointment() {
        javafx.application.Application.launch(ScheduleAppointment.class);
    }

    public void addNewPatient() {
        //nothing as of yet
    }
}
