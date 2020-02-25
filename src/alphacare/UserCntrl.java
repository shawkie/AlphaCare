/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

/**
 * Controller that will handle information related to different types of users and the views that show that information.
 * @author hamtaro
 */
public class UserCntrl {
    private PatientModel patientModel;
    private PatientListModel patientListModel;
    private StaffModel staffModel;
    private MenuView menuView;
    private PatientView patientView;
    private ProfileView profileView;
    private PatientListView patientListView;
    private PatientRecordsView patientRecordsView;

    public UserCntrl(PatientModel patientModel, PatientListModel patientListModel, StaffModel staffModel, MenuView menuView, PatientView patientView, ProfileView profileView, PatientListView patientListView, PatientRecordsView patientRecordsView) {
        this.patientModel = patientModel;
        this.patientListModel = patientListModel;
        this.staffModel = staffModel;
        this.menuView = menuView;
        this.patientView = patientView;
        this.profileView = profileView;
        this.patientListView = patientListView;
        this.patientRecordsView = patientRecordsView;
    }
    
    
    
}
