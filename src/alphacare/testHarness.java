/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;
 
public class testHarness {
    private PatientModel patientModel;
    private PatientView patientView;
    private LoginCntrl loginCntl;
    private RecordListModel recordLM;
    private StaffModel staffModel;
    private UserModel userModel;
    private PatientRecordsView pRecordsView;
    private UserListModel userListModel;
    private LoginView loginView;
    private TwoFactorView twoFactorView;
    private CreateAccountView createAccountView;
    
    public void testHarness(){
       
        //tests PatientModel class
        patientModel = new PatientModel(1,"Suhyeok", "123 Calder Way", "4/2/97");
        patientModel.setName("Hamzah");
        patientModel.setAddress("1013 S. Allen St");
        patientModel.setBirthdate("10101997");
        
        //test PatientView class
        patientView = new PatientView();
        patientView.getPatientInfo("Hamzah Wahi, 1013 S. Allen ST, 10101997");
        
        //test LoginCntrl class
        loginCntl = new LoginCntrl();
        loginCntl.authenticate("Jeffrey", "password");
        
        //test RecordListModel class
        recordLM = new RecordListModel();
        recordLM.putRecord("sample data for record");
        System.out.println(recordLM.getRecord(1));
     
        //test StaffModel class
        staffModel = new StaffModel(1, "Dr. Oh", "Surgeon");
        staffModel.setName("Dr. Bang");
        staffModel.setPosition("Nurse");
        System.out.println(staffModel.toString());
        
        //test PatientRecordsView class
        pRecordsView = new PatientRecordsView(recordLM);
        pRecordsView.getPatientRecords();
        
        
        //test UserListModel class
        userListModel = new UserListModel();
        userListModel.putUser(new UserModel(1,"Hamzah","Kittens"));
        System.out.println(userListModel.getUserList());
        System.out.println("test successful");
        
        
        
        
    }
}
