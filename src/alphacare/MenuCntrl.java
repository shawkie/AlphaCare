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

    void addNewPatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
