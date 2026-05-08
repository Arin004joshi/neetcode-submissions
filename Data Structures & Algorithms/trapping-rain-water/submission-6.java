class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int trap = 0;
        for(int i =0;i<height.length;i++){
            int leftMax = 0;
            int rightMax = 0;
            for(int j=0;j<i;j++){
                leftMax = Math.max(leftMax,height[j]);
            }
            for(int k=i+1;k<height.length;k++){
                rightMax = Math.max(rightMax,height[k]);
            }
            int rainWater = Math.min(leftMax,rightMax)-height[i];
            if (rainWater > 0){trap += rainWater;}
        }
        return trap;
    }
}