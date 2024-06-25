class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        sorted = heights.clone();
        countSort(sorted);
        int res = 0 ;
        for(int i= 0 ; i< heights.length ; ++i)
            if(sorted[i] != heights[i])
                res++;
        return res ;
    }
    private void countSort(int[] arr){
        int[] count = new int[101];
        for(int i = 0 ; i < arr.length ; ++i)
            count[arr[i]]++;
        int index = 0 ;
        for(int i = 0 ; i < count.length ; ++i){
            while(count[i]-- > 0)
                arr[index++] = i ;
        }
    }
}