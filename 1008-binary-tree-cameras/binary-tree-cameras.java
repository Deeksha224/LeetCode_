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
    int Camera = 0;
    public int minCameraCover(TreeNode root) {
        int c = minCamera(root);
        if (c == -1){
            Camera++;
        }
        return Camera;
        
    }
    public int minCamera(TreeNode root){
        if (root==null){
            return 0;
        }
        int left = minCamera(root.left);
        int right = minCamera(root.right);
        if (left == -1|| right == -1){//is node pe Cmera ki need hai
            Camera++;
            return 1; //Camera setup kra hai is node pe
        }
        if (left == 1 || right == 1){ // isme se koi ek ke pass ya dono ke pass camera hai or ek ke pass camera hai aur dusra covered hai
            return 0; // means the position is covered
        }
        else{ // dono child covered hai pr unke pass camera nhi hai
            return -1;
        }
    }
}