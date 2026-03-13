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
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root==null) return 0;

        findPathSum(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right, targetSum);
        return (int)total;
        
    }
    public void findPathSum(TreeNode root, long targetSum, long currSum){
        if(root==null) return;
        currSum+=root.val;
        if(currSum==targetSum){
           total++;
        }
        findPathSum(root.left,targetSum,currSum);
        findPathSum(root.right,targetSum,currSum);
        
    }
}