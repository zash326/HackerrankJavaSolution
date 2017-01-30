   import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
      String T[]=s.split("[ !,?._'@]+");
if(T.length==0){
    System.out.println(0);
}
else{
if(T[0].equals("")){
System.out.println(T.length-1);
for(int i=1;i<T.length;i++){
    System.out.println(T[i]);
}
}
else{
    System.out.println(T.length);   
for(int i=0;i<T.length;i++){
    System.out.println(T[i]);
}
}
}
    }
}
