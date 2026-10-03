class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            int j = i;
            while (j < s.length()) {
                if (map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                    if (map.get(s.charAt(j)) == 0) {
                        map.remove(s.charAt(j));
                    }
                    break;
                } else {
                    map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                    j++;
                }
            }
            max = Math.max(max, j - i);
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}