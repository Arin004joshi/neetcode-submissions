class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0;
        int r = l + (k - 1);
        int size = nums.length - k + 1;
        int[] res = new int[size];
        int idx = 0;
        while (r < nums.length) {
            int max = Integer.MIN_VALUE;
            for (int i = l; i <= r; i++) {
                max = Math.max(max, nums[i]);
            }
            res[idx] = max;
            idx++;
            l++;
            r++;
        }
        return res;
    }
}