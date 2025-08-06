// Last updated: 8/6/2025, 11:09:04 AM
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

 // the complexity of code is n^2 

// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if (root == null){
//             return -1;
//         }
//         int ld = diameterOfBinaryTree(root.left);
//         int rd = diameterOfBinaryTree(root.right);
//         int sd = ht(root.left)+ht(root.right) + 2;
//         return Math.max(sd,Math.max(rd,ld));
//     }
//     public int ht(TreeNode root){
//         if (root==null){
//             return -1;
//         }
//         int lh = ht(root.left);
//         int rg = ht(root.right);
//         return Math.max(lh,rg) + 1;
//     }
// }

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dt;
    }
    public DiaPair diameter(TreeNode root) {
        if (root == null){
            return new DiaPair();
        }
        DiaPair ldp = diameter(root.left);  // dt ht
        DiaPair rdp = diameter(root.right);  // dt ht
        int sd = ldp.ht + rdp.ht + 2;
        DiaPair sdp = new DiaPair();
        sdp.dt = Math.max(sd,Math.max(rdp.dt, ldp.dt));
        sdp.ht = Math.max(ldp.ht,rdp.ht) + 1;
        return sdp;
    }
    class DiaPair{
        int dt = 0;
        int ht = -1;

    }
}