class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int n = height.length;
        int leftMax = height[0] , rightMax = height[n-1];
        int trap = 0;
        while(left<right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax,height[left]);
                trap += leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax,height[right]);
                trap += rightMax - height[right];
            }
        }
        return trap;
    }
}
