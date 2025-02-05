class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0, minPrice = prices[0];

        for(int i=0; i<prices.length; i++){

            minPrice = Math.min(prices[i],minPrice);
            int currProfit = prices[i] - minPrice;

            profit = Math.max(profit,currProfit);
        }

        return profit;
    }
}