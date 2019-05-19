/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean isSame = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null & q != null || q == null && p != null) return false;
        if (p.val != q.val) return false;
        isSame = isSameTree(p.left, q.left);
        if (isSame == false) return false;
        isSame = isSameTree(p.right, q.right);
        return isSame;
        /*
        while (p != null  && q != null) {
            if (p.val != q.val) {
                return false;
            }
            if (p.left == null && q.left == null) {
                p = p.right;
                q = q.right;
            } else {
                p = p.left;
                q = q.left;
            }
            
            isSameTree(p.left, q.left);
            if (p.val == q.val) {
                isSameTree(p.right, q.right);
            } else {
                return false;
            }
            
        }
        if (p == null && q == null) {
            return true;
        } else {
            return false;
        }
    */
    }
}
