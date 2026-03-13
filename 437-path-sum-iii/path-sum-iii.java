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
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root==null) return 0;

        long cur = findPathSum(root,targetSum,0);
        long a = pathSum(root.left,targetSum);
        long b = pathSum(root.right, targetSum);
        return (int)a+(int)b+(int)cur;
        
    }
    public long findPathSum(TreeNode root, long targetSum, long currSum){
        long cur = 0;
        if(root==null) return 0 ;
        currSum+=root.val;
        if(currSum==targetSum){
            cur++;
        }
        long a = findPathSum(root.left,targetSum,currSum);
        long b = findPathSum(root.right,targetSum,currSum);
        return cur+a+b;
    }
}