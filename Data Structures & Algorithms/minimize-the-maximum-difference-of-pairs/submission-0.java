class Solution {
    public int minimizeMax(int[] nums, int p) {
        if (p == 0)
            return 0;
        Arrays.sort(nums);
        int res = 0;
        int low = 0;
        int high = Math.abs(nums[nums.length - 1] - nums[0]);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (Math.abs(nums[i] - nums[i + 1]) <= mid) {
                    count++;
                    i++;
                }
                if(count>=p)break;
            }
            if (count >= p) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}