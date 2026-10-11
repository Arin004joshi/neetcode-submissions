class Solution {
    public String largestGoodInteger(String s) {
        int l = 0;
        int r = l + 3 - 1;
        int max = Integer.MIN_VALUE;
        String res = "";
        while(r<s.length()){
            HashSet<Character>set = new HashSet<>();
            for(int i = l;i<=r;i++){
                set.add(s.charAt(i));
            }
            if(set.size()==1){
                int digit = Character.getNumericValue(s.charAt(l));
                if(digit>max){
                    max = digit;
                    res = s.substring(l,r+1);
                }
            }
            l++;
            r++;
        }
        return res;
    }
}