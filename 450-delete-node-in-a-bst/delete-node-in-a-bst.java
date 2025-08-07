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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return null;
        }
        if (root.val < key){
            root.right = deleteNode(root.right,key);
        }
        else if (root.val > key){
            root.left = deleteNode(root.left,key);
        }
        else{
            // if node has only one child (also work for 0 child)
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            // if node has 2 child
            // (replace the key with max of right and remove it or with left min and remove it.)
            else{
                int max = max(root.left);
                root.left = deleteNode(root.left,max);
                root.val = max;
            }
        }
        return root;
    }
    public int max (TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,max(root.right));
    }
}