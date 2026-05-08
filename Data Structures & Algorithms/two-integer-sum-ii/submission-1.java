// Using two-pointers

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[2];
        while (left < right) {
            int currSum = nums[left] + nums[right];
            if (currSum < target) {
                left++;
            } else if (currSum > target) {
                right--;
            } else {
                return new int[] { left + 1, right + 1 };
            }
        }
        return new int[0];
    }
}