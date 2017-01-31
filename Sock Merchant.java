import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
         int hash[]=new int[100];
        
     for(int arr_i=0; arr_i < n; arr_i++){
            hash[c[arr_i]-1] =  hash[c[arr_i]-1]+1;
        }
        int m=0;
        int sum=0;
         for(int arr_i=0; arr_i < 100; arr_i++){
         m=hash[arr_i]/2;
             sum=sum+m;
    }
        System.out.println(sum);
}
}
