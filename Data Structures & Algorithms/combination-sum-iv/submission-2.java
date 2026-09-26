class Solution {
    int[] cache;
    public int combinationSum4(int[] nums, int target) {
        cache = new int[target + 1];
        Arrays.fill(cache, -1);
        return fun(nums, 0, target);
    }
    public int fun(int[] nums, int sum, int target) {
        if (sum == target) {
            return 1;
        }
        if (sum > target) {
            return 0;
        }
        if (cache[sum] != -1) {
            return cache[sum];
        }
        int total = 0;
        for (int num : nums) {
            total += fun(nums, sum + num, target);
        }
        return cache[sum]=total;
    }
}