/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Controller that handles a user logging in or if new, creating an account.
 *
 * @author Project Team 5
 */
public class LoginCntrl {

    private UserListModel userListModel;
    private PatientListModel patientListModel;
    private UserModel testUser;
    private LoginView loginView;
    private CreateAccountView createAccountView;
    private MenuCntrl menuCntrl;
    private int userCount;
    private int patientCount;

    public LoginCntrl() {
        userListModel = new UserListModel();
        userCount = 1;
        patientCount = 1;
        

        loginView = new LoginView(this);
        createAccountView = new CreateAccountView(this);
        patientListModel = new PatientListModel();
        menuCntrl = new MenuCntrl();
        loginView.setVisible(true);
        
        
        testUser = new UserModel(1, "Admin", "admin");
        userListModel.putUser(testUser);
        
        System.out.println(userListModel.getUserList().get(0).getUsername());
        System.out.println(userListModel.getUserList().get(0).getPassword());

        
    }



    // depending on status show a warning or allow them into the application
    public boolean authenticate(String userName, String password) {
        
        boolean status = false;
        for (int i = 0; i < userListModel.getUserList().size(); i++) {
            status = getCredentials(i);
            System.out.println(status);
        }
        return status;

    }
    
    public void createNewUser(String name, String address, String birthDate, String username, String password){
        userCount++;
        patientCount++;
        userListModel.putUser(new UserModel(userCount, username, password));
        patientListModel.putPatient(new PatientModel(patientCount, name, address,birthDate));
        System.out.println(userListModel.getUserList().toString());
        System.out.println(patientListModel.getPatientList());
        
        loginView.setVisible(true);
        createAccountView.setVisible(false);
    }
    
   public void loginAccount(){
       if(authenticate(loginView.getUserName(),loginView.getPassword())){
           switchToMenu();
       }
   }
    
   private void switchToMenu(){
       loginView.setVisible(false);
       menuCntrl.switchToMenu();
   }

   public void switchToCreateAccount(){
       loginView.setVisible(false);
       createAccountView.setVisible(true);
   }

    //fetches variables from the view and model and compares them,
    //if they match return true, if they dont return false
    private boolean getCredentials(int i) {
        String userName = userListModel.getUserList().get(i).getUsername();
        String password = userListModel.getUserList().get(i).getPassword();

        String userNameInput = loginView.getUserName();
        String userPasswordInput = loginView.getPassword();

        if (userNameInput.equals(userName) && userPasswordInput.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    
    
}
