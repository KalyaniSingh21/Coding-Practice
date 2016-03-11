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
public class Quicksort {
    
    int arr[];
    
    void sort(int arr[])
    {
        this.arr = arr;
        if(arr.length == 0)
           return;
        
        int lowerindex = 0;
        int higherindex = arr.length -1;
        
        quicksort(lowerindex,higherindex);
               
    }
    
    void quicksort(int lowerindex, int higherindex)
    {
        int i = lowerindex;
        int j = higherindex;
        int pivot = arr[lowerindex + (higherindex - lowerindex)/2];
        while( i <= j )
        {
            while(arr[i] < pivot)
                i++;
            while(arr[j] > pivot)
                j--;
            
            if(i<=j)
            {
                exchange(i,j);
                i++;
                j--;
            }
        }
        
        if(lowerindex < j)
            quicksort(lowerindex,j);
        if(i < higherindex)
            quicksort(i,higherindex);
    }
    
    void exchange(int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        Quicksort qs = new Quicksort();
        int[] arr = {24,2,45,20,56,75,2,56,99,53,12};
        qs.sort(arr);
        
        for(int i :arr)
            System.out.print(i+"\t");
        
    }
    
}
