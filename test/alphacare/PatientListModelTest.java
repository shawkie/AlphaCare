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
 * @author bso5036
 */
public class PatientListModelTest {
    
    public PatientListModelTest() {
    }

    /**
     * Test of putPatient method, of class PatientListModel.
     */
    @Test
    public void testPutPatient() {
        System.out.println("putPatient");
        PatientModel putRecord = new PatientModel("name", "address", "birthdate");
        PatientListModel instance = new PatientListModel();
        instance.putPatient(putRecord);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class PatientListModel.
     */
    @Test
    public void testGetPatient_int() {
        System.out.println("getPatient");
        int patientNum = 0;
        PatientListModel instance = new PatientListModel();
        instance.putPatient(new PatientModel("name", "address", "birthdate"));
        PatientModel expResult = new PatientModel("name", "address", "birthdate");
        PatientModel result = instance.getPatient(patientNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class PatientListModel.
     */
    @Test
    public void testGetPatient_String() {
        System.out.println("getPatient");
        String patientName = "name";
        PatientListModel instance = new PatientListModel();
        instance.putPatient(new PatientModel("name", "address", "birthdate"));
        PatientModel expResult = new PatientModel("name", "address", "birthdate");
        PatientModel result = instance.getPatient(patientName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PatientListModel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PatientListModel instance = new PatientListModel();
        instance.putPatient(new PatientModel("name", "address", "birthdate"));
        String expResult = "PatientListModel{ Holds ArrayList of Patients of size: 1}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
