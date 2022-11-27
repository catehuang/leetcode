package easy;

import common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _543_DiameterOfBinaryTreeTest {

    _543_DiameterOfBinaryTree diameterOfBinaryTree;

    @BeforeEach
    public void setUp() {
        diameterOfBinaryTree = new _543_DiameterOfBinaryTree();
    }

    @Test
    public void diameterOfBinaryTree_case_1() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTree(root));
    }

    @Test
    public void diameterOfBinaryTree_case_2() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(1, diameterOfBinaryTree.diameterOfBinaryTree(root));
    }
}