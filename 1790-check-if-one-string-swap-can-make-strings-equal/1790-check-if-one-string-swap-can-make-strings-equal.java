class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        char[] differences = new char[4];
        int numberOfDifferentCharacters =  0;
        for(int i = 0 ; i < s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(numberOfDifferentCharacters == 2) return false;
                differences[numberOfDifferentCharacters * 2] = s1.charAt(i);
                differences[numberOfDifferentCharacters * 2 + 1] = s2.charAt(i);
                numberOfDifferentCharacters ++ ;
            }
            if(numberOfDifferentCharacters > 2) return false;
        }
        
        if(differences[0] != differences[3] || differences[1] != differences[2]) return false;
        return numberOfDifferentCharacters != 1 ;
    }
}