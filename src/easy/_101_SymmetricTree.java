package easy;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself
 * (i.e., symmetric around its center).
 *
 * Constraints:
 *      The number of nodes in the tree is in the range [1, 1000].
 *      -100 <= Node.val <= 100
 */
public class _101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return symmetric(root.left, root.right);

        //return iterativeMethod(root);
    }

    private boolean symmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;
        return symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }

    private boolean iterativeMethod(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        // put left subtree and right subtree into a queue
        q.offer(root.left);
        q.offer(root.right);
        while (!q.isEmpty())
        {
            // left subtree
            TreeNode t1 = q.poll();
            // right subtree
            TreeNode t2 = q.poll();

            if (t1 == null && t2 != null)
                return false;
            if (t1 != null && t2 == null)
                return false;

            if (t1 != null && t2 != null)
            {
                if (t1.val != t2.val)
                    return false;
                q.offer(t1.left);
                q.offer(t2.right);
                q.offer(t1.right);
                q.offer(t2.left);
            }
        }
        return true;
    }
}
