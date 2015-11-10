/**
* Given linked list: 1->2->3->4->5, and n = 2.
* After removing the second node from the end, the linked list becomes 1->2->3->5.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null || (head.next == null && n ==1))
            return null;
            
        ListNode current = head;
        ListNode previous = head;
        ListNode temp = head;
        
        for(int i=1; i<n; i++){
            current = current.next;
        }
        
        if(current.next == null){
            return head.next;
        }
        
        while(current.next != null){
            current = current.next;
            previous = temp;
            temp = temp.next;
        }
        
        previous.next = previous.next.next;
        
        return head;
    }
}
