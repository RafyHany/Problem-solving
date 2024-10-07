class Solution {
    public int minLength(String s) {
        Stack<Character> occurrence  = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'B' && !occurrence.isEmpty() && occurrence.peek() == 'A')
                occurrence.pop();
            else if(s.charAt(i) == 'D' && !occurrence.isEmpty() && occurrence.peek() == 'C')
                occurrence.pop();
            else 
                occurrence.push(s.charAt(i));
        }

        return occurrence.size();
    }
}