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
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if (root == null){
//             return true;
//         }
//         int left_h = height(root.left);
//         int right_h = height(root.right);
//         if (Math.abs(left_h - right_h) > 1){
//             return false;
//         }
//         return isBalanced(root.left) && isBalanced(root.right);

//     }
//     public int height (TreeNode root){
//         if (root == null){
//             return -1;
//         }
//         int left = height(root.left);
//         int right = height(root.right);
//         return Math.max(left,right)+1;
//     }
// }

class Solution {
    public boolean isBalanced(TreeNode root) {
        return balance(root).bal;
    }
    public Pair balance(TreeNode root){
        if (root == null){
            return new Pair();
        }
        Pair lb = balance(root.left);
        Pair rb = balance(root.right);
        Pair sp = new Pair();
        sp.ht = Math.max(lb.ht, rb.ht)+1;
        boolean sb = Math.abs(lb.ht-rb.ht)<=1;
        sp.bal = lb.bal && rb.bal && sb;
        return sp;
    }
    class Pair{
        boolean bal = true;
        int ht = -1;
    }
}