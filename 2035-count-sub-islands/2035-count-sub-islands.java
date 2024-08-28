class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int[][] visited = new int[grid2.length][grid2[0].length] ;
        int count = 0 ;
        for(int i = 0 ; i < grid2.length ; ++i){
            for(int j = 0 ; j < grid2[0].length ; ++j){
                if(grid2[i][j] == 1 && visited[i][j] == 0){
                    if(isSubIsland(grid1 , grid2 , i , j , visited))
                        count++ ;
                }
            }
        }
        return count ;
    }
    private boolean isSubIsland(int[][] grid1 , int[][] grid2 , int i , int j , int[][] visited){
        if(i < 0 || i >= grid2.length || j < 0 || j >= grid2[0].length || grid2[i][j] == 0 || visited[i][j] == 1)
            return true ;
        if(grid1[i][j] == 0)
            return false ;
        visited[i][j] = 1 ;
        boolean up = isSubIsland(grid1 , grid2 , i-1 , j , visited) ;
        boolean down = isSubIsland(grid1 , grid2 , i+1 , j , visited) ;
        boolean left = isSubIsland(grid1 , grid2 , i , j-1 , visited) ;
        boolean right = isSubIsland(grid1 , grid2 , i , j+1 , visited) ;
        return up && down && left && right ;
    }
}