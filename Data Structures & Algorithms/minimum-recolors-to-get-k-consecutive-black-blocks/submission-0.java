class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = l + k - 1;
        while (r < blocks.length()) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = l; i <= r; i++) {
                map.put(blocks.charAt(i), map.getOrDefault(blocks.charAt(i), 0) + 1);
            }
            int res = map.get('W')==null?0:map.get('W');
            min = Math.min(min, res);
            l++;
            r++;
        }
        return min;
    }
}