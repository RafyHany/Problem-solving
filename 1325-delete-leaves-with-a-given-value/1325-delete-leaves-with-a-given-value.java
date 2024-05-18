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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return delete(root,target) ;
    }
    private TreeNode delete(TreeNode node, int target){
        if(node == null)
            return null ;
        node.right =  delete(node.right , target) ;
        node.left =  delete(node.left , target) ;
        if(node.right == null && node.left == null && node.val == target)
            return null ;
        return node ;
    }
}