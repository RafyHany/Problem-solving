class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxAscendingSum = nums[0];
        int currentSum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > nums[i - 1]){
                currentSum += nums[i];
                maxAscendingSum = Math.max(maxAscendingSum , currentSum);
            }else 
                currentSum = nums[i] ;
        }
        return maxAscendingSum;
    }
}