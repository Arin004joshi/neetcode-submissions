class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for (int i : weights) {
            max = Math.max(max, i);
            sum += i;
        }
        int low = max;
        int high = sum;
        int res = Integer.MIN_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(weights, days, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    public boolean isPossible(int[] weight, int days, int ans) {
        int d = 1; // because practically everything starts from day 1
        int currentLoad = 0;
        for (int w : weight) {
            if (currentLoad + w > ans) {
                d++;
                currentLoad = w;
            }else{
                currentLoad += w;
            }
        }
        return d<=days;
    }
}