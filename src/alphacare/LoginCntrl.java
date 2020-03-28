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
    private LoginView loginView;
    private TwoFactorView twoFactorView;
    private CreateAccountView createAccountView;
    private StaffModel staffModel;

    public LoginCntrl() {
        userListModel = new UserListModel();
        staffModel = new StaffModel(1, "","");
        loginView = new LoginView(this);
        createAccountView = new CreateAccountView();
        twoFactorView = new TwoFactorView(staffModel);
        loginView.setVisible(true);
        
        
    }



    // depending on status show a warning or allow them into the application
    public boolean authenticate(String userName, String password) {

        boolean status = false;
        for (int i = 0; i < userListModel.getUserList().size(); i++) {
           // status = getCredentials(i);
        }
        return status;

    }
    

   public void switchToCreateAccount(){
       loginView.setVisible(false);
       createAccountView.setVisible(true);
   }

    //fetches variables from the view and model and compares them,
    //if they match return true, if they dont return false
//    private boolean getCredentials(int i) {
//        String userName = userListModel.getUserList().get(i).getUserName();
//        String password = userListModel.getUserList().get(i).getPassword();
//
//        String userNameInput = loginView.getUserName();
//        String userPasswordInput = loginView.getPassword();
//
//        if (userNameInput.equals(userName) && userPasswordInput.equals(password)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
