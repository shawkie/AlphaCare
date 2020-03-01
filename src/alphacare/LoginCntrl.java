/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alphacare;

/**
 * Controller that handles a user logging in or if new, creating an account.
 * @author Project Team 5
 */

public class LoginCntrl {
    private UserListModel userListModel;
    private LoginView loginView;
    private TwoFactorView twoFactorView;
    private CreateAccountView createAccountView;

    public LoginCntrl(UserListModel userListModel, LoginView loginView, TwoFactorView twoFactorView, CreateAccountView createAccountView) {
        this.userListModel = userListModel;
        this.loginView = loginView;
        this.twoFactorView = twoFactorView;
        this.createAccountView = createAccountView;
    }
    
   
    public void authenticate(String userName, String password){
        System.out.println("Authenticated!");
    }
}
