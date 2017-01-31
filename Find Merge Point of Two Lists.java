/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
Node temp1=headA;
    Node temp2=headB;
    while(temp1!=null){
        temp2=headB;
        while(temp2!=null){
            if(temp1==temp2){
                return temp1.data;
            }
            temp2=temp2.next;
        }
        temp1=temp1.next;
    }
    return temp1.data;
}