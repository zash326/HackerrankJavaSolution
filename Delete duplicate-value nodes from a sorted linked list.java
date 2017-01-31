/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
Node temp=head;
    if(temp==null){
        return null;
    }
    while(temp.next!=null){
        if(temp.data==temp.next.data){
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }
    }
    return head;
}
