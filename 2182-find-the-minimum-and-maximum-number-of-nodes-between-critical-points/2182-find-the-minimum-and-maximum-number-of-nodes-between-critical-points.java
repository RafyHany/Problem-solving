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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode prev = head ;
        ListNode cur = head.next ;
        ListNode next = cur.next ;
        int index = 2 ;
        ArrayList<Integer> critical = new ArrayList<>() ;
        while(next != null){
            if( (cur.val < prev.val && cur.val < next.val )||(cur.val > prev.val && cur.val > next.val ))
                critical.add(index);
            prev = cur ;
            cur = next ;
            next = next.next ;
            index++ ;
        }
        
        if(critical.size() < 2)
            return new int[]{-1 , -1};
        int[] res = new int[2] ;
        int min = critical.get(1) - critical.getFirst() ;
        for(int i = 2 ; i < critical.size() ; ++i){
            min = Math.min(min , critical.get(i) - critical.get(i-1)) ;
        }
        res[0] = min ;
        res[1] = critical.getLast() - critical.getFirst();

        return  res ;
    }
}