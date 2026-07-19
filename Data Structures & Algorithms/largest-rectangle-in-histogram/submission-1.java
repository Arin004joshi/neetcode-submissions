class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int[] nsr = nsr(heights);
            int[] nsl = nsl(heights);
            int left = nsl[i];
            int right = nsr[i];
            int area = heights[i] * (right - left - 1);
            max = Math.max(max, area);
        }
        return max;
    }
    public static int[] nsr(int[] arr) {
        int n = arr.length;
        int i = n - 1;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        while (i >= 0) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = n;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
            i--;
        }
        return res;
    }

    public static int[] nsl(int[] arr) {
        int n = arr.length;
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        while (i < n) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
            i++;
        }
        return res;
    }
}