class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int[] res = new int[2];
        while (l <= r) {
            int sum = nums[l] + nums[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                if (l < r) {
                    return new int[] {l+1, r+1};
                }else{
                    return new int[]{r+1,l+1};
                }
            }
        }
        return new int[] {0};
    }
}