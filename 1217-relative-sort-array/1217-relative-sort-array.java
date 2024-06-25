class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001] ;
        for(int ele : arr1)
            count[ele]++ ;
        int index = 0 ;
        for(int ele : arr2){
            while(count[ele]-- > 0)
                arr1[index++] = ele ;
        }
        for(int i = 0 ; i <count.length ; ++i ){
            while(count[i]-- > 0)
                arr1[index++] = i ;
        }
            return arr1 ;
    }
}