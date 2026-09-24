class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int res = fun(coins, amount, 0);
        return res==Integer.MAX_VALUE?-1:res;
    }
    public int fun(int[] nums, int amount, int i) {
        if(amount == 0){
            return 0;
        }
        if (i >= nums.length) {
            return Integer.MAX_VALUE;
        }
        if (nums[i] > amount) {
            return fun(nums, amount, i + 1);
        }
        int choose = fun(nums, amount - nums[i], i);
        if (choose != Integer.MAX_VALUE) {
            choose = 1 + choose;
        }
        int notChoose = fun(nums, amount, i + 1);
        return Math.min(choose, notChoose);
    }
}