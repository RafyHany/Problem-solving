class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length ;
        int[] parent = new int[n] ;
        for(int i = 0 ; i < n ; ++i)
            parent[i] = i ;
        for(int i = 0 ; i < n ; ++i){
            for(int j = i + 1 ; j < n ; ++j){
                if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                    union(parent , i , j) ;
                }
            }
        }
        int count = 0 ;
        for(int i = 0 ; i < n ; ++i){
            if(parent[i] == i)
                count++ ;
        }
        return n - count ;
    }
    private void union(int[] parent , int i , int j){
        int p1 = find(parent , i) ;
        int p2 = find(parent , j) ;
        if(p1 != p2)
            parent[p1] = p2 ;
    }
    private int find(int[] parent , int i){
        if(parent[i] != i)
            parent[i] = find(parent , parent[i]) ;
        return parent[i] ;
    }
}