class Solution {
    public int scoreOfString(String s) {
        int res = 0;
        for(int i = 0;i<s.length()-1;i++){
            int sum = Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
            res += sum;
        }
        return res;
    }
}