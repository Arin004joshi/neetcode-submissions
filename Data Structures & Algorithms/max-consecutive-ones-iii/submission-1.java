class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int res = Integer.MIN_VALUE;
        for (int r = l; r < nums.length; r++) {
            if (nums[r] == 0) {
                k--;
            }
            while(k<0){
                if(nums[l] == 0){
                    k++;
                }
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}