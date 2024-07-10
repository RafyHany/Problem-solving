class Solution {
    public int minOperations(String[] logs) {
        int min = 0 ;
        for(String s : logs){
            if(s.equals("../") ){
                if(min > 0)
                    min--;
            }
            else if(s.equals("./"))
                continue;
            else
                min++;
        }
        return min ;
    }
}