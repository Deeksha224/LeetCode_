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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while (!q.isEmpty()){
            int size = q.size();
            List<TreeNode> currlev = new ArrayList<>();

            for (int i = 0; i < size; i++){
                TreeNode node = q.poll();
                currlev.add(node);

                if (node.left != null) {
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if (level % 2 == 1) {
                int l = 0, r = currlev.size() - 1;
                while (l < r) {
                    int temp = currlev.get(l).val;
                    currlev.get(l).val = currlev.get(r).val;
                    currlev.get(r).val = temp;
                    l++;
                    r--;
                }
            }
            level++;
        }
    return root; 
    }
}