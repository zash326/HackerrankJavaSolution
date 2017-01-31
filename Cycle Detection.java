/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
Node temp=head;
    Node temp1=head;
    while(temp1!=null){
        temp=temp.next;
        temp1=temp1.next.next;
        if(temp1==null||temp==null){
            return false;
    }
    if(temp1==temp){
        return true;
    }
    }
    return false;
}
