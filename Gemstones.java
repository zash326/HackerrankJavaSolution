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
        String S[]=new String[n];
        for(int i=0;i<n;i++){
         S[i]=scan.next();
        }
        int hash []=new int[26];
        int total=0;

        for(int i=0;i<n;i++){
            
            for(int j=0;j<S[i].length();j++){
                if(i==0||hash[S[i].charAt(j)-97]!=0)
                hash[S[i].charAt(j)-97]=hash[S[i].charAt(j)-97]+1;
            }
            for(int j=0;j<26;j++){
                if(hash[j]>=i+1){
                    hash[j]=i+1;
                }
                else{
                    hash[j]=0;
                }
                
            }
        }
        for(int j=0;j<26;j++){
            if(hash[j]==n){
                total=total+1;
            }
            //System.out.print(hash[j]);
        }
        System.out.println(total);
    }
}