    class Add{
   public  void add(int... a){
       int sum=0;
       String result="";
       for(int i=1;i<=a.length;i++){
          if(i!=a.length)
           result=result+a[i-1]+"+";
           else
            result=result+a[i-1]+"=";   
           sum=sum+a[i-1];
       }
       result=result+sum;
       System.out.println(result); 
    }
     
  
}
