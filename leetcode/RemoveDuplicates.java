/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */


 public class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
 }

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        else{
        ListNode temp = head;
        while(temp.next != null){
			if(temp.next.val == temp.val){
			    ListNode dummy = temp;
			    while (dummy.next != null && dummy.next.val == dummy.val ){
			        dummy = dummy.next;
			    }
				temp.next = dummy.next;
			}
			if(temp.next!=null){
			    temp = temp.next;
			}
		}
		return head;
        }
    }
}
