class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] rows = new int[matrix.length] ;
        int[] cols = new int[matrix[0].length] ;
        Arrays.fill(rows , Integer.MAX_VALUE);
        Arrays.fill(cols , Integer.MIN_VALUE);
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                rows[i] = Math.min(rows[i] , matrix[i][j]);
                cols[j] = Math.max(cols[j] , matrix[i][j]) ;
            }
        }
        return intersect(rows , cols) ;
    }
    private List<Integer> intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 , j = 0 ;
        List<Integer> res = new ArrayList<>();
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j])
                i++ ;
            else
                j++ ;
        }
        
        return res ;
    }
}