class Solution {
    public int trap(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int lm = nums[l];
        int rm = nums[r];
        int res = 0;
        while(l<r){
            if(lm<rm){
                l++;
                lm = Math.max(lm,nums[l]);
                res += lm - nums[l];
            }else{
                r--;
                rm = Math.max(rm,nums[r]);
                res += rm - nums[r];
            }
        }
        return res;
    }
}
