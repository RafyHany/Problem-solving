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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> order = new LinkedList<>();
        order.offer(root);
        int size  ;
        while (!order.isEmpty()){
            size = order.size() ;
            List<Integer> l = new ArrayList<>() ;
            for(int i = 0 ; i < size ; ++i){
                TreeNode node = order.poll() ;
                if(node != null){
                    l.add(node.val) ;
                    order.offer(node.left);
                    order.offer(node.right);
                }
            }
            if(l.isEmpty())
                continue;
            level.add(l) ;
        }
        return level ;
    }
}