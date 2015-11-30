/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newList = new ListNode(0);
	ListNode temp = newList;
        ListNode mptr = head;
        int i = 0;
        
        while(mptr.next != null && i < m-1){
            temp.next = mptr;
            mptr = mptr.next;
            temp = temp.next;
            i++;
        }
        
        ListNode nptr = head;
        i=0;
        
        while(nptr != null && i < n-1){
            nptr = nptr.next;
            i++;
        }
        
        temp.next = reverse(mptr, nptr.next);
        
        return newList.next;
    }
    
    public ListNode reverse(ListNode head, ListNode nptr){
        if(head == null || head.next == nptr){
            return head;
        }
        ListNode p = reverse(head.next, nptr);
        head.next.next = head;
        head.next = nptr;
        return p;
    }
}
