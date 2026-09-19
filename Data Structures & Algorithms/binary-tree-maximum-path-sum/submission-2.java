/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        fun(root);
        return max;
    }
    public int fun(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, fun(root.left));
        int right = Math.max(0, fun(root.right));

        // what if the best path runs through the root itself
        int currentPath = root.val + left + right;
        max = Math.max(max, currentPath);

        // what is the best path, between the left and right node, that a root can give to it's
        // parent
        return root.val + Math.max(left, right);
    }
}