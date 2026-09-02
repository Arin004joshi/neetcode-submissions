class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int j = i;
            while (j < nums.length) {
                sum += nums[j];
                if (sum >= target) {
                    int length = j - i + 1;
                    min = Math.min(min, length);
                    break;
                }
                j++;
            }
        }
        return min == Integer.MAX_VALUE?0:min;
    }
}