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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root,val);
    }
    public TreeNode insert(TreeNode root, int val){
        if(root == null) return  new TreeNode(val);

        if(root.left == null && root.val > val){
            TreeNode temp = new TreeNode(val);
            root.left = temp;
            return root;
        }
        if(root.right == null && root.val < val){
            TreeNode temp = new TreeNode(val);
            root.right = temp;
            return root;
        }
        if(root.val > val){
            insert(root.left,val);
        }
        else{
            insert(root.right,val);
        }
        return root;
    }
}