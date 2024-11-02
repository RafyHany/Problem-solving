class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].charAt(words[i].length() -1 ) != words[(i+1)%words.length].charAt(0))
                return false ;
        }
        return true ;
    }
}