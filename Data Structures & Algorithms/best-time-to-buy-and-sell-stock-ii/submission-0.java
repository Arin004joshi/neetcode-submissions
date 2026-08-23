class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = i + 1;
        int max = 0;
        int profit = 0;
        while (i < prices.length - 1) {
            if (prices[i] > prices[j]) {
                i = j;
                j = j + 1;
            } else {
                profit += prices[j] - prices[i];
                i++;
                j = i + 1;
            }
        }
        return profit;
    }
}