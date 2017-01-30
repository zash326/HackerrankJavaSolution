/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node temp1 = new Node();
    temp1.data=data;
    if(head==null){
        return temp1;
    }
  Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=temp1;
    return head;
}
