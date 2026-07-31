class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Set<Integer>set = new HashSet<>();
        for(int n : nums){set.add(n);}
        int max = 1;
        for(int n : set){
            if(!set.contains(n-1)){
                int currLen = 1;
                while(set.contains(n+1)){
                    currLen++;
                    n++;
                }
                max = Math.max(max,currLen);
            }
        }
        return max;
    }
}
