class Solution {
    Map<String, List<String>> map = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        if(map.containsKey(s)) return map.get(s);
        List<String> res = new ArrayList<>();
        if(s.length() == 0){
            res.add("");
            map.put("", res);
            return res;
        }
        for(String word : wordDict){
            if(s.startsWith(word)){
                List<String> subWords = wordBreak(s.substring(word.length()), wordDict);
                for(String subWord : subWords)
                    res.add(word + (subWord.length() > 0 ? " ":"") + subWord);
            }
        }
        map.put(s, res);
        return res;
    }
}