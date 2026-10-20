class Solution {
    public int maximumCandies(int[] nums, long k) {
        long sum = 0;
        int max = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }
        if (k > sum) {
            return 0;
        }
        int low = 1;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = 0;
            for (int num : nums) {
                total += num / mid;
            }
            if (total >= k) {
                res = Math.max(res, mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}