class Solution {
    public int minimumDeletions(String s) {
        int[] dp = new int[s.length()+1];
        int bs = 0 ;
        for(int i = 1 ; i <= s.length() ;++i ){
            if(s.charAt(i-1) == 'b'){
                dp[i] = dp[i-1] ;
                bs++;
            }else
            dp[i] = Math.min(bs , dp[i-1] + 1 ); 
        } 
        return dp[s.length()] ;
    }
}