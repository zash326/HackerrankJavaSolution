import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if((int) s.charAt(i)>=65 && (int) s.charAt(i)<=90){
                sum=sum+1;
            }
        }
        System.out.println(sum+1);
    }
}
