/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.util.ArrayList;

/**
 * Model that will hold a list of application users.
 *
 * @author Project Team 5
 */
public class UserListModel {

    private final ArrayList<UserModel> userList;

    private static final UserListModel USERLIST = new UserListModel();

    public UserListModel() {
        userList = new ArrayList();
    }

    public static UserListModel getInstance() {
        return USERLIST;
    }

    public UserModel getUser(int id) {
       for(UserModel user : userList){
           if (user.getId() == id) {
               return user;
           }
       }
       return null;
    }
    
    public UserModel getUser(String username, String password) {
       for(UserModel user : userList){
           if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
               return user;
           }
       }
       return null;
    }

    public ArrayList getUserList() {
        return userList;
    }

    public void putUser(UserModel putUser) {
        userList.add(putUser);
    }

    public void putPatient(String putRecord) {

    }

    public String getStaff() {

        return "";
    }

    public void putStaff(String putRecord) {

    }
}
