/**
 *
 *Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
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
    public ListNode swapPairs(ListNode head) {
       if(head == null)
            return head;
        ListNode currTemp = head;
        ListNode curr = head.next;
        ListNode prev = head;
        ListNode temp = curr;
        
        while(currTemp != null){
	        currTemp = curr.next;
	        curr.next = prev;
	        if(currTemp != null){
		        curr = currTemp.next;
		        if(curr == null){
		            prev.next = currTemp;
		            prev = currTemp;
		            break;
		        }
		        else
    		        prev.next = curr;
		        prev = currTemp;
	        }
        }
       prev.next = null;
       return temp;
    }
}
