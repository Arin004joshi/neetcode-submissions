class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        long count = 0;
        int l = 0;
        int freq = 0;
        for (int r = l; r < nums.length; r++) {
            if (nums[r] == max) {
                freq++;
            }
            while (freq >= k) {
                count += nums.length - r;
                if (nums[l] == max) {
                    freq--;
                }
                l++;
            }
        }
        return count;
    }
}