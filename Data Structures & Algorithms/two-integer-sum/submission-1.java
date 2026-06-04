class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                if (i < map.get(compliment)) {
                    res = new int[] {i, map.get(compliment)};
                } else {
                    res = new int[] {map.get(compliment), i};
                }
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
