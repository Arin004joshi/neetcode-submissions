class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max_rate = 0;
        for (int item : piles) {
            max_rate = Math.max(max_rate, item);
        }
        int left = 1;
        int high = max_rate;
        int ans = 0;
        while (left <= high) {
            int mid = left + (high - left) / 2;
            if (isPossible(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] piles, int k, int h) {
        long totalTime = 0;
        for (int pile : piles) {
            totalTime += (int) Math.ceil((double) pile / k);
        }
        if (totalTime <= h) {
            return true;
        }
        return false;
    }
}