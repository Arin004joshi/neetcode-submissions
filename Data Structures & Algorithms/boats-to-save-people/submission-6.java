class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int boats = 0;
        while (l <= r) {
            int capacity = nums[l] + nums[r];
            if (capacity <= limit) {
                boats++;
                l++;
                r--;
            } else {
                boats++;
                r--;
            }
        }
        return boats;
    }
}