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
        // inorder traverse
        return inOrderTraverse(root);
    }

    private boolean inOrderTraverse(TreeNode root) {
        boolean isDone = false;
        boolean result;

        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val != 0 && root.left.val >= root.val) {
            return false;
        }
        if (root.right != null && root.right.val != 0 && root.right.val <= root.val) {
            return false;
        }

        result = inOrderTraverse(root.left);
        if (!result) {
            return false;
        }
        result = inOrderTraverse(root.right);
        if (!result) {
            return false;
        }
        return true;
    }
}
