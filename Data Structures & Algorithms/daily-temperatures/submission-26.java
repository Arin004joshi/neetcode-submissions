class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int i = 0;
        int j = i + 1;
        int[] res = new int[n];
        res[n - 1] = 0;
        while (i < n - 1) {
            if (j >= n) {
                res[i] = 0;
                i++;
                j = i + 1;
            } else if (temp[i] < temp[j]) {
                res[i] = j - i;
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }
        return res;
    }
}