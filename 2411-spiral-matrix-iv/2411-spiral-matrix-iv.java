/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for(int i = 0 ; i < matrix.length ;++i)
            Arrays.fill(matrix[i], -1);
        ListNode temp = head;
        int top = 0 ;
        int bottom = m - 1 ;
        int left = 0 ;
        int right = n - 1;
        while(temp != null){
            for(int i = left ; i <= right && temp != null ; ++i){
                matrix[top][i] = temp.val;
                temp = temp.next ;
            }
            top++;
            for(int i = top ; i <= bottom && temp != null; ++i){
                matrix[i][right] = temp.val;
                temp = temp.next ;
            }
            right--;
        
            for(int i = right ; i >= left && temp != null; --i){
                matrix[bottom][i]=  temp.val;
                temp = temp.next ;
            }
            bottom--;
        

        
            for(int i = bottom ; i >= top && temp != null; --i){
                matrix[i][left]=  temp.val;
                temp = temp.next ;
            }
            left++;
            
        }

        return matrix;

    }
}