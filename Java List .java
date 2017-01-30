import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        List a=new LinkedList<>();
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            a.add(scan.nextInt());
        }
        int q=scan.nextInt();
        for(int i=0;i<q;i++){
            String S=scan.next();
            if(S.equals("Insert")){
                int s=scan.nextInt();
                int t=scan.nextInt();
                a.add(s, t);
            }
            else{
                int s=scan.nextInt();
                a.remove(s);
            }
        }
        
        Iterator itr = a.iterator();
        while(itr.hasNext()){
        System.out.print(itr.next()+" ");
        }
    }
}
