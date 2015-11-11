/**
* Example
* Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
* Return: 1 --> 2 --> 3 --> 4 --> 5
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode removed = new ListNode(0);
        ListNode temp = removed;
        
        while(head != null){
            if(head.val != val){
                temp.next = head;
                temp = temp.next;
            }
            head = head.next;
        }
        temp.next = null;
        return removed.next;    
    }
}
