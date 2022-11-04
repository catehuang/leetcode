package easy;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthofBinaryTreeTest {

    MinimumDepthofBinaryTree minimumDepthofBinaryTree;

    @BeforeEach
    void setUp() {
        this.minimumDepthofBinaryTree = new MinimumDepthofBinaryTree();
    }

    @AfterEach
    void tearDown() {
        this.minimumDepthofBinaryTree = null;
    }

    @Test
    void testcase1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(2, this.minimumDepthofBinaryTree.minDepth(root));
    }

    @Test
    void testcase2() {
        TreeNode n5 = new TreeNode(5, null, new TreeNode(6));
        TreeNode n4 = new TreeNode(4, null, n5);
        TreeNode n3 = new TreeNode(4, null, n4);
        TreeNode root = new TreeNode(4, null, n3);
        assertEquals(5, this.minimumDepthofBinaryTree.minDepth(root));
    }
}