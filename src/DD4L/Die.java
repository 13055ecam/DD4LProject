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
    this.visibleFace = (Math.random() * this.nbFaces) + 1;
}
public double getVisibleFace()
{
    return this.visibleFace;    
}
}
