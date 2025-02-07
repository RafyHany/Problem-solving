class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer , Integer> ballWithColor = new HashMap<>();
        HashMap<Integer , Integer> colorUsedWithFreq = new HashMap<>();
        int[] res = new int[queries.length] ;
        for(int i = 0 ; i < queries.length ; ++i){
            int ball = queries[i][0] ;
            int color = queries[i][1] ;
            if(ballWithColor.containsKey(ball)){
                int usedColor = ballWithColor.get(ball);
                int freqOfColor = colorUsedWithFreq.get(usedColor) ;                
                if(freqOfColor <= 1)  
                    colorUsedWithFreq.remove(usedColor);
                else 
                    colorUsedWithFreq.put(usedColor , freqOfColor - 1);
            }
            ballWithColor.put(ball , color);
            colorUsedWithFreq.put(color , colorUsedWithFreq.getOrDefault(color , 0) + 1);
            res[i] = colorUsedWithFreq.size();
        }
        return res ;
    }
}