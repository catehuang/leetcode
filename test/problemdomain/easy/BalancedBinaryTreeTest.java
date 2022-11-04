package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    BalancedBinaryTree balancedBinaryTree;

    @BeforeEach
    void setUp() {
        this.balancedBinaryTree = new BalancedBinaryTree();
    }

    @AfterEach
    void tearDown() {
        this.balancedBinaryTree = null;
    }

    @Test
    void testcase1() {
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, right);
        assertTrue(this.balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testcase2() {
        TreeNode n3 = new TreeNode(3, new TreeNode(4), new TreeNode(4));
        TreeNode left = new TreeNode(2, n3, new TreeNode(3));
        TreeNode root = new TreeNode(3, left, new TreeNode(2));
        assertFalse(this.balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testcase3() {
        TreeNode root = null;
        assertTrue(this.balancedBinaryTree.isBalanced(root));
    }
}