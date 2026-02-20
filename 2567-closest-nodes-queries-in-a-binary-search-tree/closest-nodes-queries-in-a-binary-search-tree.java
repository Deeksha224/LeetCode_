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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        //i have sorted arraylist
        List<List<Integer>> l1 = new ArrayList<>();
        for(int i = 0; i < queries.size(); i++){
            ArrayList<Integer> l = new ArrayList<>();
            int min = min(ans,queries.get(i));
            int max = max(ans,queries.get(i));
            l.add(min);
            l.add(max);
            l1.add(l);
        }
        return l1;
    }
    public void inorder(TreeNode root, List<Integer> l){
        if(root==null) return;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public int min(ArrayList<Integer> l, int q){
        int s = 0;
        int e = l.size()-1;
        int res=-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(l.get(mid)<=q){
                res = l.get(mid);
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return res;
    }
    public int max(ArrayList<Integer> l, int q){
        int s = 0;
        int e = l.size()-1;
        int res=-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(l.get(mid)>=q){
                res = l.get(mid);
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return res;
    }
}