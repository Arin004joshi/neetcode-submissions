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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode right = null;
            int length = q.size();
            for (int i = 0; i < length; i++) {
                TreeNode cur = q.poll();
                if (cur != null) {
                    right = cur;
                    q.add(right.left);
                    q.add(right.right);
                }
            }
            if (right != null) {
                res.add(right.val);
            }
        }
        return res;
    }
}
