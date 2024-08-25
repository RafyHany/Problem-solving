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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> order = new ArrayList<>() ;
        preoreder(root , order);
        return order ;
        
    }
    
    private void preoreder(TreeNode root , List<Integer> order){
        if(root == null)
            return;
        order.add(root.val) ;    
        preoreder(root.left , order);
        preoreder(root.right , order);
        

    }
}