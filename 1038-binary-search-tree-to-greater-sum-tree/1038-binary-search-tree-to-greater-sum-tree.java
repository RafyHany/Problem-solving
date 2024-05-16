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
    public TreeNode bstToGst(TreeNode root) {
        reversedPreOrderTraverse(root , 0);
        return  root;
    }
    private int reversedPreOrderTraverse(TreeNode node , int rightSum ){
        if(node == null)
            return rightSum ;
        int sum = reversedPreOrderTraverse(node.right , rightSum);
        sum += node.val;
        node.val = sum ;
        sum = reversedPreOrderTraverse(node.left , sum) ;
        return sum ;
    }
}