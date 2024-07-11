class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str ;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i) ;
            if(c != ')')
                stack.push(c) ;
            else {
                ArrayList<Character> temp = new ArrayList<>() ;
                while(stack.peek() != '(')
                    temp.add(stack.pop()) ;
                stack.pop() ;
                while(!temp.isEmpty())
                    stack.push(temp.removeFirst()) ;
            }
        }
        str = new StringBuilder() ;
        while(!stack.isEmpty())
            str.append(stack.pop());
        return str.reverse().toString() ;
    }
}