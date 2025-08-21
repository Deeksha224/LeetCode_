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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            Integer prev = null; 

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                // Check parity
                if (level % 2 == 0) { // even level -> odd & increasing
                    if (curr.val % 2 == 0) return false;
                    if (prev != null && curr.val <= prev) return false;
                } else { // odd level -> even & decreasing
                    if (curr.val % 2 != 0) return false;
                    if (prev != null && curr.val >= prev) return false;
                }

                prev = curr.val;

                // Add children
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
            level++;
        }
        return true;
    }
}