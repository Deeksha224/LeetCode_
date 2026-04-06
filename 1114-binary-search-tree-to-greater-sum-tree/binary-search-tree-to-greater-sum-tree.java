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
    public ArrayList<Integer> l;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null) return null;
        l = new ArrayList<>();
        inorder(root, l); // Step 1: store values
        Collections.sort(l); // Step 2: sort
        int n = l.size();
        // Step 3: suffix sum
        ArrayList<Integer> suffix = new ArrayList<>(Collections.nCopies(n, 0));
        suffix.set(n - 1, l.get(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            suffix.set(i, l.get(i) + suffix.get(i + 1));
        }
        // Step 4: map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(l.get(i), suffix.get(i));
        }
        // Step 5: update tree
        update(root, map);
        return root;
    }

    // inorder traversal
    public void inorder(TreeNode root, ArrayList<Integer> l) {
        if (root == null) return;
        inorder(root.left, l);
        l.add(root.val);
        inorder(root.right, l);
    }

    // update tree values
    public void update(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) return;
        root.val = map.get(root.val);
        update(root.left, map);
        update(root.right, map);
    }
}