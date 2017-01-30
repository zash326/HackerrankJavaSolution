/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node temp=new Node();
    temp.data=data;
    temp.next=head;
    if(position==0){
        head=temp;
        return head;
    }
    Node temp1=head;
    for(int i=0;i<position-1;i++){
        temp1=temp1.next;
    }
    temp.next=temp1.next;
    temp1.next=temp;
    return head;
}
