class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = 0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        int res = 0;
        while (low <= high) {
            long count = 0;
            int mid = low + (high - low) / 2;
            for (int num : nums) {
                count += (int) Math.ceil((double) num / mid) - 1;
            }
            if (count <= maxOperations) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}
