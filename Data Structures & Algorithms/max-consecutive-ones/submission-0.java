class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]==0){
                    break;
                }
                count++;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}