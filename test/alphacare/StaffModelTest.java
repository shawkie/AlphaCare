/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Suhyeok Bang
 */
public class StaffModelTest {
    
    public StaffModelTest() {
    }
    
    /**
     * Test of setName method, of class StaffModel.
     */
    @Test
    public void testSetName() {
        System.out.println("set name");
        String name = "New Ham";
        StaffModel staffModel = new StaffModel("Ham","Doctor");
        staffModel.setName(name);
    }
    
    /**
     * Test of setPosition method, of class StaffModel.
     */
    @Test
    public void testSetPosition() {
        System.out.println("set position");
        String position = "Nurse";
        StaffModel staffModel = new StaffModel("Ham","Doctor");
        staffModel.setName(position);
    }

    /**
     * Test of toString method, of class StaffModel.
     */
    @Test
    public void testToString() {
        System.out.println("To String");
        StaffModel staffModel = new StaffModel("Ham","Doctor");
        String expResult = "StaffModel{name=Ham, position=Doctor}";
        String result = staffModel.toString();
        assertEquals(expResult, result);
    }
}
