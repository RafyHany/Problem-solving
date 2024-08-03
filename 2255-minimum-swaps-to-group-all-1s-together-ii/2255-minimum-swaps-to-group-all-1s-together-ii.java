class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        for (int x : nums)
            maxSum += x;
        int i = 0 ;
        
        int slideWindowSum = 0;
        for(; i < maxSum ;++i)
            slideWindowSum += nums[i];
        int sum = slideWindowSum ;
        for( int j = i ; j < n+maxSum ;++j){
            slideWindowSum -= nums[(j - i) % n];
            slideWindowSum += nums[j % n];
            sum = Math.max(sum, slideWindowSum);
        }

        return maxSum - sum  ;
    }
}