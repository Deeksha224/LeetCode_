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
//             return 0;
//         }
//         int ld = diameterOfBinaryTree(root.left);
//         int rd = diameterOfBinaryTree(root.right);
//         int sd = (ht(root.left) + ht(root.right) + 2);
//         return Math.max(sd, Math.max(rd,sd));
//     }
//     public int ht(TreeNode root){
//         if (root == null){
//             return -1;
//         }
//         int lh = ht(root.left);
//         int rh = ht(root.right);
//         return Math.max(lh,rh)+1;
//     }
// }

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dt;
    }
    public Diapair diameter(TreeNode root){
        if (root == null){
            return new Diapair();
        }
        Diapair ldp = diameter(root.left); //left diapair
        Diapair rdp = diameter(root.right); // right diapair
        int sp = (ldp.ht + rdp.ht + 2); // self pair
        Diapair sdp = new Diapair(); // self diapair
        sdp.dt = Math.max(sp,Math.max(ldp.dt,rdp.dt));
        sdp.ht = Math.max(ldp.ht,rdp.ht)+1;
        return sdp;
    }
    class Diapair{
        int dt = 0; //diameter
        int ht = -1; //height
    }
}

