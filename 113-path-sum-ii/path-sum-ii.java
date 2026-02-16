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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root,arr,targetSum);
        return ans;
    }
    public void helper(TreeNode root, ArrayList<Integer> arr, int targetSum){
        if (root == null){
            return;
        }
        arr.add(root.val);
        if (root.left == null && root.right == null && root.val == targetSum){
            List<Integer> a = new ArrayList<>(arr); //Making a copy of arr so result can be safe during backtrack
            ans.add(a);
        }
        else{
            //backtrack
            helper(root.left,arr,targetSum-root.val);
            helper(root.right,arr,targetSum-root.val);
        }
        arr.remove(arr.size()-1);
    }
}