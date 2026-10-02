class Solution {
    public int totalFruit(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            HashSet<Integer> set = new HashSet<>();
            while (j < nums.length) {
                set.add(nums[j]);
                if (set.size() <= 2) {
                    max = Math.max(max, j - i + 1);
                }
                j++;
            }
        }
        return max;
    }
}