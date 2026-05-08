class Solution {
    public boolean isPalindrome(String s) {
        String clean = cleanString(s);
        return clean.equals(reversedString(clean));
    }

    public String cleanString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }

    public String reversedString(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}