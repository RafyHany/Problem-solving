class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0 , tempXOR = 0;
        ArrayList<Integer> subset = new ArrayList<>() ;
        res = getSubsetRecursively(nums , subset , 0 ,  tempXOR );
        return res ;
    }

    public  int getSubsetRecursively (int[] set , ArrayList<Integer> subset ,int index , int tempXOR ){
        int res = 0;
        for(int i = index ; i < set.length ; ++i){
            subset.add(set[i]) ;
//            print(subset);
            tempXOR ^= set[i] ;
            res += tempXOR  + getSubsetRecursively(set  ,subset ,i+1 ,tempXOR );
            subset.removeLast() ;
            tempXOR ^= set[i] ;
        }
        return res ;
    }

}