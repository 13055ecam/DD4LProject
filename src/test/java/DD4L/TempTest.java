package DD4L;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DD4L.Temp;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author jer1140
 */
public class TempTest {
    
    public TempTest() {
    
    }

    @Test
    public void testGetFara() {
        Temp test = new Temp(12);
        assertEquals(53.6,test.getFara(),0.0);
        Temp test2 = new Temp(0);
        assertEquals(32,test2.getFara(),0.0);
    }

    /**
    Test of getKelvin method, of class Temp.
     */
    @Test
    public void testGetKelvin() 
       {
        Temp test = new Temp(12);
        assertEquals(285.15,test.getKelvin(),0.0);
        Temp test2 = new Temp(32);
        assertEquals(305.15,test2.getKelvin(),0.0);
       }
}