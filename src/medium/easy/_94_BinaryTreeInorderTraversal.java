package medium.easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * Constraints:
 *      The number of nodes in the tree is in the range [0, 100].
 *      -100 <= Node.val <= 100
 */
public class _94_BinaryTreeInorderTraversal
{
    /**
     * Visit all nodes on a given binary tree by inorder traversal
     * @param root given the root of a binary tree
     * @return the list that for in-order traversal of its nodes' values
     */
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        traverse(list, root);
        return list;
    }

    private void traverse(List<Integer> list, TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        traverse(list, root.left);
        if (root.val != null) {
            list.add(root.val);
        }
        traverse(list, root.right);
    }
}
