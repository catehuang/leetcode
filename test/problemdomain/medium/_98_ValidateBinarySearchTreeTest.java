package medium;

import common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _98_ValidateBinarySearchTreeTest {

    _98_ValidateBinarySearchTree validateBinarySearchTree;

    @BeforeEach
    public void setUp() {
        validateBinarySearchTree = new _98_ValidateBinarySearchTree();
    }

    @Test
    public void isValidBST_case_1() throws Exception {
        int[] nodes = new int[] {2, 1, 3};
        TreeNode root = null;

        for (int node : nodes) {
            root = addNode(root, node);
        }

        assertTrue(validateBinarySearchTree.isValidBST(root));
    }


    @Test
    public void isValidBST_case_2() throws Exception {
        int[] nodes = new int[]{5, 1, 4, 0, 0, 3, 6};
        TreeNode root = null;

        for (int node : nodes) {
            root = addNode(root, node);
        }

       assertFalse(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    public void isValidBST_case_3() throws Exception {
        int[] nodes = new int[]{3, 1, 5, 0, 0, 3, 1};
        TreeNode root = null;

        for (int node : nodes) {
            root = addNode(root, node);
        }

        assertFalse(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    public void isValidBST_case_4() throws Exception {
        int[] nodes = new int[]{5, 1, 6, 0, 0, 3, 7};
        TreeNode root = null;

        for (int node : nodes) {
            root = addNode(root, node);
        }

        assertTrue(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    public void isValidBST_case_5() throws Exception {
        int[] nodes = new int[]{2, 1, 3, 4, 2, 1, 4};
        TreeNode root = null;

        for (int node : nodes) {
            root = addNode(root, node);
        }

        assertFalse(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    public void isValidBST_case_6() throws Exception {
        int[] nodes = new int[]{2, 2, 2};
        TreeNode root = null;

        for (int node : nodes) {
            root = addNode(root, node);
        }

        assertFalse(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    public void isValidBST_case_7() throws Exception {
        // you can't find 3!!
        int[] nodes = new int[]{5, 4, 6, 0, 0, 3, 7};
        TreeNode root = null;

        for (int node : nodes) {
            root = addNode(root, node);
        }

        assertFalse(validateBinarySearchTree.isValidBST(root));
    }

    public TreeNode addNode (TreeNode root, int value) {
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