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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> res = new ArrayList<>();
        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = q.size(); i > 0; i--) {
                TreeNode cur = q.poll();
                if (cur != null) {
                    list.add(cur.val);
                    q.add(cur.left);
                    q.add(cur.right);
                }
            }
            if (list.size() > 0) {
                res.add(list);
            }
        }
        return res;
    }
}