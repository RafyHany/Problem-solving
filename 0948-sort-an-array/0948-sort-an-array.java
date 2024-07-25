class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums , 0 , nums.length - 1) ;
        return  nums;
    }

    public void mergeSort(int[] nums , int l , int r ){
        if(l >= r)
            return;
        int med = l + (r - l) / 2 ;
        mergeSort(nums , med + 1 , r);
        mergeSort(nums , l , med  );
        merge(nums , l , r ,med);
    }
    public void merge(int[] nums , int l , int r , int med ){
       int[] right = new int[r - med ] ;
       int[] left = new int[med - l + 1 ] ;
       for(int i = l ; i <= med ; ++i)
           left[i - l] = nums[i] ;
       for (int i = med + 1 ; i <= r ; ++i)
           right[i - med - 1] = nums[i] ;
       int i = 0 ;
       int j = 0 ;
       int k = l ;
       while (i < left.length && j < right.length){
           if(left[i] <= right[j])
               nums[k++] = left[i++];
           else 
               nums[k++] = right[j++];
       }
       while (i < left.length)
           nums[k++] = left[i++] ;
       while (j < right.length)
             nums[k++] = right[j++] ;
    }
}