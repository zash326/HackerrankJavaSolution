import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
         int a = in.nextInt();
         int n = in.nextInt();
         int[] arr = new int[n];
         for(int a_i=0; a_i < n; a_i++){
             arr[a_i] = in.nextInt();
         }

         for(int a0 = 0; a0 < n; a0++){
             if(arr[a0]==a){
          System.out.println(a0);
          break;
             }
        }
    }
}