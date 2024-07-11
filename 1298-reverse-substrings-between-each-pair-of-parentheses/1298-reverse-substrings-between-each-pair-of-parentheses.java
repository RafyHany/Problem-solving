class Solution {
    int index = 0 ;

    public String reverseParentheses(String s) {
        return reverseParentheses2(s);
    }
    public String reverseParentheses2(String s ) {
        StringBuilder str = new StringBuilder() ;
        while(index < s.length()){
            if(s.charAt(index) == ')'){
                index++ ;
                return str.reverse().toString();
            }
            if(s.charAt(index) == '('){
                index ++ ;
                String temp = reverseParentheses2(s) ;
                str.append(temp) ;
            }else {
                str.append(s.charAt(index)) ;
                index++ ;
            }
        }
        return str.toString() ;
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public String reverseParentheses(String s) {
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
    }*/
}