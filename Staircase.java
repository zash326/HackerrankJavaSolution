import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
         int a = in.nextInt();
         int k=0;
         for (int j=0;j<a;j++){ 
           k=k+1;
         
         for (int i=0;i<a-k;i++){ 
     System.out.print(" ");
         }
         for (int i=0;i<k;i++){ 
     System.out.print("#");
         }
         System.out.println();
         }
    }
}

