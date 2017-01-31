import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String S=scan.next();
        int total=0;
        for(int i=0;i<S.length();i++){
            if(i%3==2&&S.charAt(i)!='S'){
                total=total+1;
            }
            else if(i%3==1&&S.charAt(i)!='O'){
                total=total+1;
            }
            else if(i%3==0&&S.charAt(i)!='S'){
                total=total+1;
            }
        }
        System.out.println(total);
    }
}
