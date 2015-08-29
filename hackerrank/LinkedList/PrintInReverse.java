/*
 * You are given the pointer to the head node of a linked list 
 * and you need to print all its elements in reverse order from 
 * tail to head, one element per line. The head pointer may be null 
 * meaning that the list is empty - in that case, do not print anything!
 */

void ReversePrint(Node head) {

    Node current = head;
    
    if(head == null)
        return;
    
    Node currentNextNode = current.next;
    
    if (current.next == null){
        System.out.println(current.data);
        return;
    }
    
    if(currentNextNode.next != null){
        for(int i=0; currentNextNode.next != null; i++){
            current = current.next;
            currentNextNode = currentNextNode.next;
        }
    }
    
    System.out.println(currentNextNode.data);
    
    current.next = null;
    ReversePrint(head);
}
