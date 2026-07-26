class Solution {
    public int maxArea(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        int res = 0;
        while (l < h) {
            int area = Math.min(nums[l],nums[h])*(h-l);
            res = Math.max(res,area);
            if(nums[l]<nums[h]){
                l++;
            }else{
                h--;
            }
        }
        return res;
    }
}