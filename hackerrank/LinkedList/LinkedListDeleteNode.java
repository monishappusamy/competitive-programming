Node Delete(Node head, int position) {
    Node current = head;
    
    if ( head == null || head.next == null){
        return null;
    }
    
    if (position == 0){
        head = head.next;
        return head;
    }
    
    for(int i=0; i < position-1; i++){
        current = current.next;
    }
    
    Node nodeAtPosition = current;
    nodeAtPosition = nodeAtPosition.next;
    current.next = nodeAtPosition.next;
    
    return head;
}


