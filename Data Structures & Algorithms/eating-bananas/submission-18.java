class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        int low = 1;
        int high = max;
        int res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalTime = 0;
            for (int pile : piles) {
                totalTime += Math.ceil((double) pile / mid);
            }
            if (totalTime <= h) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}