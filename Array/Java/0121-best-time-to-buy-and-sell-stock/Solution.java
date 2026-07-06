class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            maxprofit = Math.max(maxprofit, prices[i] - minprice);
            minprice = Math.min(minprice, prices[i]);
        }

        return maxprofit;
    }
}
