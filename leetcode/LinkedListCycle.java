/**
 * 
 * Good Solution:
 *  If a linked list has a cycle, there must be a node which
 *  two different nodes point to. Taking an example:
 *    head -> ... -> a -> b -> ... -> c -> b -> ...
 *  Let's think about the way we reverse a linked list. The first time
 *  that we encounter b, we make it pointing back to a, and move to
 *  the next node (into the cycle). Now, we've processed c and move to
 *  b again, and b is pointing to a. That is, after we process b twice,
 *  we'll process every node before b, in the original list, and
 *  eventually back to head.
 *  Hence, if a linked list has a cycle, and if we reverse it, we'll
 *  have two same head.
 */ 

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
	int i = 0;
    	for(;;){
  	    if(fast == null || fast.next == null)
  		    return false;
  	    slow = slow.next;
            fast = fast.next.next;
  	    if(slow == fast)
  	        return true;
    	}
    }
}
