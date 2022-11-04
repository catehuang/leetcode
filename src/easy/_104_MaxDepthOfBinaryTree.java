package easy;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/** Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 */
public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        // recursive
        return recursiveMethod(root);
        // DFS
        //return dfs(root);
        // BFS (Breadth-first search)
        //return bfs(root);
    }

    private int bfs(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = 0;
        while (!queue.isEmpty())
        {
            int size = queue.size();
            while (size-- > 0)
            {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            max++;
        }
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stack.push(root);
        value.push(1);
        int max = 0;

        while (! stack.isEmpty())
        {
            TreeNode node = stack.pop();
            int temp = value.pop();
            max = Math.max(temp, max);
            if (node.left != null)
            {
                stack.push(node.left);
                value.push(temp++);
            }
            if (node.right != null)
            {
                stack.push(node.right);
                value.push(temp++);
            }
        }
        return max;
    }

    private int recursiveMethod(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(recursiveMethod(root.left), recursiveMethod(root.right)) + 1;
    }
}