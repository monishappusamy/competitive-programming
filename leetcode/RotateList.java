/**
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * 
 * Good Solution:
 * class Solution {
 * public:
 *   ListNode* rotateRight(ListNode* head, int k) {
 *       if (!head) return NULL;
 *       int len = listLength(head);
 *       k %= len;
 *       ListNode* fast = head;
 *       for (int i = 0; i < k; i++)
 *           fast = fast -> next;
 *       ListNode* slow = head;
 *       while (fast -> next) {
 *           slow = slow -> next;
 *           fast = fast -> next; 
 *       }
 *       fast -> next = head;
 *       head = slow -> next;
 *       slow -> next = NULL; 
 *       return head;
 *   }
 * private:
 *   int listLength(ListNode* head) {
 *       int len = 0;
 *       while (head) {
 *           len++;
 *           head = head -> next;
 *       }
 *       return len;
 *   }
 * };
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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k == 0){
            return head;
        }
        
        head = insert(head, delete(head, k));
        return head;
    }
    
    public ListNode delete(ListNode node, int k){
       ListNode runner = node;
		int i = 0;
		for(i = 0; runner != null; i++){
			runner = runner.next;
		}
		k = k % i;
		runner = node;
		for(i = 0; i < k; i++){
			runner = runner.next;
		}
        ListNode current = node;
        while(runner != null && k != 0){
            if(runner.next == null){
                ListNode temp = current.next;
                current.next = null;
                return temp;
            }
            runner = runner.next;
            current = current.next;
        }
        return node;
    }
	
	public ListNode insert(ListNode head, ListNode node){
	    if(head == node){
			return node;
		}
		ListNode temp = node;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = head;
		return node;
	}
}
