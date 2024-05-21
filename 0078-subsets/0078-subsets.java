class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>() ;
        List<List<Integer>> res = new ArrayList<>() ;
        getSubsetRecursively(nums,subset,res,0);
        return res ;
    }

    public  void getSubsetRecursively (int[] set , List<Integer> subset ,List<List<Integer>> res, int index ){
        
        res.add(new ArrayList<>(subset)) ;
        for(int i = index ; i < set.length ; ++i){
            subset.add(set[i]) ;
            getSubsetRecursively(set,subset,res,i+1);
            subset.removeLast() ;            
        }
        return  ;
    }
}