class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int l = 0; l < nums.length; l++) {
            int count = 0;
            int r = l;
            while (r < nums.length) {
                if (nums[r] == 0) {
                    if (count == k)
                        break;
                    count++;
                }
                r++;
            }
            max = Math.max(max, r - l);
        }
        return max;
    }
}