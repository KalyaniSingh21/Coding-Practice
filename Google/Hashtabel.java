/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;
import java.util.*;

public class Hashtabel{
    public static void main(String[] args)
    {
        Hashtable<Integer,Double> ht = new Hashtable<Integer,Double>();
        
        ht.put(1, 1.1);
        ht.put(2, 2.1);
        ht.put(3, 3.1);
        ht.put(4, 4.1);
        int key;
        Enumeration keys = ht.keys();  // required if you want to traverse the hashtable, 
        //Enumeration is a String and that is why we need to cast it line 24
         /* Another way of implementing iterator for easy access of elements
        Set<Integer> set = ht.keySet();
        Iterator it = set.iterator();
        
        while(it.hasNext())
        {
            System.out.println(ht.get(it.next()));
        }
        
        */
        
        while(keys.hasMoreElements())
        {
            key = (int) keys.nextElement(); //required to get single value at a time
            System.out.println("Keys "+key+" Values "+ ht.get(key));
        }
        
        double value = ht.get(3);
        ht.put(3,value+7);
        System.out.println("Keys "+3+" Values "+ ht.get(3));
    }
}