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


public class OddNumbers {
    
    static void printodd()
    {
     for (int i=1 ; i<100; i+=2)
     {
      // if(i%2 != 0)
           System.out.print(i +"\t"); 
     }
    }
    //insted of checking everytime, doing modulo with 2, take i=i+2
    public static void main(String args[])
    {
        printodd();
    }

    
    
}
