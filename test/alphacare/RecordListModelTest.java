/*
 * Remove unused code! Trust the process.
 */
package alphacare;

import java.util.ArrayList;
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
        int index = 0;
        RecordListModel instance = new RecordListModel();
        Object expResult = "";
        Object result = instance.getRecord(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRecordList method, of class RecordListModel.
     */
    @Test
    public void testGetRecordList() {
        System.out.println("getRecordList");
        RecordListModel instance = new RecordListModel();
        ArrayList expResult = new ArrayList();
        expResult.add("");
        ArrayList result = instance.getRecordList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
