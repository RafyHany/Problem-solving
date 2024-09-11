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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null)
            return head ;
        ListNode curr = head.next ;
        ListNode prev = head ;
        while(curr != null){
            ListNode gcdNode = new ListNode(gcd(prev.val , curr.val) , curr);
            prev.next = gcdNode ;
            prev = curr ;
            curr = curr.next ;
        }
        return head ;
    }
    private int gcd (int a , int b ){
        if(b == 0)
            return a ;
        return gcd(b , a % b);
    }
}