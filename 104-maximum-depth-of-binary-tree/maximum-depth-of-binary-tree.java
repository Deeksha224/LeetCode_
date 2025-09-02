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
    public int maxDepth(TreeNode root) {
        return depth(root);
    }
    public int depth(TreeNode root) {
        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        if (root != null){
            q.add(root);
        }
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null){
                    q.add(node.left);
                }
                if (node.right != null){
                    q.add(node.right);
                }
            }
            list.add(level);
            count++;
        }
        return count;
    }
}