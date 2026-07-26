class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int[] res = new int[2];
        while (i <= j) {
            int sum = nums[i] + nums[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                return res = new int[] {i + 1, j + 1};
            }
        }
        return res;
    }
}