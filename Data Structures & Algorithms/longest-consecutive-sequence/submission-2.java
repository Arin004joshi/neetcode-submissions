class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int res = 0;
        for (int i : nums){
            set.add(i);
        }
        for (int i : set){
            if(!set.contains(i-1)){
                int currLen = 1;
                while(set.contains(i+1)){
                    currLen++;
                    i++;
                }
            res = Math.max(res,currLen);
            }
        }
        return res;
    }
}
