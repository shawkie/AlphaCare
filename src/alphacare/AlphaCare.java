/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alphacare;
/**
 * Class that is called when the application first starts, will call other classes.
 * @author Brendan
 */

public class AlphaCare {
    public static testHarness testHarness;
    
    public static void main(String[] args) {
        testHarness = new testHarness();
        testHarness.testHarness();
       
//    private static testHarness testHarness;
   
    }
}
