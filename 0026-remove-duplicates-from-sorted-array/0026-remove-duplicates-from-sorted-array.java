class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> found = new HashSet<>();
        int j = -1 ;
        for(int i = 0 ; i < nums.length ; ++i){
            if(!found.contains(nums[i])){
                found.add(nums[i]) ;
                swap(nums , i , ++j);
            }
        }
        return j + 1;
    }
    private void swap(int[] nums , int i , int j){
        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
}