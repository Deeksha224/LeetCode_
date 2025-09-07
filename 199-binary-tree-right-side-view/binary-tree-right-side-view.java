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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        rightSide(root, 1, l);
        return l;
    }
    int maxd = 0;
    public void rightSide(TreeNode root, int cur_lev, List<Integer> l){
        if (root == null){
            return;
        }
        if (maxd < cur_lev){
        // System.out.print(root.val);
        l.add(root.val);
        maxd = cur_lev;
        }
        rightSide(root.right, cur_lev + 1,l);
        rightSide(root.left,cur_lev + 1,l);
    }
}