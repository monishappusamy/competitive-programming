/**
 * Best Solution:
 * Iterative:
 * public ListNode reverseList(ListNode head) {
 *   ListNode prev = null;
 *   ListNode curr = head;
 *   while (curr != null) {
 *       ListNode nextTemp = curr.next;
 *       curr.next = prev;
 *       prev = curr;
 *       curr = nextTemp;
 *   }
 *   return prev;
 * }
 * 
 * Recursive:
 * public ListNode reverseList(ListNode head) {
 *   if (head == null || head.next == null) return head;
 *   ListNode p = reverseList(head.next);
 *   head.next.next = head;
 *   head.next = null;
 *   return p;
 * }
 * 
 * /

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
