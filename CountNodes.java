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
    public int numOfNodes = 0;
    public int countNodes(TreeNode root) {
        if (root == null) return numOfNodes;
        countNodes(root.left);
        numOfNodes++;
        countNodes(root.right);
        return numOfNodes;
    }
}
