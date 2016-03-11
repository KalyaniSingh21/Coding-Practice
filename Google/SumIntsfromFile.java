/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;
import java.io.*;
/**
 *
 * @author Kalyani
 */
public class SumIntsfromFile {
    public static void main(String args[])
    {
        try
        {
        String s = null;
        int sum = 0;
        BufferedReader in = new BufferedReader(new FileReader("C:/Users/Kalyani/Documents/NetBeansProjects/"
                + "GooglePractice/src/googlepractice/Accessfile.txt"));
        for(s=in.readLine(); s!= null ; s=in.readLine())
             sum = sum + Integer.parseInt(s);
        
        System.out.println(sum);
        }
        
        catch(IOException | NumberFormatException e)
        {   System.out.print(e);
        }       
    }
    
}
