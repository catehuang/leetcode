package easy;

/** Given a binary tree, determine if it is height-balanced.
 *  For this problem, a height-balanced binary tree is defined as:
 *  a binary tree in which the left and right subtrees of every node differ
 *  in height by no more than 1.
 *
 *  Constraints:
 *      The number of nodes in the tree is in the range [0, 5000].
 *      -104 <= Node.val <= 104
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        
        if (getHeight(root) == -1)
            return false;
        return true;
    }

    private int getHeight(TreeNode root) {
        // Reach the lowest node which is no any child
        if (root == null)
            return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        // the results from abs(left-right) > 1
        if (left == -1 || right == -1)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;
        // The lowest node return 0 + 1
        return Math.max(left, right) + 1;
    }
}
