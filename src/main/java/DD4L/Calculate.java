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
public class Calculate {
 
    private int x;  
    private int y;
    private int width;
    private int height;
  
  public Calculate(int x, int y) 
  {  
        this.x = x; 
        this.y = y;
  }  
    public int Getperimeter() 
    {
        return 2*((this.x)+(this.y));
    }
}