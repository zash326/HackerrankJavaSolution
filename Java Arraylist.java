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
        int a[][]=new int[n][];
        for(int i=0;i<n;i++){
            int m=scan.nextInt();
            a[i]=new int[m];
            for(int j=0;j<m;j++){
                int val=scan.nextInt();
                a[i][j]=val;
            }
        }
        int q=scan.nextInt();
        for(int i=0;i<q;i++){
            int x=scan.nextInt();
            int y=scan.nextInt();
            try{
     System.out.println(a[x-1][y-1]);  
            }
            catch(Exception e){
                   System.out.println("ERROR!");    
            }
            }
    }
}