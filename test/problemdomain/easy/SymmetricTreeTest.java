package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    SymmetricTree symmetricTree;

    @BeforeEach
    void setUp() {
        this.symmetricTree = new SymmetricTree();
    }

    @AfterEach
    void tearDown() {
        this.symmetricTree = null;
    }

    @Test
    void testcase1() {
        TreeNode left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        TreeNode root = new TreeNode(1, left, right);

        assertTrue(this.symmetricTree.isSymmetric(root));
    }

    @Test
    void testcase2() {
        TreeNode left = new TreeNode(2, null, new TreeNode(3));
        TreeNode right = new TreeNode(2, null, new TreeNode(3));
        TreeNode root = new TreeNode(1, left, right);

        assertFalse(this.symmetricTree.isSymmetric(root));
    }
}