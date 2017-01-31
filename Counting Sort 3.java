import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int [n];
        String S[]=new String[n];
        
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
            S[i]=scan.next();
        }
        int hash[]=new int [100];
         for(int i=0;i<n;i++){
            hash[a[i]]=hash[a[i]]+1;
        }
        int sum=0;
            for(int i=0;i<100;i++){
                sum=sum+hash[i];
            System.out.print(sum+" ");
        
        }           
    }
}