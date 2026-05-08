// 1. check the no. of sequences present by checking whether their left neighbour present or not
// 2. now return the longest possible consecutive sequence among all the sequences found earlier

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int maxSequenceLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int currentSequenceLength = 1;
                while (set.contains(current + 1)) {
                    current += 1;
                    currentSequenceLength++;
                }
                maxSequenceLength = Math.max(maxSequenceLength,currentSequenceLength);
            }
        }
        return maxSequenceLength;
    }
}