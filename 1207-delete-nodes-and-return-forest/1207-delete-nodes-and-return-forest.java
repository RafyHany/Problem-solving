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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashMap<Integer , TreeNode> forests = new HashMap<>() ;
        forests.put(root.val , root ) ;
        for(int i = 0 ; i < to_delete.length ; i++){
            for(Map.Entry<Integer, TreeNode> rootOfForest : forests.entrySet()){
                if(delNode(rootOfForest.getValue() , to_delete[i], forests , null , true ))
                    break ;
            }
        }
        List<TreeNode> roots = new ArrayList<>() ;
        for(Map.Entry<Integer, TreeNode> rootOfForest : forests.entrySet()){
            roots.add(rootOfForest.getValue()) ;
        }
        
        return roots ;
    }

    private boolean delNode(TreeNode root , int deletedNode ,HashMap<Integer , TreeNode> forests , TreeNode parent , boolean isLeft){
        if(root == null)
            return false;
        if(deletedNode == root.val) {
            forests.remove(root.val);
            if (root.left != null)
                forests.put(root.left.val, root.left);
            if (root.right != null)
                forests.put(root.right.val, root.right);
            
            if(parent != null){
                if (isLeft)
                    parent.left = null;
                else
                    parent.right = null;    
            }
            return true;
        }
        
        return 
            delNode(root.left , deletedNode , forests , root , true) // to traverse the left subtree
            ||
            delNode(root.right , deletedNode , forests , root , false); // to traverse the right subtree
    }
}