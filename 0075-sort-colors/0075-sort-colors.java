class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3] ;
        for(int ele : nums)
            count[ele]++ ;
        int index = 0 ;
        for(int i = 0 ; i < count.length ; ++i){
            while (count[i] -- > 0)
                nums[index++] = i ;
        }
    
    }
}