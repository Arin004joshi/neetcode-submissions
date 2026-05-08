// Using hashmaps

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                res = new int[] { map.get(complement), i + 1 };
            }
            map.put(numbers[i], i + 1);
        }
        return res;
    }
}