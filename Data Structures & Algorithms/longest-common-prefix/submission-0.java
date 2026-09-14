class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < Math.min(pre.length(), strs[i].length())) {
                if (strs[i].charAt(j) != pre.charAt(j)) {
                    break;
                }
                j++;
            }
            pre = strs[i].substring(0, j);
        }
        return pre;
    }
}