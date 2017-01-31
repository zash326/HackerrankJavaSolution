import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan=new Scanner(System.in);
         int a=scan.nextInt();
         String S=scan.nextLine();
         while(a>0){
  
         String S1=scan.nextLine();
         String S2=scan.nextLine();
        // System.out.println(S);
        int hashmap1[]=new int[26];
        int hashmap2[]=new int[26];
        for(int i=0;i<S1.length();i++){
            hashmap1[(S1.charAt(i))-97]=1;
        }
        for(int i=0;i<S2.length();i++){
            hashmap2[(S2.charAt(i))-97]=1;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            sum=hashmap1[i]+hashmap2[i];
   if(sum==2){
       break;
   }
        }
        
        if(sum==2)
            System.out.println("YES");
        else
            System.out.println("NO");
         }
         
    }
}