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
    Map<TreeNode, Integer> map;
    public int rob(TreeNode root) {
        map = new HashMap<>();
        return fun(root);
    }
    public int fun(TreeNode root) {
        if(root==null){
            return 0;
        }
        if (map.containsKey(root)) {
            return map.get(root);
        }
        int res = root.val;
        if (root.left != null) {
            res += fun(root.left.left) + fun(root.left.right);
        }
        if (root.right != null) {
            res += fun(root.right.left) + fun(root.right.right);
        }
        res = Math.max(res, fun(root.left) + fun(root.right));
        map.put(root, res);
        return map.get(root);
    }
}