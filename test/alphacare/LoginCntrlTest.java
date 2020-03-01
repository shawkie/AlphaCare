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
 * @author hamtaro
 */
public class LoginCntrlTest {
    
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
        assertEquals("","");
        fail("Not authenticated");
    }
    
}
