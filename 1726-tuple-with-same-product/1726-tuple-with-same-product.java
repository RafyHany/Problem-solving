class Solution {
    public int tupleSameProduct(int[] nums) {
        int numberOfTuples = 0;
        HashMap<Integer,Integer> freqOfSameProduct = new HashMap<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                int productOfTwo = nums[i] * nums[j] ;
                if(freqOfSameProduct.containsKey(productOfTwo)){
                    int numberOfFreqTuples = freqOfSameProduct.get(productOfTwo) ;
                    numberOfTuples += numberOfFreqTuples * 8 ;
                    freqOfSameProduct.put(productOfTwo , numberOfFreqTuples + 1) ;
                }else 
                    freqOfSameProduct.put(productOfTwo , 1) ;
            }
        }
        return numberOfTuples ;
    }
}