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
    Node current = head;
    
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    
    if(current == null){
        return newNode;
    }
    
    while(current.next !=  null){
        current = current.next;
    }
    
    if(current.next == null){
        current.next = newNode;
    }
    
    return head;
}
