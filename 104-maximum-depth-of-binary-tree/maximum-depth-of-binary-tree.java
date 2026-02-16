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
    //int ans = 0;
    public int maxDepth(TreeNode root) {
       return fun(root);
       //return ans;
    }
    public int fun(TreeNode root){
        if(root==null) return 0;
        int a = fun(root.left);
        int b = fun(root.right);
        //ans = Math.max(ans,a+b);
        return Math.max(a,b)+1;
    }
}