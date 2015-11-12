/**
* ex. 1->3->5->NULL & 2->4>6->NULL
* Output: 1->2->3->4->5->6->NULL


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
            
        ListNode combined = new ListNode(0);
        ListNode temp = combined;
        
        while(l1 !=null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        
        while(l1 != null){
            temp.next = l1;
            temp = temp.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            temp.next = l2;
            temp = temp.next;
            l2 = l2.next;
        }
        return combined.next;
    }
}
