class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int r = l + k - 1;
        int count = 0;
        while (r < arr.length) {
            int sum = 0;
            for (int i = l; i <= r; i++) {
                sum += arr[i];
            }
            if (sum / (r - l + 1) >= threshold) {
                count++;
            }
            l++;
            r++;
        }
        return count;
    }
}