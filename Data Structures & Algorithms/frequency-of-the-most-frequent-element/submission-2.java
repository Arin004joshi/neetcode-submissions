class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int j = i - 1;
            int tempK = k;
            while (j >= 0 && tempK - (nums[i] - nums[j]) >= 0) {
                tempK -= nums[i] - nums[j];
                j--;
            }
            max = Math.max(max, i - j);
        }
        return max;
    }
}