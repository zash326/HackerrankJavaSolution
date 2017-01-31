import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
                   int T=in.nextInt();
                   while(T>0){
           int n = in.nextInt();
           int x[] = new int[n];
           int y[] = new int[n];
           int sum=0;
         
           for(int i=0; i < n; i++){
                   x[i] = in.nextInt(); 
                   sum=sum+x[i];
                   y[i]=sum;
           }
           if(n==1){
              System.out.println("YES");  
           }
           else if(n==2){
              System.out.println("NO");  
           }
           else{
           for(int i=1; i < n; i++){
                 if(y[i-1]==y[n-1]-y[i]){
                      System.out.println("YES");  
                      break;
                 }
                 else{
                     if(i==n-1){
                     System.out.println("NO");   
                     }
                 }
           }       
           }
           T--;
           }
    }
}
