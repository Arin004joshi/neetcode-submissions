class Solution {
    public int minimizedMaximum(int n, int[] nums) {
        int low = 1;
        int high = nums[0];
        for (int num : nums) {
            high = Math.max(high, num);
        }
        int res = 0;
        while (low <= high) {
            int count = 0;
            int mid = low + (high - low) / 2;
            for (int num : nums) {
                count += (int) Math.ceil((double) num / mid);
                if (count > n) {
                    break;
                }
            }
            if (count <= n) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}