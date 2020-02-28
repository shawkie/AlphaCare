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
public class LoginCntrlTest {
    
    public LoginCntrlTest() {
    }

    /**
     * Test of authenticate method, of class LoginCntrl.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String userName = "";
        String password = "";
        LoginCntrl instance = new LoginCntrl();
        instance.authenticate(userName, password);
        
        fail("Login Failed!");
    }
    
}
