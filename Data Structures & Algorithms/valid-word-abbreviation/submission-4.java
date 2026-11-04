class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        while (i < word.length() && j < abbr.length()) {
            if (abbr.charAt(j) == '0')
                return false;
            if (Character.isLetter(abbr.charAt(j))) {
                if (word.charAt(i) == abbr.charAt(j)) {
                    i++;
                    j++;
                } else {
                    return false;
                }
            } else {
                int sublen = 0;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    sublen = sublen * 10 + abbr.charAt(j) - '0';
                    j++;
                }
                i += sublen;
            }
        }
        return i==word.length() && j==abbr.length();
    }
}