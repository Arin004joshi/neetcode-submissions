class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int l = 0; l < nums.length; l++) {
            int sum = 0;
            for (int r = l; r < nums.length; r++) {
                sum += nums[r];
                if (sum >= target) {
                    res = Math.min(res, r - l + 1);
                }
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}