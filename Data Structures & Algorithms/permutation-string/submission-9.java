class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        String sortedS1 = new String(arr);
        int i = 0;
        int j = i + sortedS1.length() - 1;
        while (j < s2.length()) {
            char[] arr2 = s2.substring(i, j + 1).toCharArray();
            Arrays.sort(arr2);
            String str = new String(arr2);
            if (sortedS1.equals(str)) {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}