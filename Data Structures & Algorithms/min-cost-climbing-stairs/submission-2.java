class Solution {
    int[]cache;
    public int minCostClimbingStairs(int[] cost) {
        cache = new int[cost.length];
        Arrays.fill(cache, -1);
        return Math.min(minCost(cost, 0, cost.length), minCost(cost, 1, cost.length));
    }
    public int minCost(int[] cost, int x, int n) {
        if (x >= n) {
            return 0;
        }
        if (cache[x] != -1) {
            return cache[x];
        }
        int oneStep = cost[x] + minCost(cost, x + 1, n);
        int twoStep = cost[x] + minCost(cost, x + 2, n);
        cache[x] = Math.min(oneStep, twoStep);
        return cache[x];
    }
}