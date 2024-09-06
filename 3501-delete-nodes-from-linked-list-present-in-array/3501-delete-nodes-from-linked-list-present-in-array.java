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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> deleted = new HashSet<>();
        for(int num : nums)
            deleted.add(num);
        
        ListNode newHead = new ListNode(0 , head) ; //dummy node before head
        ListNode temp = newHead;
        while( temp != null && temp.next != null){
            if(deleted.contains(temp.next.val)){
                if(temp.next == head)
                    head = head.next ;
                temp.next = temp.next.next ;
            }
            else
                temp = temp.next ;
        }
        newHead.next = null ;
        
        return head ;
    }
}