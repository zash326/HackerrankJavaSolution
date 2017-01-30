/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
Node past=null;
  Node present=head;
  Node future=head;
  while(present!=null){
    future=present.next;
    present.next=past;
    past=present;
    present=future;
  }
  head=past;
    return head;
}
