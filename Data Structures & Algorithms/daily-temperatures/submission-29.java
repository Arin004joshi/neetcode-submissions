class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];
        int i = 0;
        int j = i + 1;
        res[temp.length - 1] = 0;
        while (i < temp.length - 1) {
            if (j >= temp.length) {
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