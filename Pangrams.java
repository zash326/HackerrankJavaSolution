import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan=new Scanner(System.in);
         String S=scan.nextLine();
        // System.out.println(S);
        int hashmap[]=new int[26];
        for(int i=0;i<S.length();i++){
            if(Character.isUpperCase(S.charAt(i)))
            hashmap[(S.charAt(i))-65]=1;
            else if(Character.isLowerCase(S.charAt(i)))
                hashmap[(S.charAt(i))-97]=1;    
        }
        int sum=0;
        for(int i=0;i<26;i++){
            sum=hashmap[i]+sum;
            //System.out.println(hashmap[i]);
        }
        if(sum==26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}