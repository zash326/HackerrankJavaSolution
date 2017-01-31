import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n>0){
        String S=new String();
        S=scan.next();
        
        int total=0;

        for(int i=0;i<S.length()/2;i++){
            total=Math.abs(S.charAt(i)-S.charAt(S.length()-1-i))+total;
    
        }
   
        System.out.println(total);
        }
    }
}