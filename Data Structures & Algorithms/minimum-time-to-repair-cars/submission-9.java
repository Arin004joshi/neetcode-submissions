class Solution {
    public long repairCars(int[] nums, int cars) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        long low = 1;
        long high = (long) max * cars * cars;
        long res = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long total = 0;
            for (int num : nums) {
                total += (long) Math.sqrt((double) mid / num);
                if(total>=cars){
                    break;
                }
            }
            if (total >= cars) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}
