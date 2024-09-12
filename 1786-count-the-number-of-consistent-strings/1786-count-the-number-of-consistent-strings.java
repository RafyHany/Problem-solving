class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq = new int[26]; // freq for char in allowed 0 -> not allowed , > 0 -> allowed
        for(int i = 0 ; i < allowed.length() ; i++)
            freq[allowed.charAt(i) - 97]++;
        int numberOfAllowed = words.length ;
        for(String word : words){
            for(char c : word.toCharArray()){
                if(freq[c - 97] == 0){
                    numberOfAllowed--;
                    break;
                }
            }
        }

        return numberOfAllowed;
    }
}