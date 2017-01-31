import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int a = in.nextInt();
         int[] arr = new int[n];
         for(int a_i=0; a_i < n; a_i++){
             arr[a_i] = in.nextInt();
         }
         int sum=0;
         for(int i= 0; i < n; i++){
           for(int j= i+1; j < n; j++){
         if((arr[i]+arr[j])%a==0){
           sum=sum+1;
         }
           }
           }
         System.out.println(sum);
    }
}
