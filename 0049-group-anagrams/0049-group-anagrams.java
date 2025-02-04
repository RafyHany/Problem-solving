class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashSet<String> visited = new HashSet<>();
        for(int i = 0 ; i < strs.length ; i ++){
            if(visited.contains(strs[i])) continue;
            visited.add(strs[i]);
            List<String> currentAnagrams = new ArrayList<>();
            HashMap<Character , Integer> set = new HashMap<>();
            for(char c : strs[i].toCharArray())
                set.put(c , set.getOrDefault(c , 0) + 1);
            currentAnagrams.add(strs[i]);
            for(int j = i + 1 ; j < strs.length ; ++j){
                if(strs[j].length() != strs[i].length()) continue;
                HashMap<Character , Integer> currentSet = new HashMap<>();
                for(char c : strs[j].toCharArray())
                    currentSet.put(c , currentSet.getOrDefault(c , 0) + 1);
                if(set.equals(currentSet)){
                    currentAnagrams.add(strs[j]);
                    visited.add(strs[j]);
                }
            }
            result.add(currentAnagrams);
        }
        
        return result ;
    }
}