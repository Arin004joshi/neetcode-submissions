class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int[]res = new int[2];
        while(l<h){
            if(nums[l]==nums[l+1]){l++;}
            if(nums[l]+nums[h]>target){h--;}
            else if(nums[l]+nums[h]<target){l++;}
            else{res = new int[]{l+1,h+1};return res;}
        }
        return new int[]{-1,-1};
    }
}
