package medium.easy;

import common.TreeNode;

/** Given the root of a binary tree and an integer targetSum, return true if the tree has
 *  a root-to-leaf path such that adding up all the values along the path equals targetSum.
 *  Constraints:
 *      The number of nodes in the tree is in the range [0, 5000].
 *      -1000 <= Node.val <= 1000
 *      -1000 <= targetSum <= 1000
 */
public class _112_PathSum {
    boolean hasSum = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null || root.val == null)
            return false;

        pathSum(root, sum);
        return hasSum;
    }

    private void pathSum (TreeNode root, int sum)
    {
        System.out.println("sum = " + sum + " root.val = " + root.val);
        if (! hasSum)
        {
            // visited all nodes and not found
            if (root == null)
                return;
            // return if found
            if (sum == root.val && root.left == null && root.right == null)
            {
                hasSum = true;
            }
            else
            {
                // not found and  keeping going down
                if (root.left != null)
                    pathSum(root.left, sum - root.val);
                if (root.right != null)
                    pathSum(root.right, sum - root.val);
            }
        }
    }
}
