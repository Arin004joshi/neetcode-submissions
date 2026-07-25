class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int res = 0;
        while (j < prices.length) {
            if (prices[i] < prices[j]) {
                int profit = prices[j] - prices[i];
                res = Math.max(res, profit);
            } else {
                i = j;
            }
            j++;
        }
        return res;
    }
}