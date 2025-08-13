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
    int ans = 0;
    public int distributeCoins(TreeNode root) {
        coin(root);
        return ans;
        
    }
    public int coin(TreeNode root){
        if (root == null){
            return 0;
        }
        int x = coin(root.left);
        int y = coin(root.right);
        ans += Math.abs(x);
        ans += Math.abs(y);
        return root.val+x+y-1;
    }
}