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
    public long total = 0;
    public long ans = 0;
    public long mod = 1000000007L;
    public int maxProduct(TreeNode root) {
        total = dfs(root);
        dfs1(root);
        return (int)(ans%mod);
        
    }
    public long dfs1(TreeNode root){
        if(root == null) return 0;
        long a = dfs1(root.left);
        long b = dfs1(root.right);
        ans = Math.max(ans,a*(total-a));
        ans = Math.max(ans,b*(total-b));
        return a+b+root.val;

    }
    private long dfs(TreeNode root){
        if(root == null) return 0;
        return dfs(root.left)%mod+dfs(root.right)%mod+(root.val)%mod;
    }
}