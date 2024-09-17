class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] wordsOfS1 = s1.split(" ");
        String[] wordsOfS2 = s2.split(" ");
        HashSet< String > sentence1Dub = new HashSet<>() ;
        HashSet< String > sentence1Uniq = new HashSet<>() ;
        HashSet< String > sentence2Dub = new HashSet<>() ;
        HashSet< String > sentence2Uniq = new HashSet<>() ;
        prepareMaps(wordsOfS1 , sentence1Dub , sentence1Uniq);
        prepareMaps(wordsOfS2 , sentence2Dub , sentence2Uniq);
        List<String> result = new ArrayList<>();
        getUnCommon(result , sentence1Uniq , sentence2Uniq , sentence2Dub);
        getUnCommon(result , sentence2Uniq , sentence1Uniq , sentence1Dub);
        
         ;

        return result.toArray(new String[0]);
    }

    private void prepareMaps(String[] words ,HashSet< String > sentenceDub , HashSet< String > sentenceUniq  ){
        for(String word : words){
            if(sentenceUniq.contains(word)){
                sentenceDub.add(word);
                sentenceUniq.remove(word);
            } else if (!sentenceDub.contains(word)) {
                sentenceUniq.add(word);
            }
        }
    }
    private void getUnCommon(List<String> res  , HashSet< String >uniq  , HashSet< String > uniqOfOthers , HashSet< String >dubOfOthers  ){
        for(String word : uniq){
            if(!uniqOfOthers.contains(word) && !dubOfOthers.contains(word))
                res.add(word);
        }
    }
}