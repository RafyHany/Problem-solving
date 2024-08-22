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
    int max = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        getMaxLen(root , 0 );
        return max ;
    }
    
    private int getMaxLen(TreeNode node , int len ){
        if(node == null)
            return 0 ;
        int left = getMaxLen(node.left , len) ;
        int right = getMaxLen(node.right , len) ;
        max = Math.max(max , left + right) ;
        
        return Math.max(left , right) + 1 ;
    }
}