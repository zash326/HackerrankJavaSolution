import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
       // for(int i=0;i<n;i++){
        //  System.out.println(a[i]);
       // }
      
        int sum=0;
        int count=1;
        int pos=a[0];
        while(count<=n){
            sum=sum+1;
            try{
            while(a[count]-pos<=k&&count<=n){
                count++;
                //System.out.println("ok");
            }
            }
            catch(Exception e){}
            pos=a[count-1];
            try{
            while(a[count]-pos<=k&&count<=n){
                count++;
                //System.out.println("ok2");
            }
            }
            catch(Exception e){}
            try{
        pos=a[count];
            }
            catch(Exception e){}
        count=count+1;
       
        }
        System.out.println(sum);
    }
}
