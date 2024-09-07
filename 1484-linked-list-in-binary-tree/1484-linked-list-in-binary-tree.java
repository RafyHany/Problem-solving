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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public boolean isSubPath(ListNode head, TreeNode root) {
        if(head == null )
            return true;
        if(root == null)
            return false ;
        if(checkSubTree(head , root))
            return true ;

        boolean right = isSubPath(head , root.right);
        boolean left = isSubPath(head , root.left);

        return right || left ;
    }
    private boolean checkSubTree(ListNode head, TreeNode root){
        if(head == null )
            return true;
        if(root == null)
            return false ;
        if(root.val != head.val)
            return false ;
        head = head.next;
        boolean right = checkSubTree(head , root.right);
        boolean left = checkSubTree(head , root.left);
        
        return right || left ;

    }
}