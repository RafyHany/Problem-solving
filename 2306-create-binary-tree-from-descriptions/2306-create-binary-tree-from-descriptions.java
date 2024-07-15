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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer , TreeNode> tree = new HashMap<>() ;
        HashMap<Integer , Boolean>  isRoot = new HashMap<>() ;
        for(int i = 0 ; i < descriptions.length ; ++i){
            TreeNode parent ;
            TreeNode child ;
            if(!tree.containsKey(descriptions[i][0])){
                parent = new TreeNode(descriptions[i][0]) ;
                isRoot.put(descriptions[i][0] , true) ;
                tree.put(descriptions[i][0] , parent) ;
            }else
                parent = tree.get(descriptions[i][0]) ;
            
            if(!tree.containsKey(descriptions[i][1])){
                child = new TreeNode(descriptions[i][1]);
                tree.put(descriptions[i][1] , child) ;
            }else
                child = tree.get(descriptions[i][1]) ;
            
            isRoot.put(descriptions[i][1] , false) ;
            
            if(descriptions[i][2] == 0)
                parent.right = child ;
            else
                parent.left = child ;
        }
        int root = 0 ;
        for(Map.Entry<Integer , Boolean> m : isRoot.entrySet()){
            if(m.getValue()){
                root = m.getKey() ;
                break;
            }
        }


        return tree.get(root) ;
    }
}