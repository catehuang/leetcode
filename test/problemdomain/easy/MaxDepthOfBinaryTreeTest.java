package easy;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthOfBinaryTreeTest {

    MaxDepthOfBinaryTree maxDepthOfBinaryTree;

    @BeforeEach
    void setUp() {
        this.maxDepthOfBinaryTree = new MaxDepthOfBinaryTree();
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