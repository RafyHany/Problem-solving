class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles ;
        int left = 0 ;
        while(numBottles >= numExchange){
            drink += (numBottles / numExchange ) ;
            left = numBottles % numExchange ;
            numBottles = (numBottles / numExchange) + left ;
            

        }
        
        return drink ;
    }
}