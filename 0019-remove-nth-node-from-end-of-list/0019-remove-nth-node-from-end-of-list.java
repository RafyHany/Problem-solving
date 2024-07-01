/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nthNode = head;
        int len = 0 ;
        while(nthNode != null  ){
            nthNode = nthNode.next ;
            len++;
        }
        ListNode temp = head ;
        n = len - n ;
        if(n == 0)
            return head.next ;
        while(n > 1){
            temp = temp.next;
            n-- ;
        }
        if(temp.next != null)
            temp.next = temp.next.next ;
        else
            head = null ;    
        return head ;
    }
}