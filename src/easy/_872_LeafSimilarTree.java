package easy;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Consider all the leaves of a binary tree, from left to right order,
 * the values of those leaves form a leaf value sequence.
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 */
public class _872_LeafSimilarTree {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Deque<Integer> list1 = new ArrayDeque<>();
        Deque<Integer> list2 = new ArrayDeque<>();

        helper(list1, root1);
        helper(list2, root2);

        while (!list1.isEmpty()) {
            if (!list1.poll().equals(list2.poll())) {
                return false;
            }
        }
        return list2.isEmpty();
    }

    private void helper(Deque<Integer> list, TreeNode root) {
        // it reaches the end of the tree
        if (root == null) {
            return;
        }
        // no leaves then add the node into list
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        // traverse subtree
        helper(list, root.left);
        helper(list, root.right);
    }
}
