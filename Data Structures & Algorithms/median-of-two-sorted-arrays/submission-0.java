class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int l = n + m;
        int[] res = new int[l];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }
        while (i < n) {
            res[k++] = nums1[i++];
        }
        while (j < m) {
            res[k++] = nums2[j++];
        }
        if (l % 2 == 0) {
            return (res[l / 2] + res[l / 2 - 1]) / 2.0;
        } else {
            return res[l/2];
        }
    }
}
