class Solution {
    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < s.length() - 1; j++) {
            int sum = 0;
            String left = s.substring(0, j+1);
            Map<Character, Integer> leftMap = new HashMap<>();
            for (char c : left.toCharArray()) {
                leftMap.put(c, leftMap.getOrDefault(c, 0) + 1);
            }
            String right = s.substring(j + 1, s.length());
            Map<Character, Integer> rightMap = new HashMap<>();
            for (char ch : right.toCharArray()) {
                rightMap.put(ch, rightMap.getOrDefault(ch, 0) + 1);
            }
            sum = leftMap.getOrDefault('0',0)+rightMap.getOrDefault('1',0);
            max = Math.max(max,sum);
        }
        return max;
    }
}