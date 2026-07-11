class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] res = new int[n];

        int i = 0;
        int j = 1;

        while (i < n - 1) {
            if (j >= n) {
                res[i] = 0;
                i++;
                j = i + 1;
            } else if (temp[j] > temp[i]) {
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