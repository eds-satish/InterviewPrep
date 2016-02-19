/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
 * Properties of a valid bst
 * Three Properties: 1) The left subtree of a node contains only nodes less than root node
 * 2) The right subtree of a node contains only nodes greater than root node.
 * 3) Both the left and right subtree must be binary search trees
*/
public class ValidBST {
    //thiking recursion through a helper
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode root, long min, long max){
        return root == null || (root.val > min && root.val < max && isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max));
    }
}