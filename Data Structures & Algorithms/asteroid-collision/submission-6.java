class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            boolean destroyed = false;
            while(!stack.isEmpty() && stack.peek() > 0 && num < 0) {
                if (Math.abs(stack.peek()) > Math.abs(num)) {
                    destroyed = true;
                    break;
                } else if (Math.abs(stack.peek()) == Math.abs(num)) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    stack.pop();
                }
            }
            if (!destroyed) {
                stack.push(num);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}