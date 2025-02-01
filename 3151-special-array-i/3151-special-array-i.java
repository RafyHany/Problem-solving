class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true ;
        
        for(int i = 0 ; i < nums.length - 1;++i){
            int sum = 0 ;
            sum += nums[i] % 2; 
            sum += nums[i + 1] % 2;
            if(sum != 1) return false;
            sum = 0 ;
        }

        return true ;
    }
    
    
}