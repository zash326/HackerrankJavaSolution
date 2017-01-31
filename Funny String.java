import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        
        int a=scan.nextInt();
        while(a>0){
        String s=scan.next();
      StringBuilder S=new StringBuilder(s);
     String r=S.reverse().toString();
     int sum=0;
     for(int i=1;i<s.length();i++){
         if((Math.abs((int)s.charAt(i)-(int)s.charAt(i-1))==Math.abs((int)r.charAt(i)-(int)r.charAt(i-1)))){
             sum=sum+1;
         }
         else{
             break;
         }
     }
     if(sum==s.length()-1){
         System.out.println("Funny");
         
     }
     else{
         System.out.println("Not Funny"); 
     }
     a--;
        }
    }
}