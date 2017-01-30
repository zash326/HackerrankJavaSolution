import java.util.*;
class Solution{
   public static boolean result(String input){
        Stack<Character> S =new Stack<Character>();
        for(int i=0;i<input.length();i++){
        char ch=input.charAt(i);
        if(ch=='('||ch=='{'||ch=='['){
        S.push(ch);
        }
        else if((ch==')'||ch=='}'||ch==']')&&(!S.isEmpty())){
            if((S.peek()=='('&&ch==')')||(S.peek()=='{'&&ch=='}')||(S.peek()=='['&&ch==']')){
                S.pop();
            }
            else{
                break;
            }
            }
        else if((ch==')'||ch=='}'||ch==']')&&(S.isEmpty())){
        return false;
        }
    }
        if(S.isEmpty()){
        return true;
        }
        else{
            return false;
        }
    }
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
          System.out.println(result(input));
      }
      
   }
}
