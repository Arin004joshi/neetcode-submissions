class Solution {
    public int[] dailyTemperatures(int[] num) {
        return ngr(num);
    }
    public static int[] ngr(int[] arr) {
        int n = arr.length;
        int i = n - 1;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        while (i >= 0) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = stack.peek() - i;
            }
            stack.push(i);
            i--;
        }
        return res;
    }
}