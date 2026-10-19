class Solution {
    public int arrangeCoins(int n) {
        int comp_rows_count = 0;
        int total_rem = n;
        for (int required = 1; required <= n; required++) {
            if (total_rem>=required) {
                total_rem -= required;
                comp_rows_count++;
            }else{
                break;
            }
        }
        return comp_rows_count;
    }
}