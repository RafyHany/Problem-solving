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
        HashMap<Integer , TreeNode> tree = new HashMap<>() ; // to keep track of each tree node
        HashSet<Integer>  isRoot = new HashSet<>() ; // to get root of tree
        for(int i = 0 ; i < descriptions.length ; ++i){
            TreeNode parent ;
            TreeNode child ;
            if(!tree.containsKey(descriptions[i][0])){ // if parent has been so get it from tree otherwise create it and add to is rrrot and tree
                parent = new TreeNode(descriptions[i][0]) ;
                isRoot.add(descriptions[i][0]) ;
                tree.put(descriptions[i][0] , parent) ;
            }else
                parent = tree.get(descriptions[i][0]) ;

            if(!tree.containsKey(descriptions[i][1])){ // to get child node if found or create it
                child = new TreeNode(descriptions[i][1]);
                tree.put(descriptions[i][1] , child) ;
            }else
                child = tree.get(descriptions[i][1]) ;


            isRoot.remove(descriptions[i][1]) ;  // remove the child from  the root set

            if(descriptions[i][2] == 0)
                parent.right = child ;
            else
                parent.left = child ;
        }
        int root = 0 ;
        for(int  m : isRoot){ // my hashset onlt has one value whaic is the root
            root = m ;
        }


        return tree.get(root) ;
    }
}