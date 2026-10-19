class Solution {
    public int arrangeCoins(int n) {
        int comp_rows_count = 0;
        int rem = n;
        for (int i = 1; i <= n; i++) {
            if (rem>=i) {
                rem -= i;
                comp_rows_count++;
            }else{
                break;
            }
        }
        return comp_rows_count;
    }
}