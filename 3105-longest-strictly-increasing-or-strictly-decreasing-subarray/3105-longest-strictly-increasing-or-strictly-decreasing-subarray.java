class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxIncreasing = 1 ; // global max in increasing order
        int maxDecreasing = 1 ; // global max in decreasing order
        int maxCurrentIncreasing = 1 ; // current max in increasing order
        int maxCurrentDecreasing = 1 ; // current max in decreasing order
        for(int i = 1 ; i < nums.length ; ++i){
            if(nums[i] > nums[i - 1 ]){
                maxCurrentIncreasing ++ ;
                maxCurrentDecreasing = 1 ;
                maxIncreasing = Math.max(maxIncreasing , maxCurrentIncreasing);
            } else if (nums[i] < nums[i - 1]){
                maxCurrentDecreasing ++ ;
                maxCurrentIncreasing = 1 ;
                maxDecreasing = Math.max(maxDecreasing , maxCurrentDecreasing);
            } else {
                maxCurrentDecreasing = 1 ;
                maxCurrentIncreasing = 1 ;
            }
        }
        return Math.max(maxDecreasing , maxIncreasing) ;
    }
}