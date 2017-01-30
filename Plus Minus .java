import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           float p[] = new float[n];
           for(int i=0; i < n; i++){
                   p[i] = in.nextFloat();  
           }
           float sum1=0;
           float sum2=0;
           float sum3=0;
           for(int i=0; i < n; i++){
           if(p[i]>0){
               sum1=sum1+1;
           }
           else if(p[i]<0){
               sum2=sum2+1;
           }
           else{
               sum3=sum3+1;
           }
           }       
         System.out.println(sum1/n);  
         System.out.println(sum2/n);  
         System.out.println(sum3/n);  
    }
}

