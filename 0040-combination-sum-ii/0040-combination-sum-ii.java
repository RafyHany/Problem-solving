class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>() ;
        Arrays.sort(candidates);
        findCombination(0 , target , candidates , res , new ArrayList<>());
        return res ;
    }

    private void findCombination(int index , int target , int[] candidates , List<List<Integer>> res , List<Integer> tempRes ){
        if(target == 0 ){
            res.add(new ArrayList<>(tempRes)) ;
            return;
        }
        for(int i = index ; i < candidates.length ; ++i){
            if(i > index && candidates[i]==candidates[i-1]) 
                continue;
            if(candidates[i] > target)
                break;
            tempRes.add(candidates[i]) ;
            findCombination(i + 1 , target - candidates[i]  , candidates, res , tempRes);
            tempRes.removeLast() ;
        }
            
    }
}