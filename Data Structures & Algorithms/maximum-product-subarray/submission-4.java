class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int curMax = 1;
        int curMin = 1;
        for (int num : nums) {
            int tempMax = curMax;
            int tempMin = curMin;
            curMax = Math.max(num, Math.max(tempMax * num, tempMin * num));
            curMin = Math.min(num, Math.min(tempMin * num, tempMax * num));
            res = Math.max(res, Math.max(curMax, curMin));
        }
        return res;
    }
}