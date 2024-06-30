class Solution {
    public boolean exist(char[][] board ,String word) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; ++j){
                if( board[i][j] != word.charAt(0))
                    continue;
                if(dfs(board, word , 0 , i , j))
                    return true ;

            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word , int index , int i , int j) {
        if(index >= word.length())
            return true ;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length)
            return false ;
        if( board[i][j] != word.charAt(index) ){
            return false ;
        }
        char c = board[i][j] ;
        board[i][j] = '0' ;
        boolean up = dfs(board , word , index+1 , i-1 , j);
        boolean down = dfs(board , word , index+1 , i+1 , j);
        boolean right = dfs(board , word , index+1 , i , j+1);
        boolean left = dfs(board , word , index+1 , i , j-1);
        board[i][j] = c ;
        return up || down || right || left;
    }
}