
package googlepractice;

public class NthFibonacci {
 /* Contemporary code 
    static int fibn(int N)
    {
       int a=0,b=1,c;
       c = a+b;
       int num = 1;
       while(num < N-1)
       {
           a=b;
           b=c;
           c=a+b;
           System.out.print(c+ " ");
           ++num;
       }
       
       return c; 
    }    
*/
    
 /*  recursive output*/
    static int fibn(int N)
    {       
        int n =N<=1 ? N : fibn(N-2) + fibn(N-1);
        return n; 
            }

    public static void main(String args[])
    {        
        // int n = fibn(5);
         System.out.println(fibn(6));
    
}
}
