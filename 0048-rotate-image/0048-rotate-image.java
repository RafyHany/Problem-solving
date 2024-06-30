class Solution {
     public void rotate(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; ++i){
            for(int j = i ; j < matrix[0].length ; ++j){
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
        }
        
        int startCol = 0 ;
        int endCol = matrix[0].length - 1 ;
        while (startCol < endCol){
            for(int i = 0 ; i < matrix.length ; ++i){
                int temp = matrix[i][startCol];
                matrix[i][startCol] = matrix[i][endCol];
                matrix[i][endCol] = temp ;
            }
            startCol ++ ;
            endCol -- ;
        }
    }
}