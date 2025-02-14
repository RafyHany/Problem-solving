class Solution {
    public int removeElement(int[] nums, int val) {
        int pivot = val ;
        int j = -1 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != pivot)
                swap(nums , i , ++j);
        }
        return j + 1;
        
    }
    
    private void swap(int[] nums , int i , int j){
        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
}