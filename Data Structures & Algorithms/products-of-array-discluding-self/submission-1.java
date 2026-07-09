class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        int[] res = new int[nums.length];

        pref[0] = 1;
        suff[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }
        for (int j = n - 2; j >= 0; j--) {
            suff[j] = nums[j + 1] * suff[j + 1];
        }
        for (int k = 0; k < n; k++) {
            res[k] = pref[k] * suff[k];
        }
        return res;
    }
}
