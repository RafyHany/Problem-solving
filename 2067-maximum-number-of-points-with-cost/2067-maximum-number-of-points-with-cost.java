class Solution {
    public long maxPoints(int[][] points) {
        int rows = points.length ;
        int cols = points[0].length ;
        long[] dp = new long[cols] ;
        for(int i = 0 ; i < dp.length ; i++ )
            dp[i] = points[0][i] ;
        for(int i = 1 ; i < rows ; i++){
            long[] prefix = new long[cols + 1 ] ;
            long[] suffix = new long[cols + 1] ;

            for(int j = 1 ; j <= cols ; ++j )
                prefix[j] = Math.max(prefix[j - 1] - 1 , dp[j - 1]);

            for(int j = cols - 1 ; j >= 0 ; --j)
                suffix[j] = Math.max(suffix[j + 1] - 1 , dp[j] );
            
            for(int j = 0 ; j < cols ; ++j)
                dp[j] = points[i][j] + Math.max(suffix[j] , prefix[j+1]);
            
            
        }

        long res = Long.MIN_VALUE ;
        for(long x : dp)
            res = Math.max(res , x) ;
        return res ;
    }
}