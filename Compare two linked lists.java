/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method
    Node temp1=headA;
    Node temp2=headB;
    int bit=1;
    while(temp1!=null&&temp2!=null){
        if(temp1.data!=temp2.data){
            bit=0;
            return bit;
        }
        temp1=temp1.next;
        temp2=temp2.next;
    }
    if(temp1==null&&temp2==null){
        bit=1;
    }
    else{
        bit=0;
    }
  return bit;
}
