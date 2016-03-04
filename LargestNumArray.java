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
public class LargestNumArray {
    
    static int larg(int[] arr)
    {
        int largest = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            if(arr[i]>largest)
                largest = arr[i];
         /*   else
                continue;  only the if stament can work too */
        }
        
        return largest;
    }
    
    public static void main(String args[])
    {
        int arr[] = {1,2,3,7,9,4};
        System.out.println(larg(arr));
    }
}
