import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        long[] a = new long[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextLong();
        }
        long sum=0;
        int ans=0;
        for(int i=0; i < n; i++){
            sum=0;
            for(int j=i; j < n; j++){
                sum=sum+a[j];
                if(sum<0){
                    ans=ans+1;
                }
            }
        }
        System.out.println(ans);
    }
}
