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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        dfs(root,l);
        return l.get(k-1);
        
    }
    public void dfs(TreeNode root, ArrayList<Integer> l){
        if(root==null) return;
        dfs(root.left,l);
        l.add(root.val);
        dfs(root.right,l);
    }
}

// class Solution {
//     public int kthSmallest(TreeNode root, int k) {
//         ArrayList<Integer> l = new ArrayList<>();
//         if(root==null) return 0;
//         ans(root,l);
//         Collections.sort(l);
//         if(l.size() < k){
//             return 0;
//         }
//         int res = l.get(k-1);
//         return res;
        
//     }
//     public void ans(TreeNode root, ArrayList<Integer> l){
//         if(root== null) return;
//         l.add(root.val);
//         if(root.left!=null){
//             ans(root.left,l);
//         } 
//         if(root.right!= null){
//             ans(root.right,l);
//         }
//     }
// }