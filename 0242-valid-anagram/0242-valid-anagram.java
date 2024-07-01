class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray() ;
        char[] arrT = t.toCharArray() ;
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        return Arrays.equals(arrS,arrT) ;
    }
}