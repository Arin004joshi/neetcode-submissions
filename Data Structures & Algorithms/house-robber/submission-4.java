class Solution {
    int[]cache;
    public int rob(int[] nums) {
        cache = new int[nums.length];
        Arrays.fill(cache,-1);
        return maxProfit(nums, 0);
    }
    public int maxProfit(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }
        if(cache[i]!=-1){
            return cache[i];
        }
        int rob = arr[i] + maxProfit(arr, i + 2);
        int notRob = maxProfit(arr, i + 1);
        cache[i]=Math.max(rob, notRob);
        return cache[i];
    }
}