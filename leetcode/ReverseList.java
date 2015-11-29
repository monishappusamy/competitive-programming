/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    ListNode newList = new ListNode(0); 
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        
		while(current != null){
			ListNode temp = new ListNode(0);
			temp.val = current.val;
			temp.next = newList.next;
			newList.next = temp;
			current = current.next;
		}
        return newList.next;
    }
}
