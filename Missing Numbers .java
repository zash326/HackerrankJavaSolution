import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int m=scan.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=scan.nextInt();
        }
    int ahash[][]=new int[100][2];
    for(int i=0;i<n;i++){
        ahash[a[i]%100][0]=ahash[a[i]%100][0]+1;
        ahash[a[i]%100][1]=a[i];
    }
    int bhash[][]=new int[100][2];
    for(int i=0;i<m;i++){
        bhash[b[i]%100][0]=bhash[b[i]%100][0]+1;
        bhash[b[i]%100][1]=b[i];
    }
    List<Integer> arr=new ArrayList<Integer>();
    for(int i=0;i<100;i++){
        if(ahash[i][0]!=bhash[i][0]){
            arr.add(ahash[i][1]);
        }
    }
     Collections.sort(arr);   
    // System.out.println(arr);
     for(int i=0;i<arr.size();i++){
         System.out.print(arr.get(i)+" ");
     }
    }
}
