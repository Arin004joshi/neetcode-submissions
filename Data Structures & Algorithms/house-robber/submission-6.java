class Solution {
    int[]cache;
    public int rob(int[] nums) {
        cache = new int[nums.length];
        Arrays.fill(cache,-1);
        return fun(nums, 0);
    }
    public int fun(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        if(cache[i]!=-1){
            return cache[i];
        }
        int rob = nums[i] + fun(nums, i + 2);
        int noRob = fun(nums, i + 1);
        cache[i] = Math.max(rob, noRob);
        return cache[i];
    }
}