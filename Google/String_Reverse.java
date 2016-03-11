/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;

import java.util.Arrays;

/**
 *
 * @author Kalyani
 */
public class String_Reverse {

    public static String reverse(String s)
    {
      String result=null;
      char final_arr[] = new char[11];
      char arr[] = new char[15];
      arr = s.toCharArray();
      
      int x,n=0;
      for(x=s.length()-1; x>=0 ; x--,n++)   // pick up the length -1 because array starts from 0;
          //null value at the end of string is not included in length; lenth of abc is 3
      {
          final_arr[n] = arr[x];
          System.out.print(final_arr[n] +" "+arr[x] );
          System.out.println();
      }
      
      return new String(final_arr);
      
      /*  Better code
      public static String reverse ( String s ) {
        int length = s.length(), last = length - 1;
        char[] chars = s.toCharArray();
        for ( int i = 0; i < length/2; i++ ) {
            char c = chars[i];
            chars[i] = chars[last - i];
            chars[last - i] = c;
        }
        return new String(chars);
    }
      */
    }
    public static void main(String[] args) {
        
        String result = reverse("Hello World");
        System.out.println(result);
    }
    
}
