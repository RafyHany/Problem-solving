class Solution {
    public int maxProfit(int[] prices) {
        int max = 0 ;
        int sell = 0 ;
        int buy = 0 ;
        while(sell < prices.length){
            if(prices[sell] - prices[buy] < 0){
                buy = sell ;
                sell++;
            }else {
                max = Math.max(max, prices[sell] - prices[buy]);
                sell++;
            }
        }
        return max ;
    }
}