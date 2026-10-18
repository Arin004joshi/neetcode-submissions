class Solution {
    public int[] replaceElements(int[] arr) {
        int[] suff_max = new int[arr.length];
        suff_max[suff_max.length - 1] = -1;
        for (int i = suff_max.length-2; i>=0; i--) {
            suff_max[i] = Math.max(arr[i+1], suff_max[i+1]);
        }
        return suff_max;
    }
}