import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan=new Scanner(System.in);
         String S=scan.next();
         int par=S.length()+1;
         while(par-S.length()>0){
             par=S.length();
         for(int i=0;i<S.length()-1;i++){
             if(S.charAt(i)==S.charAt(i+1)){
                 S=S.replace(""+S.charAt(i)+S.charAt(i+1), "");
                 i++;
             }
         }
         }
         if(S.isEmpty())
            System.out.println("Empty String");
        else
            System.out.println(S);
    }
}