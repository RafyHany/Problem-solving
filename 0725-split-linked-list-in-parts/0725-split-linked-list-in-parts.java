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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head ;
        int len = 0 ;
        while (temp != null){
            len++;
            temp = temp.next;
        }
        temp  = head ;
        ListNode[] nodes = new ListNode[k];
        ListNode[] tails = new ListNode[k];
        int index = 0 ;
        int reminder = len % k ;
        int lenOfNewList = len / k ;
        while(index < k){
            
            
            int curLen = 0 ;
            while (temp != null && curLen < lenOfNewList){
                if(tails[index] == null)
                    nodes[index] = temp ;
                tails[index] = temp;
                temp = temp.next;
                curLen++;
            }
            if(temp != null && reminder != 0){
                if(nodes[index] == null){
                    nodes[index] = temp ;
                }
                tails[index] = temp;
                temp = temp.next ;
                reminder--;
            }
            if(tails[index] != null)
                tails[index].next = null;
            index++;
                
        }
        
        return nodes;
    }
}