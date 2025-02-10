class Solution {
    public String clearDigits(String s) {

        Stack<Character> charactersWithoutDigits = new Stack<>() ;
        for(char c : s.toCharArray()){
            if(Character.isAlphabetic(c))
                charactersWithoutDigits.push(c);
            else
                charactersWithoutDigits.pop() ;
        }
        StringBuilder res = new StringBuilder() ;
        for(char c : charactersWithoutDigits)
            res.append(c) ;
        return res.toString(); 
    }
}