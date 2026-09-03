/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();

        // find peak index
        int l = 1, r = length - 2, peak = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (mountainArr.get(m) < mountainArr.get(m + 1)) {
                l = m + 1;
            } else if (mountainArr.get(m) < mountainArr.get(m - 1)) {
                r = m - 1;
            } else {
                peak = m;
                break;
            }
        }

        // find in asc part
        l = 0;
        r = peak - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (target < mountainArr.get(m)) {
                r = m - 1;
            } else if (target > mountainArr.get(m)) {
                l = m + 1;
            } else {
                return m;
            }
        }

        // find in asc part
        l = peak;
        r = length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (target < mountainArr.get(m)) {
                l = m + 1;
            } else if (target > mountainArr.get(m)) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}