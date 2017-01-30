import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

      public  static void reverse(int[] a, int start, int end){
    int temp=0;
    int i=start;
    int j=end;
    while(i<j){
      temp=a[i];
      a[i]=a[j-1];
      a[j-1]=temp;
      i++;
      j--;
    }
     
  }
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int k = in.nextInt();
         int q = in.nextInt();
         int[] a = new int[n];
         for(int a_i=0; a_i < n; a_i++){
             a[a_i] = in.nextInt();
         }
         int m[]=new int[q];
         for(int a0 = 0; a0 < q; a0++){
              m[a0] = in.nextInt();
         }
         reverse(a,0,n-(k)%n);
         reverse(a,n-(k)%n,n);
         reverse(a,0,n);
         for(int a0 = 0; a0 < q; a0++){
          System.out.println(a[m[a0]]);
        }
    }
}

