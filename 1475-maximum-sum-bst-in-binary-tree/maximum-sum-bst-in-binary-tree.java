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
    public int maxSumBST(TreeNode root) {
        ValidBST(root);
        return ans;
    }
    public BstPair ValidBST(TreeNode root){
        if (root == null){
            return new BstPair();
        }
        BstPair lbp = ValidBST(root.left);
        BstPair rbp = ValidBST(root.right);
        BstPair sbp =  new BstPair();
        sbp.min = Math.min(lbp.min,Math.min(rbp.min, root.val));
        sbp.max = Math.max(lbp.max,Math.max(rbp.max, root.val));
        sbp.sum = lbp.sum+rbp.sum+root.val;
        sbp.isbst=lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
        if (sbp.isbst){
           ans = Math.max(ans,sbp.sum);
        }
        return sbp;
    }
    class BstPair{
        boolean isbst = true;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        int sum = 0;
        //int ans = 0; // only max bst sum
    }
}