class Solution {
    public boolean check(int[] nums) {
        int rotatedIndex = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++ ){
            if(nums[i] > nums[i + 1]){
                rotatedIndex = i + 1 ;
                break;
            }
        }
        for(int i = rotatedIndex ; i < nums.length + rotatedIndex - 1 ; i++)
            if(nums[i % nums.length] > nums[(i + 1) % nums.length]) return false;
        
        return true ;
    }
}