class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int min) {
        int totalSum = 0;
        for (int k = 0; k < customers.length; k++) {
            if (grumpy[k] == 0) {
                totalSum += customers[k];
            }
        }
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = l + min - 1;
        while (r < grumpy.length) {
            int sum = 0;
            for (int i = l; i <= r; i++) {
                if (grumpy[i] == 1) {
                    sum += customers[i];
                }
            }
            int cur = totalSum + sum;
            max = Math.max(max, cur);
            l++;
            r++;
        }
        return max;
    }
}