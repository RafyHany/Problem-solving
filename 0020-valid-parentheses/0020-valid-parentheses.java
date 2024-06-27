class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>() ;
        for(int i = 0 ; i < s.length() ; ++i){
            char c = s.charAt(i) ;
            if(c =='{' || c =='[' || c == '(')
                parenthesis.add(c);
            else if(!parenthesis.isEmpty()){
                char temp =  parenthesis.pop();
                if(c == '}' && temp !='{' ||c == ']' && temp !='[' ||c == ')' && temp !='(' )
                    return false ;
            }
            else
                return false ;
        }

        return parenthesis.isEmpty() ;
    }
}