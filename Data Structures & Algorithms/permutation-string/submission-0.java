class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sorteds1 = new String(arr1);
        int n = s1.length();
        int l = 0;
        int r = l + (n - 1);
        while (r < s2.length()) {
            char[] arr = s2.substring(l, r + 1).toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if (sorteds1.equals(str)) {
                return true;
            }
            l++;
            r++;
        }
        return false;
    }
}