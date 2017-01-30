/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node temp1=headA;
    Node temp2=headB;
    Node temp=null;
    if(temp1==null && temp2==null){
        return null;
    }
     else if (temp1==null && temp2!=null){
        return temp2;
    }
     else if (temp1!=null && temp2==null){
        return temp1;
    }
    else{
        if(headA.data>headB.data){
            temp1=headB;
            temp2=headA;
            temp=headA;
            headA=headB;
            headB=temp;
            temp=null;
        }
    while(temp1!=null && temp2!=null){

              if(temp1.data<temp2.data){

                  temp=temp1;
                  temp1=temp1.next;
              }
              else{
                 temp.next=temp2;
                  temp=temp2;
                  temp2=temp2.next;
                  temp.next=temp1;
              }
     
    }
if(temp1==null){
temp.next=temp2;
}
return headA;
    }
}
