class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int r = 0; r < matrix.length; r++) {
            if (target >= matrix[r][0] && 
                target <= matrix[r][matrix[r].length - 1]) {
                int left = 0;
                int right = matrix[r].length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (matrix[r][mid] == target) {
                        return true;
                    } else if (matrix[r][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}
