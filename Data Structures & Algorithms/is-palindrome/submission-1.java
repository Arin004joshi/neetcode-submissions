class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (!isAlphaNumeric(arr[left])) {
                left++;
                continue;
            }
            if (!isAlphaNumeric(arr[right])) {
                right--;
                continue;
            }
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isAlphaNumeric(char c) {
        return Character.isLetterOrDigit(c);
    }
}