package common;

import com.sun.source.tree.Tree;

public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode()
    {
    }

    public TreeNode(Integer val) {
        this.val = val;
    }

    public TreeNode(Integer val, TreeNode left, TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode addNode (TreeNode root, Integer value) {
        //is the root exists?
        if (root == null) {
            // create a new node
            root = new TreeNode(value);
            System.out.println("Add a node " + value + " to the root.");
        } else {
            // is the left leaf empty?
            if (root.left == null) {
                root.left = new TreeNode(value);
                System.out.println("Add a node " + value + " to the left of node " + root.val);
                // is the right leaf empty?
            } else if (root.right == null) {
                root.right = new TreeNode(value);
                System.out.println("Add a node " + value + " to the right of node " + root.val);
                // there's no room of this root
                // is there sibling of this root
            } else {
                if (root.left.left == null || root.left.right == null) {
                    addNode(root.left, value);
                } else {
                    addNode(root.right, value);
                }
            }
        }
        return root;
    }
}
