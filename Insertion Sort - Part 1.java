import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
    int n=ar.length;
        int sum=0;
      int temp=ar[n-1];
         for(int i=n-2;i>=0;i--){ 
             sum=sum+1;
             //System.out.println(sum);
             if(ar[i]<temp){
                 sum=sum-1;
                 ar[i+1]=temp;
                 break;
             }

             else{
                 ar[i+1]=ar[i];
             }
             printArray(ar);
         }
         if(sum==n-1){
             ar[0]=temp;
         }
         printArray(ar);
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
