package easy;

import common.TreeNode;

/**
 * Given the root of a binary tree, return the sum of all left leaves.
 * A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
 */
public class _404_SumOfLeftLeaves {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root);
    }

    private int helper(TreeNode root) {
        // termination at leaves or root == null
        if (root == null || root.left == null && root.right == null) {
            return sum;
        }
        // traverse left subtrees if there is a child on the left side and there's a grandchild on the left side
        if (root.left != null && (root.left.left != null || root.left.right != null)) {
            helper(root.left);
        } else {
            // sum the left child if grandchild doesn't exist
            // deal with null node
            if (root.left != null && root.left.val != null) {
                sum += root.left.val;
            }
        }

        // traverse right subtrees if it hasn't leaves
        if (root.right != null && (root.right.left != null || root.right.right != null)) {
            helper(root.right);
        }

        return sum;
    }
}
