/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;

/**
 *
 * @author Kalyani
 */
public class RGBFormat {
    static String rgb(int r, int g,int b)
    {      
        return (toHex(r)+toHex(g)+toHex(b));
    
    }
    static String toHex(int color)
    {
        String s = Integer.toHexString(color);
        return (s.length() == 1)? "0"+s:s;
    }
    
    public static void main(String args[])
    {
        System.out.println(rgb(255,48,255));
    }
    
}
