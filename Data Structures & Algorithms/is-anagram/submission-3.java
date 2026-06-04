class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m) {
            return false;
        }
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        String firstAsString = new String(first);
        String secondAsString = new String(second);
        if (firstAsString.equals(secondAsString)) {
            return true;
        }
        return false;
    }
}
