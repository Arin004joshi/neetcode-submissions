class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n];
        for (int i = 0; i < n; i++) {
            cache[i] = -1;
        }
        return ways(n, 0);
    }
    public int ways(int n, int x) {
        if (x >= n) {
            return x == n ? 1 : 0;
        }
        if(cache[x]!=-1)return cache[x];
        cache[x] = ways(n, x + 1) + ways(n, x + 2);
        return cache[x];
    }
}