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
class BSTIterator {
    public ArrayList<Integer> l;
    int i = 0;
    public BSTIterator(TreeNode root) {
        l = new ArrayList<>();
        inorder(root,l);
    }
    
    public int next() {
        return l.get(i++);
    }
    
    public boolean hasNext() {
        if(i<l.size()) return true;
        return false;
        
    }
    public void inorder(TreeNode root, ArrayList<Integer> l){
        if(root == null) return;
        inorder(root.left, l);
        l.add(root.val);
        inorder(root.right,l);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */