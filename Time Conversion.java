import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
               Scanner in = new Scanner(System.in);
         String time = in.next();
          char [] ch=new char[10];
          for (int i=0;i<10;i++){
              ch[i]=time.charAt(i);
          }
         int a=(ch[0]-'0')*10+ch[1]-'0';
         
         if(ch[8]=='A'&&a==12){
            ch[0]='0';
            ch[1]='0';
         }
         else if(ch[8]=='P'&&a!=12){
             a=a+12;
             ch[0]=(char) (a/10+48);
            ch[1]=(char) (a%10+48);
         }
         for (int i=0;i<8;i++){ 
     System.out.print(ch[i]);
         }
    }
}
