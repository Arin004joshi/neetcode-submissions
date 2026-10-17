class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int currMax = 1;
        int currMin = 1;
        for (int num : nums) {
            int tempMax = currMax;
            int tempMin = currMin;
            currMax = Math.max(num, Math.max(tempMax * num, tempMin * num));
            currMin = Math.min(num, Math.min(tempMax * num, tempMin * num));
            res = Math.max(res, Math.max(currMax, currMin));
        }
        return res;
    }
}