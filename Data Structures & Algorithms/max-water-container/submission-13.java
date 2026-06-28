class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int h = heights.length - 1;
        int max = 0;
        while (l <= h) {
            max = Math.max(max, (h - l) * Math.min(heights[l], heights[h]));
            if (heights[l] < heights[h]) {
                l++;
            } else {
                h--;
            }
        }
        return max;
    }
}
