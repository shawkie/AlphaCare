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
public class RecordListModelTest {
    
    public RecordListModelTest() {
    }

    /**
     * Test of getRecord method, of class RecordListModel.
     */
    @Test
    public void testGetRecord() {
        System.out.println("getRecord");
        RecordListModel instance = new RecordListModel();
        String expResult = "";
        String result = instance.getRecord();
        assertEquals(expResult, result);
        // fail protocol
        fail("Record could not be retrieved.");
    }

    /**
     * Test of putRecord method, of class RecordListModel.
     */
    @Test
    public void testPutRecord() {
        System.out.println("putRecord");
        String putRecord = "";
        RecordListModel instance = new RecordListModel();
        instance.putRecord(putRecord);
        // fail protocol
        fail("Record was not placed.");
    }
    
}
