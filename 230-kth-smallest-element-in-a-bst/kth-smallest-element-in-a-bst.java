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
        if(root==null) return 0;
        ans(root,l);
        Collections.sort(l);
        for(int i = 0; i < l.size(); i++){
            int temp = l.get(i);
            System.out.print(temp+ " ");
        }
        if(l.size() < k){
            return 0;
        }
        int res = l.get(k-1);
        return res;
        
    }
    public void ans(TreeNode root, ArrayList<Integer> l){
        if(root== null) return;
        l.add(root.val);
        if(root.left!=null){
            ans(root.left,l);
        } 
        if(root.right!= null){
            ans(root.right,l);
        }
    }
}