package DD4L;


import DD4L.Die;
import DD4L.Calculate;
import DD4L.Temp;

/**
 *
 * @author jer1140
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
{
    Die myDie = new Die(12,0);//Création objet
    System.out.println ("Le nombre de face visible du dé est " + myDie.getVisibleFace());
    Temp MyTemp = new Temp(32);
    System.out.println ("La température est de " + MyTemp.getFara()+ " F° ou " + MyTemp.getKelvin()+" Kelvin");
    Calculate square = new Calculate(5,6);
    System.out.println ("Le périmètre du carré est " + square.Getperimeter());
}
}