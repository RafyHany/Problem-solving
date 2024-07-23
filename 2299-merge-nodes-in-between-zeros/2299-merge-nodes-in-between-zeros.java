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
    public ListNode mergeNodes(ListNode head) {
        int val = 0 ;
        ListNode iterator = head.next ;
        ListNode pointer = head ;
        ListNode zeroEnd = head ;
        while(iterator != null){
            if(iterator.val == 0 ){
                pointer.val = val ;
                pointer.next = iterator ;
                zeroEnd = pointer ;
                pointer = pointer.next ;
                val = 0 ;
            }else
                val += iterator.val ;
            ListNode temp = iterator.next ;
            iterator.next = null ;
            iterator = temp ;
        }
        zeroEnd.next = null ;
        return head ;
    
    }
}