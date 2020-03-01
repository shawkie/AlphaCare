/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alphacare;

import java.util.ArrayList;

/**
 * Model that will hold a list of application users.
 * @author Project Team 5
 */

public class UserListModel {
    private final ArrayList userList;
    
    public UserListModel(){
        userList = new ArrayList();
    }
    public String getUser()
    {

       return "";
    }
    
    public ArrayList getUserList(){
        return userList;
    }
     
     public void putUser(String putUser){
         userList.add(putUser);
     }
}
