class Solution {
    public int specialArray(int[] nums) {
        int maxElement = nums[0] ;
        // to get max element in array
        for(int ele : nums)
            maxElement = Math.max(maxElement,ele);
        int[] freq = new int[maxElement+1];
        //freq of occurrence of each element
        for(int ele : nums)
            freq[ele] ++ ;
        int special = -1 ;
        //prefix sum to get for ith element number of element greater than or equal ith element
        for(int i = freq.length - 2 ; i >= 0 ; --i)
            freq[i] += freq[i+1] ;
        // get the special number
        for(int i = 0 ; i < freq.length ; ++i){
            if(freq[i] == i)
                special = i ;
        }

        return special ;
    }
}