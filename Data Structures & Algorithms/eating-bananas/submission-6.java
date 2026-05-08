class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int n : piles) {
            max = Math.max(max, n);
        }
        int ans = 0;
        int low = 1;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            }else{
                low = mid+1;
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