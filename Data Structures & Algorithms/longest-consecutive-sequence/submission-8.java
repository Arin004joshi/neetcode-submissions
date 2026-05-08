class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Arrays.sort(nums);
        int currLength = 1;
        int max = 1;
        int curr = 0;
        while(curr<nums.length-1){
            if(nums[curr]==nums[curr+1]){curr++;continue;}
            if(nums[curr+1]-nums[curr]==1){currLength+=1;max = Math.max(max,currLength);curr++;}
            else {
                max = Math.max(max,currLength);
                currLength=1;
                curr++;
            }
        }
        return max;
    }
}
