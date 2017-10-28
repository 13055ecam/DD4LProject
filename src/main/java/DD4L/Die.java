package DD4L;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jer1140
 */
public class Die {
private double nbFaces;
private double visibleFace;
    
public Die(int nbFaces,double visibleFace)
{
    this.nbFaces = nbFaces;
    this.visibleFace = (0.50 *this.nbFaces) + 1;
}
public double getVisibleFace()
{
    return this.visibleFace;    
}
/**
public static void main(String[] args) 
{
    Die myDie = new Die(12,0);//Création objet
    System.out.println ("Le nombre de face visible du dé est " + myDie.getVisibleFace());
}
**/
}