class Solution {
    public int findMin(int[] nums) {
        int maxElementIndex = findMaxElement(nums , 0 , nums.length - 1);
        int min = nums[(maxElementIndex + 1)%nums.length];
                
        
        return min;
    }
    private int findMaxElement(int[] nums , int left , int right){
        if(left == right)
            return left;
        int mid = (left + right) / 2 ;
        if(nums[mid] > nums[mid + 1])
            return mid;
        int leftMax = findMaxElement(nums , left , mid);
        int rightMax = findMaxElement(nums , mid + 1 , right);
        if(nums[leftMax] > nums[rightMax])
            return leftMax;
        return rightMax;
    }
}