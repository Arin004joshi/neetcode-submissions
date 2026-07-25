class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < nums.length) {
            int c = target - nums[i];
            if (map.containsKey(c)) {
                if (i < map.get(c)) {
                    arr = new int[]{i,map.get(c)};
                } else {
                    arr = new int[]{map.get(c), i};
                }
            }
            map.put(nums[i], i);
            i++;
        }
        return arr;
    }
}