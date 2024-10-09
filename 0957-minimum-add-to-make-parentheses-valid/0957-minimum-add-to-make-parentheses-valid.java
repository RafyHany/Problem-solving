class Solution {
    public int minAddToMakeValid(String s) {
        Stack stack = new Stack<>() ;
        int res = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(')
                stack.push('(');
            else if (s.charAt(i) == ')' && !stack.isEmpty())
                stack.pop();
            else 
                res++;
        }
        return res + stack.size();
    }
}