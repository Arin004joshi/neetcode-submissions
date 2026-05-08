class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]res = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prd = 1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    prd*=nums[j];
                }                
            }
            res[i]=prd;
        }
        return res;
    }
}