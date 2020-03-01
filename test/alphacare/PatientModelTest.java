/*
 * Remove unused code! Trust the process.
 */
package alphacare;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeffrey Oh
 */
public class PatientModelTest {
    
    public PatientModelTest() {
    }

    /**
     * Test of setName method, of class PatientModel.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "newName";
        PatientModel instance = new PatientModel("name","address","birthdate");
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("failed");
    }

    /**
     * Test of setAddress method, of class PatientModel.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "newaddress";
        PatientModel instance = new PatientModel("","","");
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        //fail("failed");
    }

    /**
     * Test of setBirthdate method, of class PatientModel.
     */
    @Test
    public void testSetBirthdate() {
        System.out.println("setBirthdate");
        String birthdate = "happybirthday";
        PatientModel instance = new PatientModel("","","");
        instance.setBirthdate(birthdate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("failed");
    }

    /**
     * Test of toString method, of class PatientModel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PatientModel instance = new PatientModel("name","address","birthdate");
        String expResult = "name: nameaddress: addressbirthdate: birthdate";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("failed");
    }
    
}
