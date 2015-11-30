/**
 * Good Solution:
 * 
 * public ListNode reverseBetween(ListNode head, int m, int n) {
 *   if(head == null) return null;
 *   ListNode dummy = new ListNode(0); 
 *   dummy.next = head;
 *   ListNode pre = dummy; 
 *   for(int i = 0; i<m-1; i++) pre = pre.next;
 *   ListNode start = pre.next; 
 *   ListNode then = start.next; 
 *   for(int i=0; i<n-m; i++)
 *   {
 *       start.next = then.next;
 *       then.next = pre.next;
 *       pre.next = then;
 *       then = start.next;
 *   }
 *   return dummy.next;
 * }
 * 
 * 

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
