class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long[] res = new long[nums1.length * nums2.length];
        int idx = 0;
        for (int i = 0; i < nums1.length; i++) {
            long prd = (long)nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                res[idx++] = prd*nums2[j];
            }
        }
        Arrays.sort(res);
        return res[(int)k-1];
    }
}