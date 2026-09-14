class Solution {
    public int maxProfit(int[] nums) {
        int max = 0;
        int i = 0;
        int j = i + 1;
        while (j < nums.length) {
            if (nums[j] < nums[i]) {
                i++;
                j = i + 1;
            } else {
                int profit = nums[j] - nums[i];
                max = Math.max(max, profit);
                j++;
            }
        }
        return max;
    }
}