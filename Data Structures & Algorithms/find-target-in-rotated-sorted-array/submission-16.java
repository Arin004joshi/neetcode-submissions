class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if(nums[m]==target){
                return m;
            }
            if (nums[l] <= nums[m]) {
                if (nums[l] <= target && target <= nums[m]) {
                    r = m;
                } else {
                    l = m + 1;
                }
            } else {
                if (nums[m + 1] <= target && target <= nums[nums.length - 1]) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }
        }
        return -1;
    }
}