import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    	int a[][]=new int[6][6];
    	for(int i=0;i<6;i++){
    		for(int j=0;j<6;j++){
        	a[i][j]=scan.nextInt();	
        	}	
    	}
    	int k=0;
    	int max=-100000007;
    	for(int i=0;i<4;i++){
    		for(int j=0;j<4;j++){
    			k=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
    			if(k>max){
    				max=k;
    			}
        	}	
    	}
    	
     System.out.println(max);   
    }
}
