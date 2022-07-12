package easy;


/**
 * Compares two trees
 * Return true if two trees are the same
 * Return false if two trees are not the same
 *
 * Constraints:
 *      The number of nodes in both trees is in the range [0, 100].
 *      -104 <= Node.val <= 104
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null)
        {
            return false;
        }

        return p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
