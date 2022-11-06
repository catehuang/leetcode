package easy;

import common.TreeNode;
import medium.easy._104_MaxDepthOfBinaryTree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _104_MaxDepthOfBinaryTreeTest {

    _104_MaxDepthOfBinaryTree maxDepthOfBinaryTree;

    @BeforeEach
    void setUp() {
        this.maxDepthOfBinaryTree = new _104_MaxDepthOfBinaryTree();
    }

    @AfterEach
    void tearDown() {
        this.maxDepthOfBinaryTree = null;
    }

    @Test
    void testcase1() {
        TreeNode t20 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, new TreeNode(9), t20);
        assertEquals(3, this.maxDepthOfBinaryTree.maxDepth(root));
    }
}