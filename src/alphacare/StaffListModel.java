/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.util.ArrayList;

/**
 *
 * @author hamtaro
 */
public class StaffListModel {
    private ArrayList<StaffModel> staffList;
    
    private static final StaffListModel STAFFLIST = new StaffListModel();
    
    private StaffListModel(){
        staffList = new ArrayList();
    }
    
    public static StaffListModel getInstance(){
        return STAFFLIST;
    }
    
    public StaffModel getStaff(int id){
        for (StaffModel staff : staffList) {
            if (staff.getId() == id) {
                return staff;
            }
        }
        return null;
    }
}
