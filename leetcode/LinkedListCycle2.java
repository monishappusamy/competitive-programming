/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
	  ListNode fast = head;
  	boolean flag = false;
    	for(;;){
  	    if(fast == null || fast.next == null)
  		    return false;
  	    slow = slow.next;
        fast = fast.next.next;
  	    if(slow == fast){
  	        ListNode slow2 = head;
			      while(slow != slow2){
			          slow = slow.next;
			    	    slow2 = slow2.next;
			    }
			    return slow;
			    }
    	}
    }
}
