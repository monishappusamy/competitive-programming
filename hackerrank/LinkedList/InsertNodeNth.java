Node InsertNth(Node head, int data, int position) {
    Node newNode = new Node();
    newNode.data = data;
    
    Node current = head;
    
    if(current == null){
        return newNode;
    }
    
    if(position ==0){
        newNode.next = head;
        return newNode;
    }
    
    for(int i=0; i<position-1 && current.next!=null; i++){
        current = current.next;
    }
    
    /*or we can also use a while loop like below
     *  
     *  int currPosition = 0;
     *  while (currPosition < position -1 && head.next != null){
     *  head = head.next;        
     *  currPosition++;
     *         
    */
    
    Node nodeAtPosition = current.next;
    current.next = newNode;
    current = current.next;
    current.next = nodeAtPosition;
    return head;
}