class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = l + k - 1;
        while (r < nums.length) {
            min = Math.min(min,nums[r]-nums[l]);
            l++;
            r++;
        }
        return min;
    }
}