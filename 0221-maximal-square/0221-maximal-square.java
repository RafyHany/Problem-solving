class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length ;
        int m = matrix[0].length ;
        int[][] area = new int[n+1][m+1] ;
        int max = 0 ;
        for(int i = 1 ; i < n + 1 ; i++ ){
            for(int j = 1 ; j < m + 1 ; j++){
                if(matrix[i-1][j-1] == '1'){
                    if(i-2 >= 0 && j-2 >= 0 && matrix[i-2][j-1] == '1' && matrix[i-1][j-2] == '1' )
                            area[i][j] = Math.min(area[i - 1][j - 1], Math.min(area[i - 1][j], area[i][j - 1])) + 1 ;
                    else
                        area[i][j] = 1 ;
                    max = Math.max(max , area[i][j] );
                    continue ;

                }
                area[i][j] = 0 ;
            }
        }
        return max * max ;
    }
}