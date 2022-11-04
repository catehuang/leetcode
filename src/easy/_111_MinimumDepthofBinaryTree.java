package easy;

/** Given a binary tree, find its minimum depth. The minimum depth is the number of nodes along the shortest path
 *  from the root node down to the nearest leaf node. Note: A leaf is a node with no children.
 *
 *  Constraints:
 *      The number of nodes in the tree is in the range [0, 105].
 *      -1000 <= Node.val <= 1000
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        return getMinDepth(root);
    }

    private int getMinDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
             return getMinDepth(root.right) + 1;
        if (root.right == null)
            return getMinDepth(root.left) + 1;
        return Math.min(getMinDepth(root.left), getMinDepth(root.right)) + 1;
    }
}
