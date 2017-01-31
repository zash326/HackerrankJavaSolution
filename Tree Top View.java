/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void left_view(Node temp){
    if(temp==null){
        return;
}
   left_view(temp.left);
    System.out.print(temp.data+" ");
}
void right_view(Node temp){
    if(temp.right==null){
        return;
}
   System.out.print(temp.right.data+" ");
   right_view(temp.right);
 
}
void top_view(Node root)
{
  left_view(root);
  right_view(root); 
}
