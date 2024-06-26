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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> set = new ArrayList<>() ;
        inOrderTraverse(set , root);
        return  isSorted(set);
    }
    private boolean isSorted(ArrayList<Integer> set){
        for(int i  = 1 ; i < set.size() ; ++i){
            if(set.get(i) <= set.get(i-1))
                return false ;
        }
        return true ;
    }

    private void inOrderTraverse(ArrayList<Integer> set , TreeNode node){
        if(node == null)
            return;
        inOrderTraverse(set , node.left);
        set.add(node.val) ;
        inOrderTraverse(set , node.right) ;
    }
}