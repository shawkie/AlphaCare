/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alphacare;
/**
 * Class that is called when the application first starts, will call other classes.
 * @author Brendan
 */

public class AlphaCare {
    
    
    public static void main(String[] args) {
   
        
        //tests view
//        UserListModel userListModel = new UserListModel();
//        StaffModel staffModel = new StaffModel(1, "","");
//        CreateAccountView createAccountView = new CreateAccountView();
//        TwoFactorView twoFactorView = new TwoFactorView(staffModel);
        
        LoginCntrl loginCntrl = new LoginCntrl();
        

        //loginView.setVisible(true);
        
    }
}
