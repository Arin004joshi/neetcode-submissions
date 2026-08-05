class Solution {
    public int maxProfit(int[] nums) {
        int res = 0;
        int i = 0;
        int j = i + 1;
        while (j < nums.length) {
            if (nums[i] > nums[j]) {
                i++;
                j = i + 1;
            } else {
                int p = nums[j] - nums[i];
                res = Math.max(res, p);
                j++;
            }
        }
        return res;
    }
}