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
    TreeNode newRoot ;


    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> set = new ArrayList<>() ;
        inOrderTraverse(root , set);
        divideAndConquer(0 , set.size()-1 , set );
        return newRoot ;
    }
    private void inOrderTraverse(TreeNode node , ArrayList<Integer> traverse){
        if(node == null)
            return;
        inOrderTraverse(node.left , traverse);
        traverse.add(node.val);
        inOrderTraverse(node.right,traverse);
    }
    private TreeNode addTotree(TreeNode root , int newNode){
        if(root == null){
            return  new TreeNode(newNode) ;        }
        if(root.val > newNode)
            root.left = addTotree(root.left , newNode) ;
        else if(root.val < newNode)
            root.right = addTotree(root.right , newNode) ;
        return root ;
    }
    private void divideAndConquer(int l , int r ,ArrayList<Integer> set ){
        if(l > r)
            return;
        int mid = (l+r)/2 ;
        newRoot = addTotree(newRoot , set.get(mid));
        divideAndConquer(l , mid-1, set );
        divideAndConquer(mid + 1 , r, set );

    }
}