/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DD4L;

import DD4L.Calculate;
import DD4L.Temp;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jer1140
 */
public class CalculateTest {
    
    public CalculateTest() {
    }
    /**
     * Test of Getperimeter method, of class Calculate.
     */
    @Test
    public void testGetperimeter() {
        Calculate square = new Calculate(1,2);
        assertEquals(6, square.Getperimeter());
        Calculate square2 = new Calculate(5,6);
        assertEquals(22, square2.Getperimeter());
    }
    
}
