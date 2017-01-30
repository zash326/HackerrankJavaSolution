//Complete this code or write your own from scratch
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
         Scanner in = new Scanner(System.in);
         int n=in.nextInt();
         in.nextLine();
         for(int i=0;i<n;i++)
         {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            hmap.put(name, phone);
         }
           

         while(in.hasNext())
         {
            String s=in.nextLine();
             if(hmap.get(s) != null){
                 System.out.println(s+"="+hmap.get(s));
             }
             else{
                 System.out.println("Not found"); 
             }
         }
   }
}