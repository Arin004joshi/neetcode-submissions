class Solution {
    public int characterReplacement(String s, int k) {
        int max = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char c : set) {
            int l = 0;
            int count = 0;
            for (int r = l; r < s.length(); r++) {
                if (s.charAt(r) == c) {
                    count++;
                }
                while((r - l + 1) - count > k) {
                    if (s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                }
                max = Math.max(max, r - l + 1);
            }
        }
        return max;
    }
}