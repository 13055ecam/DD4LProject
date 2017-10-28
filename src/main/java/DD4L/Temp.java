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
public class Temp {
    
private Double DegreeTemp;

public Temp (double D)
	{
            this.DegreeTemp = D;
	}
public double getFara()
	{
            return  this.DegreeTemp*9/5+32;
	}
public double getKelvin()
	{
            return  this.DegreeTemp+273.15;
	}
}