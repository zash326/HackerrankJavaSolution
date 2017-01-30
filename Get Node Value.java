/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
Node temp=head;
    int sum=0;
while(temp!=null){
    temp=temp.next;
      sum=sum+1;
}
    Node temp1=head;
    for(int i=0;i<sum-n-1;i++){
        temp1=temp1.next;
}
    return temp1.data;
}
