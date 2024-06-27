class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>() ;
        ArrayList<Integer> cols = new ArrayList<>() ;

        for(int i = 0 ; i < matrix.length ; ++i){
            for(int j =0 ; j < matrix[0].length ; ++j){
                if(matrix[i][j] == 0 ){
                    rows.add(i) ;
                    cols.add(j) ;
                }
            }
        }
        for(int k = 0 ; k < rows.size() ; k++){
            int row = rows.get(k) ;
            int col = cols.get(k) ;
            for(int i = 0 ; i < matrix[0].length ; ++i){
                matrix[row][i] = 0 ;
            }
            for(int i = 0 ; i < matrix.length ; ++i){
                matrix[i][col] = 0 ;
            }
        }

    }
}