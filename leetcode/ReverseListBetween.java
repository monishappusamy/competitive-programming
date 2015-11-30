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
        newList.next = head;
        ListNode mptr = newList;
        
        int i = 0;
        while(i < m-1){
            mptr = mptr.next;
            i++;
        }
        ListNode nptr = newList.next;
        i=0;
        while(i < n-1){
            nptr = nptr.next;
            i++;
        }
        
        ListNode temp = mptr;
        temp.next = reverse(mptr.next, nptr.next);
        
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
