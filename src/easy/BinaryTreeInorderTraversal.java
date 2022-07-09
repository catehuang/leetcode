package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * Constraints:
 *      The number of nodes in the tree is in the range [0, 100].
 *      -100 <= Node.val <= 100
 */
public class BinaryTreeInorderTraversal
{
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        createATree(list, root);
        return list;
    }

    private void createATree(List<Integer> list, TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        createATree(list, root.left);
        list.add(root.val);
        createATree(list, root.right);
    }
}
