class Solution {
    
public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],-1);
        }
        return longestCommonSubsequence(dp,text1,text2,text1.length()-1,text2.length()-1) ;
    }
    public int longestCommonSubsequence(int[][] dp,String text1, String text2 , int i , int j) {
        if(i < 0 || j < 0)
            return 0 ;
        if(dp[i][j] != -1)
            return dp[i][j];
        if(text1.charAt(i) == text2.charAt(j))
            dp[i][j] =   1 + longestCommonSubsequence(dp,text1,text2,i-1,j-1);
        else
            dp[i][j] = Math.max(longestCommonSubsequence(dp,text1,text2,i-1,j),longestCommonSubsequence(dp,text1,text2,i,j-1));
        return dp[i][j] ;
    }

}