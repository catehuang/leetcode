package easy;


import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of an n-ary tree, return the postorder traversal of its nodes' values.
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 */


public class _590_NartTreePostorderTraversal {

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();

        postorderHelper(result, root);
        return result;
    }

    private void postorderHelper(List<Integer> result, Node root) {
        if (root == null) {
            return;
        }
        if (root.children != null) {
            for (Node n : root.children) {
                postorderHelper(result, n);
            }
        }
        result.add(root.val);
    }
}
