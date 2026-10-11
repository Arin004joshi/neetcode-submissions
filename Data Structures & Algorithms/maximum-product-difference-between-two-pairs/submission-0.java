class Solution {
    public int maxProductDifference(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int minProd = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-1; i++) {
            int prd = 1;
            for (int j = i + 1; j < nums.length; j++) {
                prd = nums[i]*nums[j];
                maxProd = Math.max(maxProd, prd);
                minProd = Math.min(minProd, prd);
            }
        }
        return maxProd - minProd;
    }
}