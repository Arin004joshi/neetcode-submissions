class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;
        while (r < prices.length) {
            if (prices[r] > prices[l]) {
                int profit = prices[r] - prices[l];
                max = Math.max(max, profit);
            } else {
                l = r;
            }
            r+=1;
        }
        return max;
    }
}
