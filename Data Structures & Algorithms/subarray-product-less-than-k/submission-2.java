class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int prd = 1;
            for (int j = i; j < nums.length; j++) {
                prd *= nums[j];

                if (prd >= k) {
                    break;
                }

                count++;
            }
        }
        return count;
    }
}