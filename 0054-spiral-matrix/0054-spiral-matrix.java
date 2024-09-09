class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0 ;
        int bottom = matrix.length  - 1;
        int left = 0 ;
        int right = matrix[0].length - 1;
        int totalLen = (bottom + 1) * (right + 1) ;
        while(top <= bottom && left <= right){
            for(int i = left ; i <= right; ++i){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i = top ; i <= bottom; ++i){
                res.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right ; i >= left; --i){
                        res.add(matrix[bottom][i]);
                    }
                    bottom--;
            }
            
            if(left <= right){
                for(int i = bottom ; i >= top; --i){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return res ;
    }
}