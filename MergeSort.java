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
public class MergeSort {
    
   static int[] numbers;
   static int[] helpers;
   static int size;
   
    
  static  void sort(int[] numbers)
    {
        MergeSort.numbers = numbers;
        
        size = numbers.length;
        helpers = new int[size];
        int low = 0;
        int high = numbers.length-1;
         mergesort(0, high);
       // return sorted;
    }
    
  static  void mergesort(int low, int high)
    {
        if(low < high)
        {
            int middle = low + ( high - low)/2;
            mergesort(low,middle);
            mergesort(middle+1,high);
            merge(low,middle,high);
        }
        
    }
    
  static  void merge(int low, int middle, int high)
    {
        for(int i =low; i< high; i++)
            helpers[i] = numbers[i];
        
        int j = low,k = middle+1,m =low;
                
        while(j <= middle && k <=high)
        {
            if(helpers[j] <= helpers[k])
            {
                numbers[m] = helpers[j];
                j++;
            }
            else
            {
                numbers[m] = helpers[k];
                k++;
            }
                
            m++;
                
        }
        
        while(j <= middle)
        { 
          numbers[m] = helpers[j];
          m++;
          j++;
        }
        while(k<=high)
        {
            numbers[m] = helpers[k];
            m++;
            j++;
        }   
    }
    
    public static void main(String[] args)
    {
        int[] numbers = {18,0,9,20,41,7,13,4};
        sort(numbers);
        for(int n =0;n<numbers.length;n++)
            System.out.print(numbers[n]+"\t");
        
        System.out.println();
    }
    
}
