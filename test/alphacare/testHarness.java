/*
 * Remove unused code! Trust the process.
 */
package alphacare;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author Jeffrey Oh
 */
public class testHarness {
    
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(testCollection.class);
        result.getFailures().forEach((failure) -> {
            System.out.println(failure.toString());
        });
        
        System.out.println(result.wasSuccessful());
    }

   
}
