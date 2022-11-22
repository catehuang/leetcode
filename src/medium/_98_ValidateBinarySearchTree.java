package medium;

import common.TreeNode;

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * A valid BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class _98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return inOrderTraverse(root, null, null);
    }

    private boolean inOrderTraverse(TreeNode root, Integer min, Integer max) {
        // root is null, but intelliJ doesn't think it's a null
        // I have to check the value to make it work
        if (root == null || root.val == null) {
            return true;
        }

        if ((max != null && root.val >= max) || (min != null && root.val <= min)) {
            return false;
        }

        return inOrderTraverse(root.left, min, root.val) && inOrderTraverse(root.right, root.val, max);
    }
}
