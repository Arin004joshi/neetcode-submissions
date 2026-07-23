class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int[] res = new int[n];
        pre[0] = 1;
        suf[n - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            pre[i] = nums[i - 1] * pre[i - 1];
        }
        for (int j = n - 2; j >= 0; j--) {
            suf[j] = nums[j + 1] * suf[j + 1];
        }
        for (int k = 0; k < n; k++) {
            res[k] = pre[k] * suf[k];
        }
        return res;
    }
}
