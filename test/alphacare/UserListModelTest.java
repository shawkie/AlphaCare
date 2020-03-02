/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hamtaro
 */
public class UserListModelTest {
    

    /**
     * Test of getUser method, of class UserListModel.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        UserListModel instance = new UserListModel();
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserList method, of class UserListModel.
     */
    @Test
    public void testGetUserList() {
        System.out.println("getUserList");
        UserListModel instance = new UserListModel();
        ArrayList expResult = null;
        ArrayList result = instance.getUserList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of putUser method, of class UserListModel.
     */
    @Test
    public void testPutUser() {
        System.out.println("putUser");
        String putUser = "";
        UserListModel instance = new UserListModel();
        instance.putUser(putUser);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of putPatient method, of class UserListModel.
     */
    @Test
    public void testPutPatient() {
        System.out.println("putPatient");
        String putRecord = "";
        UserListModel instance = new UserListModel();
        instance.putPatient(putRecord);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStaff method, of class UserListModel.
     */
    @org.junit.Test
    public void testGetStaff() {
        System.out.println("getStaff");
        UserListModel instance = new UserListModel();
        String expResult = "";
        String result = instance.getStaff();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of putStaff method, of class UserListModel.
     */
    @org.junit.Test
    public void testPutStaff() {
        System.out.println("putStaff");
        String putRecord = "";
        UserListModel instance = new UserListModel();
        instance.putStaff(putRecord);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
