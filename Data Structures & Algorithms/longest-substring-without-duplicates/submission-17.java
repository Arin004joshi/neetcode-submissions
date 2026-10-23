class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = Integer.MIN_VALUE;
        int l = 0;
        Set<Character> set = new HashSet<>();
        for (int r = l; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                if (set.contains(s.charAt(l))) {
                    set.remove(s.charAt(l));
                }
                l++;
            }
            set.add(s.charAt(r));
            if (r - l + 1 == set.size()) {
                res = Math.max(res, r - l + 1);
            }
        }
        return res == Integer.MIN_VALUE ? 0 : res;
    }
}