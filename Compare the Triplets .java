import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int A=0;
        int B=0;
        if(a0>b0)
            A=A+1;
       if(a1>b1)
            A=A+1;
        if(a2>b2)
            A=A+1;
        if(a0<b0)
            B=B+1;
        if(a1<b1)
            B=B+1;
        if(a2<b2)
            B=B+1;
        System.out.println(A+" "+B);
    }
   
}
