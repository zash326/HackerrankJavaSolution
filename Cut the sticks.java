import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int hash[]=new int[1000];
        
     for(int arr_i=0; arr_i < n; arr_i++){
            hash[arr[arr_i]-1] =  hash[arr[arr_i]-1]+1;
        }
        for(int arr_i=0; arr_i < 1000; arr_i++){
            if(hash[arr_i]>0){
           
                System.out.println(n);
                 n=n-hash[arr_i];
           }
        }
    }
}
